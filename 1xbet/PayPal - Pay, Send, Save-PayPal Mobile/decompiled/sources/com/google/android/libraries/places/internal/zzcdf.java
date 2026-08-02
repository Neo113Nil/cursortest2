package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcdf implements com.google.android.libraries.places.internal.zzccx {
    final com.google.android.libraries.places.internal.zzcda zza;
    private final com.google.android.libraries.places.internal.zzcfh zzb;
    private final com.google.android.libraries.places.internal.zzcdd zzc;

    zzcdf(com.google.android.libraries.places.internal.zzcfh zzcfhVar, int i, boolean z) {
        this.zzb = zzcfhVar;
        com.google.android.libraries.places.internal.zzcdd zzcddVar = new com.google.android.libraries.places.internal.zzcdd(zzcfhVar);
        this.zzc = zzcddVar;
        this.zza = new com.google.android.libraries.places.internal.zzcda(4096, 4096, zzcddVar);
    }

    private final java.util.List zzb(int i, short s, byte b, int i2) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzcdd zzcddVar = this.zzc;
        zzcddVar.zzd = i;
        zzcddVar.zza = i;
        zzcddVar.zze = s;
        zzcddVar.zzb = b;
        zzcddVar.zzc = i2;
        com.google.android.libraries.places.internal.zzcda zzcdaVar = this.zza;
        zzcdaVar.zzb();
        return zzcdaVar.zzc();
    }

    private final void zzc(com.google.android.libraries.places.internal.zzccw zzccwVar, int i) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzcfh zzcfhVar = this.zzb;
        zzcfhVar.zzm();
        zzcfhVar.zzj();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zzb.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzccx
    public final boolean zza(com.google.android.libraries.places.internal.zzccw zzccwVar) throws java.io.IOException {
        java.io.IOException zzi;
        java.util.logging.Logger logger;
        java.io.IOException zzi2;
        java.io.IOException zzi3;
        java.io.IOException zzi4;
        java.io.IOException zzi5;
        java.io.IOException zzi6;
        java.io.IOException zzi7;
        java.io.IOException zzi8;
        java.io.IOException zzi9;
        java.io.IOException zzi10;
        java.io.IOException zzi11;
        java.io.IOException zzi12;
        java.io.IOException zzi13;
        java.io.IOException zzi14;
        java.io.IOException zzi15;
        java.io.IOException zzi16;
        java.io.IOException zzi17;
        java.io.IOException zzi18;
        java.io.IOException zzi19;
        java.io.IOException zzi20;
        java.io.IOException zzi21;
        java.io.IOException zzi22;
        java.util.logging.Logger logger2;
        try {
            this.zzb.zzg(9L);
            com.google.android.libraries.places.internal.zzcfh zzcfhVar = this.zzb;
            int zzf = com.google.android.libraries.places.internal.zzcdh.zzf(zzcfhVar);
            if (zzf > 16384) {
                zzi = com.google.android.libraries.places.internal.zzcdh.zzi("FRAME_SIZE_ERROR: %s", java.lang.Integer.valueOf(zzf));
                throw zzi;
            }
            byte zzj = (byte) (zzcfhVar.zzj() & 255);
            byte zzj2 = (byte) (zzcfhVar.zzj() & 255);
            int zzm = zzcfhVar.zzm() & Integer.MAX_VALUE;
            logger = com.google.android.libraries.places.internal.zzcdh.zza;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                java.util.logging.Level level = java.util.logging.Level.FINE;
                java.lang.String zza = com.google.android.libraries.places.internal.zzcde.zza(true, zzm, zzf, zzj, zzj2);
                logger2 = com.google.android.libraries.places.internal.zzcdh.zza;
                logger2.logp(level, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", zza);
            }
            switch (zzj) {
                case 0:
                    if ((zzj2 & 32) != 0) {
                        zzi2 = com.google.android.libraries.places.internal.zzcdh.zzi("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new java.lang.Object[0]);
                        throw zzi2;
                    }
                    int zzj3 = (zzj2 & 8) != 0 ? zzcfhVar.zzj() & 255 : 0;
                    zzccwVar.zza(1 == (zzj2 & 1), zzm, zzcfhVar, com.google.android.libraries.places.internal.zzcdh.zze(zzf, zzj2, (short) zzj3), zzf);
                    zzcfhVar.zzt(zzj3);
                    return true;
                case 1:
                    if (zzm == 0) {
                        zzi3 = com.google.android.libraries.places.internal.zzcdh.zzi("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new java.lang.Object[0]);
                        throw zzi3;
                    }
                    int zzj4 = (zzj2 & 8) != 0 ? zzcfhVar.zzj() & 255 : 0;
                    if ((zzj2 & 32) != 0) {
                        zzc(zzccwVar, zzm);
                        zzf -= 5;
                    }
                    short s = (short) zzj4;
                    zzccwVar.zzh(false, 1 == (zzj2 & 1), zzm, -1, zzb(com.google.android.libraries.places.internal.zzcdh.zze(zzf, zzj2, s), s, zzj2, zzm), 4);
                    return true;
                case 2:
                    if (zzf != 5) {
                        zzi4 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_PRIORITY length: %d != 5", java.lang.Integer.valueOf(zzf));
                        throw zzi4;
                    }
                    if (zzm != 0) {
                        zzc(zzccwVar, zzm);
                        return true;
                    }
                    zzi5 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_PRIORITY streamId == 0", new java.lang.Object[0]);
                    throw zzi5;
                case 3:
                    if (zzf != 4) {
                        zzi6 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_RST_STREAM length: %d != 4", java.lang.Integer.valueOf(zzf));
                        throw zzi6;
                    }
                    if (zzm == 0) {
                        zzi7 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_RST_STREAM streamId == 0", new java.lang.Object[0]);
                        throw zzi7;
                    }
                    int zzm2 = zzcfhVar.zzm();
                    com.google.android.libraries.places.internal.zzccv zza2 = com.google.android.libraries.places.internal.zzccv.zza(zzm2);
                    if (zza2 != null) {
                        zzccwVar.zzb(zzm, zza2);
                        return true;
                    }
                    zzi8 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_RST_STREAM unexpected error code: %d", java.lang.Integer.valueOf(zzm2));
                    throw zzi8;
                case 4:
                    if (zzm != 0) {
                        zzi9 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_SETTINGS streamId != 0", new java.lang.Object[0]);
                        throw zzi9;
                    }
                    if ((zzj2 & 1) == 0) {
                        if (zzf % 6 != 0) {
                            zzi10 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_SETTINGS length %% 6 != 0: %s", java.lang.Integer.valueOf(zzf));
                            throw zzi10;
                        }
                        com.google.android.libraries.places.internal.zzcdk zzcdkVar = new com.google.android.libraries.places.internal.zzcdk();
                        for (int i = 0; i < zzf; i += 6) {
                            short zzl = zzcfhVar.zzl();
                            int zzm3 = zzcfhVar.zzm();
                            switch (zzl) {
                                case 1:
                                case 6:
                                    zzcdkVar.zza(zzl, 0, zzm3);
                                case 2:
                                    if (zzm3 != 0 && zzm3 != 1) {
                                        zzi11 = com.google.android.libraries.places.internal.zzcdh.zzi("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new java.lang.Object[0]);
                                        throw zzi11;
                                    }
                                    zzcdkVar.zza(zzl, 0, zzm3);
                                case 3:
                                    zzl = 4;
                                    zzcdkVar.zza(zzl, 0, zzm3);
                                case 4:
                                    if (zzm3 < 0) {
                                        zzi12 = com.google.android.libraries.places.internal.zzcdh.zzi("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new java.lang.Object[0]);
                                        throw zzi12;
                                    }
                                    zzl = 7;
                                    zzcdkVar.zza(zzl, 0, zzm3);
                                case 5:
                                    if (zzm3 < 16384 || zzm3 > 16777215) {
                                        zzi13 = com.google.android.libraries.places.internal.zzcdh.zzi("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(zzm3));
                                        throw zzi13;
                                    }
                                    zzcdkVar.zza(zzl, 0, zzm3);
                                    break;
                                default:
                            }
                        }
                        zzccwVar.zzc(false, zzcdkVar);
                        if (zzcdkVar.zze() >= 0) {
                            this.zza.zza(zzcdkVar.zze());
                        }
                    } else if (zzf != 0) {
                        zzi14 = com.google.android.libraries.places.internal.zzcdh.zzi("FRAME_SIZE_ERROR ack frame should be empty!", new java.lang.Object[0]);
                        throw zzi14;
                    }
                    return true;
                case 5:
                    if (zzm == 0) {
                        zzi15 = com.google.android.libraries.places.internal.zzcdh.zzi("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new java.lang.Object[0]);
                        throw zzi15;
                    }
                    short zzj5 = (short) ((zzj2 & 8) != 0 ? zzcfhVar.zzj() & 255 : 0);
                    zzccwVar.zzf(zzm, zzcfhVar.zzm() & Integer.MAX_VALUE, zzb(com.google.android.libraries.places.internal.zzcdh.zze(zzf - 4, zzj2, zzj5), zzj5, zzj2, zzm));
                    return true;
                case 6:
                    if (zzf != 8) {
                        zzi16 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_PING length != 8: %s", java.lang.Integer.valueOf(zzf));
                        throw zzi16;
                    }
                    if (zzm == 0) {
                        zzccwVar.zzd(1 == (zzj2 & 1), zzcfhVar.zzm(), zzcfhVar.zzm());
                        return true;
                    }
                    zzi17 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_PING streamId != 0", new java.lang.Object[0]);
                    throw zzi17;
                case 7:
                    if (zzf < 8) {
                        zzi18 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_GOAWAY length < 8: %s", java.lang.Integer.valueOf(zzf));
                        throw zzi18;
                    }
                    if (zzm != 0) {
                        zzi19 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_GOAWAY streamId != 0", new java.lang.Object[0]);
                        throw zzi19;
                    }
                    int i2 = zzf - 8;
                    int zzm4 = zzcfhVar.zzm();
                    int zzm5 = zzcfhVar.zzm();
                    com.google.android.libraries.places.internal.zzccv zza3 = com.google.android.libraries.places.internal.zzccv.zza(zzm5);
                    if (zza3 == null) {
                        zzi20 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_GOAWAY unexpected error code: %d", java.lang.Integer.valueOf(zzm5));
                        throw zzi20;
                    }
                    com.google.android.libraries.places.internal.zzcfj zzcfjVar = com.google.android.libraries.places.internal.zzcfj.zza;
                    if (i2 > 0) {
                        zzcfjVar = zzcfhVar.zzn(i2);
                    }
                    zzccwVar.zze(zzm4, zza3, zzcfjVar);
                    return true;
                case 8:
                    if (zzf != 4) {
                        zzi21 = com.google.android.libraries.places.internal.zzcdh.zzi("TYPE_WINDOW_UPDATE length !=4: %s", java.lang.Integer.valueOf(zzf));
                        throw zzi21;
                    }
                    long zzm6 = zzcfhVar.zzm() & androidx.collection.SieveCacheKt.NodeLinkMask;
                    if (zzm6 != 0) {
                        zzccwVar.zzg(zzm, zzm6);
                        return true;
                    }
                    zzi22 = com.google.android.libraries.places.internal.zzcdh.zzi("windowSizeIncrement was 0", new java.lang.Object[0]);
                    throw zzi22;
                default:
                    zzcfhVar.zzt(zzf);
                    return true;
            }
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
