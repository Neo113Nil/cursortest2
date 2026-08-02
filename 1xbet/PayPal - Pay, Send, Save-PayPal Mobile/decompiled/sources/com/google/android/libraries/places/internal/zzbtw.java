package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbty zzb;

    zzbtw(com.google.android.libraries.places.internal.zzbty zzbtyVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbtyVar);
        this.zzb = zzbtyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbty zzbtyVar = this.zzb;
        com.google.android.libraries.places.internal.zzbua zzbuaVar = zzbtyVar.zzc;
        if (zzbuaVar.zzE().zzc() != com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            com.google.android.libraries.places.internal.zzbqa zzbqaVar = zzbtyVar.zza;
            if (zzbuaVar.zzC() == zzbqaVar) {
                zzbuaVar.zzD(null);
                zzbuaVar.zzr().zzd();
                zzbuaVar.zzh(com.google.android.libraries.places.internal.zzbjn.IDLE);
                zzbuaVar.zzI().zzc(zzbuaVar.zzJ(), com.google.android.libraries.places.internal.zzbty.zzg(zzbuaVar.zzr().zzf(), com.google.android.libraries.places.internal.zzbmy.zza), com.google.android.libraries.places.internal.zzbty.zzg(zzbuaVar.zzr().zzf(), com.google.android.libraries.places.internal.zzbka.zzb), com.google.android.libraries.places.internal.zzcae.UNKNOWN.zza(null), com.google.android.libraries.places.internal.zzbty.zzf((com.google.android.libraries.places.internal.zzbni) zzbuaVar.zzr().zzf().zza(com.google.android.libraries.places.internal.zzbsr.zza)));
                return;
            }
            if (zzbuaVar.zzA() == zzbqaVar) {
                zzbuaVar.zzI().zzb(zzbuaVar.zzJ(), com.google.android.libraries.places.internal.zzbty.zzg(zzbuaVar.zzr().zzf(), com.google.android.libraries.places.internal.zzbmy.zza), com.google.android.libraries.places.internal.zzbty.zzg(zzbuaVar.zzr().zzf(), com.google.android.libraries.places.internal.zzbka.zzb));
                com.google.common.base.Preconditions.checkState(zzbuaVar.zzE().zzc() == com.google.android.libraries.places.internal.zzbjn.CONNECTING, "Expected state is CONNECTING, actual state is %s", zzbuaVar.zzE().zzc());
                zzbuaVar.zzr().zzc();
                if (zzbuaVar.zzr().zza()) {
                    zzbuaVar.zzf();
                    return;
                }
                zzbuaVar.zzB(null);
                zzbuaVar.zzr().zzd();
                zzbuaVar.zzg(this.zza);
            }
        }
    }
}
