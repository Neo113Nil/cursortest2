package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhce {
    private final com.google.android.gms.internal.ads.zzgui zza = new com.google.android.gms.internal.ads.zzgui();
    private final java.lang.String zzb;
    private volatile java.util.logging.Logger zzc;

    zzhce(java.lang.Class cls) {
        this.zzb = cls.getName();
    }

    final java.util.logging.Logger zza() {
        java.util.logging.Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            java.util.logging.Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
