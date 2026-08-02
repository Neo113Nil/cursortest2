package com.facetec.sdk;

/* loaded from: classes8.dex */
final class aw {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    static java.lang.String f3402a;
    private static java.lang.String b;
    private static java.lang.String c;
    private static com.facetec.sdk.aw d;
    static int e;
    private static char[] f;
    private static final java.lang.String[] g;
    private static java.lang.String j;
    private static boolean k;
    private static boolean l;
    private static int m;
    private static int n;

    /* renamed from: o, reason: collision with root package name */
    private static char[] f3403o;
    private static int q;
    private static int r;
    private static int t;
    private final com.facetec.sdk.ms h = a();
    private android.telephony.TelephonyManager i;

    @java.lang.FunctionalInterface
    interface e {
        void onCompletion(com.facetec.sdk.aw.a aVar, java.lang.String str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, short s2, byte b2) {
        int i;
        int i2;
        int i3 = 122 - s;
        byte[] bArr = $$a;
        int i4 = (s2 * 2) + 4;
        int i5 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 = (-i3) + i4;
            i4 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            int i8 = i4;
            i4 = i3;
            i3 = b3;
            i7 = i2;
            i6 = i8;
            i3 = (-i3) + i4;
            i4 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i2 | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i4));
        int i13 = i4 + i3 + i5 + (513088896 * i6) + ((-1342203445) * i);
        int i14 = i13 * i13;
        int i15 = (((-363642324) * i4) - 614971735) + ((-363641282) * i3) + (i9 * (-1042)) + (i11 * org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE) + (i12 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + ((-363641803) * i5) + ((-2127225984) * i6) + ((-1080704249) * i) + ((-1523187712) * i14);
        if ((i4 * 665020156) + 661520384 + (i3 * 1303681286) + (i9 * (-638661130)) + (i11 * 638661130) + (i12 * 319330565) + (i5 * 984350720) + (i6 * (-771751936)) + (i * 1382285312) + (i14 * (-350355456)) + (i15 * i15 * (-227409920)) == 1) {
            return a(objArr);
        }
        android.content.Context context = (android.content.Context) objArr[0];
        com.facetec.sdk.aw.e eVar = (com.facetec.sdk.aw.e) objArr[1];
        r = (n + 91) % 128;
        c(context).c(context, eVar);
        n = (r + 15) % 128;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{72, 8, -4, 77};
        $$b = 38;
    }

    static /* synthetic */ void d(com.facetec.sdk.aw.e eVar, com.facetec.sdk.aw.a aVar, java.lang.String str) {
        n = (r + 97) % 128;
        e(eVar, aVar, str);
        r = (n + 113) % 128;
    }

