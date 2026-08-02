package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;
import e1.k;

/* loaded from: classes.dex */
public final class zzabr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabp zza(byte[] bArr) {
        return zzb(new zzec(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabp zzb(zzec zzecVar, boolean z4) {
        int zzc2 = zzc(zzecVar);
        int zzd = zzd(zzecVar);
        int zzd2 = zzecVar.zzd(4);
        String d7 = k.d(zzc2, "mp4a.40.");
        int i7 = 22;
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzecVar);
            zzc2 = zzc(zzecVar);
            if (zzc2 == 22) {
                zzd2 = zzecVar.zzd(4);
            }
        }
        if (z4) {
            int i8 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case zzbbd.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzaz.zzc("Unsupported audio object type: " + zzc2);
                }
            }
            if (zzecVar.zzp()) {
                zzdq.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(14);
            }
            boolean zzp = zzecVar.zzp();
            if (zzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzp) {
                    if (zzc2 == 22) {
                        zzecVar.zzn(16);
                    } else {
                        i7 = zzc2;
                    }
                    if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                        zzecVar.zzn(3);
                    }
                    zzecVar.zzn(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case zzbbd.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        int zzd3 = zzecVar.zzd(2);
                        if (zzd3 == 2) {
                            i8 = zzd3;
                        }
                        throw zzaz.zzc("Unsupported epConfig: " + i8);
                }
            }
            zzecVar.zzn(3);
            if (zzp) {
            }
            switch (zzc2) {
            }
        }
        int i9 = zzc[zzd2];
        if (i9 != -1) {
            return new zzabp(zzd, i9, d7, null);
        }
        throw zzaz.zza(null, null);
    }

    private static int zzc(zzec zzecVar) {
        int zzd = zzecVar.zzd(5);
        return zzd == 31 ? zzecVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzec zzecVar) {
        int zzd = zzecVar.zzd(4);
        if (zzd == 15) {
            if (zzecVar.zza() >= 24) {
                return zzecVar.zzd(24);
            }
            throw zzaz.zza("AAC header insufficient data", null);
        }
        if (zzd < 13) {
            return zzb[zzd];
        }
        throw zzaz.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
