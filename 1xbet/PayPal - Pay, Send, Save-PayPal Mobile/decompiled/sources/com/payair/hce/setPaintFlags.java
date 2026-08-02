package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setPaintFlags extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = s * 4;
        int i3 = 4 - (s2 * 3);
        int i4 = (b * 4) + 99;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i4 += -i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i3;
            i3 = bArr[i3];
            i6 = i7;
            i4 += -i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    @Override // com.payair.hce.setEms
    abstract void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException;

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = values + 79;
        int i2 = i % 128;
        writeReplace = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 35;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (setems instanceof com.payair.hce.setPaintFlags) {
            writeReplace = (values + 99) % 128;
            return true;
        }
        int i = writeReplace + 51;
        values = i % 128;
        return i % 2 == 0;
    }

    public java.lang.String toString() {
        values = (writeReplace + 17) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 54876), android.view.KeyEvent.keyCodeFromString("") + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        writeReplace = (values + 53) % 128;
        return intern;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777264, android.view.KeyEvent.keyCodeFromString("") + 381, (char) (62388 - android.view.View.getDefaultSize(0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3966, (char) (40222 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 75) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 34, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $10 = ($11 + 7) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        values = 1;
        AlternateContactlessPaymentDataJson = new char[]{35005, 2876, 36747, 625};
        DigitizedCardProfile = -847819220824302283L;
    }

    static void init$0() {
        $$a = new byte[]{13, com.visa.cbp.getEncExpo.kernelVersion, 116, -36};
        $$b = 48;
    }
}
