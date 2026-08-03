package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzieb implements com.google.android.gms.internal.ads.zzids {
    final int zza;
    final com.google.android.gms.internal.ads.zzihg zzb;
    final boolean zzc;
    final boolean zzd;

    zzieb(com.google.android.gms.internal.ads.zziej zziejVar, int i, com.google.android.gms.internal.ads.zzihg zzihgVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzihgVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.zza - ((com.google.android.gms.internal.ads.zzieb) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final com.google.android.gms.internal.ads.zzihg zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final com.google.android.gms.internal.ads.zzihh zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzids
    public final boolean zze() {
        return this.zzd;
    }
}
