package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbmw {
    private final com.google.android.libraries.places.internal.zzbnr zza;
    private final com.google.android.libraries.places.internal.zzbio zzb;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbms zzc;

    zzbmw(com.google.android.libraries.places.internal.zzbnr zzbnrVar, com.google.android.libraries.places.internal.zzbio zzbioVar, com.google.android.libraries.places.internal.zzbms zzbmsVar) {
        this.zza = zzbnrVar;
        this.zzb = (com.google.android.libraries.places.internal.zzbio) com.google.common.base.Preconditions.checkNotNull(zzbioVar, com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        this.zzc = zzbmsVar;
    }

    public static com.google.android.libraries.places.internal.zzbmv zza() {
        return new com.google.android.libraries.places.internal.zzbmv();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbmw)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbmw zzbmwVar = (com.google.android.libraries.places.internal.zzbmw) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbmwVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbmwVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbmwVar.zzc);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    public final java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper stringHelper = com.google.common.base.MoreObjects.toStringHelper(this);
        stringHelper.add("addressesOrError", this.zza.toString());
        stringHelper.add(com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, this.zzb);
        stringHelper.add("serviceConfigOrError", this.zzc);
        return stringHelper.toString();
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbms zzd() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbio zzc() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbnr zzb() {
        return this.zza;
    }
}
