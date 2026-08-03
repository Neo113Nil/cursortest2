package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaak implements java.lang.Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaak(com.google.android.gms.internal.ads.zzv zzvVar, int i) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = com.google.android.gms.internal.ads.zznc.CC.zzac(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzaak zzaakVar) {
        return com.google.android.gms.internal.ads.zzgvz.zzg().zzd(this.zzb, zzaakVar.zzb).zzd(this.zza, zzaakVar.zza).zze();
    }
}
