package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
final class zzbap extends PushbackInputStream {
    final /* synthetic */ zzbaq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbap(zzbaq zzbaqVar, InputStream inputStream, int i7) {
        super(inputStream, 1);
        this.zza = zzbaqVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zzbas.zze(this.zza.zzc);
        super.close();
    }
}
