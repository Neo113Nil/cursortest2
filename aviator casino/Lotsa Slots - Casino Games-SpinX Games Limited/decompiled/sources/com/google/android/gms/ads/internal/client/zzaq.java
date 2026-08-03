package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzaq implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ com.google.android.gms.ads.internal.client.zzaq zza = new com.google.android.gms.ads.internal.client.zzaq();

    private /* synthetic */ zzaq() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        android.os.IBinder iBinder = (android.os.IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzci ? (com.google.android.gms.ads.internal.client.zzci) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzci(iBinder);
    }
}
