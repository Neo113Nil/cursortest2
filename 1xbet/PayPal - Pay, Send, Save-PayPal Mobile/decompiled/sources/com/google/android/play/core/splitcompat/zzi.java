package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzi implements com.google.android.play.core.splitcompat.zzk {
    final /* synthetic */ java.util.Set zza;
    final /* synthetic */ com.google.android.play.core.splitcompat.zzt zzb;
    final /* synthetic */ com.google.android.play.core.splitcompat.zzn zzc;

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(java.util.zip.ZipFile zipFile, java.util.Set set) throws java.io.IOException {
        this.zza.addAll(com.google.android.play.core.splitcompat.zzn.zza(this.zzc, set, this.zzb, zipFile));
    }

    zzi(com.google.android.play.core.splitcompat.zzn zznVar, java.util.Set set, com.google.android.play.core.splitcompat.zzt zztVar) {
        this.zzc = zznVar;
        this.zza = set;
        this.zzb = zztVar;
    }
}
