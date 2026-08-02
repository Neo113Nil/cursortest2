package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzhl extends zzhk {
    @Override // com.google.android.gms.internal.auth.zzhk
    public final int zza(int i7, byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i10 >= i9) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i10 >= i9 - 1) {
                        return zzhm.zza(bArr, i10, i9);
                    }
                    int i11 = i8 + 2;
                    byte b8 = bArr[i10];
                    if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                        i8 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (i10 >= i9 - 2) {
                    return zzhm.zza(bArr, i10, i9);
                }
                int i12 = i8 + 2;
                byte b9 = bArr[i10];
                if (b9 <= -65) {
                    if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                        int i13 = i8 + 3;
                        if (bArr[i12] <= -65) {
                            i8 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i8 = i10;
        }
        return 0;
    }
}
