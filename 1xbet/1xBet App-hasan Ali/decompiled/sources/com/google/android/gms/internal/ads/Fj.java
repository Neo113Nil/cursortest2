package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.C0393x0;
import Q2.InterfaceC0391w0;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class Fj extends AbstractBinderC0389v0 {

    /* renamed from: k, reason: collision with root package name */
    public final Object f9100k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0391w0 f9101l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0694Ua f9102m;

    public Fj(InterfaceC0391w0 interfaceC0391w0, InterfaceC0694Ua interfaceC0694Ua) {
        this.f9101l = interfaceC0391w0;
        this.f9102m = interfaceC0694Ua;
    }

    @Override // Q2.InterfaceC0391w0
    public final void S(boolean z3) {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final void Y1(C0393x0 c0393x0) {
        synchronized (this.f9100k) {
            try {
                InterfaceC0391w0 interfaceC0391w0 = this.f9101l;
                if (interfaceC0391w0 != null) {
                    interfaceC0391w0.Y1(c0393x0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q2.InterfaceC0391w0
    public final float b() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final float c() {
        InterfaceC0694Ua interfaceC0694Ua = this.f9102m;
        if (interfaceC0694Ua != null) {
            return interfaceC0694Ua.f();
        }
        return 0.0f;
    }

    @Override // Q2.InterfaceC0391w0
    public final C0393x0 e() {
        synchronized (this.f9100k) {
            try {
                InterfaceC0391w0 interfaceC0391w0 = this.f9101l;
                if (interfaceC0391w0 == null) {
                    return null;
                }
                return interfaceC0391w0.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q2.InterfaceC0391w0
    public final float f() {
        InterfaceC0694Ua interfaceC0694Ua = this.f9102m;
        if (interfaceC0694Ua != null) {
            return interfaceC0694Ua.g();
        }
        return 0.0f;
    }

    @Override // Q2.InterfaceC0391w0
    public final int g() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final void k() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final void m() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final boolean n() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final void o() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final boolean r() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final boolean s() {
        throw new RemoteException();
    }
}
