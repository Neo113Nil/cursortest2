package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaoz {
    public final java.lang.String zza;
    public final int zzb;
    public final java.lang.String zzc;
    public final java.util.Set zzd;

    private zzaoz(java.lang.String str, int i, java.lang.String str2, java.util.Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static com.google.android.gms.internal.ads.zzaoz zza(java.lang.String str, int i) {
        java.lang.String str2;
        java.lang.String trim = str.trim();
        com.google.android.gms.internal.ads.zzgtj.zza(!trim.isEmpty());
        int indexOf = trim.indexOf(io.ktor.sse.ServerSentEventKt.SPACE);
        if (indexOf == -1) {
            str2 = "";
        } else {
            java.lang.String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String[] split = trim.split("\\.", -1);
        java.lang.String str4 = split[0];
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = 1; i2 < split.length; i2++) {
            hashSet.add(split[i2]);
        }
        return new com.google.android.gms.internal.ads.zzaoz(str4, i, str2, hashSet);
    }

    public static com.google.android.gms.internal.ads.zzaoz zzb() {
        return new com.google.android.gms.internal.ads.zzaoz("", 0, "", java.util.Collections.emptySet());
    }
}
