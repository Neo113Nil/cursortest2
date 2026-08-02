package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class py {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    @javax.annotation.Nullable
    private static com.facetec.sdk.qc f3757a;
    private static long b;
    private static long c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static byte[] i;
    private static short[] j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b2, int i2, byte b3) {
        int i3;
        int i4;
        byte[] bArr = $$c;
        int i5 = b2 + 4;
        int i6 = b3 + 68;
        int i7 = 1 - (i2 * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            int i9 = i7;
            i4 = 0;
            int i10 = (-i5) + i9;
            i3 = i4;
            int i11 = i8;
            i6 = i10;
            i5 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i12 = i5 + 1;
            if (i4 == i7) {
                return new java.lang.String(bArr2, 0);
            }
            int i13 = i6;
            i8 = i12;
            i5 = bArr[i12];
            i9 = i13;
            int i102 = (-i5) + i9;
            i3 = i4;
            int i112 = i8;
            i6 = i102;
            i5 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i122 = i5 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i1222 = i5 + 1;
            if (i4 == i7) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SUB, -87, -71, -124};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    static void init$1() {
        $$c = new byte[]{com.google.common.base.Ascii.SUB, -87, -71, -124};
        $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(short s, int i2, byte b2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 4 - (b2 * 2);
        byte[] bArr = $$a;
        int i6 = 1 - (i2 * 4);
        int i7 = 101 - s;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7 += i5;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i5;
            i5 = bArr[i5];
            i7 += i5;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    private py() {
    }

    static com.facetec.sdk.qc c() {
        synchronized (com.facetec.sdk.py.class) {
            com.facetec.sdk.qc qcVar = f3757a;
            if (qcVar != null) {
                f3757a = qcVar.j;
                qcVar.j = null;
                c -= 8192;
                return qcVar;
            }
            return new com.facetec.sdk.qc();
        }
    }

    static void b(com.facetec.sdk.qc qcVar) {
        if (qcVar.j != null || qcVar.i != null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (qcVar.c) {
            return;
        }
        synchronized (com.facetec.sdk.py.class) {
            long j2 = c + 8192;
            if (j2 > 65536) {
                return;
            }
            c = j2;
            qcVar.j = f3757a;
            qcVar.f3761a = 0;
            qcVar.e = 0;
            f3757a = qcVar;
        }
    }

    private static void l(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        int i3 = $11 + 115;
        int i4 = i3 % 128;
        $10 = i4;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            $11 = (i4 + 101) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b2 = com.facetec.sdk.hu.b(b ^ 4732878740741522786L, cArr, i2);
        int i5 = 4;
        huVar.b = 4;
        while (huVar.b < b2.length) {
            $10 = ($11 + 101) % 128;
            huVar.e = huVar.b - i5;
            int i6 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % i5]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(b)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-474326228);
                if (d2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    d2 = com.facetec.sdk.al.c((char) (6935 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2389, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 23, 1146429908, false, $$e(b3, b4, (byte) (b4 | 41)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(-57140341);
                if (d3 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    d3 = com.facetec.sdk.al.c((char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 885, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31, 1534550387, false, $$e(b5, b6, (byte) (b6 | 42)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                i5 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(b2, 4, b2.length - 4);
    }

    private static void m(int i2, short s, int i3, int i4, byte b2, java.lang.Object[] objArr) {
        int i5;
        boolean z;
        com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(d)};
            java.lang.Object d2 = com.facetec.sdk.al.d(-852176267);
            if (d2 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2222 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24, 1792780429, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                i5 = 1;
            } else {
                $10 = ($11 + 53) % 128;
                i5 = 0;
            }
            if (i5 != 0) {
                $11 = ($10 + 65) % 128;
                byte[] bArr = i;
                char c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        $10 = ($11 + 73) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object d3 = com.facetec.sdk.al.d(-1856077218);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 93 - android.text.TextUtils.indexOf("", c2), 23 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).byteValue();
                        i6++;
                        c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    $11 = ($10 + 103) % 128;
                    byte[] bArr3 = i;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(e)};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-852176267);
                    if (d4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        d4 = com.facetec.sdk.al.c((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2221 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, 1792780429, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue()] ^ 1009991189275744878L)) + ((int) (d ^ 1009991189275744878L)));
                } else {
                    intValue = (short) (((short) (j[i3 + ((int) (e ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (d ^ 1009991189275744878L)));
                }
            }
            if (intValue > 0) {
                $10 = ($11 + 89) % 128;
                hmVar.b = ((i3 + intValue) - 2) + ((int) (e ^ 1009991189275744878L)) + i5;
                java.lang.Object[] objArr5 = {hmVar, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(h), sb};
                java.lang.Object d5 = com.facetec.sdk.al.d(-1371371196);
                if (d5 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    d5 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", "", 0), 885 - android.view.View.combineMeasuredStates(0, 0), 33 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 162395068, false, $$e(b7, b8, (byte) (b8 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).append(hmVar.c);
                hmVar.d = hmVar.c;
                byte[] bArr4 = i;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        bArr5[i7] = (byte) (bArr4[i7] ^ 1009991189275744878L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    $10 = ($11 + 93) % 128;
                    z = true;
                } else {
                    z = false;
                }
                hmVar.e = 1;
                while (hmVar.e < intValue) {
                    int i8 = $10 + 33;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = i;
                        hmVar.b = hmVar.b - 1;
                        hmVar.c = (char) (hmVar.d + (((byte) (((byte) (bArr6[r8] ^ 1009991189275744878L)) + s)) ^ b2));
                    } else {
                        short[] sArr = j;
                        hmVar.b = hmVar.b - 1;
                        hmVar.c = (char) (hmVar.d + (((short) (((short) (sArr[r8] ^ 1009991189275744878L)) + s)) ^ b2));
                    }
                    sb.append(hmVar.c);
                    hmVar.d = hmVar.c;
                    hmVar.e++;
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        g = 0;
        f = 1;
        b = -4868387428396492544L;
        e = -1361452393;
        d = -1358030257;
        h = -1366402754;
        i = new byte[]{-117, -118, -126, 114, -118, 104, -109, 46, -48, -34, 34, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 33, -40, -46, 36, 46, -41, com.google.common.base.Ascii.FS, -30, 43, -46, 34, -39, 37, 102, com.visa.cbp.getEncExpo.registerForActivityResult, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -51, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -42, -34, 33, 97, -100, -34, -107, 73, -4, 113, 65, -78, -71, 66, -72, 74, -85, 69, -71, -113, 113, 65, 71, -72, -123, 3, -77, 67, -67, -126, 116, 87, -73, -114, -114, -119, -119, 103, -119, Byte.MAX_VALUE, -114, -115, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -120, -27, com.google.common.base.Ascii.SUB, -27, -23, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, -122, 116, -106, 125, 116, -117, 104, -121, -124, -118, com.google.common.base.Ascii.SUB, -32, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, -113, 110, -127, 36, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, 39, 99, -100, 39, 44, -48, 39, 43, -45, 47, -34, 37, -121, -51, 120, -10, -63, 58, -47, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -60, 63, -119, -117, 123, com.visa.cbp.getEncExpo.registerForActivityResult, 121, -126, -117, 116, -125, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -74, 72, -74, 89, 94, -89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -85, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 80, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -91, -120, -14, 9, com.google.common.base.Ascii.VT, -11, -6, 8, -120, 124, 67, -71, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 73, 76, -113, -93, -122, 98, -123, 103, -99, -108, -108, 121, 104, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 14, -23, com.google.common.base.Ascii.VT, -15, -8, -8, com.google.common.base.Ascii.NAK, 4, -124, -112, 97, -100, -109, 98, 111, -100, 107, -112, com.visa.cbp.getEncExpo.IResultReceiver2, Byte.MIN_VALUE, -81, 94, -93, -84, 94, -92, 85, -75, 93, 80, -93, 84, -81, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -98, 82, -83, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 65, -83, -24, 101, 86, -85, 94, -24, com.visa.cbp.getEncExpo.IResultReceiver2, 88, 81, -82, -19, -124, -79, -77, -121, 118, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 69, -75, 78, -78, com.visa.cbp.getEncExpo.onUnminimized, -123, 60, 62, -45, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -5, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -56, 56, -61, 63, 125, -124, 106, 104, 92, -46, 108, 100, com.visa.cbp.getEncExpo.registerForActivityResult, 102, Byte.MIN_VALUE, 40, -118, 101, 103, -113, 36, -124, -8, com.google.common.base.Ascii.SI, -14, 4, -13, -11, com.google.common.base.Ascii.FF, 0, -27, com.google.common.base.Ascii.ESC, -120, -101, 103, com.visa.cbp.getEncExpo.registerForActivityResult, 98, -101, 97, -123, 46, -26, 19, com.google.common.base.Ascii.EM, -18, -48, 35, 0, -2, 16, -40, -127, -70, 126, 124, 72, -72, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -123, -113, 120, 70, -75, -106, 104, -122, 78, -127, -32, 36, 38, -53, 104, -22, -48, 101, -29, 41, -48, 32, -37, 39, 101};
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x2fb2, code lost:
    
        if (r2 == null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x2de0, code lost:
    
        if (r5 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04b3, code lost:
    
        if (((r2 ^ r3) | (r2 & r3)) != 477111747) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x185b, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) == 477111747) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0c0e, code lost:
    
        r1 = com.facetec.sdk.py.f;
        com.facetec.sdk.py.g = ((r1 & 19) + (r1 | 19)) % 128;
        r1 = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, new int[]{0}};
        r2 = android.os.Process.myUid();
        r3 = ~((~r2) | 1609549759);
        r4 = (((((~((-1088702265) | r2)) | 8668200) | r3) * (-470)) + 1397304663) + (((~(r2 | (-1080034065))) | r3) * 470);
        r2 = ((r4 | 16) << 1) - (r4 ^ 16);
        r5 = ((r2 | (-244638953)) << 1) - (r2 ^ (-244638953));
        r2 = r5 << 13;
        r2 = ((~r2) & r5) | ((~r5) & r2);
        r3 = r2 >>> 17;
        r2 = (~(r2 & r3)) & (r2 | r3);
        ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0c7d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0c0c, code lost:
    
        if (r2.equals((java.lang.String) r11[0]) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x06b8, code lost:
    
        if (((r2 ^ r4) | (r4 & r2)) != 477111747) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0b5f, code lost:
    
        if (((r1 ^ r4) | (r4 & r1)) == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0a0c, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) == 542074309) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x05ae, code lost:
    
        if (((((int) r2) & ((((((~(1783509799 | r6)) | 82952) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 221037901) + ((r3 | 709361665) * (-184))) + ((~((-1074231087) | r6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) (r2 >> 32)) & ((((81986 | r5) * (-374)) + 441091318) + ((r5 | 1782745264) * 374)))) != 477111747) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x1a46 A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x1b7b A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x1c6a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x1d20 A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x1e33 A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x1f1c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x2154  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x23e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x2445  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x2773  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x27f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1a80  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1764  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x175f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x147a A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x14bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x1574 A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x1602 A[Catch: all -> 0x4135, TryCatch #15 {all -> 0x4135, blocks: (B:3:0x0003, B:5:0x000f, B:6:0x0041, B:13:0x0177, B:15:0x0184, B:16:0x01be, B:26:0x0259, B:28:0x0263, B:29:0x029b, B:31:0x032e, B:33:0x033b, B:34:0x0373, B:38:0x038b, B:40:0x03a2, B:41:0x03ec, B:48:0x0a59, B:50:0x0a66, B:51:0x0aa1, B:56:0x146d, B:58:0x147a, B:59:0x14b1, B:70:0x1567, B:72:0x1574, B:73:0x15a4, B:75:0x15f5, B:77:0x1602, B:78:0x163a, B:81:0x164c, B:83:0x1663, B:84:0x169f, B:92:0x1880, B:94:0x188d, B:95:0x18c4, B:109:0x1a39, B:111:0x1a46, B:112:0x1a82, B:114:0x1b6e, B:116:0x1b7b, B:117:0x1bac, B:127:0x1d13, B:129:0x1d20, B:130:0x1d55, B:132:0x1e26, B:134:0x1e33, B:135:0x1e6c, B:150:0x2167, B:152:0x2174, B:153:0x21b6, B:186:0x2806, B:188:0x2813, B:189:0x2844, B:192:0x28aa, B:194:0x28b7, B:195:0x28f4, B:202:0x2bed, B:204:0x2bfa, B:205:0x2c32, B:260:0x2fba, B:262:0x2fc0, B:263:0x2ff6, B:272:0x3738, B:274:0x374b, B:275:0x3781, B:281:0x38e2, B:283:0x38e8, B:284:0x3919, B:290:0x3a4e, B:292:0x3a72, B:293:0x3abb, B:299:0x3bec, B:301:0x3bf9, B:302:0x3c33, B:308:0x3d54, B:310:0x3d5a, B:311:0x3d8e, B:317:0x3ec9, B:319:0x3ecf, B:320:0x3f06, B:326:0x4028, B:328:0x4050, B:329:0x409c, B:343:0x310a, B:345:0x3110, B:346:0x3142, B:353:0x325c, B:355:0x3262, B:356:0x3291, B:361:0x33b2, B:363:0x33b8, B:364:0x33eb, B:369:0x355a, B:371:0x3560, B:372:0x358d, B:478:0x227a, B:480:0x2287, B:481:0x22c2, B:491:0x1770, B:493:0x1787, B:494:0x17c2, B:509:0x0b74, B:511:0x0b81, B:512:0x0bb5, B:517:0x05b8, B:519:0x05cf, B:520:0x0606, B:525:0x06c2, B:527:0x06d9, B:528:0x071b, B:535:0x07f3, B:537:0x080a, B:538:0x0846, B:543:0x090d, B:545:0x0924, B:546:0x0965, B:554:0x04bb, B:556:0x04d2, B:557:0x050c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x1643  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] d$896c745(java.lang.Object obj) {
        long j2;
        java.lang.String str;
        float f2;
        java.lang.Object d2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object d3;
        java.lang.String str4;
        java.lang.String str5;
        long j3;
        java.lang.Object d4;
        java.lang.Object d5;
        long j4;
        java.lang.Object d6;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        int i6;
        java.lang.Throwable th2;
        java.io.BufferedInputStream bufferedInputStream3;
        java.io.BufferedInputStream bufferedInputStream4;
        char c2;
        java.lang.Object[] objArr;
        long j5;
        long j6;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        int parseInt;
        java.lang.Object d7;
        java.lang.Object invoke;
        java.lang.Object d8;
        java.lang.Object invoke2;
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.Object obj2;
        java.lang.String str6;
        java.lang.String str7;
        try {
            java.lang.Object d9 = com.facetec.sdk.al.d(60475645);
            int i7 = 1;
            int i8 = 0;
            if (d9 == null) {
                char c3 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41372);
                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                byte b2 = (byte) 1;
                byte b3 = (byte) (b2 - 1);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                k(b2, b3, b3, objArr4);
                d9 = com.facetec.sdk.al.c(c3, (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 614, mirror - 24, -1535790587, false, (java.lang.String) objArr4[0], new java.lang.Class[0]);
            }
            java.lang.Object obj3 = null;
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d9).invoke(null, null)).longValue();
            long j7 = 943094335;
            long j8 = -496;
            long j9 = 497;
            long j10 = -1;
            long j11 = j7 ^ j10;
            long j12 = longValue ^ j10;
            long j13 = j11 | j12;
            long uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            long j14 = uptimeMillis ^ j10;
            long j15 = (((((j8 * j7) + (j8 * longValue)) + ((j13 ^ j10) * j9)) + ((((j13 | uptimeMillis) ^ j10) | (((j12 | j14) | j7) ^ j10)) * j9)) + (j9 * (((uptimeMillis | (j12 | j7)) ^ j10) | (((j11 | longValue) ^ j10) | ((j11 | j14) ^ j10))))) - 1470285629;
            int i9 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i10 = ~i9;
            int i11 = ((int) (j15 >> 32)) & ((((-357040129) | i9) * (-676)) + 608928586 + (((~(540102505 | i10)) | 357040128) * 676) + (((~(i9 | 897142633)) | (~(i10 | (-897123906))) | 540083777) * 676));
            int i12 = ~android.os.Process.myUid();
            int i13 = ((int) j15) & (((((~(r2 | (-67713))) | r11) * 590) - 997572653) + (((~((-1982493056) | i12)) | 1107312937 | (~(875247830 | i12))) * (-1180)) + (((~(i12 | 1982493055)) | (~((-875247831) | i12))) * 590));
            if (((i13 ^ i11) | (i11 & i13)) != 0) {
                java.lang.Object[] objArr5 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, new int[]{0}};
                int i14 = ((((-454148114) | r2) * 494) - 1847200219) + (((~((~((int) android.os.Process.getElapsedCpuTime())) | 1155672942)) | (-1601424152)) * 494);
                int i15 = ((i14 ^ 16) + ((i14 & 16) << 1)) - 244638953;
                int i16 = i15 << 13;
                int i17 = (i15 & (~i16)) | ((~i15) & i16);
                int i18 = i17 >>> 17;
                int i19 = (~(i17 & i18)) & (i17 | i18);
                int i20 = i19 << 5;
                ((int[]) objArr5[1])[0] = (i19 & (~i20)) | ((~i19) & i20);
                int i21 = g;
                f = ((i21 & 45) + (i21 | 45)) % 128;
                return objArr5;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            l("ᧇᦵ肇\uf7df舞\u1c8a켵坐栮负巷쓇襁ﾇ\uec6e", android.view.Gravity.getAbsoluteGravity(0, 0), objArr6);
            java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
            int i22 = 1590238701;
            java.lang.Object d10 = com.facetec.sdk.al.d(1590238701);
            if (d10 == null) {
                char c4 = (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int red = android.graphics.Color.red(0);
                int green = android.graphics.Color.green(0);
                byte b4 = (byte) 0;
                byte b5 = b4;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                k(b4, b5, b5, objArr8);
                d10 = com.facetec.sdk.al.c(c4, 2078 - red, green + 24, -114923755, false, (java.lang.String) objArr8[0], new java.lang.Class[]{java.lang.String.class});
            }
            java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) d10).invoke(null, objArr7);
            int i23 = 2;
            float f3 = 0.0f;
            if (str8 != null) {
                int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                short s = (short) ((-2) - (~(-android.os.Process.getGidForName(""))));
                int i24 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                int green2 = android.graphics.Color.green(0);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                m(((scrollBarFadeDuration | (-25182942)) << 1) - (scrollBarFadeDuration ^ (-25182942)), s, (i24 ^ (-30931241)) + ((i24 & (-30931241)) << 1), ((green2 | (-34)) << 1) - (green2 ^ (-34)), (byte) ((-25) - (~(-android.graphics.ImageFormat.getBitsPerPixel(0)))), objArr9);
                java.lang.String str9 = (java.lang.String) objArr9[0];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                l("ኡ\u12c6仠קޛ틭㵏틙捏䍣꿘䅝", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr10);
                java.lang.String[] strArr3 = {str9, (java.lang.String) objArr10[0]};
                int i25 = 0;
                while (i25 < i23) {
                    if (str8.contains(strArr3[i25])) {
                        int i26 = -(-(android.media.AudioTrack.getMaxVolume() > f3 ? 1 : (android.media.AudioTrack.getMaxVolume() == f3 ? 0 : -1)));
                        java.lang.Object[] objArr11 = new java.lang.Object[i7];
                        l("燛熩䰟缵ஏ퀒䟟\uded9!䆚픝䵔銨㌙擏돔┢벋\uf21c≗랚\u2efe膥邼䘁顰༫", (~i26) + (i26 << i7), objArr11);
                        java.lang.Object[] objArr12 = {(java.lang.String) objArr11[i8]};
                        java.lang.Object d11 = com.facetec.sdk.al.d(i22);
                        if (d11 == null) {
                            char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            int capsMode = android.text.TextUtils.getCapsMode("", i8, i8);
                            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                            byte b6 = (byte) i8;
                            byte b7 = b6;
                            java.lang.Object[] objArr13 = new java.lang.Object[i7];
                            k(b6, b7, b7, objArr13);
                            java.lang.String str10 = (java.lang.String) objArr13[i8];
                            java.lang.Class[] clsArr = new java.lang.Class[i7];
                            clsArr[i8] = java.lang.String.class;
                            d11 = com.facetec.sdk.al.c(windowTouchSlop, capsMode + 2078, (maximumFlingVelocity >> 16) + 24, -114923755, false, str10, clsArr);
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) d11).invoke(obj3, objArr12);
                        int i27 = -(-android.text.TextUtils.indexOf("", "", i8, i8));
                        short maximumDrawingCacheSize = (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i28 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i29 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                        int i30 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i31 = i30 * (-51);
                        int i32 = (i31 & 4028) + (i31 | 4028);
                        int i33 = ~com.facetec.sdk.fp.a.c();
                        int i34 = -(-((~((i33 ^ i30) | (i33 & i30) | 76)) * 52));
                        int i35 = ~((i33 & (-77)) | (i33 ^ (-77)));
                        int i36 = ~(i30 | (-77));
                        int i37 = ~i30;
                        j2 = j10;
                        int i38 = ~((i37 ^ i33) | (i33 & i37));
                        int i39 = ~(i37 | 76);
                        byte b8 = (byte) ((((i32 | i34) << 1) - (i32 ^ i34)) + (((i35 ^ i36) | (i35 & i36) | (~(i33 | i30))) * (-52)) + (((i39 & i38) | (i38 ^ i39)) * 52));
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        m((-25182943) - (~i27), maximumDrawingCacheSize, (-30931187) - (~i28), (-35) - (~i29), b8, objArr14);
                        java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0]};
                        java.lang.Object d12 = com.facetec.sdk.al.d(1590238701);
                        if (d12 == null) {
                            char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                            int rgb = android.graphics.Color.rgb(0, 0, 0);
                            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            k(b9, b10, b10, objArr16);
                            d12 = com.facetec.sdk.al.c(resolveOpacity, rgb + 16779294, lastIndexOf + 25, -114923755, false, (java.lang.String) objArr16[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) d12).invoke(null, objArr15);
                        if (invoke3 != null) {
                            int i40 = g;
                            int i41 = (i40 & 113) + (i40 | 113);
                            f = i41 % 128;
                            if (i41 % 2 == 0) {
                                java.lang.Object[] objArr17 = {invoke3, 21};
                                java.lang.Object d13 = com.facetec.sdk.al.d(-582857820);
                                if (d13 == null) {
                                    char c5 = (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                    long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                    byte b11 = (byte) 1;
                                    byte b12 = (byte) (b11 - 1);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    k(b11, b12, b12, objArr18);
                                    d13 = com.facetec.sdk.al.c(c5, (edgeSlop >> 16) + 2365, 23 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), 2058170716, false, (java.lang.String) objArr18[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, objArr17)).longValue();
                                long j16 = -348250384;
                                int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j17 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                long j18 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
                                long j19 = j16 ^ j2;
                                long j20 = longValue2 ^ j2;
                                long j21 = maxMemory;
                                long j22 = j21 ^ j2;
                                obj2 = invoke4;
                                str6 = "";
                                long j23 = (j16 | j21) ^ j2;
                                long j24 = ((-519) * j16) + (j17 * longValue2) + ((((j21 | longValue2) ^ j2) | (((j19 | j20) | j22) ^ j2)) * j18) + ((-1040) * (((j20 | j22) ^ j2) | j23)) + (j18 * (j23 | ((j19 | j22) ^ j2) | ((j20 | j16) ^ j2))) + 1507447782;
                                int nextInt = new java.util.Random().nextInt();
                                int i42 = ((int) (j24 << 84)) & (((((~((-2004040992) | nextInt)) | 1446189067) * 345) - 484646000) + (((~((-2004040992) | (~nextInt))) | (-2013003648)) * 345) + ((~(nextInt | (-1446189068))) * 345));
                                int i43 = ~new java.util.Random().nextInt();
                                int i44 = ((int) j24) & ((((941029750 | r5) * 764) - 733181047) + (((~(i43 | 941029750)) | 1109917833) * (-1528)) + ((1244154281 | (~(1916711135 | i43))) * 764));
                            } else {
                                obj2 = invoke4;
                                str6 = "";
                                java.lang.Object[] objArr19 = {invoke3, 42};
                                java.lang.Object d14 = com.facetec.sdk.al.d(-582857820);
                                if (d14 == null) {
                                    char c6 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str6);
                                    int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                    byte b13 = (byte) 1;
                                    byte b14 = (byte) (b13 - 1);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    k(b13, b14, b14, objArr20);
                                    d14 = com.facetec.sdk.al.c(c6, keyCodeFromString + 2365, resolveOpacity2 + 24, 2058170716, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, objArr19)).longValue();
                                long j25 = 107113798;
                                long j26 = -375;
                                long j27 = 376;
                                long nextInt2 = new java.util.Random().nextInt();
                                long j28 = j25 ^ j2;
                                long j29 = (j25 | longValue3) ^ j2;
                                long j30 = (j26 * j25) + (j26 * longValue3) + (((((longValue3 ^ j2) | j28) ^ j2) | nextInt2 | j29) * j27) + ((-376) * ((((nextInt2 ^ j2) | j25) ^ j2) | j29)) + (j27 * (longValue3 | ((j28 | nextInt2) ^ j2))) + 1052083600;
                                int i45 = ~((~android.os.Process.myUid()) | 1782827250);
                                int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i46 = ~maxMemory2;
                            }
                            int i47 = (android.graphics.PointF.length(f2, f2) > f2 ? 1 : (android.graphics.PointF.length(f2, f2) == f2 ? 0 : -1));
                            short packedPositionType = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i48 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            m(((-25182959) ^ i47) + ((i47 & (-25182959)) << 1), packedPositionType, (((-30931128) | i48) << 1) - (i48 ^ (-30931128)), (-34) - android.view.View.getDefaultSize(0, 0), (byte) (28 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr21);
                            java.lang.String str11 = (java.lang.String) objArr21[0];
                            int i49 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            l("芅苤\u171b㏗乌謋ୣ鬃\uf363᪖", (i49 ^ 48) + ((i49 & 48) << 1), objArr22);
                            java.lang.String str12 = (java.lang.String) objArr22[0];
                            int i50 = -(-android.graphics.Color.blue(0));
                            short threadPriority = (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                            int c7 = com.facetec.sdk.fp.a.c();
                            int i51 = keyRepeatDelay * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                            int i52 = ((i51 | 7310) << 1) - (i51 ^ 7310);
                            int i53 = (~((keyRepeatDelay ^ c7) | (keyRepeatDelay & c7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                            int i55 = (keyRepeatDelay ^ 33) | (keyRepeatDelay & 33);
                            int i56 = ~c7;
                            int i57 = ((i55 ^ i56) | (i55 & i56)) * (-216);
                            int i58 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            m((((-25182956) | i50) << 1) - (i50 ^ (-25182956)), threadPriority, (-30931120) - normalizeMetaState, (i54 ^ i57) + ((i57 & i54) << 1) + (((~((keyRepeatDelay ^ i56) | (keyRepeatDelay & i56))) | (-34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), (byte) ((i58 & 120) + (i58 | 120)), objArr23);
                            java.lang.String str13 = (java.lang.String) objArr23[0];
                            int i59 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            m(((-25182954) ^ i59) + ((i59 & (-25182954)) << 1), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-30931114) - (~(-android.graphics.Color.alpha(0))), (-34) - (~android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) (21 - (~(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr24);
                            java.lang.String str14 = (java.lang.String) objArr24[0];
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            l("編綁\ue76f\ua6fa粄筩鹒꧁ఌ\ueaec", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr25);
                            java.lang.String str15 = (java.lang.String) objArr25[0];
                            int i60 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                            int i61 = i60 * (-183);
                            int i62 = ~com.facetec.sdk.fp.a.c();
                            int i63 = (((i61 | 183) << 1) - (i61 ^ 183)) + ((~((i62 ^ i60) | (i62 & i60))) * (-184));
                            int i64 = ~i60;
                            int i65 = ~i64;
                            int i66 = ~((i64 ^ i62) | (i64 & i62));
                            int i67 = (i66 ^ i65) | (i66 & i65);
                            int i68 = ~i62;
                            int i69 = ((i67 ^ i68) | (i67 & i68)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            l("弩彀㧮Ⴟﯥꗢ⠒⺷⺌㑠몖봩뱌䛻\u0b45䎡\u0bd2", ((i63 ^ i69) + ((i69 & i63) << 1)) - 184, objArr26);
                            java.lang.String str16 = (java.lang.String) objArr26[0];
                            int i70 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            short indexOf = (short) android.text.TextUtils.indexOf(str, str, 0);
                            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                            int i71 = -android.view.KeyEvent.keyCodeFromString(str);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            m((i70 | (-25182951)) + ((-25182951) & i70), indexOf, (-30931103) - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (i71 ^ (-34)) + ((i71 & (-34)) << 1), (byte) (116 - (~(-(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))))), objArr27);
                            java.lang.String str17 = (java.lang.String) objArr27[0];
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            l("ψΡ碇歴㳹\ue495叕\ue9ad爦畞", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr28);
                            java.lang.String str18 = (java.lang.String) objArr28[0];
                            int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                            int c8 = com.facetec.sdk.fp.a.c();
                            int i72 = rgb2 * (-947);
                            int i73 = (612892077 ^ i72) + ((i72 & 612892077) << 1);
                            int i74 = ~rgb2;
                            int i75 = ((~((8405734 ^ c8) | (8405734 & c8))) | i74) * (-948);
                            int i76 = i74 | 8405734;
                            int i77 = ~c8;
                            int i78 = (((i73 & i75) + (i73 | i75)) - (~(-(-((~((i77 ^ i76) | (i77 & i76))) * (-948)))))) - 1;
                            int i79 = -(-((8405734 | rgb2) * 948));
                            short mirror2 = (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            float length = android.graphics.PointF.length(0.0f, 0.0f);
                            int i80 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                            int maximumFlingVelocity2 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                            int c9 = com.facetec.sdk.fp.a.c();
                            int i81 = (maximumFlingVelocity2 * (-109)) + 1554;
                            int i82 = ~maximumFlingVelocity2;
                            int i83 = ~((c9 ^ 14) | (c9 & 14));
                            int i84 = ((i83 ^ i82) | (i82 & i83)) * (-220);
                            int i85 = ~((maximumFlingVelocity2 ^ 14) | (maximumFlingVelocity2 & 14));
                            int i86 = ~(c9 | 14);
                            int i87 = (i81 ^ i84) + ((i81 & i84) << 1) + (((i86 ^ i85) | (i86 & i85)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                            int i88 = ~(i82 | 14);
                            int i89 = ~(maximumFlingVelocity2 | (-15));
                            int i90 = ((i89 ^ i88) | (i89 & i88)) * 110;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            m((i78 & i79) + (i79 | i78), mirror2, (-30931099) - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (i80 & (-34)) + (i80 | (-34)), (byte) ((i87 & i90) + (i90 | i87)), objArr29);
                            java.lang.String str19 = (java.lang.String) objArr29[0];
                            int myPid = android.os.Process.myPid();
                            short s2 = (short) ((-android.view.MotionEvent.axisFromString(str)) - 1);
                            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                            int i91 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int mode = android.view.View.MeasureSpec.getMode(0);
                            int c10 = com.facetec.sdk.fp.a.c();
                            int i92 = (mode * (-830)) + 59904;
                            int i93 = ~c10;
                            int i94 = (mode ^ 72) | (mode & 72);
                            int i95 = -(-(((~((i94 ^ c10) | (i94 & c10))) | (~((i93 & (-73)) | (i93 ^ (-73))))) * (-831)));
                            int i96 = (mode ^ (-73)) | (mode & (-73));
                            int i97 = (i92 ^ i95) + ((i92 & i95) << 1) + ((~((i96 & c10) | (i96 ^ c10))) * (-1662));
                            int i98 = ~mode;
                            int i99 = ~((i98 ^ i93) | (i98 & i93));
                            int i100 = ~((mode ^ c10) | (mode & c10));
                            int i101 = (i100 ^ i99) | (i100 & i99);
                            int i102 = ~((c10 ^ 72) | (c10 & 72));
                            int i103 = -(-(((i102 ^ i101) | (i101 & i102)) * 831));
                            byte b15 = (byte) (((i97 | i103) << 1) - (i103 ^ i97));
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            m((-25182949) - (~(myPid >> 22)), s2, ((-30931097) ^ combineMeasuredStates) + ((combineMeasuredStates & (-30931097)) << 1), (i91 & (-34)) + (i91 | (-34)), b15, objArr30);
                            java.lang.String str20 = (java.lang.String) objArr30[0];
                            int argb = android.graphics.Color.argb(0, 0, 0, 0);
                            short s3 = (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i104 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                            int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            m((-25182948) - argb, s3, ((-30931081) ^ makeMeasureSpec) + ((makeMeasureSpec & (-30931081)) << 1), (i104 ^ (-35)) + ((i104 & (-35)) << 1), (byte) ((argb2 ^ 82) + ((argb2 & 82) << 1)), objArr31);
                            java.lang.String str21 = (java.lang.String) objArr31[0];
                            int i105 = -android.view.KeyEvent.keyCodeFromString(str);
                            short indexOf2 = (short) android.text.TextUtils.indexOf(str, str, 0);
                            int i106 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                            int i107 = -android.view.KeyEvent.getDeadChar(0, 0);
                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            m(((-25182944) & i105) + (i105 | (-25182944)), indexOf2, ((-30931071) & i106) + (i106 | (-30931071)), (i107 & (-34)) + (i107 | (-34)), (byte) (((fadingEdgeLength | 24) << 1) - (fadingEdgeLength ^ 24)), objArr32);
                            java.lang.String str22 = (java.lang.String) objArr32[0];
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            l("騠驐⤞혼\u0cf7딎\uee97\ud9b7\uebcb⒛簜䨵祕嘏출뒥", android.view.View.resolveSize(0, 0), objArr33);
                            java.lang.String str23 = (java.lang.String) objArr33[0];
                            int i108 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            short bitsPerPixel = (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
                            int i109 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                            int i110 = -android.graphics.Color.red(0);
                            int i111 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            int c11 = com.facetec.sdk.fp.a.c();
                            int i112 = (i111 * 46) - 2530;
                            int i113 = ~c11;
                            int i114 = ~((i113 ^ 54) | (i113 & 54));
                            int i115 = -(-(((i114 ^ i111) | (i114 & i111)) * (-90)));
                            int i116 = (i112 ^ i115) + ((i112 & i115) << 1);
                            int i117 = ~((c11 ^ 54) | (c11 & 54));
                            int i118 = ~((i111 ^ (-55)) | (i111 & (-55)));
                            int i119 = ((i117 & i118) | (i117 ^ i118)) * (-45);
                            int i120 = ~i111;
                            int i121 = (~((c11 ^ i120) | (c11 & i120))) | 54;
                            int i122 = ~((i111 ^ i113) | (i111 & i113));
                            byte b16 = (byte) ((((i116 & i119) + (i119 | i116)) - (~(((i122 ^ i121) | (i122 & i121)) * 45))) - 1);
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            m((((-25182945) | i108) << 1) - (i108 ^ (-25182945)), bitsPerPixel, ((-30931063) ^ i109) + ((i109 & (-30931063)) << 1), ((i110 | (-34)) << 1) - (i110 ^ (-34)), b16, objArr34);
                            java.lang.String str24 = (java.lang.String) objArr34[0];
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            l("鉥鈗❅\uf89d膂뭂쀴哋\ue398⫁劥", android.widget.ExpandableListView.getPackedPositionType(0L), objArr35);
                            java.lang.String str25 = (java.lang.String) objArr35[0];
                            int i123 = -android.graphics.Color.blue(0);
                            int i124 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            short s4 = (short) ((~i124) + (i124 << 1));
                            int i125 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                            int i126 = -(android.os.Process.myTid() >> 22);
                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                            int c12 = com.facetec.sdk.fp.a.c();
                            int i127 = ~c12;
                            int i128 = ~((i127 & (-109)) | (i127 ^ (-109)));
                            int i129 = (defaultSize * 165) + 17767 + (((i128 ^ defaultSize) | (i128 & defaultSize)) * (-328));
                            int i130 = ((defaultSize ^ c12) | (defaultSize & c12)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                            int i131 = (i129 & i130) + (i130 | i129);
                            int i132 = ~defaultSize;
                            int i133 = (~((c12 & 108) | (c12 ^ 108))) | (~((i132 ^ 108) | (i132 & 108)));
                            int i134 = defaultSize | i127;
                            int i135 = ~((i134 ^ (-109)) | (i134 & (-109)));
                            int i136 = ((i133 ^ i135) | (i135 & i133)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                            byte b17 = (byte) ((i131 & i136) + (i136 | i131));
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            m(((-25182941) ^ i123) + ((i123 & (-25182941)) << 1), s4, (-30931050) - (~i125), (i126 & (-34)) + (i126 | (-34)), b17, objArr36);
                            java.lang.String str26 = (java.lang.String) objArr36[0];
                            int i137 = -android.view.View.resolveSize(0, 0);
                            short offsetAfter = (short) android.text.TextUtils.getOffsetAfter(str, 0);
                            int indexOf3 = android.text.TextUtils.indexOf(str, str);
                            int i138 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            m((-25182942) - (~i137), offsetAfter, ((-30931042) ^ indexOf3) + ((indexOf3 & (-30931042)) << 1), (i138 & (-33)) + (i138 | (-33)), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) - 36), objArr37);
                            java.lang.String str27 = (java.lang.String) objArr37[0];
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            l("㎇㏴Ṕ\uaafd㿈艅", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr38);
                            java.lang.String str28 = (java.lang.String) objArr38[0];
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            l("媡嫒\u1ad6ꉍ꿣蛀髨窷⭝ᝣࡶ\ue924맅旌맆ឹ๖\uea4f⽺蘼鳦砱峇㓑", android.widget.ExpandableListView.getPackedPositionType(0L), objArr39);
                            java.lang.String str29 = (java.lang.String) objArr39[0];
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            l("ᯛᮨὕ潵瘾荃埃ꍹ樰ዚ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr40);
                            java.lang.String str30 = (java.lang.String) objArr40[0];
                            int i139 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            short defaultSize2 = (short) android.view.View.getDefaultSize(0, 0);
                            int i140 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            m(((-25182942) & i139) + (i139 | (-25182942)), defaultSize2, ((-30931036) & i140) + (i140 | (-30931036)), android.view.View.MeasureSpec.getSize(0) - 34, (byte) ((-49) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr41);
                            java.lang.String str31 = (java.lang.String) objArr41[0];
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            l("ﵙﴪ㙟酪ờ꩜꧀쮒貥㯜㭜堖ḻ䤀諍ꚟꦠ웑᱃㜐", android.graphics.Color.red(0), objArr42);
                            java.lang.String str32 = (java.lang.String) objArr42[0];
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            m((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 25182940, (short) android.graphics.Color.alpha(0), (-30931034) - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 35, (byte) ((-8) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr43);
                            java.lang.String str33 = (java.lang.String) objArr43[0];
                            int indexOf4 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            short green3 = (short) android.graphics.Color.green(0);
                            int i141 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i142 = -android.graphics.Color.rgb(0, 0, 0);
                            int i143 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                            byte b18 = (byte) ((i143 ^ (-107)) + ((i143 & (-107)) << 1));
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            m(indexOf4 - 25182939, green3, (-30931024) - (~i141), ((-16777250) & i142) + (i142 | (-16777250)), b18, objArr44);
                            java.lang.String str34 = (java.lang.String) objArr44[0];
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            l("﹫\ufe1f從䈙ߍ쎎窼튈辆分\ue83a䄖ᴏ₉姻", android.text.TextUtils.getTrimmedLength(str), objArr45);
                            java.lang.String str35 = (java.lang.String) objArr45[0];
                            int i144 = -android.graphics.Color.green(0);
                            int i145 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int c13 = com.facetec.sdk.fp.a.c();
                            int i146 = i145 * (-380);
                            int i147 = ((i146 | 382) << 1) - (i146 ^ 382);
                            int i148 = ~i145;
                            int i149 = -(-(((c13 ^ 1) | (c13 & 1) | i148) * (-381)));
                            int i150 = ((i147 | i149) << 1) - (i147 ^ i149);
                            int i151 = ~(i148 | (-2));
                            int i152 = ~((~c13) | 1);
                            int i153 = -(-(((~((i145 ^ 1) | (i145 & 1))) | (i152 ^ i151) | (i152 & i151)) * 381));
                            int i154 = (i150 & i153) + (i153 | i150);
                            int i155 = (~((i148 ^ 1) | (i148 & 1))) * 381;
                            short s5 = (short) ((i154 & i155) + (i155 | i154));
                            int i156 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int c14 = com.facetec.sdk.fp.a.c();
                            int i157 = i156 * (-949);
                            int i158 = ((-711239735) & i157) + (i157 | (-711239735));
                            int i159 = ~c14;
                            int i160 = ~((30931012 & i159) | (30931012 ^ i159));
                            int i161 = ~i156;
                            int i162 = ~((i161 ^ c14) | (i161 & c14));
                            int i163 = ((i160 ^ i162) | (i160 & i162)) * 1900;
                            int i164 = ~(i159 | i156);
                            int i165 = ~(((-30931013) ^ c14) | ((-30931013) & c14));
                            int i166 = (((i158 | i163) << 1) - (i158 ^ i163)) + (((i164 & i165) | (i164 ^ i165)) * (-950));
                            int i167 = ~((i159 ^ (-30931013)) | ((-30931013) & i159));
                            int i168 = ~(i156 | c14);
                            int i169 = -(-(((i168 ^ i167) | (i168 & i167)) * 950));
                            int i170 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int i171 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                            byte b19 = (byte) ((i171 ^ (-9)) + ((i171 & (-9)) << 1));
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            m(((-25182939) & i144) + (i144 | (-25182939)), s5, (i166 ^ i169) + ((i169 & i166) << 1), (-35) - (~i170), b19, objArr46);
                            java.lang.String str36 = (java.lang.String) objArr46[0];
                            int i172 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            short longPressTimeout = (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                            int i173 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                            int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop();
                            int i174 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            m(((-25182940) & i172) + (i172 | (-25182940)), longPressTimeout, (((-30931003) | i173) << 1) - (i173 ^ (-30931003)), (-34) - (edgeSlop2 >> 16), (byte) ((i174 & (-57)) + (i174 | (-57))), objArr47);
                            java.lang.String str37 = (java.lang.String) objArr47[0];
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            l("㽛㼮顋⨟蔼чኬ偳亽闅而쏡\udc32\ue754ㆩ㵥殯棂", android.os.Process.myTid() >> 22, objArr48);
                            java.lang.String[] strArr4 = {str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, (java.lang.String) objArr48[0]};
                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                            l("ᧇᦵ肇\uf7df舞\u1c8a켵坐栮负巷쓇襁ﾇ\uec6e", android.view.View.getDefaultSize(0, 0), objArr49);
                            java.lang.Object[] objArr50 = {(java.lang.String) objArr49[0]};
                            d2 = com.facetec.sdk.al.d(1590238701);
                            if (d2 == null) {
                                char jumpTapTimeout = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                byte b20 = (byte) 0;
                                byte b21 = b20;
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                k(b20, b21, b21, objArr51);
                                d2 = com.facetec.sdk.al.c(jumpTapTimeout, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 2078, (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 23, -114923755, false, (java.lang.String) objArr51[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr50);
                            if (str2 != null) {
                                int i175 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                short makeMeasureSpec2 = (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i176 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i177 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i178 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                m((-25182943) - (~i175), makeMeasureSpec2, ((-30931194) ^ i176) + ((i176 & (-30931194)) << 1), ((i177 | (-35)) << 1) - (i177 ^ (-35)), (byte) (((i178 | (-23)) << 1) - (i178 ^ (-23))), objArr52);
                                java.lang.String str38 = (java.lang.String) objArr52[0];
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                l("ኡ\u12c6仠קޛ틭㵏틙捏䍣꿘䅝", (-2) - (~(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr53);
                                java.lang.String[] strArr5 = {str38, (java.lang.String) objArr53[0]};
                                int i179 = 0;
                                while (i179 < 2) {
                                    int i180 = f + 99;
                                    g = i180 % 128;
                                    if (i180 % 2 != 0) {
                                        int i181 = 53 / 0;
                                        if (str2.contains(strArr5[i179])) {
                                            int i182 = f;
                                            g = ((i182 ^ 93) + ((i182 & 93) << 1)) % 128;
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            l("燛熩䰟缵ஏ퀒䟟\uded9!䆚픝䵔銨㌙擏돔┢벋\uf21c≗랚\u2efe膥邼䘁顰༫", android.view.View.resolveSize(0, 0), objArr54);
                                            java.lang.Object[] objArr55 = {(java.lang.String) objArr54[0]};
                                            d7 = com.facetec.sdk.al.d(1590238701);
                                            if (d7 == null) {
                                                char normalizeMetaState2 = (char) android.view.KeyEvent.normalizeMetaState(0);
                                                int mode2 = android.view.View.MeasureSpec.getMode(0);
                                                int indexOf5 = android.text.TextUtils.indexOf(str, str, 0, 0);
                                                byte b22 = (byte) 0;
                                                byte b23 = b22;
                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                k(b22, b23, b23, objArr56);
                                                d7 = com.facetec.sdk.al.c(normalizeMetaState2, 2078 - mode2, 24 - indexOf5, -114923755, false, (java.lang.String) objArr56[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            invoke = ((java.lang.reflect.Method) d7).invoke(null, objArr55);
                                            float maxVolume = android.media.AudioTrack.getMaxVolume();
                                            short pressedStateDuration = (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                            int i183 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            int i184 = -(-android.text.TextUtils.indexOf(str, str));
                                            int i185 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                                            m((maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) - 25182943, pressedStateDuration, (((-30931139) | i183) << 1) - (i183 ^ (-30931139)), (i184 & (-34)) + (i184 | (-34)), (byte) ((i185 & 77) + (i185 | 77)), objArr57);
                                            java.lang.Object[] objArr58 = {(java.lang.String) objArr57[0]};
                                            d8 = com.facetec.sdk.al.d(1590238701);
                                            if (d8 == null) {
                                                char c15 = (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                int capsMode2 = android.text.TextUtils.getCapsMode(str, 0, 0);
                                                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                                byte b24 = (byte) 0;
                                                byte b25 = b24;
                                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                k(b24, b25, b25, objArr59);
                                                d8 = com.facetec.sdk.al.c(c15, 2078 - capsMode2, 24 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), -114923755, false, (java.lang.String) objArr59[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            invoke2 = ((java.lang.reflect.Method) d8).invoke(null, objArr58);
                                            if (invoke == null) {
                                                f = (g + 91) % 128;
                                                java.lang.Object[] objArr60 = {invoke, 42};
                                                java.lang.Object d15 = com.facetec.sdk.al.d(-582857820);
                                                if (d15 == null) {
                                                    char trimmedLength = (char) android.text.TextUtils.getTrimmedLength(str);
                                                    int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                                                    byte b26 = (byte) 1;
                                                    byte b27 = (byte) (b26 - 1);
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    k(b26, b27, b27, objArr61);
                                                    d15 = com.facetec.sdk.al.c(trimmedLength, 2364 - lastIndexOf2, (uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)) + 23, 2058170716, false, (java.lang.String) objArr61[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                }
                                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, objArr60)).longValue();
                                                long j31 = -879374108;
                                                long j32 = -560;
                                                strArr = strArr4;
                                                str3 = str;
                                                long nextInt3 = new java.util.Random().nextInt();
                                                long j33 = nextInt3 ^ j2;
                                                long j34 = ((-559) * j31) + (561 * longValue4) + (((j33 | j31) ^ j2) * j32) + (j32 * ((nextInt3 | ((longValue4 ^ j2) | j31)) ^ j2)) + (560 * (((j33 | longValue4) ^ j2) | (((j31 ^ j2) | longValue4) ^ j2))) + 2038571506;
                                                int nextInt4 = new java.util.Random().nextInt(366110066);
                                                int i186 = ((int) (j34 >> 32)) & ((((~((~nextInt4) | (-72418569))) * 130) - 1570961898) + (((~(nextInt4 | (-72418569))) | (-2130685886)) * 130));
                                                int i187 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                int i188 = ~i187;
                                                int i189 = ~((-177228315) | i188);
                                                int i190 = ((int) j34) & (((((~((-1259998096) | i188)) | 1091174789) * (-1188)) - 1402511377) + (((~(i187 | 1259998095)) | 1091174789 | i189) * 594) + (((~(1259998095 | i188)) | 8405008 | i189) * 594));
                                                if (((i186 ^ i190) | (i186 & i190)) == 477111747) {
                                                    strArr2 = strArr;
                                                    int i191 = 0;
                                                    int i192 = 0;
                                                    while (i191 < 28) {
                                                        java.lang.String str39 = strArr2[i191];
                                                        java.lang.String str40 = str3;
                                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                        l("珥珊淞\ue3b5ⷭ\uf1cf\udb08\uf8b8ș恑䦔歬邗ዅ\uf80f间", android.text.TextUtils.getCapsMode(str40, 0, 0), objArr62);
                                                        java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).concat(java.lang.String.valueOf(str39))};
                                                        java.lang.Object d16 = com.facetec.sdk.al.d(2084539986);
                                                        if (d16 == null) {
                                                            char keyRepeatTimeout = (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6935);
                                                            long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter(str40, 0);
                                                            byte b28 = (byte) 0;
                                                            byte b29 = b28;
                                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                            k(b28, b29, b29, objArr64);
                                                            d16 = com.facetec.sdk.al.c(keyRepeatTimeout, 2389 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), 23 - offsetAfter2, -607062870, false, (java.lang.String) objArr64[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d16).invoke(null, objArr63)).longValue();
                                                        long j35 = -576767313;
                                                        int nextInt5 = new java.util.Random().nextInt();
                                                        long j36 = com.visa.cbp.getCertUsage.setODAData;
                                                        long j37 = j35 ^ j2;
                                                        int i193 = i191;
                                                        int i194 = i192;
                                                        long j38 = com.visa.cbp.getCertUsage.getODAData;
                                                        str3 = str40;
                                                        long j39 = nextInt5;
                                                        long j40 = j39 ^ j2;
                                                        long j41 = ((-665) * j35) + (j36 * longValue5) + ((-333) * j37) + ((((j37 | j40) ^ j2) | ((longValue5 | j39) ^ j2)) * j38) + (j38 * (((j40 | longValue5) ^ j2) | ((j37 | j39) ^ j2))) + 1548916655;
                                                        int i195 = ((int) (j41 >> 32)) & (((((~((-616607166) | r2)) | 549496237) * 1504) - 1320242614) + ((~(((int) java.lang.Runtime.getRuntime().freeMemory()) | (-67110929))) * (-1504)) + 948849408);
                                                        int i196 = ((int) j41) & ((((~(1591590910 | r3)) * (-783)) - 1301732781) + (((~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | 114932276)) | 1552158686) * 783));
                                                        int i197 = ((i195 ^ i196) | (i195 & i196)) == 0 ? 0 : 1;
                                                        i192 = (i194 | i197) + (i194 & i197);
                                                        int i198 = (i193 & (-41)) + (i193 | (-41));
                                                        i191 = ((i198 | 42) << 1) - (i198 ^ 42);
                                                    }
                                                    if (i192 >= 25.2d) {
                                                        int i199 = f;
                                                        g = (((i199 | 31) << 1) - (i199 ^ 31)) % 128;
                                                        g = ((i199 & 65) + (i199 | 65)) % 128;
                                                        java.lang.Object[] objArr65 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, new int[]{0}};
                                                        int myPid2 = android.os.Process.myPid();
                                                        int i200 = ~myPid2;
                                                        int i201 = (((~(myPid2 | 782569014)) | (~((-545524785) | i200)) | (-1072693176)) * (-68)) + 932685971 + ((~((-290124162) | i200)) * (-68)) + (((~(i200 | (-782569015))) | (-835648946)) * 68);
                                                        int i202 = (i201 ^ 16) + ((i201 & 16) << 1);
                                                        int i203 = (i202 ^ (-244638953)) + (((-244638953) & i202) << 1);
                                                        int i204 = i203 << 13;
                                                        int i205 = (~(i204 & i203)) & (i204 | i203);
                                                        int i206 = i205 >>> 17;
                                                        int i207 = (~(i205 & i206)) & (i205 | i206);
                                                        int i208 = i207 << 5;
                                                        ((int[]) objArr65[1])[0] = (i207 & (~i208)) | ((~i207) & i208);
                                                        return objArr65;
                                                    }
                                                }
                                            } else {
                                                strArr = strArr4;
                                                str3 = str;
                                            }
                                            if (invoke2 != null) {
                                                int i209 = f;
                                                g = ((i209 & 21) + (i209 | 21)) % 128;
                                                java.lang.Object[] objArr66 = {invoke2, 42};
                                                java.lang.Object d17 = com.facetec.sdk.al.d(-582857820);
                                                if (d17 == null) {
                                                    char makeMeasureSpec3 = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    int makeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                                    byte b30 = (byte) 1;
                                                    byte b31 = (byte) (b30 - 1);
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    k(b30, b31, b31, objArr67);
                                                    d17 = com.facetec.sdk.al.c(makeMeasureSpec3, 2365 - makeMeasureSpec4, 25 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), 2058170716, false, (java.lang.String) objArr67[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d17).invoke(null, objArr66)).longValue();
                                                long j42 = 608144474;
                                                long j43 = 979;
                                                long j44 = longValue6 ^ j2;
                                                strArr2 = strArr;
                                                long myPid3 = android.os.Process.myPid();
                                                long j45 = myPid3 ^ j2;
                                                long j46 = (980 * j42) + ((-978) * longValue6) + (((j44 | j45) ^ j2) * j43) + ((-979) * (j42 | myPid3)) + (j43 * (((j44 | myPid3) ^ j2) | ((j45 | j42) ^ j2))) + 551052924;
                                                int i210 = ((int) (j46 >> 32)) & ((((((~((-372737978) | r2)) | 372409777) * 576) - 1771464918) + (((~((~android.os.Process.myUid()) | (-328201))) | 692078656) * 576)) - 240333248);
                                                int i211 = ((int) j46) & (((((~(2071764944 | r3)) | 785975941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 664662519) + (((~((~((int) android.os.SystemClock.uptimeMillis())) | 2071764944)) | 75563013) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                            }
                                        } else {
                                            int i212 = i179 - 84;
                                            i179 = (i212 | 85) + (i212 & 85);
                                            strArr4 = strArr4;
                                            str = str;
                                        }
                                    } else if (str2.contains(strArr5[i179])) {
                                        int i1822 = f;
                                        g = ((i1822 ^ 93) + ((i1822 & 93) << 1)) % 128;
                                        java.lang.Object[] objArr542 = new java.lang.Object[1];
                                        l("燛熩䰟缵ஏ퀒䟟\uded9!䆚픝䵔銨㌙擏돔┢벋\uf21c≗랚\u2efe膥邼䘁顰༫", android.view.View.resolveSize(0, 0), objArr542);
                                        java.lang.Object[] objArr552 = {(java.lang.String) objArr542[0]};
                                        d7 = com.facetec.sdk.al.d(1590238701);
                                        if (d7 == null) {
                                        }
                                        invoke = ((java.lang.reflect.Method) d7).invoke(null, objArr552);
                                        float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                                        short pressedStateDuration2 = (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                        int i1832 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int i1842 = -(-android.text.TextUtils.indexOf(str, str));
                                        int i1852 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                        java.lang.Object[] objArr572 = new java.lang.Object[1];
                                        m((maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)) - 25182943, pressedStateDuration2, (((-30931139) | i1832) << 1) - (i1832 ^ (-30931139)), (i1842 & (-34)) + (i1842 | (-34)), (byte) ((i1852 & 77) + (i1852 | 77)), objArr572);
                                        java.lang.Object[] objArr582 = {(java.lang.String) objArr572[0]};
                                        d8 = com.facetec.sdk.al.d(1590238701);
                                        if (d8 == null) {
                                        }
                                        invoke2 = ((java.lang.reflect.Method) d8).invoke(null, objArr582);
                                        if (invoke == null) {
                                        }
                                        if (invoke2 != null) {
                                        }
                                    } else {
                                        int i2122 = i179 - 84;
                                        i179 = (i2122 | 85) + (i2122 & 85);
                                        strArr4 = strArr4;
                                        str = str;
                                    }
                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                    l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.text.TextUtils.getTrimmedLength(str3), objArr68);
                                    java.lang.Object[] objArr69 = {(java.lang.String) objArr68[0]};
                                    d3 = com.facetec.sdk.al.d(-864328554);
                                    if (d3 != null) {
                                        str4 = str3;
                                        char indexOf6 = (char) ((-1) - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                                        byte b32 = (byte) 3;
                                        byte b33 = (byte) (b32 - 3);
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        k(b32, b33, b33, objArr70);
                                        d3 = com.facetec.sdk.al.c(indexOf6, 2341 - absoluteGravity, 24 - (tapTimeout >> 16), 1804869230, false, (java.lang.String) objArr70[0], new java.lang.Class[]{java.lang.String.class});
                                    } else {
                                        str4 = str3;
                                    }
                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr69)).longValue();
                                    long j47 = -706044303;
                                    long j48 = 503;
                                    long j49 = -502;
                                    long j50 = j47 | longValue7;
                                    long j51 = j47 ^ j2;
                                    str5 = str4;
                                    long nextInt6 = new java.util.Random().nextInt();
                                    long j52 = j51 | (nextInt6 ^ j2);
                                    long j53 = (nextInt6 | j50) ^ j2;
                                    long j54 = (j47 * j48) + (j48 * longValue7) + (j50 * j49) + (j49 * ((((longValue7 ^ j2) | j51) ^ j2) | (j52 ^ j2) | j53)) + (502 * (((j52 | longValue7) ^ j2) | j53)) + 1754242723;
                                    int myUid = android.os.Process.myUid();
                                    int i213 = ((int) (j54 >> 32)) & (((((~(1365820387 | myUid)) | (-1508698100)) * 345) - 484646000) + (((~(1365820387 | (~myUid))) | 16777602) * 345) + ((~(myUid | 1508698099)) * 345));
                                    int i214 = ((int) j54) & (((((~(2054155946 | r3)) | (-2146434988)) * 305) - 1704616964) + (((~((~android.os.Process.myUid()) | 2054155946)) | (-803584940)) * 305));
                                    j3 = (i213 ^ i214) | (i213 & i214);
                                    int i215 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    short s6 = (short) ((-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
                                    int i216 = -(-android.view.View.MeasureSpec.getSize(0));
                                    int offsetAfter3 = android.text.TextUtils.getOffsetAfter(str5, 0);
                                    java.lang.Object[] objArr71 = new java.lang.Object[1];
                                    m((((-25183010) | i215) << 1) - (i215 ^ (-25183010)), s6, ((-30930988) & i216) + (i216 | (-30930988)), (offsetAfter3 & (-34)) + (offsetAfter3 | (-34)), (byte) (android.text.TextUtils.indexOf(str5, str5, 0) - 62), objArr71);
                                    java.lang.Object[] objArr72 = {(java.lang.String) objArr71[0]};
                                    d4 = com.facetec.sdk.al.d(-864328554);
                                    if (d4 == null) {
                                        char combineMeasuredStates2 = (char) android.view.View.combineMeasuredStates(0, 0);
                                        int size = android.view.View.MeasureSpec.getSize(0);
                                        int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str5);
                                        byte b34 = (byte) 3;
                                        byte b35 = (byte) (b34 - 3);
                                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                                        k(b34, b35, b35, objArr73);
                                        d4 = com.facetec.sdk.al.c(combineMeasuredStates2, size + 2341, keyCodeFromString2 + 24, 1804869230, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr72)).longValue();
                                    long j55 = 825866529;
                                    long j56 = 988;
                                    long j57 = longValue8 ^ j2;
                                    long elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                    long j58 = elapsedRealtime2 ^ j2;
                                    long j59 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j55) + ((-987) * longValue8) + (((((j57 | j58) | j55) ^ j2) | (((j55 | longValue8) | elapsedRealtime2) ^ j2)) * j56) + ((-988) * (j55 | j57)) + (j56 * (((j57 | elapsedRealtime2) ^ j2) | (((j55 ^ j2) | j57) ^ j2) | ((longValue8 | (j58 | j55)) ^ j2))) + 222331891;
                                    int i217 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                                    int i218 = ((int) (j59 >> 32)) & ((((~(477266515 | i217)) | (-1031263064)) * (-160)) + 590662346 + (((~(i217 | (-959959896))) | 477266515) * 160));
                                    int myPid4 = android.os.Process.myPid();
                                    int i219 = ((int) j59) & (((((~((-1535644055) | r5)) | 1250431126) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1250431127) | myPid4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(myPid4 | (-285212929))) | (~((~myPid4) | (-1322096832))) | 71665705) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                    long j60 = (i218 ^ i219) | (i218 & i219);
                                    if (j3 > 0) {
                                        int i220 = f;
                                        g = ((i220 & 101) + (i220 | 101)) % 128;
                                        if (j60 > 0) {
                                            com.facetec.sdk.fp.a.c();
                                            com.facetec.sdk.fp.a.c();
                                            if (j60 - 3 < j3) {
                                                com.facetec.sdk.fp.a.c();
                                                com.facetec.sdk.fp.a.c();
                                                int i221 = f;
                                                g = ((i221 & 101) + (i221 | 101)) % 128;
                                                java.lang.Object[] objArr74 = {null, new int[1], new int[]{247}, new int[]{0}};
                                                int i222 = ~(((int) java.lang.Runtime.getRuntime().maxMemory()) | 1396352348);
                                                int i223 = (((-221865612) | i222) * (-220)) + 1962740149 + ((i222 | (-1597761504)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1704863330;
                                                int i224 = ((i223 | 16) << 1) - (i223 ^ 16);
                                                int i225 = (i224 ^ (-244638953)) + ((i224 & (-244638953)) << 1);
                                                int i226 = i225 << 13;
                                                int i227 = ((~i226) & i225) | ((~i225) & i226);
                                                int i228 = i227 >>> 17;
                                                int i229 = (i227 & (~i228)) | ((~i227) & i228);
                                                int i230 = i229 << 5;
                                                ((int[]) objArr74[1])[0] = (~(i229 & i230)) & (i229 | i230);
                                                return objArr74;
                                            }
                                        }
                                    }
                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                    l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr75);
                                    java.lang.Object[] objArr76 = {(java.lang.String) objArr75[0]};
                                    d5 = com.facetec.sdk.al.d(-864328554);
                                    if (d5 == null) {
                                        char threadPriority2 = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                        int resolveOpacity3 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                        int mode3 = android.view.View.MeasureSpec.getMode(0);
                                        byte b36 = (byte) 3;
                                        byte b37 = (byte) (b36 - 3);
                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                        k(b36, b37, b37, objArr77);
                                        d5 = com.facetec.sdk.al.c(threadPriority2, resolveOpacity3 + 2341, 24 - mode3, 1804869230, false, (java.lang.String) objArr77[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr76)).longValue();
                                    long j61 = 164638394;
                                    long j62 = 868;
                                    long j63 = j61 ^ j2;
                                    long maxMemory3 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    long j64 = maxMemory3 ^ j2;
                                    long j65 = longValue9 ^ j2;
                                    long j66 = j63 | j65;
                                    long j67 = (j62 * j61) + (j62 * longValue9) + ((-867) * (((j63 | j64) ^ j2) | ((j65 | j64) ^ j2))) + ((-1734) * ((j66 ^ j2) | ((j63 | maxMemory3) ^ j2) | ((j65 | maxMemory3) ^ j2))) + (867 * ((((longValue9 | j63) | maxMemory3) ^ j2) | ((j66 | j64) ^ j2) | (((j65 | j61) | maxMemory3) ^ j2))) + 883560026;
                                    int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                                    int i231 = ((int) (j67 >> 32)) & (((~(2009050072 | uptimeMillis3)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1075948654 + (((~((~uptimeMillis3) | 2009050072)) | 1437247952) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                    int i232 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                    int i233 = ~i232;
                                    int i234 = ~(i232 | (-1708154893));
                                    int i235 = ((int) j67) & ((((~((-304549620) | i233)) | 270928482 | i234) * (-502)) + 1424885377 + ((i234 | (~(i233 | (-33621138)))) * 502));
                                    j4 = (i235 ^ i231) | (i231 & i235);
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    l("쮚쮵쒄ۭ胑墂㹌喁", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr78);
                                    java.lang.Object[] objArr79 = {(java.lang.String) objArr78[0]};
                                    d6 = com.facetec.sdk.al.d(-864328554);
                                    if (d6 == null) {
                                        char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                                        int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                        byte b38 = (byte) 3;
                                        byte b39 = (byte) (b38 - 3);
                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                        k(b38, b39, b39, objArr80);
                                        d6 = com.facetec.sdk.al.c(scrollBarSize, 2342 - (elapsedRealtime3 > 0L ? 1 : (elapsedRealtime3 == 0L ? 0 : -1)), 23 - bitsPerPixel2, 1804869230, false, (java.lang.String) objArr80[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr79)).longValue();
                                    long j68 = -1093610948;
                                    long j69 = j68 ^ j2;
                                    long j70 = longValue10 ^ j2;
                                    long myUid2 = android.os.Process.myUid();
                                    long j71 = 490;
                                    long j72 = (491 * j68) + ((-489) * longValue10) + ((j69 | j70 | (myUid2 ^ j2)) * (-490)) + ((((j70 | myUid2) ^ j2) | ((j70 | j68) ^ j2)) * j71) + (j71 * j69) + 2141809368;
                                    int myTid = android.os.Process.myTid();
                                    int i236 = ((int) (j72 >> 32)) & (((((~(1773922814 | myTid)) | (~((-553650561) | r4))) * 497) - 1071071599) + (((~(myTid | (-553650561))) | (~((~myTid) | 1637468630)) | 136454184) * 497));
                                    int myUid3 = android.os.Process.myUid();
                                    int i237 = ~myUid3;
                                    int i238 = ((int) j72) & ((((592136 | myUid3) * 988) - 1332283447) + (((~((-1268840018) | i237)) | 1101045761) * (-1976)) + (((~(myUid3 | 168386392)) | 592136 | (~(i237 | (-168386393)))) * 988));
                                    long j73 = (i236 ^ i238) | (i236 & i238);
                                    if (j4 <= 0 && j73 > 0 && j73 + 100 < j4) {
                                        java.lang.Object[] objArr81 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, new int[]{0}};
                                        int i239 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                        int i240 = (((~((-1082252594) | r3)) * 979) - 621032570) + ((535965366 | i239) * (-979)) + (((~(i239 | (-1082252594))) | (~((~i239) | 535965366))) * 979);
                                        int i241 = ((i240 | 16) << 1) - (i240 ^ 16);
                                        int c16 = com.facetec.sdk.fp.a.c();
                                        int i242 = i241 * (-432);
                                        int i243 = ~i241;
                                        int i244 = ~c16;
                                        int i245 = (i244 ^ i243) | (i244 & i243);
                                        int i246 = -(-((~((i245 ^ (-244638953)) | (i245 & (-244638953)))) * 433));
                                        int i247 = ~((244638952 & c16) | (244638952 ^ c16));
                                        int i248 = ~(c16 | i243);
                                        int i249 = ~((i241 ^ (-244638953)) | (i241 & (-244638953)));
                                        int i250 = (((((((1200876798 | i242) << 1) - (i242 ^ 1200876798)) - (~i246)) - 1) - (~(-(-(((i247 ^ i243) | (i247 & i243)) * (-433)))))) - 1) + (((i249 ^ i248) | (i249 & i248)) * 433);
                                        int i251 = i250 << 13;
                                        int i252 = ((~i251) & i250) | ((~i250) & i251);
                                        int i253 = i252 >>> 17;
                                        int i254 = (i252 & (~i253)) | ((~i252) & i253);
                                        ((int[]) objArr81[1])[0] = i254 ^ (i254 << 5);
                                        return objArr81;
                                    }
                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                    l("뼈뼧굻㞃햲ㅪ༾ç컴ꃴ鶢", (-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1, objArr82);
                                    java.lang.String str41 = (java.lang.String) objArr82[0];
                                    int i255 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    short s7 = (short) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                                    int i256 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                    int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                    int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                    m(((i255 & (-25183009)) << 1) + (i255 ^ (-25183009)), s7, ((-30930971) & i256) + (i256 | (-30930971)), ((longPressTimeout2 | (-34)) << 1) - (longPressTimeout2 ^ (-34)), (byte) (((absoluteGravity2 | (-38)) << 1) - (absoluteGravity2 ^ (-38))), objArr83);
                                    java.lang.String str42 = (java.lang.String) objArr83[0];
                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                    l("豯豀嵆뫖ྕ셗艫\udac0ﶓ僉ჷ䤔漌≖ꅫ럍", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr84);
                                    java.lang.String str43 = (java.lang.String) objArr84[0];
                                    int i257 = -android.view.KeyEvent.getDeadChar(0, 0);
                                    short packedPositionType2 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                                    int i258 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    int i259 = -(-android.view.View.MeasureSpec.getSize(0));
                                    int i260 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                    m(((i257 | (-25183009)) << 1) - (i257 ^ (-25183009)), packedPositionType2, ((-30930961) ^ i258) + ((i258 & (-30930961)) << 1), (i259 & (-34)) + (i259 | (-34)), (byte) ((i260 & 87) + (i260 | 87)), objArr85);
                                    java.lang.String str44 = (java.lang.String) objArr85[0];
                                    int i261 = -(-android.view.View.MeasureSpec.getSize(0));
                                    int i262 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    int capsMode3 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    m((i261 ^ (-25183009)) + ((i261 & (-25183009)) << 1), (short) ((i262 & 1) + (i262 | 1)), ((-30930948) & capsMode3) + (capsMode3 | (-30930948)), (-33) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (-android.os.Process.getGidForName(str5)), objArr86);
                                    java.lang.String str45 = (java.lang.String) objArr86[0];
                                    int gidForName = android.os.Process.getGidForName(str5);
                                    short s8 = (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                    int size2 = android.view.View.MeasureSpec.getSize(0);
                                    int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                    m((((-25183008) | gidForName) << 1) - (gidForName ^ (-25183008)), s8, size2 - 30930937, (scrollBarSize2 & (-34)) + (scrollBarSize2 | (-34)), (byte) (14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr87);
                                    java.lang.String str46 = (java.lang.String) objArr87[0];
                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                    l("櫾櫑\uefb8㴃쏩玿ֳᚬ", 0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr88);
                                    java.lang.String[] strArr6 = {str41, str42, str43, str44, str45, str46, (java.lang.String) objArr88[0]};
                                    for (i2 = 0; i2 < 7; i2++) {
                                        int i263 = g;
                                        int i264 = (i263 ^ 47) + ((i263 & 47) << 1);
                                        f = i264 % 128;
                                        if (i264 % 2 == 0) {
                                            java.lang.Object[] objArr89 = {strArr6[i2]};
                                            java.lang.Object d18 = com.facetec.sdk.al.d(493527529);
                                            if (d18 == null) {
                                                char c17 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                                int indexOf7 = android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout();
                                                byte b40 = (byte) 1;
                                                byte b41 = (byte) (b40 - 1);
                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                k(b40, b41, b41, objArr90);
                                                d18 = com.facetec.sdk.al.c(c17, 1011 - indexOf7, 24 - (jumpTapTimeout2 >> 16), -1165632751, false, (java.lang.String) objArr90[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d18).invoke(null, objArr89)).longValue();
                                            long j74 = -1792293658;
                                            long j75 = -661;
                                            long nextInt7 = new java.util.Random().nextInt();
                                            long j76 = j74 ^ j2;
                                            long j77 = longValue11 ^ j2;
                                            long j78 = (((((j75 * j74) + (j75 * longValue11)) + (((nextInt7 ^ j2) | ((j76 | j77) ^ j2)) * 1324)) + ((-1324) * (((j74 | nextInt7) ^ j2) | ((nextInt7 | longValue11) ^ j2)))) + (662 * (((longValue11 | j76) ^ j2) | ((j77 | j74) ^ j2)))) - 222304383;
                                            int i265 = ((int) (j78 << 114)) & ((((((~(1417308568 | r7)) | (-1442539965)) * 1504) - 1320242614) + ((~(((int) java.lang.Runtime.getRuntime().freeMemory()) | (-25231397))) * (-1504))) - 915875392);
                                            int nextInt8 = new java.util.Random().nextInt();
                                            int i266 = ((int) j78) & (((((~(1436417449 | (~nextInt8))) | (~((-808961) | nextInt8))) * (-272)) - 452191291) + (((~(1435262081 | nextInt8)) | 1155368) * (-272)) + (((~(nextInt8 | (-1435262082))) | (-1964329)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                                            if (((i266 ^ i265) | (i265 & i266)) != 0) {
                                                int c18 = com.facetec.sdk.fp.a.c();
                                                int i267 = ~i2;
                                                int i268 = ~c18;
                                                int i269 = (i268 & i267) | (i267 ^ i268);
                                                int i270 = ~((i269 ^ 90) | (i269 & 90));
                                                int i271 = (i2 ^ 90) | (i2 & 90);
                                                int i272 = ~((i271 ^ c18) | (i271 & c18));
                                                int i273 = (((89009 - (~(i2 * (-987)))) - (~(-(-(((i270 ^ i272) | (i270 & i272)) * 988))))) - 1) + (((i267 ^ 90) | (i267 & 90)) * (-988));
                                                int i274 = ~(i267 | (-91));
                                                int i275 = ~((c18 ^ i267) | (i267 & c18));
                                                int i276 = (i275 ^ i274) | (i275 & i274);
                                                int i277 = (i268 & 90) | (i268 ^ 90);
                                                int i278 = ~((i2 ^ i277) | (i277 & i2));
                                                int i279 = -(-(((i276 ^ i278) | (i278 & i276)) * 988));
                                                i3 = (i279 ^ i273) + ((i279 & i273) << 1);
                                                break;
                                            }
                                        } else {
                                            java.lang.Object[] objArr91 = {strArr6[i2]};
                                            java.lang.Object d19 = com.facetec.sdk.al.d(493527529);
                                            if (d19 == null) {
                                                char packedPositionGroup = (char) android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                int mode4 = android.view.View.MeasureSpec.getMode(0);
                                                int packedPositionType3 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                byte b42 = (byte) 1;
                                                byte b43 = (byte) (b42 - 1);
                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                k(b42, b43, b43, objArr92);
                                                d19 = com.facetec.sdk.al.c(packedPositionGroup, mode4 + 1012, packedPositionType3 + 24, -1165632751, false, (java.lang.String) objArr92[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr91)).longValue();
                                            long j79 = -1609266240;
                                            long j80 = -68;
                                            long j81 = j79 ^ j2;
                                            long j82 = longValue12 ^ j2;
                                            long uptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
                                            long j83 = uptimeMillis4 ^ j2;
                                            long j84 = (((((69 * j79) + ((-67) * longValue12)) + ((((((j81 | j82) | j83) ^ j2) | ((j79 | longValue12) ^ j2)) | ((uptimeMillis4 | longValue12) ^ j2)) * j80)) + (j80 * ((longValue12 | (j81 | j83)) ^ j2))) + (68 * (((j82 | j83) ^ j2) | j81))) - 405331801;
                                            int i280 = (int) (j84 >> 32);
                                            int myTid2 = android.os.Process.myTid();
                                            int i281 = ~myTid2;
                                            int i282 = (int) j84;
                                            int maxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                            int i283 = ~maxMemory4;
                                            if (((i280 & (((((~(1335831958 | i281)) | 101394452) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1261012638) + (((~(i281 | 109784340)) | 1327442070) * (-440)) + ((myTid2 | 1335831958) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | ((((((-2629921) | maxMemory4) * (-676)) - 977578887) + (((~((-451426149) | i283)) | 2629920) * 676) + (((~((-448796229) | maxMemory4)) | (~(985800261 | i283)) | (-988430182)) * 676)) & i282)) != 0) {
                                                int c182 = com.facetec.sdk.fp.a.c();
                                                int i2672 = ~i2;
                                                int i2682 = ~c182;
                                                int i2692 = (i2682 & i2672) | (i2672 ^ i2682);
                                                int i2702 = ~((i2692 ^ 90) | (i2692 & 90));
                                                int i2712 = (i2 ^ 90) | (i2 & 90);
                                                int i2722 = ~((i2712 ^ c182) | (i2712 & c182));
                                                int i2732 = (((89009 - (~(i2 * (-987)))) - (~(-(-(((i2702 ^ i2722) | (i2702 & i2722)) * 988))))) - 1) + (((i2672 ^ 90) | (i2672 & 90)) * (-988));
                                                int i2742 = ~(i2672 | (-91));
                                                int i2752 = ~((c182 ^ i2672) | (i2672 & c182));
                                                int i2762 = (i2752 ^ i2742) | (i2752 & i2742);
                                                int i2772 = (i2682 & 90) | (i2682 ^ 90);
                                                int i2782 = ~((i2 ^ i2772) | (i2772 & i2));
                                                int i2792 = -(-(((i2762 ^ i2782) | (i2782 & i2762)) * 988));
                                                i3 = (i2792 ^ i2732) + ((i2792 & i2732) << 1);
                                                break;
                                            }
                                        }
                                    }
                                    i3 = 0;
                                    if (i3 == 0) {
                                        java.lang.Object[] objArr93 = {null, new int[1], new int[]{i3}, new int[]{0}};
                                        int maxMemory5 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                        int i284 = (((~((-1244454197) | maxMemory5)) | 1550578567) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 593042035 + (((~((~maxMemory5) | (-1244454197))) | 1550578567) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 16;
                                        int i285 = (i284 ^ (-244638953)) + (((-244638953) & i284) << 1);
                                        int i286 = i285 << 13;
                                        int i287 = (~(i286 & i285)) & (i285 | i286);
                                        int i288 = i287 >>> 17;
                                        int i289 = (~(i287 & i288)) & (i287 | i288);
                                        int i290 = i289 << 5;
                                        ((int[]) objArr93[1])[0] = (i289 & (~i290)) | ((~i289) & i290);
                                        return objArr93;
                                    }
                                    try {
                                        objArr2 = new java.lang.Object[1];
                                        l("⒙⓫꣓愵⤛㓞姟ﱟ啤ꕐ쬕濑잧\ud7c9窎酞灵", android.view.KeyEvent.getDeadChar(0, 0), objArr2);
                                    } catch (java.lang.Exception unused) {
                                    }
                                    try {
                                        java.lang.Object[] objArr94 = {(java.lang.String) objArr2[0]};
                                        java.lang.Object d20 = com.facetec.sdk.al.d(1590238701);
                                        if (d20 == null) {
                                            char myTid3 = (char) (android.os.Process.myTid() >> 22);
                                            int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                            int alpha = android.graphics.Color.alpha(0);
                                            byte b44 = (byte) 0;
                                            byte b45 = b44;
                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                            k(b44, b45, b45, objArr95);
                                            d20 = com.facetec.sdk.al.c(myTid3, (minimumFlingVelocity >> 16) + 2078, alpha + 24, -114923755, false, (java.lang.String) objArr95[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.Object invoke5 = ((java.lang.reflect.Method) d20).invoke(null, objArr94);
                                        try {
                                            if (invoke5 != null) {
                                                f = (g + 87) % 128;
                                                int i291 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                short offsetBefore = (short) android.text.TextUtils.getOffsetBefore(str5, 0);
                                                int i292 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                int c19 = com.facetec.sdk.fp.a.c();
                                                int i293 = (i292 * 860) + 768936738;
                                                int i294 = -(-((i292 | c19) * (-859)));
                                                int i295 = (i293 & i294) + (i293 | i294);
                                                int i296 = ~c19;
                                                int i297 = ~((i296 & i292) | (i296 ^ i292));
                                                int i298 = ~i292;
                                                int i299 = (i298 ^ 30930932) | (30930932 & i298);
                                                int i300 = ~((c19 ^ i299) | (i299 & c19));
                                                int i301 = -(-(((i300 ^ i297) | (i297 & i300)) * 859));
                                                int i302 = (i295 & i301) + (i301 | i295);
                                                int i303 = ~((30930932 & i296) | (i296 ^ 30930932));
                                                int i304 = ~((i292 ^ 30930932) | (30930932 & i292));
                                                int i305 = ((i304 ^ i303) | (i304 & i303)) * 859;
                                                int i306 = -(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                                int i307 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                m((-25182958) - (~i291), offsetBefore, ((i302 | i305) << 1) - (i305 ^ i302), (i306 ^ (-33)) + ((i306 & (-33)) << 1), (byte) ((i307 ^ 99) + ((i307 & 99) << 1)), objArr96);
                                                try {
                                                    java.lang.Object[] objArr97 = {invoke5, new java.lang.String[]{(java.lang.String) objArr96[0]}};
                                                    java.lang.Object d21 = com.facetec.sdk.al.d(-1033567267);
                                                    if (d21 == null) {
                                                        char scrollBarSize3 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                        long packedPositionForChild2 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                                        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                                                        byte b46 = (byte) 1;
                                                        byte b47 = (byte) (b46 - 1);
                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                        k(b46, b47, b47, objArr98);
                                                        d21 = com.facetec.sdk.al.c(scrollBarSize3, 661 - (packedPositionForChild2 > 0L ? 1 : (packedPositionForChild2 == 0L ? 0 : -1)), 24 - (elapsedRealtime4 > 0L ? 1 : (elapsedRealtime4 == 0L ? 0 : -1)), 1703573797, false, (java.lang.String) objArr98[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                    }
                                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d21).invoke(null, objArr97)).longValue();
                                                    long j85 = 430553742;
                                                    long j86 = -159;
                                                    long j87 = 160;
                                                    long myTid4 = android.os.Process.myTid() ^ j2;
                                                    long j88 = (j86 * j85) + (j86 * longValue13) + (((j85 ^ j2) | longValue13) * j87) + ((-160) * (((myTid4 | j85) ^ j2) | ((j85 | longValue13) ^ j2))) + (j87 * ((((longValue13 ^ j2) | myTid4) ^ j2) | j85)) + 192375516;
                                                    int i308 = ~((int) android.os.SystemClock.elapsedRealtime());
                                                    int uptimeMillis5 = (int) android.os.SystemClock.uptimeMillis();
                                                    int i309 = i308 | (-1116088966);
                                                    if (((((int) j88) & ((((~((-363877931) | uptimeMillis5)) * (-301)) - 2145309498) + (((~(498620010 | uptimeMillis5)) | (~((~uptimeMillis5) | (-938606400)))) * (-301)) + (((~(uptimeMillis5 | 938606399)) | 498620010) * 301))) | (((int) (j88 >> 32)) & ((((~i309) | (-1741651920)) * (-828)) + 1754752898 + (i309 * (-828)) + 703694380))) == 0) {
                                                        i4 = 0;
                                                        if (i4 != 0) {
                                                            java.lang.Object[] objArr99 = {null, new int[1], new int[]{i4}, new int[]{0}};
                                                            int i310 = ~((~((int) android.os.Process.getElapsedCpuTime())) | 373069098);
                                                            int i311 = ((336101634 | i310) * (-374)) + 1825247843 + ((i310 | 36967464) * 374);
                                                            int c20 = com.facetec.sdk.fp.a.c();
                                                            int i312 = (i311 * (-494)) - 7904;
                                                            int i313 = -(-((~((i311 ^ 16) | (i311 & 16))) * (-495)));
                                                            int i314 = ~c20;
                                                            int i315 = (i314 ^ 16) | (i314 & 16);
                                                            int i316 = -(-(i315 * 495));
                                                            int i317 = ~i311;
                                                            int i318 = ~((i317 ^ (-17)) | (i317 & (-17)));
                                                            int i319 = ~i315;
                                                            int i320 = ((((i312 ^ i313) + ((i312 & i313) << 1)) - (~i316)) - 1) + (((i319 ^ i318) | (i319 & i318)) * 495);
                                                            int i321 = (i320 & (-244638953)) + ((-244638953) | i320);
                                                            int i322 = (i321 << 13) ^ i321;
                                                            int i323 = i322 ^ (i322 >>> 17);
                                                            ((int[]) objArr99[1])[0] = i323 ^ (i323 << 5);
                                                            return objArr99;
                                                        }
                                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                        l("⒙⓫꣓愵⤛㓞姟ﱟ啤ꕐ쬕濑잧\ud7c9窎酞灵", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr100);
                                                        java.lang.Object[] objArr101 = {(java.lang.String) objArr100[0]};
                                                        java.lang.Object d22 = com.facetec.sdk.al.d(1590238701);
                                                        if (d22 == null) {
                                                            char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                                                            int keyCodeFromString3 = android.view.KeyEvent.keyCodeFromString(str5);
                                                            int green4 = android.graphics.Color.green(0);
                                                            byte b48 = (byte) 0;
                                                            byte b49 = b48;
                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                            k(b48, b49, b49, objArr102);
                                                            d22 = com.facetec.sdk.al.c(touchSlop, 2078 - keyCodeFromString3, 24 - green4, -114923755, false, (java.lang.String) objArr102[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        java.lang.Object invoke6 = ((java.lang.reflect.Method) d22).invoke(null, objArr101);
                                                        if (invoke6 != null) {
                                                            int scrollBarSize4 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                                            short s9 = (short) (0 - (~(-(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))));
                                                            float length2 = android.graphics.PointF.length(0.0f, 0.0f);
                                                            int i324 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int threadPriority3 = android.os.Process.getThreadPriority(0);
                                                            int i325 = -((((threadPriority3 | 20) << 1) - (threadPriority3 ^ 20)) >> 6);
                                                            byte b50 = (byte) ((i325 ^ 99) + ((i325 & 99) << 1));
                                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                            m(((-25182957) ^ scrollBarSize4) + ((scrollBarSize4 & (-25182957)) << 1), s9, (-30930933) - (~(length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1))), (i324 & (-35)) + (i324 | (-35)), b50, objArr103);
                                                            java.lang.Object[] objArr104 = {invoke6, new java.lang.String[]{(java.lang.String) objArr103[0]}};
                                                            java.lang.Object d23 = com.facetec.sdk.al.d(-1033567267);
                                                            if (d23 == null) {
                                                                char maxKeyCode = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                                int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                int pressedStateDuration3 = android.view.ViewConfiguration.getPressedStateDuration();
                                                                byte b51 = (byte) 1;
                                                                byte b52 = (byte) (b51 - 1);
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                k(b51, b52, b52, objArr105);
                                                                d23 = com.facetec.sdk.al.c(maxKeyCode, lastIndexOf3 + 663, 23 - (pressedStateDuration3 >> 16), 1703573797, false, (java.lang.String) objArr105[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                            }
                                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr104)).longValue();
                                                            long j89 = -128282565;
                                                            long j90 = 765;
                                                            long j91 = j89 ^ j2;
                                                            long j92 = longValue14 ^ j2;
                                                            long j93 = j91 | j92;
                                                            long nextInt9 = new java.util.Random().nextInt();
                                                            long j94 = nextInt9 ^ j2;
                                                            long j95 = ((-1529) * j89) + ((-764) * longValue14) + (((((longValue14 | j91) | nextInt9) ^ j2) | ((j93 | j94) ^ j2) | (((j92 | j89) | nextInt9) ^ j2)) * j90) + (1530 * ((j93 ^ j2) | ((j91 | j94) ^ j2))) + (j90 * (((j91 | nextInt9) ^ j2) | ((j89 | (j92 | j94)) ^ j2))) + 751211823;
                                                            int myUid4 = android.os.Process.myUid();
                                                            int i326 = ((int) (j95 >> 32)) & ((((~((~myUid4) | (-811614870))) * (-116)) - 2072279902) + (((-1911842750) | myUid4) * 116) + (((~(myUid4 | 945898135)) | (-2046126016)) * 116));
                                                            int i327 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                                                            int i328 = ((int) j95) & ((((r4 | (-1811831519)) * 614) - 562284677) + (((~(1893070916 | i327)) | (-2080373471) | (~(455844506 | i327))) * (-1228)) + (((~(i327 | (-187302555))) | (~((-1624528965) | i327))) * 614));
                                                            if (((i326 ^ i328) | (i326 & i328)) != 1) {
                                                                int i329 = -android.text.TextUtils.indexOf(str5, str5, 0, 0);
                                                                short doubleTapTimeout = (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                int i330 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                m((i329 | (-25183009)) + (i329 & (-25183009)), doubleTapTimeout, (((-30930915) | i330) << 1) - ((-30930915) ^ i330), android.graphics.ImageFormat.getBitsPerPixel(0) - 33, (byte) ((-125) - android.graphics.Color.argb(0, 0, 0, 0)), objArr106);
                                                                java.lang.String str47 = (java.lang.String) objArr106[0];
                                                                int i331 = -android.view.KeyEvent.normalizeMetaState(0);
                                                                short keyRepeatTimeout2 = (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                int i332 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                int i333 = -(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                int red2 = android.graphics.Color.red(0);
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                m((i331 ^ (-25183009)) + ((i331 & (-25183009)) << 1), keyRepeatTimeout2, (-30930903) - (~i332), (-35) - (~i333), (byte) ((red2 & 21) + (red2 | 21)), objArr107);
                                                                java.lang.String str48 = (java.lang.String) objArr107[0];
                                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                l("ʸʗ뱤鰞燎\u2062꒻꒜獑놡㘾㜏\ue1cb썷螦짗噘䳼ᄫ堞쒷", 0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), objArr108);
                                                                java.lang.String str49 = (java.lang.String) objArr108[0];
                                                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                l("ࠚ࠵蓑\ue497멮ᣀ\udc31漡秼褔", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr109);
                                                                java.lang.String str50 = (java.lang.String) objArr109[0];
                                                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                l("珥珊淞\ue3b5ⷭ\uf1cf\udb08\uf8b8ș恑䦔歬邗ዅ\uf80f间", (-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr110);
                                                                java.lang.String str51 = (java.lang.String) objArr110[0];
                                                                int i334 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                l("쮲쮝㸧䚯̍ꈶ縒환멎㎨\uec8e䖌⣀䄼崕묔鼄캸쮋⫇ල", (i334 & 48) + (i334 | 48), objArr111);
                                                                java.lang.String str52 = (java.lang.String) objArr111[0];
                                                                int threadPriority4 = android.os.Process.getThreadPriority(0);
                                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                l("九乲栃䆒ꂑ\uf412礯痄㾡斌\uebb3\ue610괯\u1718娨ᢈ᪣题첧襃蠎ૠ뼐㮲秚", ((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6, objArr112);
                                                                java.lang.String str53 = (java.lang.String) objArr112[0];
                                                                int i335 = -(-android.view.KeyEvent.getDeadChar(0, 0));
                                                                short s10 = (short) ((-2) - (~(-android.widget.ExpandableListView.getPackedPositionChild(0L))));
                                                                int i336 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                int i337 = -android.view.KeyEvent.keyCodeFromString(str5);
                                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                m(((i335 | (-25183009)) << 1) - (i335 ^ (-25183009)), s10, ((-30930885) ^ i336) + ((i336 & (-30930885)) << 1), (i337 & (-34)) + (i337 | (-34)), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 78), objArr113);
                                                                java.lang.String str54 = (java.lang.String) objArr113[0];
                                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                l("ᜏᜠ﨩翱柹昸䝌늬曳\uf7a6헐ⅸ\uf46a蔨摗\udfe0䏠શ\uf280丩텊风腱ﲒ⃕⹌\u0ff2歃븐", android.text.TextUtils.getOffsetAfter(str5, 0), objArr114);
                                                                java.lang.String str55 = (java.lang.String) objArr114[0];
                                                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                l("\ue339\ue316儰뜾珹촡较ꚬ鋅岿ᴟ㕸Q⸠것쮡랎", (-2) - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))), objArr115);
                                                                java.lang.String str56 = (java.lang.String) objArr115[0];
                                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                l("몇모♙㠠㎊멎\u0097\ue6de쬠⯑鈅畊妸", android.text.TextUtils.getOffsetAfter(str5, 0), objArr116);
                                                                java.lang.String str57 = (java.lang.String) objArr116[0];
                                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                l("噌噣銽ⱒ髏ຬᓣ俆➦鼾虰\udc4e", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr117);
                                                                java.lang.String[] strArr7 = {str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, (java.lang.String) objArr117[0]};
                                                                int i338 = 0;
                                                                while (i338 < 12) {
                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                    sb.append(strArr7[i338]);
                                                                    int i339 = -android.view.View.resolveSize(0, 0);
                                                                    short scrollBarFadeDuration2 = (short) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                    int i340 = -android.text.TextUtils.getCapsMode(str5, 0, 0);
                                                                    int i341 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                    int c21 = com.facetec.sdk.fp.a.c();
                                                                    int i342 = (i341 * 530) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO;
                                                                    int i343 = ~c21;
                                                                    int i344 = (((i342 & (-18550)) + (i342 | (-18550))) - (~(-(-(((~((i343 & i341) | (i343 ^ i341))) | (~(i341 | (-35)))) * 529))))) - 1;
                                                                    int i345 = ~((i341 ^ c21) | (i341 & c21));
                                                                    int i346 = ((i345 ^ 34) | (i345 & 34)) * 529;
                                                                    int i347 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                    m((i339 | (-25182941)) + ((-25182941) & i339), scrollBarFadeDuration2, (((-30931035) | i340) << 1) - (i340 ^ (-30931035)), ((i344 | i346) << 1) - (i346 ^ i344), (byte) ((i347 & (-49)) + (i347 | (-49))), objArr118);
                                                                    sb.append((java.lang.String) objArr118[0]);
                                                                    java.lang.Object[] objArr119 = {sb.toString()};
                                                                    java.lang.Object d24 = com.facetec.sdk.al.d(1873189073);
                                                                    if (d24 == null) {
                                                                        char c22 = (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6934);
                                                                        int jumpTapTimeout3 = android.view.ViewConfiguration.getJumpTapTimeout();
                                                                        int capsMode4 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                                                                        byte b53 = (byte) 1;
                                                                        byte b54 = (byte) (b53 - 1);
                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                        k(b53, b54, b54, objArr120);
                                                                        d24 = com.facetec.sdk.al.c(c22, (jumpTapTimeout3 >> 16) + 2389, capsMode4 + 23, -934682071, false, (java.lang.String) objArr120[0], new java.lang.Class[]{java.lang.String.class});
                                                                    }
                                                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d24).invoke(null, objArr119)).longValue();
                                                                    long j96 = -818003751;
                                                                    long j97 = longValue15 ^ j2;
                                                                    java.lang.String[] strArr8 = strArr7;
                                                                    int i348 = i338;
                                                                    long freeMemory = ((((int) java.lang.Runtime.getRuntime().freeMemory()) ^ j2) | longValue15) ^ j2;
                                                                    long j98 = j96 ^ j2;
                                                                    long j99 = ((-1939) * j96) + (971 * longValue15) + ((((j97 | j96) ^ j2) | freeMemory) * (-970)) + (1940 * ((longValue15 | j98) ^ j2)) + (970 * (freeMemory | ((j98 | j97) ^ j2))) + 1755083394;
                                                                    int elapsedRealtime5 = (int) android.os.SystemClock.elapsedRealtime();
                                                                    int i349 = ~elapsedRealtime5;
                                                                    int i350 = ~(83770204 | i349);
                                                                    int i351 = ((int) (j99 >> 32)) & ((((~(i349 | (-83770205))) | (~((-1353456207) | i349)) | 11278924 | (~(1425947486 | elapsedRealtime5))) * (-84)) + 1905160562 + (((~(elapsedRealtime5 | (-83770205))) | 1353456206 | i350) * (-84)) + (((-1425947487) | i350) * 84));
                                                                    int nextInt10 = new java.util.Random().nextInt(1847015053);
                                                                    int i352 = ((int) j99) & (((((~(688224779 | nextInt10)) | 2125451189) * (-465)) - 1043818507) + (((~(2125451189 | nextInt10)) | 688224779) * 930) + ((nextInt10 | 2142240703) * 465));
                                                                    if (((i351 ^ i352) | (i351 & i352)) != 0) {
                                                                        i5 = (i348 ^ 110) + ((i348 & 110) << 1);
                                                                        break;
                                                                    }
                                                                    i338 = i348 + 1;
                                                                    strArr7 = strArr8;
                                                                }
                                                            }
                                                        }
                                                        i5 = 0;
                                                        if (i5 != 0) {
                                                            java.lang.Object[] objArr121 = {null, new int[1], new int[]{i5}, new int[]{0}};
                                                            int maxMemory6 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                            int i353 = (((~maxMemory6) | (-1584647064)) * 1444) + 1495956073 + (((~(maxMemory6 | 494021308)) | (-1601432512) | (~(1124196651 | maxMemory6))) * (-1444)) + 1653878750;
                                                            int i354 = -(-(((i353 | 16) << 1) - (i353 ^ 16)));
                                                            int i355 = (i354 & (-244638953)) + (i354 | (-244638953));
                                                            int i356 = i355 << 13;
                                                            int i357 = (~(i356 & i355)) & (i356 | i355);
                                                            int i358 = i357 ^ (i357 >>> 17);
                                                            int i359 = i358 << 5;
                                                            ((int[]) objArr121[1])[0] = (~(i358 & i359)) & (i358 | i359);
                                                            return objArr121;
                                                        }
                                                        long[] jArr = {472001035};
                                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                        l("\udad7\udaf8鲘쩟̓\u008a\uf2e9혊ꬼ酝恠䖈㦫\ue38c톤묘踠気䝭⪉ᲄ", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr122);
                                                        try {
                                                            bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr122[0]));
                                                            j6 = 0;
                                                        } catch (java.io.IOException unused2) {
                                                            bufferedInputStream2 = null;
                                                        } catch (java.lang.Throwable th3) {
                                                            th = th3;
                                                            bufferedInputStream = null;
                                                        }
                                                        while (true) {
                                                            try {
                                                                int read = bufferedInputStream2.read();
                                                                if (read != -1) {
                                                                    int i360 = g;
                                                                    f = ((i360 & 61) + (i360 | 61)) % 128;
                                                                    j6 = ((j6 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                    for (int i361 = 0; i361 < 1; i361++) {
                                                                        if (j6 == jArr[i361]) {
                                                                            int i362 = ((i361 | 1) << 1) - (i361 ^ 1);
                                                                            try {
                                                                                bufferedInputStream2.close();
                                                                            } catch (java.lang.Exception unused3) {
                                                                            }
                                                                            if (i362 != 0) {
                                                                                i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (java.io.IOException unused4) {
                                                            } catch (java.lang.Throwable th4) {
                                                                th = th4;
                                                                bufferedInputStream = bufferedInputStream2;
                                                                if (bufferedInputStream == null) {
                                                                    throw th;
                                                                }
                                                                try {
                                                                    bufferedInputStream.close();
                                                                    throw th;
                                                                } catch (java.lang.Exception unused5) {
                                                                    throw th;
                                                                }
                                                            }
                                                            try {
                                                                bufferedInputStream2.close();
                                                                break;
                                                            } catch (java.lang.Exception unused6) {
                                                            }
                                                        }
                                                        i6 = 0;
                                                        if (i6 != 0) {
                                                            g = (f + 57) % 128;
                                                            java.lang.Object[] objArr123 = {null, new int[1], new int[]{i6}, new int[]{0}};
                                                            int myTid5 = android.os.Process.myTid();
                                                            int i363 = (((~(1253820696 | myTid5)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 834606133) + (((~((~myTid5) | 1253820696)) | 12075016) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                                            int i364 = (i363 & 16) + (i363 | 16);
                                                            int c23 = com.facetec.sdk.fp.a.c();
                                                            int i365 = (i364 * 503) + 1500658225;
                                                            int i366 = (i364 ^ (-244638953)) | (i364 & (-244638953));
                                                            int i367 = -(-(i366 * (-502)));
                                                            int i368 = ~i364;
                                                            int i369 = ~(244638952 | i368);
                                                            int i370 = ~c23;
                                                            int i371 = (i368 ^ i370) | (i368 & i370);
                                                            int i372 = ~i371;
                                                            int i373 = (i369 ^ i372) | (i372 & i369);
                                                            int i374 = ~(i366 | c23);
                                                            int i375 = (((i365 & i367) + (i365 | i367)) - (~(((i373 & i374) | (i373 ^ i374)) * (-502)))) - 1;
                                                            int i376 = ~((i371 ^ (-244638953)) | (i371 & (-244638953)));
                                                            int i377 = ~((c23 ^ i366) | (c23 & i366));
                                                            int i378 = -(-(((i376 ^ i377) | (i376 & i377)) * 502));
                                                            int i379 = (i375 & i378) + (i378 | i375);
                                                            int i380 = (i379 << 13) ^ i379;
                                                            int i381 = i380 >>> 17;
                                                            int i382 = (i380 & (~i381)) | ((~i380) & i381);
                                                            ((int[]) objArr123[1])[0] = i382 ^ (i382 << 5);
                                                            return objArr123;
                                                        }
                                                        long[] jArr2 = {472001035};
                                                        int rgb3 = android.graphics.Color.rgb(0, 0, 0);
                                                        int c24 = com.facetec.sdk.fp.a.c();
                                                        int i383 = (rgb3 * (-813)) - 1744830464;
                                                        int i384 = ~(((-16777217) & rgb3) | ((-16777217) ^ rgb3));
                                                        int i385 = ~(rgb3 | c24);
                                                        int i386 = ((i384 ^ i385) | (i384 & i385)) * (-814);
                                                        int i387 = ((i383 | i386) << 1) - (i383 ^ i386);
                                                        int i388 = ~((-16777217) | (~c24));
                                                        int i389 = ~rgb3;
                                                        int i390 = ~((16777216 ^ i389) | (16777216 & i389));
                                                        int i391 = ((~((rgb3 & c24) | (rgb3 ^ c24))) | (i388 ^ i390) | (i388 & i390)) * 407;
                                                        int i392 = (i387 ^ i391) + ((i391 & i387) << 1);
                                                        int i393 = ((~(16777216 | i389)) | (~(i389 | c24)) | (~((c24 ^ 16777216) | (16777216 & c24)))) * 407;
                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                        l("ᏭᏂ풣誁잝䢲눼ወ扊\ud92f₾脜\uf08eꮴ鄹翂䜛\u242cޥ\uee0c햽뙎琉岲␦Ð", (i392 & i393) + (i393 | i392), objArr124);
                                                        try {
                                                            bufferedInputStream4 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr124[0]));
                                                            j5 = 0;
                                                        } catch (java.io.IOException unused7) {
                                                            bufferedInputStream4 = null;
                                                        } catch (java.lang.Throwable th5) {
                                                            th2 = th5;
                                                            bufferedInputStream3 = null;
                                                        }
                                                        while (true) {
                                                            try {
                                                                int read2 = bufferedInputStream4.read();
                                                                if (read2 != -1) {
                                                                    j5 = ((j5 << 5) ^ read2) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                    for (int i394 = 0; i394 < 1; i394 = ((i394 | 1) << 1) - (i394 ^ 1)) {
                                                                        if (j5 == jArr2[i394]) {
                                                                            int i395 = ((i394 | 1) << 1) - (i394 ^ 1);
                                                                            try {
                                                                                bufferedInputStream4.close();
                                                                            } catch (java.lang.Exception unused8) {
                                                                            }
                                                                            if (i395 != 0) {
                                                                                int i396 = f;
                                                                                g = ((i396 ^ 27) + ((i396 & 27) << 1)) % 128;
                                                                                java.lang.Object[] objArr125 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, new int[]{0}};
                                                                                int myUid5 = android.os.Process.myUid();
                                                                                int i397 = (((((~myUid5) | (-470021016)) * 1444) + 1495956073) + ((((~(myUid5 | 641396154)) | (-1044119488)) | (~(976821805 | myUid5))) * (-1444))) - 191882491;
                                                                                int i398 = i397 << 13;
                                                                                int i399 = ((~i398) & i397) | ((~i397) & i398);
                                                                                int i400 = i399 >>> 17;
                                                                                int i401 = (~(i399 & i400)) & (i399 | i400);
                                                                                int i402 = i401 << 5;
                                                                                ((int[]) objArr125[1])[0] = (i401 & (~i402)) | ((~i401) & i402);
                                                                                return objArr125;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (java.io.IOException unused9) {
                                                            } catch (java.lang.Throwable th6) {
                                                                th2 = th6;
                                                                bufferedInputStream3 = bufferedInputStream4;
                                                                if (bufferedInputStream3 == null) {
                                                                    throw th2;
                                                                }
                                                                try {
                                                                    bufferedInputStream3.close();
                                                                    throw th2;
                                                                } catch (java.lang.Exception unused10) {
                                                                    throw th2;
                                                                }
                                                            }
                                                            try {
                                                                bufferedInputStream4.close();
                                                                break;
                                                            } catch (java.lang.Exception unused11) {
                                                            }
                                                        }
                                                        java.lang.Object d25 = com.facetec.sdk.al.d(-1699488110);
                                                        if (d25 == null) {
                                                            char c25 = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22874);
                                                            int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
                                                            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                                            byte b55 = (byte) 1;
                                                            byte b56 = (byte) (b55 - 1);
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            k(b55, b56, b56, objArr126);
                                                            d25 = com.facetec.sdk.al.c(c25, 2031 - (maxKeyCode2 >> 16), deadChar + 23, 1029481578, false, (java.lang.String) objArr126[0], new java.lang.Class[0]);
                                                        }
                                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d25).invoke(null, null)).longValue();
                                                        long j100 = 359026137;
                                                        long j101 = j100 ^ j2;
                                                        long elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                                                        long j102 = (((((236 * j100) + (471 * longValue16)) + (((((elapsedCpuTime2 ^ j2) | j101) ^ j2) | longValue16) * (-235))) + ((-470) * (longValue16 | ((j101 | elapsedCpuTime2) ^ j2)))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE * ((((longValue16 ^ j2) | j100) ^ j2) | ((elapsedCpuTime2 | (j101 | longValue16)) ^ j2)))) - 1546790720;
                                                        int myTid6 = android.os.Process.myTid();
                                                        int i403 = ((int) (j102 >> 32)) & ((((((~(2134834511 | myTid6)) | (~((-722906374) | myTid6))) * 69) - 463121716) + ((((~(myTid6 | 2065100109)) | 69734402) | (~((-792640776) | myTid6))) * (-69))) - 1877912728);
                                                        int i404 = ~((int) android.os.Process.getElapsedCpuTime());
                                                        int i405 = ((int) j102) & (((~((-171967498) | i404)) * (-783)) + 908825797 + (((~(i404 | (-803931194))) | 633295216) * 783));
                                                        if (((i403 ^ i405) | (i403 & i405)) != 0) {
                                                            objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{0}};
                                                            int nextInt11 = new java.util.Random().nextInt();
                                                            int i406 = ~((-680659487) | (~nextInt11));
                                                            int i407 = ((392167873 | i406 | (~(680659486 | nextInt11))) * (-338)) + 1026972857 + (((~(nextInt11 | 1072827359)) | i406) * 338);
                                                            int i408 = (i407 & 16) + (i407 | 16);
                                                            int i409 = (i408 ^ (-244638953)) + ((i408 & (-244638953)) << 1);
                                                            int i410 = (i409 << 13) ^ i409;
                                                            int i411 = i410 >>> 17;
                                                            int i412 = (~(i410 & i411)) & (i410 | i411);
                                                            int i413 = i412 << 5;
                                                            int[] iArr = (int[]) objArr[1];
                                                            int i414 = (i412 & (~i413)) | ((~i412) & i413);
                                                            c2 = 0;
                                                            iArr[0] = i414;
                                                        } else {
                                                            java.lang.Object d26 = com.facetec.sdk.al.d(33831608);
                                                            if (d26 == null) {
                                                                char resolveSize = (char) (44824 - android.view.View.resolveSize(0, 0));
                                                                float complexToFloat = android.util.TypedValue.complexToFloat(0);
                                                                int bitsPerPixel3 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                                byte b57 = (byte) 0;
                                                                byte b58 = b57;
                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                k(b57, b58, b58, objArr127);
                                                                d26 = com.facetec.sdk.al.c(resolveSize, 685 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), bitsPerPixel3 + 24, -1511309248, false, (java.lang.String) objArr127[0], new java.lang.Class[0]);
                                                            }
                                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d26).invoke(null, null)).longValue();
                                                            long j103 = 1714104716;
                                                            long j104 = j103 ^ j2;
                                                            long freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                            long j105 = longValue17 | freeMemory2;
                                                            long j106 = ((((((-464) * j103) + ((-929) * longValue17)) + (((j105 ^ j2) | j104) * (-465))) + (930 * (longValue17 | ((freeMemory2 | j104) ^ j2)))) + (465 * (j104 | j105))) - 1945889570;
                                                            int maxMemory7 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                            int i415 = ((int) (j106 >> 32)) & ((((~(2146413437 | maxMemory7)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1873150288) + (((~((~maxMemory7) | 2146413437)) | 537002280) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                                            int freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                            int i416 = ((int) j106) & ((((((~(579654412 | freeMemory3)) | (-865981342)) | r5) * (-470)) - 426564031) + (((~(freeMemory3 | (-286326930))) | (~((~freeMemory3) | (-571245069)))) * 470));
                                                            int i417 = ((i415 ^ i416) | (i415 & i416)) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                                                            if (i417 != 0) {
                                                                f = (g + 95) % 128;
                                                                objArr = new java.lang.Object[]{null, new int[1], new int[]{i417}, new int[]{0}};
                                                                int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                                                                int i418 = -(-((((~((-937641256) | elapsedCpuTime3)) | (-1072941032)) * (-502)) + 1815603681 + ((~((~elapsedCpuTime3) | (-392364328))) * (-502)) + (((~(elapsedCpuTime3 | (-680576705))) | (-937641256)) * 502) + 16));
                                                                int i419 = ((i418 | (-244638953)) << 1) - (i418 ^ (-244638953));
                                                                int i420 = i419 << 13;
                                                                int i421 = ((~i420) & i419) | ((~i419) & i420);
                                                                int i422 = i421 >>> 17;
                                                                int i423 = (~(i421 & i422)) & (i421 | i422);
                                                                c2 = 0;
                                                                ((int[]) objArr[1])[0] = i423 ^ (i423 << 5);
                                                            } else {
                                                                java.lang.Object d27 = com.facetec.sdk.al.d(39533378);
                                                                if (d27 == null) {
                                                                    char myTid7 = (char) (android.os.Process.myTid() >> 22);
                                                                    int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    int combineMeasuredStates3 = android.view.View.combineMeasuredStates(0, 0);
                                                                    byte b59 = (byte) 0;
                                                                    byte b60 = b59;
                                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                    k(b59, b60, b60, objArr128);
                                                                    d27 = com.facetec.sdk.al.c(myTid7, lastIndexOf4 + 2223, 24 - combineMeasuredStates3, -1514913350, false, (java.lang.String) objArr128[0], new java.lang.Class[0]);
                                                                }
                                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d27).invoke(null, null)).longValue();
                                                                long j107 = 1191353091;
                                                                long j108 = -919;
                                                                long j109 = 920;
                                                                long j110 = j107 ^ j2;
                                                                long j111 = longValue18 ^ j2;
                                                                long j112 = j110 | j111;
                                                                long myTid8 = android.os.Process.myTid();
                                                                long j113 = myTid8 ^ j2;
                                                                long j114 = (((((j108 * j107) + (j108 * longValue18)) + ((((j112 | myTid8) ^ j2) | (((j111 | j113) | j107) ^ j2)) * j109)) + (((j112 ^ j2) | ((j110 | j113) ^ j2)) * j109)) + (j109 * (((((longValue18 | j110) | myTid8) ^ j2) | ((j112 | j113) ^ j2)) | (((j107 | j111) | myTid8) ^ j2)))) - 1430957514;
                                                                int elapsedRealtime6 = (int) android.os.SystemClock.elapsedRealtime();
                                                                int i424 = ((int) (j114 >> 32)) & (((((~(1082384516 | r6)) | (~((-1775356369) | elapsedRealtime6))) * com.visa.cbp.getCertUsage.getODAData) - 1689133285) + (((~(elapsedRealtime6 | 1082384516)) | (~((~elapsedRealtime6) | (-1775356369)))) * com.visa.cbp.getCertUsage.getODAData));
                                                                int myPid5 = android.os.Process.myPid();
                                                                int i425 = ((int) j114) & ((((~(1526710270 | myPid5)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1751338116) + (((~((~myPid5) | 1526710270)) | 2228816) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                                                if (((i425 ^ i424) | (i424 & i425)) != 0) {
                                                                    objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, new int[]{0}};
                                                                    int uptimeMillis6 = (int) android.os.SystemClock.uptimeMillis();
                                                                    int i426 = (((~((-1357800497) | uptimeMillis6)) | 8660016) * 336) + 340540495 + (((~(260417463 | uptimeMillis6)) | (-1609557944)) * (-168)) + (((~((~uptimeMillis6) | 260417463)) | (-1357800497)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                                                    int i427 = -(-((i426 ^ 16) + ((i426 & 16) << 1)));
                                                                    int i428 = ((i427 | (-244638953)) << 1) - (i427 ^ (-244638953));
                                                                    int i429 = i428 << 13;
                                                                    int i430 = (~(i429 & i428)) & (i429 | i428);
                                                                    int i431 = i430 ^ (i430 >>> 17);
                                                                    int i432 = i431 << 5;
                                                                    int[] iArr2 = (int[]) objArr[1];
                                                                    int i433 = (i431 & (~i432)) | ((~i431) & i432);
                                                                    c2 = 0;
                                                                    iArr2[0] = i433;
                                                                } else {
                                                                    java.lang.Object d28 = com.facetec.sdk.al.d(39530495);
                                                                    if (d28 == null) {
                                                                        char minimumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                        int maxKeyCode3 = android.view.KeyEvent.getMaxKeyCode();
                                                                        int normalizeMetaState3 = android.view.KeyEvent.normalizeMetaState(0);
                                                                        byte b61 = (byte) 3;
                                                                        byte b62 = (byte) (b61 - 3);
                                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                        k(b61, b62, b62, objArr129);
                                                                        d28 = com.facetec.sdk.al.c(minimumFlingVelocity2, 2222 - (maxKeyCode3 >> 16), 24 - normalizeMetaState3, -1514908409, false, (java.lang.String) objArr129[0], new java.lang.Class[0]);
                                                                    }
                                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d28).invoke(null, null)).longValue();
                                                                    long j115 = -1813807446;
                                                                    long j116 = longValue19 ^ j2;
                                                                    long myTid9 = android.os.Process.myTid();
                                                                    long j117 = ((j116 | j115) | myTid9) ^ j2;
                                                                    long j118 = (((((477 * j115) + ((-475) * longValue19)) + ((((longValue19 | (j115 ^ j2)) ^ j2) | j117) * (-476))) + (952 * j117)) + (476 * ((j115 | ((myTid9 ^ j2) | j116)) ^ j2))) - 129600016;
                                                                    int myTid10 = android.os.Process.myTid();
                                                                    int i434 = ((int) (j118 >> 32)) & ((((~(1344140596 | myTid10)) | (-1514140981)) * 336) + 501358106 + (((~((-1513600289) | myTid10)) | 1343599904) * (-168)) + (((~((~myTid10) | (-1513600289))) | 1344140596) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                                    int uptimeMillis7 = (int) android.os.SystemClock.uptimeMillis();
                                                                    int i435 = ~uptimeMillis7;
                                                                    int i436 = ~(1230284702 | uptimeMillis7);
                                                                    int i437 = ((int) j118) & ((((~(206941707 | i435)) | i436) * 1150) + 334239082 + ((i436 | (~((-1230284703) | i435))) * (-575)) + (((~(uptimeMillis7 | 206941707)) | (~(i435 | (-206941708)))) * 575));
                                                                    if (((i434 ^ i437) | (i434 & i437)) != 0) {
                                                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, new int[]{0}};
                                                                        int freeMemory4 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                                        int i438 = ~freeMemory4;
                                                                        int i439 = (((~((-1339582530) | i438)) | (~((-278635431) | freeMemory4))) * 1900) + 1909448877 + (((~(278635430 | i438)) | (~(1339582529 | freeMemory4))) * (-950)) + (((~(freeMemory4 | 278635430)) | (~(i438 | 1339582529))) * 950);
                                                                        int i440 = ((i439 | 16) << 1) - (i439 ^ 16);
                                                                        int c26 = com.facetec.sdk.fp.a.c();
                                                                        int i441 = i440 * (-55);
                                                                        int i442 = ~((i440 ^ c26) | (i440 & c26));
                                                                        int i443 = (570240527 ^ i441) + ((i441 & 570240527) << 1) + (((i442 ^ (-244638953)) | (i442 & (-244638953))) * 56);
                                                                        int i444 = -(-((~((i440 ^ (-244638953)) | (i440 & (-244638953)))) * (-56)));
                                                                        int i445 = ((i443 | i444) << 1) - (i444 ^ i443);
                                                                        int i446 = ~c26;
                                                                        int i447 = ~((i446 ^ (-244638953)) | (i446 & (-244638953)));
                                                                        int i448 = -(-(((i440 ^ i447) | (i440 & i447)) * 56));
                                                                        int i449 = ((i445 | i448) << 1) - (i448 ^ i445);
                                                                        int i450 = (i449 << 13) ^ i449;
                                                                        int i451 = i450 >>> 17;
                                                                        int i452 = (i450 & (~i451)) | ((~i450) & i451);
                                                                        c2 = 0;
                                                                        ((int[]) objArr[1])[0] = i452 ^ (i452 << 5);
                                                                    } else {
                                                                        java.lang.Object d29 = com.facetec.sdk.al.d(589612749);
                                                                        if (d29 == null) {
                                                                            char fadingEdgeLength2 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                            int absoluteGravity3 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                            int alpha2 = android.graphics.Color.alpha(0);
                                                                            byte b63 = (byte) 0;
                                                                            byte b64 = b63;
                                                                            java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                            k(b63, b64, b64, objArr130);
                                                                            d29 = com.facetec.sdk.al.c(fadingEdgeLength2, absoluteGravity3 + 2174, 24 - alpha2, -2067022795, false, (java.lang.String) objArr130[0], new java.lang.Class[0]);
                                                                        }
                                                                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) d29).invoke(null, null)).longValue();
                                                                        long j119 = -271470687;
                                                                        long j120 = j119 ^ j2;
                                                                        long elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                                                                        long j121 = elapsedCpuTime4 ^ j2;
                                                                        long j122 = ((-563) * j119) + (565 * longValue20) + (((((longValue20 ^ j2) | j121) ^ j2) | j120 | ((longValue20 | elapsedCpuTime4) ^ j2)) * (-564)) + (1128 * (((j120 | longValue20) | elapsedCpuTime4) ^ j2)) + (564 * (((longValue20 | j119) ^ j2) | ((j120 | j121) ^ j2))) + 1254639716;
                                                                        int i453 = (int) (j122 >> 32);
                                                                        int myPid6 = android.os.Process.myPid();
                                                                        int i454 = ~myPid6;
                                                                        int i455 = ~((-1648633374) | myPid6);
                                                                        int i456 = (int) j122;
                                                                        int uptimeMillis8 = (int) android.os.SystemClock.uptimeMillis();
                                                                        int i457 = ~(2126719151 | (~uptimeMillis8));
                                                                        if (((i453 & (((((~(myPid6 | (-1209107512))) | (~(1783998015 | i454))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 1937559334) + (((~(1209107511 | i454)) | i455) * (-1040)) + (((~(i454 | 1648633373)) | 574890504 | i455) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))) | ((((671088645 | i457 | (~((-2126719152) | uptimeMillis8))) * (-338)) + 2052436207 + (((~((-1455630507) | uptimeMillis8)) | i457) * 338)) & i456)) != 0) {
                                                                            objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                                            int elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
                                                                            int i458 = ~elapsedCpuTime5;
                                                                            int i459 = -(-(((((~((-804653544) | i458)) | r5) * 1150) - 1144172530) + (((~((-813564417) | elapsedCpuTime5)) | (~(813564416 | i458))) * (-575)) + (((~(elapsedCpuTime5 | (-804653544))) | (~(i458 | 804653543))) * 575) + 16));
                                                                            int i460 = (i459 ^ (-244638953)) + ((i459 & (-244638953)) << 1);
                                                                            int i461 = (i460 << 13) ^ i460;
                                                                            int i462 = i461 >>> 17;
                                                                            int i463 = (i461 & (~i462)) | ((~i461) & i462);
                                                                            int i464 = i463 << 5;
                                                                            int[] iArr3 = (int[]) objArr[1];
                                                                            int i465 = (i463 & (~i464)) | ((~i463) & i464);
                                                                            c2 = 0;
                                                                            iArr3[0] = i465;
                                                                        } else {
                                                                            java.lang.Object[] objArr131 = {null, new int[1], new int[]{0}, new int[]{0}};
                                                                            int maxMemory8 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                                            int i466 = ~maxMemory8;
                                                                            int i467 = -(-(((~((-1212801313) | i466)) * 979) + 1462613388 + ((405416647 | maxMemory8) * (-979)) + (((~(maxMemory8 | (-1212801313))) | (~(i466 | 405416647))) * 979)));
                                                                            int i468 = (i467 & (-244638953)) + (i467 | (-244638953));
                                                                            int i469 = i468 << 13;
                                                                            int i470 = (~(i469 & i468)) & (i469 | i468);
                                                                            int i471 = i470 >>> 17;
                                                                            int i472 = (i470 & (~i471)) | ((~i470) & i471);
                                                                            int i473 = i472 << 5;
                                                                            int[] iArr4 = (int[]) objArr131[1];
                                                                            int i474 = (~(i472 & i473)) & (i472 | i473);
                                                                            c2 = 0;
                                                                            iArr4[0] = i474;
                                                                            objArr = objArr131;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (((int[]) objArr[3])[c2] != ((int[]) objArr[2])[c2]) {
                                                            int i475 = g;
                                                            f = (((i475 | 83) << 1) - (i475 ^ 83)) % 128;
                                                            return objArr;
                                                        }
                                                        java.lang.Object[] objArr132 = {2};
                                                        java.lang.Object d30 = com.facetec.sdk.al.d(-1836228463);
                                                        if (d30 == null) {
                                                            char windowTouchSlop2 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                                            float length3 = android.graphics.PointF.length(0.0f, 0.0f);
                                                            int gidForName2 = android.os.Process.getGidForName(str5);
                                                            byte b65 = (byte) 1;
                                                            byte b66 = (byte) (b65 - 1);
                                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                            k(b65, b66, b66, objArr133);
                                                            d30 = com.facetec.sdk.al.c(windowTouchSlop2, (length3 > 0.0f ? 1 : (length3 == 0.0f ? 0 : -1)) + 455, 23 - gidForName2, 895621737, false, (java.lang.String) objArr133[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                                        }
                                                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) d30).invoke(null, objArr132)).longValue();
                                                        long j123 = -191727037;
                                                        long j124 = 52;
                                                        long nextInt12 = new java.util.Random().nextInt(1535821991) ^ j2;
                                                        long j125 = nextInt12 | j123;
                                                        long j126 = longValue21 ^ j2;
                                                        long j127 = j123 ^ j2;
                                                        long j128 = ((((((-51) * j123) + (53 * longValue21)) + (((j125 | longValue21) ^ j2) * j124)) + ((-52) * ((((j126 | j123) ^ j2) | ((j126 | nextInt12) ^ j2)) | (j125 ^ j2)))) + (j124 * (((longValue21 | j127) ^ j2) | ((j127 | nextInt12) ^ j2)))) - 1178800568;
                                                        int i476 = (int) (j128 >> 32);
                                                        int myTid11 = android.os.Process.myTid();
                                                        int i477 = ~myTid11;
                                                        int i478 = ~((-1209332192) | i477);
                                                        int i479 = (int) j128;
                                                        int i480 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
                                                        if (((i476 & ((((135545226 | i478) * (-712)) - 1947597702) + (((~(myTid11 | (-1073786966))) | (~(i477 | (-135545227)))) * (-712)) + ((1648408693 | i478) * 712))) | (((((-1346439177) | i480) * 494) + 776908687 + (((~(797602087 | i480)) | (-1430341642)) * 494)) & i479)) == 2) {
                                                            java.lang.Object[] objArr134 = {null, new int[1], new int[]{270}, new int[]{0}};
                                                            int elapsedRealtime7 = (int) android.os.SystemClock.elapsedRealtime();
                                                            int i481 = ~elapsedRealtime7;
                                                            int i482 = ((733499308 | elapsedRealtime7) * 140) + 1703401483 + (((~(733499308 | i481)) | 335786003) * (-280)) + (((~(elapsedRealtime7 | (-335786004))) | (~(i481 | 884718651)) | 184566660) * 140);
                                                            int c27 = com.facetec.sdk.fp.a.c();
                                                            int i483 = -(-(i482 * 263));
                                                            int i484 = ~((i482 & (-17)) | (i482 ^ (-17)));
                                                            int i485 = ~i482;
                                                            int i486 = ~((i485 & 16) | (i485 ^ 16));
                                                            int i487 = (i484 ^ i486) | (i484 & i486);
                                                            int i488 = ~((i485 ^ c27) | (i485 & c27));
                                                            int i489 = (((((i483 | (-8368)) << 1) - (i483 ^ (-8368))) - (~(((i487 & i488) | (i487 ^ i488)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) - 1) + ((~(i485 | 16)) * (-786));
                                                            int i490 = ~c27;
                                                            int i491 = ~((i490 ^ i485) | (i490 & i485));
                                                            int i492 = (i491 ^ i484) | (i491 & i484);
                                                            int i493 = ((i492 ^ i486) | (i492 & i486)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                                                            int i494 = ((i489 ^ i493) + ((i493 & i489) << 1)) - 244638953;
                                                            int i495 = (i494 << 13) ^ i494;
                                                            int i496 = i495 >>> 17;
                                                            int i497 = (i495 & (~i496)) | ((~i495) & i496);
                                                            ((int[]) objArr134[1])[0] = i497 ^ (i497 << 5);
                                                            return objArr134;
                                                        }
                                                        java.lang.Object d31 = com.facetec.sdk.al.d(-1753496434);
                                                        if (d31 == null) {
                                                            char normalizeMetaState4 = (char) (android.view.KeyEvent.normalizeMetaState(0) + 409);
                                                            int capsMode5 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                                                            long elapsedRealtime8 = android.os.SystemClock.elapsedRealtime();
                                                            byte b67 = (byte) 0;
                                                            byte b68 = b67;
                                                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                            k(b67, b68, b68, objArr135);
                                                            d31 = com.facetec.sdk.al.c(normalizeMetaState4, capsMode5 + 2198, 25 - (elapsedRealtime8 > 0L ? 1 : (elapsedRealtime8 == 0L ? 0 : -1)), 815054454, false, (java.lang.String) objArr135[0], new java.lang.Class[0]);
                                                        }
                                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) d31).invoke(null, null)).longValue();
                                                        long j129 = -21057179;
                                                        long j130 = -712;
                                                        long j131 = longValue22 ^ j2;
                                                        long nextInt13 = new java.util.Random().nextInt();
                                                        long j132 = nextInt13 ^ j2;
                                                        long j133 = (j132 | j129) ^ j2;
                                                        long j134 = ((-711) * j129) + (713 * longValue22) + ((((j131 | j129) ^ j2) | j133) * j130) + (j130 * ((((longValue22 | j129) | nextInt13) ^ j2) | (((j131 | j132) | j129) ^ j2))) + (712 * (j131 | j133)) + 746294717;
                                                        int myTid12 = android.os.Process.myTid();
                                                        int myTid13 = android.os.Process.myTid();
                                                        if (((((int) (j134 >> 32)) & (((((~(888297163 | myTid12)) | 1969443721) * (-964)) - 14545570) + (((~((~myTid12) | 888297163)) | 1090584832) * (-964)))) | (((((~((-174638209) | myTid13)) | (~((~myTid13) | (-1611864619)))) * (-318)) + 673638651 + (((~((-1687624508) | myTid13)) | 75759889) * (-318)) + (((~(myTid13 | 1687624507)) | (-250398098)) * 318)) & ((int) j134))) != 0) {
                                                            java.lang.Object[] objArr136 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, new int[]{0}};
                                                            int i498 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                            int i499 = ~i498;
                                                            int i500 = ((((((~((-757086699) | i499)) | 553652712) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 340540495) + ((~((-553652713) | i498)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) + (((~(i498 | (-203433987))) | ((~(i499 | (-861131262))) | 307478549)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) - 244638937;
                                                            int i501 = i500 << 13;
                                                            int i502 = ((~i501) & i500) | ((~i500) & i501);
                                                            int i503 = i502 >>> 17;
                                                            int i504 = (i502 & (~i503)) | ((~i502) & i503);
                                                            int i505 = i504 << 5;
                                                            ((int[]) objArr136[1])[0] = (i504 & (~i505)) | ((~i504) & i505);
                                                            return objArr136;
                                                        }
                                                        long[] jArr3 = {624887784092251L};
                                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                        l("\udad7\udaf8鲘쩟̓\u008a\uf2e9혊ꬼ酝恠䖈㦫\ue38c톤묘踠気䝭⪉ᲄ", android.text.TextUtils.getOffsetAfter(str5, 0), objArr137);
                                                        java.lang.Object[] objArr138 = {(java.lang.String) objArr137[0], 3, 2251799813685247L, jArr3};
                                                        java.lang.Object d32 = com.facetec.sdk.al.d(2143203995);
                                                        if (d32 == null) {
                                                            char c28 = (char) (18696 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                            int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout();
                                                            int trimmedLength2 = android.text.TextUtils.getTrimmedLength(str5);
                                                            byte b69 = (byte) 3;
                                                            byte b70 = (byte) (b69 - 3);
                                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                            k(b69, b70, b70, objArr139);
                                                            d32 = com.facetec.sdk.al.c(c28, (doubleTapTimeout2 >> 16) + 1787, 24 - trimmedLength2, -665728925, false, (java.lang.String) objArr139[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                                        }
                                                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) d32).invoke(null, objArr138)).longValue();
                                                        long j135 = 1435894252;
                                                        long j136 = j135 ^ j2;
                                                        long j137 = longValue23 ^ j2;
                                                        long elapsedCpuTime6 = (int) android.os.Process.getElapsedCpuTime();
                                                        long j138 = (((((592 * j135) + ((-590) * longValue23)) + (((j136 | longValue23) ^ j2) * (-1182))) + ((((longValue23 | j135) ^ j2) | (((j136 | j137) | (elapsedCpuTime6 ^ j2)) ^ j2)) * (-591))) + (591 * ((elapsedCpuTime6 | j136) | j137))) - 1936508886;
                                                        int myPid7 = android.os.Process.myPid();
                                                        int i506 = ~myPid7;
                                                        int i507 = ((int) (j138 >> 32)) & (((((-1247398530) | i506) * (-369)) - 802173004) + (((~(1272565441 | i506)) | (-1585175444)) * (-369)) + (((~(myPid7 | (-1272565442))) | 25166912 | (~(i506 | (-337776915)))) * 369));
                                                        int nextInt14 = new java.util.Random().nextInt();
                                                        int i508 = ~nextInt14;
                                                        int i509 = ((int) j138) & ((((273698977 | nextInt14) * 988) - 1525928299) + (((~((-581927689) | i508)) | 327944) * (-1976)) + (((~(nextInt14 | 855298721)) | 273698977 | (~(i508 | (-855298722)))) * 988));
                                                        if (((i507 ^ i509) | (i507 & i509)) != 0) {
                                                            java.lang.Object[] objArr140 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, new int[]{0}};
                                                            int freeMemory5 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                            int i510 = ~((-962316427) | (~freeMemory5));
                                                            int i511 = (((((100664149 | i510) | (~(962316426 | freeMemory5))) * (-338)) + 1282961953) + (((~(freeMemory5 | 1062980575)) | i510) * 338)) - 244638937;
                                                            int i512 = (i511 << 13) ^ i511;
                                                            int i513 = i512 ^ (i512 >>> 17);
                                                            int i514 = i513 << 5;
                                                            ((int[]) objArr140[1])[0] = (i513 & (~i514)) | ((~i513) & i514);
                                                            return objArr140;
                                                        }
                                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                        l("ᓐᓿ蛝ᙧ蒵\u1adb⻆凥敷譍뱒쉼\uf7a9隆ෘ", 0 - (~(-(-((byte) android.view.KeyEvent.getModifierMetaStateMask())))), objArr141);
                                                        java.lang.Object[] objArr142 = {(java.lang.String) objArr141[0]};
                                                        java.lang.Object d33 = com.facetec.sdk.al.d(2084539986);
                                                        if (d33 == null) {
                                                            char c29 = (char) (6936 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                            int longPressTimeout3 = android.view.ViewConfiguration.getLongPressTimeout();
                                                            int scrollBarSize5 = android.view.ViewConfiguration.getScrollBarSize();
                                                            byte b71 = (byte) 0;
                                                            byte b72 = b71;
                                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                            k(b71, b72, b72, objArr143);
                                                            d33 = com.facetec.sdk.al.c(c29, (longPressTimeout3 >> 16) + 2389, (scrollBarSize5 >> 8) + 23, -607062870, false, (java.lang.String) objArr143[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) d33).invoke(null, objArr142)).longValue();
                                                        long j139 = 35945357;
                                                        long j140 = 764;
                                                        long myUid6 = android.os.Process.myUid() ^ j2;
                                                        long j141 = (myUid6 | j139) ^ j2;
                                                        long j142 = ((j139 ^ j2) | longValue24) ^ j2;
                                                        long j143 = (765 * j139) + ((-1527) * longValue24) + ((longValue24 | j141) * j140) + ((-1528) * (j142 | ((myUid6 | longValue24) ^ j2))) + (j140 * (j142 | (((longValue24 ^ j2) | j139) ^ j2) | j141)) + 936203985;
                                                        int i515 = (int) (j143 >> 32);
                                                        int i516 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
                                                        int i517 = (int) j143;
                                                        int freeMemory6 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        int i518 = ~freeMemory6;
                                                        if (((i515 & (((((-151322953) | i516) * 494) - 1665790382) + (((~(i516 | 911920178)) | (-689259851)) * 494))) | (((((~(364024883 | i518)) | (-1073201527)) * 226) + 2055568080 + (((~(i518 | (-709181765))) | (~(1073201526 | freeMemory6)) | 5121) * (-113)) + ((~(freeMemory6 | 364024883)) * 113)) & i517)) != 0) {
                                                            java.lang.Object[] objArr144 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                            int myUid7 = android.os.Process.myUid();
                                                            int i519 = ~(693973452 | myUid7);
                                                            int i520 = -(-(((369281555 | i519) * (-814)) + 1869903404 + ((i519 | (~((~myUid7) | (-924244508))) | 139010500) * 407) + (((~(myUid7 | (-693973453))) | 139010500 | (~(924244507 | myUid7))) * 407) + 16));
                                                            int i521 = (i520 ^ (-244638953)) + ((i520 & (-244638953)) << 1);
                                                            int i522 = (i521 << 13) ^ i521;
                                                            int i523 = i522 >>> 17;
                                                            int i524 = (i522 & (~i523)) | ((~i522) & i523);
                                                            int i525 = i524 << 5;
                                                            ((int[]) objArr144[1])[0] = (~(i524 & i525)) & (i524 | i525);
                                                            return objArr144;
                                                        }
                                                        java.lang.Object d34 = com.facetec.sdk.al.d(-2029373905);
                                                        if (d34 == null) {
                                                            char c30 = (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19037);
                                                            int maximumFlingVelocity3 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                                            int keyCodeFromString4 = android.view.KeyEvent.keyCodeFromString(str5);
                                                            byte b73 = (byte) 1;
                                                            byte b74 = (byte) (b73 - 1);
                                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                            k(b73, b74, b74, objArr145);
                                                            d34 = com.facetec.sdk.al.c(c30, (maximumFlingVelocity3 >> 16) + 940, 24 - keyCodeFromString4, 551898327, false, (java.lang.String) objArr145[0], new java.lang.Class[0]);
                                                        }
                                                        long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) d34).invoke(null, null)).longValue();
                                                        long j144 = -1010357464;
                                                        long j145 = 614;
                                                        long nextInt15 = new java.util.Random().nextInt();
                                                        long j146 = j144 ^ j2;
                                                        long j147 = (j146 | longValue25) ^ j2;
                                                        long j148 = longValue25 ^ j2;
                                                        long j149 = nextInt15 ^ j2;
                                                        long j150 = (615 * j144) + ((-613) * longValue25) + ((nextInt15 | j147 | ((j148 | j144) ^ j2)) * j145) + ((-1228) * (((j146 | j149) ^ j2) | j147 | ((j149 | longValue25) ^ j2))) + (j145 * (((longValue25 | (j149 | j144)) ^ j2) | (((j146 | j148) | j149) ^ j2))) + 1557275200;
                                                        int i526 = (int) (j150 >> 32);
                                                        int nextInt16 = new java.util.Random().nextInt(1699336244);
                                                        int i527 = (int) j150;
                                                        int uptimeMillis9 = (int) android.os.SystemClock.uptimeMillis();
                                                        int i528 = ~uptimeMillis9;
                                                        if (((i526 & ((((~(167064263 | nextInt16)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 1094410786) + (((~((~nextInt16) | 167064263)) | 162865859) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | (((((~((-2031119832) | i528)) | (~((-826621055) | uptimeMillis9))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 573853479 + (((~(uptimeMillis9 | (-1209024898))) | (~(i528 | (-4526121)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) & i527)) != 0) {
                                                            java.lang.Object[] objArr146 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, new int[]{0}};
                                                            int nextInt17 = new java.util.Random().nextInt(1351499030);
                                                            int i529 = ~nextInt17;
                                                            int i530 = (((~((-854539596) | i529)) | (~((-763678365) | i529))) * (-867)) + 158882620 + (((~((-854539596) | nextInt17)) | 545524744 | (~((-763678365) | nextInt17))) * (-1734)) + (((~(nextInt17 | (-309014852))) | (~(i529 | (-545524745))) | (~((-218153621) | nextInt17))) * 867);
                                                            int i531 = -(-((i530 & 16) + (i530 | 16)));
                                                            int i532 = ((i531 | (-244638953)) << 1) - (i531 ^ (-244638953));
                                                            int i533 = (i532 << 13) ^ i532;
                                                            int i534 = i533 ^ (i533 >>> 17);
                                                            int i535 = i534 << 5;
                                                            ((int[]) objArr146[1])[0] = (i534 & (~i535)) | ((~i534) & i535);
                                                            return objArr146;
                                                        }
                                                        java.lang.Object d35 = com.facetec.sdk.al.d(1671466082);
                                                        if (d35 == null) {
                                                            char absoluteGravity4 = (char) (58898 - android.view.Gravity.getAbsoluteGravity(0, 0));
                                                            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                                                            long packedPositionForChild3 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                                            byte b75 = (byte) 3;
                                                            byte b76 = (byte) (b75 - 3);
                                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                            k(b75, b76, b76, objArr147);
                                                            d35 = com.facetec.sdk.al.c(absoluteGravity4, resolveSizeAndState + 1529, (packedPositionForChild3 > 0L ? 1 : (packedPositionForChild3 == 0L ? 0 : -1)) + 24, -1001392486, false, (java.lang.String) objArr147[0], new java.lang.Class[0]);
                                                        }
                                                        long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) d35).invoke(null, null)).longValue();
                                                        long j151 = -1163386589;
                                                        long j152 = 367;
                                                        long j153 = -366;
                                                        long j154 = longValue26 ^ j2;
                                                        long freeMemory7 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        long j155 = (((((j152 * j151) + (j152 * longValue26)) + ((j151 | longValue26) * j153)) + (j153 * (((j154 | freeMemory7) ^ j2) | j151))) + (366 * (((longValue26 | (j151 ^ j2)) ^ j2) | (((j151 | j154) | freeMemory7) ^ j2)))) - 435125290;
                                                        int myPid8 = android.os.Process.myPid();
                                                        int i536 = ~myPid8;
                                                        int i537 = (~(1021722129 | i536)) | 1091125314 | (~((-1836018756) | i536));
                                                        int i538 = ((int) (j155 >> 32)) & ((((~(myPid8 | (-276828689))) | i537) * 590) + 835898598 + (i537 * (-1180)) + (((~(i536 | (-1021722130))) | (~(1836018755 | i536))) * 590));
                                                        int myUid8 = android.os.Process.myUid();
                                                        int i539 = ~myUid8;
                                                        int i540 = ((int) j155) & (((~((-153499655) | i539)) * 979) + 362778496 + (((-1590726065) | myUid8) * (-979)) + (((~(myUid8 | (-153499655))) | (~(i539 | (-1590726065)))) * 979));
                                                        if (((i540 ^ i538) | (i538 & i540)) != 0) {
                                                            java.lang.Object[] objArr148 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                            int myUid9 = android.os.Process.myUid();
                                                            int i541 = ~myUid9;
                                                            int i542 = (((~((-707771734) | i541)) | (~(1047527383 | myUid9))) * (-831)) + 699438820 + ((~((-137081158) | myUid9)) * (-1662)) + (((~(myUid9 | 910446226)) | (~(i541 | (-910446227))) | (~(707771733 | myUid9))) * 831) + 16;
                                                            int i543 = (i542 & (-244638953)) + ((-244638953) | i542);
                                                            int i544 = i543 << 13;
                                                            int i545 = ((~i544) & i543) | ((~i543) & i544);
                                                            int i546 = i545 >>> 17;
                                                            int i547 = (i545 & (~i546)) | ((~i545) & i546);
                                                            int i548 = i547 << 5;
                                                            ((int[]) objArr148[1])[0] = (~(i547 & i548)) & (i547 | i548);
                                                            return objArr148;
                                                        }
                                                        java.lang.Object[] objArr149 = {0, obj, -244638953, 16777216};
                                                        java.lang.Object d36 = com.facetec.sdk.al.d(-1695430476);
                                                        if (d36 == null) {
                                                            d36 = com.facetec.sdk.al.c((char) android.graphics.Color.red(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2270, 24 - android.view.KeyEvent.getDeadChar(0, 0), 1025421900, false, null, new java.lang.Class[]{java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2245 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                                        }
                                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) d36).newInstance(objArr149);
                                                        try {
                                                            int lastIndexOf5 = android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                            l("䟢䞈猪ヱ뵭暣ࡃ株㙄\uf726髜ﮭ꒕藼⭱Գገਿ뷌钷", (lastIndexOf5 ^ 1) + ((lastIndexOf5 & 1) << 1), objArr150);
                                                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr150[0]);
                                                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                            l("\uedb1\uedc2掻뎋㙇ﾭ謮\ue313鱍", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr151);
                                                            cls.getMethod((java.lang.String) objArr151[0], null).invoke(newInstance, null);
                                                            java.lang.Object[] objArr152 = {null, new int[1], new int[]{0}, new int[]{0}};
                                                            int i549 = ((((~((~r2) | 126524701)) | (-1609301984)) * 529) - 1337939872) + (((~(((int) android.os.SystemClock.uptimeMillis()) | 126524701)) | (-1491693259)) * 529);
                                                            int i550 = (i549 & (-244638953)) + ((-244638953) | i549);
                                                            int i551 = (i550 << 13) ^ i550;
                                                            int i552 = i551 ^ (i551 >>> 17);
                                                            int i553 = i552 << 5;
                                                            ((int[]) objArr152[1])[0] = (i552 & (~i553)) | ((~i552) & i553);
                                                            return objArr152;
                                                        } catch (java.lang.Throwable th7) {
                                                            java.lang.Throwable cause = th7.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th7;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th8) {
                                                    java.lang.Throwable cause2 = th8.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th8;
                                                }
                                            }
                                            java.lang.Object[] objArr153 = {(java.lang.String) objArr3[0]};
                                            java.lang.Object d37 = com.facetec.sdk.al.d(1590238701);
                                            if (d37 == null) {
                                                char indexOf8 = (char) android.text.TextUtils.indexOf(str5, str5, 0, 0);
                                                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                                                int lastIndexOf6 = android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                byte b77 = (byte) 0;
                                                byte b78 = b77;
                                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                k(b77, b78, b78, objArr154);
                                                d37 = com.facetec.sdk.al.c(indexOf8, (scrollDefaultDelay >> 16) + 2078, lastIndexOf6 + 25, -114923755, false, (java.lang.String) objArr154[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            java.lang.Object invoke7 = ((java.lang.reflect.Method) d37).invoke(null, objArr153);
                                            if (invoke7 != null) {
                                                int i554 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                                short trimmedLength3 = (short) android.text.TextUtils.getTrimmedLength(str5);
                                                int axisFromString = android.view.MotionEvent.axisFromString(str5);
                                                int i555 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                                int pressedStateDuration4 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                                java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                m(((i554 & (-25182942)) << 1) + ((-25182942) ^ i554), trimmedLength3, (((-30930920) | axisFromString) << 1) - (axisFromString ^ (-30930920)), ((i555 | (-33)) << 1) - (i555 ^ (-33)), (byte) (((pressedStateDuration4 | 12) << 1) - (pressedStateDuration4 ^ 12)), objArr155);
                                                if (invoke7.equals((java.lang.String) objArr155[0])) {
                                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                    l("븑빡㊿쬺᧞꺸\uf38c첋쿰㼦愂彞嵲䶴킝ꇆ\ueafb숪䘉〔确停㖽苻觜\ue6c6묥", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr156);
                                                    try {
                                                        java.lang.Object[] objArr157 = {(java.lang.String) objArr156[0]};
                                                        java.lang.Object d38 = com.facetec.sdk.al.d(1590238701);
                                                        if (d38 == null) {
                                                            char touchSlop2 = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                                                            int normalizeMetaState5 = android.view.KeyEvent.normalizeMetaState(0);
                                                            double convertQuartSecToDecDegrees2 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                            byte b79 = (byte) 0;
                                                            byte b80 = b79;
                                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                            k(b79, b80, b80, objArr158);
                                                            d38 = com.facetec.sdk.al.c(touchSlop2, 2078 - normalizeMetaState5, 24 - (convertQuartSecToDecDegrees2 > 0.0d ? 1 : (convertQuartSecToDecDegrees2 == 0.0d ? 0 : -1)), -114923755, false, (java.lang.String) objArr158[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        java.lang.String str58 = (java.lang.String) ((java.lang.reflect.Method) d38).invoke(null, objArr157);
                                                        if (str58 != null && (parseInt = java.lang.Integer.parseInt(str58)) != 0) {
                                                            i4 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                            if (i4 != 0) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th9) {
                                                        java.lang.Throwable cause3 = th9.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th9;
                                                    }
                                                }
                                            }
                                            i4 = 0;
                                            if (i4 != 0) {
                                            }
                                        } catch (java.lang.Throwable th10) {
                                            java.lang.Throwable cause4 = th10.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th10;
                                        }
                                        objArr3 = new java.lang.Object[1];
                                        l("眇睮⛄㎥◁뫈ଈ\uf093ڡ⭝馟挌鐹姅⠄鶨⏻홟뺜ఒ녈䐨", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr3);
                                    } catch (java.lang.Throwable th11) {
                                        java.lang.Throwable cause5 = th11.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th11;
                                    }
                                }
                            }
                            str3 = str;
                            java.lang.Object[] objArr682 = new java.lang.Object[1];
                            l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.text.TextUtils.getTrimmedLength(str3), objArr682);
                            java.lang.Object[] objArr692 = {(java.lang.String) objArr682[0]};
                            d3 = com.facetec.sdk.al.d(-864328554);
                            if (d3 != null) {
                            }
                            long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr692)).longValue();
                            long j472 = -706044303;
                            long j482 = 503;
                            long j492 = -502;
                            long j502 = j472 | longValue72;
                            long j512 = j472 ^ j2;
                            str5 = str4;
                            long nextInt62 = new java.util.Random().nextInt();
                            long j522 = j512 | (nextInt62 ^ j2);
                            long j532 = (nextInt62 | j502) ^ j2;
                            long j542 = (j472 * j482) + (j482 * longValue72) + (j502 * j492) + (j492 * ((((longValue72 ^ j2) | j512) ^ j2) | (j522 ^ j2) | j532)) + (502 * (((j522 | longValue72) ^ j2) | j532)) + 1754242723;
                            int myUid10 = android.os.Process.myUid();
                            int i2132 = ((int) (j542 >> 32)) & (((((~(1365820387 | myUid10)) | (-1508698100)) * 345) - 484646000) + (((~(1365820387 | (~myUid10))) | 16777602) * 345) + ((~(myUid10 | 1508698099)) * 345));
                            int i2142 = ((int) j542) & (((((~(2054155946 | r3)) | (-2146434988)) * 305) - 1704616964) + (((~((~android.os.Process.myUid()) | 2054155946)) | (-803584940)) * 305));
                            j3 = (i2132 ^ i2142) | (i2132 & i2142);
                            int i2152 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            short s62 = (short) ((-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
                            int i2162 = -(-android.view.View.MeasureSpec.getSize(0));
                            int offsetAfter32 = android.text.TextUtils.getOffsetAfter(str5, 0);
                            java.lang.Object[] objArr712 = new java.lang.Object[1];
                            m((((-25183010) | i2152) << 1) - (i2152 ^ (-25183010)), s62, ((-30930988) & i2162) + (i2162 | (-30930988)), (offsetAfter32 & (-34)) + (offsetAfter32 | (-34)), (byte) (android.text.TextUtils.indexOf(str5, str5, 0) - 62), objArr712);
                            java.lang.Object[] objArr722 = {(java.lang.String) objArr712[0]};
                            d4 = com.facetec.sdk.al.d(-864328554);
                            if (d4 == null) {
                            }
                            long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr722)).longValue();
                            long j552 = 825866529;
                            long j562 = 988;
                            long j572 = longValue82 ^ j2;
                            long elapsedRealtime22 = (int) android.os.SystemClock.elapsedRealtime();
                            long j582 = elapsedRealtime22 ^ j2;
                            long j592 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j552) + ((-987) * longValue82) + (((((j572 | j582) | j552) ^ j2) | (((j552 | longValue82) | elapsedRealtime22) ^ j2)) * j562) + ((-988) * (j552 | j572)) + (j562 * (((j572 | elapsedRealtime22) ^ j2) | (((j552 ^ j2) | j572) ^ j2) | ((longValue82 | (j582 | j552)) ^ j2))) + 222331891;
                            int i2172 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                            int i2182 = ((int) (j592 >> 32)) & ((((~(477266515 | i2172)) | (-1031263064)) * (-160)) + 590662346 + (((~(i2172 | (-959959896))) | 477266515) * 160));
                            int myPid42 = android.os.Process.myPid();
                            int i2192 = ((int) j592) & (((((~((-1535644055) | r5)) | 1250431126) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1250431127) | myPid42)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(myPid42 | (-285212929))) | (~((~myPid42) | (-1322096832))) | 71665705) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                            long j602 = (i2182 ^ i2192) | (i2182 & i2192);
                            if (j3 > 0) {
                            }
                            java.lang.Object[] objArr752 = new java.lang.Object[1];
                            l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr752);
                            java.lang.Object[] objArr762 = {(java.lang.String) objArr752[0]};
                            d5 = com.facetec.sdk.al.d(-864328554);
                            if (d5 == null) {
                            }
                            long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr762)).longValue();
                            long j612 = 164638394;
                            long j622 = 868;
                            long j632 = j612 ^ j2;
                            long maxMemory32 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            long j642 = maxMemory32 ^ j2;
                            long j652 = longValue92 ^ j2;
                            long j662 = j632 | j652;
                            long j672 = (j622 * j612) + (j622 * longValue92) + ((-867) * (((j632 | j642) ^ j2) | ((j652 | j642) ^ j2))) + ((-1734) * ((j662 ^ j2) | ((j632 | maxMemory32) ^ j2) | ((j652 | maxMemory32) ^ j2))) + (867 * ((((longValue92 | j632) | maxMemory32) ^ j2) | ((j662 | j642) ^ j2) | (((j652 | j612) | maxMemory32) ^ j2))) + 883560026;
                            int uptimeMillis32 = (int) android.os.SystemClock.uptimeMillis();
                            int i2312 = ((int) (j672 >> 32)) & (((~(2009050072 | uptimeMillis32)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1075948654 + (((~((~uptimeMillis32) | 2009050072)) | 1437247952) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                            int i2322 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            int i2332 = ~i2322;
                            int i2342 = ~(i2322 | (-1708154893));
                            int i2352 = ((int) j672) & ((((~((-304549620) | i2332)) | 270928482 | i2342) * (-502)) + 1424885377 + ((i2342 | (~(i2332 | (-33621138)))) * 502));
                            j4 = (i2352 ^ i2312) | (i2312 & i2352);
                            java.lang.Object[] objArr782 = new java.lang.Object[1];
                            l("쮚쮵쒄ۭ胑墂㹌喁", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr782);
                            java.lang.Object[] objArr792 = {(java.lang.String) objArr782[0]};
                            d6 = com.facetec.sdk.al.d(-864328554);
                            if (d6 == null) {
                            }
                            long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr792)).longValue();
                            long j682 = -1093610948;
                            long j692 = j682 ^ j2;
                            long j702 = longValue102 ^ j2;
                            long myUid22 = android.os.Process.myUid();
                            long j712 = 490;
                            long j722 = (491 * j682) + ((-489) * longValue102) + ((j692 | j702 | (myUid22 ^ j2)) * (-490)) + ((((j702 | myUid22) ^ j2) | ((j702 | j682) ^ j2)) * j712) + (j712 * j692) + 2141809368;
                            int myTid14 = android.os.Process.myTid();
                            int i2362 = ((int) (j722 >> 32)) & (((((~(1773922814 | myTid14)) | (~((-553650561) | r4))) * 497) - 1071071599) + (((~(myTid14 | (-553650561))) | (~((~myTid14) | 1637468630)) | 136454184) * 497));
                            int myUid32 = android.os.Process.myUid();
                            int i2372 = ~myUid32;
                            int i2382 = ((int) j722) & ((((592136 | myUid32) * 988) - 1332283447) + (((~((-1268840018) | i2372)) | 1101045761) * (-1976)) + (((~(myUid32 | 168386392)) | 592136 | (~(i2372 | (-168386393)))) * 988));
                            long j732 = (i2362 ^ i2382) | (i2362 & i2382);
                            if (j4 <= 0) {
                            }
                            java.lang.Object[] objArr822 = new java.lang.Object[1];
                            l("뼈뼧굻㞃햲ㅪ༾ç컴ꃴ鶢", (-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1, objArr822);
                            java.lang.String str412 = (java.lang.String) objArr822[0];
                            int i2552 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            short s72 = (short) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                            int i2562 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                            int longPressTimeout22 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                            int absoluteGravity22 = android.view.Gravity.getAbsoluteGravity(0, 0);
                            java.lang.Object[] objArr832 = new java.lang.Object[1];
                            m(((i2552 & (-25183009)) << 1) + (i2552 ^ (-25183009)), s72, ((-30930971) & i2562) + (i2562 | (-30930971)), ((longPressTimeout22 | (-34)) << 1) - (longPressTimeout22 ^ (-34)), (byte) (((absoluteGravity22 | (-38)) << 1) - (absoluteGravity22 ^ (-38))), objArr832);
                            java.lang.String str422 = (java.lang.String) objArr832[0];
                            java.lang.Object[] objArr842 = new java.lang.Object[1];
                            l("豯豀嵆뫖ྕ셗艫\udac0ﶓ僉ჷ䤔漌≖ꅫ럍", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr842);
                            java.lang.String str432 = (java.lang.String) objArr842[0];
                            int i2572 = -android.view.KeyEvent.getDeadChar(0, 0);
                            short packedPositionType22 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i2582 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int i2592 = -(-android.view.View.MeasureSpec.getSize(0));
                            int i2602 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            java.lang.Object[] objArr852 = new java.lang.Object[1];
                            m(((i2572 | (-25183009)) << 1) - (i2572 ^ (-25183009)), packedPositionType22, ((-30930961) ^ i2582) + ((i2582 & (-30930961)) << 1), (i2592 & (-34)) + (i2592 | (-34)), (byte) ((i2602 & 87) + (i2602 | 87)), objArr852);
                            java.lang.String str442 = (java.lang.String) objArr852[0];
                            int i2612 = -(-android.view.View.MeasureSpec.getSize(0));
                            int i2622 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            int capsMode32 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                            java.lang.Object[] objArr862 = new java.lang.Object[1];
                            m((i2612 ^ (-25183009)) + ((i2612 & (-25183009)) << 1), (short) ((i2622 & 1) + (i2622 | 1)), ((-30930948) & capsMode32) + (capsMode32 | (-30930948)), (-33) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (-android.os.Process.getGidForName(str5)), objArr862);
                            java.lang.String str452 = (java.lang.String) objArr862[0];
                            int gidForName3 = android.os.Process.getGidForName(str5);
                            short s82 = (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                            int size22 = android.view.View.MeasureSpec.getSize(0);
                            int scrollBarSize22 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                            java.lang.Object[] objArr872 = new java.lang.Object[1];
                            m((((-25183008) | gidForName3) << 1) - (gidForName3 ^ (-25183008)), s82, size22 - 30930937, (scrollBarSize22 & (-34)) + (scrollBarSize22 | (-34)), (byte) (14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr872);
                            java.lang.String str462 = (java.lang.String) objArr872[0];
                            java.lang.Object[] objArr882 = new java.lang.Object[1];
                            l("櫾櫑\uefb8㴃쏩玿ֳᚬ", 0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr882);
                            java.lang.String[] strArr62 = {str412, str422, str432, str442, str452, str462, (java.lang.String) objArr882[0]};
                            while (i2 < 7) {
                            }
                            i3 = 0;
                            if (i3 == 0) {
                            }
                        } else {
                            obj2 = invoke4;
                            str6 = "";
                        }
                        if (obj2 != null) {
                            java.lang.Object[] objArr159 = {obj2, 42};
                            java.lang.Object d39 = com.facetec.sdk.al.d(-582857820);
                            if (d39 == null) {
                                char blue = (char) android.graphics.Color.blue(0);
                                int gidForName4 = android.os.Process.getGidForName(str6);
                                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                byte b81 = (byte) 1;
                                byte b82 = (byte) (b81 - 1);
                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                k(b81, b82, b82, objArr160);
                                d39 = com.facetec.sdk.al.c(blue, 2364 - gidForName4, modifierMetaStateMask + com.google.common.base.Ascii.EM, 2058170716, false, (java.lang.String) objArr160[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) d39).invoke(null, objArr159)).longValue();
                            long j156 = 299777817;
                            long j157 = 193;
                            long elapsedCpuTime7 = (int) android.os.Process.getElapsedCpuTime();
                            long j158 = elapsedCpuTime7 ^ j2;
                            long j159 = j156 ^ j2;
                            long j160 = longValue27 ^ j2;
                            long j161 = j159 | j160;
                            long j162 = j160 | j158;
                            long j163 = (j157 * j156) + (j157 * longValue27) + ((-192) * (((j159 | longValue27) ^ j2) | j158)) + ((-384) * ((j161 ^ j2) | (j162 ^ j2))) + (192 * (((elapsedCpuTime7 | (longValue27 | j156)) ^ j2) | ((j161 | elapsedCpuTime7) ^ j2) | ((j162 | j156) ^ j2))) + 859419581;
                            int myTid15 = android.os.Process.myTid();
                            int i556 = ((int) (j163 >> 32)) & ((((~((-1101932165) | myTid15)) | 28059140) * 336) + 501358106 + (((~(335294246 | myTid15)) | (-1409167271)) * (-168)) + (((~((~myTid15) | 335294246)) | (-1101932165)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                            int i557 = ~android.os.Process.myUid();
                            int i558 = ((int) j163) & ((((-33554438) | i557) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 467709661 + (((~(i557 | (-198449168))) | (-1107436950)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                        }
                        if (invoke3 != null) {
                            java.lang.Object[] objArr161 = {invoke3, 42};
                            java.lang.Object d40 = com.facetec.sdk.al.d(-582857820);
                            if (d40 == null) {
                                char c31 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int doubleTapTimeout3 = android.view.ViewConfiguration.getDoubleTapTimeout();
                                str7 = str6;
                                int lastIndexOf7 = android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                byte b83 = (byte) 1;
                                byte b84 = (byte) (b83 - 1);
                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                k(b83, b84, b84, objArr162);
                                d40 = com.facetec.sdk.al.c(c31, 2365 - (doubleTapTimeout3 >> 16), lastIndexOf7 + 25, 2058170716, false, (java.lang.String) objArr162[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            } else {
                                str7 = str6;
                            }
                            long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) d40).invoke(null, objArr161)).longValue();
                            long j164 = -98012584;
                            long j165 = -661;
                            long j166 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            long j167 = j164 ^ j2;
                            long j168 = longValue28 ^ j2;
                            long j169 = (j165 * j164) + (j165 * longValue28) + (1324 * ((j166 ^ j2) | ((j167 | j168) ^ j2))) + ((-1324) * (((j164 | j166) ^ j2) | ((j166 | longValue28) ^ j2))) + (662 * (((longValue28 | j167) ^ j2) | ((j168 | j164) ^ j2))) + 1257209982;
                            int myTid16 = android.os.Process.myTid();
                            int i559 = ~myTid16;
                            int i560 = ((int) (j169 >> 32)) & ((((((~((-1648639703) | myTid16)) | 10242) | (~((-211413292) | myTid16))) * (-754)) - 537121906) + (((~(myTid16 | (-10243))) | (~((-211403050) | i559))) * (-754)) + (((-1648639703) | i559) * 754));
                            int elapsedCpuTime8 = (int) android.os.Process.getElapsedCpuTime();
                            int i561 = ((int) j169) & ((((((~(1218532178 | r5)) | (~(218694231 | elapsedCpuTime8))) * (-370)) - 635053777) + ((((~(elapsedCpuTime8 | 1218532178)) | (~((~elapsedCpuTime8) | 218694231))) | 134283858) * (-370))) - 1854580092);
                            if (((i560 ^ i561) | (i560 & i561)) == -1032769152) {
                                str = str7;
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                    int offsetBefore2 = android.text.TextUtils.getOffsetBefore(str, 0);
                                    short capsMode6 = (short) android.text.TextUtils.getCapsMode(str, 0, 0);
                                    int i562 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                    int lastIndexOf8 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                    m((-25183010) - (~offsetBefore2), capsMode6, (((-30931157) | i562) << 1) - (i562 ^ (-30931157)), (lastIndexOf8 & (-33)) + (lastIndexOf8 | (-33)), (byte) ((maximumDrawingCacheSize2 & (-42)) + (maximumDrawingCacheSize2 | (-42))), objArr163);
                                    java.lang.Object[] objArr164 = {(java.lang.String) objArr163[0]};
                                    java.lang.Object d41 = com.facetec.sdk.al.d(1450487247);
                                    if (d41 == null) {
                                        char resolveSize2 = (char) (6935 - android.view.View.resolveSize(0, 0));
                                        int minimumFlingVelocity3 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                        long elapsedRealtime9 = android.os.SystemClock.elapsedRealtime();
                                        byte b85 = (byte) 3;
                                        byte b86 = (byte) (b85 - 3);
                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                        k(b85, b86, b86, objArr165);
                                        d41 = com.facetec.sdk.al.c(resolveSize2, 2389 - (minimumFlingVelocity3 >> 16), 24 - (elapsedRealtime9 > 0L ? 1 : (elapsedRealtime9 == 0L ? 0 : -1)), -241445065, false, (java.lang.String) objArr165[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) d41).invoke(null, objArr164)).longValue();
                                    long j170 = 981601324;
                                    long j171 = -661;
                                    long nextInt18 = new java.util.Random().nextInt(2101639869);
                                    long j172 = j170 ^ j2;
                                    long j173 = longValue29 ^ j2;
                                    long j174 = (j171 * j170) + (j171 * longValue29) + (1324 * ((nextInt18 ^ j2) | ((j172 | j173) ^ j2))) + ((-1324) * (((longValue29 | nextInt18) ^ j2) | ((j170 | nextInt18) ^ j2))) + (662 * (((longValue29 | j172) ^ j2) | ((j173 | j170) ^ j2))) + 869575317;
                                    int nextInt19 = new java.util.Random().nextInt(983459461);
                                    int i563 = ~nextInt19;
                                    int i564 = ((int) (j174 >> 32)) & ((((~(nextInt19 | 1510547689)) | (~((-1510023362) | i563)) | 72796950) * (-68)) + 1108318986 + ((~(1583344639 | i563)) * (-68)) + (((~(i563 | (-1510547690))) | 73321278) * 68));
                                    int i565 = ((int) j174) & (((((~(1262493574 | r2)) | 174732835) * (-948)) - 1842255943) + ((~((~android.os.Process.myPid()) | 1265254311)) * (-948)) + 1677787672);
                                } else {
                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                    l("\udd99\uddeb跾薒悇ᇳ뵸뗅건聶⾫♎㻮\uf2ed鸤\ud8dd襤", android.text.TextUtils.indexOf(str, str, 0), objArr166);
                                    java.lang.Object[] objArr167 = {(java.lang.String) objArr166[0]};
                                    java.lang.Object d42 = com.facetec.sdk.al.d(1590238701);
                                    if (d42 == null) {
                                        char lastIndexOf9 = (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                        int longPressTimeout4 = android.view.ViewConfiguration.getLongPressTimeout();
                                        int lastIndexOf10 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        byte b87 = (byte) 0;
                                        byte b88 = b87;
                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                        k(b87, b88, b88, objArr168);
                                        d42 = com.facetec.sdk.al.c(lastIndexOf9, (longPressTimeout4 >> 16) + 2078, 23 - lastIndexOf10, -114923755, false, (java.lang.String) objArr168[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    java.lang.Object invoke8 = ((java.lang.reflect.Method) d42).invoke(null, objArr167);
                                    int i566 = -android.text.TextUtils.getCapsMode(str, 0, 0);
                                    int lastIndexOf11 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                    m((i566 | (-25183007)) + ((-25183007) & i566), (short) (((lastIndexOf11 | 1) << 1) - (lastIndexOf11 ^ 1)), (-30931131) - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), (-35) - (~(-android.view.View.resolveSize(0, 0))), (byte) ((-130) - (~(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr169);
                                }
                                int i4710 = (android.graphics.PointF.length(f2, f2) > f2 ? 1 : (android.graphics.PointF.length(f2, f2) == f2 ? 0 : -1));
                                short packedPositionType4 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                                int i4810 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                m(((-25182959) ^ i4710) + ((i4710 & (-25182959)) << 1), packedPositionType4, (((-30931128) | i4810) << 1) - (i4810 ^ (-30931128)), (-34) - android.view.View.getDefaultSize(0, 0), (byte) (28 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr212);
                                java.lang.String str112 = (java.lang.String) objArr212[0];
                                int i4910 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                java.lang.Object[] objArr222 = new java.lang.Object[1];
                                l("芅苤\u171b㏗乌謋ୣ鬃\uf363᪖", (i4910 ^ 48) + ((i4910 & 48) << 1), objArr222);
                                java.lang.String str122 = (java.lang.String) objArr222[0];
                                int i5010 = -(-android.graphics.Color.blue(0));
                                short threadPriority5 = (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                int normalizeMetaState6 = android.view.KeyEvent.normalizeMetaState(0);
                                int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                int c72 = com.facetec.sdk.fp.a.c();
                                int i5110 = keyRepeatDelay2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                                int i5210 = ((i5110 | 7310) << 1) - (i5110 ^ 7310);
                                int i5310 = (~((keyRepeatDelay2 ^ c72) | (keyRepeatDelay2 & c72))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                int i5410 = (i5210 ^ i5310) + ((i5310 & i5210) << 1);
                                int i5510 = (keyRepeatDelay2 ^ 33) | (keyRepeatDelay2 & 33);
                                int i567 = ~c72;
                                int i572 = ((i5510 ^ i567) | (i5510 & i567)) * (-216);
                                int i582 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                java.lang.Object[] objArr232 = new java.lang.Object[1];
                                m((((-25182956) | i5010) << 1) - (i5010 ^ (-25182956)), threadPriority5, (-30931120) - normalizeMetaState6, (i5410 ^ i572) + ((i572 & i5410) << 1) + (((~((keyRepeatDelay2 ^ i567) | (keyRepeatDelay2 & i567))) | (-34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), (byte) ((i582 & 120) + (i582 | 120)), objArr232);
                                java.lang.String str132 = (java.lang.String) objArr232[0];
                                int i592 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                java.lang.Object[] objArr242 = new java.lang.Object[1];
                                m(((-25182954) ^ i592) + ((i592 & (-25182954)) << 1), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-30931114) - (~(-android.graphics.Color.alpha(0))), (-34) - (~android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) (21 - (~(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr242);
                                java.lang.String str142 = (java.lang.String) objArr242[0];
                                java.lang.Object[] objArr252 = new java.lang.Object[1];
                                l("編綁\ue76f\ua6fa粄筩鹒꧁ఌ\ueaec", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr252);
                                java.lang.String str152 = (java.lang.String) objArr252[0];
                                int i602 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                int i612 = i602 * (-183);
                                int i622 = ~com.facetec.sdk.fp.a.c();
                                int i632 = (((i612 | 183) << 1) - (i612 ^ 183)) + ((~((i622 ^ i602) | (i622 & i602))) * (-184));
                                int i642 = ~i602;
                                int i652 = ~i642;
                                int i662 = ~((i642 ^ i622) | (i642 & i622));
                                int i672 = (i662 ^ i652) | (i662 & i652);
                                int i682 = ~i622;
                                int i692 = ((i672 ^ i682) | (i672 & i682)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                java.lang.Object[] objArr262 = new java.lang.Object[1];
                                l("弩彀㧮Ⴟﯥꗢ⠒⺷⺌㑠몖봩뱌䛻\u0b45䎡\u0bd2", ((i632 ^ i692) + ((i692 & i632) << 1)) - 184, objArr262);
                                java.lang.String str162 = (java.lang.String) objArr262[0];
                                int i702 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                short indexOf9 = (short) android.text.TextUtils.indexOf(str, str, 0);
                                long globalActionKeyTimeout2 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                int i712 = -android.view.KeyEvent.keyCodeFromString(str);
                                java.lang.Object[] objArr272 = new java.lang.Object[1];
                                m((i702 | (-25182951)) + ((-25182951) & i702), indexOf9, (-30931103) - (globalActionKeyTimeout2 > 0L ? 1 : (globalActionKeyTimeout2 == 0L ? 0 : -1)), (i712 ^ (-34)) + ((i712 & (-34)) << 1), (byte) (116 - (~(-(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))))), objArr272);
                                java.lang.String str172 = (java.lang.String) objArr272[0];
                                java.lang.Object[] objArr282 = new java.lang.Object[1];
                                l("ψΡ碇歴㳹\ue495叕\ue9ad爦畞", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr282);
                                java.lang.String str182 = (java.lang.String) objArr282[0];
                                int rgb22 = android.graphics.Color.rgb(0, 0, 0);
                                int c82 = com.facetec.sdk.fp.a.c();
                                int i722 = rgb22 * (-947);
                                int i732 = (612892077 ^ i722) + ((i722 & 612892077) << 1);
                                int i742 = ~rgb22;
                                int i752 = ((~((8405734 ^ c82) | (8405734 & c82))) | i742) * (-948);
                                int i762 = i742 | 8405734;
                                int i772 = ~c82;
                                int i782 = (((i732 & i752) + (i732 | i752)) - (~(-(-((~((i772 ^ i762) | (i772 & i762))) * (-948)))))) - 1;
                                int i792 = -(-((8405734 | rgb22) * 948));
                                short mirror22 = (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                float length4 = android.graphics.PointF.length(0.0f, 0.0f);
                                int i802 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                int maximumFlingVelocity22 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int c92 = com.facetec.sdk.fp.a.c();
                                int i812 = (maximumFlingVelocity22 * (-109)) + 1554;
                                int i822 = ~maximumFlingVelocity22;
                                int i832 = ~((c92 ^ 14) | (c92 & 14));
                                int i842 = ((i832 ^ i822) | (i822 & i832)) * (-220);
                                int i852 = ~((maximumFlingVelocity22 ^ 14) | (maximumFlingVelocity22 & 14));
                                int i862 = ~(c92 | 14);
                                int i872 = (i812 ^ i842) + ((i812 & i842) << 1) + (((i862 ^ i852) | (i862 & i852)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                int i882 = ~(i822 | 14);
                                int i892 = ~(maximumFlingVelocity22 | (-15));
                                int i902 = ((i892 ^ i882) | (i892 & i882)) * 110;
                                java.lang.Object[] objArr292 = new java.lang.Object[1];
                                m((i782 & i792) + (i792 | i782), mirror22, (-30931099) - (length4 > 0.0f ? 1 : (length4 == 0.0f ? 0 : -1)), (i802 & (-34)) + (i802 | (-34)), (byte) ((i872 & i902) + (i902 | i872)), objArr292);
                                java.lang.String str192 = (java.lang.String) objArr292[0];
                                int myPid9 = android.os.Process.myPid();
                                short s22 = (short) ((-android.view.MotionEvent.axisFromString(str)) - 1);
                                int combineMeasuredStates4 = android.view.View.combineMeasuredStates(0, 0);
                                int i912 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int mode5 = android.view.View.MeasureSpec.getMode(0);
                                int c102 = com.facetec.sdk.fp.a.c();
                                int i922 = (mode5 * (-830)) + 59904;
                                int i932 = ~c102;
                                int i942 = (mode5 ^ 72) | (mode5 & 72);
                                int i952 = -(-(((~((i942 ^ c102) | (i942 & c102))) | (~((i932 & (-73)) | (i932 ^ (-73))))) * (-831)));
                                int i962 = (mode5 ^ (-73)) | (mode5 & (-73));
                                int i972 = (i922 ^ i952) + ((i922 & i952) << 1) + ((~((i962 & c102) | (i962 ^ c102))) * (-1662));
                                int i982 = ~mode5;
                                int i992 = ~((i982 ^ i932) | (i982 & i932));
                                int i1002 = ~((mode5 ^ c102) | (mode5 & c102));
                                int i1012 = (i1002 ^ i992) | (i1002 & i992);
                                int i1022 = ~((c102 ^ 72) | (c102 & 72));
                                int i1032 = -(-(((i1022 ^ i1012) | (i1012 & i1022)) * 831));
                                byte b152 = (byte) (((i972 | i1032) << 1) - (i1032 ^ i972));
                                java.lang.Object[] objArr302 = new java.lang.Object[1];
                                m((-25182949) - (~(myPid9 >> 22)), s22, ((-30931097) ^ combineMeasuredStates4) + ((combineMeasuredStates4 & (-30931097)) << 1), (i912 & (-34)) + (i912 | (-34)), b152, objArr302);
                                java.lang.String str202 = (java.lang.String) objArr302[0];
                                int argb3 = android.graphics.Color.argb(0, 0, 0, 0);
                                short s32 = (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                                int makeMeasureSpec5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i1042 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                int argb22 = android.graphics.Color.argb(0, 0, 0, 0);
                                java.lang.Object[] objArr312 = new java.lang.Object[1];
                                m((-25182948) - argb3, s32, ((-30931081) ^ makeMeasureSpec5) + ((makeMeasureSpec5 & (-30931081)) << 1), (i1042 ^ (-35)) + ((i1042 & (-35)) << 1), (byte) ((argb22 ^ 82) + ((argb22 & 82) << 1)), objArr312);
                                java.lang.String str212 = (java.lang.String) objArr312[0];
                                int i1052 = -android.view.KeyEvent.keyCodeFromString(str);
                                short indexOf22 = (short) android.text.TextUtils.indexOf(str, str, 0);
                                int i1062 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                int i1072 = -android.view.KeyEvent.getDeadChar(0, 0);
                                int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                java.lang.Object[] objArr322 = new java.lang.Object[1];
                                m(((-25182944) & i1052) + (i1052 | (-25182944)), indexOf22, ((-30931071) & i1062) + (i1062 | (-30931071)), (i1072 & (-34)) + (i1072 | (-34)), (byte) (((fadingEdgeLength3 | 24) << 1) - (fadingEdgeLength3 ^ 24)), objArr322);
                                java.lang.String str222 = (java.lang.String) objArr322[0];
                                java.lang.Object[] objArr332 = new java.lang.Object[1];
                                l("騠驐⤞혼\u0cf7딎\uee97\ud9b7\uebcb⒛簜䨵祕嘏출뒥", android.view.View.resolveSize(0, 0), objArr332);
                                java.lang.String str232 = (java.lang.String) objArr332[0];
                                int i1082 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                short bitsPerPixel4 = (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
                                int i1092 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                int i1102 = -android.graphics.Color.red(0);
                                int i1112 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                int c112 = com.facetec.sdk.fp.a.c();
                                int i1122 = (i1112 * 46) - 2530;
                                int i1132 = ~c112;
                                int i1142 = ~((i1132 ^ 54) | (i1132 & 54));
                                int i1152 = -(-(((i1142 ^ i1112) | (i1142 & i1112)) * (-90)));
                                int i1162 = (i1122 ^ i1152) + ((i1122 & i1152) << 1);
                                int i1172 = ~((c112 ^ 54) | (c112 & 54));
                                int i1182 = ~((i1112 ^ (-55)) | (i1112 & (-55)));
                                int i1192 = ((i1172 & i1182) | (i1172 ^ i1182)) * (-45);
                                int i1202 = ~i1112;
                                int i1212 = (~((c112 ^ i1202) | (c112 & i1202))) | 54;
                                int i1222 = ~((i1112 ^ i1132) | (i1112 & i1132));
                                byte b162 = (byte) ((((i1162 & i1192) + (i1192 | i1162)) - (~(((i1222 ^ i1212) | (i1222 & i1212)) * 45))) - 1);
                                java.lang.Object[] objArr342 = new java.lang.Object[1];
                                m((((-25182945) | i1082) << 1) - (i1082 ^ (-25182945)), bitsPerPixel4, ((-30931063) ^ i1092) + ((i1092 & (-30931063)) << 1), ((i1102 | (-34)) << 1) - (i1102 ^ (-34)), b162, objArr342);
                                java.lang.String str242 = (java.lang.String) objArr342[0];
                                java.lang.Object[] objArr352 = new java.lang.Object[1];
                                l("鉥鈗❅\uf89d膂뭂쀴哋\ue398⫁劥", android.widget.ExpandableListView.getPackedPositionType(0L), objArr352);
                                java.lang.String str252 = (java.lang.String) objArr352[0];
                                int i1232 = -android.graphics.Color.blue(0);
                                int i1242 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                short s42 = (short) ((~i1242) + (i1242 << 1));
                                int i1252 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                int i1262 = -(android.os.Process.myTid() >> 22);
                                int defaultSize3 = android.view.View.getDefaultSize(0, 0);
                                int c122 = com.facetec.sdk.fp.a.c();
                                int i1272 = ~c122;
                                int i1282 = ~((i1272 & (-109)) | (i1272 ^ (-109)));
                                int i1292 = (defaultSize3 * 165) + 17767 + (((i1282 ^ defaultSize3) | (i1282 & defaultSize3)) * (-328));
                                int i1302 = ((defaultSize3 ^ c122) | (defaultSize3 & c122)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                int i1312 = (i1292 & i1302) + (i1302 | i1292);
                                int i1322 = ~defaultSize3;
                                int i1332 = (~((c122 & 108) | (c122 ^ 108))) | (~((i1322 ^ 108) | (i1322 & 108)));
                                int i1342 = defaultSize3 | i1272;
                                int i1352 = ~((i1342 ^ (-109)) | (i1342 & (-109)));
                                int i1362 = ((i1332 ^ i1352) | (i1352 & i1332)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                byte b172 = (byte) ((i1312 & i1362) + (i1362 | i1312));
                                java.lang.Object[] objArr362 = new java.lang.Object[1];
                                m(((-25182941) ^ i1232) + ((i1232 & (-25182941)) << 1), s42, (-30931050) - (~i1252), (i1262 & (-34)) + (i1262 | (-34)), b172, objArr362);
                                java.lang.String str262 = (java.lang.String) objArr362[0];
                                int i1372 = -android.view.View.resolveSize(0, 0);
                                short offsetAfter4 = (short) android.text.TextUtils.getOffsetAfter(str, 0);
                                int indexOf32 = android.text.TextUtils.indexOf(str, str);
                                int i1382 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr372 = new java.lang.Object[1];
                                m((-25182942) - (~i1372), offsetAfter4, ((-30931042) ^ indexOf32) + ((indexOf32 & (-30931042)) << 1), (i1382 & (-33)) + (i1382 | (-33)), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) - 36), objArr372);
                                java.lang.String str272 = (java.lang.String) objArr372[0];
                                java.lang.Object[] objArr382 = new java.lang.Object[1];
                                l("㎇㏴Ṕ\uaafd㿈艅", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr382);
                                java.lang.String str282 = (java.lang.String) objArr382[0];
                                java.lang.Object[] objArr392 = new java.lang.Object[1];
                                l("媡嫒\u1ad6ꉍ꿣蛀髨窷⭝ᝣࡶ\ue924맅旌맆ឹ๖\uea4f⽺蘼鳦砱峇㓑", android.widget.ExpandableListView.getPackedPositionType(0L), objArr392);
                                java.lang.String str292 = (java.lang.String) objArr392[0];
                                java.lang.Object[] objArr402 = new java.lang.Object[1];
                                l("ᯛᮨὕ潵瘾荃埃ꍹ樰ዚ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr402);
                                java.lang.String str302 = (java.lang.String) objArr402[0];
                                int i1392 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                short defaultSize22 = (short) android.view.View.getDefaultSize(0, 0);
                                int i1402 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                java.lang.Object[] objArr412 = new java.lang.Object[1];
                                m(((-25182942) & i1392) + (i1392 | (-25182942)), defaultSize22, ((-30931036) & i1402) + (i1402 | (-30931036)), android.view.View.MeasureSpec.getSize(0) - 34, (byte) ((-49) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr412);
                                java.lang.String str312 = (java.lang.String) objArr412[0];
                                java.lang.Object[] objArr422 = new java.lang.Object[1];
                                l("ﵙﴪ㙟酪ờ꩜꧀쮒貥㯜㭜堖ḻ䤀諍ꚟꦠ웑᱃㜐", android.graphics.Color.red(0), objArr422);
                                java.lang.String str322 = (java.lang.String) objArr422[0];
                                java.lang.Object[] objArr432 = new java.lang.Object[1];
                                m((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 25182940, (short) android.graphics.Color.alpha(0), (-30931034) - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 35, (byte) ((-8) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr432);
                                java.lang.String str332 = (java.lang.String) objArr432[0];
                                int indexOf42 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                short green32 = (short) android.graphics.Color.green(0);
                                int i1412 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i1422 = -android.graphics.Color.rgb(0, 0, 0);
                                int i1432 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                                byte b182 = (byte) ((i1432 ^ (-107)) + ((i1432 & (-107)) << 1));
                                java.lang.Object[] objArr442 = new java.lang.Object[1];
                                m(indexOf42 - 25182939, green32, (-30931024) - (~i1412), ((-16777250) & i1422) + (i1422 | (-16777250)), b182, objArr442);
                                java.lang.String str342 = (java.lang.String) objArr442[0];
                                java.lang.Object[] objArr452 = new java.lang.Object[1];
                                l("﹫\ufe1f從䈙ߍ쎎窼튈辆分\ue83a䄖ᴏ₉姻", android.text.TextUtils.getTrimmedLength(str), objArr452);
                                java.lang.String str352 = (java.lang.String) objArr452[0];
                                int i1442 = -android.graphics.Color.green(0);
                                int i1452 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int c132 = com.facetec.sdk.fp.a.c();
                                int i1462 = i1452 * (-380);
                                int i1472 = ((i1462 | 382) << 1) - (i1462 ^ 382);
                                int i1482 = ~i1452;
                                int i1492 = -(-(((c132 ^ 1) | (c132 & 1) | i1482) * (-381)));
                                int i1502 = ((i1472 | i1492) << 1) - (i1472 ^ i1492);
                                int i1512 = ~(i1482 | (-2));
                                int i1522 = ~((~c132) | 1);
                                int i1532 = -(-(((~((i1452 ^ 1) | (i1452 & 1))) | (i1522 ^ i1512) | (i1522 & i1512)) * 381));
                                int i1542 = (i1502 & i1532) + (i1532 | i1502);
                                int i1552 = (~((i1482 ^ 1) | (i1482 & 1))) * 381;
                                short s52 = (short) ((i1542 & i1552) + (i1552 | i1542));
                                int i1562 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int c142 = com.facetec.sdk.fp.a.c();
                                int i1572 = i1562 * (-949);
                                int i1582 = ((-711239735) & i1572) + (i1572 | (-711239735));
                                int i1592 = ~c142;
                                int i1602 = ~((30931012 & i1592) | (30931012 ^ i1592));
                                int i1612 = ~i1562;
                                int i1622 = ~((i1612 ^ c142) | (i1612 & c142));
                                int i1632 = ((i1602 ^ i1622) | (i1602 & i1622)) * 1900;
                                int i1642 = ~(i1592 | i1562);
                                int i1652 = ~(((-30931013) ^ c142) | ((-30931013) & c142));
                                int i1662 = (((i1582 | i1632) << 1) - (i1582 ^ i1632)) + (((i1642 & i1652) | (i1642 ^ i1652)) * (-950));
                                int i1672 = ~((i1592 ^ (-30931013)) | ((-30931013) & i1592));
                                int i1682 = ~(i1562 | c142);
                                int i1692 = -(-(((i1682 ^ i1672) | (i1682 & i1672)) * 950));
                                int i1702 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                int i1712 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                byte b192 = (byte) ((i1712 ^ (-9)) + ((i1712 & (-9)) << 1));
                                java.lang.Object[] objArr462 = new java.lang.Object[1];
                                m(((-25182939) & i1442) + (i1442 | (-25182939)), s52, (i1662 ^ i1692) + ((i1692 & i1662) << 1), (-35) - (~i1702), b192, objArr462);
                                java.lang.String str362 = (java.lang.String) objArr462[0];
                                int i1722 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                short longPressTimeout5 = (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                int i1732 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                                int edgeSlop22 = android.view.ViewConfiguration.getEdgeSlop();
                                int i1742 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                java.lang.Object[] objArr472 = new java.lang.Object[1];
                                m(((-25182940) & i1722) + (i1722 | (-25182940)), longPressTimeout5, (((-30931003) | i1732) << 1) - (i1732 ^ (-30931003)), (-34) - (edgeSlop22 >> 16), (byte) ((i1742 & (-57)) + (i1742 | (-57))), objArr472);
                                java.lang.String str372 = (java.lang.String) objArr472[0];
                                java.lang.Object[] objArr482 = new java.lang.Object[1];
                                l("㽛㼮顋⨟蔼чኬ偳亽闅而쏡\udc32\ue754ㆩ㵥殯棂", android.os.Process.myTid() >> 22, objArr482);
                                java.lang.String[] strArr42 = {str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, str332, str342, str352, str362, str372, (java.lang.String) objArr482[0]};
                                java.lang.Object[] objArr492 = new java.lang.Object[1];
                                l("ᧇᦵ肇\uf7df舞\u1c8a켵坐栮负巷쓇襁ﾇ\uec6e", android.view.View.getDefaultSize(0, 0), objArr492);
                                java.lang.Object[] objArr502 = {(java.lang.String) objArr492[0]};
                                d2 = com.facetec.sdk.al.d(1590238701);
                                if (d2 == null) {
                                }
                                str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr502);
                                if (str2 != null) {
                                }
                                str3 = str;
                                java.lang.Object[] objArr6822 = new java.lang.Object[1];
                                l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.text.TextUtils.getTrimmedLength(str3), objArr6822);
                                java.lang.Object[] objArr6922 = {(java.lang.String) objArr6822[0]};
                                d3 = com.facetec.sdk.al.d(-864328554);
                                if (d3 != null) {
                                }
                                long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr6922)).longValue();
                                long j4722 = -706044303;
                                long j4822 = 503;
                                long j4922 = -502;
                                long j5022 = j4722 | longValue722;
                                long j5122 = j4722 ^ j2;
                                str5 = str4;
                                long nextInt622 = new java.util.Random().nextInt();
                                long j5222 = j5122 | (nextInt622 ^ j2);
                                long j5322 = (nextInt622 | j5022) ^ j2;
                                long j5422 = (j4722 * j4822) + (j4822 * longValue722) + (j5022 * j4922) + (j4922 * ((((longValue722 ^ j2) | j5122) ^ j2) | (j5222 ^ j2) | j5322)) + (502 * (((j5222 | longValue722) ^ j2) | j5322)) + 1754242723;
                                int myUid102 = android.os.Process.myUid();
                                int i21322 = ((int) (j5422 >> 32)) & (((((~(1365820387 | myUid102)) | (-1508698100)) * 345) - 484646000) + (((~(1365820387 | (~myUid102))) | 16777602) * 345) + ((~(myUid102 | 1508698099)) * 345));
                                int i21422 = ((int) j5422) & (((((~(2054155946 | r3)) | (-2146434988)) * 305) - 1704616964) + (((~((~android.os.Process.myUid()) | 2054155946)) | (-803584940)) * 305));
                                j3 = (i21322 ^ i21422) | (i21322 & i21422);
                                int i21522 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                short s622 = (short) ((-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
                                int i21622 = -(-android.view.View.MeasureSpec.getSize(0));
                                int offsetAfter322 = android.text.TextUtils.getOffsetAfter(str5, 0);
                                java.lang.Object[] objArr7122 = new java.lang.Object[1];
                                m((((-25183010) | i21522) << 1) - (i21522 ^ (-25183010)), s622, ((-30930988) & i21622) + (i21622 | (-30930988)), (offsetAfter322 & (-34)) + (offsetAfter322 | (-34)), (byte) (android.text.TextUtils.indexOf(str5, str5, 0) - 62), objArr7122);
                                java.lang.Object[] objArr7222 = {(java.lang.String) objArr7122[0]};
                                d4 = com.facetec.sdk.al.d(-864328554);
                                if (d4 == null) {
                                }
                                long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr7222)).longValue();
                                long j5522 = 825866529;
                                long j5622 = 988;
                                long j5722 = longValue822 ^ j2;
                                long elapsedRealtime222 = (int) android.os.SystemClock.elapsedRealtime();
                                long j5822 = elapsedRealtime222 ^ j2;
                                long j5922 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j5522) + ((-987) * longValue822) + (((((j5722 | j5822) | j5522) ^ j2) | (((j5522 | longValue822) | elapsedRealtime222) ^ j2)) * j5622) + ((-988) * (j5522 | j5722)) + (j5622 * (((j5722 | elapsedRealtime222) ^ j2) | (((j5522 ^ j2) | j5722) ^ j2) | ((longValue822 | (j5822 | j5522)) ^ j2))) + 222331891;
                                int i21722 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                                int i21822 = ((int) (j5922 >> 32)) & ((((~(477266515 | i21722)) | (-1031263064)) * (-160)) + 590662346 + (((~(i21722 | (-959959896))) | 477266515) * 160));
                                int myPid422 = android.os.Process.myPid();
                                int i21922 = ((int) j5922) & (((((~((-1535644055) | r5)) | 1250431126) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1250431127) | myPid422)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(myPid422 | (-285212929))) | (~((~myPid422) | (-1322096832))) | 71665705) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                long j6022 = (i21822 ^ i21922) | (i21822 & i21922);
                                if (j3 > 0) {
                                }
                                java.lang.Object[] objArr7522 = new java.lang.Object[1];
                                l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr7522);
                                java.lang.Object[] objArr7622 = {(java.lang.String) objArr7522[0]};
                                d5 = com.facetec.sdk.al.d(-864328554);
                                if (d5 == null) {
                                }
                                long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr7622)).longValue();
                                long j6122 = 164638394;
                                long j6222 = 868;
                                long j6322 = j6122 ^ j2;
                                long maxMemory322 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j6422 = maxMemory322 ^ j2;
                                long j6522 = longValue922 ^ j2;
                                long j6622 = j6322 | j6522;
                                long j6722 = (j6222 * j6122) + (j6222 * longValue922) + ((-867) * (((j6322 | j6422) ^ j2) | ((j6522 | j6422) ^ j2))) + ((-1734) * ((j6622 ^ j2) | ((j6322 | maxMemory322) ^ j2) | ((j6522 | maxMemory322) ^ j2))) + (867 * ((((longValue922 | j6322) | maxMemory322) ^ j2) | ((j6622 | j6422) ^ j2) | (((j6522 | j6122) | maxMemory322) ^ j2))) + 883560026;
                                int uptimeMillis322 = (int) android.os.SystemClock.uptimeMillis();
                                int i23122 = ((int) (j6722 >> 32)) & (((~(2009050072 | uptimeMillis322)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1075948654 + (((~((~uptimeMillis322) | 2009050072)) | 1437247952) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                int i23222 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i23322 = ~i23222;
                                int i23422 = ~(i23222 | (-1708154893));
                                int i23522 = ((int) j6722) & ((((~((-304549620) | i23322)) | 270928482 | i23422) * (-502)) + 1424885377 + ((i23422 | (~(i23322 | (-33621138)))) * 502));
                                j4 = (i23522 ^ i23122) | (i23122 & i23522);
                                java.lang.Object[] objArr7822 = new java.lang.Object[1];
                                l("쮚쮵쒄ۭ胑墂㹌喁", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr7822);
                                java.lang.Object[] objArr7922 = {(java.lang.String) objArr7822[0]};
                                d6 = com.facetec.sdk.al.d(-864328554);
                                if (d6 == null) {
                                }
                                long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr7922)).longValue();
                                long j6822 = -1093610948;
                                long j6922 = j6822 ^ j2;
                                long j7022 = longValue1022 ^ j2;
                                long myUid222 = android.os.Process.myUid();
                                long j7122 = 490;
                                long j7222 = (491 * j6822) + ((-489) * longValue1022) + ((j6922 | j7022 | (myUid222 ^ j2)) * (-490)) + ((((j7022 | myUid222) ^ j2) | ((j7022 | j6822) ^ j2)) * j7122) + (j7122 * j6922) + 2141809368;
                                int myTid142 = android.os.Process.myTid();
                                int i23622 = ((int) (j7222 >> 32)) & (((((~(1773922814 | myTid142)) | (~((-553650561) | r4))) * 497) - 1071071599) + (((~(myTid142 | (-553650561))) | (~((~myTid142) | 1637468630)) | 136454184) * 497));
                                int myUid322 = android.os.Process.myUid();
                                int i23722 = ~myUid322;
                                int i23822 = ((int) j7222) & ((((592136 | myUid322) * 988) - 1332283447) + (((~((-1268840018) | i23722)) | 1101045761) * (-1976)) + (((~(myUid322 | 168386392)) | 592136 | (~(i23722 | (-168386393)))) * 988));
                                long j7322 = (i23622 ^ i23822) | (i23622 & i23822);
                                if (j4 <= 0) {
                                }
                                java.lang.Object[] objArr8222 = new java.lang.Object[1];
                                l("뼈뼧굻㞃햲ㅪ༾ç컴ꃴ鶢", (-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1, objArr8222);
                                java.lang.String str4122 = (java.lang.String) objArr8222[0];
                                int i25522 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                short s722 = (short) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                                int i25622 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                int longPressTimeout222 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                int absoluteGravity222 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                java.lang.Object[] objArr8322 = new java.lang.Object[1];
                                m(((i25522 & (-25183009)) << 1) + (i25522 ^ (-25183009)), s722, ((-30930971) & i25622) + (i25622 | (-30930971)), ((longPressTimeout222 | (-34)) << 1) - (longPressTimeout222 ^ (-34)), (byte) (((absoluteGravity222 | (-38)) << 1) - (absoluteGravity222 ^ (-38))), objArr8322);
                                java.lang.String str4222 = (java.lang.String) objArr8322[0];
                                java.lang.Object[] objArr8422 = new java.lang.Object[1];
                                l("豯豀嵆뫖ྕ셗艫\udac0ﶓ僉ჷ䤔漌≖ꅫ럍", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr8422);
                                java.lang.String str4322 = (java.lang.String) objArr8422[0];
                                int i25722 = -android.view.KeyEvent.getDeadChar(0, 0);
                                short packedPositionType222 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                                int i25822 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int i25922 = -(-android.view.View.MeasureSpec.getSize(0));
                                int i26022 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                java.lang.Object[] objArr8522 = new java.lang.Object[1];
                                m(((i25722 | (-25183009)) << 1) - (i25722 ^ (-25183009)), packedPositionType222, ((-30930961) ^ i25822) + ((i25822 & (-30930961)) << 1), (i25922 & (-34)) + (i25922 | (-34)), (byte) ((i26022 & 87) + (i26022 | 87)), objArr8522);
                                java.lang.String str4422 = (java.lang.String) objArr8522[0];
                                int i26122 = -(-android.view.View.MeasureSpec.getSize(0));
                                int i26222 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                int capsMode322 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                                java.lang.Object[] objArr8622 = new java.lang.Object[1];
                                m((i26122 ^ (-25183009)) + ((i26122 & (-25183009)) << 1), (short) ((i26222 & 1) + (i26222 | 1)), ((-30930948) & capsMode322) + (capsMode322 | (-30930948)), (-33) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (-android.os.Process.getGidForName(str5)), objArr8622);
                                java.lang.String str4522 = (java.lang.String) objArr8622[0];
                                int gidForName32 = android.os.Process.getGidForName(str5);
                                short s822 = (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                int size222 = android.view.View.MeasureSpec.getSize(0);
                                int scrollBarSize222 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                java.lang.Object[] objArr8722 = new java.lang.Object[1];
                                m((((-25183008) | gidForName32) << 1) - (gidForName32 ^ (-25183008)), s822, size222 - 30930937, (scrollBarSize222 & (-34)) + (scrollBarSize222 | (-34)), (byte) (14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr8722);
                                java.lang.String str4622 = (java.lang.String) objArr8722[0];
                                java.lang.Object[] objArr8822 = new java.lang.Object[1];
                                l("櫾櫑\uefb8㴃쏩玿ֳᚬ", 0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr8822);
                                java.lang.String[] strArr622 = {str4122, str4222, str4322, str4422, str4522, str4622, (java.lang.String) objArr8822[0]};
                                while (i2 < 7) {
                                }
                                i3 = 0;
                                if (i3 == 0) {
                                }
                            }
                        } else {
                            str7 = str6;
                        }
                        if (obj2 != null) {
                            int i568 = g;
                            int i569 = ((i568 | 1) << 1) - (i568 ^ 1);
                            f = i569 % 128;
                            if (i569 % 2 == 0) {
                                java.lang.Object[] objArr170 = {obj2, 66};
                                java.lang.Object d43 = com.facetec.sdk.al.d(-582857820);
                                if (d43 == null) {
                                    char threadPriority6 = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                    int green5 = android.graphics.Color.green(0);
                                    int maximumFlingVelocity4 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                    byte b89 = (byte) 1;
                                    byte b90 = (byte) (b89 - 1);
                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                    k(b89, b90, b90, objArr171);
                                    d43 = com.facetec.sdk.al.c(threadPriority6, 2365 - green5, (maximumFlingVelocity4 >> 16) + 24, 2058170716, false, (java.lang.String) objArr171[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue30 = ((java.lang.Long) ((java.lang.reflect.Method) d43).invoke(null, objArr170)).longValue();
                                long j175 = -15539581;
                                long j176 = 868;
                                long j177 = j175 ^ j2;
                                long elapsedRealtime10 = (int) android.os.SystemClock.elapsedRealtime();
                                long j178 = elapsedRealtime10 ^ j2;
                                long j179 = longValue30 ^ j2;
                                str6 = str7;
                                long j180 = j177 | j179;
                                long j181 = (j176 * j175) + (j176 * longValue30) + ((-867) * (((j177 | j178) ^ j2) | ((j179 | j178) ^ j2))) + ((-1734) * ((j180 ^ j2) | ((j177 | elapsedRealtime10) ^ j2) | ((j179 | elapsedRealtime10) ^ j2))) + (867 * ((((longValue30 | j177) | elapsedRealtime10) ^ j2) | ((j180 | j178) ^ j2) | (((j179 | j175) | elapsedRealtime10) ^ j2))) + 1174736979;
                                int myUid11 = android.os.Process.myUid();
                                int i570 = ((int) (j181 << 104)) & (((((~(1611535993 | r5)) | (-1785714432)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 679669398) + ((myUid11 | 131144) * (-184)) + ((~(174309582 | (~myUid11))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                int maxMemory9 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i571 = ((int) j181) & ((((~(1490702064 | maxMemory9)) | 1367038821) * 56) + 378889613 + (((~((~maxMemory9) | 1367038821)) | 1490702064) * 56));
                                if (((i571 ^ i570) | (i570 & i571)) != 542074309) {
                                    str = str6;
                                }
                                str = str6;
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                }
                                int i47102 = (android.graphics.PointF.length(f2, f2) > f2 ? 1 : (android.graphics.PointF.length(f2, f2) == f2 ? 0 : -1));
                                short packedPositionType42 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                                int i48102 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                java.lang.Object[] objArr2122 = new java.lang.Object[1];
                                m(((-25182959) ^ i47102) + ((i47102 & (-25182959)) << 1), packedPositionType42, (((-30931128) | i48102) << 1) - (i48102 ^ (-30931128)), (-34) - android.view.View.getDefaultSize(0, 0), (byte) (28 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr2122);
                                java.lang.String str1122 = (java.lang.String) objArr2122[0];
                                int i49102 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                java.lang.Object[] objArr2222 = new java.lang.Object[1];
                                l("芅苤\u171b㏗乌謋ୣ鬃\uf363᪖", (i49102 ^ 48) + ((i49102 & 48) << 1), objArr2222);
                                java.lang.String str1222 = (java.lang.String) objArr2222[0];
                                int i50102 = -(-android.graphics.Color.blue(0));
                                short threadPriority52 = (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                int normalizeMetaState62 = android.view.KeyEvent.normalizeMetaState(0);
                                int keyRepeatDelay22 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                int c722 = com.facetec.sdk.fp.a.c();
                                int i51102 = keyRepeatDelay22 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                                int i52102 = ((i51102 | 7310) << 1) - (i51102 ^ 7310);
                                int i53102 = (~((keyRepeatDelay22 ^ c722) | (keyRepeatDelay22 & c722))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                int i54102 = (i52102 ^ i53102) + ((i53102 & i52102) << 1);
                                int i55102 = (keyRepeatDelay22 ^ 33) | (keyRepeatDelay22 & 33);
                                int i5672 = ~c722;
                                int i5722 = ((i55102 ^ i5672) | (i55102 & i5672)) * (-216);
                                int i5822 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                java.lang.Object[] objArr2322 = new java.lang.Object[1];
                                m((((-25182956) | i50102) << 1) - (i50102 ^ (-25182956)), threadPriority52, (-30931120) - normalizeMetaState62, (i54102 ^ i5722) + ((i5722 & i54102) << 1) + (((~((keyRepeatDelay22 ^ i5672) | (keyRepeatDelay22 & i5672))) | (-34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), (byte) ((i5822 & 120) + (i5822 | 120)), objArr2322);
                                java.lang.String str1322 = (java.lang.String) objArr2322[0];
                                int i5922 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                java.lang.Object[] objArr2422 = new java.lang.Object[1];
                                m(((-25182954) ^ i5922) + ((i5922 & (-25182954)) << 1), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-30931114) - (~(-android.graphics.Color.alpha(0))), (-34) - (~android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) (21 - (~(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr2422);
                                java.lang.String str1422 = (java.lang.String) objArr2422[0];
                                java.lang.Object[] objArr2522 = new java.lang.Object[1];
                                l("編綁\ue76f\ua6fa粄筩鹒꧁ఌ\ueaec", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr2522);
                                java.lang.String str1522 = (java.lang.String) objArr2522[0];
                                int i6022 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                int i6122 = i6022 * (-183);
                                int i6222 = ~com.facetec.sdk.fp.a.c();
                                int i6322 = (((i6122 | 183) << 1) - (i6122 ^ 183)) + ((~((i6222 ^ i6022) | (i6222 & i6022))) * (-184));
                                int i6422 = ~i6022;
                                int i6522 = ~i6422;
                                int i6622 = ~((i6422 ^ i6222) | (i6422 & i6222));
                                int i6722 = (i6622 ^ i6522) | (i6622 & i6522);
                                int i6822 = ~i6222;
                                int i6922 = ((i6722 ^ i6822) | (i6722 & i6822)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                java.lang.Object[] objArr2622 = new java.lang.Object[1];
                                l("弩彀㧮Ⴟﯥꗢ⠒⺷⺌㑠몖봩뱌䛻\u0b45䎡\u0bd2", ((i6322 ^ i6922) + ((i6922 & i6322) << 1)) - 184, objArr2622);
                                java.lang.String str1622 = (java.lang.String) objArr2622[0];
                                int i7022 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                short indexOf92 = (short) android.text.TextUtils.indexOf(str, str, 0);
                                long globalActionKeyTimeout22 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                int i7122 = -android.view.KeyEvent.keyCodeFromString(str);
                                java.lang.Object[] objArr2722 = new java.lang.Object[1];
                                m((i7022 | (-25182951)) + ((-25182951) & i7022), indexOf92, (-30931103) - (globalActionKeyTimeout22 > 0L ? 1 : (globalActionKeyTimeout22 == 0L ? 0 : -1)), (i7122 ^ (-34)) + ((i7122 & (-34)) << 1), (byte) (116 - (~(-(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))))), objArr2722);
                                java.lang.String str1722 = (java.lang.String) objArr2722[0];
                                java.lang.Object[] objArr2822 = new java.lang.Object[1];
                                l("ψΡ碇歴㳹\ue495叕\ue9ad爦畞", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr2822);
                                java.lang.String str1822 = (java.lang.String) objArr2822[0];
                                int rgb222 = android.graphics.Color.rgb(0, 0, 0);
                                int c822 = com.facetec.sdk.fp.a.c();
                                int i7222 = rgb222 * (-947);
                                int i7322 = (612892077 ^ i7222) + ((i7222 & 612892077) << 1);
                                int i7422 = ~rgb222;
                                int i7522 = ((~((8405734 ^ c822) | (8405734 & c822))) | i7422) * (-948);
                                int i7622 = i7422 | 8405734;
                                int i7722 = ~c822;
                                int i7822 = (((i7322 & i7522) + (i7322 | i7522)) - (~(-(-((~((i7722 ^ i7622) | (i7722 & i7622))) * (-948)))))) - 1;
                                int i7922 = -(-((8405734 | rgb222) * 948));
                                short mirror222 = (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                float length42 = android.graphics.PointF.length(0.0f, 0.0f);
                                int i8022 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                int maximumFlingVelocity222 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int c922 = com.facetec.sdk.fp.a.c();
                                int i8122 = (maximumFlingVelocity222 * (-109)) + 1554;
                                int i8222 = ~maximumFlingVelocity222;
                                int i8322 = ~((c922 ^ 14) | (c922 & 14));
                                int i8422 = ((i8322 ^ i8222) | (i8222 & i8322)) * (-220);
                                int i8522 = ~((maximumFlingVelocity222 ^ 14) | (maximumFlingVelocity222 & 14));
                                int i8622 = ~(c922 | 14);
                                int i8722 = (i8122 ^ i8422) + ((i8122 & i8422) << 1) + (((i8622 ^ i8522) | (i8622 & i8522)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                int i8822 = ~(i8222 | 14);
                                int i8922 = ~(maximumFlingVelocity222 | (-15));
                                int i9022 = ((i8922 ^ i8822) | (i8922 & i8822)) * 110;
                                java.lang.Object[] objArr2922 = new java.lang.Object[1];
                                m((i7822 & i7922) + (i7922 | i7822), mirror222, (-30931099) - (length42 > 0.0f ? 1 : (length42 == 0.0f ? 0 : -1)), (i8022 & (-34)) + (i8022 | (-34)), (byte) ((i8722 & i9022) + (i9022 | i8722)), objArr2922);
                                java.lang.String str1922 = (java.lang.String) objArr2922[0];
                                int myPid92 = android.os.Process.myPid();
                                short s222 = (short) ((-android.view.MotionEvent.axisFromString(str)) - 1);
                                int combineMeasuredStates42 = android.view.View.combineMeasuredStates(0, 0);
                                int i9122 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int mode52 = android.view.View.MeasureSpec.getMode(0);
                                int c1022 = com.facetec.sdk.fp.a.c();
                                int i9222 = (mode52 * (-830)) + 59904;
                                int i9322 = ~c1022;
                                int i9422 = (mode52 ^ 72) | (mode52 & 72);
                                int i9522 = -(-(((~((i9422 ^ c1022) | (i9422 & c1022))) | (~((i9322 & (-73)) | (i9322 ^ (-73))))) * (-831)));
                                int i9622 = (mode52 ^ (-73)) | (mode52 & (-73));
                                int i9722 = (i9222 ^ i9522) + ((i9222 & i9522) << 1) + ((~((i9622 & c1022) | (i9622 ^ c1022))) * (-1662));
                                int i9822 = ~mode52;
                                int i9922 = ~((i9822 ^ i9322) | (i9822 & i9322));
                                int i10022 = ~((mode52 ^ c1022) | (mode52 & c1022));
                                int i10122 = (i10022 ^ i9922) | (i10022 & i9922);
                                int i10222 = ~((c1022 ^ 72) | (c1022 & 72));
                                int i10322 = -(-(((i10222 ^ i10122) | (i10122 & i10222)) * 831));
                                byte b1522 = (byte) (((i9722 | i10322) << 1) - (i10322 ^ i9722));
                                java.lang.Object[] objArr3022 = new java.lang.Object[1];
                                m((-25182949) - (~(myPid92 >> 22)), s222, ((-30931097) ^ combineMeasuredStates42) + ((combineMeasuredStates42 & (-30931097)) << 1), (i9122 & (-34)) + (i9122 | (-34)), b1522, objArr3022);
                                java.lang.String str2022 = (java.lang.String) objArr3022[0];
                                int argb32 = android.graphics.Color.argb(0, 0, 0, 0);
                                short s322 = (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                                int makeMeasureSpec52 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i10422 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                int argb222 = android.graphics.Color.argb(0, 0, 0, 0);
                                java.lang.Object[] objArr3122 = new java.lang.Object[1];
                                m((-25182948) - argb32, s322, ((-30931081) ^ makeMeasureSpec52) + ((makeMeasureSpec52 & (-30931081)) << 1), (i10422 ^ (-35)) + ((i10422 & (-35)) << 1), (byte) ((argb222 ^ 82) + ((argb222 & 82) << 1)), objArr3122);
                                java.lang.String str2122 = (java.lang.String) objArr3122[0];
                                int i10522 = -android.view.KeyEvent.keyCodeFromString(str);
                                short indexOf222 = (short) android.text.TextUtils.indexOf(str, str, 0);
                                int i10622 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                int i10722 = -android.view.KeyEvent.getDeadChar(0, 0);
                                int fadingEdgeLength32 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                java.lang.Object[] objArr3222 = new java.lang.Object[1];
                                m(((-25182944) & i10522) + (i10522 | (-25182944)), indexOf222, ((-30931071) & i10622) + (i10622 | (-30931071)), (i10722 & (-34)) + (i10722 | (-34)), (byte) (((fadingEdgeLength32 | 24) << 1) - (fadingEdgeLength32 ^ 24)), objArr3222);
                                java.lang.String str2222 = (java.lang.String) objArr3222[0];
                                java.lang.Object[] objArr3322 = new java.lang.Object[1];
                                l("騠驐⤞혼\u0cf7딎\uee97\ud9b7\uebcb⒛簜䨵祕嘏출뒥", android.view.View.resolveSize(0, 0), objArr3322);
                                java.lang.String str2322 = (java.lang.String) objArr3322[0];
                                int i10822 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                short bitsPerPixel42 = (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
                                int i10922 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                int i11022 = -android.graphics.Color.red(0);
                                int i11122 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                int c1122 = com.facetec.sdk.fp.a.c();
                                int i11222 = (i11122 * 46) - 2530;
                                int i11322 = ~c1122;
                                int i11422 = ~((i11322 ^ 54) | (i11322 & 54));
                                int i11522 = -(-(((i11422 ^ i11122) | (i11422 & i11122)) * (-90)));
                                int i11622 = (i11222 ^ i11522) + ((i11222 & i11522) << 1);
                                int i11722 = ~((c1122 ^ 54) | (c1122 & 54));
                                int i11822 = ~((i11122 ^ (-55)) | (i11122 & (-55)));
                                int i11922 = ((i11722 & i11822) | (i11722 ^ i11822)) * (-45);
                                int i12022 = ~i11122;
                                int i12122 = (~((c1122 ^ i12022) | (c1122 & i12022))) | 54;
                                int i12222 = ~((i11122 ^ i11322) | (i11122 & i11322));
                                byte b1622 = (byte) ((((i11622 & i11922) + (i11922 | i11622)) - (~(((i12222 ^ i12122) | (i12222 & i12122)) * 45))) - 1);
                                java.lang.Object[] objArr3422 = new java.lang.Object[1];
                                m((((-25182945) | i10822) << 1) - (i10822 ^ (-25182945)), bitsPerPixel42, ((-30931063) ^ i10922) + ((i10922 & (-30931063)) << 1), ((i11022 | (-34)) << 1) - (i11022 ^ (-34)), b1622, objArr3422);
                                java.lang.String str2422 = (java.lang.String) objArr3422[0];
                                java.lang.Object[] objArr3522 = new java.lang.Object[1];
                                l("鉥鈗❅\uf89d膂뭂쀴哋\ue398⫁劥", android.widget.ExpandableListView.getPackedPositionType(0L), objArr3522);
                                java.lang.String str2522 = (java.lang.String) objArr3522[0];
                                int i12322 = -android.graphics.Color.blue(0);
                                int i12422 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                short s422 = (short) ((~i12422) + (i12422 << 1));
                                int i12522 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                int i12622 = -(android.os.Process.myTid() >> 22);
                                int defaultSize32 = android.view.View.getDefaultSize(0, 0);
                                int c1222 = com.facetec.sdk.fp.a.c();
                                int i12722 = ~c1222;
                                int i12822 = ~((i12722 & (-109)) | (i12722 ^ (-109)));
                                int i12922 = (defaultSize32 * 165) + 17767 + (((i12822 ^ defaultSize32) | (i12822 & defaultSize32)) * (-328));
                                int i13022 = ((defaultSize32 ^ c1222) | (defaultSize32 & c1222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                int i13122 = (i12922 & i13022) + (i13022 | i12922);
                                int i13222 = ~defaultSize32;
                                int i13322 = (~((c1222 & 108) | (c1222 ^ 108))) | (~((i13222 ^ 108) | (i13222 & 108)));
                                int i13422 = defaultSize32 | i12722;
                                int i13522 = ~((i13422 ^ (-109)) | (i13422 & (-109)));
                                int i13622 = ((i13322 ^ i13522) | (i13522 & i13322)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                byte b1722 = (byte) ((i13122 & i13622) + (i13622 | i13122));
                                java.lang.Object[] objArr3622 = new java.lang.Object[1];
                                m(((-25182941) ^ i12322) + ((i12322 & (-25182941)) << 1), s422, (-30931050) - (~i12522), (i12622 & (-34)) + (i12622 | (-34)), b1722, objArr3622);
                                java.lang.String str2622 = (java.lang.String) objArr3622[0];
                                int i13722 = -android.view.View.resolveSize(0, 0);
                                short offsetAfter42 = (short) android.text.TextUtils.getOffsetAfter(str, 0);
                                int indexOf322 = android.text.TextUtils.indexOf(str, str);
                                int i13822 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr3722 = new java.lang.Object[1];
                                m((-25182942) - (~i13722), offsetAfter42, ((-30931042) ^ indexOf322) + ((indexOf322 & (-30931042)) << 1), (i13822 & (-33)) + (i13822 | (-33)), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) - 36), objArr3722);
                                java.lang.String str2722 = (java.lang.String) objArr3722[0];
                                java.lang.Object[] objArr3822 = new java.lang.Object[1];
                                l("㎇㏴Ṕ\uaafd㿈艅", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3822);
                                java.lang.String str2822 = (java.lang.String) objArr3822[0];
                                java.lang.Object[] objArr3922 = new java.lang.Object[1];
                                l("媡嫒\u1ad6ꉍ꿣蛀髨窷⭝ᝣࡶ\ue924맅旌맆ឹ๖\uea4f⽺蘼鳦砱峇㓑", android.widget.ExpandableListView.getPackedPositionType(0L), objArr3922);
                                java.lang.String str2922 = (java.lang.String) objArr3922[0];
                                java.lang.Object[] objArr4022 = new java.lang.Object[1];
                                l("ᯛᮨὕ潵瘾荃埃ꍹ樰ዚ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4022);
                                java.lang.String str3022 = (java.lang.String) objArr4022[0];
                                int i13922 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                short defaultSize222 = (short) android.view.View.getDefaultSize(0, 0);
                                int i14022 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                java.lang.Object[] objArr4122 = new java.lang.Object[1];
                                m(((-25182942) & i13922) + (i13922 | (-25182942)), defaultSize222, ((-30931036) & i14022) + (i14022 | (-30931036)), android.view.View.MeasureSpec.getSize(0) - 34, (byte) ((-49) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr4122);
                                java.lang.String str3122 = (java.lang.String) objArr4122[0];
                                java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                l("ﵙﴪ㙟酪ờ꩜꧀쮒貥㯜㭜堖ḻ䤀諍ꚟꦠ웑᱃㜐", android.graphics.Color.red(0), objArr4222);
                                java.lang.String str3222 = (java.lang.String) objArr4222[0];
                                java.lang.Object[] objArr4322 = new java.lang.Object[1];
                                m((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 25182940, (short) android.graphics.Color.alpha(0), (-30931034) - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 35, (byte) ((-8) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr4322);
                                java.lang.String str3322 = (java.lang.String) objArr4322[0];
                                int indexOf422 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                short green322 = (short) android.graphics.Color.green(0);
                                int i14122 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i14222 = -android.graphics.Color.rgb(0, 0, 0);
                                int i14322 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                                byte b1822 = (byte) ((i14322 ^ (-107)) + ((i14322 & (-107)) << 1));
                                java.lang.Object[] objArr4422 = new java.lang.Object[1];
                                m(indexOf422 - 25182939, green322, (-30931024) - (~i14122), ((-16777250) & i14222) + (i14222 | (-16777250)), b1822, objArr4422);
                                java.lang.String str3422 = (java.lang.String) objArr4422[0];
                                java.lang.Object[] objArr4522 = new java.lang.Object[1];
                                l("﹫\ufe1f從䈙ߍ쎎窼튈辆分\ue83a䄖ᴏ₉姻", android.text.TextUtils.getTrimmedLength(str), objArr4522);
                                java.lang.String str3522 = (java.lang.String) objArr4522[0];
                                int i14422 = -android.graphics.Color.green(0);
                                int i14522 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int c1322 = com.facetec.sdk.fp.a.c();
                                int i14622 = i14522 * (-380);
                                int i14722 = ((i14622 | 382) << 1) - (i14622 ^ 382);
                                int i14822 = ~i14522;
                                int i14922 = -(-(((c1322 ^ 1) | (c1322 & 1) | i14822) * (-381)));
                                int i15022 = ((i14722 | i14922) << 1) - (i14722 ^ i14922);
                                int i15122 = ~(i14822 | (-2));
                                int i15222 = ~((~c1322) | 1);
                                int i15322 = -(-(((~((i14522 ^ 1) | (i14522 & 1))) | (i15222 ^ i15122) | (i15222 & i15122)) * 381));
                                int i15422 = (i15022 & i15322) + (i15322 | i15022);
                                int i15522 = (~((i14822 ^ 1) | (i14822 & 1))) * 381;
                                short s522 = (short) ((i15422 & i15522) + (i15522 | i15422));
                                int i15622 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int c1422 = com.facetec.sdk.fp.a.c();
                                int i15722 = i15622 * (-949);
                                int i15822 = ((-711239735) & i15722) + (i15722 | (-711239735));
                                int i15922 = ~c1422;
                                int i16022 = ~((30931012 & i15922) | (30931012 ^ i15922));
                                int i16122 = ~i15622;
                                int i16222 = ~((i16122 ^ c1422) | (i16122 & c1422));
                                int i16322 = ((i16022 ^ i16222) | (i16022 & i16222)) * 1900;
                                int i16422 = ~(i15922 | i15622);
                                int i16522 = ~(((-30931013) ^ c1422) | ((-30931013) & c1422));
                                int i16622 = (((i15822 | i16322) << 1) - (i15822 ^ i16322)) + (((i16422 & i16522) | (i16422 ^ i16522)) * (-950));
                                int i16722 = ~((i15922 ^ (-30931013)) | ((-30931013) & i15922));
                                int i16822 = ~(i15622 | c1422);
                                int i16922 = -(-(((i16822 ^ i16722) | (i16822 & i16722)) * 950));
                                int i17022 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                int i17122 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                                byte b1922 = (byte) ((i17122 ^ (-9)) + ((i17122 & (-9)) << 1));
                                java.lang.Object[] objArr4622 = new java.lang.Object[1];
                                m(((-25182939) & i14422) + (i14422 | (-25182939)), s522, (i16622 ^ i16922) + ((i16922 & i16622) << 1), (-35) - (~i17022), b1922, objArr4622);
                                java.lang.String str3622 = (java.lang.String) objArr4622[0];
                                int i17222 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                short longPressTimeout52 = (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                int i17322 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                                int edgeSlop222 = android.view.ViewConfiguration.getEdgeSlop();
                                int i17422 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                java.lang.Object[] objArr4722 = new java.lang.Object[1];
                                m(((-25182940) & i17222) + (i17222 | (-25182940)), longPressTimeout52, (((-30931003) | i17322) << 1) - (i17322 ^ (-30931003)), (-34) - (edgeSlop222 >> 16), (byte) ((i17422 & (-57)) + (i17422 | (-57))), objArr4722);
                                java.lang.String str3722 = (java.lang.String) objArr4722[0];
                                java.lang.Object[] objArr4822 = new java.lang.Object[1];
                                l("㽛㼮顋⨟蔼чኬ偳亽闅而쏡\udc32\ue754ㆩ㵥殯棂", android.os.Process.myTid() >> 22, objArr4822);
                                java.lang.String[] strArr422 = {str1122, str1222, str1322, str1422, str1522, str1622, str1722, str1822, str1922, str2022, str2122, str2222, str2322, str2422, str2522, str2622, str2722, str2822, str2922, str3022, str3122, str3222, str3322, str3422, str3522, str3622, str3722, (java.lang.String) objArr4822[0]};
                                java.lang.Object[] objArr4922 = new java.lang.Object[1];
                                l("ᧇᦵ肇\uf7df舞\u1c8a켵坐栮负巷쓇襁ﾇ\uec6e", android.view.View.getDefaultSize(0, 0), objArr4922);
                                java.lang.Object[] objArr5022 = {(java.lang.String) objArr4922[0]};
                                d2 = com.facetec.sdk.al.d(1590238701);
                                if (d2 == null) {
                                }
                                str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr5022);
                                if (str2 != null) {
                                }
                                str3 = str;
                                java.lang.Object[] objArr68222 = new java.lang.Object[1];
                                l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.text.TextUtils.getTrimmedLength(str3), objArr68222);
                                java.lang.Object[] objArr69222 = {(java.lang.String) objArr68222[0]};
                                d3 = com.facetec.sdk.al.d(-864328554);
                                if (d3 != null) {
                                }
                                long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr69222)).longValue();
                                long j47222 = -706044303;
                                long j48222 = 503;
                                long j49222 = -502;
                                long j50222 = j47222 | longValue7222;
                                long j51222 = j47222 ^ j2;
                                str5 = str4;
                                long nextInt6222 = new java.util.Random().nextInt();
                                long j52222 = j51222 | (nextInt6222 ^ j2);
                                long j53222 = (nextInt6222 | j50222) ^ j2;
                                long j54222 = (j47222 * j48222) + (j48222 * longValue7222) + (j50222 * j49222) + (j49222 * ((((longValue7222 ^ j2) | j51222) ^ j2) | (j52222 ^ j2) | j53222)) + (502 * (((j52222 | longValue7222) ^ j2) | j53222)) + 1754242723;
                                int myUid1022 = android.os.Process.myUid();
                                int i213222 = ((int) (j54222 >> 32)) & (((((~(1365820387 | myUid1022)) | (-1508698100)) * 345) - 484646000) + (((~(1365820387 | (~myUid1022))) | 16777602) * 345) + ((~(myUid1022 | 1508698099)) * 345));
                                int i214222 = ((int) j54222) & (((((~(2054155946 | r3)) | (-2146434988)) * 305) - 1704616964) + (((~((~android.os.Process.myUid()) | 2054155946)) | (-803584940)) * 305));
                                j3 = (i213222 ^ i214222) | (i213222 & i214222);
                                int i215222 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                short s6222 = (short) ((-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
                                int i216222 = -(-android.view.View.MeasureSpec.getSize(0));
                                int offsetAfter3222 = android.text.TextUtils.getOffsetAfter(str5, 0);
                                java.lang.Object[] objArr71222 = new java.lang.Object[1];
                                m((((-25183010) | i215222) << 1) - (i215222 ^ (-25183010)), s6222, ((-30930988) & i216222) + (i216222 | (-30930988)), (offsetAfter3222 & (-34)) + (offsetAfter3222 | (-34)), (byte) (android.text.TextUtils.indexOf(str5, str5, 0) - 62), objArr71222);
                                java.lang.Object[] objArr72222 = {(java.lang.String) objArr71222[0]};
                                d4 = com.facetec.sdk.al.d(-864328554);
                                if (d4 == null) {
                                }
                                long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr72222)).longValue();
                                long j55222 = 825866529;
                                long j56222 = 988;
                                long j57222 = longValue8222 ^ j2;
                                long elapsedRealtime2222 = (int) android.os.SystemClock.elapsedRealtime();
                                long j58222 = elapsedRealtime2222 ^ j2;
                                long j59222 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j55222) + ((-987) * longValue8222) + (((((j57222 | j58222) | j55222) ^ j2) | (((j55222 | longValue8222) | elapsedRealtime2222) ^ j2)) * j56222) + ((-988) * (j55222 | j57222)) + (j56222 * (((j57222 | elapsedRealtime2222) ^ j2) | (((j55222 ^ j2) | j57222) ^ j2) | ((longValue8222 | (j58222 | j55222)) ^ j2))) + 222331891;
                                int i217222 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                                int i218222 = ((int) (j59222 >> 32)) & ((((~(477266515 | i217222)) | (-1031263064)) * (-160)) + 590662346 + (((~(i217222 | (-959959896))) | 477266515) * 160));
                                int myPid4222 = android.os.Process.myPid();
                                int i219222 = ((int) j59222) & (((((~((-1535644055) | r5)) | 1250431126) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1250431127) | myPid4222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(myPid4222 | (-285212929))) | (~((~myPid4222) | (-1322096832))) | 71665705) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                long j60222 = (i218222 ^ i219222) | (i218222 & i219222);
                                if (j3 > 0) {
                                }
                                java.lang.Object[] objArr75222 = new java.lang.Object[1];
                                l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr75222);
                                java.lang.Object[] objArr76222 = {(java.lang.String) objArr75222[0]};
                                d5 = com.facetec.sdk.al.d(-864328554);
                                if (d5 == null) {
                                }
                                long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr76222)).longValue();
                                long j61222 = 164638394;
                                long j62222 = 868;
                                long j63222 = j61222 ^ j2;
                                long maxMemory3222 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j64222 = maxMemory3222 ^ j2;
                                long j65222 = longValue9222 ^ j2;
                                long j66222 = j63222 | j65222;
                                long j67222 = (j62222 * j61222) + (j62222 * longValue9222) + ((-867) * (((j63222 | j64222) ^ j2) | ((j65222 | j64222) ^ j2))) + ((-1734) * ((j66222 ^ j2) | ((j63222 | maxMemory3222) ^ j2) | ((j65222 | maxMemory3222) ^ j2))) + (867 * ((((longValue9222 | j63222) | maxMemory3222) ^ j2) | ((j66222 | j64222) ^ j2) | (((j65222 | j61222) | maxMemory3222) ^ j2))) + 883560026;
                                int uptimeMillis3222 = (int) android.os.SystemClock.uptimeMillis();
                                int i231222 = ((int) (j67222 >> 32)) & (((~(2009050072 | uptimeMillis3222)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1075948654 + (((~((~uptimeMillis3222) | 2009050072)) | 1437247952) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                int i232222 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i233222 = ~i232222;
                                int i234222 = ~(i232222 | (-1708154893));
                                int i235222 = ((int) j67222) & ((((~((-304549620) | i233222)) | 270928482 | i234222) * (-502)) + 1424885377 + ((i234222 | (~(i233222 | (-33621138)))) * 502));
                                j4 = (i235222 ^ i231222) | (i231222 & i235222);
                                java.lang.Object[] objArr78222 = new java.lang.Object[1];
                                l("쮚쮵쒄ۭ胑墂㹌喁", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr78222);
                                java.lang.Object[] objArr79222 = {(java.lang.String) objArr78222[0]};
                                d6 = com.facetec.sdk.al.d(-864328554);
                                if (d6 == null) {
                                }
                                long longValue10222 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr79222)).longValue();
                                long j68222 = -1093610948;
                                long j69222 = j68222 ^ j2;
                                long j70222 = longValue10222 ^ j2;
                                long myUid2222 = android.os.Process.myUid();
                                long j71222 = 490;
                                long j72222 = (491 * j68222) + ((-489) * longValue10222) + ((j69222 | j70222 | (myUid2222 ^ j2)) * (-490)) + ((((j70222 | myUid2222) ^ j2) | ((j70222 | j68222) ^ j2)) * j71222) + (j71222 * j69222) + 2141809368;
                                int myTid1422 = android.os.Process.myTid();
                                int i236222 = ((int) (j72222 >> 32)) & (((((~(1773922814 | myTid1422)) | (~((-553650561) | r4))) * 497) - 1071071599) + (((~(myTid1422 | (-553650561))) | (~((~myTid1422) | 1637468630)) | 136454184) * 497));
                                int myUid3222 = android.os.Process.myUid();
                                int i237222 = ~myUid3222;
                                int i238222 = ((int) j72222) & ((((592136 | myUid3222) * 988) - 1332283447) + (((~((-1268840018) | i237222)) | 1101045761) * (-1976)) + (((~(myUid3222 | 168386392)) | 592136 | (~(i237222 | (-168386393)))) * 988));
                                long j73222 = (i236222 ^ i238222) | (i236222 & i238222);
                                if (j4 <= 0) {
                                }
                                java.lang.Object[] objArr82222 = new java.lang.Object[1];
                                l("뼈뼧굻㞃햲ㅪ༾ç컴ꃴ鶢", (-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1, objArr82222);
                                java.lang.String str41222 = (java.lang.String) objArr82222[0];
                                int i255222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                short s7222 = (short) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                                int i256222 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                                int longPressTimeout2222 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                int absoluteGravity2222 = android.view.Gravity.getAbsoluteGravity(0, 0);
                                java.lang.Object[] objArr83222 = new java.lang.Object[1];
                                m(((i255222 & (-25183009)) << 1) + (i255222 ^ (-25183009)), s7222, ((-30930971) & i256222) + (i256222 | (-30930971)), ((longPressTimeout2222 | (-34)) << 1) - (longPressTimeout2222 ^ (-34)), (byte) (((absoluteGravity2222 | (-38)) << 1) - (absoluteGravity2222 ^ (-38))), objArr83222);
                                java.lang.String str42222 = (java.lang.String) objArr83222[0];
                                java.lang.Object[] objArr84222 = new java.lang.Object[1];
                                l("豯豀嵆뫖ྕ셗艫\udac0ﶓ僉ჷ䤔漌≖ꅫ럍", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr84222);
                                java.lang.String str43222 = (java.lang.String) objArr84222[0];
                                int i257222 = -android.view.KeyEvent.getDeadChar(0, 0);
                                short packedPositionType2222 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                                int i258222 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int i259222 = -(-android.view.View.MeasureSpec.getSize(0));
                                int i260222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                java.lang.Object[] objArr85222 = new java.lang.Object[1];
                                m(((i257222 | (-25183009)) << 1) - (i257222 ^ (-25183009)), packedPositionType2222, ((-30930961) ^ i258222) + ((i258222 & (-30930961)) << 1), (i259222 & (-34)) + (i259222 | (-34)), (byte) ((i260222 & 87) + (i260222 | 87)), objArr85222);
                                java.lang.String str44222 = (java.lang.String) objArr85222[0];
                                int i261222 = -(-android.view.View.MeasureSpec.getSize(0));
                                int i262222 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                int capsMode3222 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                                java.lang.Object[] objArr86222 = new java.lang.Object[1];
                                m((i261222 ^ (-25183009)) + ((i261222 & (-25183009)) << 1), (short) ((i262222 & 1) + (i262222 | 1)), ((-30930948) & capsMode3222) + (capsMode3222 | (-30930948)), (-33) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (-android.os.Process.getGidForName(str5)), objArr86222);
                                java.lang.String str45222 = (java.lang.String) objArr86222[0];
                                int gidForName322 = android.os.Process.getGidForName(str5);
                                short s8222 = (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                int size2222 = android.view.View.MeasureSpec.getSize(0);
                                int scrollBarSize2222 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                                java.lang.Object[] objArr87222 = new java.lang.Object[1];
                                m((((-25183008) | gidForName322) << 1) - (gidForName322 ^ (-25183008)), s8222, size2222 - 30930937, (scrollBarSize2222 & (-34)) + (scrollBarSize2222 | (-34)), (byte) (14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr87222);
                                java.lang.String str46222 = (java.lang.String) objArr87222[0];
                                java.lang.Object[] objArr88222 = new java.lang.Object[1];
                                l("櫾櫑\uefb8㴃쏩玿ֳᚬ", 0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr88222);
                                java.lang.String[] strArr6222 = {str41222, str42222, str43222, str44222, str45222, str46222, (java.lang.String) objArr88222[0]};
                                while (i2 < 7) {
                                }
                                i3 = 0;
                                if (i3 == 0) {
                                }
                            } else {
                                java.lang.String str59 = str7;
                                java.lang.Object[] objArr172 = {obj2, 42};
                                java.lang.Object d44 = com.facetec.sdk.al.d(-582857820);
                                if (d44 == null) {
                                    char packedPositionType5 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                    str = str59;
                                    int lastIndexOf12 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                                    byte b91 = (byte) 1;
                                    byte b92 = (byte) (b91 - 1);
                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                    k(b91, b92, b92, objArr173);
                                    d44 = com.facetec.sdk.al.c(packedPositionType5, 2364 - lastIndexOf12, 24 - (tapTimeout2 >> 16), 2058170716, false, (java.lang.String) objArr173[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                } else {
                                    str = str59;
                                }
                                long longValue31 = ((java.lang.Long) ((java.lang.reflect.Method) d44).invoke(null, objArr172)).longValue();
                                long j182 = -496787812;
                                long j183 = 503;
                                long j184 = -502;
                                long j185 = j182 | longValue31;
                                long j186 = j182 ^ j2;
                                long freeMemory8 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                long j187 = j186 | (freeMemory8 ^ j2);
                                long j188 = (freeMemory8 | j185) ^ j2;
                                long j189 = (j182 * j183) + (j183 * longValue31) + (j184 * j185) + (((((longValue31 ^ j2) | j186) ^ j2) | (j187 ^ j2) | j188) * j184) + (502 * (((j187 | longValue31) ^ j2) | j188)) + 1655985210;
                                int elapsedRealtime11 = (int) android.os.SystemClock.elapsedRealtime();
                                int i573 = ~elapsedRealtime11;
                                int i574 = ~((-1413461925) | i573);
                                int i575 = ((int) (j189 >> 32)) & (((2753796 | i574) * (-712)) + 970333258 + (((~(elapsedRealtime11 | (-1410708129))) | (~(i573 | (-2753797)))) * (-712)) + ((1444278960 | i574) * 712));
                                int i576 = (int) j189;
                                int i577 = ~(new java.util.Random().nextInt() | (-1317203242));
                                int i578 = i576 & ((((1235584425 | i577) * (-658)) - 1687096491) + ((i577 | 1216382249) * 658));
                            }
                        } else {
                            str = str7;
                        }
                        f2 = 0.0f;
                        int i471022 = (android.graphics.PointF.length(f2, f2) > f2 ? 1 : (android.graphics.PointF.length(f2, f2) == f2 ? 0 : -1));
                        short packedPositionType422 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                        int i481022 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr21222 = new java.lang.Object[1];
                        m(((-25182959) ^ i471022) + ((i471022 & (-25182959)) << 1), packedPositionType422, (((-30931128) | i481022) << 1) - (i481022 ^ (-30931128)), (-34) - android.view.View.getDefaultSize(0, 0), (byte) (28 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr21222);
                        java.lang.String str11222 = (java.lang.String) objArr21222[0];
                        int i491022 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        java.lang.Object[] objArr22222 = new java.lang.Object[1];
                        l("芅苤\u171b㏗乌謋ୣ鬃\uf363᪖", (i491022 ^ 48) + ((i491022 & 48) << 1), objArr22222);
                        java.lang.String str12222 = (java.lang.String) objArr22222[0];
                        int i501022 = -(-android.graphics.Color.blue(0));
                        short threadPriority522 = (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                        int normalizeMetaState622 = android.view.KeyEvent.normalizeMetaState(0);
                        int keyRepeatDelay222 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int c7222 = com.facetec.sdk.fp.a.c();
                        int i511022 = keyRepeatDelay222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                        int i521022 = ((i511022 | 7310) << 1) - (i511022 ^ 7310);
                        int i531022 = (~((keyRepeatDelay222 ^ c7222) | (keyRepeatDelay222 & c7222))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                        int i541022 = (i521022 ^ i531022) + ((i531022 & i521022) << 1);
                        int i551022 = (keyRepeatDelay222 ^ 33) | (keyRepeatDelay222 & 33);
                        int i56722 = ~c7222;
                        int i57222 = ((i551022 ^ i56722) | (i551022 & i56722)) * (-216);
                        int i58222 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        java.lang.Object[] objArr23222 = new java.lang.Object[1];
                        m((((-25182956) | i501022) << 1) - (i501022 ^ (-25182956)), threadPriority522, (-30931120) - normalizeMetaState622, (i541022 ^ i57222) + ((i57222 & i541022) << 1) + (((~((keyRepeatDelay222 ^ i56722) | (keyRepeatDelay222 & i56722))) | (-34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), (byte) ((i58222 & 120) + (i58222 | 120)), objArr23222);
                        java.lang.String str13222 = (java.lang.String) objArr23222[0];
                        int i59222 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        java.lang.Object[] objArr24222 = new java.lang.Object[1];
                        m(((-25182954) ^ i59222) + ((i59222 & (-25182954)) << 1), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-30931114) - (~(-android.graphics.Color.alpha(0))), (-34) - (~android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) (21 - (~(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr24222);
                        java.lang.String str14222 = (java.lang.String) objArr24222[0];
                        java.lang.Object[] objArr25222 = new java.lang.Object[1];
                        l("編綁\ue76f\ua6fa粄筩鹒꧁ఌ\ueaec", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr25222);
                        java.lang.String str15222 = (java.lang.String) objArr25222[0];
                        int i60222 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                        int i61222 = i60222 * (-183);
                        int i62222 = ~com.facetec.sdk.fp.a.c();
                        int i63222 = (((i61222 | 183) << 1) - (i61222 ^ 183)) + ((~((i62222 ^ i60222) | (i62222 & i60222))) * (-184));
                        int i64222 = ~i60222;
                        int i65222 = ~i64222;
                        int i66222 = ~((i64222 ^ i62222) | (i64222 & i62222));
                        int i67222 = (i66222 ^ i65222) | (i66222 & i65222);
                        int i68222 = ~i62222;
                        int i69222 = ((i67222 ^ i68222) | (i67222 & i68222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                        java.lang.Object[] objArr26222 = new java.lang.Object[1];
                        l("弩彀㧮Ⴟﯥꗢ⠒⺷⺌㑠몖봩뱌䛻\u0b45䎡\u0bd2", ((i63222 ^ i69222) + ((i69222 & i63222) << 1)) - 184, objArr26222);
                        java.lang.String str16222 = (java.lang.String) objArr26222[0];
                        int i70222 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        short indexOf922 = (short) android.text.TextUtils.indexOf(str, str, 0);
                        long globalActionKeyTimeout222 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        int i71222 = -android.view.KeyEvent.keyCodeFromString(str);
                        java.lang.Object[] objArr27222 = new java.lang.Object[1];
                        m((i70222 | (-25182951)) + ((-25182951) & i70222), indexOf922, (-30931103) - (globalActionKeyTimeout222 > 0L ? 1 : (globalActionKeyTimeout222 == 0L ? 0 : -1)), (i71222 ^ (-34)) + ((i71222 & (-34)) << 1), (byte) (116 - (~(-(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))))), objArr27222);
                        java.lang.String str17222 = (java.lang.String) objArr27222[0];
                        java.lang.Object[] objArr28222 = new java.lang.Object[1];
                        l("ψΡ碇歴㳹\ue495叕\ue9ad爦畞", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr28222);
                        java.lang.String str18222 = (java.lang.String) objArr28222[0];
                        int rgb2222 = android.graphics.Color.rgb(0, 0, 0);
                        int c8222 = com.facetec.sdk.fp.a.c();
                        int i72222 = rgb2222 * (-947);
                        int i73222 = (612892077 ^ i72222) + ((i72222 & 612892077) << 1);
                        int i74222 = ~rgb2222;
                        int i75222 = ((~((8405734 ^ c8222) | (8405734 & c8222))) | i74222) * (-948);
                        int i76222 = i74222 | 8405734;
                        int i77222 = ~c8222;
                        int i78222 = (((i73222 & i75222) + (i73222 | i75222)) - (~(-(-((~((i77222 ^ i76222) | (i77222 & i76222))) * (-948)))))) - 1;
                        int i79222 = -(-((8405734 | rgb2222) * 948));
                        short mirror2222 = (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        float length422 = android.graphics.PointF.length(0.0f, 0.0f);
                        int i80222 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                        int maximumFlingVelocity2222 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                        int c9222 = com.facetec.sdk.fp.a.c();
                        int i81222 = (maximumFlingVelocity2222 * (-109)) + 1554;
                        int i82222 = ~maximumFlingVelocity2222;
                        int i83222 = ~((c9222 ^ 14) | (c9222 & 14));
                        int i84222 = ((i83222 ^ i82222) | (i82222 & i83222)) * (-220);
                        int i85222 = ~((maximumFlingVelocity2222 ^ 14) | (maximumFlingVelocity2222 & 14));
                        int i86222 = ~(c9222 | 14);
                        int i87222 = (i81222 ^ i84222) + ((i81222 & i84222) << 1) + (((i86222 ^ i85222) | (i86222 & i85222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                        int i88222 = ~(i82222 | 14);
                        int i89222 = ~(maximumFlingVelocity2222 | (-15));
                        int i90222 = ((i89222 ^ i88222) | (i89222 & i88222)) * 110;
                        java.lang.Object[] objArr29222 = new java.lang.Object[1];
                        m((i78222 & i79222) + (i79222 | i78222), mirror2222, (-30931099) - (length422 > 0.0f ? 1 : (length422 == 0.0f ? 0 : -1)), (i80222 & (-34)) + (i80222 | (-34)), (byte) ((i87222 & i90222) + (i90222 | i87222)), objArr29222);
                        java.lang.String str19222 = (java.lang.String) objArr29222[0];
                        int myPid922 = android.os.Process.myPid();
                        short s2222 = (short) ((-android.view.MotionEvent.axisFromString(str)) - 1);
                        int combineMeasuredStates422 = android.view.View.combineMeasuredStates(0, 0);
                        int i91222 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int mode522 = android.view.View.MeasureSpec.getMode(0);
                        int c10222 = com.facetec.sdk.fp.a.c();
                        int i92222 = (mode522 * (-830)) + 59904;
                        int i93222 = ~c10222;
                        int i94222 = (mode522 ^ 72) | (mode522 & 72);
                        int i95222 = -(-(((~((i94222 ^ c10222) | (i94222 & c10222))) | (~((i93222 & (-73)) | (i93222 ^ (-73))))) * (-831)));
                        int i96222 = (mode522 ^ (-73)) | (mode522 & (-73));
                        int i97222 = (i92222 ^ i95222) + ((i92222 & i95222) << 1) + ((~((i96222 & c10222) | (i96222 ^ c10222))) * (-1662));
                        int i98222 = ~mode522;
                        int i99222 = ~((i98222 ^ i93222) | (i98222 & i93222));
                        int i100222 = ~((mode522 ^ c10222) | (mode522 & c10222));
                        int i101222 = (i100222 ^ i99222) | (i100222 & i99222);
                        int i102222 = ~((c10222 ^ 72) | (c10222 & 72));
                        int i103222 = -(-(((i102222 ^ i101222) | (i101222 & i102222)) * 831));
                        byte b15222 = (byte) (((i97222 | i103222) << 1) - (i103222 ^ i97222));
                        java.lang.Object[] objArr30222 = new java.lang.Object[1];
                        m((-25182949) - (~(myPid922 >> 22)), s2222, ((-30931097) ^ combineMeasuredStates422) + ((combineMeasuredStates422 & (-30931097)) << 1), (i91222 & (-34)) + (i91222 | (-34)), b15222, objArr30222);
                        java.lang.String str20222 = (java.lang.String) objArr30222[0];
                        int argb322 = android.graphics.Color.argb(0, 0, 0, 0);
                        short s3222 = (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                        int makeMeasureSpec522 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i104222 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                        int argb2222 = android.graphics.Color.argb(0, 0, 0, 0);
                        java.lang.Object[] objArr31222 = new java.lang.Object[1];
                        m((-25182948) - argb322, s3222, ((-30931081) ^ makeMeasureSpec522) + ((makeMeasureSpec522 & (-30931081)) << 1), (i104222 ^ (-35)) + ((i104222 & (-35)) << 1), (byte) ((argb2222 ^ 82) + ((argb2222 & 82) << 1)), objArr31222);
                        java.lang.String str21222 = (java.lang.String) objArr31222[0];
                        int i105222 = -android.view.KeyEvent.keyCodeFromString(str);
                        short indexOf2222 = (short) android.text.TextUtils.indexOf(str, str, 0);
                        int i106222 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                        int i107222 = -android.view.KeyEvent.getDeadChar(0, 0);
                        int fadingEdgeLength322 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                        java.lang.Object[] objArr32222 = new java.lang.Object[1];
                        m(((-25182944) & i105222) + (i105222 | (-25182944)), indexOf2222, ((-30931071) & i106222) + (i106222 | (-30931071)), (i107222 & (-34)) + (i107222 | (-34)), (byte) (((fadingEdgeLength322 | 24) << 1) - (fadingEdgeLength322 ^ 24)), objArr32222);
                        java.lang.String str22222 = (java.lang.String) objArr32222[0];
                        java.lang.Object[] objArr33222 = new java.lang.Object[1];
                        l("騠驐⤞혼\u0cf7딎\uee97\ud9b7\uebcb⒛簜䨵祕嘏출뒥", android.view.View.resolveSize(0, 0), objArr33222);
                        java.lang.String str23222 = (java.lang.String) objArr33222[0];
                        int i108222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        short bitsPerPixel422 = (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
                        int i109222 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                        int i110222 = -android.graphics.Color.red(0);
                        int i111222 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        int c11222 = com.facetec.sdk.fp.a.c();
                        int i112222 = (i111222 * 46) - 2530;
                        int i113222 = ~c11222;
                        int i114222 = ~((i113222 ^ 54) | (i113222 & 54));
                        int i115222 = -(-(((i114222 ^ i111222) | (i114222 & i111222)) * (-90)));
                        int i116222 = (i112222 ^ i115222) + ((i112222 & i115222) << 1);
                        int i117222 = ~((c11222 ^ 54) | (c11222 & 54));
                        int i118222 = ~((i111222 ^ (-55)) | (i111222 & (-55)));
                        int i119222 = ((i117222 & i118222) | (i117222 ^ i118222)) * (-45);
                        int i120222 = ~i111222;
                        int i121222 = (~((c11222 ^ i120222) | (c11222 & i120222))) | 54;
                        int i122222 = ~((i111222 ^ i113222) | (i111222 & i113222));
                        byte b16222 = (byte) ((((i116222 & i119222) + (i119222 | i116222)) - (~(((i122222 ^ i121222) | (i122222 & i121222)) * 45))) - 1);
                        java.lang.Object[] objArr34222 = new java.lang.Object[1];
                        m((((-25182945) | i108222) << 1) - (i108222 ^ (-25182945)), bitsPerPixel422, ((-30931063) ^ i109222) + ((i109222 & (-30931063)) << 1), ((i110222 | (-34)) << 1) - (i110222 ^ (-34)), b16222, objArr34222);
                        java.lang.String str24222 = (java.lang.String) objArr34222[0];
                        java.lang.Object[] objArr35222 = new java.lang.Object[1];
                        l("鉥鈗❅\uf89d膂뭂쀴哋\ue398⫁劥", android.widget.ExpandableListView.getPackedPositionType(0L), objArr35222);
                        java.lang.String str25222 = (java.lang.String) objArr35222[0];
                        int i123222 = -android.graphics.Color.blue(0);
                        int i124222 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        short s4222 = (short) ((~i124222) + (i124222 << 1));
                        int i125222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                        int i126222 = -(android.os.Process.myTid() >> 22);
                        int defaultSize322 = android.view.View.getDefaultSize(0, 0);
                        int c12222 = com.facetec.sdk.fp.a.c();
                        int i127222 = ~c12222;
                        int i128222 = ~((i127222 & (-109)) | (i127222 ^ (-109)));
                        int i129222 = (defaultSize322 * 165) + 17767 + (((i128222 ^ defaultSize322) | (i128222 & defaultSize322)) * (-328));
                        int i130222 = ((defaultSize322 ^ c12222) | (defaultSize322 & c12222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                        int i131222 = (i129222 & i130222) + (i130222 | i129222);
                        int i132222 = ~defaultSize322;
                        int i133222 = (~((c12222 & 108) | (c12222 ^ 108))) | (~((i132222 ^ 108) | (i132222 & 108)));
                        int i134222 = defaultSize322 | i127222;
                        int i135222 = ~((i134222 ^ (-109)) | (i134222 & (-109)));
                        int i136222 = ((i133222 ^ i135222) | (i135222 & i133222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                        byte b17222 = (byte) ((i131222 & i136222) + (i136222 | i131222));
                        java.lang.Object[] objArr36222 = new java.lang.Object[1];
                        m(((-25182941) ^ i123222) + ((i123222 & (-25182941)) << 1), s4222, (-30931050) - (~i125222), (i126222 & (-34)) + (i126222 | (-34)), b17222, objArr36222);
                        java.lang.String str26222 = (java.lang.String) objArr36222[0];
                        int i137222 = -android.view.View.resolveSize(0, 0);
                        short offsetAfter422 = (short) android.text.TextUtils.getOffsetAfter(str, 0);
                        int indexOf3222 = android.text.TextUtils.indexOf(str, str);
                        int i138222 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr37222 = new java.lang.Object[1];
                        m((-25182942) - (~i137222), offsetAfter422, ((-30931042) ^ indexOf3222) + ((indexOf3222 & (-30931042)) << 1), (i138222 & (-33)) + (i138222 | (-33)), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) - 36), objArr37222);
                        java.lang.String str27222 = (java.lang.String) objArr37222[0];
                        java.lang.Object[] objArr38222 = new java.lang.Object[1];
                        l("㎇㏴Ṕ\uaafd㿈艅", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr38222);
                        java.lang.String str28222 = (java.lang.String) objArr38222[0];
                        java.lang.Object[] objArr39222 = new java.lang.Object[1];
                        l("媡嫒\u1ad6ꉍ꿣蛀髨窷⭝ᝣࡶ\ue924맅旌맆ឹ๖\uea4f⽺蘼鳦砱峇㓑", android.widget.ExpandableListView.getPackedPositionType(0L), objArr39222);
                        java.lang.String str29222 = (java.lang.String) objArr39222[0];
                        java.lang.Object[] objArr40222 = new java.lang.Object[1];
                        l("ᯛᮨὕ潵瘾荃埃ꍹ樰ዚ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr40222);
                        java.lang.String str30222 = (java.lang.String) objArr40222[0];
                        int i139222 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        short defaultSize2222 = (short) android.view.View.getDefaultSize(0, 0);
                        int i140222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        java.lang.Object[] objArr41222 = new java.lang.Object[1];
                        m(((-25182942) & i139222) + (i139222 | (-25182942)), defaultSize2222, ((-30931036) & i140222) + (i140222 | (-30931036)), android.view.View.MeasureSpec.getSize(0) - 34, (byte) ((-49) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr41222);
                        java.lang.String str31222 = (java.lang.String) objArr41222[0];
                        java.lang.Object[] objArr42222 = new java.lang.Object[1];
                        l("ﵙﴪ㙟酪ờ꩜꧀쮒貥㯜㭜堖ḻ䤀諍ꚟꦠ웑᱃㜐", android.graphics.Color.red(0), objArr42222);
                        java.lang.String str32222 = (java.lang.String) objArr42222[0];
                        java.lang.Object[] objArr43222 = new java.lang.Object[1];
                        m((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 25182940, (short) android.graphics.Color.alpha(0), (-30931034) - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 35, (byte) ((-8) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr43222);
                        java.lang.String str33222 = (java.lang.String) objArr43222[0];
                        int indexOf4222 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        short green3222 = (short) android.graphics.Color.green(0);
                        int i141222 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i142222 = -android.graphics.Color.rgb(0, 0, 0);
                        int i143222 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                        byte b18222 = (byte) ((i143222 ^ (-107)) + ((i143222 & (-107)) << 1));
                        java.lang.Object[] objArr44222 = new java.lang.Object[1];
                        m(indexOf4222 - 25182939, green3222, (-30931024) - (~i141222), ((-16777250) & i142222) + (i142222 | (-16777250)), b18222, objArr44222);
                        java.lang.String str34222 = (java.lang.String) objArr44222[0];
                        java.lang.Object[] objArr45222 = new java.lang.Object[1];
                        l("﹫\ufe1f從䈙ߍ쎎窼튈辆分\ue83a䄖ᴏ₉姻", android.text.TextUtils.getTrimmedLength(str), objArr45222);
                        java.lang.String str35222 = (java.lang.String) objArr45222[0];
                        int i144222 = -android.graphics.Color.green(0);
                        int i145222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int c13222 = com.facetec.sdk.fp.a.c();
                        int i146222 = i145222 * (-380);
                        int i147222 = ((i146222 | 382) << 1) - (i146222 ^ 382);
                        int i148222 = ~i145222;
                        int i149222 = -(-(((c13222 ^ 1) | (c13222 & 1) | i148222) * (-381)));
                        int i150222 = ((i147222 | i149222) << 1) - (i147222 ^ i149222);
                        int i151222 = ~(i148222 | (-2));
                        int i152222 = ~((~c13222) | 1);
                        int i153222 = -(-(((~((i145222 ^ 1) | (i145222 & 1))) | (i152222 ^ i151222) | (i152222 & i151222)) * 381));
                        int i154222 = (i150222 & i153222) + (i153222 | i150222);
                        int i155222 = (~((i148222 ^ 1) | (i148222 & 1))) * 381;
                        short s5222 = (short) ((i154222 & i155222) + (i155222 | i154222));
                        int i156222 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int c14222 = com.facetec.sdk.fp.a.c();
                        int i157222 = i156222 * (-949);
                        int i158222 = ((-711239735) & i157222) + (i157222 | (-711239735));
                        int i159222 = ~c14222;
                        int i160222 = ~((30931012 & i159222) | (30931012 ^ i159222));
                        int i161222 = ~i156222;
                        int i162222 = ~((i161222 ^ c14222) | (i161222 & c14222));
                        int i163222 = ((i160222 ^ i162222) | (i160222 & i162222)) * 1900;
                        int i164222 = ~(i159222 | i156222);
                        int i165222 = ~(((-30931013) ^ c14222) | ((-30931013) & c14222));
                        int i166222 = (((i158222 | i163222) << 1) - (i158222 ^ i163222)) + (((i164222 & i165222) | (i164222 ^ i165222)) * (-950));
                        int i167222 = ~((i159222 ^ (-30931013)) | ((-30931013) & i159222));
                        int i168222 = ~(i156222 | c14222);
                        int i169222 = -(-(((i168222 ^ i167222) | (i168222 & i167222)) * 950));
                        int i170222 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int i171222 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                        byte b19222 = (byte) ((i171222 ^ (-9)) + ((i171222 & (-9)) << 1));
                        java.lang.Object[] objArr46222 = new java.lang.Object[1];
                        m(((-25182939) & i144222) + (i144222 | (-25182939)), s5222, (i166222 ^ i169222) + ((i169222 & i166222) << 1), (-35) - (~i170222), b19222, objArr46222);
                        java.lang.String str36222 = (java.lang.String) objArr46222[0];
                        int i172222 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        short longPressTimeout522 = (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                        int i173222 = -android.text.TextUtils.indexOf(str, str, 0, 0);
                        int edgeSlop2222 = android.view.ViewConfiguration.getEdgeSlop();
                        int i174222 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        java.lang.Object[] objArr47222 = new java.lang.Object[1];
                        m(((-25182940) & i172222) + (i172222 | (-25182940)), longPressTimeout522, (((-30931003) | i173222) << 1) - (i173222 ^ (-30931003)), (-34) - (edgeSlop2222 >> 16), (byte) ((i174222 & (-57)) + (i174222 | (-57))), objArr47222);
                        java.lang.String str37222 = (java.lang.String) objArr47222[0];
                        java.lang.Object[] objArr48222 = new java.lang.Object[1];
                        l("㽛㼮顋⨟蔼чኬ偳亽闅而쏡\udc32\ue754ㆩ㵥殯棂", android.os.Process.myTid() >> 22, objArr48222);
                        java.lang.String[] strArr4222 = {str11222, str12222, str13222, str14222, str15222, str16222, str17222, str18222, str19222, str20222, str21222, str22222, str23222, str24222, str25222, str26222, str27222, str28222, str29222, str30222, str31222, str32222, str33222, str34222, str35222, str36222, str37222, (java.lang.String) objArr48222[0]};
                        java.lang.Object[] objArr49222 = new java.lang.Object[1];
                        l("ᧇᦵ肇\uf7df舞\u1c8a켵坐栮负巷쓇襁ﾇ\uec6e", android.view.View.getDefaultSize(0, 0), objArr49222);
                        java.lang.Object[] objArr50222 = {(java.lang.String) objArr49222[0]};
                        d2 = com.facetec.sdk.al.d(1590238701);
                        if (d2 == null) {
                        }
                        str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr50222);
                        if (str2 != null) {
                        }
                        str3 = str;
                        java.lang.Object[] objArr682222 = new java.lang.Object[1];
                        l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.text.TextUtils.getTrimmedLength(str3), objArr682222);
                        java.lang.Object[] objArr692222 = {(java.lang.String) objArr682222[0]};
                        d3 = com.facetec.sdk.al.d(-864328554);
                        if (d3 != null) {
                        }
                        long longValue72222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr692222)).longValue();
                        long j472222 = -706044303;
                        long j482222 = 503;
                        long j492222 = -502;
                        long j502222 = j472222 | longValue72222;
                        long j512222 = j472222 ^ j2;
                        str5 = str4;
                        long nextInt62222 = new java.util.Random().nextInt();
                        long j522222 = j512222 | (nextInt62222 ^ j2);
                        long j532222 = (nextInt62222 | j502222) ^ j2;
                        long j542222 = (j472222 * j482222) + (j482222 * longValue72222) + (j502222 * j492222) + (j492222 * ((((longValue72222 ^ j2) | j512222) ^ j2) | (j522222 ^ j2) | j532222)) + (502 * (((j522222 | longValue72222) ^ j2) | j532222)) + 1754242723;
                        int myUid10222 = android.os.Process.myUid();
                        int i2132222 = ((int) (j542222 >> 32)) & (((((~(1365820387 | myUid10222)) | (-1508698100)) * 345) - 484646000) + (((~(1365820387 | (~myUid10222))) | 16777602) * 345) + ((~(myUid10222 | 1508698099)) * 345));
                        int i2142222 = ((int) j542222) & (((((~(2054155946 | r3)) | (-2146434988)) * 305) - 1704616964) + (((~((~android.os.Process.myUid()) | 2054155946)) | (-803584940)) * 305));
                        j3 = (i2132222 ^ i2142222) | (i2132222 & i2142222);
                        int i2152222 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        short s62222 = (short) ((-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
                        int i2162222 = -(-android.view.View.MeasureSpec.getSize(0));
                        int offsetAfter32222 = android.text.TextUtils.getOffsetAfter(str5, 0);
                        java.lang.Object[] objArr712222 = new java.lang.Object[1];
                        m((((-25183010) | i2152222) << 1) - (i2152222 ^ (-25183010)), s62222, ((-30930988) & i2162222) + (i2162222 | (-30930988)), (offsetAfter32222 & (-34)) + (offsetAfter32222 | (-34)), (byte) (android.text.TextUtils.indexOf(str5, str5, 0) - 62), objArr712222);
                        java.lang.Object[] objArr722222 = {(java.lang.String) objArr712222[0]};
                        d4 = com.facetec.sdk.al.d(-864328554);
                        if (d4 == null) {
                        }
                        long longValue82222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr722222)).longValue();
                        long j552222 = 825866529;
                        long j562222 = 988;
                        long j572222 = longValue82222 ^ j2;
                        long elapsedRealtime22222 = (int) android.os.SystemClock.elapsedRealtime();
                        long j582222 = elapsedRealtime22222 ^ j2;
                        long j592222 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j552222) + ((-987) * longValue82222) + (((((j572222 | j582222) | j552222) ^ j2) | (((j552222 | longValue82222) | elapsedRealtime22222) ^ j2)) * j562222) + ((-988) * (j552222 | j572222)) + (j562222 * (((j572222 | elapsedRealtime22222) ^ j2) | (((j552222 ^ j2) | j572222) ^ j2) | ((longValue82222 | (j582222 | j552222)) ^ j2))) + 222331891;
                        int i2172222 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                        int i2182222 = ((int) (j592222 >> 32)) & ((((~(477266515 | i2172222)) | (-1031263064)) * (-160)) + 590662346 + (((~(i2172222 | (-959959896))) | 477266515) * 160));
                        int myPid42222 = android.os.Process.myPid();
                        int i2192222 = ((int) j592222) & (((((~((-1535644055) | r5)) | 1250431126) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1250431127) | myPid42222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(myPid42222 | (-285212929))) | (~((~myPid42222) | (-1322096832))) | 71665705) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                        long j602222 = (i2182222 ^ i2192222) | (i2182222 & i2192222);
                        if (j3 > 0) {
                        }
                        java.lang.Object[] objArr752222 = new java.lang.Object[1];
                        l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr752222);
                        java.lang.Object[] objArr762222 = {(java.lang.String) objArr752222[0]};
                        d5 = com.facetec.sdk.al.d(-864328554);
                        if (d5 == null) {
                        }
                        long longValue92222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr762222)).longValue();
                        long j612222 = 164638394;
                        long j622222 = 868;
                        long j632222 = j612222 ^ j2;
                        long maxMemory32222 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        long j642222 = maxMemory32222 ^ j2;
                        long j652222 = longValue92222 ^ j2;
                        long j662222 = j632222 | j652222;
                        long j672222 = (j622222 * j612222) + (j622222 * longValue92222) + ((-867) * (((j632222 | j642222) ^ j2) | ((j652222 | j642222) ^ j2))) + ((-1734) * ((j662222 ^ j2) | ((j632222 | maxMemory32222) ^ j2) | ((j652222 | maxMemory32222) ^ j2))) + (867 * ((((longValue92222 | j632222) | maxMemory32222) ^ j2) | ((j662222 | j642222) ^ j2) | (((j652222 | j612222) | maxMemory32222) ^ j2))) + 883560026;
                        int uptimeMillis32222 = (int) android.os.SystemClock.uptimeMillis();
                        int i2312222 = ((int) (j672222 >> 32)) & (((~(2009050072 | uptimeMillis32222)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1075948654 + (((~((~uptimeMillis32222) | 2009050072)) | 1437247952) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                        int i2322222 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        int i2332222 = ~i2322222;
                        int i2342222 = ~(i2322222 | (-1708154893));
                        int i2352222 = ((int) j672222) & ((((~((-304549620) | i2332222)) | 270928482 | i2342222) * (-502)) + 1424885377 + ((i2342222 | (~(i2332222 | (-33621138)))) * 502));
                        j4 = (i2352222 ^ i2312222) | (i2312222 & i2352222);
                        java.lang.Object[] objArr782222 = new java.lang.Object[1];
                        l("쮚쮵쒄ۭ胑墂㹌喁", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr782222);
                        java.lang.Object[] objArr792222 = {(java.lang.String) objArr782222[0]};
                        d6 = com.facetec.sdk.al.d(-864328554);
                        if (d6 == null) {
                        }
                        long longValue102222 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr792222)).longValue();
                        long j682222 = -1093610948;
                        long j692222 = j682222 ^ j2;
                        long j702222 = longValue102222 ^ j2;
                        long myUid22222 = android.os.Process.myUid();
                        long j712222 = 490;
                        long j722222 = (491 * j682222) + ((-489) * longValue102222) + ((j692222 | j702222 | (myUid22222 ^ j2)) * (-490)) + ((((j702222 | myUid22222) ^ j2) | ((j702222 | j682222) ^ j2)) * j712222) + (j712222 * j692222) + 2141809368;
                        int myTid14222 = android.os.Process.myTid();
                        int i2362222 = ((int) (j722222 >> 32)) & (((((~(1773922814 | myTid14222)) | (~((-553650561) | r4))) * 497) - 1071071599) + (((~(myTid14222 | (-553650561))) | (~((~myTid14222) | 1637468630)) | 136454184) * 497));
                        int myUid32222 = android.os.Process.myUid();
                        int i2372222 = ~myUid32222;
                        int i2382222 = ((int) j722222) & ((((592136 | myUid32222) * 988) - 1332283447) + (((~((-1268840018) | i2372222)) | 1101045761) * (-1976)) + (((~(myUid32222 | 168386392)) | 592136 | (~(i2372222 | (-168386393)))) * 988));
                        long j732222 = (i2362222 ^ i2382222) | (i2362222 & i2382222);
                        if (j4 <= 0) {
                        }
                        java.lang.Object[] objArr822222 = new java.lang.Object[1];
                        l("뼈뼧굻㞃햲ㅪ༾ç컴ꃴ鶢", (-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1, objArr822222);
                        java.lang.String str412222 = (java.lang.String) objArr822222[0];
                        int i2552222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        short s72222 = (short) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
                        int i2562222 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                        int longPressTimeout22222 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                        int absoluteGravity22222 = android.view.Gravity.getAbsoluteGravity(0, 0);
                        java.lang.Object[] objArr832222 = new java.lang.Object[1];
                        m(((i2552222 & (-25183009)) << 1) + (i2552222 ^ (-25183009)), s72222, ((-30930971) & i2562222) + (i2562222 | (-30930971)), ((longPressTimeout22222 | (-34)) << 1) - (longPressTimeout22222 ^ (-34)), (byte) (((absoluteGravity22222 | (-38)) << 1) - (absoluteGravity22222 ^ (-38))), objArr832222);
                        java.lang.String str422222 = (java.lang.String) objArr832222[0];
                        java.lang.Object[] objArr842222 = new java.lang.Object[1];
                        l("豯豀嵆뫖ྕ셗艫\udac0ﶓ僉ჷ䤔漌≖ꅫ럍", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr842222);
                        java.lang.String str432222 = (java.lang.String) objArr842222[0];
                        int i2572222 = -android.view.KeyEvent.getDeadChar(0, 0);
                        short packedPositionType22222 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
                        int i2582222 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int i2592222 = -(-android.view.View.MeasureSpec.getSize(0));
                        int i2602222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        java.lang.Object[] objArr852222 = new java.lang.Object[1];
                        m(((i2572222 | (-25183009)) << 1) - (i2572222 ^ (-25183009)), packedPositionType22222, ((-30930961) ^ i2582222) + ((i2582222 & (-30930961)) << 1), (i2592222 & (-34)) + (i2592222 | (-34)), (byte) ((i2602222 & 87) + (i2602222 | 87)), objArr852222);
                        java.lang.String str442222 = (java.lang.String) objArr852222[0];
                        int i2612222 = -(-android.view.View.MeasureSpec.getSize(0));
                        int i2622222 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                        int capsMode32222 = android.text.TextUtils.getCapsMode(str5, 0, 0);
                        java.lang.Object[] objArr862222 = new java.lang.Object[1];
                        m((i2612222 ^ (-25183009)) + ((i2612222 & (-25183009)) << 1), (short) ((i2622222 & 1) + (i2622222 | 1)), ((-30930948) & capsMode32222) + (capsMode32222 | (-30930948)), (-33) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (-android.os.Process.getGidForName(str5)), objArr862222);
                        java.lang.String str452222 = (java.lang.String) objArr862222[0];
                        int gidForName3222 = android.os.Process.getGidForName(str5);
                        short s82222 = (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int size22222 = android.view.View.MeasureSpec.getSize(0);
                        int scrollBarSize22222 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
                        java.lang.Object[] objArr872222 = new java.lang.Object[1];
                        m((((-25183008) | gidForName3222) << 1) - (gidForName3222 ^ (-25183008)), s82222, size22222 - 30930937, (scrollBarSize22222 & (-34)) + (scrollBarSize22222 | (-34)), (byte) (14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr872222);
                        java.lang.String str462222 = (java.lang.String) objArr872222[0];
                        java.lang.Object[] objArr882222 = new java.lang.Object[1];
                        l("櫾櫑\uefb8㴃쏩玿ֳᚬ", 0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr882222);
                        java.lang.String[] strArr62222 = {str412222, str422222, str432222, str442222, str452222, str462222, (java.lang.String) objArr882222[0]};
                        while (i2 < 7) {
                        }
                        i3 = 0;
                        if (i3 == 0) {
                        }
                    } else {
                        i25++;
                        j10 = j10;
                        i22 = 1590238701;
                        i7 = 1;
                        i8 = 0;
                        obj3 = null;
                        i23 = 2;
                        f3 = 0.0f;
                    }
                }
            }
            j2 = j10;
            str = "";
            f2 = f3;
            int i4710222 = (android.graphics.PointF.length(f2, f2) > f2 ? 1 : (android.graphics.PointF.length(f2, f2) == f2 ? 0 : -1));
            short packedPositionType4222 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
            int i4810222 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
            java.lang.Object[] objArr212222 = new java.lang.Object[1];
            m(((-25182959) ^ i4710222) + ((i4710222 & (-25182959)) << 1), packedPositionType4222, (((-30931128) | i4810222) << 1) - (i4810222 ^ (-30931128)), (-34) - android.view.View.getDefaultSize(0, 0), (byte) (28 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr212222);
            java.lang.String str112222 = (java.lang.String) objArr212222[0];
            int i4910222 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr222222 = new java.lang.Object[1];
            l("芅苤\u171b㏗乌謋ୣ鬃\uf363᪖", (i4910222 ^ 48) + ((i4910222 & 48) << 1), objArr222222);
            java.lang.String str122222 = (java.lang.String) objArr222222[0];
            int i5010222 = -(-android.graphics.Color.blue(0));
            short threadPriority5222 = (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
            int normalizeMetaState6222 = android.view.KeyEvent.normalizeMetaState(0);
            int keyRepeatDelay2222 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
            int c72222 = com.facetec.sdk.fp.a.c();
            int i5110222 = keyRepeatDelay2222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
            int i5210222 = ((i5110222 | 7310) << 1) - (i5110222 ^ 7310);
            int i5310222 = (~((keyRepeatDelay2222 ^ c72222) | (keyRepeatDelay2222 & c72222))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
            int i5410222 = (i5210222 ^ i5310222) + ((i5310222 & i5210222) << 1);
            int i5510222 = (keyRepeatDelay2222 ^ 33) | (keyRepeatDelay2222 & 33);
            int i567222 = ~c72222;
            int i572222 = ((i5510222 ^ i567222) | (i5510222 & i567222)) * (-216);
            int i582222 = -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            java.lang.Object[] objArr232222 = new java.lang.Object[1];
            m((((-25182956) | i5010222) << 1) - (i5010222 ^ (-25182956)), threadPriority5222, (-30931120) - normalizeMetaState6222, (i5410222 ^ i572222) + ((i572222 & i5410222) << 1) + (((~((keyRepeatDelay2222 ^ i567222) | (keyRepeatDelay2222 & i567222))) | (-34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), (byte) ((i582222 & 120) + (i582222 | 120)), objArr232222);
            java.lang.String str132222 = (java.lang.String) objArr232222[0];
            int i592222 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
            java.lang.Object[] objArr242222 = new java.lang.Object[1];
            m(((-25182954) ^ i592222) + ((i592222 & (-25182954)) << 1), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-30931114) - (~(-android.graphics.Color.alpha(0))), (-34) - (~android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) (21 - (~(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr242222);
            java.lang.String str142222 = (java.lang.String) objArr242222[0];
            java.lang.Object[] objArr252222 = new java.lang.Object[1];
            l("編綁\ue76f\ua6fa粄筩鹒꧁ఌ\ueaec", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr252222);
            java.lang.String str152222 = (java.lang.String) objArr252222[0];
            int i602222 = -android.graphics.ImageFormat.getBitsPerPixel(0);
            int i612222 = i602222 * (-183);
            int i622222 = ~com.facetec.sdk.fp.a.c();
            int i632222 = (((i612222 | 183) << 1) - (i612222 ^ 183)) + ((~((i622222 ^ i602222) | (i622222 & i602222))) * (-184));
            int i642222 = ~i602222;
            int i652222 = ~i642222;
            int i662222 = ~((i642222 ^ i622222) | (i642222 & i622222));
            int i672222 = (i662222 ^ i652222) | (i662222 & i652222);
            int i682222 = ~i622222;
            int i692222 = ((i672222 ^ i682222) | (i672222 & i682222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            java.lang.Object[] objArr262222 = new java.lang.Object[1];
            l("弩彀㧮Ⴟﯥꗢ⠒⺷⺌㑠몖봩뱌䛻\u0b45䎡\u0bd2", ((i632222 ^ i692222) + ((i692222 & i632222) << 1)) - 184, objArr262222);
            java.lang.String str162222 = (java.lang.String) objArr262222[0];
            int i702222 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            short indexOf9222 = (short) android.text.TextUtils.indexOf(str, str, 0);
            long globalActionKeyTimeout2222 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            int i712222 = -android.view.KeyEvent.keyCodeFromString(str);
            java.lang.Object[] objArr272222 = new java.lang.Object[1];
            m((i702222 | (-25182951)) + ((-25182951) & i702222), indexOf9222, (-30931103) - (globalActionKeyTimeout2222 > 0L ? 1 : (globalActionKeyTimeout2222 == 0L ? 0 : -1)), (i712222 ^ (-34)) + ((i712222 & (-34)) << 1), (byte) (116 - (~(-(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))))), objArr272222);
            java.lang.String str172222 = (java.lang.String) objArr272222[0];
            java.lang.Object[] objArr282222 = new java.lang.Object[1];
            l("ψΡ碇歴㳹\ue495叕\ue9ad爦畞", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr282222);
            java.lang.String str182222 = (java.lang.String) objArr282222[0];
            int rgb22222 = android.graphics.Color.rgb(0, 0, 0);
            int c82222 = com.facetec.sdk.fp.a.c();
            int i722222 = rgb22222 * (-947);
            int i732222 = (612892077 ^ i722222) + ((i722222 & 612892077) << 1);
            int i742222 = ~rgb22222;
            int i752222 = ((~((8405734 ^ c82222) | (8405734 & c82222))) | i742222) * (-948);
            int i762222 = i742222 | 8405734;
            int i772222 = ~c82222;
            int i782222 = (((i732222 & i752222) + (i732222 | i752222)) - (~(-(-((~((i772222 ^ i762222) | (i772222 & i762222))) * (-948)))))) - 1;
            int i792222 = -(-((8405734 | rgb22222) * 948));
            short mirror22222 = (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            float length4222 = android.graphics.PointF.length(0.0f, 0.0f);
            int i802222 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
            int maximumFlingVelocity22222 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
            int c92222 = com.facetec.sdk.fp.a.c();
            int i812222 = (maximumFlingVelocity22222 * (-109)) + 1554;
            int i822222 = ~maximumFlingVelocity22222;
            int i832222 = ~((c92222 ^ 14) | (c92222 & 14));
            int i842222 = ((i832222 ^ i822222) | (i822222 & i832222)) * (-220);
            int i852222 = ~((maximumFlingVelocity22222 ^ 14) | (maximumFlingVelocity22222 & 14));
            int i862222 = ~(c92222 | 14);
            int i872222 = (i812222 ^ i842222) + ((i812222 & i842222) << 1) + (((i862222 ^ i852222) | (i862222 & i852222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            int i882222 = ~(i822222 | 14);
            int i892222 = ~(maximumFlingVelocity22222 | (-15));
            int i902222 = ((i892222 ^ i882222) | (i892222 & i882222)) * 110;
            java.lang.Object[] objArr292222 = new java.lang.Object[1];
            m((i782222 & i792222) + (i792222 | i782222), mirror22222, (-30931099) - (length4222 > 0.0f ? 1 : (length4222 == 0.0f ? 0 : -1)), (i802222 & (-34)) + (i802222 | (-34)), (byte) ((i872222 & i902222) + (i902222 | i872222)), objArr292222);
            java.lang.String str192222 = (java.lang.String) objArr292222[0];
            int myPid9222 = android.os.Process.myPid();
            short s22222 = (short) ((-android.view.MotionEvent.axisFromString(str)) - 1);
            int combineMeasuredStates4222 = android.view.View.combineMeasuredStates(0, 0);
            int i912222 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            int mode5222 = android.view.View.MeasureSpec.getMode(0);
            int c102222 = com.facetec.sdk.fp.a.c();
            int i922222 = (mode5222 * (-830)) + 59904;
            int i932222 = ~c102222;
            int i942222 = (mode5222 ^ 72) | (mode5222 & 72);
            int i952222 = -(-(((~((i942222 ^ c102222) | (i942222 & c102222))) | (~((i932222 & (-73)) | (i932222 ^ (-73))))) * (-831)));
            int i962222 = (mode5222 ^ (-73)) | (mode5222 & (-73));
            int i972222 = (i922222 ^ i952222) + ((i922222 & i952222) << 1) + ((~((i962222 & c102222) | (i962222 ^ c102222))) * (-1662));
            int i982222 = ~mode5222;
            int i992222 = ~((i982222 ^ i932222) | (i982222 & i932222));
            int i1002222 = ~((mode5222 ^ c102222) | (mode5222 & c102222));
            int i1012222 = (i1002222 ^ i992222) | (i1002222 & i992222);
            int i1022222 = ~((c102222 ^ 72) | (c102222 & 72));
            int i1032222 = -(-(((i1022222 ^ i1012222) | (i1012222 & i1022222)) * 831));
            byte b152222 = (byte) (((i972222 | i1032222) << 1) - (i1032222 ^ i972222));
            java.lang.Object[] objArr302222 = new java.lang.Object[1];
            m((-25182949) - (~(myPid9222 >> 22)), s22222, ((-30931097) ^ combineMeasuredStates4222) + ((combineMeasuredStates4222 & (-30931097)) << 1), (i912222 & (-34)) + (i912222 | (-34)), b152222, objArr302222);
            java.lang.String str202222 = (java.lang.String) objArr302222[0];
            int argb3222 = android.graphics.Color.argb(0, 0, 0, 0);
            short s32222 = (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
            int makeMeasureSpec5222 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i1042222 = -android.graphics.ImageFormat.getBitsPerPixel(0);
            int argb22222 = android.graphics.Color.argb(0, 0, 0, 0);
            java.lang.Object[] objArr312222 = new java.lang.Object[1];
            m((-25182948) - argb3222, s32222, ((-30931081) ^ makeMeasureSpec5222) + ((makeMeasureSpec5222 & (-30931081)) << 1), (i1042222 ^ (-35)) + ((i1042222 & (-35)) << 1), (byte) ((argb22222 ^ 82) + ((argb22222 & 82) << 1)), objArr312222);
            java.lang.String str212222 = (java.lang.String) objArr312222[0];
            int i1052222 = -android.view.KeyEvent.keyCodeFromString(str);
            short indexOf22222 = (short) android.text.TextUtils.indexOf(str, str, 0);
            int i1062222 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            int i1072222 = -android.view.KeyEvent.getDeadChar(0, 0);
            int fadingEdgeLength3222 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
            java.lang.Object[] objArr322222 = new java.lang.Object[1];
            m(((-25182944) & i1052222) + (i1052222 | (-25182944)), indexOf22222, ((-30931071) & i1062222) + (i1062222 | (-30931071)), (i1072222 & (-34)) + (i1072222 | (-34)), (byte) (((fadingEdgeLength3222 | 24) << 1) - (fadingEdgeLength3222 ^ 24)), objArr322222);
            java.lang.String str222222 = (java.lang.String) objArr322222[0];
            java.lang.Object[] objArr332222 = new java.lang.Object[1];
            l("騠驐⤞혼\u0cf7딎\uee97\ud9b7\uebcb⒛簜䨵祕嘏출뒥", android.view.View.resolveSize(0, 0), objArr332222);
            java.lang.String str232222 = (java.lang.String) objArr332222[0];
            int i1082222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            short bitsPerPixel4222 = (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
            int i1092222 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
            int i1102222 = -android.graphics.Color.red(0);
            int i1112222 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
            int c112222 = com.facetec.sdk.fp.a.c();
            int i1122222 = (i1112222 * 46) - 2530;
            int i1132222 = ~c112222;
            int i1142222 = ~((i1132222 ^ 54) | (i1132222 & 54));
            int i1152222 = -(-(((i1142222 ^ i1112222) | (i1142222 & i1112222)) * (-90)));
            int i1162222 = (i1122222 ^ i1152222) + ((i1122222 & i1152222) << 1);
            int i1172222 = ~((c112222 ^ 54) | (c112222 & 54));
            int i1182222 = ~((i1112222 ^ (-55)) | (i1112222 & (-55)));
            int i1192222 = ((i1172222 & i1182222) | (i1172222 ^ i1182222)) * (-45);
            int i1202222 = ~i1112222;
            int i1212222 = (~((c112222 ^ i1202222) | (c112222 & i1202222))) | 54;
            int i1222222 = ~((i1112222 ^ i1132222) | (i1112222 & i1132222));
            byte b162222 = (byte) ((((i1162222 & i1192222) + (i1192222 | i1162222)) - (~(((i1222222 ^ i1212222) | (i1222222 & i1212222)) * 45))) - 1);
            java.lang.Object[] objArr342222 = new java.lang.Object[1];
            m((((-25182945) | i1082222) << 1) - (i1082222 ^ (-25182945)), bitsPerPixel4222, ((-30931063) ^ i1092222) + ((i1092222 & (-30931063)) << 1), ((i1102222 | (-34)) << 1) - (i1102222 ^ (-34)), b162222, objArr342222);
            java.lang.String str242222 = (java.lang.String) objArr342222[0];
            java.lang.Object[] objArr352222 = new java.lang.Object[1];
            l("鉥鈗❅\uf89d膂뭂쀴哋\ue398⫁劥", android.widget.ExpandableListView.getPackedPositionType(0L), objArr352222);
            java.lang.String str252222 = (java.lang.String) objArr352222[0];
            int i1232222 = -android.graphics.Color.blue(0);
            int i1242222 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            short s42222 = (short) ((~i1242222) + (i1242222 << 1));
            int i1252222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
            int i1262222 = -(android.os.Process.myTid() >> 22);
            int defaultSize3222 = android.view.View.getDefaultSize(0, 0);
            int c122222 = com.facetec.sdk.fp.a.c();
            int i1272222 = ~c122222;
            int i1282222 = ~((i1272222 & (-109)) | (i1272222 ^ (-109)));
            int i1292222 = (defaultSize3222 * 165) + 17767 + (((i1282222 ^ defaultSize3222) | (i1282222 & defaultSize3222)) * (-328));
            int i1302222 = ((defaultSize3222 ^ c122222) | (defaultSize3222 & c122222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
            int i1312222 = (i1292222 & i1302222) + (i1302222 | i1292222);
            int i1322222 = ~defaultSize3222;
            int i1332222 = (~((c122222 & 108) | (c122222 ^ 108))) | (~((i1322222 ^ 108) | (i1322222 & 108)));
            int i1342222 = defaultSize3222 | i1272222;
            int i1352222 = ~((i1342222 ^ (-109)) | (i1342222 & (-109)));
            int i1362222 = ((i1332222 ^ i1352222) | (i1352222 & i1332222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
            byte b172222 = (byte) ((i1312222 & i1362222) + (i1362222 | i1312222));
            java.lang.Object[] objArr362222 = new java.lang.Object[1];
            m(((-25182941) ^ i1232222) + ((i1232222 & (-25182941)) << 1), s42222, (-30931050) - (~i1252222), (i1262222 & (-34)) + (i1262222 | (-34)), b172222, objArr362222);
            java.lang.String str262222 = (java.lang.String) objArr362222[0];
            int i1372222 = -android.view.View.resolveSize(0, 0);
            short offsetAfter4222 = (short) android.text.TextUtils.getOffsetAfter(str, 0);
            int indexOf32222 = android.text.TextUtils.indexOf(str, str);
            int i1382222 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            java.lang.Object[] objArr372222 = new java.lang.Object[1];
            m((-25182942) - (~i1372222), offsetAfter4222, ((-30931042) ^ indexOf32222) + ((indexOf32222 & (-30931042)) << 1), (i1382222 & (-33)) + (i1382222 | (-33)), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) - 36), objArr372222);
            java.lang.String str272222 = (java.lang.String) objArr372222[0];
            java.lang.Object[] objArr382222 = new java.lang.Object[1];
            l("㎇㏴Ṕ\uaafd㿈艅", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr382222);
            java.lang.String str282222 = (java.lang.String) objArr382222[0];
            java.lang.Object[] objArr392222 = new java.lang.Object[1];
            l("媡嫒\u1ad6ꉍ꿣蛀髨窷⭝ᝣࡶ\ue924맅旌맆ឹ๖\uea4f⽺蘼鳦砱峇㓑", android.widget.ExpandableListView.getPackedPositionType(0L), objArr392222);
            java.lang.String str292222 = (java.lang.String) objArr392222[0];
            java.lang.Object[] objArr402222 = new java.lang.Object[1];
            l("ᯛᮨὕ潵瘾荃埃ꍹ樰ዚ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr402222);
            java.lang.String str302222 = (java.lang.String) objArr402222[0];
            int i1392222 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            short defaultSize22222 = (short) android.view.View.getDefaultSize(0, 0);
            int i1402222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr412222 = new java.lang.Object[1];
            m(((-25182942) & i1392222) + (i1392222 | (-25182942)), defaultSize22222, ((-30931036) & i1402222) + (i1402222 | (-30931036)), android.view.View.MeasureSpec.getSize(0) - 34, (byte) ((-49) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr412222);
            java.lang.String str312222 = (java.lang.String) objArr412222[0];
            java.lang.Object[] objArr422222 = new java.lang.Object[1];
            l("ﵙﴪ㙟酪ờ꩜꧀쮒貥㯜㭜堖ḻ䤀諍ꚟꦠ웑᱃㜐", android.graphics.Color.red(0), objArr422222);
            java.lang.String str322222 = (java.lang.String) objArr422222[0];
            java.lang.Object[] objArr432222 = new java.lang.Object[1];
            m((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 25182940, (short) android.graphics.Color.alpha(0), (-30931034) - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 35, (byte) ((-8) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr432222);
            java.lang.String str332222 = (java.lang.String) objArr432222[0];
            int indexOf42222 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            short green32222 = (short) android.graphics.Color.green(0);
            int i1412222 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i1422222 = -android.graphics.Color.rgb(0, 0, 0);
            int i1432222 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
            byte b182222 = (byte) ((i1432222 ^ (-107)) + ((i1432222 & (-107)) << 1));
            java.lang.Object[] objArr442222 = new java.lang.Object[1];
            m(indexOf42222 - 25182939, green32222, (-30931024) - (~i1412222), ((-16777250) & i1422222) + (i1422222 | (-16777250)), b182222, objArr442222);
            java.lang.String str342222 = (java.lang.String) objArr442222[0];
            java.lang.Object[] objArr452222 = new java.lang.Object[1];
            l("﹫\ufe1f從䈙ߍ쎎窼튈辆分\ue83a䄖ᴏ₉姻", android.text.TextUtils.getTrimmedLength(str), objArr452222);
            java.lang.String str352222 = (java.lang.String) objArr452222[0];
            int i1442222 = -android.graphics.Color.green(0);
            int i1452222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int c132222 = com.facetec.sdk.fp.a.c();
            int i1462222 = i1452222 * (-380);
            int i1472222 = ((i1462222 | 382) << 1) - (i1462222 ^ 382);
            int i1482222 = ~i1452222;
            int i1492222 = -(-(((c132222 ^ 1) | (c132222 & 1) | i1482222) * (-381)));
            int i1502222 = ((i1472222 | i1492222) << 1) - (i1472222 ^ i1492222);
            int i1512222 = ~(i1482222 | (-2));
            int i1522222 = ~((~c132222) | 1);
            int i1532222 = -(-(((~((i1452222 ^ 1) | (i1452222 & 1))) | (i1522222 ^ i1512222) | (i1522222 & i1512222)) * 381));
            int i1542222 = (i1502222 & i1532222) + (i1532222 | i1502222);
            int i1552222 = (~((i1482222 ^ 1) | (i1482222 & 1))) * 381;
            short s52222 = (short) ((i1542222 & i1552222) + (i1552222 | i1542222));
            int i1562222 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int c142222 = com.facetec.sdk.fp.a.c();
            int i1572222 = i1562222 * (-949);
            int i1582222 = ((-711239735) & i1572222) + (i1572222 | (-711239735));
            int i1592222 = ~c142222;
            int i1602222 = ~((30931012 & i1592222) | (30931012 ^ i1592222));
            int i1612222 = ~i1562222;
            int i1622222 = ~((i1612222 ^ c142222) | (i1612222 & c142222));
            int i1632222 = ((i1602222 ^ i1622222) | (i1602222 & i1622222)) * 1900;
            int i1642222 = ~(i1592222 | i1562222);
            int i1652222 = ~(((-30931013) ^ c142222) | ((-30931013) & c142222));
            int i1662222 = (((i1582222 | i1632222) << 1) - (i1582222 ^ i1632222)) + (((i1642222 & i1652222) | (i1642222 ^ i1652222)) * (-950));
            int i1672222 = ~((i1592222 ^ (-30931013)) | ((-30931013) & i1592222));
            int i1682222 = ~(i1562222 | c142222);
            int i1692222 = -(-(((i1682222 ^ i1672222) | (i1682222 & i1672222)) * 950));
            int i1702222 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int i1712222 = -android.widget.ExpandableListView.getPackedPositionType(0L);
            byte b192222 = (byte) ((i1712222 ^ (-9)) + ((i1712222 & (-9)) << 1));
            java.lang.Object[] objArr462222 = new java.lang.Object[1];
            m(((-25182939) & i1442222) + (i1442222 | (-25182939)), s52222, (i1662222 ^ i1692222) + ((i1692222 & i1662222) << 1), (-35) - (~i1702222), b192222, objArr462222);
            java.lang.String str362222 = (java.lang.String) objArr462222[0];
            int i1722222 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            short longPressTimeout5222 = (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            int i1732222 = -android.text.TextUtils.indexOf(str, str, 0, 0);
            int edgeSlop22222 = android.view.ViewConfiguration.getEdgeSlop();
            int i1742222 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            java.lang.Object[] objArr472222 = new java.lang.Object[1];
            m(((-25182940) & i1722222) + (i1722222 | (-25182940)), longPressTimeout5222, (((-30931003) | i1732222) << 1) - (i1732222 ^ (-30931003)), (-34) - (edgeSlop22222 >> 16), (byte) ((i1742222 & (-57)) + (i1742222 | (-57))), objArr472222);
            java.lang.String str372222 = (java.lang.String) objArr472222[0];
            java.lang.Object[] objArr482222 = new java.lang.Object[1];
            l("㽛㼮顋⨟蔼чኬ偳亽闅而쏡\udc32\ue754ㆩ㵥殯棂", android.os.Process.myTid() >> 22, objArr482222);
            java.lang.String[] strArr42222 = {str112222, str122222, str132222, str142222, str152222, str162222, str172222, str182222, str192222, str202222, str212222, str222222, str232222, str242222, str252222, str262222, str272222, str282222, str292222, str302222, str312222, str322222, str332222, str342222, str352222, str362222, str372222, (java.lang.String) objArr482222[0]};
            java.lang.Object[] objArr492222 = new java.lang.Object[1];
            l("ᧇᦵ肇\uf7df舞\u1c8a켵坐栮负巷쓇襁ﾇ\uec6e", android.view.View.getDefaultSize(0, 0), objArr492222);
            java.lang.Object[] objArr502222 = {(java.lang.String) objArr492222[0]};
            d2 = com.facetec.sdk.al.d(1590238701);
            if (d2 == null) {
            }
            str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr502222);
            if (str2 != null) {
            }
            str3 = str;
            java.lang.Object[] objArr6822222 = new java.lang.Object[1];
            l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.text.TextUtils.getTrimmedLength(str3), objArr6822222);
            java.lang.Object[] objArr6922222 = {(java.lang.String) objArr6822222[0]};
            d3 = com.facetec.sdk.al.d(-864328554);
            if (d3 != null) {
            }
            long longValue722222 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr6922222)).longValue();
            long j4722222 = -706044303;
            long j4822222 = 503;
            long j4922222 = -502;
            long j5022222 = j4722222 | longValue722222;
            long j5122222 = j4722222 ^ j2;
            str5 = str4;
            long nextInt622222 = new java.util.Random().nextInt();
            long j5222222 = j5122222 | (nextInt622222 ^ j2);
            long j5322222 = (nextInt622222 | j5022222) ^ j2;
            long j5422222 = (j4722222 * j4822222) + (j4822222 * longValue722222) + (j5022222 * j4922222) + (j4922222 * ((((longValue722222 ^ j2) | j5122222) ^ j2) | (j5222222 ^ j2) | j5322222)) + (502 * (((j5222222 | longValue722222) ^ j2) | j5322222)) + 1754242723;
            int myUid102222 = android.os.Process.myUid();
            int i21322222 = ((int) (j5422222 >> 32)) & (((((~(1365820387 | myUid102222)) | (-1508698100)) * 345) - 484646000) + (((~(1365820387 | (~myUid102222))) | 16777602) * 345) + ((~(myUid102222 | 1508698099)) * 345));
            int i21422222 = ((int) j5422222) & (((((~(2054155946 | r3)) | (-2146434988)) * 305) - 1704616964) + (((~((~android.os.Process.myUid()) | 2054155946)) | (-803584940)) * 305));
            j3 = (i21322222 ^ i21422222) | (i21322222 & i21422222);
            int i21522222 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            short s622222 = (short) ((-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
            int i21622222 = -(-android.view.View.MeasureSpec.getSize(0));
            int offsetAfter322222 = android.text.TextUtils.getOffsetAfter(str5, 0);
            java.lang.Object[] objArr7122222 = new java.lang.Object[1];
            m((((-25183010) | i21522222) << 1) - (i21522222 ^ (-25183010)), s622222, ((-30930988) & i21622222) + (i21622222 | (-30930988)), (offsetAfter322222 & (-34)) + (offsetAfter322222 | (-34)), (byte) (android.text.TextUtils.indexOf(str5, str5, 0) - 62), objArr7122222);
            java.lang.Object[] objArr7222222 = {(java.lang.String) objArr7122222[0]};
            d4 = com.facetec.sdk.al.d(-864328554);
            if (d4 == null) {
            }
            long longValue822222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr7222222)).longValue();
            long j5522222 = 825866529;
            long j5622222 = 988;
            long j5722222 = longValue822222 ^ j2;
            long elapsedRealtime222222 = (int) android.os.SystemClock.elapsedRealtime();
            long j5822222 = elapsedRealtime222222 ^ j2;
            long j5922222 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j5522222) + ((-987) * longValue822222) + (((((j5722222 | j5822222) | j5522222) ^ j2) | (((j5522222 | longValue822222) | elapsedRealtime222222) ^ j2)) * j5622222) + ((-988) * (j5522222 | j5722222)) + (j5622222 * (((j5722222 | elapsedRealtime222222) ^ j2) | (((j5522222 ^ j2) | j5722222) ^ j2) | ((longValue822222 | (j5822222 | j5522222)) ^ j2))) + 222331891;
            int i21722222 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
            int i21822222 = ((int) (j5922222 >> 32)) & ((((~(477266515 | i21722222)) | (-1031263064)) * (-160)) + 590662346 + (((~(i21722222 | (-959959896))) | 477266515) * 160));
            int myPid422222 = android.os.Process.myPid();
            int i21922222 = ((int) j5922222) & (((((~((-1535644055) | r5)) | 1250431126) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1250431127) | myPid422222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(myPid422222 | (-285212929))) | (~((~myPid422222) | (-1322096832))) | 71665705) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            long j6022222 = (i21822222 ^ i21922222) | (i21822222 & i21922222);
            if (j3 > 0) {
            }
            java.lang.Object[] objArr7522222 = new java.lang.Object[1];
            l("ᰦᰉ\ue7a3ಫ뺹箲㐖毬涁\uea2fꚔ\uf838ｅ颴ᜓۦ䣐ᜬ膏霨\uda63蕏\uf229▐⯼㏊粢", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr7522222);
            java.lang.Object[] objArr7622222 = {(java.lang.String) objArr7522222[0]};
            d5 = com.facetec.sdk.al.d(-864328554);
            if (d5 == null) {
            }
            long longValue922222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr7622222)).longValue();
            long j6122222 = 164638394;
            long j6222222 = 868;
            long j6322222 = j6122222 ^ j2;
            long maxMemory322222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            long j6422222 = maxMemory322222 ^ j2;
            long j6522222 = longValue922222 ^ j2;
            long j6622222 = j6322222 | j6522222;
            long j6722222 = (j6222222 * j6122222) + (j6222222 * longValue922222) + ((-867) * (((j6322222 | j6422222) ^ j2) | ((j6522222 | j6422222) ^ j2))) + ((-1734) * ((j6622222 ^ j2) | ((j6322222 | maxMemory322222) ^ j2) | ((j6522222 | maxMemory322222) ^ j2))) + (867 * ((((longValue922222 | j6322222) | maxMemory322222) ^ j2) | ((j6622222 | j6422222) ^ j2) | (((j6522222 | j6122222) | maxMemory322222) ^ j2))) + 883560026;
            int uptimeMillis322222 = (int) android.os.SystemClock.uptimeMillis();
            int i23122222 = ((int) (j6722222 >> 32)) & (((~(2009050072 | uptimeMillis322222)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1075948654 + (((~((~uptimeMillis322222) | 2009050072)) | 1437247952) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
            int i23222222 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i23322222 = ~i23222222;
            int i23422222 = ~(i23222222 | (-1708154893));
            int i23522222 = ((int) j6722222) & ((((~((-304549620) | i23322222)) | 270928482 | i23422222) * (-502)) + 1424885377 + ((i23422222 | (~(i23322222 | (-33621138)))) * 502));
            j4 = (i23522222 ^ i23122222) | (i23122222 & i23522222);
            java.lang.Object[] objArr7822222 = new java.lang.Object[1];
            l("쮚쮵쒄ۭ胑墂㹌喁", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr7822222);
            java.lang.Object[] objArr7922222 = {(java.lang.String) objArr7822222[0]};
            d6 = com.facetec.sdk.al.d(-864328554);
            if (d6 == null) {
            }
            long longValue1022222 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr7922222)).longValue();
            long j6822222 = -1093610948;
            long j6922222 = j6822222 ^ j2;
            long j7022222 = longValue1022222 ^ j2;
            long myUid222222 = android.os.Process.myUid();
            long j7122222 = 490;
            long j7222222 = (491 * j6822222) + ((-489) * longValue1022222) + ((j6922222 | j7022222 | (myUid222222 ^ j2)) * (-490)) + ((((j7022222 | myUid222222) ^ j2) | ((j7022222 | j6822222) ^ j2)) * j7122222) + (j7122222 * j6922222) + 2141809368;
            int myTid142222 = android.os.Process.myTid();
            int i23622222 = ((int) (j7222222 >> 32)) & (((((~(1773922814 | myTid142222)) | (~((-553650561) | r4))) * 497) - 1071071599) + (((~(myTid142222 | (-553650561))) | (~((~myTid142222) | 1637468630)) | 136454184) * 497));
            int myUid322222 = android.os.Process.myUid();
            int i23722222 = ~myUid322222;
            int i23822222 = ((int) j7222222) & ((((592136 | myUid322222) * 988) - 1332283447) + (((~((-1268840018) | i23722222)) | 1101045761) * (-1976)) + (((~(myUid322222 | 168386392)) | 592136 | (~(i23722222 | (-168386393)))) * 988));
            long j7322222 = (i23622222 ^ i23822222) | (i23622222 & i23822222);
            if (j4 <= 0) {
            }
            java.lang.Object[] objArr8222222 = new java.lang.Object[1];
            l("뼈뼧굻㞃햲ㅪ༾ç컴ꃴ鶢", (-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1, objArr8222222);
            java.lang.String str4122222 = (java.lang.String) objArr8222222[0];
            int i25522222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
            short s722222 = (short) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))));
            int i25622222 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
            int longPressTimeout222222 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
            int absoluteGravity222222 = android.view.Gravity.getAbsoluteGravity(0, 0);
            java.lang.Object[] objArr8322222 = new java.lang.Object[1];
            m(((i25522222 & (-25183009)) << 1) + (i25522222 ^ (-25183009)), s722222, ((-30930971) & i25622222) + (i25622222 | (-30930971)), ((longPressTimeout222222 | (-34)) << 1) - (longPressTimeout222222 ^ (-34)), (byte) (((absoluteGravity222222 | (-38)) << 1) - (absoluteGravity222222 ^ (-38))), objArr8322222);
            java.lang.String str4222222 = (java.lang.String) objArr8322222[0];
            java.lang.Object[] objArr8422222 = new java.lang.Object[1];
            l("豯豀嵆뫖ྕ셗艫\udac0ﶓ僉ჷ䤔漌≖ꅫ럍", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr8422222);
            java.lang.String str4322222 = (java.lang.String) objArr8422222[0];
            int i25722222 = -android.view.KeyEvent.getDeadChar(0, 0);
            short packedPositionType222222 = (short) android.widget.ExpandableListView.getPackedPositionType(0L);
            int i25822222 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i25922222 = -(-android.view.View.MeasureSpec.getSize(0));
            int i26022222 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            java.lang.Object[] objArr8522222 = new java.lang.Object[1];
            m(((i25722222 | (-25183009)) << 1) - (i25722222 ^ (-25183009)), packedPositionType222222, ((-30930961) ^ i25822222) + ((i25822222 & (-30930961)) << 1), (i25922222 & (-34)) + (i25922222 | (-34)), (byte) ((i26022222 & 87) + (i26022222 | 87)), objArr8522222);
            java.lang.String str4422222 = (java.lang.String) objArr8522222[0];
            int i26122222 = -(-android.view.View.MeasureSpec.getSize(0));
            int i26222222 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            int capsMode322222 = android.text.TextUtils.getCapsMode(str5, 0, 0);
            java.lang.Object[] objArr8622222 = new java.lang.Object[1];
            m((i26122222 ^ (-25183009)) + ((i26122222 & (-25183009)) << 1), (short) ((i26222222 & 1) + (i26222222 | 1)), ((-30930948) & capsMode322222) + (capsMode322222 | (-30930948)), (-33) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (-android.os.Process.getGidForName(str5)), objArr8622222);
            java.lang.String str4522222 = (java.lang.String) objArr8622222[0];
            int gidForName32222 = android.os.Process.getGidForName(str5);
            short s822222 = (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int size222222 = android.view.View.MeasureSpec.getSize(0);
            int scrollBarSize222222 = android.view.ViewConfiguration.getScrollBarSize() >> 8;
            java.lang.Object[] objArr8722222 = new java.lang.Object[1];
            m((((-25183008) | gidForName32222) << 1) - (gidForName32222 ^ (-25183008)), s822222, size222222 - 30930937, (scrollBarSize222222 & (-34)) + (scrollBarSize222222 | (-34)), (byte) (14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr8722222);
            java.lang.String str4622222 = (java.lang.String) objArr8722222[0];
            java.lang.Object[] objArr8822222 = new java.lang.Object[1];
            l("櫾櫑\uefb8㴃쏩玿ֳᚬ", 0 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr8822222);
            java.lang.String[] strArr622222 = {str4122222, str4222222, str4322222, str4422222, str4522222, str4622222, (java.lang.String) objArr8822222[0]};
            while (i2 < 7) {
            }
            i3 = 0;
            if (i3 == 0) {
            }
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause6 = th12.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th12;
        }
    }
}
