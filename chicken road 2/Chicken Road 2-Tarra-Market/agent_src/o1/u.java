package o1;

/* loaded from: classes.dex */
public final class u implements s1.r {

    /* renamed from: a, reason: collision with root package name */
    public final s1.e f6350a = new s1.e();

    /* renamed from: b, reason: collision with root package name */
    public boolean f6351b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f6353d;

    public u(w wVar) {
        this.f6353d = wVar;
    }

    public final void a(boolean z2) {
        w wVar;
        long min;
        w wVar2;
        synchronized (this.f6353d) {
            this.f6353d.f6369j.i();
            while (true) {
                try {
                    wVar = this.f6353d;
                    if (wVar.f6361b > 0 || this.f6352c || this.f6351b || wVar.f6370k != 0) {
                        break;
                    } else {
                        wVar.i();
                    }
                } finally {
                    this.f6353d.f6369j.n();
                }
            }
            wVar.f6369j.n();
            this.f6353d.b();
            min = Math.min(this.f6353d.f6361b, this.f6350a.f6618b);
            wVar2 = this.f6353d;
            wVar2.f6361b -= min;
        }
        wVar2.f6369j.i();
        try {
            w wVar3 = this.f6353d;
            wVar3.f6363d.n(wVar3.f6362c, z2 && min == this.f6350a.f6618b, this.f6350a, min);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s1.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f6353d) {
            try {
                if (this.f6351b) {
                    return;
                }
                w wVar = this.f6353d;
                if (!wVar.f6367h.f6352c) {
                    if (this.f6350a.f6618b > 0) {
                        while (this.f6350a.f6618b > 0) {
                            a(true);
                        }
                    } else {
                        wVar.f6363d.n(wVar.f6362c, true, null, 0L);
                    }
                }
                synchronized (this.f6353d) {
                    this.f6351b = true;
                }
                this.f6353d.f6363d.flush();
                this.f6353d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s1.r
    public final s1.u d() {
        return this.f6353d.f6369j;
    }

    @Override // s1.r
    public final void e(s1.e eVar, long j2) {
        s1.e eVar2 = this.f6350a;
        eVar2.e(eVar, j2);
        while (eVar2.f6618b >= 16384) {
            a(false);
        }
    }

    @Override // s1.r, java.io.Flushable
    public final void flush() {
        synchronized (this.f6353d) {
            this.f6353d.b();
        }
        while (this.f6350a.f6618b > 0) {
            a(false);
            this.f6353d.f6363d.flush();
        }
    }
}
