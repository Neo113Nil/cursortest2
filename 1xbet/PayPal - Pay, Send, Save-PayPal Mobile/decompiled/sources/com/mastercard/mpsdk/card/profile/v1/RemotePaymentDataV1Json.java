package com.mastercard.mpsdk.card.profile.v1;

/* loaded from: classes4.dex */
public class RemotePaymentDataV1Json {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static char RecordsJson;
    private static int getProfileVersion;
    private static boolean valueOf;
    private static long values;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "aip")
    public java.lang.String aip;

    @com.payair.hce.setSelectionFromTop(valueOf = "applicationExpiryDate")
    public java.lang.String applicationExpiryDate;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    public java.lang.String ciacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    public java.lang.String cvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    public java.lang.String issuerApplicationData;

    @com.payair.hce.setSelectionFromTop(valueOf = "pan")
    public java.lang.String pan;

    @com.payair.hce.setSelectionFromTop(valueOf = "panSequenceNumber")
    public java.lang.String panSequenceNumber;

    @com.payair.hce.setSelectionFromTop(valueOf = "track2Equivalent")
    public java.lang.String track2Equivalent;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = s + 65;
        int i4 = 35 - s2;
        int i5 = 40 - (b * 2);
        char[] cArr = new char[i4];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            i2 = 0;
            i5++;
            i3 = (i3 + i6) - 2;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i3 = (i3 + i6) - 2;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            cArr[i] = (char) i3;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 4 - (b * 4);
        ?? r7 = b2 + 102;
        int i3 = b3 * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = -1;
        if (bArr == null) {
            byte b4 = r7;
            i = i2;
            i2 += b4;
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b4 = bArr[i];
            i2 += b4;
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 0 - i3) {
            }
        } else {
            i = i2;
            i2 = r7;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 0 - i3) {
            }
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 72, 1179 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3442, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3832))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 27, android.text.TextUtils.indexOf("", "", 0) + 1864, (char) (41775 - android.graphics.Color.alpha(0)));
                    byte b = $$d[3];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((byte) 0, b, (byte) (b - 3), objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, android.widget.ExpandableListView.getPackedPositionType(0L) + 3133, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((byte) 0, length4, (byte) (length4 - 4), objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (values ^ 1263759066225628708L)) ^ ((int) (getProfileVersion ^ 1263759066225628708L))) ^ ((char) (RecordsJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $10 = ($11 + 109) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        java.lang.String str3 = str2;
        int i3 = $11;
        $10 = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            int i4 = i3 + 87;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr4 = AlternateContactlessPaymentDataJson;
        if (cArr4 != null) {
            int i6 = $11 + 13;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        long j = 0;
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 45, 286 - android.graphics.Color.blue(0), (char) (46338 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (valueOf) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr4[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1)) + 42, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1629, (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((byte) 0, (byte) 16, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!DigitizedCardProfile) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            $11 = ($10 + 119) % 128;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr4[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr3.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1628, (char) android.text.TextUtils.indexOf("", ""));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) 0, (byte) 16, (byte) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = new char[]{10945, 10889, 10887, 10935, 10885, 10884, 10913, 10917, 10923, 10894, 10934, 10881, 10932, 10931, 10933, 10895, 10958, 10930, 10904, 10882, 10891, 10886, 10929, 10965, 10963, 10880, 10892, 10941, 10943, 10992, 10893, 10888, 10890, 10916, 10986, 10966, 10970, 10907};
        writeReplace = -143185392;
        DigitizedCardProfile = true;
        valueOf = true;
        values = 1263759066225628708L;
        getProfileVersion = -804334044;
        RecordsJson = (char) 20470;
    }

    static void init$1() {
        $$d = new byte[]{107, 115, 84, 3};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{73, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 36;
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x12f9, code lost:
    
        r13.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x1773 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x1774  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x1cc0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1cc1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x143d A[Catch: IOException -> 0x15d8, all -> 0x168f, TryCatch #19 {IOException -> 0x15d8, blocks: (B:341:0x1188, B:357:0x1386, B:358:0x1389, B:359:0x141b, B:361:0x143d, B:363:0x1473, B:365:0x1494, B:367:0x14b5, B:369:0x14ea), top: B:340:0x1188 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1563 A[Catch: all -> 0x0a94, TryCatch #28 {all -> 0x0a94, blocks: (B:5:0x00b0, B:7:0x00bc, B:8:0x0101, B:12:0x019d, B:14:0x01d2, B:15:0x021e, B:22:0x0319, B:24:0x0325, B:25:0x036e, B:29:0x041a, B:31:0x0452, B:32:0x04a6, B:38:0x0587, B:40:0x0595, B:41:0x05e0, B:45:0x06a0, B:47:0x06e3, B:48:0x0731, B:54:0x083b, B:56:0x0847, B:57:0x0892, B:61:0x0930, B:63:0x0974, B:64:0x09c0, B:68:0x09ed, B:70:0x0a2f, B:71:0x0a7f, B:75:0x075f, B:77:0x07a1, B:78:0x07f1, B:81:0x04d5, B:83:0x050a, B:84:0x0550, B:87:0x024b, B:89:0x028c, B:90:0x02d8, B:103:0x0b74, B:105:0x0b93, B:106:0x0be7, B:112:0x0cb5, B:114:0x0ce6, B:115:0x0d2f, B:121:0x178b, B:123:0x17c1, B:124:0x180b, B:148:0x1a00, B:150:0x1a1e, B:151:0x1a6c, B:157:0x1b2a, B:159:0x1b69, B:160:0x1bb5, B:167:0x1ce8, B:169:0x1cf6, B:170:0x1d3e, B:174:0x1de1, B:176:0x1e20, B:177:0x1e71, B:183:0x1f69, B:185:0x1f75, B:186:0x1fbf, B:190:0x2084, B:192:0x20c9, B:193:0x2117, B:199:0x220d, B:201:0x221b, B:202:0x2266, B:206:0x2316, B:208:0x2354, B:209:0x239e, B:215:0x24a1, B:217:0x24ad, B:218:0x24f7, B:222:0x2591, B:224:0x25db, B:225:0x2626, B:229:0x2653, B:231:0x2696, B:232:0x26e1, B:236:0x23cc, B:238:0x2408, B:239:0x2455, B:242:0x2145, B:244:0x2186, B:245:0x21d6, B:248:0x1e9f, B:250:0x1ede, B:251:0x1f28, B:260:0x1c04, B:262:0x1c59, B:263:0x1ca3, B:279:0x0d84, B:281:0x0da2, B:282:0x0df4, B:288:0x0ee3, B:290:0x0f37, B:291:0x0f7f, B:374:0x152b, B:376:0x1563, B:377:0x15b4, B:506:0x16ca, B:508:0x170c, B:509:0x1755), top: B:2:0x0095 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] valueOf(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        int i4;
        java.lang.Integer num4;
        char c;
        java.lang.Object[] objArr;
        int i5;
        int i6;
        int i7;
        java.lang.Object[] objArr2;
        int i8;
        java.lang.Object[] objArr3;
        char c2;
        java.lang.Object[] objArr4;
        char c3;
        java.lang.Object[] objArr5;
        char c4;
        java.lang.Object obj;
        java.lang.String[] split;
        int length;
        int i9;
        java.lang.String str;
        java.lang.String[] strArr;
        int i10;
        int i11;
        java.lang.String intern;
        java.lang.Runtime runtime;
        java.lang.Object[] objArr6;
        java.lang.Process exec;
        java.lang.Object newInstance;
        java.lang.Object newInstance2;
        java.lang.Integer num5;
        java.lang.Object obj2;
        java.lang.Throwable th;
        long j;
        int length2;
        int i12;
        java.lang.Object obj3;
        java.lang.String str2;
        java.lang.Object[] objArr7;
        char c5;
        java.lang.Integer num6;
        java.lang.Object[] objArr8;
        char c6;
        java.lang.Object[] objArr9;
        char c7;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a("犐訾灺ꃇ쥘\ud9fe\ue9f1증뛵欬賹跸奟\ue301ᅎ①圥绨\u0a84䲅몈竨ꘫ\ue542\ueed6\udf81庝ႇ㈖갱M⡹\uf001༈", "䭩懙\u2d2bﹷ", android.view.View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr10);
        java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a("⋦齞⪺抎셶⋍睘", "嬱曝徐헊", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1872306853, "\u0000\u0000\u0000\u0000", (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
        java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(127 - android.view.View.combineMeasuredStates(0, 0), null, null, "\u008d\u008e\u0084\u0094 ¢\u0091\u0082\u008a\u008e\u009b\u0091\u008e\u0096\u008e¡", objArr12);
        java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Integer num7 = 269015277;
        java.lang.Integer num8 = -604620973;
        try {
            if (context == null) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                b((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr13);
                java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 3161, (char) (android.text.TextUtils.indexOf("", "") + 33099));
                    int i13 = $$b;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c((short) (i13 - 1), (byte) (-$$a[52]), (byte) (i13 - 2), objArr15);
                    obj4 = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj4);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr14)).longValue();
                long j2 = ~longValue;
                long j3 = i;
                long j4 = ~(longValue | j3);
                long j5 = ((-195) * longValue) + 229631507087L + (((~(j2 | (-587292857))) | j4) * (-196)) + ((longValue | (-587292857)) * 392) + ((j4 | (~(587292856 | j2))) * 196) + 1494763595;
                int i14 = ~i;
                if (((((int) (j5 >> 32)) & (((((~((-1037604839) | i)) | (-399621573)) * (-964)) - 2022196754) + (((~((-1037604839) | i14)) | 671613474) * (-964)))) | (((int) j5) & ((((~(i14 | (-1065))) * (-783)) - 238509050) + (((~((-440437993) | i14)) | 996788417) * 783)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(760907310 | i14)) | (-1029611135)) * (-160)) - 1984973720) + (((~((-269228635) | i14)) | 760907310) * 160))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                        byte[] bArr = $$a;
                        byte b = bArr[41];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c(b, (byte) (-bArr[52]), b, objArr17);
                        obj5 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    c5 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr16)).intValue();
                } else {
                    objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-100868625) | i)) | (~(929267320 | i))) * 69) + 1361015552) + ((((~((-641957457) | i)) | 541088832) | (~(388178488 | i))) * (-69))) - 1650455864)};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj6 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 2714 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[41];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c(b2, (byte) (-bArr2[52]), b2, objArr19);
                        obj6 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                    }
                    c5 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
                }
                if (((int[]) objArr7[1])[c5] != i) {
                    return objArr7;
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                a("\uf148ँ梷ף\ue2f0ಚ裬ۛ氖ﶡᴻἶ\ue170숩㑾缼ᖮ考辄\udbdc", "粗뛳\ue51c\ue1d8", android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr20);
                java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                if (obj7 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.myTid() >> 22), 3161 - android.graphics.Color.blue(0), (char) (33099 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    int i15 = $$b;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    c((short) (i15 - 1), (byte) (-$$a[52]), (byte) (i15 - 2), objArr22);
                    obj7 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj7);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr21)).longValue();
                long j6 = ~longValue2;
                long j7 = (((-590) * longValue2) - 195119890128L) + ((~(longValue2 | 329594408)) * (-1182)) + (((~(329594408 | j6 | (~j3))) | (~(longValue2 | (-329594409)))) * (-591)) + ((329594408 | j3 | j6) * 591) + 1237065147;
                if (((((int) (j7 >> 32)) & (((~((-94388737) | i14)) * 433) + 679072916 + (((~(804843045 | i)) | 2052897839) * (-433)) + (((~(2052897839 | i)) | 710454309) * 433))) | (((int) j7) & ((((((~((-1708587727) | i)) | 1146530438) * 576) + 1771465493) + (((~((-562057289) | i14)) | 2622721) * 576)) - 1023431296))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((2630153 | i14) * 1324) + 1979941080) + (((~(472675947 | i)) | (~(557459997 | i))) * (-1324))) - 137160412)};
                    num6 = -1347122530;
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj8 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[41];
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        c(b3, (byte) (-bArr3[52]), b3, objArr24);
                        obj8 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                    }
                    c6 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr23)).intValue();
                } else {
                    num6 = -1347122530;
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((-573589) | i14) * (-490)) - 1106703032) + (((~((-403300309) | i)) | 402726720) * 490) + 2088183182)};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj9 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) android.view.View.combineMeasuredStates(0, 0));
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[41];
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        c(b4, (byte) (-bArr4[52]), b4, objArr26);
                        obj9 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                    }
                    c6 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr25)).intValue();
                }
                if (((int[]) objArr8[1])[c6] != i) {
                    return objArr8;
                }
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, null, "\u008e\u0086\u008e\u008d\u0097\u0085\u008b\u0096\u0081\u008d\u0095\u008c\u0094\u008d\u008a\u008e\u0091\u0093\u008c\u0092\u0082\u0091\u0090\u008c\u008f\u0081\u008e\u0086\u008e\u008d\u0081\u008e\u0086\u008e\u008d\u0081", objArr27);
                java.lang.Object[] objArr28 = {((java.lang.String) objArr27[c6]).intern()};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                if (obj10 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 37, (android.os.Process.myPid() >> 22) + 3161, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 33100));
                    short s = (short) ($$b + 5);
                    byte[] bArr5 = $$a;
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    c(s, bArr5[14], bArr5[49], objArr29);
                    obj10 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, obj10);
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr28)).longValue();
                long j8 = ~longValue3;
                long j9 = (367 * longValue3) + 132428627549L + ((longValue3 | 360840947) * (-366)) + (((~(j8 | j3)) | 360840947) * (-366)) + (((~((-360840948) | longValue3)) | (~(360840947 | j8 | j3))) * 366) + 634593956;
                int i16 = (int) (j9 >> 32);
                int i17 = ~(116675476 | i14);
                if (((((int) j9) & (((((((~(1553901886 | i14)) | 39867008) | (~((-116675477) | i14))) | (~((-1477093419) | i))) * (-84)) - 1905160647) + (((~((-116675477) | i)) | (-1553901887) | i17) * (-84)) + ((i17 | 1477093418) * 84))) | ((((((~(477326932 | i14)) | (~(1914553343 | i))) * com.visa.cbp.getCertUsage.getODAData) - 930558405) + (((~(477326932 | i)) | (~(1914553343 | i14))) * com.visa.cbp.getCertUsage.getODAData)) & i16)) != 0) {
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-927643434) | i14)) | 826283552 | (~(102492511 | i14))) * 464) + 412197480 + (((-101359882) | i) * (-464)) + (((~(102492511 | i)) | 826283552) * 464))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    if (obj11 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, android.view.View.MeasureSpec.getMode(0) + 2713, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                        byte[] bArr6 = $$a;
                        byte b5 = bArr6[41];
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        c(b5, (byte) (-bArr6[52]), b5, objArr31);
                        obj11 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj11);
                    }
                    c7 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr30)).intValue();
                } else {
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-328705) | i14)) | (~((-4200457) | i14))) * (-184)) + 463683272 + (((~((-513132097) | i14)) | 512803392 | (~((-517003849) | i14))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 699909056)};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    if (obj12 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        byte[] bArr7 = $$a;
                        byte b6 = bArr7[41];
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c(b6, (byte) (-bArr7[52]), b6, objArr33);
                        obj12 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj12);
                    }
                    c7 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr32)).intValue();
                }
                if (((int[]) objArr9[1])[c7] != i) {
                    return objArr9;
                }
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                a("ꪆ\uf0c4⎅ㅋ⢂臣錆h㌢\udedf嗮锟\ue4e2웲⧼㹚腠꿈긿ᅛ헗䤹㣏磠栣\uf796䱴萡㫥㥕柠\uf8fa\ueb7c㽽餃ퟻ\ue733聆㕬ᎅ㡱쬒", "י㪗⦳箑", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", (char) (37161 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr34);
                java.lang.Object[] objArr35 = {((java.lang.String) objArr34[0]).intern()};
                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                if (obj13 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 3162 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (33099 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                    short s2 = (short) ($$b + 5);
                    byte[] bArr8 = $$a;
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    c(s2, bArr8[14], bArr8[49], objArr36);
                    obj13 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, obj13);
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr35)).longValue();
                long j10 = ~longValue4;
                java.lang.Integer num9 = num6;
                long j11 = ((-282) * longValue4) + 117075459940L + (((~(longValue4 | (-412237536))) | (~(j3 | (-412237536)))) * (-283)) + ((~(412237535 | j10)) * 283) + ((~((-412237536) | j10 | j3)) * 283) + 583197368;
                if (((((int) (j11 >> 32)) & (((((~((-289794519) | i)) | 1428259330) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 821040486) + (((~((-289794519) | i14)) | 1428259330) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j11) & ((((~(390449066 | i)) | 1827675476) * (-668)) + 2025338097 + (((~(1827675476 | i)) | 390449066) * 1336) + ((2146820094 | i) * 668)))) != 0) {
                    java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                    java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~((-10493977) | i14)) * 52) + 1606369264 + (((~(1046398179 | i14)) | (~(16262234 | i14)) | (-1056892156)) * (-52)) + (((~(i14 | (-1046398180))) | 5768258) * 52))};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                    if (obj14 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte[] bArr9 = $$a;
                        byte b7 = bArr9[41];
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        c(b7, (byte) (-bArr9[52]), b7, objArr39);
                        obj14 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, obj14);
                    }
                    ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr38)).intValue();
                    return objArr37;
                }
                java.lang.Object[] objArr40 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-726398219) | i14)) | 303737726) * (-235)) + 957835786 + (((~((-726398219) | i)) | 303737726) * (-470)) + (((~((-692147201) | i)) | 269486708) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                if (obj15 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2713 - (android.os.Process.myPid() >> 22), (char) android.text.TextUtils.indexOf("", "", 0));
                    byte[] bArr10 = $$a;
                    byte b8 = bArr10[41];
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    c(b8, (byte) (-bArr10[52]), b8, objArr42);
                    obj15 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, obj15);
                }
                ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr41)).intValue();
                return objArr40;
            }
            java.lang.Integer num10 = -1347122530;
            java.lang.Integer num11 = 16;
            int i18 = i;
            try {
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                b(127 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), null, null, "\u0086\u0093\u0084\u0086\u008a\u008c\u0098\u0091\u0086\u008a\u0084\u0086\u008a\u008c\u008f\u0091\u008d\u0095\u008c\u0094\u008d\u008a\u008e", objArr43);
                java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr43[0]).intern());
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                a("䡝⼒\uea5b\uf291\ued40\ue2f8뽗蕦䜊⫡돋ᣦ\uf89e⛮", "ﭺ̲谳ꧤ", android.text.TextUtils.getOffsetAfter("", 0), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 58509), objArr44);
                java.lang.String str3 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr44[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                b(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), null, null, "\u0086\u0093\u0084\u0086\u008a\u008c\u0098\u0091\u0086\u008a\u0084\u0086\u008a\u008c\u008f\u0091\u008d\u0095\u008c\u0094\u008d\u008a\u008e", objArr45);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr45[0]).intern());
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u008c\u008b\u008a\u0089\u008a\u008c\u0095\u0086\u008e\u008f\u0095\u009b\u009a\u009a\u0099\u0086\u0084\u0082", objArr46);
                java.lang.Object invoke = cls14.getMethod(((java.lang.String) objArr46[0]).intern(), null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str3);
                if (indexOf > 0) {
                    java.lang.String str4 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    if (str4.length() >= 16) {
                        int i19 = 0;
                        while (i19 <= str4.length() - 16) {
                            java.lang.String str5 = str4;
                            java.lang.Object[] objArr47 = {str4.substring(i19, i19 + 16), 931995};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj16 == null) {
                                num3 = num7;
                                num2 = num8;
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 28, android.text.TextUtils.getOffsetAfter("", 0) + 2594, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                byte b9 = $$a[41];
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c((short) 653, b9, (byte) (b9 | 34), objArr48);
                                obj16 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                            } else {
                                num2 = num8;
                                num3 = num7;
                            }
                            int i20 = indexOf;
                            long j12 = ~((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr47)).longValue();
                            long j13 = i18;
                            long j14 = j13 | 647604548;
                            int i21 = i19;
                            long j15 = ((r10 * (-667)) - 864552071580L) + (((~j14) | j12) * (-668)) + (((~(j13 | j12)) | 647604548) * 1336) + ((j12 | j14) * 668) + 609495976;
                            i4 = i;
                            int i22 = ~i4;
                            if (((((int) j15) & ((((-1373660167) | i4) * (-50)) + 1777554175 + (((~(1407841703 | i4)) | (~((-1344275461) | i22))) * 50) + (((~((-1373660167) | i22)) | (~(63566243 | i22)) | 1344275460) * 50))) | (((int) (j15 >> 32)) & ((((((~((-683505259) | i4)) | 682382912) * 576) - 1771464918) + (((~((-1122347) | i22)) | 71338240) * 576)) - 2084433920))) == -725904754) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str6 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                ((int[]) objArr[0])[0] = i4;
                                ((int[]) objArr[1])[0] = i4 ^ 20;
                                java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((-143790657) | i22) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1501245176 + (((~(862743988 | i22)) | (-982933345)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj17 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) android.graphics.Color.red(0));
                                    byte[] bArr11 = $$a;
                                    byte b10 = bArr11[41];
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    c(b10, (byte) (-bArr11[52]), b10, objArr50);
                                    obj17 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr49)).intValue();
                                num = -1347122530;
                                c = 0;
                                num4 = 16;
                                if (((int[]) objArr[1])[c] != i4) {
                                    return objArr;
                                }
                                int[] iArr = new int[1];
                                int[] iArr2 = new int[1];
                                iArr[c] = i4;
                                iArr2[c] = i4;
                                java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[1]};
                                int i23 = ~i4;
                                java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-795432047) | i4)) | (-234703899)) * (-964)) + 406190356 + (((~((-795432047) | i23)) | 570429540) * (-964)))};
                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj18 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.red(0));
                                    byte[] bArr12 = $$a;
                                    byte b11 = bArr12[41];
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    c(b11, (byte) (-bArr12[52]), b11, objArr53);
                                    obj18 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj18);
                                }
                                ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr52)).intValue();
                                if (((int[]) objArr51[1])[0] != i4) {
                                    return objArr51;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, "¦\u008f\u0095\u009b\u008c\u009a\u0097\u0084\u008f\u0095\u0096\u0084\u008d", objArr54);
                                    try {
                                        java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        b(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0086\u0093\u0084\u0086\u008a\u008c\u0098\u0091\u0086\u008a\u0084\u0086\u008a\u008c\u008f\u0091\u008d\u0095\u008c\u0094\u008d\u008a\u008e", objArr56);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr56[0]).intern());
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        a("䱊䆙䭈\uf69a잳㠉\ue9b9긯泣饧ॲ张監旱ܽᩪ", "\ue0a5ꁥ噯럲", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, "\u0000\u0000\u0000\u0000", (char) (62038 - android.graphics.Color.alpha(0)), objArr57);
                                        java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr57[0]).intern(), java.lang.String.class).invoke(context, objArr55);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a("觀橒凉\ueb75\udbd3娻尷ሻ\uf25d\ue930䌦᷼ᣄ沇⮦緀섁쥖嗢⧺䂆㨌ࢎ\uf062ꦀ伡썆馬ⰳᥚ缮贗ࣤꚄ\udb10섻좿", "\u1aec䉅\uda9a裛", ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 1706932966, "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr58);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr58[0]).intern());
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            b(127 - android.graphics.Color.alpha(0), null, null, "\u0085\u008a\u0095\u0090\u008d\u0099\u0084\u0096\u0095\u0086\u008f\u0099\u0086\u0084\u0082", objArr59);
                                            java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr59[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    a("䬄㑇퇳꽒车癷⺰ꅋ⓼㸡駶\ud97e⨲즏偺倶蟢죓뫫頧㱔ꏓ쓘\ue549귦塗\uea07趄\udccb", "\uf10b\ueb56瘸庹", 954947313 - android.view.KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (char) (47478 - android.text.TextUtils.getOffsetAfter("", 0)), objArr60);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr60[0]).intern());
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    a("䡝⼒\uea5b\uf291\ued40\ue2f8뽗蕦䜊⫡돋ᣦ\uf89e⛮", "ﭺ̲谳ꧤ", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", (char) (58508 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr61);
                                                    java.lang.String str7 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr61[0]).intern(), null).invoke(next, null);
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a("觀橒凉\ueb75\udbd3娻尷ሻ\uf25d\ue930䌦᷼ᣄ沇⮦緀섁쥖嗢⧺䂆㨌ࢎ\uf062ꦀ伡썆馬ⰳᥚ缮贗ࣤꚄ\udb10섻좿", "\u1aec䉅\uda9a裛", (-1706932966) - (android.view.ViewConfiguration.getTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr62);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr62[0]).intern());
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    a("몚碼갣剓﬩꭪ᤄ銫ᙬ喲\ued76盭鏽ꥎ؋꒠风", "阂ⷋ퐈矼", 137218966 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 64724), objArr63);
                                                    if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr63[0]).intern(), java.lang.String.class).invoke(invoke2, str7)).booleanValue()) {
                                                        if (str7.length() >= 20) {
                                                            int i24 = 0;
                                                            for (int i25 = 20; i24 <= str7.length() - i25; i25 = 20) {
                                                                java.lang.Object[] objArr64 = {str7.substring(i24, i24 + 20), 931995};
                                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                if (obj19 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.KeyEvent.getDeadChar(0, 0), 2594 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                    byte b12 = $$a[41];
                                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                    c((short) 653, b12, (byte) (b12 | 34), objArr65);
                                                                    obj19 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                                }
                                                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr64)).longValue();
                                                                long j16 = i4;
                                                                long j17 = ~j16;
                                                                long j18 = ~longValue5;
                                                                long j19 = j18 | 350823734;
                                                                long j20 = j18 | j17;
                                                                java.util.Iterator it2 = it;
                                                                java.lang.String str8 = str7;
                                                                java.lang.Object obj20 = invoke2;
                                                                i5 = i23;
                                                                long j21 = ((193 * longValue5) - 67708980855L) + ((j17 | (~(longValue5 | 350823734))) * (-192)) + (((~j20) | (~j19)) * (-384)) + (((~(j19 | j16)) | (~((-350823735) | j20)) | (((longValue5 | (-350823735)) | j16) ^ (-1))) * 192) + 1607924259;
                                                                i6 = i;
                                                                if (((((int) (j21 >> 32)) & ((((((~(463725669 | i6)) | 1615600144) * 1504) - 1320242614) + ((~(2079325813 | i6)) * (-1504))) - 448625312)) | (((int) j21) & ((((~((-696198279) | i6)) | 5637254) * 104) + 2005432269 + ((~(i5 | (-1442863665))) * (-104)) + (((-2133424689) | i6) * 104)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 70}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((((~((-573001162) | i6)) | (-994009088)) * (-502)) - 934484444) + ((~(i5 | (-536874305))) * (-502)) + (((~((-457134784) | i6)) | (-573001162)) * 502))};
                                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                                                    if (obj21 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.KeyEvent.keyCodeFromString(""));
                                                                        byte[] bArr13 = $$a;
                                                                        byte b13 = bArr13[41];
                                                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                        c(b13, (byte) (-bArr13[52]), b13, objArr67);
                                                                        obj21 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj21);
                                                                    }
                                                                    c4 = 0;
                                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr66)).intValue();
                                                                    if (((int[]) objArr5[1])[c4] == i6) {
                                                                        return objArr5;
                                                                    }
                                                                    i7 = 0;
                                                                } else {
                                                                    i24++;
                                                                    it = it2;
                                                                    i4 = i6;
                                                                    str7 = str8;
                                                                    i23 = i5;
                                                                    invoke2 = obj20;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    it = it;
                                                    i4 = i4;
                                                    i23 = i23;
                                                    invoke2 = invoke2;
                                                }
                                            }
                                        }
                                        i5 = i23;
                                        i6 = i4;
                                        objArr5 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i5 | (-93736077))) | (~(i5 | (-936399869)))) * (-867)) + 804801824 + (((~((-93736077) | i6)) | 93339788 | (~((-936399869) | i6))) * (-1734)) + (((~(i5 | (-93339789))) | (~((-396289) | i6)) | (~((-843060081) | i6))) * 867))};
                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                        if (obj22 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myTid() >> 22) + 2713, (char) android.graphics.Color.alpha(0));
                                            byte[] bArr14 = $$a;
                                            byte b14 = bArr14[41];
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            c(b14, (byte) (-bArr14[52]), b14, objArr69);
                                            obj22 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj22);
                                        }
                                        c4 = 0;
                                        ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr68)).intValue();
                                        if (((int[]) objArr5[1])[c4] == i6) {
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i5 = i23;
                                    i6 = i4;
                                    i7 = 0;
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                b(127 - android.graphics.drawable.Drawable.resolveOpacity(i7, i7), null, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr70);
                                java.lang.Object[] objArr71 = {((java.lang.String) objArr70[i7]).intern()};
                                java.lang.Integer num12 = num2;
                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                if (obj23 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3160, (char) (android.graphics.Color.green(0) + 33099));
                                    int i26 = $$b;
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    c((short) (i26 - 1), (byte) (-$$a[52]), (byte) (i26 - 2), objArr72);
                                    obj23 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, obj23);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr71)).longValue();
                                long j22 = i6;
                                long j23 = ~j22;
                                long j24 = ~((~longValue6) | j22);
                                long j25 = (((-574) * longValue6) - 82695620350L) + (((~(j23 | (-144069026))) | j24) * 1150) + (((~(longValue6 | j23)) | j24) * (-575)) + (((~((-144069026) | j22)) | (~(144069025 | j23))) * 575) + 763401713;
                                int i27 = (~(1128051629 | i6)) | (-1732048816);
                                if (((((int) j25) & ((((~(i5 | (-5324802))) * (-783)) - 623212949) + (((~(i5 | 1501839308)) | (-1355901578)) * 783))) | (((int) (j25 >> 32)) & ((i27 * 992) + 1537498186 + ((i27 | (~(i5 | (-1125692070)))) * (-496)) + (((-1729689256) | i6) * 496)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((~(i5 | (-22316801))) * 433) + 821661198 + (((~((-906631416) | i6)) | (-123504530)) * (-433)) + (((~((-123504530) | i6)) | (-928948216)) * 433))};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj24 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                        byte[] bArr15 = $$a;
                                        byte b15 = bArr15[41];
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        c(b15, (byte) (-bArr15[52]), b15, objArr74);
                                        obj24 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj24);
                                    }
                                    i8 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr73)).intValue();
                                } else {
                                    objArr2 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-335632385) | i6)) * 623) - 1952614264) + ((i5 | 675545088) * (-623)) + (((~((-345111621) | i6)) | 335632384 | (~(685024324 | i6))) * 623))};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj25 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        byte[] bArr16 = $$a;
                                        byte b16 = bArr16[41];
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        c(b16, (byte) (-bArr16[52]), b16, objArr76);
                                        obj25 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj25);
                                    }
                                    i8 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr75)).intValue();
                                }
                                if (((int[]) objArr2[1])[i8] != i6) {
                                    return objArr2;
                                }
                                int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                                char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(i8, i8);
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                a("\uf148ँ梷ף\ue2f0ಚ裬ۛ氖ﶡᴻἶ\ue170숩㑾缼ᖮ考辄\udbdc", "粗뛳\ue51c\ue1d8", scrollBarSize >> 8, "\u0000\u0000\u0000\u0000", resolveOpacity, objArr77);
                                java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern()};
                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                if (obj26 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, 3161 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (33099 - android.graphics.Color.alpha(0)));
                                    int i28 = $$b;
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    c((short) (i28 - 1), (byte) (-$$a[52]), (byte) (i28 - 2), objArr79);
                                    obj26 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, obj26);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr78)).longValue();
                                long j26 = ~longValue7;
                                long j27 = ((-493) * longValue7) + 19283882805L + ((j26 | 38957339) * (-988)) + ((longValue7 | (-38957340) | j23) * 494) + (((~(longValue7 | 38957339)) | (~(j23 | longValue7)) | (~(j26 | (-38957340)))) * 494) + 868513399;
                                if (((((int) j27) & ((((~(i5 | 1576604860)) | (-1577041855) | (~(i5 | 139378450))) * 464) + 210080133 + (((-436995) | i6) * (-464)) + (((~(139378450 | i6)) | (-1577041855)) * 464))) | (((int) (j27 >> 32)) & ((((557360495 | i6) * (-50)) - 1803142702) + (((~((-540057644) | i6)) | (~(i5 | (-339808273)))) * 50) + (((~(i5 | 557360495)) | (~(i5 | (-879865916))) | 339808272) * 50)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(i5 | 71204769)) | 958931175) * (-328)) + 588378464 + ((958931175 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-71204770) | i6)) | 2629793 | (~(i5 | 1027506151))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj27 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        byte[] bArr17 = $$a;
                                        byte b17 = bArr17[41];
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        c(b17, (byte) (-bArr17[52]), b17, objArr81);
                                        obj27 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj27);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr80)).intValue();
                                } else {
                                    objArr3 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((i5 | 584663254) * (-757)) - 976789508) + ((~((-402923297) | i6)) * 1514) + (((~(i5 | (-445472691))) | 42549394 | (~(987586550 | i6))) * 757))};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj28 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        byte[] bArr18 = $$a;
                                        byte b18 = bArr18[41];
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        c(b18, (byte) (-bArr18[52]), b18, objArr83);
                                        obj28 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj28);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr82)).intValue();
                                }
                                if (((int[]) objArr3[1])[c2] != i6) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                b((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, null, "\u008e\u0086\u008e\u008d\u0097\u0085\u008b\u0096\u0081\u008d\u0095\u008c\u0094\u008d\u008a\u008e\u0091\u0093\u008c\u0092\u0082\u0091\u0090\u008c\u008f\u0081\u008e\u0086\u008e\u008d\u0081\u008e\u0086\u008e\u008d\u0081", objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[c2]).intern()};
                                java.lang.Integer num13 = num3;
                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num13);
                                if (obj29 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.os.Process.myTid() >> 22) + 3161, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33099));
                                    short s3 = (short) ($$b + 5);
                                    byte[] bArr19 = $$a;
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    c(s3, bArr19[14], bArr19[49], objArr86);
                                    obj29 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num13, obj29);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr85)).longValue();
                                long j28 = ~longValue8;
                                long j29 = ~(j28 | 717315443);
                                long j30 = ((-445) * longValue8) + 319205372580L + (((~(j23 | j28)) | j29) * 446) + (((~(longValue8 | 717315443)) | (~((-717315444) | j28 | j22))) * 446) + (j29 * 446) + 1712750347;
                                int i29 = (int) (j30 >> 32);
                                if (((((int) j30) & ((((((~(i5 | (-1553624264))) | 1285172358) | r2) * (-502)) - 525797095) + (((~(1572568527 | i6)) | (~(i5 | (-268451906)))) * 502))) | ((((((~((-13653505) | i6)) | (~(i5 | 1423572906))) * (-318)) - 1291897994) + (((~(81360424 | i6)) | 1342212482) * (-318)) + (((~((-81360425) | i6)) | (-1355865987)) * 318)) & i29)) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(446831514 | i6)) | 541361252) * (-140)) + 1993305472 + ((~(988192766 | i6)) * 70) + (((~(583304430 | i6)) | 946249588) * 70))};
                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj30 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        byte[] bArr20 = $$a;
                                        byte b19 = bArr20[41];
                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                        c(b19, (byte) (-bArr20[52]), b19, objArr88);
                                        obj30 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj30);
                                    }
                                    c3 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr87)).intValue();
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i5 | 398465240)) * (-560)) - 1518790392) + ((~((-539395873) | i6)) * (-560)) + (((~(i5 | 631670704)) | 306190408) * 560))};
                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj31 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.os.Process.getGidForName("") + 1));
                                        byte[] bArr21 = $$a;
                                        byte b20 = bArr21[41];
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        c(b20, (byte) (-bArr21[52]), b20, objArr90);
                                        obj31 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj31);
                                    }
                                    c3 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr89)).intValue();
                                }
                                if (((int[]) objArr4[1])[c3] != i6) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                a("ꪆ\uf0c4⎅ㅋ⢂臣錆h㌢\udedf嗮锟\ue4e2웲⧼㹚腠꿈긿ᅛ헗䤹㣏磠栣\uf796䱴萡㫥㥕柠\uf8fa\ueb7c㽽餃ퟻ\ue733聆㕬ᎅ㡱쬒", "י㪗⦳箑", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, "\u0000\u0000\u0000\u0000", (char) (37162 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr91);
                                java.lang.Object[] objArr92 = {((java.lang.String) objArr91[0]).intern()};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num13);
                                if (obj32 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.View.getDefaultSize(0, 0) + 3161, (char) (android.text.TextUtils.getTrimmedLength("") + 33099));
                                    short s4 = (short) ($$b + 5);
                                    byte[] bArr22 = $$a;
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    c(s4, bArr22[14], bArr22[49], objArr93);
                                    obj32 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num13, obj32);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr92)).longValue();
                                long j31 = ~longValue9;
                                long j32 = ~(j22 | longValue9);
                                long j33 = ((-195) * longValue9) + 7247793396L + (((~(j31 | (-18536556))) | j32) * (-196)) + ((longValue9 | (-18536556)) * 392) + (((~(18536555 | j31)) | j32) * 196) + 1013971459;
                                if (((((int) (j33 >> 32)) & ((((~(561507353 | i6)) | (-875719058)) * (-668)) + 2017901782 + (((~((-875719058) | i6)) | 561507353) * 1336) + (((-335544705) | i6) * 668))) | (((int) j33) & (((((2142239446 | i6) * (-381)) - 1553105840) + (((~(i5 | 419795606)) | 2007661270) * 381)) - 149443067))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i6}, new int[]{i6 ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(i5 | (-920931512))) | 109204433) * (-90)) + 141613168 + (((~((-920931512) | i6)) | (-921067512)) * (-45)) + (((~(i6 | (-109204434))) | (-920931512) | (~(i5 | 109204433))) * 45))};
                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj33 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        byte[] bArr23 = $$a;
                                        byte b21 = bArr23[41];
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        c(b21, (byte) (-bArr23[52]), b21, objArr96);
                                        obj33 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj33);
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr95)).intValue();
                                    return objArr94;
                                }
                                java.lang.Object[] objArr97 = {new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i5 | (-1015496757))) | (-14639189)) * (-865)) - 811461528) + ((~(i6 | 1015496756)) * 865) + (((~(i5 | 1015496756)) | (~(i5 | (-14639189)))) * 865))};
                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj34 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                    byte[] bArr24 = $$a;
                                    byte b22 = bArr24[41];
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    c(b22, (byte) (-bArr24[52]), b22, objArr99);
                                    obj34 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj34);
                                }
                                ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr98)).intValue();
                                return objArr97;
                            }
                            i19 = i21 + 1;
                            indexOf = i20;
                            i18 = i4;
                            str4 = str5;
                            num7 = num3;
                            num8 = num2;
                        }
                    }
                    num2 = num8;
                    num3 = num7;
                    i4 = i18;
                    int i30 = indexOf;
                    java.lang.String str9 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    if (str9.length() >= 6) {
                        int i31 = 0;
                        while (i31 <= str9.length() - 6) {
                            java.lang.Object[] objArr100 = {str9.substring(i31, i31 + 6), 931995};
                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj35 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.Gravity.getAbsoluteGravity(0, 0), 2594 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b23 = $$a[41];
                                str2 = str9;
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                c((short) 653, b23, (byte) (b23 | 34), objArr101);
                                obj35 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj35);
                            } else {
                                str2 = str9;
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr100)).longValue();
                            long j34 = i4;
                            int i32 = i31;
                            long j35 = ~j34;
                            num4 = num11;
                            java.lang.Object obj36 = invoke;
                            java.lang.Integer num14 = num10;
                            long j36 = ((-219) * longValue10) + 249782898560L + (((~(j35 | 1130239360 | longValue10)) | (~((~longValue10) | (-1130239361)))) * 220) + (((~(j35 | longValue10)) | 1130239360) * (-440)) + ((1130239360 | longValue10 | j34) * 220) + 126861164;
                            int i33 = (int) (j36 >> 32);
                            int i34 = ~i4;
                            if (((((int) j36) & ((((~((-683434162) | i34)) | (-2120660572)) * (-602)) + 1380615706 + (((~((-683434162) | i4)) | 9978016 | (~((-1447204427) | i34))) * (-301)) + ((~((-2120660572) | i34)) * 301))) | (((((~(2002057678 | i34)) | (~((-4474881) | i4)) | (~((-1141899593) | i4))) * 765) + 613134395 + (((~(1997582798 | i34)) | (-2002057679)) * 1530) + (((~(1997582798 | i4)) | (~((-1141899593) | i34))) * 765)) & i33)) == -2096167706) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj36);
                                ((int[]) objArr[0])[0] = i4;
                                ((int[]) objArr[1])[0] = i4 ^ 20;
                                java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~((-303848152) | i34)) | (~((-726287794) | i34))) * (-867)) + 804801824 + (((~((-303848152) | i4)) | 34095249 | (~((-726287794) | i4))) * (-1734)) + (((~(i34 | (-34095250))) | (~((-269752903) | i4)) | (~((-692192545) | i4))) * 867))};
                                num = num14;
                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj37 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                    byte[] bArr25 = $$a;
                                    byte b24 = bArr25[41];
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    c(b24, (byte) (-bArr25[52]), b24, objArr103);
                                    obj37 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj37);
                                }
                                c = 0;
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr102)).intValue();
                                if (((int[]) objArr[1])[c] != i4) {
                                }
                            } else {
                                i31 = i32 + 1;
                                invoke = obj36;
                                num10 = num14;
                                str9 = str2;
                                num11 = num4;
                            }
                        }
                    }
                    obj = invoke;
                    num = num10;
                    num4 = num11;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj)).substring(0, i30);
                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                    b(127 - android.text.TextUtils.indexOf("", "", 0), null, null, "\u0081", objArr104);
                    split = substring.split(((java.lang.String) objArr104[0]).intern());
                    i9 = 0;
                    for (length = split.length; i9 < length; length = i10) {
                        str = split[i9];
                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                        b(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, null, "\u009d\u0091\u009c", objArr105);
                        if (str.split(((java.lang.String) objArr105[0]).intern()).length > 1) {
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1581, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)))) {
                                try {
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    b(127 - (android.os.Process.myPid() >> 22), null, null, "\u0085\u0084\u0082\u008e\u009f\u008f\u008e\u009a\u009e\u0086\u0085\u0095\u009b\u009e\u0090\u009a", objArr106);
                                    intern = ((java.lang.String) objArr106[0]).intern();
                                    try {
                                        runtime = java.lang.Runtime.getRuntime();
                                        objArr6 = new java.lang.Object[1];
                                        strArr = split;
                                        i10 = length;
                                    } catch (java.lang.Exception unused) {
                                    }
                                } catch (java.io.IOException unused2) {
                                    strArr = split;
                                    i10 = length;
                                }
                                try {
                                    b(127 - android.graphics.Color.red(0), null, null, " \u0085", objArr6);
                                    exec = runtime.exec(((java.lang.String) objArr6[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                    try {
                                        java.lang.Object[] objArr107 = {exec.getInputStream()};
                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                        if (obj38 == null) {
                                            i11 = i9;
                                            try {
                                                obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1507 - (android.os.Process.myPid() >> 22), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj38);
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                java.lang.Throwable th4 = th;
                                                java.lang.Throwable cause2 = th4.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th4;
                                            }
                                        } else {
                                            i11 = i9;
                                        }
                                        newInstance = ((java.lang.reflect.Constructor) obj38).newInstance(objArr107);
                                        try {
                                            try {
                                                try {
                                                    java.lang.Object[] objArr108 = {exec.getErrorStream()};
                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    if (obj39 == null) {
                                                        obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, 1507 - android.view.View.MeasureSpec.getSize(0), (char) android.view.KeyEvent.keyCodeFromString(""))).getDeclaredConstructor(java.io.InputStream.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj39);
                                                    }
                                                    newInstance2 = ((java.lang.reflect.Constructor) obj39).newInstance(objArr108);
                                                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                    try {
                                                        java.lang.Class<?> cls39 = java.lang.Class.forName(intern4);
                                                        num5 = num;
                                                        try {
                                                            try {
                                                                obj2 = obj;
                                                                try {
                                                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                    a("࢘㭢ﶻ\uf73a⟘", "ꌭٻ漳읪", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 856062884, "\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.getDeadChar(0, 0) + 27247), objArr109);
                                                                    cls39.getMethod(((java.lang.String) objArr109[0]).intern(), null).invoke(newInstance, null);
                                                                    try {
                                                                        java.lang.Class<?> cls40 = java.lang.Class.forName(intern4);
                                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                        a("࢘㭢ﶻ\uf73a⟘", "ꌭٻ漳읪", 839285667 - android.graphics.Color.rgb(0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getTrimmedLength("") + 27247), objArr110);
                                                                        cls40.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance2, null);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                    sb.append(intern);
                                                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                                    b((android.os.Process.myPid() >> 22) + 127, null, null, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP, objArr111);
                                                                                    sb.append(((java.lang.String) objArr111[0]).intern());
                                                                                    java.lang.String obj40 = sb.toString();
                                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                    a("ﰀ賵쀼뷲㈎", "䍊讬ꎉ⺲", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1987335101, "\u0000\u0000\u0000\u0000", (char) (45731 - android.view.View.resolveSize(0, 0)), objArr112);
                                                                                    dataOutputStream.write(obj40.getBytes(((java.lang.String) objArr112[0]).intern()));
                                                                                    dataOutputStream.flush();
                                                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                    a("ꙍ跌ҵ⢊\u1cfb", "逡\u202e\uee1d髟", 488648335 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 57326), objArr113);
                                                                                    java.lang.String intern5 = ((java.lang.String) objArr113[0]).intern();
                                                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                    a("ﰀ賵쀼뷲㈎", "䍊讬ꎉ⺲", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1987335101, "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45731), objArr114);
                                                                                    dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr114[0]).intern()));
                                                                                    dataOutputStream.flush();
                                                                                } catch (java.lang.Exception unused3) {
                                                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                    b(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0091\u0085\u0085\u0084\u008f\u008c\u0094\u009a\u009e\u008e\u009e\u0084\u0086\u008e\u0084\u0094\u008f\u009e\u008c\u0086\u009e\u008d\u0084\u009b\u0095\u008e¤", objArr115);
                                                                                    throw new java.io.IOException(((java.lang.String) objArr115[0]).intern());
                                                                                }
                                                                            } catch (java.io.IOException unused4) {
                                                                            }
                                                                        } catch (java.lang.Throwable th5) {
                                                                            th = th5;
                                                                        }
                                                                        try {
                                                                            long nanoTime = java.lang.System.nanoTime();
                                                                            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                            while (true) {
                                                                                try {
                                                                                    try {
                                                                                        exec.exitValue();
                                                                                    } catch (java.lang.IllegalThreadStateException unused5) {
                                                                                        if (nanos > 0) {
                                                                                            j = nanoTime;
                                                                                            try {
                                                                                                java.lang.Object[] objArr116 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                java.lang.Class<?> cls41 = java.lang.Class.forName(intern4);
                                                                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                                a("鷌㲲甝硻\uf895", "ᠭ秲隌猉", (-1938165224) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (2454 - android.view.View.resolveSize(0, 0)), objArr117);
                                                                                                cls41.getMethod(((java.lang.String) objArr117[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr116);
                                                                                            } catch (java.lang.Throwable th6) {
                                                                                                java.lang.Throwable cause3 = th6.getCause();
                                                                                                if (cause3 != null) {
                                                                                                    throw cause3;
                                                                                                }
                                                                                                throw th6;
                                                                                            }
                                                                                        } else {
                                                                                            j = nanoTime;
                                                                                        }
                                                                                        nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - j);
                                                                                        if (nanos > 0) {
                                                                                            nanoTime = j;
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        break;
                                                                                    } catch (java.io.IOException unused6) {
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e) {
                                                                                    throw e;
                                                                                } catch (java.lang.Throwable th7) {
                                                                                    th = th7;
                                                                                    try {
                                                                                        exec.destroy();
                                                                                        throw th;
                                                                                    } catch (java.lang.Exception unused7) {
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i4 = i;
                                                                            obj = obj2;
                                                                            num = num5;
                                                                        } catch (java.lang.InterruptedException e2) {
                                                                            e = e2;
                                                                        } catch (java.lang.Throwable th8) {
                                                                            th = th8;
                                                                            th = th;
                                                                            exec.destroy();
                                                                            throw th;
                                                                        }
                                                                    } catch (java.lang.Throwable th9) {
                                                                        java.lang.Throwable cause4 = th9.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                        throw th9;
                                                                    }
                                                                } catch (java.lang.Throwable th10) {
                                                                    th = th10;
                                                                    java.lang.Throwable th11 = th;
                                                                    java.lang.Throwable cause5 = th11.getCause();
                                                                    if (cause5 != null) {
                                                                        throw cause5;
                                                                    }
                                                                    throw th11;
                                                                }
                                                            } catch (java.lang.Throwable th12) {
                                                                th = th12;
                                                            }
                                                        } catch (java.lang.Throwable th13) {
                                                            th = th13;
                                                        }
                                                    } catch (java.lang.Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (java.lang.Throwable th15) {
                                                    java.lang.Throwable cause6 = th15.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th15;
                                                }
                                            } catch (java.lang.Exception unused8) {
                                            }
                                        } catch (java.io.IOException unused9) {
                                        }
                                    } catch (java.lang.Throwable th16) {
                                        th = th16;
                                    }
                                } catch (java.io.IOException unused10) {
                                    i11 = i9;
                                    i9 = i11 + 1;
                                    split = strArr;
                                } catch (java.lang.Exception unused11) {
                                    java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                    b(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0091\u0085\u0085\u0084\u008f\u008c\u0094\u009a\u009e\u008e\u009e\u0084\u0086\u008e\u0084\u0094\u008f\u009e\u008c\u0086\u009e\u008d\u0084\u009b\u0095\u008e¤", objArr1152);
                                    throw new java.io.IOException(((java.lang.String) objArr1152[0]).intern());
                                }
                            }
                            objArr = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                            java.lang.String str11 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj2);
                            i4 = i;
                            ((int[]) objArr[0])[0] = i4;
                            ((int[]) objArr[1])[0] = i4 ^ 20;
                            java.lang.Object[] objArr118 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((((~(1046898606 | r2)) | 10059777) * (-160)) - 1655319448) + (((~((~i4) | 16762661)) | 1046898606) * 160))};
                            num = num5;
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                            if (obj3 == null) {
                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2713 - android.view.View.combineMeasuredStates(0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                byte[] bArr26 = $$a;
                                byte b25 = bArr26[41];
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                c(b25, (byte) (-bArr26[52]), b25, objArr119);
                                obj3 = cls42.getMethod((java.lang.String) objArr119[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj3);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr118)).intValue();
                            c = 0;
                            ((int[]) objArr[4])[0] = intValue;
                            if (((int[]) objArr[1])[c] != i4) {
                            }
                        } else {
                            strArr = split;
                            i10 = length;
                            i11 = i9;
                        }
                        i9 = i11 + 1;
                        split = strArr;
                    }
                } else {
                    num = -1347122530;
                    num2 = num8;
                    num3 = num7;
                    i4 = i18;
                    num4 = 16;
                }
                java.lang.Object[] objArr120 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                int i35 = ~i4;
                java.lang.Object[] objArr121 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-1025558842) | i4)) | (~(1030086527 | i35))) * (-406)) - 1063106140) + ((~((-1025509425) | i35)) * (-406)) + (((~(i35 | 1025558841)) | (~((-4577104) | i4))) * 406))};
                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                if (obj41 == null) {
                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, android.graphics.Color.blue(0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    byte[] bArr27 = $$a;
                    byte b26 = bArr27[41];
                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                    c(b26, (byte) (-bArr27[52]), b26, objArr122);
                    obj41 = cls43.getMethod((java.lang.String) objArr122[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj41);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr121)).intValue();
                c = 0;
                ((int[]) objArr120[4])[0] = intValue2;
                objArr = objArr120;
                if (((int[]) objArr[1])[c] != i4) {
                }
            } catch (java.lang.Throwable th17) {
                java.lang.Throwable cause7 = th17.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th17;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.resolveSize(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1507, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
            byte[] bArr28 = $$a;
            java.lang.Object[] objArr123 = new java.lang.Object[1];
            c((short) (bArr28[17] - 1), bArr28[41], bArr28[7], objArr123);
            sb2.append(cls44.getField((java.lang.String) objArr123[0]).get(newInstance).toString());
            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 1507, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
            java.lang.Object[] objArr124 = new java.lang.Object[1];
            c((short) (bArr28[17] - 1), bArr28[41], bArr28[7], objArr124);
            sb2.append(cls45.getField((java.lang.String) objArr124[0]).get(newInstance2).toString());
            java.lang.String obj42 = sb2.toString();
            java.lang.Object[] objArr125 = new java.lang.Object[1];
            b(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), null, null, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP, objArr125);
            java.lang.String[] split2 = obj42.split(((java.lang.String) objArr125[0]).intern());
            length2 = split2.length;
            i12 = 0;
            while (i12 < length2) {
                java.lang.String str12 = split2[i12];
                java.lang.Object[] objArr126 = new java.lang.Object[1];
                a("熑᫈鳇摥씁ﰯ닞迕䃐탌ﱖᒼ츇깘䴓ꑑ渏鉍붹", "\uda16젚鉠楼", 1623726810 - (android.os.Process.myTid() >> 22), "\u0000\u0000\u0000\u0000", (char) (31890 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr126);
                if (!str12.startsWith(((java.lang.String) objArr126[0]).intern())) {
                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                    b((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, null, "\u0091\u008d\u0095\u008c\u0094\u008d\u008a\u008e\u0091\u0090\u008c\u008f¥\u0084\u0082\u008e\u009f\u008f\u008e\u009a", objArr127);
                    if (str12.startsWith(((java.lang.String) objArr127[0]).intern())) {
                        continue;
                    } else {
                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, null, "¥\u0084\u0082\u008e\u009f\u008f\u008e\u009a", objArr128);
                        if (str12.startsWith(((java.lang.String) objArr128[0]).intern())) {
                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                            a("\uebca", "燶ཌྷ櫊哏", android.graphics.Color.argb(0, 0, 0, 0) - 904966799, "\u0000\u0000\u0000\u0000", (char) (53098 - android.text.TextUtils.getOffsetBefore("", 0)), objArr129);
                            java.lang.String[] split3 = str12.split(((java.lang.String) objArr129[0]).intern());
                            if (split3.length > 1 && split3[1].equalsIgnoreCase(str)) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, str11, new int[1]};
                                java.lang.String str112 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj2);
                                i4 = i;
                                ((int[]) objArr[0])[0] = i4;
                                ((int[]) objArr[1])[0] = i4 ^ 20;
                                java.lang.Object[] objArr1182 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((((~(1046898606 | r2)) | 10059777) * (-160)) - 1655319448) + (((~((~i4) | 16762661)) | 1046898606) * 160))};
                                num = num5;
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj3 == null) {
                                }
                                int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr1182)).intValue();
                                c = 0;
                                ((int[]) objArr[4])[0] = intValue3;
                                if (((int[]) objArr[1])[c] != i4) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i12++;
                obj2 = obj2;
                num5 = num5;
            }
            i4 = i;
            obj = obj2;
            num = num5;
            i9 = i11 + 1;
            split = strArr;
            try {
                try {
                    java.lang.Class<?> cls46 = java.lang.Class.forName(intern4);
                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                    a("ڱ奃ﲭ芃", "历띾銟砭", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (11666 - android.view.KeyEvent.getDeadChar(0, 0)), objArr130);
                    cls46.getMethod(((java.lang.String) objArr130[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                    try {
                        java.lang.Class<?> cls47 = java.lang.Class.forName(intern4);
                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                        a("ڱ奃ﲭ芃", "历띾銟砭", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (11666 - android.view.KeyEvent.getDeadChar(0, 0)), objArr131);
                        cls47.getMethod(((java.lang.String) objArr131[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                        try {
                            exec.destroy();
                        } catch (java.lang.Exception unused12) {
                        }
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                        java.lang.Class cls442 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.resolveSize(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1507, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte[] bArr282 = $$a;
                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                        c((short) (bArr282[17] - 1), bArr282[41], bArr282[7], objArr1232);
                        sb22.append(cls442.getField((java.lang.String) objArr1232[0]).get(newInstance).toString());
                        java.lang.Class cls452 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 1507, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                        java.lang.Object[] objArr1242 = new java.lang.Object[1];
                        c((short) (bArr282[17] - 1), bArr282[41], bArr282[7], objArr1242);
                        sb22.append(cls452.getField((java.lang.String) objArr1242[0]).get(newInstance2).toString());
                        java.lang.String obj422 = sb22.toString();
                        java.lang.Object[] objArr1252 = new java.lang.Object[1];
                        b(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), null, null, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP, objArr1252);
                        java.lang.String[] split22 = obj422.split(((java.lang.String) objArr1252[0]).intern());
                        length2 = split22.length;
                        i12 = 0;
                        while (i12 < length2) {
                        }
                        i4 = i;
                        obj = obj2;
                        num = num5;
                        i9 = i11 + 1;
                        split = strArr;
                    } catch (java.lang.Throwable th18) {
                        java.lang.Throwable cause8 = th18.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th18;
                    }
                } catch (java.lang.InterruptedException e3) {
                    e = e3;
                    throw e;
                }
            } catch (java.lang.Throwable th19) {
                java.lang.Throwable cause9 = th19.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th19;
            }
        } catch (java.lang.Throwable th20) {
            java.lang.Throwable cause10 = th20.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th20;
        }
    }
}
