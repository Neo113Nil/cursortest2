package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzr {
    private final java.lang.String zza;
    private final java.util.Map zzb;

    public zzbzr(java.lang.String str, java.util.Map map) {
        this.zza = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_POLICY_NAME);
        this.zzb = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map, "rawConfigValue");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbzr)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbzr zzbzrVar = (com.google.android.libraries.places.internal.zzbzr) obj;
        return this.zza.equals(zzbzrVar.zza) && this.zzb.equals(zzbzrVar.zzb);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_POLICY_NAME, this.zza).add("rawConfigValue", this.zzb).toString();
    }

    public final java.util.Map zzb() {
        return this.zzb;
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
