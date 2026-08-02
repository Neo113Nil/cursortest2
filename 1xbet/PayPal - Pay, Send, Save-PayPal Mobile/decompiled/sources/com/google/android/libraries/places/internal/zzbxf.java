package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxf extends com.google.android.libraries.places.internal.zzbln {
    private final com.google.android.libraries.places.internal.zzbli zza;

    zzbxf(com.google.android.libraries.places.internal.zzbli zzbliVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbli) com.google.common.base.Preconditions.checkNotNull(zzbliVar, "result");
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper((java.lang.Class<?>) com.google.android.libraries.places.internal.zzbxf.class).add("result", this.zza).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final com.google.android.libraries.places.internal.zzbli zza(com.google.android.libraries.places.internal.zzblj zzbljVar) {
        return this.zza;
    }
}
