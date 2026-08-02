package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ae extends com.facetec.sdk.aq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static int f3380a;
    private static long b;
    private static int c;
    private static char e;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private final javax.crypto.spec.SecretKeySpec d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i2, int i3, short s) {
        int i4;
        int i5 = s * 2;
        int i6 = (i3 * 3) + 4;
        int i7 = 116 - i2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i6++;
            i7 += i8;
            bArr2[i4] = (byte) i7;
            if (i4 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i8 = bArr[i6];
            i4++;
            i6++;
            i7 += i8;
            bArr2[i4] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{13, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 97};
        $$b = 81;
    }

    ae(byte[] bArr) throws java.lang.Exception {
        int red = android.graphics.Color.red(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        f((-2109967422) - red, "싷㱳龂ᕻ", (char) (31646 - android.os.Process.getGidForName("")), "쿘辮턆", "\u0000\u0000\u0000\u0000", objArr);
        this.d = new javax.crypto.spec.SecretKeySpec(bArr, ((java.lang.String) objArr[0]).intern());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] a2 = a();
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(a2);
            java.lang.Object[] objArr = new java.lang.Object[1];
            f(android.view.ViewConfiguration.getPressedStateDuration() >> 16, "旟\uf05dޒஜ", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "颗广\ue9d6Ⴡᇼ協䉹敓ண䖎孉齔뮗诟輠⋮⇢灯봋Ɑ", "\u0000\u0000\u0000\u0000", objArr);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(((java.lang.String) objArr[0]).intern());
            try {
                cipher.init(1, this.d, ivParameterSpec);
                byte[] a3 = a(cipher, bArr);
                byte[] bArr2 = new byte[a3.length + a2.length];
                int length = a2.length;
                int i2 = j;
                h = (i2 + 57) % 128;
                h = (i2 + 79) % 128;
                try {
                    java.lang.Object[] objArr2 = {a2, 0, bArr2, 0, java.lang.Integer.valueOf(length)};
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    k(true, 16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ", android.text.TextUtils.getOffsetBefore("", 0) + 142, 4 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    k(true, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, "\u0002\ufff6\f\ufff4\u0005\u0005\ufff4\f\u0003", 152 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.graphics.Color.red(0) + 7, objArr4);
                    cls.getMethod((java.lang.String) objArr4[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr2);
                    int length2 = a2.length;
                    int length3 = a3.length;
                    h = (j + 101) % 128;
                    try {
                        java.lang.Object[] objArr5 = {a3, 0, bArr2, java.lang.Integer.valueOf(length2), java.lang.Integer.valueOf(length3)};
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        k(true, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 16, "\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ", 142 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr6);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        k(true, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 9, "\u0002\ufff6\f\ufff4\u0005\u0005\ufff4\f\u0003", 152 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 7 - android.graphics.Color.red(0), objArr7);
                        cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr5);
                        return bArr2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public final byte[] b(byte[] bArr) throws java.lang.Exception {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, 16, bArr.length);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(copyOfRange);
        java.lang.Object[] objArr = new java.lang.Object[1];
        f(android.view.View.MeasureSpec.getSize(0), "旟\uf05dޒஜ", (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "颗广\ue9d6Ⴡᇼ協䉹敓ண䖎孉齔뮗诟輠⋮⇢灯봋Ɑ", "\u0000\u0000\u0000\u0000", objArr);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(((java.lang.String) objArr[0]).intern());
        cipher.init(2, this.d, ivParameterSpec);
        byte[] e2 = e(cipher, copyOfRange2);
        int i2 = h + 3;
        j = i2 % 128;
        if (i2 % 2 != 0) {
            return e2;
        }
        throw null;
    }

    private static void k(boolean z, int i2, java.lang.String str, int i3, int i4, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr = new char[i2];
        hpVar.d = 0;
        while (hpVar.d < i2) {
            hpVar.b = charArray[hpVar.d];
            cArr[hpVar.d] = (char) (i3 + hpVar.b);
            int i5 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(f3380a)};
                java.lang.Object d = com.facetec.sdk.al.d(-1738479149);
                if (d == null) {
                    byte b2 = (byte) 3;
                    byte b3 = (byte) (b2 - 3);
                    d = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 19486), 730 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 24 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1066373931, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(1965925374);
                if (d2 == null) {
                    d2 = com.facetec.sdk.al.c((char) (24338 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), android.view.KeyEvent.normalizeMetaState(0) + 1621, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            hpVar.f3630a = i4;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr2, hpVar.f3630a, cArr, 0, i2 - hpVar.f3630a);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            hpVar.d = 0;
            while (hpVar.d < i2) {
                cArr3[hpVar.d] = cArr[(i2 - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (24338 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1621, 25 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(int i2, java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] cArr;
        char c3;
        int i3 = $11 + 101;
        $10 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + 119) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i4 = 0;
        java.lang.System.arraycopy(charArray2, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            $11 = ($10 + 11) % 128;
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d = com.facetec.sdk.al.d(-1265265027);
                if (d == null) {
                    char c4 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1));
                    int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4, i4);
                    byte b2 = (byte) 5;
                    byte b3 = (byte) (b2 - 5);
                    java.lang.String $$c = $$c(b2, b3, b3);
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i4] = java.lang.Object.class;
                    d = com.facetec.sdk.al.c(c4, (scrollBarSize >> 8) + 988, lastIndexOf + 25, 326823045, false, $$c, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(1957241543);
                if (d2 == null) {
                    byte b4 = (byte) i4;
                    d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.KeyEvent.keyCodeFromString("") + 1505, android.widget.ExpandableListView.getPackedPositionType(0L) + 24, -750364609, false, $$c((byte) 8, b4, b4), new java.lang.Class[]{java.lang.Object.class});
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                java.lang.Object[] objArr4 = {hsVar, java.lang.Integer.valueOf(cArr3[hsVar.d % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object d3 = com.facetec.sdk.al.d(-1182647832);
                if (d3 == null) {
                    byte b5 = (byte) 2;
                    byte b6 = (byte) (b5 - 2);
                    d3 = com.facetec.sdk.al.c((char) (26699 - android.view.View.combineMeasuredStates(0, 0)), android.graphics.Color.rgb(0, 0, 0) + 16777855, 23 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 510477072, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object d4 = com.facetec.sdk.al.d(1279455729);
                if (d4 == null) {
                    char packedPositionType = (char) (409 - android.widget.ExpandableListView.getPackedPositionType(0L));
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    java.lang.String $$c2 = $$c(b7, b8, b8);
                    c3 = 2;
                    d4 = com.facetec.sdk.al.c(packedPositionType, 2197 - indexOf, 24 - (scrollBarSize2 >> 8), -340948215, false, $$c2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).charValue();
                cArr3[intValue2] = hsVar.b;
                cArr5[hsVar.d] = (char) ((((cArr3[intValue2] ^ charArray[hsVar.d]) ^ (b ^ 9010024738234916139L)) ^ ((int) (c ^ 9010024738234916139L))) ^ ((char) (e ^ 9010024738234916139L)));
                hsVar.d++;
                obj = null;
                i4 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void e() {
        f3380a = 780577493;
    }

    static void d() {
        b = 9010024738234916139L;
        c = 603544875;
        e = (char) 2224;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        i = 1;
        h = 0;
        j = 1;
        e();
        d();
        android.view.ViewConfiguration.getScrollFriction();
        android.os.SystemClock.currentThreadTimeMillis();
        i = (g + 69) % 128;
    }
}
