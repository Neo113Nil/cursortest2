package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbis {
    public static java.lang.Object zza(com.google.android.gms.internal.ads.zzgub zzgubVar) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        try {
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzgubVar.zza();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
