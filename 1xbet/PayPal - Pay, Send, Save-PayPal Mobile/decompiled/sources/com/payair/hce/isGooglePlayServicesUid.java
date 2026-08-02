package com.payair.hce;

/* loaded from: classes4.dex */
public final class isGooglePlayServicesUid {
    private static int[] AlternateContactlessPaymentDataJson = null;
    private static int DigitizedCardProfile = 1;
    private static int values;

    static {
        AlternateContactlessPaymentDataJson();
        try {
            try {
                int i = values + 45;
                DigitizedCardProfile = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.Exception unused) {
                android.view.ViewConfiguration.getMaximumFlingVelocity();
            }
        } catch (java.lang.Exception unused2) {
            android.view.ViewConfiguration.getScrollBarFadeDuration();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String valueOf(byte[] bArr) {
        char c;
        int i;
        byte b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            int i4 = values + 73;
            DigitizedCardProfile = i4 % 128;
            if (i4 % 2 == 0) {
                i3 += 99;
                if ((bArr[i2] & 15050) == 13936) {
                    i3++;
                    i2 += 4;
                } else {
                    byte b2 = bArr[i2];
                    i2 = (b2 & 224) != 224 ? i2 + 3 : (b2 & com.visa.cbp.getEncExpo.startTransaction) == 192 ? i2 + 2 : i2 + 1;
                }
            } else {
                i3++;
                if ((bArr[i2] & com.visa.cbp.getEncExpo.onUnminimized) == 240) {
                    i3++;
                    i2 += 4;
                } else {
                    byte b22 = bArr[i2];
                    if ((b22 & 224) != 224) {
                    }
                }
            }
        }
        char[] cArr = new char[i3];
        int i5 = 0;
        int i6 = 0;
        while (i5 < bArr.length) {
            byte b3 = bArr[i5];
            if ((b3 & com.visa.cbp.getEncExpo.onUnminimized) == 240) {
                values = (DigitizedCardProfile + 99) % 128;
                int i7 = (((((b3 & 3) << 18) | ((bArr[i5 + 1] & 63) << 12)) | ((bArr[i5 + 2] & 63) << 6)) | (bArr[i5 + 3] & 63)) - 65536;
                char c2 = (char) ((i7 >> 10) | 55296);
                c = (char) ((i7 & 1023) | 56320);
                cArr[i6] = c2;
                i5 += 4;
                i6++;
            } else if ((b3 & 224) == 224) {
                c = (char) (((b3 & com.google.common.base.Ascii.SI) << 12) | ((bArr[i5 + 1] & 63) << 6) | (bArr[i5 + 2] & 63));
                i5 += 3;
                values = (DigitizedCardProfile + 107) % 128;
            } else {
                if ((b3 & 208) == 208) {
                    i = (b3 & com.google.common.base.Ascii.US) << 6;
                    b = bArr[i5 + 1];
                } else if ((b3 & com.visa.cbp.getEncExpo.startTransaction) == 192) {
                    int i8 = DigitizedCardProfile + 5;
                    values = i8 % 128;
                    if (i8 % 2 != 0) {
                        c = (char) (((b3 & 43) >> 2) | (bArr[0] & 4));
                        i5 += 67;
                    } else {
                        i = (b3 & com.google.common.base.Ascii.US) << 6;
                        b = bArr[i5 + 1];
                    }
                } else {
                    c = (char) (b3 & 255);
                    i5++;
                }
                c = (char) (i | (b & 63));
                i5 += 2;
            }
            cArr[i6] = c;
            i6++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i9 = DigitizedCardProfile + 25;
        values = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public static java.lang.String valueOf(java.lang.String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c) {
                int i2 = DigitizedCardProfile;
                values = (i2 + 89) % 128;
                if ('Z' >= c) {
                    charArray[i] = (char) (c + ' ');
                    values = (i2 + 47) % 128;
                    z = true;
                }
            }
        }
        return z ? new java.lang.String(charArray) : str;
    }

    public static java.lang.String DigitizedCardProfile(byte[] bArr) {
        java.lang.String str = new java.lang.String(AlternateContactlessPaymentDataJson(bArr));
        int i = DigitizedCardProfile + 5;
        values = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static char[] AlternateContactlessPaymentDataJson(byte[] bArr) {
        char[] cArr;
        int i;
        int i2 = DigitizedCardProfile + 89;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            cArr = new char[bArr.length];
            i = 1;
        } else {
            cArr = new char[bArr.length];
            i = 0;
        }
        while (i != cArr.length) {
            int i3 = values + 43;
            DigitizedCardProfile = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[i] = (char) (bArr[i] & 8251);
                i += 99;
            } else {
                cArr[i] = (char) (bArr[i] & 255);
                i++;
            }
        }
        return cArr;
    }

    static void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson = new int[]{-1774693148, -1214377588, -1621164283, -1387269, 378692600, -1764356010, -1950506444, -1370446807, 2009061900, 881479382, -1881838491, 934080076, 130261824, 128254183, -1914817038, 1746996625, -1916250464, -2003667434};
    }
}
