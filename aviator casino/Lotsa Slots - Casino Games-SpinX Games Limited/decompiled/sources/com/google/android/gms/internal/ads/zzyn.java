package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyn implements com.google.android.gms.internal.ads.zzzc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzyq zza;
    private final int zzb;

    public zzyn(com.google.android.gms.internal.ads.zzyq zzyqVar, int i) {
        java.util.Objects.requireNonNull(zzyqVar);
        this.zza = zzyqVar;
        this.zzb = i;
    }

    final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() throws java.io.IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, int i) {
        return this.zza.zzs(this.zzb, zzlwVar, zzivVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j) {
        return this.zza.zzt(this.zzb, j);
    }
}
