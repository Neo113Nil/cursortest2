package com.google.android.gms.net;

/* loaded from: classes4.dex */
final class zzd implements java.lang.AutoCloseable {
    private final int zzc;
    private final android.content.Context zzd;
    private final float zze;
    private int zzf = 13;
    private final long zza = java.lang.System.currentTimeMillis();
    private final long zzb = android.os.SystemClock.uptimeMillis();

    public zzd(android.content.Context context, int i, float f) {
        this.zzc = i;
        this.zzd = context;
        this.zze = f;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        com.google.android.gms.net.zzc zza = com.google.android.gms.net.zzc.zza(this.zzd);
        int i = this.zzf;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j = this.zzb;
        if (java.util.concurrent.ThreadLocalRandom.current().nextFloat() < this.zze) {
            int i2 = (int) (uptimeMillis - j);
            zza.zzb(this.zzc, i, this.zza, currentTimeMillis, i2);
        }
    }

    public final void zza() {
        this.zzf = 0;
    }
}
