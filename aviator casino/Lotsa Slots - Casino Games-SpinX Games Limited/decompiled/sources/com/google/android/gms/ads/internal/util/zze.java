package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static final /* synthetic */ int zza = 0;

    public static void zza(java.lang.String str) {
        if (zzc()) {
            if (str == null || str.length() <= 4000) {
                android.util.Log.v("Ads", str);
                return;
            }
            boolean z = true;
            for (java.lang.String str2 : zzb.zzd(str)) {
                if (z) {
                    android.util.Log.v("Ads", str2);
                } else {
                    android.util.Log.v("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzb(java.lang.String str, java.lang.Throwable th) {
        if (zzc()) {
            android.util.Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzm(2) && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbks.zza.zze()).booleanValue();
    }
}
