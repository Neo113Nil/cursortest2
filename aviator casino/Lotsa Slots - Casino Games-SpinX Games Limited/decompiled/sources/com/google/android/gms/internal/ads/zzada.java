package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzada implements com.google.android.gms.internal.ads.zzaes {
    final /* synthetic */ com.google.android.gms.internal.ads.zzvj zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzade zzd;

    zzada(com.google.android.gms.internal.ads.zzade zzadeVar, com.google.android.gms.internal.ads.zzvj zzvjVar, int i, long j) {
        this.zza = zzvjVar;
        this.zzb = i;
        this.zzc = j;
        java.util.Objects.requireNonNull(zzadeVar);
        this.zzd = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(long j) {
        this.zzd.zzaB(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zzb() {
        this.zzd.zzay(this.zza, this.zzb, this.zzc);
    }
}