    static /* synthetic */ void e(android.content.Context context, java.lang.String str, com.facetec.sdk.aw.e eVar) {
        r = (n + 11) % 128;
        c(context, str, eVar);
        n = (r + 109) % 128;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        t = 0;
        q = 1;
        n = 0;
        r = 1;
        c();
        e = 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        p(true, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{453, 44, 112, 21}, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        p(false, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{497, 44, 0, 6}, objArr2);
        g = new java.lang.String[]{intern, ((java.lang.String) objArr2[0]).intern()};
        q = (t + 101) % 128;
    }

    static com.facetec.sdk.aw c(android.content.Context context) {
        com.facetec.sdk.aw awVar;
        synchronized (com.facetec.sdk.aw.class) {
            if (d == null) {
                d = new com.facetec.sdk.aw(context);
                r = (n + 89) % 128;
            }
            awVar = d;
            n = (r + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        return awVar;
    }

    static void e() {
        synchronized (com.facetec.sdk.aw.class) {
            int i = n + 29;
            r = i % 128;
            if (i % 2 != 0) {
                d = null;
            } else {
                d = null;
                throw null;
            }
        }
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i = n + 61;
        r = i % 128;
        com.facetec.sdk.ms msVar = c(context).h;
        if (i % 2 != 0) {
            return msVar;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private aw(android.content.Context context) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        p(true, null, new int[]{0, 5, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 1}, objArr);
        this.i = (android.telephony.TelephonyManager) context.getSystemService(((java.lang.String) objArr[0]).intern());
        if (j == null) {
            j = com.facetec.sdk.bj.d(context, true);
        }
        if (b == null) {
            b = context.getPackageName();
        }
        if (c == null) {
            c = com.facetec.sdk.ay.e(context);
        }
    }

    private static com.facetec.sdk.ms a() {
        com.facetec.sdk.ms b2;
        synchronized (com.facetec.sdk.aw.class) {
            com.facetec.sdk.me.a aVar = new com.facetec.sdk.me.a();
            for (java.lang.String str : g) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                p(false, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{5, 12, 117, 6}, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                p(false, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{17, 7, 0, 0}, objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(str);
                java.lang.String[] strArr = {sb.toString()};
                if (intern == null) {
                    throw new java.lang.NullPointerException("pattern == null");
                }
                for (int i = 0; i <= 0; i++) {
                    aVar.c.add(new com.facetec.sdk.me.c(intern, strArr[0]));
                }
            }
            com.facetec.sdk.ms.a aVar2 = new com.facetec.sdk.ms.a();
            aVar2.t = aVar.a();
            b2 = aVar2.b();
            com.facetec.sdk.mh m2 = b2.m();
            synchronized (m2) {
                m2.b = 1;
            }
            m2.a();
        }
        return b2;
    }

    static java.lang.String b(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        s(null, null, 127 - (android.view.ViewConfiguration.getTapTimeout() >> 16), "\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        p(true, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{24, 20, 0, 0}, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(b);
        sb.append(intern);
        sb.append(str);
        sb.append(intern);
        sb.append(j);
        sb.append(intern);
        sb.append(android.os.Build.MODEL);
        sb.append(intern);
        sb.append(com.facetec.sdk.FaceTecSDK.version());
        sb.append(intern);
        sb.append(locale.toString());
        sb.append(intern);
        sb.append(locale.getLanguage());
        sb.append(intern);
        sb.append(com.facetec.sdk.cn.b);
        java.lang.String obj = sb.toString();
        n = (r + 3) % 128;
        return obj;
    }

    static java.lang.String e(android.content.Context context) {
        r = (n + 17) % 128;
        java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
        n = (r + 21) % 128;
        return defaultUserAgent;
    }

    private void c(android.content.Context context, final com.facetec.sdk.aw.e eVar) {
        synchronized (this) {
            final android.content.Context applicationContext = context.getApplicationContext();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                p(false, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{44, 44, 0, 31}, objArr);
                this.h.d(com.facetec.sdk.g.a(context, ((java.lang.String) objArr[0]).intern(), java.lang.Boolean.FALSE).a(new com.facetec.sdk.mp.a().c()).c()).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.aw.4
                    public static int b;
                    public static int d;

                    @Override // com.facetec.sdk.mg
                    public final void d(com.facetec.sdk.mw mwVar) throws java.io.IOException {
                        if (mwVar.a()) {
                            com.facetec.sdk.nf b2 = mwVar.b();
                            com.facetec.sdk.aw.e(applicationContext, b2 != null ? b2.a() : "", eVar);
                        } else if (mwVar.e() == 401) {
                            com.facetec.sdk.aw.d(eVar, new com.facetec.sdk.aw.a(false, false), "");
                        } else {
                            com.facetec.sdk.aw.d(eVar, null, mwVar.e);
                        }
                    }

                    @Override // com.facetec.sdk.mg
                    public final void c(java.io.IOException iOException) {
                        com.facetec.sdk.aw.d(eVar, null, iOException.toString());
                    }

                    public static int b() {
                        int i = d;
                        d = i + 1;
                        if (i % 5916999 != 0) {
                            return b;
                        }
                        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                        b = uptimeMillis;
                        return uptimeMillis;
                    }
                });
                int i = n + 99;
                r = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } catch (com.facetec.sdk.g.a e2) {
                e(eVar, (com.facetec.sdk.aw.a) null, e2.toString());
            }
        }
    }

    private static void s(java.lang.String str, int[] iArr, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i2 = $10 + 35;
        $11 = i2 % 128;
        int i3 = 2;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i4 = 0;
        if (str != null) {
            int i5 = $10 + 73;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr = str.toCharArray();
                int i6 = 14 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
        char[] cArr3 = f3403o;
        char c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr3 != null) {
            $10 = ($11 + 1) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 9;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i4] = java.lang.Integer.valueOf(cArr3[i7]);
                        java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                        if (d2 == null) {
                            byte b2 = (byte) i4;
                            d2 = com.facetec.sdk.al.c((char) ('0' - android.text.AndroidCharacter.getMirror(c2)), android.text.TextUtils.indexOf("", "", i4, i4) + 1811, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 23, -1157014744, false, $$c((byte) 57, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[i7])};
                    java.lang.Object d3 = com.facetec.sdk.al.d(484843984);
                    if (d3 == null) {
                        byte b3 = (byte) 0;
                        d3 = com.facetec.sdk.al.c((char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), android.view.View.combineMeasuredStates(0, 0) + 1811, 24 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1157014744, false, $$c((byte) 57, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i4 = 0;
                i3 = 2;
                c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(m)};
        java.lang.Object d4 = com.facetec.sdk.al.d(-1796435875);
        if (d4 == null) {
            byte b4 = (byte) 0;
            d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 661, 22 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 855894693, false, $$c((byte) 56, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue();
        int i9 = 870267758;
        if (l) {
            hnVar.c = bArr2.length;
            char[] cArr5 = new char[hnVar.c];
            hnVar.f3629a = 0;
            $10 = ($11 + 115) % 128;
            while (hnVar.f3629a < hnVar.c) {
                int i10 = $10 + 103;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = hnVar.f3629a;
                    int i12 = hnVar.c;
                    cArr5[i11] = (char) (cArr3[bArr2[hnVar.f3629a] + i] % intValue);
                    java.lang.Object[] objArr5 = {hnVar, hnVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                    if (d5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        d5 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", ""), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1236, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24, -1808776810, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                } else {
                    cArr5[hnVar.f3629a] = (char) (cArr3[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i] - intValue);
                    java.lang.Object[] objArr6 = {hnVar, hnVar};
                    java.lang.Object d6 = com.facetec.sdk.al.d(870267758);
                    if (d6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        d6 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 1236 - (android.os.Process.myTid() >> 22), 25 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1808776810, false, $$c(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d6).invoke(null, objArr6);
                }
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!k) {
            hnVar.c = iArr.length;
            char[] cArr6 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr6[hnVar.f3629a] = (char) (cArr3[iArr[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                hnVar.f3629a++;
                $10 = ($11 + 93) % 128;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        int i13 = $11 + 117;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        hnVar.c = cArr2.length;
        char[] cArr7 = new char[hnVar.c];
        hnVar.f3629a = 0;
        while (hnVar.f3629a < hnVar.c) {
            cArr7[hnVar.f3629a] = (char) (cArr3[cArr2[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
            java.lang.Object[] objArr7 = {hnVar, hnVar};
            java.lang.Object d7 = com.facetec.sdk.al.d(i9);
            if (d7 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                d7 = com.facetec.sdk.al.c((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.KeyEvent.normalizeMetaState(0) + 1236, 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), -1808776810, false, $$c(b9, b10, b10), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d7).invoke(null, objArr7);
            i9 = 870267758;
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        int i15 = $11 + 31;
        $10 = i15 % 128;
        if (i15 % 2 == 0) {
            objArr[0] = str4;
        } else {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0151 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(android.content.Context context, java.lang.String str, com.facetec.sdk.aw.e eVar) {
        boolean z;
        boolean z2;
        int i;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.Object[] objArr;
        java.lang.Object obj = null;
        boolean z3 = false;
        try {
            jSONObject = new org.json.JSONObject(str);
            z = true;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            p(false, "\u0001\u0000\u0001\u0001", new int[]{88, 4, 0, 0}, objArr2);
            jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr2[0]).intern());
            objArr = new java.lang.Object[1];
            p(true, "\u0001\u0000", new int[]{92, 2, 0, 2}, objArr);
        } catch (java.lang.Throwable th) {
            th = th;
            z = false;
        }
        if (jSONObject2.getBoolean(((java.lang.String) objArr[0]).intern())) {
            try {
                if (com.facetec.sdk.bj.c()) {
                    r = (n + 1) % 128;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    p(false, "\u0001\u0001\u0001\u0000", new int[]{94, 4, 0, 3}, objArr3);
                    java.lang.String string = jSONObject2.getString(((java.lang.String) objArr3[0]).intern());
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    s(null, null, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0084\u0083\u0082", objArr4);
                    if (string.equals(((java.lang.String) objArr4[0]).intern())) {
                        com.facetec.sdk.bj.e(new java.lang.Object[0], -1577827314, 1577827315, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
                    } else {
                        n = (r + 103) % 128;
                        com.facetec.sdk.bj.h();
                    }
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                s(null, null, 127 - android.text.TextUtils.getTrimmedLength(""), "\u0085\u0086\u0085\u0082", objArr5);
                com.facetec.sdk.d.b e2 = com.facetec.sdk.d.b.e(jSONObject.getJSONObject(((java.lang.String) objArr5[0]).intern()));
                com.facetec.sdk.d.c(context, e2);
                com.facetec.sdk.bj.f3423a = e2.d;
                f3402a = e2.e;
                z3 = e2.b.booleanValue();
                com.facetec.sdk.bj.d = e2.i.intValue();
                int intValue = e2.f.intValue();
                if (intValue > 0) {
                    int i2 = r + 23;
                    n = i2 % 128;
                    if (i2 % 2 == 0) {
                        com.facetec.sdk.cg.e(context, intValue);
                    } else {
                        com.facetec.sdk.cg.e(context, intValue);
                        throw null;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    com.facetec.sdk.ay.c(th.getMessage());
                    z2 = z3;
                    z3 = z;
                    e(eVar, new com.facetec.sdk.aw.a(z3, z2), "");
                } catch (java.lang.Throwable th3) {
                    try {
                        th3.printStackTrace();
                    } finally {
                        e(eVar, new com.facetec.sdk.aw.a(z, false), "");
                    }
                }
                com.facetec.sdk.t.e(-700200062, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), 700200065, new java.lang.Object[]{context}, com.facetec.sdk.el.e());
                com.facetec.sdk.ap.c(context);
                i = n + 79;
                r = i % 128;
                if (i % 2 != 0) {
                }
            }
            z2 = z3;
            z3 = z;
            e(eVar, new com.facetec.sdk.aw.a(z3, z2), "");
            com.facetec.sdk.t.e(-700200062, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), 700200065, new java.lang.Object[]{context}, com.facetec.sdk.el.e());
            com.facetec.sdk.ap.c(context);
            i = n + 79;
            r = i % 128;
            if (i % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        z2 = false;
        e(eVar, new com.facetec.sdk.aw.a(z3, z2), "");
        com.facetec.sdk.t.e(-700200062, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), 700200065, new java.lang.Object[]{context}, com.facetec.sdk.el.e());
        com.facetec.sdk.ap.c(context);
        i = n + 79;
        r = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.facetec.sdk.aw.e eVar, com.facetec.sdk.aw.a aVar, java.lang.String str) {
        int i = n + 79;
        r = i % 128;
        eVar.onCompletion(aVar, str);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = r + 25;
        n = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void e(final com.facetec.sdk.aw.e eVar, final com.facetec.sdk.aw.a aVar, final java.lang.String str) {
        int i = n;
        r = (i + 39) % 128;
        if (eVar != null) {
            r = (i + 37) % 128;
            android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: com.facetec.sdk.aw$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.aw.c(com.facetec.sdk.aw.e.this, aVar, str);
                }
            });
            n = (r + 99) % 128;
        }
    }

    final void c(final android.content.Context context, com.facetec.sdk.o oVar, final boolean z, final com.facetec.sdk.aw.c cVar) {
        java.lang.String intern;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.facetec.sdk.eo c2 = new com.facetec.sdk.el().d().c();
        com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
        if (oVar.d == com.facetec.sdk.p.FACE_SCAN) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            s(null, null, 126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0083\u0088\u0087\u0085\u0087", objArr);
            epVar.d(((java.lang.String) objArr[0]).intern(), 1);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            p(false, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{137, 14, 0, 0}, objArr2);
            epVar.a(((java.lang.String) objArr2[0]).intern(), oVar.f3697a);
            if (com.facetec.sdk.bj.c()) {
                int i = r + 105;
                n = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    s(null, null, 1739 >> android.text.TextUtils.indexOf((java.lang.CharSequence) "", '|', 0, 0), "\u0089\u0082", objArr3);
                    obj2 = objArr3[0];
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    s(null, null, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0089\u0082", objArr4);
                    obj2 = objArr4[0];
                }
                epVar.a(((java.lang.String) obj2).intern(), com.facetec.sdk.k.c);
            }
            com.facetec.sdk.es a2 = c2.a(oVar.e);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            s(null, null, 127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0086\u008a", objArr5);
            epVar.b(((java.lang.String) objArr5[0]).intern(), a2);
            if (z) {
                com.facetec.sdk.en enVar = new com.facetec.sdk.en();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                p(false, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{151, 13, 0, 0}, objArr6);
                enVar.c(((java.lang.String) objArr6[0]).intern());
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                s(null, null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u008c\u008b\u0085\u0086", objArr7);
                epVar.b(((java.lang.String) objArr7[0]).intern(), enVar);
            }
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            s(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0082\u0093\u008d\u008a\u0092\u008c\u008c\u0083\u0091\u0086\u008d\u0083\u0090\u008f\u008f\u008a\u008e\u008d\u0083", objArr8);
            epVar.a(((java.lang.String) objArr8[0]).intern(), oVar.c);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            s(null, null, 127 - android.text.TextUtils.indexOf("", ""), "\u0082\u0093\u008d\u008a\u0092\u008c\u008c\u0083\u0091\u0087\u0092\u0086\u008c\u008a\u008d\u008b\u0085\u0092\u0082", objArr9);
            epVar.a(((java.lang.String) objArr9[0]).intern(), oVar.i);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            p(false, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 12, 0, 6}, objArr10);
            epVar.a(((java.lang.String) objArr10[0]).intern(), oVar.h);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            s(null, null, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u0082\u0093\u0083\u0087\u0092\u0084\u0083\u0082", objArr11);
            epVar.a(((java.lang.String) objArr11[0]).intern(), j);
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            p(false, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{176, 10, 0, 0}, objArr12);
            epVar.a(((java.lang.String) objArr12[0]).intern(), android.os.Build.MANUFACTURER);
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            s(null, null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u008f\u0083\u0082\u008a\u0094\u0083\u0087\u0092\u0084\u0083\u0082", objArr13);
            epVar.a(((java.lang.String) objArr13[0]).intern(), android.os.Build.MODEL);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            p(true, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{186, 15, 199, 0}, objArr14);
            epVar.a(((java.lang.String) objArr14[0]).intern(), android.os.Build.VERSION.RELEASE);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            p(true, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{201, 12, 0, 9}, objArr15);
            java.lang.String intern2 = ((java.lang.String) objArr15[0]).intern();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            s(null, null, 126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "\u0082\u0092\u008a\u008e\u0082\u008d\u0095", objArr16);
            epVar.a(intern2, ((java.lang.String) objArr16[0]).intern());
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            s(null, null, 127 - android.text.TextUtils.getTrimmedLength(""), "\u0082\u008d\u0085\u008e\u0096\u0083\u0087\u0092\u0084\u0083\u0082", objArr17);
            epVar.a(((java.lang.String) objArr17[0]).intern(), android.os.Build.BRAND);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            s(null, null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u008e\u0083\u0082\u0085\u008a\u008f\u0086\u008a\u008a\u0096\u0083\u0087\u0092\u0084\u0083\u0082", objArr18);
            epVar.a(((java.lang.String) objArr18[0]).intern(), android.os.Build.BOOTLOADER);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            s(null, null, 127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0086\u008d\u0092\u008e\u0089\u008e\u0083\u008b\u008d\u0092\u0097\u0083\u0087\u0092\u0084\u0083\u0082", objArr19);
            epVar.a(((java.lang.String) objArr19[0]).intern(), android.os.Build.FINGERPRINT);
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            s(null, null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u008d\u008a\u0092\u008c\u008e\u0083\u009a\u0099\u0098\u0091\u0083\u0087\u0092\u0084\u0083\u0082", objArr20);
            epVar.d(((java.lang.String) objArr20[0]).intern(), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            p(false, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 13, 0, 5}, objArr21);
            epVar.a(((java.lang.String) objArr21[0]).intern(), b);
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            s(null, null, 128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u008d\u008a\u0092\u008c\u008e\u0083\u009a\u0090\u008a\u008a\u009b", objArr22);
            epVar.a(((java.lang.String) objArr22[0]).intern(), com.facetec.sdk.FaceTecSDK.version());
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            s(null, null, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0082\u0093\u008d\u008a\u0092\u0086\u0085\u0087\u0092\u008f\u0089\u0089\u0085", objArr23);
            epVar.d(((java.lang.String) objArr23[0]).intern(), java.lang.Integer.valueOf(com.facetec.sdk.bj.d));
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            p(false, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{226, 32, 0, 29}, objArr24);
            epVar.a(((java.lang.String) objArr24[0]).intern(), com.facetec.sdk.ai.c);
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            s(null, null, 127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u008c\u0093\u0096\u0095\u0082\u0083\u0086\u008e\u008a\u0089\u0089\u009c\u0091\u0083\u0087\u0092\u0084\u0083\u0082", objArr25);
            epVar.a(((java.lang.String) objArr25[0]).intern(), java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS));
        } else {
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            p(false, "\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{258, 6, 0, 0}, objArr26);
            epVar.d(((java.lang.String) objArr26[0]).intern(), 1);
            if (oVar.d == com.facetec.sdk.p.ID_SCAN_ONLY) {
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                p(true, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, 10, 0, 0}, objArr27);
                epVar.d(((java.lang.String) objArr27[0]).intern(), 1);
                if (oVar.j) {
                    int i2 = r + 25;
                    n = i2 % 128;
                    if (i2 % 2 == 0) {
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        s(null, null, android.text.TextUtils.getTrimmedLength("") + 127, "\u0086\u0092\u008d\u0092\u009d\u008f\u008d\u008a\u008d\u0085\u0087\u008c\u0082\u0092", objArr28);
                        epVar.d(((java.lang.String) objArr28[0]).intern(), 1);
                    } else {
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        s(null, null, 7 / android.text.TextUtils.getTrimmedLength(""), "\u0086\u0092\u008d\u0092\u009d\u008f\u008d\u008a\u008d\u0085\u0087\u008c\u0082\u0092", objArr29);
                        epVar.d(((java.lang.String) objArr29[0]).intern(), 0);
                    }
                }
                oVar.e.add(com.facetec.sdk.cd.c(com.facetec.sdk.as.j));
                com.facetec.sdk.es a3 = c2.a(oVar.e);
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                s(null, null, 127 - android.text.TextUtils.indexOf("", "", 0), "\u0086\u008a", objArr30);
                epVar.b(((java.lang.String) objArr30[0]).intern(), a3);
            } else {
                com.facetec.sdk.en enVar2 = new com.facetec.sdk.en();
                enVar2.c(com.facetec.sdk.cd.c(com.facetec.sdk.as.j));
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                s(null, null, 127 - android.view.KeyEvent.keyCodeFromString(""), "\u0086\u008a", objArr31);
                epVar.b(((java.lang.String) objArr31[0]).intern(), enVar2);
                int i3 = r + 81;
                n = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 5;
                }
            }
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            s(null, null, 127 - android.view.View.combineMeasuredStates(0, 0), "\u008f\u0089\u009b", objArr32);
            epVar.d(((java.lang.String) objArr32[0]).intern(), 1);
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            p(false, "\u0000\u0001\u0001\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 4, 136, 4}, objArr33);
            epVar.a(((java.lang.String) objArr33[0]).intern(), oVar.h);
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            s(null, null, android.graphics.Color.blue(0) + 127, "\u008c\u0082\u0092\u0092\u0082", objArr34);
            epVar.a(((java.lang.String) objArr34[0]).intern(), oVar.g);
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            p(false, "\u0001\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 2, 0, 0}, objArr35);
            epVar.a(((java.lang.String) objArr35[0]).intern(), com.facetec.sdk.bj.e);
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            p(true, "\u0001\u0000", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, 2, 0, 0}, objArr36);
            epVar.a(((java.lang.String) objArr36[0]).intern(), b);
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            s(null, null, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0090\u0082", objArr37);
            epVar.a(((java.lang.String) objArr37[0]).intern(), android.os.Build.MODEL);
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            p(false, "\u0000\u0000", new int[]{282, 2, 0, 0}, objArr38);
            epVar.a(((java.lang.String) objArr38[0]).intern(), com.facetec.sdk.FaceTecSDK.version());
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            s(null, null, 127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0082\u0092\u0092\u0082", objArr39);
            epVar.a(((java.lang.String) objArr39[0]).intern(), java.util.UUID.randomUUID().toString());
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            p(true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 8, 0, 0}, objArr40);
            epVar.a(((java.lang.String) objArr40[0]).intern(), "");
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            s(null, null, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u0092\u0082", objArr41);
            epVar.a(((java.lang.String) objArr41[0]).intern(), j);
        }
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        p(true, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 17, 34, 0}, objArr42);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(((java.lang.String) objArr42[0]).intern(), 0);
        java.lang.Object[] objArr43 = new java.lang.Object[1];
        p(true, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{309, 30, 0, 0}, objArr43);
        java.lang.String string = sharedPreferences.getString(((java.lang.String) objArr43[0]).intern(), null);
        if (string != null) {
            int i5 = n + 83;
            r = i5 % 128;
            if (i5 % 2 == 0) {
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                s(null, null, 86 >>> android.text.TextUtils.lastIndexOf("", (char) 2, 1), "\u008f\u0092\u0085\u0090\u0083", objArr44);
                obj = objArr44[0];
            } else {
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                s(null, null, 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u008f\u0092\u0085\u0090\u0083", objArr45);
                obj = objArr45[0];
            }
            epVar.a(((java.lang.String) obj).intern(), string);
        } else {
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            s(null, null, android.os.Process.getGidForName("") + 128, "\u008f\u0092\u0085\u0090\u0083", objArr46);
            epVar.a(((java.lang.String) objArr46[0]).intern(), "");
        }
        java.lang.String str = oVar.b;
        if (str != null && !str.isEmpty()) {
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            p(false, "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{339, 15, 0, 0}, objArr47);
            epVar.a(((java.lang.String) objArr47[0]).intern(), str);
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            p(true, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", new int[]{354, 53, 0, 20}, objArr48);
            intern = ((java.lang.String) objArr48[0]).intern();
        } else {
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            p(false, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{407, 46, 0, 42}, objArr49);
            intern = ((java.lang.String) objArr49[0]).intern();
        }
        final java.lang.String str2 = intern;
        try {
            try {
                this.h.d(com.facetec.sdk.g.e(context, str2, epVar)).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.aw.1
                    @Override // com.facetec.sdk.mg
                    public final void d(com.facetec.sdk.mw mwVar) throws java.io.IOException {
                        java.lang.String str3;
                        com.facetec.sdk.t.c = true;
                        if (mwVar.e() != 200) {
                            if (mwVar.b() == null) {
                                str3 = "";
                            } else {
                                str3 = mwVar.b().a();
                            }
                            android.content.Context context2 = context;
                            com.facetec.sdk.c cVar2 = com.facetec.sdk.c.DIAGNOSTIC_UPLOAD_ERROR;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("- URL: ");
                            sb.append(str2);
                            sb.append(" - Status code: ");
                            sb.append(mwVar.e());
                            sb.append(" - Response body: ");
                            sb.append(str3);
                            com.facetec.sdk.t.c(context2, cVar2, sb.toString(), (java.lang.Throwable) null);
                        }
                        if (mwVar.a()) {
                            com.facetec.sdk.aw.e++;
                            cVar.b();
                        } else {
                            cVar.d(z);
                        }
                    }

                    @Override // com.facetec.sdk.mg
                    public final void c(java.io.IOException iOException) {
                        android.content.Context context2 = context;
                        com.facetec.sdk.c cVar2 = com.facetec.sdk.c.DIAGNOSTIC_UPLOAD_ERROR;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Diagnostic Upload failed with IOException: ");
                        sb.append(iOException.getMessage());
                        com.facetec.sdk.t.c(context2, cVar2, sb.toString(), iOException);
                        cVar.d(z);
                    }
                });
            } catch (com.facetec.sdk.g.a e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (com.facetec.sdk.g.a e3) {
            e = e3;
        }
    }

    private static void p(boolean z, java.lang.String str, int[] iArr, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        $11 = ($10 + 119) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.facetec.sdk.hj hjVar = new com.facetec.sdk.hj();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = f;
        int i8 = 24;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[0] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object d2 = com.facetec.sdk.al.d(-1287922392);
                    if (d2 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                        int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                        java.lang.Class[] clsArr = new java.lang.Class[i4];
                        clsArr[0] = java.lang.Integer.TYPE;
                        d2 = com.facetec.sdk.al.c(modifierMetaStateMask, 2460 - (edgeSlop >> 16), (keyRepeatTimeout >> 16) + 24, 349480912, false, "c", clsArr);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            hjVar.c = 0;
            char c2 = 0;
            while (hjVar.c < i5) {
                if (bArr2[hjVar.c] == 1) {
                    $10 = ($11 + 89) % 128;
                    int i10 = hjVar.c;
                    char c3 = cArr3[hjVar.c];
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[1] = java.lang.Integer.valueOf(c2);
                    objArr3[i2] = java.lang.Integer.valueOf(c3);
                    java.lang.Object d3 = com.facetec.sdk.al.d(966199657);
                    if (d3 == null) {
                        char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2);
                        byte b2 = (byte) i2;
                        java.lang.String $$c = $$c((byte) i8, b2, b2);
                        java.lang.Class[] clsArr2 = new java.lang.Class[2];
                        clsArr2[i2] = java.lang.Integer.TYPE;
                        clsArr2[1] = java.lang.Integer.TYPE;
                        d3 = com.facetec.sdk.al.c(touchSlop, packedPositionChild + 2055, indexOf + 25, -1636273263, false, $$c, clsArr2);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = hjVar.c;
                    char c4 = cArr3[hjVar.c];
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[1] = java.lang.Integer.valueOf(c2);
                    objArr4[i2] = java.lang.Integer.valueOf(c4);
                    java.lang.Object d4 = com.facetec.sdk.al.d(-1755423365);
                    if (d4 == null) {
                        byte b3 = (byte) i2;
                        d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(i2) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i2) == 0L ? 0 : -1)) + 964, 24 - android.view.View.MeasureSpec.getMode(i2), 816916355, false, $$c((byte) 18, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[hjVar.c];
                java.lang.Object[] objArr5 = {hjVar, hjVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(-1890346561);
                if (d5 == null) {
                    byte b4 = (byte) 0;
                    d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58393), 1763 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - android.graphics.ImageFormat.getBitsPerPixel(0), 683467591, false, $$c((byte) ($$b >>> 1), b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                i2 = 0;
                i8 = 24;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            hjVar.c = i;
            $10 = ($11 + 115) % 128;
            while (hjVar.c < i5) {
                $10 = ($11 + 55) % 128;
                cArr6[hjVar.c] = cArr3[(i5 - hjVar.c) - 1];
                hjVar.c++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            $10 = ($11 + 67) % 128;
            int i13 = 0;
            while (true) {
                hjVar.c = i13;
                if (hjVar.c >= i5) {
                    break;
                }
                cArr3[hjVar.c] = (char) (cArr3[hjVar.c] - iArr[2]);
                i13 = hjVar.c + 1;
            }
        }
        java.lang.String str3 = new java.lang.String(cArr3);
        int i14 = $10 + 3;
        $11 = i14 % 128;
        if (i14 % 2 != 0) {
            objArr[0] = str3;
        } else {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* renamed from: a, reason: collision with root package name */
        public static int f3406a;
        private static int b;
        public static int c;
        private static int f;
        boolean d;
        boolean e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void g(short s, byte b2, byte b3, java.lang.Object[] objArr) {
            int i;
            int i2;
            int i3 = (b2 * 17) + 1;
            int i4 = 101 - (s * 2);
            byte[] bArr = $$a;
            int i5 = 21 - (b3 * 17);
            byte[] bArr2 = new byte[i3];
            if (bArr == null) {
                int i6 = i3;
                i2 = 0;
                i5++;
                i4 = i4 + i6 + 3;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i6 = bArr[i5];
                i5++;
                i4 = i4 + i6 + 3;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i3) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i3) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{33, 2, 62, com.google.common.base.Ascii.ETB, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4};
            $$b = 13;
        }

        public static void c(long j, long j2) {
            int i = f;
            int i2 = i & 29;
            int i3 = i2 + ((i ^ 29) | i2);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                com.facetec.sdk.by.e.class.getField("c").get(null);
                throw null;
            }
            java.lang.Object obj = com.facetec.sdk.by.e.class.getField("c").get(null);
            int i4 = b;
            int i5 = ((((i4 | 86) << 1) - (i4 ^ 86)) - 1) % 128;
            f = i5;
            int i6 = i5 | 55;
            int i7 = i6 << 1;
            int i8 = -(i6 & (~(i5 & 55)));
            b = ((i7 & i8) + (i8 | i7)) % 128;
            try {
                byte[] bArr = $$a;
                byte b2 = (byte) (-bArr[9]);
                byte b3 = b2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                g(b2, b3, b3, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                byte b4 = (byte) (bArr[9] + 1);
                byte b5 = b4;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                g(b4, b5, b5, objArr2);
                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                method.setAccessible(true);
                method.invoke(null, null, obj);
                b = (f + 101) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        a(boolean z, boolean z2) {
            this.e = z;
            this.d = z2;
        }

        public static int b() {
            int i = c;
            c = i + 1;
            if (i % 6012675 != 0) {
                return f3406a;
            }
            int myPid = android.os.Process.myPid();
            f3406a = myPid;
            return myPid;
        }

        static {
            init$0();
            b = 0;
            f = 1;
        }
    }

    static abstract class c {
        void b() {
        }

        void d(boolean z) {
        }

        c() {
        }
    }

    static void c() {
        char[] cArr = new char[541];
        java.nio.ByteBuffer.wrap("¹\u009c¹\u0089¹\u0092¹\u0093¹\u0094¸ð¸g¸D¸9¸Z¸g¸l¸m¸`¸g¸X¸d¸½¸é¸à¸Í¸·¸±¸¶¸º¸ô¸â¸è¸ô¸ï¸í¸ã¸ê¸÷¸ã¸ï¸ó¸ë¸à¸è¸è¸à¸æ¸ç¸³¸ë¸ê¸ã¸ï¸ð¸ê¸Ï¸Ì¸í¸ê¸Ê¸Ì¸ì¸è¸È¸Ö¸×¸´¸Ð¸ð¸ë¸ê¸Ê¸Õ¸è¸è¸÷¸ê¸è¸ê¸ï¸ê¸ð¸ö¸õ¸Ò¸°¸«¸Ì¸ì¸è¸Ï¸Ð¸²¸í¸è¸î¸±¸é¸³¸í¸à¸í¸\u0094¸¤¸Ç¸è¸ô¸ê¸ë¸õ¸è¸ï¸Í¸Ã¸í¸ì¸é¸õ¸Î¸Ì¸ô¸ì¸Ä¸Æ¸è¸î¸æ¸â¸î¸â¸ï¸Ï¸Î¸õ¸ê¸Ã¸Æ¸ì¸ô¸ö¸Ý¸½¸è¸è¸÷¸ê¸è¸ê¸Û¸Ü¸é¸ö¸é¸ì¸æ¸³¸î¸â¸í¸î¸ï¸í¸Ù¸æ¸ê¸é¸ì¸æ¸½¸÷¸ê¸â¸Ò¸Ò¸à¸â¸á¸à¸î¸ê¸¶¸à¸é¸ë¸â¸à¸Ý¸Ó¸ã¸í¸\u001e¹±¹·¹±¹½¹¶¹ ¹¯¹¬¹¥¹¯¹©¹²¹°¹¯¸®¸ç¸å¸Þ¸à¸â¸ë¸é¸à¸à¸î¸ð¸µ¸ã¸â¸à¸â¸à¸ã¸î¸ã¸í¸õ¸æ¸Ü¸°¸â¸è¸÷¸Þ¸ß¸ï¸á¸î¸â¸å¸ã¸ì¸Ð¸Ö¸ã¸í¸ï¸í¸Ý¸ß¸è¸õ¸é¸ô¸ð¸ê¸è¸ê¸ï¸ì¸ì¸°¸â¸ï¸ï¸æ¸ã¸¸¸ö¸é¸ê¸ê¸ã¸æ¸ï¸ï¸â¸ò¸j¸}¸z¸´¸à¸·¸à¸¹¸ü¸´¸î¸î¸æ¸æ¸î¸è¸í¸Î¸\n¸\u0003¸\t¸\u0017¸õ¸ê¸\r¸\t¸ö¸î¸\u0002¸\n¸\n¸\u0002¸\u0000¸\u0001¸²¸î¸á¸ã¸í¸Í¸Ë¸ï¸è¸ð¸Õ¸Ö¸×¸Ô¸è¸á¸ï¸õ¸Ë¸È¸ã¸ï¸Ô¸Ì¸à¸è¸è¸à¸æ¸ç¸¶¸ï¸ö¸ô¸ô¸Ø¸Ø¸ô¸ê¸Ü¸Ð¸é¸ë¸â¸à¸¾¸ï¸ã¸ê¸ë¸ð¸Ð¸Í¸â¸á¸æ¸æ¸Í¸«¸°¸Ò¸õ¸ö¸ð¸ê¸é¸ô¸ô¸ö¸ß¸Ø¸ï¸â¸ê¸÷¸õ¸ê¸î¸à¸á¸â¸Í¸Ê¸ê¸ë¸ð¸Ð¸´¸µ¸¶¸·¸³¸×¸ê¸í¸Ì¸Ï¸ê¸½¸Ò¸°¸«¸Ì¸ì¸è¸Ï¸Ð¸ð¸ë¸ê¸ã¸ï¸ð¸ê¸Ï¸Ì¸í¸ê¸Ê¸Ì¸ì¸è¸È¸Ö¸×¸«¸«¸´¸Ð¸ð¸ë¸ê¸Ê¸Õ¸è¸è¸÷¸ê¸è¸ê¸ï¸ê¸ð¸ö¸Þ¸J¸@¸ ¸4¸I¸@¸&¸*¸I¸U¸E¸3¸(¸3¸G¸9¸D¸3¸G¸_¸F¸=¸;¸5¸\"¸*¸3¸2¸T¸I¸A¸9¸.¸9¸C¸3¸*¸1¸:¸;¸=¸*¸.¸¬¸ä¸ê¸ä¸Î¸»¸Ó¸à¸Õ¸Ö¸á¸Û¸Ï¸Õ¸×¸Ö¸Ñ¸×¸Ç¸¹¸Á¸Ø¸Ò¸Ë¸Ø¸Í¸Ó¸ä¸Ø¸Ü¸Ý¸ë¸ö¸é¸Õ¸¶¸Â¸â¸Þ¸Ì¸Û¸Ú¸Ø¸Ë".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 541);
        f = cArr;
        f3403o = new char[]{5826, 5882, 5883, 5832, 5887, 5834, 5885, 5878, 5838, 5873, 5881, 5837, 5872, 5836, 5874, 5875, 5869, 5879, 5911, 5907, 5919, 5916, 5912, 5914, 5909, 5864, 5828, 5835, 5831};
        m = -1919674530;
        k = true;
        l = true;
    }

    static void e(android.content.Context context, com.facetec.sdk.aw.e eVar) {
        b(new java.lang.Object[]{context, eVar}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), 232603451, -232603451, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b());
    }

    static com.facetec.sdk.ms b(android.content.Context context) {
        return (com.facetec.sdk.ms) b(new java.lang.Object[]{context}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), -1657118186, 1657118187, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b());
    }
}
