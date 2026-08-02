package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class zzcqz implements zzgay {
    final /* synthetic */ zzcra zza;

    public zzcqz(zzcra zzcraVar) {
        this.zza = zzcraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzczx zzczxVar;
        zzczxVar = this.zza.zzf;
        zzczxVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzczx zzczxVar;
        zzczxVar = this.zza.zzf;
        zzczxVar.zzl(true);
    }
}
