package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzblr extends com.google.android.libraries.places.internal.zzble {
    static {
        com.google.android.libraries.places.internal.zzbms.zza(new com.google.android.libraries.places.internal.zzblq());
    }

    public final boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("policy", zzd()).add("priority", 5).add(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, true).toString();
    }

    public abstract boolean zzb();

    public abstract int zzc();

    public abstract java.lang.String zzd();

    public com.google.android.libraries.places.internal.zzbms zze(java.util.Map map) {
        throw null;
    }
}
