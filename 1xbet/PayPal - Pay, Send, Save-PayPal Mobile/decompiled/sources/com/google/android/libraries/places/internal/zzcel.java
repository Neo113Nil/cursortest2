package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzcel extends com.google.android.libraries.places.internal.zzcek {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcem zza;

    protected zzcel(com.google.android.libraries.places.internal.zzcem zzcemVar) {
        java.util.Objects.requireNonNull(zzcemVar);
        this.zza = zzcemVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcek, com.google.android.libraries.places.internal.zzblg
    public void zzb(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        com.google.android.libraries.places.internal.zzcem zzcemVar = this.zza;
        if (zzcemVar.zzh() != com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            zzcemVar.zzi(zzbjnVar);
            zzcemVar.zzj(zzblnVar);
            com.google.android.libraries.places.internal.zzceo zzceoVar = zzcemVar.zza;
            if (zzceoVar.zzf) {
                return;
            }
            zzceoVar.zze();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcek
    protected final com.google.android.libraries.places.internal.zzblg zzf() {
        return this.zza.zza.zzk();
    }
}
