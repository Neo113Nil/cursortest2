package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdn {
    public static final zzoy zza(zzbt zzbtVar, zzbt zzbtVar2) {
        zzox zzf = zzoy.zzf();
        zzf.zzp(zznr.zzb(zzbtVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzf.zzq(zznp.zza(zzbtVar.zza(timeUnit)));
        zzf.zzd(zznr.zzb(zzbtVar2.zzb()));
        zzf.zze(zznp.zza(zzbtVar2.zza(timeUnit)));
        return (zzoy) zzf.zzj();
    }
}
