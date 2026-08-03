package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzl {
    private final com.google.android.gms.ads.query.QueryInfo zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final int zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzl(com.google.android.gms.ads.query.QueryInfo queryInfo, java.lang.String str, long j, int i) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j;
        this.zzd = i;
    }

    public final com.google.android.gms.ads.query.QueryInfo zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzc <= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    }

    public final int zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zze.get();
    }

    public final void zzf() {
        this.zze.set(true);
    }
}
