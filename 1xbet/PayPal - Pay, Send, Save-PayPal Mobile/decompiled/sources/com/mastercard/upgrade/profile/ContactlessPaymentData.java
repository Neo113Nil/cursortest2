package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class ContactlessPaymentData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static int[] writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    private com.payair.hce.isUiContext aid;

    @com.payair.hce.setSelectionFromTop(valueOf = "alternateContactlessPaymentData")
    private com.mastercard.upgrade.profile.AlternateContactlessPaymentData alternateContactlessPaymentData;

    @com.payair.hce.setSelectionFromTop(valueOf = "cdol1RelatedDataLength")
    private int cdol1RelatedDataLength;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    private com.payair.hce.isUiContext ciacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDeclineOnPpms")
    private com.payair.hce.isUiContext ciacDeclineOnPpms;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    private com.payair.hce.isUiContext cvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    private com.payair.hce.isUiContext gpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "iccPrivateKeyCrtComponents")
    private com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    private com.payair.hce.isUiContext issuerApplicationData;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    private com.payair.hce.isUiContext paymentFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinIvCvc3Track2")
    private com.payair.hce.isUiContext pinIvCvc3Track2;

    @com.payair.hce.setSelectionFromTop(valueOf = "ppseFci")
    private com.payair.hce.isUiContext ppseFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "records")
    private com.mastercard.upgrade.profile.Record[] records;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 718 - (s * 653);
        byte[] bArr = $$a;
        int i4 = 38 - (b * 34);
        int i5 = i * 34;
        char[] cArr = new char[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i4++;
            i3 = (i6 + (-i3)) - 2;
            i2 = i7;
            cArr[i2] = (char) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = i3;
            i3 = bArr[i4];
            i4++;
            i3 = (i6 + (-i3)) - 2;
            i2 = i7;
            cArr[i2] = (char) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            cArr[i2] = (char) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i = 66 - (s * 3);
        int i2 = (s2 * 2) + 4;
        byte[] bArr = $$d;
        int i3 = b * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i += i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i += bArr[i2];
                i2++;
            }
        }
    }

    public final com.payair.hce.isUiContext getIssuerApplicationData() {
        int i = DigitizedCardProfile;
        valueOf = (i + 35) % 128;
        com.payair.hce.isUiContext isuicontext = this.issuerApplicationData;
        valueOf = (i + 1) % 128;
        return isuicontext;
    }

    public final void setIssuerApplicationData(com.payair.hce.isUiContext isuicontext) {
        int i = DigitizedCardProfile;
        valueOf = (i + 33) % 128;
        this.issuerApplicationData = isuicontext;
        valueOf = (i + 13) % 128;
    }

    public final com.payair.hce.isUiContext getGpoResponse() {
        int i = DigitizedCardProfile;
        valueOf = (i + 113) % 128;
        com.payair.hce.isUiContext isuicontext = this.gpoResponse;
        valueOf = (i + 79) % 128;
        return isuicontext;
    }

    public final void setGpoResponse(com.payair.hce.isUiContext isuicontext) {
        int i = valueOf;
        DigitizedCardProfile = (i + 81) % 128;
        this.gpoResponse = isuicontext;
        int i2 = i + 113;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final int getCdol1RelatedDataLength() {
        int i = DigitizedCardProfile;
        valueOf = (i + 53) % 128;
        int i2 = this.cdol1RelatedDataLength;
        int i3 = i + 121;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = writeReplace;
        float f = 0.0f;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            $10 = ($11 + 9) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                $11 = ($10 + 23) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i4] = java.lang.Integer.valueOf(iArr3[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 26, android.view.View.resolveSizeAndState(i4, i4, i4) + 29, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    f = 0.0f;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = writeReplace;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            $10 = ($11 + 15) % 128;
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $10 + i3;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[i3];
                    objArr3[0] = java.lang.Integer.valueOf(iArr6[i6]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        i2 = length3;
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 29 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    } else {
                        i2 = length3;
                    }
                    iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                } else {
                    i2 = length3;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i6])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        iArr2 = iArr6;
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 27, 29 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.resolveSize(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    i6++;
                    iArr6 = iArr2;
                }
                length3 = i2;
                i3 = 1;
            }
            int i8 = $10 + 55;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 4;
            }
            iArr6 = iArr7;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i10];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 31, 5087 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i10++;
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 49, android.view.Gravity.getAbsoluteGravity(0, 0) + 2923, (char) (3037 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((short) 0, (short) 0, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            c = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final void setCdol1RelatedDataLength(int i) {
        int i2 = valueOf + 91;
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        if (i2 % 2 != 0) {
            this.cdol1RelatedDataLength = i;
            valueOf = (i3 + 17) % 128;
        } else {
            this.cdol1RelatedDataLength = i;
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.isUiContext getCiacDecline() {
        int i = valueOf + 125;
        int i2 = i % 128;
        DigitizedCardProfile = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.isUiContext isuicontext = this.ciacDecline;
        int i3 = i2 + 97;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setCiacDecline(com.payair.hce.isUiContext isuicontext) {
        int i = valueOf + 59;
        int i2 = i % 128;
        DigitizedCardProfile = i2;
        if (i % 2 != 0) {
            this.ciacDecline = isuicontext;
            int i3 = i2 + 91;
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.ciacDecline = isuicontext;
        throw null;
    }

    public final com.payair.hce.isUiContext getCiacDeclineOnPpms() {
        int i = DigitizedCardProfile;
        valueOf = (i + 125) % 128;
        com.payair.hce.isUiContext isuicontext = this.ciacDeclineOnPpms;
        int i2 = i + 97;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setCiacDeclineOnPpms(com.payair.hce.isUiContext isuicontext) {
        int i = (valueOf + 67) % 128;
        DigitizedCardProfile = i;
        this.ciacDeclineOnPpms = isuicontext;
        int i2 = i + 115;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final com.mastercard.upgrade.profile.AlternateContactlessPaymentData getAlternateContactlessPaymentData() {
        int i = DigitizedCardProfile + 9;
        int i2 = i % 128;
        valueOf = i2;
        if (i % 2 != 0) {
            throw null;
        }
        com.mastercard.upgrade.profile.AlternateContactlessPaymentData alternateContactlessPaymentData = this.alternateContactlessPaymentData;
        int i3 = i2 + 15;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            return alternateContactlessPaymentData;
        }
        throw null;
    }

    public final void setAlternateContactlessPaymentData(com.mastercard.upgrade.profile.AlternateContactlessPaymentData alternateContactlessPaymentData) {
        int i = (valueOf + 117) % 128;
        DigitizedCardProfile = i;
        this.alternateContactlessPaymentData = alternateContactlessPaymentData;
        int i2 = i + 1;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.isUiContext getPaymentFci() {
        int i = (valueOf + 21) % 128;
        DigitizedCardProfile = i;
        com.payair.hce.isUiContext isuicontext = this.paymentFci;
        valueOf = (i + 37) % 128;
        return isuicontext;
    }

    public final void setPaymentFci(com.payair.hce.isUiContext isuicontext) {
        int i = valueOf;
        DigitizedCardProfile = (i + 39) % 128;
        this.paymentFci = isuicontext;
        int i2 = i + 67;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getPpseFci() {
        int i = valueOf + 121;
        DigitizedCardProfile = i % 128;
        com.payair.hce.isUiContext isuicontext = this.ppseFci;
        if (i % 2 != 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setPpseFci(com.payair.hce.isUiContext isuicontext) {
        int i = valueOf;
        int i2 = i + 43;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            this.ppseFci = isuicontext;
            DigitizedCardProfile = (i + 47) % 128;
        } else {
            this.ppseFci = isuicontext;
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getCvrMaskAnd() {
        int i = DigitizedCardProfile + 37;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return this.cvrMaskAnd;
        }
        throw null;
    }

    public final void setCvrMaskAnd(com.payair.hce.isUiContext isuicontext) {
        int i = valueOf + 67;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            this.cvrMaskAnd = isuicontext;
        } else {
            this.cvrMaskAnd = isuicontext;
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.isUiContext getAid() {
        int i = DigitizedCardProfile;
        valueOf = (i + 3) % 128;
        com.payair.hce.isUiContext isuicontext = this.aid;
        valueOf = (i + 49) % 128;
        return isuicontext;
    }

    public final void setAid(com.payair.hce.isUiContext isuicontext) {
        int i = DigitizedCardProfile;
        int i2 = i + 49;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            this.aid = isuicontext;
            valueOf = (i + 117) % 128;
        } else {
            this.aid = isuicontext;
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getPinIvCvc3Track2() {
        int i = DigitizedCardProfile;
        valueOf = (i + 31) % 128;
        com.payair.hce.isUiContext isuicontext = this.pinIvCvc3Track2;
        valueOf = (i + 119) % 128;
        return isuicontext;
    }

    public final void setPinIvCvc3Track2(com.payair.hce.isUiContext isuicontext) {
        int i = (valueOf + 83) % 128;
        DigitizedCardProfile = i;
        this.pinIvCvc3Track2 = isuicontext;
        valueOf = (i + 37) % 128;
    }

    public final com.mastercard.upgrade.profile.Record[] getRecords() {
        int i = (DigitizedCardProfile + 5) % 128;
        valueOf = i;
        com.mastercard.upgrade.profile.Record[] recordArr = this.records;
        int i2 = i + 21;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return recordArr;
        }
        throw null;
    }

    public final void setRecords(com.mastercard.upgrade.profile.Record[] recordArr) {
        int i = valueOf + 11;
        int i2 = i % 128;
        DigitizedCardProfile = i2;
        if (i % 2 != 0) {
            this.records = recordArr;
            int i3 = i2 + 81;
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.records = recordArr;
        throw null;
    }

    public final com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents() {
        int i = DigitizedCardProfile;
        valueOf = (i + 63) % 128;
        com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents = this.iccPrivateKeyCrtComponents;
        int i2 = i + 11;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return iccPrivateKeyCrtComponents;
        }
        throw null;
    }

    public final void setIccPrivateKeyCrtComponents(com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents) {
        int i = DigitizedCardProfile;
        int i2 = i + 39;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            this.iccPrivateKeyCrtComponents = iccPrivateKeyCrtComponents;
            valueOf = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            this.iccPrivateKeyCrtComponents = iccPrivateKeyCrtComponents;
            throw new java.lang.ArithmeticException();
        }
    }

    public final boolean isMagstripeDataValid() {
        com.payair.hce.isUiContext isuicontext = this.pinIvCvc3Track2;
        if (isuicontext == null || ((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext))).intValue() != 2) {
            return false;
        }
        int i = (valueOf + 39) % 128;
        DigitizedCardProfile = i;
        com.payair.hce.isUiContext isuicontext2 = this.ciacDeclineOnPpms;
        if (isuicontext2 == null) {
            return false;
        }
        int i2 = i + 37;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext2}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext2))).intValue() != 2) {
                return false;
            }
        } else if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext2}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext2))).intValue() != 2) {
            return false;
        }
        valueOf = (DigitizedCardProfile + 107) % 128;
        return true;
    }

    public final boolean isAlternateAidMchipDataValid() {
        valueOf = (DigitizedCardProfile + 31) % 128;
        com.mastercard.upgrade.profile.AlternateContactlessPaymentData alternateContactlessPaymentData = this.alternateContactlessPaymentData;
        if (alternateContactlessPaymentData == null || alternateContactlessPaymentData.getCiacDecline() == null) {
            return false;
        }
        com.payair.hce.isUiContext ciacDecline = this.alternateContactlessPaymentData.getCiacDecline();
        if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{ciacDecline}, -1438697640, 1438697646, java.lang.System.identityHashCode(ciacDecline))).intValue() != 3 || this.alternateContactlessPaymentData.getCvrMaskAnd() == null) {
            return false;
        }
        com.payair.hce.isUiContext cvrMaskAnd = this.alternateContactlessPaymentData.getCvrMaskAnd();
        if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{cvrMaskAnd}, -1438697640, 1438697646, java.lang.System.identityHashCode(cvrMaskAnd))).intValue() != 6) {
            return false;
        }
        int i = DigitizedCardProfile + 61;
        valueOf = i % 128;
        if (i % 2 == 0) {
            if (!isPrimaryAidMchipDataValid()) {
                return false;
            }
            int i2 = DigitizedCardProfile;
            valueOf = (i2 + 93) % 128;
            valueOf = (i2 + 5) % 128;
            return true;
        }
        isPrimaryAidMchipDataValid();
        throw null;
    }

    public final boolean isPrimaryAidMchipDataValid() {
        com.payair.hce.isUiContext isuicontext;
        com.payair.hce.isUiContext isuicontext2 = this.ciacDecline;
        if (isuicontext2 == null) {
            return false;
        }
        valueOf = (DigitizedCardProfile + 55) % 128;
        if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext2}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext2))).intValue() != 3 || (isuicontext = this.cvrMaskAnd) == null) {
            return false;
        }
        valueOf = (DigitizedCardProfile + 65) % 128;
        if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext))).intValue() != 6) {
            return false;
        }
        int i = DigitizedCardProfile;
        int i2 = i + 73;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.cdol1RelatedDataLength < 52) {
                return false;
            }
        } else if (this.cdol1RelatedDataLength < 45) {
            return false;
        }
        int i3 = i + 53;
        int i4 = i3 % 128;
        valueOf = i4;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.isUiContext isuicontext3 = this.issuerApplicationData;
        if (isuicontext3 == null) {
            return false;
        }
        int i5 = i4 + 83;
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext3}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext3))).intValue() != 121) {
                return false;
            }
        } else if (((java.lang.Integer) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext3}, -1438697640, 1438697646, java.lang.System.identityHashCode(isuicontext3))).intValue() != 18) {
            return false;
        }
        if (this.iccPrivateKeyCrtComponents.getP() == null || this.iccPrivateKeyCrtComponents.getQ() == null) {
            return false;
        }
        int i6 = valueOf + 33;
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 == 0) {
            this.iccPrivateKeyCrtComponents.getDp();
            throw null;
        }
        if (this.iccPrivateKeyCrtComponents.getDp() == null || this.iccPrivateKeyCrtComponents.getDq() == null) {
            return false;
        }
        valueOf = (DigitizedCardProfile + 41) % 128;
        return this.iccPrivateKeyCrtComponents.getU() != null;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        DigitizedCardProfile = 1;
        writeReplace = new int[]{-948736174, 278009905, 1450894614, 1617852318, -344121965, 1556375079, 211598755, 1654482437, 1546374423, -2025960054, -41505612, 574422676, -292313413, -1142437676, -1833979301, -677762455, 1054231639, -1405567322};
    }

    static void init$1() {
        $$d = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{64, -23, -58, -30, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:35|36|(1:38)(4:82|83|84|(11:86|40|41|(1:43)(11:52|53|54|55|(2:57|(1:59)(5:60|61|62|63|(6:66|67|(1:69)|70|71|72)))|45|46|(1:48)|49|50|51)|44|45|46|(0)|49|50|51)(1:87))|39|40|41|(0)(0)|44|45|46|(0)|49|50|51) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02c7 A[Catch: all -> 0x084e, TRY_ENTER, TryCatch #8 {all -> 0x084e, blocks: (B:20:0x02c7, B:22:0x02d6, B:23:0x0311, B:27:0x03c0, B:29:0x040e, B:30:0x045e, B:67:0x06b5, B:69:0x06ff, B:70:0x0756, B:46:0x0797, B:48:0x07e0, B:49:0x0839, B:94:0x048b, B:96:0x04cc, B:97:0x051e, B:121:0x022a, B:123:0x0266, B:124:0x02ac, B:3:0x001a, B:5:0x0057, B:9:0x0087, B:15:0x013d, B:101:0x0146, B:103:0x014c, B:104:0x014d, B:7:0x014e, B:106:0x0154, B:113:0x0203, B:116:0x020c, B:118:0x0212, B:119:0x0213, B:11:0x00a2, B:13:0x00e8, B:14:0x0131, B:109:0x016e, B:111:0x01ad, B:112:0x01f7), top: B:2:0x001a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x07e0 A[Catch: all -> 0x084e, TryCatch #8 {all -> 0x084e, blocks: (B:20:0x02c7, B:22:0x02d6, B:23:0x0311, B:27:0x03c0, B:29:0x040e, B:30:0x045e, B:67:0x06b5, B:69:0x06ff, B:70:0x0756, B:46:0x0797, B:48:0x07e0, B:49:0x0839, B:94:0x048b, B:96:0x04cc, B:97:0x051e, B:121:0x022a, B:123:0x0266, B:124:0x02ac, B:3:0x001a, B:5:0x0057, B:9:0x0087, B:15:0x013d, B:101:0x0146, B:103:0x014c, B:104:0x014d, B:7:0x014e, B:106:0x0154, B:113:0x0203, B:116:0x020c, B:118:0x0212, B:119:0x0213, B:11:0x00a2, B:13:0x00e8, B:14:0x0131, B:109:0x016e, B:111:0x01ad, B:112:0x01f7), top: B:2:0x001a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05f2 A[Catch: Exception -> 0x077b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x077b, blocks: (B:41:0x05bd, B:52:0x05f2, B:55:0x0622, B:57:0x062a, B:60:0x0659, B:63:0x068a, B:75:0x076c, B:76:0x0772, B:79:0x0774, B:80:0x077a, B:54:0x05fc, B:62:0x0663), top: B:40:0x05bd, inners: #0, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        int i3;
        java.io.File file2;
        java.lang.String[] strArr;
        int i4;
        int i5;
        valueOf = (DigitizedCardProfile + 93) % 128;
        int i6 = 8;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{-118927595, -206518720, 684944098, 211988641, -1280667616, -2053915772, -8708673, -186745315, 458568646, -1426176569}, 19 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new int[]{1894602423, -875005052, 475265761, 1205417826, -466069519, -1772722542, 684944098, 211988641, -1074337791, -1236192798}, 18 - android.view.View.combineMeasuredStates(0, 0), objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
                i4 = 0;
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-530900202) | i)) | 65404422) * 398) - 1799177486) + (((~((-530900202) | (~i))) | 65404422) * 398))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b = (byte) (-$$a[14]);
                    byte b2 = b;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b, b2, b2, objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                while (i4 < 2) {
                    java.lang.String str2 = strArr[i4];
                    int[] iArr = new int[i6];
                    // fill-array-data instruction
                    iArr[0] = 1272586709;
                    iArr[1] = 1213109634;
                    iArr[2] = 630197788;
                    iArr[3] = 8081577;
                    iArr[4] = -49841907;
                    iArr[5] = -1216419457;
                    iArr[6] = 509734464;
                    iArr[7] = 300879981;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(iArr, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~(1003880404 | i)) * (-301)) + 1115011816 + (((~((-466974869) | i)) | (~((~i) | 537954116))) * (-301)) + (((~((-537954117) | i)) | (-466974869)) * 301))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2713 - android.graphics.Color.red(0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b3 = (byte) (-$$a[14]);
                                byte b4 = b3;
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b3, b4, b4, objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.red(0), android.view.View.MeasureSpec.getSize(0) + 2391, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29421));
                                byte b5 = (byte) ($$a[14] + 1);
                                byte b6 = b5;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b5, b6, b6, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = i;
                            long j2 = ~j;
                            long j3 = (565 * longValue) + 123511078498L + (((~((~longValue) | j2)) | 219380245 | (~(longValue | j))) * (-564)) + ((~(j | longValue | 219380245)) * 1128) + ((((longValue | (-219380246)) ^ (-1)) | (~(j2 | 219380245))) * 564) + 501464342;
                            int i7 = (int) (j3 >> 32);
                            int i8 = ~i;
                            if (((i7 & (((((~(489370898 | i8)) | 947855512) * (-1042)) - 210458272) + ((489370898 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-947855513) | i)) | 405479440 | (~(1031746970 | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) j3) & ((((((-941808921) | r5) * (-220)) - 1657873861) + (((~(1915931965 | i)) | (-2050153790)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 756617242))) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-987766454) | i8)) | 987766420 | (~(17162531 | i8))) * 464) + 1616275256 + ((i | (-34)) * (-464)) + (((~(17162531 | i)) | 987766420) * 464))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", ""), android.graphics.Color.blue(0) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                    byte b7 = (byte) (-$$a[14]);
                                    byte b8 = b7;
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b7, b8, b8, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(128112742 | i8)) | (-937688951)) * (-160)) - 2019617352) + (((~((-876816243) | i8)) | 128112742) * 160))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    byte b9 = (byte) (-$$a[14]);
                                    byte b10 = b9;
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b9, b10, b10, objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue2;
                            }
                            if (i != ((int[]) objArr2[1])[c]) {
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(new int[]{-1630848626, -1812963041, 62238281, 34377969, -77826854, -252435164, -1418703599, -699027975, -227100049, 803578897, 1037692765, 1840257043, 2002162356, -956985377, 1451000870, 128491402, 1481013352, -2006772982, 251263660, 1970990297}, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a(new int[]{837768608, 1160000806}, 3 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a(new int[]{-1580214737, 528089716, -405158414, -585095175, -1709399858, 1888642216, 1226455040, -316775663, 1318292860, 552273638, 1543350067, 116096999, 195613578, 360899253, 1479938145, -1330101380}, 32 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(new int[]{-470114794, 898683364}, android.view.View.resolveSizeAndState(0, 0, 0) + 1, objArr18);
                                                if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a(new int[]{-1630848626, -1812963041, 62238281, 34377969, -77826854, -252435164, -1418703599, -699027975, -227100049, 803578897, 1037692765, 1840257043, -227100049, 803578897, 1037692765, 1840257043, 516446367, -4027183}, 37 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a(new int[]{-470114794, 898683364}, '1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr20);
                                                            if (readLine2.equals(((java.lang.String) objArr20[0]).intern()) && str != null) {
                                                                valueOf = (DigitizedCardProfile + 103) % 128;
                                                                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(908010496 | i)) | (-96918489)) * (-668)) - 1233356744) + (((~((-96918489) | i)) | 908010496) * 1336) + ((i | (-29416409)) * 668))};
                                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj7 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                                    byte b11 = (byte) (-$$a[14]);
                                                                    byte b12 = b11;
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    b(b11, b12, b12, objArr23);
                                                                    obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                }
                                                                ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                return objArr21;
                                                            }
                                                        } finally {
                                                        }
                                                    } else {
                                                        i3 = DigitizedCardProfile + 19;
                                                    }
                                                }
                                                java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-204604795) | i8)) | r2) * 1150) - 1303619152) + (((~((-800324191) | i)) | (~(800324190 | i8))) * (-575)) + (((~(i | (-204604795))) | (~(204604794 | i8))) * 575))};
                                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj == null) {
                                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                    byte b13 = (byte) (-$$a[14]);
                                                    byte b14 = b13;
                                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                    b(b13, b14, b14, objArr26);
                                                    obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                                }
                                                ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                                return objArr24;
                                            } finally {
                                            }
                                        }
                                        i3 = DigitizedCardProfile + 77;
                                        valueOf = i3 % 128;
                                        java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-204604795) | i8)) | r2) * 1150) - 1303619152) + (((~((-800324191) | i)) | (~(800324190 | i8))) * (-575)) + (((~(i | (-204604795))) | (~(204604794 | i8))) * 575))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                        }
                                        ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                                        return objArr242;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                valueOf = (DigitizedCardProfile + 95) % 128;
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a(new int[]{-1580214737, 528089716, -405158414, -585095175, -1709399858, 1888642216, 1226455040, -316775663, 1318292860, 552273638, 1543350067, 116096999, 195613578, 360899253, 1479938145, -1330101380}, 32 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            valueOf = i3 % 128;
                            java.lang.Object[] objArr2422 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr2522 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-204604795) | i8)) | r2) * 1150) - 1303619152) + (((~((-800324191) | i)) | (~(800324190 | i8))) * (-575)) + (((~(i | (-204604795))) | (~(204604794 | i8))) * 575))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr2422[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2522)).intValue();
                            return objArr2422;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    i4++;
                    i6 = 8;
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-628353937) | i5)) | (~(376575048 | i))) * 959) + 67144927 + (((~(i5 | 376575048)) | (~((-628353937) | i))) * 959))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b15 = (byte) (-$$a[14]);
                    byte b16 = b15;
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b15, b16, b16, objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
            i5 = ~i;
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
