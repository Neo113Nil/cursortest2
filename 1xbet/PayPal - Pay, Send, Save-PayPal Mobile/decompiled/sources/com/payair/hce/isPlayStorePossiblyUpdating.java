package com.payair.hce;

/* loaded from: classes4.dex */
public final class isPlayStorePossiblyUpdating {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static final com.payair.hce.isSidewinderDevice DigitizedCardProfile;
    private static int valueOf;
    private static long values;
    private static int writeReplace;

    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2 = s * 2;
        int i3 = (b * 2) + 99;
        int i4 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4++;
                i3 += bArr[i4];
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        writeReplace = 1;
        DigitizedCardProfile();
        DigitizedCardProfile = new com.payair.hce.isPlayServicesPossiblyUpdating();
        int i = writeReplace + 3;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static java.lang.String writeReplace(byte[] bArr) {
        valueOf = (writeReplace + 11) % 128;
        java.lang.String writeReplace2 = writeReplace(bArr, bArr.length);
        int i = valueOf + 69;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return writeReplace2;
        }
        throw null;
    }

    private static java.lang.String writeReplace(byte[] bArr, int i) {
        int i2 = valueOf + 109;
        writeReplace = i2 % 128;
        java.lang.String DigitizedCardProfile2 = i2 % 2 == 0 ? com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(valueOf(bArr, 1, i)) : com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(valueOf(bArr, 0, i));
        valueOf = (writeReplace + 113) % 128;
        return DigitizedCardProfile2;
    }

    public static byte[] values(byte[] bArr) {
        writeReplace = (valueOf + 61) % 128;
        byte[] valueOf2 = valueOf(bArr, 0, bArr.length);
        int i = valueOf + 117;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    private static byte[] valueOf(byte[] bArr, int i, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            DigitizedCardProfile.valueOf(bArr, 0, i2, byteArrayOutputStream);
            valueOf = (writeReplace + 41) % 128;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 32477), 31 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.payair.hce.uidHasPackageName(sb.toString(), e);
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 25) % 128;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 15) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, 381 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(-1, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.os.Process.getGidForName(""), 3966 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", "", 0), 213 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 57) % 128;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 35, android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson = new char[]{8215, 47201, 4295, 59734, 16814, 55825, 45721, 2800, 58180, 31633, 54329, 44165, 1301, 40306, 30156, 52830, 42668, 16142, 38868, 28619, 51275, 41165, 14688, 37276, 27150, 49779, 23237, 13141, 35745, 25687, 64728};
        values = 6231107083959649988L;
    }

    static void init$0() {
        $$a = new byte[]{9, com.visa.cbp.getEncExpo.IResultReceiver2, -92, com.visa.cbp.getEncExpo.IResultReceiver2};
        $$b = 69;
    }
}
