package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.ScopesAdapter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryFileOutputStream extends FileOutputStream {
    private final FileOutputStream delegate;
    private final FileIOSpanManager spanManager;

    private static FileDescriptor getFileDescriptor(FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(File file, boolean z4, FileOutputStream fileOutputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z4);
        }
        return new FileOutputStreamInitData(file, z4, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$0(int i7) throws IOException {
        this.delegate.write(i7);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$1(byte[] bArr) throws IOException {
        this.delegate.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$2(byte[] bArr, int i7, int i8) throws IOException {
        this.delegate.write(bArr, i7, i8);
        return Integer.valueOf(i8);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i7) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f14490a.lambda$write$0(i7);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.spanManager.performIO(new c(this, bArr, 2));
    }

    public SentryFileOutputStream(String str) {
        this(str != null ? new File(str) : null, false, (IScopes) ScopesAdapter.getInstance());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) throws IOException {
        this.spanManager.performIO(new b(this, bArr, i7, i8, 1));
    }

    public SentryFileOutputStream(String str, boolean z4) {
        this(init(str != null ? new File(str) : null, z4, null, ScopesAdapter.getInstance()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(FileDescriptor fileDescriptor, FileOutputStream fileOutputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new FileOutputStreamInitData(null, false, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    public SentryFileOutputStream(File file) {
        this(file, false, (IScopes) ScopesAdapter.getInstance());
    }

    public static final class Factory {
        public static FileOutputStream create(FileOutputStream fileOutputStream, String str) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, false, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        private static boolean isTracingEnabled(IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str, boolean z4) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, z4, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, boolean z4) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, z4, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(fileDescriptor, fileOutputStream, ScopesAdapter.getInstance()), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, iScopes)) : fileOutputStream;
        }
    }

    public SentryFileOutputStream(File file, boolean z4) {
        this(init(file, z4, null, ScopesAdapter.getInstance()));
    }

    public SentryFileOutputStream(FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, null, ScopesAdapter.getInstance()), fileDescriptor);
    }

    public SentryFileOutputStream(File file, boolean z4, IScopes iScopes) {
        this(init(file, z4, null, iScopes));
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData) {
        super(getFileDescriptor(fileOutputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }
}
