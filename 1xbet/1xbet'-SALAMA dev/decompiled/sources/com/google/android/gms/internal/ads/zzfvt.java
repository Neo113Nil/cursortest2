package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class zzfvt extends zzfvw {
    public zzfvt() {
        super(null);
    }

    public static final zzfvw zzf(int i7) {
        if (i7 < 0) {
            return zzfvw.zzb;
        }
        return i7 > 0 ? zzfvw.zzc : zzfvw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final zzfvw zzb(int i7, int i8) {
        return zzf(Integer.compare(i7, i8));
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final zzfvw zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final zzfvw zzd(boolean z4, boolean z7) {
        return zzf(Boolean.compare(z4, z7));
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final zzfvw zze(boolean z4, boolean z7) {
        return zzf(Boolean.compare(z7, z4));
    }
}
