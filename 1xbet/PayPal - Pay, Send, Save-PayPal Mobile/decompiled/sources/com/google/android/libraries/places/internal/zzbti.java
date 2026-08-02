package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbti implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zza;

    zzbti(com.google.android.libraries.places.internal.zzbua zzbuaVar) {
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zza = zzbuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zza;
        zzbuaVar.zzt(null);
        zzbuaVar.zzo().zza(2, "CONNECTING after backoff");
        zzbuaVar.zzh(com.google.android.libraries.places.internal.zzbjn.CONNECTING);
        zzbuaVar.zzf();
    }
}
