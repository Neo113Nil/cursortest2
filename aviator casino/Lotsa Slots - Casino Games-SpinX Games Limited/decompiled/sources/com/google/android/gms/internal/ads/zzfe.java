package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfe implements com.google.android.gms.internal.ads.zzdo {
    protected zzfe() {
    }

    @Override // com.google.android.gms.internal.ads.zzdo
    public final long zza() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdo
    public final long zzb() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdo
    public final long zzc() {
        return java.lang.System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzdo
    public final com.google.android.gms.internal.ads.zzdz zzd(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new com.google.android.gms.internal.ads.zzfg(new android.os.Handler(looper, callback));
    }
}
