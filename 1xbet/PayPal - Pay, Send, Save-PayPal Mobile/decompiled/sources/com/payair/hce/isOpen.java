package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class isOpen implements com.payair.hce.getMDatabaseannotations, com.payair.hce.init {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;
    private final com.payair.hce.getMDatabaseannotations valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        int i4 = (i * 4) + 1;
        int i5 = 4 - (b * 3);
        int i6 = 111 - (s * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i6 = i4;
            i3 = 0;
            i6 += -i5;
            i5 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i5;
            i5 = bArr[i5];
            i6 += -i5;
            i5 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    protected abstract byte valueOf(byte b);

    public isOpen(com.payair.hce.getMDatabaseannotations getmdatabaseannotations) {
        this.valueOf = getmdatabaseannotations;
    }

    public final int DigitizedCardProfile(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws com.payair.hce.getInvalidationTracker {
        int i4 = DigitizedCardProfile + 107;
        int i5 = i4 % 128;
        writeReplace = i5;
        if (i4 % 2 == 0 ? i + i2 > bArr.length : (i << i2) > bArr.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{0, 22, 0, 15}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000", false, objArr);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr[0]).intern());
        }
        if (i3 + i2 <= bArr2.length) {
            DigitizedCardProfile = (i5 + 21) % 128;
            for (int i6 = i; i6 < i + i2; i6++) {
                bArr2[i3] = valueOf(bArr[i6]);
                i3++;
            }
            int i7 = DigitizedCardProfile + 45;
            writeReplace = i7 % 128;
            if (i7 % 2 == 0) {
                return i2;
            }
            throw null;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{22, 23, 137, 2}, null, true, objArr2);
        throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr2[0]).intern());
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2;
        char[] cArr2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        if (cArr3 != null) {
            int i10 = $10 + 91;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i6];
                    objArr2[i4] = java.lang.Integer.valueOf(cArr3[i2]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(i4) + 29, 2807 - android.graphics.Color.red(i4), (char) android.text.TextUtils.indexOf("", "", i4));
                        byte b = (byte) ($$e & 1);
                        byte b2 = (byte) (b - 1);
                        cArr2 = cArr3;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr2 = cArr3;
                    }
                    cArr[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    cArr3 = cArr2;
                    i4 = 0;
                    i6 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        char[] cArr4 = new char[i7];
        java.lang.System.arraycopy(cArr3, i5, cArr4, 0, i7);
        if (bArr2 != null) {
            char[] cArr5 = new char[i7];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i7) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.combineMeasuredStates(0, 0) + 2836, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                        byte b3 = (byte) ($$e & 2);
                        byte b4 = (byte) (b3 - 2);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2879, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 0, (byte) 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.resolveSize(0, 0), 211 - android.os.Process.getGidForName(""), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i9 > 0) {
            $11 = ($10 + 57) % 128;
            char[] cArr6 = new char[i7];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i7);
            int i13 = i7 - i9;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i13, i9);
            java.lang.System.arraycopy(cArr6, i9, cArr4, 0, i13);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i7];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i7) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i7 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i8 > 0) {
            int i14 = 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i7) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i14 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        DigitizedCardProfile = 1;
        AlternateContactlessPaymentDataJson = new char[]{16884, 16803, 16808, 16811, 16805, 16775, 16772, 16831, 16801, 16777, 16775, 16830, 16809, 16808, 16802, 16804, 16805, 16801, 16828, 16826, 16772, 16783, 16688, 16694, 16691, 16693, 16694, 16703, 16690, 16743, 16694, 16694, 16691, 16743, 16693, 16672, 16673, 16673, 16688, 16677, 16743, 16691, 16688, 16695, 16691};
    }

    static void init$0() {
        $$d = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$e = 31;
    }
}
