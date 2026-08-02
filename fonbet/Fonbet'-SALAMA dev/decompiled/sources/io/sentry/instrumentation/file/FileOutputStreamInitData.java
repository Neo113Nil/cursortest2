package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
final class FileOutputStreamInitData {
    final boolean append;
    final FileOutputStream delegate;
    final File file;
    final SentryOptions options;
    final ISpan span;

    public FileOutputStreamInitData(File file, boolean z4, ISpan iSpan, FileOutputStream fileOutputStream, SentryOptions sentryOptions) {
        this.file = file;
        this.append = z4;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.options = sentryOptions;
    }
}
