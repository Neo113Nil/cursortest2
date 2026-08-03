package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzal {
    private static final java.util.HashSet zza = new java.util.HashSet();
    private static java.lang.String zzb = "media3.common";

    public static synchronized java.lang.String zza() {
        java.lang.String str;
        synchronized (com.google.android.gms.internal.ads.zzal.class) {
            str = zzb;
        }
        return str;
    }

    public static synchronized void zzb(java.lang.String str) {
        synchronized (com.google.android.gms.internal.ads.zzal.class) {
            if (zza.add(str)) {
                java.lang.String str2 = zzb;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                zzb = sb.toString();
            }
        }
    }
}
