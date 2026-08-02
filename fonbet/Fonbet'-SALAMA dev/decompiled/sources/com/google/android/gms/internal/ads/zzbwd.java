package com.google.android.gms.internal.ads;

import J2.j;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbwd implements S2.b {
    private final zzbvq zza;

    public zzbwd(zzbvq zzbvqVar) {
        this.zza = zzbvqVar;
    }

    @Override // S2.b
    public final int getAmount() {
        zzbvq zzbvqVar = this.zza;
        if (zzbvqVar != null) {
            try {
                return zzbvqVar.zze();
            } catch (RemoteException e7) {
                j.h("Could not forward getAmount to RewardItem", e7);
            }
        }
        return 0;
    }

    @Override // S2.b
    public final String getType() {
        zzbvq zzbvqVar = this.zza;
        if (zzbvqVar != null) {
            try {
                return zzbvqVar.zzf();
            } catch (RemoteException e7) {
                j.h("Could not forward getType to RewardItem", e7);
            }
        }
        return null;
    }
}
