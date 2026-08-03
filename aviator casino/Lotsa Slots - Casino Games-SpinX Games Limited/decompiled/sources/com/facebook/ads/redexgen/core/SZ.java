package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class SZ {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.SX> A02;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A03;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
            i4++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, 17, 33, 40, com.google.common.base.Ascii.ETB, 36, 36, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.CR, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new java.util.concurrent.atomic.AtomicReference<>();
        A03 = new java.util.concurrent.atomic.AtomicReference<>(A04(0, 0, 12));
    }

    public static com.facebook.ads.redexgen.core.SX A00() {
        com.facebook.ads.redexgen.core.SX advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return com.facebook.ads.redexgen.core.SX.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.SX A01(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.SX sx) {
        if (sx != null) {
            try {
            } catch (java.lang.Throwable t) {
                t8.A08().ABC(A04(12, 7, 84), com.facebook.ads.redexgen.core.AbstractC1048Td.A1Q, new com.facebook.ads.redexgen.core.C1049Te(t));
            }
        }
        return com.facebook.ads.redexgen.core.AbstractC1024Sf.A00(t8);
        return sx;
    }

    public static com.facebook.ads.redexgen.core.SX A02(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.SX sx, com.facebook.ads.redexgen.core.SY sy) {
        com.facebook.ads.redexgen.core.C1020Sa c1020Sa = null;
        try {
            if (com.facebook.ads.redexgen.core.AbstractC1085Uo.A06(t8) && (sx == null || android.text.TextUtils.isEmpty(sx.A03()))) {
                c1020Sa = com.facebook.ads.redexgen.core.AbstractC1021Sb.A00(t8.getContentResolver());
            }
        } catch (java.lang.Throwable th) {
            t8.A08().ABC(A04(12, 7, 84), com.facebook.ads.redexgen.core.AbstractC1048Td.A1S, new com.facebook.ads.redexgen.core.C1049Te(th));
        }
        if (c1020Sa != null && c1020Sa.A01 != null) {
            A03.set(c1020Sa.A01);
            sy.A05(c1020Sa.A01);
        }
        if (sx == null && c1020Sa != null && !android.text.TextUtils.isEmpty(c1020Sa.A00)) {
            return new com.facebook.ads.redexgen.core.SX(c1020Sa.A00, c1020Sa.A02, com.facebook.ads.redexgen.core.SW.A04);
        }
        return sx;
    }

    public static java.lang.String A03() {
        java.lang.String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(com.facebook.ads.redexgen.core.SY sy) {
        A02.set(sy.A02());
        A03.set(sy.A03());
    }

    public static void A07(com.facebook.ads.redexgen.core.T8 t8) {
        long j;
        com.facebook.ads.redexgen.core.SX advertisingIdInfo;
        try {
            com.facebook.ads.redexgen.core.SY sy = new com.facebook.ads.redexgen.core.SY(t8);
            A06(sy);
            if (A08()) {
                return;
            }
            com.facebook.ads.redexgen.core.SX advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !android.text.TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j = advertisingIdInfo2.A01();
            } else {
                j = -1;
            }
            if (j > 0 && java.lang.System.currentTimeMillis() - j < com.facebook.ads.redexgen.core.AbstractC1085Uo.A00(t8)) {
                return;
            }
            if (com.facebook.ads.redexgen.core.AbstractC1085Uo.A07(t8)) {
                advertisingIdInfo = A01(t8, A02(t8, null, sy));
            } else {
                advertisingIdInfo = A02(t8, A01(t8, null), sy);
            }
            if (advertisingIdInfo != null && !android.text.TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                sy.A04(advertisingIdInfo);
            }
        } catch (java.lang.Throwable t) {
            t8.A08().ABC(A04(12, 7, 84), com.facebook.ads.redexgen.core.AbstractC1048Td.A1R, new com.facebook.ads.redexgen.core.C1049Te(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = com.facebook.ads.redexgen.core.XD.A04();
        if (updated) {
            java.lang.String A04 = A04(0, 12, 92);
            boolean updated2 = com.facebook.ads.redexgen.core.XD.A05(A04);
            if (updated2) {
                A03.set(com.facebook.ads.redexgen.core.XD.A01(A04));
                z = true;
            }
        }
        boolean A042 = com.facebook.ads.redexgen.core.XD.A04();
        if (A01[7].length() != 4) {
            throw new java.lang.RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!A042) {
            return z;
        }
        java.lang.String A043 = A04(19, 13, 108);
        boolean updated3 = com.facebook.ads.redexgen.core.XD.A05(A043);
        if (updated3) {
            java.lang.String A012 = com.facebook.ads.redexgen.core.XD.A01(A043);
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.SX> atomicReference = A02;
            if (A012 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    A012 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    A012 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new com.facebook.ads.redexgen.core.SX(A012, false, com.facebook.ads.redexgen.core.SW.A03));
            return true;
        }
        return z;
    }
}
