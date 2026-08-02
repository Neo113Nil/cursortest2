package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzs {
    final com.google.android.libraries.places.internal.zzblr zza;

    @javax.annotation.Nullable
    final java.lang.Object zzb;

    public zzbzs(com.google.android.libraries.places.internal.zzblr zzblrVar, @javax.annotation.Nullable java.lang.Object obj) {
        this.zza = (com.google.android.libraries.places.internal.zzblr) com.google.common.base.Preconditions.checkNotNull(zzblrVar, "provider");
        this.zzb = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbzs zzbzsVar = (com.google.android.libraries.places.internal.zzbzs) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbzsVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbzsVar.zzb);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("provider", this.zza).add("config", this.zzb).toString();
    }
}
