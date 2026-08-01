package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcdk implements RewardItem {
    private final zzccx zza;

    public zzcdk(zzccx zzccxVar) {
        this.zza = zzccxVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccx zzccxVar = this.zza;
        if (zzccxVar != null) {
            try {
                return zzccxVar.zzf();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzccx zzccxVar = this.zza;
        if (zzccxVar != null) {
            try {
                return zzccxVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
