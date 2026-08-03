package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmm {
    private static final com.google.android.gms.internal.ads.zzhmm zza = new com.google.android.gms.internal.ads.zzhmm();
    private static final com.google.android.gms.internal.ads.zzhml zzb = new com.google.android.gms.internal.ads.zzhml(null);
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();

    public static com.google.android.gms.internal.ads.zzhmm zza() {
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzhme zzb() {
        com.google.android.gms.internal.ads.zzhme zzhmeVar = (com.google.android.gms.internal.ads.zzhme) this.zzc.get();
        return zzhmeVar == null ? zzb : zzhmeVar;
    }
}
