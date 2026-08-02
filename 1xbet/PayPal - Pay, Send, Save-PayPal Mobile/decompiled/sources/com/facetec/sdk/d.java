package com.facetec.sdk;

/* loaded from: classes8.dex */
final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] b;
    private static com.facetec.sdk.d c;
    private static com.facetec.sdk.d.a e;
    private static /* synthetic */ boolean f;
    private static int g;
    private static int h;
    private static java.lang.Object i;
    private static char[] j;
    private static int m;
    private static int n;

    /* renamed from: a, reason: collision with root package name */
    private com.facetec.sdk.d.b f3488a;
    private com.facetec.sdk.ab d;

    enum a {
        Old,
        New
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, short s2, short s3) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s3 * 4) + 1;
        int i5 = s + 4;
        int i6 = s2 + 98;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            i5++;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i7 = bArr[i5];
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            i5++;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            i5++;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{34, com.visa.cbp.getEncExpo.registerForActivityResult, 8, 97};
        $$b = 131;
    }

    private d(android.content.Context context) {
        this.f3488a = new com.facetec.sdk.d.b();
        this.d = new com.facetec.sdk.ab(context);
        try {
            java.lang.Object[] objArr = {context, g(context), h(context)};
            int d = com.facetec.sdk.gh.b.d();
            int d2 = com.facetec.sdk.gh.b.d();
            byte[] bArr = (byte[]) com.facetec.sdk.bm.c(objArr, com.facetec.sdk.gh.b.d(), 1741551005, com.facetec.sdk.gh.b.d(), -1741551003, d, d2);
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            k(false, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{0, 8, 0, 0}, objArr2);
            java.lang.String optString = jSONObject.optString(((java.lang.String) objArr2[0]).intern(), "");
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            k(false, "\u0001\u0001\u0000\u0000\u0000", new int[]{8, 5, 0, 0}, objArr3);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(((java.lang.String) objArr3[0]).intern());
            if (!optString.isEmpty()) {
                this.f3488a = com.facetec.sdk.d.b.e(new org.json.JSONObject(optString));
            }
            if (optJSONObject != null) {
                this.d = com.facetec.sdk.ab.e(context, optJSONObject.toString());
            }
        } catch (java.io.FileNotFoundException unused) {
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.n.b(e2);
        }
    }

    private static com.facetec.sdk.d a(android.content.Context context) {
        com.facetec.sdk.d dVar;
        synchronized (com.facetec.sdk.d.class) {
            h = (g + 41) % 128;
            if (c == null) {
                c = new com.facetec.sdk.d(context);
                int i2 = h + 119;
                g = i2 % 128;
                int i3 = i2 % 2;
            }
            dVar = c;
        }
        return dVar;
    }

    private static com.facetec.sdk.d.b c() {
        com.facetec.sdk.d.b bVar;
        synchronized (com.facetec.sdk.d.class) {
            int i2 = h;
            g = (i2 + 95) % 128;
            com.facetec.sdk.d dVar = c;
            if (dVar == null) {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    k(true, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{13, 16, 88, 0}, objArr);
                    throw new java.lang.RuntimeException(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Exception e2) {
                    com.facetec.sdk.n.b(e2);
                    return new com.facetec.sdk.d.b();
                }
            }
            int i3 = i2 + 109;
            g = i3 % 128;
            if (i3 % 2 != 0) {
                bVar = dVar.f3488a;
                int i4 = 67 / 0;
            } else {
                bVar = dVar.f3488a;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    static com.facetec.sdk.ab e(android.content.Context context) {
        com.facetec.sdk.ab abVar;
        synchronized (com.facetec.sdk.d.class) {
            int i2 = g + 3;
            h = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    abVar = a(context).d;
                    int i3 = 6 / 0;
                } else {
                    abVar = a(context).d;
                }
                context = (h + 41) % 128;
                g = context;
            } catch (java.lang.Exception unused) {
                return new com.facetec.sdk.ab(context);
            }
        }
        return abVar;
    }

    static com.facetec.sdk.d.a d(android.content.Context context) {
        com.facetec.sdk.d.a aVar;
        synchronized (com.facetec.sdk.d.class) {
            int i2 = g + 73;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                f(context);
                h = (g + 101) % 128;
                aVar = e;
            } else {
                f(context);
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return aVar;
    }

    static void c(android.content.Context context, com.facetec.sdk.ab abVar) {
        synchronized (com.facetec.sdk.d.class) {
            int i2 = g + 55;
            h = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    com.facetec.sdk.d a2 = a(context);
                    a2.d = abVar;
                    a2.b(context);
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                com.facetec.sdk.d a3 = a(context);
                a3.d = abVar;
                a3.b(context);
            } catch (java.lang.Exception e2) {
                com.facetec.sdk.n.b(e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (com.facetec.sdk.d.f == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (com.facetec.sdk.d.f == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (java.lang.Thread.currentThread().equals(android.os.Looper.getMainLooper().getThread()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(android.content.Context context) throws java.lang.Exception {
        int i2 = g + 113;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        c = this;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String c2 = this.f3488a.c();
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(false, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{0, 8, 0, 0}, objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), c2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        k(false, "\u0001\u0001\u0000\u0000\u0000", new int[]{8, 5, 0, 0}, objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), this.d.e());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        k(false, "\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{29, 6, 174, 6}, objArr3);
        jSONObject.put(((java.lang.String) objArr3[0]).intern(), com.facetec.sdk.ay.a(16, 32));
        com.facetec.sdk.bm.d(context, g(context), h(context), jSONObject.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
        h = (g + 73) % 128;
    }

    private static byte[] f(android.content.Context context) throws java.lang.Exception {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(false, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{35, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, objArr);
        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        k(false, "\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{45, 10, 171, 2}, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        java.lang.String c2 = com.facetec.sdk.bn.c(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(string);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        k(false, "\u0000\u0000\u0001\u0000", new int[]{55, 4, 3, 0}, objArr3);
        sb2.append(((java.lang.String) objArr3[0]).intern());
        java.lang.String c3 = com.facetec.sdk.bn.c(sb2.toString());
        try {
            byte[] a2 = com.facetec.sdk.bm.a(context, c2);
            if (a2.length > 0) {
                h = (g + 85) % 128;
                try {
                    e = com.facetec.sdk.d.a.values()[com.facetec.sdk.bm.c(context, c3)];
                    h = (g + 9) % 128;
                } catch (java.lang.Exception unused) {
                }
                return a2;
            }
        } catch (java.io.FileNotFoundException unused2) {
        }
        byte[] d = com.facetec.sdk.ay.d(32, 128);
        com.facetec.sdk.bm.e(context, c2, d);
        com.facetec.sdk.d.a aVar = com.facetec.sdk.d.a.New;
        e = aVar;
        com.facetec.sdk.bm.b(context, c3, (byte) aVar.ordinal());
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0248 -> B:60:0x026c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x025c -> B:60:0x026c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(boolean z, java.lang.String str, int[] iArr, java.lang.Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.facetec.sdk.hj hjVar = new com.facetec.sdk.hj();
        int i2 = 0;
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = j;
        long j2 = 0;
        if (cArr3 != null) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i8])};
                    java.lang.Object d = com.facetec.sdk.al.d(-1287922392);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) android.widget.ExpandableListView.getPackedPositionGroup(j2), 2460 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 25 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 349480912, false, "c", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    i8++;
                    j2 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            char[] cArr5 = new char[i4];
            hjVar.c = 0;
            int i9 = $10 + 121;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char c2 = 0;
            while (hjVar.c < i4) {
                if (bArr2[hjVar.c] == b2) {
                    int i11 = hjVar.c;
                    char c3 = cArr4[hjVar.c];
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[b2] = java.lang.Integer.valueOf(c2);
                    objArr3[i2] = java.lang.Integer.valueOf(c3);
                    java.lang.Object d2 = com.facetec.sdk.al.d(966199657);
                    if (d2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        d2 = com.facetec.sdk.al.c((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 2055 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 24 - android.text.TextUtils.getCapsMode("", i2, i2), -1636273263, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = hjVar.c;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[hjVar.c]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(-1755423365);
                    if (d3 == null) {
                        byte b5 = (byte) (-1);
                        d3 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 964 - android.text.TextUtils.indexOf("", "", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 25, 816916355, false, $$c(b5, (byte) (b5 & 6), (byte) 0), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr5[i12] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[hjVar.c];
                java.lang.Object[] objArr5 = {hjVar, hjVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1890346561);
                if (d4 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 & 5);
                    d4 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58393), 1764 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 24, 683467591, false, $$c(b6, b7, (byte) (b7 - 5)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
                i2 = 0;
                b2 = 1;
            }
            int i13 = $10 + 105;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i15 = i4 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i15, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i15);
        }
        if (z) {
            int i16 = $11 + 121;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 1;
                char[] cArr7 = cArr4;
                cArr4 = new char[i4];
                cArr = cArr7;
                hjVar.c = i17;
                if (hjVar.c < i4) {
                    int i18 = $11 + 25;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr4[hjVar.c] = cArr[(i4 << hjVar.c) % 1];
                        i17 = hjVar.c % 0;
                    } else {
                        cArr4[hjVar.c] = cArr[(i4 - hjVar.c) - 1];
                        i17 = hjVar.c + 1;
                    }
                    hjVar.c = i17;
                    if (hjVar.c < i4) {
                    }
                }
            } else {
                hjVar.c = 0;
                char[] cArr8 = cArr4;
                cArr4 = new char[i4];
                cArr = cArr8;
                if (hjVar.c < i4) {
                }
            }
        }
        if (i5 > 0) {
            $11 = ($10 + 113) % 128;
            int i19 = 0;
            while (true) {
                hjVar.c = i19;
                if (hjVar.c >= i4) {
                    break;
                }
                cArr4[hjVar.c] = (char) (cArr4[hjVar.c] - iArr[2]);
                i19 = hjVar.c + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        m = 0;
        n = 1;
        g = 0;
        h = 1;
        e();
        int i2 = m;
        n = (i2 + 61) % 128;
        int i3 = i2 + 81;
        n = i3 % 128;
        int i4 = i3 % 2;
        f = true;
        b = null;
        c = null;
        e = com.facetec.sdk.d.a.Old;
        i = new java.lang.Object();
    }

    static byte[] c(android.content.Context context) throws java.lang.Exception {
        synchronized (i) {
            if (b == null) {
                b = f(context);
            }
        }
        return com.facetec.sdk.bn.b(b);
    }

    static void c(android.content.Context context, com.facetec.sdk.d.b bVar) {
        synchronized (com.facetec.sdk.d.class) {
            int i2 = h + 13;
            g = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    com.facetec.sdk.d a2 = a(context);
                    a2.f3488a = bVar;
                    a2.b(context);
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                com.facetec.sdk.d a3 = a(context);
                a3.f3488a = bVar;
                a3.b(context);
                g = (h + 97) % 128;
            } catch (java.lang.Exception e2) {
                com.facetec.sdk.n.b(e2);
            }
        }
    }

    static boolean a() {
        int i2 = g + 37;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            if (!com.facetec.sdk.bd.f) {
                return c().f3490a.booleanValue();
            }
            int i3 = h + 115;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        boolean z = com.facetec.sdk.bd.f;
        throw null;
    }

    static int d() {
        h = (g + 63) % 128;
        int intValue = c().c.intValue();
        g = (h + 115) % 128;
        return intValue;
    }

    private static java.lang.String g(android.content.Context context) throws java.lang.Exception {
        g = (h + 115) % 128;
        byte[] c2 = c(context);
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(true, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{59, 13, 0, 0}, objArr);
        java.lang.String b2 = com.facetec.sdk.bn.b(c2, ((java.lang.String) objArr[0]).intern());
        int i2 = g + 35;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return b2;
    }

    private static byte[] h(android.content.Context context) throws java.lang.Exception {
        g = (h + 79) % 128;
        byte[] c2 = c(context);
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(false, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{72, 14, 147, 9}, objArr);
        byte[] d = com.facetec.sdk.bn.d(c2, ((java.lang.String) objArr[0]).intern());
        int i2 = g + 93;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            return d;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class b {
        java.lang.String d;
        java.lang.String e;
        java.lang.Integer f;
        java.lang.Integer i;

        /* renamed from: a, reason: collision with root package name */
        java.lang.Boolean f3490a = java.lang.Boolean.FALSE;
        java.lang.Integer c = 10;
        java.lang.Boolean b = java.lang.Boolean.FALSE;
        private java.lang.Boolean h = java.lang.Boolean.TRUE;

        b() {
        }

        enum c {
            ID("id"),
            APP_SEND_DIAGNOSTICS("sd"),
            DIAGNOSTICS_SIZE("ds"),
            CACHE_KEY("ck"),
            IS_VERSION_DEPRECATED("vd"),
            RECENT_FAILURES("rf"),
            APPLICATION_ID("ai"),
            IS_LATEST_VERSION("lv");

            final java.lang.String f;

            c(java.lang.String str) {
                this.f = str;
            }
        }

        static com.facetec.sdk.d.b e(org.json.JSONObject jSONObject) throws org.json.JSONException {
            com.facetec.sdk.d.b bVar = new com.facetec.sdk.d.b();
            for (com.facetec.sdk.d.b.c cVar : com.facetec.sdk.d.b.c.values()) {
                switch (com.facetec.sdk.d.AnonymousClass3.b[cVar.ordinal()]) {
                    case 1:
                        bVar.d = jSONObject.getString(cVar.f);
                        break;
                    case 2:
                        bVar.f3490a = java.lang.Boolean.valueOf(jSONObject.getBoolean(cVar.f));
                        break;
                    case 3:
                        bVar.c = java.lang.Integer.valueOf(jSONObject.getInt(cVar.f));
                        break;
                    case 4:
                        bVar.e = jSONObject.getString(cVar.f);
                        break;
                    case 5:
                        bVar.b = java.lang.Boolean.valueOf(jSONObject.getBoolean(cVar.f));
                        break;
                    case 6:
                        bVar.f = java.lang.Integer.valueOf(jSONObject.getInt(cVar.f));
                        break;
                    case 7:
                        bVar.i = java.lang.Integer.valueOf(jSONObject.getInt(cVar.f));
                        break;
                    case 8:
                        bVar.h = java.lang.Boolean.valueOf(jSONObject.getBoolean(cVar.f));
                        break;
                }
            }
            return bVar;
        }

        final java.lang.String c() {
            int i;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
            for (com.facetec.sdk.d.b.c cVar : com.facetec.sdk.d.b.c.values()) {
                switch (com.facetec.sdk.d.AnonymousClass3.b[cVar.ordinal()]) {
                    case 1:
                        jSONObject.put(cVar.f, this.d);
                        continue;
                    case 2:
                        jSONObject.put(cVar.f, this.f3490a);
                        continue;
                    case 3:
                        jSONObject.put(cVar.f, this.c);
                        continue;
                    case 4:
                        jSONObject.put(cVar.f, this.e);
                        continue;
                    case 5:
                        jSONObject.put(cVar.f, this.b);
                        continue;
                    case 6:
                        jSONObject.put(cVar.f, this.f);
                        continue;
                    case 7:
                        jSONObject.put(cVar.f, this.i);
                        continue;
                    case 8:
                        jSONObject.put(cVar.f, this.h);
                        continue;
                    default:
                        continue;
                }
                e.printStackTrace();
                return jSONObject.toString();
            }
            return jSONObject.toString();
        }
    }

    /* renamed from: com.facetec.sdk.d$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.facetec.sdk.d.b.c.values().length];
            b = iArr;
            try {
                iArr[com.facetec.sdk.d.b.c.ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.facetec.sdk.d.b.c.APP_SEND_DIAGNOSTICS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.facetec.sdk.d.b.c.DIAGNOSTICS_SIZE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.facetec.sdk.d.b.c.CACHE_KEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                b[com.facetec.sdk.d.b.c.IS_VERSION_DEPRECATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                b[com.facetec.sdk.d.b.c.RECENT_FAILURES.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                b[com.facetec.sdk.d.b.c.APPLICATION_ID.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                b[com.facetec.sdk.d.b.c.IS_LATEST_VERSION.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    static void e() {
        j = new char[]{47293, 47336, 47336, 47344, 47338, 47343, 47342, 47337, 47293, 47336, 47337, 47337, 47329, 47323, 47174, 47175, 47170, 47183, 47170, 47175, 47130, 47141, 47169, 47174, 47175, 47170, 47176, 47168, 47152, 47124, 47507, 47505, 47507, 47507, 47512, 47346, 47222, 47216, 47218, 47231, 47219, 47221, 47208, 47211, 47221, 47115, 47507, 47498, 47511, 47519, 47510, 47510, 47507, 47516, 47504, 47282, 47336, 47341, 47348, 47261, 47296, 47327, 47342, 47342, 47318, 47326, 47348, 47324, 47315, 47338, 47339, 47328, 47109, 47495, 47209, 47201, 47225, 47225, 47213, 47215, 47494, 47224, 47219, 47494, 47493, 47214};
    }
}
