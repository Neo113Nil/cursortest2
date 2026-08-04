package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzgye {
    public static final List zza(Object obj, long j) {
        zzgxs zzgxsVar = (zzgxs) zzhad.zzh(obj, j);
        if (zzgxsVar.zzc()) {
            return zzgxsVar;
        }
        int size = zzgxsVar.size();
        zzgxs zzgxsVarZzf = zzgxsVar.zzf(size == 0 ? 10 : size + size);
        zzhad.zzv(obj, j, zzgxsVarZzf);
        return zzgxsVarZzf;
    }
}
