package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzfm implements java.io.Closeable {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.fido.zzfl();
    private int zzb = 0;

    public static int zza() {
        return ((com.google.android.gms.internal.fido.zzfm) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new java.lang.AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }
}
