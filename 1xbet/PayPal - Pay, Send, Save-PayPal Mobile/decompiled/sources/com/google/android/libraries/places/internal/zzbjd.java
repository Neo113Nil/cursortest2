package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjd {
    private final com.google.android.libraries.places.internal.zzbis zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzbjd(com.google.android.libraries.places.internal.zzbis zzbisVar, int i, boolean z, boolean z2) {
        this.zza = (com.google.android.libraries.places.internal.zzbis) com.google.common.base.Preconditions.checkNotNull(zzbisVar, "callOptions");
        this.zzb = i;
        this.zzc = z;
        this.zzd = z2;
    }

    public static com.google.android.libraries.places.internal.zzbjc zza() {
        return new com.google.android.libraries.places.internal.zzbjc();
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("callOptions", this.zza).add("previousAttempts", this.zzb).add("isTransparentRetry", this.zzc).add("isHedging", this.zzd).toString();
    }
}
