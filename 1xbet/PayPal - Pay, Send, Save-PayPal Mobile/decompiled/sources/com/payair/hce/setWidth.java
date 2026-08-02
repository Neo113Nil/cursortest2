package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setWidth extends com.payair.hce.setEms implements com.payair.hce.getApkVersion<com.payair.hce.setShadowLayer> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$m = null;
    private static final int $$n = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long valueOf;
    private static int values;
    private java.util.Vector DigitizedCardProfile = new java.util.Vector();
    private boolean writeReplace = false;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        return ((((i * (-1529)) + (i2 * (-764))) + ((((~((i2 | i4) | i3)) | (~(i6 | i7))) | (~((i5 | i) | i3))) * 765)) + (((~i6) | (~(i4 | i7))) * 1530)) + (((~(i | (i5 | i7))) | (~(i4 | i3))) * 765) != 1 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = 43 - i;
        int i4 = s + 65;
        char[] cArr = new char[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i4 + i3) - 2;
        }
        while (true) {
            i5++;
            cArr[i5] = (char) i4;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                byte b = bArr[i3];
                i3++;
                i4 = (i4 + b) - 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (s * 2) + 1;
        int i6 = (i2 * 3) + 4;
        byte[] bArr = $$m;
        int i7 = 106 - i;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i6++;
            i7 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i6++;
            i7 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setEms
    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 57) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        java.lang.Object obj = null;
        if (str != null) {
            int i2 = $10 + 49;
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
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        int i3 = 0;
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 81) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 71, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1180, (char) android.graphics.drawable.Drawable.resolveOpacity(i3, i3));
                    byte length4 = (byte) $$m.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    h(length4, b, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[i3];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i3] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(i3, i3) + 30, 3443 - (android.os.Process.myPid() >> 22), (char) (android.view.KeyEvent.normalizeMetaState(i3) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[i3] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c3 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[i3] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 26, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1863, (char) (41775 - android.text.TextUtils.getCapsMode("", i3, i3)));
                    byte b2 = (byte) ($$n & 5);
                    byte b3 = (byte) (b2 - 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    h(b2, b3, b3, objArr6);
                    obj4 = cls3.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3132 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    h(0, (short) 0, 0, objArr8);
                    c2 = 2;
                    obj5 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                obj = null;
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (values ^ 1263759066225628708L))) ^ ((char) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                i3 = 0;
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

    protected setWidth() {
    }

    protected setWidth(com.payair.hce.setHintTextColor sethinttextcolor, boolean z) {
        for (int i = 0; i != ((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue(); i++) {
            this.DigitizedCardProfile.addElement((com.payair.hce.setShadowLayer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, 1016755526, -1016755525, i));
        }
    }

    public final java.util.Enumeration valueOf() {
        int i = IccPrivateKeyCrtComponentsJson + 49;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile.elements();
            throw null;
        }
        java.util.Enumeration elements = this.DigitizedCardProfile.elements();
        int i2 = IccPrivateKeyCrtComponentsJson + 61;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return elements;
        }
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.setShadowLayer AlternateContactlessPaymentDataJson(int i) {
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 9;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) this.DigitizedCardProfile.elementAt(i);
        int i3 = IccPrivateKeyCrtComponentsJson + 79;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return setshadowlayer;
        }
        throw null;
    }

    private int values() {
        int i = IccPrivateKeyCrtComponentsJson + 115;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile.size();
            throw null;
        }
        int size = this.DigitizedCardProfile.size();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 13) % 128;
        return size;
    }

    private com.payair.hce.setShadowLayer[] SdkCoreAlternateContactlessPaymentDataImpl() {
        com.payair.hce.setShadowLayer[] setshadowlayerArr;
        int i;
        int i2 = IccPrivateKeyCrtComponentsJson + 59;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            setshadowlayerArr = new com.payair.hce.setShadowLayer[values()];
            i = 1;
        } else {
            setshadowlayerArr = new com.payair.hce.setShadowLayer[values()];
            i = 0;
        }
        while (i != values()) {
            int i3 = IccPrivateKeyCrtComponentsJson + 69;
            SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
            if (i3 % 2 == 0) {
                setshadowlayerArr[i] = AlternateContactlessPaymentDataJson(i);
                i += 59;
            } else {
                setshadowlayerArr[i] = AlternateContactlessPaymentDataJson(i);
                i++;
            }
        }
        return setshadowlayerArr;
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = IccPrivateKeyCrtComponentsJson + 55;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            java.util.Enumeration valueOf2 = valueOf();
            int values2 = values();
            while (valueOf2.hasMoreElements()) {
                values2 = (values2 * 17) ^ values(valueOf2).hashCode();
            }
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 23;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 == 0) {
                return values2;
            }
            throw new java.lang.ArithmeticException();
        }
        valueOf();
        values();
        throw null;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 31) % 128;
        if (this.writeReplace) {
            com.payair.hce.setCursorVisible setcursorvisible = new com.payair.hce.setCursorVisible();
            setcursorvisible.DigitizedCardProfile = this.DigitizedCardProfile;
            return setcursorvisible;
        }
        java.util.Vector vector = new java.util.Vector();
        int i = 0;
        while (i != this.DigitizedCardProfile.size()) {
            vector.addElement(this.DigitizedCardProfile.elementAt(i));
            i++;
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
        }
        com.payair.hce.setCursorVisible setcursorvisible2 = new com.payair.hce.setCursorVisible();
        setcursorvisible2.DigitizedCardProfile = vector;
        setcursorvisible2.RecordsJson();
        return setcursorvisible2;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setWidth setwidth = (com.payair.hce.setWidth) objArr[0];
        com.payair.hce.setSubtitle setsubtitle = new com.payair.hce.setSubtitle();
        ((com.payair.hce.setWidth) setsubtitle).DigitizedCardProfile = setwidth.DigitizedCardProfile;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 115;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return setsubtitle;
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (setems instanceof com.payair.hce.setWidth) {
            com.payair.hce.setWidth setwidth = (com.payair.hce.setWidth) setems;
            if (values() == setwidth.values()) {
                java.util.Enumeration valueOf2 = valueOf();
                java.util.Enumeration valueOf3 = setwidth.valueOf();
                SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 39) % 128;
                while (valueOf2.hasMoreElements()) {
                    int i = SdkCoreAlternateContactlessPaymentDataImpl + 43;
                    IccPrivateKeyCrtComponentsJson = i % 128;
                    if (i % 2 != 0) {
                        com.payair.hce.setShadowLayer values2 = values(valueOf2);
                        com.payair.hce.setShadowLayer values3 = values(valueOf3);
                        values2.getAid();
                        values3.getAid();
                        throw null;
                    }
                    com.payair.hce.setShadowLayer values4 = values(valueOf2);
                    com.payair.hce.setShadowLayer values5 = values(valueOf3);
                    com.payair.hce.setEms aid = values4.getAid();
                    com.payair.hce.setEms aid2 = values5.getAid();
                    if (aid != aid2 && !aid.equals(aid2)) {
                        return false;
                    }
                }
                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 25) % 128;
                return true;
            }
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 117) % 128;
        }
        return false;
    }

    private static com.payair.hce.setShadowLayer values(java.util.Enumeration enumeration) {
        com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) enumeration.nextElement();
        if (setshadowlayer != null) {
            int i = IccPrivateKeyCrtComponentsJson + 3;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 != 0) {
                return setshadowlayer;
            }
            throw null;
        }
        int i2 = IccPrivateKeyCrtComponentsJson + 45;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setMarqueeRepeatLimit setmarqueerepeatlimit = com.payair.hce.setMarqueeRepeatLimit.AlternateContactlessPaymentDataJson;
            int i3 = IccPrivateKeyCrtComponentsJson + 51;
            SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
            if (i3 % 2 != 0) {
                return setmarqueerepeatlimit;
            }
            throw null;
        }
        com.payair.hce.setMarqueeRepeatLimit setmarqueerepeatlimit2 = com.payair.hce.setMarqueeRepeatLimit.AlternateContactlessPaymentDataJson;
        throw null;
    }

    private static boolean AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2) {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int min = java.lang.Math.min(bArr.length, bArr2.length);
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 11) % 128;
        for (int i = 0; i != min; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        if (min != bArr.length) {
            return false;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 89) % 128;
        return true;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) objArr[0];
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 5) % 128;
        try {
            com.payair.hce.setEms aid = setshadowlayer.getAid();
            int rgb = android.graphics.Color.rgb(0, 0, 0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "蟍厾搉", "\u2fe5\ue621㾏襖", (-1897520849) - rgb, (char) (22127 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
            byte[] values2 = aid.values(((java.lang.String) objArr2[0]).intern());
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 79) % 128;
            return values2;
        } catch (java.io.IOException unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "끹돍勒䫽ᚌ襡攠ஒ坵\u05cb꜊樻쓏\udfce理㯭쪲\u0ad4貑灲蠙㈰딦谵ੴヤ㱪걖䩟娐朒닝ደ", "鳒䋹\uf0afㄢ", android.graphics.Color.red(0) - 1354565220, (char) android.text.TextUtils.getTrimmedLength(""), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
    }

    private void RecordsJson() {
        if (!this.writeReplace) {
            this.writeReplace = true;
            if (this.DigitizedCardProfile.size() > 1) {
                int size = this.DigitizedCardProfile.size() - 1;
                boolean z = true;
                while (z) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 85) % 128;
                    int i = 0;
                    byte[] bArr = (byte[]) DigitizedCardProfile(new java.lang.Object[]{(com.payair.hce.setShadowLayer) this.DigitizedCardProfile.elementAt(0)}, -651778626, 651778626, (int) java.lang.System.currentTimeMillis());
                    z = false;
                    int i2 = 0;
                    while (i2 != size) {
                        int i3 = i2 + 1;
                        byte[] bArr2 = (byte[]) DigitizedCardProfile(new java.lang.Object[]{(com.payair.hce.setShadowLayer) this.DigitizedCardProfile.elementAt(i3)}, -651778626, 651778626, (int) java.lang.System.currentTimeMillis());
                        if (AlternateContactlessPaymentDataJson(bArr, bArr2)) {
                            bArr = bArr2;
                        } else {
                            java.lang.Object elementAt = this.DigitizedCardProfile.elementAt(i2);
                            java.util.Vector vector = this.DigitizedCardProfile;
                            vector.setElementAt(vector.elementAt(i3), i2);
                            this.DigitizedCardProfile.setElementAt(elementAt, i3);
                            z = true;
                            i = i2;
                        }
                        i2 = i3;
                    }
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 13;
                    IccPrivateKeyCrtComponentsJson = i4 % 128;
                    int i5 = i4 % 2;
                    size = i;
                }
            }
        }
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        IccPrivateKeyCrtComponentsJson = (i + 33) % 128;
        IccPrivateKeyCrtComponentsJson = (i + 75) % 128;
        return true;
    }

    public java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson + 73;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        java.util.Vector vector = this.DigitizedCardProfile;
        if (i % 2 != 0) {
            return vector.toString();
        }
        throw null;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.payair.hce.setShadowLayer> iterator() {
        com.payair.hce.getClientVersion.valueOf valueof = new com.payair.hce.getClientVersion.valueOf(SdkCoreAlternateContactlessPaymentDataImpl());
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 9;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return valueof;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = 1263759066225628708L;
        values = -804334044;
        AlternateContactlessPaymentDataJson = (char) 49373;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x03bb, code lost:
    
        if (r0.contains(r4.getField((java.lang.String) r14[0]).get(null)) != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x078a A[Catch: all -> 0x00ce, TryCatch #6 {all -> 0x00ce, blocks: (B:5:0x0048, B:7:0x0079, B:8:0x00bb, B:17:0x019d, B:19:0x01cb, B:20:0x0212, B:26:0x02e2, B:28:0x02f5, B:29:0x0337, B:49:0x0683, B:51:0x06b9, B:52:0x0708, B:58:0x0746, B:60:0x078a, B:61:0x07db, B:95:0x03d8, B:97:0x0413, B:98:0x045f, B:102:0x023d, B:104:0x0274, B:105:0x02be), top: B:2:0x002a }] */
    /* JADX WARN: Type inference failed for: r17v0, types: [float] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object obj;
        ?? r24;
        java.lang.Integer num;
        int i3;
        java.lang.Object obj2;
        int i4 = SdkCoreAlternateContactlessPaymentDataImpl;
        IccPrivateKeyCrtComponentsJson = (i4 + 97) % 128;
        int i5 = -1347122530;
        try {
            if (context == null) {
                IccPrivateKeyCrtComponentsJson = (i4 + 69) % 128;
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((~i) | (-726759699))) * 130) - 616401236) + (((~(i | (-726759699))) | 276858372) * 130))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(39, 34, (short) ($$a[14] - 1), objArr4);
                    obj3 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            try {
                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                ?? complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "䓨∴녜ຢ뎲⾦\uf8c9珽\uea89⮐驊⾒獐힖葠膚尗彴衍乕ᓔ碃\ue181", "彾ᇉꖧ䨤", (edgeSlop >> 16) - 1492006561, (char) (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "耯誈㉔璲ា붷乿䈦ˎ\ud9d6\ue2b6⢲ț䘙畯ᘰ鴟Ⰶ", "\ua9dcે府捉", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, (char) (18781 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "筚汝镦\ue908긮✺䏚鳻\uf3bd䡻瞹䷑粉노鎅㮷≌浄魩飰㍞ꝶ걝挹䪍\ue38bดᠬ䇴韛뙍こ䖟鰃", "᳐煤\uee1b쾽", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (android.os.Process.myTid() >> 22), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "ꔋ䄄\ueb97邹\ude03", "똄缁湴촇", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1954480567, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1902), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-124193) | r2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 829047000) + (((~((~i) | 905845406)) | (-807010213)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(39, 34, (short) ($$a[14] - 1), objArr10);
                        obj4 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i6 = ~i;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-836511762) | i6)) | (~((-168417224) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 533340538 + (((~(i6 | (-167892935))) | (~((-835987473) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(39, 34, (short) ($$a[14] - 1), objArr12);
                        obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 61) % 128;
                    return objArr;
                }
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj6 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1739, (char) (5826 - android.text.TextUtils.getCapsMode("", 0, 0)));
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(39, 34, (short) ($$a[14] - 1), objArr13);
                    obj6 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj6);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj6).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 33, 1739 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (5825 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                byte[] bArr = $$a;
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(39, 34, (short) (bArr[14] - 1), objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1738 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5826));
                    byte b = (byte) (-bArr[20]);
                    byte b2 = b;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(b, b2, (short) (b2 | 48), objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(960387510 | i)) | (-44541475)) * (-668)) - 1861463728) + (((~((-44541475) | i)) | 960387510) * 1336) + ((i | (-42051073)) * 668))};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj7 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(39, 34, (short) (bArr[14] - 1), objArr18);
                        obj7 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                try {
                } catch (java.lang.Exception unused) {
                    complexToFraction = 0;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    r24 = "\u0000\u0000\u0000\u0000";
                    b("\u0000\u0000\u0000\u0000", "\ue532罏컨컜╁㒂疵\ue4db쏺\uf84cꇇ籄䂓\uee8e奵ⳙ꯫厤ℤᎄ⿄贗ゑቂ磛흽좞嚷", "ꆢș吒ꎒ", android.view.View.resolveSize(0, 0), (char) (37460 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr19);
                    try {
                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj8 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf("", ""), 3161 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (33099 - android.text.TextUtils.getTrimmedLength("")));
                            byte b3 = (byte) (bArr[14] - 1);
                            byte b4 = b3;
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(b3, b4, (short) (b4 | 653), objArr21);
                            obj8 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj8);
                        }
                        long j = i;
                        complexToFraction = 0;
                        long j2 = ~((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr20)).longValue();
                        num = 16;
                        long j3 = ~j;
                        r24 = -1347122530;
                        long j4 = j2 | j3;
                        long j5 = (((((r9 * (-49)) - 2144604213) + ((j | (-42051063)) * (-50))) + (((~(j4 | (-42051063))) | (~((j2 | 42051062) | j))) * 50)) + ((((~j4) | (~(j2 | (-42051063)))) | ((j3 | (-42051063)) ^ (-1))) * 50)) - 1295617045;
                        int i7 = ~i;
                        if (((((int) (j5 >> 32)) & ((((~((-429402724) | i)) | (-1866629135)) * (-465)) + 950647684 + (((~((-1866629135) | i)) | (-429402724)) * 930) + (((-150994947) | i) * 465))) | (((int) j5) & ((((336936961 | r5) * (-712)) - 2060157731) + (((~(i7 | (-336936962))) | (~(1597341647 | i))) * (-712)) + (((-1597336200) | (~(1260404686 | i7))) * 712)))) == 1) {
                            i3 = 1;
                            obj2 = -1347122530;
                        }
                        i5 = r24;
                        java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        ?? r6 = {java.lang.Integer.valueOf(i2), complexToFraction, java.lang.Integer.valueOf(((((~((-962786762) | r2)) | 42142223) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 862170896) + (((~((~i) | (-962655681))) | (~(1004797903 | i))) * (-519)) + (((~(i | 42142223)) | 962786761) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(i5);
                        if (obj == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, 2713 - (android.os.Process.myPid() >> 22), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(39, 34, (short) ($$a[14] - 1), objArr23);
                            obj = cls11.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(i5, obj);
                        }
                        ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, r6)).intValue();
                        return objArr22;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                r24 = -1347122530;
                num = 16;
                complexToFraction = 0;
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "锴븻掳ಖ䮡顂\udd9cꖣﭰﱔࡸ画\ue440", "瀂✶\uf602筽", 36124271 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (32246 - android.graphics.Color.argb(0, 0, 0, 0)), objArr24);
                try {
                    java.lang.Object[] objArr25 = {((java.lang.String) objArr24[0]).intern()};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj9 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, android.graphics.Color.argb(0, 0, 0, 0) + 1921, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b5 = (byte) (bArr[14] - 1);
                        byte b6 = b5;
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(b5, b6, (short) (b6 | 653), objArr26);
                        obj9 = cls12.getMethod((java.lang.String) objArr26[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr25);
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    b("\u0000\u0000\u0000\u0000", "\uf457", "ƕ\ued9c뛲ⶖ", (-219309055) - android.graphics.Color.red(0), (char) (38630 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr27);
                    if (invoke2.equals(((java.lang.String) objArr27[0]).intern())) {
                        i3 = 1;
                        obj2 = -1347122530;
                    }
                    i5 = r24;
                    java.lang.Object[] objArr222 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    ?? r62 = {java.lang.Integer.valueOf(i2), complexToFraction, java.lang.Integer.valueOf(((((~((-962786762) | r2)) | 42142223) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 862170896) + (((~((~i) | (-962655681))) | (~(1004797903 | i))) * (-519)) + (((~(i | 42142223)) | 962786761) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(i5);
                    if (obj == null) {
                    }
                    ((int[]) objArr222[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, r62)).intValue();
                    return objArr222;
                } catch (java.lang.Throwable th2) {
                    i5 = -1347122530;
                    try {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    } catch (java.lang.Exception unused2) {
                    }
                }
                int[] iArr = new int[i3];
                int[] iArr2 = new int[i3];
                iArr[0] = i;
                iArr2[0] = i ^ 10;
                java.lang.Object[] objArr28 = {iArr, iArr2, null, new int[i3]};
                java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i2), num, java.lang.Integer.valueOf((((((~((-327521014) | i)) | 225) * 1504) + 1212577112) + ((~(i | (-327520789))) * (-1504))) - 207986528)};
                java.lang.Object obj10 = obj2;
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(obj10);
                if (obj11 == null) {
                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2714 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    a(39, 34, (short) (bArr[14] - 1), objArr30);
                    obj11 = cls13.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(obj10, obj11);
                }
                ((int[]) objArr28[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr29)).intValue();
                return objArr28;
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    static void init$1() {
        $$m = new byte[]{47, 64, -76, com.visa.cbp.getEncExpo.IResultReceiver};
        $$n = 59;
    }

    private static byte[] valueOf(com.payair.hce.setShadowLayer setshadowlayer) {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{setshadowlayer}, -651778626, 651778626, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{59, 86, -115, -69, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 143;
    }

    @Override // com.payair.hce.setEms
    final com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        return (com.payair.hce.setEms) DigitizedCardProfile(new java.lang.Object[]{this}, 1100100, -1100099, java.lang.System.identityHashCode(this));
    }
}
