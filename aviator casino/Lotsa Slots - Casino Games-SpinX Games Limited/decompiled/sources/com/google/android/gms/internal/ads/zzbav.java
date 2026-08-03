package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbav {
    private android.net.NetworkCapabilities zza;

    zzbav(android.net.ConnectivityManager connectivityManager) {
        if (connectivityManager == null || android.os.Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzbau(this));
        } catch (java.lang.RuntimeException unused) {
            synchronized (com.google.android.gms.internal.ads.zzbav.class) {
                this.zza = null;
            }
        }
    }

    public static com.google.android.gms.internal.ads.zzbav zza(android.content.Context context) {
        if (context != null) {
            return new com.google.android.gms.internal.ads.zzbav((android.net.ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final android.net.NetworkCapabilities zzb() {
        return this.zza;
    }

    public final long zzc() {
        synchronized (com.google.android.gms.internal.ads.zzbav.class) {
            android.net.NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    final /* synthetic */ void zzd(android.net.NetworkCapabilities networkCapabilities) {
        this.zza = networkCapabilities;
    }
}
