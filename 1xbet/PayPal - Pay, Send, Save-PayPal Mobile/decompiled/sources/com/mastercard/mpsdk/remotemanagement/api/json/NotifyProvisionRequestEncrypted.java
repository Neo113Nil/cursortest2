package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class NotifyProvisionRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long valueOf;
    private static int values;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorCode")
    private java.lang.String errorCode;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorDescription")
    private java.lang.String errorDescription;

    @com.payair.hce.setSelectionFromTop(valueOf = "result")
    private java.lang.String result;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        ?? r6 = 40 - (b2 * 2);
        byte[] bArr = $$a;
        int i3 = 718 - s;
        char[] cArr = new char[b + 1];
        if (bArr == null) {
            i3 = b;
            byte b3 = r6;
            i = 0;
            int i4 = r6;
            i3 = (i3 + b3) - 2;
            i2 = i4 + 1;
            cArr[i] = (char) i3;
            if (i == b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            b3 = bArr[i2];
            i++;
            i4 = i2;
            i3 = (i3 + b3) - 2;
            i2 = i4 + 1;
            cArr[i] = (char) i3;
            if (i == b) {
            }
        } else {
            i = 0;
            i2 = r6;
            cArr[i] = (char) i3;
            if (i == b) {
            }
        }
    }

    private static void f(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = 111 - s2;
        int i3 = s * 4;
        int i4 = (i * 2) + 4;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 += i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += bArr[i4];
                i4++;
            }
        }
    }

    public NotifyProvisionRequestEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(str);
        this.tokenUniqueReference = str2;
        this.errorCode = str4;
        this.errorDescription = str5;
        this.result = str3;
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "飑裞덟ᾊ੶좖焢", "䒛㞵\udfd2䶝", bitsPerPixel - 768101051, (char) android.view.View.MeasureSpec.getMode(0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = values + 7;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    public java.lang.String getTokenUniqueReference() {
        int i = (IccPrivateKeyCrtComponentsJson + 23) % 128;
        values = i;
        java.lang.String str = this.tokenUniqueReference;
        IccPrivateKeyCrtComponentsJson = (i + 115) % 128;
        return str;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionRequestEncrypted setTokenUniqueReference(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 117;
        int i2 = i % 128;
        values = i2;
        if (i % 2 == 0) {
            this.tokenUniqueReference = str;
            IccPrivateKeyCrtComponentsJson = (i2 + 37) % 128;
            return this;
        }
        this.tokenUniqueReference = str;
        throw null;
    }

    public java.lang.String getResult() {
        int i = values;
        IccPrivateKeyCrtComponentsJson = (i + 41) % 128;
        java.lang.String str = this.result;
        int i2 = i + 65;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionRequestEncrypted setResult(java.lang.String str) {
        int i = (IccPrivateKeyCrtComponentsJson + 17) % 128;
        values = i;
        this.result = str;
        int i2 = i + 33;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public java.lang.String getErrorCode() {
        int i = values;
        int i2 = i + 81;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.errorCode;
        IccPrivateKeyCrtComponentsJson = (i + 75) % 128;
        return str;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionRequestEncrypted setErrorCode(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson;
        values = (i + 61) % 128;
        this.errorCode = str;
        int i2 = i + 81;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getErrorDescription() {
        int i = values;
        int i2 = i + 9;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.errorDescription;
        int i3 = i + 61;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionRequestEncrypted setErrorDescription(java.lang.String str) {
        int i = values + 105;
        int i2 = i % 128;
        IccPrivateKeyCrtComponentsJson = i2;
        if (i % 2 != 0) {
            this.errorDescription = str;
            int i3 = i2 + 27;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }
        this.errorDescription = str;
        throw null;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        $11 = ($10 + 93) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        java.lang.Object obj = null;
        if (str2 != null) {
            int i2 = $11 + 51;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            $11 = ($10 + 7) % 128;
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
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 41) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 71, 1179 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((short) 0, 0, (short) 9, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 31, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3442, (char) ((android.os.Process.myPid() >> 22) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.indexOf("", "") + 1864, (char) (android.text.TextUtils.indexOf("", "", 0) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f((short) 0, 0, (short) 6, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.KeyEvent.getDeadChar(0, 0), 3133 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    f((short) 0, 0, (short) 5, objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (writeReplace ^ 1263759066225628708L))) ^ ((char) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr3 = cArr3;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        $11 = ($10 + 105) % 128;
        objArr[0] = str4;
    }

    public java.lang.String toString() {
        IccPrivateKeyCrtComponentsJson = (values + 69) % 128;
        java.lang.String simpleName = getClass().getSimpleName();
        int i = values + 55;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return simpleName;
        }
        throw null;
    }

    private static void b(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        $11 = ($10 + 19) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        short s = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = 2;
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = DigitizedCardProfile;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 95;
                $10 = i9 % 128;
                if (i9 % i5 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i3];
                        objArr2[s] = java.lang.Integer.valueOf(cArr[i8]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", s, s) + 29, (android.widget.ExpandableListView.getPackedPositionForGroup(s) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(s) == 0L ? 0 : -1)) + 2807, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, s)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            f(s, s, (short) 2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[s], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i8])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 2807 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        f((short) 0, 0, (short) 2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                }
                i8++;
                s = 0;
                i3 = 1;
                i5 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr2 != null) {
            $10 = ($11 + 21) % 128;
            char[] cArr4 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.MeasureSpec.getSize(0) + 2836, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        f((short) 0, 0, (byte) $$g.length, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 43, 2879 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.graphics.Color.blue(0));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        f((short) 0, 0, (short) 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 34, android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                $10 = ($11 + 107) % 128;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i12 = $11 + 103;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i4];
                java.lang.System.arraycopy(cArr3, 1, cArr5, 1, i4);
                int i13 = i4 / i7;
                i = 0;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i7);
                java.lang.System.arraycopy(cArr5, i7, cArr3, 1, i13);
            } else {
                i = 0;
                char[] cArr6 = new char[i4];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i14 = i4 - i7;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i14, i7);
                java.lang.System.arraycopy(cArr6, i7, cArr3, 0, i14);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            getaccounttype.writeReplace = i;
            while (getaccounttype.writeReplace < i4) {
                cArr7[getaccounttype.writeReplace] = cArr3[(i4 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            $10 = ($11 + 25) % 128;
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            $10 = ($11 + 125) % 128;
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i15 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf = 1263759066225628708L;
        writeReplace = -804334044;
        AlternateContactlessPaymentDataJson = (char) 49121;
        DigitizedCardProfile = new char[]{16857, 16773, 16800, 16803, 16802, 16829, 16815, 16799, 16768, 16789, 16804, 16804, 16803, 16663, 16665, 16659, 16680, 16656, 16665, 16656, 16685, 16686, 16687, 16678, 16649, 16653, 16656, 16687, 16678, 16677, 16677, 16648, 16770, 16723, 16816, 16824, 16734, 16704, 16730, 16723, 16818, 16823, 16732, 16729, 16726, 16827, 16827, 16732, 16726, 16722, 16729, 16731, 16733, 16829, 16827, 16731, 16724, 16727, 16733, 16826, 16823, 16724, 16731, 16827, 16826, 16728, 16728, 16704, 16827, 16826, 16728, 16728, 16704, 16827, 16709, 16586, 16586, 16605, 16605, 16602, 16577, 16603, 16589, 16591, 16599, 16601, 16605, 16577, 16581, 16605, 16601, 16603, 16864, 16779, 16778, 16768, 16726, 16730, 16830, 16830, 16726, 16725, 16728, 16734, 16704, 16734, 16735, 16706, 16732, 16828, 16826, 16891, 16811, 16805, 16805, 16777, 16771, 16808, 16809, 16804, 16772, 16783, 16784, 16803, 16805, 16813, 16812, 16884, 16829, 16807, 16804, 16829, 16843, 16889, 16805, 16802, 16802, 16769, 16720, 16818, 16714, 16741, 16719, 16821, 16746, 16747, 16723, 16746, 16744, 16818, 16820, 16820, 16716, 16741, 16740, 16749, 16720, 16744, 16739, 16708, 16826, 16707, 16721, 16746, 16880, 16709, 16598, 16598, 16600, 16598, 16623, 16616, 16595, 16576, 16604, 16597, 16592, 16619, 16614, 16598, 16603, 16790, 16705, 16713, 16748, 16742, 16741, 16741, 16704, 16823, 16730, 16739, 16737, 16744, 16746, 16724, 16721, 16739, 16740, 16744, 16736, 16749, 16729, 16745, 16745, 16746, 16744, 16741, 16743, 16745, 16743, 16741, 16766, 16738, 16744, 16711, 16713, 16742, 16787, 16753, 16755, 16739, 16761, 16649, 16753, 16753, 16650, 16651, 16650, 16650, 16737, 16704, 16745, 16649, 16753, 16652, 16649, 16650, 16753, 16720, 16721, 16754, 16652, 16648, 16655, 16753, 16755};
    }

    static void init$1() {
        $$g = new byte[]{com.google.common.base.Ascii.US, -55, -84, 106};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{69, -73, 121, 3, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 89;
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x154c, code lost:
    
        r1 = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
        r2 = (java.lang.String) java.lang.Class.forName(r5).getField(r6).get(r41);
        r8 = r44;
        ((int[]) r1[0])[0] = r8;
        ((int[]) r1[1])[0] = r8 ^ 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1584, code lost:
    
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r46), 16, java.lang.Integer.valueOf(((((~(844724079 | r8)) | (-995983232)) * 305) + 1688986866) + (((~(844724079 | (~r8))) | (-185411866)) * 305))};
        r9 = r31;
        r3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x15bb, code lost:
    
        if (r3 != null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x15bd, code lost:
    
        r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        r6 = new java.lang.Object[1];
        e((byte) 34, (byte) (-com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionRequestEncrypted.$$a[52]), 653, r6);
        r3 = r3.getMethod((java.lang.String) r6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, r3);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x1616, code lost:
    
        ((int[]) r1[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r3).invoke(null, r2)).intValue();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x180f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x1810  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x1d25 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x16d7 A[Catch: Exception -> 0x16fd, all -> 0x1720, IOException -> 0x1729, TryCatch #0 {, blocks: (B:304:0x1071, B:306:0x1085, B:323:0x1123, B:337:0x1180, B:353:0x11d5, B:372:0x13d9, B:374:0x13e5, B:376:0x147d, B:378:0x1498, B:380:0x14ce, B:382:0x14fb, B:384:0x1523, B:386:0x1543, B:412:0x16fd, B:413:0x171f, B:437:0x1691, B:438:0x1694, B:511:0x169f, B:513:0x16aa, B:514:0x16ab, B:518:0x16bb, B:520:0x16c2, B:521:0x16c3, B:539:0x16d1, B:541:0x16d7, B:542:0x16d8, B:560:0x16f0, B:562:0x16f6, B:563:0x16f7), top: B:303:0x1071 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x16d8 A[Catch: Exception -> 0x16fd, all -> 0x1720, IOException -> 0x1729, TryCatch #0 {, blocks: (B:304:0x1071, B:306:0x1085, B:323:0x1123, B:337:0x1180, B:353:0x11d5, B:372:0x13d9, B:374:0x13e5, B:376:0x147d, B:378:0x1498, B:380:0x14ce, B:382:0x14fb, B:384:0x1523, B:386:0x1543, B:412:0x16fd, B:413:0x171f, B:437:0x1691, B:438:0x1694, B:511:0x169f, B:513:0x16aa, B:514:0x16ab, B:518:0x16bb, B:520:0x16c2, B:521:0x16c3, B:539:0x16d1, B:541:0x16d7, B:542:0x16d8, B:560:0x16f0, B:562:0x16f6, B:563:0x16f7), top: B:303:0x1071 }] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x16f6 A[Catch: Exception -> 0x16fd, all -> 0x1720, IOException -> 0x1729, TryCatch #0 {, blocks: (B:304:0x1071, B:306:0x1085, B:323:0x1123, B:337:0x1180, B:353:0x11d5, B:372:0x13d9, B:374:0x13e5, B:376:0x147d, B:378:0x1498, B:380:0x14ce, B:382:0x14fb, B:384:0x1523, B:386:0x1543, B:412:0x16fd, B:413:0x171f, B:437:0x1691, B:438:0x1694, B:511:0x169f, B:513:0x16aa, B:514:0x16ab, B:518:0x16bb, B:520:0x16c2, B:521:0x16c3, B:539:0x16d1, B:541:0x16d7, B:542:0x16d8, B:560:0x16f0, B:562:0x16f6, B:563:0x16f7), top: B:303:0x1071 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x16f7 A[Catch: Exception -> 0x16fd, all -> 0x1720, IOException -> 0x1729, TRY_LEAVE, TryCatch #0 {, blocks: (B:304:0x1071, B:306:0x1085, B:323:0x1123, B:337:0x1180, B:353:0x11d5, B:372:0x13d9, B:374:0x13e5, B:376:0x147d, B:378:0x1498, B:380:0x14ce, B:382:0x14fb, B:384:0x1523, B:386:0x1543, B:412:0x16fd, B:413:0x171f, B:437:0x1691, B:438:0x1694, B:511:0x169f, B:513:0x16aa, B:514:0x16ab, B:518:0x16bb, B:520:0x16c2, B:521:0x16c3, B:539:0x16d1, B:541:0x16d7, B:542:0x16d8, B:560:0x16f0, B:562:0x16f6, B:563:0x16f7), top: B:303:0x1071 }] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v2, types: [long] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r29v34, types: [long] */
    /* JADX WARN: Type inference failed for: r29v41, types: [long] */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v216 */
    /* JADX WARN: Type inference failed for: r2v368, types: [int] */
    /* JADX WARN: Type inference failed for: r2v369 */
    /* JADX WARN: Type inference failed for: r2v370 */
    /* JADX WARN: Type inference failed for: r7v112 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r8v167 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v172 */
    /* JADX WARN: Type inference failed for: r8v173 */
    /* JADX WARN: Type inference failed for: r8v193 */
    /* JADX WARN: Type inference failed for: r8v194 */
    /* JADX WARN: Type inference failed for: r8v229 */
    /* JADX WARN: Type inference failed for: r8v231 */
    /* JADX WARN: Type inference failed for: r8v332 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
        int i4;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.Object[] objArr;
        char c;
        int i5;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        int i6;
        int i7;
        java.lang.Object[] objArr4;
        int i8;
        int i9;
        char c2;
        java.lang.Object[] objArr5;
        ?? r25;
        ?? r7;
        java.lang.String intern;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.Object obj;
        java.lang.Throwable th2;
        java.lang.Throwable cause2;
        java.lang.Object obj2;
        java.lang.Object newInstance;
        java.lang.Process process;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        java.lang.Object obj3;
        java.lang.Object[] objArr6;
        java.lang.Integer num4;
        java.lang.String str;
        java.lang.Object obj4;
        long j;
        java.lang.Object obj5;
        int i10;
        java.lang.Object[] objArr7;
        char c3;
        java.lang.Object[] objArr8;
        int i11;
        java.lang.Object[] objArr9;
        java.lang.Object obj6;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "雪⳿탥ꧫ铇씀餌뉒锃ᵉの瞡㨗쯒Όᔵ䷈睃䗳콓꩕\ue23f┕御ㆧ\ue2c5㮭쮠층⋞馯嘴倛ഖ", "\udbcf㱝쫁\ue30f", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr10);
        java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "\ue298돽簩藩\ue4da焵剆", "\u2efd뀡讬툋", (-1397743315) - android.os.Process.getGidForName(""), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr11);
        java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(new int[]{111, 16, 0, 16}, false, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", objArr12);
        java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Integer num5 = -604620973;
        java.lang.Integer num6 = -1347122530;
        java.lang.Integer num7 = 269015277;
        try {
            if (context == null) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                b(new int[]{0, 12, 0, 0}, false, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", objArr13);
                java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                java.lang.Object obj8 = obj7;
                if (obj7 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 36, 3161 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (33147 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    e(r6[41], (byte) (-$$a[52]), (short) 618, objArr15);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, method);
                    obj8 = method;
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr14)).longValue();
                long j2 = i;
                long j3 = ~j2;
                long j4 = (((-55) * longValue) - 6040210055L) + (((~(j2 | 109822001)) | longValue) * 56) + ((~(109822001 | longValue)) * (-56)) + (((~(longValue | j3)) | 109822001) * 56) + 797648737;
                int i12 = (int) (j4 >> 32);
                int i13 = ~i;
                if (((i12 & (((~((-27267137) | i13)) * 433) + 1891214382 + (((~((-872883384) | i)) | (-564343028)) * (-433)) + (((~((-564343028) | i)) | (-900150520)) * 433))) | (((int) j4) & (((((~((-8912898) | i13)) | (~((-1509976757) | i))) * 988) - 2019515087) + (((~((-81663244) | i)) | 72750346 | (~((-1509976757) | i13))) * 988)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1001758663 | i13)) * 52) - 1239677504) + (((~(867275201 | i13)) | (~(i13 | (-162860744))) | 134483462) * (-52)) + (((~((-867275202) | i13)) | 838897920) * 52))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    if (obj9 != null) {
                        j = j3;
                        obj6 = obj9;
                    } else {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        j = j3;
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr17);
                        java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method2);
                        obj6 = method2;
                    }
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr16)).intValue();
                    i10 = 0;
                } else {
                    j = j3;
                    java.lang.Object[] objArr18 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((301995076 | i) * 988) + 1067543664 + (((~(395531622 | i13)) | 541067776) * (-1976)) + (((~((-634604323) | i)) | 301995076 | (~(634604322 | i13))) * 988))};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    if (obj10 != null) {
                        obj5 = obj10;
                    } else {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr20);
                        java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method3);
                        obj5 = method3;
                    }
                    i10 = 0;
                    ((int[]) objArr18[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr19)).intValue();
                    objArr7 = objArr18;
                }
                if (((int[]) objArr7[1])[i10] != i) {
                    return objArr7;
                }
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b(new int[]{12, 20, 117, i10}, true, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", objArr21);
                java.lang.Object[] objArr22 = {((java.lang.String) objArr21[i10]).intern()};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                java.lang.Object obj12 = obj11;
                if (obj11 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 3161, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33098));
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    e(r7[41], (byte) (-$$a[52]), (short) 618, objArr23);
                    java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, method4);
                    obj12 = method4;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr22)).longValue();
                long j5 = ~longValue2;
                long j6 = (((-565) * longValue2) - 141410843280L) + (((~(j2 | 249401839)) | (~(longValue2 | 249401839))) * (-566)) + ((~((-249401840) | j5)) * 566) + ((~(249401839 | j5 | j2)) * 566) + 1156872578;
                if (((((int) (j6 >> 32)) & ((((~(704553642 | i13)) | 2141780053) * (-235)) + 690155199 + (((~(704553642 | i)) | 2141780053) * (-470)) + (((~(2147416831 | i)) | 698916864) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) j6) & ((((~((-2052686508) | i)) | 710410922) * 576) + 1771465493 + (((~((-1342275586) | i13)) | 94643456) * 576) + 1174797952))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((805294100 | i) * 140) + 299174424 + (((~(805294100 | i13)) | 96) * (-280)) + (((~(224841844 | i13)) | 580452352 | (~(i | (-97)))) * 140))};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    java.lang.Object obj14 = obj13;
                    if (obj13 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr25);
                        java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method5);
                        obj14 = method5;
                    }
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr24)).intValue();
                    c3 = 0;
                } else {
                    java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-201720881) | i13)) | (~(1029087231 | i))) * (-302)) + 1380476052 + ((~((-201720881) | i)) * (-604)) + (((~(827366351 | i)) | 826317638) * 302))};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    java.lang.Object obj16 = obj15;
                    if (obj15 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr28);
                        java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method6);
                        obj16 = method6;
                    }
                    c3 = 0;
                    ((int[]) objArr26[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr27)).intValue();
                    objArr8 = objArr26;
                }
                if (((int[]) objArr8[1])[c3] != i) {
                    return objArr8;
                }
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "쵾\ue1ab핣\u31e5簬㡡䘽巋踙뾨\uecde┽\udf1b\ud857猽ځ勪䍥㈾簜ᧉ舟㾹餲ố\ufbc7ᩧ辰쇴녥몲䙫㐟\uef30캧₮", "驩噆읰浳", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr29);
                java.lang.Object[] objArr30 = {((java.lang.String) objArr29[0]).intern()};
                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                java.lang.Object obj18 = obj17;
                if (obj17 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 37, 3162 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.View.resolveSize(0, 0) + 33099));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    e(bArr[22], bArr[14], (short) 612, objArr31);
                    java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr31[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, method7);
                    obj18 = method7;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr30)).longValue();
                long j7 = ~longValue3;
                long j8 = ~(j2 | (-87115712));
                long j9 = (521 * longValue3) + 45213054528L + (((~(longValue3 | j2)) | (~(j7 | 87115711 | j))) * 520) + (((~(j7 | j)) | j8) * (-1040)) + ((j8 | (~(j | 87115711)) | (~((-87115712) | j7))) * 520) + 1082550615;
                int i14 = ~(811290321 | i13);
                if (((((int) j9) & ((((((~((-1848449965) | i13)) | 740821672) | (~((-1009290922) | i13))) * (-1136)) - 1738041619) + (((~((-1848449965) | i)) | (~((-1009290922) | i)) | (~(2116919213 | i13))) * (-568)) + (((~(1848449964 | i13)) | (~(1009290921 | i13)) | (~((-740821673) | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) | (((int) (j9 >> 32)) & ((((269502464 | i14) * (-970)) - 686599744) + ((i14 | 541787857) * 970)))) != 0) {
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(497928024 | i13)) | 532207920) * (-1042)) + 1710092576 + ((497928024 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-532207921) | i)) | 497598736 | (~(532537208 | i13))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    java.lang.Object obj20 = obj19;
                    if (obj19 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr33);
                        java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method8);
                        obj20 = method8;
                    }
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr32)).intValue();
                    i11 = 0;
                } else {
                    java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-551180615) | i)) | (-478955331)) * (-318)) - 1772027520) + (((~((-478955331) | i)) | (~(1021206342 | i13))) * 318) + (((~((-470025729) | i13)) | (~(1021206342 | i))) * 318))};
                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    java.lang.Object obj22 = obj21;
                    if (obj21 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.getOffsetAfter("", 0));
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr36);
                        java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method9);
                        obj22 = method9;
                    }
                    i11 = 0;
                    ((int[]) objArr34[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr35)).intValue();
                    objArr9 = objArr34;
                }
                if (((int[]) objArr9[1])[i11] != i) {
                    return objArr9;
                }
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                b(new int[]{32, 42, 44, i11}, true, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr37);
                java.lang.Object[] objArr38 = {((java.lang.String) objArr37[i11]).intern()};
                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                java.lang.Object obj24 = obj23;
                if (obj23 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(i11) + 36, 3160 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i11), (char) (33098 - (android.widget.ExpandableListView.getPackedPositionForChild(i11, i11) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i11, i11) == 0L ? 0 : -1))));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    e(bArr2[22], bArr2[14], (short) 612, objArr39);
                    java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr39[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, method10);
                    obj24 = method10;
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr38)).longValue();
                long j10 = ~longValue4;
                long j11 = ~(j10 | 213552509);
                long j12 = (longValue4 * (-463)) + 99301916685L + (((~(j10 | j)) | j11 | (~(j | 213552509))) * 464) + (((-213552510) | j2 | j10) * (-464)) + ((j11 | (~(j2 | 213552509))) * 464) + 781882394;
                if (((((int) (j12 >> 32)) & ((((~((-104131948) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1801361414) + (((-34881795) | i13) * (-216)) + (((~((-104131948) | i13)) | 1541358358) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) | (((int) j12) & (((((~((-1283998505) | i)) | (~(1573742381 | i13))) * (-318)) - 1133716449) + (((~(1556701997 | i)) | android.R.string.fingerprint_dangling_notification_msg_1) * (-318)) + (((~((-1556701998) | i)) | (-1301038889)) * 318)))) != 0) {
                    java.lang.Object[] objArr40 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                    java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(125649625 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 305134584 + (((-813702439) | i13) * (-216)) + (((~(125649625 | i13)) | 904486319) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                    java.lang.Object obj26 = obj25;
                    if (obj25 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr42);
                        java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method11);
                        obj26 = method11;
                    }
                    ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr41)).intValue();
                    return objArr40;
                }
                java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-727721085) | i)) | 963008624) * 398) - 1493984864) + (((~((-727721085) | i13)) | 963008624) * 398))};
                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                java.lang.Object obj28 = obj27;
                if (obj27 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 50, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                    e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr45);
                    java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method12);
                    obj28 = method12;
                }
                ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr44)).intValue();
                return objArr43;
            }
            int i15 = i;
            try {
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "▣\ue558䂤‸⡲\uded8\ue488ヂ숁㳼\uf7bcﰼ엱ⶊ혈ᓉ\uf7bcꨶ虼껐ȉ܀㷱", "颭祝ע\ue7f4", (-486911592) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 1), objArr46);
                java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr46[0]).intern());
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "될杮⭧\uf052\uf6cb\ueb8eꋥꓬ䡒\ue9d0\ue6ec밫邏뿊", "醜\udd7f\uf8ee왛", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23543), objArr47);
                java.lang.String str2 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr47[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                java.lang.String str3 = "▣\ue558䂤‸⡲\uded8\ue488ヂ숁㳼\uf7bcﰼ엱ⶊ혈ᓉ\uf7bcꨶ虼껐ȉ܀㷱";
                ?? r22 = 0;
                r22 = 0;
                a("\u0000\u0000\u0000\u0000", "▣\ue558䂤‸⡲\uded8\ue488ヂ숁㳼\uf7bcﰼ엱ⶊ혈ᓉ\uf7bcꨶ虼껐ȉ܀㷱", "颭祝ע\ue7f4", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 486911592, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr48);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr48[0]).intern());
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                b(new int[]{74, 18, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 5}, false, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000", objArr49);
                java.lang.Object invoke = cls14.getMethod(((java.lang.String) objArr49[0]).intern(), null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str2);
                if (indexOf > 0) {
                    java.lang.String str4 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    int i16 = 16;
                    if (str4.length() >= 16) {
                        int i17 = 0;
                        str3 = "▣\ue558䂤‸⡲\uded8\ue488ヂ숁㳼\uf7bcﰼ엱ⶊ혈ᓉ\uf7bcꨶ虼껐ȉ܀㷱";
                        while (i17 <= str4.length() - i16) {
                            java.lang.Object[] objArr50 = {str4.substring(i17, i17 + 16), 931995};
                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj29 == null) {
                                str = str4;
                                num3 = num7;
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 29, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2594, (char) android.graphics.Color.red(0));
                                byte b = $$a[41];
                                num = num5;
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                e(b, b, b, objArr51);
                                java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr51[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                obj4 = method13;
                            } else {
                                str = str4;
                                num = num5;
                                num3 = num7;
                                obj4 = obj29;
                            }
                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr50)).longValue();
                            long j13 = ~longValue5;
                            java.lang.String str5 = intern4;
                            long j14 = i15;
                            int i18 = indexOf;
                            java.lang.Integer num8 = num6;
                            ?? r29 = ((-590) * longValue5) + 488714776464L + ((~(longValue5 | (-825531718))) * (-1182)) + (((~((-825531718) | j13 | (~j14))) | (~(longValue5 | 825531717))) * (-591)) + (((-825531718) | j14 | j13) * 591);
                            long j15 = r29 + 431568807;
                            int i19 = ~i15;
                            if (((((int) j15) & ((((~(14981960 | i19)) | (~(1452208370 | i19)) | (-1458502651)) * 464) + 734254405 + (((-6294281) | i15) * (-464)) + (((~(14981960 | i15)) | (-1458502651)) * 464))) | (((int) (j15 >> 32)) & ((((1437267371 | i15) * 376) - 2088991750) + (((~((-33640533) | i19)) | 20480) * (-376)) + (((~(33640532 | i15)) | 1470866943) * 376)))) == -725904754) {
                                objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r4, new int[1]};
                                java.lang.String str6 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                ((int[]) objArr6[0])[0] = i15;
                                ((int[]) objArr6[1])[0] = i15 ^ 20;
                                java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((324627317 | i15) * (-859)) + 270605150 + (((~(324627317 | i19)) | (~((-34152722) | i15))) * 859) + (((~((-705508628) | i19)) | 671355906) * 859))};
                                num4 = num8;
                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                java.lang.Object obj31 = obj30;
                                if (obj30 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr53);
                                    java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method14);
                                    obj31 = method14;
                                }
                                ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr52)).intValue();
                                java.lang.Integer num9 = num4;
                                i4 = i15;
                                objArr = objArr6;
                                num2 = num9;
                                c = 0;
                                if (((int[]) objArr[1])[c] != i4) {
                                    return objArr;
                                }
                                int[] iArr = new int[1];
                                int[] iArr2 = new int[1];
                                iArr[c] = i4;
                                iArr2[c] = i4;
                                java.lang.Object[] objArr54 = {iArr, iArr2, null, null, new int[1]};
                                int i20 = ~i4;
                                java.lang.Object[] objArr55 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((-977575793) | i20) * 1444) + 301326584 + (((~(735387548 | i4)) | (-1003855869) | (~(294748396 | i4))) * (-1444)) + 1435085280)};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                java.lang.Object obj33 = obj32;
                                if (obj32 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr56);
                                    java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr56[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method15);
                                    obj33 = method15;
                                }
                                ((int[]) objArr54[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr55)).intValue();
                                if (((int[]) objArr54[1])[0] != i4) {
                                    return objArr54;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    a("\u0000\u0000\u0000\u0000", "橙\ue18dꃶ\udc43噽｜ﾸ\ue223䅗熘⑨랦熎", "뀴\uf527⥣\udf24", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1677010864, (char) (android.view.View.getDefaultSize(0, 0) + 9257), objArr57);
                                    try {
                                        java.lang.Object[] objArr58 = {((java.lang.String) objArr57[0]).intern()};
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "▣\ue558䂤‸⡲\uded8\ue488ヂ숁㳼\uf7bcﰼ엱ⶊ혈ᓉ\uf7bcꨶ虼껐ȉ܀㷱", "颭祝ע\ue7f4", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 486911592, (char) (android.os.Process.myPid() >> 22), objArr59);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr59[0]).intern());
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        b(new int[]{165, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 2}, true, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", objArr60);
                                        java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr60[0]).intern(), java.lang.String.class).invoke(context, objArr58);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            b(new int[]{181, 37, 64, 27}, false, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", objArr61);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr61[0]).intern());
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "ꅪ\uf439\ue34c፦\u1af7涆\ue24f႐蔕쒖簟椁곱⡀\udc0f", "ࣂ鮧\ud95f洮", 1604036359 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (11993 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr62);
                                            java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr62[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 29, 86, 0}, true, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr63);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr63[0]).intern());
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "될杮⭧\uf052\uf6cb\ueb8eꋥꓬ䡒\ue9d0\ue6ec밫邏뿊", "醜\udd7f\uf8ee왛", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (23544 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr64);
                                                    java.lang.String str7 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr64[0]).intern(), null).invoke(next, null);
                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                    b(new int[]{181, 37, 64, 27}, false, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", objArr65);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr65[0]).intern());
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "ꟾꊠ쓱ᆻ浚親䝗எΦկ鲉ﺝ쬃\u2061郊\uee7f洺", "ȫ멧鏪게", (-356882686) - android.text.TextUtils.getOffsetAfter("", 0), (char) (35986 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr66);
                                                    if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr66[0]).intern(), java.lang.String.class).invoke(invoke2, str7)).booleanValue()) {
                                                        if (str7.length() >= 20) {
                                                            int i21 = 0;
                                                            for (int i22 = 20; i21 <= str7.length() - i22; i22 = 20) {
                                                                java.lang.Object[] objArr67 = {str7.substring(i21, i21 + 20), 931995};
                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                java.lang.Object obj35 = obj34;
                                                                if (obj34 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 28, android.view.Gravity.getAbsoluteGravity(0, 0) + 2594, (char) android.graphics.Color.red(0));
                                                                    byte b2 = $$a[41];
                                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                                    e(b2, b2, b2, objArr68);
                                                                    java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr68[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                    obj35 = method16;
                                                                }
                                                                long j16 = ~((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr67)).longValue();
                                                                long j17 = i4;
                                                                java.lang.Object obj36 = invoke2;
                                                                long j18 = ~j17;
                                                                java.util.Iterator it2 = it;
                                                                java.lang.String str8 = str7;
                                                                long j19 = ((r9 * (-978)) - 65249860200L) + ((~(j16 | j18)) * 979) + (((-66581490) | j17) * (-979)) + (((~(j18 | (-66581490))) | (~(j16 | j17))) * 979) + 1323682014;
                                                                if (((((int) (j19 >> 32)) & ((((~(1532804226 | i20)) | 77742677) * (-160)) + 555612554 + (((~(95577815 | i20)) | 1532804226) * 160))) | (((int) j19) & ((((~((-1247293447) | i4)) | (~((-27279369) | i20))) * 497) + 1329280758 + (((~((-1583168072) | i20)) | 335874625 | (~((-27279369) | i4))) * 497)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                    int i23 = ~(819368759 | i4);
                                                                    java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-9437458) | i20)) | (~(210767185 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 1910069928) + (((~((-210767186) | i20)) | i23) * (-1040)) + ((i23 | (~((-819368760) | i20)) | 201329728) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                    java.lang.Object obj38 = obj37;
                                                                    if (obj37 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr70);
                                                                        java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method17);
                                                                        obj38 = method17;
                                                                    }
                                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr69)).intValue();
                                                                    c2 = 0;
                                                                    if (((int[]) objArr5[1])[c2] != i4) {
                                                                        return objArr5;
                                                                    }
                                                                } else {
                                                                    i21++;
                                                                    invoke2 = obj36;
                                                                    it = it2;
                                                                    str7 = str8;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    invoke2 = invoke2;
                                                    it = it;
                                                }
                                            }
                                        }
                                        java.lang.Object[] objArr71 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(173291082 | i4)) | (-995524223)) * 305) + 1688986866 + (((~(173291082 | i20)) | (-856844863)) * 305))};
                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                        java.lang.Object obj40 = obj39;
                                        if (obj39 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                            e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr73);
                                            java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method18);
                                            obj40 = method18;
                                        }
                                        c2 = 0;
                                        ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr72)).intValue();
                                        objArr5 = objArr71;
                                        if (((int[]) objArr5[1])[c2] != i4) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause3 = th4.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th4;
                                    }
                                }
                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                b(new int[]{0, 12, 0, 0}, false, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", objArr74);
                                java.lang.Object[] objArr75 = {((java.lang.String) objArr74[0]).intern()};
                                java.lang.Integer num10 = num;
                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                java.lang.Object obj42 = obj41;
                                if (obj41 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 3161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.os.Process.myTid() >> 22) + 33099));
                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                    e(r6[41], (byte) (-$$a[52]), (short) 618, objArr76);
                                    java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr76[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, method19);
                                    obj42 = method19;
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, objArr75)).longValue();
                                long j20 = ~longValue6;
                                long j21 = i4;
                                long j22 = ~j21;
                                long j23 = ((46 * longValue6) - 52432250840L) + (((~(j20 | j22)) | (-1139831540)) * (-90)) + (((~(j20 | j21)) | (~(longValue6 | (-1139831540)))) * (-45)) + (((~((-1139831540) | j22)) | (~(1139831539 | j21)) | j20) * 45) + 2047302278;
                                if (((((int) j23) & (((354423809 | i4) * 988) + 429474581 + (((~((-1082507689) | i20)) | 1082212776) * (-1976)) + (((~(354718721 | i4)) | 354423809 | (~((-354718722) | i20))) * 988))) | (((int) (j23 >> 32)) & (((((~((-1220726251) | i4)) | 146965952) * 104) - 2005432166) + ((~(1290260458 | i20)) * (-104)) + ((216500160 | i4) * 104)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr77 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((409213506 | i20) * (-192)) + 1247741576 + (((~((-587302326) | i20)) | 33620113) * (-384)) + (((~((-33620114) | i4)) | (~((-553682213) | i20)) | (~(996515831 | i4))) * 192))};
                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                    java.lang.Object obj44 = obj43;
                                    if (obj43 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr78);
                                        java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method20);
                                        obj44 = method20;
                                    }
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr77)).intValue();
                                    i5 = 0;
                                } else {
                                    java.lang.Object[] objArr79 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-680465579) | i20)) | (-349670367)) | (~(680465578 | i4))) * (-564)) - 1379925512) + ((~((-340822869) | i4)) * 1128) + (((~((-349670367) | i20)) | (-1021288447)) * 564))};
                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                    java.lang.Object obj46 = obj45;
                                    if (obj45 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr81);
                                        java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method21);
                                        obj46 = method21;
                                    }
                                    i5 = 0;
                                    ((int[]) objArr79[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr80)).intValue();
                                    objArr2 = objArr79;
                                }
                                if (((int[]) objArr2[1])[i5] != i4) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                b(new int[]{12, 20, 117, i5}, true, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", objArr82);
                                java.lang.Object[] objArr83 = {((java.lang.String) objArr82[i5]).intern()};
                                java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                java.lang.Object obj48 = obj47;
                                if (obj47 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, android.text.TextUtils.getCapsMode("", 0, 0) + 3161, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33098));
                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                    e(r5[41], (byte) (-$$a[52]), (short) 618, objArr84);
                                    java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, method22);
                                    obj48 = method22;
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr83)).longValue();
                                long j24 = ~(1007040423 | longValue7);
                                long j25 = ~longValue7;
                                long j26 = ~(j25 | (-1007040424));
                                java.lang.Integer num11 = num2;
                                long j27 = 1914511162 + ((399 * longValue7) - 401809129176L) + ((j24 | j26 | (~(j25 | j21))) * 398) + ((longValue7 | (-1007040424)) * (-1194)) + ((j26 | j24 | (~(j25 | j22))) * 398);
                                int i24 = ~((-157241219) | i);
                                if (((((int) j27) & (((((~(1599056301 | i)) | 1258684584) * (-756)) - 1060206703) + ((1599056301 | i20) * 756))) | (((int) (j27 >> 32)) & ((((~((-1442881582) | i20)) | (~(1594467629 | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1792760618 + (((~((-1594467630) | i20)) | i24) * (-1040)) + ((i24 | (~(157241218 | i20)) | 151586048) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) != 0) {
                                    java.lang.Object[] objArr85 = {new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr86 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-509531659) | i20)) | 520604286) * (-602)) - 348490090) + (((~((-509531659) | i)) | 503759370 | (~(526376574 | i20))) * (-301)) + ((~(520604286 | i20)) * 301))};
                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                    java.lang.Object obj50 = obj49;
                                    if (obj49 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr87);
                                        java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr87[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method23);
                                        obj50 = method23;
                                    }
                                    ((int[]) objArr85[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr86)).intValue();
                                    i7 = 1;
                                    objArr3 = objArr85;
                                    i6 = 0;
                                } else {
                                    objArr3 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr88 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~((-554736165) | i20)) * 433) + 1532946774 + (((~((-441255388) | i)) | (-588880558)) * (-433)) + (((~((-588880558) | i)) | (-995991552)) * 433))};
                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                    java.lang.Object obj52 = obj51;
                                    if (obj51 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.Color.green(0) + 2713, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr89);
                                        java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method24);
                                        obj52 = method24;
                                    }
                                    i6 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr88)).intValue();
                                    i7 = 1;
                                }
                                if (((int[]) objArr3[i7])[i6] != i) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr90 = new java.lang.Object[i7];
                                a("\u0000\u0000\u0000\u0000", "쵾\ue1ab핣\u31e5簬㡡䘽巋踙뾨\uecde┽\udf1b\ud857猽ځ勪䍥㈾簜ᧉ舟㾹餲ố\ufbc7ᩧ辰쇴녥몲䙫㐟\uef30캧₮", "驩噆읰浳", android.text.TextUtils.indexOf("", "", i6), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr90);
                                java.lang.Object[] objArr91 = {((java.lang.String) objArr90[0]).intern()};
                                java.lang.Integer num12 = num3;
                                java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                java.lang.Object obj54 = obj53;
                                if (obj53 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3160, (char) (33098 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                    byte[] bArr3 = $$a;
                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                    e(bArr3[22], bArr3[14], (short) 612, objArr92);
                                    java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr92[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method25);
                                    obj54 = method25;
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, objArr91)).longValue();
                                long j28 = ~longValue8;
                                long j29 = j28 | 554890073;
                                long j30 = 440544830 + ((131 * longValue8) - 71580819417L) + ((~(j28 | j22 | 554890073)) * 130) + ((~j29) * (-260)) + (((~((-554890074) | longValue8)) | (~(j29 | j21))) * 130);
                                if (((((int) j30) & ((((((~((-1844190505) | i20)) | 745016616) | r3) * (-502)) - 1101039931) + (((~(2112724269 | i)) | (~((-1099173889) | i20))) * 502))) | (((int) (j30 >> 32)) & ((((~((-860256315) | i20)) | (~(576970096 | i))) * com.visa.cbp.getCertUsage.getODAData) + 1592196661 + (((~((-860256315) | i)) | (~(576970096 | i20))) * com.visa.cbp.getCertUsage.getODAData)))) != 0) {
                                    java.lang.Object[] objArr93 = {new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr94 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-101271570) | i20)) | (~((-286527525) | i))) | (~((-541065283) | i))) * 765) - 1358408769) + (((~((-387799094) | i20)) | 101271569) * 1530) + (((~((-387799094) | i)) | (~((-541065283) | i20))) * 765))};
                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                    java.lang.Object obj56 = obj55;
                                    if (obj55 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2713 - (android.os.Process.myPid() >> 22), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr95);
                                        java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr95[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method26);
                                        obj56 = method26;
                                    }
                                    ((int[]) objArr93[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr94)).intValue();
                                    i9 = 1;
                                    objArr4 = objArr93;
                                    i8 = 0;
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr96 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(39598265 | i)) | (-990537680)) * (-465)) + 1819935095 + (((~((-990537680) | i)) | 39598265) * 930) + (((-956450631) | i) * 465))};
                                    java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                    java.lang.Object obj58 = obj57;
                                    if (obj57 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr97);
                                        java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method27);
                                        obj58 = method27;
                                    }
                                    i8 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr96)).intValue();
                                    i9 = 1;
                                }
                                if (((int[]) objArr4[i9])[i8] != i) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr98 = new java.lang.Object[i9];
                                b(new int[]{32, 42, 44, i8}, i9, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr98);
                                java.lang.Object[] objArr99 = {((java.lang.String) objArr98[i8]).intern()};
                                java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                java.lang.Object obj60 = obj59;
                                if (obj59 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.Gravity.getAbsoluteGravity(i8, i8), (android.widget.ExpandableListView.getPackedPositionForGroup(i8) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i8) == 0L ? 0 : -1)) + 3161, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33099));
                                    byte[] bArr4 = $$a;
                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                    e(bArr4[22], bArr4[14], (short) 612, objArr100);
                                    java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr100[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method28);
                                    obj60 = method28;
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj60).invoke(null, objArr99)).longValue();
                                long j31 = ~((-890006733) | longValue9);
                                long j32 = ((-396) * longValue9) + 354222679336L + (((~(j22 | (-890006733))) | j31 | (~(j22 | longValue9))) * (-397)) + ((-397) * j31) + (((~((~longValue9) | 890006732)) | j21 | j31) * 397) + 105428171;
                                int i25 = ~(1369135622 | i);
                                if (((((int) (j32 >> 32)) & (((((~((-1509984790) | i)) | (~((-25166209) | i20))) * 497) - 1056564891) + (((~(97924586 | i20)) | (-1607909376) | (~((-25166209) | i))) * 497))) | (((int) j32) & (((153160265 | i25) * (-658)) + 1057054293 + ((i25 | 136314953) * 658)))) != 0) {
                                    java.lang.Object[] objArr101 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(848462505 | i)) | (-181673440)) * (-668)) + 256822444 + (((~((-181673440) | i)) | 848462505) * 1336) + (((-138681687) | i) * 668))};
                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                    java.lang.Object obj62 = obj61;
                                    if (obj61 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                        e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr103);
                                        java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method29);
                                        obj62 = method29;
                                    }
                                    ((int[]) objArr101[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr102)).intValue();
                                    return objArr101;
                                }
                                java.lang.Object[] objArr104 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                int i26 = ~(120492849 | i);
                                java.lang.Object[] objArr105 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-103285010) | i20)) | (~(i | 909643095))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 928596552) + (((~((-909643096) | i20)) | i26) * (-1040)) + (((~(i20 | (-120492850))) | 806358086 | i26) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                java.lang.Object obj64 = obj63;
                                if (obj63 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr106);
                                    java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr106[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method30);
                                    obj64 = method30;
                                }
                                ((int[]) objArr104[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj64).invoke(null, objArr105)).intValue();
                                return objArr104;
                            }
                            i17++;
                            num6 = num8;
                            str4 = str;
                            num7 = num3;
                            num5 = num;
                            intern4 = str5;
                            indexOf = i18;
                            i16 = 16;
                            r22 = str;
                            str3 = r29;
                        }
                    }
                    int i27 = indexOf;
                    java.lang.String str9 = intern4;
                    num = num5;
                    java.lang.Integer num13 = num6;
                    num3 = num7;
                    java.lang.String str10 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    if (str10.length() >= 6) {
                        int i28 = 0;
                        num13 = num13;
                        str3 = str3;
                        while (i28 <= str10.length() - 6) {
                            java.lang.Object[] objArr107 = {str10.substring(i28, i28 + 6), 931995};
                            java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            java.lang.Object obj66 = obj65;
                            if (obj65 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.indexOf("", ""), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2594, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                byte b3 = $$a[41];
                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                e(b3, b3, b3, objArr108);
                                java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr108[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                obj66 = method31;
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr107)).longValue();
                            long j33 = i15;
                            long j34 = ~j33;
                            java.lang.Integer num14 = num13;
                            long j35 = ~longValue10;
                            long j36 = ~(j33 | j35 | 692725550);
                            java.lang.String str11 = str10;
                            int i29 = i28;
                            ?? r292 = ((-712) * longValue10) + 494606042700L + (((~(j34 | (-692725551))) | (~(longValue10 | (-692725551))) | j36) * (-713)) + (j36 * 1426) + ((~(j35 | j34)) * 713);
                            long j37 = r292 + 564374974;
                            int i30 = ~i15;
                            int i31 = (-878888099) | i30;
                            if (((((int) j37) & ((((1025054193 | i15) * 140) - 1811492499) + (((~(1025054193 | i30)) | 1076133892) * (-280)) + (((~(1832686692 | i30)) | 268501393 | (~((-1076133893) | i15))) * 140))) | (((int) (j37 >> 32)) & ((((~i31) | (-1978852787)) * (-828)) + 1754752898 + (i31 * (-828)) + 1869872120))) == -2096167706) {
                                objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r4, new int[1]};
                                java.lang.String str12 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                ((int[]) objArr6[0])[0] = i15;
                                ((int[]) objArr6[1])[0] = i15 ^ 20;
                                java.lang.Object[] objArr109 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((-1008098951) | i30) * 1444) + 301326584 + (((~(11412867 | i15)) | (-1019117448) | (~(1018723077 | i15))) * (-1444)) + 1997968876)};
                                num4 = num14;
                                java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                java.lang.Object obj68 = obj67;
                                if (obj67 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                    e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr110);
                                    java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method32);
                                    obj68 = method32;
                                }
                                ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj68).invoke(null, objArr109)).intValue();
                                java.lang.Integer num92 = num4;
                                i4 = i15;
                                objArr = objArr6;
                                num2 = num92;
                                c = 0;
                                if (((int[]) objArr[1])[c] != i4) {
                                }
                            } else {
                                num13 = num14;
                                i28 = i29 + 1;
                                str10 = str11;
                                str3 = r292;
                            }
                        }
                    }
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).substring(0, i27);
                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "Ꝛ", "㴝똉ꈕ莤", android.text.TextUtils.getOffsetAfter("", 0) + 364251453, (char) (42146 - android.graphics.Color.blue(0)), objArr111);
                    int i32 = 0;
                    java.lang.String[] split = substring.split(((java.lang.String) objArr111[0]).intern());
                    ?? length = split.length;
                    int i33 = 0;
                    ?? r8 = num13;
                    int i34 = r22;
                    java.lang.String str13 = str3;
                    while (i33 < length) {
                        java.lang.String str14 = split[i33];
                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                        b(new int[]{92, 3, i32, 3}, true, "\u0001\u0001\u0001", objArr112);
                        if (str14.split(((java.lang.String) objArr112[i32]).intern()).length > 1) {
                            int size = 48 - android.view.View.MeasureSpec.getSize(i32);
                            int keyRepeatTimeout = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1581;
                            r25 = android.os.SystemClock.elapsedRealtimeNanos();
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(size, keyRepeatTimeout, (char) (1 - (r25 > 0 ? 1 : (r25 == 0 ? 0 : -1)))))) {
                                r7 = 16;
                                try {
                                    try {
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        b(new int[]{95, 16, 42, 6}, true, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000", objArr113);
                                        intern = ((java.lang.String) objArr113[0]).intern();
                                        try {
                                            try {
                                                java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                a("\u0000\u0000\u0000\u0000", "ꕅ蹵", "䘀읐ࡁ\ue447", android.text.TextUtils.indexOf("", "", 0), (char) (18184 - android.view.KeyEvent.getDeadChar(0, 0)), objArr114);
                                                exec = runtime.exec(((java.lang.String) objArr114[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                            } catch (java.lang.Exception unused) {
                                            }
                                        } catch (java.lang.Exception unused2) {
                                        }
                                    } catch (java.io.IOException unused3) {
                                    }
                                } catch (java.io.IOException unused4) {
                                    r25 = split;
                                    str13 = length;
                                }
                                try {
                                    java.lang.Object[] objArr115 = {exec.getInputStream()};
                                    java.lang.Object obj69 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                    if (obj69 == null) {
                                        try {
                                            r25 = split;
                                            str13 = length;
                                            try {
                                                java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.getDefaultSize(0, 0), 1508 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""))).getDeclaredConstructor(java.io.InputStream.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                obj = declaredConstructor;
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                                th = th;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                        }
                                    } else {
                                        r25 = split;
                                        str13 = length;
                                        obj = obj69;
                                    }
                                    try {
                                        java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj).newInstance(objArr115);
                                        try {
                                            try {
                                                java.lang.Object[] objArr116 = {exec.getErrorStream()};
                                                java.lang.Object obj70 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                if (obj70 == null) {
                                                    try {
                                                        i34 = i33;
                                                        try {
                                                            java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1507, (char) android.graphics.Color.blue(0))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                            obj2 = declaredConstructor2;
                                                        } catch (java.lang.Throwable th7) {
                                                            th = th7;
                                                            th2 = th;
                                                            cause2 = th2.getCause();
                                                            if (cause2 == null) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        th = th8;
                                                    }
                                                } else {
                                                    i34 = i33;
                                                    obj2 = obj70;
                                                }
                                                try {
                                                    newInstance = ((java.lang.reflect.Constructor) obj2).newInstance(objArr116);
                                                } catch (java.lang.Throwable th9) {
                                                    th = th9;
                                                    th2 = th;
                                                    cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (java.lang.Throwable th10) {
                                                th = th10;
                                            }
                                        } catch (java.io.IOException unused5) {
                                            r7 = r8;
                                            i34 = i33;
                                            r25 = r25;
                                            str13 = str13;
                                            r8 = i15;
                                            i33 = i34 + 1;
                                            i15 = r8;
                                            split = r25;
                                            length = str13;
                                            r8 = r7;
                                            i32 = 0;
                                            i34 = i34;
                                            str13 = str13;
                                        } catch (java.lang.Exception unused6) {
                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                            b(new int[]{137, 27, 58, 23}, false, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr117);
                                            throw new java.io.IOException(((java.lang.String) objArr117[0]).intern());
                                        }
                                        try {
                                            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                            try {
                                                java.lang.Class<?> cls39 = java.lang.Class.forName(str9);
                                                java.lang.Integer num15 = r8;
                                                try {
                                                    try {
                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                        try {
                                                            b(new int[]{127, 5, 0, 0}, true, "\u0000\u0000\u0001\u0001\u0001", objArr118);
                                                            cls39.getMethod(((java.lang.String) objArr118[0]).intern(), null).invoke(newInstance2, null);
                                                            try {
                                                                java.lang.Class<?> cls40 = java.lang.Class.forName(str9);
                                                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                b(new int[]{127, 5, 0, 0}, true, "\u0000\u0000\u0001\u0001\u0001", objArr119);
                                                                cls40.getMethod(((java.lang.String) objArr119[0]).intern(), null).invoke(newInstance, null);
                                                                try {
                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                    sb.append(intern);
                                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                    b(new int[]{132, 1, 0, 0}, false, "\u0000", objArr120);
                                                                    sb.append(((java.lang.String) objArr120[0]).intern());
                                                                    java.lang.String obj71 = sb.toString();
                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                    a("\u0000\u0000\u0000\u0000", "哛툕ű\uda12벃", "戺ᰚ⽥啄", android.view.KeyEvent.normalizeMetaState(0) + 1696340578, (char) (android.graphics.Color.alpha(0) + 17455), objArr121);
                                                                    dataOutputStream.write(obj71.getBytes(((java.lang.String) objArr121[0]).intern()));
                                                                    dataOutputStream.flush();
                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                    a("\u0000\u0000\u0000\u0000", "㏆擤\uf235좌擲", "꠴㠧䐅툭", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 87566248, (char) (11588 - android.graphics.Color.blue(0)), objArr122);
                                                                    java.lang.String intern5 = ((java.lang.String) objArr122[0]).intern();
                                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                    a("\u0000\u0000\u0000\u0000", "哛툕ű\uda12벃", "戺ᰚ⽥啄", 1696340578 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17455), objArr123);
                                                                    dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr123[0]).intern()));
                                                                    dataOutputStream.flush();
                                                                    try {
                                                                        long nanoTime = java.lang.System.nanoTime();
                                                                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                        while (true) {
                                                                            try {
                                                                                exec.exitValue();
                                                                                obj3 = invoke;
                                                                                process = exec;
                                                                                break;
                                                                            } catch (java.lang.IllegalThreadStateException unused7) {
                                                                                if (nanos > 0) {
                                                                                    try {
                                                                                        process = exec;
                                                                                        try {
                                                                                            try {
                                                                                                java.lang.Object[] objArr124 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                java.lang.Class<?> cls41 = java.lang.Class.forName(str9);
                                                                                                obj3 = invoke;
                                                                                                try {
                                                                                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                    a("\u0000\u0000\u0000\u0000", "\u0a0bې쇮帢汴", "鮧Ń➈封", (-2013183076) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (295 - android.graphics.Color.red(0)), objArr125);
                                                                                                    cls41.getMethod(((java.lang.String) objArr125[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr124);
                                                                                                } catch (java.lang.Throwable th11) {
                                                                                                    th = th11;
                                                                                                    java.lang.Throwable th12 = th;
                                                                                                    java.lang.Throwable cause4 = th12.getCause();
                                                                                                    if (cause4 != null) {
                                                                                                        throw cause4;
                                                                                                    }
                                                                                                    throw th12;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th13) {
                                                                                                th = th13;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e) {
                                                                                            e = e;
                                                                                            interruptedException = e;
                                                                                            try {
                                                                                                throw interruptedException;
                                                                                            } catch (java.lang.Throwable th14) {
                                                                                                th = th14;
                                                                                                th3 = th;
                                                                                                try {
                                                                                                    process.destroy();
                                                                                                    throw th3;
                                                                                                } catch (java.lang.Exception unused8) {
                                                                                                    throw th3;
                                                                                                }
                                                                                            }
                                                                                        } catch (java.lang.Throwable th15) {
                                                                                            th = th15;
                                                                                            th3 = th;
                                                                                            process.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e2) {
                                                                                        e = e2;
                                                                                        process = exec;
                                                                                    } catch (java.lang.Throwable th16) {
                                                                                        th = th16;
                                                                                        process = exec;
                                                                                    }
                                                                                } else {
                                                                                    obj3 = invoke;
                                                                                    process = exec;
                                                                                }
                                                                                try {
                                                                                    long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                    if (nanos2 > 0) {
                                                                                        nanos = nanos2;
                                                                                        invoke = obj3;
                                                                                        exec = process;
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e3) {
                                                                                    e = e3;
                                                                                    interruptedException = e;
                                                                                    throw interruptedException;
                                                                                } catch (java.lang.Throwable th17) {
                                                                                    th = th17;
                                                                                    th3 = th;
                                                                                    process.destroy();
                                                                                    throw th3;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e4) {
                                                                                interruptedException = e4;
                                                                                process = exec;
                                                                                throw interruptedException;
                                                                            } catch (java.lang.Throwable th18) {
                                                                                th3 = th18;
                                                                                process = exec;
                                                                                process.destroy();
                                                                                throw th3;
                                                                            }
                                                                        }
                                                                    } catch (java.lang.InterruptedException e5) {
                                                                        e = e5;
                                                                        process = exec;
                                                                    } catch (java.lang.Throwable th19) {
                                                                        th = th19;
                                                                        process = exec;
                                                                    }
                                                                } catch (java.io.IOException unused9) {
                                                                    r8 = i;
                                                                } catch (java.lang.Exception unused10) {
                                                                }
                                                                try {
                                                                    try {
                                                                        dataOutputStream.close();
                                                                    } catch (java.io.IOException unused11) {
                                                                    }
                                                                    try {
                                                                        try {
                                                                            java.lang.Class<?> cls42 = java.lang.Class.forName(str9);
                                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                            b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 4, 0, 0}, true, "\u0000\u0001\u0000\u0001", objArr126);
                                                                            cls42.getMethod(((java.lang.String) objArr126[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 100L);
                                                                            try {
                                                                                java.lang.Class<?> cls43 = java.lang.Class.forName(str9);
                                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 4, 0, 0}, true, "\u0000\u0001\u0000\u0001", objArr127);
                                                                                cls43.getMethod(((java.lang.String) objArr127[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 10L);
                                                                                try {
                                                                                    process.destroy();
                                                                                } catch (java.io.IOException unused12) {
                                                                                    r8 = i;
                                                                                    r7 = num15;
                                                                                    invoke = obj3;
                                                                                } catch (java.lang.Exception unused13) {
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, 1507 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                                                        byte[] bArr5 = $$a;
                                                                                        byte b4 = bArr5[18];
                                                                                        byte b5 = bArr5[41];
                                                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                        e(b4, b5, (short) (b5 | 650), objArr128);
                                                                                        sb2.append(cls44.getField((java.lang.String) objArr128[0]).get(newInstance2).toString());
                                                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1507, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                                                        byte b6 = bArr5[18];
                                                                                        byte b7 = bArr5[41];
                                                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                        e(b6, b7, (short) (b7 | 650), objArr129);
                                                                                        sb2.append(cls45.getField((java.lang.String) objArr129[0]).get(newInstance).toString());
                                                                                        java.lang.String obj72 = sb2.toString();
                                                                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                                        b(new int[]{132, 1, 0, 0}, false, "\u0000", objArr130);
                                                                                        java.lang.String[] split2 = obj72.split(((java.lang.String) objArr130[0]).intern());
                                                                                        int length2 = split2.length;
                                                                                        int i35 = 0;
                                                                                        while (i35 < length2) {
                                                                                            java.lang.String str15 = split2[i35];
                                                                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                                            a("\u0000\u0000\u0000\u0000", "\uf831대쟗㲑崷搉ᣉ앟汚엱챨禈\uebd6龖썎炛ˍ屉玏", "顀\uf120\uf746\uf565", 1190207640 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (26103 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr131);
                                                                                            if (!str15.startsWith(((java.lang.String) objArr131[0]).intern())) {
                                                                                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                                                a("\u0000\u0000\u0000\u0000", "役鈶\uf35cἫ솲䩄筪ꔂ⎍\ud87d蝰審\uea85龿쓽\uf5f4\uea43햧ꩦ㴎", "\udd46ḏ驀霺", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr132);
                                                                                                if (str15.startsWith(((java.lang.String) objArr132[0]).intern())) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                                                    a("\u0000\u0000\u0000\u0000", "\u0eea\u0d99伳꼍侷呦⃀彰", "瓜蝡\u0fea⍀", android.graphics.Color.red(0), (char) android.view.View.combineMeasuredStates(0, 0), objArr133);
                                                                                                    if (str15.startsWith(((java.lang.String) objArr133[0]).intern())) {
                                                                                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                                                        b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 1, 66, 0}, false, "\u0000", objArr134);
                                                                                                        java.lang.String[] split3 = str15.split(((java.lang.String) objArr134[0]).intern());
                                                                                                        if (split3.length > 1 && split3[1].equalsIgnoreCase(str14)) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i35++;
                                                                                            obj3 = obj3;
                                                                                            num15 = num15;
                                                                                        }
                                                                                    } catch (java.io.IOException unused14) {
                                                                                    }
                                                                                    r8 = i;
                                                                                    invoke = obj3;
                                                                                    r7 = num15;
                                                                                } catch (java.lang.Exception unused15) {
                                                                                    java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                                                    b(new int[]{137, 27, 58, 23}, false, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr1172);
                                                                                    throw new java.io.IOException(((java.lang.String) objArr1172[0]).intern());
                                                                                }
                                                                            } catch (java.lang.Throwable th20) {
                                                                                java.lang.Throwable cause5 = th20.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th20;
                                                                            }
                                                                        } catch (java.lang.Throwable th21) {
                                                                            java.lang.Throwable cause6 = th21.getCause();
                                                                            if (cause6 != null) {
                                                                                throw cause6;
                                                                            }
                                                                            throw th21;
                                                                        }
                                                                    } catch (java.lang.InterruptedException e6) {
                                                                        interruptedException = e6;
                                                                        throw interruptedException;
                                                                    } catch (java.lang.Throwable th22) {
                                                                        th3 = th22;
                                                                        process.destroy();
                                                                        throw th3;
                                                                    }
                                                                } catch (java.lang.InterruptedException e7) {
                                                                    interruptedException = e7;
                                                                    throw interruptedException;
                                                                } catch (java.lang.Throwable th23) {
                                                                    th3 = th23;
                                                                    process.destroy();
                                                                    throw th3;
                                                                }
                                                            } catch (java.lang.Throwable th24) {
                                                                java.lang.Throwable cause7 = th24.getCause();
                                                                if (cause7 != null) {
                                                                    throw cause7;
                                                                }
                                                                throw th24;
                                                            }
                                                        } catch (java.lang.Throwable th25) {
                                                            th = th25;
                                                            java.lang.Throwable th26 = th;
                                                            java.lang.Throwable cause8 = th26.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th26;
                                                        }
                                                    } catch (java.lang.Throwable th27) {
                                                        th = th27;
                                                    }
                                                } catch (java.lang.Throwable th28) {
                                                    th = th28;
                                                }
                                            } catch (java.lang.Throwable th29) {
                                                th = th29;
                                            }
                                        } catch (java.io.IOException unused16) {
                                            r7 = r8;
                                            i34 = i34;
                                            r25 = r25;
                                            str13 = str13;
                                            r8 = i15;
                                            i33 = i34 + 1;
                                            i15 = r8;
                                            split = r25;
                                            length = str13;
                                            r8 = r7;
                                            i32 = 0;
                                            i34 = i34;
                                            str13 = str13;
                                        } catch (java.lang.Exception unused17) {
                                            java.lang.Object[] objArr11722 = new java.lang.Object[1];
                                            b(new int[]{137, 27, 58, 23}, false, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr11722);
                                            throw new java.io.IOException(((java.lang.String) objArr11722[0]).intern());
                                        }
                                    } catch (java.lang.Throwable th30) {
                                        th = th30;
                                        th = th;
                                        cause = th.getCause();
                                        if (cause == null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th31) {
                                    th = th31;
                                }
                            }
                        } else {
                            r25 = split;
                            str13 = length;
                            r7 = r8;
                            i34 = i33;
                            r8 = i15;
                        }
                        i33 = i34 + 1;
                        i15 = r8;
                        split = r25;
                        length = str13;
                        r8 = r7;
                        i32 = 0;
                        i34 = i34;
                        str13 = str13;
                    }
                    num2 = r8;
                    i4 = i15;
                } else {
                    i4 = i15;
                    num = num5;
                    num2 = num6;
                    num3 = num7;
                }
                objArr = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                int i36 = ~i4;
                java.lang.Object[] objArr135 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((937393798 | i36) * (-369)) - 1101790064) + (((~((-396327559) | i36)) | 633808386) * (-369)) + (((~(i36 | (-303585413))) | (~(396327558 | i4)) | 541066240) * 369))};
                java.lang.Object obj73 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                java.lang.Object obj74 = obj73;
                if (obj73 == null) {
                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2714 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1));
                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                    e((byte) 34, (byte) (-$$a[52]), (short) 653, objArr136);
                    java.lang.reflect.Method method33 = cls46.getMethod((java.lang.String) objArr136[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method33);
                    obj74 = method33;
                }
                c = 0;
                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj74).invoke(null, objArr135)).intValue();
                if (((int[]) objArr[1])[c] != i4) {
                }
            } catch (java.lang.Throwable th32) {
                java.lang.Throwable cause9 = th32.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th32;
            }
        } catch (java.lang.Throwable th33) {
            java.lang.Throwable cause10 = th33.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th33;
        }
    }
}
