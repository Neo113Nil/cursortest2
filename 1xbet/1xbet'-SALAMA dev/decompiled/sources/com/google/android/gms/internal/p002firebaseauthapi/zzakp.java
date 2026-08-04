package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzakp implements zzakm {
    private static <E> zzakc<E> zzc(Object obj, long j) {
        return (zzakc) zzamp.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final <L> List<L> zza(Object obj, long j) {
        zzakc zzakcVarZzc = zzc(obj, j);
        if (zzakcVarZzc.zzc()) {
            return zzakcVarZzc;
        }
        int size = zzakcVarZzc.size();
        zzakc zzakcVarZza = zzakcVarZzc.zza(size == 0 ? 10 : size << 1);
        zzamp.zza(obj, j, zzakcVarZza);
        return zzakcVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzakc zzakcVarZzc = zzc(obj, j);
        zzakc zzakcVarZzc2 = zzc(obj2, j);
        int size = zzakcVarZzc.size();
        int size2 = zzakcVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzakcVarZzc.zzc()) {
                zzakcVarZzc = zzakcVarZzc.zza(size2 + size);
            }
            zzakcVarZzc.addAll(zzakcVarZzc2);
        }
        if (size > 0) {
            zzakcVarZzc2 = zzakcVarZzc;
        }
        zzamp.zza(obj, j, zzakcVarZzc2);
    }
}
