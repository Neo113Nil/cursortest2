package com.payair.hce;

/* loaded from: classes10.dex */
final class setCrmCountryCode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int getAid;
    private static long getProfileVersion;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace = "";

    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i = 99 - (s * 4);
        int i2 = s2 + 4;
        byte[] bArr = $$a;
        int i3 = b * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += -i2;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i6 = i2 + 1;
            i += -bArr[i6];
            i2 = i6;
            i4 = i5;
        }
    }

    setCrmCountryCode() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) android.text.TextUtils.indexOf("", ""), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, objArr);
        this.DigitizedCardProfile = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(4 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 12 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        this.values = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(17 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.normalizeMetaState(0) + 39188), 5 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr3);
        this.valueOf = ((java.lang.String) objArr3[0]).intern();
    }

    public final com.payair.hce.setCrmCountryCode DigitizedCardProfile(java.lang.String str) {
        int i = getAid;
        RecordsJson = (i + 63) % 128;
        this.writeReplace = str;
        RecordsJson = (i + 105) % 128;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        char c2;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 87) % 128;
        while (true) {
            int i3 = getcvmmodel.valueOf;
            c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i3 >= i2) {
                break;
            }
            int i4 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 49, 381 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (62388 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3966, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.os.Process.getGidForName(""), 212 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", c2), 212 - (android.os.Process.myPid() >> 22), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $10 = ($11 + 3) % 128;
            c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final com.payair.hce.setCrmCountryCode AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = getAid;
        int i2 = i + 5;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            this.valueOf = str;
            RecordsJson = (i + 77) % 128;
            return this;
        }
        this.valueOf = str;
        throw null;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        getAid = (RecordsJson + 61) % 128;
        java.lang.String writeReplace = com.payair.hce.setCdol1RelatedDataLength.writeReplace(this.writeReplace, this.valueOf, this.DigitizedCardProfile, this.values);
        if (writeReplace.length() % 2 == 0) {
            int i = RecordsJson + 69;
            getAid = i % 128;
            if (i % 2 == 0) {
                return writeReplace;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(writeReplace);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 23, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 13229), 1 - android.text.TextUtils.getCapsMode("", 0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        return sb.toString();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson = new char[]{24221, 45749, 34505, 24223, 45751, 34511, 39655, 60991, 49751, 54895, 11143, 16351, 5111, 26383, 31527, 20351, 51081, 11171, 8154, 1009, 30504, 23362, 27972};
        getProfileVersion = 8797451141206422151L;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44};
        $$b = 199;
    }
}
