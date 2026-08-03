package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhbk extends com.google.android.gms.internal.ads.zzhay {
    private com.google.android.gms.internal.ads.zzhbj zza;

    zzhbk(com.google.android.gms.internal.ads.zzgwi zzgwiVar, boolean z, java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        super(zzgwiVar, z, false);
        this.zza = new com.google.android.gms.internal.ads.zzhbi(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(com.google.android.gms.internal.ads.zzhbj zzhbjVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzi() {
        com.google.android.gms.internal.ads.zzhbj zzhbjVar = this.zza;
        if (zzhbjVar != null) {
            zzhbjVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzw(int i, java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzx() {
        com.google.android.gms.internal.ads.zzhbj zzhbjVar = this.zza;
        if (zzhbjVar != null) {
            zzhbjVar.zze();
        }
    }
}
