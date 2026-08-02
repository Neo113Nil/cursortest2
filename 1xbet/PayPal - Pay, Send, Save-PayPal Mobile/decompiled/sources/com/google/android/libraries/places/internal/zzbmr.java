package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbmr {
    private final int zza;
    private final com.google.android.libraries.places.internal.zzbnh zzb;
    private final com.google.android.libraries.places.internal.zzbnx zzc;
    private final com.google.android.libraries.places.internal.zzbmx zzd;

    @javax.annotation.Nullable
    private final java.util.concurrent.ScheduledExecutorService zze;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbiv zzf;

    @javax.annotation.Nullable
    private final java.util.concurrent.Executor zzg;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbmo zzh;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbnc zzi;

    /* synthetic */ zzbmr(com.google.android.libraries.places.internal.zzbmq zzbmqVar, byte[] bArr) {
        this.zza = ((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(zzbmqVar.zzk(), "defaultPort not set")).intValue();
        this.zzb = (com.google.android.libraries.places.internal.zzbnh) com.google.common.base.Preconditions.checkNotNull(zzbmqVar.zzl(), "proxyDetector not set");
        this.zzc = (com.google.android.libraries.places.internal.zzbnx) com.google.common.base.Preconditions.checkNotNull(zzbmqVar.zzm(), "syncContext not set");
        this.zzd = (com.google.android.libraries.places.internal.zzbmx) com.google.common.base.Preconditions.checkNotNull(zzbmqVar.zzn(), "serviceConfigParser not set");
        this.zze = zzbmqVar.zzo();
        this.zzf = zzbmqVar.zzp();
        this.zzg = zzbmqVar.zzq();
        this.zzh = zzbmqVar.zzr();
        this.zzi = zzbmqVar.zzs();
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("defaultPort", this.zza).add("proxyDetector", this.zzb).add("syncContext", this.zzc).add("serviceConfigParser", this.zzd).add("customArgs", (java.lang.Object) null).add("scheduledExecutorService", this.zze).add("channelLogger", this.zzf).add("executor", this.zzg).add("overrideAuthority", (java.lang.Object) null).add("metricRecorder", this.zzh).add("nameResolverRegistry", this.zzi).toString();
    }

    public final java.util.concurrent.ScheduledExecutorService zzd() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.zze;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new java.lang.IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @javax.annotation.Nullable
    public final java.util.concurrent.Executor zzf() {
        return this.zzg;
    }

    public final com.google.android.libraries.places.internal.zzbmx zze() {
        return this.zzd;
    }

    public final com.google.android.libraries.places.internal.zzbnx zzc() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbnh zzb() {
        return this.zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public static com.google.android.libraries.places.internal.zzbmq zzg() {
        return new com.google.android.libraries.places.internal.zzbmq();
    }
}
