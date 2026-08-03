package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimv implements com.google.android.gms.internal.ads.zzimu, com.google.android.gms.internal.ads.zzimo {
    private static final com.google.android.gms.internal.ads.zzimv zza = new com.google.android.gms.internal.ads.zzimv(null);
    private final java.lang.Object zzb;

    private zzimv(java.lang.Object obj) {
        this.zzb = obj;
    }

    public static com.google.android.gms.internal.ads.zzimu zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzinc.zza(obj, "instance cannot be null");
        return new com.google.android.gms.internal.ads.zzimv(obj);
    }

    public static com.google.android.gms.internal.ads.zzimu zzc(java.lang.Object obj) {
        return obj == null ? zza : new com.google.android.gms.internal.ads.zzimv(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final java.lang.Object zzb() {
        return this.zzb;
    }
}
