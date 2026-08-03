package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzavm {
    public static com.google.android.gms.internal.ads.zzawm zza(final long j) {
        return com.google.android.gms.internal.ads.zzawm.zzf(new com.google.android.gms.internal.ads.zzawe() { // from class: com.google.android.gms.internal.ads.zzavl
            @Override // java.util.function.Function
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                try {
                    ((com.google.android.gms.internal.ads.zzawh) obj).zzb.zzb(com.google.android.gms.internal.ads.zzawm.zzb(j));
                    return java.util.Optional.empty();
                } catch (com.google.android.gms.internal.ads.zzawc unused) {
                    return java.util.Optional.of(com.google.android.gms.internal.ads.zzauw.zza);
                }
            }
        });
    }

    public static int zzb(long j, com.google.android.gms.internal.ads.zzawl zzawlVar, boolean z) throws java.io.IOException {
        long j2;
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = j9 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8);
        long j12 = j10 % 1629190168;
        int[] iArr = {1725868784, 388366538, 739792167, 1395525853, 1087913783, 2097482120, 23637094, 1550046828, 184366026};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 184366026;
        iArr[0] = 84870791;
        iArr[1] = 719462960;
        iArr[2] = 688752780;
        iArr[3] = 317383283;
        iArr[4] = 806209731;
        iArr[5] = 1640397215;
        iArr[6] = 202422448;
        iArr[7] = 2023762697;
        iArr[8] = 959200313;
        int i11 = (((719462960 & (~84870791)) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i12 = 2023762697 % 959200313;
        iArr[0] = 294151249;
        iArr[1] = 1465191424;
        iArr[2] = 201912514;
        iArr[3] = 1398095366;
        iArr[4] = 75641662;
        iArr[5] = 1691264753;
        iArr[6] = 361164745;
        iArr[7] = 1583887958;
        iArr[8] = 619175679;
        int i13 = (((1465191424 & (~294151249)) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i14 = 1583887958 % 619175679;
        if (z) {
            iArr[0] = 1375552878;
            iArr[1] = 930005102;
            iArr[2] = 1249030018;
            iArr[3] = 1024213116;
            iArr[4] = 136481682;
            iArr[5] = -1912210507;
            iArr[6] = 291789062;
            iArr[7] = 2014126950;
            iArr[8] = 228698447;
            j2 = (j >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j + j);
        } else {
            j2 = j;
        }
        int i15 = 1;
        while (true) {
            long j13 = j11 ^ j12;
            long j14 = j2 >>> (i11 ^ i12);
            boolean z2 = j14 != 0 || i15 < 0;
            int i16 = (int) (j2 & j13);
            if (z2) {
                int i17 = i9 ^ i10;
                i16 = (((i13 ^ i14) | i16) << i17) >> i17;
            }
            zzawlVar.zza((byte) i16);
            if (!z2) {
                return i15;
            }
            i15++;
            j2 = j14;
        }
    }
}
