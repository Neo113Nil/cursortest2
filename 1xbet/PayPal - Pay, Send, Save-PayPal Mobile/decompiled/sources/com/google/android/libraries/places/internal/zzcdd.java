package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcdd implements com.google.android.libraries.places.internal.zzcfv {
    int zza;
    byte zzb;
    int zzc;
    int zzd;
    short zze;
    private final com.google.android.libraries.places.internal.zzcfh zzf;

    @Override // com.google.android.libraries.places.internal.zzcfv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // com.google.android.libraries.places.internal.zzcfv
    public final long zza(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) throws java.io.IOException {
        int i;
        java.util.logging.Logger logger;
        int zzm;
        java.io.IOException zzi;
        java.io.IOException zzi2;
        java.util.logging.Logger logger2;
        do {
            int i2 = this.zzd;
            if (i2 == 0) {
                com.google.android.libraries.places.internal.zzcfh zzcfhVar = this.zzf;
                zzcfhVar.zzt(this.zze);
                this.zze = (short) 0;
                if ((this.zzb & 4) == 0) {
                    i = this.zzc;
                    int zzf = com.google.android.libraries.places.internal.zzcdh.zzf(zzcfhVar);
                    this.zzd = zzf;
                    this.zza = zzf;
                    byte zzj = zzcfhVar.zzj();
                    this.zzb = (byte) (zzcfhVar.zzj() & 255);
                    logger = com.google.android.libraries.places.internal.zzcdh.zza;
                    byte b = (byte) (zzj & 255);
                    if (logger.isLoggable(java.util.logging.Level.FINE)) {
                        java.util.logging.Level level = java.util.logging.Level.FINE;
                        java.lang.String zza = com.google.android.libraries.places.internal.zzcde.zza(true, this.zzc, this.zza, b, this.zzb);
                        logger2 = com.google.android.libraries.places.internal.zzcdh.zza;
                        logger2.logp(level, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", zza);
                    }
                    zzm = zzcfhVar.zzm() & Integer.MAX_VALUE;
                    this.zzc = zzm;
                    if (b != 9) {
                        zzi = com.google.android.libraries.places.internal.zzcdh.zzi("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(b));
                        throw zzi;
                    }
                }
            } else {
                long zza2 = this.zzf.zza(zzcffVar, java.lang.Math.min(j, i2));
                if (zza2 != -1) {
                    this.zzd -= (int) zza2;
                    return zza2;
                }
            }
            return -1L;
        } while (zzm == i);
        zzi2 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
        throw zzi2;
    }

    public zzcdd(com.google.android.libraries.places.internal.zzcfh zzcfhVar) {
        this.zzf = zzcfhVar;
    }
}
