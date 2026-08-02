package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzg implements com.google.android.play.core.splitcompat.zzl {
    final /* synthetic */ com.google.android.play.core.splitcompat.zzh zza;

    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(com.google.android.play.core.splitcompat.zzm zzmVar, java.io.File file, boolean z) throws java.io.IOException {
        this.zza.zzb.add(file);
        if (z) {
            return;
        }
        this.zza.zzc.set(false);
    }

    zzg(com.google.android.play.core.splitcompat.zzh zzhVar) {
        this.zza = zzhVar;
    }
}
