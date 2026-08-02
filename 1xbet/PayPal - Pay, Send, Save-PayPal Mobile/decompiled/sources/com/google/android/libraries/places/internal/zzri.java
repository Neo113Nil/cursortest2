package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzri {
    private static final com.google.android.libraries.places.internal.zzri zza;
    private final java.util.UUID zzb;
    private final java.util.concurrent.atomic.AtomicLong zzc;

    static {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            zza = new com.google.android.libraries.places.internal.zzri(java.util.UUID.randomUUID(), new java.security.SecureRandom().nextLong());
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    zzri(java.util.UUID uuid, long j) {
        this.zzb = uuid;
        this.zzc = new java.util.concurrent.atomic.AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long zzb() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.zzc;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final java.util.UUID zzc() {
        long zzb = zzb();
        long zzb2 = zzb();
        java.util.UUID uuid = this.zzb;
        return new java.util.UUID((zzb & (-61441)) ^ uuid.getMostSignificantBits(), (zzb2 >>> 2) ^ uuid.getLeastSignificantBits());
    }

    static com.google.android.libraries.places.internal.zzri zza() {
        return zza;
    }
}
