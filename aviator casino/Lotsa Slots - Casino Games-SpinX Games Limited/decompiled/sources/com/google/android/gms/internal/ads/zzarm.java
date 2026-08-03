package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzarm implements com.google.android.gms.internal.ads.zzarn {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, com.ironsource.InterfaceC3141l1.a.b.h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, androidx.compose.ui.layout.LayoutKt.LargeDimension};
    private final com.google.android.gms.internal.ads.zzagb zzc;
    private final com.google.android.gms.internal.ads.zzahk zzd;
    private final com.google.android.gms.internal.ads.zzarr zze;
    private final int zzf;
    private final byte[] zzg;
    private final com.google.android.gms.internal.ads.zzet zzh;
    private final int zzi;
    private final com.google.android.gms.internal.ads.zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzarm(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzahk zzahkVar, com.google.android.gms.internal.ads.zzarr zzarrVar) throws com.google.android.gms.internal.ads.zzat {
        this.zzc = zzagbVar;
        this.zzd = zzahkVar;
        this.zze = zzarrVar;
        int max = java.lang.Math.max(1, zzarrVar.zzc / 10);
        this.zzi = max;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(zzarrVar.zzf);
        zzetVar.zzu();
        int zzu = zzetVar.zzu();
        this.zzf = zzu;
        int i = zzarrVar.zzb;
        int i2 = (((zzarrVar.zzd - (i * 4)) * 8) / (zzarrVar.zze * i)) + 1;
        if (zzu != i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 34 + java.lang.String.valueOf(zzu).length());
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(zzu);
            throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
        }
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int i3 = ((max + zzu) - 1) / zzu;
        this.zzg = new byte[zzarrVar.zzd * i3];
        this.zzh = new com.google.android.gms.internal.ads.zzet(i3 * (zzu + zzu) * i);
        int i4 = ((zzarrVar.zzc * zzarrVar.zzd) * 8) / zzu;
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzi(i4);
        zztVar.zzj(i4);
        zztVar.zzp((max + max) * i);
        zztVar.zzG(zzarrVar.zzb);
        zztVar.zzH(zzarrVar.zzc);
        zztVar.zzI(2);
        this.zzj = zztVar.zzO();
    }

    private final void zzd(int i) {
        long zzv = this.zzl + com.google.android.gms.internal.ads.zzfl.zzv(this.zzn, 1000000L, this.zze.zzc, java.math.RoundingMode.DOWN);
        int zzf = zzf(i);
        this.zzd.zze(zzv, 1, zzf, this.zzm - zzf, null);
        this.zzn += i;
        this.zzm -= zzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void zzb(int i, long j) {
        com.google.android.gms.internal.ads.zzaru zzaruVar = new com.google.android.gms.internal.ads.zzaru(this.zze, this.zzf, i, j);
        this.zzc.zzw(zzaruVar);
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzd;
        zzahkVar.zzA(this.zzj);
        zzahkVar.zzO(zzaruVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:3:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzarn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        boolean z;
        int i;
        boolean z2;
        int zze;
        int zze2 = zze(this.zzm);
        int i2 = this.zzi;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int i3 = this.zzf;
        com.google.android.gms.internal.ads.zzarr zzarrVar = this.zze;
        int i4 = zzarrVar.zzd;
        int i5 = ((((i2 - zze2) + i3) - 1) / i3) * i4;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= i5) {
                    break;
                }
                int zza2 = zzafzVar.zza(this.zzg, this.zzk, (int) java.lang.Math.min(i5 - r10, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / i4;
            if (i <= 0) {
                byte[] bArr = this.zzg;
                com.google.android.gms.internal.ads.zzet zzetVar = this.zzh;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = 0;
                    while (true) {
                        int i8 = zzarrVar.zzb;
                        if (i7 < i8) {
                            byte[] zzi = zzetVar.zzi();
                            int i9 = (i4 / i8) - 4;
                            int i10 = (i6 * i4) + (i7 * 4);
                            int i11 = bArr[i10 + 1] & 255;
                            int i12 = bArr[i10] & 255;
                            com.google.android.gms.internal.ads.zzarr zzarrVar2 = zzarrVar;
                            boolean z3 = z;
                            int min = java.lang.Math.min(bArr[i10 + 2] & 255, 88);
                            int[] iArr = zzb;
                            int i13 = iArr[min];
                            int i14 = (i6 * i3 * i8) + i7;
                            int i15 = (short) ((i11 << 8) | i12);
                            int i16 = i14 + i14;
                            zzi[i16] = (byte) (i15 & 255);
                            zzi[i16 + 1] = (byte) (i15 >> 8);
                            int i17 = 0;
                            while (i17 < i9 + i9) {
                                byte b = bArr[(i8 * 4) + i10 + ((i17 / 8) * i8 * 4) + ((i17 / 2) % 4)];
                                byte[] bArr2 = bArr;
                                int i18 = i17 % 2 == 0 ? b & com.google.common.base.Ascii.SI : (b & 255) >> 4;
                                int i19 = i18 & 7;
                                int i20 = (((i19 + i19) + 1) * i13) >> 3;
                                if ((i18 & 8) != 0) {
                                    i20 = -i20;
                                }
                                i15 = java.lang.Math.max(-32768, java.lang.Math.min(i15 + i20, androidx.compose.ui.layout.LayoutKt.LargeDimension));
                                i16 += i8 + i8;
                                zzi[i16] = (byte) (i15 & 255);
                                zzi[i16 + 1] = (byte) (i15 >> 8);
                                min = java.lang.Math.max(0, java.lang.Math.min(min + zza[i18], 88));
                                i17++;
                                i8 = i8;
                                bArr = bArr2;
                                i13 = iArr[min];
                            }
                            i7++;
                            z = z3;
                            zzarrVar = zzarrVar2;
                        }
                    }
                }
                z2 = z;
                int zzf = zzf(i3 * i);
                zzetVar.zzh(0);
                zzetVar.zzf(zzf);
                this.zzk -= i * i4;
                int zze3 = zzetVar.zze();
                this.zzd.zzc(zzetVar, zze3);
                int i21 = this.zzm + zze3;
                this.zzm = i21;
                if (zze(i21) >= i2) {
                    zzd(i2);
                }
            } else {
                z2 = z;
            }
            if (z2 && (zze = zze(this.zzm)) > 0) {
                zzd(zze);
            }
            return z2;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / i4;
        if (i <= 0) {
        }
        if (z2) {
            zzd(zze);
        }
        return z2;
    }
}
