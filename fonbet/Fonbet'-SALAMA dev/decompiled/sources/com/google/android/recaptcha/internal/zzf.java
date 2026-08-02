package com.google.android.recaptcha.internal;

import D6.D0;

/* loaded from: classes.dex */
public final class zzf {
    public static final zzbj zza(Exception exc, zzbj zzbjVar) {
        return exc instanceof D0 ? new zzbj(zzbh.zzb, zzbg.zzb, null) : exc instanceof zzbj ? (zzbj) exc : zzbjVar;
    }
}
