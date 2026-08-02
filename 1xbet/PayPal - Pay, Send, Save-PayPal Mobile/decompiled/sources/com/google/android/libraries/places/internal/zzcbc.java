package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbc implements com.google.android.libraries.places.internal.zzbpq {
    final java.util.concurrent.Executor zza;
    final java.util.concurrent.ScheduledExecutorService zzb;
    final com.google.android.libraries.places.internal.zzcaj zzc;

    @javax.annotation.Nullable
    final javax.net.ssl.SSLSocketFactory zzd;
    final com.google.android.libraries.places.internal.zzcch zze;
    private final com.google.android.libraries.places.internal.zzbwo zzf;
    private final com.google.android.libraries.places.internal.zzbwo zzg;
    private final com.google.android.libraries.places.internal.zzboo zzh = new com.google.android.libraries.places.internal.zzboo("keepalive time nanos", Long.MAX_VALUE);
    private boolean zzi;

    /* synthetic */ zzcbc(com.google.android.libraries.places.internal.zzbwo zzbwoVar, com.google.android.libraries.places.internal.zzbwo zzbwoVar2, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, com.google.android.libraries.places.internal.zzcch zzcchVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, com.google.android.libraries.places.internal.zzcaj zzcajVar, boolean z3, com.google.android.libraries.places.internal.zzbiu zzbiuVar, byte[] bArr) {
        this.zzf = zzbwoVar;
        this.zza = (java.util.concurrent.Executor) zzbwoVar.zza();
        this.zzg = zzbwoVar2;
        this.zzb = (java.util.concurrent.ScheduledExecutorService) zzbwoVar2.zza();
        this.zzd = sSLSocketFactory;
        this.zze = zzcchVar;
        this.zzc = (com.google.android.libraries.places.internal.zzcaj) com.google.common.base.Preconditions.checkNotNull(zzcajVar, "transportTracerFactory");
    }

    @Override // com.google.android.libraries.places.internal.zzbpq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzi) {
            return;
        }
        this.zzi = true;
        this.zzf.zzb(this.zza);
        this.zzg.zzb(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbpq
    public final com.google.android.libraries.places.internal.zzbqa zza(java.net.SocketAddress socketAddress, com.google.android.libraries.places.internal.zzbpp zzbppVar, com.google.android.libraries.places.internal.zzbiv zzbivVar) {
        if (this.zzi) {
            throw new java.lang.IllegalStateException("The transport factory is closed.");
        }
        return new com.google.android.libraries.places.internal.zzcbp(this, (java.net.InetSocketAddress) socketAddress, zzbppVar.zza(), zzbppVar.zze(), zzbppVar.zzc(), zzbppVar.zzg(), new com.google.android.libraries.places.internal.zzcbb(this, this.zzh.zza()), null);
    }

    @Override // com.google.android.libraries.places.internal.zzbpq
    public final java.util.concurrent.ScheduledExecutorService zzb() {
        return this.zzb;
    }
}
