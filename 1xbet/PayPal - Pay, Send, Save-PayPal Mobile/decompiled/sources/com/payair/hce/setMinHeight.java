package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMinHeight extends java.io.FilterInputStream {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    private static long values;
    private static int writeReplace;
    private final int AlternateContactlessPaymentDataJson;
    private final boolean DigitizedCardProfile;
    private final byte[][] valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = b * 4;
        int i3 = 115 - s;
        byte[] bArr = $$a;
        int i4 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i3 += i4;
            i4 = i5;
            i = i6;
            int i7 = i4 + 1;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i7;
            i4 = bArr[i7];
            i3 += i4;
            i4 = i5;
            i = i6;
            int i72 = i4 + 1;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == 0 - i2) {
            }
        } else {
            i = 0;
            int i722 = i4 + 1;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == 0 - i2) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i4 | i | i3);
        if ((i * 477) + (i2 * (-475)) + (((~(i2 | (~i))) | i5) * (-476)) + (i5 * 952) + ((~(i | (~i3) | i4)) * 476) != 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue() & 31;
        if (intValue == 31) {
            int read = inputStream.read();
            if ((read & 127) == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b("\b\t\uffc1\u0015\u0002\b\uffc1\u000f\u0016\u000e\u0003\u0006\u0013\uffc1\u0007\u0010\u0016\u000f\u0005\u0004\u0010\u0013\u0013\u0016\u0011\u0015\u0006\u0005\uffc1\u0014\u0015\u0013\u0006\u0002\u000e\uffc1ￎ\uffc1\n\u000f\u0017\u0002\r\n\u0005\uffc1\t\n", 287 - android.text.TextUtils.indexOf("", ""), android.widget.ExpandableListView.getPackedPositionType(0L) + 19, false, 49 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
            }
            int i6 = 0;
            while (read >= 0) {
                int i7 = (getProfileVersion + 33) % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = i7;
                if ((read & 128) == 0) {
                    break;
                }
                getProfileVersion = (i7 + 99) % 128;
                i6 = ((read & 127) | i6) << 7;
                read = inputStream.read();
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
            }
            if (read < 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "嬤\uf00aᦒ⑬ꨦ穇밺\uec93뫜㘡㇣褻뢙紲퓐Ꮖ혈諾᭼땰\udf80瓠릻ᜎ̱컯惫", "\udfb3ꏬ悺嵌", android.text.TextUtils.getCapsMode("", 0, 0) - 1163662113, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19551), objArr3);
                throw new java.io.EOFException(((java.lang.String) objArr3[0]).intern());
            }
            intValue = (read & 127) | i6;
        }
        return java.lang.Integer.valueOf(intValue);
    }

    private setMinHeight(java.io.InputStream inputStream) {
        this(inputStream, ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{inputStream}, -1279936687, 1279936689, (int) java.lang.System.currentTimeMillis())).intValue());
    }

    public setMinHeight(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length);
    }

    public setMinHeight(byte[] bArr, byte b) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length, true);
    }

    private setMinHeight(java.io.InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    private setMinHeight(java.io.InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.AlternateContactlessPaymentDataJson = i;
        this.DigitizedCardProfile = z;
        this.valueOf = new byte[11][];
    }

    final int values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 39;
        int i2 = i % 128;
        getProfileVersion = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = this.AlternateContactlessPaymentDataJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i2 + 95) % 128;
        return i3;
    }

    private int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 37) % 128;
        int valueOf = valueOf(this, this.AlternateContactlessPaymentDataJson);
        int i = getProfileVersion + 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return valueOf;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        int i2 = $10 + 87;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
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
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1180, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 13, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 30, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3444, (char) (3831 - (android.os.Process.myPid() >> 22)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.getDefaultSize(0, 0), 1865 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.keyCodeFromString("") + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((short) 10, (byte) 0, (short) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28, 3133 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c((short) 9, (byte) 0, (short) 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (writeReplace ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (values ^ 1263759066225628708L))) ^ ((char) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
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

    private static void b(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i4 = $10;
        int i5 = i4 + 19;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i4 + 5) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr4 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 95) % 128;
            digitizedCardJson11.values = cArr3[digitizedCardJson11.DigitizedCardProfile];
            cArr4[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i6 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i6]), java.lang.Integer.valueOf(getAid)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getOffsetBefore("", 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2073, (char) (60037 - android.text.TextUtils.indexOf("", "")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 3543, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            java.lang.System.arraycopy(cArr5, 0, cArr4, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr5, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr4, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.resolveSize(0, 0), 3543 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr4 = cArr2;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private com.payair.hce.setEms writeReplace(int i, int i2, int i3) throws java.io.IOException {
        boolean z = (i & 32) != 0;
        com.payair.hce.setNavigationContentDescription setnavigationcontentdescription = new com.payair.hce.setNavigationContentDescription(this, i3);
        if ((i & 64) != 0) {
            return new com.payair.hce.setInputExtras(z, i2, setnavigationcontentdescription.DigitizedCardProfile());
        }
        if ((i & 128) != 0) {
            com.payair.hce.setEms DigitizedCardProfile = new com.payair.hce.setHighlights(setnavigationcontentdescription).DigitizedCardProfile(z, i2);
            int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 3;
            getProfileVersion = i4 % 128;
            if (i4 % 2 == 0) {
                return DigitizedCardProfile;
            }
            throw null;
        }
        if (!z) {
            return (com.payair.hce.setEms) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i2), setnavigationcontentdescription, this.valueOf}, -472172664, 472172664, i2);
        }
        if (i2 == 4) {
            com.payair.hce.setHintTextColor DigitizedCardProfile2 = DigitizedCardProfile(setnavigationcontentdescription);
            int intValue = ((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile2}, -1832970438, 1832970438, java.lang.System.identityHashCode(DigitizedCardProfile2))).intValue();
            com.payair.hce.setMaxHeight[] setmaxheightArr = new com.payair.hce.setMaxHeight[intValue];
            int i5 = SdkCoreAlternateContactlessPaymentDataImpl + 109;
            getProfileVersion = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 != intValue; i7++) {
                setmaxheightArr[i7] = (com.payair.hce.setMaxHeight) ((com.payair.hce.setShadowLayer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile2, java.lang.Integer.valueOf(i7)}, 1016755526, -1016755525, i7));
            }
            return new com.payair.hce.setSearchResultHighlightColor(setmaxheightArr);
        }
        if (i2 == 8) {
            return new com.payair.hce.setImeActionLabel(DigitizedCardProfile(setnavigationcontentdescription));
        }
        if (i2 == 16) {
            if (!this.DigitizedCardProfile) {
                return (com.payair.hce.setMaxEms) com.payair.hce.setFilters.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile(setnavigationcontentdescription)}, 1855195378, -1855195378, (int) java.lang.System.currentTimeMillis());
            }
            com.payair.hce.setCollapseIcon setcollapseicon = new com.payair.hce.setCollapseIcon(setnavigationcontentdescription.DigitizedCardProfile());
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
            return setcollapseicon;
        }
        if (i2 == 17) {
            return (com.payair.hce.setWidth) com.payair.hce.setFilters.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile(setnavigationcontentdescription)}, -1932318758, 1932318759, (int) java.lang.System.currentTimeMillis());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "롙ך\uece6ᯯ\uec24\ue059祮ɪ勱잏ꊀﳁ", "\uf499戹ﭗཾ", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.graphics.Color.blue(0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "锹홒\uf389죽俴쏣\ue00aﱄ컄攫瑢쎕", "친㦜懂ﰌ", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        throw new java.io.IOException(sb.toString());
    }

    private com.payair.hce.setHintTextColor valueOf() throws java.io.IOException {
        com.payair.hce.setHintTextColor sethinttextcolor = new com.payair.hce.setHintTextColor();
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 43) % 128;
        while (true) {
            com.payair.hce.setEms DigitizedCardProfile = DigitizedCardProfile();
            if (DigitizedCardProfile != null) {
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 121;
                getProfileVersion = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, DigitizedCardProfile}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 55) % 128;
                } else {
                    com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, DigitizedCardProfile}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
                    throw null;
                }
            } else {
                int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 103;
                getProfileVersion = i2 % 128;
                if (i2 % 2 == 0) {
                    return sethinttextcolor;
                }
                throw null;
            }
        }
    }

    private static com.payair.hce.setHintTextColor DigitizedCardProfile(com.payair.hce.setNavigationContentDescription setnavigationcontentdescription) throws java.io.IOException {
        com.payair.hce.setHintTextColor valueOf = new com.payair.hce.setMinHeight(setnavigationcontentdescription).valueOf();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 63;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return valueOf;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setEms DigitizedCardProfile() throws java.io.IOException {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 81;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            int read = read();
            if (read <= 0) {
                if (read != 0) {
                    return null;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "ꐫ᪦뙟\uabfeᡣ\ud82fꢵ\uf24b쿆⋿䥾皏\uf2be\uf07a쌲튓贈笕\uef1d틶濥쮸뺒ꊲ䘮ᜬᮡ\uf721鲤餄缩蝽ᜪ", "㥹\ue3c5育䍟", android.view.KeyEvent.keyCodeFromString("") - 1293695687, (char) android.graphics.Color.red(0), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            int intValue = ((java.lang.Integer) writeReplace(new java.lang.Object[]{this, java.lang.Integer.valueOf(read)}, 1019289983, -1019289982, read)).intValue();
            boolean z = (read & 32) != 0;
            int AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson();
            if (AlternateContactlessPaymentDataJson >= 0) {
                try {
                    return writeReplace(read, intValue, AlternateContactlessPaymentDataJson);
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "粥\ue4fc誹烛\ua7ed\ua8c8\ud923魏樣ᗹ顤ⶉ쉂ᢅ熜\ue118軁艧꾤恑\uf1c9鿦흍칑⅟", "冠᪹슟⚬", (-1625638575) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                    throw new com.payair.hce.setAutoLinkMask(((java.lang.String) objArr2[0]).intern(), e);
                }
            }
            if (!z) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("\u0010\n\u0011\u000b\uffff\n\u0001ﾼ\u0003\n\u0005\u0000\u000b\uffff\n\u0001ﾼ\u0001\u0012\u0005\u0010\u0005\t\u0005\u000e\fﾼ\u0004\u0010\u0003\n\u0001\b\uffc9\u0001\u0010\u0005\n\u0005\u0002\u0001\u0000\n\u0005\u0000\u0001\u000e\u0001", 292 - android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.getTrimmedLength("") + 44, true, 49 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
                throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
            }
            com.payair.hce.setHighlights sethighlights = new com.payair.hce.setHighlights(new com.payair.hce.setTitleTextColor(this, this.AlternateContactlessPaymentDataJson), this.AlternateContactlessPaymentDataJson);
            if ((read & 64) != 0) {
                com.payair.hce.setEditableFactory seteditablefactory = new com.payair.hce.setEditableFactory(intValue, sethighlights);
                return (com.payair.hce.setEms) com.payair.hce.setEditableFactory.valueOf(new java.lang.Object[]{seteditablefactory}, -890101467, 890101467, java.lang.System.identityHashCode(seteditablefactory));
            }
            if ((read & 128) != 0) {
                return new com.payair.hce.setHint(true, intValue, sethighlights).RecordsJson();
            }
            if (intValue == 4) {
                com.payair.hce.setEms RecordsJson = new com.payair.hce.setSpannableFactory(sethighlights).RecordsJson();
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 41) % 128;
                return RecordsJson;
            }
            if (intValue == 8) {
                return new com.payair.hce.setImeHintLocales(sethighlights).RecordsJson();
            }
            if (intValue == 16) {
                com.payair.hce.setText settext = new com.payair.hce.setText(sethighlights);
                return (com.payair.hce.setEms) com.payair.hce.setText.valueOf(new java.lang.Object[]{settext}, 1597567112, -1597567111, java.lang.System.identityHashCode(settext));
            }
            if (intValue == 17) {
                com.payair.hce.setRawInputType setrawinputtype = new com.payair.hce.setRawInputType(sethighlights);
                com.payair.hce.setEms setems = (com.payair.hce.setEms) com.payair.hce.setRawInputType.valueOf(new java.lang.Object[]{setrawinputtype}, 1414152515, -1414152515, java.lang.System.identityHashCode(setrawinputtype));
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 105) % 128;
                return setems;
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ue310틃탐㏘䌔쀯ⷺ麍鈃\u20c8\u0b5bﻌ┈拈ᛱ\u0c5eϙ︄⊢襫ⲅ覽ゾ먭\ue855䎓軠珍橾㺵", "ö颿䄅쿞", android.view.ViewConfiguration.getTouchSlop() >> 8, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 56898), objArr4);
            throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
        }
        read();
        throw new java.lang.ArithmeticException();
    }

    static int valueOf(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int read = inputStream.read();
        if (read < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b("\b\u0017\u0006\b\u0013\u001b\bￃ\u000b\u0017\n\u0011\b\u000fￃ\u0011\b\u000b\u001aￃ\u0007\u0011\u0018\u0012\tￃ￩\ufff2￨\u0007", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29, true, 30 - (android.os.Process.myTid() >> 22), objArr);
            throw new java.io.EOFException(((java.lang.String) objArr[0]).intern());
        }
        if (read == 128) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 117;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                return -1;
            }
            throw null;
        }
        if (read <= 127) {
            return read;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 41) % 128;
        int i3 = read & 127;
        if (i3 > 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "恤逷巭꼗숡枻켏칅疞韀ꑜ읨쿡ꁳ֢\u0e3dፓ\uf793粏\uf09f욅묆魺誠飇꾁씤\u0094鼂倗", "\ude0fꀞ頊⒱", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 45464), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(i3);
            throw new java.io.IOException(sb.toString());
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int read2 = inputStream.read();
            if (read2 < 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("\b\r\u0012\u000bￄ\u0010\t\u0012\u000b\u0018\f￩\ufff3￪ￄ\n\u0013\u0019\u0012\bￄ\u0016\t\u0005", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, 11 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), false, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, objArr3);
                throw new java.io.EOFException(((java.lang.String) objArr3[0]).intern());
            }
            i4 = (i4 << 8) + read2;
        }
        if (i4 < 0) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b("\uffc0\u0013\u0014\u0012\u0005\u0001\r\uffc0ￍ\uffc0\u000e\u0005\u0007\u0001\u0014\t\u0016\u0005\uffc0\f\u0005\u000e\u0007\u0014\b\uffc0\u0006\u000f\u0015\u000e\u0004\u0003\u000f\u0012\u0012\u0015\u0010\u0014\u0005\u0004", 287 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, false, android.graphics.Color.argb(0, 0, 0, 0) + 40, objArr4);
            throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
        }
        if (i4 < i) {
            return i4;
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("\u0005\u0014\uffc1\r\u0006\u000f\b\u0015\t\uffc1\u0007\u0010\u0016\u000f\u0005\u0004\u0010\u0013\u0013\u0016\u0011\u0015\u0006\u0005\uffc1\u0014\u0015\u0013\u0006\u0002\u000e\uffc1ￎ\uffc1\u0010\u0016\u0015\uffc1\u0010\u0007\uffc1\u0003\u0010\u0016\u000f", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 15, false, android.view.View.getDefaultSize(0, 0) + 45, objArr5);
        throw new java.io.IOException(((java.lang.String) objArr5[0]).intern());
    }

    private static byte[] values(com.payair.hce.setNavigationContentDescription setnavigationcontentdescription, byte[][] bArr) throws java.io.IOException {
        int i = getProfileVersion + 119;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            int values2 = setnavigationcontentdescription.values();
            if (setnavigationcontentdescription.values() < bArr.length) {
                byte[] bArr2 = bArr[values2];
                if (bArr2 == null) {
                    bArr2 = new byte[values2];
                    bArr[values2] = bArr2;
                }
                return bArr2;
            }
            byte[] DigitizedCardProfile = setnavigationcontentdescription.DigitizedCardProfile();
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 9) % 128;
            return DigitizedCardProfile;
        }
        setnavigationcontentdescription.values();
        setnavigationcontentdescription.values();
        int length = bArr.length;
        throw new java.lang.ArithmeticException();
    }

    private static char[] AlternateContactlessPaymentDataJson(com.payair.hce.setNavigationContentDescription setnavigationcontentdescription) throws java.io.IOException {
        int values2 = setnavigationcontentdescription.values() / 2;
        char[] cArr = new char[values2];
        for (int i = 0; i < values2; i++) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 103;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                int read = setnavigationcontentdescription.read();
                if (read < 0) {
                    break;
                }
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 55) % 128;
                int read2 = setnavigationcontentdescription.read();
                if (read2 < 0) {
                    break;
                }
                cArr[i] = (char) ((read << 8) | (read2 & 255));
                int i3 = getProfileVersion + 103;
                SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 / 4;
                }
            } else {
                setnavigationcontentdescription.read();
                throw new java.lang.ArithmeticException();
            }
        }
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 83) % 128;
        return cArr;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        com.payair.hce.setNavigationContentDescription setnavigationcontentdescription = (com.payair.hce.setNavigationContentDescription) objArr[1];
        byte[][] bArr = (byte[][]) objArr[2];
        if (intValue == 10) {
            return (com.payair.hce.setLinksClickable) com.payair.hce.setLinksClickable.values(new java.lang.Object[]{values(setnavigationcontentdescription, bArr)}, -1411131033, 1411131033, (int) java.lang.System.currentTimeMillis());
        }
        if (intValue == 12) {
            return new com.payair.hce.setTitleMarginEnd(setnavigationcontentdescription.DigitizedCardProfile());
        }
        if (intValue == 30) {
            return new com.payair.hce.setOnEditorActionListener(AlternateContactlessPaymentDataJson(setnavigationcontentdescription));
        }
        switch (intValue) {
            case 1:
                return com.payair.hce.setFontFeatureSettings.AlternateContactlessPaymentDataJson(values(setnavigationcontentdescription, bArr));
            case 2:
                return new com.payair.hce.setHorizontallyScrolling(setnavigationcontentdescription.DigitizedCardProfile());
            case 3:
                com.payair.hce.setJustificationMode values2 = com.payair.hce.setJustificationMode.values(setnavigationcontentdescription.values(), setnavigationcontentdescription);
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
                return values2;
            case 4:
                return new com.payair.hce.setEllipsize(setnavigationcontentdescription.DigitizedCardProfile());
            case 5:
                return com.payair.hce.setMarqueeRepeatLimit.AlternateContactlessPaymentDataJson;
            case 6:
                return com.payair.hce.setHeight.values(values(setnavigationcontentdescription, bArr));
            default:
                switch (intValue) {
                    case 18:
                        return new com.payair.hce.setIncludeFontPadding(setnavigationcontentdescription.DigitizedCardProfile());
                    case 19:
                        return new com.payair.hce.setScroller(setnavigationcontentdescription.DigitizedCardProfile());
                    case 20:
                        return new com.payair.hce.setTitleMarginTop(setnavigationcontentdescription.DigitizedCardProfile());
                    case 21:
                        return new com.payair.hce.setTitleMargin(setnavigationcontentdescription.DigitizedCardProfile());
                    case 22:
                        com.payair.hce.setError seterror = new com.payair.hce.setError(setnavigationcontentdescription.DigitizedCardProfile());
                        int i = getProfileVersion + 47;
                        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                        if (i % 2 != 0) {
                            return seterror;
                        }
                        throw new java.lang.ArithmeticException();
                    case 23:
                        return new com.payair.hce.setLineSpacing(setnavigationcontentdescription.DigitizedCardProfile());
                    case 24:
                        return new com.payair.hce.setMinLines(setnavigationcontentdescription.DigitizedCardProfile());
                    case 25:
                        return new com.payair.hce.setTextIsSelectable(setnavigationcontentdescription.DigitizedCardProfile());
                    case 26:
                        return new com.payair.hce.setLogo(setnavigationcontentdescription.DigitizedCardProfile());
                    case 27:
                        return new com.payair.hce.setExtractedText(setnavigationcontentdescription.DigitizedCardProfile());
                    case 28:
                        return new com.payair.hce.setPopupTheme(setnavigationcontentdescription.DigitizedCardProfile());
                    default:
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "롙ך\uece6ᯯ\uec24\ue059祮ɪ勱잏ꊀﳁ", "\uf499戹ﭗཾ", android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        sb.append(intValue);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "锹홒\uf389죽俴쏣\ue00aﱄ컄攫瑢쎕", "친㦜懂ﰌ", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr3);
                        sb.append(((java.lang.String) objArr3[0]).intern());
                        throw new java.io.IOException(sb.toString());
                }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        values = 1263759066225628708L;
        writeReplace = -804334044;
        IccPrivateKeyCrtComponentsJson = (char) 23091;
        getAid = 1889207201;
    }

    static com.payair.hce.setEms writeReplace(int i, com.payair.hce.setNavigationContentDescription setnavigationcontentdescription, byte[][] bArr) throws java.io.IOException {
        return (com.payair.hce.setEms) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i), setnavigationcontentdescription, bArr}, -472172664, 472172664, i);
    }

    static void init$0() {
        $$a = new byte[]{111, 35, -79, -70};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
    }

    static int values(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{inputStream, java.lang.Integer.valueOf(i)}, 1019289983, -1019289982, i)).intValue();
    }
}
