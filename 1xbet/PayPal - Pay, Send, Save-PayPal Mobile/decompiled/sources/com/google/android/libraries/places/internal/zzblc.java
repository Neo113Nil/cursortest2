package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzblc {
    private final java.lang.String zza;
    private final java.lang.Object zzb;

    public static com.google.android.libraries.places.internal.zzblc zza(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull("internal:health-check-consumer-listener", "debugString");
        return new com.google.android.libraries.places.internal.zzblc("internal:health-check-consumer-listener", null);
    }

    public static com.google.android.libraries.places.internal.zzblc zzb(java.lang.String str, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull("internal:disable-subchannel-reconnect", "debugString");
        return new com.google.android.libraries.places.internal.zzblc("internal:disable-subchannel-reconnect", obj);
    }

    final /* synthetic */ java.lang.Object zzc() {
        return this.zzb;
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    private zzblc(java.lang.String str, java.lang.Object obj) {
        this.zza = str;
        this.zzb = obj;
    }
}
