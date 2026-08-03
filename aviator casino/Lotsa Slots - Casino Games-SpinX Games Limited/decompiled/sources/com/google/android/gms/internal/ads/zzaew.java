package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaew {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static com.google.android.gms.internal.ads.zzaev zza(byte[] bArr) throws com.google.android.gms.internal.ads.zzat {
        return zzb(new com.google.android.gms.internal.ads.zzes(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzaev zzb(com.google.android.gms.internal.ads.zzes zzesVar, boolean z) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int zzc2 = zzc(zzesVar);
        int zzd = zzd(zzesVar);
        int zzj = zzesVar.zzj(4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc2).length() + 8);
        sb.append("mp4a.40.");
        sb.append(zzc2);
        java.lang.String sb2 = sb.toString();
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzesVar);
            zzc2 = zzc(zzesVar);
            if (zzc2 == 22) {
                zzj = zzesVar.zzj(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzc2).length() + 31);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(zzc2);
                        throw com.google.android.gms.internal.ads.zzat.zzc(sb3.toString());
                }
            }
            if (zzesVar.zzi()) {
                com.google.android.gms.internal.ads.zzeg.zzc("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzesVar.zzi()) {
                zzesVar.zzh(14);
            }
            boolean zzi = zzesVar.zzi();
            if (zzj == 0) {
                throw new java.lang.UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzi) {
                    if (zzc2 == 22) {
                        zzesVar.zzh(16);
                        i = 22;
                    } else {
                        i = zzc2;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzesVar.zzh(3);
                    }
                    zzesVar.zzh(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int zzj2 = zzesVar.zzj(2);
                        if (zzj2 == 2) {
                            i2 = zzj2;
                        }
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 22);
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(i2);
                        throw com.google.android.gms.internal.ads.zzat.zzc(sb4.toString());
                }
            }
            zzesVar.zzh(3);
            if (zzi) {
            }
            switch (zzc2) {
            }
        }
        int i3 = zzc[zzj];
        if (i3 != -1) {
            return new com.google.android.gms.internal.ads.zzaev(zzd, i3, sb2, null);
        }
        throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
    }

    private static int zzc(com.google.android.gms.internal.ads.zzes zzesVar) {
        int zzj = zzesVar.zzj(5);
        return zzj == 31 ? zzesVar.zzj(6) + 32 : zzj;
    }

    private static int zzd(com.google.android.gms.internal.ads.zzes zzesVar) throws com.google.android.gms.internal.ads.zzat {
        int zzj = zzesVar.zzj(4);
        if (zzj == 15) {
            if (zzesVar.zzc() >= 24) {
                return zzesVar.zzj(24);
            }
            throw com.google.android.gms.internal.ads.zzat.zzb("AAC header insufficient data", null);
        }
        if (zzj < 13) {
            return zzb[zzj];
        }
        throw com.google.android.gms.internal.ads.zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}
