package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setEms extends com.payair.hce.setGravity {
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int valueOf;
    private static long values;

    private static void g(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2 = 3 - (s * 3);
        int i3 = (i * 4) + 99;
        byte[] bArr = $$j;
        int i4 = b * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = i2 + i5;
            i2 = i2;
        }
        while (true) {
            int i7 = i2 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i6 = i8;
                i3 = bArr[i7] + i3;
                i2 = i7;
            }
        }
    }

    abstract int AlternateContactlessPaymentDataJson() throws java.io.IOException;

    abstract boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems);

    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    abstract boolean writeReplace();

    setEms() {
    }

    public static com.payair.hce.setEms writeReplace(byte[] bArr) throws java.io.IOException {
        com.payair.hce.setMinHeight setminheight = new com.payair.hce.setMinHeight(bArr);
        try {
            com.payair.hce.setEms DigitizedCardProfile2 = setminheight.DigitizedCardProfile();
            if (setminheight.available() != 0) {
                char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.Object[] objArr = new java.lang.Object[1];
                f('M' - mirror, android.graphics.ImageFormat.getBitsPerPixel(0) + 1, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            int i = AlternateContactlessPaymentDataJson + 111;
            valueOf = i % 128;
            if (i % 2 == 0) {
                return DigitizedCardProfile2;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.ClassCastException unused) {
            int indexOf = android.text.TextUtils.indexOf("", "", 0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f(indexOf + 33, 29 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 35919), objArr2);
            throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // com.payair.hce.setGravity
    public final boolean equals(java.lang.Object obj) {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (i + 85) % 128;
        if (this != obj) {
            return (obj instanceof com.payair.hce.setShadowLayer) && AlternateContactlessPaymentDataJson(((com.payair.hce.setShadowLayer) obj).getAid());
        }
        int i2 = i + 113;
        valueOf = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // com.payair.hce.setGravity, com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        int i = valueOf;
        AlternateContactlessPaymentDataJson = (i + 27) % 128;
        int i2 = i + 25;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    com.payair.hce.setEms DigitizedCardProfile() {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (i + 41) % 128;
        int i2 = i + 35;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static void f(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            $10 = ($11 + 25) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 380, (char) (62388 - android.text.TextUtils.getTrimmedLength("")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    g((short) 0, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, 3966 - android.view.View.resolveSize(0, 0), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 34, 212 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i4 = $11 + 35;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.getDeadChar(0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 213, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 34, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        int i = (valueOf + 17) % 128;
        AlternateContactlessPaymentDataJson = i;
        int i2 = i + 103;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    static void init$0() {
        $$j = new byte[]{71, -67, -2, -10};
        $$k = 69;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        DigitizedCardProfile = new char[]{24298, 41643, 42531, 43945, 44862, 45283, 46115, 47530, 48443, 48786, 33367, 34719, 35610, 35991, 36866, 38280, 39195, 39670, 40563, 58299, 59254, 59629, 60455, 61944, 62843, 63169, 64082, 65498, 50002, 53890, 12028, 10871, 10235, 9086, 15609, 14377, 13815, 12644, 13022, 3670, 3026, 1887, 196, 7258, 6592, 5377, 5810, 4667, 28607, 27444, 25774, 24637, 32229, 31016, 31379, 30297, 29574, 20229, 18591, 17420, 16772, 23820};
        values = -7742853344595107117L;
    }

    public static int e(java.lang.Object obj) {
        try {
            java.lang.Object[] objArr = {obj};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3442 - android.view.MotionEvent.axisFromString(""), (char) (3830 - android.view.MotionEvent.axisFromString("")))).getMethod("g", java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
