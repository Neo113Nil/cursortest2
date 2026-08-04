package com.google.android.recaptcha.internal;

import D6.D0;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {
    public static final zzbj zza(Exception exc, zzbj zzbjVar) {
        if (exc instanceof D0) {
            return new zzbj(zzbh.zzb, zzbg.zzb, null);
        }
        return exc instanceof zzbj ? (zzbj) exc : zzbjVar;
    }
}
