package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbkj {
    private java.lang.String zza;
    private com.google.android.libraries.places.internal.zzbkk zzb;
    private java.lang.Long zzc;
    private com.google.android.libraries.places.internal.zzbkz zzd;

    public final com.google.android.libraries.places.internal.zzbkj zzb(long j) {
        this.zzc = java.lang.Long.valueOf(j);
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbkl zze() {
        com.google.common.base.Preconditions.checkNotNull(this.zza, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
        com.google.common.base.Preconditions.checkNotNull(this.zzb, "severity");
        com.google.common.base.Preconditions.checkNotNull(this.zzc, "timestampNanos");
        com.google.common.base.Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
        return new com.google.android.libraries.places.internal.zzbkl(this.zza, this.zzb, this.zzc.longValue(), null, this.zzd, null);
    }

    public final com.google.android.libraries.places.internal.zzbkj zzd(com.google.android.libraries.places.internal.zzbkz zzbkzVar) {
        this.zzd = zzbkzVar;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbkj zzc(com.google.android.libraries.places.internal.zzbkk zzbkkVar) {
        this.zzb = zzbkkVar;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbkj zza(java.lang.String str) {
        this.zza = str;
        return this;
    }
}
