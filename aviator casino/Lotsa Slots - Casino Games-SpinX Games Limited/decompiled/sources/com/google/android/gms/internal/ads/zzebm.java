package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzebm implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzebw zza;

    zzebm(com.google.android.gms.internal.ads.zzebw zzebwVar) {
        java.util.Objects.requireNonNull(zzebwVar);
        this.zza = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        synchronized (this) {
            com.google.android.gms.internal.ads.zzebw zzebwVar = this.zza;
            zzebwVar.zzn(true);
            zzebwVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebwVar.zzo()));
            zzebwVar.zzp().zzd(new java.lang.Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(@javax.annotation.Nullable java.lang.Object obj) {
        final java.lang.String str = (java.lang.String) obj;
        synchronized (this) {
            com.google.android.gms.internal.ads.zzebw zzebwVar = this.zza;
            zzebwVar.zzn(true);
            zzebwVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzebwVar.zzo()));
            zzebwVar.zzq().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzebm.this.zza.zzl(str);
                }
            });
        }
    }
}
