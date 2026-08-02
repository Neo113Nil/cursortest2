package com.payair.hce;

/* loaded from: classes4.dex */
public final class setBreakStrategy extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = 106 - b;
        byte[] bArr = $$a;
        int i5 = 3 - (i * 3);
        int i6 = i2 * 3;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += -i7;
            i3 = i8;
            i5++;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 += -i7;
            i3 = i8;
            i5++;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i5++;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            java.lang.Double d = (java.lang.Double) obj;
            if (java.lang.Double.isInfinite(d.doubleValue()) || java.lang.Double.isNaN(d.doubleValue())) {
                com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "ょꁊᩙ⊗", "谇헩\uea2b᜴", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 13546), objArr);
                com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2, ((java.lang.String) objArr[0]).intern()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile2));
                values = (AlternateContactlessPaymentDataJson + 121) % 128;
                return;
            }
        }
        if (obj instanceof java.lang.Float) {
            int i = AlternateContactlessPaymentDataJson + 53;
            values = i % 128;
            if (i % 2 == 0) {
                java.lang.Float f = (java.lang.Float) obj;
                if (java.lang.Float.isInfinite(f.floatValue()) || java.lang.Float.isNaN(f.floatValue())) {
                    com.payair.hce.setSelection DigitizedCardProfile3 = DigitizedCardProfile();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "ょꁊᩙ⊗", "谇헩\uea2b᜴", android.view.KeyEvent.normalizeMetaState(0), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 13546), objArr2);
                    com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile3, ((java.lang.String) objArr2[0]).intern()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile3));
                    return;
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        com.payair.hce.setSelection DigitizedCardProfile4 = DigitizedCardProfile();
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile4, obj.toString()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile4));
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            $11 = ($10 + 97) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            $11 = ($10 + 77) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 5) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 70, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1179, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 0, (byte) $$a.length, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29, 3443 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (3830 - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777242, android.widget.ExpandableListView.getPackedPositionChild(0L) + 1865, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, 0, (byte) 1, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.View.resolveSize(0, 0) + 3133, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr4[getwalletdata.writeReplace]) ^ (writeReplace ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $10 = ($11 + 59) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = 1263759066225628708L;
        valueOf = -804334044;
        DigitizedCardProfile = (char) 22725;
    }

    static void init$0() {
        $$a = new byte[]{89, -55, -127, -63};
        $$b = 82;
    }
}
