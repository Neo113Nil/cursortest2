package com.facetec.sdk;

/* loaded from: classes8.dex */
final class cg {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    static boolean f3462a;
    private static java.lang.String b;
    private static java.lang.String c;
    private static boolean d;
    private static boolean e;
    private static java.util.LinkedList<java.lang.Long> f;
    private static boolean g;
    private static int h;
    private static long i;
    private static long j;
    private static int k;
    private static int l;
    private static int n;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i2, short s, byte b2) {
        int i3;
        int i4;
        int i5;
        int i6 = s + 4;
        byte[] bArr = $$a;
        int i7 = 1 - (i2 * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i5 = 0;
            int i10 = i6 + i8;
            i4 = i5;
            int i11 = i9;
            i3 = i10;
            i6 = i11;
            int i12 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i3;
            if (i5 == i7) {
                return new java.lang.String(bArr2, 0);
            }
            i8 = bArr[i12];
            int i13 = i3;
            i9 = i12;
            i6 = i13;
            int i102 = i6 + i8;
            i4 = i5;
            int i112 = i9;
            i3 = i102;
            i6 = i112;
            int i122 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i3;
            if (i5 == i7) {
            }
        } else {
            i3 = 120 - b2;
            i4 = 0;
            int i1222 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i3;
            if (i5 == i7) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b9, code lost:
    
        if (com.facetec.sdk.cg.j != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f6, code lost:
    
        return 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00df, code lost:
    
        r7 = com.facetec.sdk.cg.j;
        com.facetec.sdk.cg.h = (com.facetec.sdk.cg.n + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f1, code lost:
    
        return java.lang.Long.valueOf(r7 + 300000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        if (com.facetec.sdk.cg.j != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object a(int i2, int i3, int i4, int i5, int i6, java.lang.Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~(i8 | i2);
        int i10 = ~i2;
        int i11 = ~((~i5) | i2);
        int i12 = (~(i10 | i4)) | i11;
        int i13 = i11 | (~(i8 | i10));
        int i14 = i2 + i4 + i7 + ((-1232316077) * i3) + ((-263306238) * i6);
        int i15 = i14 * i14;
        int i16 = (((-2046307327) * i2) - 1888090795) + ((-2046308995) * i4) + (i9 * 1112) + (i12 * (-556)) + (i13 * 556) + ((-2046307883) * i7) + (1526207759 * i3) + ((-1095616598) * i6) + (1719271424 * i15);
        int i17 = ((i2 * (-69115011)) - 1785593856) + (i4 * 933837065) + (i9 * 763021048) + (i12 * 1765973124) + (i13 * (-1765973124)) + (i7 * 1696858112) + (i3 * 1319895040) + (i6 * 1514668032) + (i15 * 1334968320) + (i16 * i16 * 2111700992);
        if (i17 != 1) {
            return i17 != 2 ? b(objArr) : d(objArr);
        }
        android.content.Context context = (android.content.Context) objArr[0];
        int i18 = h + 107;
        n = i18 % 128;
        if (i18 % 2 == 0) {
            a(634466043, com.facetec.sdk.fl.AnonymousClass10.a(), -634466043, com.facetec.sdk.fl.AnonymousClass10.a(), com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, com.facetec.sdk.fl.AnonymousClass10.a());
        } else {
            a(634466043, com.facetec.sdk.fl.AnonymousClass10.a(), -634466043, com.facetec.sdk.fl.AnonymousClass10.a(), com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, com.facetec.sdk.fl.AnonymousClass10.a());
        }
    }

    static void init$0() {
        $$a = new byte[]{93, 115, -44, -107};
        $$b = 201;
    }

    cg() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        k = 0;
        l = 1;
        h = 0;
        n = 1;
        d();
        c = "";
        d = false;
        e = false;
        b = "";
        f3462a = false;
        k = (l + 19) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r33 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0015, code lost:
    
        r0 = r33.toCharArray();
        com.facetec.sdk.cg.$10 = (com.facetec.sdk.cg.$11 + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0013, code lost:
    
        if (r33 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] charArray;
        int i3 = $10 + 87;
        $11 = i3 % 128;
        int i4 = 2;
        if (i3 % 2 == 0) {
            int i5 = 14 / 0;
        }
        char[] cArr = charArray;
        com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
        hvVar.d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        hvVar.c = 0;
        while (hvVar.c < cArr.length) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = hvVar.c;
                char c2 = cArr[hvVar.c];
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[3];
                    objArr2[i4] = hvVar;
                    objArr2[1] = hvVar;
                    objArr2[0] = java.lang.Integer.valueOf(c2);
                    java.lang.Object d2 = com.facetec.sdk.al.d(-1009843105);
                    if (d2 == null) {
                        char offsetBefore = (char) (android.text.TextUtils.getOffsetBefore("", 0) + 33463);
                        int indexOf = android.text.TextUtils.indexOf("", "", 0);
                        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        java.lang.String $$c = $$c(b2, b3, (byte) (b3 + 1));
                        java.lang.Class[] clsArr = new java.lang.Class[3];
                        clsArr[0] = java.lang.Integer.TYPE;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[i4] = java.lang.Object.class;
                        d2 = com.facetec.sdk.al.c(offsetBefore, indexOf + 479, (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 23, 1679851175, false, $$c, clsArr);
                    }
                    jArr[i7] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue() | (i % 2966223176042272838L);
                    java.lang.Object[] objArr3 = {hvVar, hvVar};
                    java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
                    if (d3 == null) {
                        char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        java.lang.String $$c2 = $$c(b4, b5, (byte) (-b5));
                        java.lang.Class[] clsArr2 = new java.lang.Class[i4];
                        clsArr2[0] = java.lang.Object.class;
                        clsArr2[1] = java.lang.Object.class;
                        d3 = com.facetec.sdk.al.c(keyRepeatTimeout, 592 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 23, -1570895912, false, $$c2, clsArr2);
                    }
                    ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = hvVar.c;
                char c3 = cArr[hvVar.c];
                java.lang.Object[] objArr4 = new java.lang.Object[3];
                objArr4[i4] = hvVar;
                objArr4[1] = hvVar;
                objArr4[0] = java.lang.Integer.valueOf(c3);
                java.lang.Object d4 = com.facetec.sdk.al.d(-1009843105);
                if (d4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    d4 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33462), 479 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, 1679851175, false, $$c(b6, b7, (byte) (b7 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i8] = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).longValue() ^ (i ^ 2966223176042272838L);
                java.lang.Object[] objArr5 = {hvVar, hvVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(95517984);
                if (d5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    d5 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 592 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24 - android.text.TextUtils.indexOf("", "", 0), -1570895912, false, $$c(b8, b9, (byte) (-b9)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                i4 = 2;
            }
        }
        char[] cArr2 = new char[length];
        hvVar.c = 0;
        while (hvVar.c < cArr.length) {
            cArr2[hvVar.c] = (char) jArr[hvVar.c];
            java.lang.Object[] objArr6 = {hvVar, hvVar};
            java.lang.Object d6 = com.facetec.sdk.al.d(95517984);
            if (d6 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 - 1);
                d6 = com.facetec.sdk.al.c((char) android.view.KeyEvent.getDeadChar(0, 0), 591 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 24 - android.view.KeyEvent.getDeadChar(0, 0), -1570895912, false, $$c(b10, b11, (byte) (-b11)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d6).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (com.facetec.sdk.cg.d != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (com.facetec.sdk.cg.d != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        com.facetec.sdk.cg.f = new java.util.LinkedList<>();
        com.facetec.sdk.cg.j = 0;
        com.facetec.sdk.cg.g = false;
        com.facetec.sdk.cg.c = r8.getPackageName();
        com.facetec.sdk.cg.b = android.provider.Settings.Secure.getString(r8.getContentResolver(), a.b.l);
        r4 = com.facetec.sdk.fl.AnonymousClass10.a();
        r7 = com.facetec.sdk.fl.AnonymousClass10.a();
        com.facetec.sdk.cg.e = ((java.lang.Boolean) a(692831660, com.facetec.sdk.fl.AnonymousClass10.a(), -692831658, r4, com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{r8}, r7)).booleanValue();
        com.facetec.sdk.cg.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        com.facetec.sdk.cg.n = (r0 + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void c(android.content.Context context) {
        int i2 = h;
        int i3 = i2 + 101;
        n = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
    }

    static void a(android.content.Context context) {
        int i2 = n + 43;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (d) {
            f.add(java.lang.Long.valueOf(new java.util.Date().getTime()));
            h(context);
            n = (h + 97) % 128;
        }
    }

    static void d(android.content.Context context) {
        int i2 = n;
        int i3 = i2 + 83;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            if (d) {
                if (!f.isEmpty()) {
                    n = (h + 19) % 128;
                    f.removeLast();
                }
                a(context);
                return;
            }
            h = (i2 + 29) % 128;
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void e(android.content.Context context) {
        int i2 = h;
        int i3 = i2 + 33;
        n = i3 % 128;
        if (i3 % 2 != 0) {
            if (!g) {
                int i4 = i2 + 9;
                n = i4 % 128;
                g = i4 % 2 != 0;
                while (f.size() > 3) {
                    f.removeFirst();
                }
                h(context);
            }
            n = (h + 73) % 128;
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void e(android.content.Context context, int i2) {
        int i3 = n + 79;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            if (e || i2 <= 0) {
                return;
            }
            long time = new java.util.Date().getTime();
            int i4 = 0;
            while (i4 < i2) {
                f.add(java.lang.Long.valueOf(time));
                i4++;
                h = (n + 23) % 128;
            }
            h(context);
            return;
        }
        throw null;
    }

    static void b(android.content.Context context) {
        int i2 = h + 109;
        n = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            if (d) {
                if (!f.isEmpty()) {
                    f.removeLast();
                    h(context);
                }
                int i3 = n + 105;
                h = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    static boolean f(android.content.Context context) {
        if (!com.facetec.sdk.bd.d) {
            long longValue = ((java.lang.Long) a(56797156, com.facetec.sdk.fl.AnonymousClass10.a(), -56797155, com.facetec.sdk.fl.AnonymousClass10.a(), com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, com.facetec.sdk.fl.AnonymousClass10.a())).longValue();
            if (longValue > 0) {
                return new java.util.Date().getTime() < longValue;
            }
            h = (n + 97) % 128;
        } else {
            n = (h + 99) % 128;
        }
        return false;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        long j2;
        android.content.Context context = (android.content.Context) objArr[0];
        n = (h + 117) % 128;
        java.lang.Object obj = null;
        if (!f.isEmpty()) {
            long size = f.size();
            long longValue = f.peekLast().longValue();
            if (f3462a) {
                int i2 = n + 85;
                h = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                j2 = androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS;
            } else {
                j2 = 300000;
            }
            while (!f.isEmpty()) {
                h = (n + 45) % 128;
                if (f.peekFirst().longValue() >= longValue - j2) {
                    break;
                }
                f.removeFirst();
            }
            if (f.size() >= (f3462a ? 16L : 14L)) {
                j = longValue;
                f.clear();
            }
            if (f.size() != size) {
                h(context);
            }
        }
        return null;
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        boolean z = false;
        android.content.Context context = (android.content.Context) objArr[0];
        int i2 = h + 17;
        n = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                l(context);
            } else {
                l(context);
                z = true;
            }
        } catch (java.io.FileNotFoundException unused) {
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.ay.c(e2.getMessage());
            e2.getStackTrace();
        }
        h = (n + 43) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(android.content.Context context) {
        n = (h + 57) % 128;
        try {
            c(context.getCacheDir());
            int i2 = h + 81;
            n = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.ay.c(e2.getMessage());
        }
    }

    private static void h(final android.content.Context context) {
        int i2 = h;
        n = (i2 + 27) % 128;
        if (context == null) {
            n = (i2 + 39) % 128;
        } else {
            com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cg$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cg.k(context);
                }
            });
        }
    }

    private static void l(android.content.Context context) throws java.lang.Exception {
        byte[] bArr = (byte[]) com.facetec.sdk.bm.c(new java.lang.Object[]{new java.io.File(context.getCacheDir(), a()), b()}, com.facetec.sdk.gh.b.d(), -1300678471, com.facetec.sdk.gh.b.d(), 1300678472, com.facetec.sdk.gh.b.d(), com.facetec.sdk.gh.b.d());
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8));
        f.clear();
        java.lang.Object[] objArr = new java.lang.Object[1];
        m("\uee89\u2436", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 51893, objArr);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(((java.lang.String) objArr[0]).intern());
        if (optJSONArray != null) {
            int i2 = 0;
            while (i2 < optJSONArray.length()) {
                f.add(java.lang.Long.valueOf(optJSONArray.getLong(i2)));
                i2++;
                h = (n + 3) % 128;
            }
            java.util.Collections.sort(f);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        m("\uee83\ud8b8", 13859 - android.view.KeyEvent.keyCodeFromString(""), objArr2);
        j = jSONObject.optLong(((java.lang.String) objArr2[0]).intern(), 0L);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        m("\uee87\ue43f", android.text.TextUtils.indexOf("", "", 0) + 2741, objArr3);
        g = jSONObject.optBoolean(((java.lang.String) objArr3[0]).intern(), false);
        n = (h + 93) % 128;
    }

    private static void c(java.io.File file) throws java.lang.Exception {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.Long> it = f.iterator();
        while (it.hasNext()) {
            h = (n + 107) % 128;
            jSONArray.put(it.next().longValue());
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        m("\uee89\u2436", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 51893, objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), jSONArray);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        m("\uee83\ud8b8", 13859 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), j);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        m("\uee87\ue43f", 2741 - android.view.KeyEvent.keyCodeFromString(""), objArr3);
        jSONObject.put(((java.lang.String) objArr3[0]).intern(), g);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        m("\uee9d", 42588 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr4);
        jSONObject.put(((java.lang.String) objArr4[0]).intern(), com.facetec.sdk.ay.a(16, 128));
        com.facetec.sdk.bm.b(new java.io.File(file, a()), b(), jSONObject.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
        int i2 = n + 119;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    private static java.lang.String a() throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(c);
        sb.append(b);
        java.lang.Object[] objArr = new java.lang.Object[1];
        m("\uee83\uebd1\ue42e\ue177\ufbc4\uf40f\uf17d쮇쐁셟\udba9퓱텼ꮛꓯꄤ뮚듼넳讍蓗", 1362 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        java.lang.String c2 = com.facetec.sdk.bn.c(sb.toString());
        int i2 = n + 105;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            return c2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static byte[] b() throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(c);
        sb.append(b);
        java.lang.Object[] objArr = new java.lang.Object[1];
        m("\uee83뛭幖\ue7c3輴咻ﰕ葋ⷬ\uf55f體", android.graphics.ImageFormat.getBitsPerPixel(0) + 22638, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        byte[] d2 = com.facetec.sdk.bn.d(sb.toString());
        n = (h + 79) % 128;
        return d2;
    }

    static void d() {
        i = 8021565811063862953L;
    }

    private static boolean j(android.content.Context context) {
        int a2 = com.facetec.sdk.fl.AnonymousClass10.a();
        int a3 = com.facetec.sdk.fl.AnonymousClass10.a();
        return ((java.lang.Boolean) a(692831660, com.facetec.sdk.fl.AnonymousClass10.a(), -692831658, a2, com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, a3)).booleanValue();
    }

    private static void g(android.content.Context context) {
        int a2 = com.facetec.sdk.fl.AnonymousClass10.a();
        int a3 = com.facetec.sdk.fl.AnonymousClass10.a();
        a(634466043, com.facetec.sdk.fl.AnonymousClass10.a(), -634466043, a2, com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, a3);
    }

    static long i(android.content.Context context) {
        int a2 = com.facetec.sdk.fl.AnonymousClass10.a();
        int a3 = com.facetec.sdk.fl.AnonymousClass10.a();
        return ((java.lang.Long) a(56797156, com.facetec.sdk.fl.AnonymousClass10.a(), -56797155, a2, com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, a3)).longValue();
    }
}
