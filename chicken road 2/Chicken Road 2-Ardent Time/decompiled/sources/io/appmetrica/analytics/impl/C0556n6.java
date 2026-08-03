package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556n6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0224aa f6459a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0349f6 f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f6461c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Z9 f6462d;

    public C0556n6(android.content.Context context) {
        this(context, new io.appmetrica.analytics.impl.C0224aa(), new io.appmetrica.analytics.impl.C0349f6(), io.appmetrica.analytics.impl.Z9.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(io.appmetrica.analytics.impl.C0774vh c0774vh) {
        boolean mkdir;
        java.lang.String str;
        io.appmetrica.analytics.impl.C0818x9 b2;
        java.io.PrintWriter printWriter;
        io.appmetrica.analytics.impl.Z9 z9;
        java.io.File crashesDirectory = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getCrashesDirectory(this.f6461c);
        this.f6460b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                io.appmetrica.analytics.impl.Bf bf = c0774vh.f6978e.f4367a;
                str = bf.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + bf.f4123a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b2 = this.f6462d.b(str);
                b2.f7103a.lock();
                b2.f7104b.a();
                this.f6459a.getClass();
                printWriter = new java.io.PrintWriter(new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(crashesDirectory, str))));
                printWriter.write(new io.appmetrica.analytics.impl.C0457jb(c0774vh.f6974a, c0774vh.f6978e, c0774vh.f6977d).k());
                io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) printWriter);
                b2.c();
                z9 = this.f6462d;
                synchronized (z9) {
                    z9.f5401b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new io.appmetrica.analytics.impl.C0457jb(c0774vh.f6974a, c0774vh.f6978e, c0774vh.f6977d).k());
            io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) printWriter);
            b2.c();
            z9 = this.f6462d;
            synchronized (z9) {
            }
        } catch (java.lang.Throwable unused) {
            io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) printWriter);
            b2.c();
            this.f6462d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        io.appmetrica.analytics.impl.Bf bf2 = c0774vh.f6978e.f4367a;
        str = bf2.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + bf2.f4123a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b2 = this.f6462d.b(str);
        b2.f7103a.lock();
        b2.f7104b.a();
        this.f6459a.getClass();
        printWriter = new java.io.PrintWriter(new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(crashesDirectory, str))));
    }

    public C0556n6(android.content.Context context, io.appmetrica.analytics.impl.C0224aa c0224aa, io.appmetrica.analytics.impl.C0349f6 c0349f6, io.appmetrica.analytics.impl.Z9 z9) {
        this.f6461c = context;
        this.f6459a = c0224aa;
        this.f6460b = c0349f6;
        this.f6462d = z9;
    }
}
