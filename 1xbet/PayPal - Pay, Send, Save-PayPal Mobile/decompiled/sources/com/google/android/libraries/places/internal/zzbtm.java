package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zzb;

    zzbtm(com.google.android.libraries.places.internal.zzbua zzbuaVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zzb = zzbuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zzb;
        com.google.android.libraries.places.internal.zzbjn zzc = zzbuaVar.zzE().zzc();
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.SHUTDOWN;
        if (zzc != zzbjnVar) {
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zza;
            zzbuaVar.zzG(zzbnpVar);
            com.google.android.libraries.places.internal.zzbwd zzC = zzbuaVar.zzC();
            zzbuaVar.zzD(null);
            zzbuaVar.zzB(null);
            zzbuaVar.zzh(zzbjnVar);
            zzbuaVar.zzr().zzd();
            if (zzbuaVar.zzy().isEmpty()) {
                zzbuaVar.zzi();
            }
            zzbuaVar.zzk();
            if (zzbuaVar.zzu() != null) {
                zzbuaVar.zzu().zza();
                zzbuaVar.zzw().zzd(zzbnpVar);
                zzbuaVar.zzv(null);
                zzbuaVar.zzx(null);
            }
            if (zzC != null) {
                zzC.zzd(zzbnpVar);
            }
            com.google.android.libraries.places.internal.zzbqa zzA = zzbuaVar.zzA();
            if (zzA != null) {
                zzA.zzd(zzbnpVar);
            }
        }
    }
}
