package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzduw implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdux zza;
    private final java.lang.ref.WeakReference zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzbpq zzd;

    /* synthetic */ zzduw(com.google.android.gms.internal.ads.zzdux zzduxVar, java.lang.ref.WeakReference weakReference, java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzduxVar);
        this.zza = zzduxVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
