package com.payair.hce;

/* loaded from: classes4.dex */
public final class setEmptyView {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static char getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static char getProfileVersion;
    private static char values;
    private int AlternateContactlessPaymentDataJson;
    private char DigitizedCardProfile;
    private boolean valueOf;
    private java.io.Reader writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 * 2;
        int i5 = b + 4;
        int i6 = 110 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            i6 = i7;
            int i8 = i5;
            int i9 = 0;
            i6 += i5;
            i5 = i8;
            i3 = i9;
            int i10 = i5 + 1;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i10;
            i5 = bArr[i10];
            i6 += i5;
            i5 = i8;
            i3 = i9;
            int i102 = i5 + 1;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i5 + 1;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 319) + (i2 * (-317)) + (((~((~i) | i3)) | i4) * (-318)) + (((~(i4 | i3)) | (~(i5 | i | i2))) * 318) + (((~(i | i4 | i5)) | (~(i2 | i | i3))) * 318);
        if (i6 != 1) {
            com.payair.hce.setEmptyView setemptyview = (com.payair.hce.setEmptyView) objArr[0];
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("닥쾬㜗ҵ萬ࡃ듪\ue02d䞊鬸ꄛ滎袝\uf0f0", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(setemptyview.AlternateContactlessPaymentDataJson);
            java.lang.String obj = sb.toString();
            getCvrMaskAnd = (getGpoResponse + 1) % 128;
            return obj;
        }
        java.lang.String str = (java.lang.String) objArr[0];
        getCvrMaskAnd = (getGpoResponse + 41) % 128;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (!java.lang.Character.isDigit(charAt)) {
                int i8 = getGpoResponse;
                getCvrMaskAnd = (i8 + 69) % 128;
                if (charAt != '-') {
                    getCvrMaskAnd = (i8 + 61) % 128;
                    if (charAt != '.') {
                        int i9 = (i8 + 83) % 128;
                        getCvrMaskAnd = i9;
                        if (charAt != '+' && charAt != 'e') {
                            int i10 = i9 + 61;
                            getGpoResponse = i10 % 128;
                            if (i10 % 2 == 0) {
                                if (charAt != '6') {
                                    return java.lang.Boolean.FALSE;
                                }
                            } else if (charAt != 'E') {
                                return java.lang.Boolean.FALSE;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }

    public setEmptyView(java.io.Reader reader) {
        this.writeReplace = reader.markSupported() ? reader : new java.io.BufferedReader(reader);
        this.valueOf = false;
        this.AlternateContactlessPaymentDataJson = 0;
    }

    public setEmptyView(java.lang.String str) {
        this(new java.io.StringReader(str));
    }

    private void valueOf() throws com.payair.hce.setOnGroupCollapseListener {
        int i = getGpoResponse;
        getCvrMaskAnd = (i + 107) % 128;
        if (!this.valueOf) {
            getCvrMaskAnd = (i + 15) % 128;
            int i2 = this.AlternateContactlessPaymentDataJson;
            if (i2 > 0) {
                this.AlternateContactlessPaymentDataJson = i2 - 1;
                this.valueOf = true;
                int i3 = i + 7;
                getCvrMaskAnd = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("蠗\ue1e8\ud92dﳍ䖳벴ꇙ䨵蛀귛䞊鬸耹⭂䯾ꖩ뻎䜽켽∵\ud92dﳍ冽ꌌࡖ碋\ua7df\uec9d賷\ud913렒燳\udb6d쯒哝駀䉖黶䁩蓌", 40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        throw new com.payair.hce.setOnGroupCollapseListener(((java.lang.String) objArr[0]).intern());
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 99;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $10 = ($11 + 41) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getAid)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 62, android.view.View.resolveSize(0, 0) + 1335, (char) android.view.View.combineMeasuredStates(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, 0, (byte) -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1335 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, 0, (byte) -1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777163) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3544, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $10 = ($11 + 105) % 128;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i7 = $11 + 9;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void b(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i2 = ($11 + 21) % 128;
        $10 = i2;
        if (str3 != null) {
            $11 = (i2 + 125) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            int i3 = $11 + 95;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr4, 0, length);
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 1) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(72 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1179 - (android.os.Process.myTid() >> 22), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(8, 0, (byte) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3444, (char) (3831 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr4[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr5[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1865, (char) (41775 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(5, 0, (byte) -1, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr4[intValue2] * 32718), java.lang.Integer.valueOf(cArr5[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, android.view.View.resolveSize(0, 0) + 3133, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c(length4, b, (byte) (b - 1), objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr5[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr4[intValue2] = getwalletdata.values;
                cArr6[getwalletdata.writeReplace] = (char) ((((cArr4[intValue2] ^ r3[getwalletdata.writeReplace]) ^ (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L))) ^ ((char) (getCiacDecline ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    private char values() throws com.payair.hce.setOnGroupCollapseListener {
        int i = getCvrMaskAnd;
        int i2 = i + 71;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.valueOf) {
                this.valueOf = false;
                char c = this.DigitizedCardProfile;
                if (c != 0) {
                    int i3 = i + 49;
                    getGpoResponse = i3 % 128;
                    this.AlternateContactlessPaymentDataJson = i3 % 2 == 0 ? this.AlternateContactlessPaymentDataJson : this.AlternateContactlessPaymentDataJson + 1;
                }
                return c;
            }
            try {
                int read = this.writeReplace.read();
                if (read <= 0) {
                    this.DigitizedCardProfile = (char) 0;
                    return (char) 0;
                }
                this.AlternateContactlessPaymentDataJson++;
                char c2 = (char) read;
                this.DigitizedCardProfile = c2;
                return c2;
            } catch (java.io.IOException e) {
                throw new com.payair.hce.setOnGroupCollapseListener(e);
            }
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String writeReplace(int i) throws com.payair.hce.setOnGroupCollapseListener {
        int i2;
        int i3 = getGpoResponse + 21;
        int i4 = i3 % 128;
        getCvrMaskAnd = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        if (this.valueOf) {
            int i5 = i4 + 63;
            getGpoResponse = i5 % 128;
            if (i5 % 2 == 0) {
                this.valueOf = false;
                cArr[1] = this.DigitizedCardProfile;
            } else {
                this.valueOf = false;
                cArr[0] = this.DigitizedCardProfile;
                i2 = 1;
                while (i2 < i) {
                    try {
                        int read = this.writeReplace.read(cArr, i2, i - i2);
                        if (read == -1) {
                            break;
                        }
                        getCvrMaskAnd = (getGpoResponse + 83) % 128;
                        i2 += read;
                    } catch (java.io.IOException e) {
                        throw new com.payair.hce.setOnGroupCollapseListener(e);
                    }
                }
                this.AlternateContactlessPaymentDataJson += i2;
                if (i2 >= i) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    b("悔幎ȝ艑煈ࣃㄒນ䍸㮾锪푻筕칿櫠澌֟퇓㖳ৄᢟ\u0a7c", "轌絑ඳ焍", android.view.View.MeasureSpec.getSize(0), "⌔슨鸞宨", (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                    throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern());
                }
                this.DigitizedCardProfile = cArr[i - 1];
                return new java.lang.String(cArr);
            }
        }
        i2 = 0;
        while (i2 < i) {
        }
        this.AlternateContactlessPaymentDataJson += i2;
        if (i2 >= i) {
        }
    }

    private char writeReplace() throws com.payair.hce.setOnGroupCollapseListener {
        char values2;
        while (true) {
            values2 = values();
            if (values2 == 0 || values2 > ' ') {
                break;
            }
            int i = getCvrMaskAnd + 109;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                int i2 = 4 / 4;
            }
        }
        getCvrMaskAnd = (getGpoResponse + 119) % 128;
        return values2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        throw AlternateContactlessPaymentDataJson(((java.lang.String) r9[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String AlternateContactlessPaymentDataJson(char c) throws com.payair.hce.setOnGroupCollapseListener {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            char values2 = values();
            if (values2 == 0 || values2 == '\n' || values2 == '\r') {
                break;
            }
            if (values2 == '\\') {
                char values3 = values();
                if (values3 == 'b') {
                    sb.append('\b');
                } else if (values3 == 'f') {
                    sb.append('\f');
                } else if (values3 == 'n') {
                    sb.append('\n');
                } else if (values3 == 'r') {
                    sb.append('\r');
                } else if (values3 == 'x') {
                    sb.append((char) java.lang.Integer.parseInt(writeReplace(2), 16));
                } else if (values3 == 't') {
                    sb.append('\t');
                } else if (values3 == 'u') {
                    sb.append((char) java.lang.Integer.parseInt(writeReplace(4), 16));
                } else {
                    sb.append(values3);
                }
            } else {
                if (values2 == c) {
                    getCvrMaskAnd = (getGpoResponse + 53) % 128;
                    return sb.toString();
                }
                sb.append(values2);
                getCvrMaskAnd = (getGpoResponse + 57) % 128;
            }
        }
    }

    public final java.lang.Object AlternateContactlessPaymentDataJson() throws com.payair.hce.setOnGroupCollapseListener {
        int i = getCvrMaskAnd + 117;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            char writeReplace = writeReplace();
            if (writeReplace != '\"') {
                if (writeReplace != '[') {
                    if (writeReplace == '{') {
                        valueOf();
                        return DigitizedCardProfile();
                    }
                    if (writeReplace != '\'') {
                        if (writeReplace != '(') {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            while (writeReplace >= ' ') {
                                getCvrMaskAnd = (getGpoResponse + 97) % 128;
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                b("쿦觕骼摺誮≶㐔ㄩ욑\uf8be勋뇵", "첇⡬犫\uf829", android.text.TextUtils.indexOf("", "", 0, 0), "⌔슨鸞宨", (char) android.text.TextUtils.indexOf("", ""), objArr);
                                if (((java.lang.String) objArr[0]).intern().indexOf(writeReplace) >= 0) {
                                    break;
                                }
                                sb.append(writeReplace);
                                writeReplace = values();
                            }
                            valueOf();
                            java.lang.String trim = sb.toString().trim();
                            if (trim.equals("")) {
                                int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                b("蝷昸㘷嶲懗ᆁ㼾\u058c생ପ뾯\ua7e7\ue79c", "쉇篤伾琒", 1048306882 - indexOf, "⌔슨鸞宨", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4688), objArr2);
                                throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr2[0]).intern());
                            }
                            return values(trim);
                        }
                    }
                }
                valueOf();
                return getProfileVersion();
            }
            return AlternateContactlessPaymentDataJson(writeReplace);
        }
        writeReplace();
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.setOnGroupCollapseListener AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(toString());
        com.payair.hce.setOnGroupCollapseListener setongroupcollapselistener = new com.payair.hce.setOnGroupCollapseListener(sb.toString());
        int i = getCvrMaskAnd + 23;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return setongroupcollapselistener;
        }
        throw null;
    }

    private java.util.Map<java.lang.String, java.lang.Object> DigitizedCardProfile() {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (writeReplace() != '{') {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("Ჭ嚉㔏뛰\ue3c8\udc8b\uf5ef纤릦뺠\ue7aaው䰁葲\uee5f\uda30㜗ҵ節伯켽∵蛀귛漉Ⓥ\uef33ᒛ፬\ud9a6ᯞ\ue9dc\uf65dອ㰐좞꾉\ue389", 37 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern());
        }
        while (true) {
            char writeReplace = writeReplace();
            if (writeReplace == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("Ჭ嚉㔏뛰\ue3c8\udc8b\uf5ef纤릦뺠\ue7aaው䰁葲\uee5f\uda30㜗ҵ節伯켽∵䇌ᇌﳤ잚፬\ud9a6ᯞ\ue9dc\uf65dອ울\ue2f1꾉\ue389", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34, objArr2);
                throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr2[0]).intern());
            }
            if (writeReplace == '}') {
                break;
            }
            valueOf();
            java.lang.String obj = AlternateContactlessPaymentDataJson().toString();
            char writeReplace2 = writeReplace();
            if (writeReplace2 == '=') {
                getGpoResponse = (getCvrMaskAnd + 13) % 128;
                if (values() != '>') {
                    valueOf();
                }
            } else if (writeReplace2 != ':') {
                getCvrMaskAnd = (getGpoResponse + 103) % 128;
                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("\uf0c5砒荗㧷굣쳅⿎\uf470ᖜ沈쟎埥僵\uf7f6덃ꠔ땡\ue9d8햭\ue033\u31ee걇̔\uf56c鉏\uf05f", "\ue638ޝ縸ꣶ", edgeSlop >> 16, "⌔슨鸞宨", (char) (63101 - android.os.Process.getGidForName("")), objArr3);
                throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr3[0]).intern());
            }
            AlternateContactlessPaymentDataJson(hashMap, obj, AlternateContactlessPaymentDataJson());
            char writeReplace3 = writeReplace();
            if (writeReplace3 != ',' && writeReplace3 != ';') {
                if (writeReplace3 == '}') {
                    int i = getGpoResponse + 39;
                    getCvrMaskAnd = i % 128;
                    if (i % 2 == 0) {
                        return hashMap;
                    }
                    throw null;
                }
                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("怉鸎싧\ude4d蓌◿䐰ꊽ閙￢䤥䏆㩈篦ඛ檼ꁀꛧ䭣頲\ue75d", "㴱֟賞ꞅ", (-570056898) - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), "⌔슨鸞宨", (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr4);
                throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr4[0]).intern());
            }
            if (writeReplace() == '}') {
                int i2 = getGpoResponse + 1;
                getCvrMaskAnd = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } else {
                valueOf();
            }
        }
        return hashMap;
    }

    private static void AlternateContactlessPaymentDataJson(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, java.lang.Object obj) {
        if (str != null) {
            getCvrMaskAnd = (getGpoResponse + 75) % 128;
            if (map.containsKey(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("挿\uef7cㅘ陛\udf51ヌ暤更畿숅俜ퟷ퀥悂齳䁬", 15 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(str);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("齳䁬", -((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                throw new com.payair.hce.setOnGroupCollapseListener(sb.toString());
            }
            int i = getGpoResponse + 1;
            getCvrMaskAnd = i % 128;
            if (i % 2 == 0) {
                map.put(str, obj);
                return;
            }
            map.put(str, obj);
        } else {
            int i2 = getGpoResponse + 21;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    private java.util.List<java.lang.Object> getProfileVersion() {
        char c;
        char writeReplace;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char writeReplace2 = writeReplace();
        if (writeReplace2 == '[') {
            c = ']';
        } else {
            if (writeReplace2 != '(') {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("Ჭ嚉㔏뛰\ue3c8\udc8b틥虓辏긁퀥悂ꄛ滎\uf3d6\uedc1科뮙\ud801䨡㜗ҵ켽∵듪\ue02d㜗ҵ\uf319螓숧뮋⭎켵嗘\uef38", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\f', objArr);
                throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern());
            }
            c = ')';
        }
        if (writeReplace() == ']') {
            return arrayList;
        }
        valueOf();
        while (true) {
            if (writeReplace() != ',') {
                valueOf();
                arrayList.add(AlternateContactlessPaymentDataJson());
            } else {
                getCvrMaskAnd = (getGpoResponse + 11) % 128;
                valueOf();
                arrayList.add(null);
            }
            writeReplace = writeReplace();
            if (writeReplace == ')') {
                break;
            }
            if (writeReplace == ',' || writeReplace == ';') {
                if (writeReplace() != ']') {
                    valueOf();
                } else {
                    int i = getCvrMaskAnd + 61;
                    getGpoResponse = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            } else if (writeReplace != ']') {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("ᛖ\u0dfe쀖ఴ\ue7aaው䁩蓌닥쾬⭎켵㆑\uecea㸃\ueca8袝\uf0f0\ude4c貰꾉\ue389", android.graphics.Color.argb(0, 0, 0, 0) + 21, objArr2);
                throw AlternateContactlessPaymentDataJson(((java.lang.String) objArr2[0]).intern());
            }
        }
        if (c != writeReplace) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("ᛖ\u0dfe쀖ఴ\ue7aaው䁩蓌닥쾬⭎켵", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(c);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("꾉\ue389", 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            throw AlternateContactlessPaymentDataJson(sb.toString());
        }
        return arrayList;
    }

    private static java.lang.Object values(java.lang.String str) {
        getCvrMaskAnd = (getGpoResponse + 83) % 128;
        if (str.equals("")) {
            getCvrMaskAnd = (getGpoResponse + 47) % 128;
            return str;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ὗ䤗\ue453厴", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr);
        if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            int i = getGpoResponse + 61;
            getCvrMaskAnd = i % 128;
            if (i % 2 == 0) {
                return java.lang.Boolean.TRUE;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("蓞䷴큤瓻䏳\udf45", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', objArr2);
        if (str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            getGpoResponse = (getCvrMaskAnd + 83) % 128;
            return bool;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("쿾䈟价媦", "笚歎䄴䉩", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, "⌔슨鸞宨", (char) (android.graphics.Color.red(0) + 26945), objArr3);
        if (!str.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
            return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{str}, -1158821058, 1158821059, (int) java.lang.System.currentTimeMillis())).booleanValue() ? new com.payair.hce.setOnGroupClickListener(str) : str;
        }
        getCvrMaskAnd = (getGpoResponse + 107) % 128;
        return null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        values = (char) 49965;
        getProfileVersion = (char) 8513;
        RecordsJson = (char) 50076;
        getAid = (char) 56145;
        IccPrivateKeyCrtComponentsJson = 5341619954123207984L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        getCiacDecline = (char) 54820;
    }

    private static boolean DigitizedCardProfile(java.lang.String str) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{str}, -1158821058, 1158821059, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS};
        $$b = 226;
    }

    public final java.lang.String toString() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 452644598, -452644598, java.lang.System.identityHashCode(this));
    }
}
