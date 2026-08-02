package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nw implements com.facetec.sdk.mu {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static int f3695a;
    private static char c;
    private static long d;
    private final boolean b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, short s, byte b) {
        int i2;
        int i3 = b + 108;
        int i4 = 4 - (i * 4);
        byte[] bArr = $$a;
        int i5 = s * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i5;
            i4++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{14, -110, -105, 88};
        $$b = 108;
    }

    public nw(boolean z) {
        this.b = z;
    }

    @Override // com.facetec.sdk.mu
    public final com.facetec.sdk.mw e(com.facetec.sdk.mu.e eVar) throws java.io.IOException {
        com.facetec.sdk.mw.c cVar;
        com.facetec.sdk.mw b;
        com.facetec.sdk.mw.c cVar2;
        com.facetec.sdk.mw.c cVar3;
        com.facetec.sdk.oc ocVar = (com.facetec.sdk.oc) eVar;
        com.facetec.sdk.nx nxVar = ocVar.b;
        com.facetec.sdk.nu d2 = ocVar.d();
        com.facetec.sdk.nl nlVar = ocVar.d;
        com.facetec.sdk.mx a2 = ocVar.a();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            f("\u0000\u0000\u0000\u0000", (char) (15756 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "杄캤狓խ쫕ᣫ昺彻齘鈌臰\uf412\uf498땹\uddb4궸", "윊Ｚ謋=", android.view.View.resolveSizeAndState(0, 0, 0), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f("\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 34927), "\uf34fᆎȾ䗩⟚싿鲰㟗챐蟇ࣕ瑓輈\udd4d럨臏\u0ee7", "ﶲꅥ渹岈", 966878717 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            long longValue = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue();
            ocVar.j();
            ocVar.i();
            nxVar.b(a2);
            ocVar.j();
            ocVar.i();
            if (!com.facetec.sdk.nv.e(a2.a()) || a2.b() == null) {
                cVar = null;
            } else {
                if ("100-continue".equalsIgnoreCase(a2.d(com.google.common.net.HttpHeaders.EXPECT))) {
                    nxVar.e();
                    ocVar.j();
                    ocVar.i();
                    cVar2 = nxVar.d(true);
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    ocVar.j();
                    ocVar.i();
                    cVar3 = cVar2;
                    com.facetec.sdk.nw.c cVar4 = new com.facetec.sdk.nw.c(nxVar.e(a2, a2.b().a()));
                    com.facetec.sdk.pj e = com.facetec.sdk.pt.e(cVar4);
                    a2.b().d(e);
                    e.close();
                    ocVar.j();
                    ocVar.i();
                    long j = cVar4.c;
                } else {
                    cVar3 = cVar2;
                    if (!nlVar.b()) {
                        d2.b();
                    }
                }
                cVar = cVar3;
            }
            nxVar.a();
            if (cVar == null) {
                ocVar.j();
                ocVar.i();
                cVar = nxVar.d(false);
            }
            com.facetec.sdk.mw.c d3 = cVar.c(a2).c(d2.a().c()).d(longValue);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            f("\u0000\u0000\u0000\u0000", (char) (15756 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "杄캤狓խ쫕ᣫ昺彻齘鈌臰\uf412\uf498땹\uddb4궸", "윊Ｚ謋=", android.text.TextUtils.indexOf("", ""), objArr3);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f("\u0000\u0000\u0000\u0000", (char) (34926 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\uf34fᆎȾ䗩⟚싿鲰㟗챐蟇ࣕ瑓輈\udd4d럨臏\u0ee7", "ﶲꅥ渹岈", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 966878716, objArr4);
            com.facetec.sdk.mw b2 = d3.e(((java.lang.Long) cls2.getMethod((java.lang.String) objArr4[0], null).invoke(null, null)).longValue()).b();
            int e2 = b2.e();
            if (e2 == 100) {
                com.facetec.sdk.mw.c d4 = nxVar.d(false).c(a2).c(d2.a().c()).d(longValue);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                f("\u0000\u0000\u0000\u0000", (char) (15755 - android.view.Gravity.getAbsoluteGravity(0, 0)), "杄캤狓խ쫕ᣫ昺彻齘鈌臰\uf412\uf498땹\uddb4궸", "윊Ｚ謋=", android.os.Process.getGidForName("") + 1, objArr5);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                f("\u0000\u0000\u0000\u0000", (char) (34925 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "\uf34fᆎȾ䗩⟚싿鲰㟗챐蟇ࣕ瑓輈\udd4d럨臏\u0ee7", "ﶲꅥ渹岈", 966878717 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr6);
                b2 = d4.e(((java.lang.Long) cls3.getMethod((java.lang.String) objArr6[0], null).invoke(null, null)).longValue()).b();
                e2 = b2.e();
            }
            ocVar.j();
            ocVar.i();
            if (this.b && e2 == 101) {
                b = b2.g().d(com.facetec.sdk.nh.c).b();
            } else {
                b = b2.g().d(nxVar.c(b2)).b();
            }
            if ("close".equalsIgnoreCase(b.d().d(com.google.common.net.HttpHeaders.CONNECTION)) || "close".equalsIgnoreCase(b.b(com.google.common.net.HttpHeaders.CONNECTION))) {
                d2.b();
            }
            if ((e2 != 204 && e2 != 205) || b.b().d() <= 0) {
                return b;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
            sb.append(e2);
            sb.append(" had non-zero Content-Length: ");
            sb.append(b.b().d());
            throw new java.net.ProtocolException(sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char c3;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        int i2 = 0;
        java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c2);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                if (d2 == null) {
                    char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    int indexOf = android.text.TextUtils.indexOf("", "", i2, i2);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2);
                    byte b = (byte) i2;
                    byte b2 = b;
                    java.lang.String $$c = $$c(b, b2, (byte) (b2 + 3));
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i2] = java.lang.Object.class;
                    d2 = com.facetec.sdk.al.c(windowTouchSlop, indexOf + 988, 23 - lastIndexOf, 326823045, false, $$c, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                if (d3 == null) {
                    byte b3 = (byte) i2;
                    byte b4 = b3;
                    d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1505 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 24 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), -750364609, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class});
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                java.lang.Object[] objArr4 = {hsVar, java.lang.Integer.valueOf(cArr[hsVar.d % 4] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                if (d4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    d4 = com.facetec.sdk.al.c((char) (26699 - android.text.TextUtils.indexOf("", "", 0)), android.view.View.MeasureSpec.getSize(0) + 639, 22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 510477072, false, $$c(b5, b6, (byte) (b6 | 6)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr[intValue2] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                if (d5 == null) {
                    char defaultSize = (char) (409 - android.view.View.getDefaultSize(0, 0));
                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                    int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    java.lang.String $$c2 = $$c(b7, b8, (byte) (b8 | 8));
                    c3 = 2;
                    d5 = com.facetec.sdk.al.c(defaultSize, (edgeSlop >> 16) + 2198, (scrollBarSize >> 8) + 24, -340948215, false, $$c2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                cArr[intValue2] = hsVar.b;
                cArr3[hsVar.d] = (char) ((((cArr[intValue2] ^ charArray2[hsVar.d]) ^ (d ^ 9010024738234916139L)) ^ ((int) (f3695a ^ 9010024738234916139L))) ^ ((char) (c ^ 9010024738234916139L)));
                hsVar.d++;
                i2 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static final class c extends com.facetec.sdk.po {
        long c;

        c(com.facetec.sdk.qa qaVar) {
            super(qaVar);
        }

        @Override // com.facetec.sdk.po, com.facetec.sdk.qa
        public final void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            super.c(pkVar, j);
            this.c += j;
        }
    }

    static {
        init$0();
        d = 9010024738234916139L;
        f3695a = 1288910299;
        c = (char) 23851;
    }
}
