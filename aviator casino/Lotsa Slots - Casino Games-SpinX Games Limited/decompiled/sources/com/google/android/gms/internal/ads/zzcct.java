package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzcct implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzcct zza = new com.google.android.gms.internal.ads.zzcct();

    private /* synthetic */ zzcct() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        android.os.IBinder iBinder = (android.os.IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzccm ? (com.google.android.gms.internal.ads.zzccm) queryLocalInterface : new com.google.android.gms.internal.ads.zzccm(iBinder);
    }
}
