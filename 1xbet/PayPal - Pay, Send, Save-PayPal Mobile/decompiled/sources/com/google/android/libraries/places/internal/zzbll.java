package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbll {
    private final java.util.List zza;
    private final com.google.android.libraries.places.internal.zzbio zzb;

    @javax.annotation.Nullable
    private final java.lang.Object zzc;

    /* synthetic */ zzbll(java.util.List list, com.google.android.libraries.places.internal.zzbio zzbioVar, java.lang.Object obj, byte[] bArr) {
        this.zza = java.util.Collections.unmodifiableList(new java.util.ArrayList((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(list, "addresses")));
        this.zzb = (com.google.android.libraries.places.internal.zzbio) com.google.common.base.Preconditions.checkNotNull(zzbioVar, com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        this.zzc = obj;
    }

    public static com.google.android.libraries.places.internal.zzblk zza() {
        return new com.google.android.libraries.places.internal.zzblk();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbll)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbll zzbllVar = (com.google.android.libraries.places.internal.zzbll) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbllVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbllVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbllVar.zzc);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("addresses", this.zza).add(com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, this.zzb).add("loadBalancingPolicyConfig", this.zzc).toString();
    }

    public final com.google.android.libraries.places.internal.zzblk zzb() {
        com.google.android.libraries.places.internal.zzblk zzblkVar = new com.google.android.libraries.places.internal.zzblk();
        zzblkVar.zza(this.zza);
        zzblkVar.zzb(this.zzb);
        zzblkVar.zzc(this.zzc);
        return zzblkVar;
    }

    @javax.annotation.Nullable
    public final java.lang.Object zze() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbio zzd() {
        return this.zzb;
    }

    public final java.util.List zzc() {
        return this.zza;
    }
}
