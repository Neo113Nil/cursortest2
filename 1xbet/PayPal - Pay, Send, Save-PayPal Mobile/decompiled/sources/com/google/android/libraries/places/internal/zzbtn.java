package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zza;

    zzbtn(com.google.android.libraries.places.internal.zzbua zzbuaVar) {
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zza = zzbuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zza;
        zzbuaVar.zzo().zza(2, "Terminated");
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = ((com.google.android.libraries.places.internal.zzbvn) zzbuaVar.zzl()).zzb.zzj;
        zzbvrVar.zzH().remove(zzbuaVar);
        zzbvrVar.zzX().zze(zzbuaVar);
        zzbvrVar.zzq();
    }
}
