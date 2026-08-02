package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbki extends com.google.android.libraries.places.internal.zzbng {
    private final java.net.SocketAddress zza;
    private final java.net.InetSocketAddress zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;

    @javax.annotation.Nullable
    private final java.lang.String zzd;

    /* synthetic */ zzbki(java.net.SocketAddress socketAddress, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(socketAddress, "proxyAddress");
        com.google.common.base.Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof java.net.InetSocketAddress) {
            com.google.common.base.Preconditions.checkState(!((java.net.InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.zza = socketAddress;
        this.zzb = inetSocketAddress;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbki)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbki zzbkiVar = (com.google.android.libraries.places.internal.zzbki) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbkiVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbkiVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbkiVar.zzc) && com.google.common.base.Objects.equal(this.zzd, zzbkiVar.zzd);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("proxyAddr", this.zza).add("targetAddr", this.zzb).add(androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, this.zzc).add("hasPassword", this.zzd != null).toString();
    }

    public final java.net.InetSocketAddress zzd() {
        return this.zzb;
    }

    public final java.net.SocketAddress zzc() {
        return this.zza;
    }

    @javax.annotation.Nullable
    public final java.lang.String zzb() {
        return this.zzc;
    }

    @javax.annotation.Nullable
    public final java.lang.String zza() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzbkh zze() {
        return new com.google.android.libraries.places.internal.zzbkh(null);
    }
}
