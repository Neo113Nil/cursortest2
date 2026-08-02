package F4;

import L4.C0226i;
import L4.G;
import L4.K;

/* loaded from: classes.dex */
public final class t implements G, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1652k;

    /* renamed from: l, reason: collision with root package name */
    public final C0226i f1653l = new C0226i();

    /* renamed from: m, reason: collision with root package name */
    public boolean f1654m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f1655n;

    public t(w wVar, boolean z3) {
        this.f1655n = wVar;
        this.f1652k = z3;
    }

    @Override // L4.G
    public final void D(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("source", c0226i);
        byte[] bArr = z4.b.f21979a;
        C0226i c0226i2 = this.f1653l;
        c0226i2.D(c0226i, j5);
        while (c0226i2.f3091l >= 16384) {
            b(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z3) {
        long min;
        boolean z5;
        w wVar = this.f1655n;
        synchronized (wVar) {
            wVar.f1672l.h();
            while (wVar.f1667e >= wVar.f && !this.f1652k && !this.f1654m && wVar.f() == 0) {
                try {
                    wVar.l();
                } catch (Throwable th) {
                    wVar.f1672l.k();
                    throw th;
                }
            }
            wVar.f1672l.k();
            wVar.b();
            min = Math.min(wVar.f - wVar.f1667e, this.f1653l.f3091l);
            wVar.f1667e += min;
            z5 = z3 && min == this.f1653l.f3091l;
        }
        this.f1655n.f1672l.h();
        try {
            w wVar2 = this.f1655n;
            wVar2.f1664b.l(wVar2.f1663a, z5, this.f1653l, min);
        } finally {
            this.f1655n.f1672l.k();
        }
    }

    @Override // L4.G
    public final K c() {
        return this.f1655n.f1672l;
    }

    @Override // L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f1655n;
        byte[] bArr = z4.b.f21979a;
        synchronized (wVar) {
            if (this.f1654m) {
                return;
            }
            boolean z3 = wVar.f() == 0;
            w wVar2 = this.f1655n;
            if (!wVar2.f1670j.f1652k) {
                if (this.f1653l.f3091l > 0) {
                    while (this.f1653l.f3091l > 0) {
                        b(true);
                    }
                } else if (z3) {
                    wVar2.f1664b.l(wVar2.f1663a, true, null, 0L);
                }
            }
            synchronized (this.f1655n) {
                this.f1654m = true;
            }
            this.f1655n.f1664b.flush();
            this.f1655n.a();
        }
    }

    @Override // L4.G, java.io.Flushable
    public final void flush() {
        w wVar = this.f1655n;
        byte[] bArr = z4.b.f21979a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f1653l.f3091l > 0) {
            b(false);
            this.f1655n.f1664b.flush();
        }
    }
}
