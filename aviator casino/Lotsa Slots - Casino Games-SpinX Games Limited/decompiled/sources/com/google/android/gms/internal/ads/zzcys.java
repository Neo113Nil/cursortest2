package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcys implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcyx zza;

    zzcys(com.google.android.gms.internal.ads.zzcyx zzcyxVar) {
        java.util.Objects.requireNonNull(zzcyxVar);
        this.zza = zzcyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        this.zza.zzk().zzm(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        this.zza.zzk().zzm(true);
    }
}
