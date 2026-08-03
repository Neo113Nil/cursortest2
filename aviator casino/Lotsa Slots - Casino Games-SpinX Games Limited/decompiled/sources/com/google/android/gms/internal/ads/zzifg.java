package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzifg {
    private static final com.google.android.gms.internal.ads.zzifn zzb = new com.google.android.gms.internal.ads.zzife();
    private final com.google.android.gms.internal.ads.zzifn zza;

    public zzifg() {
        com.google.android.gms.internal.ads.zzifn zzifnVar = zzb;
        int i = com.google.android.gms.internal.ads.zzicn.zza;
        this.zza = new com.google.android.gms.internal.ads.zziff(com.google.android.gms.internal.ads.zzidx.zza(), zzifnVar);
    }

    public final com.google.android.gms.internal.ads.zzigh zza(java.lang.Class cls) {
        int i = com.google.android.gms.internal.ads.zzigi.zza;
        if (!com.google.android.gms.internal.ads.zziee.class.isAssignableFrom(cls)) {
            int i2 = com.google.android.gms.internal.ads.zzicn.zza;
        }
        com.google.android.gms.internal.ads.zzifm zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = com.google.android.gms.internal.ads.zzicn.zza;
            return com.google.android.gms.internal.ads.zzift.zzh(com.google.android.gms.internal.ads.zzigi.zzF(), com.google.android.gms.internal.ads.zzidr.zza(), zzc.zzb());
        }
        int i4 = com.google.android.gms.internal.ads.zzicn.zza;
        return com.google.android.gms.internal.ads.zzifs.zzm(cls, zzc, com.google.android.gms.internal.ads.zzifw.zza(), com.google.android.gms.internal.ads.zzifc.zza(), com.google.android.gms.internal.ads.zzigi.zzF(), zzc.zzc() + (-1) != 1 ? com.google.android.gms.internal.ads.zzidr.zza() : null, com.google.android.gms.internal.ads.zzifl.zza());
    }
}
