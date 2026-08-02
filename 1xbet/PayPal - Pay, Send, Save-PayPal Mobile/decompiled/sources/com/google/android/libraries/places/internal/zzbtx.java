package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtx implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbty zza;

    zzbtx(com.google.android.libraries.places.internal.zzbty zzbtyVar) {
        java.util.Objects.requireNonNull(zzbtyVar);
        this.zza = zzbtyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbty zzbtyVar = this.zza;
        com.google.android.libraries.places.internal.zzbua zzbuaVar = zzbtyVar.zzc;
        zzbuaVar.zzy().remove(zzbtyVar.zza);
        if (zzbuaVar.zzE().zzc() == com.google.android.libraries.places.internal.zzbjn.SHUTDOWN && zzbuaVar.zzy().isEmpty()) {
            zzbuaVar.zzi();
        }
    }
}
