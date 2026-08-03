package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzblj implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzblj zza = new com.google.android.gms.internal.ads.zzblj();

    private /* synthetic */ zzblj() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        android.os.IBinder iBinder = (android.os.IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbll ? (com.google.android.gms.internal.ads.zzbll) queryLocalInterface : new com.google.android.gms.internal.ads.zzbll(iBinder);
    }
}
