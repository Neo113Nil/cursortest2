package com.facetec.sdk;

/* loaded from: classes8.dex */
final class n {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static char f3673a;
    private static int b;
    private static int c;
    private static long d;
    private static int e;

    private static java.lang.String $$c(byte b2, byte b3, short s) {
        int i = 116 - b2;
        int i2 = (b3 * 2) + 4;
        int i3 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i3 + i;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i += bArr[i2];
            i2++;
        }
    }

    static void init$0() {
        $$a = new byte[]{kotlin.io.encoding.Base64.padSymbol, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
        $$b = 224;
    }

    n() {
    }

    static void b(java.lang.Throwable th) {
        java.lang.reflect.Method d2;
        int i = e + 69;
        c = i % 128;
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            java.lang.String c2 = com.facetec.sdk.bj.c((android.content.Context) null);
            if (c2 != null) {
                e = (c + 21) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                f(1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "٭僥祔\uea93", (char) android.graphics.Color.green(0), "鵌ꐼ禤쎰\uea9b\uaa39烉ီ㉳覈骙ꡬ", "\uf496큺⟎\uedaf", objArr);
                if (c2.startsWith(((java.lang.String) objArr[0]).intern()) && (d2 = d()) != null) {
                    try {
                        d2.invoke(null, th);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            android.util.Log.getStackTraceString(th);
            int i2 = c + 49;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        com.facetec.sdk.bj.c((android.content.Context) null);
        throw null;
    }

    private static java.lang.reflect.Method d() {
        e = (c + 59) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            f((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1521995267, "ﻆ䠱䂥⭰", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\ue2a7哞识➓屩ћญ凞ꢱ㡟\uf1c6휖뒐婓蚓令롏\u0abb⑤靦ꢦ◜뗈＋떔施冽\uf697鿻\ude5e㭫퐛㚆\ue1ca쇸", "\uf496큺⟎\uedaf", objArr);
            java.lang.Class<?> cls = java.lang.Class.forName(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f(android.view.ViewConfiguration.getPressedStateDuration() >> 16, "\ue12c\ue870㖲렰", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "楚黦彩ද\ue152\uf7faΣ➾釄챍휠ᡳ", "\uf496큺⟎\uedaf", objArr2);
            java.lang.reflect.Method method = cls.getMethod(((java.lang.String) objArr2[0]).intern(), java.lang.Throwable.class);
            int i = c + 19;
            e = i % 128;
            if (i % 2 == 0) {
                return method;
            }
            throw null;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(int i, java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] cArr;
        char c3;
        int i2 = ($10 + 119) % 128;
        $11 = i2;
        int i3 = 0;
        if (str3 != null) {
            int i4 = i2 + 33;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr = str3.toCharArray();
                int i5 = 77 / 0;
            } else {
                cArr = str3.toCharArray();
            }
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
        java.lang.System.arraycopy(charArray2, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            $11 = ($10 + 105) % 128;
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                if (d2 == null) {
                    char indexOf = (char) android.text.TextUtils.indexOf("", "");
                    float complexToFraction = android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f);
                    int deadChar = android.view.KeyEvent.getDeadChar(i3, i3);
                    byte b2 = (byte) 5;
                    byte b3 = (byte) (b2 - 5);
                    java.lang.String $$c = $$c(b2, b3, b3);
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i3] = java.lang.Object.class;
                    d2 = com.facetec.sdk.al.c(indexOf, 988 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), deadChar + 24, 326823045, false, $$c, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                if (d3 == null) {
                    char modifierMetaStateMask = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
                    int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                    int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                    byte b4 = (byte) i3;
                    java.lang.String $$c2 = $$c((byte) 8, b4, b4);
                    java.lang.Class[] clsArr2 = new java.lang.Class[1];
                    clsArr2[i3] = java.lang.Object.class;
                    d3 = com.facetec.sdk.al.c(modifierMetaStateMask, 1505 - (jumpTapTimeout >> 16), (pressedStateDuration >> 16) + 24, -750364609, false, $$c2, clsArr2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                char c4 = cArr3[hsVar.d % 4];
                java.lang.Object[] objArr4 = new java.lang.Object[3];
                objArr4[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr4[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr4[i3] = hsVar;
                java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                if (d4 == null) {
                    char scrollDefaultDelay = (char) (26699 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                    int green = android.graphics.Color.green(i3);
                    byte b5 = (byte) 2;
                    byte b6 = (byte) (b5 - 2);
                    d4 = com.facetec.sdk.al.c(scrollDefaultDelay, (maximumFlingVelocity >> 16) + 639, green + 23, 510477072, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                if (d5 == null) {
                    char c5 = (char) (409 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    float minVolume = android.media.AudioTrack.getMinVolume();
                    byte b7 = (byte) 0;
                    java.lang.String $$c3 = $$c(b7, b7, b7);
                    c3 = 2;
                    d5 = com.facetec.sdk.al.c(c5, indexOf2 + 2199, 24 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), -340948215, false, $$c3, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                cArr3[intValue2] = hsVar.b;
                cArr5[hsVar.d] = (char) ((((cArr3[intValue2] ^ charArray[hsVar.d]) ^ (d ^ 9010024738234916139L)) ^ ((int) (b ^ 9010024738234916139L))) ^ ((char) (f3673a ^ 9010024738234916139L)));
                hsVar.d++;
                i3 = 0;
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

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        e = 0;
        c = 1;
        d = -8023956523635725891L;
        b = 603544875;
        f3673a = (char) 23851;
    }
}
