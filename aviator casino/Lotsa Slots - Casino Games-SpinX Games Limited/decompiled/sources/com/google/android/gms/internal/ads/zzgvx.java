package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvx extends com.google.android.gms.internal.ads.zzgvz {
    zzgvx() {
        super(null);
    }

    static final com.google.android.gms.internal.ads.zzgvz zzf(int i) {
        com.google.android.gms.internal.ads.zzgvz zzgvzVar;
        com.google.android.gms.internal.ads.zzgvz zzgvzVar2;
        com.google.android.gms.internal.ads.zzgvz zzgvzVar3;
        if (i < 0) {
            zzgvzVar3 = com.google.android.gms.internal.ads.zzgvz.zzb;
            return zzgvzVar3;
        }
        if (i > 0) {
            zzgvzVar2 = com.google.android.gms.internal.ads.zzgvz.zzc;
            return zzgvzVar2;
        }
        zzgvzVar = com.google.android.gms.internal.ads.zzgvz.zza;
        return zzgvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final com.google.android.gms.internal.ads.zzgvz zza(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final com.google.android.gms.internal.ads.zzgvz zzb(int i, int i2) {
        return zzf(java.lang.Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final com.google.android.gms.internal.ads.zzgvz zzc(boolean z, boolean z2) {
        return zzf(java.lang.Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final com.google.android.gms.internal.ads.zzgvz zzd(boolean z, boolean z2) {
        return zzf(java.lang.Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final int zze() {
        return 0;
    }
}
