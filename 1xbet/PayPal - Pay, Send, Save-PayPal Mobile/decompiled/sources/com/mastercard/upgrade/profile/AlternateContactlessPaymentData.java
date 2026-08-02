package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class AlternateContactlessPaymentData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static char valueOf;
    private static char values;
    private static char writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    private com.payair.hce.isUiContext mAid;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    private com.payair.hce.isUiContext mCiacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    private com.payair.hce.isUiContext mCvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    private com.payair.hce.isUiContext mGpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    private com.payair.hce.isUiContext mPaymentFci;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 39 - (i * 2);
        byte[] bArr = $$a;
        int i5 = 718 - s;
        char[] cArr = new char[i2 + 1];
        if (bArr == null) {
            int i6 = i4;
            i5 = i2;
            int i7 = 0;
            i5 = (i5 + i4) - 2;
            i4 = i6;
            i3 = i7;
            cArr[i3] = (char) i5;
            int i8 = i4 + 1;
            i7 = i3 + 1;
            if (i3 == i2) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = i8;
            i4 = bArr[i8];
            i5 = (i5 + i4) - 2;
            i4 = i6;
            i3 = i7;
            cArr[i3] = (char) i5;
            int i82 = i4 + 1;
            i7 = i3 + 1;
            if (i3 == i2) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i5;
            int i822 = i4 + 1;
            i7 = i3 + 1;
            if (i3 == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (i * 3);
        byte[] bArr = $$d;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i3 = i4;
            i2 = 0;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = b + 107;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public final com.payair.hce.isUiContext getPaymentFci() {
        int i = (IccPrivateKeyCrtComponentsJson + 17) % 128;
        getAid = i;
        com.payair.hce.isUiContext isuicontext = this.mPaymentFci;
        IccPrivateKeyCrtComponentsJson = (i + 43) % 128;
        return isuicontext;
    }

    public final void setPaymentFci(com.payair.hce.isUiContext isuicontext) {
        int i = (getAid + 113) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        this.mPaymentFci = isuicontext;
        getAid = (i + 37) % 128;
    }

    public final com.payair.hce.isUiContext getGpoResponse() {
        int i = (IccPrivateKeyCrtComponentsJson + 53) % 128;
        getAid = i;
        com.payair.hce.isUiContext isuicontext = this.mGpoResponse;
        int i2 = i + 55;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return isuicontext;
        }
        throw null;
    }

    public final void setGpoResponse(com.payair.hce.isUiContext isuicontext) {
        int i = getAid + 107;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            this.mGpoResponse = isuicontext;
        } else {
            this.mGpoResponse = isuicontext;
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getCvrMaskAnd() {
        int i = getAid + 11;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.isUiContext isuicontext = this.mCvrMaskAnd;
        if (i % 2 != 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setCvrMaskAnd(com.payair.hce.isUiContext isuicontext) {
        int i = (getAid + 39) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        this.mCvrMaskAnd = isuicontext;
        getAid = (i + 55) % 128;
    }

    public final com.payair.hce.isUiContext getAid() {
        int i = (getAid + 85) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        com.payair.hce.isUiContext isuicontext = this.mAid;
        int i2 = i + 87;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setAid(com.payair.hce.isUiContext isuicontext) {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 63;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            this.mAid = isuicontext;
            int i3 = i + 111;
            getAid = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.mAid = isuicontext;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.isUiContext getCiacDecline() {
        int i = getAid + 71;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return this.mCiacDecline;
        }
        throw null;
    }

    public final void setCiacDecline(com.payair.hce.isUiContext isuicontext) {
        int i = IccPrivateKeyCrtComponentsJson;
        getAid = (i + 97) % 128;
        this.mCiacDecline = isuicontext;
        getAid = (i + 113) % 128;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 35) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        byte b = 0;
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        int i2 = $11 + 17;
        $10 = i2 % 128;
        int i3 = i2 % 2;
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[b] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 97) % 128;
            int i4 = 58224;
            int i5 = b;
            while (i5 < 16) {
                $10 = ($11 + 119) % 128;
                char c = cArr4[1];
                char c2 = cArr4[b];
                char c3 = (char) (writeReplace ^ 2144259807102049818L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(DigitizedCardProfile);
                    objArr2[2] = java.lang.Integer.valueOf(c2 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + c3));
                    objArr2[b] = java.lang.Integer.valueOf(c);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 62, 1335 - android.graphics.Color.green((int) b), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(b)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 3, b, b, objArr3);
                        java.lang.String str2 = (java.lang.String) objArr3[b];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[4];
                        clsArr[b] = java.lang.Integer.TYPE;
                        clsArr[1] = java.lang.Integer.TYPE;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str2, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[b]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i6 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1336, (char) android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((byte) 3, (byte) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                    i5++;
                    b = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3543 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            b = 0;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = ($10 + 71) % 128;
        $11 = i2;
        byte[] bArr = str2;
        if (str2 != null) {
            $10 = (i2 + 71) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = 2;
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = AlternateContactlessPaymentDataJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 1;
                $10 = i10 % 128;
                if (i10 % i6 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i3] = java.lang.Integer.valueOf(cArr[i9]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.red(i3), 2807 - android.graphics.Color.red(i3), (char) android.view.View.combineMeasuredStates(i3, i3));
                            byte b = (byte) ($$e & 11);
                            byte b2 = (byte) (b - 2);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(b, b2, b2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i9])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, android.graphics.Color.red(0) + 2807, (char) android.view.View.MeasureSpec.getSize(0));
                        byte b3 = (byte) ($$e & 11);
                        byte b4 = (byte) (b3 - 2);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i9++;
                }
                i3 = 0;
                i6 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            $10 = ($11 + 7) % 128;
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            $11 = ($10 + 63) % 128;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2836, (char) (android.os.Process.myPid() >> 22));
                        byte b5 = (byte) ($$d[0] - 1);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d(b5, b5, b5, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777259, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2880, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte length2 = (byte) $$d.length;
                        byte b6 = (byte) (length2 - 4);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        d(length2, b6, b6, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i13);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i14 = $11 + 69;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr6[getaccounttype.writeReplace] = cArr3[i5 << getaccounttype.writeReplace];
                    i = getaccounttype.writeReplace;
                } else {
                    cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            $10 = ($11 + 103) % 128;
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i16 = $10 + 79;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    int i17 = getaccounttype.writeReplace;
                    throw new java.lang.ArithmeticException();
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i15 = getaccounttype.writeReplace + 1;
            }
        }
        java.lang.String str3 = new java.lang.String(cArr3);
        $10 = ($11 + 117) % 128;
        objArr[0] = str3;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf = (char) 38171;
        values = (char) 3234;
        writeReplace = (char) 51460;
        DigitizedCardProfile = (char) 42186;
        AlternateContactlessPaymentDataJson = new char[]{16889, 16800, 16805, 16802, 16829, 16796, 16768, 16807, 16802, 16829, 16824, 16824, 16799, 16772, 16810, 16812, 16806, 16831, 16807, 16812, 16893, 16808, 16802, 16788, 16790, 16830, 16800, 16804, 16808, 16812, 16804, 16800, 16802, 16800, 16789, 16789, 16804, 16804, 16889, 16804, 16804, 16789, 16789, 16800, 16802, 16800, 16804, 16812, 16808, 16804, 16800, 16830, 16790, 16889, 16771, 16800, 16769, 16799, 16831, 16807, 16802, 16831, 16800, 16807, 16774, 16775, 16808, 16802, 16830, 16805, 16807, 16809, 16891, 16806, 16830, 16830, 16790, 16786, 16829, 16817, 16719, 16796, 16730, 16620, 16860, 16892, 16889, 16881, 16800, 16830, 16830, 16684, 16685, 16685, 16828, 16703, 16589, 16582, 16584, 16588, 16686, 16678, 16577, 16683, 16657, 16582, 16583, 16591, 16582, 16580, 16686, 16656, 16656, 16680, 16577, 16576, 16585, 16588, 16580, 16607, 16672, 16886, 16806, 16812, 16809, 16808, 16810, 16808, 16769, 16768, 16807, 16800, 16771, 16772, 16805, 16801, 16805, 16807, 16806, 16775, 16851, 16817, 16698, 16674, 16702, 16701, 16699, 16675, 16678, 16676, 16674, 16699, 16701, 16676, 16892, 16807, 16814, 16786, 16805, 16826, 16801, 16808, 16810, 16808, 16808, 16802, 16813, 16808, 16824, 16829, 16887, 16805, 16808, 16810, 16809, 16809, 16793, 16813, 16800, 16808, 16804, 16803, 16785, 16788, 16810, 16808, 16801, 16803, 16794, 16887, 16768, 16805, 16805, 16806, 16812, 16777, 16769, 16830, 16806, 16777, 16775, 16808, 16802, 16830, 16805, 16807, 16809, 16887, 16830, 16805, 16805, 16806, 16796, 16797, 16803, 16801, 16800, 16805, 16796, 16788, 16802, 16808, 16792, 16764, 16762, 16760, 16757, 16761, 16767, 16730, 16733, 16762, 16759, 16754, 16761, 16762, 16754, 16722, 16717, 16746, 16759, 16759, 16756, 16759, 16762, 16762, 16754, 16738, 16748, 16764, 16762, 16880, 16719, 16826, 16826, 16717, 16819, 16820, 16819, 16821, 16803, 16824, 16715, 16818, 16816, 16802, 16805, 16717};
    }

    static void init$1() {
        $$d = new byte[]{1, 58, com.google.common.base.Ascii.FF, Byte.MIN_VALUE};
        $$e = 54;
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 106, 0, 124, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 135;
    }

    /* JADX WARN: Code restructure failed: missing block: B:351:0x1277, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x1284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x1285, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x127c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x127d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x170e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x170f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1bff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x13b6 A[Catch: IOException -> 0x1520, all -> 0x1627, TryCatch #5 {, blocks: (B:302:0x0fdc, B:304:0x0ff6, B:307:0x1001, B:316:0x1082, B:321:0x10e2, B:334:0x113d, B:337:0x118d, B:338:0x1191, B:359:0x12fb, B:361:0x1305, B:363:0x139b, B:365:0x13b6, B:367:0x13d7, B:369:0x13f4, B:371:0x1414, B:373:0x1432, B:399:0x1606, B:400:0x1626, B:425:0x1581, B:426:0x1584, B:511:0x15a1, B:513:0x15ae, B:514:0x15af, B:519:0x15c3, B:521:0x15c9, B:522:0x15ca, B:534:0x15d4, B:536:0x15da, B:537:0x15db, B:549:0x15e9, B:551:0x15ef, B:552:0x15f0), top: B:301:0x0fdc }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x15c9 A[Catch: Exception -> 0x1606, all -> 0x1627, IOException -> 0x162e, TryCatch #5 {, blocks: (B:302:0x0fdc, B:304:0x0ff6, B:307:0x1001, B:316:0x1082, B:321:0x10e2, B:334:0x113d, B:337:0x118d, B:338:0x1191, B:359:0x12fb, B:361:0x1305, B:363:0x139b, B:365:0x13b6, B:367:0x13d7, B:369:0x13f4, B:371:0x1414, B:373:0x1432, B:399:0x1606, B:400:0x1626, B:425:0x1581, B:426:0x1584, B:511:0x15a1, B:513:0x15ae, B:514:0x15af, B:519:0x15c3, B:521:0x15c9, B:522:0x15ca, B:534:0x15d4, B:536:0x15da, B:537:0x15db, B:549:0x15e9, B:551:0x15ef, B:552:0x15f0), top: B:301:0x0fdc }] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x15ca A[Catch: Exception -> 0x1606, all -> 0x1627, IOException -> 0x162e, TryCatch #5 {, blocks: (B:302:0x0fdc, B:304:0x0ff6, B:307:0x1001, B:316:0x1082, B:321:0x10e2, B:334:0x113d, B:337:0x118d, B:338:0x1191, B:359:0x12fb, B:361:0x1305, B:363:0x139b, B:365:0x13b6, B:367:0x13d7, B:369:0x13f4, B:371:0x1414, B:373:0x1432, B:399:0x1606, B:400:0x1626, B:425:0x1581, B:426:0x1584, B:511:0x15a1, B:513:0x15ae, B:514:0x15af, B:519:0x15c3, B:521:0x15c9, B:522:0x15ca, B:534:0x15d4, B:536:0x15da, B:537:0x15db, B:549:0x15e9, B:551:0x15ef, B:552:0x15f0), top: B:301:0x0fdc }] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x15ef A[Catch: Exception -> 0x1606, all -> 0x1627, IOException -> 0x162e, TryCatch #5 {, blocks: (B:302:0x0fdc, B:304:0x0ff6, B:307:0x1001, B:316:0x1082, B:321:0x10e2, B:334:0x113d, B:337:0x118d, B:338:0x1191, B:359:0x12fb, B:361:0x1305, B:363:0x139b, B:365:0x13b6, B:367:0x13d7, B:369:0x13f4, B:371:0x1414, B:373:0x1432, B:399:0x1606, B:400:0x1626, B:425:0x1581, B:426:0x1584, B:511:0x15a1, B:513:0x15ae, B:514:0x15af, B:519:0x15c3, B:521:0x15c9, B:522:0x15ca, B:534:0x15d4, B:536:0x15da, B:537:0x15db, B:549:0x15e9, B:551:0x15ef, B:552:0x15f0), top: B:301:0x0fdc }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x15f0 A[Catch: Exception -> 0x1606, all -> 0x1627, IOException -> 0x162e, TRY_LEAVE, TryCatch #5 {, blocks: (B:302:0x0fdc, B:304:0x0ff6, B:307:0x1001, B:316:0x1082, B:321:0x10e2, B:334:0x113d, B:337:0x118d, B:338:0x1191, B:359:0x12fb, B:361:0x1305, B:363:0x139b, B:365:0x13b6, B:367:0x13d7, B:369:0x13f4, B:371:0x1414, B:373:0x1432, B:399:0x1606, B:400:0x1626, B:425:0x1581, B:426:0x1584, B:511:0x15a1, B:513:0x15ae, B:514:0x15af, B:519:0x15c3, B:521:0x15c9, B:522:0x15ca, B:534:0x15d4, B:536:0x15da, B:537:0x15db, B:549:0x15e9, B:551:0x15ef, B:552:0x15f0), top: B:301:0x0fdc }] */
    /* JADX WARN: Type inference failed for: r10v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v28, types: [char] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v365 */
    /* JADX WARN: Type inference failed for: r1v367 */
    /* JADX WARN: Type inference failed for: r1v447, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v684, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v731 */
    /* JADX WARN: Type inference failed for: r36v10 */
    /* JADX WARN: Type inference failed for: r36v11 */
    /* JADX WARN: Type inference failed for: r36v12 */
    /* JADX WARN: Type inference failed for: r36v13 */
    /* JADX WARN: Type inference failed for: r36v20 */
    /* JADX WARN: Type inference failed for: r36v29, types: [long] */
    /* JADX WARN: Type inference failed for: r36v37 */
    /* JADX WARN: Type inference failed for: r36v38 */
    /* JADX WARN: Type inference failed for: r36v39 */
    /* JADX WARN: Type inference failed for: r36v40 */
    /* JADX WARN: Type inference failed for: r36v8 */
    /* JADX WARN: Type inference failed for: r36v9 */
    /* JADX WARN: Type inference failed for: r4v189 */
    /* JADX WARN: Type inference failed for: r4v190 */
    /* JADX WARN: Type inference failed for: r4v192 */
    /* JADX WARN: Type inference failed for: r4v193 */
    /* JADX WARN: Type inference failed for: r4v194 */
    /* JADX WARN: Type inference failed for: r4v195 */
    /* JADX WARN: Type inference failed for: r4v196 */
    /* JADX WARN: Type inference failed for: r4v197 */
    /* JADX WARN: Type inference failed for: r4v214 */
    /* JADX WARN: Type inference failed for: r4v220 */
    /* JADX WARN: Type inference failed for: r4v255 */
    /* JADX WARN: Type inference failed for: r5v161, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v162, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v287 */
    /* JADX WARN: Type inference failed for: r6v288 */
    /* JADX WARN: Type inference failed for: r6v289 */
    /* JADX WARN: Type inference failed for: r6v297, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v303, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v689 */
    /* JADX WARN: Type inference failed for: r6v690 */
    /* JADX WARN: Type inference failed for: r9v103, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.String str;
        java.lang.Integer num2;
        char c;
        java.lang.Object[] objArr;
        int i4;
        int i5;
        java.lang.String str2;
        java.lang.Object[] objArr2;
        int i6;
        java.lang.Object[] objArr3;
        int i7;
        java.lang.Object[] objArr4;
        int i8;
        char c2;
        java.lang.Object[] objArr5;
        int i9;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str5;
        java.lang.Object obj3;
        int length;
        ?? r4;
        ?? r36;
        ?? r1;
        ?? r9;
        ?? r12;
        java.lang.String intern;
        java.lang.Runtime runtime;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.Object obj4;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.Object newInstance2;
        java.io.DataOutputStream dataOutputStream;
        java.lang.Throwable cause2;
        java.lang.String str6;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        java.lang.Object obj5;
        ?? r6;
        int length2;
        int i10;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object obj6;
        java.lang.Object[] objArr6;
        int i11;
        java.lang.Object obj7;
        java.lang.Object[] objArr7;
        int i12;
        java.lang.Object obj8;
        java.lang.Object[] objArr8;
        int i13;
        int i14 = i;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a(new int[]{38, 34, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr9);
        java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(new int[]{72, 7, 6, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr10);
        java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b("\uee1c洏䐀쀧\uef16⹙峅엣烼㑜瑰繙㉮끔縖䖗", 16 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr11);
        java.lang.String intern4 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Integer num3 = -604620973;
        try {
            if (context == null) {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                b("鋦쳩곓칵牱賨㔠\ue74f䮴\uf69d센⏌", android.graphics.Color.alpha(0) + 12, objArr12);
                java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern()};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                java.lang.Object obj10 = obj9;
                if (obj9 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3160 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (33099 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c((short) 618, (byte) (-$$a[52]), r8[2], objArr14);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method);
                    obj10 = method;
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr13)).longValue();
                long j = i14;
                long j2 = ~j;
                long j3 = ((382 * longValue) - 288702471480L) + ((longValue | j | (-759743347)) * (-381)) + (((~((~longValue) | (-759743347))) | (~(j2 | longValue)) | (~(759743346 | longValue))) * 381) + ((~((-759743347) | longValue)) * 381) + 147727392;
                int i15 = (int) (j3 >> 32);
                int i16 = ~i14;
                int i17 = ~(1244625172 | i16);
                if (((i15 & ((((~(192601238 | i16)) | 1074077952) * (-1188)) + 833199610 + (((~((-192601239) | i14)) | 1074077952 | i17) * 594) + ((i17 | (~((-192601239) | i16)) | 22054018) * 594))) | (((int) j3) & (((((1459465706 | i16) * 1444) + 1153123995) + ((((~((-2119434704) | i14)) | 1448346058) | (~(682208293 | i14))) * (-1444))) - 1467252934))) != 0) {
                    objArr6 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1046946827) | i16)) | 16810881) * (-591)) - 1649251140) + (((-1046946827) | i14) * 591))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj12 = obj11;
                    if (obj11 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, android.view.View.MeasureSpec.getMode(0) + 2713, (char) android.graphics.Color.red(0));
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr16);
                        java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                        obj12 = method2;
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr15)).intValue();
                    i11 = 0;
                    ((int[]) objArr6[4])[0] = intValue;
                } else {
                    objArr6 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-167832204) | i16)) | 862303741) * (-235)) - 923136865) + (((~((-167832204) | i14)) | 862303741) * (-470)) + (((~((-134236675) | i14)) | 828708212) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj14 = obj13;
                    if (obj13 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr18);
                        java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                        obj14 = method3;
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr17)).intValue();
                    i11 = 0;
                    ((int[]) objArr6[4])[0] = intValue2;
                }
                if (((int[]) objArr6[1])[i11] != i14) {
                    return objArr6;
                }
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                a(new int[]{i11, 20, i11, 13}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", true, objArr19);
                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[i11]).intern()};
                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                java.lang.Object obj16 = obj15;
                if (obj15 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 3161 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (33099 - android.graphics.Color.alpha(0)));
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    c((short) 618, (byte) (-$$a[52]), r4[2], objArr21);
                    java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method4);
                    obj16 = method4;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr20)).longValue();
                long j4 = ~longValue2;
                long j5 = (((-500) * longValue2) - 307977310000L) + (((~(j4 | 615954620)) | (~(longValue2 | (-615954621) | j))) * 501) + ((~(j4 | (-615954621))) * 1002) + ((~(longValue2 | (-615954621) | j2)) * 501) + 291516118;
                if (((((int) (j5 >> 32)) & (((((~(182989430 | i14)) | (-1786427992)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 169307964) + (((~(182989430 | i16)) | (-1786427992)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j5) & ((((~(1332973763 | i16)) | (~((-104252647) | i14))) * 959) + 85286647 + (((~(1332973763 | i14)) | (~((-104252647) | i16))) * 959)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-41426510) | i14)) | 1071562454) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1097358485) + (((~((-41426510) | i16)) | 39329348) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                    obj7 = -1347122530;
                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj18 = obj17;
                    if (obj17 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, 2713 - (android.os.Process.myPid() >> 22), (char) android.graphics.Color.alpha(0));
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr23);
                        java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                        obj18 = method5;
                    }
                    int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr22)).intValue();
                    i12 = 0;
                    ((int[]) objArr7[4])[0] = intValue3;
                } else {
                    obj7 = -1347122530;
                    objArr7 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                    java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(658359471 | i14)) | (-926801920)) * 305) + 1688986866 + (((~(658359471 | i16)) | (-371776474)) * 305))};
                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj20 = obj19;
                    if (obj19 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.alpha(0), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr25);
                        java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                        obj20 = method6;
                    }
                    int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr24)).intValue();
                    i12 = 0;
                    ((int[]) objArr7[4])[0] = intValue4;
                }
                if (((int[]) objArr7[1])[i12] != i14) {
                    return objArr7;
                }
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                b("凙鱷똫ŗㇶ槟槭駷ᄩ䁱㼩蠃鐇鎉ퟭ伂\ue7a0皣쵘ꀰ峅엣鸶뿛ﵖ⅐頕鬸\udc00ᑷ먷䜟槭駷ᄩ䁱", android.os.Process.getGidForName("") + 37, objArr26);
                java.lang.Object[] objArr27 = {((java.lang.String) objArr26[i12]).intern()};
                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                java.lang.Object obj22 = obj21;
                if (obj21 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.drawable.Drawable.resolveOpacity(i12, i12), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3160, (char) (android.view.View.MeasureSpec.makeMeasureSpec(i12, i12) + 33099));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    c((short) 612, bArr[14], bArr[22], objArr28);
                    java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method7);
                    obj22 = method7;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr27)).longValue();
                long j6 = (-286703512) | j2;
                long j7 = ~longValue3;
                java.lang.Object obj23 = obj7;
                long j8 = (53 * longValue3) + 14621879112L + ((~(j6 | longValue3)) * 52) + (((~(j7 | j2)) | (~(j7 | (-286703512))) | (~j6)) * (-52)) + (((~(longValue3 | 286703511)) | (~(286703511 | j2))) * 52) + 1282138415;
                if (((((int) (j8 >> 32)) & ((((~(1324694698 | i14)) | 1533046186) * (-948)) + 1385941418 + ((~(1609924010 | i16)) * (-948)) + 185550924)) | (((int) j8) & (((((~((-1458973160) | i16)) | (~((-1398767727) | i14))) * 1900) - 1871736089) + (((~(1398767726 | i16)) | (~(1458973159 | i14))) * (-950)) + (((~(1398767726 | i14)) | (~(1458973159 | i16))) * 950)))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(707439957 | i14)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1764512456) + (((-286347811) | i16) * (-216)) + (((~(707439957 | i16)) | 322695987) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                    obj8 = obj23;
                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(obj8);
                    java.lang.Object obj25 = obj24;
                    if (obj24 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr30);
                        java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(obj8, method8);
                        obj25 = method8;
                    }
                    int intValue5 = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr29)).intValue();
                    i13 = 0;
                    ((int[]) objArr8[4])[0] = intValue5;
                } else {
                    obj8 = obj23;
                    objArr8 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                    java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(684673798 | i14)) | (-345462147)) * (-668)) - 2001470976) + (((~((-345462147) | i14)) | 684673798) * 1336) + (((-336598145) | i14) * 668))};
                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(obj8);
                    java.lang.Object obj27 = obj26;
                    if (obj26 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr32);
                        java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(obj8, method9);
                        obj27 = method9;
                    }
                    int intValue6 = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr31)).intValue();
                    i13 = 0;
                    ((int[]) objArr8[4])[0] = intValue6;
                }
                if (((int[]) objArr8[1])[i13] != i14) {
                    return objArr8;
                }
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                b("凙鱷똫ŗㇶ槟槭駷ᄩ䁱㼩蠃鐇鎉䮫婢ⵦꮃ肏饹낫谱\uead3熼퐎ᔉ伛拘ἦ먽䅥陶໊\ude66ྲྀ袀춘䋕⣈\ue2f5䭩籸", (android.util.TypedValue.complexToFloat(i13) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i13) == 0.0f ? 0 : -1)) + 42, objArr33);
                java.lang.Object[] objArr34 = {((java.lang.String) objArr33[i13]).intern()};
                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                java.lang.Object obj29 = obj28;
                if (obj28 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3161, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 33099));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    c((short) 612, bArr2[14], bArr2[22], objArr35);
                    java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method10);
                    obj29 = method10;
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr34)).longValue();
                long j9 = ~longValue4;
                java.lang.Object obj30 = obj8;
                long j10 = ((832 * longValue4) - 258022661080L) + (((~(longValue4 | 310870676 | j)) | (~(j9 | j2))) * (-831)) + ((~(310870676 | j9 | j)) * (-1662)) + (((~(longValue4 | j)) | (~((-310870677) | j2)) | (~(j | 310870676))) * 831) + 684564227;
                if (((((int) (j10 >> 32)) & ((((~(1989385231 | i16)) | (~(868355653 | i14))) * 1900) + 1871737038 + (((~((-868355654) | i16)) | (~((-1989385232) | i14))) * (-950)) + (((~((-868355654) | i14)) | (~((-1989385232) | i16))) * 950))) | (((int) j10) & ((((~((-1566418964) | i14)) | 129192553) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1118488529 + (((~((-1566418964) | i16)) | 85000193) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)))) == 0) {
                    java.lang.Object[] objArr36 = {new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                    java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-495963167) | i16)) | (~((-534172779) | i14))) | (~(534172778 | i16))) * 959) - 1584512303) + (((~(i14 | 534172778)) | (~(i16 | (-534172779))) | (~((-495963167) | i14))) * 959))};
                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(obj30);
                    java.lang.Object obj32 = obj31;
                    if (obj31 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        c((short) 653, (byte) (-$$a[52]), 34, objArr38);
                        java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(obj30, method11);
                        obj32 = method11;
                    }
                    ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr37)).intValue();
                    return objArr36;
                }
                java.lang.Object[] objArr39 = {new int[]{i14}, new int[]{i14 ^ 90}, null, null, new int[1]};
                int i18 = ~((-411264563) | i14);
                java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-411264563) | i16)) | 402670624) * (-245)) + 1706072596 + (i18 * (-245)) + ((i18 | 618871382) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(obj30);
                java.lang.Object obj34 = obj33;
                if (obj33 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.Color.blue(0));
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    c((short) 653, (byte) (-$$a[52]), 34, objArr41);
                    java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(obj30, method12);
                    obj34 = method12;
                }
                ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr40)).intValue();
                return objArr39;
            }
            java.lang.String str9 = -1347122530;
            java.lang.Integer num4 = 269015277;
            try {
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                b("峅엣鸶뿛ﵖ⅐掇\ue042눛惸켞꼇Ꚋ㚅䶵왏\uf41c[켞꼇솤葲\uf121䒃", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, objArr42);
                java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                b("崁괵祃菃춘䋕凒ܹ崁괵錕悿餮龕", 14 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr43);
                java.lang.String str10 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr43[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                b("峅엣鸶뿛ﵖ⅐掇\ue042눛惸켞꼇Ꚋ㚅䶵왏\uf41c[켞꼇솤葲\uf121䒃", 23 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr44);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                a(new int[]{20, 18, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", false, objArr45);
                java.lang.Object invoke = cls14.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str10);
                if (indexOf > 0) {
                    java.lang.String str11 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    int i19 = 16;
                    if (str11.length() >= 16) {
                        int i20 = 0;
                        ?? r10 = str11;
                        while (i20 <= r10.length() - i19) {
                            java.lang.Object[] objArr46 = {r10.substring(i20, i20 + 16), 931995};
                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj35 == null) {
                                num = num4;
                                obj3 = r10;
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2595, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                short s = $$a[2];
                                byte b = (byte) s;
                                num2 = num3;
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                c(s, b, b, objArr47);
                                java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr47[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                obj6 = method13;
                            } else {
                                num = num4;
                                obj3 = r10;
                                num2 = num3;
                                obj6 = obj35;
                            }
                            long j11 = ~((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr46)).longValue();
                            java.lang.String str12 = intern4;
                            long j12 = j11 | (-92304314);
                            int i21 = indexOf;
                            long j13 = i14;
                            str5 = str9;
                            obj2 = invoke;
                            long j14 = ((r12 * (-344)) - 31752683672L) + (((~(j13 | (-92304314))) | (~j12)) * 345) + (((~((-92304314) | (~j13))) | (~(92304313 | j11))) * 345) + ((~(j12 | j13)) * 345) + 1164796211;
                            i14 = i;
                            int i22 = ~i14;
                            if (((((int) (j14 >> 32)) & ((((~((-258128092) | i22)) | (~((-1695354503) | i22)) | 83888258) * 464) + 1259402250 + (((-1611466245) | i14) * (-464)) + (((~((-258128092) | i14)) | 83888258) * 464))) | (((int) j14) & ((((~((-221352215) | i14)) | 83955972) * (-140)) + 1960678951 + ((~((-137396243) | i14)) * 70) + (((~((-1215874196) | i14)) | 1162433925) * 70)))) == -725904754) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r5, new int[1]};
                                java.lang.String str13 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj2);
                                ((int[]) objArr[0])[0] = i14;
                                ((int[]) objArr[1])[0] = i14 ^ 20;
                                java.lang.Object[] objArr48 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((449484445 | r5) * 764) - 1646182204) + (((~(i22 | 449484445)) | 538184034) * (-1528)) + ((945201014 | (~(580651499 | i22))) * 764))};
                                str8 = str5;
                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str8);
                                java.lang.Object obj37 = obj36;
                                if (obj36 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.view.KeyEvent.keyCodeFromString(""));
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    c((short) 653, (byte) (-$$a[52]), 34, objArr49);
                                    java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr49[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str8, method14);
                                    obj37 = method14;
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr48)).intValue();
                                str7 = str8;
                                str = str7;
                                i4 = 1;
                                c = 0;
                                if (((int[]) objArr[i4])[c] == i14) {
                                    return objArr;
                                }
                                int[] iArr = new int[i4];
                                int[] iArr2 = new int[i4];
                                iArr[c] = i14;
                                iArr2[c] = i14;
                                java.lang.Object[] objArr50 = {iArr, iArr2, null, null, new int[i4]};
                                int i23 = ~i14;
                                java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-398789777) | i23)) | 92340368) * 446) + 1151005592) + (((~((-306449409) | i14)) | 539005800) * 446)) - 1765868832)};
                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                                java.lang.Object obj39 = obj38;
                                if (obj38 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    c((short) 653, (byte) (-$$a[52]), 34, objArr52);
                                    java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, method15);
                                    obj39 = method15;
                                }
                                ((int[]) objArr50[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr51)).intValue();
                                if (((int[]) objArr50[1])[0] != i14) {
                                    return objArr50;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    a(new int[]{141, 13, 134, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", true, objArr53);
                                    try {
                                        java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        b("峅엣鸶뿛ﵖ⅐掇\ue042눛惸켞꼇Ꚋ㚅䶵왏\uf41c[켞꼇솤葲\uf121䒃", 23 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr55);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr55[0]).intern());
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        a(new int[]{154, 16, 0, 9}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", false, objArr56);
                                        java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr56[0]).intern(), java.lang.String.class).invoke(context, objArr54);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                                            a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 37, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr57);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr57[0]).intern());
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a(new int[]{207, 15, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", true, objArr58);
                                            java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr58[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, 29, 75, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000", false, objArr59);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr59[0]).intern());
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    b("崁괵祃菃춘䋕凒ܹ崁괵錕悿餮龕", 14 - android.view.View.resolveSize(0, 0), objArr60);
                                                    java.lang.String str14 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr60[0]).intern(), null).invoke(next, null);
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 37, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr61);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr61[0]).intern());
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(new int[]{251, 17, 19, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", false, objArr62);
                                                    if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr62[0]).intern(), java.lang.String.class).invoke(invoke2, str14)).booleanValue()) {
                                                        int i24 = 20;
                                                        if (str14.length() >= 20) {
                                                            int i25 = 0;
                                                            while (i25 <= str14.length() - i24) {
                                                                java.lang.Object[] objArr63 = {str14.substring(i25, i25 + 20), 931995};
                                                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                java.lang.Object obj41 = obj40;
                                                                if (obj40 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, 2593 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                    short s2 = $$a[2];
                                                                    byte b2 = (byte) s2;
                                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                    c(s2, b2, b2, objArr64);
                                                                    java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr64[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                    obj41 = method16;
                                                                }
                                                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr63)).longValue();
                                                                long j15 = i14;
                                                                long j16 = ~j15;
                                                                long j17 = ~longValue5;
                                                                java.util.Iterator it2 = it;
                                                                java.lang.String str15 = str14;
                                                                long j18 = j17 | (-72524669);
                                                                long j19 = j17 | j16;
                                                                i5 = i23;
                                                                java.lang.String str16 = str;
                                                                long j20 = (193 * longValue5) + 13997260924L + (((~(longValue5 | (-72524669))) | j16) * (-192)) + (((~j18) | (~j19)) * (-384)) + (((~(j18 | j15)) | (~(72524668 | j19)) | (((72524668 | longValue5) | j15) ^ (-1))) * 192) + 1184575856;
                                                                if (((((int) j20) & (((((~(321411774 | i14)) | 33577642) * (-502)) - 2078948717) + ((~(i5 | (-1082236994))) * (-502)) + (((~(1115814635 | i14)) | 321411774) * 502))) | (((int) (j20 >> 32)) & (((((~(822417713 | i14)) | (~(i5 | (-2035323172)))) * (-1808)) - 1607867334) + (((~(2035652915 | i14)) | (~(i5 | (-822087970)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(2035323171 | i14)) | 1213235202 | (~(i5 | (-822417714)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 70}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i5 | (-637672942))) | (~(i5 | (-392463004)))) * (-867)) + 804801824 + (((~((-637672942) | i14)) | 100663433 | (~((-392463004) | i14))) * (-1734)) + (((~(i5 | (-100663434))) | (~((-537009509) | i14)) | (~((-291799571) | i14))) * 867))};
                                                                    str2 = str16;
                                                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                    java.lang.Object obj43 = obj42;
                                                                    if (obj42 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                        c((short) 653, (byte) (-$$a[52]), 34, objArr66);
                                                                        java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method17);
                                                                        obj43 = method17;
                                                                    }
                                                                    int intValue7 = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr65)).intValue();
                                                                    c2 = 0;
                                                                    ((int[]) objArr5[4])[0] = intValue7;
                                                                    if (((int[]) objArr5[1])[c2] != i14) {
                                                                        return objArr5;
                                                                    }
                                                                } else {
                                                                    i25++;
                                                                    str14 = str15;
                                                                    str = str16;
                                                                    i23 = i5;
                                                                    i24 = 20;
                                                                    it = it2;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    str = str;
                                                    i23 = i23;
                                                    it = it;
                                                }
                                            }
                                        }
                                        i5 = i23;
                                        str2 = str;
                                        java.lang.Object[] objArr67 = {new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-973152603) | i14)) | 939524176) * (-566)) + 224874856 + ((~((-33628427) | i14)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                                        java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                        java.lang.Object obj45 = obj44;
                                        if (obj44 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2714 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            c((short) 653, (byte) (-$$a[52]), 34, objArr69);
                                            java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method18);
                                            obj45 = method18;
                                        }
                                        int intValue8 = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr68)).intValue();
                                        c2 = 0;
                                        ((int[]) objArr67[4])[0] = intValue8;
                                        objArr5 = objArr67;
                                        if (((int[]) objArr5[1])[c2] != i14) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause3 = th4.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th4;
                                    }
                                } else {
                                    i5 = i23;
                                    str2 = str;
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                b("鋦쳩곓칵牱賨㔠\ue74f䮴\uf69d센⏌", 13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr70);
                                java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                                java.lang.Integer num5 = num2;
                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                java.lang.Object obj47 = obj46;
                                if (obj46 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 3161 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.Color.alpha(0) + 33099));
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    c((short) 618, (byte) (-$$a[52]), r6[2], objArr72);
                                    java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, method19);
                                    obj47 = method19;
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr71)).longValue();
                                long j21 = ~((-571047417) | (~longValue6));
                                long j22 = 571047416 | longValue6;
                                long j23 = i14;
                                long j24 = ~j23;
                                long j25 = ((longValue6 * (-755)) - 431140799080L) + (1512 * j21) + (((~(j22 | j23)) | j21) * (-756)) + ((j22 | j24) * 756) + 336423322;
                                if (((((int) (j25 >> 32)) & ((((~(805306281 | i14)) * (-301)) - 661447950) + (((~((-800741002) | i14)) | (~(i5 | 636485409))) * (-301)) + (((~((-636485410) | i14)) | (-800741002)) * 301))) | (((int) j25) & ((((~(916208437 | i14)) | 151126080 | (~((-521017973) | i14))) * (-754)) + 1236873699 + (((~((-151126081) | i14)) | (~(i5 | (-369891893)))) * (-754)) + ((i5 | 916208437) * 754)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i5 | (-826921292))) | (~((-203214654) | i14)) | (~(i5 | 203214653))) * 959) + 479953808 + (((~((-826921292) | i14)) | (~(i5 | (-203214654))) | (~(203214653 | i14))) * 959))};
                                    java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj49 = obj48;
                                    if (obj48 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) android.view.View.MeasureSpec.getSize(0));
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr74);
                                        java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method20);
                                        obj49 = method20;
                                    }
                                    int intValue9 = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr73)).intValue();
                                    i6 = 0;
                                    ((int[]) objArr2[4])[0] = intValue9;
                                } else {
                                    objArr2 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                    int i26 = ~((-213070890) | i14);
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i5 | (-213070890))) | 201330720) * (-245)) - 919546662) + (i26 * (-245)) + ((i26 | 817065055) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                    java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj51 = obj50;
                                    if (obj50 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.getOffsetAfter("", 0) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr76);
                                        java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method21);
                                        obj51 = method21;
                                    }
                                    i6 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr75)).intValue();
                                }
                                if (((int[]) objArr2[1])[i6] != i14) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                a(new int[]{i6, 20, i6, 13}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", true, objArr77);
                                java.lang.Object[] objArr78 = {((java.lang.String) objArr77[i6]).intern()};
                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                java.lang.Object obj53 = obj52;
                                if (obj52 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 3161 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (33098 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    c((short) 618, (byte) (-$$a[52]), r6[2], objArr79);
                                    java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, method22);
                                    obj53 = method22;
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, objArr78)).longValue();
                                long j26 = (((-55) * longValue7) - 49742622875L) + (((~(904411325 | j23)) | longValue7) * 56) + ((~(904411325 | longValue7)) * (-56)) + (((~(longValue7 | j24)) | 904411325) * 56) + 3059413;
                                if (((((int) (j26 >> 32)) & (((((~(1825850669 | i14)) | (-388624259)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 799824455) + (((~(i5 | 1825850669)) | (-2147348400)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((int) j26) & (((((~(i5 | (-625760259))) | 84430850) * (-241)) - 432681482) + (((~(i5 | (-541329409))) | (-2147417519)) * 241)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 60}, null, null, new int[1]};
                                    int i27 = ~((-865830752) | i14);
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((839943766 | i27) * (-280)) + 459466256 + ((i27 | (~((-164305194) | i14))) * 140) + (((~((-25886986) | i14)) | (~(i5 | (-839943767))) | (~(i5 | (-138418209)))) * 140))};
                                    java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj55 = obj54;
                                    if (obj54 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, android.text.TextUtils.indexOf("", "", 0) + 2713, (char) (android.os.Process.myTid() >> 22));
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr81);
                                        java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method23);
                                        obj55 = method23;
                                    }
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr80)).intValue();
                                } else {
                                    objArr3 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i5 | (-897272250))) | 90914953) * (-241)) - 53909093) + (((~(i5 | (-806357297))) | 41948742) * 241))};
                                    java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj57 = obj56;
                                    if (obj56 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr83);
                                        java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method24);
                                        obj57 = method24;
                                    }
                                    int intValue10 = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr82)).intValue();
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = intValue10;
                                }
                                if (((int[]) objArr3[1])[i7] != i14) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                b("凙鱷똫ŗㇶ槟槭駷ᄩ䁱㼩蠃鐇鎉ퟭ伂\ue7a0皣쵘ꀰ峅엣鸶뿛ﵖ⅐頕鬸\udc00ᑷ먷䜟槭駷ᄩ䁱", 37 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[i7]).intern()};
                                java.lang.Integer num6 = num;
                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                java.lang.Object obj59 = obj58;
                                if (obj58 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(i7, i7) + 36, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3161, (char) (33099 - android.text.TextUtils.getTrimmedLength("")));
                                    byte[] bArr3 = $$a;
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    c((short) 612, bArr3[14], bArr3[22], objArr86);
                                    java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method25);
                                    obj59 = method25;
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, objArr85)).longValue();
                                long j27 = ~(934266145 | j24);
                                long j28 = ~((-934266146) | longValue8);
                                long j29 = ((-1527) * longValue8) + 714713600925L + ((longValue8 | j27) * 764) + (((~(j24 | longValue8)) | j28) * (-1528)) + (((~((~longValue8) | 934266145)) | j28 | j27) * 764) + 61168758;
                                int i28 = (int) (j29 >> 32);
                                int i29 = ~((-1542030470) | i14);
                                if (((i28 & ((((~(i5 | 705788853)) | (-2143015265)) * (-933)) + 2087740540 + (((~(i5 | (-2143015265))) | 705777952) * 933) + 10170633)) | (((int) j29) & ((((-1610591968) | i29) * (-196)) + 161176045 + ((i29 | 68561498) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)))) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i14}, new int[]{i14 ^ 80}, null, null, new int[1]};
                                    int i30 = ~((-944767009) | i14);
                                    java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((17079892 | i30) * (-476)) + 1832700216 + (i30 * 952) + ((~(i5 | (-944767009))) * 476))};
                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj61 = obj60;
                                    if (obj60 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr88);
                                        java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method26);
                                        obj61 = method26;
                                    }
                                    i8 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj61).invoke(null, objArr87)).intValue();
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i5 | (-127104420))) | (~(936607719 | i14))) * (-831)) + 479805258 + ((~((-33576195) | i14)) * (-1662)) + (((~(i5 | (-903031526))) | (~(903031525 | i14)) | (~(127104419 | i14))) * 831))};
                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj63 = obj62;
                                    if (obj62 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter("", 0), 2714 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(""));
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr90);
                                        java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method27);
                                        obj63 = method27;
                                    }
                                    int intValue11 = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr89)).intValue();
                                    i8 = 0;
                                    ((int[]) objArr4[4])[0] = intValue11;
                                }
                                if (((int[]) objArr4[1])[i8] != i14) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                b("凙鱷똫ŗㇶ槟槭駷ᄩ䁱㼩蠃鐇鎉䮫婢ⵦꮃ肏饹낫谱\uead3熼퐎ᔉ伛拘ἦ먽䅥陶໊\ude66ྲྀ袀춘䋕⣈\ue2f5䭩籸", android.text.TextUtils.getOffsetBefore("", i8) + 42, objArr91);
                                java.lang.Object[] objArr92 = {((java.lang.String) objArr91[i8]).intern()};
                                java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                java.lang.Object obj65 = obj64;
                                if (obj64 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3161, (char) (33099 - android.view.View.MeasureSpec.getMode(0)));
                                    byte[] bArr4 = $$a;
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    c((short) 612, bArr4[14], bArr4[22], objArr93);
                                    java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method28);
                                    obj65 = method28;
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr92)).longValue();
                                long j30 = ~longValue9;
                                long j31 = (367 * longValue9) + 234536134212L + ((639063036 | longValue9) * (-366)) + (((~(j30 | j23)) | 639063036) * (-366)) + (((~(longValue9 | (-639063037))) | (~(j30 | 639063036 | j23))) * 366) + 356371867;
                                int i31 = (int) (j31 >> 32);
                                int i32 = ~((-1074268673) | i14);
                                if (((i31 & ((((~(i5 | 1886259721)) | 159490114 | i32) * (-713)) + 2035143548 + (i32 * 1426) + ((~(i5 | 971481163)) * 713))) | (((int) j31) & (((((~((-44610311) | i14)) | (~(i5 | (-1481836721)))) * (-318)) - 1459389817) + (((~((-1549208825) | i14)) | 67372104) * (-318)) + (((~(1549208824 | i14)) | (-111982415)) * 318)))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i14}, new int[]{i14 ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-487251913) | i14)) | (-542884033)) * (-964)) - 1059621148) + (((~(i5 | (-487251913))) | 486547208) * (-964)))};
                                    java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                    java.lang.Object obj67 = obj66;
                                    if (obj66 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        c((short) 653, (byte) (-$$a[52]), 34, objArr96);
                                        java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method29);
                                        obj67 = method29;
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj67).invoke(null, objArr95)).intValue();
                                    return objArr94;
                                }
                                java.lang.Object[] objArr97 = {new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                                int i33 = ~(518642161 | i14);
                                java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((9772902 | i33) * (-658)) - 1992697528) + ((i33 | 1312262) * 658))};
                                java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                java.lang.Object obj69 = obj68;
                                if (obj68 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.alpha(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    c((short) 653, (byte) (-$$a[52]), 34, objArr99);
                                    java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method30);
                                    obj69 = method30;
                                }
                                ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj69).invoke(null, objArr98)).intValue();
                                return objArr97;
                            }
                            i20++;
                            r10 = obj3;
                            num3 = num2;
                            indexOf = i21;
                            num4 = num;
                            intern4 = str12;
                            i19 = 16;
                            invoke = obj2;
                            str9 = str5;
                        }
                    }
                    i9 = indexOf;
                    num = num4;
                    str3 = intern4;
                    num2 = num3;
                    java.lang.Object obj70 = invoke;
                    str4 = str9;
                    obj = obj70;
                    java.lang.String str17 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj);
                    if (str17.length() >= 6) {
                        int i34 = 0;
                        obj2 = obj2;
                        while (i34 <= str17.length() - 6) {
                            java.lang.Object[] objArr100 = {str17.substring(i34, i34 + 6), 931995};
                            java.lang.Object obj71 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            java.lang.Object obj72 = obj71;
                            if (obj71 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 20, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2595, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                short s3 = $$a[2];
                                byte b3 = (byte) s3;
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                c(s3, b3, b3, objArr101);
                                java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                obj72 = method31;
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj72).invoke(null, objArr100)).longValue();
                            long j32 = i14;
                            long j33 = ~j32;
                            int i35 = i34;
                            long j34 = ~longValue10;
                            obj3 = obj;
                            str5 = str4;
                            ?? r362 = j34 | (-765095293);
                            long j35 = (longValue10 * (-858)) + 657981951120L + ((j32 | 765095292) * (-859)) + (((~(j33 | 765095292)) | (~(r362 | j32))) * 859) + ((((j34 | 765095292) ^ (-1)) | (~(j34 | j33))) * 859) + 492005232;
                            int i36 = (int) (j35 >> 32);
                            int i37 = ~i14;
                            if (((i36 & ((((~(768973964 | i14)) | 1342177600 | (~((-2088766921) | i14))) * (-754)) + 128702562 + (((~((-746589321) | i37)) | (~((-1342177601) | i14))) * (-754)) + ((768973964 | i37) * 754))) | (((int) j35) & (((((-270860881) | i14) * (-676)) - 1874718279) + (((~(1339597827 | i37)) | 270860880) * 676) + (((~((-1518143059) | i37)) | 1247282178 | (~(1610458707 | i14))) * 676)))) == -2096167706) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r5, new int[1]};
                                java.lang.String str18 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj3);
                                ((int[]) objArr[0])[0] = i14;
                                ((int[]) objArr[1])[0] = i14 ^ 20;
                                java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-240739221) | i37)) | 235479188) * (-241)) + 1595905404 + (((~(i37 | (-5260033))) | 553917536) * 241))};
                                str8 = str5;
                                java.lang.Object obj73 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str8);
                                java.lang.Object obj74 = obj73;
                                if (obj73 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) android.graphics.Color.alpha(0));
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    c((short) 653, (byte) (-$$a[52]), 34, objArr103);
                                    java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str8, method32);
                                    obj74 = method32;
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj74).invoke(null, objArr102)).intValue();
                                str7 = str8;
                                str = str7;
                                i4 = 1;
                                c = 0;
                                if (((int[]) objArr[i4])[c] == i14) {
                                }
                            } else {
                                obj = obj3;
                                str4 = str5;
                                i34 = i35 + 1;
                                obj2 = r362;
                            }
                        }
                    }
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(obj)).substring(0, i9);
                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                    b("䶢诃", 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr104);
                    java.lang.String[] split = substring.split(((java.lang.String) objArr104[0]).intern());
                    length = split.length;
                    r4 = 0;
                    r1 = split;
                    r36 = obj2;
                    while (r4 < length) {
                        r9 = r1[r4];
                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                        a(new int[]{79, 3, 36, 1}, null, true, objArr105);
                        if (r9.split(((java.lang.String) objArr105[0]).intern()).length > 1) {
                            int resolveOpacity = 48 - android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                            int jumpTapTimeout = 1581 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            r12 = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(resolveOpacity, jumpTapTimeout, r12))) {
                                try {
                                    try {
                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                        b("㷟褴ᘮ냅濖㚜ਉ햍帔ﰐ钴㸸蟥\uef39쯿퇞", 16 - (android.os.Process.myPid() >> 22), objArr106);
                                        intern = ((java.lang.String) objArr106[0]).intern();
                                        try {
                                            runtime = java.lang.Runtime.getRuntime();
                                            obj3 = r1;
                                        } catch (java.lang.Exception unused) {
                                        }
                                    } catch (java.io.IOException unused2) {
                                    }
                                } catch (java.io.IOException unused3) {
                                    obj3 = r1;
                                }
                                try {
                                    try {
                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                        a(new int[]{82, 2, 181, 0}, "\u0000\u0001", false, objArr107);
                                        exec = runtime.exec(((java.lang.String) objArr107[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                    } catch (java.lang.Exception unused4) {
                                    }
                                    try {
                                        java.lang.Object[] objArr108 = {exec.getInputStream()};
                                        java.lang.Object obj75 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                        if (obj75 == null) {
                                            try {
                                                i9 = length;
                                                try {
                                                    java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1507, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getDeclaredConstructor(java.io.InputStream.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                    obj4 = declaredConstructor;
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
                                            i9 = length;
                                            obj4 = obj75;
                                        }
                                        try {
                                            newInstance = ((java.lang.reflect.Constructor) obj4).newInstance(objArr108);
                                            try {
                                                try {
                                                    java.lang.Object[] objArr109 = {exec.getErrorStream()};
                                                    java.lang.Object obj76 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    java.lang.Object obj77 = obj76;
                                                    if (obj76 == null) {
                                                        try {
                                                            java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, android.graphics.Color.blue(0) + 1507, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                            obj77 = declaredConstructor2;
                                                        } catch (java.lang.Throwable th7) {
                                                            th2 = th7;
                                                            java.lang.Throwable cause4 = th2.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    newInstance2 = ((java.lang.reflect.Constructor) obj77).newInstance(objArr109);
                                                    dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                    try {
                                                        java.lang.Class<?> cls39 = java.lang.Class.forName(str3);
                                                        r36 = r4;
                                                        try {
                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                            str6 = str4;
                                                            try {
                                                                b("牱賨쫴뛲\uf121䒃", 5 - android.view.View.combineMeasuredStates(0, 0), objArr110);
                                                                cls39.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance, null);
                                                                try {
                                                                    java.lang.Class<?> cls40 = java.lang.Class.forName(str3);
                                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                    b("牱賨쫴뛲\uf121䒃", 5 - android.text.TextUtils.getOffsetAfter("", 0), objArr111);
                                                                    cls40.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance2, null);
                                                                } catch (java.lang.Throwable th8) {
                                                                    java.lang.Throwable cause5 = th8.getCause();
                                                                    if (cause5 != null) {
                                                                        throw cause5;
                                                                    }
                                                                    throw th8;
                                                                }
                                                            } catch (java.lang.Throwable th9) {
                                                                th = th9;
                                                                java.lang.Throwable th10 = th;
                                                                cause2 = th10.getCause();
                                                                if (cause2 == null) {
                                                                    throw cause2;
                                                                }
                                                                throw th10;
                                                            }
                                                        } catch (java.lang.Throwable th11) {
                                                            th = th11;
                                                            java.lang.Throwable th102 = th;
                                                            cause2 = th102.getCause();
                                                            if (cause2 == null) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th12) {
                                                        th = th12;
                                                    }
                                                } catch (java.lang.Throwable th13) {
                                                    th2 = th13;
                                                }
                                            } catch (java.io.IOException unused5) {
                                                r36 = r4;
                                                str5 = intern2;
                                                r12 = obj;
                                                r4 = str4;
                                                str4 = r4;
                                                obj = r12;
                                                length = i9;
                                                intern2 = str5;
                                                r4 = (r36 == true ? 1 : 0) + 1;
                                                r1 = obj3;
                                                r36 = r36;
                                            } catch (java.lang.Exception unused6) {
                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                a(new int[]{94, 27, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001", false, objArr112);
                                                throw new java.io.IOException(((java.lang.String) objArr112[0]).intern());
                                            }
                                        } catch (java.lang.Throwable th14) {
                                            th = th14;
                                            th = th;
                                            cause = th.getCause();
                                            if (cause == null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th15) {
                                        th = th15;
                                    }
                                } catch (java.io.IOException unused7) {
                                    i9 = length;
                                    r36 = r4;
                                    str5 = intern2;
                                    r12 = obj;
                                    r4 = str4;
                                    str4 = r4;
                                    obj = r12;
                                    length = i9;
                                    intern2 = str5;
                                    r4 = (r36 == true ? 1 : 0) + 1;
                                    r1 = obj3;
                                    r36 = r36;
                                } catch (java.lang.Exception unused8) {
                                    java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                    a(new int[]{94, 27, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001", false, objArr1122);
                                    throw new java.io.IOException(((java.lang.String) objArr1122[0]).intern());
                                }
                                try {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(intern);
                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                    a(new int[]{84, 1, 8, 1}, null, true, objArr113);
                                    sb.append(((java.lang.String) objArr113[0]).intern());
                                    java.lang.String obj78 = sb.toString();
                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                    b("峭◦ﰄ\ue489낿\udccd", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, objArr114);
                                    dataOutputStream.write(obj78.getBytes(((java.lang.String) objArr114[0]).intern()));
                                    dataOutputStream.flush();
                                    try {
                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                        a(new int[]{85, 5, 0, 1}, "\u0001\u0001\u0000\u0001\u0001", true, objArr115);
                                        java.lang.String intern5 = ((java.lang.String) objArr115[0]).intern();
                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                        b("峭◦ﰄ\ue489낿\udccd", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, objArr116);
                                        dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr116[0]).intern()));
                                        dataOutputStream.flush();
                                    } catch (java.io.IOException unused9) {
                                        str5 = intern2;
                                        r12 = obj;
                                    } catch (java.lang.Exception unused10) {
                                    }
                                    try {
                                        long nanoTime = java.lang.System.nanoTime();
                                        java.lang.Object obj79 = obj;
                                        try {
                                            long j36 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                            while (true) {
                                                try {
                                                    exec.exitValue();
                                                    str5 = intern2;
                                                    obj5 = obj79;
                                                    r6 = j36;
                                                    break;
                                                } catch (java.lang.IllegalThreadStateException unused11) {
                                                    if (j36 > 0) {
                                                        try {
                                                            str5 = intern2;
                                                            try {
                                                                try {
                                                                    java.lang.Object[] objArr117 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j36) + 1, 3L))};
                                                                    java.lang.Class<?> cls41 = java.lang.Class.forName(str3);
                                                                    obj5 = obj79;
                                                                    try {
                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                        b("뺐曵⦾\uf62d䯩ꥯ", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, objArr118);
                                                                        cls41.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr117);
                                                                    } catch (java.lang.Throwable th16) {
                                                                        th = th16;
                                                                        java.lang.Throwable th17 = th;
                                                                        java.lang.Throwable cause6 = th17.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th17;
                                                                    }
                                                                } catch (java.lang.Throwable th18) {
                                                                    th = th18;
                                                                }
                                                            } catch (java.lang.InterruptedException e) {
                                                                e = e;
                                                                interruptedException = e;
                                                                try {
                                                                    throw interruptedException;
                                                                } catch (java.lang.Throwable th19) {
                                                                    th = th19;
                                                                    th3 = th;
                                                                    try {
                                                                        exec.destroy();
                                                                        throw th3;
                                                                    } catch (java.lang.Exception unused12) {
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th20) {
                                                                th = th20;
                                                                th3 = th;
                                                                exec.destroy();
                                                                throw th3;
                                                            }
                                                        } catch (java.lang.InterruptedException e2) {
                                                            e = e2;
                                                        } catch (java.lang.Throwable th21) {
                                                            th = th21;
                                                        }
                                                    } else {
                                                        str5 = intern2;
                                                        obj5 = obj79;
                                                    }
                                                    try {
                                                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                        r6 = nanos;
                                                        if (nanos > 0) {
                                                            intern2 = str5;
                                                            obj79 = obj5;
                                                            j36 = nanos;
                                                        }
                                                    } catch (java.lang.InterruptedException e3) {
                                                        e = e3;
                                                        interruptedException = e;
                                                        throw interruptedException;
                                                    } catch (java.lang.Throwable th22) {
                                                        th = th22;
                                                        th3 = th;
                                                        exec.destroy();
                                                        throw th3;
                                                    }
                                                } catch (java.lang.InterruptedException e4) {
                                                    interruptedException = e4;
                                                    throw interruptedException;
                                                } catch (java.lang.Throwable th23) {
                                                    th3 = th23;
                                                    exec.destroy();
                                                    throw th3;
                                                }
                                            }
                                            r4 = str6;
                                        } catch (java.lang.InterruptedException e5) {
                                            e = e5;
                                            interruptedException = e;
                                            throw interruptedException;
                                        } catch (java.lang.Throwable th24) {
                                            th = th24;
                                            th3 = th;
                                            exec.destroy();
                                            throw th3;
                                        }
                                    } catch (java.lang.InterruptedException e6) {
                                        e = e6;
                                    } catch (java.lang.Throwable th25) {
                                        th = th25;
                                    }
                                } catch (java.io.IOException unused13) {
                                    str5 = intern2;
                                    r12 = obj;
                                    r4 = str6;
                                    r36 = r36;
                                } catch (java.lang.Exception unused14) {
                                    java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                    a(new int[]{94, 27, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001", false, objArr11222);
                                    throw new java.io.IOException(((java.lang.String) objArr11222[0]).intern());
                                }
                            }
                        } else {
                            obj3 = r1;
                            i9 = length;
                            r36 = r4;
                            str5 = intern2;
                            r12 = obj;
                            r4 = str4;
                        }
                        str4 = r4;
                        obj = r12;
                        length = i9;
                        intern2 = str5;
                        r4 = (r36 == true ? 1 : 0) + 1;
                        r1 = obj3;
                        r36 = r36;
                    }
                    str = str4;
                } else {
                    num = 269015277;
                    str = -1347122530;
                    num2 = num3;
                }
                java.lang.Object[] objArr119 = {new int[]{i14}, new int[]{i14}, null, null, new int[1]};
                int i38 = ~i14;
                java.lang.Object[] objArr120 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~(261039916 | i38)) * (-560)) + 2073717128 + ((~((-542136401) | i14)) * (-560)) + (((~(i38 | 769096028)) | 34080288) * 560))};
                java.lang.Object obj80 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                java.lang.Object obj81 = obj80;
                if (obj80 == null) {
                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.text.TextUtils.getTrimmedLength(""));
                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                    c((short) 653, (byte) (-$$a[52]), 34, objArr121);
                    java.lang.reflect.Method method33 = cls42.getMethod((java.lang.String) objArr121[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, method33);
                    obj81 = method33;
                }
                c = 0;
                ((int[]) objArr119[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj81).invoke(null, objArr120)).intValue();
                objArr = objArr119;
                i4 = 1;
                if (((int[]) objArr[i4])[c] == i14) {
                }
            } catch (java.lang.Throwable th26) {
                java.lang.Throwable cause7 = th26.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th26;
            }
            r12 = obj5;
            r4 = str6;
            str4 = r4;
            obj = r12;
            length = i9;
            intern2 = str5;
            r4 = (r36 == true ? 1 : 0) + 1;
            r1 = obj3;
            r36 = r36;
            try {
                try {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.combineMeasuredStates(0, 0), 1507 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    byte[] bArr5 = $$a;
                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                    c((short) 650, bArr5[2], bArr5[18], objArr122);
                    sb2.append(cls43.getField((java.lang.String) objArr122[0]).get(newInstance).toString());
                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, android.view.MotionEvent.axisFromString("") + 1508, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                    c((short) 650, bArr5[2], bArr5[18], objArr123);
                    sb2.append(cls44.getField((java.lang.String) objArr123[0]).get(newInstance2).toString());
                    java.lang.String obj82 = sb2.toString();
                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                    a(new int[]{84, 1, 8, 1}, null, true, objArr124);
                    java.lang.String[] split2 = obj82.split(((java.lang.String) objArr124[0]).intern());
                    length2 = split2.length;
                    i10 = 0;
                    while (i10 < length2) {
                        java.lang.String str19 = split2[i10];
                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                        a(new int[]{121, 19, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", false, objArr125);
                        if (!str19.startsWith(((java.lang.String) objArr125[0]).intern())) {
                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                            b("帔ﰐ钴㸸蟥\uef39雐◑눛惸혫탺峅엣鸶뿛ﵖ⅐掇\ue042", android.graphics.Color.argb(0, 0, 0, 0) + 20, objArr126);
                            if (str19.startsWith(((java.lang.String) objArr126[0]).intern())) {
                                continue;
                            } else {
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                b("帔ﰐ钴㸸蟥\uef39雐◑", 9 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr127);
                                if (str19.startsWith(((java.lang.String) objArr127[0]).intern())) {
                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                    a(new int[]{140, 1, 0, 0}, "\u0000", true, objArr128);
                                    ?? split3 = str19.split(((java.lang.String) objArr128[0]).intern());
                                    if (split3.length > 1 && split3[1].equalsIgnoreCase(r9)) {
                                        objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                        java.lang.String str20 = (java.lang.String) java.lang.Class.forName(str5).getField(intern3).get(obj5);
                                        ((int[]) objArr[0])[0] = i14;
                                        ((int[]) objArr[1])[0] = i14 ^ 20;
                                        java.lang.Object[] objArr129 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((-214043176) | r3) * (-220)) - 1463885452) + (((~(816092769 | i14)) | (-1021746792)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 199809516)};
                                        str7 = str6;
                                        java.lang.Object obj83 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str7);
                                        java.lang.Object obj84 = obj83;
                                        if (obj83 == null) {
                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2713 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            java.lang.Object[] objArr130 = new java.lang.Object[1];
                                            c((short) 653, (byte) (-$$a[52]), 34, objArr130);
                                            java.lang.reflect.Method method34 = cls45.getMethod((java.lang.String) objArr130[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str7, method34);
                                            obj84 = method34;
                                        }
                                        ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj84).invoke(null, objArr129)).intValue();
                                        str = str7;
                                        i4 = 1;
                                        c = 0;
                                        if (((int[]) objArr[i4])[c] == i14) {
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        i10++;
                        str6 = str6;
                        obj5 = obj5;
                    }
                } catch (java.io.IOException unused15) {
                }
                r12 = obj5;
                r4 = str6;
                str4 = r4;
                obj = r12;
                length = i9;
                intern2 = str5;
                r4 = (r36 == true ? 1 : 0) + 1;
                r1 = obj3;
                r36 = r36;
            } catch (java.lang.Exception unused16) {
                java.lang.Object[] objArr112222 = new java.lang.Object[1];
                a(new int[]{94, 27, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001", false, objArr112222);
                throw new java.io.IOException(((java.lang.String) objArr112222[0]).intern());
            }
            try {
                java.lang.Class<?> cls46 = java.lang.Class.forName(str3);
                java.lang.Object[] objArr131 = new java.lang.Object[1];
                a(new int[]{90, 4, 119, 2}, "\u0000\u0001\u0000\u0001", false, objArr131);
                r6 = ((java.lang.String) objArr131[0]).intern();
                cls46.getMethod(r6, java.lang.Long.TYPE).invoke(newInstance, 100L);
                try {
                    try {
                        java.lang.Class<?> cls47 = java.lang.Class.forName(str3);
                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                        a(new int[]{90, 4, 119, 2}, "\u0000\u0001\u0000\u0001", false, objArr132);
                        r6 = ((java.lang.String) objArr132[0]).intern();
                        cls47.getMethod(r6, java.lang.Long.TYPE).invoke(newInstance2, 10L);
                        try {
                            exec.destroy();
                        } catch (java.io.IOException unused17) {
                            r4 = str6;
                            r12 = obj5;
                            r36 = r36;
                            str4 = r4;
                            obj = r12;
                            length = i9;
                            intern2 = str5;
                            r4 = (r36 == true ? 1 : 0) + 1;
                            r1 = obj3;
                            r36 = r36;
                        } catch (java.lang.Exception unused18) {
                        }
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                        java.lang.Class cls432 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.combineMeasuredStates(0, 0), 1507 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        byte[] bArr52 = $$a;
                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                        c((short) 650, bArr52[2], bArr52[18], objArr1222);
                        sb22.append(cls432.getField((java.lang.String) objArr1222[0]).get(newInstance).toString());
                        java.lang.Class cls442 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, android.view.MotionEvent.axisFromString("") + 1508, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                        c((short) 650, bArr52[2], bArr52[18], objArr1232);
                        sb22.append(cls442.getField((java.lang.String) objArr1232[0]).get(newInstance2).toString());
                        java.lang.String obj822 = sb22.toString();
                        java.lang.Object[] objArr1242 = new java.lang.Object[1];
                        a(new int[]{84, 1, 8, 1}, null, true, objArr1242);
                        java.lang.String[] split22 = obj822.split(((java.lang.String) objArr1242[0]).intern());
                        length2 = split22.length;
                        i10 = 0;
                        while (i10 < length2) {
                        }
                        r12 = obj5;
                        r4 = str6;
                        str4 = r4;
                        obj = r12;
                        length = i9;
                        intern2 = str5;
                        r4 = (r36 == true ? 1 : 0) + 1;
                        r1 = obj3;
                        r36 = r36;
                    } catch (java.lang.Throwable th27) {
                        java.lang.Throwable cause8 = th27.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th27;
                    }
                } catch (java.lang.InterruptedException e7) {
                    interruptedException = e7;
                    throw interruptedException;
                } catch (java.lang.Throwable th28) {
                    th3 = th28;
                    exec.destroy();
                    throw th3;
                }
            } catch (java.lang.Throwable th29) {
                java.lang.Throwable cause9 = th29.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th29;
            }
        } catch (java.lang.Throwable th30) {
            java.lang.Throwable cause10 = th30.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th30;
        }
    }
}
