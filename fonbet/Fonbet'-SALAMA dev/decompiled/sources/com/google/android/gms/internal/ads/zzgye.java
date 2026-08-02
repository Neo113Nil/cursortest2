package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzgye {
    public static final List zza(Object obj, long j) {
        zzgxs zzgxsVar = (zzgxs) zzhad.zzh(obj, j);
        if (zzgxsVar.zzc()) {
            return zzgxsVar;
        }
        int size = zzgxsVar.size();
        zzgxs zzf = zzgxsVar.zzf(size == 0 ? 10 : size + size);
        zzhad.zzv(obj, j, zzf);
        return zzf;
    }
}
