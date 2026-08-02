package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbkh {
    private java.net.SocketAddress zza;
    private java.net.InetSocketAddress zzb;

    @javax.annotation.Nullable
    private java.lang.String zzc;

    @javax.annotation.Nullable
    private java.lang.String zzd;

    public final com.google.android.libraries.places.internal.zzbkh zza(java.net.SocketAddress socketAddress) {
        this.zza = (java.net.SocketAddress) com.google.common.base.Preconditions.checkNotNull(socketAddress, "proxyAddress");
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbkh zzb(java.net.InetSocketAddress inetSocketAddress) {
        this.zzb = (java.net.InetSocketAddress) com.google.common.base.Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbki zze() {
        return new com.google.android.libraries.places.internal.zzbki(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public final com.google.android.libraries.places.internal.zzbkh zzd(@javax.annotation.Nullable java.lang.String str) {
        this.zzd = str;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbkh zzc(@javax.annotation.Nullable java.lang.String str) {
        this.zzc = str;
        return this;
    }

    /* synthetic */ zzbkh(byte[] bArr) {
    }

    private zzbkh() {
        throw null;
    }
}
