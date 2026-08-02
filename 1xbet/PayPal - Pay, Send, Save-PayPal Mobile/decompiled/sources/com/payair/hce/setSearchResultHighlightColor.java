package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSearchResultHighlightColor extends com.payair.hce.setMaxHeight {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char valueOf;
    private static int writeReplace;
    com.payair.hce.setMaxHeight[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 106 - b;
        byte[] bArr = $$d;
        int i3 = 4 - (s * 3);
        int i4 = s2 * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i2 = (-i2) + i6;
            i3++;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i6 = i2;
            i2 = bArr[i3];
            i7 = i8;
            i2 = (-i2) + i6;
            i3++;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (IccPrivateKeyCrtComponentsJson + 45) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i4;
        IccPrivateKeyCrtComponentsJson = (i4 + 113) % 128;
        return java.lang.Boolean.TRUE;
    }

    private static byte[] AlternateContactlessPaymentDataJson(com.payair.hce.setMaxHeight[] setmaxheightArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 35) % 128;
        for (int i = 0; i != setmaxheightArr.length; i++) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 17) % 128;
            try {
                byteArrayOutputStream.write(((com.payair.hce.setEllipsize) setmaxheightArr[i]).valueOf());
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                h("傱\ua878盒㿋\ue276Ỽ춂묥ᫀ暆汧捵⣄龾꒶粹펜麨킰\ude60긎\uf093핑⿵쏯硋乸\ue036", "\u0000\u0000\u0000\u0000", "鲬埦摬⫻", android.text.TextUtils.indexOf("", "", 0, 0), (char) (64356 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e.toString());
                throw new java.lang.IllegalArgumentException(sb.toString());
            } catch (java.lang.ClassCastException unused) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(setmaxheightArr[i].getClass().getName());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                h("э\uefde婸\ude2b눙邶냃꒧\u193c裷칤辞짳⦳뷎뛡磌䃲⃜蜠蚏핦폴\udef2榴\uddb2쯩뾬훝ꖋ\ued99쮽鋍랞\uf0dd뽱\ue121榩瘭砰淟셰ꂘ厸胭솤疿휋\ufde1\u0091", "\u0000\u0000\u0000\u0000", "\uf711녉봺㌺", android.view.ViewConfiguration.getTouchSlop() >> 8, (char) android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public setSearchResultHighlightColor(byte[] bArr) {
        super(bArr);
    }

    public setSearchResultHighlightColor(com.payair.hce.setMaxHeight[] setmaxheightArr) {
        super(AlternateContactlessPaymentDataJson(setmaxheightArr));
        this.values = setmaxheightArr;
    }

    @Override // com.payair.hce.setMaxHeight
    public final byte[] valueOf() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 91;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.DigitizedCardProfile;
            throw null;
        }
        byte[] bArr2 = this.DigitizedCardProfile;
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 103) % 128;
        return bArr2;
    }

    public final java.util.Enumeration SdkCoreAlternateContactlessPaymentDataImpl() {
        if (this.values != null) {
            return new java.util.Enumeration() { // from class: com.payair.hce.setSearchResultHighlightColor.4
                private static int valueOf = 0;
                private static int values = 1;
                private int AlternateContactlessPaymentDataJson = 0;

                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                    int i4 = ~((~i) | i2);
                    int i5 = ~i2;
                    int i6 = ~i3;
                    return ((((i * (-1975)) + (i2 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd)) + ((i3 | i4) * 988)) + (((~(i | i5)) | (~(i | i6))) * (-1976))) + ((((~(i5 | i3)) | i4) | (~(i2 | i6))) * 988) != 1 ? writeReplace(objArr) : values(objArr);
                }

                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                    com.payair.hce.setSearchResultHighlightColor.AnonymousClass4 anonymousClass4 = (com.payair.hce.setSearchResultHighlightColor.AnonymousClass4) objArr[0];
                    int i = valueOf + 49;
                    values = i % 128;
                    if (i % 2 == 0) {
                        int i2 = anonymousClass4.AlternateContactlessPaymentDataJson;
                        int length = com.payair.hce.setSearchResultHighlightColor.this.values.length;
                        throw null;
                    }
                    if (anonymousClass4.AlternateContactlessPaymentDataJson >= com.payair.hce.setSearchResultHighlightColor.this.values.length) {
                        int i3 = valueOf;
                        int i4 = i3 & 41;
                        int i5 = (i3 ^ 41) | i4;
                        values = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
                        return java.lang.Boolean.FALSE;
                    }
                    int i6 = values;
                    valueOf = ((-2) - (~((i6 & 62) + (i6 | 62)))) % 128;
                    int i7 = (i6 & (-104)) | ((~i6) & 103);
                    int i8 = (i6 & 103) << 1;
                    valueOf = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                    return java.lang.Boolean.TRUE;
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                    com.payair.hce.setSearchResultHighlightColor.AnonymousClass4 anonymousClass4 = (com.payair.hce.setSearchResultHighlightColor.AnonymousClass4) objArr[0];
                    int i = valueOf;
                    int i2 = i | 115;
                    int i3 = i2 << 1;
                    int i4 = -((~(i & 115)) & i2);
                    values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
                    com.payair.hce.setMaxHeight[] setmaxheightArr = com.payair.hce.setSearchResultHighlightColor.this.values;
                    int i5 = anonymousClass4.AlternateContactlessPaymentDataJson;
                    int i6 = i5 & 1;
                    int i7 = (~i6) & (i5 | 1);
                    int i8 = i6 << 1;
                    anonymousClass4.AlternateContactlessPaymentDataJson = (i7 & i8) + (i8 | i7);
                    com.payair.hce.setMaxHeight setmaxheight = setmaxheightArr[i5];
                    int i9 = valueOf;
                    int i10 = i9 & 41;
                    int i11 = ((i9 ^ 41) | i10) << 1;
                    int i12 = -((i9 | 41) & (~i10));
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    values = i13 % 128;
                    if (i13 % 2 != 0) {
                        return setmaxheight;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // java.util.Enumeration
                public final java.lang.Object nextElement() {
                    return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -117609354, 117609355, java.lang.System.identityHashCode(this));
                }

                @Override // java.util.Enumeration
                public final boolean hasMoreElements() {
                    return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1317582050, 1317582050, java.lang.System.identityHashCode(this))).booleanValue();
                }
            };
        }
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 57) % 128;
        java.util.Enumeration elements = getCvrMaskAnd().elements();
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 101) % 128;
        return elements;
    }

    private java.util.Vector getCvrMaskAnd() {
        int i;
        java.util.Vector vector = new java.util.Vector();
        int i2 = 0;
        while (i2 < this.DigitizedCardProfile.length) {
            int i3 = i2 + 1000;
            if (i3 > this.DigitizedCardProfile.length) {
                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 95) % 128;
                i = this.DigitizedCardProfile.length;
                SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 125) % 128;
            } else {
                i = i3;
            }
            int i4 = i - i2;
            byte[] bArr = new byte[i4];
            java.lang.System.arraycopy(this.DigitizedCardProfile, i2, bArr, 0, i4);
            vector.addElement(new com.payair.hce.setEllipsize(bArr));
            i2 = i3;
        }
        return vector;
    }

    private static void h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i2 = ($10 + 39) % 128;
        $11 = i2;
        if (str3 != null) {
            $10 = (i2 + 41) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 109) % 128;
            cArr2 = str.toCharArray();
            $11 = ($10 + 69) % 128;
        } else {
            cArr2 = str;
        }
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = charArray.length;
        char[] cArr5 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr4, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 71, 1179 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    i((short) 0, (short) 0, (byte) $$d.length, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 30, (android.os.Process.myPid() >> 22) + 3443, (char) (3831 - (android.view.ViewConfiguration.getTouchSlop() >> 8)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr4[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr5[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, android.view.KeyEvent.getDeadChar(0, 0) + 1864, (char) (41775 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    i((short) 0, (short) 0, (byte) 1, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr4[intValue2] * 32718), java.lang.Integer.valueOf(cArr5[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3085, (char) android.view.View.getDefaultSize(0, 0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    i((short) 0, (short) 0, (byte) 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr5[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr4[intValue2] = getwalletdata.values;
                cArr6[getwalletdata.writeReplace] = (char) ((((cArr4[intValue2] ^ r2[getwalletdata.writeReplace]) ^ (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)) ^ ((int) (writeReplace ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
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

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        java.util.Enumeration SdkCoreAlternateContactlessPaymentDataImpl2;
        int i;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 109;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
            i = 1;
        } else {
            SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
            i = 0;
        }
        while (SdkCoreAlternateContactlessPaymentDataImpl2.hasMoreElements()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 7) % 128;
            i += ((com.payair.hce.setShadowLayer) SdkCoreAlternateContactlessPaymentDataImpl2.nextElement()).getAid().AlternateContactlessPaymentDataJson();
        }
        return i + 4;
    }

    @Override // com.payair.hce.setMaxHeight, com.payair.hce.setEms
    public final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 91;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            setmaxlines.DigitizedCardProfile(69);
            i = 12838;
        } else {
            setmaxlines.DigitizedCardProfile(36);
            i = 128;
        }
        setmaxlines.DigitizedCardProfile(i);
        java.util.Enumeration SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
        while (SdkCoreAlternateContactlessPaymentDataImpl2.hasMoreElements()) {
            setmaxlines.DigitizedCardProfile((com.payair.hce.setShadowLayer) SdkCoreAlternateContactlessPaymentDataImpl2.nextElement());
        }
        setmaxlines.DigitizedCardProfile(0);
        setmaxlines.DigitizedCardProfile(0);
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 45;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        AlternateContactlessPaymentDataJson = 1263759066225628708L;
        writeReplace = -804334044;
        valueOf = (char) 26703;
    }

    static void init$0() {
        $$d = new byte[]{89, 43, 98, -67};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -2068794488, 2068794488, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
