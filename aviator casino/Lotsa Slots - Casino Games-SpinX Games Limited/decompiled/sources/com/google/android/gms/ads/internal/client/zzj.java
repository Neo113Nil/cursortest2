package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzj implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ com.google.android.gms.ads.internal.client.zzj zza = new com.google.android.gms.ads.internal.client.zzj();

    private /* synthetic */ zzj() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        android.os.IBinder iBinder = (android.os.IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbv ? (com.google.android.gms.ads.internal.client.zzbv) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbv(iBinder);
    }
}
