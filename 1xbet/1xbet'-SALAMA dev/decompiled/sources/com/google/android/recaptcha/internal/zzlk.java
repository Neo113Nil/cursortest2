package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzlk {
    public static final List zza(Object obj, long j) {
        zzkz zzkzVar = (zzkz) zzni.zzf(obj, j);
        if (zzkzVar.zzc()) {
            return zzkzVar;
        }
        int size = zzkzVar.size();
        zzkz zzkzVarZzd = zzkzVar.zzd(size == 0 ? 10 : size + size);
        zzni.zzs(obj, j, zzkzVarZzd);
        return zzkzVarZzd;
    }
}
