package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccz extends com.google.android.gms.internal.ads.zzcce {
    private final java.lang.String zza;
    private final int zzb;

    public zzccz(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final java.lang.String zze() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzf() throws android.os.RemoteException {
        return this.zzb;
    }

    public zzccz(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
