package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgzp implements java.io.Closeable {
    private static final com.google.android.gms.internal.ads.zzgzo zzc = com.google.android.gms.internal.ads.zzgzo.zza;
    private final java.util.Deque zza = new java.util.ArrayDeque(4);
    private java.lang.Throwable zzb;

    zzgzp(com.google.android.gms.internal.ads.zzgzo zzgzoVar) {
    }

    public static com.google.android.gms.internal.ads.zzgzp zza() {
        return new com.google.android.gms.internal.ads.zzgzp(zzc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.lang.Throwable th = this.zzb;
        while (true) {
            java.util.Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            java.io.Closeable closeable = (java.io.Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (java.lang.Throwable unused) {
                        java.util.logging.Logger logger = com.google.android.gms.internal.ads.zzgzn.zza;
                        java.util.logging.Level level = java.util.logging.Level.WARNING;
                        java.lang.String valueOf = java.lang.String.valueOf(closeable);
                        java.lang.String.valueOf(valueOf);
                        logger.logp(level, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(java.lang.String.valueOf(valueOf)), th2);
                    }
                }
            }
        }
        if (this.zzb != null || th == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgug.zza(th, java.io.IOException.class);
        com.google.android.gms.internal.ads.zzgug.zzb(th);
        throw new java.lang.AssertionError(th);
    }

    public final java.io.Closeable zzb(java.io.Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final java.lang.RuntimeException zzc(java.lang.Throwable th) throws java.io.IOException {
        this.zzb = th;
        com.google.android.gms.internal.ads.zzgug.zza(th, java.io.IOException.class);
        com.google.android.gms.internal.ads.zzgug.zzb(th);
        throw new java.lang.RuntimeException(th);
    }
}
