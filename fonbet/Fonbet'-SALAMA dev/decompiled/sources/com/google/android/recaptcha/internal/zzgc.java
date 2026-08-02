package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class zzgc {
    private static final zzgb zza = new zzgb(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzgb zzb;
    private long zzc;

    public zzgc(long j, long j3, zzgb zzgbVar) {
        this.zzb = zzgbVar;
        this.zzc = Math.abs(j);
    }

    public final long zza() {
        zzgb zzgbVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzgbVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzgbVar.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
