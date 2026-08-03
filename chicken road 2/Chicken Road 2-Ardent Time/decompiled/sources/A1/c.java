package A1;

/* loaded from: classes.dex */
public final class c extends z1.AbstractC1065s implements z1.InterfaceC1071y {
    private volatile A1.c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f0c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2e;

    /* renamed from: f, reason: collision with root package name */
    public final A1.c f3f;

    public c(android.os.Handler handler, java.lang.String str, boolean z2) {
        this.f0c = handler;
        this.f1d = str;
        this.f2e = z2;
        this._immediate = z2 ? this : null;
        A1.c cVar = this._immediate;
        if (cVar == null) {
            cVar = new A1.c(handler, str, true);
            this._immediate = cVar;
        }
        this.f3f = cVar;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof A1.c) && ((A1.c) obj).f0c == this.f0c;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f0c);
    }

    @Override // z1.AbstractC1065s
    public final void l(k1.i iVar, java.lang.Runnable runnable) {
        if (this.f0c.post(runnable)) {
            return;
        }
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        z1.P p2 = (z1.P) iVar.m(z1.C1066t.f8592b);
        if (p2 != null) {
            p2.a(cancellationException);
        }
        z1.B.f8522b.l(iVar, runnable);
    }

    @Override // z1.AbstractC1065s
    public final boolean n() {
        return (this.f2e && kotlin.jvm.internal.i.a(android.os.Looper.myLooper(), this.f0c.getLooper())) ? false : true;
    }

    @Override // z1.AbstractC1065s
    public final java.lang.String toString() {
        A1.c cVar;
        java.lang.String str;
        G1.d dVar = z1.B.f8521a;
        A1.c cVar2 = E1.o.f296a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f3f;
            } catch (java.lang.UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.f1d;
        if (str2 == null) {
            str2 = this.f0c.toString();
        }
        if (!this.f2e) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(android.os.Handler handler) {
        this(handler, null, false);
    }
}
