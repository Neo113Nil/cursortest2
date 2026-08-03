package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzimm {
    public static com.google.android.gms.internal.ads.zzimm zzb(java.lang.Class cls) {
        return java.lang.System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new com.google.android.gms.internal.ads.zzimh(cls.getSimpleName()) : new com.google.android.gms.internal.ads.zzimj(cls.getSimpleName());
    }

    public abstract void zza(java.lang.String str);
}
