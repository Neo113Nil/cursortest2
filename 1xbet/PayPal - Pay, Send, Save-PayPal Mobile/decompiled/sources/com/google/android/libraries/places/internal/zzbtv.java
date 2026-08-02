package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtv implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbty zza;

    zzbtv(com.google.android.libraries.places.internal.zzbty zzbtyVar) {
        java.util.Objects.requireNonNull(zzbtyVar);
        this.zza = zzbtyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbty zzbtyVar = this.zza;
        com.google.android.libraries.places.internal.zzbua zzbuaVar = zzbtyVar.zzc;
        zzbuaVar.zzK(null);
        if (zzbuaVar.zzF() != null) {
            com.google.common.base.Preconditions.checkState(zzbuaVar.zzC() == null, "Unexpected non-null activeTransport");
            zzbtyVar.zza.zzd(zzbuaVar.zzF());
            return;
        }
        com.google.android.libraries.places.internal.zzbqa zzbqaVar = zzbtyVar.zza;
        if (zzbuaVar.zzA() == zzbqaVar) {
            zzbuaVar.zzD(zzbqaVar);
            zzbuaVar.zzB(null);
            zzbuaVar.zzH(zzbuaVar.zzr().zzf());
            zzbuaVar.zzh(com.google.android.libraries.places.internal.zzbjn.READY);
            zzbuaVar.zzI().zza(zzbuaVar.zzJ(), com.google.android.libraries.places.internal.zzbty.zzg(zzbuaVar.zzr().zzf(), com.google.android.libraries.places.internal.zzbmy.zza), com.google.android.libraries.places.internal.zzbty.zzg(zzbuaVar.zzr().zzf(), com.google.android.libraries.places.internal.zzbka.zzb), com.google.android.libraries.places.internal.zzbty.zzf((com.google.android.libraries.places.internal.zzbni) zzbuaVar.zzr().zzf().zza(com.google.android.libraries.places.internal.zzbsr.zza)));
        }
    }
}
