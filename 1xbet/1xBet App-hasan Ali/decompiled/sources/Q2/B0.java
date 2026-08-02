package Q2;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class B0 extends J2.d {

    /* renamed from: k, reason: collision with root package name */
    public final Object f4899k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public J2.d f4900l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0 f4901m;

    public B0(C0 c02) {
        this.f4901m = c02;
    }

    @Override // J2.d
    public final void a() {
        synchronized (this.f4899k) {
            try {
                J2.d dVar = this.f4900l;
                if (dVar != null) {
                    dVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J2.d
    public final void b(J2.m mVar) {
        C0 c02 = this.f4901m;
        v3.g gVar = (v3.g) c02.f4904c;
        K k5 = (K) c02.i;
        InterfaceC0391w0 interfaceC0391w0 = null;
        if (k5 != null) {
            try {
                interfaceC0391w0 = k5.o();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
        gVar.I(interfaceC0391w0);
        synchronized (this.f4899k) {
            try {
                J2.d dVar = this.f4900l;
                if (dVar != null) {
                    dVar.b(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J2.d
    public final void d() {
        synchronized (this.f4899k) {
            try {
                J2.d dVar = this.f4900l;
                if (dVar != null) {
                    dVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J2.d
    public final void i() {
        C0 c02 = this.f4901m;
        v3.g gVar = (v3.g) c02.f4904c;
        K k5 = (K) c02.i;
        InterfaceC0391w0 interfaceC0391w0 = null;
        if (k5 != null) {
            try {
                interfaceC0391w0 = k5.o();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
        gVar.I(interfaceC0391w0);
        synchronized (this.f4899k) {
            try {
                J2.d dVar = this.f4900l;
                if (dVar != null) {
                    dVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J2.d
    public final void j() {
        synchronized (this.f4899k) {
            try {
                J2.d dVar = this.f4900l;
                if (dVar != null) {
                    dVar.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J2.d
    public final void z() {
        synchronized (this.f4899k) {
            try {
                J2.d dVar = this.f4900l;
                if (dVar != null) {
                    dVar.z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
