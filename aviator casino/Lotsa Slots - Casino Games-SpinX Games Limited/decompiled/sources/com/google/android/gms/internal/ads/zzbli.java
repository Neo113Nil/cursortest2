package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbli {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();

    static {
        new java.util.concurrent.atomic.AtomicBoolean();
    }

    static com.google.android.gms.internal.ads.zzblg zza() {
        return (com.google.android.gms.internal.ads.zzblg) zza.get();
    }

    static com.google.android.gms.internal.ads.zzblh zzb() {
        return (com.google.android.gms.internal.ads.zzblh) zzb.get();
    }

    public static void zzc(com.google.android.gms.internal.ads.zzblg zzblgVar) {
        zza.set(zzblgVar);
    }
}
