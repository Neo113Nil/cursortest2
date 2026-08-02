package io.sentry.instrumentation.file;

import W5.AbstractC0486a1;
import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.SpanDataConvention;
import io.sentry.SpanStatus;
import io.sentry.util.Platform;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import w1.L;

/* loaded from: classes2.dex */
final class FileIOSpanManager {
    private long byteCount;
    private final ISpan currentSpan;
    private final File file;
    private final SentryOptions options;
    private SpanStatus spanStatus = SpanStatus.OK;
    private final SentryStackTraceFactory stackTraceFactory;

    @FunctionalInterface
    public interface FileIOCallable<T> {
        T call();
    }

    public FileIOSpanManager(ISpan iSpan, File file, SentryOptions sentryOptions) {
        this.currentSpan = iSpan;
        this.file = file;
        this.options = sentryOptions;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
        SentryIntegrationPackageStorage.getInstance().addIntegration("FileIO");
    }

    private void finishSpan() {
        if (this.currentSpan != null) {
            String byteCountToString = StringUtils.byteCountToString(this.byteCount);
            File file = this.file;
            if (file != null) {
                this.currentSpan.setDescription(getDescription(file));
                if (this.options.isSendDefaultPii()) {
                    this.currentSpan.setData("file.path", this.file.getAbsolutePath());
                }
            } else {
                this.currentSpan.setDescription(byteCountToString);
            }
            this.currentSpan.setData("file.size", Long.valueOf(this.byteCount));
            boolean isMainThread = this.options.getThreadChecker().isMainThread();
            this.currentSpan.setData(SpanDataConvention.BLOCKED_MAIN_THREAD_KEY, Boolean.valueOf(isMainThread));
            if (isMainThread) {
                this.currentSpan.setData(SpanDataConvention.CALL_STACK_KEY, this.stackTraceFactory.getInAppCallStack());
            }
            this.currentSpan.finish(this.spanStatus);
        }
    }

    private String getDescription(File file) {
        String byteCountToString = StringUtils.byteCountToString(this.byteCount);
        if (!this.options.isSendDefaultPii()) {
            int lastIndexOf = file.getName().lastIndexOf(46);
            return (lastIndexOf <= 0 || lastIndexOf >= file.getName().length() + (-1)) ? AbstractC0486a1.h("*** (", byteCountToString, ")") : L.j("***", file.getName().substring(lastIndexOf), " (", byteCountToString, ")");
        }
        return file.getName() + " (" + byteCountToString + ")";
    }

    public static ISpan startSpan(IScopes iScopes, String str) {
        ISpan transaction = Platform.isAndroid() ? iScopes.getTransaction() : iScopes.getSpan();
        if (transaction != null) {
            return transaction.startChild(str);
        }
        return null;
    }

    public void finish(Closeable closeable) {
        try {
            try {
                closeable.close();
            } catch (IOException e7) {
                this.spanStatus = SpanStatus.INTERNAL_ERROR;
                if (this.currentSpan != null) {
                    this.currentSpan.setThrowable(e7);
                }
                throw e7;
            }
        } finally {
            finishSpan();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T performIO(FileIOCallable<T> fileIOCallable) {
        try {
            T call = fileIOCallable.call();
            if (call instanceof Integer) {
                int intValue = ((Integer) call).intValue();
                if (intValue != -1) {
                    this.byteCount += intValue;
                }
            } else if (call instanceof Long) {
                long longValue = ((Long) call).longValue();
                if (longValue != -1) {
                    this.byteCount += longValue;
                }
            }
            return call;
        } catch (IOException e7) {
            this.spanStatus = SpanStatus.INTERNAL_ERROR;
            ISpan iSpan = this.currentSpan;
            if (iSpan != null) {
                iSpan.setThrowable(e7);
            }
            throw e7;
        }
    }
}
