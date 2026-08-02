package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzboz implements com.google.android.libraries.places.internal.zzbpq {
    private final com.google.android.libraries.places.internal.zzbpq zza;

    zzboz(com.google.android.libraries.places.internal.zzbpq zzbpqVar, com.google.android.libraries.places.internal.zzbip zzbipVar, java.util.concurrent.Executor executor) {
        this.zza = (com.google.android.libraries.places.internal.zzbpq) com.google.common.base.Preconditions.checkNotNull(zzbpqVar, "delegate");
    }

    @Override // com.google.android.libraries.places.internal.zzbpq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbpq
    public final com.google.android.libraries.places.internal.zzbqa zza(java.net.SocketAddress socketAddress, com.google.android.libraries.places.internal.zzbpp zzbppVar, com.google.android.libraries.places.internal.zzbiv zzbivVar) {
        return new com.google.android.libraries.places.internal.zzboy(this, this.zza.zza(socketAddress, zzbppVar, zzbivVar), zzbppVar.zza());
    }

    @Override // com.google.android.libraries.places.internal.zzbpq
    public final java.util.concurrent.ScheduledExecutorService zzb() {
        return this.zza.zzb();
    }
}
