package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaaj extends com.google.android.gms.internal.ads.zzaaq implements java.lang.Comparable {
    private final int zze;
    private final int zzf;

    public zzaaj(int i, com.google.android.gms.internal.ads.zzbg zzbgVar, int i2, com.google.android.gms.internal.ads.zzaam zzaamVar, int i3) {
        super(i, zzbgVar, i2);
        this.zze = com.google.android.gms.internal.ads.zznc.CC.zzac(i3, zzaamVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzaaj zzaajVar) {
        return java.lang.Integer.compare(this.zzf, zzaajVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzaaq zzaaqVar) {
        return false;
    }
}
