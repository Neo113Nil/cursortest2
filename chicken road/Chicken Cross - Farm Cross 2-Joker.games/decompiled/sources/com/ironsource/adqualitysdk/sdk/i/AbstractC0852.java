package com.ironsource.adqualitysdk.sdk.i;

import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.StringFog;
import kotlin.io.encoding.Base64;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0852 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f2462 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final byte[] f2464 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final byte[] f2463 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5682(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f2464;
        int i = ((length + 2) / 3) * 4;
        int i2 = (i / Integer.MAX_VALUE) + i;
        byte[] bArr3 = new byte[i2];
        int i3 = length - 2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = ((bArr[i4] << Ascii.CAN) >>> 8) | ((bArr[i4 + 1] << Ascii.CAN) >>> 16) | ((bArr[i4 + 2] << Ascii.CAN) >>> 24);
            bArr3[i5] = bArr2[i7 >>> 18];
            int i8 = i5 + 1;
            bArr3[i8] = bArr2[(i7 >>> 12) & 63];
            bArr3[i5 + 2] = bArr2[(i7 >>> 6) & 63];
            bArr3[i5 + 3] = bArr2[i7 & 63];
            i6 += 4;
            if (i6 == Integer.MAX_VALUE) {
                bArr3[i5 + 4] = 10;
                i6 = 0;
                i5 = i8;
            }
            i4 += 3;
            i5 += 4;
        }
        if (i4 < length) {
            int i9 = length - i4;
            int i10 = (i9 > 2 ? (bArr[i4 + 2] << Ascii.CAN) >>> 24 : 0) | (i9 > 0 ? (bArr[i4] << Ascii.CAN) >>> 8 : 0) | (i9 > 1 ? (bArr[i4 + 1] << Ascii.CAN) >>> 16 : 0);
            if (i9 == 1) {
                bArr3[i5] = bArr2[i10 >>> 18];
                bArr3[i5 + 1] = bArr2[(i10 >>> 12) & 63];
                bArr3[i5 + 2] = Base64.padSymbol;
                bArr3[i5 + 3] = Base64.padSymbol;
            } else if (i9 == 2) {
                bArr3[i5] = bArr2[i10 >>> 18];
                bArr3[i5 + 1] = bArr2[(i10 >>> 12) & 63];
                bArr3[i5 + 2] = bArr2[(i10 >>> 6) & 63];
                bArr3[i5 + 3] = Base64.padSymbol;
            } else if (i9 == 3) {
                bArr3[i5] = bArr2[i10 >>> 18];
                bArr3[i5 + 1] = bArr2[(i10 >>> 12) & 63];
                bArr3[i5 + 2] = bArr2[(i10 >>> 6) & 63];
                bArr3[i5 + 3] = bArr2[i10 & 63];
            }
            if (i6 + 4 == Integer.MAX_VALUE) {
                bArr3[i5 + 4] = 10;
                i5++;
            }
            i5 += 4;
        }
        if (f2462 || i5 == i2) {
            return new String(bArr3, 0, i2);
        }
        throw new AssertionError();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m5681(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte b = bArr[2];
        if (b == 61) {
            bArr2[i] = (byte) ((((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6)) >>> 16);
            return 1;
        }
        byte b2 = bArr[3];
        if (b2 == 61) {
            int i2 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b] << Ascii.CAN) >>> 18);
            bArr2[i] = (byte) (i2 >>> 16);
            bArr2[i + 1] = (byte) (i2 >>> 8);
            return 2;
        }
        int i3 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b] << Ascii.CAN) >>> 18) | ((bArr3[b2] << Ascii.CAN) >>> 24);
        bArr2[i] = (byte) (i3 >> 16);
        bArr2[i + 1] = (byte) (i3 >> 8);
        bArr2[i + 2] = (byte) i3;
        return 3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m5683(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = f2463;
        byte[] bArr2 = new byte[((length * 3) / 4) + 2];
        byte[] bArr3 = new byte[4];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            byte b = (byte) (bytes[i] & Byte.MAX_VALUE);
            byte b2 = bArr[b];
            if (b2 < -5) {
                throw new C0842(AbstractC1257.m5940("rLp8JGF6M56t\n", "hN4ZRwgXUvI=\n", new StringBuilder().append(StringFog.decrypt("q4wY1ubnTw7f2VyfyvZJH8mOFJfW518fjJ9cl9Cm\n", "6e189qSGPGs=\n")).append(i).append(StringFog.decrypt("nPM=\n", "ptMadG8lDmE=\n")).append((int) bytes[i])));
            }
            if (b2 >= -1) {
                if (b == 61) {
                    int i4 = length - i;
                    byte b3 = (byte) (bytes[length - 1] & Byte.MAX_VALUE);
                    if (i2 == 0 || i2 == 1) {
                        throw new C0842(StringFog.decrypt("cDWRWqSW/lFpOoNfoZH9UXsik17o2KdWOTqTG6qG7hQ5NIFdu5ruUQ==\n", "GVvnO8j/mnE=\n") + i);
                    }
                    if ((i2 == 3 && i4 > 2) || (i2 == 4 && i4 > 1)) {
                        throw new C0842(StringFog.decrypt("8/oHNJc87I3h4hc13nW2iqP9AjyNN+fUo+gKN5Az596j/g003j3tjeb1AD+aN++N9foPJZty6tmj\n9AU2jTf/jQ==\n", "g5tjUP5Si60=\n") + i);
                    }
                    if (b3 != 61 && b3 != 10) {
                        throw new C0842(StringFog.decrypt("Hzu757nP94IMNLT9uIr7wwl1seary//LHnWs+rzD/8sUMvjqpN72\n", "elXYiN2qk6I=\n"));
                    }
                } else {
                    int i5 = i2 + 1;
                    bArr3[i2] = b;
                    if (i5 == 4) {
                        i3 += m5681(bArr3, bArr2, i3, bArr);
                        i2 = 0;
                    } else {
                        i2 = i5;
                    }
                }
            }
            i++;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                bArr3[i2] = Base64.padSymbol;
                i3 += m5681(bArr3, bArr2, i3, bArr);
            } else {
                throw new C0842(StringFog.decrypt("L+qSRwyBV6Yu4pVMCYoQ8j/rnVIBhwO3LqOdVECLEbQv5ogA\n", "XIP8IGDkd9I=\n") + (length - 1));
            }
        }
        byte[] bArr4 = new byte[i3];
        System.arraycopy(bArr2, 0, bArr4, 0, i3);
        return bArr4;
    }
}
