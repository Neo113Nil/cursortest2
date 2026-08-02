package com.payair.hce;

/* loaded from: classes4.dex */
public class CmsDSessionData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static long getPaymentFci;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private boolean IccPrivateKeyCrtComponentsJson;
    private java.lang.String RecordsJson;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getTransactionCredentials SdkCoreBusinessLogicModuleImpl;
    private java.lang.String getAid;
    private java.lang.String getProfileVersion;
    private java.lang.String valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        byte b2;
        int i2;
        int i3;
        ?? r8 = (b * 34) + 4;
        int i4 = 35 - (s * 2);
        byte[] bArr = $$a;
        char[] cArr = new char[i4];
        ?? r9 = s2 + 65;
        if (bArr == null) {
            byte b3 = r9;
            i3 = 0;
            byte b4 = r8;
            int i5 = r8;
            ?? r92 = (b4 + b3) - 2;
            i = i3;
            i2 = i5 + 1;
            b2 = r92;
            byte b5 = b2;
            int i6 = i2;
            i3 = i + 1;
            cArr[i] = (char) b5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            b3 = bArr[i6];
            b4 = b5;
            i5 = i6;
            ?? r922 = (b4 + b3) - 2;
            i = i3;
            i2 = i5 + 1;
            b2 = r922;
            byte b52 = b2;
            int i62 = i2;
            i3 = i + 1;
            cArr[i] = (char) b52;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            b2 = r9;
            byte b522 = b2;
            int i622 = i2;
            i3 = i + 1;
            cArr[i] = (char) b522;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 3 - (s * 2);
        int i6 = (s2 * 4) + 1;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i3 = i5;
            int i7 = i6;
            i4 = 0;
            i5 += i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i5 += i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i4 == i6) {
            }
        } else {
            int i8 = (i * 4) + 99;
            i2 = 0;
            i3 = i5;
            i5 = i8;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i4 == i6) {
            }
        }
    }

    public CmsDSessionData() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.graphics.Color.rgb(0, 0, 0) + 16777216, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2, objArr);
        this.DigitizedCardProfile = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(2 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (46374 - android.text.TextUtils.indexOf("", "", 0, 0)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr2);
        this.values = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(6 - android.graphics.Color.argb(0, 0, 0, 0), (char) (36005 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), 18 - android.graphics.Color.red(0), objArr3);
        this.AlternateContactlessPaymentDataJson = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(24 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 32, objArr4);
        this.valueOf = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(56 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 32 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr5);
        this.getAid = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", "", 0, 0) + 88, (char) (4728 - android.view.KeyEvent.getDeadChar(0, 0)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 32, objArr6);
        this.RecordsJson = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(android.text.TextUtils.getCapsMode("", 0, 0) + 120, (char) (52729 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, objArr7);
        this.getProfileVersion = ((java.lang.String) objArr7[0]).intern();
        this.IccPrivateKeyCrtComponentsJson = true;
        this.SdkCoreAlternateContactlessPaymentDataImpl = true;
        this.SdkCoreBusinessLogicModuleImpl = new com.payair.hce.ReplenishRequestEncrypted();
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $10 + 21;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getCiacDecline[i % getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 381 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (62388 - android.view.View.MeasureSpec.getMode(0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getPaymentFci), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 35, android.view.View.resolveSizeAndState(0, 0, 0) + 3966, (char) (40223 - android.view.KeyEvent.normalizeMetaState(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 34, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getCiacDecline[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 48, android.graphics.Color.blue(0) + 381, (char) ((android.os.Process.myPid() >> 22) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c((short) 0, 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getPaymentFci), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 36, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3966, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 34, 211 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.os.Process.myTid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 87) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 115;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", ""), 212 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, 212 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public com.payair.hce.CmsDSessionData values(java.lang.String str) {
        int i;
        int i2;
        int i3 = getCvrMaskAnd + 67;
        getGpoResponse = i3 % 128;
        if (i3 % 2 != 0) {
            this.AlternateContactlessPaymentDataJson = str;
            this.writeReplace = getAid(str);
            i = 5;
            i2 = 6;
        } else {
            this.AlternateContactlessPaymentDataJson = str;
            this.writeReplace = getAid(str);
            i = 20;
            i2 = 22;
        }
        this.DigitizedCardProfile = str.substring(i, i2);
        getCvrMaskAnd = (getGpoResponse + 35) % 128;
        return this;
    }

    public com.payair.hce.CmsDSessionData DigitizedCardProfile(java.lang.String str) {
        int i = getGpoResponse;
        getCvrMaskAnd = (i + 95) % 128;
        this.getProfileVersion = str;
        int i2 = i + 125;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.payair.hce.CmsDSessionData DigitizedCardProfile() {
        int i = (getCvrMaskAnd + 23) % 128;
        getGpoResponse = i;
        this.IccPrivateKeyCrtComponentsJson = false;
        int i2 = i + 91;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.payair.hce.CmsDSessionData values() {
        int i = getCvrMaskAnd + 107;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            this.IccPrivateKeyCrtComponentsJson = false;
            return this;
        }
        this.IccPrivateKeyCrtComponentsJson = false;
        return this;
    }

    public com.payair.hce.CmsDSessionData AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = getCvrMaskAnd + 113;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            this.values = str;
            return this;
        }
        this.values = str;
        throw null;
    }

    public com.payair.hce.CmsDSessionData writeReplace(java.lang.String str) {
        int i = getCvrMaskAnd;
        getGpoResponse = (i + 71) % 128;
        this.valueOf = str;
        int i2 = i + 63;
        getGpoResponse = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public com.payair.hce.CmsDSessionData valueOf(java.lang.String str) {
        int i = getCvrMaskAnd + 45;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            this.getAid = str;
            return this;
        }
        this.getAid = str;
        throw null;
    }

    public com.payair.hce.CmsDSessionData SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        int i = getCvrMaskAnd + 77;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            this.RecordsJson = str;
            return this;
        }
        this.RecordsJson = str;
        throw null;
    }

    public com.payair.hce.CmsDSessionData writeReplace() {
        this.SdkCoreBusinessLogicModuleImpl = new com.payair.hce.ReplenishRequestEncrypted();
        getGpoResponse = (getCvrMaskAnd + 57) % 128;
        return this;
    }

    public com.payair.hce.CmsDSessionData IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        getCvrMaskAnd = (getGpoResponse + 41) % 128;
        this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.getDsrpUmdSingleUseKey.writeReplace(str);
        int i = getGpoResponse + 29;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.payair.hce.CmsDSessionData getProfileVersion(java.lang.String str) {
        int i = getGpoResponse + 1;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.getContactlessUmdSessionKey.AlternateContactlessPaymentDataJson(str);
            return this;
        }
        this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.getContactlessUmdSessionKey.AlternateContactlessPaymentDataJson(str);
        throw null;
    }

    public com.payair.hce.CmsDSessionData writeReplace(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        getCvrMaskAnd = (getGpoResponse + 73) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 126, (char) (201 - android.text.TextUtils.getTrimmedLength("")), 19 - android.text.TextUtils.indexOf("", ""), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = (getGpoResponse + 97) % 128;
        getCvrMaskAnd = i;
        int i2 = i + 3;
        getGpoResponse = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(intern));
            }
            java.lang.Class[] clsArr = new java.lang.Class[0];
            clsArr[1] = java.lang.String.class;
            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(clsArr).newInstance(intern));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public com.payair.hce.CmsDSessionData RecordsJson(final java.lang.String str) {
        this.SdkCoreBusinessLogicModuleImpl = new com.payair.hce.getTransactionCredentials() { // from class: com.payair.hce.CmsDSessionData.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int DigitizedCardProfile;
            private static int valueOf;
            private static int[] writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
                int i;
                int i2;
                int i3;
                int i4 = (b * 4) + 1;
                byte[] bArr = $$a;
                int i5 = b3 + 4;
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    int i6 = i4;
                    i2 = i5;
                    i3 = 0;
                    i5 += -i6;
                    i = i3;
                    i3 = i + 1;
                    bArr2[i] = (byte) i5;
                    i2++;
                    if (i3 == i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i6 = bArr[i2];
                    i5 += -i6;
                    i = i3;
                    i3 = i + 1;
                    bArr2[i] = (byte) i5;
                    i2++;
                    if (i3 == i4) {
                    }
                } else {
                    i = 0;
                    i5 = 66 - (b2 * 4);
                    i2 = i5;
                    i3 = i + 1;
                    bArr2[i] = (byte) i5;
                    i2++;
                    if (i3 == i4) {
                    }
                }
            }

            private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
                int[] iArr2;
                int[] iArr3;
                com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr4 = writeReplace;
                int i2 = 1;
                int i3 = 0;
                if (iArr4 != null) {
                    $11 = ($10 + 79) % 128;
                    int length = iArr4.length;
                    int[] iArr5 = new int[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[i2];
                            objArr2[i3] = java.lang.Integer.valueOf(iArr4[i4]);
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                            if (obj == null) {
                                iArr3 = iArr4;
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.getDeadChar(i3, i3), android.text.TextUtils.getTrimmedLength("") + 29, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("z", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                            } else {
                                iArr3 = iArr4;
                            }
                            iArr5[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                            i4++;
                            iArr4 = iArr3;
                            i2 = 1;
                            i3 = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr4 = iArr5;
                }
                int length2 = iArr4.length;
                int[] iArr6 = new int[length2];
                int[] iArr7 = writeReplace;
                if (iArr7 != null) {
                    int length3 = iArr7.length;
                    int[] iArr8 = new int[length3];
                    $11 = ($10 + 9) % 128;
                    int i5 = 0;
                    while (i5 < length3) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr7[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj2 == null) {
                            iArr2 = iArr7;
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 29, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                        } else {
                            iArr2 = iArr7;
                        }
                        iArr8[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                        i5++;
                        iArr7 = iArr2;
                    }
                    iArr7 = iArr8;
                }
                char c = 0;
                java.lang.System.arraycopy(iArr7, 0, iArr6, 0, length2);
                istransitsupported.valueOf = 0;
                while (istransitsupported.valueOf < iArr.length) {
                    cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
                    cArr[1] = (char) iArr[istransitsupported.valueOf];
                    cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                    cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                    istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                    istransitsupported.values = (cArr[2] << 16) + cArr[3];
                    com.payair.hce.isTransitSupported.values(iArr6);
                    int i6 = $10 + 73;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 2;
                    }
                    for (int i8 = 0; i8 < 16; i8++) {
                        istransitsupported.DigitizedCardProfile ^= iArr6[i8];
                        java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 5088 - android.view.View.MeasureSpec.getSize(0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                        istransitsupported.DigitizedCardProfile = istransitsupported.values;
                        istransitsupported.values = intValue;
                    }
                    int i9 = istransitsupported.DigitizedCardProfile;
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = i9;
                    istransitsupported.values ^= iArr6[16];
                    istransitsupported.DigitizedCardProfile ^= iArr6[17];
                    int i10 = istransitsupported.DigitizedCardProfile;
                    int i11 = istransitsupported.values;
                    cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
                    cArr[1] = (char) istransitsupported.DigitizedCardProfile;
                    cArr[2] = (char) (istransitsupported.values >>> 16);
                    cArr[3] = (char) istransitsupported.values;
                    com.payair.hce.isTransitSupported.values(iArr6);
                    cArr2[istransitsupported.valueOf * 2] = cArr[0];
                    cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
                    cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
                    cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                    if (obj4 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49, 2923 - android.view.View.getDefaultSize(0, 0), (char) (android.graphics.Color.alpha(0) + 3037));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (byte) -1, objArr6);
                        obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                    c = 0;
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            @Override // com.payair.hce.getTransactionCredentials
            public final java.lang.String DigitizedCardProfile(com.payair.hce.ReplenishResponseEncrypted[] replenishResponseEncryptedArr) {
                com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{536534743, 395634754, 450505730, -1534188076}, 8 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
                java.lang.String str2 = str;
                if (str2 != null) {
                    int i = valueOf + 103;
                    DigitizedCardProfile = i % 128;
                    if (i % 2 != 0) {
                        if (!str2.equals("")) {
                            setchilddivider.values(str);
                        }
                    } else {
                        str2.equals("");
                        throw null;
                    }
                }
                java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(replenishResponseEncryptedArr);
                DigitizedCardProfile = (valueOf + 37) % 128;
                return DigitizedCardProfile2;
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                valueOf = 0;
                DigitizedCardProfile = 1;
                writeReplace = new int[]{-390244338, 1836093433, -1307336353, -111854557, -1114797652, 1119869203, -1410713312, -2045297844, -745481410, -1560418873, -221633874, -1234566052, 1041892600, 1868591032, 2053496363, -1206511546, -622300472, -1314895402};
            }

            static void init$0() {
                $$a = new byte[]{92, -126, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5};
                $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            }
        };
        int i = getCvrMaskAnd + 83;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw null;
    }

    public com.payair.hce.CmsDSessionData values(com.payair.hce.getTransactionCredentials gettransactioncredentials) {
        int i = getGpoResponse + 59;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            this.SdkCoreBusinessLogicModuleImpl = gettransactioncredentials;
            return this;
        }
        this.SdkCoreBusinessLogicModuleImpl = gettransactioncredentials;
        throw null;
    }

    public java.lang.String writeReplace(int i) {
        getGpoResponse = (getCvrMaskAnd + 89) % 128;
        java.lang.String DigitizedCardProfile = this.SdkCoreBusinessLogicModuleImpl.DigitizedCardProfile(AlternateContactlessPaymentDataJson(i, i + 1));
        getCvrMaskAnd = (getGpoResponse + 23) % 128;
        return DigitizedCardProfile;
    }

    public com.payair.hce.ReplenishResponseEncrypted[] AlternateContactlessPaymentDataJson(int i, int i2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        int i3 = i2;
        getCvrMaskAnd = (getGpoResponse + 111) % 128;
        if (i >= i3 || i < 0) {
            return null;
        }
        com.payair.hce.ReplenishResponseEncrypted[] replenishResponseEncryptedArr = new com.payair.hce.ReplenishResponseEncrypted[i3 - i];
        com.payair.hce.setSessionCode setsessioncode = new com.payair.hce.setSessionCode();
        ((com.payair.hce.setSessionCode) com.payair.hce.setSessionCode.values(new java.lang.Object[]{setsessioncode, this.writeReplace}, -1103722595, 1103722595, java.lang.System.identityHashCode(setsessioncode))).values(this.DigitizedCardProfile);
        java.lang.String DigitizedCardProfile = setsessioncode.valueOf(this.valueOf).DigitizedCardProfile();
        java.lang.String DigitizedCardProfile2 = setsessioncode.valueOf(this.getAid).DigitizedCardProfile();
        java.lang.String DigitizedCardProfile3 = setsessioncode.valueOf(this.RecordsJson).DigitizedCardProfile();
        setsessioncode.values(valueOf());
        java.lang.String DigitizedCardProfile4 = setsessioncode.valueOf(this.valueOf).DigitizedCardProfile();
        java.lang.String DigitizedCardProfile5 = setsessioncode.valueOf(this.getAid).DigitizedCardProfile();
        int i4 = i;
        while (i4 < i3) {
            com.payair.hce.getResponseId getresponseid = new com.payair.hce.getResponseId();
            java.lang.String hexString = java.lang.Integer.toHexString(i4);
            while (hexString.length() < 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(145 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (9248 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), android.view.View.getDefaultSize(0, 0) + 1, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(hexString);
                hexString = sb.toString();
            }
            if (hexString.length() != 4) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(android.view.Gravity.getAbsoluteGravity(0, 0) + 146, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 19, objArr2);
                throw new java.lang.AssertionError(((java.lang.String) objArr2[0]).intern());
            }
            getresponseid.AlternateContactlessPaymentDataJson(hexString);
            java.lang.String writeReplace = getresponseid.writeReplace(DigitizedCardProfile4).writeReplace();
            java.lang.String writeReplace2 = getresponseid.writeReplace(DigitizedCardProfile5).writeReplace();
            java.lang.String AlternateContactlessPaymentDataJson = getresponseid.writeReplace(DigitizedCardProfile3).AlternateContactlessPaymentDataJson();
            if (this.IccPrivateKeyCrtComponentsJson) {
                getGpoResponse = (getCvrMaskAnd + 59) % 128;
                str = DigitizedCardProfile5;
                java.lang.String values = getresponseid.writeReplace(DigitizedCardProfile).values(this.values);
                str4 = getresponseid.writeReplace(DigitizedCardProfile2).values(this.values);
                str3 = values;
                str2 = DigitizedCardProfile3;
            } else {
                str = DigitizedCardProfile5;
                str2 = DigitizedCardProfile3;
                str3 = null;
                str4 = null;
            }
            if (this.SdkCoreAlternateContactlessPaymentDataImpl) {
                str6 = getresponseid.writeReplace(DigitizedCardProfile).writeReplace();
                str7 = getresponseid.writeReplace(DigitizedCardProfile2).writeReplace();
                str5 = DigitizedCardProfile;
            } else {
                str5 = DigitizedCardProfile;
                str6 = null;
                str7 = null;
            }
            com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = new com.payair.hce.ReplenishResponseEncrypted();
            java.lang.String str8 = DigitizedCardProfile2;
            com.payair.hce.getIccKek geticckek = new com.payair.hce.getIccKek();
            geticckek.writeReplace(hexString);
            geticckek.RecordsJson(AlternateContactlessPaymentDataJson);
            geticckek.DigitizedCardProfile(str3);
            geticckek.values(writeReplace);
            com.payair.hce.getIccKek.DigitizedCardProfile(new java.lang.Object[]{geticckek, str6}, -1394939859, 1394939859, java.lang.System.identityHashCode(geticckek));
            geticckek.AlternateContactlessPaymentDataJson(str4);
            com.payair.hce.getIccKek.DigitizedCardProfile(new java.lang.Object[]{geticckek, writeReplace2}, 448933053, -448933050, java.lang.System.identityHashCode(geticckek));
            geticckek.IccPrivateKeyCrtComponentsJson(str7);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(164 - (android.os.Process.myPid() >> 22), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45801), 2 - (android.os.Process.myPid() >> 22), objArr3);
            geticckek.getAid(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(android.view.View.getDefaultSize(0, 0) + 166, (char) (38608 - android.view.KeyEvent.normalizeMetaState(0)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, objArr4);
            geticckek.valueOf(((java.lang.String) objArr4[0]).intern());
            com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted, geticckek}, 155339212, -155339212, java.lang.System.identityHashCode(replenishResponseEncrypted));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.AlternateContactlessPaymentDataJson);
            sb2.append(hexString);
            sb2.append(this.getProfileVersion);
            com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted, sb2.toString()}, -2115919000, 2115919003, java.lang.System.identityHashCode(replenishResponseEncrypted));
            replenishResponseEncryptedArr[i4 - i] = replenishResponseEncrypted;
            i4++;
            i3 = i2;
            DigitizedCardProfile5 = str;
            DigitizedCardProfile3 = str2;
            DigitizedCardProfile = str5;
            DigitizedCardProfile2 = str8;
        }
        return replenishResponseEncryptedArr;
    }

    private java.lang.String valueOf() {
        getCvrMaskAnd = (getGpoResponse + 73) % 128;
        if (this.DigitizedCardProfile.length() == 2) {
            int intValue = java.lang.Integer.valueOf(this.DigitizedCardProfile.substring(0, 1)).intValue();
            int intValue2 = java.lang.Integer.valueOf(this.DigitizedCardProfile.substring(1, 2)).intValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((intValue + 5) % 10);
            sb.append((intValue2 + 5) % 10);
            java.lang.String obj = sb.toString();
            int i = getCvrMaskAnd + 73;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                return obj;
            }
            throw null;
        }
        int i2 = getGpoResponse + 37;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String DigitizedCardProfile(int i, int i2) {
        int i3 = getCvrMaskAnd + 33;
        getGpoResponse = i3 % 128;
        if (i3 % 2 != 0) {
            this.SdkCoreBusinessLogicModuleImpl.DigitizedCardProfile(AlternateContactlessPaymentDataJson(i, i2));
            throw null;
        }
        java.lang.String DigitizedCardProfile = this.SdkCoreBusinessLogicModuleImpl.DigitizedCardProfile(AlternateContactlessPaymentDataJson(i, i2));
        int i4 = getCvrMaskAnd + 109;
        getGpoResponse = i4 % 128;
        if (i4 % 2 == 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    public com.payair.hce.ReplenishResponseEncrypted AlternateContactlessPaymentDataJson(int i) {
        int i2 = getGpoResponse + 115;
        getCvrMaskAnd = i2 % 128;
        com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = i2 % 2 == 0 ? AlternateContactlessPaymentDataJson(i, i)[0] : AlternateContactlessPaymentDataJson(i, i + 1)[0];
        getGpoResponse = (getCvrMaskAnd + 105) % 128;
        return replenishResponseEncrypted;
    }

    private java.lang.String getAid(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int i2 = getGpoResponse;
            getCvrMaskAnd = (i2 + 23) % 128;
            if (i >= 19) {
                break;
            }
            int i3 = i2 + 31;
            getCvrMaskAnd = i3 % 128;
            if (i3 % 2 == 0) {
                if (str.charAt(i) == '7') {
                    break;
                }
                sb.append(str.charAt(i));
            } else {
                if (str.charAt(i) == 'F') {
                    break;
                }
                sb.append(str.charAt(i));
            }
        }
        java.lang.String obj = sb.toString();
        getCvrMaskAnd = (getGpoResponse + 27) % 128;
        return obj;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        char[] cArr = new char[1874];
        java.nio.ByteBuffer.wrap("^\u009fr6ë¸Ç\u0013²ênEÒLþä\u008b\u001cW´`\u009a\rsÙÊê¢·zCÒlª9\u0002ÅÚ\u0096²£\nOâ\u0018º%\u0012^\u0096rB\u0007ÎÛbì=\u0081×Ukf\u0004;ÞÏtàyµ I|\u001a\u0016/§Ã6\u0094l©Å}H\u000eî#Í÷^\u0088ï]õq+\u0002þ×\u0087ë!¼\u008eQãe-6Î^ìrE\u0007ÈÛnìM\u0081ÞUofu;«Ï~à\u0007µ¡I\u000e\u001ac/\u00adÃN\u0094\u0016©Â}N\u000eâ#½÷W\u0088ë]\u0084q^\u0002ô×ùë ¼üQ\u0096e'6¶Lî`K\u0015ÄÉ\u001bþD\u0093ÝG\u0011t\r)¦Ý\nòw§Û[\u0000\b\u001c=¤ÑM\u0086\u0012»Êo3\u001c\u009f1ÀåY\u009a\u0093OÿcU\u0010\u008aÅ\u0086ù-®ñC\u009dw_$¿\u0093d¿ÎÊ7\u0016\u009c!ÅL/^(r¡\u0007BÛ¾ì¯\u0081CUæf\u0092;CÏãà\u0093µ0Iò\u001a\u008b/2Ã\u009e\u0094\u009f©+}Âz¿^æri\u0007\u0089Û6ìc\u0081\u008eU;f\u0017;®Ï\u0013à|µ·I\u0003\u001aB/ñÃ\u0010\u0094[©ïìvÀÕÈOäç^\u0080rc\u0007\u009aÛ!ì \u0081\u0080U0f[;\u008bÏ!àVµäI'\u001ax/þÃ\u0013\u0094K©õ}\u001a\u000e¤#ü÷8\u0088¬]Çq\u000e\u0002¤×Út¯XL-µñ\u000eÆ\u000f«¯\u007f\u001fLt\u0011¤å\u000eÊy\u009fËc\b0W\u0005Àé1¾p\u0083ÍW\u000f$\u009c\tÐÝ:¢\u0093wì[$^\u0080rc\u0007\u009aÛ!ì \u0081\u0080U0f[;\u008bÏ!àVµäI'\u001ax/ìÃ\u000e\u0094A©ä^\u0080rt\u0007\u0086Û$ì \u0081\u008aU0fS;\u009aÏ+àZµ¸I(\u001aH/óÃ\u0013\u0094I©î}\f\u000e¿#Ð÷\u0005\u0088¾]Ãq\u001b\u0002¢×Íën\u0090I¼«ÉB\u0015ý\"éOJ\u009bñ¨ÐõV\u0001ü.\u0099{.ÊRæ°\u0093YOæxò\u0015FÁäò\u0088¯\u0013[åt\u009f!*Ýí^\u0080rt\u0007\u009bÛ4ìn\u0081\u0095U;f\u0018;½Ï\u0001àrµøI9\u001aB/ÛÃ\u0016\u0094[©æ¦G\u008a³ÿA#ã\u0014¼yE\u00adõ\u009eßÃD7é\u0018\u009aM\u007f±äâ\u0089×:;Þl\u008aQn\u0085Ëö\u007f^Írn\u0007\u0098Û9ì`\u0081\u009fÏýã\t\u0096ûJY}\u0006\u0010ÿÄO÷eªð^Sq,$ÅØ\\\u008b?¾\u008fR\u007f\u0005\u00048·ì/\u009fÄ²\u0097fw\u0019×Ìçàq\u0093ÕF¬z\u001e-ÀÀµô\u000e^\u0080rt\u0007\u0086Û$ì{\u0081\u0082U2f\u0018;\u008dÏ.àQµ¸I!\u001aB/òÃ\u0002\u0094y©Ê}R\u000e§#ý÷\b\u0088¯^\u0080rt\u0007\u0086Û$ì{\u0081\u0082U2f\u0018;\u0083Ï.à]µ¸I#\u001aN/ýÃ\u0019\u0094J©ê}\n\u000e\u0081#Â÷\u0017\u0088\u00ad]Øq\u001f\u0002é×Ìëx^\u0080rc\u0007\u009aÛ!ì \u0081\u0089U:fZ;\u009aÏ àJµòI<\u001aSÈ]äè\u0091QMµzú\u0017\u000eÃ³ðÓ\u00adAY¯vÐ#dß»^Árb\u0007\u009eÛ$ìj\u0081ÉU1fR;\u009bÓÅÿ2\u008aÈV}a)\f\u008dØ|ë\u001b¶ÆBgm\t8«Äy\u0097\u0016¢¿N_\u0019\u0019^Árb\u0007\u0092Û\"ì|\u0081\u0081^Ýrh\u0007ÑÛ'ì}\u0081\u0088U;fB;\u008cÏ3à\u0011µúI.\u001aI/êÃ\u0011\u0094N©ä}\u000b\u000e¢#ý÷\u0002\u0088\u00ad^Èrb\u0007\u0091Û.^Ùre\u0007\u0090Û/ì|\u0081\u0081^órF^\u0080rw\u0007\u008dÛ8ìl\u0081ÈU2fX;\u008bÏ2àSµòI<F\u0000j¼\u001fIÃöô±\u0099KMã~\u009d#B^èrb\u0007\u0091Û.ìb\u0081\u0088U+f^;\u0080Ï)M\u0080a3\u0014ÎÈcÿ:\u0092ÊFkzõVV#´ÿ\u0001È[¥·q\u0013Bcß\u009eó+\u0086\u0092Zdm>\u0000ËÔxç\u0001ºÏNpaR4°Èi\u009b\u0012®µBW\u0015\t^Ùre\u0007\u0090Û/ì7\u0081ÑU/^Èrb\u0007\u0091Û2ì}\u0081\u008eU<Ð[üñ\u0089\u0002U¡bî\u000f\u001dÛ¯èûµ\u0004Aìn\u009a^Èrb\u0007\u0091Û2ì}\u0081\u008eU<fh;\u0097Ï\u007fà\tµÈIy\u001a\u0013^Ýrh\u0007ÑÛ'ì}\u0081\u0088U;fB;\u008cÏ3à\u0011µúI \u001aC/úÃ\u001b^Ürc\u0007\u0094^Êrj\u0007\u008aÛ;ìn\u0081\u0093U0fE^îrw\u0007\u008fÛwì]\u0081\u0092U1fC;\u0086Ï*àZµ·I)\u001aH/íÃW\u0094l©ï}\r\u000e¸#â÷\u00028×\u0014Pa¢½\u001c\u008aYç·3\u0002\u0000.]\u0085©:\u0086MÓ\u008e/\u0014|kIÏ¥\"òbÏ\u009e\u001b h\u0081EÄ\u0091~î\u009e;¶\u0017`^îri\u0007\u009bÛ%ì`\u0081\u008eU;f\u0017;¼Ï\u0003àtµ·I-\u001aR/öÃ\u001b\u0094[©§}\u0019\u000e¸#ý÷G\u0088§]\u008fqY\u0002\u0098×\u0089ë#^Ýrh\u0007ÑÛ?ìn\u0081\u0095U;f@;\u008eÏ5àZ^Èrh\u0007\u0093Û3ìi\u0081\u008eU,f_H\u0098d$\u0011ÑÍnúv\u0097\u0090^Ýrf\u0007\u0091Û4ìg\u0081\u0092ù«Õ\u001e §|QK\u000b&þòMÁ4\u009cúhEGg\u0012\u0083îK½0\u0088\u0087de^Ýrh\u0007ÑÛ<ìj\u0081\u0095U1fR;\u0083ÏiàNµòI\"\u001aR6:\u001dÉ1|DÅ\u00980¯~Â\u0090\u0016>%Qx\u009e^Ýrh\u0007ÑÛ5ìz\u0081\u008eU3fS;ÁÏ7àMµøI+\u001aR/üÃ\u0003\u0004ò(I]¨\u0081\u0000¶kÛ¤\u000f\\<:^Ýrh\u0007ÑÛ5ìz\u0081\u008eU3fS;ÁÏ!àVµùI(\u001aB/íÃ\u0007\u0094]©î}\u0011\u000e£ªî\u0086Dó·/\u0014\u0018[u¨¡\u001a\u0092>Ïº;\u0005\u0014rA\u009e½\u000eîdÛ×74`{]È\u0089:x*T\u0080!sýÐÊ\u009f§lsÞ@\u008a\u001dué\u009dÆë\u0093ZoÞ<¡\t\u0016åÊ²µ\u008f][«(\u001a\u0005\nÑà®S{0Wÿ$Lñ>Íª\u009aUw}CË\u009dØ±rÄ\u0081\u0018\"/mB\u009e\u0096,¥\bø\u0098\f8#@và\u008a3ÙRìÐ\u0000\u0014W[jü¾@Í àú4\u0019Kª\u009eÕ²\u0016Á´^Èrb\u0007\u0091Û2ì}\u0081\u008eU<f\u0018;\u0099Ï%àPµïIw\u001a\u0011/ïÃX\u0094Y©å}\u0010\u000e¯#·÷Q\u0088¯\u0082ß®\u007fÛ\u0087\u0007'0t]\u0095\u0089gºSç\u009c\u0013;<wiç\u0095(ÆXóç\u001f\u000eH]uÏ¡\u0010Òøÿ®+_T¯\u0081Å\u00ad\u0016Þµ\u000bÚ7i`»\u008dï¹pêØ\u0017\u008e^Ýrh\u0007ÑÛ5ì`\u0081\u0088U+f[;\u0080Ï&à[µòI=^Ýrh\u0007ÑÛ5ì`\u0081\u0088U+f^;\u0082Ï&àXµòIa\u001aE/êÃ\u001e\u0094C©ã}Q\u000e±#æ÷\t\u0088¸]Òq\u001d\u0002·×Íë~¼¡QÓ^îri\u0007\u009bÛ%ì`\u0081\u008eU;f\u001a;\u0097Ï\u007fà\t%¼\t\t|° T\u0097\u001búï.R\u001d2@ ´B\u009b7Î\u00852^a*T\u009f¸oï`Ò\u008f\u0006z\u0012î>WK¹\u0097\u0016 \u0017^Æri\u0007\u0096Û#ì!\u0081\u0094U)fT;ÁÏ6àZµúI:\u001a\n/ïÃ\u0005\u0094@©÷}\fð^Üâ©\u0012u¢B¡/\u000fû¨È\u0099\u0095\u0002a¦NÖ\u001byç¤´Â\u0081fm\u0084º\u008c\u00960ãÀ?p\bseÆ±k\u0082KßÛ+t\u0004\u0006Q \u00adBþ\u0016Ë¬'Hp\u0018M§\u0099L^Þrb\u0007\u0092Û\"ì!\u0081\u0094U9f\u0019;\u0083Ï$à[µÈI+\u001aB/ñÃ\u0004\u0094F©ó}\u0006eÎI{<Âà/×yº\u0086n\"]A\u0000\u0090ôzÛM\u008eêr8!F\u0014ãø\r¯X\u0092ºF\u001d5¡\u0018ñÌ\u0001³¨^Ýrh\u0007ÑÛ5ì`\u0081\u0088U+f\u0019;\u009eÏ\"àRµâIa\u001aF/éÃ\u0013\u0094p©é}\u001e\u000eº#ê¼:\u0090\u008få69ß\u000e\u008ccm·\u0096\u0084²Ù}-É\u0002´W\u0014«\u0086ø¦Í\u0011!þv¯K\u0005\u009fêì@Á\u001a\u0015éjV¿$^Ýrh\u0007ÑÛ'ì}\u0081\u0088U;fB;\u008cÏ3à\u0011µõI:\u001aN/óÃ\u0013\u0094\u0001©á}\u0016\u000e¹#è÷\u0002\u0088\u00ad]Çq\u001d\u0002®×Ñëc^Ýrh\u0007ÑÛ$ìv\u0081\u0094U+fR;\u0082Ïià]µâI&\u001aK/ûÃY\u0094I©î}\u0011\u000e°#ê÷\u0015\u0088¯]Åq\u0006\u0002©×Ë\u0089B¥÷ÐN\f»;éV\u000b\u0082´±Íì\u001d\u0018\u00877Åbp\u009e¤Í\u0096øb\u0014\u009dCÙ~tª\u0084Ùfôv \u0091_.\u008aO¦\u0095Õ*\u0000P<úk9\u0086V²ô^Ýrh\u0007ÑÛ!ìj\u0081\u0089U;fX;\u009dÏià]µâI&\u001aK/ûÃY\u0094I©î}\u0011\u000e°#ê÷\u0015\u0088¯]Åq\u0006\u0002©×ËpP\\å)\\õ¬Âç¯\u0004{¶HÕ\u0015\u0010á\u0095ÎÖ\u009bvg©4Ç\u0001<í\u0098º×\u0087cS\u009e >\r,Ù\u008c¦;sT_\u0085,/ù@Åê\u00920\u007fCKü\u0018\u000ekö^\u0080rc\u0007\u009aÛ!ì \u0081\u0096U:fZ;\u009aÏ\u0018àOµþI?\u001aBX\u0083t`\u0001\u0099Ý\"ê#\u0087\u0097S3`W=\u0087É!æH³»O.\u001cE)ïÅ\u0011\u0092N¯å{\u0012\b°%Óñ\u0003\u008e¹[Úw\u0015\u0004 ^\u0080rc\u0007\u009aÛ!ì \u0081\u0094U0fT;\u0084Ï\"àKµ¸I(\u001aB/ñÃ\u000e\u0094K^\u0080rc\u0007\u009aÛ!ì \u0081\u0094U0fT;\u0084Ï\"àKµ¸I>\u001aB/òÃ\u0002\u0094KÀ£ìW\u0099¥E\u0007r\u0003\u001fµË\u0019øy¥¹Q;~h+Æ×\r\u0084g±Ù±¯\u009d[è©4\u000b\u0003Tn\u00adº\u001d\u00897Ô¬ \u0001\u000frZ\u0097¦\fõaÀÒ,;{_FÅ\u00921á\u0094ÌÌ\u0018'g\u0093²Ç\u009e$í\u008d8ò\u0004MS\u0087¾×\u008aAÙ½$íp]_þ«\u000böO^\u0080rc\u0007\u009aÛ!ì \u0081\u0085U,fC;°Ï àOµä\u0006\u0010*ó_\n\u0083±´°Ù\u0015\r¼>Óc \u0097£¸Æíj\u0011º^\u0080rc\u0007\u009aÛ!ì \u0081\u0094U0fT;\u0084Ï\"àKµ¸I-\u001aT/ëÃ\u0011\u0094@©ë}\u001b\u000e²#ý÷\u0003^\u0080rt\u0007\u0086Û$ì{\u0081\u0082U2f\u0018;\u0083Ï.à]µ¸I#\u001aN/ýÃ\u0015\u0094\\©ó}\u0019\u000e¸#ã÷\u0003\u0088º]Åq0\u0002\u00ad×Ñë~¼áQÔep*\r\u0006îs\u0017¯¬\u0098\u00adõ\b!¡\u0012ÎO\u0003»©\u0094ÑÁ\u007f^\u0080rc\u0007\u009aÛ!ì \u0081\u0085U,fC;\u0088Ï>àMµø\u0007³+P^©\u0082\u0012µ\u0013Ø¶\f\u001f?pb±\u0096\u0011¹kìÊ`6LÕ9,å\u0097Ò\u0096¿3k\u009aXõ\u00056ñ\u0083Þà\u008bD^\u0080rc\u0007\u009aÛ!ì \u0081\u0085U,fC;\u0099Ï*àLµð¸\u009e\u0094}á\u0084=?\n>g\u009b³2\u0080]Ý\u0081)>\u0006@Sà¯!üZ^\u0080rc\u0007\u009aÛ!ì \u0081\u0085U,fC;°Ï.àRµò^\u0080rc\u0007\u009eÛ#ìn\u0081ÈU;fX;\u0098Ï)àSµøI.\u001aC/ìÃX\u0094\u0001©ÿ}\u001d\u000eø#í÷\u0014\u0088«]ÜÉ@åª\u0090QLã{à\u0016PÂöñ\u0099¬KXèw\u0088\"$Þ \u008d¥¸,TÃ\u0003¼>/êÞ\u0099e´*`Ã\u001fYÊ\u0018æÃ\u0095c@\u001a|¥^\u0080rw\u0007\u008dÛ8ìl\u0081ÈU6fX;\u009fÏ(àMµãI<\u0099«µUÀ\u00ad\u001cC+\u0001^\u0080rw\u0007\u008dÛ8ìl\u0081ÈU,fR;\u0083Ï!à\u0010µúI.\u001aW/ì\u0082H®õÛ\u001e\u0007»0ã]\b\u0089¼º\u0099ç\b\u0013¨<Óis\u0095©ÆÎól\u001f\u009fH\u0081ut¡\u0090^Ãrn\u0007\u009dÛ\u0010ìC\u0081¢U\ffh;\u008dÏ4àKµ¹I<\u001aH^\u0080rb\u0007\u008bÛ4ì \u0081\u008aU:fS;\u0086Ï&à`µôI \u001aC/úÃ\u0014\u0094\\©©}\u0007\u000eº#ã^Írk\u0007\u008aÛ2ì|\u0081\u0093U>fT;\u0084Ï4^\u0080rb\u0007\u008bÛ4ì \u0081\u008aU0fB;\u0081Ï3àL^\u0080rc\u0007\u009eÛ#ìn\u0081ÈU;fX;\u0098Ï)àSµøI.\u001aC/ìÃX\u0094\u0001©ã}\u000f\u000eø#î÷\u0017\u0088¯]ÄqA\u0002¿×Òë{@\u0094lc\u0019\u0099Å,òx\u009fÜK(xS%\u008eÑ:þE«åW4\u0003ú/zZ\u0081\u0086!±{Ü\u009c\b>;M^\u0080rc\u0007\u009eÛ#ìn\u0081ÈU2f^;\u009cÏ$à\u0010µçI=\u001aH/ùÃ\u001e\u0094C©â}\f\u000eø#ì÷\u0012\u0088\u00ad]\u0098q_\u0002è×Üëx¼¢Q\u0089er6\u009eËÌ\u009fu°\u0090D!\u0019f*\u0095þ+\u0093\u0019¤\u0082x\"\rRÞâò&\u0087JXú".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1874);
        getCiacDecline = cArr;
        getPaymentFci = 670420534684381703L;
    }

    static void init$1() {
        $$d = new byte[]{98, 74, -39, 82};
        $$e = 174;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x13df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x14b1 A[Catch: all -> 0x01ef, TRY_ENTER, TryCatch #7 {all -> 0x01ef, blocks: (B:6:0x00d4, B:8:0x00e7, B:9:0x0132, B:18:0x0217, B:20:0x0254, B:21:0x02a4, B:28:0x0341, B:30:0x0354, B:31:0x03a8, B:39:0x0469, B:41:0x04a7, B:42:0x04fd, B:46:0x0515, B:48:0x0524, B:49:0x0571, B:55:0x0632, B:57:0x066b, B:58:0x06c0, B:62:0x0725, B:64:0x0738, B:65:0x078b, B:71:0x0850, B:73:0x088d, B:74:0x08dd, B:82:0x09ab, B:84:0x09be, B:85:0x0a0e, B:92:0x0bea, B:94:0x0c32, B:95:0x0c86, B:99:0x0cc2, B:101:0x0cd5, B:102:0x0d2a, B:109:0x0d8c, B:111:0x0dc6, B:112:0x0e1a, B:116:0x0e81, B:118:0x0e94, B:119:0x0ee8, B:125:0x0fbb, B:127:0x0ff3, B:128:0x1045, B:132:0x107d, B:134:0x1090, B:135:0x10de, B:141:0x1132, B:143:0x116c, B:144:0x11c0, B:162:0x13f7, B:164:0x1446, B:165:0x149b, B:168:0x14b1, B:170:0x14c0, B:171:0x150e, B:175:0x15be, B:177:0x160a, B:178:0x165a, B:182:0x1671, B:184:0x1689, B:185:0x16d7, B:191:0x178c, B:193:0x17d4, B:194:0x1829, B:198:0x1862, B:200:0x1875, B:201:0x18ca, B:203:0x18d3, B:205:0x18f1, B:206:0x1948, B:211:0x26f2, B:213:0x2705, B:214:0x2755, B:225:0x2b51, B:227:0x2b64, B:228:0x2bc0, B:233:0x2ca5, B:235:0x2cb8, B:236:0x2d05, B:245:0x2dd6, B:247:0x2e0e, B:248:0x2e61, B:288:0x30e4, B:290:0x3122, B:291:0x3173, B:307:0x330b, B:309:0x334f, B:310:0x33a2, B:314:0x33da, B:316:0x33ed, B:317:0x343e, B:321:0x34dc, B:323:0x352e, B:324:0x357f, B:328:0x35ad, B:330:0x35fb, B:331:0x364f, B:362:0x2761, B:364:0x277f, B:365:0x27ce, B:370:0x226f, B:372:0x2282, B:373:0x22d7, B:385:0x2303, B:387:0x2316, B:388:0x2369, B:402:0x2470, B:404:0x24aa, B:405:0x2503, B:410:0x2615, B:412:0x2662, B:413:0x26b7, B:419:0x2535, B:421:0x2587, B:422:0x25dc, B:432:0x12dd, B:434:0x12f0, B:435:0x1346, B:446:0x0ab3, B:448:0x0ac6, B:449:0x0b18), top: B:5:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x2705 A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:6:0x00d4, B:8:0x00e7, B:9:0x0132, B:18:0x0217, B:20:0x0254, B:21:0x02a4, B:28:0x0341, B:30:0x0354, B:31:0x03a8, B:39:0x0469, B:41:0x04a7, B:42:0x04fd, B:46:0x0515, B:48:0x0524, B:49:0x0571, B:55:0x0632, B:57:0x066b, B:58:0x06c0, B:62:0x0725, B:64:0x0738, B:65:0x078b, B:71:0x0850, B:73:0x088d, B:74:0x08dd, B:82:0x09ab, B:84:0x09be, B:85:0x0a0e, B:92:0x0bea, B:94:0x0c32, B:95:0x0c86, B:99:0x0cc2, B:101:0x0cd5, B:102:0x0d2a, B:109:0x0d8c, B:111:0x0dc6, B:112:0x0e1a, B:116:0x0e81, B:118:0x0e94, B:119:0x0ee8, B:125:0x0fbb, B:127:0x0ff3, B:128:0x1045, B:132:0x107d, B:134:0x1090, B:135:0x10de, B:141:0x1132, B:143:0x116c, B:144:0x11c0, B:162:0x13f7, B:164:0x1446, B:165:0x149b, B:168:0x14b1, B:170:0x14c0, B:171:0x150e, B:175:0x15be, B:177:0x160a, B:178:0x165a, B:182:0x1671, B:184:0x1689, B:185:0x16d7, B:191:0x178c, B:193:0x17d4, B:194:0x1829, B:198:0x1862, B:200:0x1875, B:201:0x18ca, B:203:0x18d3, B:205:0x18f1, B:206:0x1948, B:211:0x26f2, B:213:0x2705, B:214:0x2755, B:225:0x2b51, B:227:0x2b64, B:228:0x2bc0, B:233:0x2ca5, B:235:0x2cb8, B:236:0x2d05, B:245:0x2dd6, B:247:0x2e0e, B:248:0x2e61, B:288:0x30e4, B:290:0x3122, B:291:0x3173, B:307:0x330b, B:309:0x334f, B:310:0x33a2, B:314:0x33da, B:316:0x33ed, B:317:0x343e, B:321:0x34dc, B:323:0x352e, B:324:0x357f, B:328:0x35ad, B:330:0x35fb, B:331:0x364f, B:362:0x2761, B:364:0x277f, B:365:0x27ce, B:370:0x226f, B:372:0x2282, B:373:0x22d7, B:385:0x2303, B:387:0x2316, B:388:0x2369, B:402:0x2470, B:404:0x24aa, B:405:0x2503, B:410:0x2615, B:412:0x2662, B:413:0x26b7, B:419:0x2535, B:421:0x2587, B:422:0x25dc, B:432:0x12dd, B:434:0x12f0, B:435:0x1346, B:446:0x0ab3, B:448:0x0ac6, B:449:0x0b18), top: B:5:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x275e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x2b4f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x2e0e A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:6:0x00d4, B:8:0x00e7, B:9:0x0132, B:18:0x0217, B:20:0x0254, B:21:0x02a4, B:28:0x0341, B:30:0x0354, B:31:0x03a8, B:39:0x0469, B:41:0x04a7, B:42:0x04fd, B:46:0x0515, B:48:0x0524, B:49:0x0571, B:55:0x0632, B:57:0x066b, B:58:0x06c0, B:62:0x0725, B:64:0x0738, B:65:0x078b, B:71:0x0850, B:73:0x088d, B:74:0x08dd, B:82:0x09ab, B:84:0x09be, B:85:0x0a0e, B:92:0x0bea, B:94:0x0c32, B:95:0x0c86, B:99:0x0cc2, B:101:0x0cd5, B:102:0x0d2a, B:109:0x0d8c, B:111:0x0dc6, B:112:0x0e1a, B:116:0x0e81, B:118:0x0e94, B:119:0x0ee8, B:125:0x0fbb, B:127:0x0ff3, B:128:0x1045, B:132:0x107d, B:134:0x1090, B:135:0x10de, B:141:0x1132, B:143:0x116c, B:144:0x11c0, B:162:0x13f7, B:164:0x1446, B:165:0x149b, B:168:0x14b1, B:170:0x14c0, B:171:0x150e, B:175:0x15be, B:177:0x160a, B:178:0x165a, B:182:0x1671, B:184:0x1689, B:185:0x16d7, B:191:0x178c, B:193:0x17d4, B:194:0x1829, B:198:0x1862, B:200:0x1875, B:201:0x18ca, B:203:0x18d3, B:205:0x18f1, B:206:0x1948, B:211:0x26f2, B:213:0x2705, B:214:0x2755, B:225:0x2b51, B:227:0x2b64, B:228:0x2bc0, B:233:0x2ca5, B:235:0x2cb8, B:236:0x2d05, B:245:0x2dd6, B:247:0x2e0e, B:248:0x2e61, B:288:0x30e4, B:290:0x3122, B:291:0x3173, B:307:0x330b, B:309:0x334f, B:310:0x33a2, B:314:0x33da, B:316:0x33ed, B:317:0x343e, B:321:0x34dc, B:323:0x352e, B:324:0x357f, B:328:0x35ad, B:330:0x35fb, B:331:0x364f, B:362:0x2761, B:364:0x277f, B:365:0x27ce, B:370:0x226f, B:372:0x2282, B:373:0x22d7, B:385:0x2303, B:387:0x2316, B:388:0x2369, B:402:0x2470, B:404:0x24aa, B:405:0x2503, B:410:0x2615, B:412:0x2662, B:413:0x26b7, B:419:0x2535, B:421:0x2587, B:422:0x25dc, B:432:0x12dd, B:434:0x12f0, B:435:0x1346, B:446:0x0ab3, B:448:0x0ac6, B:449:0x0b18), top: B:5:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x302b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x30cc  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x3189  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x30c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x2761 A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:6:0x00d4, B:8:0x00e7, B:9:0x0132, B:18:0x0217, B:20:0x0254, B:21:0x02a4, B:28:0x0341, B:30:0x0354, B:31:0x03a8, B:39:0x0469, B:41:0x04a7, B:42:0x04fd, B:46:0x0515, B:48:0x0524, B:49:0x0571, B:55:0x0632, B:57:0x066b, B:58:0x06c0, B:62:0x0725, B:64:0x0738, B:65:0x078b, B:71:0x0850, B:73:0x088d, B:74:0x08dd, B:82:0x09ab, B:84:0x09be, B:85:0x0a0e, B:92:0x0bea, B:94:0x0c32, B:95:0x0c86, B:99:0x0cc2, B:101:0x0cd5, B:102:0x0d2a, B:109:0x0d8c, B:111:0x0dc6, B:112:0x0e1a, B:116:0x0e81, B:118:0x0e94, B:119:0x0ee8, B:125:0x0fbb, B:127:0x0ff3, B:128:0x1045, B:132:0x107d, B:134:0x1090, B:135:0x10de, B:141:0x1132, B:143:0x116c, B:144:0x11c0, B:162:0x13f7, B:164:0x1446, B:165:0x149b, B:168:0x14b1, B:170:0x14c0, B:171:0x150e, B:175:0x15be, B:177:0x160a, B:178:0x165a, B:182:0x1671, B:184:0x1689, B:185:0x16d7, B:191:0x178c, B:193:0x17d4, B:194:0x1829, B:198:0x1862, B:200:0x1875, B:201:0x18ca, B:203:0x18d3, B:205:0x18f1, B:206:0x1948, B:211:0x26f2, B:213:0x2705, B:214:0x2755, B:225:0x2b51, B:227:0x2b64, B:228:0x2bc0, B:233:0x2ca5, B:235:0x2cb8, B:236:0x2d05, B:245:0x2dd6, B:247:0x2e0e, B:248:0x2e61, B:288:0x30e4, B:290:0x3122, B:291:0x3173, B:307:0x330b, B:309:0x334f, B:310:0x33a2, B:314:0x33da, B:316:0x33ed, B:317:0x343e, B:321:0x34dc, B:323:0x352e, B:324:0x357f, B:328:0x35ad, B:330:0x35fb, B:331:0x364f, B:362:0x2761, B:364:0x277f, B:365:0x27ce, B:370:0x226f, B:372:0x2282, B:373:0x22d7, B:385:0x2303, B:387:0x2316, B:388:0x2369, B:402:0x2470, B:404:0x24aa, B:405:0x2503, B:410:0x2615, B:412:0x2662, B:413:0x26b7, B:419:0x2535, B:421:0x2587, B:422:0x25dc, B:432:0x12dd, B:434:0x12f0, B:435:0x1346, B:446:0x0ab3, B:448:0x0ac6, B:449:0x0b18), top: B:5:0x00d4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.String str;
        int i4;
        java.lang.String str2;
        int i5;
        int i6;
        java.lang.Integer num2;
        int i7;
        int i8;
        int i9;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object[] objArr;
        int i10;
        int i11;
        java.lang.String[][] strArr;
        java.lang.String str6;
        java.lang.String str7;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.Object invoke;
        int i12;
        char c;
        int i13;
        int i14;
        int i15;
        java.lang.String[][] strArr2;
        java.lang.String[] strArr3;
        java.lang.String str8;
        java.lang.String next;
        int i16;
        int i17;
        int i18;
        java.lang.Object obj2;
        int i19;
        java.lang.String[] strArr4;
        java.lang.String next2;
        java.lang.String[] strArr5;
        int i20;
        int i21 = 0;
        java.lang.Integer num3 = 0;
        int i22 = 16;
        java.lang.Integer num4 = 16;
        int i23 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 634, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 8, objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((-16777048) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.green(0), 27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.String str9 = "";
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 10799), 25 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
        java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr5);
        java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(238 - (android.os.Process.myTid() >> 22), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
        java.lang.String[] strArr6 = {intern2, intern3, intern4, ((java.lang.String) objArr6[0]).intern()};
        int i24 = 0;
        while (true) {
            if (i24 >= 4) {
                num = num3;
                str = intern;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr6[i24]};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> i22), android.view.View.MeasureSpec.makeMeasureSpec(i21, i21) + 3161, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33099));
                    byte[] bArr = $$a;
                    byte b = (byte) (-bArr[i22]);
                    byte b2 = (byte) (bArr[14] - i23);
                    java.lang.Object[] objArr8 = new java.lang.Object[i23];
                    b(b, b2, (short) (b2 | 35), objArr8);
                    java.lang.String str10 = (java.lang.String) objArr8[i21];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i23];
                    clsArr[i21] = java.lang.String.class;
                    obj3 = cls.getMethod(str10, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj3);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue();
                long j = ~longValue;
                long j2 = i;
                num = num3;
                long j3 = ~(j2 | 603786840);
                str = intern;
                java.lang.String[] strArr7 = strArr6;
                long j4 = (881 * longValue) + 531936206040L + (((~(j | (-603786841))) | (~(j2 | (-603786841))) | (~(j | j2))) * (-880)) + (((~((-603786841) | (~j2))) | longValue | j3) * (-880)) + (j3 * 880) + 303683898;
                int i25 = (int) (j4 >> 32);
                int i26 = ~i;
                if (((((int) j4) & (((((~((-1965307057) | i)) | 891303072) * 336) - 501357939) + (((~(892433829 | i)) | (-1966437814)) * (-168)) + (((~(892433829 | i26)) | (-1965307057)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | ((((((~(118917830 | i26)) | (-1556144242)) * (-865)) - 87487118) + ((~((-118917831) | i)) * 865) + (((~(i26 | (-1556144242))) | (~((-118917831) | i26))) * 865)) & i25)) != 0) {
                    i4 = i ^ (i24 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i24++;
                strArr6 = strArr7;
                num3 = num;
                intern = str;
                i21 = 0;
                i22 = 16;
                i23 = 1;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i27 = 3;
        if (i4 != i) {
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(494299052 | r2)) * (-560)) - 90731967) + ((~(i | (-1082196034))) * (-560)) + (((~(1556547045 | (~i))) | 19948040) * 560))};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(""), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                byte b3 = (byte) ($$a[14] - 1);
                byte b4 = b3;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(b3, b4, b4, objArr11);
                obj4 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(android.view.MotionEvent.axisFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (char) (52937 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, objArr12);
        java.lang.String intern5 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (char) (38097 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 13 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr13);
        java.lang.String intern6 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(290 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, objArr14);
        java.lang.String[] strArr8 = {intern5, intern6, ((java.lang.String) objArr14[0]).intern()};
        int i28 = 0;
        while (true) {
            if (i28 >= i27) {
                str2 = str9;
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr8[i28]};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, 3161 - android.view.View.combineMeasuredStates(0, 0), (char) (33099 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                byte[] bArr2 = $$a;
                byte b5 = (byte) (-bArr2[16]);
                byte b6 = bArr2[14];
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b(b5, b6, (short) (b6 | 652), objArr16);
                obj5 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj5);
            }
            long j5 = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr15)).longValue();
            long j6 = i;
            str2 = str9;
            long j7 = j6 | 67961641;
            long j8 = (((((r8 * (-667)) - 90728790735L) + (((~j7) | j5) * (-668))) + (((~(j6 | j5)) | 67961641) * 1336)) + ((j7 | j5) * 668)) - 1405629749;
            int i29 = (int) (j8 >> 32);
            int i30 = ~i;
            if (((i29 & ((((~(333339743 | i)) | (~((-307645526) | i30))) * (-406)) + 1949923726 + ((~(2078211679 | i30)) * (-406)) + (((~((-1770566155) | i)) | (~((-333339744) | i30))) * 406))) | (((int) j8) & ((((~(1983666810 | i)) | (~((-1445747243) | i30))) * (-406)) + 2131396963 + ((~(1992187642 | i30)) * (-406)) + (((~(i30 | (-1983666811))) | (~((-546440401) | i))) * 406)))) != 0) {
                i5 = (i28 + 270) ^ i;
                break;
            }
            i28++;
            str9 = str2;
            i27 = 3;
        }
        if (i5 != i) {
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~((-1381756823) | i)) | 1975161453) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 828609289 + (((~((~i) | (-1381756823))) | 1975161453) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                byte b7 = (byte) ($$a[14] - 1);
                byte b8 = b7;
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b(b7, b8, b8, objArr19);
                obj6 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.String str11 = str2;
        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj7 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 26, android.widget.ExpandableListView.getPackedPositionType(0L) + 1864, (char) (41776 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
            byte[] bArr3 = $$a;
            byte b9 = (byte) (-bArr3[16]);
            byte b10 = bArr3[14];
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b(b9, b10, (short) (b10 | 652), objArr20);
            obj7 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
        }
        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
        long j9 = i;
        long j10 = ~longValue2;
        long j11 = ~j9;
        long j12 = j10 | j11;
        long j13 = (((((longValue2 * (-49)) + 5822898939L) + ((114174489 | j9) * (-50))) + (((~(((-114174490) | j10) | j9)) | (~(j12 | 114174489))) * 50)) + ((((~j12) | (~(114174489 | j10))) | (~(114174489 | j11))) * 50)) - 2043387351;
        int i31 = ~i;
        int i32 = ~((-1258426141) | i);
        int i33 = (((int) j13) & ((((~(1269452701 | i31)) | (~((-178800270) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1622478029 + (((~(178800269 | i31)) | i32) * (-1040)) + ((i32 | (~(1258426140 | i31)) | 1090652432) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))) | (((((~(962194060 | i31)) | (-1029303199)) * (-160)) + 625244874 + (((~((-475032351) | i31)) | 962194060) * 160)) & ((int) (j13 >> 32)));
        int i34 = i33 != 0 ? (i33 + 199) ^ i : i;
        if (i34 != i) {
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i34}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(i | 1983340397)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 752432391) + (((~(1983340397 | i31)) | 67505700) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), 2713 - android.text.TextUtils.getCapsMode(str11, 0, 0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                byte b11 = (byte) ($$a[14] - 1);
                byte b12 = b11;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b(b11, b12, b12, objArr23);
                obj8 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a(309 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (63687 - android.view.View.combineMeasuredStates(0, 0)), android.view.KeyEvent.keyCodeFromString(str11) + 20, objArr24);
        java.lang.String intern7 = ((java.lang.String) objArr24[0]).intern();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(329 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.view.KeyEvent.normalizeMetaState(0) + 6, objArr25);
        java.lang.Object[] objArr26 = {intern7, ((java.lang.String) objArr25[0]).intern()};
        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
        if (obj9 == null) {
            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.getCapsMode(str11, 0, 0), 2214 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
            byte[] bArr4 = $$a;
            byte b13 = (byte) (-bArr4[16]);
            byte b14 = bArr4[14];
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            b(b13, b14, (short) (b14 | 652), objArr27);
            obj9 = cls7.getMethod((java.lang.String) objArr27[0], java.lang.String.class, java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr26)).longValue();
        long j14 = ~longValue3;
        int i35 = i31;
        long j15 = (-2085066005) + (((-958) * longValue3) - 1293004364074L) + (((~(j9 | (-1349691404))) | (~(j14 | j11)) | (~(1349691403 | j11))) * 959) + ((~(longValue3 | 1349691403)) * (-959)) + (((~((-1349691404) | j11)) | (~(j14 | j9)) | (~(j9 | 1349691403))) * 959);
        int i36 = ((((int) j15) & ((((((~(2080014079 | i35)) | (~((-1479693909) | i))) * (-302)) + 790931239) + ((~(2080014079 | i)) * (-604))) + (((~(600320171 | i)) | 557852673) * 302))) | (((int) (j15 >> 32)) & ((((((~((-1974424840) | i35)) | 1437270019) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106) + ((~((-1437270020) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) + ((((~(537198428 | i35)) | (-1974468448)) | (~((-537154821) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i;
        if (i36 != i) {
            java.lang.Object[] objArr28 = {new int[]{i}, new int[]{i36}, null, null, new int[1]};
            java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(i | (-1385990460))) | 1966894445) * 398) + 244454057 + (((~((-1385990460) | i35)) | 1966894445) * 398))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.view.View.resolveSize(0, 0), (char) (android.os.Process.getGidForName(str11) + 1));
                byte b15 = (byte) ($$a[14] - 1);
                byte b16 = b15;
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                b(b15, b16, b16, objArr30);
                obj10 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr28[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr29)).intValue();
            return objArr28;
        }
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.visa.cbp.getCertUsage.setODAData, (char) (android.view.View.resolveSize(0, 0) + 37245), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 31, objArr31);
        java.lang.String intern8 = ((java.lang.String) objArr31[0]).intern();
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 366, (char) ((-1) - android.os.Process.getGidForName(str11)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, objArr32);
        java.lang.String intern9 = ((java.lang.String) objArr32[0]).intern();
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 389, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 28 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr33);
        java.lang.String intern10 = ((java.lang.String) objArr33[0]).intern();
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a(417 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 14 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr34);
        java.lang.String[] strArr9 = {intern8, intern9, intern10, ((java.lang.String) objArr34[0]).intern()};
        int i37 = 0;
        for (int i38 = 4; i37 < i38; i38 = 4) {
            int i39 = getCvrMaskAnd + 3;
            getGpoResponse = i39 % 128;
            if (i39 % 2 != 0) {
                java.lang.Object[] objArr35 = {strArr9[i37]};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj11 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.indexOf(str11, str11, 0, 0) + 3161, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33099));
                    byte[] bArr5 = $$a;
                    byte b17 = (byte) (-bArr5[16]);
                    byte b18 = (byte) (bArr5[14] - 1);
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    b(b17, b18, (short) (b18 | 35), objArr36);
                    obj11 = cls9.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj11);
                }
                long j16 = ~((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr35)).longValue();
                long j17 = j16 | j11;
                strArr5 = strArr9;
                i20 = i37;
                i6 = i35;
                num2 = num4;
                long j18 = ((r4 * (-49)) - 6191676114L) + ((j9 | (-121405414)) * (-50)) + (((~(121405413 | j16 | j9)) | (~(j17 | (-121405414)))) * 50) + (((~j17) | (~(j16 | (-121405414))) | (~((-121405414) | j11))) * 50) + 1028876152;
                if (((((int) (j18 >> 18)) & ((((~(1946250217 | i)) | (-509023807)) * 56) + 1435710378 + (((~(i6 | (-509023807))) | 1946250217) * 56))) | (((int) j18) & (((r4 * 992) - 1537497691) + (((~(1740778398 | i)) | 269866080 | (~(i6 | (-1707092491)))) * (-496)) + ((303551988 | i) * 496)))) != 0) {
                    i7 = i ^ (i20 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    break;
                }
                i37 = i20 + 1;
                strArr9 = strArr5;
                i35 = i6;
                num4 = num2;
            } else {
                strArr5 = strArr9;
                i20 = i37;
                i6 = i35;
                num2 = num4;
                java.lang.Object[] objArr37 = {strArr5[i20]};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj12 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 36, 3162 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (33099 - android.view.View.combineMeasuredStates(0, 0)));
                    byte[] bArr6 = $$a;
                    byte b19 = (byte) (-bArr6[16]);
                    byte b20 = (byte) (bArr6[14] - 1);
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    b(b19, b20, (short) (b20 | 35), objArr38);
                    obj12 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj12);
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr37)).longValue();
                long j19 = ~((~longValue4) | (-771984695));
                long j20 = ~(j9 | (-771984695));
                long j21 = (((-657) * longValue4) - 508737914005L) + (((~(longValue4 | 771984694)) | j19 | j20) * (-658)) + (658 * j19) + ((j19 | j20) * 658) + 1679455433;
                if (((((int) (j21 >> 32)) & (((((~(i6 | (-134783043))) | (~(i6 | 2130638327))) * (-184)) - 1019427974) + (((~(i6 | (-1851323891))) | 1716540848 | (~(i6 | 414097479))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 145750960)) | (((int) j21) & ((((~(i6 | 1303800629)) | (-1572831030) | (~((-1284909857) | i))) * 717) + 1660973617 + (((~(1303800629 | i)) | (~(i6 | (-1284909857))) | (-1572831030)) * 717)))) != 0) {
                    i7 = i ^ (i20 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    break;
                }
                i37 = i20 + 1;
                strArr9 = strArr5;
                i35 = i6;
                num4 = num2;
            }
        }
        i6 = i35;
        num2 = num4;
        i7 = i;
        if (i7 != i) {
            getCvrMaskAnd = (getGpoResponse + 121) % 128;
            java.lang.Object[] objArr39 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
            java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((i6 | 1054041438) * (-757)) - 1865552456) + ((~((-19400738) | i)) * 1514) + (((~(i | 1073442175)) | (~(i6 | (-996804660))) | 977403922) * 757))};
            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj13 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2713, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                byte b21 = (byte) ($$a[14] - 1);
                byte b22 = b21;
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                b(b21, b22, b22, objArr41);
                obj13 = cls11.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
            }
            ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr40)).intValue();
            return objArr39;
        }
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        a(431 - android.view.View.MeasureSpec.getMode(0), (char) ((android.os.Process.myPid() >> 22) + 38528), android.text.TextUtils.indexOf(str11, str11, 0, 0) + 13, objArr42);
        java.lang.Object[] objArr43 = {((java.lang.String) objArr42[0]).intern()};
        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
        if (obj14 == null) {
            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40, 1921 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
            byte[] bArr7 = $$a;
            byte b23 = (byte) (-bArr7[16]);
            byte b24 = bArr7[14];
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            b(b23, b24, (short) (b24 | 652), objArr44);
            obj14 = cls12.getMethod((java.lang.String) objArr44[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
        }
        java.lang.String str12 = (java.lang.String) ((java.lang.reflect.Method) obj14).invoke(null, objArr43);
        if (str12 != null) {
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            a(443 - android.os.Process.getGidForName(str11), (char) android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, objArr45);
            if (str12.contains(((java.lang.String) objArr45[0]).intern())) {
                getGpoResponse = (getCvrMaskAnd + 97) % 128;
                i8 = i ^ 250;
                if (i8 == i) {
                    getGpoResponse = (getCvrMaskAnd + 21) % 128;
                    java.lang.Object[] objArr46 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                    java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | (-555557185))) | 1478510609) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 890130956 + ((~(i6 | (-555557185))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj15 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.graphics.Color.green(0));
                        byte b25 = (byte) ($$a[14] - 1);
                        byte b26 = b25;
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        b(b25, b26, b26, objArr48);
                        obj15 = cls13.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                    }
                    ((int[]) objArr46[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr47)).intValue();
                    return objArr46;
                }
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                a(453 - android.text.TextUtils.indexOf(str11, str11, 0), (char) (36165 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr49);
                java.lang.String intern11 = ((java.lang.String) objArr49[0]).intern();
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 469, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr50);
                java.lang.Object[] objArr51 = {intern11, ((java.lang.String) objArr50[0]).intern()};
                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                if (obj16 == null) {
                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf(str11, str11, 0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2214, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    byte[] bArr8 = $$a;
                    byte b27 = (byte) (-bArr8[16]);
                    byte b28 = bArr8[14];
                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                    b(b27, b28, (short) (b28 | 652), objArr52);
                    obj16 = cls14.getMethod((java.lang.String) objArr52[0], java.lang.String.class, java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj16);
                }
                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr51)).longValue();
                long j22 = ~longValue5;
                long j23 = (~(j22 | 496117441)) | (~(j22 | j11)) | (~(496117441 | j11));
                long j24 = (((((591 * longValue5) - 292213172749L) + (((~(((-496117442) | longValue5) | j9)) | j23) * 590)) + (j23 * (-1180))) + (((~(longValue5 | j11)) | (~((-496117442) | j11))) * 590)) - 1231492043;
                int i40 = ((((int) (j24 >> 32)) & (((((((~(i6 | (-1490325770))) | 53099358) | (~(1490325769 | i))) * (-564)) + 50637514) + ((~(1543420767 | i)) * 1128)) + (((~(i6 | 53099358)) | 53094998) * 564))) | (((int) j24) & ((((((~((-1805595490) | i)) | (~(i6 | 1052145396))) * (-1808)) + 1076824893) + (((~((-714486369) | i)) | (~(i6 | 2143254517))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~((-1052145397) | i)) | 1091109121) | (~(i6 | 1805595489))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 0 ? i ^ 251 : i;
                if (i40 != i) {
                    java.lang.Object[] objArr53 = {new int[]{i}, new int[]{i40}, null, null, new int[1]};
                    java.lang.Object[] objArr54 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((872481029 | r1) * (-476)) - 350595587) + ((~(i | (-1103102089))) * 952) + ((~(i6 | (-1103102089))) * 476))};
                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj17 == null) {
                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.keyCodeFromString(str11), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        byte b29 = (byte) ($$a[14] - 1);
                        byte b30 = b29;
                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                        b(b29, b30, b30, objArr55);
                        obj17 = cls15.getMethod((java.lang.String) objArr55[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                    }
                    ((int[]) objArr53[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr54)).intValue();
                    return objArr53;
                }
                java.lang.Object[] objArr56 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 476, (char) android.graphics.Color.alpha(0), android.view.KeyEvent.keyCodeFromString(str11) + 23, objArr56);
                java.lang.Object[] objArr57 = {((java.lang.String) objArr56[0]).intern()};
                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj18 == null) {
                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 40, android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                    byte[] bArr9 = $$a;
                    byte b31 = (byte) (-bArr9[16]);
                    byte b32 = bArr9[14];
                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                    b(b31, b32, (short) (b32 | 652), objArr58);
                    obj18 = cls16.getMethod((java.lang.String) objArr58[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                }
                java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj18).invoke(null, objArr57)).toLowerCase();
                java.lang.Object[] objArr59 = new java.lang.Object[1];
                a(499 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.Color.blue(0), android.view.View.combineMeasuredStates(0, 0) + 4, objArr59);
                int i41 = lowerCase.contains(((java.lang.String) objArr59[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                if (i41 != i) {
                    java.lang.Object[] objArr60 = {new int[]{i}, new int[]{i41}, null, null, new int[1]};
                    java.lang.Object[] objArr61 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((i6 | (-286337122)) * 494) - 1358629949) + (((~(i6 | 1722434206)) | (-1966696558)) * 494))};
                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj19 == null) {
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, 2712 - android.os.Process.getGidForName(str11), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        byte b33 = (byte) ($$a[14] - 1);
                        byte b34 = b33;
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        b(b33, b34, b34, objArr62);
                        obj19 = cls17.getMethod((java.lang.String) objArr62[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                    }
                    ((int[]) objArr60[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr61)).intValue();
                    return objArr60;
                }
                java.lang.Object[] objArr63 = new java.lang.Object[1];
                a(453 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (36165 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 17 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr63);
                java.lang.String intern12 = ((java.lang.String) objArr63[0]).intern();
                java.lang.Object[] objArr64 = new java.lang.Object[1];
                a(503 - (android.os.Process.myPid() >> 22), (char) android.view.View.MeasureSpec.getMode(0), 6 - android.graphics.Color.alpha(0), objArr64);
                java.lang.String intern13 = ((java.lang.String) objArr64[0]).intern();
                java.io.File file = new java.io.File(intern12);
                if (file.exists() && file.isFile()) {
                    try {
                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                        a(508 - android.os.Process.getGidForName(str11), (char) android.text.TextUtils.getOffsetAfter(str11, 0), '2' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr65);
                        java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr65[0]).intern());
                        next2 = useDelimiter.hasNext() ? useDelimiter.next() : str11;
                        useDelimiter.close();
                    } catch (java.io.IOException unused) {
                    }
                    if (next2.contains(intern13)) {
                        int i42 = getCvrMaskAnd + 35;
                        getGpoResponse = i42 % 128;
                        i9 = i42 % 2 != 0 ? i ^ 27056 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                        if (i9 == i) {
                            java.lang.Object[] objArr66 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                            java.lang.Object[] objArr67 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((i6 | 270073960) * (-192)) + 676305489 + (((~(i6 | (-1772252438))) | 8519700) * (-384)) + (((~(i | 2042326397)) | (~((-8519701) | i)) | (~(i6 | (-1763732738)))) * 192))};
                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj20 == null) {
                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                byte b35 = (byte) ($$a[14] - 1);
                                byte b36 = b35;
                                java.lang.Object[] objArr68 = new java.lang.Object[1];
                                b(b35, b36, b36, objArr68);
                                obj20 = cls18.getMethod((java.lang.String) objArr68[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                            }
                            ((int[]) objArr66[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr67)).intValue();
                            return objArr66;
                        }
                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                        if (obj21 == null) {
                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2763 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                            byte[] bArr10 = $$a;
                            byte b37 = (byte) (-bArr10[16]);
                            byte b38 = bArr10[14];
                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                            b(b37, b38, (short) (b38 | 652), objArr69);
                            obj21 = cls19.getMethod((java.lang.String) objArr69[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj21);
                        }
                        long j25 = ~((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, null)).longValue();
                        long j26 = ~((-1376959528) | j25);
                        long j27 = ((r2 * (-463)) - 640286180520L) + (((~(j25 | j11)) | j26 | (~((-1376959528) | j11))) * 464) + ((j25 | j9 | 1376959527) * (-464)) + (((~(j9 | (-1376959528))) | j26) * 464) + 1501996291;
                        if (((((int) j27) & ((((~(i6 | (-1077944322))) | (~(2119100397 | i))) * 988) + 1095432097 + (((~((-1816584810) | i)) | 738640488 | (~(i6 | 2119100397))) * 988))) | (((int) (j27 >> 32)) & (((((~(717927387 | i)) | (-2144008188)) * 576) - 1771464918) + (((~(i6 | (-1426080801))) | 4194690) * 576) + 2001864960))) == 1) {
                            java.lang.Object[] objArr70 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                            int i43 = ~(551463824 | i);
                            java.lang.Object[] objArr71 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i | 1499382273)) | (~(i6 | (-6193665)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1047200537 + (((~(i6 | (-1499382274))) | i43) * (-1040)) + ((i43 | (~(i6 | (-551463825))) | 1493188609) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj22 == null) {
                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf(str11, str11, 0, 0) + 2713, (char) android.view.KeyEvent.keyCodeFromString(str11));
                                byte b39 = (byte) ($$a[14] - 1);
                                byte b40 = b39;
                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                b(b39, b40, b40, objArr72);
                                obj22 = cls20.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                            }
                            ((int[]) objArr70[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr71)).intValue();
                            return objArr70;
                        }
                        java.lang.Object[] objArr73 = {1};
                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                        if (obj23 == null) {
                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, 2364 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.graphics.Color.red(0));
                            byte[] bArr11 = $$a;
                            byte b41 = (byte) (-bArr11[16]);
                            byte b42 = bArr11[14];
                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                            b(b41, b42, (short) (b42 | 652), objArr74);
                            obj23 = cls21.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj23);
                        }
                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr73)).longValue();
                        long j28 = ~longValue6;
                        long j29 = ~(j9 | 521327265);
                        long j30 = (881 * longValue6) + 459289320465L + (((~(j28 | j9)) | (~(j9 | (-521327266))) | (~((-521327266) | j28))) * (-880)) + ((longValue6 | (~((-521327266) | j11)) | j29) * (-880)) + (j29 * 880) + 886582934;
                        int i44 = (int) (j30 >> 32);
                        int i45 = ~(2046536187 | i);
                        int i46 = ((i44 & ((((((~((-320776527) | i)) | (-1758002938)) * (-465)) + 1979073631) + (((~((-1758002938) | i)) | (-320776527)) * 930)) + (((-567369) | i) * 465))) | (((int) j30) & ((((((~(i6 | (-830177371))) | 811204698) | i45) * (-252)) + 1122894573) + ((i45 | (~(i6 | (-18972673)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                        if (i46 != i) {
                            java.lang.Object[] objArr75 = {new int[]{i}, new int[]{i46}, null, null, new int[1]};
                            java.lang.Object[] objArr76 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((993509022 | i) * (-859)) - 1237843878) + (((~(i | (-990228115))) | (~(i6 | 993509022))) * 859) + (((~(i6 | (-1057337076))) | 67108961) * 859))};
                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj24 == null) {
                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                byte b43 = (byte) ($$a[14] - 1);
                                byte b44 = b43;
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                b(b43, b44, b44, objArr77);
                                obj24 = cls22.getMethod((java.lang.String) objArr77[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                            }
                            ((int[]) objArr75[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr76)).intValue();
                            return objArr75;
                        }
                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                        a(476 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, objArr78);
                        java.lang.Object[] objArr79 = {((java.lang.String) objArr78[0]).intern()};
                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj25 == null) {
                            str3 = str11;
                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) ((-1) - android.os.Process.getGidForName(str3)));
                            byte[] bArr12 = $$a;
                            byte b45 = (byte) (-bArr12[16]);
                            byte b46 = bArr12[14];
                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                            b(b45, b46, (short) (b46 | 652), objArr80);
                            obj25 = cls23.getMethod((java.lang.String) objArr80[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj25);
                        } else {
                            str3 = str11;
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj25).invoke(null, objArr79);
                        if (invoke2 != null) {
                            java.lang.Object[] objArr81 = {invoke2, 42};
                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj26 == null) {
                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 28, android.view.KeyEvent.normalizeMetaState(0) + 2594, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                byte[] bArr13 = $$a;
                                byte b47 = (byte) (-bArr13[16]);
                                byte b48 = bArr13[14];
                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                b(b47, b48, (short) (b48 | 652), objArr82);
                                obj26 = cls24.getMethod((java.lang.String) objArr82[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr81)).longValue();
                            long j31 = ~longValue7;
                            str4 = str3;
                            long j32 = (((-317) * longValue7) - 273742794996L) + (((~(j9 | 858127883)) | j31) * (-318)) + (((~((-858127884) | j11 | longValue7)) | (~(j31 | j9))) * 318) + (((~(longValue7 | (-858127884) | j9)) | (~(j31 | j11 | (-858127884)))) * 318) + 2115228408;
                            if (((((int) (j32 >> 32)) & ((((~(i6 | (-1093798944))) | (~((-343427468) | i))) * (-370)) + 635053406 + (((~((-1093798944) | i)) | (~(i6 | (-343427468))) | (-1434078624)) * (-370)) + 1966853824)) | (((int) j32) & (((((~(i6 | (-1693476532))) | 1622173362) * 529) - 1520785380) + (((~((-1693476532) | i)) | (-256250122)) * 529)))) == 1986687685) {
                                str5 = str4;
                                i11 = 0;
                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                a(android.view.Gravity.getAbsoluteGravity(i11, i11) + 614, (char) ((-1) - android.os.Process.getGidForName(str5)), 16 - android.graphics.Color.blue(i11), objArr83);
                                java.lang.Object[] objArr84 = {((java.lang.String) objArr83[i11]).intern()};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, 1921 - android.graphics.Color.red(0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                    byte[] bArr14 = $$a;
                                    byte b49 = (byte) (-bArr14[16]);
                                    byte b50 = bArr14[14];
                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                    b(b49, b50, (short) (b50 | 652), objArr85);
                                    obj = cls25.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                }
                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr84);
                                if (invoke != null) {
                                    i12 = 0;
                                } else {
                                    java.lang.Object[] objArr86 = {invoke, 42};
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj27 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.Gravity.getAbsoluteGravity(0, 0), 2594 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                        byte[] bArr15 = $$a;
                                        byte b51 = (byte) (-bArr15[16]);
                                        byte b52 = bArr15[14];
                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                        b(b51, b52, (short) (b52 | 652), objArr87);
                                        obj27 = cls26.getMethod((java.lang.String) objArr87[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj27);
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr86)).longValue();
                                    long j33 = ((382 * longValue8) - 366272488220L) + ((longValue8 | j9 | (-963874970)) * (-381)) + (((~((-963874970) | (~longValue8))) | (~(j11 | longValue8)) | (~(963874969 | longValue8))) * 381) + ((~(longValue8 | (-963874970))) * 381) + 293225555;
                                    i12 = (((int) (j33 >> 32)) & (((((~((-538546749) | i)) | (-898679663)) * (-964)) - 2133519970) + (((~(i6 | (-538546749))) | 593936) * (-964)))) | (((int) j33) & ((((69641 | r5) * (-476)) - 454086895) + ((~(2113387263 | i)) * 952) + ((~(i6 | 2113387263)) * 476)));
                                }
                                if (i12 != 1986687685 && i12 != -1514516938) {
                                    getGpoResponse = (getCvrMaskAnd + 45) % 128;
                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                    a(1328 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), 13 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr88);
                                    java.lang.String intern14 = ((java.lang.String) objArr88[0]).intern();
                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                    a(1342 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1539 - android.view.View.MeasureSpec.getMode(0)), 27 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr89);
                                    java.lang.String intern15 = ((java.lang.String) objArr89[0]).intern();
                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                    a(1368 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, objArr90);
                                    java.lang.String intern16 = ((java.lang.String) objArr90[0]).intern();
                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                    a(1385 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.os.Process.myPid() >> 22), 16 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr91);
                                    java.lang.String intern17 = ((java.lang.String) objArr91[0]).intern();
                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                    a(1402 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str5, str5) + 40483), 15 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr92);
                                    java.lang.String intern18 = ((java.lang.String) objArr92[0]).intern();
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    a(1417 - android.view.View.getDefaultSize(0, 0), (char) (61231 - android.view.View.combineMeasuredStates(0, 0)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 37, objArr93);
                                    java.lang.String intern19 = ((java.lang.String) objArr93[0]).intern();
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    a(android.view.KeyEvent.keyCodeFromString(str5) + 1454, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 12, objArr94);
                                    java.lang.String intern20 = ((java.lang.String) objArr94[0]).intern();
                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                    a(1465 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (22672 - (android.os.Process.myTid() >> 22)), 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr95);
                                    java.lang.String intern21 = ((java.lang.String) objArr95[0]).intern();
                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                    a(android.graphics.Color.red(0) + 1479, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr96);
                                    java.lang.String intern22 = ((java.lang.String) objArr96[0]).intern();
                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 1501, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 31, objArr97);
                                    java.lang.String intern23 = ((java.lang.String) objArr97[0]).intern();
                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                    a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1532, (char) (29837 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, objArr98);
                                    java.lang.String intern24 = ((java.lang.String) objArr98[0]).intern();
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1545, (char) android.graphics.Color.green(0), 13 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr99);
                                    java.lang.String intern25 = ((java.lang.String) objArr99[0]).intern();
                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                    a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1555, (char) (android.text.TextUtils.indexOf(str5, str5) + 22835), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr100);
                                    java.lang.String intern26 = ((java.lang.String) objArr100[0]).intern();
                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                    a(1568 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (16054 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr101);
                                    java.lang.String intern27 = ((java.lang.String) objArr101[0]).intern();
                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                    a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1579, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 12, objArr102);
                                    java.lang.String intern28 = ((java.lang.String) objArr102[0]).intern();
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    a(1592 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (58909 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - android.view.KeyEvent.getDeadChar(0, 0), objArr103);
                                    java.lang.String intern29 = ((java.lang.String) objArr103[0]).intern();
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    a(1606 - android.text.TextUtils.getOffsetAfter(str5, 0), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, objArr104);
                                    java.lang.String intern30 = ((java.lang.String) objArr104[0]).intern();
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    a((android.os.Process.myPid() >> 22) + 1618, (char) android.text.TextUtils.indexOf(str5, str5), android.graphics.Color.argb(0, 0, 0, 0) + 24, objArr105);
                                    java.lang.String intern31 = ((java.lang.String) objArr105[0]).intern();
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    a(1641 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (38849 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 28 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr106);
                                    java.lang.String[] strArr10 = {intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, ((java.lang.String) objArr106[0]).intern()};
                                    i16 = 0;
                                    while (i16 < 19) {
                                        java.lang.String str13 = strArr10[i16];
                                        java.lang.Object[] objArr107 = {str13};
                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj28 == null) {
                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 3161 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                            byte[] bArr16 = $$a;
                                            byte b53 = (byte) (-bArr16[16]);
                                            byte b54 = (byte) (bArr16[14] - 1);
                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                            b(b53, b54, (short) (b54 | 35), objArr108);
                                            obj28 = cls27.getMethod((java.lang.String) objArr108[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj28);
                                        }
                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr107)).longValue();
                                        long j34 = ~longValue9;
                                        long j35 = 680051243 | j34;
                                        long j36 = 1587521982 + ((-764) * longValue9) + 1039798352076L + (((~(j35 | j11)) | (~(longValue9 | 680051243 | j9)) | (~((-680051244) | j34 | j9))) * 765) + (((~j35) | (~(680051243 | j11))) * 1530) + (((~(j34 | j11 | (-680051244))) | (~(j9 | 680051243))) * 765);
                                        int i47 = ~(1321257221 | i);
                                        if (((((int) j36) & (((((~((-768287568) | i)) | 668938842) * (-668)) - 1327670967) + (((~(668938842 | i)) | (-768287568)) * 1336) + (((-134217990) | i) * 668))) | (((int) (j36 >> 32)) & (((286531658 | i47) * (-280)) + 1504157218 + ((i47 | (~(1536483663 | i))) * 140) + (((~(1607788879 | i)) | (~(i6 | (-286531659))) | (~(i6 | (-71305217)))) * 140)))) == 0) {
                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1591, (char) (58910 - android.view.View.resolveSize(0, 0)), 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr109);
                                            if (str13.equals(((java.lang.String) objArr109[0]).intern())) {
                                                java.lang.Object[] objArr110 = {str13};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj29 == null) {
                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str5, str5, 0, 0) + 36, 3161 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 33100));
                                                    byte[] bArr17 = $$a;
                                                    byte b55 = bArr17[21];
                                                    byte b56 = bArr17[14];
                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                    b(b55, b56, (short) (b56 | 40), objArr111);
                                                    obj29 = cls28.getMethod((java.lang.String) objArr111[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj29);
                                                }
                                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr110)).longValue();
                                                long j37 = ~longValue10;
                                                strArr4 = strArr10;
                                                i19 = i16;
                                                long j38 = (407 * longValue10) + 236803768515L + (((~((-584700663) | j11 | longValue10)) | (~(j37 | j9))) * (-406)) + ((~(j37 | j11 | (-584700663))) * (-406)) + (((~(j11 | longValue10)) | (~(j9 | 584700662))) * 406) + 1580135566;
                                                if (((((int) (j38 >> 32)) & ((((((~((-543065601) | i)) | 541754880) | r3) * (-470)) - 1636017750) + (((~(i6 | 895471530)) | (~((-1310721) | i))) * 470))) | (((int) j38) & ((((~(i6 | (-804020556))) | (-633205855)) * (-1042)) + 1657886890 + (((-804020556) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(633205854 | i)) | (-805172576) | (~(i6 | (-632053835)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != 0) {
                                                }
                                            } else {
                                                strArr4 = strArr10;
                                                i19 = i16;
                                            }
                                            i16 = i19 + 1;
                                            strArr10 = strArr4;
                                        } else {
                                            i19 = i16;
                                        }
                                        i17 = i19;
                                    }
                                    i17 = -1;
                                    if (i17 >= 0 && (i18 = i ^ (i17 + 130)) != i) {
                                        java.lang.Object[] objArr112 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                        int i48 = ~(i | (-1638465602));
                                        java.lang.Object[] objArr113 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((68177192 | i48) * (-476)) + 1917872917 + (i48 * 952) + ((~(i6 | (-1638465602))) * 476))};
                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj2 == null) {
                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2713 - android.text.TextUtils.getOffsetAfter(str5, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                            byte b57 = (byte) ($$a[14] - 1);
                                            byte b58 = b57;
                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                            b(b57, b58, b58, objArr114);
                                            obj2 = cls29.getMethod((java.lang.String) objArr114[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                        }
                                        ((int[]) objArr112[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr113)).intValue();
                                        return objArr112;
                                    }
                                }
                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1671, (char) android.text.TextUtils.getOffsetBefore(str5, 0), 12 - android.os.Process.getGidForName(str5), objArr115);
                                java.lang.String intern32 = ((java.lang.String) objArr115[0]).intern();
                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                a(1683 - android.view.View.MeasureSpec.getMode(0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 50996), 4 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr116);
                                java.lang.String[] strArr11 = {intern32, ((java.lang.String) objArr116[0]).intern()};
                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                a(1688 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.MeasureSpec.getMode(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 15, objArr117);
                                java.lang.String intern33 = ((java.lang.String) objArr117[0]).intern();
                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1703, (char) (android.view.KeyEvent.keyCodeFromString(str5) + 56448), 18 - android.view.MotionEvent.axisFromString(str5), objArr118);
                                java.lang.String intern34 = ((java.lang.String) objArr118[0]).intern();
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 1722, (char) android.view.View.getDefaultSize(0, 0), 13 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr119);
                                java.lang.String[] strArr12 = {intern33, intern34, ((java.lang.String) objArr119[0]).intern()};
                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                a((android.os.Process.myPid() >> 22) + 1736, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 21 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr120);
                                java.lang.String intern35 = ((java.lang.String) objArr120[0]).intern();
                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                a(1757 - android.view.View.getDefaultSize(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 9 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr121);
                                java.lang.String[] strArr13 = {intern35, ((java.lang.String) objArr121[0]).intern()};
                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                a(1767 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr122);
                                java.lang.String intern36 = ((java.lang.String) objArr122[0]).intern();
                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                a(503 - android.text.TextUtils.indexOf(str5, str5, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr123);
                                java.lang.String[] strArr14 = {intern36, ((java.lang.String) objArr123[0]).intern()};
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                a(1778 - android.text.TextUtils.getOffsetAfter(str5, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 28, objArr124);
                                c = 0;
                                java.lang.String intern37 = ((java.lang.String) objArr124[0]).intern();
                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                a(1757 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString(str5) + 10, objArr125);
                                java.lang.String[][] strArr15 = {strArr11, strArr12, strArr13, strArr14, new java.lang.String[]{intern37, ((java.lang.String) objArr125[0]).intern()}};
                                i13 = 0;
                                int i49 = -1;
                                loop4: while (true) {
                                    if (i13 < 5) {
                                        i14 = i;
                                        break;
                                    }
                                    java.lang.String[] strArr16 = strArr15[i13];
                                    java.lang.String str14 = strArr16[c];
                                    java.lang.String[] strArr17 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                    int length = strArr17.length;
                                    int i50 = 0;
                                    while (i50 < length) {
                                        java.lang.String str15 = strArr17[i50];
                                        java.io.File file2 = new java.io.File(str14);
                                        if (file2.exists() && file2.isFile()) {
                                            try {
                                                java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                                strArr2 = strArr15;
                                                try {
                                                    strArr3 = strArr17;
                                                    try {
                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                        str8 = str14;
                                                        try {
                                                            a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 509, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 1 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr126);
                                                            java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr126[0]).intern());
                                                            next = useDelimiter2.hasNext() ? useDelimiter2.next() : str5;
                                                            useDelimiter2.close();
                                                        } catch (java.io.IOException unused2) {
                                                            continue;
                                                        }
                                                    } catch (java.io.IOException unused3) {
                                                    }
                                                } catch (java.io.IOException unused4) {
                                                }
                                            } catch (java.io.IOException unused5) {
                                            }
                                            if (next.contains(str15)) {
                                                getGpoResponse = (getCvrMaskAnd + 19) % 128;
                                                i14 = i ^ (i49 + 171);
                                                break loop4;
                                            }
                                            i50++;
                                            i49++;
                                            strArr15 = strArr2;
                                            str14 = str8;
                                            strArr17 = strArr3;
                                        }
                                        strArr2 = strArr15;
                                        strArr3 = strArr17;
                                        str8 = str14;
                                        i50++;
                                        i49++;
                                        strArr15 = strArr2;
                                        str14 = str8;
                                        strArr17 = strArr3;
                                    }
                                    i13++;
                                    c = 0;
                                }
                                if (i14 == i) {
                                    java.lang.Object[] objArr127 = {new int[]{i}, new int[]{i14}, null, null, new int[1]};
                                    java.lang.Object[] objArr128 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~(i | (-1931538242))) | (-119307857)) * (-948)) + 2058332677) + ((~(i6 | (-50359873))) * (-948))) - 945666920)};
                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj30 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, android.text.TextUtils.indexOf(str5, str5, 0) + 2713, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                        byte b59 = (byte) ($$a[14] - 1);
                                        byte b60 = b59;
                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                        b(b59, b60, b60, objArr129);
                                        obj30 = cls30.getMethod((java.lang.String) objArr129[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                    }
                                    ((int[]) objArr127[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr128)).intValue();
                                    return objArr127;
                                }
                                try {
                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str5, str5, 0) + 1806, (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 7701), 13 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr130);
                                    java.lang.String intern38 = ((java.lang.String) objArr130[0]).intern();
                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                    a(1819 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (23826 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, objArr131);
                                    try {
                                        java.lang.Object[] objArr132 = {intern38, ((java.lang.String) objArr131[0]).intern()};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj31 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 2213 - android.view.View.getDefaultSize(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                            byte[] bArr18 = $$a;
                                            byte b61 = (byte) (-bArr18[16]);
                                            byte b62 = bArr18[14];
                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                            b(b61, b62, (short) (b62 | 652), objArr133);
                                            obj31 = cls31.getMethod((java.lang.String) objArr133[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj31);
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr132)).longValue();
                                        long j39 = ~longValue11;
                                        long j40 = ~(729550658 | longValue11);
                                        long j41 = (((((longValue11 * 371) + 270663294118L) + (((~(j39 | j11)) | (~(j9 | (-729550659)))) * (-370))) + ((((~(j39 | j9)) | (~((-729550659) | j11))) | j40) * (-370))) + (j40 * 370)) - 1464925260;
                                        int i51 = ~(621082336 | i);
                                        i15 = ((((int) j41) & ((((((-2142240491) | i51) * (-814)) + (-405144296)) + ((i51 | ((~(i6 | 2058308746)) | 537150592)) * 407)) + ((((~((-621082337) | i)) | 537150592) | (~((-2058308747) | i))) * 407))) | (((int) (j41 >> 32)) & ((((((~((-967847442) | i)) | 430974481) * 336) + 501358106) + (((~(469378969 | i)) | (-1006251930)) * (-168))) + (((~(i6 | 469378969)) | (-967847442)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != 0 ? i ^ 150 : i;
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Exception unused6) {
                                    i15 = i ^ 151;
                                }
                                if (i15 != i) {
                                    java.lang.Object[] objArr134 = {new int[]{i}, new int[]{i15}, null, null, new int[1]};
                                    java.lang.Object[] objArr135 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((-150995201) | i) * (-627)) - 558839884) + (((~((-1895291518) | i)) | 155554580) * (-627)) + (((~(i | 155554580)) | (~(i6 | 1895291517))) * 627))};
                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj32 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                        byte b63 = (byte) ($$a[14] - 1);
                                        byte b64 = b63;
                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                        b(b63, b64, b64, objArr136);
                                        obj32 = cls32.getMethod((java.lang.String) objArr136[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                    }
                                    ((int[]) objArr134[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr135)).intValue();
                                    return objArr134;
                                }
                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                a(1875 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.getDeadChar(0, 0), 47 - android.text.TextUtils.indexOf(str5, str5, 0), objArr137);
                                java.lang.Object[] objArr138 = {((java.lang.String) objArr137[0]).intern()};
                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj33 == null) {
                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3161 - (android.os.Process.myTid() >> 22), (char) (33099 - android.graphics.Color.green(0)));
                                    byte[] bArr19 = $$a;
                                    byte b65 = (byte) (-bArr19[16]);
                                    byte b66 = bArr19[14];
                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                    b(b65, b66, (short) (b66 | 652), objArr139);
                                    obj33 = cls33.getMethod((java.lang.String) objArr139[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj33);
                                }
                                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr138)).longValue();
                                long j42 = ((((334 * longValue12) - 130348801835L) + (((~((-392616875) | j11)) | (~(longValue12 | j9))) * 333)) + (((~(longValue12 | j11)) | (~(j9 | (-392616875)))) * 333)) - 1730284982;
                                int i52 = (((((int) (j42 >> 32)) & (((((~(1772305787 | i)) | 689000866) * 398) - 119644230) + (((~(i6 | 1772305787)) | 689000866) * 398))) | (((int) j42) & (((((~(199523577 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 60872397) + ((i6 | 1810824955) * (-216))) + (((~(i6 | 199523577)) | (-1636749988)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)))) * 263) ^ i;
                                if (i52 == i) {
                                    java.lang.Object[] objArr140 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr141 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~(i6 | (-145987948))) | 1904858150) * (-602)) - 1283083844) + (((~(i | (-145987948))) | 8491042 | (~(i6 | 2042355055))) * (-301)) + ((~(i6 | 1904858150)) * 301))};
                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj34 == null) {
                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                        byte b67 = (byte) ($$a[14] - 1);
                                        byte b68 = b67;
                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                        b(b67, b68, b68, objArr142);
                                        obj34 = cls34.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                    }
                                    ((int[]) objArr140[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr141)).intValue();
                                    return objArr140;
                                }
                                getGpoResponse = (getCvrMaskAnd + 69) % 128;
                                java.lang.Object[] objArr143 = {new int[]{i}, new int[]{i52}, null, null, new int[1]};
                                java.lang.Object[] objArr144 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i6 | (-1673613427))) | (~((-377232672) | i))) * 1900) - 632760965) + (((~(i6 | 377232671)) | (~(1673613426 | i))) * (-950)) + (((~(i | 377232671)) | (~(i6 | 1673613426))) * 950))};
                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj35 == null) {
                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, android.graphics.Color.green(0) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                    byte b69 = (byte) ($$a[14] - 1);
                                    byte b70 = b69;
                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                    b(b69, b70, b70, objArr145);
                                    obj35 = cls35.getMethod((java.lang.String) objArr145[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                }
                                ((int[]) objArr143[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr144)).intValue();
                                return objArr143;
                            }
                        } else {
                            str4 = str3;
                        }
                        java.lang.String str16 = str4;
                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                        a(476 - android.graphics.Color.alpha(0), (char) ((-1) - android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 23 - android.text.TextUtils.getTrimmedLength(str16), objArr146);
                        java.lang.String intern39 = ((java.lang.String) objArr146[0]).intern();
                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 532, (char) android.view.Gravity.getAbsoluteGravity(0, 0), 10 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr147);
                        java.lang.String intern40 = ((java.lang.String) objArr147[0]).intern();
                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                        a(543 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (4954 - android.text.TextUtils.indexOf(str16, str16, 0, 0)), android.text.TextUtils.getCapsMode(str16, 0, 0) + 7, objArr148);
                        java.lang.String intern41 = ((java.lang.String) objArr148[0]).intern();
                        java.lang.Object[] objArr149 = new java.lang.Object[1];
                        a(549 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (9273 - android.view.View.combineMeasuredStates(0, 0)), android.view.Gravity.getAbsoluteGravity(0, 0) + 8, objArr149);
                        java.lang.String[] strArr18 = {intern39, intern40, intern41, ((java.lang.String) objArr149[0]).intern()};
                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                        a(559 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (33091 - android.graphics.Color.alpha(0)), 17 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr150);
                        java.lang.String intern42 = ((java.lang.String) objArr150[0]).intern();
                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                        a(576 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 7 - android.graphics.Color.blue(0), objArr151);
                        java.lang.String intern43 = ((java.lang.String) objArr151[0]).intern();
                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                        a(android.graphics.Color.rgb(0, 0, 0) + 16777798, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 7, objArr152);
                        java.lang.String intern44 = ((java.lang.String) objArr152[0]).intern();
                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                        a(android.graphics.Color.blue(0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED, (char) (android.view.View.combineMeasuredStates(0, 0) + 36499), android.os.Process.getGidForName(str16) + 12, objArr153);
                        java.lang.String intern45 = ((java.lang.String) objArr153[0]).intern();
                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                        a(600 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 14 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr154);
                        java.lang.String[] strArr19 = {intern42, intern43, intern44, intern45, ((java.lang.String) objArr154[0]).intern()};
                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                        a(614 - android.view.KeyEvent.keyCodeFromString(str16), (char) android.text.TextUtils.getTrimmedLength(str16), 16 - android.view.View.MeasureSpec.getSize(0), objArr155);
                        java.lang.String intern46 = ((java.lang.String) objArr155[0]).intern();
                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                        a(629 - android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr156);
                        java.lang.String intern47 = ((java.lang.String) objArr156[0]).intern();
                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                        a(android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 642, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr157);
                        java.lang.String intern48 = ((java.lang.String) objArr157[0]).intern();
                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                        a(android.graphics.Color.red(0) + 663, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26169), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, objArr158);
                        java.lang.String intern49 = ((java.lang.String) objArr158[0]).intern();
                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                        a(687 - android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 27 - android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr159);
                        java.lang.String[] strArr20 = {intern46, intern47, str, intern48, intern49, ((java.lang.String) objArr159[0]).intern()};
                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                        a(717 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore(str16, 0), 11 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr160);
                        java.lang.String intern50 = ((java.lang.String) objArr160[0]).intern();
                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                        a(727 - android.graphics.Color.alpha(0), (char) android.view.KeyEvent.normalizeMetaState(0), 8 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr161);
                        java.lang.String intern51 = ((java.lang.String) objArr161[0]).intern();
                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                        a(735 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 5697), android.widget.ExpandableListView.getPackedPositionType(0L) + 6, objArr162);
                        java.lang.String intern52 = ((java.lang.String) objArr162[0]).intern();
                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                        a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 741, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 6 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr163);
                        java.lang.String[] strArr21 = {intern50, intern51, intern52, ((java.lang.String) objArr163[0]).intern()};
                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                        a(android.graphics.ImageFormat.getBitsPerPixel(0) + 748, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 42870), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, objArr164);
                        java.lang.String intern53 = ((java.lang.String) objArr164[0]).intern();
                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                        a(582 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.text.TextUtils.indexOf(str16, str16), android.view.KeyEvent.normalizeMetaState(0) + 7, objArr165);
                        java.lang.String intern54 = ((java.lang.String) objArr165[0]).intern();
                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                        a(android.graphics.Color.blue(0) + 550, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 9273), android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, objArr166);
                        java.lang.String[] strArr22 = {intern53, intern54, ((java.lang.String) objArr166[0]).intern()};
                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                        a(763 - android.text.TextUtils.getTrimmedLength(str16), (char) android.graphics.Color.red(0), 14 - android.text.TextUtils.indexOf(str16, str16, 0, 0), objArr167);
                        java.lang.String intern55 = ((java.lang.String) objArr167[0]).intern();
                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                        a(776 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (26788 - android.graphics.Color.blue(0)), android.text.TextUtils.getOffsetBefore(str16, 0) + 1, objArr168);
                        java.lang.String[] strArr23 = {intern55, ((java.lang.String) objArr168[0]).intern()};
                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 778, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17172), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 9, objArr169);
                        java.lang.String intern56 = ((java.lang.String) objArr169[0]).intern();
                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                        a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 145, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9248), android.text.TextUtils.getTrimmedLength(str16) + 1, objArr170);
                        java.lang.String[] strArr24 = {intern56, ((java.lang.String) objArr170[0]).intern()};
                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                        a(android.widget.ExpandableListView.getPackedPositionType(0L) + 787, (char) android.widget.ExpandableListView.getPackedPositionType(0L), android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 17, objArr171);
                        java.lang.String intern57 = ((java.lang.String) objArr171[0]).intern();
                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                        a(630 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, objArr172);
                        java.lang.String intern58 = ((java.lang.String) objArr172[0]).intern();
                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                        a(574 - android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, objArr173);
                        java.lang.String intern59 = ((java.lang.String) objArr173[0]).intern();
                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                        a(804 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.os.Process.myPid() >> 22) + 23099), 9 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr174);
                        java.lang.String intern60 = ((java.lang.String) objArr174[0]).intern();
                        java.lang.Object[] objArr175 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED, (char) (android.text.TextUtils.indexOf(str16, str16) + 36499), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 11, objArr175);
                        java.lang.String intern61 = ((java.lang.String) objArr175[0]).intern();
                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                        a(600 - android.text.TextUtils.indexOf(str16, str16, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 15 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr176);
                        java.lang.String[] strArr25 = {intern57, intern58, intern59, intern60, intern61, ((java.lang.String) objArr176[0]).intern()};
                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                        a(811 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 21 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr177);
                        java.lang.String intern62 = ((java.lang.String) objArr177[0]).intern();
                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                        a(830 - android.view.MotionEvent.axisFromString(str16), (char) (62501 - android.os.Process.getGidForName(str16)), 19 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr178);
                        java.lang.String intern63 = ((java.lang.String) objArr178[0]).intern();
                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                        a(850 - android.view.View.combineMeasuredStates(0, 0), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 9954), 30 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr179);
                        java.lang.String intern64 = ((java.lang.String) objArr179[0]).intern();
                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                        a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 881, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 49936), 27 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr180);
                        java.lang.String intern65 = ((java.lang.String) objArr180[0]).intern();
                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                        a(android.text.TextUtils.indexOf(str16, str16, 0) + 907, (char) android.text.TextUtils.getOffsetAfter(str16, 0), 22 - android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr181);
                        java.lang.String intern66 = ((java.lang.String) objArr181[0]).intern();
                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 930, (char) (56343 - android.text.TextUtils.getCapsMode(str16, 0, 0)), android.graphics.Color.green(0) + 33, objArr182);
                        java.lang.String[] strArr26 = {intern62, intern63, intern64, intern65, intern66, ((java.lang.String) objArr182[0]).intern(), str};
                        java.lang.Object[] objArr183 = new java.lang.Object[1];
                        a(964 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 14 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr183);
                        java.lang.String intern67 = ((java.lang.String) objArr183[0]).intern();
                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                        a(543 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (4954 - android.text.TextUtils.getTrimmedLength(str16)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, objArr184);
                        java.lang.String[] strArr27 = {intern67, ((java.lang.String) objArr184[0]).intern()};
                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 976, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, objArr185);
                        java.lang.String intern68 = ((java.lang.String) objArr185[0]).intern();
                        java.lang.Object[] objArr186 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1006, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.indexOf(str16, str16) + 11, objArr186);
                        java.lang.String[] strArr28 = {intern68, ((java.lang.String) objArr186[0]).intern()};
                        java.lang.Object[] objArr187 = new java.lang.Object[1];
                        a(1017 - android.graphics.Color.alpha(0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 31585), 18 - android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr187);
                        java.lang.String intern69 = ((java.lang.String) objArr187[0]).intern();
                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL, (char) (19509 - android.text.TextUtils.getOffsetAfter(str16, 0)), 5 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr188);
                        java.lang.String[] strArr29 = {intern69, ((java.lang.String) objArr188[0]).intern()};
                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                        a(android.view.View.resolveSizeAndState(0, 0, 0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_ICC_UNTAGGED, (char) android.view.View.resolveSizeAndState(0, 0, 0), 19 - android.graphics.Color.blue(0), objArr189);
                        java.lang.String[] strArr30 = {((java.lang.String) objArr189[0]).intern()};
                        java.lang.Object[] objArr190 = new java.lang.Object[1];
                        a(1060 - android.text.TextUtils.getOffsetBefore(str16, 0), (char) (44672 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr190);
                        java.lang.String[] strArr31 = {((java.lang.String) objArr190[0]).intern()};
                        java.lang.Object[] objArr191 = new java.lang.Object[1];
                        a(1076 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (58449 - android.os.Process.getGidForName(str16)), (-16777197) - android.graphics.Color.rgb(0, 0, 0), objArr191);
                        java.lang.String[] strArr32 = {((java.lang.String) objArr191[0]).intern()};
                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                        a(android.view.MotionEvent.axisFromString(str16) + 1096, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19 - android.view.View.resolveSize(0, 0), objArr192);
                        java.lang.String[] strArr33 = {((java.lang.String) objArr192[0]).intern()};
                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1114, (char) (15124 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.CAN, objArr193);
                        java.lang.String[] strArr34 = {((java.lang.String) objArr193[0]).intern()};
                        java.lang.Object[] objArr194 = new java.lang.Object[1];
                        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1138, (char) android.graphics.Color.alpha(0), 21 - android.text.TextUtils.indexOf(str16, str16), objArr194);
                        java.lang.String[] strArr35 = {((java.lang.String) objArr194[0]).intern()};
                        java.lang.Object[] objArr195 = new java.lang.Object[1];
                        a(1158 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (58087 - android.view.View.resolveSizeAndState(0, 0, 0)), 24 - android.view.View.resolveSizeAndState(0, 0, 0), objArr195);
                        java.lang.String str17 = str;
                        java.lang.String[] strArr36 = {((java.lang.String) objArr195[0]).intern(), str17};
                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                        a(1182 - android.text.TextUtils.indexOf(str16, str16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 28 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr196);
                        java.lang.String[] strArr37 = {((java.lang.String) objArr196[0]).intern(), str17};
                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                        a(1209 - android.view.MotionEvent.axisFromString(str16), (char) (android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 27 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr197);
                        java.lang.String[] strArr38 = {((java.lang.String) objArr197[0]).intern(), str17};
                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                        a(1237 - android.view.KeyEvent.normalizeMetaState(0), (char) (55199 - (android.os.Process.myTid() >> 22)), 30 - android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr198);
                        java.lang.String[] strArr39 = {((java.lang.String) objArr198[0]).intern(), str17};
                        java.lang.Object[] objArr199 = new java.lang.Object[1];
                        a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1268, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26, objArr199);
                        java.lang.String[] strArr40 = {((java.lang.String) objArr199[0]).intern(), str17};
                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                        a(1295 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (11916 - android.os.Process.getGidForName(str16)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32, objArr200);
                        char c2 = 0;
                        java.lang.String[][] strArr41 = {strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new java.lang.String[]{((java.lang.String) objArr200[0]).intern(), str17}};
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i53 = i;
                        int i54 = 0;
                        int i55 = 0;
                        int i56 = 24;
                        while (i54 < i56) {
                            java.lang.String[] strArr42 = strArr41[i54];
                            java.lang.Object[] objArr201 = {strArr42[c2]};
                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj36 == null) {
                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1920 - android.text.TextUtils.lastIndexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                byte[] bArr20 = $$a;
                                byte b71 = (byte) (-bArr20[16]);
                                byte b72 = bArr20[14];
                                strArr = strArr41;
                                str6 = str16;
                                java.lang.Object[] objArr202 = new java.lang.Object[1];
                                b(b71, b72, (short) (b72 | 652), objArr202);
                                obj36 = cls36.getMethod((java.lang.String) objArr202[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj36);
                            } else {
                                strArr = strArr41;
                                str6 = str16;
                            }
                            java.lang.String str18 = (java.lang.String) ((java.lang.reflect.Method) obj36).invoke(null, objArr201);
                            java.lang.String[] strArr43 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr42, 1, strArr42.length);
                            if (str18 != null && str18.length() != 0) {
                                int i57 = getCvrMaskAnd + 47;
                                getGpoResponse = i57 % 128;
                                int length2 = strArr42.length;
                                if (i57 % 2 == 0 ? length2 == 1 : length2 == 0) {
                                    arrayList = arrayList2;
                                    str7 = str18;
                                } else {
                                    java.lang.Object[] objArr203 = {str18, strArr43};
                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                    if (obj37 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43, 2880 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                                        byte[] bArr21 = $$a;
                                        byte b73 = (byte) (-bArr21[16]);
                                        byte b74 = bArr21[14];
                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                        b(b73, b74, (short) (b74 | 652), objArr204);
                                        obj37 = cls37.getMethod((java.lang.String) objArr204[0], java.lang.String.class, java.lang.String[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj37);
                                    }
                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr203)).longValue();
                                    long j43 = ~((~longValue13) | 463008290);
                                    long j44 = (-463008291) | longValue13;
                                    str7 = str18;
                                    arrayList = arrayList2;
                                    long j45 = (((((longValue13 * (-755)) + 349571259705L) + (1512 * j43)) + ((j43 | (~(j44 | j9))) * (-756))) + ((j44 | j11) * 756)) - 1565703488;
                                    int i58 = (int) (j45 >> 32);
                                    int i59 = ~(404901003 | i);
                                    if (((i58 & ((((((~((-404901004) | i)) | 402655243) | (~((-1032325408) | i))) * (-880)) - 818885110) + (((~(i6 | (-404901004))) | 1032325407 | i59) * (-880)) + (i59 * 880))) | (((int) j45) & ((((~(349741942 | i)) | 1073811457) * (-283)) + 1803705200 + ((~(1423553399 | i)) * 283)))) == 0) {
                                        arrayList2 = arrayList;
                                    }
                                }
                                i55++;
                                i53 = i ^ (i54 + 10);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.lang.String str19 = str7;
                                sb.append(str19);
                                java.lang.Object[] objArr205 = new java.lang.Object[1];
                                a(1327 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (13667 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr205);
                                sb.append(((java.lang.String) objArr205[0]).intern());
                                sb.append(str19);
                                arrayList2 = arrayList;
                                arrayList2.add(sb.toString());
                            }
                            i54++;
                            strArr41 = strArr;
                            str16 = str6;
                            i56 = 24;
                            c2 = 0;
                        }
                        java.lang.String str20 = str16;
                        if (i55 > 2) {
                            getCvrMaskAnd = (getGpoResponse + 37) % 128;
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i53}, arrayList2, null, new int[1]};
                            java.lang.Object[] objArr206 = {num, num, java.lang.Integer.valueOf(((((~((-1753295278) | i)) | 2034068041) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 846843315) + (((~(i6 | (-1753295278))) | 2034068041) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj38 == null) {
                                str5 = str20;
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str5, str5, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                byte b75 = (byte) ($$a[14] - 1);
                                byte b76 = b75;
                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                b(b75, b76, b76, objArr207);
                                obj38 = cls38.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                            } else {
                                str5 = str20;
                            }
                            ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr206)).intValue();
                            i10 = 0;
                        } else {
                            str5 = str20;
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr208 = {num, num, java.lang.Integer.valueOf((((~((-399639472) | i)) | (~(i6 | 1651206626))) * (-1808)) + 210536825 + (((~((-37880227) | i)) | (~(i6 | 2012965871))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-1651206627) | i)) | 361759245 | (~(i6 | 399639471))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj39 == null) {
                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) android.text.TextUtils.indexOf(str5, str5));
                                byte b77 = (byte) ($$a[14] - 1);
                                byte b78 = b77;
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                b(b77, b78, b78, objArr209);
                                obj39 = cls39.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr208)).intValue();
                            i10 = 0;
                            ((int[]) objArr[4])[0] = intValue;
                        }
                        int i60 = ((int[]) objArr[1])[i10];
                        if (i60 != i) {
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            java.util.List list = (java.util.List) objArr[2];
                            iArr[i10] = i;
                            iArr2[i10] = i60;
                            java.lang.Object[] objArr210 = {iArr, iArr2, list, null, new int[1]};
                            java.lang.Object[] objArr211 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((i6 | 1975312125) * (-369)) - 1396155502) + (((~(i6 | (-630759134))) | 1420086964) * (-369)) + (((~(i | 630759133)) | 1344552992 | (~(i6 | (-555225162)))) * 369))};
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj40 == null) {
                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                byte b79 = (byte) ($$a[14] - 1);
                                byte b80 = b79;
                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                b(b79, b80, b80, objArr212);
                                obj40 = cls40.getMethod((java.lang.String) objArr212[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                            }
                            ((int[]) objArr210[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr211)).intValue();
                            return objArr210;
                        }
                        i11 = i10;
                        java.lang.Object[] objArr832 = new java.lang.Object[1];
                        a(android.view.Gravity.getAbsoluteGravity(i11, i11) + 614, (char) ((-1) - android.os.Process.getGidForName(str5)), 16 - android.graphics.Color.blue(i11), objArr832);
                        java.lang.Object[] objArr842 = {((java.lang.String) objArr832[i11]).intern()};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj == null) {
                        }
                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr842);
                        if (invoke != null) {
                        }
                        if (i12 != 1986687685) {
                            getGpoResponse = (getCvrMaskAnd + 45) % 128;
                            java.lang.Object[] objArr882 = new java.lang.Object[1];
                            a(1328 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), 13 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr882);
                            java.lang.String intern142 = ((java.lang.String) objArr882[0]).intern();
                            java.lang.Object[] objArr892 = new java.lang.Object[1];
                            a(1342 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1539 - android.view.View.MeasureSpec.getMode(0)), 27 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr892);
                            java.lang.String intern152 = ((java.lang.String) objArr892[0]).intern();
                            java.lang.Object[] objArr902 = new java.lang.Object[1];
                            a(1368 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, objArr902);
                            java.lang.String intern162 = ((java.lang.String) objArr902[0]).intern();
                            java.lang.Object[] objArr912 = new java.lang.Object[1];
                            a(1385 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.os.Process.myPid() >> 22), 16 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr912);
                            java.lang.String intern172 = ((java.lang.String) objArr912[0]).intern();
                            java.lang.Object[] objArr922 = new java.lang.Object[1];
                            a(1402 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str5, str5) + 40483), 15 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr922);
                            java.lang.String intern182 = ((java.lang.String) objArr922[0]).intern();
                            java.lang.Object[] objArr932 = new java.lang.Object[1];
                            a(1417 - android.view.View.getDefaultSize(0, 0), (char) (61231 - android.view.View.combineMeasuredStates(0, 0)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 37, objArr932);
                            java.lang.String intern192 = ((java.lang.String) objArr932[0]).intern();
                            java.lang.Object[] objArr942 = new java.lang.Object[1];
                            a(android.view.KeyEvent.keyCodeFromString(str5) + 1454, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 12, objArr942);
                            java.lang.String intern202 = ((java.lang.String) objArr942[0]).intern();
                            java.lang.Object[] objArr952 = new java.lang.Object[1];
                            a(1465 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (22672 - (android.os.Process.myTid() >> 22)), 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr952);
                            java.lang.String intern212 = ((java.lang.String) objArr952[0]).intern();
                            java.lang.Object[] objArr962 = new java.lang.Object[1];
                            a(android.graphics.Color.red(0) + 1479, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr962);
                            java.lang.String intern222 = ((java.lang.String) objArr962[0]).intern();
                            java.lang.Object[] objArr972 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 1501, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 31, objArr972);
                            java.lang.String intern232 = ((java.lang.String) objArr972[0]).intern();
                            java.lang.Object[] objArr982 = new java.lang.Object[1];
                            a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1532, (char) (29837 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, objArr982);
                            java.lang.String intern242 = ((java.lang.String) objArr982[0]).intern();
                            java.lang.Object[] objArr992 = new java.lang.Object[1];
                            a(android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1545, (char) android.graphics.Color.green(0), 13 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr992);
                            java.lang.String intern252 = ((java.lang.String) objArr992[0]).intern();
                            java.lang.Object[] objArr1002 = new java.lang.Object[1];
                            a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1555, (char) (android.text.TextUtils.indexOf(str5, str5) + 22835), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr1002);
                            java.lang.String intern262 = ((java.lang.String) objArr1002[0]).intern();
                            java.lang.Object[] objArr1012 = new java.lang.Object[1];
                            a(1568 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (16054 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr1012);
                            java.lang.String intern272 = ((java.lang.String) objArr1012[0]).intern();
                            java.lang.Object[] objArr1022 = new java.lang.Object[1];
                            a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1579, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 12, objArr1022);
                            java.lang.String intern282 = ((java.lang.String) objArr1022[0]).intern();
                            java.lang.Object[] objArr1032 = new java.lang.Object[1];
                            a(1592 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (58909 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - android.view.KeyEvent.getDeadChar(0, 0), objArr1032);
                            java.lang.String intern292 = ((java.lang.String) objArr1032[0]).intern();
                            java.lang.Object[] objArr1042 = new java.lang.Object[1];
                            a(1606 - android.text.TextUtils.getOffsetAfter(str5, 0), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, objArr1042);
                            java.lang.String intern302 = ((java.lang.String) objArr1042[0]).intern();
                            java.lang.Object[] objArr1052 = new java.lang.Object[1];
                            a((android.os.Process.myPid() >> 22) + 1618, (char) android.text.TextUtils.indexOf(str5, str5), android.graphics.Color.argb(0, 0, 0, 0) + 24, objArr1052);
                            java.lang.String intern312 = ((java.lang.String) objArr1052[0]).intern();
                            java.lang.Object[] objArr1062 = new java.lang.Object[1];
                            a(1641 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (38849 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 28 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1062);
                            java.lang.String[] strArr102 = {intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, ((java.lang.String) objArr1062[0]).intern()};
                            i16 = 0;
                            while (i16 < 19) {
                            }
                            i17 = -1;
                            if (i17 >= 0) {
                                java.lang.Object[] objArr1122 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                int i482 = ~(i | (-1638465602));
                                java.lang.Object[] objArr1132 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((68177192 | i482) * (-476)) + 1917872917 + (i482 * 952) + ((~(i6 | (-1638465602))) * 476))};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj2 == null) {
                                }
                                ((int[]) objArr1122[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr1132)).intValue();
                                return objArr1122;
                            }
                        }
                        java.lang.Object[] objArr1152 = new java.lang.Object[1];
                        a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1671, (char) android.text.TextUtils.getOffsetBefore(str5, 0), 12 - android.os.Process.getGidForName(str5), objArr1152);
                        java.lang.String intern322 = ((java.lang.String) objArr1152[0]).intern();
                        java.lang.Object[] objArr1162 = new java.lang.Object[1];
                        a(1683 - android.view.View.MeasureSpec.getMode(0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 50996), 4 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr1162);
                        java.lang.String[] strArr112 = {intern322, ((java.lang.String) objArr1162[0]).intern()};
                        java.lang.Object[] objArr1172 = new java.lang.Object[1];
                        a(1688 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.MeasureSpec.getMode(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 15, objArr1172);
                        java.lang.String intern332 = ((java.lang.String) objArr1172[0]).intern();
                        java.lang.Object[] objArr1182 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1703, (char) (android.view.KeyEvent.keyCodeFromString(str5) + 56448), 18 - android.view.MotionEvent.axisFromString(str5), objArr1182);
                        java.lang.String intern342 = ((java.lang.String) objArr1182[0]).intern();
                        java.lang.Object[] objArr1192 = new java.lang.Object[1];
                        a(android.view.View.resolveSizeAndState(0, 0, 0) + 1722, (char) android.view.View.getDefaultSize(0, 0), 13 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr1192);
                        java.lang.String[] strArr122 = {intern332, intern342, ((java.lang.String) objArr1192[0]).intern()};
                        java.lang.Object[] objArr1202 = new java.lang.Object[1];
                        a((android.os.Process.myPid() >> 22) + 1736, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 21 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr1202);
                        java.lang.String intern352 = ((java.lang.String) objArr1202[0]).intern();
                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                        a(1757 - android.view.View.getDefaultSize(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 9 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr1212);
                        java.lang.String[] strArr132 = {intern352, ((java.lang.String) objArr1212[0]).intern()};
                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                        a(1767 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr1222);
                        java.lang.String intern362 = ((java.lang.String) objArr1222[0]).intern();
                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                        a(503 - android.text.TextUtils.indexOf(str5, str5, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr1232);
                        java.lang.String[] strArr142 = {intern362, ((java.lang.String) objArr1232[0]).intern()};
                        java.lang.Object[] objArr1242 = new java.lang.Object[1];
                        a(1778 - android.text.TextUtils.getOffsetAfter(str5, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 28, objArr1242);
                        c = 0;
                        java.lang.String intern372 = ((java.lang.String) objArr1242[0]).intern();
                        java.lang.Object[] objArr1252 = new java.lang.Object[1];
                        a(1757 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString(str5) + 10, objArr1252);
                        java.lang.String[][] strArr152 = {strArr112, strArr122, strArr132, strArr142, new java.lang.String[]{intern372, ((java.lang.String) objArr1252[0]).intern()}};
                        i13 = 0;
                        int i492 = -1;
                        loop4: while (true) {
                            if (i13 < 5) {
                            }
                            i13++;
                            c = 0;
                        }
                        if (i14 == i) {
                        }
                    }
                }
                java.lang.Object[] objArr213 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 511, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 13, objArr213);
                java.lang.String intern70 = ((java.lang.String) objArr213[0]).intern();
                java.lang.Object[] objArr214 = new java.lang.Object[1];
                a(524 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.graphics.Color.alpha(0) + 6361), 9 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr214);
                java.lang.Object[] objArr215 = {intern70, ((java.lang.String) objArr214[0]).intern()};
                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                if (obj41 == null) {
                    java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 39, android.text.TextUtils.getTrimmedLength(str11) + 2213, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    byte[] bArr22 = $$a;
                    byte b81 = (byte) (-bArr22[16]);
                    byte b82 = bArr22[14];
                    java.lang.Object[] objArr216 = new java.lang.Object[1];
                    b(b81, b82, (short) (b82 | 652), objArr216);
                    obj41 = cls41.getMethod((java.lang.String) objArr216[0], java.lang.String.class, java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj41);
                }
                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr215)).longValue();
                long j46 = ((((((-301) * longValue14) + 180761030574L) + (((~(((-596571059) | j11) | longValue14)) | (~((596571058 | longValue14) | j9))) * (-302))) + ((~(((-596571059) | longValue14) | j9)) * (-604))) + (((~((~longValue14) | 596571058)) | (~(longValue14 | j9))) * 302)) - 1331945660;
                int i61 = ~(i6 | (-1371772560));
                int i62 = ~(i6 | (-1238746343));
                i9 = ((((int) (j46 >> 32)) & (((((35924240 | i61) | (~(1371772559 | i))) * (-338)) + 694717642) + ((i61 | (~(1407696799 | i))) * 338))) | (((((((-198480068) | i62) * 764) + (-316794159)) + (((~(i6 | (-198480068))) | 33558529) * (-1528))) + ((i62 | 1107383333) * 764)) & ((int) j46))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                if (i9 == i) {
                }
            }
        }
        i8 = i;
        if (i8 == i) {
        }
    }

    static void init$0() {
        $$a = new byte[]{94, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.CAN, 122, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
    }
}
