package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbhg extends java.io.PushbackInputStream {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbhj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbhg(com.google.android.gms.internal.ads.zzbhj zzbhjVar, java.io.InputStream inputStream, int i) {
        super(inputStream, 1);
        java.util.Objects.requireNonNull(zzbhjVar);
        this.zza = zzbhjVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
