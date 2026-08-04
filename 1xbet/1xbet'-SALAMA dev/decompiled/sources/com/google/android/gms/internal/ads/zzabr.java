package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzabr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabp zza(byte[] bArr) {
        return zzb(new zzec(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabp zzb(zzec zzecVar, boolean z4) throws zzaz {
        int iZzc = zzc(zzecVar);
        int iZzd = zzd(zzecVar);
        int iZzd2 = zzecVar.zzd(4);
        String strD = k.d(iZzc, "mp4a.40.");
        int i7 = 22;
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzecVar);
            iZzc = zzc(zzecVar);
            if (iZzc == 22) {
                iZzd2 = zzecVar.zzd(4);
            }
        }
        if (z4) {
            int i8 = 3;
            if (iZzc != 1 && iZzc != 2 && iZzc != 3 && iZzc != 4 && iZzc != 6 && iZzc != 7 && iZzc != 17) {
                switch (iZzc) {
                    case 19:
                    case 20:
                    case zzbbd.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzaz.zzc("Unsupported audio object type: " + iZzc);
                }
            }
            if (zzecVar.zzp()) {
                zzdq.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(14);
            }
            boolean zZzp = zzecVar.zzp();
            if (iZzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iZzc == 6) {
                zzecVar.zzn(3);
            } else if (iZzc == 20) {
                iZzc = 20;
                zzecVar.zzn(3);
            }
            if (zZzp) {
                if (iZzc == 22) {
                    zzecVar.zzn(16);
                } else {
                    i7 = iZzc;
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    zzecVar.zzn(3);
                }
                zzecVar.zzn(1);
            }
            switch (iZzc) {
                case 17:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                    int iZzd3 = zzecVar.zzd(2);
                    if (iZzd3 == 2) {
                        i8 = iZzd3;
                    }
                    throw zzaz.zzc("Unsupported epConfig: " + i8);
            }
        }
        int i9 = zzc[iZzd2];
        if (i9 != -1) {
            return new zzabp(iZzd, i9, strD, null);
        }
        throw zzaz.zza(null, null);
    }

    private static int zzc(zzec zzecVar) {
        int iZzd = zzecVar.zzd(5);
        return iZzd == 31 ? zzecVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzec zzecVar) throws zzaz {
        int iZzd = zzecVar.zzd(4);
        if (iZzd == 15) {
            if (zzecVar.zza() >= 24) {
                return zzecVar.zzd(24);
            }
            throw zzaz.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzaz.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
