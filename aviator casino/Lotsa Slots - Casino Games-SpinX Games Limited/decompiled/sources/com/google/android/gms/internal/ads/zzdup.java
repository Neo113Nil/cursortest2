package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdup implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ java.lang.String zza = "sendMessageToNativeJs";
    final /* synthetic */ java.util.Map zzb;

    zzdup(com.google.android.gms.internal.ads.zzdux zzduxVar, java.lang.String str, java.util.Map map) {
        this.zzb = map;
        java.util.Objects.requireNonNull(zzduxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcku) obj).zze(this.zza, this.zzb);
    }
}
