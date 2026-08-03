package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhzj extends com.google.android.gms.internal.ads.zzhzi {
    private static final int[] zzc = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int zzd;
    private final int[] zze;

    public zzhzj(int i, byte[] bArr) {
        this.zza = bArr;
        this.zze = zzc;
        this.zzd = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e5, code lost:
    
        if (r2 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        if (r2 == 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
    
        if (r2 == 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00eb, code lost:
    
        if (r2 == 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        r17.zzd = r2;
        r17.zzb = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0109, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
    
        r1 = r9 + 1;
        r5[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r5[r1] = (byte) (r8 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fd, code lost:
    
        r5[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(byte[] bArr, int i, int i2, boolean z) {
        int i3 = this.zzd;
        if (i3 == 6) {
            return false;
        }
        byte[] bArr2 = this.zza;
        int[] iArr = this.zze;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i3 == 0) {
                while (true) {
                    int i7 = i4 + 4;
                    if (i7 > i2) {
                        break;
                    }
                    int i8 = iArr[bArr[i4] & 255] << 18;
                    int i9 = iArr[bArr[i4 + 1] & 255] << 12;
                    i5 = i8 | i9 | (iArr[bArr[i4 + 2] & 255] << 6) | iArr[bArr[i4 + 3] & 255];
                    if (i5 < 0) {
                        break;
                    }
                    bArr2[i6 + 2] = (byte) i5;
                    bArr2[i6 + 1] = (byte) (i5 >> 8);
                    bArr2[i6] = (byte) (i5 >> 16);
                    i6 += 3;
                    i4 = i7;
                }
                if (i4 >= i2) {
                    i3 = 0;
                    break;
                }
                i3 = 0;
            }
            int i10 = i4 + 1;
            int i11 = iArr[bArr[i4] & 255];
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i11 < 0) {
                        if (i11 != -1) {
                            break;
                        }
                    }
                    i3++;
                    i11 |= i5 << 6;
                } else if (i3 == 2) {
                    if (i11 < 0) {
                        if (i11 == -2) {
                            bArr2[i6] = (byte) (i5 >> 4);
                            i6++;
                            i3 = 4;
                        } else if (i11 != -1) {
                            break;
                        }
                    }
                    i3++;
                    i11 |= i5 << 6;
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5 && i11 != -1) {
                            break;
                        }
                    } else if (i11 == -2) {
                        i3++;
                    } else if (i11 != -1) {
                        break;
                    }
                } else if (i11 >= 0) {
                    int i12 = i11 | (i5 << 6);
                    bArr2[i6 + 2] = (byte) i12;
                    bArr2[i6 + 1] = (byte) (i12 >> 8);
                    bArr2[i6] = (byte) (i12 >> 16);
                    i6 += 3;
                    i5 = i12;
                    i3 = 0;
                } else if (i11 == -2) {
                    bArr2[i6 + 1] = (byte) (i5 >> 2);
                    bArr2[i6] = (byte) (i5 >> 10);
                    i6 += 2;
                    i3 = 5;
                } else if (i11 != -1) {
                    break;
                }
                i5 = i11;
            } else if (i11 >= 0) {
                i3++;
                i5 = i11;
            } else if (i11 != -1) {
                break;
            }
            i4 = i10;
        }
        this.zzd = 6;
        return false;
    }
}
