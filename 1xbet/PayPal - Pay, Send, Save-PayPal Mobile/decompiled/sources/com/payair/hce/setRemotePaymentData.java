package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRemotePaymentData extends com.payair.hce.setDigitizedCardId {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static byte[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        byte b2;
        int i = 718 - s;
        int i2 = s2 + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[b + 1];
        if (bArr == null) {
            int i3 = i2;
            byte b3 = 0;
            i = (i + i2) - 2;
            i2 = i3;
            b2 = b3;
            int i4 = i2 + 1;
            cArr[b2] = (char) i;
            if (b2 == b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            ?? r3 = b2 + 1;
            i3 = i4;
            i2 = bArr[i4];
            b3 = r3;
            i = (i + i2) - 2;
            i2 = i3;
            b2 = b3;
            int i42 = i2 + 1;
            cArr[b2] = (char) i;
            if (b2 == b) {
            }
        } else {
            b2 = 0;
            int i422 = i2 + 1;
            cArr[b2] = (char) i;
            if (b2 == b) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 4 - (b2 * 2);
        int i4 = 115 - (i * 11);
        byte[] bArr = $$d;
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = -1;
        if (bArr == null) {
            int i7 = i4;
            i2 = i3;
            i3 += i7;
            i2++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i2];
            i3 += i7;
            i2++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == 0 - i5) {
            }
        } else {
            i2 = i3;
            i3 = i4;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == 0 - i5) {
            }
        }
    }

    public setRemotePaymentData() {
        writeReplace(new com.payair.hce.MppLiteModule());
        writeReplace(new com.payair.hce.setU());
        writeReplace(new com.payair.hce.setRecordNumber());
        writeReplace(new com.payair.hce.setContactlessPaymentData());
        writeReplace(new com.payair.hce.setSfi());
        writeReplace(new com.payair.hce.setDq());
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        $10 = ($11 + 37) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr2 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr2[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2074, (char) (android.os.Process.getGidForName("") + 60038));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.rgb(0, 0, 0) + 16780759, (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            $10 = ($11 + 115) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr3, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr2, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            $11 = ($10 + 9) % 128;
        }
        if (z) {
            int i5 = $11 + 41;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr[digitizedCardJson11.DigitizedCardProfile] = cArr2[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 3543, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr2 = cArr;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, int i3, short s, java.lang.Object[] objArr) {
        long j;
        boolean z;
        int i4;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i5 = intValue == -1 ? 1 : 0;
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i5 != 0) {
                byte[] bArr = AlternateContactlessPaymentDataJson;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        $11 = ($10 + 63) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", c, 0, 0) + 5089, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    $10 = ($11 + 31) % 128;
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + ((int) (DigitizedCardProfile ^ j)) + i5;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(writeReplace), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 27, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2365, (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d((byte) 0, (byte) 0, 1, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = AlternateContactlessPaymentDataJson;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                bArr4[i7] = (byte) (bArr3[i7] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            $11 = ($10 + 41) % 128;
                            z = true;
                        } else {
                            z = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                int i8 = $10 + 57;
                                $11 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    byte[] bArr5 = AlternateContactlessPaymentDataJson;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    i4 = gettrack2constructiondata.AlternateContactlessPaymentDataJson % (((byte) (((byte) (bArr5[r8] & (-4897270311952305750L))) >>> s)) ^ b);
                                } else {
                                    byte[] bArr6 = AlternateContactlessPaymentDataJson;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    i4 = gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r8] ^ (-4897270311952305750L))) + s)) ^ b);
                                }
                                gettrack2constructiondata.values = (char) i4;
                            } else {
                                short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr7 = AlternateContactlessPaymentDataJson;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 27, (android.os.Process.myTid() >> 22) + 29, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
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
        valueOf = 1889207110;
        DigitizedCardProfile = 103136700;
        values = 520368590;
        writeReplace = -1339077223;
        AlternateContactlessPaymentDataJson = new byte[]{82, -90, -71, 67, 84, -84, 92, -94, -88, -69, 118, -91, 84, -93, 82, -113, 113, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, 84, 80, 87, 86, -86, -123, 103, -91, 84, -93, -113, 73, 71, -71, 87, -123, 121, -92, 84, -84, 92, -94, -88, 91, -6, 6, -85, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 87, -26, com.google.common.base.Ascii.EM, 87, -88, -69, 71, -85, 60, -95, 91, -71, -81, 80, -81, 17, -86, -92, -88, 94, 87, -88, -6, com.google.common.base.Ascii.NAK, -21, 17, 91, -71, 86, 89, -91, -23, com.google.common.base.Ascii.ESC, 81, -2, com.google.common.base.Ascii.SYN, 85, 83, -87, -94, -79, 99, 83, -81, 82, -86, -94, -109, 107, 84, -90, -125, Byte.MAX_VALUE, 84, -84, 92, -94, -88, 91, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, com.visa.cbp.getEncExpo.registerForActivityResult, 107, 84, -90, -125, Byte.MAX_VALUE, 84, -84, 92, -94, -88, 91, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 80, 87, 87, 85, -69, 80, -88, 80, 89, -69, -85, 82, -90, -71, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -84, -93, 93, 85, 85, -87, 84, -122, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, -86, -123, 101, -89, 93, 93, -126, 64, 83, -87, -87, 93, 87, -120, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86};
    }

    static void init$1() {
        $$d = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB};
        $$e = 50;
    }

    static void init$0() {
        $$a = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x1541, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x154c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x1546, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x1afd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1afe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x209e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x209f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x16e2 A[Catch: IOException -> 0x18d6, all -> 0x1a23, TryCatch #2 {, blocks: (B:302:0x11a3, B:304:0x11e5, B:310:0x1285, B:325:0x12e9, B:341:0x1397, B:360:0x1618, B:362:0x161b, B:363:0x16b1, B:365:0x16e2, B:367:0x172e, B:369:0x1775, B:371:0x17ad, B:373:0x17e5, B:398:0x19d9, B:399:0x1a22, B:428:0x1935, B:429:0x1938, B:486:0x1960, B:488:0x1967, B:489:0x1968, B:495:0x1984, B:497:0x198b, B:498:0x198c, B:511:0x19ae, B:513:0x19b4, B:514:0x19b5, B:529:0x19c0, B:531:0x19c6, B:532:0x19c7), top: B:301:0x11a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x1860 A[Catch: all -> 0x0b3e, TryCatch #23 {all -> 0x0b3e, blocks: (B:5:0x00e8, B:7:0x00f4, B:8:0x013a, B:12:0x020f, B:14:0x024a, B:15:0x0297, B:22:0x039e, B:24:0x03ac, B:25:0x03f7, B:29:0x04af, B:31:0x04f4, B:32:0x053c, B:38:0x0643, B:40:0x0651, B:41:0x069f, B:45:0x0766, B:47:0x0798, B:48:0x07e4, B:54:0x08e5, B:56:0x08f1, B:57:0x093e, B:61:0x09f4, B:63:0x0a1d, B:64:0x0a69, B:68:0x0aa5, B:70:0x0add, B:71:0x0b29, B:75:0x0814, B:77:0x084d, B:78:0x0899, B:81:0x0571, B:83:0x05a5, B:84:0x05f4, B:87:0x02c6, B:89:0x0309, B:90:0x0356, B:103:0x0c90, B:105:0x0cae, B:106:0x0d08, B:112:0x0de7, B:114:0x0e2b, B:115:0x0e7a, B:122:0x1b15, B:124:0x1b55, B:125:0x1b9e, B:149:0x1e1e, B:151:0x1e3c, B:152:0x1e8d, B:158:0x1f37, B:160:0x1f6d, B:161:0x1fb9, B:168:0x20db, B:170:0x20e9, B:171:0x2131, B:175:0x21e2, B:177:0x2217, B:178:0x2267, B:184:0x2372, B:186:0x237e, B:187:0x23c5, B:191:0x2473, B:193:0x24bb, B:194:0x250a, B:200:0x2612, B:202:0x2620, B:203:0x266b, B:207:0x2712, B:209:0x2759, B:210:0x27a5, B:216:0x28aa, B:218:0x28b8, B:219:0x28fe, B:223:0x2995, B:225:0x29c6, B:226:0x2a12, B:230:0x2a3f, B:232:0x2a70, B:233:0x2abf, B:237:0x27d5, B:239:0x2817, B:240:0x2860, B:243:0x253a, B:245:0x2579, B:246:0x25c5, B:249:0x2295, B:251:0x22d2, B:252:0x231e, B:261:0x2000, B:263:0x2034, B:264:0x2081, B:280:0x0ec7, B:282:0x0ee5, B:283:0x0f35, B:289:0x1019, B:291:0x105e, B:292:0x10aa, B:378:0x1827, B:380:0x1860, B:381:0x18ac, B:548:0x1a5d, B:550:0x1a93, B:551:0x1ae0), top: B:2:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x19b4 A[Catch: Exception -> 0x19d9, all -> 0x1a23, IOException -> 0x1a27, TryCatch #2 {, blocks: (B:302:0x11a3, B:304:0x11e5, B:310:0x1285, B:325:0x12e9, B:341:0x1397, B:360:0x1618, B:362:0x161b, B:363:0x16b1, B:365:0x16e2, B:367:0x172e, B:369:0x1775, B:371:0x17ad, B:373:0x17e5, B:398:0x19d9, B:399:0x1a22, B:428:0x1935, B:429:0x1938, B:486:0x1960, B:488:0x1967, B:489:0x1968, B:495:0x1984, B:497:0x198b, B:498:0x198c, B:511:0x19ae, B:513:0x19b4, B:514:0x19b5, B:529:0x19c0, B:531:0x19c6, B:532:0x19c7), top: B:301:0x11a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x19b5 A[Catch: Exception -> 0x19d9, all -> 0x1a23, IOException -> 0x1a27, TryCatch #2 {, blocks: (B:302:0x11a3, B:304:0x11e5, B:310:0x1285, B:325:0x12e9, B:341:0x1397, B:360:0x1618, B:362:0x161b, B:363:0x16b1, B:365:0x16e2, B:367:0x172e, B:369:0x1775, B:371:0x17ad, B:373:0x17e5, B:398:0x19d9, B:399:0x1a22, B:428:0x1935, B:429:0x1938, B:486:0x1960, B:488:0x1967, B:489:0x1968, B:495:0x1984, B:497:0x198b, B:498:0x198c, B:511:0x19ae, B:513:0x19b4, B:514:0x19b5, B:529:0x19c0, B:531:0x19c6, B:532:0x19c7), top: B:301:0x11a3 }] */
    /* JADX WARN: Type inference failed for: r13v28, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r15v19, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r38v11, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v15 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v34 */
    /* JADX WARN: Type inference failed for: r38v35 */
    /* JADX WARN: Type inference failed for: r38v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2, int i3) {
        int i4;
        java.lang.Object invoke;
        int i5;
        java.lang.Integer num;
        java.lang.Object[] objArr;
        char c;
        int i6;
        int i7;
        int i8;
        java.lang.Object[] objArr2;
        char c2;
        java.lang.Integer num2;
        java.lang.Object[] objArr3;
        int i9;
        java.lang.Integer num3;
        java.lang.Object[] objArr4;
        int i10;
        java.lang.Object[] objArr5;
        char c3;
        java.lang.Integer num4;
        java.lang.String[] split;
        int length;
        int i11;
        java.lang.String str;
        ?? r13;
        ?? modifierMetaStateMask;
        int i12;
        ?? r38;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.Throwable cause;
        java.lang.Object[] objArr6;
        java.lang.Object obj;
        java.lang.Object newInstance2;
        java.lang.Integer num5;
        java.lang.Object obj2;
        java.lang.String str2;
        java.lang.Throwable th3;
        java.lang.InterruptedException interruptedException;
        java.lang.String str3;
        java.lang.String str4;
        int length2;
        int i13;
        java.lang.Object obj3;
        java.lang.String str5;
        java.lang.Integer num6;
        java.lang.Object[] objArr7;
        int i14;
        java.lang.Integer num7;
        java.lang.Object[] objArr8;
        int i15;
        java.lang.Integer num8;
        java.lang.Object[] objArr9;
        int i16;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(true, "\u0011\ufffe\u0000\u0006\t\r\r\uffdeￋ\n\rￋ\u0011\u000b\u0002\u0011\u000b\f\u0000ￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\f\u0003\u000b￦\u000b\f\u0006", 138 - android.view.KeyEvent.normalizeMetaState(0), 27 - android.text.TextUtils.getOffsetAfter("", 0), 34 - android.view.KeyEvent.getDeadChar(0, 0), objArr10);
        java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b(android.view.View.MeasureSpec.getMode(0) - 421628920, android.text.TextUtils.getOffsetAfter("", 0) - 93, (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.getDefaultSize(0, 0) + 1356104753, (short) android.view.View.getDefaultSize(0, 0), objArr11);
        java.lang.String intern2 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(true, "\u000f\u0002\rￏ\u0002\u0017\u0002\u000b\u0005\u0002\u0006\u0013\t\ufff5ￏ\b", android.view.View.getDefaultSize(0, 0) + 134, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, 16 - (android.os.Process.myPid() >> 22), objArr12);
        java.lang.String intern3 = ((java.lang.String) objArr12[0]).intern();
        try {
            if (context == null) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(true, "\u0005\u0015\u0007ￏ\u000f\u0006\u000e￩\ufff3\uffef\u0014\u0013", 135 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr13);
                java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('T' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3161, (char) (33099 - android.text.TextUtils.getCapsMode("", 0, 0)));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c((short) 618, bArr[54], bArr[41], objArr15);
                    obj4 = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj4);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr14)).longValue();
                long j = i;
                long j2 = ~j;
                long j3 = ~longValue;
                long j4 = ~(longValue | (-80475562));
                long j5 = ((-721) * longValue) + 58022880202L + (((~(j3 | 80475561)) | j2 | j4) * 1444) + ((j4 | (~(j | (-80475562))) | (~(longValue | j))) * (-1444)) + (((~(longValue | 80475561)) | (~(j3 | (-80475562)))) * 722) + 987946300;
                int i17 = (int) (j5 >> 32);
                int i18 = ~i;
                if (((i17 & ((((~(1740631602 | i)) | (~((-1117109283) | i18))) * (-1808)) + 413764906 + (((~(1740635698 | i)) | (~((-1117105187) | i18))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(1117109282 | i)) | 4096 | (~((-1740631603) | i18))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) j5) & ((((((~(2139307691 | i)) | 5816576) * 576) + 1771465493) + (((~(2145124267 | i18)) | 696264705) * 576)) - 944619520))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                    int i19 = ~(554569696 | i18);
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((475041800 | i19) * (-712)) + 614255816 + (((~((-475041801) | i18)) | (~(1029611496 | i))) * (-712)) + ((i19 | (-475566249)) * 712))};
                    num6 = -1347122530;
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                        byte b = $$a[54];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c((short) 653, b, (byte) (b & 34), objArr17);
                        obj5 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr16)).intValue();
                    i14 = 0;
                    ((int[]) objArr7[4])[0] = intValue;
                } else {
                    num6 = -1347122530;
                    objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~(9794796 | i18)) | (-1040020990)) | (~(1039930741 | i18))) * 464) - 1523486168) + (((-1030226194) | i) * (-464)) + (((~(1039930741 | i)) | (-1040020990)) * 464))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj6 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b2 = $$a[54];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c((short) 653, b2, (byte) (b2 & 34), objArr19);
                        obj6 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                    }
                    i14 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
                }
                if (((int[]) objArr7[1])[i14] != i) {
                    return objArr7;
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                a(false, "\ufff9\r\n\ufffb�\uffff\uffc9\r\u0013\r\u000e\uffff\u0007\uffc9\u0010\n\u0002\t\b\uffff", android.view.View.resolveSize(i14, i14) + 141, android.view.View.getDefaultSize(i14, i14) + 6, 19 - android.os.Process.getGidForName(""), objArr20);
                java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj7 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3162 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (33098 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    c((short) 618, bArr2[54], bArr2[41], objArr22);
                    obj7 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj7);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr21)).longValue();
                long j6 = ~longValue2;
                long j7 = ~(j | (-634521622));
                java.lang.Integer num9 = num6;
                long j8 = ~(longValue2 | 634521621);
                long j9 = (408 * longValue2) + 515866078686L + (((~(j6 | (-634521622))) | j7) * (-814)) + (((~(j6 | j2)) | j8 | j7) * 407) + (((~(longValue2 | j)) | j8 | (~(j | 634521621))) * 407) + 1541992360;
                if (((((int) (j9 >> 32)) & ((((~((-2137366055) | i)) | 690030626) * (-566)) + 1152536790 + ((~((-1447335429) | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) j9) & (((((~(298033679 | i18)) | (-1407693728)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(1407693727 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(1139192730 | i18)) | 268500997 | (~((-1109660049) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1015799316) | i18)) | 1006705666 | (~(14336629 | i18))) * 464) + 207917608 + (((-9093650) | i) * (-464)) + (((~(14336629 | i)) | 1006705666) * 464))};
                    num7 = num9;
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                    if (obj8 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte b3 = $$a[54];
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        c((short) 653, b3, (byte) (b3 & 34), objArr24);
                        obj8 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, obj8);
                    }
                    i15 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr23)).intValue();
                } else {
                    num7 = num9;
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    int i20 = ~((-14117882) | i);
                    java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-14117882) | i18)) | 5262192) * (-245)) + 377727226 + (i20 * (-245)) + ((i20 | 1016018063) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                    if (obj9 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - android.graphics.Color.green(0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        byte b4 = $$a[54];
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        c((short) 653, b4, (byte) (b4 & 34), objArr26);
                        obj9 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, obj9);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr25)).intValue();
                    i15 = 0;
                    ((int[]) objArr8[4])[0] = intValue2;
                }
                if (((int[]) objArr8[1])[i15] != i) {
                    return objArr8;
                }
                float complexToFloat = android.util.TypedValue.complexToFloat(i15);
                float maxVolume = android.media.AudioTrack.getMaxVolume();
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i15, i15);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                a(false, "\u0005\u0002\u0015\u0002\uffd0\u0004\u0010\u000eￏ\b\u0003\u0010\u0019ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005\uffd0\u0017\u0007\u0014\u0000\u0005\u0002\u0015\u0002\uffd0\u0005\u0002\u0015\u0002\uffd0", (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 134, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 29, 35 - indexOf, objArr27);
                java.lang.Object[] objArr28 = {((java.lang.String) objArr27[0]).intern()};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj10 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, 3161 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (33099 - android.text.TextUtils.getOffsetBefore("", 0)));
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    c((short) 612, (byte) (-$$a[23]), r6[22], objArr29);
                    obj10 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj10);
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr28)).longValue();
                long j10 = 448299736 | j2;
                long j11 = ~longValue3;
                java.lang.Integer num10 = num7;
                long j12 = j11 | j2;
                long j13 = ((-183) * longValue3) + 82038851871L + (((~(j12 | (-448299737))) | (~(j10 | longValue3))) * (-184)) + (((~(448299736 | j11)) | (~j10) | (~j12)) * 184) + (((-448299737) | longValue3) * 184) + 1443734640;
                if (((((int) j13) & ((((((~((-1949707715) | i)) | 1075839296) | (~(908033171 | i))) * (-754)) - 1993636157) + (((~((-1075839297) | i)) | (~(1983872467 | i18))) * (-754)) + (((-1949707715) | i18) * 754))) | (((((~(1576511513 | i18)) | (~(1281229371 | i))) * (-370)) + 635053406 + (((~(1576511513 | i)) | (~(1281229371 | i18)) | 1280704537) * (-370)) + 1414276130) & ((int) (j13 >> 32)))) != 0) {
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((-38248550) | r1) * (-220)) - 1443773396) + (((~(991887395 | i)) | (-996122728)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1542136300)};
                    num8 = num10;
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                    if (obj11 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, android.text.TextUtils.getOffsetAfter("", 0) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        byte b5 = $$a[54];
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        c((short) 653, b5, (byte) (b5 & 34), objArr31);
                        obj11 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj11);
                    }
                    int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr30)).intValue();
                    i16 = 0;
                    ((int[]) objArr9[4])[0] = intValue3;
                } else {
                    num8 = num10;
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~(853921657 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1386039800 + (((-134221831) | i18) * (-216)) + (((~(853921657 | i18)) | 176214287) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                    if (obj12 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        byte b6 = $$a[54];
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c((short) 653, b6, (byte) (b6 & 34), objArr33);
                        obj12 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj12);
                    }
                    i16 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr32)).intValue();
                }
                if (((int[]) objArr9[1])[i16] != i) {
                    return objArr9;
                }
                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                int resolveSizeAndState = android.view.View.resolveSizeAndState(i16, i16, i16);
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                a(true, "\u0016\u0003\u0006\uffd1\u000f\u0018\uffd1\u0007\u0005\u0003\u0012\u0015\uffd0\u000e\u0003\u0017\u0006\uffd0\u0006\u000b\u0011\u0014\u0006\u0010\u0003\uffd0\u0007\u0010\u0011\u000e\u0005\uffd0\u000f\u0011\u0005\uffd1\u0003\u0016\u0003\u0006\uffd1\u0003", (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 132, (keyRepeatDelay >> 16) + 4, resolveSizeAndState + 42, objArr34);
                java.lang.Object[] objArr35 = {((java.lang.String) objArr34[0]).intern()};
                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj13 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3161, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33098));
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    c((short) 612, (byte) (-$$a[23]), r3[22], objArr36);
                    obj13 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj13);
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr35)).longValue();
                long j14 = (((-215) * longValue4) - 134023688645L) + ((~(j | (-617620685))) * 216) + (((-617620685) | (~longValue4) | j2) * (-216)) + ((longValue4 | (~(j2 | (-617620685)))) * 216) + 1613055588;
                int i21 = ~((-1581757484) | i);
                if (((((int) (j14 >> 32)) & (((306315266 | i21) * (-814)) + 863427788 + ((i21 | (~(1275983401 | i18)) | 541184) * 407) + (((~(1581757483 | i)) | 541184 | (~((-1275983402) | i))) * 407))) | (((int) j14) & ((((~(383775899 | i18)) | 1744833092 | (~((-307606683) | i))) * 717) + 426651515 + (((~(383775899 | i)) | (~((-307606683) | i18)) | 1744833092) * 717)))) != 0) {
                    java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                    int i22 = 319098694 | i18;
                    java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((i22 * 495) + 1567962073 + (((~i22) | 33620290) * 495))};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                    if (obj14 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.view.View.combineMeasuredStates(0, 0));
                        byte b7 = $$a[54];
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        c((short) 653, b7, (byte) (b7 & 34), objArr39);
                        obj14 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj14);
                    }
                    ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr38)).intValue();
                    return objArr37;
                }
                java.lang.Object[] objArr40 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                int i23 = (~((-472323893) | i18)) | 469767712 | (~(557812052 | i18));
                java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-555255873) | i)) | i23) * 590) + 2131729096 + (i23 * (-1180)) + (((~((-557812053) | i18)) | (~(472323892 | i18))) * 590))};
                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                if (obj15 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    byte b8 = $$a[54];
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    c((short) 653, b8, (byte) (b8 & 34), objArr42);
                    obj15 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj15);
                }
                ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr41)).intValue();
                return objArr40;
            }
            java.lang.Integer num11 = -1347122530;
            i4 = i;
            try {
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                a(true, "\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff", 140 - android.view.View.getDefaultSize(0, 0), 1 - android.view.MotionEvent.axisFromString(""), 23 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr43);
                java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr43[0]).intern());
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                b(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 421628949, (-86) - (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1356104756, (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr44);
                java.lang.String str6 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr44[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                a(true, "\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff", 141 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2 - android.view.View.resolveSize(0, 0), 23 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr45);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr45[0]).intern());
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                b((-421628937) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-82) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1356104756 - android.text.TextUtils.getCapsMode("", 0, 0), (short) android.view.View.resolveSizeAndState(0, 0, 0), objArr46);
                invoke = cls14.getMethod(((java.lang.String) objArr46[0]).intern(), null).invoke(context, null);
                int indexOf2 = ((java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke)).indexOf(str6);
                if (indexOf2 > 0) {
                    java.lang.String str7 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                    if (str7.length() >= 16) {
                        int i24 = 0;
                        for (int i25 = 16; i24 <= str7.length() - i25; i25 = 16) {
                            java.lang.Object[] objArr47 = {str7.substring(i24, i24 + 16), 931995};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj16 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 28, 2594 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                byte b9 = $$a[41];
                                str5 = str7;
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c(b9, r12[2], b9, objArr48);
                                obj16 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                            } else {
                                str5 = str7;
                            }
                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr47)).longValue();
                            long j15 = ~longValue5;
                            long j16 = (~i4) | 501805773;
                            int i26 = indexOf2;
                            java.lang.Integer num12 = num11;
                            int i27 = i24;
                            long j17 = ((242 * longValue5) - 242372188842L) + (((~(j15 | 501805773)) | (~j16)) * (-241)) + (((-501805774) | longValue5) * (-482)) + (((~(j16 | longValue5)) | (~((-501805774) | j15))) * 241) + 1758906298;
                            int i28 = ~i4;
                            if (((((int) j17) & (((((~((-2079287007) | i28)) | 642060596) * (-328)) - 1812818303) + ((642060596 | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(2079287006 | i4)) | 67113248 | (~((-1504339659) | i28))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) (j17 >> 32)) & (((((~(1772694265 | i4)) | (-1772978172)) * 345) - 484646000) + (((~(1772694265 | i28)) | 687931552) * 345) + ((~(1772978171 | i4)) * 345)))) == -725904754) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str8 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                                ((int[]) objArr[0])[0] = i4;
                                ((int[]) objArr[1])[0] = i4 ^ 20;
                                int i29 = ~(419908128 | i4);
                                java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-475681) | i28)) | (~(610227816 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1212125896 + (((~((-610227817) | i28)) | i29) * (-1040)) + ((i29 | (~((-419908129) | i28)) | 609752136) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                if (obj17 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                                    byte b10 = $$a[54];
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    c((short) 653, b10, (byte) (b10 & 34), objArr50);
                                    obj17 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, obj17);
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr49)).intValue();
                                i5 = i4;
                                num = num12;
                                i6 = 1;
                                c = 0;
                                if (((int[]) objArr[i6])[c] != i5) {
                                    return objArr;
                                }
                                int[] iArr = new int[i6];
                                int[] iArr2 = new int[i6];
                                iArr[c] = i5;
                                iArr2[c] = i5;
                                java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[i6]};
                                int i30 = ~i5;
                                java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-864283041) | i30)) | (-165852905)) * (-865)) - 418185152) + ((~(864283040 | i5)) * 865) + (((~(864283040 | i30)) | (~((-165852905) | i30))) * 865))};
                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj18 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                    byte b11 = $$a[54];
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    c((short) 653, b11, (byte) (b11 & 34), objArr53);
                                    obj18 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj18);
                                }
                                ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr52)).intValue();
                                if (((int[]) objArr51[1])[0] != i5) {
                                    return objArr51;
                                }
                                if ((i2 & 1) == 0) {
                                    int myPid = android.os.Process.myPid();
                                    long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b((-421628823) - (myPid >> 22), (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) - 88, (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1356104753, (short) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr54);
                                    try {
                                        java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        a(true, "\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 140, android.view.Gravity.getAbsoluteGravity(0, 0) + 2, android.view.View.MeasureSpec.getMode(0) + 23, objArr56);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr56[0]).intern());
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        a(false, "\u0004￪￼\t\r\u0000\ufffa￼\ufffe￼\u000b￪\u0010\n\u000b￼", 144 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, android.view.View.resolveSize(0, 0) + 16, objArr57);
                                        java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr57[0]).intern(), java.lang.String.class).invoke(context, objArr55);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a(true, "\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff￫\u0017\u0001\u0007\n\r￮\u0003\u0001\u0007\u0014\u0003￢ￌ\f\u0007\u000b\u0002\uffffￌ\u000e\u000e\uffffￌ\u0002\u0007\r\u0010", 137 - android.view.View.resolveSize(0, 0), 3 - android.view.View.MeasureSpec.getMode(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, objArr58);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr58[0]).intern());
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            a(false, "\b\u0004\t\u000e\u0002\u0000\u000fￜ\ufffe\u000f\u0004\u0011\u0000ￜ\uffff", android.view.KeyEvent.normalizeMetaState(0) + 140, android.view.View.resolveSizeAndState(0, 0, 0) + 4, 15 - android.graphics.Color.green(0), objArr59);
                                            java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr59[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 421628811, (-71) - android.graphics.Color.alpha(0), (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 1356104751 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) android.text.TextUtils.indexOf("", ""), objArr60);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr60[0]).intern());
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    b((-421628951) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-86) - android.view.KeyEvent.getDeadChar(0, 0), (byte) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 1356104756, (short) (android.os.Process.myTid() >> 22), objArr61);
                                                    java.lang.String str9 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr61[0]).intern(), null).invoke(next, null);
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(true, "\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff￫\u0017\u0001\u0007\n\r￮\u0003\u0001\u0007\u0014\u0003￢ￌ\f\u0007\u000b\u0002\uffffￌ\u000e\u000e\uffffￌ\u0002\u0007\r\u0010", android.text.TextUtils.indexOf("", "", 0, 0) + 137, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, 37 - android.text.TextUtils.getOffsetBefore("", 0), objArr62);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr62[0]).intern());
                                                    java.util.Iterator it2 = it;
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    b((-421628782) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-83) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1356104758 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) android.text.TextUtils.getTrimmedLength(""), objArr63);
                                                    if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr63[0]).intern(), java.lang.String.class).invoke(invoke2, str9)).booleanValue()) {
                                                        if (str9.length() >= 20) {
                                                            int i31 = 0;
                                                            for (int i32 = 20; i31 <= str9.length() - i32; i32 = 20) {
                                                                java.lang.Object[] objArr64 = {str9.substring(i31, i31 + 20), 931995};
                                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                if (obj19 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2594, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                    byte b12 = $$a[41];
                                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                    c(b12, r6[2], b12, objArr65);
                                                                    obj19 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                                }
                                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr64)).longValue();
                                                                long j18 = ~longValue6;
                                                                long j19 = i5;
                                                                long j20 = ~j19;
                                                                java.lang.Object obj20 = invoke2;
                                                                int i33 = i31;
                                                                long j21 = ~(j20 | 427067271);
                                                                long j22 = ((713 * longValue6) - 303644829681L) + (((~(j18 | 427067271)) | j21) * (-712)) + (((~(longValue6 | 427067271 | j19)) | (~(j20 | j18 | 427067271))) * (-712)) + ((j21 | j18) * 712) + 830033253;
                                                                int i34 = ~(2123583882 | i30);
                                                                i7 = i;
                                                                if (((((int) j22) & ((((~(2142172783 | i7)) | 352616453) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1777297852 + ((~(2142172783 | i30)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) (j22 >> 32)) & (((1410400512 | i34 | (~((-2123583883) | i7))) * (-338)) + 1411229610 + ((i34 | (~((-713183371) | i7))) * 338)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i7}, new int[]{i7 ^ 70}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-142842721) | i7)) | 1012964936) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 563052136 + (((~((-142842721) | i30)) | 1012964936) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                                                    if (obj21 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                                        byte b13 = $$a[54];
                                                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                        c((short) 653, b13, (byte) (b13 & 34), objArr67);
                                                                        obj21 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj21);
                                                                    }
                                                                    c3 = 0;
                                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr66)).intValue();
                                                                    if (((int[]) objArr5[1])[c3] == i7) {
                                                                        return objArr5;
                                                                    }
                                                                    i8 = 0;
                                                                } else {
                                                                    i31 = i33 + 1;
                                                                    invoke2 = obj20;
                                                                    i5 = i7;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    it = it2;
                                                    invoke2 = invoke2;
                                                    i5 = i5;
                                                }
                                            }
                                        }
                                        i7 = i5;
                                        objArr5 = new java.lang.Object[]{new int[]{i7}, new int[]{i7}, null, null, new int[1]};
                                        int i35 = ~(1023148028 | i7);
                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-343666845) | i30)) | 6987916 | i35) * (-502)) + 243102480 + ((i35 | (~((-336678929) | i30))) * 502))};
                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                        if (obj22 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2713 - android.view.View.MeasureSpec.getMode(0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            byte b14 = $$a[54];
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            c((short) 653, b14, (byte) (b14 & 34), objArr69);
                                            obj22 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj22);
                                        }
                                        int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr68)).intValue();
                                        c3 = 0;
                                        ((int[]) objArr5[4])[0] = intValue4;
                                        if (((int[]) objArr5[1])[c3] == i7) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                } else {
                                    i7 = i5;
                                    i8 = 0;
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                a(true, "\u0005\u0015\u0007ￏ\u000f\u0006\u000e￩\ufff3\uffef\u0014\u0013", android.graphics.ImageFormat.getBitsPerPixel(i8) + 136, 4 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 12, objArr70);
                                java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj23 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3162, (char) (android.graphics.Color.green(0) + 33099));
                                    byte[] bArr3 = $$a;
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    c((short) 618, bArr3[54], bArr3[41], objArr72);
                                    obj23 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj23);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr71)).longValue();
                                long j23 = ~((~longValue7) | 495098637);
                                long j24 = i7;
                                long j25 = ~(495098637 | j24);
                                long j26 = ((-657) * longValue7) + 326270001783L + (((~(longValue7 | (-495098638))) | j23 | j25) * (-658)) + (658 * j23) + ((j23 | j25) * 658) + 412372101;
                                if (((((int) (j26 >> 32)) & ((((~(1189812388 | i30)) | 1667928496 | (~((-1189812389) | i7))) * (-564)) + 511771674 + ((~((-75565061) | i7)) * 1128) + (((~(1667928496 | i30)) | 1114247328) * 564))) | (((int) j26) & (((338167824 | i7) * 988) + 16777849 + (((~((-562161550) | i30)) | 25264513) * (-1976)) + (((~(875064860 | i7)) | 338167824 | (~((-875064861) | i30))) * 988)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i7}, new int[]{i7 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-1007698805) | i7) * (-381)) - 1597379618) + (((~(15613067 | i30)) | (-1016487799)) * 381) + 1681154980)};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj24 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", "", 0) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                        byte b15 = $$a[54];
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        c((short) 653, b15, (byte) (b15 & 34), objArr74);
                                        obj24 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj24);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr73)).intValue();
                                } else {
                                    objArr2 = new java.lang.Object[]{new int[]{i7}, new int[]{i7}, null, null, new int[1]};
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((-4480887) | i7) * 376) + 246077640 + (((~(517290383 | i30)) | (-517308416)) * (-376)) + (((~((-517290384) | i7)) | 512845561) * 376))};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj25 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.graphics.Color.blue(0));
                                        byte b16 = $$a[54];
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        c((short) 653, b16, (byte) (b16 & 34), objArr76);
                                        obj25 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj25);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr75)).intValue();
                                }
                                if (((int[]) objArr2[1])[c2] != i7) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                a(false, "\ufff9\r\n\ufffb�\uffff\uffc9\r\u0013\r\u000e\uffff\u0007\uffc9\u0010\n\u0002\t\b\uffff", 141 - android.text.TextUtils.indexOf("", ""), 5 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.KeyEvent.keyCodeFromString("") + 20, objArr77);
                                java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern()};
                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj26 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33099));
                                    byte[] bArr4 = $$a;
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    c((short) 618, bArr4[54], bArr4[41], objArr79);
                                    obj26 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj26);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr78)).longValue();
                                long j27 = ~longValue8;
                                long j28 = 1035401563 | j27;
                                long j29 = ~j24;
                                java.lang.Integer num13 = num;
                                long j30 = ((-919) * longValue8) + 951534037316L + (((~(j27 | j29 | (-1035401564))) | (~(j28 | j24))) * 920) + (((~j28) | (~(1035401563 | j29))) * 920) + (((~(longValue8 | 1035401563 | j24)) | (~(j28 | j29)) | (~(j27 | (-1035401564) | j24))) * 920) + 1942872302;
                                if (((((int) j30) & ((((~(1774165487 | i7)) | 1083575398) * (-756)) + 462676417 + ((1774165487 | i30) * 756))) | (((int) (j30 >> 32)) & ((((1556919803 | r5) * (-220)) - 456685242) + (((~((-1300821082) | i7)) | 1284027481) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1800680348))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i7}, new int[]{i7 ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-706994895) | i30)) | (~((-323141051) | i7))) | (~(323141050 | i30))) * 959) - 1248903343) + (((~((-706994895) | i7)) | (~((-323141051) | i30)) | (~(323141050 | i7))) * 959))};
                                    num2 = num13;
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                    if (obj27 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        byte b17 = $$a[54];
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        c((short) 653, b17, (byte) (b17 & 34), objArr81);
                                        obj27 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj27);
                                    }
                                    i9 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr80)).intValue();
                                } else {
                                    num2 = num13;
                                    objArr3 = new java.lang.Object[]{new int[]{i7}, new int[]{i7}, null, null, new int[1]};
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-71311205) | i7)) * 623) - 1620770550) + ((956383234 | i30) * (-623)) + (((~((-72531958) | i7)) | 71311204 | (~(957603987 | i7))) * 623))};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                    if (obj28 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        byte b18 = $$a[54];
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        c((short) 653, b18, (byte) (b18 & 34), objArr83);
                                        obj28 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj28);
                                    }
                                    i9 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr82)).intValue();
                                }
                                if (((int[]) objArr3[1])[i9] != i7) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                a(false, "\u0005\u0002\u0015\u0002\uffd0\u0004\u0010\u000eￏ\b\u0003\u0010\u0019ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005\uffd0\u0017\u0007\u0014\u0000\u0005\u0002\u0015\u0002\uffd0\u0005\u0002\u0015\u0002\uffd0", 134 - android.view.View.MeasureSpec.getMode(i9), 31 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.os.Process.myTid() >> 22) + 36, objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj29 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 37, android.graphics.Color.alpha(0) + 3161, (char) (33100 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    c((short) 612, (byte) (-$$a[23]), r6[22], objArr86);
                                    obj29 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj29);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr85)).longValue();
                                long j31 = ~longValue9;
                                java.lang.Integer num14 = num2;
                                long j32 = (((-661) * longValue9) - 238205684446L) + (((~(j31 | (-360371687))) | j29) * 1324) + (((~(360371686 | j24)) | (~(longValue9 | j24))) * (-1324)) + (((~(longValue9 | (-360371687))) | (~(360371686 | j31))) * 662) + 635063217;
                                if (((((int) (j32 >> 32)) & (((((~(1251573517 | i7)) | 1606167367) * (-964)) - 331686834) + (((~(1251573517 | i30)) | 354680898) * (-964)))) | (((int) j32) & (((((~((-877010366) | i30)) | (~((-1980730521) | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1660533429) + (((~((-1107918849) | i30)) | (~((-4198694) | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i7}, new int[]{i7 ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((873467908 | i30) * (-192)) + 1247741576 + (((~((-145575491) | i30)) | 11092546) * (-384)) + (((~((-11092547) | i7)) | (~((-134482945) | i30)) | (~(1019043398 | i7))) * 192))};
                                    num3 = num14;
                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                    if (obj30 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2713 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                        byte b19 = $$a[54];
                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                        c((short) 653, b19, (byte) (b19 & 34), objArr88);
                                        obj30 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj30);
                                    }
                                    i10 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr87)).intValue();
                                } else {
                                    num3 = num14;
                                    objArr4 = new java.lang.Object[]{new int[]{i7}, new int[]{i7}, null, null, new int[1]};
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-90559745) | i7)) | (~(1030086536 | i30))) * (-406)) - 73161512) + ((~((-90510337) | i30)) * (-406)) + (((~((-939576201) | i7)) | (~(90559744 | i30))) * 406))};
                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                    if (obj31 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                        byte b20 = $$a[54];
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        c((short) 653, b20, (byte) (b20 & 34), objArr90);
                                        obj31 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj31);
                                    }
                                    i10 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr89)).intValue();
                                }
                                if (((int[]) objArr4[1])[i10] != i7) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                a(true, "\u0016\u0003\u0006\uffd1\u000f\u0018\uffd1\u0007\u0005\u0003\u0012\u0015\uffd0\u000e\u0003\u0017\u0006\uffd0\u0006\u000b\u0011\u0014\u0006\u0010\u0003\uffd0\u0007\u0010\u0011\u000e\u0005\uffd0\u000f\u0011\u0005\uffd1\u0003\u0016\u0003\u0006\uffd1\u0003", 133 - android.view.View.combineMeasuredStates(i10, i10), 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i10, i10), 42 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr91);
                                java.lang.Object[] objArr92 = {((java.lang.String) objArr91[0]).intern()};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj32 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 36, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3161, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 33099));
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    c((short) 612, (byte) (-$$a[23]), r4[22], objArr93);
                                    obj32 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj32);
                                }
                                long j33 = ~((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr92)).longValue();
                                long j34 = ((r2 * (-489)) - 170102604650L) + ((346441149 | j33 | j29) * (-490)) + (((~(j24 | j33)) | (~(j33 | (-346441150)))) * 490) + 171098039063L;
                                int i36 = ~(2012230050 | i30);
                                if (((((int) j34) & ((((1784476224 | i7) * (-50)) - 236386629) + (((~((-710455297) | i7)) | (~((-362809366) | i30))) * 50) + (((~(1784476224 | i30)) | (~((-1073264662) | i30)) | 362809365) * 50))) | (((int) (j34 >> 32)) & (((574624162 | i36) * (-970)) + 1863574910 + ((i36 | 1437605888) * 970)))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i7}, new int[]{i7 ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((-805328905) | i30) * 494) + 447804692 + (((~(i30 | 222111344)) | (-1024744553)) * 494))};
                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                    if (obj33 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                        byte b21 = $$a[54];
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        c((short) 653, b21, (byte) (b21 & 34), objArr96);
                                        obj33 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj33);
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr95)).intValue();
                                    return objArr94;
                                }
                                java.lang.Object[] objArr97 = {new int[]{i7}, new int[]{i7}, null, null, new int[1]};
                                java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i30 | (-243269795))) | (-786866151)) * (-591)) + 1887236748 + (((-243269795) | i7) * 591))};
                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                if (obj34 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, android.graphics.Color.blue(0) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                    byte b22 = $$a[54];
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    c((short) 653, b22, (byte) (b22 & 34), objArr99);
                                    obj34 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj34);
                                }
                                ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr98)).intValue();
                                return objArr97;
                            }
                            i24 = i27 + 1;
                            num11 = num12;
                            indexOf2 = i26;
                            str7 = str5;
                        }
                    }
                    int i37 = indexOf2;
                    num4 = num11;
                    java.lang.String str10 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                    if (str10.length() >= 6) {
                        int i38 = 0;
                        while (i38 <= str10.length() - 6) {
                            java.lang.Object[] objArr100 = {str10.substring(i38, i38 + 6), 931995};
                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj35 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.myTid() >> 22), 2595 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.red(0));
                                byte b23 = $$a[41];
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                c(b23, r9[2], b23, objArr101);
                                obj35 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj35);
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr100)).longValue();
                            long j35 = i4;
                            int i39 = i37;
                            java.lang.String str11 = str10;
                            int i40 = i38;
                            long j36 = ((-301) * longValue10) + 202792681734L + (((~(longValue10 | 669282778 | j35)) | (~((~j35) | (-669282779) | longValue10))) * (-302)) + ((~((-669282779) | longValue10 | j35)) * (-604)) + (((~(longValue10 | j35)) | (~((~longValue10) | 669282778))) * 302) + 587817746;
                            int i41 = ~i4;
                            int i42 = (int) j36;
                            int i43 = ~((-398174715) | i41);
                            if (((((int) (j36 >> 32)) & ((((1537923837 | i41) * 1444) - 1153123274) + (((~((-55861930) | i4)) | 50348713 | (~(1493088340 | i4))) * (-1444)) + 2015518628)) | (i42 & (((((((~(1039051695 | i41)) | (-1073720320)) | (~(398174714 | i41))) | (~((-363506091) | i4))) * (-84)) - 1905160647) + (((~(398174714 | i4)) | (-1039051696) | i43) * (-84)) + ((i43 | 363506090) * 84)))) == -2096167706) {
                                java.lang.Object[] objArr102 = {new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str12 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                                ((int[]) objArr102[0])[0] = i4;
                                ((int[]) objArr102[1])[0] = i4 ^ 20;
                                java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((675289664 | i41) * (-192)) + 1247741576 + (((~((-346449207) | i41)) | 8397074) * (-384)) + (((~(i41 | (-338052133))) | (~((-8397075) | i4)) | (~(1021738870 | i4))) * 192))};
                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                if (obj36 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) android.view.View.resolveSize(0, 0));
                                    byte b24 = $$a[54];
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    c((short) 653, b24, (byte) (b24 & 34), objArr104);
                                    obj36 = cls38.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj36);
                                }
                                ((int[]) objArr102[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr103)).intValue();
                                i5 = i4;
                                num = num4;
                                objArr = objArr102;
                                i6 = 1;
                                c = 0;
                                if (((int[]) objArr[i6])[c] != i5) {
                                }
                            } else {
                                i38 = i40 + 1;
                                i37 = i39;
                                str10 = str11;
                            }
                        }
                    }
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke)).substring(0, i37);
                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                    b((-421628914) - (android.os.Process.myTid() >> 22), android.graphics.Color.argb(0, 0, 0, 0) - 99, (byte) android.view.KeyEvent.keyCodeFromString(""), 1356104699 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (short) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr105);
                    split = substring.split(((java.lang.String) objArr105[0]).intern());
                    length = split.length;
                    i11 = 0;
                    while (i11 < length) {
                        str = split[i11];
                        byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        r13 = (byte) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                        java.lang.String[] strArr = split;
                        int i44 = length;
                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                        i12 = -421628915;
                        int i45 = (-421628915) - modifierMetaStateMask2;
                        r38 = (-96) - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1));
                        b(i45, r38, r13, modifierMetaStateMask + 1356104745, (short) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr106);
                        if (str.split(((java.lang.String) objArr106[0]).intern()).length > 1) {
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1582, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)))) {
                                try {
                                    try {
                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                        b((-421628912) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (-84) - android.view.KeyEvent.keyCodeFromString(""), (byte) android.text.TextUtils.indexOf("", ""), 1356104765 - android.view.Gravity.getAbsoluteGravity(0, 0), (short) android.graphics.Color.blue(0), objArr107);
                                        java.lang.String intern4 = ((java.lang.String) objArr107[0]).intern();
                                        try {
                                            try {
                                                java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                a(true, "\ufffb\u0006", 148 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2, objArr108);
                                                exec = runtime.exec(((java.lang.String) objArr108[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                try {
                                                    java.lang.Object[] objArr109 = {exec.getInputStream()};
                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    if (obj37 == null) {
                                                        try {
                                                            obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1507 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj37);
                                                        } catch (java.lang.Throwable th5) {
                                                            th = th5;
                                                            java.lang.Throwable cause3 = th.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    newInstance = ((java.lang.reflect.Constructor) obj37).newInstance(objArr109);
                                                    try {
                                                        objArr6 = new java.lang.Object[]{exec.getErrorStream()};
                                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                        if (obj == null) {
                                                            try {
                                                                i45 = i11;
                                                                try {
                                                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 44, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1506, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getDeclaredConstructor(java.io.InputStream.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj);
                                                                } catch (java.lang.Throwable th6) {
                                                                    th = th6;
                                                                    th2 = th;
                                                                    cause = th2.getCause();
                                                                    if (cause == null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (java.lang.Throwable th7) {
                                                                th = th7;
                                                            }
                                                        } else {
                                                            i45 = i11;
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        th = th8;
                                                    }
                                                    try {
                                                        newInstance2 = ((java.lang.reflect.Constructor) obj).newInstance(objArr6);
                                                        try {
                                                            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                            try {
                                                                java.lang.Class<?> cls39 = java.lang.Class.forName(intern3);
                                                                num5 = num4;
                                                                try {
                                                                    obj2 = invoke;
                                                                    try {
                                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                        b((-421628897) - android.text.TextUtils.indexOf("", ""), android.graphics.Color.red(0) - 95, (byte) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1356104768, (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr110);
                                                                        cls39.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance, null);
                                                                        try {
                                                                            java.lang.Class<?> cls40 = java.lang.Class.forName(intern3);
                                                                            str2 = intern2;
                                                                            try {
                                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                                b(android.widget.ExpandableListView.getPackedPositionChild(0L) - 421628896, (-95) - android.text.TextUtils.getOffsetBefore("", 0), (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 1356104768 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) android.graphics.Color.green(0), objArr111);
                                                                                cls40.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance2, null);
                                                                                try {
                                                                                    try {
                                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                        sb.append(intern4);
                                                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                        a(false, "\u0000", 49 - android.graphics.Color.red(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1 - android.graphics.Color.alpha(0), objArr112);
                                                                                        sb.append(((java.lang.String) objArr112[0]).intern());
                                                                                        java.lang.String obj38 = sb.toString();
                                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                        a(false, "\u0002￩\ufff4\u0011\u0010", 107 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.os.Process.myPid() >> 22) + 3, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 5, objArr113);
                                                                                        dataOutputStream.write(obj38.getBytes(((java.lang.String) objArr113[0]).intern()));
                                                                                        dataOutputStream.flush();
                                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                        b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 421628892, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 95, (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1356104754 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) android.text.TextUtils.getCapsMode("", 0, 0), objArr114);
                                                                                        java.lang.String intern5 = ((java.lang.String) objArr114[0]).intern();
                                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                        a(false, "\u0002￩\ufff4\u0011\u0010", 107 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 5, objArr115);
                                                                                        dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr115[0]).intern()));
                                                                                        dataOutputStream.flush();
                                                                                    } catch (java.lang.Throwable th9) {
                                                                                        th = th9;
                                                                                    }
                                                                                } catch (java.io.IOException unused) {
                                                                                    i12 = i;
                                                                                    r38 = intern;
                                                                                } catch (java.lang.Exception unused2) {
                                                                                }
                                                                                try {
                                                                                    long nanoTime = java.lang.System.nanoTime();
                                                                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                    while (true) {
                                                                                        try {
                                                                                            exec.exitValue();
                                                                                            str4 = intern;
                                                                                            break;
                                                                                        } catch (java.lang.IllegalThreadStateException unused3) {
                                                                                            if (nanos > 0) {
                                                                                                try {
                                                                                                    try {
                                                                                                        java.lang.Object[] objArr116 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                        java.lang.Class<?> cls41 = java.lang.Class.forName(intern3);
                                                                                                        str3 = intern;
                                                                                                        try {
                                                                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                                            a(false, "\u0005\b\u0001\ufffa\ufffa", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 146, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 5 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr117);
                                                                                                            cls41.getMethod(((java.lang.String) objArr117[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr116);
                                                                                                        } catch (java.lang.Throwable th10) {
                                                                                                            th = th10;
                                                                                                            java.lang.Throwable th11 = th;
                                                                                                            java.lang.Throwable cause4 = th11.getCause();
                                                                                                            if (cause4 != null) {
                                                                                                                throw cause4;
                                                                                                            }
                                                                                                            throw th11;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th12) {
                                                                                                        th = th12;
                                                                                                    }
                                                                                                } catch (java.lang.InterruptedException e) {
                                                                                                    e = e;
                                                                                                    interruptedException = e;
                                                                                                    throw interruptedException;
                                                                                                } catch (java.lang.Throwable th13) {
                                                                                                    th = th13;
                                                                                                    th3 = th;
                                                                                                    try {
                                                                                                        exec.destroy();
                                                                                                        throw th3;
                                                                                                    } catch (java.lang.Exception unused4) {
                                                                                                        throw th3;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str3 = intern;
                                                                                            }
                                                                                            try {
                                                                                                nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                                str4 = str3;
                                                                                                if (nanos > 0) {
                                                                                                    intern = str3;
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e2) {
                                                                                                e = e2;
                                                                                                throw e;
                                                                                            } catch (java.lang.Throwable th14) {
                                                                                                th = th14;
                                                                                                th3 = th;
                                                                                                exec.destroy();
                                                                                                throw th3;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e3) {
                                                                                            interruptedException = e3;
                                                                                            throw interruptedException;
                                                                                        } catch (java.lang.Throwable th15) {
                                                                                            th3 = th15;
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                    }
                                                                                    modifierMetaStateMask = num5;
                                                                                    r13 = obj2;
                                                                                    intern = str2;
                                                                                } catch (java.lang.InterruptedException e4) {
                                                                                    e = e4;
                                                                                } catch (java.lang.Throwable th16) {
                                                                                    th = th16;
                                                                                }
                                                                            } catch (java.lang.Throwable th17) {
                                                                                th = th17;
                                                                                java.lang.Throwable th18 = th;
                                                                                java.lang.Throwable cause5 = th18.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th18;
                                                                            }
                                                                        } catch (java.lang.Throwable th19) {
                                                                            th = th19;
                                                                        }
                                                                    } catch (java.lang.Throwable th20) {
                                                                        th = th20;
                                                                        java.lang.Throwable th21 = th;
                                                                        java.lang.Throwable cause6 = th21.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th21;
                                                                    }
                                                                } catch (java.lang.Throwable th22) {
                                                                    th = th22;
                                                                }
                                                            } catch (java.lang.Throwable th23) {
                                                                th = th23;
                                                            }
                                                        } catch (java.io.IOException unused5) {
                                                            r13 = invoke;
                                                            i12 = i4;
                                                            r38 = intern;
                                                            intern = intern2;
                                                            modifierMetaStateMask = num4;
                                                        } catch (java.lang.Exception unused6) {
                                                        }
                                                    } catch (java.lang.Throwable th24) {
                                                        th = th24;
                                                        th2 = th;
                                                        cause = th2.getCause();
                                                        if (cause == null) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th25) {
                                                    th = th25;
                                                }
                                            } catch (java.lang.Exception unused7) {
                                            }
                                        } catch (java.lang.Exception unused8) {
                                        }
                                    } catch (java.io.IOException unused9) {
                                        r13 = invoke;
                                        i12 = i4;
                                        r38 = intern;
                                        intern = intern2;
                                        modifierMetaStateMask = num4;
                                        i45 = i11;
                                    }
                                } catch (java.io.IOException unused10) {
                                }
                            }
                            objArr = new java.lang.Object[]{new int[1], new int[1], null, r1, new int[1]};
                            java.lang.String str13 = (java.lang.String) java.lang.Class.forName(str4).getField(str2).get(obj2);
                            i5 = i;
                            ((int[]) objArr[0])[0] = i5;
                            ((int[]) objArr[1])[0] = i5 ^ 20;
                            java.lang.Object[] objArr118 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(439964507 | i5)) | 590171437) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1889583719) + (((~(439964507 | (~i5))) | 553913380) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                            num = num5;
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                            if (obj3 == null) {
                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                byte b25 = $$a[54];
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                c((short) 653, b25, (byte) (b25 & 34), objArr119);
                                obj3 = cls42.getMethod((java.lang.String) objArr119[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj3);
                            }
                            ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr118)).intValue();
                            i6 = 1;
                            c = 0;
                            if (((int[]) objArr[i6])[c] != i5) {
                            }
                        } else {
                            r13 = invoke;
                            i12 = i4;
                            r38 = intern;
                            intern = intern2;
                            modifierMetaStateMask = num4;
                            i45 = i11;
                        }
                        i11 = i45 + 1;
                        intern2 = intern;
                        invoke = r13;
                        i4 = i12;
                        num4 = modifierMetaStateMask;
                        split = strArr;
                        length = i44;
                        intern = r38;
                    }
                    i5 = i4;
                    num = num4;
                } else {
                    i5 = i4;
                    num = -1347122530;
                }
                objArr = new java.lang.Object[]{new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                int i46 = ~i5;
                java.lang.Object[] objArr120 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-239821270) | i46)) | 235610257) * (-241)) + 1437854471 + (((~(i46 | (-4211013))) | 554704418) * 241))};
                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                if (obj39 == null) {
                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    byte b26 = $$a[54];
                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                    c((short) 653, b26, (byte) (b26 & 34), objArr121);
                    obj39 = cls43.getMethod((java.lang.String) objArr121[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj39);
                }
                int intValue5 = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr120)).intValue();
                c = 0;
                ((int[]) objArr[4])[0] = intValue5;
                i6 = 1;
                if (((int[]) objArr[i6])[c] != i5) {
                }
            } catch (java.lang.Throwable th26) {
                java.lang.Throwable cause7 = th26.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th26;
            }
            try {
                try {
                    java.lang.Class<?> cls44 = java.lang.Class.forName(intern3);
                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                    b(android.view.KeyEvent.keyCodeFromString("") - 421628889, (-95) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 1356104759 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) android.text.TextUtils.indexOf("", ""), objArr122);
                    cls44.getMethod(((java.lang.String) objArr122[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                    try {
                        java.lang.Class<?> cls45 = java.lang.Class.forName(intern3);
                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                        b((-421628890) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-96) - android.graphics.Color.alpha(0), (byte) android.text.TextUtils.getOffsetAfter("", 0), 1356104759 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr123);
                        cls45.getMethod(((java.lang.String) objArr123[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                        try {
                            try {
                                exec.destroy();
                            } catch (java.lang.Exception unused11) {
                            }
                            try {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 44, 1506 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                byte[] bArr5 = $$a;
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                c((short) 650, bArr5[2], bArr5[18], objArr124);
                                sb2.append(cls46.getField((java.lang.String) objArr124[0]).get(newInstance).toString());
                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 44, 1555 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                c((short) 650, bArr5[2], bArr5[18], objArr125);
                                sb2.append(cls47.getField((java.lang.String) objArr125[0]).get(newInstance2).toString());
                                java.lang.String obj40 = sb2.toString();
                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                a(false, "\u0000", 49 - android.widget.ExpandableListView.getPackedPositionType(0L), 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr126);
                                java.lang.String[] split2 = obj40.split(((java.lang.String) objArr126[0]).intern());
                                length2 = split2.length;
                                i13 = 0;
                                while (i13 < length2) {
                                    java.lang.String str14 = split2[i13];
                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                    b((-421628860) - (android.os.Process.myPid() >> 22), android.text.TextUtils.getTrimmedLength("") - 81, (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1356104765 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr127);
                                    if (!str14.startsWith(((java.lang.String) objArr127[0]).intern())) {
                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                        b((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 421628843, android.text.TextUtils.getOffsetAfter("", 0) - 80, (byte) android.graphics.Color.green(0), 1356104765 - android.text.TextUtils.getOffsetAfter("", 0), (short) android.text.TextUtils.getOffsetBefore("", 0), objArr128);
                                        if (str14.startsWith(((java.lang.String) objArr128[0]).intern())) {
                                            continue;
                                        } else {
                                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                                            a(true, "\u0010ￚ\u0005\u0007\u0001\u000b\u0003\u0001", 136 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1, android.view.KeyEvent.keyCodeFromString("") + 8, objArr129);
                                            if (str14.startsWith(((java.lang.String) objArr129[0]).intern())) {
                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                a(false, "\u0000", 97 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.blue(0) + 1, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr130);
                                                java.lang.String[] split3 = str14.split(((java.lang.String) objArr130[0]).intern());
                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str)) {
                                                    objArr = new java.lang.Object[]{new int[1], new int[1], null, str13, new int[1]};
                                                    java.lang.String str132 = (java.lang.String) java.lang.Class.forName(str4).getField(str2).get(obj2);
                                                    i5 = i;
                                                    ((int[]) objArr[0])[0] = i5;
                                                    ((int[]) objArr[1])[0] = i5 ^ 20;
                                                    java.lang.Object[] objArr1182 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(439964507 | i5)) | 590171437) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1889583719) + (((~(439964507 | (~i5))) | 553913380) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                                    num = num5;
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                                    if (obj3 == null) {
                                                    }
                                                    ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr1182)).intValue();
                                                    i6 = 1;
                                                    c = 0;
                                                    if (((int[]) objArr[i6])[c] != i5) {
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i13++;
                                    str2 = str2;
                                    obj2 = obj2;
                                    num5 = num5;
                                }
                            } catch (java.lang.Exception unused12) {
                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 421628885, android.graphics.Color.blue(0) - 73, (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1356104723, (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr131);
                                throw new java.io.IOException(((java.lang.String) objArr131[0]).intern());
                            }
                        } catch (java.io.IOException unused13) {
                            i12 = i;
                            r38 = str4;
                            modifierMetaStateMask = num5;
                            r13 = obj2;
                            intern = str2;
                            i11 = i45 + 1;
                            intern2 = intern;
                            invoke = r13;
                            i4 = i12;
                            num4 = modifierMetaStateMask;
                            split = strArr;
                            length = i44;
                            intern = r38;
                        }
                        i12 = i;
                        r38 = str4;
                        modifierMetaStateMask = num5;
                        r13 = obj2;
                        intern = str2;
                        i11 = i45 + 1;
                        intern2 = intern;
                        invoke = r13;
                        i4 = i12;
                        num4 = modifierMetaStateMask;
                        split = strArr;
                        length = i44;
                        intern = r38;
                    } catch (java.lang.Throwable th27) {
                        java.lang.Throwable cause8 = th27.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th27;
                    }
                } catch (java.lang.InterruptedException e5) {
                    e = e5;
                    throw e;
                }
            } catch (java.lang.Throwable th28) {
                java.lang.Throwable cause9 = th28.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th28;
            }
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 44, 1506 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
            byte[] bArr52 = $$a;
            java.lang.Object[] objArr1242 = new java.lang.Object[1];
            c((short) 650, bArr52[2], bArr52[18], objArr1242);
            sb22.append(cls462.getField((java.lang.String) objArr1242[0]).get(newInstance).toString());
            java.lang.Class cls472 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 44, 1555 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
            java.lang.Object[] objArr1252 = new java.lang.Object[1];
            c((short) 650, bArr52[2], bArr52[18], objArr1252);
            sb22.append(cls472.getField((java.lang.String) objArr1252[0]).get(newInstance2).toString());
            java.lang.String obj402 = sb22.toString();
            java.lang.Object[] objArr1262 = new java.lang.Object[1];
            a(false, "\u0000", 49 - android.widget.ExpandableListView.getPackedPositionType(0L), 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr1262);
            java.lang.String[] split22 = obj402.split(((java.lang.String) objArr1262[0]).intern());
            length2 = split22.length;
            i13 = 0;
            while (i13 < length2) {
            }
            i12 = i;
            r38 = str4;
            modifierMetaStateMask = num5;
            r13 = obj2;
            intern = str2;
            i11 = i45 + 1;
            intern2 = intern;
            invoke = r13;
            i4 = i12;
            num4 = modifierMetaStateMask;
            split = strArr;
            length = i44;
            intern = r38;
        } catch (java.lang.Throwable th29) {
            java.lang.Throwable cause10 = th29.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th29;
        }
    }
}
