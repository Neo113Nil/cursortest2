package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.ScopesAdapter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryFileInputStream extends FileInputStream {
    private final FileInputStream delegate;
    private final FileIOSpanManager spanManager;

    private static FileDescriptor getFileDescriptor(FileInputStream fileInputStream) throws FileNotFoundException {
        try {
            return fileInputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStreamInitData init(File file, FileInputStream fileInputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new FileInputStreamInitData(file, iSpanStartSpan, fileInputStream, iScopes.getOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$read$0(AtomicInteger atomicInteger) throws IOException {
        int i7 = this.delegate.read();
        atomicInteger.set(i7);
        return Integer.valueOf(i7 != -1 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$read$1(byte[] bArr) {
        return Integer.valueOf(this.delegate.read(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$read$2(byte[] bArr, int i7, int i8) {
        return Integer.valueOf(this.delegate.read(bArr, i7, i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$skip$3(long j) {
        return Long.valueOf(this.delegate.skip(j));
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read() throws IOException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.spanManager.performIO(new c(this, atomicInteger, 1));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public long skip(final long j) {
        return ((Long) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.a
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return this.f14480a.lambda$skip$3(j);
            }
        })).longValue();
    }

    public static final class Factory {
        public static FileInputStream create(FileInputStream fileInputStream, String str) {
            ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
            if (isTracingEnabled(scopesAdapter)) {
                return new SentryFileInputStream(SentryFileInputStream.init(str != null ? new File(str) : null, fileInputStream, scopesAdapter));
            }
            return fileInputStream;
        }

        private static boolean isTracingEnabled(IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static FileInputStream create(FileInputStream fileInputStream, File file) {
            ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
            return isTracingEnabled(scopesAdapter) ? new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, scopesAdapter)) : fileInputStream;
        }

        public static FileInputStream create(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
            ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
            return isTracingEnabled(scopesAdapter) ? new SentryFileInputStream(SentryFileInputStream.init(fileDescriptor, fileInputStream, scopesAdapter), fileDescriptor) : fileInputStream;
        }

        public static FileInputStream create(FileInputStream fileInputStream, File file, IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, iScopes)) : fileInputStream;
        }
    }

    public SentryFileInputStream(String str) {
        this(str != null ? new File(str) : null, ScopesAdapter.getInstance());
    }

    public SentryFileInputStream(File file) {
        this(file, ScopesAdapter.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStreamInitData init(FileDescriptor fileDescriptor, FileInputStream fileInputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(fileDescriptor);
        }
        return new FileInputStreamInitData(null, iSpanStartSpan, fileInputStream, iScopes.getOptions());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((Integer) this.spanManager.performIO(new c(this, bArr, 0))).intValue();
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor) {
        this(fileDescriptor, ScopesAdapter.getInstance());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        return ((Integer) this.spanManager.performIO(new b(this, bArr, i7, i8, 0))).intValue();
    }

    public SentryFileInputStream(File file, IScopes iScopes) {
        this(init(file, (FileInputStream) null, iScopes));
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor, IScopes iScopes) {
        this(init(fileDescriptor, (FileInputStream) null, iScopes), fileDescriptor);
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData) {
        super(getFileDescriptor(fileInputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }
}
