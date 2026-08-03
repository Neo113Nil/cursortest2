package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfmc implements com.google.android.gms.internal.ads.zzimu {
    private zzfmc(com.google.android.gms.internal.ads.zzfmb zzfmbVar) {
    }

    public static com.google.android.gms.internal.ads.zzfmc zza(com.google.android.gms.internal.ads.zzfmb zzfmbVar) {
        return new com.google.android.gms.internal.ads.zzfmc(zzfmbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.common.util.Clock defaultClock = com.google.android.gms.common.util.DefaultClock.getInstance();
        com.google.android.gms.internal.ads.zzinc.zzb(defaultClock);
        return defaultClock;
    }
}
