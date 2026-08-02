package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class zzakp implements zzakm {
    private static <E> zzakc<E> zzc(Object obj, long j) {
        return (zzakc) zzamp.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final <L> List<L> zza(Object obj, long j) {
        zzakc zzc = zzc(obj, j);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzakc zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzamp.zza(obj, j, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzakc zzc = zzc(obj, j);
        zzakc zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzamp.zza(obj, j, zzc2);
    }
}
