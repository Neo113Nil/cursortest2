package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public interface zzbpq extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    com.google.android.libraries.places.internal.zzbqa zza(java.net.SocketAddress socketAddress, com.google.android.libraries.places.internal.zzbpp zzbppVar, com.google.android.libraries.places.internal.zzbiv zzbivVar);

    java.util.concurrent.ScheduledExecutorService zzb();
}
