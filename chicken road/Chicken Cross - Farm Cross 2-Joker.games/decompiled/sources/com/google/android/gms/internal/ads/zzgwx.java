package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgwx extends zzgwz {
    zzgwx() {
        super(null);
    }

    static final zzgwz zzf(int i) {
        zzgwz zzgwzVar;
        zzgwz zzgwzVar2;
        zzgwz zzgwzVar3;
        if (i < 0) {
            zzgwzVar3 = zzgwz.zzb;
            return zzgwzVar3;
        }
        if (i > 0) {
            zzgwzVar2 = zzgwz.zzc;
            return zzgwzVar2;
        }
        zzgwzVar = zzgwz.zza;
        return zzgwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final int zze() {
        return 0;
    }
}
