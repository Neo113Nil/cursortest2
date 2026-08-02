package com.payair.hce;

/* loaded from: classes4.dex */
public final class getErrorPendingIntent implements com.payair.hce.getErrorString {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final byte[] DigitizedCardProfile;
    private static long SdkCoreBusinessLogicModuleImpl;
    private static int getApplicationLifeCycleData;
    private static int getCiacDecline;
    private static int getCvrMaskAnd;
    private static short[] getGpoResponse;
    private static byte[] getPaymentFci;
    private static int getProfileVersion;
    private static int getSecurityWord;
    private static final java.util.Hashtable values;
    private byte[] AlternateContactlessPaymentDataJson;
    private int IccPrivateKeyCrtComponentsJson;
    private long RecordsJson;
    private int SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getRemoteResource getAid;
    private byte[] valueOf;
    private com.payair.hce.getTransactionExecutor writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 + 104;
        int i3 = s3 + 4;
        int i4 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i2;
            i = 0;
            i2 = i5;
            i2 += i6;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i++;
            i2 += i6;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getErrorPendingIntent geterrorpendingintent = (com.payair.hce.getErrorPendingIntent) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        getSecurityWord = (getApplicationLifeCycleData + 65) % 128;
        byte[] bArr2 = new byte[geterrorpendingintent.writeReplace.AlternateContactlessPaymentDataJson()];
        geterrorpendingintent.writeReplace(bArr, bArr2);
        getSecurityWord = (getApplicationLifeCycleData + 83) % 128;
        return bArr2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getApplicationLifeCycleData = 0;
        getSecurityWord = 1;
        valueOf();
        DigitizedCardProfile = new byte[]{1};
        java.util.Hashtable hashtable = new java.util.Hashtable();
        values = hashtable;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("ᠨ뭜\u187b坧ᣅﷃ쁢㢷꧕", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        hashtable.put(((java.lang.String) objArr[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(440));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 145398733, android.text.TextUtils.indexOf("", "", 0) - 836257587, (-92) - android.graphics.Color.blue(0), (byte) android.text.TextUtils.getTrimmedLength(""), (short) android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
        hashtable.put(((java.lang.String) objArr2[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(440));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("\uda6f쏾\uda3c⿅ᶯ᳢씈\ud996殑巴霫", (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr3);
        hashtable.put(((java.lang.String) objArr3[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(440));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("뎯菦돼濝쀴饼ᢓ專ɖᷨ䪴\uee76퀅폘ﱼ", android.text.TextUtils.indexOf("", "", 0) + 1, objArr4);
        hashtable.put(((java.lang.String) objArr4[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(440));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.view.View.resolveSizeAndState(0, 0, 0) - 145398732, (-836257580) - android.graphics.Color.green(0), (-92) - android.text.TextUtils.getOffsetAfter("", 0), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (short) android.text.TextUtils.getTrimmedLength(""), objArr5);
        hashtable.put(((java.lang.String) objArr5[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(440));
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 145398732, (-836257569) - android.view.View.resolveSizeAndState(0, 0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 91, (byte) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (short) android.graphics.Color.argb(0, 0, 0, 0), objArr6);
        hashtable.put(((java.lang.String) objArr6[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(888));
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b("镍ো锞\ue5f0尭絕蒊렡⒴韅횭", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
        hashtable.put(((java.lang.String) objArr7[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(888));
        getSecurityWord = (getApplicationLifeCycleData + 125) % 128;
    }

    public getErrorPendingIntent(com.payair.hce.getTransactionExecutor gettransactionexecutor, int i, com.payair.hce.getRemoteResource getremoteresource, byte[] bArr) {
        if (i > com.payair.hce.getGooglePlayServicesAvailabilityRecoveryIntent.DigitizedCardProfile(gettransactionexecutor)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 145398733, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 836257749, android.view.View.MeasureSpec.getMode(0) - 92, (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) android.text.TextUtils.getOffsetBefore("", 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (getremoteresource.values() < i) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("汍䷖氃ꇊ棍\uf0e7끟㖞\udde4펇\ue210螷ྲᶵ咓\ud873祇䱵蛵⨵ꬍ︌죻簈ᓞ⣋㤏컁䛠媎欖´낰蒥\uddce優\ue25e㝱\u0ff9ꌻⰏ愮熫\uf50a鶕鏏ꉶ䟇쿼\udd88ᐕ馟㦹", android.text.TextUtils.indexOf("", "", 0, 0) + 1, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        this.writeReplace = gettransactionexecutor;
        this.getAid = getremoteresource;
        this.IccPrivateKeyCrtComponentsJson = i;
        this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.Integer) values.get(gettransactionexecutor.values())).intValue();
        byte[] writeReplace = com.payair.hce.getGooglePlayServicesAvailabilityRecoveryIntent.writeReplace(this.writeReplace, com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(DigitizedCardProfile(), bArr, null), this.SdkCoreAlternateContactlessPaymentDataImpl);
        this.AlternateContactlessPaymentDataJson = writeReplace;
        byte[] bArr2 = new byte[writeReplace.length + 1];
        java.lang.System.arraycopy(writeReplace, 0, bArr2, 1, writeReplace.length);
        this.valueOf = com.payair.hce.getGooglePlayServicesAvailabilityRecoveryIntent.writeReplace(this.writeReplace, bArr2, this.SdkCoreAlternateContactlessPaymentDataImpl);
        this.RecordsJson = 1L;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 41;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(SdkCoreBusinessLogicModuleImpl ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + 105) % 128;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(SdkCoreBusinessLogicModuleImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1873, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (short) 13, (short) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, 429 - android.text.TextUtils.getOffsetAfter("", 0), (char) (31611 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) 0, (short) 15, (short) -1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    @Override // com.payair.hce.getErrorString
    public final int AlternateContactlessPaymentDataJson(byte[] bArr) {
        int length = bArr.length << 3;
        if (length > 262144) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((-145398737) - android.view.View.combineMeasuredStates(0, 0), (-836257678) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 92, (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (this.RecordsJson <= 140737488355328L) {
            values(null);
            byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson, length);
            byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
            byte[] bArr3 = new byte[bArr2.length + 1];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
            bArr3[0] = 3;
            DigitizedCardProfile(this.AlternateContactlessPaymentDataJson, (byte[]) writeReplace(new java.lang.Object[]{this, bArr3}, 290986228, -290986228, java.lang.System.identityHashCode(this)));
            DigitizedCardProfile(this.AlternateContactlessPaymentDataJson, this.valueOf);
            DigitizedCardProfile(this.AlternateContactlessPaymentDataJson, new byte[]{(byte) (r9 >> 24), (byte) (r9 >> 16), (byte) (r9 >> 8), (byte) this.RecordsJson});
            this.RecordsJson++;
            java.lang.System.arraycopy(AlternateContactlessPaymentDataJson, 0, bArr, 0, bArr.length);
            getSecurityWord = (getApplicationLifeCycleData + 29) % 128;
            return length;
        }
        getApplicationLifeCycleData = (getSecurityWord + 67) % 128;
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = 2;
        try {
            int i7 = 1;
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getCvrMaskAnd)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            long j2 = 0;
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 29, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 5) % 128;
                z = true;
            } else {
                $10 = ($11 + 9) % 128;
                z = false;
            }
            if (z) {
                byte[] bArr = getPaymentFci;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 119;
                        $10 = i9 % 128;
                        if (i9 % i6 != 0) {
                            java.lang.Object[] objArr3 = new java.lang.Object[i7];
                            objArr3[0] = java.lang.Integer.valueOf(bArr[i8]);
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 30, android.view.View.getDefaultSize(0, 0) + 5088, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                            }
                            bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        } else {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i8])};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5089, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                            }
                            bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i6 = 2;
                        i7 = 1;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getGpoResponse[i2 + ((int) (getProfileVersion ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getCvrMaskAnd ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i10 = (int) (getProfileVersion ^ j);
                        if (z) {
                            $10 = ($11 + 57) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i10 + i4;
                        java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getCiacDecline), sb};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj4 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, 2412 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            c((short) 0, (short) 0, (short) -1, objArr6);
                            obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = getPaymentFci;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i11 = 0; i11 < length2; i11++) {
                                bArr4[i11] = (byte) (bArr3[i11] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            i5 = 1;
                            z2 = true;
                        } else {
                            z2 = false;
                            i5 = 1;
                        }
                        while (true) {
                            gettrack2constructiondata.DigitizedCardProfile = i5;
                            if (gettrack2constructiondata.DigitizedCardProfile >= intValue) {
                                break;
                            }
                            if (z2) {
                                byte[] bArr5 = getPaymentFci;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getGpoResponse;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            i5 = gettrack2constructiondata.DigitizedCardProfile + 1;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = getPaymentFci;
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getProfileVersion)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, 'M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).intValue()] ^ (-4897270311952305750L))) + ((int) (getCvrMaskAnd ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v11 byte[], still in use, count: 2, list:
          (r0v11 byte[]) from 0x0012: ARRAY_LENGTH (r0v11 byte[]) A[WRAPPED] (LINE:186)
          (r0v11 byte[]) from 0x002b: PHI (r0v5 byte[]) = (r0v4 byte[]), (r0v11 byte[]) binds: [B:14:0x0029, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private byte[] DigitizedCardProfile() {
        /*
            r11 = this;
            int r0 = com.payair.hce.getErrorPendingIntent.getApplicationLifeCycleData
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.payair.hce.getErrorPendingIntent.getSecurityWord = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1c
            com.payair.hce.getRemoteResource r0 = r11.getAid
            byte[] r0 = r0.DigitizedCardProfile()
            int r1 = r0.length
            int r2 = r11.IccPrivateKeyCrtComponentsJson
            int r2 = r2 >> 81
            int r2 = r2 / 69
            if (r1 < r2) goto L3a
            goto L2b
        L1c:
            com.payair.hce.getRemoteResource r0 = r11.getAid
            byte[] r0 = r0.DigitizedCardProfile()
            int r1 = r0.length
            int r2 = r11.IccPrivateKeyCrtComponentsJson
            int r2 = r2 + 7
            int r2 = r2 / 8
            if (r1 < r2) goto L3a
        L2b:
            int r1 = com.payair.hce.getErrorPendingIntent.getSecurityWord
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.payair.hce.getErrorPendingIntent.getApplicationLifeCycleData = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L38
            return r0
        L38:
            r0 = 0
            throw r0
        L3a:
            java.lang.String r0 = ""
            r1 = 48
            int r2 = android.text.TextUtils.indexOf(r0, r1)
            r3 = 0
            int r4 = android.view.Gravity.getAbsoluteGravity(r3, r3)
            int r0 = android.text.TextUtils.indexOf(r0, r1)
            int r1 = android.graphics.drawable.Drawable.resolveOpacity(r3, r3)
            byte r8 = (byte) r1
            int r1 = android.view.View.combineMeasuredStates(r3, r3)
            short r9 = (short) r1
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = -145398743(0xfffffffff7556429, float:-4.3280888E33)
            int r5 = r5 - r2
            r2 = 836257634(0x31d84762, float:6.2945427E-9)
            int r6 = r4 - r2
            int r7 = r0 + (-91)
            r10 = r1
            a(r5, r6, r7, r8, r9, r10)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r1[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.getErrorPendingIntent.DigitizedCardProfile():byte[]");
    }

    private static void DigitizedCardProfile(byte[] bArr, byte[] bArr2) {
        int i;
        getSecurityWord = (getApplicationLifeCycleData + 89) % 128;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= bArr2.length) {
            int i4 = getApplicationLifeCycleData + 61;
            int i5 = i4 % 128;
            getSecurityWord = i5;
            i2 = (i4 % 2 != 0 ? (i = ((bArr[bArr.length - i3] & 255) + (bArr2[bArr2.length - i3] & 255)) + i2) <= 255 : (i = ((bArr[bArr.length >>> i3] & 32636) - (bArr2[bArr2.length >> i3] & 19339)) + i2) <= 13698) ? 0 : 1;
            bArr[bArr.length - i3] = (byte) i;
            i3++;
            getApplicationLifeCycleData = (i5 + 43) % 128;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i6 = (bArr[bArr.length - length] & 255) + i2;
            i2 = i6 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i6;
        }
    }

    @Override // com.payair.hce.getErrorString
    public final void values(byte[] bArr) {
        getApplicationLifeCycleData = (getSecurityWord + 87) % 128;
        byte[] writeReplace = com.payair.hce.getGooglePlayServicesAvailabilityRecoveryIntent.writeReplace(this.writeReplace, com.payair.hce.getClientVersion.DigitizedCardProfile(DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, DigitizedCardProfile(), bArr), this.SdkCoreAlternateContactlessPaymentDataImpl);
        this.AlternateContactlessPaymentDataJson = writeReplace;
        byte[] bArr2 = new byte[writeReplace.length + 1];
        bArr2[0] = 0;
        java.lang.System.arraycopy(writeReplace, 0, bArr2, 1, writeReplace.length);
        this.valueOf = com.payair.hce.getGooglePlayServicesAvailabilityRecoveryIntent.writeReplace(this.writeReplace, bArr2, this.SdkCoreAlternateContactlessPaymentDataImpl);
        this.RecordsJson = 1L;
        int i = getApplicationLifeCycleData + 117;
        getSecurityWord = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void writeReplace(byte[] bArr, byte[] bArr2) {
        getApplicationLifeCycleData = (getSecurityWord + 43) % 128;
        this.writeReplace.DigitizedCardProfile(bArr, 0, bArr.length);
        this.writeReplace.valueOf(bArr2, 0);
        getApplicationLifeCycleData = (getSecurityWord + 125) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        com.payair.hce.getErrorPendingIntent.getApplicationLifeCycleData = (com.payair.hce.getErrorPendingIntent.getSecurityWord + 97) % 128;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if ((r10 - (r5 * r2)) > r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if ((r10 << (r5 + r2)) > r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r6 = r10 - (r5 * r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] AlternateContactlessPaymentDataJson(byte[] bArr, int i) {
        int i2;
        int i3 = i / 8;
        int AlternateContactlessPaymentDataJson = i3 / this.writeReplace.AlternateContactlessPaymentDataJson();
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i3];
        int AlternateContactlessPaymentDataJson2 = this.writeReplace.AlternateContactlessPaymentDataJson();
        byte[] bArr4 = new byte[AlternateContactlessPaymentDataJson2];
        int i4 = 0;
        while (i4 <= AlternateContactlessPaymentDataJson) {
            int i5 = getApplicationLifeCycleData + 121;
            getSecurityWord = i5 % 128;
            if (i5 % 2 == 0) {
                writeReplace(bArr2, bArr4);
            } else {
                writeReplace(bArr2, bArr4);
            }
            java.lang.System.arraycopy(bArr4, 0, bArr3, i4 * AlternateContactlessPaymentDataJson2, i2);
            DigitizedCardProfile(bArr2, DigitizedCardProfile);
            i4++;
        }
        return bArr3;
    }

    static void valueOf() {
        getProfileVersion = 786200191;
        getCvrMaskAnd = 520368625;
        getCiacDecline = 397323701;
        getPaymentFci = new byte[]{70, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -69, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 83, -91, -20, com.google.common.base.Ascii.CAN, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, 65, -89, 93, -89, -85, -18, 17, 87, 94, -2, 13, -67, -24, com.google.common.base.Ascii.SYN, 85, 91, -88, -87, 85, -86, 81, -88, -7, 6, -81, -85, -28, 7, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -29, 18, 94, -89, 83, -93, 89, 84, -85, -7, 13, -81, -95, 93, 87, -72, 84, 88, -7, com.google.common.base.Ascii.SYN, 85, 91, -85, -92, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -82, -90, -71, 123, -86, -87, 85, 86, -82, -72, com.google.common.base.Ascii.ESC, 81, -2, com.google.common.base.Ascii.SYN, 85, 91, -95, 86, -82, 87, -26, 6, -85, -92, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -82, -90, 89, -8, 4, -89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -6, 7, 85, -95, -83, -24, 16, 93, -27, 4, -89, -87, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 82, -115, 126, -88, 91, 87, -84, 86, -7, 13, -93, -85, 87, 84, -84, -93, -17, 13, -67, -24, com.google.common.base.Ascii.SYN, 85, -85, 81, 89, -83, 87, -88, -6, 13, -93, -85, 87, 84, -84, -93, -17, 6, -84, -93, 86, -84, 80, -87, -86, 91, -88, -81, -113, 6, -88, -86, -81, 70, 83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.google.common.base.Ascii.SUB, -88, -86, -87, 87, -85, 86, -94, 70, 83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 6, 86, -81, -84, 70, 83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
        SdkCoreBusinessLogicModuleImpl = 3508327849107560624L;
    }

    static void init$0() {
        $$a = new byte[]{106, 94, -55, -52};
        $$b = 154;
    }

    private byte[] writeReplace(byte[] bArr) {
        return (byte[]) writeReplace(new java.lang.Object[]{this, bArr}, 290986228, -290986228, java.lang.System.identityHashCode(this));
    }
}
