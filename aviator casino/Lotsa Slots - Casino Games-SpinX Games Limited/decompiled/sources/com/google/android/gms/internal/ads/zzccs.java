package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccs implements com.google.android.gms.ads.rewarded.RewardItem {
    private final com.google.android.gms.internal.ads.zzccf zza;

    public zzccs(com.google.android.gms.internal.ads.zzccf zzccfVar) {
        this.zza = zzccfVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        com.google.android.gms.internal.ads.zzccf zzccfVar = this.zza;
        if (zzccfVar != null) {
            try {
                return zzccfVar.zzf();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final java.lang.String getType() {
        com.google.android.gms.internal.ads.zzccf zzccfVar = this.zza;
        if (zzccfVar != null) {
            try {
                return zzccfVar.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
