package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class zzcqy implements zzgay {
    final /* synthetic */ zzcra zza;

    public zzcqy(zzcra zzcraVar) {
        this.zza = zzcraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzczx zzczxVar;
        zzczxVar = this.zza.zzf;
        zzczxVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzczx zzczxVar;
        zzczxVar = this.zza.zzf;
        zzczxVar.zzn(true);
    }
}
