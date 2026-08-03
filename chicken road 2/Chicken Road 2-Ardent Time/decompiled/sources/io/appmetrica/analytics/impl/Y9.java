package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f5333a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.channels.FileLock f5334b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.RandomAccessFile f5335c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.channels.FileChannel f5336d;

    /* renamed from: e, reason: collision with root package name */
    public int f5337e;

    public Y9(android.content.Context context, java.lang.String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.f5333a, "rw");
            this.f5335c = randomAccessFile;
            java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
            this.f5336d = channel;
            if (this.f5337e == 0) {
                this.f5334b = channel.lock();
            }
            this.f5337e++;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f5333a.getAbsolutePath();
            int i2 = this.f5337e - 1;
            this.f5337e = i2;
            if (i2 == 0) {
                io.appmetrica.analytics.impl.Ja.a(this.f5334b);
            }
            io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) this.f5335c);
            io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) this.f5336d);
            this.f5335c = null;
            this.f5334b = null;
            this.f5336d = null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public Y9(java.lang.String str) {
        this(io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromPath(str + ".lock"));
    }

    public Y9(java.io.File file) {
        this.f5337e = 0;
        this.f5333a = file;
    }

    public static java.io.File a(android.content.Context context, java.lang.String str) {
        java.io.File fileFromSdkStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new java.lang.IllegalStateException("Cannot create lock file");
    }
}
