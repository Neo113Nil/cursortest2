package a5;

import java.io.IOException;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class z implements j5.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f4035a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4036b;

    /* renamed from: c, reason: collision with root package name */
    public final j5.f f4037c = new j5.f();

    /* renamed from: d, reason: collision with root package name */
    public final j5.f f4038d = new j5.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f4040f;

    public z(B b6, long j2, boolean z) {
        this.f4040f = b6;
        this.f4035a = j2;
        this.f4036b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        B b6 = this.f4040f;
        synchronized (b6) {
            this.f4039e = true;
            j5.f fVar = this.f4038d;
            j2 = fVar.f10495b;
            fVar.D(j2);
            b6.notifyAll();
        }
        if (j2 > 0) {
            TimeZone timeZone = U4.e.f3179a;
            this.f4040f.f3891b.o(j2);
        }
        this.f4040f.a();
    }

    @Override // j5.w
    public final j5.y d() {
        return this.f4040f.f3899j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0019, B:12:0x0023, B:32:0x00a9, B:59:0x00cf, B:60:0x00d4, B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0077, B:29:0x0086, B:45:0x009a, B:48:0x00a0, B:52:0x00c5, B:53:0x00cc), top: B:4:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0077, B:29:0x0086, B:45:0x009a, B:48:0x00a0, B:52:0x00c5, B:53:0x00cc), top: B:13:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[SYNTHETIC] */
    @Override // j5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s(j5.f sink, long j2) {
        boolean z;
        boolean z5;
        Throwable th;
        long j6;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            B b6 = this.f4040f;
            synchronized (b6) {
                b6.f3891b.getClass();
                y yVar = b6.f3898i;
                z = true;
                try {
                    if (!yVar.f4033c && !yVar.f4031a) {
                        z5 = false;
                        if (z5) {
                            b6.f3899j.h();
                        }
                        if (b6.f() != null || this.f4036b) {
                            th = null;
                        } else {
                            th = b6.f3902m;
                            if (th == null) {
                                EnumC0200b f3 = b6.f();
                                kotlin.jvm.internal.i.b(f3);
                                th = new G(f3);
                            }
                        }
                        if (!this.f4039e) {
                            throw new IOException("stream closed");
                        }
                        j5.f fVar = this.f4038d;
                        long j7 = fVar.f10495b;
                        if (j7 > 0) {
                            j6 = fVar.s(sink, Math.min(8192L, j7));
                            b5.a.b(b6.f3892c, j6, 0L, 2);
                            long a6 = b6.f3892c.a();
                            if (th == null && a6 >= b6.f3891b.f4005r.a() / 2) {
                                b6.f3891b.y(b6.f3890a, a6);
                                b5.a.b(b6.f3892c, 0L, a6, 1);
                            }
                            z = false;
                        } else {
                            if (this.f4036b || th != null) {
                                z = false;
                            } else {
                                b6.j();
                            }
                            j6 = -1;
                        }
                    }
                    if (b6.f() != null) {
                    }
                    th = null;
                    if (!this.f4039e) {
                    }
                } finally {
                    if (z5) {
                        b6.f3899j.l();
                    }
                }
                z5 = true;
                if (z5) {
                }
            }
            this.f4040f.f3891b.f4004q.getClass();
        } while (z);
        if (j6 != -1) {
            return j6;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
