package com.payair.hce;

/* loaded from: classes4.dex */
final class setNextFocusForwardId implements com.payair.hce.getDrawable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 115 - (s * 3);
        int i5 = (s2 * 4) + 1;
        int i6 = (i * 2) + 4;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6++;
            i4 = (-i4) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i6];
            i6++;
            i4 = (-i4) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s * 14;
        int i3 = (b2 * 50) + 68;
        int i4 = 23 - (b * 19);
        byte[] bArr2 = new byte[20 - i2];
        int i5 = 19 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4++;
            i3 = i3 + (-i6) + 2;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 = i3 + (-i6) + 2;
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

    private static void d(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3 = s + 4;
        int i4 = 119 - (i2 * 20);
        byte[] bArr = $$d;
        int i5 = i * 20;
        byte[] bArr2 = new byte[i5 + 12];
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (i4 + i3) - 6;
            i3 = i3;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i3 + 1;
            if (i7 == i5 + 11) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i7;
            i4 = (i4 + bArr[i8]) - 6;
            i3 = i8;
        }
    }

    setNextFocusForwardId() {
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.setNextFocusForwardId setnextfocusforwardid = (com.payair.hce.setNextFocusForwardId) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777253, 5050 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            com.payair.hce.gotPostData writeReplace2 = ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace();
            try {
                com.payair.hce.sendRequest writeReplace3 = writeReplace2.writeReplace(str);
                writeReplace2.values(writeReplace3);
                final com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects = new com.payair.hce.setPreferKeepClearRects(((java.lang.Integer) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1587924411, -1587924388, (int) java.lang.System.currentTimeMillis())).intValue(), (java.lang.String) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -299088477, 299088496, (int) java.lang.System.currentTimeMillis()));
                writeReplace3.valueOf(new com.payair.hce.getNetworkTokenReference() { // from class: com.payair.hce.setNextFocusForwardId.1
                    private static int valueOf = 1;
                    private static int values;

                    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i, int i2, int i3) {
                        int i4 = ~i2;
                        return ((((i * (-167)) + (i2 * (-167))) + (((~((~i) | i4)) | (~(i4 | i3))) * 336)) + (((~(i2 | i)) | (~(i | i3))) * (-168))) + (((~(i | (~i3))) | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) != 1 ? DigitizedCardProfile(objArr2) : valueOf(objArr2);
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                        int i = valueOf;
                        int i2 = ((((i ^ 61) | (i & 61)) << 1) - (~(-((i & (-62)) | ((~i) & 61))))) - 1;
                        values = i2 % 128;
                        if (i2 % 2 == 0) {
                            return com.caverock.androidsvg.BuildConfig.VERSION_NAME;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.setNextFocusForwardId.AnonymousClass1 anonymousClass1 = (com.payair.hce.setNextFocusForwardId.AnonymousClass1) objArr2[0];
                        int i = valueOf;
                        values = (((i & (-50)) | ((~i) & 49)) + ((i & 49) << 1)) % 128;
                        com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects2 = setpreferkeepclearrects;
                        byte[] bytes = ((java.lang.String) com.payair.hce.setPreferKeepClearRects.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclearrects2}, 408851357, -408851356, java.lang.System.identityHashCode(setpreferkeepclearrects2))).getBytes();
                        int i2 = valueOf;
                        int i3 = i2 & 67;
                        int i4 = ((i2 ^ 67) | i3) << 1;
                        int i5 = -((i2 | 67) & (~i3));
                        int i6 = (i4 & i5) + (i5 | i4);
                        values = i6 % 128;
                        if (i6 % 2 == 0) {
                            return bytes;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.getNetworkTokenReference
                    public final byte[] AlternateContactlessPaymentDataJson() {
                        return (byte[]) valueOf(new java.lang.Object[]{this}, -132014370, 132014371, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.getNetworkTokenReference
                    public final java.lang.String DigitizedCardProfile() {
                        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1777281023, 1777281023, java.lang.System.identityHashCode(this));
                    }
                });
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace3.AlternateContactlessPaymentDataJson()}, 1437210083, -1437210055, (int) java.lang.System.currentTimeMillis());
                if (((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())) != null) {
                    int i = DigitizedCardProfile;
                    int i2 = (((i & (-118)) | ((~i) & 117)) - (~(-(-((i & 117) << 1))))) - 1;
                    AlternateContactlessPaymentDataJson = i2 % 128;
                    if (i2 % 2 != 0) {
                        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onCardProvisionCompleted(str.getBytes());
                        throw new java.lang.ArithmeticException();
                    }
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onCardProvisionCompleted(str.getBytes());
                    int i3 = AlternateContactlessPaymentDataJson;
                    int i4 = i3 & 115;
                    int i5 = (i3 | 115) & (~i4);
                    int i6 = i4 << 1;
                    DigitizedCardProfile = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
                }
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str.getBytes()}, 593682826, -593682746, (int) java.lang.System.currentTimeMillis());
                int i7 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = (((i7 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i7 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
            } catch (com.payair.hce.setSuccessful unused) {
            }
            int i8 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((i8 ^ 59) + ((i8 & 59) << 1)) % 128;
            return java.lang.Boolean.FALSE;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int i = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (((i ^ 97) - (~(-(-((i & 97) << 1))))) - 1) % 128;
        if (((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())) != null) {
            int i2 = DigitizedCardProfile;
            int i3 = (i2 ^ 60) + ((i2 & 60) << 1);
            int i4 = (~i3) + (i3 << 1);
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 != 0) {
                ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onReplenishCompleted(str.getBytes(), intValue);
                throw null;
            }
            ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onReplenishCompleted(str.getBytes(), intValue);
        }
        int i5 = AlternateContactlessPaymentDataJson;
        int i6 = (i5 ^ 109) + ((i5 & 109) << 1);
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void c(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 67) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            $11 = ($10 + 103) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.getOffsetAfter("", 0) + 2073, (char) (60038 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                    byte b = $$g[2];
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 52, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3543, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr4 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 53, 3543 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        java.lang.String str3 = (java.lang.String) objArr[3];
        java.lang.Exception exc = (java.lang.Exception) objArr[4];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 125) | (i & 125)) << 1;
        int i3 = -((i & (-126)) | ((~i) & 125));
        int i4 = (i2 & i3) + (i2 | i3);
        DigitizedCardProfile = i4 % 128;
        int i5 = i4 % 2;
        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onReplenishFailed(str.getBytes(), str2.getBytes(), str3.getBytes(), exc);
        int i6 = AlternateContactlessPaymentDataJson + 9;
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String str = (java.lang.String) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2) << 1;
        int i4 = -((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i2));
        AlternateContactlessPaymentDataJson = ((i3 & i4) + (i4 | i3)) % 128;
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1657390037, 1657390053, (int) java.lang.System.currentTimeMillis());
        if (setpreferkeepclear == null) {
            int i5 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = (i5 + 33) % 128;
            int i6 = (i5 ^ 115) + ((i5 & 115) << 1);
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        if (android.text.TextUtils.equals((java.lang.String) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear)), str)) {
            int i7 = DigitizedCardProfile;
            int i8 = i7 & 113;
            int i9 = (i7 | 113) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            AlternateContactlessPaymentDataJson = i11 % 128;
            if (i11 % 2 != 0) {
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -159678133, 159678137, java.lang.System.identityHashCode(setpreferkeepclear));
                throw null;
            }
            com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -159678133, 159678137, java.lang.System.identityHashCode(setpreferkeepclear));
        }
        if (android.text.TextUtils.equals((java.lang.String) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, 1230236237, -1230236234, java.lang.System.identityHashCode(setpreferkeepclear)), str)) {
            int i12 = AlternateContactlessPaymentDataJson;
            int i13 = i12 & 119;
            DigitizedCardProfile = (((((i12 ^ 119) | i13) << 1) - (~(-((i12 | 119) & (~i13))))) - 1) % 128;
            com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, 1935693604, -1935693597, java.lang.System.identityHashCode(setpreferkeepclear));
            int i14 = DigitizedCardProfile;
            int i15 = ((i14 & 90) + (i14 | 90)) - 1;
            AlternateContactlessPaymentDataJson = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 3 / 4;
            }
        }
        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onDeleteCardCompleted(str.getBytes());
        int i17 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (((i17 & 116) + (i17 | 116)) - 1) % 128;
        return bool;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[1];
        int i = (-2) - (~(DigitizedCardProfile + 62));
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.sendRequest writeReplace2 = ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().writeReplace(str);
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace2.AlternateContactlessPaymentDataJson()}, 1035570229, -1035570220, (int) java.lang.System.currentTimeMillis());
            writeReplace2.valueOf();
            com.payair.hce.component1 component1Var = com.payair.hce.component1.AlternateContactlessPaymentDataJson;
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.sendRequest writeReplace3 = ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().writeReplace(str);
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace3.AlternateContactlessPaymentDataJson()}, 1035570229, -1035570220, (int) java.lang.System.currentTimeMillis());
        if (writeReplace3.valueOf() == com.payair.hce.component1.AlternateContactlessPaymentDataJson) {
            writeReplace3.IccPrivateKeyCrtComponentsJson();
            int i2 = DigitizedCardProfile;
            int i3 = i2 & 39;
            int i4 = (i2 | 39) & (~i3);
            int i5 = i3 << 1;
            AlternateContactlessPaymentDataJson = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        }
        int i6 = DigitizedCardProfile;
        int i7 = i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i8 = i7 + ((i6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i7);
        AlternateContactlessPaymentDataJson = i8 % 128;
        int i9 = i8 % 2;
        int i10 = AlternateContactlessPaymentDataJson;
        int i11 = ((i10 ^ 111) | (i10 & 111)) << 1;
        int i12 = -((i10 & (-112)) | ((~i10) & 111));
        int i13 = (i11 & i12) + (i12 | i11);
        DigitizedCardProfile = i13 % 128;
        if (i13 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = (((i | 33) << 1) - (i ^ 33)) % 128;
        AlternateContactlessPaymentDataJson = i2;
        int i3 = i2 | 31;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 31)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        try {
            com.payair.hce.sendRequest writeReplace2 = ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().writeReplace((java.lang.String) objArr[1]);
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace2.AlternateContactlessPaymentDataJson()}, 1035570229, -1035570220, (int) java.lang.System.currentTimeMillis());
            if (writeReplace2.valueOf() == com.payair.hce.component1.AlternateContactlessPaymentDataJson) {
                int i = DigitizedCardProfile;
                int i2 = i & 37;
                int i3 = (i | 37) & (~i2);
                int i4 = -(-(i2 << 1));
                AlternateContactlessPaymentDataJson = ((i3 & i4) + (i3 | i4)) % 128;
                writeReplace2.IccPrivateKeyCrtComponentsJson();
                int i5 = DigitizedCardProfile;
                int i6 = (i5 ^ 67) + ((i5 & 67) << 1);
                AlternateContactlessPaymentDataJson = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = AlternateContactlessPaymentDataJson;
            int i9 = i8 & 57;
            int i10 = (i8 | 57) & (~i9);
            int i11 = i9 << 1;
            DigitizedCardProfile = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
        } catch (com.payair.hce.setSuccessful unused) {
        }
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x05ce, code lost:
    
        r3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 49, 873 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (15956 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))))).getDeclaredConstructor(java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x060c, code lost:
    
        r1 = com.payair.hce.setWallpaper.AnonymousClass1.DigitizedCardProfile$4956fc2a(r1, ((java.lang.reflect.Constructor) r3).newInstance(r4));
        r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.Process.myPid() >> 22), android.view.KeyEvent.normalizeMetaState(0) + 922, (char) android.text.TextUtils.getCapsMode(r0, 0, 0));
        r4 = com.payair.hce.setNextFocusForwardId.$$a;
        r5 = r4[6];
        r7 = (byte) (-r4[20]);
        r9 = new java.lang.Object[1];
        b(r5, r7, r7, r9);
        r3.getField((java.lang.String) r9[0]).set(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x064b, code lost:
    
        r7 = android.text.TextUtils.indexOf(r0, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        r3 = java.lang.System.identityHashCode(r23);
        r5 = -(~(r7 * 306));
        r8 = r7 & com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE;
        r9 = (~r8) & (r7 | com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE);
        r8 = ~((r8 ^ r9) | (r8 & r9));
        r9 = r7 ^ r3;
        r10 = r7 & r3;
        r9 = ~((r9 ^ r10) | (r9 & r10));
        r10 = r8 & r9;
        r11 = ((90574 - (~((r5 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (r5 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS)))) - (~(-(-((((r8 | r9) & (~r10)) | r10) * 305))))) - 1;
        r5 = ~r3;
        r3 = (r3 | r5) & r5;
        r3 = (r3 ^ r7) | (r3 & r7);
        r5 = ~r3;
        r3 = (r3 | r5) & r5;
        r3 = ((r3 ^ (-297)) | (r3 & (-297))) * 305;
        r5 = r11 & r3;
        r7 = -(-android.graphics.Color.red(0));
        r8 = ((r7 ^ 22) | (r7 & 22)) << 1;
        r7 = -(((~r7) & 22) | (r7 & (-23)));
        r9 = -android.text.TextUtils.indexOf(r0, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        r10 = ((r9 ^ 13) | (r9 & 13)) << 1;
        r9 = -(((~r9) & 13) | (r9 & (-14)));
        r13 = new java.lang.Object[1];
        c((((r11 ^ r3) | r5) << 1) - ((r3 | r11) & (~r5)), (r8 & r7) + (r7 | r8), "\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ", false, ((r10 | r9) << 1) - (r9 ^ r10), r13);
        r3 = java.lang.Class.forName((java.lang.String) r13[0]);
        r5 = (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
        r7 = java.lang.System.identityHashCode(r23);
        r8 = r5 * (-1335);
        r9 = (-198766) & r8;
        r10 = r5 ^ r7;
        r11 = r5 & r7;
        r10 = ~((r10 & r11) | (r10 ^ r11));
        r12 = (r10 & com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE) | ((~r10) & (-299));
        r10 = r10 & (-299);
        r13 = r7 & (-299);
        r14 = (r7 | (-299)) & (~r13);
        r13 = ~((r13 ^ r14) | (r14 & r13));
        r14 = r5 & r13;
        r13 = (r13 | r5) & (~r14);
        r8 = (-2) - (~(((((r9 - (~((r8 ^ (-198766)) | r9))) - 1) + (((r12 & r10) | (r10 ^ r12)) * (-668))) - (~(-(~(-(-(((r13 & r14) | (r13 ^ r14)) * 1336))))))) - 1));
        r5 = ((r5 & (~r7)) | ((~r5) & r7)) | r11;
        r5 = -(~(-(-(((r5 ^ (-299)) | (r5 & (-299))) * 668))));
        r12 = 15 - (~(-android.text.TextUtils.getTrimmedLength(r0)));
        r7 = -android.text.TextUtils.getOffsetAfter(r0, 0);
        r9 = java.lang.System.identityHashCode(r23);
        r10 = ~r9;
        r11 = ~r7;
        r13 = (r11 | r7) & r11;
        r14 = r13 ^ 13;
        r13 = r13 & 13;
        r13 = (r13 & r14) | (r14 ^ r13);
        r14 = ~r13;
        r13 = (r13 | r14) & r14;
        r14 = ((r7 * 193) + 2509) + (((r13 ^ r10) | (r13 & r10)) * (-192));
        r13 = (r11 & 13) | ((~r11) & (-14));
        r15 = r11 & (-14);
        r13 = ~((r13 & r15) | (r13 ^ r15));
        r6 = r10 & (r10 | r9);
        r1 = r6 & (-14);
        r29 = r0;
        r0 = (~r1) & (r6 | (-14));
        r0 = ~((r1 & r0) | (r0 ^ r1));
        r19 = r13 ^ r0;
        r0 = r0 & r13;
        r0 = ((r19 ^ r0) | (r0 & r19)) * (-384);
        r13 = r14 & r0;
        r0 = ((r0 | r14) & (~r13)) + (r13 << 1);
        r11 = (r11 ^ (-14)) | r15;
        r13 = r11 & r9;
        r11 = ~(((r11 | r9) & (~r13)) | r13);
        r1 = r1 | ((r6 & 13) | ((~r6) & (-14)));
        r6 = r1 & r7;
        r1 = (r1 | r7) & (~r6);
        r1 = ~((r1 ^ r6) | (r1 & r6));
        r6 = r11 ^ r1;
        r1 = r1 & r11;
        r1 = (r1 ^ r6) | (r1 & r6);
        r6 = r7 ^ 13;
        r7 = r7 & 13;
        r6 = (r6 ^ r7) | (r7 & r6);
        r7 = (r6 & r10) | ((~r6) & r9);
        r6 = r6 & r9;
        r6 = ~((r6 ^ r7) | (r6 & r7));
        r7 = r1 ^ r6;
        r1 = r1 & r6;
        r1 = ((r1 ^ r7) | (r1 & r7)) * 192;
        r7 = new java.lang.Object[1];
        c((((r8 | r5) << 1) - (r5 ^ r8)) - 1, (~r12) + (r12 << 1), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, (r0 & r1) + (r0 | r1), r7);
        r5 = ((java.lang.Long) r3.getDeclaredMethod((java.lang.String) r7[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0829, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 44, 921 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.graphics.Color.green(0));
        r3 = (byte) (-r4[20]);
        r4 = r4[6];
        r8 = new java.lang.Object[1];
        b(r3, r4, r4, r8);
        r1.getField((java.lang.String) r8[0]).set(null, java.lang.Long.valueOf(r5));
        r0 = com.payair.hce.setNextFocusForwardId.DigitizedCardProfile;
        r1 = r0 & 53;
        r0 = -(-((r0 ^ 53) | r1));
        r4 = 1;
        com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson = (((r1 | r0) << 1) - (r0 ^ r1)) % 128;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0875, code lost:
    
        r0 = ((int[]) r1[r4])[0];
        r5 = ((int[]) r1[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0882, code lost:
    
        if (r5 != r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0884, code lost:
    
        r0 = com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson + 92;
        com.payair.hce.setNextFocusForwardId.DigitizedCardProfile = ((~r0) + (r0 << r4)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0897, code lost:
    
        r5 = new java.lang.Object[]{r1, java.lang.Integer.valueOf(((int[]) r1[3])[0]), r28};
        r0 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x08ab, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x08ad, code lost:
    
        r0 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4860, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x08ea, code lost:
    
        ((java.lang.reflect.Method) r0).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x08f0, code lost:
    
        r0 = com.payair.hce.setNextFocusForwardId.DigitizedCardProfile;
        r1 = r0 & 97;
        r0 = r0 | 97;
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x09f7, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0904, code lost:
    
        new java.util.ArrayList().add((java.lang.String) r1[2]);
        r3 = (~(r0 & r5)) & (r0 | r5);
        r0 = com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson;
        com.payair.hce.setNextFocusForwardId.DigitizedCardProfile = ((r0 ^ 43) + ((r0 & 43) << 1)) % 128;
        com.payair.hce.setNextFocusForwardId.DigitizedCardProfile = ((r0 & 75) + (r0 | 75)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x092e, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Long.valueOf(r3 ^ 1736855993926549504L), 404393297L};
        r0 = com.payair.hce.setNextFocusForwardId.$$d;
        r4 = r0[15];
        r3 = (byte) (-r4);
        r4 = r4;
        r9 = new java.lang.Object[1];
        d(r3, r4, r4, r9);
        r3 = java.lang.Class.forName((java.lang.String) r9[0]);
        r4 = r0[9];
        r0 = (byte) (r0[15] - 1);
        r9 = new java.lang.Object[1];
        d(r4, r0, r0, r9);
        r3.getMethod((java.lang.String) r9[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0993, code lost:
    
        r5 = new java.lang.Object[]{r1, java.lang.Integer.valueOf(((int[]) r1[3])[0]), r28};
        r0 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x09a7, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x09a9, code lost:
    
        r0 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44, android.view.KeyEvent.keyCodeFromString(r29) + 4860, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x09e7, code lost:
    
        ((java.lang.reflect.Method) r0).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x09ed, code lost:
    
        com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson = (com.payair.hce.setNextFocusForwardId.DigitizedCardProfile + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x09f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x09f9, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x09fd, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x09ff, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0a00, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0a0e, code lost:
    
        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0a0f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0a10, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0a14, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0a16, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0a17, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r8 = r5;
        r5 = -android.graphics.Color.argb(0, 0, 0, 0);
        r6 = java.lang.System.identityHashCode(r2);
        r11 = r5 * 784;
        r11 = ((r11 ^ (-230690)) - (~((r11 & (-230690)) << 1))) + 231768;
        r10 = (~r11) + (r11 << 1);
        r5 = ~r5;
        r6 = ~r6;
        r11 = r5 & r6;
        r11 = r11 | ((r5 | r6) & (~r11));
        r11 = (~((r11 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE) | (r11 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE))) * (-783);
        r14 = (r10 ^ r11) + ((r10 & r11) << 1);
        r10 = (r6 & (-296)) | ((~r6) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
        r6 = r6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE;
        r6 = ~((r6 ^ r10) | (r6 & r10));
        r10 = r5 & r6;
        r5 = (r5 | r6) & (~r10);
        r5 = ((r5 ^ r10) | (r5 & r10)) * 783;
        r10 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        r11 = java.lang.System.identityHashCode(r2);
        r15 = r10 * 714;
        r6 = r15 ^ (-15664);
        r15 = -(-((r15 & (-15664)) << 1));
        r19 = ((r6 | r15) << 1) - (r6 ^ r15);
        r6 = ~r10;
        r15 = ~r11;
        r20 = r6 ^ r15;
        r21 = r15 & r6;
        r4 = (r21 & r20) | (r20 ^ r21);
        r0 = ~r4;
        r0 = r0 & (r4 | r0);
        r4 = (r6 | r10) & r6;
        r6 = r4 ^ 22;
        r4 = r4 & 22;
        r4 = ~((r4 & r6) | (r4 ^ r6));
        r0 = (r0 ^ r4) | (r4 & r0);
        r4 = (r10 ^ (-23)) | (r10 & (-23));
        r6 = r4 ^ r11;
        r4 = r4 & r11;
        r4 = ~((r6 ^ r4) | (r4 & r6));
        r6 = ((~r0) & r4) | ((~r4) & r0);
        r0 = r0 & r4;
        r0 = -(~(-(-(((r0 ^ r6) | (r6 & r0)) * (-713)))));
        r4 = r10 | (-23);
        r6 = r4 ^ r11;
        r4 = r4 & r11;
        r10 = (r15 | r11) & r15;
        r11 = ((~r10) & (-23)) | (r10 & 22);
        r10 = r10 & (-23);
        r12 = android.os.Process.getGidForName("");
        r15 = java.lang.System.identityHashCode(r2);
        r7 = r12 * (-495);
        r23 = r2;
        r2 = (((r7 & 7424) | ((~r7) & (-7425))) - (~((r7 & (-7425)) << 1))) - 1;
        r3 = ~r12;
        r7 = r3 ^ (-16);
        r25 = r3 & (-16);
        r28 = 0;
        r1 = ~((r7 & r25) | (r7 ^ r25));
        r26 = r3 & (r3 | r12);
        r13 = (r26 & r15) | (r26 ^ r15);
        r8 = ~r13;
        r8 = r8 & (r13 | r8);
        r9 = r1 & r8;
        r1 = (r1 | r8) & (~r9);
        r1 = -(~(-(-(((r1 ^ r9) | (r1 & r9)) * 992))));
        r7 = r7 | r25;
        r8 = ~r7;
        r7 = (r7 | r8) & r8;
        r3 = ~((r3 ^ r15) | (r3 & r15));
        r8 = ~r15;
        r9 = r8 & r12;
        r8 = (r8 | r12) & (~r9);
        r8 = (r8 ^ r9) | (r8 & r9);
        r9 = r8 & 15;
        r8 = (r8 | 15) & (~r9);
        r8 = (r8 ^ r9) | (r8 & r9);
        r9 = ((r2 ^ r1) + ((r1 & r2) << 1)) - 1;
        r1 = ~r8;
        r9 = (r9 - (~(((r1 & (r8 | r1)) | ((r3 & r7) | (r3 ^ r7))) * (-496)))) - 1;
        r1 = ((r15 ^ 15) | (r15 & 15)) * 496;
        r2 = r9 & r1;
        r1 = -(-((r1 ^ r9) | r2));
        r7 = new java.lang.Object[1];
        c((r14 ^ r5) + ((r5 & r14) << 1), (((((r19 & r0) + (r0 | r19)) - 1) - (~((~((r4 & r6) | (r4 ^ r6))) * 1426))) - 1) + ((~((r10 & r11) | (r11 ^ r10))) * 713), "\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ", false, (r2 & r1) + (r1 | r2), r7);
        r0 = java.lang.Class.forName((java.lang.String) r7[0]);
        r1 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
        r2 = r1 ^ 299;
        r1 = ((r1 & 299) | r2) << 1;
        r2 = -r2;
        r4 = -(~(-android.view.KeyEvent.getDeadChar(0, 0)));
        r5 = (r4 ^ 15) + ((r4 & 15) << 1);
        r4 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        r6 = r4 & 61;
        r13 = new java.lang.Object[1];
        c((r1 ^ r2) + ((r1 & r2) << 1), (~r5) + (r5 << 1), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, ((r4 | 61) & (~r6)) + (r6 << 1), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02db, code lost:
    
        if ((r8 + 1946) < ((java.lang.Long) r0.getDeclaredMethod((java.lang.String) r13[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02dd, code lost:
    
        r0 = com.payair.hce.setNextFocusForwardId.DigitizedCardProfile;
        r1 = r0 & 91;
        r0 = -(-(r0 | 91));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02f1, code lost:
    
        if ((r2 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02f3, code lost:
    
        r0 = "";
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf(r0, r0, 0, 0), 922 - android.widget.ExpandableListView.getPackedPositionType(0), (char) (android.os.Process.myPid() >> 22));
        r2 = com.payair.hce.setNextFocusForwardId.$$a;
        r3 = r2[6];
        r2 = (byte) (-r2[20]);
        r5 = new java.lang.Object[1];
        b(r3, r2, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0332, code lost:
    
        r3 = new java.lang.Object[]{r1.getField((java.lang.String) r5[0]).get(null), 615890328, null};
        r2 = 1624038517;
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517(0x60ccdc75, float:1.1809442E20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x034c, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x034e, code lost:
    
        r1 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.view.KeyEvent.keyCodeFromString(r0), (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 4859, (char) android.text.TextUtils.getTrimmedLength(r0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517(0x60ccdc75, float:1.1809442E20), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0386, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0095, code lost:
    
        if (r5 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0430, code lost:
    
        r1 = (java.lang.Object[]) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0432, code lost:
    
        r3 = com.payair.hce.setNextFocusForwardId.DigitizedCardProfile;
        r4 = r3 & 77;
        r3 = (r3 | 77) & (~r4);
        r4 = r4 << 1;
        com.payair.hce.setNextFocusForwardId.AlternateContactlessPaymentDataJson = (((r3 | r4) << 1) - (r3 ^ r4)) % 128;
        r29 = r0;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x038f, code lost:
    
        r2 = 1624038517;
        r0 = "";
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 923 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0));
        r3 = com.payair.hce.setNextFocusForwardId.$$a;
        r4 = r3[6];
        r3 = (byte) (-r3[20]);
        r6 = new java.lang.Object[1];
        b(r4, r3, r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03d2, code lost:
    
        r4 = new java.lang.Object[]{r1.getField((java.lang.String) r6[0]).get(null), 615890328, null};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517(0x60ccdc75, float:1.1809442E20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03ea, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03ec, code lost:
    
        r1 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 46, 4861 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517(0x60ccdc75, float:1.1809442E20), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0429, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x044a, code lost:
    
        r2 = 1624038517;
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
    
        if (r5 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x044f, code lost:
    
        r28 = 0;
        r23 = r2;
        r2 = 1624038517;
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0455, code lost:
    
        r1 = -(~(-android.text.TextUtils.getTrimmedLength(r0)));
        r3 = -(~(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
        r4 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
        r5 = java.lang.System.identityHashCode(r23);
        r6 = r4 * 866;
        r7 = r6 & (-12096);
        r6 = -(-((r6 ^ (-12096)) | r7));
        r8 = (r7 & r6) + (r6 | r7);
        r6 = ~r4;
        r7 = ~r5;
        r6 = ~((r6 ^ r7) | (r6 & r7));
        r9 = r6 & (-15);
        r6 = (r6 | (-15)) & (~r9);
        r6 = ((r6 ^ r9) | (r6 & r9)) * (-865);
        r9 = ((r8 ^ r6) - (~(-(-((r6 & r8) << 1))))) - 1;
        r6 = r4 ^ r5;
        r8 = r4 & r5;
        r6 = -(-((~((r6 ^ r8) | (r6 & r8))) * 865));
        r8 = r9 ^ r6;
        r6 = (r6 & r9) << 1;
        r10 = (r8 ^ r6) + ((r6 & r8) << 1);
        r6 = r7 ^ (-15);
        r8 = r7 & (-15);
        r6 = ~((r6 ^ r8) | (r8 & r6));
        r5 = (r5 | r7) & r7;
        r4 = (r4 ^ r5) | (r4 & r5);
        r5 = ~r4;
        r4 = (r4 | r5) & r5;
        r5 = r6 & r4;
        r4 = (r4 | r6) & (~r5);
        r4 = ((r4 ^ r5) | (r4 & r5)) * 865;
        r6 = new java.lang.Object[1];
        c(((r1 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE) + ((r1 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE) << 1)) - 1, 14 - (~r3), "\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014", false, (r10 & r4) + (r4 | r10), r6);
        r1 = java.lang.Class.forName((java.lang.String) r6[0]);
        r3 = -(android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
        r4 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
        r5 = java.lang.System.identityHashCode(r23);
        r6 = r4 * 980;
        r7 = r6 & (-15648);
        r6 = (r6 ^ (-15648)) | r7;
        r8 = (r7 ^ r6) + ((r6 & r7) << 1);
        r6 = ~r5;
        r7 = r6 ^ (-17);
        r9 = r6 & (-17);
        r7 = (~((r7 ^ r9) | (r9 & r7))) * 979;
        r9 = r8 & r7;
        r9 = (r9 - (~(-(-((r7 ^ r8) | r9))))) - 1;
        r7 = (r4 & r6) | ((~r4) & r5);
        r8 = r4 & r5;
        r7 = -(-(((r7 ^ r8) | (r7 & r8)) * (-979)));
        r8 = r9 & r7;
        r7 = ((r7 | r9) & (~r8)) + (r8 << 1);
        r8 = (r5 & (-17)) | (r5 ^ (-17));
        r9 = ~r8;
        r8 = (r8 | r9) & r9;
        r5 = (r5 | r6) & r6;
        r6 = r5 & r4;
        r4 = (r4 | r5) & (~r6);
        r4 = (r4 ^ r6) | (r4 & r6);
        r5 = ~r4;
        r4 = (r4 | r5) & r5;
        r5 = ((~r4) & r8) | ((~r8) & r4);
        r4 = r4 & r8;
        r4 = -(-(((r4 ^ r5) | (r4 & r5)) * 979));
        r5 = ((r7 ^ r4) | (r7 & r4)) << 1;
        r4 = -(((~r4) & r7) | ((~r7) & r4));
        r7 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
        r14 = new java.lang.Object[1];
        c(((r3 | 299) << 1) - (r3 ^ 299), (r5 & r4) + (r4 | r5), "\u0003\u000e\u0013￢\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e", false, ((r7 | 11) << 1) - (r7 ^ 11), r14);
        r1 = ((java.lang.Integer) r1.getMethod((java.lang.String) r14[0], java.lang.Object.class).invoke(null, r23)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x05b3, code lost:
    
        r4 = new java.lang.Object[]{-1224973775};
        r3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x05cc, code lost:
    
        if (r3 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        long j;
        com.payair.hce.setNextFocusForwardId setnextfocusforwardid = (com.payair.hce.setNextFocusForwardId) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 71;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i3 = ((((i ^ 71) | i2) << 1) - (~(-((i | 71) & (~i2))))) - 1;
        DigitizedCardProfile = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{bool}, -1457317077, 1457317091, (int) java.lang.System.currentTimeMillis());
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 922, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte[] bArr = $$a;
                byte b = (byte) (-bArr[20]);
                byte b2 = bArr[6];
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(b, b2, b2, objArr2);
                j = cls.getField((java.lang.String) objArr2[0]).getLong(null);
            } else {
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{bool}, -1457317077, 1457317091, (int) java.lang.System.currentTimeMillis());
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 921 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.green(0));
                byte[] bArr2 = $$a;
                byte b3 = (byte) (-bArr2[20]);
                byte b4 = bArr2[6];
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b(b3, b4, b4, objArr3);
                j = cls2.getField((java.lang.String) objArr3[0]).getLong(null);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = (((i | 79) << 1) - ((i & (-80)) | ((~i) & 79))) % 128;
        AlternateContactlessPaymentDataJson = i2;
        int i3 = i2 + 68;
        int i4 = (~i3) + (i3 << 1);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        boolean z = false;
        int i = DigitizedCardProfile + 9;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onSystemHealthCompleted();
            z = true;
        } else {
            ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onSystemHealthCompleted();
        }
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = ((i2 | 103) << 1) - (i2 ^ 103);
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        boolean z = false;
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 13;
        int i3 = ((i ^ 13) | i2) << 1;
        int i4 = -((i | 13) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, 1437210083, -1437210055, (int) java.lang.System.currentTimeMillis());
            z = true;
        } else {
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, 1437210083, -1437210055, (int) java.lang.System.currentTimeMillis());
        }
        int i6 = AlternateContactlessPaymentDataJson;
        int i7 = i6 | 39;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 39)) & i7);
        int i10 = (i8 & i9) + (i9 | i8);
        DigitizedCardProfile = i10 % 128;
        if (i10 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~((~i2) | i3);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean z = false;
        switch ((i * (-574)) + (i2 * (-574)) + (((~(i4 | i5)) | i6) * 1150) + (((~(i2 | i5)) | i6) * (-575)) + (((~(i | i5)) | (~(i4 | i3))) * 575)) {
            case 1:
                java.lang.String str = (java.lang.String) objArr[1];
                java.lang.String str2 = (java.lang.String) objArr[2];
                java.lang.Exception exc = (java.lang.Exception) objArr[3];
                int i7 = DigitizedCardProfile;
                int i8 = i7 & 57;
                int i9 = (((i7 ^ 57) | i8) << 1) - ((i7 | 57) & (~i8));
                AlternateContactlessPaymentDataJson = i9 % 128;
                if (i9 % 2 != 0) {
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onSystemHealthFailure(str.getBytes(), str2.getBytes(), exc);
                    z = true;
                } else {
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onSystemHealthFailure(str.getBytes(), str2.getBytes(), exc);
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return values(objArr);
            case 4:
                java.lang.String str3 = (java.lang.String) objArr[1];
                int i10 = AlternateContactlessPaymentDataJson;
                int i11 = (i10 & 81) + (i10 | 81);
                DigitizedCardProfile = i11 % 128;
                if (i11 % 2 == 0) {
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{null, str3}, -1031339831, 1031339837, (int) java.lang.System.currentTimeMillis());
                    z = true;
                } else {
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{null, str3}, -1031339831, 1031339837, (int) java.lang.System.currentTimeMillis());
                }
                int i12 = AlternateContactlessPaymentDataJson;
                int i13 = i12 ^ 67;
                int i14 = (i12 & 67) << 1;
                DigitizedCardProfile = ((i13 & i14) + (i14 | i13)) % 128;
                return java.lang.Boolean.valueOf(z);
            case 5:
                return writeReplace(objArr);
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            case 7:
                java.lang.String str4 = (java.lang.String) objArr[1];
                java.lang.String str5 = (java.lang.String) objArr[2];
                java.lang.Exception exc2 = (java.lang.Exception) objArr[3];
                int i15 = AlternateContactlessPaymentDataJson;
                int i16 = i15 & 15;
                int i17 = -(-((i15 ^ 15) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                DigitizedCardProfile = i18 % 128;
                int i19 = i18 % 2;
                ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onTaskStatusFailed(str4.getBytes(), str5.getBytes(), exc2);
                return bool;
            case 8:
                int i20 = DigitizedCardProfile;
                int i21 = i20 & 103;
                int i22 = (~i21) & (i20 | 103);
                int i23 = -(-(i21 << 1));
                AlternateContactlessPaymentDataJson = ((i22 & i23) + (i23 | i22)) % 128;
                int i24 = i20 & 65;
                int i25 = ((i20 ^ 65) | i24) << 1;
                int i26 = -((i20 | 65) & (~i24));
                AlternateContactlessPaymentDataJson = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
                return bool;
            case 9:
                int i27 = DigitizedCardProfile;
                AlternateContactlessPaymentDataJson = (((i27 & 109) - (~(i27 | 109))) - 1) % 128;
                int i28 = i27 & 5;
                int i29 = (i27 | 5) & (~i28);
                int i30 = -(-(i28 << 1));
                AlternateContactlessPaymentDataJson = ((i29 ^ i30) + ((i29 & i30) << 1)) % 128;
                return bool;
            case 10:
                java.lang.String str6 = (java.lang.String) objArr[1];
                java.lang.String str7 = (java.lang.String) objArr[2];
                java.lang.String str8 = (java.lang.String) objArr[3];
                java.lang.Exception exc3 = (java.lang.Exception) objArr[4];
                int i31 = DigitizedCardProfile;
                int i32 = (i31 & (-72)) | ((~i31) & 71);
                int i33 = (i31 & 71) << 1;
                AlternateContactlessPaymentDataJson = ((i32 ^ i33) + ((i33 & i32) << 1)) % 128;
                ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onDeleteCardFailed(str6.getBytes(), str7.getBytes(), str8.getBytes(), exc3);
                int i34 = AlternateContactlessPaymentDataJson;
                int i35 = i34 | 75;
                DigitizedCardProfile = ((i35 << 1) - ((~(i34 & 75)) & i35)) % 128;
                return bool;
            case 11:
                int i36 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = (i36 + 47) % 128;
                int i37 = ((i36 ^ 73) | (i36 & 73)) << 1;
                int i38 = -((i36 & (-74)) | ((~i36) & 73));
                DigitizedCardProfile = (((i37 | i38) << 1) - (i38 ^ i37)) % 128;
                return bool;
            case 12:
                return valueOf(objArr);
            case 13:
                java.lang.String str9 = (java.lang.String) objArr[1];
                java.lang.String str10 = (java.lang.String) objArr[2];
                java.lang.Exception exc4 = (java.lang.Exception) objArr[3];
                int i39 = DigitizedCardProfile;
                AlternateContactlessPaymentDataJson = ((i39 & 7) + (i39 | 7)) % 128;
                ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onRequestSessionFailed(str9.getBytes(), str10.getBytes(), exc4);
                int i40 = DigitizedCardProfile;
                AlternateContactlessPaymentDataJson = ((i40 & 93) + (i40 | 93)) % 128;
                return bool;
            case 14:
                int i41 = DigitizedCardProfile;
                int i42 = i41 ^ 51;
                int i43 = ((i41 & 51) | i42) << 1;
                int i44 = -i42;
                AlternateContactlessPaymentDataJson = ((i43 & i44) + (i43 | i44)) % 128;
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{bool}, -1457317077, 1457317091, (int) java.lang.System.currentTimeMillis());
                int i45 = DigitizedCardProfile;
                AlternateContactlessPaymentDataJson = ((i45 ^ 107) + ((i45 & 107) << 1)) % 128;
                return bool;
            case 15:
                int i46 = DigitizedCardProfile;
                int i47 = i46 ^ 91;
                int i48 = -(-((i46 & 91) << 1));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                AlternateContactlessPaymentDataJson = i49 % 128;
                ((com.payair.hce.HCEEventListener) (i49 % 2 != 0 ? com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis()) : com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis()))).onRequestSessionCompleted();
                int i50 = DigitizedCardProfile;
                int i51 = i50 & 117;
                AlternateContactlessPaymentDataJson = ((((i50 | 117) & (~i51)) - (~(-(-(i51 << 1))))) - 1) % 128;
                return bool;
            case 16:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 17:
                return getProfileVersion(objArr);
            case 18:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 19:
                int i52 = AlternateContactlessPaymentDataJson;
                int i53 = (i52 & (-60)) | ((~i52) & 59);
                int i54 = (i52 & 59) << 1;
                DigitizedCardProfile = ((i53 & i54) + (i54 | i53)) % 128;
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Boolean.TRUE}, -1457317077, 1457317091, (int) java.lang.System.currentTimeMillis());
                int i55 = AlternateContactlessPaymentDataJson;
                int i56 = i55 | 111;
                DigitizedCardProfile = ((i56 << 1) - ((~(i55 & 111)) & i56)) % 128;
                return bool;
            case 20:
                java.lang.String str11 = (java.lang.String) objArr[1];
                java.lang.String str12 = (java.lang.String) objArr[2];
                int i57 = AlternateContactlessPaymentDataJson + 57;
                DigitizedCardProfile = i57 % 128;
                if (i57 % 2 == 0) {
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{str11, str12}, -1031339831, 1031339837, (int) java.lang.System.currentTimeMillis());
                    z = true;
                } else {
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{str11, str12}, -1031339831, 1031339837, (int) java.lang.System.currentTimeMillis());
                }
                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 107) % 128;
                return java.lang.Boolean.valueOf(z);
            case 21:
                return RecordsJson(objArr);
            case 22:
                java.lang.String str13 = (java.lang.String) objArr[1];
                int i58 = DigitizedCardProfile;
                int i59 = ((i58 | 48) << 1) - (i58 ^ 48);
                int i60 = (~i59) + (i59 << 1);
                AlternateContactlessPaymentDataJson = i60 % 128;
                int i61 = i60 % 2;
                ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onTaskStatusCompleted(str13.getBytes());
                int i62 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = ((i62 ^ 61) + ((i62 & 61) << 1)) % 128;
                return bool;
            case 23:
                int i63 = (AlternateContactlessPaymentDataJson + 3) % 128;
                DigitizedCardProfile = i63;
                AlternateContactlessPaymentDataJson = (i63 + 85) % 128;
                return bool;
            case 24:
                return getAid(objArr);
            case 25:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            default:
                java.lang.String str14 = (java.lang.String) objArr[1];
                java.lang.String str15 = (java.lang.String) objArr[2];
                java.lang.Exception exc5 = (java.lang.Exception) objArr[3];
                int i64 = DigitizedCardProfile;
                int i65 = i64 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i66 = (i64 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i65;
                AlternateContactlessPaymentDataJson = ((i65 ^ i66) + ((i66 & i65) << 1)) % 128;
                com.payair.hce.setAccessibilityLiveRegion.writeReplace(new java.lang.Object[0], 741099874, -741099873, (int) java.lang.System.currentTimeMillis());
                ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onCardProvisionFailure(str14.getBytes(), str15.getBytes(), exc5);
                int i67 = AlternateContactlessPaymentDataJson;
                int i68 = (i67 ^ 44) + ((i67 & 44) << 1);
                DigitizedCardProfile = ((~i68) + (i68 << 1)) % 128;
                return bool;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        DigitizedCardProfile = 1;
        writeReplace = 1889207205;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean getProfileVersion(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 373494774, -373494763, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2, exc}, 1019317123, -1019317110, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1787100846, 1787100861, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2, exc}, 324247275, -324247268, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean getAid(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 1745841892, -1745841870, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -2110751123, 2110751137, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 2007696711, -2007696709, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean RecordsJson(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, -910361151, 910361155, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2}, -1688476567, 1688476587, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2, exc}, -518341536, 518341537, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1415019963, 1415019981, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), str, str2, exc}, -1104031241, 1104031257, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1376459683, 1376459689, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), str, str2, exc}, -2043281977, 2043281985, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -537659439, 537659458, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), str2, str3, exc}, -1400470676, 1400470699, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, -581684142, 581684159, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), str2, str3, exc}, -1924378691, 1924378703, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 1859494708, -1859494705, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2, str3, exc}, -1407942943, 1407942953, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 1058909522, -1058909501, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2, str3, exc}, 590066204, -590066199, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, int i) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i)}, 1807189736, -1807189712, i)).booleanValue();
    }

    static void init$2() {
        $$g = new byte[]{117, 33, 0, 124};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 120621479, -120621470, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$1() {
        $$d = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63, 18, 4, -57, 72, -9, com.google.common.base.Ascii.RS, -18, 14, com.google.common.base.Ascii.SI, -62, 64, 1, 8, com.visa.cbp.getEncExpo.kernelVersion, 63, 4, com.google.common.base.Ascii.NAK, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -5, 7, -28, 36, 8, com.google.common.base.Ascii.VT, 3, -27, 43, com.google.common.base.Ascii.SI, -72, com.google.common.base.Ascii.SYN, 1, -3, 17, -9, -13, com.google.common.base.Ascii.EM, 17, 2, -5, 8, 8};
        $$e = 199;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str, str2, exc}, -1673775193, 1673775193, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{57, -61, -44, -120, -35, 4, 0, -9, 13, -15, com.google.common.base.Ascii.ETB, 3, 35, -28, -15, 16, com.google.common.base.Ascii.SYN, -32, 5, com.google.common.base.Ascii.VT, -1, -1, 9, com.google.common.base.Ascii.ETB, -9, -7, 18, -12};
        $$b = 187;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, str}, 1252969723, -1252969698, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
