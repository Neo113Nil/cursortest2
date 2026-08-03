package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzduf implements com.google.android.gms.internal.ads.zzblr {
    final /* synthetic */ java.lang.String zza = com.google.android.gms.ads.nativead.NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdug zzb;

    zzduf(com.google.android.gms.internal.ads.zzdug zzdugVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzdugVar);
        this.zzb = zzdugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zza() {
        com.google.android.gms.internal.ads.zzdug zzdugVar = this.zzb;
        if (zzdugVar.zzc() != null) {
            zzdugVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzb(android.view.MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final org.json.JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final org.json.JSONObject zzd() {
        return null;
    }
}
