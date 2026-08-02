package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxd implements java.io.Closeable {
    private static final java.lang.ThreadLocal zza = new com.google.android.libraries.places.internal.zzxc();
    private int zzb = 0;

    public static int zza() {
        return zzd().zzb;
    }

    public static com.google.android.libraries.places.internal.zzxd zzc() {
        com.google.android.libraries.places.internal.zzxd zzd = zzd();
        int i = zzd.zzb + 1;
        zzd.zzb = i;
        if (i != 0) {
            return zzd;
        }
        throw new java.lang.AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    private static com.google.android.libraries.places.internal.zzxd zzd() {
        return (com.google.android.libraries.places.internal.zzxd) zza.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new java.lang.AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }

    public final int zzb() {
        return this.zzb;
    }
}
