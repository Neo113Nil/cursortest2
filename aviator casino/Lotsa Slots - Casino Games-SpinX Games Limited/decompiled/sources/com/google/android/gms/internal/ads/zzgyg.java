package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgyg implements java.util.Comparator {
    protected zzgyg() {
    }

    public static com.google.android.gms.internal.ads.zzgyg zzb() {
        return com.google.android.gms.internal.ads.zzgye.zza;
    }

    public static com.google.android.gms.internal.ads.zzgyg zzc(java.util.Comparator comparator) {
        return new com.google.android.gms.internal.ads.zzgvv(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(java.lang.Object obj, java.lang.Object obj2);

    public com.google.android.gms.internal.ads.zzgyg zza() {
        return new com.google.android.gms.internal.ads.zzgyp(this);
    }

    public final com.google.android.gms.internal.ads.zzgyg zzd(com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        return new com.google.android.gms.internal.ads.zzgvh(zzgtaVar, this);
    }
}
