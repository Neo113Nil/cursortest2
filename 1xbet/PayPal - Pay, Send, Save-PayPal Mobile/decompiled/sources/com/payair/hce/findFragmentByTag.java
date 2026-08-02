package com.payair.hce;

/* loaded from: classes4.dex */
public class findFragmentByTag {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static int getProfileVersion;
    public com.payair.hce.getMDatabaseannotations AlternateContactlessPaymentDataJson;
    public boolean DigitizedCardProfile;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl;
    public int valueOf;
    public byte[] values;
    private boolean writeReplace;

    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = b * 2;
        int i3 = s + 4;
        int i4 = (i * 2) + 115;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = i3 + i4;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i5 = i6;
                i4 = bArr[i7] + i4;
                i3 = i7;
            }
        }
    }

    public findFragmentByTag() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        if (r3.startsWith(((java.lang.String) r14[0]).intern(), r4) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public findFragmentByTag(com.payair.hce.getMDatabaseannotations getmdatabaseannotations) {
        boolean z;
        this.AlternateContactlessPaymentDataJson = getmdatabaseannotations;
        this.values = new byte[getmdatabaseannotations.AlternateContactlessPaymentDataJson()];
        boolean z2 = false;
        this.valueOf = 0;
        java.lang.String writeReplace = getmdatabaseannotations.writeReplace();
        int indexOf = writeReplace.indexOf(47) + 1;
        if (indexOf > 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "\u0003\ufffa\u0003", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 4, 4 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            if (writeReplace.startsWith(((java.lang.String) objArr[0]).intern(), indexOf)) {
                z = true;
                this.SdkCoreAlternateContactlessPaymentDataImpl = z;
                if (!z && !(getmdatabaseannotations instanceof com.payair.hce.init)) {
                    if (indexOf > 0) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(true, "\ufff6￭\ufff6\u0014\u000b\u0016\ufff5", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 251, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, 7 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                    }
                    this.writeReplace = z2;
                }
                z2 = true;
                this.writeReplace = z2;
            }
        }
        z = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = z;
        if (!z) {
            if (indexOf > 0) {
            }
            this.writeReplace = z2;
        }
        z2 = true;
        this.writeReplace = z2;
    }

    public void DigitizedCardProfile(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) throws java.lang.IllegalArgumentException {
        int i = getAid + 61;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile = z;
            DigitizedCardProfile();
            this.AlternateContactlessPaymentDataJson.writeReplace(z, getmcallbacksannotations);
            int i2 = getAid + 9;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.DigitizedCardProfile = z;
        DigitizedCardProfile();
        this.AlternateContactlessPaymentDataJson.writeReplace(z, getmcallbacksannotations);
        throw null;
    }

    public final int AlternateContactlessPaymentDataJson() {
        int i = IccPrivateKeyCrtComponentsJson + 53;
        getAid = i % 128;
        if (i % 2 == 0) {
            this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
            throw null;
        }
        int AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
        int i2 = IccPrivateKeyCrtComponentsJson + 95;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $10 + 17;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 43, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2073, (char) (60037 - android.view.View.getDefaultSize(0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) -1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myTid() >> 22), android.view.Gravity.getAbsoluteGravity(0, 0) + 3543, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i8 = $10 + 125;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) << 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.getDefaultSize(0, 0), 3542 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.KeyEvent.keyCodeFromString(""), 3543 - android.view.KeyEvent.normalizeMetaState(0), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public int values(int i) {
        int length;
        int i2 = (getAid + 59) % 128;
        IccPrivateKeyCrtComponentsJson = i2;
        int i3 = i + this.valueOf;
        if (this.SdkCoreAlternateContactlessPaymentDataImpl) {
            getAid = (i2 + 49) % 128;
            if (this.DigitizedCardProfile) {
                int i4 = i2 + 67;
                getAid = i4 % 128;
                length = i4 % 2 == 0 ? (this.values.length + i3) / (this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson() / 2) : (i3 % this.values.length) - (this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson() + 2);
            } else {
                int length2 = i3 % this.values.length;
                getAid = (i2 + 87) % 128;
                length = length2;
            }
        } else {
            length = i3 % this.values.length;
        }
        return i3 - length;
    }

    public int valueOf(int i) {
        int i2 = IccPrivateKeyCrtComponentsJson + 53;
        getAid = i2 % 128;
        int i3 = this.valueOf;
        return i2 % 2 == 0 ? i << i3 : i + i3;
    }

    public int valueOf(byte[] bArr, int i, int i2, byte[] bArr2) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        int i3;
        int i4;
        if (i2 < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "ￅ\u0006ￅ\n\u001b\u0006\rￅ\u0019ￌ\u0013\u0006￨ￆ\r\u0019\f\u0013\n\u0011ￅ\u0019\u001a\u0015\u0013\u000eￅ\n\u001b\u000e\u0019\u0006\f\n\u0013", 252 - android.text.TextUtils.indexOf("", ""), 12 - android.widget.ExpandableListView.getPackedPositionChild(0L), 36 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson();
        int values = values(i2);
        if (values > 0) {
            IccPrivateKeyCrtComponentsJson = (getAid + 107) % 128;
            if (values > bArr2.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(true, "\ufffeﾼ\u0010\u0011\f\u0010\u0011\u000b\u0010\u000e\u000b\u0004\u000fﾼ\u000b\u000b\u0010ﾼ\u000e\u0001\u0002\u0002\u0011", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 8, android.text.TextUtils.indexOf("", "", 0) + 23, objArr2);
                throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr2[0]).intern());
            }
        }
        byte[] bArr3 = this.values;
        int length = bArr3.length;
        int i5 = this.valueOf;
        int i6 = length - i5;
        if (i2 > i6) {
            java.lang.System.arraycopy(bArr, 0, bArr3, i5, i6);
            int AlternateContactlessPaymentDataJson2 = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(this.values, 0, bArr2, 0);
            this.valueOf = 0;
            int i7 = i2 - i6;
            getAid = (IccPrivateKeyCrtComponentsJson + 13) % 128;
            while (i7 > this.values.length) {
                AlternateContactlessPaymentDataJson2 += this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr, i6, bArr2, AlternateContactlessPaymentDataJson2);
                i7 -= AlternateContactlessPaymentDataJson;
                i6 += AlternateContactlessPaymentDataJson;
                IccPrivateKeyCrtComponentsJson = (getAid + 111) % 128;
            }
            i3 = i7;
            i4 = AlternateContactlessPaymentDataJson2;
            i = i6;
        } else {
            i3 = i2;
            i4 = 0;
        }
        java.lang.System.arraycopy(bArr, i, this.values, this.valueOf, i3);
        int i8 = this.valueOf + i3;
        this.valueOf = i8;
        byte[] bArr4 = this.values;
        if (i8 != bArr4.length) {
            return i4;
        }
        int i9 = getAid + 113;
        IccPrivateKeyCrtComponentsJson = i9 % 128;
        if (i9 % 2 != 0) {
            int AlternateContactlessPaymentDataJson3 = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr4, 0, bArr2, i4);
            this.valueOf = 1;
            return i4 << AlternateContactlessPaymentDataJson3;
        }
        int AlternateContactlessPaymentDataJson4 = i4 + this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr4, 0, bArr2, i4);
        this.valueOf = 0;
        return AlternateContactlessPaymentDataJson4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
    
        if ((r10.valueOf + r12) <= r11.length) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int values(byte[] bArr, int i) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException, com.payair.hce.getSuspendingTransactionId {
        int i2 = getAid + 49;
        int i3 = i2 % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        int i4 = 0;
        try {
            if (i2 % 2 != 0) {
                if (this.valueOf + i <= bArr.length) {
                    if (this.valueOf != 0) {
                        int i5 = i3 + 7;
                        getAid = i5 % 128;
                        if (i5 % 2 != 0) {
                            if (!this.writeReplace) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                a(true, "\b\n\r\u0002\uffc1\u0006\u001b\n\u0014\uffc1\f\u0004\u0010\r\u0003\uffc1\u0015\u0010\u000f\uffc1\u0002\u0015\u0002\u0005\u0005\u0006\u000f", 255 - android.os.Process.getGidForName(""), android.view.View.MeasureSpec.getSize(0) + 24, 27 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
                                throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr[0]).intern());
                            }
                            com.payair.hce.getMDatabaseannotations getmdatabaseannotations = this.AlternateContactlessPaymentDataJson;
                            byte[] bArr2 = this.values;
                            getmdatabaseannotations.AlternateContactlessPaymentDataJson(bArr2, 0, bArr2, 0);
                            int i6 = this.valueOf;
                            this.valueOf = 0;
                            java.lang.System.arraycopy(this.values, 0, bArr, i, i6);
                            getAid = (IccPrivateKeyCrtComponentsJson + 53) % 128;
                            i4 = i6;
                        } else {
                            throw new java.lang.NullPointerException();
                        }
                    }
                    return i4;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(true, "ￂ\u0014\u0011\bￂ\u0016\u0014\u0011\n\u0015ￂ\u0011\u0011\u0016ￂ\u0014\u0007\b\b\u0017\u0004ￂ\u0016\u0017\u0012\u0016\u0017\u0011ￋￊ\u000e\u0003\u0010\u000b￨\u0011\u0006", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 28 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
                throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr2[0]).intern());
            }
        } finally {
            DigitizedCardProfile();
        }
    }

    public final void DigitizedCardProfile() {
        IccPrivateKeyCrtComponentsJson = (getAid + 101) % 128;
        int i = 0;
        while (true) {
            byte[] bArr = this.values;
            if (i >= bArr.length) {
                this.valueOf = 0;
                this.AlternateContactlessPaymentDataJson.DigitizedCardProfile();
                return;
            }
            int i2 = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                bArr[i] = 0;
                i += 106;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        getProfileVersion = 1889207232;
    }

    static void init$0() {
        $$d = new byte[]{107, 115, 84, 3};
        $$e = 42;
    }
}
