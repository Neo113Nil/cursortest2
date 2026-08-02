package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.C0393x0;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0701Va extends AbstractBinderC0389v0 {

    /* renamed from: k, reason: collision with root package name */
    public final Object f11881k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public volatile C0393x0 f11882l;

    @Override // Q2.InterfaceC0391w0
    public final void S(boolean z3) {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final void Y1(C0393x0 c0393x0) {
        synchronized (this.f11881k) {
            this.f11882l = c0393x0;
        }
    }

    @Override // Q2.InterfaceC0391w0
    public final float b() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final float c() {
        throw new RemoteException();
    }

    @Override // Q2.InterfaceC0391w0
    public final C0393x0 e() {
        C0393x0 c0393x0;
        synchronized (this.f11881k) {
            c0393x0 = this.f11882l;
        }
        return c0393x0;
    }

    @Override // Q2.InterfaceC0391w0
    public final float f() {
        throw new RemoteException();
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
