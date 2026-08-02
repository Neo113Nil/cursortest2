package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zza;

    zzbtj(com.google.android.libraries.places.internal.zzbua zzbuaVar) {
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zza = zzbuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zza;
        if (zzbuaVar.zzE().zzc() == com.google.android.libraries.places.internal.zzbjn.IDLE) {
            zzbuaVar.zzo().zza(2, "CONNECTING as requested");
            zzbuaVar.zzh(com.google.android.libraries.places.internal.zzbjn.CONNECTING);
            zzbuaVar.zzf();
        }
    }
}
