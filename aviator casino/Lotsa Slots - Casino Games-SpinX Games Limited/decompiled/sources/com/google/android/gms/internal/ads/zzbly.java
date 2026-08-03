package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbly extends com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo {
    private final com.google.android.gms.internal.ads.zzblx zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private java.lang.String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r4.zzb.add(new com.google.android.gms.internal.ads.zzbmf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbly(com.google.android.gms.internal.ads.zzblx zzblxVar) {
        android.os.IBinder iBinder;
        this.zza = zzblxVar;
        try {
            this.zzc = zzblxVar.zzb();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzc = "";
        }
        try {
            for (java.lang.Object obj : zzblxVar.zzc()) {
                com.google.android.gms.internal.ads.zzbme zzbmeVar = null;
                if ((obj instanceof android.os.IBinder) && (iBinder = (android.os.IBinder) obj) != null) {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmeVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbme ? (com.google.android.gms.internal.ads.zzbme) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmc(iBinder);
                }
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final java.lang.CharSequence getText() {
        return this.zzc;
    }
}
