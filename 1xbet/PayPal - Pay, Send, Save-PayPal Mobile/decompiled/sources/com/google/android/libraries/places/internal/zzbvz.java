package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvz {
    static final com.google.android.libraries.places.internal.zzbir zza = com.google.android.libraries.places.internal.zzbir.zza("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final java.lang.Long zzb;
    final java.lang.Boolean zzc;
    final java.lang.Integer zzd;
    final java.lang.Integer zze;
    final com.google.android.libraries.places.internal.zzbzg zzf;
    final com.google.android.libraries.places.internal.zzbta zzg;

    zzbvz(java.util.Map map, boolean z, int i, int i2) {
        com.google.android.libraries.places.internal.zzbzg zzbzgVar;
        com.google.android.libraries.places.internal.zzbta zzbtaVar;
        this.zzb = com.google.android.libraries.places.internal.zzbud.zzh(map, com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        this.zzc = com.google.android.libraries.places.internal.zzbud.zzi(map, "waitForReady");
        java.lang.Integer zzf = com.google.android.libraries.places.internal.zzbud.zzf(map, "maxResponseMessageBytes");
        this.zzd = zzf;
        if (zzf != null) {
            com.google.common.base.Preconditions.checkArgument(zzf.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", zzf);
        }
        java.lang.Integer zzf2 = com.google.android.libraries.places.internal.zzbud.zzf(map, "maxRequestMessageBytes");
        this.zze = zzf2;
        if (zzf2 != null) {
            com.google.common.base.Preconditions.checkArgument(zzf2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", zzf2);
        }
        java.util.Map zzd = z ? com.google.android.libraries.places.internal.zzbud.zzd(map, "retryPolicy") : null;
        if (zzd == null) {
            zzbzgVar = null;
        } else {
            int intValue = ((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzbud.zzf(zzd, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            com.google.common.base.Preconditions.checkArgument(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = java.lang.Math.min(intValue, 5);
            long longValue = ((java.lang.Long) com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzbud.zzh(zzd, "initialBackoff"), "initialBackoff cannot be empty")).longValue();
            com.google.common.base.Preconditions.checkArgument(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((java.lang.Long) com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzbud.zzh(zzd, "maxBackoff"), "maxBackoff cannot be empty")).longValue();
            com.google.common.base.Preconditions.checkArgument(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((java.lang.Double) com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzbud.zze(zzd, "backoffMultiplier"), "backoffMultiplier cannot be empty")).doubleValue();
            com.google.common.base.Preconditions.checkArgument(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", java.lang.Double.valueOf(doubleValue));
            java.lang.Long zzh = com.google.android.libraries.places.internal.zzbud.zzh(zzd, "perAttemptRecvTimeout");
            com.google.common.base.Preconditions.checkArgument(zzh == null || zzh.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", zzh);
            java.util.Set zza2 = com.google.android.libraries.places.internal.zzbzt.zza(zzd);
            com.google.common.base.Preconditions.checkArgument((zzh == null && zza2.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            zzbzgVar = new com.google.android.libraries.places.internal.zzbzg(min, longValue, longValue2, doubleValue, zzh, zza2);
        }
        this.zzf = zzbzgVar;
        java.util.Map zzd2 = z ? com.google.android.libraries.places.internal.zzbud.zzd(map, "hedgingPolicy") : null;
        if (zzd2 == null) {
            zzbtaVar = null;
        } else {
            int intValue2 = ((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzbud.zzf(zzd2, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            com.google.common.base.Preconditions.checkArgument(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = java.lang.Math.min(intValue2, 5);
            long longValue3 = ((java.lang.Long) com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzbud.zzh(zzd2, "hedgingDelay"), "hedgingDelay cannot be empty")).longValue();
            com.google.common.base.Preconditions.checkArgument(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            zzbtaVar = new com.google.android.libraries.places.internal.zzbta(min2, longValue3, com.google.android.libraries.places.internal.zzbzt.zzb(zzd2));
        }
        this.zzg = zzbtaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbvz)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbvz zzbvzVar = (com.google.android.libraries.places.internal.zzbvz) obj;
        return com.google.common.base.Objects.equal(this.zzb, zzbvzVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbvzVar.zzc) && com.google.common.base.Objects.equal(this.zzd, zzbvzVar.zzd) && com.google.common.base.Objects.equal(this.zze, zzbvzVar.zze) && com.google.common.base.Objects.equal(this.zzf, zzbvzVar.zzf) && com.google.common.base.Objects.equal(this.zzg, zzbvzVar.zzg);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("timeoutNanos", this.zzb).add("waitForReady", this.zzc).add("maxInboundMessageSize", this.zzd).add("maxOutboundMessageSize", this.zze).add("retryPolicy", this.zzf).add("hedgingPolicy", this.zzg).toString();
    }
}
