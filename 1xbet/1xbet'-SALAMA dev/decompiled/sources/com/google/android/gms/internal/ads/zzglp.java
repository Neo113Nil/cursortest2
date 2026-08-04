package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzglp {
    private static final zzglp zza = new zzglp();
    private static final zzgln zzb = new zzgln(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzglp zzb() {
        return zza;
    }

    public final zzgla zza() {
        zzgla zzglaVar = (zzgla) this.zzc.get();
        return zzglaVar == null ? zzb : zzglaVar;
    }
}
