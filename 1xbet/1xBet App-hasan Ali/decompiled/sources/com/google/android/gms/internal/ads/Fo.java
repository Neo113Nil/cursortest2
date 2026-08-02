package com.google.android.gms.internal.ads;

import Q2.InterfaceC0374n0;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Fo implements InterfaceC1209ki {

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f9120k = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC1209ki
    public final void j(Q2.b1 b1Var) {
        Object obj = this.f9120k.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0374n0) obj).X2(b1Var);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }
}
