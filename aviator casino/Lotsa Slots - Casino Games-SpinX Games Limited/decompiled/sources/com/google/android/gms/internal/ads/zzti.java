package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzti implements com.google.android.gms.internal.ads.zzqt {
    final /* synthetic */ com.google.android.gms.internal.ads.zztr zza;
    private final com.google.android.gms.internal.ads.zzre zzb;

    /* synthetic */ zzti(com.google.android.gms.internal.ads.zztr zztrVar, com.google.android.gms.internal.ads.zzre zzreVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zztrVar);
        this.zza = zztrVar;
        this.zzb = zzreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final void zza(long j) {
        com.google.android.gms.internal.ads.zztr zztrVar = this.zza;
        if (equals(zztrVar.zzJ()) && zztrVar.zzK() != null) {
            com.google.android.gms.internal.ads.zztx zztxVar = ((com.google.android.gms.internal.ads.zztw) zztrVar.zzK()).zza;
            zztxVar.zzaC(true);
            zztxVar.zzaz().zzd(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = ((com.google.android.gms.internal.ads.zztw) r0.zzK()).zza.zzbc();
     */
    @Override // com.google.android.gms.internal.ads.zzqt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb() {
        com.google.android.gms.internal.ads.zzmz zzbc;
        com.google.android.gms.internal.ads.zztr zztrVar = this.zza;
        if (equals(zztrVar.zzJ()) && zztrVar.zzK() != null && zztrVar.zzP() && zzbc != null) {
            zzbc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final void zzc() {
        com.google.android.gms.internal.ads.zztr zztrVar = this.zza;
        if (equals(zztrVar.zzJ()) && zztrVar.zzN()) {
            zztrVar.zzO(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final void zzd() {
        long j;
        com.google.android.gms.internal.ads.zztr zztrVar = this.zza;
        if (equals(zztrVar.zzJ()) && zztrVar.zzK() != null) {
            if (zztrVar.zzL().zzi() != -1) {
                long zzi = zztrVar.zzL().zzj().zze / zztrVar.zzL().zzi();
                com.google.android.gms.internal.ads.zzqv zzM = zztrVar.zzM();
                zzM.getClass();
                j = com.google.android.gms.internal.ads.zzfl.zzt(zzi, zzM.zzi());
            } else {
                j = -9223372036854775807L;
            }
            ((com.google.android.gms.internal.ads.zztw) zztrVar.zzK()).zza.zzaz().zze(zztrVar.zzL().zzj().zze, com.google.android.gms.internal.ads.zzfl.zzr(j), android.os.SystemClock.elapsedRealtime() - zztrVar.zzQ());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final void zze() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        atomicInteger = com.google.android.gms.internal.ads.zztr.zza;
        atomicInteger.getAndDecrement();
        com.google.android.gms.internal.ads.zztr zztrVar = this.zza;
        if (zztrVar.zzK() != null) {
            com.google.android.gms.internal.ads.zzre zzreVar = this.zzb;
            ((com.google.android.gms.internal.ads.zztw) zztrVar.zzK()).zza.zzaz().zzl(new com.google.android.gms.internal.ads.zzry(zzreVar.zza, zzreVar.zzb, zzreVar.zzc, false, false, zzreVar.zze));
        }
    }
}
