package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqg implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgqf zza;

    zzgqg(com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgqf zzgqfVar) {
        this.zza = zzgqfVar;
        java.util.Objects.requireNonNull(zzgqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzb(th);
        zzgqfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        this.zza.zzc();
    }
}
