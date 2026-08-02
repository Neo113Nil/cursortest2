package com.payair.hce;

/* loaded from: classes4.dex */
final class getGooglePlayServicesAvailabilityRecoveryIntent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static java.util.Hashtable DigitizedCardProfile;
    private static int valueOf;
    private static char[] values;
    private static int writeReplace;

    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i = 3 - (s * 3);
        int i2 = b * 4;
        int i3 = 99 - (b2 * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i;
            i = i;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i + 1;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i7];
                i = i7;
                i5 = i6;
            }
        }
    }

    getGooglePlayServicesAvailabilityRecoveryIntent() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson();
        java.util.Hashtable hashtable = new java.util.Hashtable();
        DigitizedCardProfile = hashtable;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 55951), 5 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
        hashtable.put(((java.lang.String) objArr[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(128));
        java.util.Hashtable hashtable2 = DigitizedCardProfile;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetBefore("", 0) + 5, (char) (7322 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.text.TextUtils.indexOf("", "", 0, 0) + 7, objArr2);
        hashtable2.put(((java.lang.String) objArr2[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(192));
        java.util.Hashtable hashtable3 = DigitizedCardProfile;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 7, objArr3);
        hashtable3.put(((java.lang.String) objArr3[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(256));
        java.util.Hashtable hashtable4 = DigitizedCardProfile;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 19, (char) android.graphics.Color.blue(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 7, objArr4);
        hashtable4.put(((java.lang.String) objArr4[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(256));
        java.util.Hashtable hashtable5 = DigitizedCardProfile;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(27 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 7 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
        hashtable5.put(((java.lang.String) objArr5[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(256));
        java.util.Hashtable hashtable6 = DigitizedCardProfile;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(33 - android.text.TextUtils.getTrimmedLength(""), (char) (android.graphics.Color.green(0) + 20765), android.view.KeyEvent.getDeadChar(0, 0) + 11, objArr6);
        hashtable6.put(((java.lang.String) objArr6[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(192));
        java.util.Hashtable hashtable7 = DigitizedCardProfile;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 44, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 11, objArr7);
        hashtable7.put(((java.lang.String) objArr7[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(256));
        int i = valueOf + 71;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static int DigitizedCardProfile(com.payair.hce.getTransactionExecutor gettransactionexecutor) {
        int i = valueOf + 83;
        writeReplace = i % 128;
        java.lang.Integer num = (java.lang.Integer) DigitizedCardProfile.get(gettransactionexecutor.values());
        if (i % 2 != 0) {
            return num.intValue();
        }
        throw null;
    }

    static byte[] writeReplace(com.payair.hce.getTransactionExecutor gettransactionexecutor, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int AlternateContactlessPaymentDataJson2 = i2 / gettransactionexecutor.AlternateContactlessPaymentDataJson();
        int AlternateContactlessPaymentDataJson3 = gettransactionexecutor.AlternateContactlessPaymentDataJson();
        byte[] bArr3 = new byte[AlternateContactlessPaymentDataJson3];
        writeReplace = (valueOf + 15) % 128;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= AlternateContactlessPaymentDataJson2; i5++) {
            gettransactionexecutor.DigitizedCardProfile((byte) i3);
            gettransactionexecutor.DigitizedCardProfile((byte) (i >> 24));
            gettransactionexecutor.DigitizedCardProfile((byte) (i >> 16));
            gettransactionexecutor.DigitizedCardProfile((byte) (i >> 8));
            gettransactionexecutor.DigitizedCardProfile((byte) i);
            gettransactionexecutor.DigitizedCardProfile(bArr, 0, bArr.length);
            gettransactionexecutor.valueOf(bArr3, 0);
            int i6 = i5 * AlternateContactlessPaymentDataJson3;
            int i7 = i2 - i6;
            if (i7 > AlternateContactlessPaymentDataJson3) {
                int i8 = valueOf + 35;
                writeReplace = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                i7 = AlternateContactlessPaymentDataJson3;
            }
            java.lang.System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i9 = i % 8;
        if (i9 != 0) {
            int i10 = 8 - i9;
            int i11 = 0;
            while (i4 != i2) {
                valueOf = (writeReplace + 15) % 128;
                int i12 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i11 << (8 - i10)) | (i12 >>> i10));
                i4++;
                i11 = i12;
            }
        }
        return bArr2;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        byte b = 0;
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[b] = java.lang.Integer.valueOf(values[i << getcvmmodel.valueOf]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 381 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) == 0.0d ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 62389));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b, b, objArr3);
                        java.lang.String str = (java.lang.String) objArr3[b];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                        clsArr[b] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue();
                    long j = getcvmmodel.valueOf;
                    long j2 = AlternateContactlessPaymentDataJson;
                    java.lang.Object[] objArr4 = new java.lang.Object[4];
                    objArr4[3] = java.lang.Integer.valueOf(c);
                    objArr4[2] = java.lang.Long.valueOf(j2);
                    objArr4[1] = java.lang.Long.valueOf(j);
                    objArr4[b] = java.lang.Long.valueOf(longValue);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(b) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(b) == 0L ? 0 : -1)) + 35, (android.util.TypedValue.complexToFloat(b) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(b) == 0.0f ? 0 : -1)) + 3966, (char) (40224 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        java.lang.Class<?>[] clsArr2 = new java.lang.Class[4];
                        clsArr2[b] = java.lang.Long.TYPE;
                        clsArr2[1] = java.lang.Long.TYPE;
                        clsArr2[2] = java.lang.Long.TYPE;
                        clsArr2[3] = java.lang.Integer.TYPE;
                        obj2 = cls2.getMethod("a", clsArr2);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - ((android.os.Process.getThreadPriority(b) + 20) >> 6), 212 - android.view.KeyEvent.getDeadChar(b, b), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        java.lang.Class<?>[] clsArr3 = new java.lang.Class[2];
                        clsArr3[b] = java.lang.Object.class;
                        clsArr3[1] = java.lang.Object.class;
                        obj3 = cls3.getMethod("d", clsArr3);
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
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                objArr6[b] = java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf]);
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.getDefaultSize(b, b), 381 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.View.resolveSizeAndState(b, b, b) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b, b, b, objArr7);
                    java.lang.String str2 = (java.lang.String) objArr7[b];
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[1];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    obj4 = cls4.getMethod(str2, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3966, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
                b = 0;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 59) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, 212 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void AlternateContactlessPaymentDataJson() {
        values = new char[]{33906, 53044, 4826, 26139, 43364, 16999, 2337, 54479, 40974, 28530, 15063, 34350, 24316, 5562, 51284, 48277, 29673, 9803, 39607, 24316, 5562, 51284, 48277, 29672, 9798, 39605, 24316, 5562, 51284, 48277, 29678, 9807, 39603, 4065, 17575, 39241, 60808, 8947, 30546, 52142, 22, 21864, 43461, 65060, 24316, 5562, 51284, 48277, 29678, 9807, 39603, 20747, 1141, 63711, 44859};
        AlternateContactlessPaymentDataJson = -650435655345433102L;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
    }
}
