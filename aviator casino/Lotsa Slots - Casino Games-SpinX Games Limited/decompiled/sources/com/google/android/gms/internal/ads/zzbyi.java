package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyi extends com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo {
    private final java.util.List zza = new java.util.ArrayList();
    private java.lang.String zzb;

    public zzbyi(com.google.android.gms.internal.ads.zzblx zzblxVar) {
        try {
            this.zzb = zzblxVar.zzb();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzb = "";
        }
        try {
            for (java.lang.Object obj : zzblxVar.zzc()) {
                com.google.android.gms.internal.ads.zzbme zzh = obj instanceof android.os.IBinder ? com.google.android.gms.internal.ads.zzbmd.zzh((android.os.IBinder) obj) : null;
                if (zzh != null) {
                    this.zza.add(new com.google.android.gms.internal.ads.zzbyk(zzh));
                }
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final java.lang.CharSequence getText() {
        return this.zzb;
    }
}
