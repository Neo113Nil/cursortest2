package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqf {
    public static final com.google.android.gms.internal.ads.zzqf zza;
    public final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzqe zzc;

    static {
        new com.google.android.gms.internal.ads.zzqf("");
        zza = new com.google.android.gms.internal.ads.zzqf("preload");
    }

    public zzqf(java.lang.String str) {
        this.zzb = str;
        this.zzc = android.os.Build.VERSION.SDK_INT >= 31 ? new com.google.android.gms.internal.ads.zzqe() : null;
    }

    public final synchronized android.media.metrics.LogSessionId zza() {
        com.google.android.gms.internal.ads.zzqe zzqeVar;
        zzqeVar = this.zzc;
        zzqeVar.getClass();
        com.google.android.gms.internal.ads.zzqe zzqeVar2 = zzqeVar;
        return zzqeVar.zza;
    }

    public final synchronized void zzb(android.media.metrics.LogSessionId logSessionId) {
        com.google.android.gms.internal.ads.zzqe zzqeVar = this.zzc;
        zzqeVar.getClass();
        com.google.android.gms.internal.ads.zzqe zzqeVar2 = zzqeVar;
        com.google.android.gms.internal.ads.zzgtj.zzi(zzqeVar.zza.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE));
        zzqeVar.zza = logSessionId;
    }
}
