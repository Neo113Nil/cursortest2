package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextKeepState extends com.payair.hce.setFocusedSearchResultIndex {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$m = null;
    private static final int $$n = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 4 - (b2 * 2);
        int i3 = 99 - (s * 4);
        int i4 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 23];
        int i5 = i4 + 22;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i2++;
            i3 += -i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i2++;
            i3 += -i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + 4;
        int i4 = i * 3;
        int i5 = 115 - (s * 4);
        byte[] bArr = $$m;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            i5 = i6;
            int i7 = i3;
            int i8 = 0;
            i5 += -i3;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            int i9 = i3 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            i7 = i9;
            i3 = bArr[i9];
            i8 = i10;
            i5 += -i3;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            int i92 = i3 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            int i922 = i3 + 1;
            if (i2 == i6) {
            }
        }
    }

    public setTextKeepState(boolean z, int i, com.payair.hce.setShadowLayer setshadowlayer) {
        super(z, i, setshadowlayer);
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 53;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            boolean z = this.valueOf;
            if (this.writeReplace) {
                int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 69;
                getProfileVersion = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            return this.values.getAid().DigitizedCardProfile().writeReplace();
        }
        boolean z2 = this.valueOf;
        boolean z3 = this.writeReplace;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        int intValue;
        int i = getProfileVersion + 87;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            boolean z = this.valueOf;
            int AlternateContactlessPaymentDataJson2 = this.values.getAid().AlternateContactlessPaymentDataJson();
            if (this.writeReplace) {
                int i2 = this.DigitizedCardProfile;
                int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i2)}, -334301909, 334301909, i2)).intValue();
                int intValue3 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2)}, -1174070258, 1174070259, AlternateContactlessPaymentDataJson2)).intValue();
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 99) % 128;
                intValue = intValue2 + intValue3;
            } else {
                int i3 = this.DigitizedCardProfile;
                intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i3)}, -334301909, 334301909, i3)).intValue();
                AlternateContactlessPaymentDataJson2--;
            }
            return intValue + AlternateContactlessPaymentDataJson2;
        }
        boolean z2 = this.valueOf;
        this.values.getAid().AlternateContactlessPaymentDataJson();
        boolean z3 = this.writeReplace;
        throw null;
    }

    private static void i(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 85) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 43, 2121 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 60036));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    j((short) 0, 0, (byte) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3543, (char) android.graphics.Color.alpha(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 39) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $11 = ($10 + 61) % 128;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $10 = ($11 + 93) % 128;
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 3543 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.setFocusedSearchResultIndex, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        java.util.Enumeration valueOf;
        com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, 160, java.lang.Integer.valueOf(this.DigitizedCardProfile)}, -584468000, 584468000, 160);
        setmaxlines.DigitizedCardProfile(128);
        boolean z = this.valueOf;
        if (this.writeReplace) {
            setmaxlines.DigitizedCardProfile(this.values);
        } else {
            int i = getProfileVersion + 119;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.setShadowLayer setshadowlayer = this.values;
                throw new java.lang.ArithmeticException();
            }
            if (this.values instanceof com.payair.hce.setMaxHeight) {
                if (this.values instanceof com.payair.hce.setSearchResultHighlightColor) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 51) % 128;
                    valueOf = ((com.payair.hce.setSearchResultHighlightColor) this.values).SdkCoreAlternateContactlessPaymentDataImpl();
                } else {
                    valueOf = new com.payair.hce.setSearchResultHighlightColor(((com.payair.hce.setMaxHeight) this.values).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl();
                }
            } else if (this.values instanceof com.payair.hce.setMaxEms) {
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 5) % 128;
                valueOf = ((com.payair.hce.setMaxEms) this.values).values();
            } else {
                com.payair.hce.setShadowLayer setshadowlayer2 = this.values;
                java.lang.Object[] objArr = new java.lang.Object[1];
                h((byte) 0, (short) 0, (byte) 0, objArr);
                if (!java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(setshadowlayer2)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    i("\u000e\n\uffc1\u0015\u0010\u000f\uffc1ￛ\u0005\u0006\u0015\u000f\u0006\u000e\u0006\r\u0011", true, android.view.View.combineMeasuredStates(0, 0) + 165, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, 18 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(this.values.getClass().getName());
                    throw new com.payair.hce.setAutoLinkMask(sb.toString());
                }
                valueOf = ((com.payair.hce.setWidth) this.values).valueOf();
            }
            while (valueOf.hasMoreElements()) {
                setmaxlines.DigitizedCardProfile((com.payair.hce.setShadowLayer) valueOf.nextElement());
            }
        }
        setmaxlines.DigitizedCardProfile(0);
        setmaxlines.DigitizedCardProfile(0);
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 49) % 128;
    }

    static void init$1() {
        $$m = new byte[]{68, 85, -28, -99};
        $$n = 156;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson = 1889207079;
    }

    static void init$0() {
        $$a = new byte[]{125, -89, 109, 76, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, com.google.common.base.Ascii.GS, -18, 5, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.FF};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
    }
}
