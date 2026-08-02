package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import F2.InterfaceC0260w;
import I2.J;
import J2.j;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzejh implements InterfaceC0217a, zzdcp {
    private InterfaceC0260w zza;

    @Override // F2.InterfaceC0217a
    public final synchronized void onAdClicked() {
        InterfaceC0260w interfaceC0260w = this.zza;
        if (interfaceC0260w != null) {
            try {
                interfaceC0260w.zzb();
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.h("Remote Exception at onAdClicked.", e7);
            }
        }
    }

    public final synchronized void zza(InterfaceC0260w interfaceC0260w) {
        this.zza = interfaceC0260w;
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zzdd() {
        InterfaceC0260w interfaceC0260w = this.zza;
        if (interfaceC0260w != null) {
            try {
                interfaceC0260w.zzb();
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.h("Remote Exception at onPhysicalClick.", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zzu() {
    }
}
