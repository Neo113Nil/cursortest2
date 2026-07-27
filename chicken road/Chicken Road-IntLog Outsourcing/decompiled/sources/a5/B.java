package a5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class B implements j5.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f3890a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3891b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.a f3892c;

    /* renamed from: d, reason: collision with root package name */
    public long f3893d;

    /* renamed from: e, reason: collision with root package name */
    public long f3894e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f3895f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3896g;

    /* renamed from: h, reason: collision with root package name */
    public final z f3897h;

    /* renamed from: i, reason: collision with root package name */
    public final y f3898i;

    /* renamed from: j, reason: collision with root package name */
    public final A f3899j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3900k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0200b f3901l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f3902m;

    public B(int i2, t connection, boolean z, boolean z5, T4.o oVar) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f3890a = i2;
        this.f3891b = connection;
        this.f3892c = new b5.a(i2);
        this.f3894e = connection.f4006s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3895f = arrayDeque;
        this.f3897h = new z(this, connection.f4005r.a(), z5);
        this.f3898i = new y(this, z);
        this.f3899j = new A(this);
        this.f3900k = new A(this);
        if (oVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(oVar);
        }
    }

    public final void a() {
        boolean z;
        boolean h3;
        TimeZone timeZone = U4.e.f3179a;
        synchronized (this) {
            z zVar = this.f3897h;
            if (!zVar.f4036b && zVar.f4039e) {
                y yVar = this.f3898i;
                if (yVar.f4031a || yVar.f4033c) {
                    z = true;
                    h3 = h();
                }
            }
            z = false;
            h3 = h();
        }
        if (z) {
            c(EnumC0200b.f3922h, null);
        } else {
            if (h3) {
                return;
            }
            this.f3891b.c(this.f3890a);
        }
    }

    public final void b() {
        y yVar = this.f3898i;
        if (yVar.f4033c) {
            throw new IOException("stream closed");
        }
        if (yVar.f4031a) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.f3902m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0200b f3 = f();
            kotlin.jvm.internal.i.b(f3);
            throw new G(f3);
        }
    }

    public final void c(EnumC0200b enumC0200b, IOException iOException) {
        if (d(enumC0200b, iOException)) {
            this.f3891b.f4011x.q(this.f3890a, enumC0200b);
        }
    }

    public final boolean d(EnumC0200b enumC0200b, IOException iOException) {
        TimeZone timeZone = U4.e.f3179a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f3901l = enumC0200b;
            this.f3902m = iOException;
            notifyAll();
            if (this.f3897h.f4036b) {
                if (this.f3898i.f4031a) {
                    return false;
                }
            }
            this.f3891b.c(this.f3890a);
            return true;
        }
    }

    public final void e(EnumC0200b enumC0200b) {
        if (d(enumC0200b, null)) {
            this.f3891b.q(this.f3890a, enumC0200b);
        }
    }

    public final EnumC0200b f() {
        EnumC0200b enumC0200b;
        synchronized (this) {
            enumC0200b = this.f3901l;
        }
        return enumC0200b;
    }

    public final boolean g() {
        boolean z = (this.f3890a & 1) == 1;
        this.f3891b.getClass();
        return true == z;
    }

    public final boolean h() {
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            z zVar = this.f3897h;
            if (zVar.f4036b || zVar.f4039e) {
                y yVar = this.f3898i;
                if (yVar.f4031a || yVar.f4033c) {
                    if (this.f3896g) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(T4.o headers, boolean z) {
        boolean h3;
        kotlin.jvm.internal.i.e(headers, "headers");
        TimeZone timeZone = U4.e.f3179a;
        synchronized (this) {
            try {
                if (this.f3896g && headers.c(":status") == null && headers.c(":method") == null) {
                    this.f3897h.getClass();
                    if (z) {
                        this.f3897h.f4036b = true;
                    }
                    h3 = h();
                    notifyAll();
                }
                this.f3896g = true;
                this.f3895f.add(headers);
                if (z) {
                }
                h3 = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h3) {
            return;
        }
        this.f3891b.c(this.f3890a);
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @Override // j5.v
    public final j5.u q() {
        return this.f3898i;
    }

    @Override // j5.v
    public final j5.w s() {
        return this.f3897h;
    }
}
