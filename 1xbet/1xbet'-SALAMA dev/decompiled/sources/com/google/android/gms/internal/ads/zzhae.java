package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzhae {
    public static /* bridge */ /* synthetic */ void zza(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws zzgxv {
        if (!zzg(b8)) {
            if ((((b8 + 112) + (b7 << 28)) >> 30) == 0 && !zzg(b9) && !zzg(b10)) {
                int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i7] = (char) ((i8 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
                return;
            }
        }
        throw new zzgxv("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void zzb(byte b7, byte b8, byte b9, char[] cArr, int i7) throws zzgxv {
        if (!zzg(b8)) {
            if (b7 != -32) {
                if (b7 != -19) {
                    if (!zzg(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                } else if (b8 < -96) {
                    b7 = -19;
                    if (!zzg(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                }
            } else if (b8 >= -96) {
                b7 = -32;
                if (b7 != -19) {
                    if (!zzg(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                } else if (b8 < -96) {
                    b7 = -19;
                    if (!zzg(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                }
            }
        }
        throw new zzgxv("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b7, byte b8, char[] cArr, int i7) throws zzgxv {
        if (b7 < -62 || zzg(b8)) {
            throw new zzgxv("Protocol message had invalid UTF-8.");
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b7) {
        return b7 >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b7) {
        return b7 < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b7) {
        return b7 < -32;
    }

    private static boolean zzg(byte b7) {
        return b7 > -65;
    }
}
