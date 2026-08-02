package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import Q2.InterfaceC0386u;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class Go implements InterfaceC0347a, Vi {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0386u f9265k;

    @Override // com.google.android.gms.internal.ads.Vi
    public final synchronized void E() {
        InterfaceC0386u interfaceC0386u = this.f9265k;
        if (interfaceC0386u != null) {
            try {
                interfaceC0386u.a();
            } catch (RemoteException e3) {
                U2.j.j("Remote Exception at onPhysicalClick.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final synchronized void u() {
    }

    @Override // Q2.InterfaceC0347a
    public final synchronized void z() {
        InterfaceC0386u interfaceC0386u = this.f9265k;
        if (interfaceC0386u != null) {
            try {
                interfaceC0386u.a();
            } catch (RemoteException e3) {
                U2.j.j("Remote Exception at onAdClicked.", e3);
            }
        }
    }
}
