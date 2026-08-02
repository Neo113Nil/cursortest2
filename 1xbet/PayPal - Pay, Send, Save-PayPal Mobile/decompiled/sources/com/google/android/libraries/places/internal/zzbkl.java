package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbkl {
    public final java.lang.String zza;
    public final com.google.android.libraries.places.internal.zzbkk zzb;
    public final long zzc;

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbkz zzd = null;

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbkz zze;

    /* synthetic */ zzbkl(java.lang.String str, com.google.android.libraries.places.internal.zzbkk zzbkkVar, long j, com.google.android.libraries.places.internal.zzbkz zzbkzVar, com.google.android.libraries.places.internal.zzbkz zzbkzVar2, byte[] bArr) {
        this.zza = str;
        this.zzb = (com.google.android.libraries.places.internal.zzbkk) com.google.common.base.Preconditions.checkNotNull(zzbkkVar, "severity");
        this.zzc = j;
        this.zze = zzbkzVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbkl)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbkl zzbklVar = (com.google.android.libraries.places.internal.zzbkl) obj;
        if (!com.google.common.base.Objects.equal(this.zza, zzbklVar.zza) || !com.google.common.base.Objects.equal(this.zzb, zzbklVar.zzb) || this.zzc != zzbklVar.zzc) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbkz zzbkzVar = zzbklVar.zzd;
        return com.google.common.base.Objects.equal(null, null) && com.google.common.base.Objects.equal(this.zze, zzbklVar.zze);
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        com.google.android.libraries.places.internal.zzbkk zzbkkVar = this.zzb;
        long j = this.zzc;
        return com.google.common.base.Objects.hashCode(str, zzbkkVar, java.lang.Long.valueOf(j), null, this.zze);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, this.zza).add("severity", this.zzb).add("timestampNanos", this.zzc).add("channelRef", (java.lang.Object) null).add("subchannelRef", this.zze).toString();
    }
}
