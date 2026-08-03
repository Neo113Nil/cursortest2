package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdpf implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpo zzb;

    zzdpf(com.google.android.gms.internal.ads.zzdpo zzdpoVar, android.view.View view) {
        this.zza = view;
        java.util.Objects.requireNonNull(zzdpoVar);
        this.zzb = zzdpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        this.zzb.zzY(this.zza, (com.google.android.gms.internal.ads.zzeln) obj);
    }
}
