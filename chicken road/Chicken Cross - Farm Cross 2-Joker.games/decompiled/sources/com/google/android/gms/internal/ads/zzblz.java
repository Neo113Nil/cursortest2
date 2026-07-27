package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzblz {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static zzblx zza() {
        return (zzblx) zza.get();
    }

    static zzbly zzb() {
        return (zzbly) zzb.get();
    }

    public static void zzc(zzblx zzblxVar) {
        zza.set(zzblxVar);
    }
}
