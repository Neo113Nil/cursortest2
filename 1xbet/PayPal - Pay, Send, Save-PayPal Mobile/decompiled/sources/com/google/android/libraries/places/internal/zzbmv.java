package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbmv {
    private com.google.android.libraries.places.internal.zzbnr zza = com.google.android.libraries.places.internal.zzbnr.zza(java.util.Collections.emptyList());
    private final com.google.android.libraries.places.internal.zzbio zzb = com.google.android.libraries.places.internal.zzbio.zza;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbms zzc;

    zzbmv() {
    }

    public final com.google.android.libraries.places.internal.zzbmv zza(com.google.android.libraries.places.internal.zzbnr zzbnrVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbnr) com.google.common.base.Preconditions.checkNotNull(zzbnrVar, "StatusOr addresses cannot be null.");
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbmw zzc() {
        return new com.google.android.libraries.places.internal.zzbmw(this.zza, this.zzb, this.zzc);
    }

    public final com.google.android.libraries.places.internal.zzbmv zzb(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzbms zzbmsVar) {
        this.zzc = zzbmsVar;
        return this;
    }
}
