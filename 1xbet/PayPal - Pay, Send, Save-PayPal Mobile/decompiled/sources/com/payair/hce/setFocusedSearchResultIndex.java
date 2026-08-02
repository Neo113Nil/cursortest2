package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setFocusedSearchResultIndex extends com.payair.hce.setEms implements com.payair.hce.setLineHeight {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    int DigitizedCardProfile;
    boolean valueOf = false;
    com.payair.hce.setShadowLayer values;
    boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i * 2;
        int i5 = (i2 * 4) + 4;
        int i6 = 115 - (s * 3);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i6 += i5;
            i5 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i7 = i5;
            i5 = bArr[i5];
            i8 = i9;
            i6 += i5;
            i5 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == 0 - i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == 0 - i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    @Override // com.payair.hce.setEms
    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    public setFocusedSearchResultIndex(boolean z, int i, com.payair.hce.setShadowLayer setshadowlayer) {
        this.writeReplace = true;
        this.values = null;
        if (setshadowlayer instanceof com.payair.hce.setLinkTextColor) {
            this.writeReplace = true;
        } else {
            this.writeReplace = z;
        }
        this.DigitizedCardProfile = i;
        if (this.writeReplace) {
            this.values = setshadowlayer;
        } else {
            setshadowlayer.getAid();
            this.values = setshadowlayer;
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setFocusedSearchResultIndex setfocusedsearchresultindex = (com.payair.hce.setFocusedSearchResultIndex) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        if (!(setems instanceof com.payair.hce.setFocusedSearchResultIndex)) {
            return bool;
        }
        com.payair.hce.setFocusedSearchResultIndex setfocusedsearchresultindex2 = (com.payair.hce.setFocusedSearchResultIndex) setems;
        if (setfocusedsearchresultindex.DigitizedCardProfile == setfocusedsearchresultindex2.DigitizedCardProfile) {
            int i = getAid;
            int i2 = i + 101;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = setfocusedsearchresultindex.valueOf;
                boolean z2 = setfocusedsearchresultindex2.valueOf;
                boolean z3 = setfocusedsearchresultindex.writeReplace;
                boolean z4 = setfocusedsearchresultindex2.writeReplace;
                throw null;
            }
            boolean z5 = setfocusedsearchresultindex.valueOf;
            boolean z6 = setfocusedsearchresultindex2.valueOf;
            if (setfocusedsearchresultindex.writeReplace == setfocusedsearchresultindex2.writeReplace) {
                com.payair.hce.setShadowLayer setshadowlayer = setfocusedsearchresultindex.values;
                if (setshadowlayer == null) {
                    if (setfocusedsearchresultindex2.values != null) {
                        IccPrivateKeyCrtComponentsJson = (i + 37) % 128;
                        return bool;
                    }
                } else if (!setshadowlayer.getAid().equals(setfocusedsearchresultindex2.values.getAid())) {
                    return bool;
                }
                return java.lang.Boolean.TRUE;
            }
        }
        return bool;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $11 + 91;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 9) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43, android.graphics.Color.green(0) + 2073, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 60036));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 54, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3542, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $11 = ($10 + 81) % 128;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.getCapsMode("", 0, 0), 3544 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = IccPrivateKeyCrtComponentsJson + 109;
        getAid = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = this.DigitizedCardProfile;
        com.payair.hce.setShadowLayer setshadowlayer = this.values;
        if (setshadowlayer != null) {
            i2 ^= setshadowlayer.hashCode();
        }
        int i3 = IccPrivateKeyCrtComponentsJson + 29;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int values() {
        int i = (getAid + 95) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        int i2 = this.DigitizedCardProfile;
        int i3 = i + 27;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setEms valueOf() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 109;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setShadowLayer setshadowlayer = this.values;
            if (setshadowlayer == null) {
                return null;
            }
            int i3 = i + 7;
            getAid = i3 % 128;
            if (i3 % 2 != 0) {
                return setshadowlayer.getAid();
            }
            setshadowlayer.getAid();
            throw null;
        }
        throw null;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() {
        getAid = (IccPrivateKeyCrtComponentsJson + 45) % 128;
        com.payair.hce.setEms aid = getAid();
        getAid = (IccPrivateKeyCrtComponentsJson + 17) % 128;
        return aid;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms DigitizedCardProfile() {
        com.payair.hce.setTitleMarginStart settitlemarginstart = new com.payair.hce.setTitleMarginStart(this.writeReplace, this.DigitizedCardProfile, this.values);
        getAid = (IccPrivateKeyCrtComponentsJson + 101) % 128;
        return settitlemarginstart;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.setSubtitleTextAppearance setsubtitletextappearance = new com.payair.hce.setSubtitleTextAppearance(this.writeReplace, this.DigitizedCardProfile, this.values);
        int i = getAid + 111;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return setsubtitletextappearance;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "\u0000", android.os.Process.getGidForName("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, '1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.DigitizedCardProfile);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, "\u0000", 241 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 1 - android.view.KeyEvent.keyCodeFromString(""), 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.values);
        java.lang.String obj = sb.toString();
        int i = IccPrivateKeyCrtComponentsJson + 67;
        getAid = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson = 1889207285;
    }

    static void init$0() {
        $$d = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, -89, 69};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, setems}, -399797657, 399797657, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
