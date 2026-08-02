package com.payair.hce;

/* loaded from: classes4.dex */
public final class getAutoMigrations extends com.payair.hce.getRequiredTypeConverters<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getProfileVersion;
    private static long valueOf;
    private static int writeReplace;
    private final int values = 6;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) + (i2 * (-282)) + (((~(i2 | i4)) | (~(i4 | i3))) * (-283)) + ((~(i | i5)) * 283) + ((~(i4 | i5 | i3)) * 283);
        if (i6 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 == 2) {
            return valueOf(objArr);
        }
        com.payair.hce.getAutoMigrations getautomigrations = (com.payair.hce.getAutoMigrations) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i7 = getProfileVersion;
        IccPrivateKeyCrtComponentsJson = (i7 + 25) % 128;
        if (booleanValue) {
            IccPrivateKeyCrtComponentsJson = (i7 + 109) % 128;
            ((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) | 2));
        } else {
            ((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) | 4));
        }
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = getautomigrations.AlternateContactlessPaymentDataJson;
        android.view.KeyEvent.keyCodeFromString("");
        android.os.Process.getElapsedCpuTime();
        android.view.View.MeasureSpec.getSize(0);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile)};
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 3) + 4;
        int i5 = i * 2;
        byte[] bArr = $$a;
        ?? r8 = 119 - (b * 2);
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            byte b2 = r8;
            i2 = 0;
            int i6 = i4;
            i4++;
            i3 = i6 + (-b2);
            int i7 = i3;
            int i8 = i4;
            bArr2[i2] = (byte) i7;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            b2 = bArr[i8];
            i6 = i7;
            i4 = i8;
            i4++;
            i3 = i6 + (-b2);
            int i72 = i3;
            int i82 = i4;
            bArr2[i2] = (byte) i72;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            int i722 = i3;
            int i822 = i4;
            bArr2[i2] = (byte) i722;
            if (i2 == 0 - i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.payair.hce.transactionCanBeResumed] */
    public getAutoMigrations(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        this.DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.writeReplace(6);
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(1, transactioncanberesumed.AlternateContactlessPaymentDataJson(3));
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(1, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(1) & 3));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.widget.ExpandableListView.getPackedPositionType(0L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ude54溽\ue7e3\u09d1\ude0f♁盼펞ﳌՐ叼\uf49a鯅\ue06cー⦇뛁\udf7a᷸䪏嗊멀\ufae8澏烍饺ꟽ肋\u0ff1瑵蓡ꖑ⫝̸匣", 1 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(this.DigitizedCardProfile);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("첾\uea67犈랴첞ꊺ\ue39f淽\uee31臡", '1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("酌⯛셩皖鄑", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        new java.lang.Object[]{sb.toString()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.payair.hce.transactionCanBeResumed values() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 71) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile;
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 53) % 128;
        return transactioncanberesumed;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 113;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        $10 = ($11 + 83) % 128;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 77) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\b', (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1921, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 0, (byte) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.getTrimmedLength("") + 429, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 31611));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (short) 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 21) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str2 = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
        int i4 = $11 + 109;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IccPrivateKeyCrtComponentsJson() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 35) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) | 32));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        int i = IccPrivateKeyCrtComponentsJson + 67;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getAid() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 35) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 4));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 1));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getEdgeSlop();
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.text.TextUtils.getCapsMode("", 0, 0);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        int i = getProfileVersion + 9;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void writeReplace() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 13) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) | 1));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 113) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getAutoMigrations getautomigrations = (com.payair.hce.getAutoMigrations) objArr[0];
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 21) % 128;
        ((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 128));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = getautomigrations.AlternateContactlessPaymentDataJson;
        android.os.Process.myPid();
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile)};
        int i = getProfileVersion + 3;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void DigitizedCardProfile() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 103) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(1, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(1) | 64));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.media.AudioTrack.getMaxVolume();
        android.text.TextUtils.getOffsetAfter("", 0);
        android.view.ViewConfiguration.getScrollDefaultDelay();
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        int i = IccPrivateKeyCrtComponentsJson + 87;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getAutoMigrations getautomigrations = (com.payair.hce.getAutoMigrations) objArr[0];
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 79) % 128;
        ((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 4));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = getautomigrations.AlternateContactlessPaymentDataJson;
        android.media.AudioTrack.getMinVolume();
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.util.TypedValue.complexToFloat(0);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) getautomigrations.DigitizedCardProfile)};
        int i = getProfileVersion + 99;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getCvrMaskAnd() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 65) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 4));
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) | 16));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getTapTimeout();
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 17) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 83) % 128;
        for (int i = 0; i < ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(); i++) {
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 61) % 128;
            ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(i, (byte) (transactioncanberesumed.AlternateContactlessPaymentDataJson(i) & ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(i)));
        }
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getKeyRepeatTimeout();
        android.os.Process.getElapsedCpuTime();
        android.view.View.MeasureSpec.getMode(0);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 41) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 91) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 128));
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(0, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(0) | 32));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        int i = IccPrivateKeyCrtComponentsJson + 69;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getProfileVersion() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 109) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) & (-2)));
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(5, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(5) & (-9)));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getPressedStateDuration();
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        int i = getProfileVersion + 25;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void SdkCoreAlternateContactlessPaymentDataImpl() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 23) % 128;
        ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(5, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(5) | 8));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getLongPressTimeout();
        new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean RecordsJson() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 53) % 128;
        if ((((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(1) & 64) == 0) {
            return false;
        }
        int i = getProfileVersion;
        IccPrivateKeyCrtComponentsJson = (i + 65) % 128;
        IccPrivateKeyCrtComponentsJson = (i + 33) % 128;
        return true;
    }

    /* renamed from: com.payair.hce.getAutoMigrations$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        private static int DigitizedCardProfile = 1;
        private static int values;
        static final /* synthetic */ int[] writeReplace;

        static {
            int[] iArr = new int[((int[]) com.payair.hce.setApplicationExpiryDate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1972704579, -1972704579, (int) java.lang.System.currentTimeMillis())).length];
            writeReplace = iArr;
            try {
                int i = com.payair.hce.setApplicationExpiryDate.writeReplace;
                iArr[4] = 1;
                int i2 = values;
                int i3 = i2 & 119;
                int i4 = ((i2 | 119) & (~i3)) + (i3 << 1);
                DigitizedCardProfile = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = writeReplace;
                int i6 = com.payair.hce.setApplicationExpiryDate.AlternateContactlessPaymentDataJson;
                iArr2[3] = 2;
                int i7 = DigitizedCardProfile;
                int i8 = i7 & 17;
                values = (((((i7 ^ 17) | i8) << 1) - (~(-((i7 | 17) & (~i8))))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = writeReplace;
                int i9 = com.payair.hce.setApplicationExpiryDate.getProfileVersion;
                iArr3[5] = 3;
                int i10 = values;
                int i11 = ((i10 ^ 61) | (i10 & 61)) << 1;
                int i12 = -((i10 & (-62)) | ((~i10) & 61));
                int i13 = (i11 & i12) + (i12 | i11);
                DigitizedCardProfile = i13 % 128;
                int i14 = i13 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = writeReplace;
                int i15 = com.payair.hce.setApplicationExpiryDate.DigitizedCardProfile;
                iArr4[1] = 4;
                int i16 = values;
                int i17 = ((i16 & 72) + (i16 | 72)) - 1;
                DigitizedCardProfile = i17 % 128;
                int i18 = i17 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = writeReplace;
                int i19 = com.payair.hce.setApplicationExpiryDate.valueOf;
                iArr5[0] = 5;
                int i20 = values;
                int i21 = i20 & 25;
                int i22 = (((i20 ^ 25) | i21) << 1) - ((i20 | 25) & (~i21));
                DigitizedCardProfile = i22 % 128;
                int i23 = i22 % 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = writeReplace;
                int i24 = com.payair.hce.setApplicationExpiryDate.values;
                iArr6[2] = 6;
                int i25 = DigitizedCardProfile;
                values = (((i25 & 82) + (i25 | 82)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void AlternateContactlessPaymentDataJson(int i) {
        int i2 = IccPrivateKeyCrtComponentsJson + 71;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0 ? com.payair.hce.getAutoMigrations.AnonymousClass4.writeReplace[i - 1] == 1 : com.payair.hce.getAutoMigrations.AnonymousClass4.writeReplace[i << 1] == 1) {
            ((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).DigitizedCardProfile(3, (byte) (((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).AlternateContactlessPaymentDataJson(3) | 8));
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
            android.view.ViewConfiguration.getKeyRepeatTimeout();
            new java.lang.Object[]{com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile)};
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 7) % 128;
        }
        writeReplace(i);
    }

    private void writeReplace(int i) {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 65) % 128;
        int i2 = com.payair.hce.getAutoMigrations.AnonymousClass4.writeReplace[i - 1];
        if (i2 == 2) {
            getCvrMaskAnd();
            return;
        }
        if (i2 == 3) {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1964771760, -1964771759, java.lang.System.identityHashCode(this));
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 27) % 128;
        } else if (i2 == 4 || i2 == 5) {
            IccPrivateKeyCrtComponentsJson();
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 23) % 128;
        } else {
            if (i2 != 6) {
                return;
            }
            getAid();
        }
    }

    public final java.lang.String toString() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 33) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("瞟櫢䛉鹨矜∼ퟅ䐱唵ļ\uf2c1挸㈁\ue43c釜븼\u1f1f\udb38볔\udd37ﰽ븨寔\uf830\ud91f鴽ېᜌꘘ瀡◊㈡", android.view.KeyEvent.normalizeMetaState(0) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = IccPrivateKeyCrtComponentsJson + 69;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        valueOf = -4061220419090629508L;
        writeReplace = 1889207142;
    }

    private void getPaymentFci() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1964771760, -1964771759, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1755701004, 1755701006, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10};
        $$b = 32;
    }

    public final void AlternateContactlessPaymentDataJson(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1654643959, 1654643959, java.lang.System.identityHashCode(this));
    }
}
