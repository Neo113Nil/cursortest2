package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckw implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.net.Uri zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzclf zzd;

    zzckw(com.google.android.gms.internal.ads.zzclf zzclfVar, java.util.List list, java.lang.String str, android.net.Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        java.util.Objects.requireNonNull(zzclfVar);
        this.zzd = zzclfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String.valueOf(valueOf);
        java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to parse gmsg params for: ".concat(valueOf2));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.List list = this.zza;
        java.lang.String str = this.zzb;
        this.zzd.zzaa((java.util.Map) obj, list, str);
    }
}
