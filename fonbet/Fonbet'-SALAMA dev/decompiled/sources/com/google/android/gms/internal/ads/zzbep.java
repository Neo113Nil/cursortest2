package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbep {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzben zza() {
        return (zzben) zza.get();
    }

    public static zzbeo zzb() {
        return (zzbeo) zzb.get();
    }

    public static void zzc(zzben zzbenVar) {
        zza.set(zzbenVar);
    }
}
