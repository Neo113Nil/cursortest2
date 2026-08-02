package com.payair.hce;

/* loaded from: classes4.dex */
public final class createWindowContext implements com.payair.hce.setSelectedGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int valueOf;
    private static char values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 65;
        int i6 = b + 4;
        int i7 = 35 - (i2 * 2);
        byte[] bArr = $$a;
        char[] cArr = new char[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5 = (i5 + i8) - 2;
            i3 = i4;
            i6++;
            i4 = i3 + 1;
            cArr[i3] = (char) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i8 = bArr[i6];
            i5 = (i5 + i8) - 2;
            i3 = i4;
            i6++;
            i4 = i3 + 1;
            cArr[i3] = (char) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i6++;
            i4 = i3 + 1;
            cArr[i3] = (char) i5;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        int i4 = 3 - (b * 2);
        int i5 = 115 - s;
        int i6 = 1 - (i * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i7 = bArr[i4];
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        DigitizedCardProfile = (IccPrivateKeyCrtComponentsJson + 89) % 128;
        try {
            com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{obj.toString()}, -720074735, 720074736, (int) java.lang.System.currentTimeMillis());
            IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 67) % 128;
            return isuicontext;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void c(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        $10 = ($11 + 23) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 39) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        java.lang.Object obj = null;
        char c3 = 2;
        if (str != null) {
            int i2 = $10 + 107;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 71, 1179 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                    byte b = (byte) ($$d[1] + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 13, b, b, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, 3443 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (3831 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c4 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[c3] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr5[0] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 26, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1863, (char) (41776 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    byte b2 = (byte) ($$d[1] + 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((short) 10, b2, b2, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, (android.os.Process.myTid() >> 22) + 3133, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    byte b3 = (byte) ($$d[1] + 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((short) 9, b3, b3, objArr8);
                    java.lang.String str4 = (java.lang.String) objArr8[0];
                    c2 = 2;
                    obj5 = cls3.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (valueOf ^ 1263759066225628708L)) ^ ((cArr4[getwalletdata.writeReplace] ^ cArr5[intValue2]) ^ (writeReplace ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
                cArr4 = cArr4;
                c3 = c2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i4 = $11 + 1;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 61) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2074, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 60037));
                    byte b = (byte) ($$d[1] + 1);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 3543 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.indexOf("", ""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 121) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $11 = ($10 + 11) % 128;
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 3543 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        DigitizedCardProfile = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        AlternateContactlessPaymentDataJson = 1889207282;
        writeReplace = 1263759066225628708L;
        valueOf = -804334044;
        values = (char) 28367;
    }

    static void init$1() {
        $$d = new byte[]{18, -1, 36, -56};
        $$e = 161;
    }

    static void init$0() {
        $$a = new byte[]{38, -91, 120, 99, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 197;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x22d1, code lost:
    
        if (((((int) r1) & ((((((-1603797990) | r2) * (-220)) - 1266580977) + (((~(1253942896 | r5)) | (-1606264822)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) + 372057606)) | (((int) (r1 >> 32)) & ((((((~((-1756567982) | r5)) | (~((-319341571) | r5))) * 69) - 682811718) + ((((~(323806786 | r5)) | (-2080374768)) | (~(1761033197 | r5))) * (-69))) + 308099904))) == 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x2efa, code lost:
    
        if (r7 == null) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0622, code lost:
    
        if (((((int) r2) & (((((~(1181895904 | r65)) | 1229603881) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 42148379) + (((~(1181895904 | r10)) | 1229603881) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) (r2 >> 32)) & ((((((~((-237002461) | r10)) | 1200223950) * (-235)) - 1532196910) + (((~((-237002461) | r65)) | 1200223950) * (-470))) + (((~((-136316945) | r65)) | 1099538434) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)))) != 477111747) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0727, code lost:
    
        if (((((int) (r6 >> 32)) & ((((((-162686389) | r10) * (-490)) - 1914154154) + (((~((-1274243063) | r65)) | 1111556674) * 490)) + 1742537614)) | (((int) r6) & ((((((~((-4202498) | r10)) | (~((-336692549) | r10))) * (-184)) + 1019428157) + ((((~((-1262625418) | r10)) | 1258422920) | (~((-1595115469) | r10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 2078237864))) != (-1032769152)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x084c, code lost:
    
        if (((((int) r2) & ((((((~(1081552660 | r10)) | 1776188225) * (-328)) + 813856553) + ((1776188225 | r65) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)) + ((((~((-1081552661) | r65)) | 1079388928) | (~(1778351957 | r10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) (r2 >> 32)) & (((((((~(1474233811 | r65)) | (-1476371924)) | (~((-1381368962) | r10))) * 886) - 1504850550) + (((~((-1474233812) | r10)) | (-1383507074)) * (-1772))) + ((~((-1383507074) | r10)) * 886)))) == 542074309) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x152b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x168f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x17ad A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x18d9 A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x19c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x1a51 A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x1b03 A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1c24 A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x1cff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1f25  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x2028  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x2109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x2460  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x2545  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x2025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0aaf A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x101f A[Catch: all -> 0x45c3, TryCatch #2 {all -> 0x45c3, blocks: (B:3:0x000c, B:5:0x0024, B:6:0x0062, B:10:0x011f, B:12:0x0178, B:13:0x01c7, B:18:0x0208, B:20:0x021b, B:21:0x0262, B:30:0x02f6, B:32:0x0306, B:33:0x0352, B:35:0x0383, B:37:0x0393, B:38:0x03e0, B:40:0x03e9, B:42:0x0407, B:43:0x045e, B:47:0x051b, B:49:0x0539, B:50:0x0589, B:53:0x0626, B:55:0x0644, B:56:0x0698, B:59:0x072b, B:61:0x0749, B:62:0x079c, B:66:0x100f, B:68:0x101f, B:69:0x106c, B:72:0x10d4, B:74:0x10e7, B:75:0x113d, B:79:0x11f8, B:81:0x1208, B:82:0x1254, B:84:0x128a, B:86:0x129a, B:87:0x12e8, B:89:0x12f1, B:91:0x130f, B:92:0x1369, B:96:0x1417, B:98:0x1435, B:99:0x1486, B:106:0x155f, B:108:0x1572, B:109:0x15cc, B:124:0x16bd, B:126:0x16f9, B:127:0x174b, B:131:0x179a, B:133:0x17ad, B:134:0x17fc, B:136:0x18c6, B:138:0x18d9, B:139:0x1927, B:149:0x1a00, B:151:0x1a51, B:152:0x1aac, B:158:0x1af0, B:160:0x1b03, B:161:0x1b52, B:163:0x1c11, B:165:0x1c24, B:166:0x1c75, B:174:0x1d24, B:176:0x1d73, B:177:0x1dd1, B:184:0x1f27, B:186:0x1f3a, B:187:0x1f8c, B:195:0x2041, B:197:0x2096, B:198:0x20f3, B:221:0x2481, B:223:0x24d8, B:224:0x252f, B:228:0x2576, B:230:0x2586, B:231:0x25d2, B:234:0x260c, B:236:0x261f, B:237:0x2670, B:244:0x297a, B:246:0x298d, B:247:0x29df, B:255:0x2aa8, B:257:0x2b01, B:258:0x2b58, B:262:0x2ba4, B:264:0x2bcd, B:265:0x2c2c, B:272:0x2cdb, B:274:0x2d35, B:275:0x2d8f, B:301:0x2e27, B:303:0x2e81, B:304:0x2ed2, B:307:0x2eff, B:309:0x2f0e, B:310:0x2f5b, B:314:0x3024, B:316:0x306f, B:317:0x30c6, B:321:0x30dd, B:323:0x30f6, B:324:0x3142, B:328:0x31fa, B:330:0x3253, B:331:0x32a4, B:334:0x32ba, B:336:0x32c9, B:337:0x3310, B:341:0x33cf, B:343:0x3412, B:344:0x3467, B:347:0x347d, B:349:0x348c, B:350:0x34d7, B:354:0x35a1, B:356:0x35f9, B:357:0x364d, B:360:0x3663, B:362:0x3672, B:363:0x36ba, B:367:0x3779, B:369:0x37bf, B:370:0x3814, B:374:0x385d, B:376:0x3887, B:377:0x38e6, B:381:0x3997, B:383:0x39f3, B:384:0x3a47, B:388:0x3a88, B:390:0x3a9b, B:391:0x3aec, B:395:0x3b86, B:397:0x3bdb, B:398:0x3c35, B:402:0x3c53, B:404:0x3c62, B:405:0x3cb0, B:409:0x3d55, B:411:0x3dc2, B:412:0x3e1b, B:415:0x3e31, B:417:0x3e40, B:418:0x3e8d, B:422:0x3f41, B:424:0x3f8d, B:425:0x3fe1, B:428:0x3ff7, B:430:0x4006, B:431:0x4055, B:435:0x4113, B:437:0x4163, B:438:0x41bf, B:441:0x41d5, B:443:0x41e4, B:444:0x422b, B:450:0x42dd, B:452:0x431e, B:453:0x436f, B:455:0x4384, B:457:0x4397, B:458:0x43e4, B:460:0x43ec, B:462:0x441e, B:463:0x447e, B:468:0x44ff, B:470:0x454a, B:471:0x45a3, B:565:0x0883, B:567:0x0896, B:568:0x08e7, B:573:0x0a59, B:575:0x0aaf, B:576:0x0b08, B:580:0x09a9, B:582:0x09b9, B:583:0x0a03), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x1075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace$4956fc2a(int i, java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.Object invoke;
        int i2;
        int i3;
        java.lang.String str2;
        java.lang.Object obj3;
        long j;
        java.lang.String str3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        long j2;
        java.lang.Object obj6;
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        long j4;
        java.lang.Object invoke2;
        int parseInt;
        int i8;
        int i9;
        java.lang.Object obj7;
        int i10;
        java.lang.String[] strArr;
        java.lang.String str4;
        int i11;
        int i12;
        int i13;
        java.lang.String str5;
        int i14;
        java.lang.Object obj8;
        java.lang.Object obj9;
        char c;
        int i15;
        java.lang.Object obj10;
        IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 97) % 128;
        try {
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            int i16 = 0;
            if (obj11 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.MeasureSpec.getMode(0), 1838 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0));
                byte[] bArr = $$a;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(653, (byte) (-bArr[14]), (byte) (-bArr[16]), objArr);
                obj11 = cls.getMethod((java.lang.String) objArr[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj11);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, null)).longValue();
            long j5 = i;
            long j6 = ~j5;
            long j7 = (((-271) * longValue) - 93306899595L) + (((~((~longValue) | 341783514 | j6)) | (~(longValue | (-341783515) | j5))) * (-272)) + (((~(341783514 | longValue)) | (~(341783514 | j5))) * (-272)) + (((~((-341783515) | j5)) | longValue) * 272) + 1181862460;
            int i17 = (int) (j7 >> 32);
            int i18 = ~i;
            int i19 = ~((-101197233) | i18);
            if ((((((i19 | 1538423643) * 764) + 67736134 + (((~(i18 | 1538423643)) | (-1606057980)) * (-1528)) + (((-1572495084) | i19) * 764)) & i17) | (((int) j7) & ((((((~((-740254275) | i)) | (-2117486612)) * (-948)) - 1383423903) + ((~((-739655683) | i18)) * (-948))) - 567466164))) != 0) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr3 = {-723739918, 16, java.lang.Integer.valueOf((((~((-1038424763) | i18)) | (~(329099242 | i18))) * (-867)) + 1514227164 + (((~((-1038424763) | i)) | 744495120 | (~(329099242 | i))) * (-1734)) + (((~(i | (-293929643))) | (~(i18 | (-744495121))) | (~(1073594362 | i))) * 867))};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj12 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0));
                    byte b = $$a[14];
                    short s = (short) (b - 1);
                    byte b2 = (byte) (-b);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(s, b2, (byte) (b2 + 1), objArr4);
                    obj12 = cls2.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, android.view.View.resolveSize(0, 0) + 2, 11 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5);
            java.lang.Object[] objArr6 = {((java.lang.String) objArr5[0]).intern()};
            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj13 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 40, 1921 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                byte[] bArr2 = $$a;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(653, (byte) (-bArr2[14]), (byte) (-bArr2[16]), objArr7);
                obj13 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
            }
            java.lang.String str6 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr6);
            if (str6 != null) {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                c("꽱밁쫺罧֚탔", "⎰컰㰎ွ", android.view.KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.getDeadChar(0, 0) + 15676), objArr8);
                java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(true, "\u0002\u0005�\ufffe\t\uffff￼\ufffa", 252 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.indexOf("", "") + 3, android.widget.ExpandableListView.getPackedPositionType(0L) + 8, objArr9);
                java.lang.String[] strArr2 = {intern, ((java.lang.String) objArr9[0]).intern()};
                int i20 = 0;
                int i21 = 2;
                while (i20 < i21) {
                    if (str6.contains(strArr2[i20])) {
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        c("\u0af3⢑㖁䝊䠍냕\ue85c礧\udc84\uefa0뙹睵륲\ue013쵷ᵫ︵\u0cdfꂿ둿䭄솓\ue41d", "躰ｉ馼\uda1d", (-1124120178) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
                        java.lang.Object[] objArr11 = {((java.lang.String) objArr10[i16]).intern()};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj14 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1921 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.view.View.resolveSizeAndState(i16, i16, i16));
                            byte[] bArr3 = $$a;
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a(653, (byte) (-bArr3[14]), (byte) (-bArr3[16]), objArr12);
                            java.lang.String str7 = (java.lang.String) objArr12[i16];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i16] = java.lang.String.class;
                            obj14 = cls4.getMethod(str7, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj14).invoke(null, objArr11);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        b(false, "\t\u000b\b�\u000e￼\rￇ\f\u0012\f\r\ufffe\u0006ￇ\u0006\ufffa\u0007\u000e\uffff\ufffa￼\r\u000e\u000b\ufffe\u000b\u000b\bￇ", android.view.View.resolveSizeAndState(i16, i16, i16) + 250, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, 30 - android.view.KeyEvent.normalizeMetaState(i16), objArr13);
                        java.lang.Object[] objArr14 = {((java.lang.String) objArr13[i16]).intern()};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj15 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getTrimmedLength(""), 1921 - android.view.View.resolveSizeAndState(i16, i16, i16), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                            byte[] bArr4 = $$a;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a(653, (byte) (-bArr4[14]), (byte) (-bArr4[16]), objArr15);
                            obj15 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj15).invoke(null, objArr14);
                        if (invoke3 != null) {
                            java.lang.Object[] objArr16 = {invoke3, 42};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj16 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2594, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                byte[] bArr5 = $$a;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(653, (byte) (-bArr5[14]), (byte) (-bArr5[16]), objArr17);
                                obj16 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr16)).longValue();
                            long j8 = ~longValue2;
                            str = "";
                            obj8 = invoke3;
                            obj9 = invoke4;
                            long j9 = ((-167) * longValue2) + 15874786033L + (((~(j8 | j5)) | (~(j8 | 95058598))) * 336) + (((~(longValue2 | (-95058599))) | (~((-95058599) | j5))) * (-168)) + (((~((-95058599) | j6)) | j8) * 168) + 1352159123;
                            int i22 = ~((-2009094274) | i);
                            if (((((int) j9) & ((((~((-42320003) | i18)) | (~((-17309698) | i)) | (~(1539176111 | i))) * 765) + 157270749 + (((~((-59629700) | i18)) | 42320002) * 1530) + (((~((-59629700) | i)) | (~(1539176111 | i18))) * 765))) | (((int) (j9 >> 32)) & (((((~(2010470867 | i18)) | (~((-848646612) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 720378086) + (((~(848646611 | i18)) | i22) * (-1040)) + ((i22 | (~(2009094273 | i18)) | 1161824256) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) != 477111747) {
                            }
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                b(true, "\u0005\u0016\u0007\uffd1\u0005\u0014\uffd0\u0007\u000e\u0004\u0003\t\t\u0017\u0004\u0007\u0006ￏ\u0006\r\u000e\u000e\uffd1\u0016\u000b\u0010\u000b\uffd1", 240 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.KeyEvent.normalizeMetaState(0) + 4, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, objArr18);
                                java.lang.Object[] objArr19 = {((java.lang.String) objArr18[0]).intern()};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj17 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0, 0) + 36, 3160 - android.view.MotionEvent.axisFromString(str), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 33099));
                                    byte[] bArr6 = $$a;
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a(653, (byte) (-bArr6[14]), (byte) (-bArr6[16]), objArr20);
                                    obj17 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj17);
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr19)).longValue();
                                long j10 = ~((-641406168) | j6);
                                long j11 = ~(641406167 | longValue3);
                                long j12 = ((((((-1527) * longValue3) - 490675718520L) + ((longValue3 | j10) * 764)) + (((~(j6 | longValue3)) | j11) * (-1528))) + ((((~((~longValue3) | (-641406168))) | j11) | j10) * 764)) - 696261940;
                                if (((((int) j12) & (((((~(1259564029 | i18)) | 177662380) * (-983)) - 1192163134) + (((~(177662380 | i18)) | 1090585169) * 983))) | (((int) (j12 >> 32)) & (((((~((-800254363) | i)) | (~(804777370 | i18))) * (-406)) - 989630842) + ((~((-167805323) | i18)) * (-406)) + (((~((-636972049) | i)) | (~(800254362 | i18))) * 406)))) == 1) {
                                    i15 = 1;
                                    c = 0;
                                    int[] iArr = new int[i15];
                                    int[] iArr2 = new int[i15];
                                    iArr[c] = i;
                                    iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr21 = {iArr, iArr2, null, new int[i15]};
                                    java.lang.Object[] objArr22 = {-723739918, 16, java.lang.Integer.valueOf(((((~((-460956509) | i)) | (-248369012)) * (-318)) - 407327171) + (((~((-248369012) | i)) | (~(536735615 | i18))) * 318) + (((~(i | 536735615)) | (~((-75779108) | i18))) * 318))};
                                    obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj10 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, 2712 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                        byte b3 = $$a[14];
                                        short s2 = (short) (b3 - 1);
                                        byte b4 = (byte) (-b3);
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        a(s2, b4, (byte) (b4 + 1), objArr23);
                                        obj10 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                                    }
                                    ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr22)).intValue();
                                    return objArr21;
                                }
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                c("檆ⷞ晓攂ؘ\ue905팢Ⱑ", "\ue1e5\uf6c2㯖顃", android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), objArr24);
                                java.lang.String intern2 = ((java.lang.String) objArr24[0]).intern();
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                c("敜\udc9d\ud8ee싕珗\uf082", "\uffd0뼐䑳ꯆ", android.text.TextUtils.indexOf(str, str), "\u0000\u0000\u0000\u0000", (char) (50756 - android.view.KeyEvent.getDeadChar(0, 0)), objArr25);
                                java.lang.String intern3 = ((java.lang.String) objArr25[0]).intern();
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                c("啙ꑋ䓿\ue5a6聫酒빝", "맪든镗ⲑ", android.text.TextUtils.getOffsetBefore(str, 0) + 1471471801, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getOffsetBefore(str, 0), objArr26);
                                java.lang.String intern4 = ((java.lang.String) objArr26[0]).intern();
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                c("ಣ秚ﱖ뛂鞢け⊆믙⳺", "\ue772쭴⊏ヨ", android.view.KeyEvent.keyCodeFromString(str) - 1882491673, "\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr27);
                                java.lang.String intern5 = ((java.lang.String) objArr27[0]).intern();
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                c("軺毬㽳Ὠ\u0bab槪", "㙊恤☃\uedf5", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', "\u0000\u0000\u0000\u0000", (char) (62758 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr28);
                                java.lang.String intern6 = ((java.lang.String) objArr28[0]).intern();
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                c("ᛷܡ冕誛觸籶\u0b53噞㨲榺\u0b50귨뮬", "操\udbe0罣蝱", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1675354212, "\u0000\u0000\u0000\u0000", (char) (29055 - android.graphics.Color.argb(0, 0, 0, 0)), objArr29);
                                java.lang.String intern7 = ((java.lang.String) objArr29[0]).intern();
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c("ⴓ洛\ue014穿㨱", "ね嵩ꉣ쭍", 1667066160 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000\u0000\u0000\u0000", (char) (19874 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr30);
                                java.lang.String intern8 = ((java.lang.String) objArr30[0]).intern();
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                b(true, "\bￒ\u0005\u0011\u0004\u000f", 244 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr31);
                                java.lang.String intern9 = ((java.lang.String) objArr31[0]).intern();
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                b(false, "\ufff9\u0007", 259 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, objArr32);
                                java.lang.String intern10 = ((java.lang.String) objArr32[0]).intern();
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                c("펥ﲎ\uf639ễ铭열串ꪜ⫺\udc85Ԉ閎ᕯ굆슶Ш", "숁뭔ꣿ墨", android.view.KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15017), objArr33);
                                java.lang.String intern11 = ((java.lang.String) objArr33[0]).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                c("㓄偹ⷛ⾣瞏崚躕稪幊䧀", "蘷泃뢄\ue1e6", android.graphics.Color.green(0), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr34);
                                java.lang.String intern12 = ((java.lang.String) objArr34[0]).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c("鿌⩍ೢ幗ᡛ襍鶇ﳮ", "ⷀѶি\udfa3", (-1) - android.os.Process.getGidForName(str), "\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), objArr35);
                                java.lang.String intern13 = ((java.lang.String) objArr35[0]).intern();
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                b(true, "\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002\u0005\ufff9￼", 253 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, android.view.MotionEvent.axisFromString(str) + 13, objArr36);
                                java.lang.String intern14 = ((java.lang.String) objArr36[0]).intern();
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                b(false, "\u0004\ufffb\ufff8\u0004\u0001\u0001\ufffa\ufff8\t\ufff8\t\u0001\u0005\u0007", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr37);
                                java.lang.String intern15 = ((java.lang.String) objArr37[0]).intern();
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                b(false, "\u0006\uffff\u0005\u0003\ufff6\ufffe\u0000", 258 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, 7 - android.view.View.resolveSizeAndState(0, 0, 0), objArr38);
                                java.lang.String intern16 = ((java.lang.String) objArr38[0]).intern();
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c("豾芶⼄堛蝦瞀詒", "ᜓ㘫ɘ杉", 1479944983 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr39);
                                java.lang.String intern17 = ((java.lang.String) objArr39[0]).intern();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                c("\ue8b7\uef90\u0a3aﳡⳆꃔ쪚", "鶕譈툄譙", 76236956 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.view.View.combineMeasuredStates(0, 0), objArr40);
                                java.lang.String intern18 = ((java.lang.String) objArr40[0]).intern();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                b(false, "\u0000\u0000", (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr41);
                                java.lang.String intern19 = ((java.lang.String) objArr41[0]).intern();
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                c("ᐑ\ue07e녚슰⚎죝뗆䳿렆ʃ쥰톓㩯롘돪탈뒱듕漕齻", "㟽귕鮄\uebc0", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr42);
                                java.lang.String intern20 = ((java.lang.String) objArr42[0]).intern();
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                c("ຽ榜먀\uf7bd\ue656\ue2d7", "\udd6e་鉰獻", android.graphics.Color.alpha(0), "\u0000\u0000\u0000\u0000", (char) (31634 - android.text.TextUtils.getOffsetAfter(str, 0)), objArr43);
                                java.lang.String intern21 = ((java.lang.String) objArr43[0]).intern();
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                b(true, "\uffff\u0001", 264 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr44);
                                java.lang.String intern22 = ((java.lang.String) objArr44[0]).intern();
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                c("竧挰跭䉺✮뗶帜ş寃莌‱얙嵠퐩䡉濓", "鞇\u2d6d㢼䣌", android.graphics.Color.blue(0), "\u0000\u0000\u0000\u0000", (char) (52281 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr45);
                                java.lang.String intern23 = ((java.lang.String) objArr45[0]).intern();
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                b(true, "\n\ufff7\u0006\ufffb\ufff9\ufff7\b\n\ufffe", 252 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, 10 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr46);
                                java.lang.String intern24 = ((java.lang.String) objArr46[0]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                b(false, "\r￼\ufffe\u0000\u000b￼\u000f\u0003\uffd1\u000f", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9 - android.text.TextUtils.getOffsetAfter(str, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 10, objArr47);
                                java.lang.String intern25 = ((java.lang.String) objArr47[0]).intern();
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                b(false, "\r\ufffeￏ\r\u000b\ufffa￼\ufffe\u000b\b\u000e", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 250, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4, android.text.TextUtils.getOffsetAfter(str, 0) + 11, objArr48);
                                java.lang.String intern26 = ((java.lang.String) objArr48[0]).intern();
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                c("악밪쮲윰᪹䇖\ue9e6扄た⼞鞍", "딺ꮈᐰ彝", 816548020 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr49);
                                java.lang.String intern27 = ((java.lang.String) objArr49[0]).intern();
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                c("畹ᣐ\ueb4f䡺瞆ৡཛྷᨅ釨潕忿\ue20d갊揰톎", "ꁸ苉齢퓪", 1652738465 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getCapsMode(str, 0, 0) + 60063), objArr50);
                                java.lang.String intern28 = ((java.lang.String) objArr50[0]).intern();
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                b(true, "\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2\ufff7\u0001￼", 256 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr51);
                                java.lang.String[] strArr3 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr51[0]).intern()};
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                b(false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", 248 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2 - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.blue(0) + 11, objArr52);
                                java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1921, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte[] bArr7 = $$a;
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    a(653, (byte) (-bArr7[14]), (byte) (-bArr7[16]), objArr54);
                                    obj2 = cls9.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr53);
                                if (invoke != null) {
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    c("꽱밁쫺罧֚탔", "⎰컰㰎ွ", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, "\u0000\u0000\u0000\u0000", (char) (15676 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr55);
                                    java.lang.String intern29 = ((java.lang.String) objArr55[0]).intern();
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    b(true, "\u0002\u0005�\ufffe\t\uffff￼\ufffa", 253 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 3 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 8, objArr56);
                                    java.lang.Object[] objArr57 = {invoke, new java.lang.String[]{intern29, ((java.lang.String) objArr56[0]).intern()}};
                                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                    if (obj18 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2880, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                        byte[] bArr8 = $$a;
                                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr8[14]), (byte) (-bArr8[16]), objArr58);
                                        obj18 = cls10.getMethod((java.lang.String) objArr58[0], java.lang.String.class, java.lang.String[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj18);
                                    }
                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr57)).longValue();
                                    long j13 = ~longValue4;
                                    long j14 = (((((319 * longValue4) + 207867834281L) + (((~((j13 | 655734492) | j5)) | (~((j6 | (-655734493)) | longValue4))) * (-318))) + (((~((-655734493) | j13)) | (~((-655734493) | j5))) * (-318))) + (((~(655734492 | j5)) | j13) * 318)) - 1372977286;
                                    if (((((int) j14) & ((((-268501029) | i18) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1694997085 + (((~(1834133977 | i18)) | (-1347529126)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) (j14 >> 32)) & ((((~((-499527137) | i18)) | (-937699275)) * (-933)) + 644514776 + (((~((-937699275) | i18)) | 572523018) * 933) + 504585353))) != 0) {
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        c("\u0af3⢑㖁䝊䠍냕\ue85c礧\udc84\uefa0뙹睵륲\ue013쵷ᵫ︵\u0cdfꂿ둿䭄솓\ue41d", "躰ｉ馼\uda1d", (-1124120178) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr59);
                                        java.lang.Object[] objArr60 = {((java.lang.String) objArr59[0]).intern()};
                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj19 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1922, (char) android.view.View.resolveSize(0, 0));
                                            byte[] bArr9 = $$a;
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            a(653, (byte) (-bArr9[14]), (byte) (-bArr9[16]), objArr61);
                                            obj19 = cls11.getMethod((java.lang.String) objArr61[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj19);
                                        }
                                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj19).invoke(null, objArr60);
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        b(false, "\t\u000b\b�\u000e￼\rￇ\f\u0012\f\r\ufffe\u0006ￇ\u0006\ufffa\u0007\u000e\uffff\ufffa￼\r\u000e\u000b\ufffe\u000b\u000b\bￇ", 250 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 'K' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.combineMeasuredStates(0, 0) + 30, objArr62);
                                        java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).intern()};
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj20 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionType(0L), 1921 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                            byte[] bArr10 = $$a;
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            a(653, (byte) (-bArr10[14]), (byte) (-bArr10[16]), objArr64);
                                            obj20 = cls12.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj20);
                                        }
                                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj20).invoke(null, objArr63);
                                        if (invoke5 != null) {
                                            java.lang.Object[] objArr65 = {invoke5, 42};
                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj21 == null) {
                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2593, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                byte[] bArr11 = $$a;
                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                a(653, (byte) (-bArr11[14]), (byte) (-bArr11[16]), objArr66);
                                                obj21 = cls13.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                            }
                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr65)).longValue();
                                            long j15 = ~longValue5;
                                            long j16 = ~((-644180377) | j6);
                                            strArr = strArr3;
                                            long j17 = (713 * longValue5) + 458012248047L + (((~(j15 | (-644180377))) | j16) * (-712)) + (((~(j15 | j6 | (-644180377))) | (~(longValue5 | (-644180377) | j5))) * (-712)) + ((j15 | j16) * 712) + 1901280901;
                                            i10 = i;
                                            if (((((int) j17) & ((((~((-1228567869) | i10)) | 1092236568 | (~(1765504317 | i18))) * 886) + 1649898937 + (((~(1228567868 | i18)) | 1629173017) * (-1772)) + ((~(1629173017 | i18)) * 886))) | (((int) (j17 >> 32)) & (((((~(1508003263 | i18)) | (~((-1349737622) | i10))) * com.visa.cbp.getCertUsage.getODAData) - 1694889319) + (((~(1508003263 | i10)) | (~((-1349737622) | i18))) * com.visa.cbp.getCertUsage.getODAData)))) == 477111747) {
                                                i11 = i18;
                                                str4 = str;
                                                i12 = 0;
                                                i13 = 0;
                                                while (i12 < 28) {
                                                    java.lang.String str8 = strArr[i12];
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    c("竉⸏\uf2ccꮋ淖䜫ꉸ\udf9dꉥ諛뭝怖", "⁈ㆌ\ue78c嚈", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "\u0000\u0000\u0000\u0000", (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr67);
                                                    java.lang.Object[] objArr68 = {((java.lang.String) objArr67[0]).intern().concat(java.lang.String.valueOf(str8))};
                                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                    if (obj22 == null) {
                                                        str5 = str4;
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf(str5, str5) + 3161, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33051));
                                                        byte[] bArr12 = $$a;
                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                        a(653, (byte) (-bArr12[14]), (byte) (-bArr12[16]), objArr69);
                                                        obj22 = cls14.getMethod((java.lang.String) objArr69[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj22);
                                                    } else {
                                                        str5 = str4;
                                                    }
                                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr68)).longValue();
                                                    long j18 = ~longValue6;
                                                    int i23 = i12;
                                                    int i24 = i13;
                                                    long j19 = ~(longValue6 | (-29490614));
                                                    java.lang.String str9 = str5;
                                                    int i25 = i11;
                                                    long j20 = (((((longValue6 * 371) - 10941017794L) + (((~(j5 | 29490613)) | (~(j18 | j6))) * (-370))) + ((((~(29490613 | j6)) | (~(j18 | j5))) | j19) * (-370))) + (j19 * 370)) - 1308177494;
                                                    if (((((int) (j20 >> 32)) & (((~(120031376 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 547914042 + ((i25 | (-1216365835)) * (-216)) + (((~(i25 | 120031376)) | 1317195034) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) | (((int) j20) & (((~(i25 | (-353013323))) * (-560)) + 1407765605 + ((~((-352323585) | i)) * (-560)) + (((~(i25 | (-1084213088))) | 1083523349) * 560)))) == 0) {
                                                        int i26 = DigitizedCardProfile + 97;
                                                        IccPrivateKeyCrtComponentsJson = i26 % 128;
                                                        if (i26 % 2 != 0) {
                                                            i14 = 0;
                                                            i13 = i24 + i14;
                                                            i12 = i23 + 1;
                                                            i10 = i;
                                                            str4 = str9;
                                                            i11 = i25;
                                                        }
                                                    }
                                                    i14 = 1;
                                                    i13 = i24 + i14;
                                                    i12 = i23 + 1;
                                                    i10 = i;
                                                    str4 = str9;
                                                    i11 = i25;
                                                }
                                                i3 = i11;
                                                i2 = i10;
                                                str2 = str4;
                                                if (i13 >= 25.2d) {
                                                    int i27 = (DigitizedCardProfile + 59) % 128;
                                                    IccPrivateKeyCrtComponentsJson = i27;
                                                    DigitizedCardProfile = (i27 + 25) % 128;
                                                    java.lang.Object[] objArr70 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                    int i28 = ~(i3 | 492299486);
                                                    java.lang.Object[] objArr71 = {-723739918, 16, java.lang.Integer.valueOf(((286285838 | i28) * (-970)) + 1263938491 + ((i28 | 206013648) * 970))};
                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj23 == null) {
                                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str2) + 50, android.view.View.MeasureSpec.getSize(0) + 2713, (char) android.graphics.Color.blue(0));
                                                        byte b5 = $$a[14];
                                                        short s3 = (short) (b5 - 1);
                                                        byte b6 = (byte) (-b5);
                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                        a(s3, b6, (byte) (b6 + 1), objArr72);
                                                        obj23 = cls15.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                    }
                                                    ((int[]) objArr70[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr71)).intValue();
                                                    return objArr70;
                                                }
                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr73);
                                                java.lang.Object[] objArr74 = {((java.lang.String) objArr73[0]).intern()};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj3 == null) {
                                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, 2807 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                    byte[] bArr13 = $$a;
                                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                    a(653, (byte) (-bArr13[14]), (byte) (-bArr13[16]), objArr75);
                                                    obj3 = cls16.getMethod((java.lang.String) objArr75[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                                }
                                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr74)).longValue();
                                                long j21 = ~longValue7;
                                                long j22 = j21 | j6;
                                                long j23 = 960725509 | longValue7;
                                                long j24 = ~(j23 | j5);
                                                long j25 = (longValue7 * 253) + 243063553777L + (((~(j21 | (-960725510))) | (~j22) | j24) * (-252)) + (j23 * (-252)) + ((j24 | (~(960725509 | j22))) * 252) + 329814558;
                                                j = (((int) j25) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j25 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                                                str3 = str2;
                                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr76);
                                                java.lang.Object[] objArr77 = {((java.lang.String) objArr76[0]).intern()};
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj4 == null) {
                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 29, 2807 - android.view.View.getDefaultSize(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                    byte[] bArr14 = $$a;
                                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                    a(653, (byte) (-bArr14[14]), (byte) (-bArr14[16]), objArr78);
                                                    obj4 = cls17.getMethod((java.lang.String) objArr78[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                                }
                                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr77)).longValue();
                                                long j26 = ~longValue8;
                                                long j27 = (-327536127) | j26;
                                                long j28 = (((-496) * longValue8) - 162457918496L) + ((~j27) * 497) + (((~(j27 | j5)) | (~(j26 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue8 | (-327536127))) | (~(327536126 | j26 | j5))) * 497) + 963003941;
                                                long j29 = (((int) (j28 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j28) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                                                if (j > 0 && j29 > 0) {
                                                    i8 = IccPrivateKeyCrtComponentsJson + 101;
                                                    i9 = i8 % 128;
                                                    DigitizedCardProfile = i9;
                                                    if (i8 % 2 != 0 ? j29 - 3 < j : (j29 | 3) < j) {
                                                        IccPrivateKeyCrtComponentsJson = (i9 + 93) % 128;
                                                        java.lang.Object[] objArr79 = {new int[]{i2}, new int[]{i2 ^ 247}, null, new int[1]};
                                                        java.lang.Object[] objArr80 = {-723739918, 16, java.lang.Integer.valueOf((((~(435548607 | i2)) * (-301)) - 621947530) + (((~((-416661818) | i2)) | (~(i3 | 292663702))) * (-301)) + (((~((-292663703) | i2)) | (-416661818)) * 301))};
                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj7 == null) {
                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                            byte b7 = $$a[14];
                                                            short s4 = (short) (b7 - 1);
                                                            byte b8 = (byte) (-b7);
                                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                            a(s4, b8, (byte) (b8 + 1), objArr81);
                                                            obj7 = cls18.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                        }
                                                        ((int[]) objArr79[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr80)).intValue();
                                                        return objArr79;
                                                    }
                                                }
                                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr82);
                                                java.lang.Object[] objArr83 = {((java.lang.String) objArr82[0]).intern()};
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj5 == null) {
                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 29, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2759, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                    byte[] bArr15 = $$a;
                                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                    a(653, (byte) (-bArr15[14]), (byte) (-bArr15[16]), objArr84);
                                                    obj5 = cls19.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                                }
                                                long j30 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr83)).longValue();
                                                long j31 = (-689367363) | j30;
                                                long j32 = ((r1 * (-344)) - 237142372528L) + (((~j31) | (~((-689367363) | j5))) * 345) + (((~(j30 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j31 | j5)) * 345) + 601172705;
                                                j2 = (((int) j32) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j32 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr85);
                                                java.lang.Object[] objArr86 = {((java.lang.String) objArr85[0]).intern()};
                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj6 == null) {
                                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, 2807 - android.text.TextUtils.getTrimmedLength(str3), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                    byte[] bArr16 = $$a;
                                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                    a(653, (byte) (-bArr16[14]), (byte) (-bArr16[16]), objArr87);
                                                    obj6 = cls20.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                                }
                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr86)).longValue();
                                                long j33 = longValue9 | j5;
                                                long j34 = (((-929) * longValue9) - 412175524480L) + (((~j33) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue9) * 930) + (((-888309321) | j33) * 465) + 402230747;
                                                long j35 = (((int) (j34 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j34) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                                                if (j2 <= 0 && j35 > 0 && j35 + 100 < j2) {
                                                    java.lang.Object[] objArr88 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr89 = {-723739918, 16, java.lang.Integer.valueOf(((((~(i3 | 704601711)) | 4723808) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 110279037) + (((~(i3 | 5119082)) | 704206437) * (-440)) + ((704601711 | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj24 == null) {
                                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2712 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                        byte b9 = $$a[14];
                                                        short s5 = (short) (b9 - 1);
                                                        byte b10 = (byte) (-b9);
                                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                        a(s5, b10, (byte) (b10 + 1), objArr90);
                                                        obj24 = cls21.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                                    }
                                                    ((int[]) objArr88[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr89)).intValue();
                                                    return objArr88;
                                                }
                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr91);
                                                java.lang.String intern30 = ((java.lang.String) objArr91[0]).intern();
                                                int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                                                char indexOf = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf, objArr92);
                                                java.lang.String intern31 = ((java.lang.String) objArr92[0]).intern();
                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr93);
                                                java.lang.String intern32 = ((java.lang.String) objArr93[0]).intern();
                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr94);
                                                java.lang.String intern33 = ((java.lang.String) objArr94[0]).intern();
                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr95);
                                                java.lang.String intern34 = ((java.lang.String) objArr95[0]).intern();
                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr96);
                                                java.lang.String intern35 = ((java.lang.String) objArr96[0]).intern();
                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr97);
                                                java.lang.String[] strArr4 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr97[0]).intern()};
                                                i4 = 0;
                                                while (true) {
                                                    if (i4 < 7) {
                                                        i5 = 0;
                                                        break;
                                                    }
                                                    java.lang.Object[] objArr98 = {strArr4[i4]};
                                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                                    if (obj25 == null) {
                                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myTid() >> 22), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1673, (char) (47940 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                                        byte[] bArr17 = $$a;
                                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                        a(653, (byte) (-bArr17[14]), (byte) (-bArr17[16]), objArr99);
                                                        obj25 = cls22.getMethod((java.lang.String) objArr99[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj25);
                                                    }
                                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr98)).longValue();
                                                    long j36 = ((((((-219) * longValue10) - 9276155876L) + (((~((~longValue10) | 41973555)) | (~((j6 | (-41973556)) | longValue10))) * 220)) + (((~(j6 | longValue10)) | (-41973556)) * (-440))) + ((((-41973556) | longValue10) | j5) * 220)) - 1583556626;
                                                    int i29 = (int) (j36 >> 32);
                                                    int i30 = (int) j36;
                                                    int i31 = ~(1870119054 | i2);
                                                    if (((i29 & (((((~(636568533 | i2)) | (-1584061014)) * 398) - 311367406) + (((~(i3 | 636568533)) | (-1584061014)) * 398))) | (i30 & ((((~(i3 | (-432892645))) | i31) * 1150) + 334239082 + ((i31 | (~(i3 | (-1870119055)))) * (-575)) + (((~((-432892645) | i2)) | (~(i3 | 432892644))) * 575)))) != 0) {
                                                        i5 = i4 + 90;
                                                        break;
                                                    }
                                                    i4++;
                                                }
                                                if (i5 == 0) {
                                                    java.lang.Object[] objArr100 = {new int[]{i2}, new int[]{i5 ^ i2}, null, new int[1]};
                                                    java.lang.Object[] objArr101 = {-723739918, 16, java.lang.Integer.valueOf(((((~(i3 | (-96507721))) | 805833240) * (-1042)) - 1617436360) + (((-96507721) | i2) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-805833241) | i2)) | 805832720 | (~(i3 | (-96507201)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj26 == null) {
                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                        byte b11 = $$a[14];
                                                        short s6 = (short) (b11 - 1);
                                                        byte b12 = (byte) (-b11);
                                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                        a(s6, b12, (byte) (b12 + 1), objArr102);
                                                        obj26 = cls23.getMethod((java.lang.String) objArr102[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                                                    }
                                                    ((int[]) objArr100[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr101)).intValue();
                                                    return objArr100;
                                                }
                                                try {
                                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                    c("䭝緱\u00ad\ueac1⫕槱섟⫼釪纎⾼纍여", "ꖐ\uea16腕ᇐ", 1441404580 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "\u0000\u0000\u0000\u0000", (char) (53377 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr103);
                                                    try {
                                                        java.lang.Object[] objArr104 = {((java.lang.String) objArr103[0]).intern()};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, 1921 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                            byte[] bArr18 = $$a;
                                                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                            a(653, (byte) (-bArr18[14]), (byte) (-bArr18[16]), objArr105);
                                                            obj27 = cls24.getMethod((java.lang.String) objArr105[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj27);
                                                        }
                                                        java.lang.Object invoke7 = ((java.lang.reflect.Method) obj27).invoke(null, objArr104);
                                                        if (invoke7 != null) {
                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                            c("떬촓찬Հ䯦샓끣鈟\u20ce蜩䟇", "\ueeb3邴埸\ue12c", (-124734226) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0000\u0000\u0000\u0000", (char) (android.os.Process.myPid() >> 22), objArr106);
                                                            try {
                                                                java.lang.Object[] objArr107 = {invoke7, new java.lang.String[]{((java.lang.String) objArr106[0]).intern()}};
                                                                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                                if (obj28 == null) {
                                                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 43, 2881 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                                                    byte[] bArr19 = $$a;
                                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr19[14]), (byte) (-bArr19[16]), objArr108);
                                                                    obj28 = cls25.getMethod((java.lang.String) objArr108[0], java.lang.String.class, java.lang.String[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj28);
                                                                }
                                                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr107)).longValue();
                                                                long j37 = ~longValue11;
                                                                long j38 = ~((-786443045) | j5);
                                                                long j39 = ~(786443044 | longValue11);
                                                                long j40 = (((((408 * longValue11) + 639378195585L) + (((~(j37 | (-786443045))) | j38) * (-814))) + ((((~(j37 | j6)) | j39) | j38) * 407)) + (((~(longValue11 | j5)) | ((~(786443044 | j5)) | j39)) * 407)) - 1242268734;
                                                            } catch (java.lang.Throwable th2) {
                                                                java.lang.Throwable cause = th2.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th2;
                                                            }
                                                        }
                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                        b(true, "\u0001�\u0000\ufffb\u0011\u000fￊ\uffff\u0012\u000fￊ\u0010\u0005\n\u0005\n\u000b\t", 247 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, android.widget.ExpandableListView.getPackedPositionChild(0L) + 19, objArr109);
                                                        try {
                                                            java.lang.Object[] objArr110 = {((java.lang.String) objArr109[0]).intern()};
                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj29 == null) {
                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1921 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                byte[] bArr20 = $$a;
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                a(653, (byte) (-bArr20[14]), (byte) (-bArr20[16]), objArr111);
                                                                obj29 = cls26.getMethod((java.lang.String) objArr111[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                                            }
                                                            invoke2 = ((java.lang.reflect.Method) obj29).invoke(null, objArr110);
                                                        } catch (java.lang.Throwable th3) {
                                                            java.lang.Throwable cause2 = th3.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        java.lang.Throwable cause3 = th4.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (java.lang.Exception unused) {
                                                }
                                                if (invoke2 != null) {
                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                    c("竫\ueda7㔷펣퀵䎉쨒", "ݭࢲ웨ݎ", (-402083321) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr112);
                                                    if (invoke2.equals(((java.lang.String) objArr112[0]).intern())) {
                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                        b(true, "\f\u000b\u0001\u000b\n�\b\u000b\u000b�\ufffb\ufffb\ufff9\ufff7\f\u0007\u0007\nￆ\u000b\u0011\u000bￆ", 251 - android.view.KeyEvent.keyCodeFromString(str3), 7 - android.graphics.Color.argb(0, 0, 0, 0), 22 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr113);
                                                        try {
                                                            java.lang.Object[] objArr114 = {((java.lang.String) objArr113[0]).intern()};
                                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj30 == null) {
                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) android.text.TextUtils.getTrimmedLength(str3));
                                                                byte[] bArr21 = $$a;
                                                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                a(653, (byte) (-bArr21[14]), (byte) (-bArr21[16]), objArr115);
                                                                obj30 = cls27.getMethod((java.lang.String) objArr115[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj30);
                                                            }
                                                            java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj30).invoke(null, objArr114);
                                                            if (str10 != null && (parseInt = java.lang.Integer.parseInt(str10)) != 0) {
                                                                i6 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                if (i6 == 0) {
                                                                    IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 11) % 128;
                                                                    java.lang.Object[] objArr116 = {new int[]{i2}, new int[]{i6 ^ i2}, null, new int[1]};
                                                                    java.lang.Object[] objArr117 = {-723739918, 16, java.lang.Integer.valueOf((((~(i3 | (-39846945))) | (-669478576) | (~(65285152 | i2))) * (-68)) + 1409974475 + ((~(i3 | (-604193424))) * (-68)) + (((~(i3 | (-65285153))) | (-644040368)) * 68))};
                                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj31 == null) {
                                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 2713, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                                        byte b13 = $$a[14];
                                                                        short s7 = (short) (b13 - 1);
                                                                        byte b14 = (byte) (-b13);
                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                        a(s7, b14, (byte) (b14 + 1), objArr118);
                                                                        obj31 = cls28.getMethod((java.lang.String) objArr118[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                                    }
                                                                    ((int[]) objArr116[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr117)).intValue();
                                                                    return objArr116;
                                                                }
                                                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                c("䭝緱\u00ad\ueac1⫕槱섟⫼釪纎⾼纍여", "ꖐ\uea16腕ᇐ", 1441404580 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 53377), objArr119);
                                                                java.lang.Object[] objArr120 = {((java.lang.String) objArr119[0]).intern()};
                                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                if (obj32 == null) {
                                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 40, android.text.TextUtils.indexOf(str3, str3) + 1921, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                                                    byte[] bArr22 = $$a;
                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr22[14]), (byte) (-bArr22[16]), objArr121);
                                                                    obj32 = cls29.getMethod((java.lang.String) objArr121[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj32);
                                                                }
                                                                java.lang.Object invoke8 = ((java.lang.reflect.Method) obj32).invoke(null, objArr120);
                                                                if (invoke8 != null) {
                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                    c("떬촓찬Հ䯦샓끣鈟\u20ce蜩䟇", "\ueeb3邴埸\ue12c", (-124734226) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr122);
                                                                    java.lang.Object[] objArr123 = {invoke8, new java.lang.String[]{((java.lang.String) objArr122[0]).intern()}};
                                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                                    if (obj33 == null) {
                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getCapsMode(str3, 0, 0), 2879 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.view.View.getDefaultSize(0, 0));
                                                                        byte[] bArr23 = $$a;
                                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                        a(653, (byte) (-bArr23[14]), (byte) (-bArr23[16]), objArr124);
                                                                        obj33 = cls30.getMethod((java.lang.String) objArr124[0], java.lang.String.class, java.lang.String[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj33);
                                                                    }
                                                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr123)).longValue();
                                                                    long j41 = ((((530 * longValue12) - 1014645032702L) + (((~(j6 | (-1914424592))) | (~((-1914424592) | longValue12))) * 529)) + (((~longValue12) | (~((-1914424592) | j5))) * 529)) - 114287187;
                                                                    int i32 = (int) j41;
                                                                    int i33 = ~(i3 | (-489798976));
                                                                    if (((((int) (j41 >> 32)) & (((((~(i3 | (-1052583280))) | ((~(i3 | 1805157605)) | (~(1052583279 | i2)))) * 959) - 585435271) + (((~(i3 | 1052583279)) | (~(1805157605 | i2)) | (~((-1052583280) | i2))) * 959))) | (i32 & (((((((~(i3 | 947427434)) | (-1031388544)) | (~(i3 | 489798975))) | (~((-405837867) | i2))) * (-84)) - 1905160647) + (((~(489798975 | i2)) | (-947427435) | i33) * (-84)) + ((i33 | 405837866) * 84)))) != 1) {
                                                                        int indexOf2 = android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                                                                        int offsetAfter = android.text.TextUtils.getOffsetAfter(str3, 0);
                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                        b(false, "\u001b\bￖ\u0013\u0016\n\b\u0013ￖￖ\u000b\b", 235 - indexOf2, 9 - (windowTouchSlop >> 8), 12 - offsetAfter, objArr125);
                                                                        java.lang.String intern36 = ((java.lang.String) objArr125[0]).intern();
                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                        b(true, "ￖ\u0013\b\n\u0016\u0013ￖ\b\u001b\b\u000bￖￖ\u0015\u0010\t", 235 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr126);
                                                                        java.lang.String intern37 = ((java.lang.String) objArr126[0]).intern();
                                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                        c("姗껌嚧ꞔ㚃媸㋱㢋ﳑ㡷隔㔙癹Ǡ\uea8c개吥", "팉䣤롋峲", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1263068371, "\u0000\u0000\u0000\u0000", (char) (62136 - (android.os.Process.myTid() >> 22)), objArr127);
                                                                        java.lang.String intern38 = ((java.lang.String) objArr127[0]).intern();
                                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                        c("\uf789썘\uf5be잗\ue663ơ", "劔ꥒ饷犦", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 42649), objArr128);
                                                                        java.lang.String intern39 = ((java.lang.String) objArr128[0]).intern();
                                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                        c("竉⸏\uf2ccꮋ淖䜫ꉸ\udf9dꉥ諛뭝怖", "⁈ㆌ\ue78c嚈", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.os.Process.myTid() >> 22), objArr129);
                                                                        java.lang.String intern40 = ((java.lang.String) objArr129[0]).intern();
                                                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                        b(true, "\u0007ￔ\u0012\n\u0019\u0018\u001e\u0018ￔￔ\u0019\u001d\nￓￔ\u0013\u000e", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 238, android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 10, android.graphics.Color.alpha(0) + 17, objArr130);
                                                                        java.lang.String intern41 = ((java.lang.String) objArr130[0]).intern();
                                                                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                        b(true, "\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0006\u0007\u0002\u0014\r\n\u0002\u0007\uffd0\u000f\n\u0003\uffd0\u000e", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, objArr131);
                                                                        java.lang.String intern42 = ((java.lang.String) objArr131[0]).intern();
                                                                        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                                                        char indexOf3 = (char) (android.text.TextUtils.indexOf(str3, str3) + 63888);
                                                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                        c("携㧟鄛⯕瀏廀ﶌ\uf479秐눪꒤穵\u2fec孪\ued34\uf0c1", "\ufadb鵧退\ue1f9", (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", indexOf3, objArr132);
                                                                        java.lang.String intern43 = ((java.lang.String) objArr132[0]).intern();
                                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                        b(true, "\u001a\u0014\uffd0\uffd0\u0015\u0010\u0010\u0013ￎ\u0005\u0006\u0006\u000fￎ\u0006\u0018\uffd0\u0013\u0014\u0016\uffd0\u000e\u0006\u0015\u0014", 242 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3, android.os.Process.getGidForName(str3) + 26, objArr133);
                                                                        java.lang.String intern44 = ((java.lang.String) objArr133[0]).intern();
                                                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                        b(true, "\u000e\t\u0002\u0018ￏ\r\u0005\u0014\u0013\u0019\u0013ￏￏ", 242 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 12 - android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 14, objArr134);
                                                                        java.lang.String intern45 = ((java.lang.String) objArr134[0]).intern();
                                                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                        b(true, "\u001a\u001b\u001dￗￗ\u0016\u0011\nￗ", android.text.TextUtils.indexOf(str3, str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, 9 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr135);
                                                                        java.lang.String intern46 = ((java.lang.String) objArr135[0]).intern();
                                                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                        c("磮턒廍\uf367맲\uee35갘ᅰ", "뙌\ue828폏鬢", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, "\u0000\u0000\u0000\u0000", (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr136);
                                                                        java.lang.String[] strArr5 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr136[0]).intern()};
                                                                        int i34 = 0;
                                                                        while (i34 < 12) {
                                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                            sb.append(strArr5[i34]);
                                                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                            b(true, "\uffff\u0001", android.graphics.Color.green(0) + 263, 1 - android.view.View.getDefaultSize(0, 0), (android.os.Process.myTid() >> 22) + 2, objArr137);
                                                                            sb.append(((java.lang.String) objArr137[0]).intern());
                                                                            java.lang.Object[] objArr138 = {sb.toString()};
                                                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                            if (obj34 == null) {
                                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) (android.view.KeyEvent.keyCodeFromString(str3) + 33099));
                                                                                java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                                a(41, (byte) (-$$a[23]), r8[21], objArr139);
                                                                                obj34 = cls31.getMethod((java.lang.String) objArr139[0], java.lang.String.class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj34);
                                                                            }
                                                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr138)).longValue();
                                                                            long j42 = ~(1109828722 | longValue13);
                                                                            long j43 = ~longValue13;
                                                                            j3 = j5;
                                                                            long j44 = (989 * longValue13) + 2191911727925L + ((j5 | j42) * 988) + (((~(j43 | (-1109828723))) | (~(j6 | (-1109828723)))) * (-1976)) + (((~(j43 | j3)) | j42 | (~(j6 | longValue13))) * 988) + 2105263626;
                                                                            if (((((int) j44) & ((((((~(i3 | (-206980257))) | 1644206666) | (~((-1661508172) | i2))) * (-68)) - 2052529847) + ((~(i3 | (-17301506))) * (-68)) + (((~(i3 | 1661508171)) | (-224281762)) * 68))) | (((int) (j44 >> 32)) & ((((~((-2121885810) | i2)) | 735855075) * (-465)) + 1976267506 + (((~(735855075 | i2)) | (-2121885810)) * 930) + (((-1411459089) | i2) * 465)))) != 0) {
                                                                                i7 = i34 + 110;
                                                                                break;
                                                                            }
                                                                            i34++;
                                                                            j5 = j3;
                                                                        }
                                                                    }
                                                                }
                                                                j3 = j5;
                                                                i7 = 0;
                                                                if (i7 != 0) {
                                                                    java.lang.Object[] objArr140 = {new int[]{i2}, new int[]{i7 ^ i2}, null, new int[1]};
                                                                    java.lang.Object[] objArr141 = {-723739918, 16, java.lang.Integer.valueOf((((~(i3 | 309098488)) | (~((-1018424009) | i2)) | (~(i3 | 1018424008))) * 959) + 765263502 + (((~(309098488 | i2)) | (~(i3 | (-1018424009))) | (~(i2 | 1018424008))) * 959))};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj35 == null) {
                                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) android.view.View.getDefaultSize(0, 0));
                                                                        byte b15 = $$a[14];
                                                                        short s8 = (short) (b15 - 1);
                                                                        byte b16 = (byte) (-b15);
                                                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                                        a(s8, b16, (byte) (b16 + 1), objArr142);
                                                                        obj35 = cls32.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                                    }
                                                                    ((int[]) objArr140[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr141)).intValue();
                                                                    return objArr140;
                                                                }
                                                                long[] jArr = {472001035};
                                                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                b(false, "\u000b\r\u0013\f\u0012\u0011ￍ\u000e\u0010\r\u0001ￍ\u0011\u0003\n\u0004ￍ", 244 - android.graphics.ImageFormat.getBitsPerPixel(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 6, 17 - (android.os.Process.myTid() >> 22), objArr143);
                                                                java.lang.Object[] objArr144 = {((java.lang.String) objArr143[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                if (obj36 == null) {
                                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3096, (char) android.graphics.Color.red(0));
                                                                    byte[] bArr24 = $$a;
                                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr24[14]), (byte) (-bArr24[16]), objArr145);
                                                                    obj36 = cls33.getMethod((java.lang.String) objArr145[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj36);
                                                                }
                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, objArr144)).longValue();
                                                                long j45 = ~((~longValue14) | (-352759269));
                                                                long j46 = ~(j3 | (-352759269));
                                                                long j47 = ((((((-657) * longValue14) - 232468358271L) + ((((~(longValue14 | 352759268)) | j45) | j46) * (-658))) + (658 * j45)) + ((j45 | j46) * 658)) - 1557888641;
                                                                int i35 = ((((int) (j47 >> 32)) & (((((i3 | (-2145320702)) * (-192)) + (-1788177110)) + (((~(i3 | (-1925774489))) | 1656772624) * (-384))) + ((((~((-1656772625) | i2)) | (~(i3 | (-269001865)))) | (~((-219546214) | i2))) * 192))) | (((int) j47) & (((((~(i3 | (-1379777437))) * (-560)) + 332337957) + ((~((-1343299985) | i2)) * (-560))) + (((~(i3 | (-57448974))) | 20971521) * 560)))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                                                                if (i35 != 0) {
                                                                    java.lang.Object[] objArr146 = {new int[]{i2}, new int[]{i35 ^ i2}, null, new int[1]};
                                                                    java.lang.Object[] objArr147 = {-723739918, 16, java.lang.Integer.valueOf(((((~(i3 | (-134013992))) | 95707143) * 98) - 1413649911) + (((~(i3 | (-575311529))) | (-134013992) | (~(575311528 | i2))) * (-49)) + (((~((-134013992) | i2)) | (-671018672)) * 49))};
                                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj37 == null) {
                                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                                        byte b17 = $$a[14];
                                                                        short s9 = (short) (b17 - 1);
                                                                        byte b18 = (byte) (-b17);
                                                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                                        a(s9, b18, (byte) (b18 + 1), objArr148);
                                                                        obj37 = cls34.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                                    }
                                                                    ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr147)).intValue();
                                                                    return objArr146;
                                                                }
                                                                long[] jArr2 = {472001035};
                                                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                                b(true, "ￌ\u0016\u0000\u0006\t\f\rￌ\u0015\u0012\u000b\u0006\t\u0002\u0010ￌ\u0010\u0003ￌ\u0010\u0016\u0010", 246 - android.text.TextUtils.getCapsMode(str3, 0, 0), android.view.View.getDefaultSize(0, 0) + 1, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, objArr149);
                                                                try {
                                                                    bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr149[0]).intern()));
                                                                    j4 = 0;
                                                                } catch (java.io.IOException unused2) {
                                                                    bufferedInputStream2 = null;
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                    bufferedInputStream = null;
                                                                }
                                                                while (true) {
                                                                    try {
                                                                        int read = bufferedInputStream2.read();
                                                                        if (read != -1) {
                                                                            j4 = ((j4 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                            int i36 = 0;
                                                                            while (i36 <= 0) {
                                                                                if (j4 == jArr2[i36]) {
                                                                                    int i37 = DigitizedCardProfile + 45;
                                                                                    IccPrivateKeyCrtComponentsJson = i37 % 128;
                                                                                    if (i37 % 2 != 0) {
                                                                                        i36++;
                                                                                    }
                                                                                    try {
                                                                                        bufferedInputStream2.close();
                                                                                    } catch (java.lang.Exception unused3) {
                                                                                    }
                                                                                    if (i36 != 0) {
                                                                                        java.lang.Object[] objArr150 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                                        java.lang.Object[] objArr151 = {-723739918, 16, java.lang.Integer.valueOf((((~(i3 | (-702503235))) | 697778242) * 98) + 917777288 + (((~(i3 | (-6822286))) | (-702503235) | (~(6822285 | i2))) * (-49)) + (((~((-702503235) | i2)) | (-704600528)) * 49))};
                                                                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                        if (obj38 == null) {
                                                                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, android.view.View.MeasureSpec.getMode(0) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                                                                                            byte b19 = $$a[14];
                                                                                            short s10 = (short) (b19 - 1);
                                                                                            byte b20 = (byte) (-b19);
                                                                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                                                            a(s10, b20, (byte) (b20 + 1), objArr152);
                                                                                            obj38 = cls35.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                                                        }
                                                                                        ((int[]) objArr150[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr151)).intValue();
                                                                                        return objArr150;
                                                                                    }
                                                                                } else {
                                                                                    i36++;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (java.io.IOException unused4) {
                                                                    } catch (java.lang.Throwable th6) {
                                                                        th = th6;
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
                                                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                                if (obj39 == null) {
                                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1890, (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3601));
                                                                    byte[] bArr25 = $$a;
                                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr25[14]), (byte) (-bArr25[16]), objArr153);
                                                                    obj39 = cls36.getMethod((java.lang.String) objArr153[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj39);
                                                                }
                                                                long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, null)).longValue();
                                                                long j48 = ~longValue15;
                                                                long j49 = ~(j3 | (-335123856));
                                                                long j50 = ~(335123855 | longValue15);
                                                                long j51 = (-1544124524) + (408 * longValue15) + 272455694928L + (((~(j48 | (-335123856))) | j49) * (-814)) + (((~(j48 | j6)) | j50 | j49) * 407) + (((~(j3 | 335123855)) | j50 | (~(longValue15 | j3))) * 407);
                                                                if (((((int) j51) & ((((~(i3 | 2127256391)) | (-2146131936)) * 98) + 327200498 + (((~(i3 | (-690029982))) | 2127256391 | (~(690029981 | i2))) * (-49)) + (((~(2127256391 | i2)) | 1456101954) * 49))) | (((int) (j51 >> 32)) & ((((~(i3 | (-770021530))) | (-2087719356)) * (-328)) + 83147746 + (((-2087719356) | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(770021529 | i2)) | (-2113247676) | (~(i3 | (-744493210)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) != 0) {
                                                                    java.lang.Object[] objArr154 = {new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i35}, null, new int[1]};
                                                                    java.lang.Object[] objArr155 = {-723739918, 16, java.lang.Integer.valueOf((((((~((-8114606) | i2)) | 4948256) * 576) + 159719695) + (((~(i3 | (-3166350))) | 696262658) * 576)) - 1444771840)};
                                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj40 == null) {
                                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, android.view.View.getDefaultSize(0, 0) + 2713, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                        byte b21 = $$a[14];
                                                                        short s11 = (short) (b21 - 1);
                                                                        byte b22 = (byte) (-b21);
                                                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                                        a(s11, b22, (byte) (b22 + 1), objArr156);
                                                                        obj40 = cls37.getMethod((java.lang.String) objArr156[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                                                    }
                                                                    ((int[]) objArr154[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr155)).intValue();
                                                                    return objArr154;
                                                                }
                                                                java.lang.Object[] objArr157 = {2};
                                                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                                if (obj41 == null) {
                                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27, 2364 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.text.TextUtils.indexOf(str3, str3));
                                                                    byte[] bArr26 = $$a;
                                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr26[14]), (byte) (-bArr26[16]), objArr158);
                                                                    obj41 = cls38.getMethod((java.lang.String) objArr158[0], java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj41);
                                                                }
                                                                long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr157)).longValue();
                                                                long j52 = ~(418749787 | longValue16);
                                                                long j53 = (((-396) * longValue16) - 166662415624L) + (((~(j6 | 418749787)) | j52 | (~(j6 | longValue16))) * (-397)) + ((-397) * j52) + (((~((~longValue16) | (-418749788))) | j3 | j52) * 397) + 1826659987;
                                                                if (((((int) (j53 >> 32)) & (((((~(i3 | (-1295042904))) | 142183507) * 226) - 2055567968) + (((~((-142183508) | i2)) | 4785152 | (~(i3 | (-1157644549)))) * (-113)) + ((~((-1295042904) | i2)) * 113))) | (((int) j53) & (((((~(i3 | (-1362157118))) | (-1495583769)) * (-865)) - 887162534) + ((~(1362157117 | i2)) * 865) + (((~(i3 | 1362157117)) | (~(i3 | (-1495583769)))) * 865)))) == 2) {
                                                                    java.lang.Object[] objArr159 = {new int[]{i2}, new int[]{i2 ^ 270}, null, new int[1]};
                                                                    java.lang.Object[] objArr160 = {-723739918, 16, java.lang.Integer.valueOf((((632581135 | i2) * 614) - 305784323) + (((~(i3 | (-63541103))) | 25168910 | (~(i3 | 645784417))) * (-1228)) + (((~(i3 | (-38372193))) | (~(i3 | 670953327))) * 614))};
                                                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj42 == null) {
                                                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, str3, 0, 0) + 50, 2713 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.getOffsetAfter(str3, 0));
                                                                        byte b23 = $$a[14];
                                                                        short s12 = (short) (b23 - 1);
                                                                        byte b24 = (byte) (-b23);
                                                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                                        a(s12, b24, (byte) (b24 + 1), objArr161);
                                                                        obj42 = cls39.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                                                    }
                                                                    ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr160)).intValue();
                                                                    return objArr159;
                                                                }
                                                                java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                                if (obj43 == null) {
                                                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3197 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                                    a(41, (byte) (-$$a[23]), r2[21], objArr162);
                                                                    obj43 = cls40.getMethod((java.lang.String) objArr162[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj43);
                                                                }
                                                                long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                                                                long j54 = ~(j3 | 779139466);
                                                                long j55 = ~longValue17;
                                                                long j56 = (((-139) * longValue17) - 109858664847L) + (((~(779139466 | longValue17)) | j54) * (-280)) + ((j54 | (~(j55 | j3))) * 140) + (((~(longValue17 | j6 | 779139466)) | (~(779139466 | j55 | j3)) | (~(j55 | j6 | (-779139467)))) * 140) + 875384828;
                                                                int i38 = ~(i3 | 2028387744);
                                                                if (((((int) (j56 >> 32)) & ((((-2080309238) | i38) * (-712)) + 334089338 + (((~(i3 | 2080309237)) | (~((-51921494) | i2))) * (-712)) + ((i38 | 591161333) * 712))) | (((int) j56) & (((~(1431140821 | i2)) * (-301)) + 1689469284 + (((~((-1426929793) | i2)) | (~(i3 | 1430811093))) * (-301)) + (((~((-1430811094) | i2)) | (-1426929793)) * 301)))) != 0) {
                                                                    java.lang.Object[] objArr163 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr164 = {-723739918, 16, java.lang.Integer.valueOf((((~((-293947399) | i2)) | (-1004404695)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 166145748 + ((~(i3 | (-293947399))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                                                    java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj44 == null) {
                                                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.KeyEvent.keyCodeFromString(str3) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                        byte b25 = $$a[14];
                                                                        short s13 = (short) (b25 - 1);
                                                                        byte b26 = (byte) (-b25);
                                                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                                        a(s13, b26, (byte) (b26 + 1), objArr165);
                                                                        obj44 = cls41.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                                                    }
                                                                    ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr164)).intValue();
                                                                    return objArr163;
                                                                }
                                                                java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                                if (obj45 == null) {
                                                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 3197 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                    byte[] bArr27 = $$a;
                                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr27[14]), (byte) (-bArr27[16]), objArr166);
                                                                    obj45 = cls42.getMethod((java.lang.String) objArr166[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj45);
                                                                }
                                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, null)).longValue();
                                                                long j57 = (~(977282153 | (~longValue18))) | (~(j3 | 977282153));
                                                                long j58 = ((-495) * longValue18) + 483754666230L + (992 * j57) + ((j57 | (~(j6 | (-977282154) | longValue18))) * (-496)) + ((longValue18 | j3) * 496) + 1930152044;
                                                                if (((((int) (j58 >> 32)) & ((((~(i3 | (-1516031809))) | 1514964544 | (~(i3 | 78805397))) * (-1136)) + 1738041050 + (((~((-1516031809) | i2)) | (~(78805397 | i2)) | (~(i3 | (-77738134)))) * (-568)) + (((~(i3 | 1516031808)) | (~(i3 | (-78805398))) | (~((-1514964545) | i2))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) | (((int) j58) & ((((i3 | 1500190377) * (-757)) - 833027978) + ((~((-8421637) | i2)) * 1514) + (((~(i3 | (-1357550509))) | 1349128872 | (~(1508612013 | i2))) * 757)))) != 0) {
                                                                    java.lang.Object[] objArr167 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr168 = {-723739918, 16, java.lang.Integer.valueOf(((490557780 | i2) * (-50)) + 1413925681 + (((~((-218628433) | i2)) | (~(i3 | (-139308)))) * 50) + (((~(i3 | (-218767740))) | 139307 | (~(i3 | 490557780))) * 50))};
                                                                    java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj46 == null) {
                                                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), android.text.TextUtils.indexOf(str3, str3, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                        byte b27 = $$a[14];
                                                                        short s14 = (short) (b27 - 1);
                                                                        byte b28 = (byte) (-b27);
                                                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                                        a(s14, b28, (byte) (b28 + 1), objArr169);
                                                                        obj46 = cls43.getMethod((java.lang.String) objArr169[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                                                    }
                                                                    ((int[]) objArr167[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr168)).intValue();
                                                                    return objArr167;
                                                                }
                                                                java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                                if (obj47 == null) {
                                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, 2836 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.text.TextUtils.indexOf(str3, str3));
                                                                    byte[] bArr28 = $$a;
                                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr28[14]), (byte) (-bArr28[16]), objArr170);
                                                                    obj47 = cls44.getMethod((java.lang.String) objArr170[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj47);
                                                                }
                                                                long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, null)).longValue();
                                                                long j59 = ~longValue19;
                                                                long j60 = ((((((-958) * longValue19) + 466775660382L) + ((((~(j59 | j6)) | (~(j3 | 487239728))) | (~(j6 | (-487239729)))) * 959)) + ((~(longValue19 | (-487239729))) * (-959))) + ((((~(j6 | 487239728)) | (~(j59 | j3))) | (~(j3 | (-487239729)))) * 959)) - 319055026;
                                                                int i39 = (int) j60;
                                                                int i40 = ~(i3 | (-170697285));
                                                                if (((((int) (j60 >> 32)) & ((((i3 | 1350828546) * (-192)) - 1788177110) + (((~(i3 | (-85709277))) | 688588) * (-384)) + (((~((-688589) | i2)) | (~(i3 | (-85020689))) | (~(1436537822 | i2))) * 192))) | (i39 & ((((~(170701413 | i2)) | (-1266529126) | i40) * (-470)) + 294538513 + ((i40 | (~((-1095827713) | i2))) * 470)))) != 0) {
                                                                    java.lang.Object[] objArr171 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr172 = {-723739918, 16, java.lang.Integer.valueOf(((((~((-21015118) | i2)) | 16812032) * 1504) - 127520065) + ((~((-4203086) | i2)) * (-1504)) + 1321353232)};
                                                                    java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj48 == null) {
                                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str3), android.view.View.MeasureSpec.getMode(0) + 2713, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                        byte b29 = $$a[14];
                                                                        short s15 = (short) (b29 - 1);
                                                                        byte b30 = (byte) (-b29);
                                                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                                        a(s15, b30, (byte) (b30 + 1), objArr173);
                                                                        obj48 = cls45.getMethod((java.lang.String) objArr173[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                                                    }
                                                                    ((int[]) objArr171[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr172)).intValue();
                                                                    return objArr171;
                                                                }
                                                                long[] jArr3 = {624887784092251L};
                                                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                                b(false, "\u000b\r\u0013\f\u0012\u0011ￍ\u000e\u0010\r\u0001ￍ\u0011\u0003\n\u0004ￍ", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 6 - android.view.KeyEvent.keyCodeFromString(str3), android.graphics.Color.blue(0) + 17, objArr174);
                                                                java.lang.Object[] objArr175 = {((java.lang.String) objArr174[0]).intern(), 3, 2251799813685247L, jArr3};
                                                                java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                if (obj49 == null) {
                                                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3096, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                    byte[] bArr29 = $$a;
                                                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr29[14]), (byte) (-bArr29[16]), objArr176);
                                                                    obj49 = cls46.getMethod((java.lang.String) objArr176[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj49);
                                                                }
                                                                long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, objArr175)).longValue();
                                                                long j61 = ~(1044466065 | longValue20);
                                                                long j62 = ((((((-69) * longValue20) - 74157090686L) + (((~(longValue20 | j3)) | j61) * (-140))) + ((~(((-1044466066) | longValue20) | j3)) * 70)) + ((((~((~longValue20) | (-1044466066))) | j61) | (~(j3 | (-1044466066)))) * 70)) - 866181844;
                                                                if (((((int) (j62 >> 32)) & (((((715600006 | r2) * (-220)) - 863446854) + (((~((-2142140879) | i2)) | 715534470) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1979876112)) | (((int) j62) & ((((~(i3 | 1524399141)) | (-87172732)) * (-865)) + 417474644 + ((~((-1524399142) | i2)) * 865) + (((~(i3 | (-1524399142))) | (~(i3 | (-87172732)))) * 865)))) != 0) {
                                                                    java.lang.Object[] objArr177 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                                    int i41 = ~(i3 | 202239996);
                                                                    java.lang.Object[] objArr178 = {-723739918, 16, java.lang.Integer.valueOf((((~(i3 | (-507085524))) | 201949904 | (~(i3 | (-202239997))) | (~(507375615 | i2))) * (-84)) + 163126971 + (((~(i2 | (-202239997))) | 507085523 | i41) * (-84)) + ((i41 | (-507375616)) * 84))};
                                                                    java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj50 == null) {
                                                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.alpha(0));
                                                                        byte b31 = $$a[14];
                                                                        short s16 = (short) (b31 - 1);
                                                                        byte b32 = (byte) (-b31);
                                                                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                                        a(s16, b32, (byte) (b32 + 1), objArr179);
                                                                        obj50 = cls47.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                                                    }
                                                                    ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr178)).intValue();
                                                                    return objArr177;
                                                                }
                                                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                                b(false, "ￍ\u0002\u0003\u0014ￍ\u0018\u0017\u0005\u0007\u0011\t", 245 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 11 - android.text.TextUtils.indexOf(str3, str3), 11 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr180);
                                                                java.lang.Object[] objArr181 = {((java.lang.String) objArr180[0]).intern()};
                                                                java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                if (obj51 == null) {
                                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3160, (char) (android.text.TextUtils.getTrimmedLength(str3) + 33099));
                                                                    byte[] bArr30 = $$a;
                                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr30[14]), (byte) (-bArr30[16]), objArr182);
                                                                    obj51 = cls48.getMethod((java.lang.String) objArr182[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj51);
                                                                }
                                                                long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, objArr181)).longValue();
                                                                long j63 = ~longValue21;
                                                                long j64 = ((((((-565) * longValue21) - 488388195981L) + (((~(longValue21 | 861354842)) | (~(j3 | 861354842))) * (-566))) + ((~((-861354843) | j63)) * 566)) + ((~((861354842 | j63) | j3)) * 566)) - 476313265;
                                                                int i42 = ~((-1432930018) | i2);
                                                                if (((((int) (j64 >> 32)) & ((((~(782629243 | i2)) | 16778244) * (-140)) + 1064915682 + ((~(799407487 | i2)) * 70) + (((~(654597167 | i2)) | 161588564) * 70))) | (((int) j64) & (((67592 | i42) * (-196)) + 270678941 + ((i42 | (-1432997610)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)))) != 0) {
                                                                    java.lang.Object[] objArr183 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr184 = {-723739918, 16, java.lang.Integer.valueOf(((((~((-474647622) | i2)) | (~(i3 | 503246543))) * (-406)) - 647214751) + ((~(i3 | (-268568646))) * (-406)) + (((~((-234677899) | i2)) | (~(i3 | 474647621))) * 406))};
                                                                    java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj52 == null) {
                                                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                        byte b33 = $$a[14];
                                                                        short s17 = (short) (b33 - 1);
                                                                        byte b34 = (byte) (-b33);
                                                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                                        a(s17, b34, (byte) (b34 + 1), objArr185);
                                                                        obj52 = cls49.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                                                    }
                                                                    ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr184)).intValue();
                                                                    return objArr183;
                                                                }
                                                                DigitizedCardProfile = (IccPrivateKeyCrtComponentsJson + 71) % 128;
                                                                java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                                if (obj53 == null) {
                                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 28, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2185, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59513));
                                                                    byte[] bArr31 = $$a;
                                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr31[14]), (byte) (-bArr31[16]), objArr186);
                                                                    obj53 = cls50.getMethod((java.lang.String) objArr186[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj53);
                                                                }
                                                                long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                                                                long j65 = ~longValue22;
                                                                long j66 = j3 | (-329585703);
                                                                long j67 = (((((longValue22 * (-667)) + 439996913505L) + (((~j66) | j65) * (-668))) + (((~(j65 | j3)) | (-329585703)) * 1336)) + ((j65 | j66) * 668)) - 542504883;
                                                                if (((((int) j67) & (((i3 | (-730866237)) * (-757)) + 1486520378 + ((~((-25165841) | i2)) * 1514) + (((~(i3 | 706360173)) | (-731526014) | (~((-705700397) | i2))) * 757))) | (((int) (j67 >> 32)) & ((((~(2014355233 | i2)) | 805309217) * (-502)) + 2021015798 + ((~(i3 | (-38076435))) * (-502)) + (((~(843385651 | i2)) | 2014355233) * 502)))) != 0) {
                                                                    java.lang.Object[] objArr187 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr188 = {-723739918, 16, java.lang.Integer.valueOf((((((~(i3 | (-274967396))) | 274957152) | (~(i3 | (-434358125)))) * (-1136)) - 120705513) + (((~((-274967396) | i2)) | (~((-434358125) | i2)) | (~(i3 | 434368367))) * (-568)) + (((~((-274957153) | i2)) | (~(i3 | 274967395)) | (~(i3 | 434358124))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                                                    java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj54 == null) {
                                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                                        byte b35 = $$a[14];
                                                                        short s18 = (short) (b35 - 1);
                                                                        byte b36 = (byte) (-b35);
                                                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                                        a(s18, b36, (byte) (b36 + 1), objArr189);
                                                                        obj54 = cls51.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                                                    }
                                                                    ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr188)).intValue();
                                                                    return objArr187;
                                                                }
                                                                java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                                if (obj55 == null) {
                                                                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36, 2971 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                                    byte[] bArr32 = $$a;
                                                                    java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr32[14]), (byte) (-bArr32[16]), objArr190);
                                                                    obj55 = cls52.getMethod((java.lang.String) objArr190[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj55);
                                                                }
                                                                long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                                                long j68 = ~longValue23;
                                                                long j69 = ~((-1162705210) | longValue23);
                                                                long j70 = ((((((-721) * longValue23) + 838310456410L) + (((j6 | (~(1162705209 | j68))) | j69) * 1444)) + (((j69 | (~(j3 | (-1162705210)))) | (~(longValue23 | j3))) * (-1444))) + (((~(longValue23 | 1162705209)) | (~(j68 | (-1162705210)))) * 722)) - 689996554;
                                                                int i43 = ~(i3 | (-40241750));
                                                                if (((((int) (j70 >> 32)) & ((((~((-1544647691) | i2)) | 1477468160 | i43) * (-470)) + 62559658 + ((i43 | (~((-67179531) | i2))) * 470))) | (((((151094345 | r7) * (-712)) - 294808227) + (((~(i3 | (-151094346))) | (~(1509791567 | i2))) * (-712)) + (((~(i3 | 1358697222)) | (-1499043664)) * 712)) & ((int) j70))) != 0) {
                                                                    java.lang.Object[] objArr191 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr192 = {-723739918, 16, java.lang.Integer.valueOf(((((~(i3 | (-15308749))) | (~((-694016772) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1207575807) + (((~((-10486989) | i2)) | (~(i3 | (-689195012)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                                    java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj56 == null) {
                                                                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                        byte b37 = $$a[14];
                                                                        short s19 = (short) (b37 - 1);
                                                                        byte b38 = (byte) (-b37);
                                                                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                                        a(s19, b38, (byte) (b38 + 1), objArr193);
                                                                        obj56 = cls53.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                                                    }
                                                                    ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr192)).intValue();
                                                                    return objArr191;
                                                                }
                                                                java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                                if (obj57 == null) {
                                                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, 2159 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (56400 - android.view.View.resolveSizeAndState(0, 0, 0)));
                                                                    byte[] bArr33 = $$a;
                                                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr33[14]), (byte) (-bArr33[16]), objArr194);
                                                                    obj57 = cls54.getMethod((java.lang.String) objArr194[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj57);
                                                                }
                                                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                                                                long j71 = ~longValue24;
                                                                long j72 = (((((832 * longValue24) + 270909835360L) + (((~(j71 | j6)) | (~(((-326397392) | longValue24) | j3))) * (-831))) + ((~((j71 | (-326397392)) | j3)) * (-1662))) + (((~(longValue24 | j3)) | ((~(j6 | 326397391)) | (~(j3 | (-326397392))))) * 831)) - 239420628;
                                                                if (((((int) (j72 >> 32)) & ((((~(i3 | (-280649109))) * 979) - 22530864) + ((1156577302 | i2) * (-979)) + (((~((-280649109) | i2)) | (~(i3 | 1156577302))) * 979))) | (((int) j72) & (((i3 | 273686528) * (-192)) + 1788176917 + (((~(i3 | 838547012)) | (-872365926)) * (-384)) + (((~(872365925 | i2)) | (~(i3 | (-33818914))) | (~((-564860485) | i2))) * 192)))) != 0) {
                                                                    java.lang.Object[] objArr195 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr196 = {-723739918, 16, java.lang.Integer.valueOf(((((~(i3 | (-17320065))) | (~(432008895 | i2))) * 988) - 1005886449) + (((~((-294636689) | i2)) | 277316624 | (~(i3 | 432008895))) * 988))};
                                                                    java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj58 == null) {
                                                                        java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                        byte b39 = $$a[14];
                                                                        short s20 = (short) (b39 - 1);
                                                                        byte b40 = (byte) (-b39);
                                                                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                                        a(s20, b40, (byte) (b40 + 1), objArr197);
                                                                        obj58 = cls55.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                                                    }
                                                                    ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr196)).intValue();
                                                                    return objArr195;
                                                                }
                                                                java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                                if (obj59 == null) {
                                                                    java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str3) + 36, 838 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.indexOf(str3, str3, 0, 0));
                                                                    byte[] bArr34 = $$a;
                                                                    java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                                    a(653, (byte) (-bArr34[14]), (byte) (-bArr34[16]), objArr198);
                                                                    obj59 = cls56.getMethod((java.lang.String) objArr198[0], null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj59);
                                                                }
                                                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, null)).longValue();
                                                                long j73 = ~longValue25;
                                                                long j74 = ~(j3 | 97292985);
                                                                long j75 = ((521 * longValue25) - 50495059215L) + (((~(longValue25 | j3)) | (~((-97292986) | j73 | j6))) * 520) + (((~(j73 | j6)) | j74) * (-1040)) + (((~(j6 | (-97292986))) | ((j73 | 97292985) ^ (-1)) | j74) * 520) + 1863459917;
                                                                int i44 = ~((-866179960) | i2);
                                                                int i45 = ((((int) (j75 >> 32)) & ((((((~((-691731174) | i2)) | 673864389) * 576) + (-1771464918)) + (((~(i3 | (-17866785))) | 71630848) * 576)) + 1598831424)) | (((int) j75) & ((((((~(i3 | (-866179960))) | 16781601) * (-245)) + 2017310914) + (i44 * (-245))) + ((i44 | 1991560926) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0 ? i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i2;
                                                                if (i45 != i2) {
                                                                    java.lang.Object[] objArr199 = {new int[]{i2}, new int[]{i45}, null, new int[1]};
                                                                    int i46 = i3;
                                                                    java.lang.Object[] objArr200 = {-723739918, 16, java.lang.Integer.valueOf(((i46 | (-2064)) * 494) + 1718500253 + (((~(i46 | 690411360)) | (-671501328)) * 494))};
                                                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj60 == null) {
                                                                        java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                        byte b41 = $$a[14];
                                                                        short s21 = (short) (b41 - 1);
                                                                        byte b42 = (byte) (-b41);
                                                                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                                        a(s21, b42, (byte) (b42 + 1), objArr201);
                                                                        obj60 = cls57.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                                                    }
                                                                    ((int[]) objArr199[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr200)).intValue();
                                                                    java.lang.Object[] objArr202 = {objArr199};
                                                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                                    if (obj61 == null) {
                                                                        java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3236, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                        byte b43 = $$a[14];
                                                                        short s22 = (short) (b43 - 1);
                                                                        byte b44 = (byte) (-b43);
                                                                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                                        a(s22, b44, (byte) (b44 + 1), objArr203);
                                                                        obj61 = cls58.getMethod((java.lang.String) objArr203[0], java.lang.Object[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj61);
                                                                    }
                                                                    ((java.lang.reflect.Method) obj61).invoke(obj, objArr202);
                                                                    return objArr199;
                                                                }
                                                                int i47 = i3;
                                                                java.lang.Object[] objArr204 = {java.lang.Integer.valueOf(i), obj, -723739918, 0};
                                                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                                if (obj62 == null) {
                                                                    obj62 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, str3, 0, 0) + 30, android.widget.ExpandableListView.getPackedPositionType(0L) + 3289, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51, android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3238, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj62);
                                                                }
                                                                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj62).newInstance(objArr204);
                                                                try {
                                                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                                    b(false, "\u0017\u0002ￏ\r\u0002\u000f\bￏ\ufff5\t\u0013\u0006\u0002\u0005\u000b\u0002", android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 15 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr205);
                                                                    java.lang.Class<?> cls59 = java.lang.Class.forName(((java.lang.String) objArr205[0]).intern());
                                                                    java.lang.Object[] objArr206 = new java.lang.Object[1];
                                                                    b(false, "\u0004\u0005\ufff2\u0003\u0005", 258 - android.view.KeyEvent.normalizeMetaState(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5, objArr206);
                                                                    cls59.getMethod(((java.lang.String) objArr206[0]).intern(), null).invoke(newInstance, null);
                                                                    java.lang.Object[] objArr207 = {new int[]{i2}, new int[]{i2}, null, new int[1]};
                                                                    java.lang.Object[] objArr208 = {-723739918, 0, java.lang.Integer.valueOf(((((~(398422511 | i47)) | 310903008) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 505230869) + (((~(i47 | 328139247)) | 381186272) * (-440)) + ((398422511 | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                                                                    java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj63 == null) {
                                                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, 2712 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                        byte b45 = $$a[14];
                                                                        short s23 = (short) (b45 - 1);
                                                                        byte b46 = (byte) (-b45);
                                                                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                                        a(s23, b46, (byte) (b46 + 1), objArr209);
                                                                        obj63 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj63);
                                                                    }
                                                                    ((int[]) objArr207[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr208)).intValue();
                                                                    return objArr207;
                                                                } catch (java.lang.Throwable th7) {
                                                                    java.lang.Throwable cause4 = th7.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th7;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th8) {
                                                            java.lang.Throwable cause5 = th8.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th8;
                                                        }
                                                    }
                                                }
                                                i6 = 0;
                                                if (i6 == 0) {
                                                }
                                            }
                                        } else {
                                            i10 = i;
                                            strArr = strArr3;
                                        }
                                        if (invoke6 != null) {
                                            java.lang.Object[] objArr210 = {invoke6, 42};
                                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj64 == null) {
                                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 28, 2594 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.graphics.Color.alpha(0));
                                                byte[] bArr35 = $$a;
                                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                a(653, (byte) (-bArr35[14]), (byte) (-bArr35[16]), objArr211);
                                                obj64 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                                            }
                                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr210)).longValue();
                                            long j76 = ~longValue26;
                                            long j77 = ~((-13699347) | j5);
                                            i11 = i18;
                                            str4 = str;
                                            long j78 = ((881 * longValue26) - 12069124707L) + (((~(j5 | 13699346)) | (~(j76 | 13699346)) | (~(j76 | j5))) * (-880)) + ((longValue26 | (~(13699346 | j6)) | j77) * (-880)) + (j77 * 880) + 1270799871;
                                            int i48 = (int) (j78 >> 32);
                                            int i49 = ~(1551814236 | i10);
                                            if (((((int) j78) & ((((~((-1551814237) | i10)) | 1280756312 | (~((-1305926650) | i10))) * (-880)) + 818884229 + (((~((-1551814237) | i11)) | 1305926649 | i49) * (-880)) + (i49 * 880))) | (((((~(435059625 | i10)) | (-1006631850)) * 305) + 1704617878 + (((~(435059625 | i11)) | (-1002166786)) * 305)) & i48)) != 477111747) {
                                                i3 = i11;
                                                i2 = i10;
                                                str2 = str4;
                                                java.lang.Object[] objArr732 = new java.lang.Object[1];
                                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr732);
                                                java.lang.Object[] objArr742 = {((java.lang.String) objArr732[0]).intern()};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj3 == null) {
                                                }
                                                long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr742)).longValue();
                                                long j212 = ~longValue72;
                                                long j222 = j212 | j6;
                                                long j232 = 960725509 | longValue72;
                                                long j242 = ~(j232 | j5);
                                                long j252 = (longValue72 * 253) + 243063553777L + (((~(j212 | (-960725510))) | (~j222) | j242) * (-252)) + (j232 * (-252)) + ((j242 | (~(960725509 | j222))) * 252) + 329814558;
                                                j = (((int) j252) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j252 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                                                str3 = str2;
                                                java.lang.Object[] objArr762 = new java.lang.Object[1];
                                                c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr762);
                                                java.lang.Object[] objArr772 = {((java.lang.String) objArr762[0]).intern()};
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj4 == null) {
                                                }
                                                long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr772)).longValue();
                                                long j262 = ~longValue82;
                                                long j272 = (-327536127) | j262;
                                                long j282 = (((-496) * longValue82) - 162457918496L) + ((~j272) * 497) + (((~(j272 | j5)) | (~(j262 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue82 | (-327536127))) | (~(327536126 | j262 | j5))) * 497) + 963003941;
                                                long j292 = (((int) (j282 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j282) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                                                if (j > 0) {
                                                    i8 = IccPrivateKeyCrtComponentsJson + 101;
                                                    i9 = i8 % 128;
                                                    DigitizedCardProfile = i9;
                                                    if (i8 % 2 != 0) {
                                                        IccPrivateKeyCrtComponentsJson = (i9 + 93) % 128;
                                                        java.lang.Object[] objArr792 = {new int[]{i2}, new int[]{i2 ^ 247}, null, new int[1]};
                                                        java.lang.Object[] objArr802 = {-723739918, 16, java.lang.Integer.valueOf((((~(435548607 | i2)) * (-301)) - 621947530) + (((~((-416661818) | i2)) | (~(i3 | 292663702))) * (-301)) + (((~((-292663703) | i2)) | (-416661818)) * 301))};
                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj7 == null) {
                                                        }
                                                        ((int[]) objArr792[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr802)).intValue();
                                                        return objArr792;
                                                    }
                                                    IccPrivateKeyCrtComponentsJson = (i9 + 93) % 128;
                                                    java.lang.Object[] objArr7922 = {new int[]{i2}, new int[]{i2 ^ 247}, null, new int[1]};
                                                    java.lang.Object[] objArr8022 = {-723739918, 16, java.lang.Integer.valueOf((((~(435548607 | i2)) * (-301)) - 621947530) + (((~((-416661818) | i2)) | (~(i3 | 292663702))) * (-301)) + (((~((-292663703) | i2)) | (-416661818)) * 301))};
                                                    obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj7 == null) {
                                                    }
                                                    ((int[]) objArr7922[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr8022)).intValue();
                                                    return objArr7922;
                                                }
                                                java.lang.Object[] objArr822 = new java.lang.Object[1];
                                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr822);
                                                java.lang.Object[] objArr832 = {((java.lang.String) objArr822[0]).intern()};
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj5 == null) {
                                                }
                                                long j302 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr832)).longValue();
                                                long j312 = (-689367363) | j302;
                                                long j322 = ((r1 * (-344)) - 237142372528L) + (((~j312) | (~((-689367363) | j5))) * 345) + (((~(j302 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j312 | j5)) * 345) + 601172705;
                                                j2 = (((int) j322) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j322 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                                                java.lang.Object[] objArr852 = new java.lang.Object[1];
                                                b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr852);
                                                java.lang.Object[] objArr862 = {((java.lang.String) objArr852[0]).intern()};
                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj6 == null) {
                                                }
                                                long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr862)).longValue();
                                                long j332 = longValue92 | j5;
                                                long j342 = (((-929) * longValue92) - 412175524480L) + (((~j332) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue92) * 930) + (((-888309321) | j332) * 465) + 402230747;
                                                long j352 = (((int) (j342 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j342) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                                                if (j2 <= 0) {
                                                }
                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr912);
                                                java.lang.String intern302 = ((java.lang.String) objArr912[0]).intern();
                                                int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                                char indexOf4 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop2 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf4, objArr922);
                                                java.lang.String intern312 = ((java.lang.String) objArr922[0]).intern();
                                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr932);
                                                java.lang.String intern322 = ((java.lang.String) objArr932[0]).intern();
                                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr942);
                                                java.lang.String intern332 = ((java.lang.String) objArr942[0]).intern();
                                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr952);
                                                java.lang.String intern342 = ((java.lang.String) objArr952[0]).intern();
                                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr962);
                                                java.lang.String intern352 = ((java.lang.String) objArr962[0]).intern();
                                                java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr972);
                                                java.lang.String[] strArr42 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr972[0]).intern()};
                                                i4 = 0;
                                                while (true) {
                                                    if (i4 < 7) {
                                                    }
                                                    i4++;
                                                }
                                                if (i5 == 0) {
                                                }
                                            }
                                            i12 = 0;
                                            i13 = 0;
                                            while (i12 < 28) {
                                            }
                                            i3 = i11;
                                            i2 = i10;
                                            str2 = str4;
                                            if (i13 >= 25.2d) {
                                            }
                                            java.lang.Object[] objArr7322 = new java.lang.Object[1];
                                            b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7322);
                                            java.lang.Object[] objArr7422 = {((java.lang.String) objArr7322[0]).intern()};
                                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj3 == null) {
                                            }
                                            long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7422)).longValue();
                                            long j2122 = ~longValue722;
                                            long j2222 = j2122 | j6;
                                            long j2322 = 960725509 | longValue722;
                                            long j2422 = ~(j2322 | j5);
                                            long j2522 = (longValue722 * 253) + 243063553777L + (((~(j2122 | (-960725510))) | (~j2222) | j2422) * (-252)) + (j2322 * (-252)) + ((j2422 | (~(960725509 | j2222))) * 252) + 329814558;
                                            j = (((int) j2522) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j2522 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                                            str3 = str2;
                                            java.lang.Object[] objArr7622 = new java.lang.Object[1];
                                            c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr7622);
                                            java.lang.Object[] objArr7722 = {((java.lang.String) objArr7622[0]).intern()};
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj4 == null) {
                                            }
                                            long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7722)).longValue();
                                            long j2622 = ~longValue822;
                                            long j2722 = (-327536127) | j2622;
                                            long j2822 = (((-496) * longValue822) - 162457918496L) + ((~j2722) * 497) + (((~(j2722 | j5)) | (~(j2622 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue822 | (-327536127))) | (~(327536126 | j2622 | j5))) * 497) + 963003941;
                                            long j2922 = (((int) (j2822 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j2822) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                                            if (j > 0) {
                                            }
                                            java.lang.Object[] objArr8222 = new java.lang.Object[1];
                                            b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr8222);
                                            java.lang.Object[] objArr8322 = {((java.lang.String) objArr8222[0]).intern()};
                                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj5 == null) {
                                            }
                                            long j3022 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8322)).longValue();
                                            long j3122 = (-689367363) | j3022;
                                            long j3222 = ((r1 * (-344)) - 237142372528L) + (((~j3122) | (~((-689367363) | j5))) * 345) + (((~(j3022 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j3122 | j5)) * 345) + 601172705;
                                            j2 = (((int) j3222) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j3222 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                                            java.lang.Object[] objArr8522 = new java.lang.Object[1];
                                            b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr8522);
                                            java.lang.Object[] objArr8622 = {((java.lang.String) objArr8522[0]).intern()};
                                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj6 == null) {
                                            }
                                            long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8622)).longValue();
                                            long j3322 = longValue922 | j5;
                                            long j3422 = (((-929) * longValue922) - 412175524480L) + (((~j3322) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue922) * 930) + (((-888309321) | j3322) * 465) + 402230747;
                                            long j3522 = (((int) (j3422 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j3422) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                                            if (j2 <= 0) {
                                            }
                                            java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                            c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr9122);
                                            java.lang.String intern3022 = ((java.lang.String) objArr9122[0]).intern();
                                            int touchSlop22 = android.view.ViewConfiguration.getTouchSlop();
                                            char indexOf42 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                                            java.lang.Object[] objArr9222 = new java.lang.Object[1];
                                            c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop22 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf42, objArr9222);
                                            java.lang.String intern3122 = ((java.lang.String) objArr9222[0]).intern();
                                            java.lang.Object[] objArr9322 = new java.lang.Object[1];
                                            c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9322);
                                            java.lang.String intern3222 = ((java.lang.String) objArr9322[0]).intern();
                                            java.lang.Object[] objArr9422 = new java.lang.Object[1];
                                            b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr9422);
                                            java.lang.String intern3322 = ((java.lang.String) objArr9422[0]).intern();
                                            java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                            b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr9522);
                                            java.lang.String intern3422 = ((java.lang.String) objArr9522[0]).intern();
                                            java.lang.Object[] objArr9622 = new java.lang.Object[1];
                                            c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr9622);
                                            java.lang.String intern3522 = ((java.lang.String) objArr9622[0]).intern();
                                            java.lang.Object[] objArr9722 = new java.lang.Object[1];
                                            b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9722);
                                            java.lang.String[] strArr422 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9722[0]).intern()};
                                            i4 = 0;
                                            while (true) {
                                                if (i4 < 7) {
                                                }
                                                i4++;
                                            }
                                            if (i5 == 0) {
                                            }
                                        } else {
                                            i2 = i10;
                                            i3 = i18;
                                            str2 = str;
                                            java.lang.Object[] objArr73222 = new java.lang.Object[1];
                                            b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr73222);
                                            java.lang.Object[] objArr74222 = {((java.lang.String) objArr73222[0]).intern()};
                                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj3 == null) {
                                            }
                                            long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr74222)).longValue();
                                            long j21222 = ~longValue7222;
                                            long j22222 = j21222 | j6;
                                            long j23222 = 960725509 | longValue7222;
                                            long j24222 = ~(j23222 | j5);
                                            long j25222 = (longValue7222 * 253) + 243063553777L + (((~(j21222 | (-960725510))) | (~j22222) | j24222) * (-252)) + (j23222 * (-252)) + ((j24222 | (~(960725509 | j22222))) * 252) + 329814558;
                                            j = (((int) j25222) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j25222 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                                            str3 = str2;
                                            java.lang.Object[] objArr76222 = new java.lang.Object[1];
                                            c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr76222);
                                            java.lang.Object[] objArr77222 = {((java.lang.String) objArr76222[0]).intern()};
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj4 == null) {
                                            }
                                            long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr77222)).longValue();
                                            long j26222 = ~longValue8222;
                                            long j27222 = (-327536127) | j26222;
                                            long j28222 = (((-496) * longValue8222) - 162457918496L) + ((~j27222) * 497) + (((~(j27222 | j5)) | (~(j26222 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue8222 | (-327536127))) | (~(327536126 | j26222 | j5))) * 497) + 963003941;
                                            long j29222 = (((int) (j28222 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j28222) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                                            if (j > 0) {
                                            }
                                            java.lang.Object[] objArr82222 = new java.lang.Object[1];
                                            b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr82222);
                                            java.lang.Object[] objArr83222 = {((java.lang.String) objArr82222[0]).intern()};
                                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj5 == null) {
                                            }
                                            long j30222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr83222)).longValue();
                                            long j31222 = (-689367363) | j30222;
                                            long j32222 = ((r1 * (-344)) - 237142372528L) + (((~j31222) | (~((-689367363) | j5))) * 345) + (((~(j30222 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j31222 | j5)) * 345) + 601172705;
                                            j2 = (((int) j32222) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j32222 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                                            java.lang.Object[] objArr85222 = new java.lang.Object[1];
                                            b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr85222);
                                            java.lang.Object[] objArr86222 = {((java.lang.String) objArr85222[0]).intern()};
                                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj6 == null) {
                                            }
                                            long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr86222)).longValue();
                                            long j33222 = longValue9222 | j5;
                                            long j34222 = (((-929) * longValue9222) - 412175524480L) + (((~j33222) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue9222) * 930) + (((-888309321) | j33222) * 465) + 402230747;
                                            long j35222 = (((int) (j34222 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j34222) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                                            if (j2 <= 0) {
                                            }
                                            java.lang.Object[] objArr91222 = new java.lang.Object[1];
                                            c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr91222);
                                            java.lang.String intern30222 = ((java.lang.String) objArr91222[0]).intern();
                                            int touchSlop222 = android.view.ViewConfiguration.getTouchSlop();
                                            char indexOf422 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                                            java.lang.Object[] objArr92222 = new java.lang.Object[1];
                                            c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop222 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf422, objArr92222);
                                            java.lang.String intern31222 = ((java.lang.String) objArr92222[0]).intern();
                                            java.lang.Object[] objArr93222 = new java.lang.Object[1];
                                            c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr93222);
                                            java.lang.String intern32222 = ((java.lang.String) objArr93222[0]).intern();
                                            java.lang.Object[] objArr94222 = new java.lang.Object[1];
                                            b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr94222);
                                            java.lang.String intern33222 = ((java.lang.String) objArr94222[0]).intern();
                                            java.lang.Object[] objArr95222 = new java.lang.Object[1];
                                            b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr95222);
                                            java.lang.String intern34222 = ((java.lang.String) objArr95222[0]).intern();
                                            java.lang.Object[] objArr96222 = new java.lang.Object[1];
                                            c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr96222);
                                            java.lang.String intern35222 = ((java.lang.String) objArr96222[0]).intern();
                                            java.lang.Object[] objArr97222 = new java.lang.Object[1];
                                            b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr97222);
                                            java.lang.String[] strArr4222 = {intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr97222[0]).intern()};
                                            i4 = 0;
                                            while (true) {
                                                if (i4 < 7) {
                                                }
                                                i4++;
                                            }
                                            if (i5 == 0) {
                                            }
                                        }
                                    }
                                }
                                i2 = i;
                                i3 = i18;
                                str2 = str;
                                java.lang.Object[] objArr732222 = new java.lang.Object[1];
                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr732222);
                                java.lang.Object[] objArr742222 = {((java.lang.String) objArr732222[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                }
                                long longValue72222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr742222)).longValue();
                                long j212222 = ~longValue72222;
                                long j222222 = j212222 | j6;
                                long j232222 = 960725509 | longValue72222;
                                long j242222 = ~(j232222 | j5);
                                long j252222 = (longValue72222 * 253) + 243063553777L + (((~(j212222 | (-960725510))) | (~j222222) | j242222) * (-252)) + (j232222 * (-252)) + ((j242222 | (~(960725509 | j222222))) * 252) + 329814558;
                                j = (((int) j252222) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j252222 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                                str3 = str2;
                                java.lang.Object[] objArr762222 = new java.lang.Object[1];
                                c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr762222);
                                java.lang.Object[] objArr772222 = {((java.lang.String) objArr762222[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                }
                                long longValue82222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr772222)).longValue();
                                long j262222 = ~longValue82222;
                                long j272222 = (-327536127) | j262222;
                                long j282222 = (((-496) * longValue82222) - 162457918496L) + ((~j272222) * 497) + (((~(j272222 | j5)) | (~(j262222 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue82222 | (-327536127))) | (~(327536126 | j262222 | j5))) * 497) + 963003941;
                                long j292222 = (((int) (j282222 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j282222) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                                if (j > 0) {
                                }
                                java.lang.Object[] objArr822222 = new java.lang.Object[1];
                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr822222);
                                java.lang.Object[] objArr832222 = {((java.lang.String) objArr822222[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                }
                                long j302222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr832222)).longValue();
                                long j312222 = (-689367363) | j302222;
                                long j322222 = ((r1 * (-344)) - 237142372528L) + (((~j312222) | (~((-689367363) | j5))) * 345) + (((~(j302222 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j312222 | j5)) * 345) + 601172705;
                                j2 = (((int) j322222) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j322222 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                                java.lang.Object[] objArr852222 = new java.lang.Object[1];
                                b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr852222);
                                java.lang.Object[] objArr862222 = {((java.lang.String) objArr852222[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                }
                                long longValue92222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr862222)).longValue();
                                long j332222 = longValue92222 | j5;
                                long j342222 = (((-929) * longValue92222) - 412175524480L) + (((~j332222) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue92222) * 930) + (((-888309321) | j332222) * 465) + 402230747;
                                long j352222 = (((int) (j342222 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j342222) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                                if (j2 <= 0) {
                                }
                                java.lang.Object[] objArr912222 = new java.lang.Object[1];
                                c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr912222);
                                java.lang.String intern302222 = ((java.lang.String) objArr912222[0]).intern();
                                int touchSlop2222 = android.view.ViewConfiguration.getTouchSlop();
                                char indexOf4222 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                                java.lang.Object[] objArr922222 = new java.lang.Object[1];
                                c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop2222 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf4222, objArr922222);
                                java.lang.String intern312222 = ((java.lang.String) objArr922222[0]).intern();
                                java.lang.Object[] objArr932222 = new java.lang.Object[1];
                                c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr932222);
                                java.lang.String intern322222 = ((java.lang.String) objArr932222[0]).intern();
                                java.lang.Object[] objArr942222 = new java.lang.Object[1];
                                b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr942222);
                                java.lang.String intern332222 = ((java.lang.String) objArr942222[0]).intern();
                                java.lang.Object[] objArr952222 = new java.lang.Object[1];
                                b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr952222);
                                java.lang.String intern342222 = ((java.lang.String) objArr952222[0]).intern();
                                java.lang.Object[] objArr962222 = new java.lang.Object[1];
                                c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr962222);
                                java.lang.String intern352222 = ((java.lang.String) objArr962222[0]).intern();
                                java.lang.Object[] objArr972222 = new java.lang.Object[1];
                                b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr972222);
                                java.lang.String[] strArr42222 = {intern302222, intern312222, intern322222, intern332222, intern342222, intern352222, ((java.lang.String) objArr972222[0]).intern()};
                                i4 = 0;
                                while (true) {
                                    if (i4 < 7) {
                                    }
                                    i4++;
                                }
                                if (i5 == 0) {
                                }
                            } else {
                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                c("\ue577밳ᇢ堋栳䄰‶켲Ḭ嬖\uedd1겡聼", "뚛ᑁ瑰\udeef", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1880375734, "\u0000\u0000\u0000\u0000", (char) (android.os.Process.getGidForName(str) + 61301), objArr212);
                                java.lang.Object[] objArr213 = {((java.lang.String) objArr212[0]).intern()};
                                java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj65 == null) {
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.view.MotionEvent.axisFromString(str), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1921, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    byte[] bArr36 = $$a;
                                    java.lang.Object[] objArr214 = new java.lang.Object[1];
                                    a(653, (byte) (-bArr36[14]), (byte) (-bArr36[16]), objArr214);
                                    obj65 = cls62.getMethod((java.lang.String) objArr214[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj65);
                                }
                                java.lang.Object invoke9 = ((java.lang.reflect.Method) obj65).invoke(null, objArr213);
                                java.lang.Object[] objArr215 = new java.lang.Object[1];
                                c("⇸", "ᇂ降䇋䞖", android.text.TextUtils.indexOf(str, str, 0, 0) - 879342319, "\u0000\u0000\u0000\u0000", (char) (38466 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr215);
                                c = 0;
                                if (invoke9.equals(((java.lang.String) objArr215[0]).intern())) {
                                    i15 = 1;
                                    int[] iArr3 = new int[i15];
                                    int[] iArr22 = new int[i15];
                                    iArr3[c] = i;
                                    iArr22[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr216 = {iArr3, iArr22, null, new int[i15]};
                                    java.lang.Object[] objArr222 = {-723739918, 16, java.lang.Integer.valueOf(((((~((-460956509) | i)) | (-248369012)) * (-318)) - 407327171) + (((~((-248369012) | i)) | (~(536735615 | i18))) * 318) + (((~(i | 536735615)) | (~((-75779108) | i18))) * 318))};
                                    obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj10 == null) {
                                    }
                                    ((int[]) objArr216[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr222)).intValue();
                                    return objArr216;
                                }
                                java.lang.Object[] objArr242 = new java.lang.Object[1];
                                c("檆ⷞ晓攂ؘ\ue905팢Ⱑ", "\ue1e5\uf6c2㯖顃", android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), objArr242);
                                java.lang.String intern210 = ((java.lang.String) objArr242[0]).intern();
                                java.lang.Object[] objArr252 = new java.lang.Object[1];
                                c("敜\udc9d\ud8ee싕珗\uf082", "\uffd0뼐䑳ꯆ", android.text.TextUtils.indexOf(str, str), "\u0000\u0000\u0000\u0000", (char) (50756 - android.view.KeyEvent.getDeadChar(0, 0)), objArr252);
                                java.lang.String intern310 = ((java.lang.String) objArr252[0]).intern();
                                java.lang.Object[] objArr262 = new java.lang.Object[1];
                                c("啙ꑋ䓿\ue5a6聫酒빝", "맪든镗ⲑ", android.text.TextUtils.getOffsetBefore(str, 0) + 1471471801, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getOffsetBefore(str, 0), objArr262);
                                java.lang.String intern47 = ((java.lang.String) objArr262[0]).intern();
                                java.lang.Object[] objArr272 = new java.lang.Object[1];
                                c("ಣ秚ﱖ뛂鞢け⊆믙⳺", "\ue772쭴⊏ヨ", android.view.KeyEvent.keyCodeFromString(str) - 1882491673, "\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr272);
                                java.lang.String intern52 = ((java.lang.String) objArr272[0]).intern();
                                java.lang.Object[] objArr282 = new java.lang.Object[1];
                                c("軺毬㽳Ὠ\u0bab槪", "㙊恤☃\uedf5", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', "\u0000\u0000\u0000\u0000", (char) (62758 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr282);
                                java.lang.String intern62 = ((java.lang.String) objArr282[0]).intern();
                                java.lang.Object[] objArr292 = new java.lang.Object[1];
                                c("ᛷܡ冕誛觸籶\u0b53噞㨲榺\u0b50귨뮬", "操\udbe0罣蝱", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1675354212, "\u0000\u0000\u0000\u0000", (char) (29055 - android.graphics.Color.argb(0, 0, 0, 0)), objArr292);
                                java.lang.String intern72 = ((java.lang.String) objArr292[0]).intern();
                                java.lang.Object[] objArr302 = new java.lang.Object[1];
                                c("ⴓ洛\ue014穿㨱", "ね嵩ꉣ쭍", 1667066160 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000\u0000\u0000\u0000", (char) (19874 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr302);
                                java.lang.String intern82 = ((java.lang.String) objArr302[0]).intern();
                                java.lang.Object[] objArr312 = new java.lang.Object[1];
                                b(true, "\bￒ\u0005\u0011\u0004\u000f", 244 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr312);
                                java.lang.String intern92 = ((java.lang.String) objArr312[0]).intern();
                                java.lang.Object[] objArr322 = new java.lang.Object[1];
                                b(false, "\ufff9\u0007", 259 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, objArr322);
                                java.lang.String intern102 = ((java.lang.String) objArr322[0]).intern();
                                java.lang.Object[] objArr332 = new java.lang.Object[1];
                                c("펥ﲎ\uf639ễ铭열串ꪜ⫺\udc85Ԉ閎ᕯ굆슶Ш", "숁뭔ꣿ墨", android.view.KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15017), objArr332);
                                java.lang.String intern112 = ((java.lang.String) objArr332[0]).intern();
                                java.lang.Object[] objArr342 = new java.lang.Object[1];
                                c("㓄偹ⷛ⾣瞏崚躕稪幊䧀", "蘷泃뢄\ue1e6", android.graphics.Color.green(0), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr342);
                                java.lang.String intern122 = ((java.lang.String) objArr342[0]).intern();
                                java.lang.Object[] objArr352 = new java.lang.Object[1];
                                c("鿌⩍ೢ幗ᡛ襍鶇ﳮ", "ⷀѶি\udfa3", (-1) - android.os.Process.getGidForName(str), "\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), objArr352);
                                java.lang.String intern132 = ((java.lang.String) objArr352[0]).intern();
                                java.lang.Object[] objArr362 = new java.lang.Object[1];
                                b(true, "\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002\u0005\ufff9￼", 253 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, android.view.MotionEvent.axisFromString(str) + 13, objArr362);
                                java.lang.String intern142 = ((java.lang.String) objArr362[0]).intern();
                                java.lang.Object[] objArr372 = new java.lang.Object[1];
                                b(false, "\u0004\ufffb\ufff8\u0004\u0001\u0001\ufffa\ufff8\t\ufff8\t\u0001\u0005\u0007", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr372);
                                java.lang.String intern152 = ((java.lang.String) objArr372[0]).intern();
                                java.lang.Object[] objArr382 = new java.lang.Object[1];
                                b(false, "\u0006\uffff\u0005\u0003\ufff6\ufffe\u0000", 258 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, 7 - android.view.View.resolveSizeAndState(0, 0, 0), objArr382);
                                java.lang.String intern162 = ((java.lang.String) objArr382[0]).intern();
                                java.lang.Object[] objArr392 = new java.lang.Object[1];
                                c("豾芶⼄堛蝦瞀詒", "ᜓ㘫ɘ杉", 1479944983 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr392);
                                java.lang.String intern172 = ((java.lang.String) objArr392[0]).intern();
                                java.lang.Object[] objArr402 = new java.lang.Object[1];
                                c("\ue8b7\uef90\u0a3aﳡⳆꃔ쪚", "鶕譈툄譙", 76236956 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.view.View.combineMeasuredStates(0, 0), objArr402);
                                java.lang.String intern182 = ((java.lang.String) objArr402[0]).intern();
                                java.lang.Object[] objArr412 = new java.lang.Object[1];
                                b(false, "\u0000\u0000", (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr412);
                                java.lang.String intern192 = ((java.lang.String) objArr412[0]).intern();
                                java.lang.Object[] objArr422 = new java.lang.Object[1];
                                c("ᐑ\ue07e녚슰⚎죝뗆䳿렆ʃ쥰톓㩯롘돪탈뒱듕漕齻", "㟽귕鮄\uebc0", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr422);
                                java.lang.String intern202 = ((java.lang.String) objArr422[0]).intern();
                                java.lang.Object[] objArr432 = new java.lang.Object[1];
                                c("ຽ榜먀\uf7bd\ue656\ue2d7", "\udd6e་鉰獻", android.graphics.Color.alpha(0), "\u0000\u0000\u0000\u0000", (char) (31634 - android.text.TextUtils.getOffsetAfter(str, 0)), objArr432);
                                java.lang.String intern212 = ((java.lang.String) objArr432[0]).intern();
                                java.lang.Object[] objArr442 = new java.lang.Object[1];
                                b(true, "\uffff\u0001", 264 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr442);
                                java.lang.String intern222 = ((java.lang.String) objArr442[0]).intern();
                                java.lang.Object[] objArr452 = new java.lang.Object[1];
                                c("竧挰跭䉺✮뗶帜ş寃莌‱얙嵠퐩䡉濓", "鞇\u2d6d㢼䣌", android.graphics.Color.blue(0), "\u0000\u0000\u0000\u0000", (char) (52281 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr452);
                                java.lang.String intern232 = ((java.lang.String) objArr452[0]).intern();
                                java.lang.Object[] objArr462 = new java.lang.Object[1];
                                b(true, "\n\ufff7\u0006\ufffb\ufff9\ufff7\b\n\ufffe", 252 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, 10 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr462);
                                java.lang.String intern242 = ((java.lang.String) objArr462[0]).intern();
                                java.lang.Object[] objArr472 = new java.lang.Object[1];
                                b(false, "\r￼\ufffe\u0000\u000b￼\u000f\u0003\uffd1\u000f", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9 - android.text.TextUtils.getOffsetAfter(str, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 10, objArr472);
                                java.lang.String intern252 = ((java.lang.String) objArr472[0]).intern();
                                java.lang.Object[] objArr482 = new java.lang.Object[1];
                                b(false, "\r\ufffeￏ\r\u000b\ufffa￼\ufffe\u000b\b\u000e", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 250, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4, android.text.TextUtils.getOffsetAfter(str, 0) + 11, objArr482);
                                java.lang.String intern262 = ((java.lang.String) objArr482[0]).intern();
                                java.lang.Object[] objArr492 = new java.lang.Object[1];
                                c("악밪쮲윰᪹䇖\ue9e6扄た⼞鞍", "딺ꮈᐰ彝", 816548020 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr492);
                                java.lang.String intern272 = ((java.lang.String) objArr492[0]).intern();
                                java.lang.Object[] objArr502 = new java.lang.Object[1];
                                c("畹ᣐ\ueb4f䡺瞆ৡཛྷᨅ釨潕忿\ue20d갊揰톎", "ꁸ苉齢퓪", 1652738465 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getCapsMode(str, 0, 0) + 60063), objArr502);
                                java.lang.String intern282 = ((java.lang.String) objArr502[0]).intern();
                                java.lang.Object[] objArr512 = new java.lang.Object[1];
                                b(true, "\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2\ufff7\u0001￼", 256 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr512);
                                java.lang.String[] strArr32 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr512[0]).intern()};
                                java.lang.Object[] objArr522 = new java.lang.Object[1];
                                b(false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", 248 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2 - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.blue(0) + 11, objArr522);
                                java.lang.Object[] objArr532 = {((java.lang.String) objArr522[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr532);
                                if (invoke != null) {
                                }
                                i2 = i;
                                i3 = i18;
                                str2 = str;
                                java.lang.Object[] objArr7322222 = new java.lang.Object[1];
                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7322222);
                                java.lang.Object[] objArr7422222 = {((java.lang.String) objArr7322222[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                }
                                long longValue722222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7422222)).longValue();
                                long j2122222 = ~longValue722222;
                                long j2222222 = j2122222 | j6;
                                long j2322222 = 960725509 | longValue722222;
                                long j2422222 = ~(j2322222 | j5);
                                long j2522222 = (longValue722222 * 253) + 243063553777L + (((~(j2122222 | (-960725510))) | (~j2222222) | j2422222) * (-252)) + (j2322222 * (-252)) + ((j2422222 | (~(960725509 | j2222222))) * 252) + 329814558;
                                j = (((int) j2522222) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j2522222 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                                str3 = str2;
                                java.lang.Object[] objArr7622222 = new java.lang.Object[1];
                                c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr7622222);
                                java.lang.Object[] objArr7722222 = {((java.lang.String) objArr7622222[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                }
                                long longValue822222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7722222)).longValue();
                                long j2622222 = ~longValue822222;
                                long j2722222 = (-327536127) | j2622222;
                                long j2822222 = (((-496) * longValue822222) - 162457918496L) + ((~j2722222) * 497) + (((~(j2722222 | j5)) | (~(j2622222 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue822222 | (-327536127))) | (~(327536126 | j2622222 | j5))) * 497) + 963003941;
                                long j2922222 = (((int) (j2822222 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j2822222) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                                if (j > 0) {
                                }
                                java.lang.Object[] objArr8222222 = new java.lang.Object[1];
                                b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr8222222);
                                java.lang.Object[] objArr8322222 = {((java.lang.String) objArr8222222[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                }
                                long j3022222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8322222)).longValue();
                                long j3122222 = (-689367363) | j3022222;
                                long j3222222 = ((r1 * (-344)) - 237142372528L) + (((~j3122222) | (~((-689367363) | j5))) * 345) + (((~(j3022222 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j3122222 | j5)) * 345) + 601172705;
                                j2 = (((int) j3222222) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j3222222 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                                java.lang.Object[] objArr8522222 = new java.lang.Object[1];
                                b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr8522222);
                                java.lang.Object[] objArr8622222 = {((java.lang.String) objArr8522222[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                }
                                long longValue922222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8622222)).longValue();
                                long j3322222 = longValue922222 | j5;
                                long j3422222 = (((-929) * longValue922222) - 412175524480L) + (((~j3322222) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue922222) * 930) + (((-888309321) | j3322222) * 465) + 402230747;
                                long j3522222 = (((int) (j3422222 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j3422222) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                                if (j2 <= 0) {
                                }
                                java.lang.Object[] objArr9122222 = new java.lang.Object[1];
                                c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr9122222);
                                java.lang.String intern3022222 = ((java.lang.String) objArr9122222[0]).intern();
                                int touchSlop22222 = android.view.ViewConfiguration.getTouchSlop();
                                char indexOf42222 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                                java.lang.Object[] objArr9222222 = new java.lang.Object[1];
                                c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop22222 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf42222, objArr9222222);
                                java.lang.String intern3122222 = ((java.lang.String) objArr9222222[0]).intern();
                                java.lang.Object[] objArr9322222 = new java.lang.Object[1];
                                c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9322222);
                                java.lang.String intern3222222 = ((java.lang.String) objArr9322222[0]).intern();
                                java.lang.Object[] objArr9422222 = new java.lang.Object[1];
                                b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr9422222);
                                java.lang.String intern3322222 = ((java.lang.String) objArr9422222[0]).intern();
                                java.lang.Object[] objArr9522222 = new java.lang.Object[1];
                                b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr9522222);
                                java.lang.String intern3422222 = ((java.lang.String) objArr9522222[0]).intern();
                                java.lang.Object[] objArr9622222 = new java.lang.Object[1];
                                c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr9622222);
                                java.lang.String intern3522222 = ((java.lang.String) objArr9622222[0]).intern();
                                java.lang.Object[] objArr9722222 = new java.lang.Object[1];
                                b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9722222);
                                java.lang.String[] strArr422222 = {intern3022222, intern3122222, intern3222222, intern3322222, intern3422222, intern3522222, ((java.lang.String) objArr9722222[0]).intern()};
                                i4 = 0;
                                while (true) {
                                    if (i4 < 7) {
                                    }
                                    i4++;
                                }
                                if (i5 == 0) {
                                }
                            }
                        } else {
                            obj8 = invoke3;
                            obj9 = invoke4;
                            str = "";
                        }
                        if (obj9 != null) {
                            java.lang.Object[] objArr217 = {obj9, 42};
                            java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj66 == null) {
                                java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 29, 2594 - android.text.TextUtils.indexOf(str, str, 0), (char) (android.os.Process.getGidForName(str) + 1));
                                byte[] bArr37 = $$a;
                                java.lang.Object[] objArr218 = new java.lang.Object[1];
                                a(653, (byte) (-bArr37[14]), (byte) (-bArr37[16]), objArr218);
                                obj66 = cls63.getMethod((java.lang.String) objArr218[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj66);
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr217)).longValue();
                            long j79 = ~(246218579 | longValue27);
                            long j80 = ~longValue27;
                            long j81 = (989 * longValue27) + 486281695500L + ((j5 | j79) * 988) + (((~(j80 | (-246218580))) | (~((-246218580) | j6))) * (-1976)) + (((~(j80 | j5)) | j79 | (~(j6 | longValue27))) * 988) + 1503319104;
                        }
                        if (obj8 != null) {
                            java.lang.Object[] objArr219 = {obj8, 42};
                            java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj67 == null) {
                                java.lang.Class cls64 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2594, (char) android.graphics.Color.green(0));
                                byte[] bArr38 = $$a;
                                java.lang.Object[] objArr220 = new java.lang.Object[1];
                                a(653, (byte) (-bArr38[14]), (byte) (-bArr38[16]), objArr220);
                                obj67 = cls64.getMethod((java.lang.String) objArr220[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj67);
                            }
                            long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj67).invoke(null, objArr219)).longValue();
                            long j82 = (((-520) * longValue28) - 461082720060L) + (((~(j6 | longValue28)) | (-883300230)) * (-1042)) + ((longValue28 | j5) * 521) + (((~((~longValue28) | 883300229)) | (~(883300229 | j5)) | (~(longValue28 | (-883300230) | j6))) * 521) + 2140400754;
                        }
                        if (obj9 != null) {
                            java.lang.Object[] objArr221 = {obj9, 42};
                            java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj68 == null) {
                                java.lang.Class cls65 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2594 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.KeyEvent.keyCodeFromString(str));
                                byte[] bArr39 = $$a;
                                java.lang.Object[] objArr223 = new java.lang.Object[1];
                                a(653, (byte) (-bArr39[14]), (byte) (-bArr39[16]), objArr223);
                                obj68 = cls65.getMethod((java.lang.String) objArr223[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj68);
                            }
                            long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) obj68).invoke(null, objArr221)).longValue();
                            long j83 = ~longValue29;
                            long j84 = (-98206011) | j83;
                            long j85 = (((-496) * longValue29) - 48710180960L) + ((~j84) * 497) + (((~(j84 | j5)) | (~(j83 | j6 | 98206010))) * 497) + (((~((-98206011) | j6)) | (~(longValue29 | (-98206011))) | (~(98206010 | j83 | j5))) * 497) + 1158894514;
                        }
                        java.lang.Object[] objArr2422 = new java.lang.Object[1];
                        c("檆ⷞ晓攂ؘ\ue905팢Ⱑ", "\ue1e5\uf6c2㯖顃", android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), objArr2422);
                        java.lang.String intern2102 = ((java.lang.String) objArr2422[0]).intern();
                        java.lang.Object[] objArr2522 = new java.lang.Object[1];
                        c("敜\udc9d\ud8ee싕珗\uf082", "\uffd0뼐䑳ꯆ", android.text.TextUtils.indexOf(str, str), "\u0000\u0000\u0000\u0000", (char) (50756 - android.view.KeyEvent.getDeadChar(0, 0)), objArr2522);
                        java.lang.String intern3102 = ((java.lang.String) objArr2522[0]).intern();
                        java.lang.Object[] objArr2622 = new java.lang.Object[1];
                        c("啙ꑋ䓿\ue5a6聫酒빝", "맪든镗ⲑ", android.text.TextUtils.getOffsetBefore(str, 0) + 1471471801, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getOffsetBefore(str, 0), objArr2622);
                        java.lang.String intern472 = ((java.lang.String) objArr2622[0]).intern();
                        java.lang.Object[] objArr2722 = new java.lang.Object[1];
                        c("ಣ秚ﱖ뛂鞢け⊆믙⳺", "\ue772쭴⊏ヨ", android.view.KeyEvent.keyCodeFromString(str) - 1882491673, "\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr2722);
                        java.lang.String intern522 = ((java.lang.String) objArr2722[0]).intern();
                        java.lang.Object[] objArr2822 = new java.lang.Object[1];
                        c("軺毬㽳Ὠ\u0bab槪", "㙊恤☃\uedf5", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', "\u0000\u0000\u0000\u0000", (char) (62758 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr2822);
                        java.lang.String intern622 = ((java.lang.String) objArr2822[0]).intern();
                        java.lang.Object[] objArr2922 = new java.lang.Object[1];
                        c("ᛷܡ冕誛觸籶\u0b53噞㨲榺\u0b50귨뮬", "操\udbe0罣蝱", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1675354212, "\u0000\u0000\u0000\u0000", (char) (29055 - android.graphics.Color.argb(0, 0, 0, 0)), objArr2922);
                        java.lang.String intern722 = ((java.lang.String) objArr2922[0]).intern();
                        java.lang.Object[] objArr3022 = new java.lang.Object[1];
                        c("ⴓ洛\ue014穿㨱", "ね嵩ꉣ쭍", 1667066160 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000\u0000\u0000\u0000", (char) (19874 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr3022);
                        java.lang.String intern822 = ((java.lang.String) objArr3022[0]).intern();
                        java.lang.Object[] objArr3122 = new java.lang.Object[1];
                        b(true, "\bￒ\u0005\u0011\u0004\u000f", 244 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr3122);
                        java.lang.String intern922 = ((java.lang.String) objArr3122[0]).intern();
                        java.lang.Object[] objArr3222 = new java.lang.Object[1];
                        b(false, "\ufff9\u0007", 259 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, objArr3222);
                        java.lang.String intern1022 = ((java.lang.String) objArr3222[0]).intern();
                        java.lang.Object[] objArr3322 = new java.lang.Object[1];
                        c("펥ﲎ\uf639ễ铭열串ꪜ⫺\udc85Ԉ閎ᕯ굆슶Ш", "숁뭔ꣿ墨", android.view.KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15017), objArr3322);
                        java.lang.String intern1122 = ((java.lang.String) objArr3322[0]).intern();
                        java.lang.Object[] objArr3422 = new java.lang.Object[1];
                        c("㓄偹ⷛ⾣瞏崚躕稪幊䧀", "蘷泃뢄\ue1e6", android.graphics.Color.green(0), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3422);
                        java.lang.String intern1222 = ((java.lang.String) objArr3422[0]).intern();
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        c("鿌⩍ೢ幗ᡛ襍鶇ﳮ", "ⷀѶি\udfa3", (-1) - android.os.Process.getGidForName(str), "\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), objArr3522);
                        java.lang.String intern1322 = ((java.lang.String) objArr3522[0]).intern();
                        java.lang.Object[] objArr3622 = new java.lang.Object[1];
                        b(true, "\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002\u0005\ufff9￼", 253 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, android.view.MotionEvent.axisFromString(str) + 13, objArr3622);
                        java.lang.String intern1422 = ((java.lang.String) objArr3622[0]).intern();
                        java.lang.Object[] objArr3722 = new java.lang.Object[1];
                        b(false, "\u0004\ufffb\ufff8\u0004\u0001\u0001\ufffa\ufff8\t\ufff8\t\u0001\u0005\u0007", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr3722);
                        java.lang.String intern1522 = ((java.lang.String) objArr3722[0]).intern();
                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                        b(false, "\u0006\uffff\u0005\u0003\ufff6\ufffe\u0000", 258 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, 7 - android.view.View.resolveSizeAndState(0, 0, 0), objArr3822);
                        java.lang.String intern1622 = ((java.lang.String) objArr3822[0]).intern();
                        java.lang.Object[] objArr3922 = new java.lang.Object[1];
                        c("豾芶⼄堛蝦瞀詒", "ᜓ㘫ɘ杉", 1479944983 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr3922);
                        java.lang.String intern1722 = ((java.lang.String) objArr3922[0]).intern();
                        java.lang.Object[] objArr4022 = new java.lang.Object[1];
                        c("\ue8b7\uef90\u0a3aﳡⳆꃔ쪚", "鶕譈툄譙", 76236956 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.view.View.combineMeasuredStates(0, 0), objArr4022);
                        java.lang.String intern1822 = ((java.lang.String) objArr4022[0]).intern();
                        java.lang.Object[] objArr4122 = new java.lang.Object[1];
                        b(false, "\u0000\u0000", (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr4122);
                        java.lang.String intern1922 = ((java.lang.String) objArr4122[0]).intern();
                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                        c("ᐑ\ue07e녚슰⚎죝뗆䳿렆ʃ쥰톓㩯롘돪탈뒱듕漕齻", "㟽귕鮄\uebc0", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr4222);
                        java.lang.String intern2022 = ((java.lang.String) objArr4222[0]).intern();
                        java.lang.Object[] objArr4322 = new java.lang.Object[1];
                        c("ຽ榜먀\uf7bd\ue656\ue2d7", "\udd6e་鉰獻", android.graphics.Color.alpha(0), "\u0000\u0000\u0000\u0000", (char) (31634 - android.text.TextUtils.getOffsetAfter(str, 0)), objArr4322);
                        java.lang.String intern2122 = ((java.lang.String) objArr4322[0]).intern();
                        java.lang.Object[] objArr4422 = new java.lang.Object[1];
                        b(true, "\uffff\u0001", 264 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4422);
                        java.lang.String intern2222 = ((java.lang.String) objArr4422[0]).intern();
                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                        c("竧挰跭䉺✮뗶帜ş寃莌‱얙嵠퐩䡉濓", "鞇\u2d6d㢼䣌", android.graphics.Color.blue(0), "\u0000\u0000\u0000\u0000", (char) (52281 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr4522);
                        java.lang.String intern2322 = ((java.lang.String) objArr4522[0]).intern();
                        java.lang.Object[] objArr4622 = new java.lang.Object[1];
                        b(true, "\n\ufff7\u0006\ufffb\ufff9\ufff7\b\n\ufffe", 252 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, 10 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4622);
                        java.lang.String intern2422 = ((java.lang.String) objArr4622[0]).intern();
                        java.lang.Object[] objArr4722 = new java.lang.Object[1];
                        b(false, "\r￼\ufffe\u0000\u000b￼\u000f\u0003\uffd1\u000f", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9 - android.text.TextUtils.getOffsetAfter(str, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 10, objArr4722);
                        java.lang.String intern2522 = ((java.lang.String) objArr4722[0]).intern();
                        java.lang.Object[] objArr4822 = new java.lang.Object[1];
                        b(false, "\r\ufffeￏ\r\u000b\ufffa￼\ufffe\u000b\b\u000e", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 250, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4, android.text.TextUtils.getOffsetAfter(str, 0) + 11, objArr4822);
                        java.lang.String intern2622 = ((java.lang.String) objArr4822[0]).intern();
                        java.lang.Object[] objArr4922 = new java.lang.Object[1];
                        c("악밪쮲윰᪹䇖\ue9e6扄た⼞鞍", "딺ꮈᐰ彝", 816548020 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4922);
                        java.lang.String intern2722 = ((java.lang.String) objArr4922[0]).intern();
                        java.lang.Object[] objArr5022 = new java.lang.Object[1];
                        c("畹ᣐ\ueb4f䡺瞆ৡཛྷᨅ釨潕忿\ue20d갊揰톎", "ꁸ苉齢퓪", 1652738465 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getCapsMode(str, 0, 0) + 60063), objArr5022);
                        java.lang.String intern2822 = ((java.lang.String) objArr5022[0]).intern();
                        java.lang.Object[] objArr5122 = new java.lang.Object[1];
                        b(true, "\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2\ufff7\u0001￼", 256 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5122);
                        java.lang.String[] strArr322 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5122[0]).intern()};
                        java.lang.Object[] objArr5222 = new java.lang.Object[1];
                        b(false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", 248 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2 - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.blue(0) + 11, objArr5222);
                        java.lang.Object[] objArr5322 = {((java.lang.String) objArr5222[0]).intern()};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr5322);
                        if (invoke != null) {
                        }
                        i2 = i;
                        i3 = i18;
                        str2 = str;
                        java.lang.Object[] objArr73222222 = new java.lang.Object[1];
                        b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr73222222);
                        java.lang.Object[] objArr74222222 = {((java.lang.String) objArr73222222[0]).intern()};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue7222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr74222222)).longValue();
                        long j21222222 = ~longValue7222222;
                        long j22222222 = j21222222 | j6;
                        long j23222222 = 960725509 | longValue7222222;
                        long j24222222 = ~(j23222222 | j5);
                        long j25222222 = (longValue7222222 * 253) + 243063553777L + (((~(j21222222 | (-960725510))) | (~j22222222) | j24222222) * (-252)) + (j23222222 * (-252)) + ((j24222222 | (~(960725509 | j22222222))) * 252) + 329814558;
                        j = (((int) j25222222) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j25222222 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
                        str3 = str2;
                        java.lang.Object[] objArr76222222 = new java.lang.Object[1];
                        c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr76222222);
                        java.lang.Object[] objArr77222222 = {((java.lang.String) objArr76222222[0]).intern()};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue8222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr77222222)).longValue();
                        long j26222222 = ~longValue8222222;
                        long j27222222 = (-327536127) | j26222222;
                        long j28222222 = (((-496) * longValue8222222) - 162457918496L) + ((~j27222222) * 497) + (((~(j27222222 | j5)) | (~(j26222222 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue8222222 | (-327536127))) | (~(327536126 | j26222222 | j5))) * 497) + 963003941;
                        long j29222222 = (((int) (j28222222 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j28222222) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
                        if (j > 0) {
                        }
                        java.lang.Object[] objArr82222222 = new java.lang.Object[1];
                        b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr82222222);
                        java.lang.Object[] objArr83222222 = {((java.lang.String) objArr82222222[0]).intern()};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long j30222222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr83222222)).longValue();
                        long j31222222 = (-689367363) | j30222222;
                        long j32222222 = ((r1 * (-344)) - 237142372528L) + (((~j31222222) | (~((-689367363) | j5))) * 345) + (((~(j30222222 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j31222222 | j5)) * 345) + 601172705;
                        j2 = (((int) j32222222) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j32222222 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
                        java.lang.Object[] objArr85222222 = new java.lang.Object[1];
                        b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr85222222);
                        java.lang.Object[] objArr86222222 = {((java.lang.String) objArr85222222[0]).intern()};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue9222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr86222222)).longValue();
                        long j33222222 = longValue9222222 | j5;
                        long j34222222 = (((-929) * longValue9222222) - 412175524480L) + (((~j33222222) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue9222222) * 930) + (((-888309321) | j33222222) * 465) + 402230747;
                        long j35222222 = (((int) (j34222222 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j34222222) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
                        if (j2 <= 0) {
                        }
                        java.lang.Object[] objArr91222222 = new java.lang.Object[1];
                        c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr91222222);
                        java.lang.String intern30222222 = ((java.lang.String) objArr91222222[0]).intern();
                        int touchSlop222222 = android.view.ViewConfiguration.getTouchSlop();
                        char indexOf422222 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
                        java.lang.Object[] objArr92222222 = new java.lang.Object[1];
                        c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop222222 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf422222, objArr92222222);
                        java.lang.String intern31222222 = ((java.lang.String) objArr92222222[0]).intern();
                        java.lang.Object[] objArr93222222 = new java.lang.Object[1];
                        c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr93222222);
                        java.lang.String intern32222222 = ((java.lang.String) objArr93222222[0]).intern();
                        java.lang.Object[] objArr94222222 = new java.lang.Object[1];
                        b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr94222222);
                        java.lang.String intern33222222 = ((java.lang.String) objArr94222222[0]).intern();
                        java.lang.Object[] objArr95222222 = new java.lang.Object[1];
                        b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr95222222);
                        java.lang.String intern34222222 = ((java.lang.String) objArr95222222[0]).intern();
                        java.lang.Object[] objArr96222222 = new java.lang.Object[1];
                        c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr96222222);
                        java.lang.String intern35222222 = ((java.lang.String) objArr96222222[0]).intern();
                        java.lang.Object[] objArr97222222 = new java.lang.Object[1];
                        b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr97222222);
                        java.lang.String[] strArr4222222 = {intern30222222, intern31222222, intern32222222, intern33222222, intern34222222, intern35222222, ((java.lang.String) objArr97222222[0]).intern()};
                        i4 = 0;
                        while (true) {
                            if (i4 < 7) {
                            }
                            i4++;
                        }
                        if (i5 == 0) {
                        }
                    } else {
                        i20++;
                        i21 = 2;
                        i16 = 0;
                    }
                }
            }
            str = "";
            java.lang.Object[] objArr24222 = new java.lang.Object[1];
            c("檆ⷞ晓攂ؘ\ue905팢Ⱑ", "\ue1e5\uf6c2㯖顃", android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.normalizeMetaState(0), objArr24222);
            java.lang.String intern21022 = ((java.lang.String) objArr24222[0]).intern();
            java.lang.Object[] objArr25222 = new java.lang.Object[1];
            c("敜\udc9d\ud8ee싕珗\uf082", "\uffd0뼐䑳ꯆ", android.text.TextUtils.indexOf(str, str), "\u0000\u0000\u0000\u0000", (char) (50756 - android.view.KeyEvent.getDeadChar(0, 0)), objArr25222);
            java.lang.String intern31022 = ((java.lang.String) objArr25222[0]).intern();
            java.lang.Object[] objArr26222 = new java.lang.Object[1];
            c("啙ꑋ䓿\ue5a6聫酒빝", "맪든镗ⲑ", android.text.TextUtils.getOffsetBefore(str, 0) + 1471471801, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getOffsetBefore(str, 0), objArr26222);
            java.lang.String intern4722 = ((java.lang.String) objArr26222[0]).intern();
            java.lang.Object[] objArr27222 = new java.lang.Object[1];
            c("ಣ秚ﱖ뛂鞢け⊆믙⳺", "\ue772쭴⊏ヨ", android.view.KeyEvent.keyCodeFromString(str) - 1882491673, "\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr27222);
            java.lang.String intern5222 = ((java.lang.String) objArr27222[0]).intern();
            java.lang.Object[] objArr28222 = new java.lang.Object[1];
            c("軺毬㽳Ὠ\u0bab槪", "㙊恤☃\uedf5", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', "\u0000\u0000\u0000\u0000", (char) (62758 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr28222);
            java.lang.String intern6222 = ((java.lang.String) objArr28222[0]).intern();
            java.lang.Object[] objArr29222 = new java.lang.Object[1];
            c("ᛷܡ冕誛觸籶\u0b53噞㨲榺\u0b50귨뮬", "操\udbe0罣蝱", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1675354212, "\u0000\u0000\u0000\u0000", (char) (29055 - android.graphics.Color.argb(0, 0, 0, 0)), objArr29222);
            java.lang.String intern7222 = ((java.lang.String) objArr29222[0]).intern();
            java.lang.Object[] objArr30222 = new java.lang.Object[1];
            c("ⴓ洛\ue014穿㨱", "ね嵩ꉣ쭍", 1667066160 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000\u0000\u0000\u0000", (char) (19874 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr30222);
            java.lang.String intern8222 = ((java.lang.String) objArr30222[0]).intern();
            java.lang.Object[] objArr31222 = new java.lang.Object[1];
            b(true, "\bￒ\u0005\u0011\u0004\u000f", 244 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr31222);
            java.lang.String intern9222 = ((java.lang.String) objArr31222[0]).intern();
            java.lang.Object[] objArr32222 = new java.lang.Object[1];
            b(false, "\ufff9\u0007", 259 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, objArr32222);
            java.lang.String intern10222 = ((java.lang.String) objArr32222[0]).intern();
            java.lang.Object[] objArr33222 = new java.lang.Object[1];
            c("펥ﲎ\uf639ễ铭열串ꪜ⫺\udc85Ԉ閎ᕯ굆슶Ш", "숁뭔ꣿ墨", android.view.KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15017), objArr33222);
            java.lang.String intern11222 = ((java.lang.String) objArr33222[0]).intern();
            java.lang.Object[] objArr34222 = new java.lang.Object[1];
            c("㓄偹ⷛ⾣瞏崚躕稪幊䧀", "蘷泃뢄\ue1e6", android.graphics.Color.green(0), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr34222);
            java.lang.String intern12222 = ((java.lang.String) objArr34222[0]).intern();
            java.lang.Object[] objArr35222 = new java.lang.Object[1];
            c("鿌⩍ೢ幗ᡛ襍鶇ﳮ", "ⷀѶি\udfa3", (-1) - android.os.Process.getGidForName(str), "\u0000\u0000\u0000\u0000", (char) android.graphics.Color.green(0), objArr35222);
            java.lang.String intern13222 = ((java.lang.String) objArr35222[0]).intern();
            java.lang.Object[] objArr36222 = new java.lang.Object[1];
            b(true, "\u0005\b\u0006\ufffa\n\ufff9\ufffb\u0002\u0002\u0005\ufff9￼", 253 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, android.view.MotionEvent.axisFromString(str) + 13, objArr36222);
            java.lang.String intern14222 = ((java.lang.String) objArr36222[0]).intern();
            java.lang.Object[] objArr37222 = new java.lang.Object[1];
            b(false, "\u0004\ufffb\ufff8\u0004\u0001\u0001\ufffa\ufff8\t\ufff8\t\u0001\u0005\u0007", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr37222);
            java.lang.String intern15222 = ((java.lang.String) objArr37222[0]).intern();
            java.lang.Object[] objArr38222 = new java.lang.Object[1];
            b(false, "\u0006\uffff\u0005\u0003\ufff6\ufffe\u0000", 258 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, 7 - android.view.View.resolveSizeAndState(0, 0, 0), objArr38222);
            java.lang.String intern16222 = ((java.lang.String) objArr38222[0]).intern();
            java.lang.Object[] objArr39222 = new java.lang.Object[1];
            c("豾芶⼄堛蝦瞀詒", "ᜓ㘫ɘ杉", 1479944983 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr39222);
            java.lang.String intern17222 = ((java.lang.String) objArr39222[0]).intern();
            java.lang.Object[] objArr40222 = new java.lang.Object[1];
            c("\ue8b7\uef90\u0a3aﳡⳆꃔ쪚", "鶕譈툄譙", 76236956 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.view.View.combineMeasuredStates(0, 0), objArr40222);
            java.lang.String intern18222 = ((java.lang.String) objArr40222[0]).intern();
            java.lang.Object[] objArr41222 = new java.lang.Object[1];
            b(false, "\u0000\u0000", (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr41222);
            java.lang.String intern19222 = ((java.lang.String) objArr41222[0]).intern();
            java.lang.Object[] objArr42222 = new java.lang.Object[1];
            c("ᐑ\ue07e녚슰⚎죝뗆䳿렆ʃ쥰톓㩯롘돪탈뒱듕漕齻", "㟽귕鮄\uebc0", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr42222);
            java.lang.String intern20222 = ((java.lang.String) objArr42222[0]).intern();
            java.lang.Object[] objArr43222 = new java.lang.Object[1];
            c("ຽ榜먀\uf7bd\ue656\ue2d7", "\udd6e་鉰獻", android.graphics.Color.alpha(0), "\u0000\u0000\u0000\u0000", (char) (31634 - android.text.TextUtils.getOffsetAfter(str, 0)), objArr43222);
            java.lang.String intern21222 = ((java.lang.String) objArr43222[0]).intern();
            java.lang.Object[] objArr44222 = new java.lang.Object[1];
            b(true, "\uffff\u0001", 264 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr44222);
            java.lang.String intern22222 = ((java.lang.String) objArr44222[0]).intern();
            java.lang.Object[] objArr45222 = new java.lang.Object[1];
            c("竧挰跭䉺✮뗶帜ş寃莌‱얙嵠퐩䡉濓", "鞇\u2d6d㢼䣌", android.graphics.Color.blue(0), "\u0000\u0000\u0000\u0000", (char) (52281 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr45222);
            java.lang.String intern23222 = ((java.lang.String) objArr45222[0]).intern();
            java.lang.Object[] objArr46222 = new java.lang.Object[1];
            b(true, "\n\ufff7\u0006\ufffb\ufff9\ufff7\b\n\ufffe", 252 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, 10 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr46222);
            java.lang.String intern24222 = ((java.lang.String) objArr46222[0]).intern();
            java.lang.Object[] objArr47222 = new java.lang.Object[1];
            b(false, "\r￼\ufffe\u0000\u000b￼\u000f\u0003\uffd1\u000f", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9 - android.text.TextUtils.getOffsetAfter(str, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 10, objArr47222);
            java.lang.String intern25222 = ((java.lang.String) objArr47222[0]).intern();
            java.lang.Object[] objArr48222 = new java.lang.Object[1];
            b(false, "\r\ufffeￏ\r\u000b\ufffa￼\ufffe\u000b\b\u000e", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 250, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4, android.text.TextUtils.getOffsetAfter(str, 0) + 11, objArr48222);
            java.lang.String intern26222 = ((java.lang.String) objArr48222[0]).intern();
            java.lang.Object[] objArr49222 = new java.lang.Object[1];
            c("악밪쮲윰᪹䇖\ue9e6扄た⼞鞍", "딺ꮈᐰ彝", 816548020 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr49222);
            java.lang.String intern27222 = ((java.lang.String) objArr49222[0]).intern();
            java.lang.Object[] objArr50222 = new java.lang.Object[1];
            c("畹ᣐ\ueb4f䡺瞆ৡཛྷᨅ釨潕忿\ue20d갊揰톎", "ꁸ苉齢퓪", 1652738465 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getCapsMode(str, 0, 0) + 60063), objArr50222);
            java.lang.String intern28222 = ((java.lang.String) objArr50222[0]).intern();
            java.lang.Object[] objArr51222 = new java.lang.Object[1];
            b(true, "\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2\ufff7\u0001￼", 256 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr51222);
            java.lang.String[] strArr3222 = {intern21022, intern31022, intern4722, intern5222, intern6222, intern7222, intern8222, intern9222, intern10222, intern11222, intern12222, intern13222, intern14222, intern15222, intern16222, intern17222, intern18222, intern19222, intern20222, intern21222, intern22222, intern23222, intern24222, intern25222, intern26222, intern27222, intern28222, ((java.lang.String) objArr51222[0]).intern()};
            java.lang.Object[] objArr52222 = new java.lang.Object[1];
            b(false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", 248 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2 - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.blue(0) + 11, objArr52222);
            java.lang.Object[] objArr53222 = {((java.lang.String) objArr52222[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr53222);
            if (invoke != null) {
            }
            i2 = i;
            i3 = i18;
            str2 = str;
            java.lang.Object[] objArr732222222 = new java.lang.Object[1];
            b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr732222222);
            java.lang.Object[] objArr742222222 = {((java.lang.String) objArr732222222[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue72222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr742222222)).longValue();
            long j212222222 = ~longValue72222222;
            long j222222222 = j212222222 | j6;
            long j232222222 = 960725509 | longValue72222222;
            long j242222222 = ~(j232222222 | j5);
            long j252222222 = (longValue72222222 * 253) + 243063553777L + (((~(j212222222 | (-960725510))) | (~j222222222) | j242222222) * (-252)) + (j232222222 * (-252)) + ((j242222222 | (~(960725509 | j222222222))) * 252) + 329814558;
            j = (((int) j252222222) & ((((~(i3 | (-1717218575))) | 1140522311) * 226) + 2055568080 + (((~((-1140522312) | i2)) | 27283521 | (~(i3 | (-603979785)))) * (-113)) + ((~((-1717218575) | i2)) * 113))) | (((int) (j252222222 >> 32)) & (((((-1367968098) | i2) * (-859)) - 1306727280) + (((~(i3 | (-1367968098))) | (~(1506650611 | i2))) * 859) + (((~(i3 | 1489772787)) | 16877824) * 859)));
            str3 = str2;
            java.lang.Object[] objArr762222222 = new java.lang.Object[1];
            c("㊂믠퓜쭯剰浟꼮繥풺朕쳉╭鿟\ufde5\udc3dᮖ\ud940", "鿚慃⺖ꑃ", (-1772010593) - android.text.TextUtils.indexOf(str3, str3, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getSize(0) + 17198), objArr762222222);
            java.lang.Object[] objArr772222222 = {((java.lang.String) objArr762222222[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue82222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr772222222)).longValue();
            long j262222222 = ~longValue82222222;
            long j272222222 = (-327536127) | j262222222;
            long j282222222 = (((-496) * longValue82222222) - 162457918496L) + ((~j272222222) * 497) + (((~(j272222222 | j5)) | (~(j262222222 | j6 | 327536126))) * 497) + (((~(j6 | (-327536127))) | (~(longValue82222222 | (-327536127))) | (~(327536126 | j262222222 | j5))) * 497) + 963003941;
            long j292222222 = (((int) (j282222222 >> 32)) & ((((((~(1806078113 | i2)) | (-2142214580)) * 576) - 1771464918) + (((~(i3 | (-336136467))) | 1090551808) * 576)) - 1259984128)) | (((int) j282222222) & ((((~(i3 | (-344411884))) | 344345194) * (-241)) + 1206499103 + (((~(i3 | (-66690))) | (-2125983488)) * 241)));
            if (j > 0) {
            }
            java.lang.Object[] objArr822222222 = new java.lang.Object[1];
            b(true, "\n\u0003\u0011ￍ\u0011\u0004ￍ\u0011\u0017\u0011ￍ\u0003\u0001\u0010\r\u0004\f\u0003ￍ\u0016\u0013\f\u0007", android.os.Process.getGidForName(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 11 - android.view.View.combineMeasuredStates(0, 0), 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr822222222);
            java.lang.Object[] objArr832222222 = {((java.lang.String) objArr822222222[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long j302222222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr832222222)).longValue();
            long j312222222 = (-689367363) | j302222222;
            long j322222222 = ((r1 * (-344)) - 237142372528L) + (((~j312222222) | (~((-689367363) | j5))) * 345) + (((~(j302222222 | 689367362)) | (~(j6 | (-689367363)))) * 345) + ((~(j312222222 | j5)) * 345) + 601172705;
            j2 = (((int) j322222222) & (((r2 * 495) - 1446896726) + (((~(i3 | 1102039879)) | 1084607238) * 495))) | (((int) (j322222222 >> 32)) & (((((~(i3 | (-680521938))) | (~(765457625 | i2))) * (-831)) - 1740918862) + ((~((-8753153) | i2)) * (-1662)) + (((~(i3 | (-756704474))) | (~(756704473 | i2)) | (~(680521937 | i2))) * 831)));
            java.lang.Object[] objArr852222222 = new java.lang.Object[1];
            b(false, "\u001bￔ\t\n", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 1, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr852222222);
            java.lang.Object[] objArr862222222 = {((java.lang.String) objArr852222222[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue92222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr862222222)).longValue();
            long j332222222 = longValue92222222 | j5;
            long j342222222 = (((-929) * longValue92222222) - 412175524480L) + (((~j332222222) | (-888309321)) * (-465)) + (((~((-888309321) | j5)) | longValue92222222) * 930) + (((-888309321) | j332222222) * 465) + 402230747;
            long j352222222 = (((int) (j342222222 >> 32)) & (((((~((-537133065) | i2)) | (-2126491582)) * 449) - 888356834) + (((~(i3 | (-537133065))) | (-2126491582)) * 449))) | (((int) j342222222) & (((((~((-177750057) | i2)) | (~(i3 | 2128272890))) * 497) - 1952806664) + (((~(i3 | (-513296425))) | 335546368 | (~(2128272890 | i2))) * 497)));
            if (j2 <= 0) {
            }
            java.lang.Object[] objArr912222222 = new java.lang.Object[1];
            c("앖湗\ue14c䋈\ueca6暼밐", "ོ葼묛\uea21", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 461667342, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.getCapsMode(str3, 0, 0), objArr912222222);
            java.lang.String intern302222222 = ((java.lang.String) objArr912222222[0]).intern();
            int touchSlop2222222 = android.view.ViewConfiguration.getTouchSlop();
            char indexOf4222222 = (char) android.text.TextUtils.indexOf(str3, str3, 0);
            java.lang.Object[] objArr922222222 = new java.lang.Object[1];
            c("ߨ俹쁗햡顔㷌摠\uddc0쪣\ue139ʨ", "蠖줏\uecd4뀢", (touchSlop2222222 >> 8) - 725020792, "\u0000\u0000\u0000\u0000", indexOf4222222, objArr922222222);
            java.lang.String intern312222222 = ((java.lang.String) objArr922222222[0]).intern();
            java.lang.Object[] objArr932222222 = new java.lang.Object[1];
            c("冻⎝䃞\udc2d櫽줾\uecd7甞踱⏇퉱ꃥ", "쨦ᗫ頬뀺", android.widget.ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr932222222);
            java.lang.String intern322222222 = ((java.lang.String) objArr932222222[0]).intern();
            java.lang.Object[] objArr942222222 = new java.lang.Object[1];
            b(true, "ￋ\t\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014", android.text.TextUtils.indexOf(str3, str3, 0) + 247, android.view.KeyEvent.normalizeMetaState(0) + 8, 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr942222222);
            java.lang.String intern332222222 = ((java.lang.String) objArr942222222[0]).intern();
            java.lang.Object[] objArr952222222 = new java.lang.Object[1];
            b(false, "\u0004\u000f\u0012ￏ\u0002\t\u000eￏ\u0016\u0005\u000e", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 11 - android.view.View.MeasureSpec.getSize(0), objArr952222222);
            java.lang.String intern342222222 = ((java.lang.String) objArr952222222[0]).intern();
            java.lang.Object[] objArr962222222 = new java.lang.Object[1];
            c("᳜ǿ⇮㙪ᾋ", "Ợ鎒Ļ蒲", 999526942 - android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45569), objArr962222222);
            java.lang.String intern352222222 = ((java.lang.String) objArr962222222[0]).intern();
            java.lang.Object[] objArr972222222 = new java.lang.Object[1];
            b(true, "\u000bￕ\t\u001a", 237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr972222222);
            java.lang.String[] strArr42222222 = {intern302222222, intern312222222, intern322222222, intern332222222, intern342222222, intern352222222, ((java.lang.String) objArr972222222[0]).intern()};
            i4 = 0;
            while (true) {
                if (i4 < 7) {
                }
                i4++;
            }
            if (i5 == 0) {
            }
        } catch (java.lang.Throwable th9) {
            java.lang.Throwable cause6 = th9.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th9;
        }
    }
}
