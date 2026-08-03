package com.facebook.ads.redexgen.core;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0961Pr {
    public static int[] A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"xE1uVhGB69CiXPpHcJa10wbSlC3W3Pqt", "6IpI1YgYEWBIhrDPxczszndZYzSCWcQF", "bz", "MzPVaMVFsogiMWrn4KMw3MbbkZJMuH", "2ugKETTJdLvfYrUKb1TohGbXSYfe6n6C", "hmUXQG87xVCBxVGQbZ2KvW4kNx5lzwQm", "IXb1TBLYeY5D6VfxvuWbchUwU2o2Kpep", "MzSHxO025yCTKgxZvpDu7SYsFbhNKTLL"};
    public static final byte[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[0].charAt(20) != '0') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[1] = "Wzlt7pC9sZ6E4twls83s4vi3o8ZTUgJv";
            strArr[5] = "VyCJESJZLvIfYV7xXyp1DHPmX8SMlxdC";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-46, -61, 5, com.google.common.base.Ascii.FS, -61, com.google.common.base.Ascii.GS, 8, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2};
    }

    static {
        A02();
        A03 = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
        A05 = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        A04 = new int[]{3, 31, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
        A06 = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        A00 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(int p, int q, java.math.RoundingMode mode) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(mode);
        if (q != 0) {
            int i = p / q;
            int div = q * i;
            int i2 = p - div;
            if (i2 == 0) {
                return i;
            }
            int i3 = ((p ^ q) >> 31) | 1;
            int[] iArr = com.facebook.ads.redexgen.core.C0615Cc.A00;
            int div2 = mode.ordinal();
            switch (iArr[div2]) {
                case 1:
                    com.facebook.ads.redexgen.core.AbstractC1620gS.A02(i2 == 0);
                case 2:
                    r2 = false;
                    return r2 ? i + i3 : i;
                case 3:
                    if (i3 >= 0) {
                        r2 = false;
                    }
                    if (r2) {
                    }
                    break;
                case 4:
                    r2 = true;
                    if (r2) {
                    }
                    break;
                case 5:
                    if (i3 <= 0) {
                        r2 = false;
                    }
                    if (r2) {
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int rem = java.lang.Math.abs(i2);
                    int div3 = java.lang.Math.abs(q);
                    int rem2 = rem - (div3 - rem);
                    if (rem2 == 0) {
                        if (mode != java.math.RoundingMode.HALF_UP) {
                            int rem3 = mode == java.math.RoundingMode.HALF_EVEN ? 1 : 0;
                            int div4 = i & 1;
                            int div5 = div4 != 0 ? 1 : 0;
                            if ((rem3 & div5) == 0) {
                                r2 = false;
                            }
                        }
                    } else if (rem2 <= 0) {
                        r2 = false;
                    }
                    if (r2) {
                    }
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        } else {
            throw new java.lang.ArithmeticException(A01(0, 9, 66));
        }
    }
}
