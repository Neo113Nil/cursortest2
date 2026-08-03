package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzad implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ com.google.android.gms.ads.internal.client.zzad zza = new com.google.android.gms.ads.internal.client.zzad();

    private /* synthetic */ zzad() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        android.os.IBinder iBinder = (android.os.IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdu ? (com.google.android.gms.ads.internal.client.zzdu) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdu(iBinder);
    }
}
