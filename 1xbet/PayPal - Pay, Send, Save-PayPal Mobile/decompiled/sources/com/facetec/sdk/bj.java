package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bj {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static final int B = 0;

    /* renamed from: a, reason: collision with root package name */
    static java.lang.String f3423a;
    static com.facetec.sdk.FaceTecAuditTrailType b;
    static com.facetec.sdk.FaceTecAuditTrailImagesToReturn c;
    static int d;
    static java.lang.String e;
    private static java.lang.String f;
    private static com.facetec.sdk.bj.c g;
    static org.json.JSONObject h;
    private static java.lang.String i;
    private static java.lang.String j;
    private static com.facetec.sdk.bj.e k;
    private static boolean l;
    private static java.lang.Boolean m;
    private static boolean n;

    /* renamed from: o, reason: collision with root package name */
    private static java.lang.String f3424o;
    private static long p;
    private static /* synthetic */ boolean q;
    private static long r;
    private static android.content.SharedPreferences s;
    private static char[] t;
    private static int u;
    private static final byte[] v = null;
    private static int w;
    private static int x;
    private static int y;

    enum c {
        NEVER_VALIDATED,
        VALIDATED,
        REJECTED,
        VERSION_DEPRECATED,
        NETWORK_ERROR
    }

    enum e {
        NONE,
        NETWORK,
        LICENSE,
        SESSION_TOKEN
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$g(byte b2, int i2, byte b3) {
        int i3;
        int i4;
        int i5;
        int i6 = (b3 * 2) + 1;
        byte[] bArr = $$c;
        int i7 = 3 - (b2 * 4);
        int i8 = 110 - i2;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i7;
            int i10 = 0;
            i7 += i8;
            i4 = i9;
            i3 = i10;
            bArr2[i3] = (byte) i7;
            i5 = i3 + 1;
            if (i5 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            int i11 = i4 + 1;
            i9 = i11;
            i8 = bArr[i11];
            i10 = i5;
            i7 += i8;
            i4 = i9;
            i3 = i10;
            bArr2[i3] = (byte) i7;
            i5 = i3 + 1;
            if (i5 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i7;
            i7 = i8;
            bArr2[i3] = (byte) i7;
            i5 = i3 + 1;
            if (i5 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void A(byte b2, byte b3, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 101 - b2;
        byte[] bArr = $$a;
        int i4 = s2 * 3;
        int i5 = 3 - (b3 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 += -i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            int i8 = i5 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i8;
            i5 = bArr[i8];
            i3 += -i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            int i82 = i5 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            int i822 = i5 + 1;
            if (i2 == i4) {
            }
        }
    }

    private static void D(int i2, int i3, byte b2, java.lang.Object[] objArr) {
        int i4 = b2 * 17;
        byte[] bArr = $$d;
        int i5 = 100 - i3;
        int i6 = 20 - (i2 * 17);
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 = i4 + i5 + 3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            i6++;
            if (i7 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i5 + bArr[i6] + 3;
        }
    }

    static void init$0() {
        $$a = new byte[]{40, -74, 4, -51};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
    }

    static void init$1() {
        $$d = new byte[]{5, 107, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 106, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.FF};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
    }

    static void init$2() {
        $$c = new byte[]{65, -15, 47, 91};
        $$f = 202;
    }

    bj() {
    }

    private static void C(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i3 = $10 + 115;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b2 = com.facetec.sdk.hu.b(p ^ 4732878740741522786L, cArr, i2);
        huVar.b = 4;
        $11 = ($10 + 119) % 128;
        while (huVar.b < b2.length) {
            $10 = ($11 + 49) % 128;
            huVar.e = huVar.b - 4;
            int i4 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % 4]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(p)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-474326228);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6935), 2389 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, 1146429908, false, $$g(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(-57140341);
                if (d3 == null) {
                    byte b5 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 884, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31, 1534550387, false, $$g(b5, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(b2, 4, b2.length - 4);
    }

    private static void E(int i2, char c2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i4 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(t[i3 + i4])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 5);
                    d2 = com.facetec.sdk.al.c((char) (45149 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 2150 - android.graphics.Color.green(0), 24 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1926116241, false, $$g(b2, b3, (byte) (b3 - 5)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(r), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    char indexOf = (char) android.text.TextUtils.indexOf("", "");
                    int green = android.graphics.Color.green(0);
                    long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    byte length = (byte) $$c.length;
                    d3 = com.facetec.sdk.al.c(indexOf, green + 1834, (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 23, -1880730373, false, $$g((byte) 0, length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) android.graphics.Color.red(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2342, 25 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1839099840, false, $$g(b4, (byte) (b4 | 8), b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                $11 = ($10 + 37) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            $10 = ($11 + 27) % 128;
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                byte b5 = (byte) 0;
                d5 = com.facetec.sdk.al.c((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 2341 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24, -1839099840, false, $$g(b5, (byte) (b5 | 8), b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static boolean c() {
        int i2 = x + 25;
        int i3 = i2 % 128;
        w = i3;
        if (i2 % 2 == 0) {
            boolean z = l;
            x = (i3 + 87) % 128;
            return z;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean d() {
        int i2 = w;
        x = (i2 + 117) % 128;
        x = (i2 + 115) % 128;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(java.lang.String str, android.content.Context context, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        x = (w + 19) % 128;
        if (((java.lang.Boolean) e(new java.lang.Object[]{str}, -770740723, 770740726, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c())).booleanValue()) {
            i(context);
            c(context, initializeCallback);
        } else {
            w = (x + 33) % 128;
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.INIT_FAIL_PUBLIC_KEY, (java.lang.String) null, (java.lang.Throwable) null);
            a(context, initializeCallback, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(android.content.Context context) {
        w = (x + 5) % 128;
        e(new java.lang.Object[]{context}, 340781284, -340781280, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
        w = (x + 49) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(java.lang.String str, android.content.Context context, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback, java.lang.String str2, java.lang.String str3) {
        w = (x + 43) % 128;
        if (!((java.lang.Boolean) e(new java.lang.Object[]{str}, -770740723, 770740726, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c())).booleanValue()) {
            a(context, initializeCallback, false);
            return;
        }
        i(context);
        c(context, str2, str3, initializeCallback);
        x = (w + 69) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(android.content.Context context) {
        x = (w + 85) % 128;
        e(new java.lang.Object[]{context}, 340781284, -340781280, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
        int i2 = x + 59;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: com.facetec.sdk.bj$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3425a;
        private static /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.cq.d.values().length];
            b = iArr;
            try {
                iArr[com.facetec.sdk.cq.d.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.facetec.sdk.cq.d.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.facetec.sdk.cq.d.SUCCESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.facetec.sdk.bj.c.values().length];
            e = iArr2;
            try {
                iArr2[com.facetec.sdk.bj.c.VALIDATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                e[com.facetec.sdk.bj.c.REJECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                e[com.facetec.sdk.bj.c.NETWORK_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                e[com.facetec.sdk.bj.c.VERSION_DEPRECATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                e[com.facetec.sdk.bj.c.NEVER_VALIDATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[com.facetec.sdk.bj.e.values().length];
            f3425a = iArr3;
            try {
                iArr3[com.facetec.sdk.bj.e.NETWORK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f3425a[com.facetec.sdk.bj.e.LICENSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f3425a[com.facetec.sdk.bj.e.SESSION_TOKEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f3425a[com.facetec.sdk.bj.e.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(android.content.Context context, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback, com.facetec.sdk.aw.a aVar, java.lang.String str) {
        boolean z;
        w = (x + 71) % 128;
        if (aVar == null) {
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.INIT_FAIL_NETWORK_ERROR, str, (java.lang.Throwable) null);
            g = com.facetec.sdk.bj.c.NETWORK_ERROR;
        } else if (aVar.e) {
            int i2 = w + 17;
            x = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z2 = aVar.d;
                throw null;
            }
            if (!aVar.d) {
                com.facetec.sdk.t.c(context, com.facetec.sdk.c.INIT_FINISH, (java.lang.String) null, (java.lang.Throwable) null);
                g = com.facetec.sdk.bj.c.VALIDATED;
                w = (x + 49) % 128;
                z = true;
                a(context, initializeCallback, z);
            }
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.INIT_FAIL_VERSION_DEPRECATED, (java.lang.String) null, (java.lang.Throwable) null);
            g = com.facetec.sdk.bj.c.VERSION_DEPRECATED;
        } else {
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.INIT_FAIL_DEVICE_KEY_REJECTED, (java.lang.String) null, (java.lang.Throwable) null);
            g = com.facetec.sdk.bj.c.REJECTED;
        }
        z = false;
        a(context, initializeCallback, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q() {
        int i2 = w + 115;
        x = i2 % 128;
        if (i2 % 2 != 0) {
            com.facetec.sdk.aw.e();
            com.facetec.sdk.cn.a();
            w = (x + 27) % 128;
        } else {
            com.facetec.sdk.aw.e();
            com.facetec.sdk.cn.a();
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        java.lang.Object[] objArr;
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char indexOf = (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1538);
            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
            int resolveSize = android.view.View.resolveSize(0, 0);
            byte b2 = (byte) ($$a[2] - 1);
            byte b3 = (byte) (b2 - 3);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            A(b2, b3, b3, objArr2);
            d2 = com.facetec.sdk.al.c(indexOf, 707 - packedPositionChild, resolveSize + 22, 936091891, false, (java.lang.String) objArr2[0], null);
        }
        java.lang.Object obj = null;
        long j2 = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        C("\ud98d\ud9ec闩찡涎\udea6榙攙뽺\u0c76琎ᨽᓒ\uea84\ueddc돨\uea3c䄼諮⥆䎀㡤⁎캤\ud916雔", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        C("璀瓥੮厤㗄蛩➊⬈ቫ鏿ⱄ呒맕甓뗔\ufddc䜡\udea7튵", android.view.View.MeasureSpec.getSize(0), objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char c2 = (char) (1537 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            byte length = (byte) $$a.length;
            byte b4 = (byte) (length - 4);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            A(length, b4, b4, objArr5);
            d3 = com.facetec.sdk.al.c(c2, 707 - modifierMetaStateMask, indexOf2 + 23, 939112562, false, (java.lang.String) objArr5[0], null);
        }
        if (j2 == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char scrollBarSize = (char) (1537 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                byte b5 = (byte) 1;
                byte b6 = (byte) (b5 - 1);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                A(b5, b6, b6, objArr6);
                d4 = com.facetec.sdk.al.c(scrollBarSize, (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, indexOf3 + 23, 934179829, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (java.lang.String[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}};
            int myUid = android.os.Process.myUid();
            int i2 = (((~myUid) | (-1591562199)) * 1444) + 463486808 + (((~(myUid | 451707001)) | (-1593692160) | (~(1144115119 | myUid))) * (-1444)) + 1794819758;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            try {
                java.lang.Object[] objArr8 = {0, 0, -556819166};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char c3 = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1537);
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    A(b7, b8, b8, objArr9);
                    d5 = com.facetec.sdk.al.c(c3, combineMeasuredStates + 708, 22 - (scrollBarSize2 >> 8), -388840623, false, (java.lang.String) objArr9[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr8);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char deadChar = (char) (android.view.KeyEvent.getDeadChar(0, 0) + 1537);
                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    byte b9 = (byte) 1;
                    byte b10 = (byte) (b9 - 1);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    A(b9, b10, b10, objArr10);
                    d6 = com.facetec.sdk.al.c(deadChar, argb + 708, 21 - lastIndexOf, 934179829, false, (java.lang.String) objArr10[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr);
                try {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    C("\ud98d\ud9ec闩찡涎\udea6榙攙뽺\u0c76琎ᨽᓒ\uea84\ueddc돨\uea3c䄼諮⥆䎀㡤⁎캤\ud916雔", android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr11);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    C("璀瓥੮厤㗄蛩➊⬈ቫ鏿ⱄ呒맕甓뗔\ufddc䜡\udea7튵", android.view.View.MeasureSpec.getMode(0), objArr12);
                    long longValue2 = ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char myTid = (char) (1537 - (android.os.Process.myTid() >> 22));
                        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                        long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
                        byte length2 = (byte) $$a.length;
                        byte b11 = (byte) (length2 - 4);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        A(length2, b11, b11, objArr13);
                        d7 = com.facetec.sdk.al.c(myTid, 708 - offsetBefore, 23 - (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)), 939112562, false, (java.lang.String) objArr13[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char scrollBarSize3 = (char) (1537 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                        byte b12 = (byte) ($$a[2] - 1);
                        byte b13 = (byte) (b12 - 3);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        A(b12, b13, b13, objArr14);
                        d8 = com.facetec.sdk.al.c(scrollBarSize3, 707 - indexOf4, 22 - (maxKeyCode >> 16), 936091891, false, (java.lang.String) objArr14[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj2 = objArr[3];
        int i5 = ((int[]) obj2)[0];
        java.lang.Object obj3 = objArr[1];
        int i6 = ((int[]) obj3)[0];
        if (i6 != i5) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr[2];
            if (strArr != null) {
                w = (x + 109) % 128;
                for (java.lang.String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i6];
            int i7 = i6 - 1;
            iArr[i7] = 1;
            android.widget.Toast.makeText((android.content.Context) null, iArr[((i6 * i7) % 2) - 1], 1).show();
            int i8 = ((int[]) objArr[0])[0];
            java.lang.Object[] objArr15 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) objArr[3])[0]}};
            int i9 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i10 = i8 + (((~((-845344245) | i9)) | 539123764) * 576) + 1525282344 + (((~((~i9) | (-306220481))) | 211354112) * 576) + 1297642752;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr15[0])[0] = i12 ^ (i12 << 5);
            int i13 = w + 25;
            x = i13 % 128;
            if (i13 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        x = (w + 115) % 128;
        int i14 = ((int[]) objArr[0])[0];
        java.lang.Object[] objArr16 = {new int[1], new int[]{((int[]) obj3)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj2)[0]}};
        int myPid = android.os.Process.myPid();
        int i15 = i14 + (((~((-819129978) | myPid)) | 541220905) * 345) + 793004608 + (((~((-819129978) | (~myPid))) | 235471238) * 345) + ((~(myPid | (-541220906))) * 345);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr16[0])[0] = i17 ^ (i17 << 5);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        l();
        y = 0;
        u = 1;
        w = 0;
        x = 1;
        f();
        e(new java.lang.Object[0], 132137849, -132137843, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.os.SystemClock.uptimeMillis();
        u = (y + 19) % 128;
        q = true;
        e = null;
        b = com.facetec.sdk.FaceTecAuditTrailType.HEIGHT_640;
        c = com.facetec.sdk.FaceTecAuditTrailImagesToReturn.ONE;
        h = null;
        g = com.facetec.sdk.bj.c.NEVER_VALIDATED;
        k = com.facetec.sdk.bj.e.NONE;
        f3424o = null;
        l = false;
        n = false;
        m = null;
        y = (u + 111) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        java.lang.Object[] objArr;
        char c2;
        w = (x + 75) % 128;
        java.lang.Object d2 = com.facetec.sdk.al.d(1606058502);
        if (d2 == null) {
            char c3 = (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
            int rgb = android.graphics.Color.rgb(0, 0, 0);
            byte b2 = (byte) 0;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            A(b2, b2, b2, objArr2);
            d2 = com.facetec.sdk.al.c(c3, (edgeSlop >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 16777239 + rgb, -128583426, false, (java.lang.String) objArr2[0], null);
        }
        long j2 = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        C("\ud98d\ud9ec闩찡涎\udea6榙攙뽺\u0c76琎ᨽᓒ\uea84\ueddc돨\uea3c䄼諮⥆䎀㡤⁎캤\ud916雔", android.graphics.Color.blue(0), objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        C("璀瓥੮厤㗄蛩➊⬈ቫ鏿ⱄ呒맕甓뗔\ufddc䜡\udea7튵", android.graphics.Color.alpha(0), objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(1605134981);
        if (d3 == null) {
            char c4 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte b3 = (byte) 1;
            byte b4 = (byte) (b3 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            A(b3, b4, b4, objArr5);
            d3 = com.facetec.sdk.al.c(c4, 1058 - (longPressTimeout >> 16), 'G' - mirror, -129822595, false, (java.lang.String) objArr5[0], null);
        }
        if (j2 == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(1603287939);
            if (d4 == null) {
                char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
                int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                byte b5 = (byte) ($$a[2] - 1);
                byte b6 = (byte) (b5 - 3);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                A(b5, b6, b6, objArr6);
                d4 = com.facetec.sdk.al.c(touchSlop, normalizeMetaState + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 22 - modifierMetaStateMask, -125877893, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{(java.lang.String[]) objArr7[0], new int[1], new int[]{((int[]) objArr7[2])[0]}, new int[]{((int[]) objArr7[3])[0]}};
            int myPid = android.os.Process.myPid();
            int i2 = ~myPid;
            int i3 = ((((((~(i2 | (-1108855132))) | 509362828) * (-90)) + 1423582082) + (((~(myPid | (-1108855132))) | (-1583336416)) * (-45))) + ((((~(myPid | (-509362829))) | (-1108855132)) | (~(i2 | 509362828))) * 45)) - 1673951376;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            x = (w + 47) % 128;
            c2 = 2;
        } else {
            try {
                java.lang.Object[] objArr8 = {1763832420};
                java.lang.Object d5 = com.facetec.sdk.al.d(-583417224);
                if (d5 == null) {
                    d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.blue(0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 22, 2060892288, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] a$896c745 = com.facetec.sdk.mo.AnonymousClass5.a$896c745(((java.lang.reflect.Constructor) d5).newInstance(objArr8));
                java.lang.Object d6 = com.facetec.sdk.al.d(1603287939);
                if (d6 == null) {
                    char packedPositionChild = (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1);
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                    byte b7 = (byte) ($$a[2] - 1);
                    byte b8 = (byte) (b7 - 3);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    A(b7, b8, b8, objArr9);
                    d6 = com.facetec.sdk.al.c(packedPositionChild, indexOf + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIF_INFO2, (doubleTapTimeout >> 16) + 23, -125877893, false, (java.lang.String) objArr9[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, a$896c745);
                try {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    C("\ud98d\ud9ec闩찡涎\udea6榙攙뽺\u0c76琎ᨽᓒ\uea84\ueddc돨\uea3c䄼諮⥆䎀㡤⁎캤\ud916雔", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    C("璀瓥੮厤㗄蛩➊⬈ቫ鏿ⱄ呒맕甓뗔\ufddc䜡\udea7튵", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr11);
                    long longValue2 = ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr11[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(1605134981);
                    if (d7 == null) {
                        char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                        int mode = android.view.View.MeasureSpec.getMode(0);
                        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        byte b9 = (byte) 1;
                        byte b10 = (byte) (b9 - 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        A(b9, b10, b10, objArr12);
                        d7 = com.facetec.sdk.al.c(absoluteGravity, 1058 - mode, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 22, -129822595, false, (java.lang.String) objArr12[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(1606058502);
                    if (d8 == null) {
                        char c5 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int argb = android.graphics.Color.argb(0, 0, 0, 0);
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        byte b11 = (byte) 0;
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        A(b11, b11, b11, objArr13);
                        d8 = com.facetec.sdk.al.c(c5, argb + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, lastIndexOf + 24, -128583426, false, (java.lang.String) objArr13[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                    objArr = a$896c745;
                    c2 = 2;
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[c2];
        int i6 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[3];
        if (((int[]) obj2)[0] == i6) {
            int i7 = ((int[]) objArr[1])[0];
            java.lang.Object[] objArr14 = {(java.lang.String[]) objArr[0], new int[1], new int[]{((int[]) obj)[0]}, new int[]{((int[]) obj2)[0]}};
            int i8 = i7 + ((((~((-1277379597) | r1)) | (-340838364)) * (-964)) - 1794133849) + (((~((~((int) android.os.Process.getElapsedCpuTime())) | (-1277379597))) | 1210253316) * (-964));
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr14[1])[0] = i10 ^ (i10 << 5);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = (java.lang.String[]) objArr[0];
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                arrayList.add(str);
            }
        }
        try {
            java.lang.Object[] objArr15 = {java.lang.Long.valueOf((i6 ^ r3) ^ 2374443154578341888L), 552843130L};
            byte[] bArr = $$d;
            byte b12 = (byte) (-bArr[9]);
            byte b13 = b12;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            D(b12, b13, b13, objArr16);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr16[0]);
            byte b14 = (byte) (bArr[9] + 1);
            byte b15 = b14;
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            D(b14, b15, b15, objArr17);
            cls3.getMethod((java.lang.String) objArr17[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr15);
            int i11 = ((int[]) objArr[1])[0];
            java.lang.Object[] objArr18 = {(java.lang.String[]) objArr[0], new int[1], new int[]{((int[]) objArr[2])[0]}, new int[]{((int[]) objArr[3])[0]}};
            int i12 = i11 + ((((~((-1485442018) | r1)) | (-132775943)) * (-983)) - 1420961284) + (((~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | (-132775943))) | 123731974) * 983);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr18[1])[0] = i14 ^ (i14 << 5);
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z, android.content.Context context, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        boolean z2;
        x = (w + 51) % 128;
        if (z) {
            try {
                z2 = com.facetec.sdk.cq.d(context);
            } catch (java.lang.Exception unused) {
                z2 = false;
            }
            if (!z2) {
                g = com.facetec.sdk.bj.c.REJECTED;
                x = (w + 25) % 128;
            }
            try {
                n = true;
                initializeCallback.onCompletion(z2);
                return;
            } finally {
                n = false;
            }
        }
        initializeCallback.onCompletion(false);
        int i2 = w + 29;
        x = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void a(final android.content.Context context, final com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback, final boolean z) {
        x = (w + 77) % 128;
        if (initializeCallback == null) {
            return;
        }
        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bj.b(z, context, initializeCallback);
            }
        });
        w = (x + 23) % 128;
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        java.lang.String str;
        android.content.Context context = (android.content.Context) objArr[0];
        if (!h(context)) {
            return com.facetec.sdk.FaceTecSDKStatus.DEVICE_NOT_SUPPORTED;
        }
        if (e != null && ((str = f3424o) == null || str.isEmpty())) {
            return com.facetec.sdk.FaceTecSDKStatus.ENCRYPTION_KEY_INVALID;
        }
        if (c(com.facetec.sdk.dp.a(context).getConfiguration())) {
            x = (w + 35) % 128;
            return com.facetec.sdk.FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE;
        }
        if (com.facetec.sdk.ay.b(context) == 9) {
            com.facetec.sdk.FaceTecSDKStatus faceTecSDKStatus = com.facetec.sdk.FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE;
            int i2 = x + 75;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                return faceTecSDKStatus;
            }
            throw null;
        }
        int i3 = com.facetec.sdk.bj.AnonymousClass1.e[g.ordinal()];
        if (i3 == 1) {
            if (!com.facetec.sdk.cg.f(context)) {
                return com.facetec.sdk.FaceTecSDKStatus.INITIALIZED;
            }
            x = (w + 113) % 128;
            com.facetec.sdk.FaceTecSDKStatus faceTecSDKStatus2 = com.facetec.sdk.FaceTecSDKStatus.DEVICE_LOCKED_OUT;
            x = (w + 63) % 128;
            return faceTecSDKStatus2;
        }
        if (i3 == 2) {
            int i4 = com.facetec.sdk.bj.AnonymousClass1.f3425a[k.ordinal()];
            if (i4 == 1) {
                return com.facetec.sdk.FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER;
            }
            if (i4 == 2 || i4 == 3) {
                return com.facetec.sdk.FaceTecSDKStatus.KEY_EXPIRED_OR_INVALID;
            }
            if (i4 == 4) {
                return com.facetec.sdk.FaceTecSDKStatus.NEVER_INITIALIZED;
            }
        } else if (i3 != 3) {
            return i3 != 4 ? i3 != 5 ? com.facetec.sdk.FaceTecSDKStatus.NEVER_INITIALIZED : com.facetec.sdk.FaceTecSDKStatus.NEVER_INITIALIZED : com.facetec.sdk.FaceTecSDKStatus.VERSION_DEPRECATED;
        }
        return com.facetec.sdk.FaceTecSDKStatus.NETWORK_ISSUES;
    }

    static java.lang.Long a(android.content.Context context) {
        long longValue;
        int i2 = x + 23;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int a2 = com.facetec.sdk.fl.AnonymousClass10.a();
            int a3 = com.facetec.sdk.fl.AnonymousClass10.a();
            longValue = ((java.lang.Long) com.facetec.sdk.cg.a(56797156, com.facetec.sdk.fl.AnonymousClass10.a(), -56797155, a2, com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, a3)).longValue();
            if (longValue == 1) {
                return null;
            }
        } else {
            int a4 = com.facetec.sdk.fl.AnonymousClass10.a();
            int a5 = com.facetec.sdk.fl.AnonymousClass10.a();
            longValue = ((java.lang.Long) com.facetec.sdk.cg.a(56797156, com.facetec.sdk.fl.AnonymousClass10.a(), -56797155, a4, com.facetec.sdk.fl.AnonymousClass10.a(), new java.lang.Object[]{context}, a5)).longValue();
            if (longValue == 0) {
                return null;
            }
        }
        int i3 = w + 21;
        x = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Long.valueOf(longValue);
        }
        int i4 = 7 / 0;
        return java.lang.Long.valueOf(longValue);
    }

    static boolean b(android.content.Context context) {
        int i2 = w + 119;
        x = i2 % 128;
        if (i2 % 2 != 0) {
            return com.facetec.sdk.cg.f(context);
        }
        com.facetec.sdk.cg.f(context);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(android.content.Context context) {
        int i2 = w + 121;
        x = i2 % 128;
        com.facetec.sdk.ai.c(context);
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(android.content.Context context) {
        int i2 = x + 99;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
            if (!h(context)) {
                return;
            }
        } else if (!h(context)) {
            return;
        }
        int i4 = w + 19;
        x = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                com.facetec.sdk.cq.d(context);
            } else {
                com.facetec.sdk.cq.d(context);
                throw null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    static void e(final android.content.Context context, boolean z) {
        x = (w + 77) % 128;
        if (z) {
            com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bj.t(context);
                }
            });
            x = (w + 13) % 128;
        }
        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bj.r(context);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r2, "android.permission.CAMERA") != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r2, "android.permission.CAMERA") != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        return com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.GRANTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r2 = com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED;
        com.facetec.sdk.bj.w = (com.facetec.sdk.bj.x + 59) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.facetec.sdk.FaceTecSDK.CameraPermissionStatus d(android.content.Context context) {
        int i2 = x + 93;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
    }

    static boolean e() {
        if (b != com.facetec.sdk.FaceTecAuditTrailType.DISABLED) {
            x = (w + 117) % 128;
            return true;
        }
        x = (w + 79) % 128;
        return false;
    }

    static void e(com.facetec.sdk.FaceTecAuditTrailType faceTecAuditTrailType) {
        int i2 = w + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        x = i2 % 128;
        if (i2 % 2 != 0) {
            b("setAuditTrailType");
            if (faceTecAuditTrailType != b) {
                b = faceTecAuditTrailType;
                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bj.m();
                    }
                });
            }
            w = (x + 11) % 128;
            return;
        }
        b("setAuditTrailType");
        throw null;
    }

    private static boolean h(android.content.Context context) {
        boolean booleanValue;
        boolean z;
        synchronized (com.facetec.sdk.bj.class) {
            if (m == null) {
                if (n()) {
                    w = (x + 33) % 128;
                    if (k(context)) {
                        w = (x + 83) % 128;
                        if (!f(context)) {
                            int i2 = x + 115;
                            w = i2 % 128;
                            int i3 = i2 % 2;
                            z = true;
                            m = java.lang.Boolean.valueOf(z);
                            int i4 = x + 57;
                            w = i4 % 128;
                            int i5 = i4 % 2;
                        }
                    }
                }
                z = false;
                m = java.lang.Boolean.valueOf(z);
                int i42 = x + 57;
                w = i42 % 128;
                int i52 = i42 % 2;
            }
            booleanValue = m.booleanValue();
        }
        return booleanValue;
    }

    private static boolean n() {
        if (!android.os.Build.CPU_ABI.toLowerCase().startsWith("arm")) {
            return false;
        }
        int i2 = x;
        w = (i2 + 79) % 128;
        int i3 = i2 + 73;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        int i4 = 44 / 0;
        return true;
    }

    private static boolean f(android.content.Context context) {
        int i2 = x + 79;
        w = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                return true;
            }
            int i3 = w + 115;
            x = i3 % 128;
            if (i3 % 2 != 0) {
                return context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
            }
            context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
            throw null;
        }
        context.getPackageManager().hasSystemFeature("org.chromium.arc");
        obj.hashCode();
        throw null;
    }

    private static boolean k(android.content.Context context) {
        java.lang.Object obj = null;
        if (!context.getPackageManager().hasSystemFeature("android.hardware.camera.front")) {
            int i2 = x + 83;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                if (!android.os.Build.MODEL.equals("Lenovo YT3-850F")) {
                    com.facetec.sdk.ah.m();
                    return false;
                }
            } else {
                android.os.Build.MODEL.equals("Lenovo YT3-850F");
                obj.hashCode();
                throw null;
            }
        }
        int i3 = w + 109;
        x = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    static boolean c(android.content.res.Configuration configuration) {
        if (configuration.orientation != 2) {
            return false;
        }
        int i2 = w;
        x = (i2 + 73) % 128;
        int i3 = i2 + 55;
        x = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static java.lang.String d(android.content.Context context, boolean z) {
        synchronized (com.facetec.sdk.bj.class) {
            if (j == null) {
                int i2 = w;
                x = (i2 + 45) % 128;
                if (context != null) {
                    x = (i2 + 47) % 128;
                    l(context);
                }
            }
            if (!z) {
                return j;
            }
            x = (w + 93) % 128;
            return i;
        }
    }

    private static void l(android.content.Context context) {
        w = (x + 31) % 128;
        try {
            java.lang.Object obj = null;
            if (com.facetec.sdk.d.d(context) != com.facetec.sdk.d.a.New) {
                java.lang.String o2 = o(context);
                i = o2;
                j = java.util.UUID.nameUUIDFromBytes(o2.getBytes()).toString();
                int i2 = x + 33;
                w = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = w + 61;
            x = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.String m2 = m(context);
                j = m2;
                i = m2;
            } else {
                java.lang.String m3 = m(context);
                j = m3;
                i = m3;
                throw null;
            }
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.UNEXPECTED_NULL, e2.getMessage(), e2);
            java.lang.String a2 = com.facetec.sdk.ay.a(15, 0);
            j = a2;
            i = a2;
        }
    }

    static java.lang.String c(android.content.Context context) {
        java.lang.String str;
        synchronized (com.facetec.sdk.bj.class) {
            if (f == null) {
                w = (x + 5) % 128;
                if (context != null) {
                    f = context.getPackageName();
                }
            }
            str = f;
            x = (w + 113) % 128;
        }
        return str;
    }

    private static java.lang.String m(android.content.Context context) throws java.lang.Exception {
        w = (x + 21) % 128;
        byte[] c2 = com.facetec.sdk.d.c(context);
        java.lang.Object[] objArr = new java.lang.Object[1];
        E(20 - (android.os.Process.myPid() >> 22), (char) (android.os.Process.myPid() >> 22), android.graphics.Color.red(0), objArr);
        java.lang.String obj = java.util.UUID.nameUUIDFromBytes(com.facetec.sdk.bn.d(c2, ((java.lang.String) objArr[0]).intern())).toString();
        int i2 = w + 105;
        x = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        java.lang.Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static java.lang.String o(android.content.Context context) throws java.lang.Exception {
        int i2 = w + 81;
        x = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] c2 = com.facetec.sdk.d.c(context);
            java.lang.Object[] objArr = new java.lang.Object[1];
            E(77 / android.text.TextUtils.lastIndexOf("", io.ktor.util.date.GMTDateParser.SECONDS, 0, 0), (char) android.view.KeyEvent.getDeadChar(1, 1), android.view.ViewConfiguration.getTapTimeout() + 78, objArr);
            return com.facetec.sdk.bn.b(c2, ((java.lang.String) objArr[0]).intern()).substring(1, 64);
        }
        byte[] c3 = com.facetec.sdk.d.c(context);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        E(19 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0), android.view.ViewConfiguration.getTapTimeout() >> 16, objArr2);
        return com.facetec.sdk.bn.b(c3, ((java.lang.String) objArr2[0]).intern()).substring(0, 16);
    }

    static android.content.SharedPreferences g(android.content.Context context) {
        int i2 = (x + 9) % 128;
        w = i2;
        if (s == null) {
            int i3 = i2 + 23;
            x = i3 % 128;
            if (i3 % 2 != 0) {
                if (!q && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    throw new java.lang.AssertionError();
                }
                s = context.getSharedPreferences("zoom.sdk.settings", 0);
            } else {
                throw null;
            }
        }
        return s;
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        w = (x + 73) % 128;
        android.content.SharedPreferences.Editor edit = g(context).edit();
        edit.putInt(com.facetec.sdk.as.T, ((java.lang.Integer) e(new java.lang.Object[]{context}, 922074868, -922074866, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c())).intValue() + 1);
        edit.apply();
        int i2 = x + 51;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0019, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i2 = w + 17;
        x = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        try {
            f3424o = str.trim();
            int i4 = w + 81;
            x = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        } catch (java.lang.Exception unused) {
            x = (w + 47) % 128;
            return false;
        }
    }

    static void d(org.json.JSONObject jSONObject) {
        w = (x + 119) % 128;
        if (!jSONObject.has("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{")) {
            h = jSONObject;
            return;
        }
        x = (w + 61) % 128;
        try {
            com.facetec.sdk.by.d(jSONObject.getString("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{"));
        } catch (org.json.JSONException unused) {
        }
    }

    static void g() {
        int i2 = x + 11;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
            if (!n) {
                return;
            }
        } else if (!n) {
            return;
        }
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        com.facetec.sdk.at.d("* FaceTec SDK Code Integration PROBLEM Detected.                                                                                  *");
        com.facetec.sdk.at.d("* Your App Code is creating a new FaceTecSession in the Initialization Completion Callback.                                       *");
        com.facetec.sdk.at.d("* This will cause User Experience Issues and is not recommended. Please see the FaceTec Developer Documentation for more details. *");
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        x = (w + 39) % 128;
    }

    private static void b(java.lang.String str) {
        x = (w + 31) % 128;
        if (g == com.facetec.sdk.bj.c.VALIDATED) {
            return;
        }
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("* WARNING: ");
        sb.append(str);
        sb.append(" called in incorrect and unsupported fashion. Any usage outside the following conditions will cause unpredictable and undesirable results: *");
        com.facetec.sdk.at.d(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("* 1. ");
        sb2.append(str);
        sb2.append(" MUST BE called after the successful initialization. Calling this API at any other time is not supported and will not function properly. *");
        com.facetec.sdk.at.d(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("* 2. ");
        sb3.append(str);
        sb3.append(" CANNOT called when a FaceTecSession is already in progress.                                                  *");
        com.facetec.sdk.at.d(sb3.toString());
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        int i2 = x + 69;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        x = (w + 41) % 128;
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        com.facetec.sdk.at.d("* WARNING: You are using DEVELOPMENT-ONLY Keys. *");
        com.facetec.sdk.at.d("* Development Keys should only be used while you are familiarizing yourself with Device SDK functionality or if you do not yet have a commercial agreement with FaceTec. *");
        com.facetec.sdk.at.d("* This Key IS NOT supported for Production Environments. *");
        com.facetec.sdk.at.d("* If you have a commercial agreement with FaceTec, you should be using Production SDK Encryption Keys, even if you are still Developing your Application. *");
        com.facetec.sdk.at.d("* Please use initializeInProductionMode if you are deploying this for use in a Real App with Real Users. *");
        com.facetec.sdk.at.d("* Please review https://dev.facetec.com/keys#key-types *");
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        int i2 = w + 117;
        x = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static void h() {
        int i2 = x + 93;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            com.facetec.sdk.at.d("***********************************************************************************************************************************");
            com.facetec.sdk.at.d("* WARNING: You are using initializeInDevelopmentMode with a PRODUCTION Key. *");
            com.facetec.sdk.at.d("* Please use initializeInProductionMode, even if you are still Developing your Application. *");
            com.facetec.sdk.at.d("* Please review https://dev.facetec.com/keys#key-types *");
            com.facetec.sdk.at.d("***********************************************************************************************************************************");
            int i3 = 69 / 0;
            return;
        }
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
        com.facetec.sdk.at.d("* WARNING: You are using initializeInDevelopmentMode with a PRODUCTION Key. *");
        com.facetec.sdk.at.d("* Please use initializeInProductionMode, even if you are still Developing your Application. *");
        com.facetec.sdk.at.d("* Please review https://dev.facetec.com/keys#key-types *");
        com.facetec.sdk.at.d("***********************************************************************************************************************************");
    }

    public static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        java.lang.String d2;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~i6;
        int i11 = (~(i8 | i6)) | (~(i9 | i10 | i3));
        int i12 = (~(i6 | i9 | i3)) | (~(i10 | i8));
        int i13 = ~(i8 | i9);
        int i14 = i2 + i3 + i7 + (762713021 * i4) + (1579510587 * i5);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-1364308824)) - 1074288667) + ((-1364308824) * i3) + (i11 * 659) + (i12 * 659) + (i13 * 659) + ((-1364308165) * i7) + ((-893132913) * i4) + (986770329 * i5) + ((-1162149888) * i15);
        switch (((i2 * (-1846875272)) - 1480523776) + (i3 * (-1846875272)) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + (i13 * (-1613556599)) + (i7 * 834535424) + (i4 * (-750387200)) + (i5 * (-523632640)) + (i15 * (-1971257344)) + (i16 * i16 * (-1529413632))) {
            case 1:
                return d(objArr);
            case 2:
                android.content.Context context = (android.content.Context) objArr[0];
                x = (w + 53) % 128;
                int i17 = g(context).getInt(com.facetec.sdk.as.T, 0);
                x = (w + 51) % 128;
                return java.lang.Integer.valueOf(i17);
            case 3:
                return a(objArr);
            case 4:
                return c(objArr);
            case 5:
                java.lang.String str = (java.lang.String) objArr[0];
                int i18 = w + 51;
                x = i18 % 128;
                if (i18 % 2 != 0 ? (d2 = d(null, true)) == null : (d2 = d(null, false)) == null) {
                    d2 = "_";
                }
                if (f == null) {
                    x = (w + 113) % 128;
                    return "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("facetec|sdk|android|");
                sb.append(f);
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(e);
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(d2);
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(android.os.Build.MODEL);
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(com.facetec.sdk.FaceTecSDK.version());
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(java.util.Locale.getDefault());
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(java.util.Locale.getDefault().getLanguage());
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(str);
                return sb.toString();
            case 6:
                return b(objArr);
            case 7:
                int i19 = (x + 59) % 128;
                w = i19;
                java.lang.String str2 = f3424o;
                x = (i19 + 29) % 128;
                return str2;
            case 8:
                return e(objArr);
            default:
                x = (w + 55) % 128;
                com.facetec.sdk.cq.e();
                w = (x + 53) % 128;
                return null;
        }
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        int i2 = w + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        x = i2 % 128;
        int i3 = i2 % 2;
        t = new char[]{27773, 21033, 4273, 54937, 38158, 23362, 6614, 57223, 40547, 23784, 658, 49496, 34617, 17891, 2952, 51813, 35042, 20136, 3393, 62241};
        r = 6613654481335046739L;
        if (i3 != 0) {
            return null;
        }
        int i4 = 19 / 0;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void z(int i2, short s2, short s3, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = v;
        int i5 = 1877 - i2;
        int i6 = 582 - s2;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            i3 = 0;
            i5 += -i7;
            bArr2[i3] = (byte) i5;
            i3++;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i7 = bArr[i4];
            i5 += -i7;
            bArr2[i3] = (byte) i5;
            i3++;
            if (i3 == i6) {
            }
        } else {
            int i8 = s3 + 44;
            i3 = 0;
            i4 = i5;
            i5 = i8;
            bArr2[i3] = (byte) i5;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    static void l() {
        byte[] bArr = new byte[2098];
        java.lang.System.arraycopy(")ê\u0098³ü\u0005ù\u0007ÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿüý\bÿüü\tÿüû\nÿüú\u000bÿüù\fÿüü\tó\rÿüø\rû\u0001\u0004ÿû\u0002\u0004û\u0000\u0005û\u0000\u0005ÿû\u0001\u0005û\u0001\u0004ÿû\u0000\u0006ÿûÿ\u0007ÿûþ\bÿûý\tÿûü\nÿûû\u000bÿûú\fÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0001\u0006ÿú\u0000\u0007ÿúÿ\bÿúþ\tû\u0001\u0004ÿúý\nû\u0000\u0005û\u0000\u0005ÿû\u0001\u0005û\u0001\u0004ûþ\u0007ù\u0007ÿúü\u000bÿúû\fûý\bÿúú\rÿù\u0004\u0004ÿù\u0003\u0005ÿù\u0002\u0006ÿù\u0001\u0007ÿù\u0000\bÿùÿ\tÿùþ\nÿûù\rûû\nûú\u000bÿúü\u000bÿùý\u000bû\u0001\u0004ÿùü\fÿùû\rÿø\u0005\u0004ÿø\u0004\u0005ûù\fÿø\u0003\u0006ÿø\u0002\u0007ûø\rÿø\u0001\bû\u0001\u0004ÿø\u0000\tû\u0000\u0005û\u0000\u0005ÿû\u0001\u0005û\u0001\u0004ú\u0002\u0004ÿúü\u000bÿøÿ\nû\u0001\u0004ÿøþ\u000bÿø\u0002\u0007ûø\rÿøý\fú\u0001\u0005ú\u0001\u0005ú\u0000\u0006ÿøü\rúÿ\u0007ÿøý\fúÿ\u0007ÿøý\fú\u0001\u0005úþ\bÿø\u0001\bÿ÷\u0006\u0004úý\túü\núû\u000bÿ÷\u0005\u0005úù\rÿ÷\u0004\u0006ÿ÷\u0003\u0007ÿ÷\u0002\bÿ÷\u0002\bÿ÷\u0006\u0004ù\u0003\u0004ù\u0002\u0005ù\u0001\u0006úû\u000bÿ÷\u0005\u0005úù\rÿ÷\u0001\tÿ÷\u0000\nÿ÷ÿ\u000bù\u0000\u0007ù\u0000\u0007ùÿ\bûø\rÿø\u0001\bÿ÷\u0006\u0004ùþ\tù\u0001\u0006úû\u000bÿ÷\u0005\u0005ú\u0001\u0005úû\u000bÿ÷þ\fÿ÷ý\rÿö\u0007\u0004ÿö\u0007\u0004ÿ÷\u0006\u0004ùý\nùü\u000bùû\fù\u0001\u0006úû\u000bÿ÷\u0005\u0005ú\u0001\u0005úû\u000bÿö\u0006\u0005ÿö\u0005\u0006ÿö\u0004\u0007ÿö\u0004\u0007ÿö\u0003\bø\u0004\u0004ÿö\u0002\tø\u0003\u0005ÿö\u0002\tÿö\u0001\nûú\u000bÿö\u0000\u000bù\u0007ÿö\u0000\u000bÿöÿ\fù\u0007ÿöþ\rûú\u000bÿöþ\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010\të\u00153Â\u000bó\u00079ÜÝ\u0007ú\u000bü\b Í\u0015þõü\u000bú\u0001\të\u00153¹\u0001\u000bý>Ù\u0000\f\u0005\u0011ó\nõ\u0002\u0018\u0000\f\u0005ó\nò\u0003\u0006\u00056Ëô\u0001ú\u000f÷úFëÔ\u0001ú\u000fí\u0004\u0002ñ$ïþø\nú\u0002\u0017íô\bô\u0001ú\u0013øûû\të\u00153Â\u000bó\u00079ëÛ\u0007ï\u001fîôü\u0010÷\u000bþü\u0005ûú\u000bÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bø\u0002\u0006ÿõ\fÿô\rø\u0001\u0007ÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ø\u0000\bÿõ\fÿô\ró\rÿüþ\u0007øÿ\tÿüý\bÿüü\tÿüû\nû\u0001\u0004ÿüú\u000bÿüù\fÿüø\rÿû\u0002\u0004øþ\nøý\u000bÿû\u0001\u0005ÿû\u0000\u0006ûø\rÿûÿ\u0007û\u0001\u0004ûþ\u0007ûú\u000bÿõ\fÿûþ\bû\u0001\u0004ÿûý\tÿû\u0000\u0006ûø\rÿô\røü\fúû\u000bûø\rÿûü\nú\u0001\u0005úù\rûø\rÿûþ\bÿûû\u000bøû\rùü\u000b÷\u0005\u0004ÿûú\fú\u0001\u0005úû\u000bÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0001\u0006øþ\nøý\u000bÿú\u0000\u0007ÿû\u0000\u0006ûø\r÷\u0004\u0005ûø\rÿûÿ\u0007ÿúÿ\b÷\u0003\u0006ùü\u000bùû\f÷\u0002\u0007ÿúþ\tú\u0001\u0005úû\u000bÿúý\nÿúü\u000bÿúû\fù\u0007ÿû\u0006ÿú\u0007ÿù\bÿúú\rÿù\u0004\u0004ÿù\u0003\u0005ÿûû\u000b÷\u0001\b÷\u0002\u0007ÿûú\fú\u0001\u0005úû\u000bÿù\u0002\u0006ÿù\u0001\u0007ÿù\u0000\bû\u0001\u0004÷\u0000\tÿõ\fÿô\rÿùÿ\t÷ÿ\nÿùþ\n÷þ\u000bÿùþ\nÿùý\u000b÷ý\fÿùü\f÷ü\rÿùü\fÿùû\rù\u0007ÿø\u0005\u0004ûú\u000bÿø\u0005\u0004ÿø\u0004\u0005ö\u0006\u0004ÿø\u0003\u0006ö\u0005\u0005ÿø\u0003\u0006ÿø\u0002\u0007ö\u0006\u0004ÿø\u0001\bö\u0004\u0006ÿø\u0001ü\u0005ö\u0002\bûý\bÿû\u0006ÿú\u0007ÿù\bú\u0001\u0005úþ\bÿø\túÿ\u0007ÿ÷\nÿö\u000bö\u0001\tù\u0002\u0005ù\u0001\u0006úû\u000bÿõ\fú\u0001\u0005úû\u000bÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006úÿ\u0007ö\u0000\nöÿ\u000bÿ÷\nÿö\u000böþ\fùü\u000bùû\fù\u0001\u0006úû\u000bÿõ\fú\u0001\u0005úû\u000bÿüþ\u0007ÿüý\bÿüü\tÿüü\tÿüû\n÷þ\u000bÿüú\u000böý\rÿüúü\u0005û\u0001\u0004øý\u000bÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fÿô\rõ\u0007\u0004õ\u0006\u0005ÿü\u0001\u0004ÿü\u0000\u0005û\u0001\u0004ûý\bÿüÿ\u0006õ\u0005\u0006ù\u0007ÿüþ\u0007ÿüý\bÿüü\tÿõ\fõ\u0005\u0006ûú\u000bÿüþ\u0007ÿüû\nú\u0001\u0005úþ\bÿüú\u000búÿ\u0007ÿüù\fúÿ\u0007ÿüù\fÿüø\rõ\u0004\u0007úü\núû\u000bÿû\u0002\u0004ú\u0001\u0005úû\u000bÿû\u0001\u0005ÿû\u0000\u0006ÿûÿ\u0007ÿûÿ\u0007ÿûþ\bõ\u0003\bõ\u0002\túû\u000bÿûý\túù\rÿûü\nÿûû\u000bÿûú\fÿûú\të\u00153Â\u000bó\u00079ìÓ\u0000\u0003\u0007\u0004ó\u0005õù\u000eü\u0005ÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ÿø\tÿü\u0000\u0005ÿüÿ\u0006û\u0001\u0004ÿüþ\u0007û\u0001\u0004ÿüý\bû\u0001\u0004ÿüü\tõ\u0001\nûú\u000bÿüû\nõ\u0001\nÿüú\u000bûø\rÿüù\fÿüø\rûø\rÿû\u0002\u0004ÿüø\rûø\rÿû\u0001\u0005øü\fúû\u000bûø\rÿû\u0000\u0006úÿ\u0007ÿûÿ\u0007ÿûþ\bõ\u0000\u000bùü\u000bùû\fù\u0001\u0006úû\u000bÿûý\tú\u0001\u0005úû\u000bÿûü\nÿûû\u000bÿûú\fÿüÿ\u0006ÿû\u0006õÿ\fûø\rÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿûþ\bõþ\rúü\núû\u000bÿûý\túù\rÿú\u0001\u0006ÿú\u0000\u0007ÿúÿ\bÿúÿ\bÿúþ\tûú\u000bÿúý\nù\u0007ÿúý\nÿúü\u000bûú\u000bÿúû\fù\u0007ÿúûó\nò\u0003\u0006\u00056¿üEâÝ\u0000ÿ\u000bó\u0002ñ'ìøû\"Ý\u0000ÿ\u000bó\u0002ñ ìö\r\u0004ý\të\u00153Â\u000bó\u00079Úìö\r\u0004ýî\u0003\u0000\r÷ú ìö\r\u0004ý\të\u00153Â\u000bó\u00079íÎ\u0000\u000eóþ\u000bú\u0001)Ó\u0000\u0003ýü\u0005ÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nÿö\u000bÿõ\fû\u0000\u0005ÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ûø\rÿüý\bú\u0001\u0005úù\rûø\rÿüü\túÿ\u0007ÿ÷\nÿüû\nô\b\u0004÷\u0002\u0007ÿüú\u000bú\u0001\u0005úû\u000bÿüù\fÿüø\rÿû\u0002\u0004ÿû\u0001\u0005úÿ\u0007ô\u0007\u0005ô\u0006\u0006ûø\rÿ÷\nÿû\u0000\u0006ô\u0005\u0007ùü\u000bõ\u0002\túû\u000bÿûÿ\u0007ú\u0001\u0005úû\u000bÿûþ\bÿûý\tÿûü\nÿû\u0001\u0005ÿû\u0006û\u0000\u0005ô\u0004\bûø\rÿûû\u000bÿù\bÿø\tÿûú\fù\u0007ÿûù\rûú\u000bÿûù\rÿú\u0003\u0004ô\u0003\tÿú\u0002\u0005ô\u0002\nÿú\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 2098);
        v = bArr;
        B = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
    }

    static void f() {
        p = 691590018072501444L;
    }

    static void j() {
        e(new java.lang.Object[0], 132137849, -132137843, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m() {
        e(new java.lang.Object[0], -56583888, 56583888, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    static void i() {
        e(new java.lang.Object[0], -1577827314, 1577827315, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    private static boolean c(java.lang.String str) {
        return ((java.lang.Boolean) e(new java.lang.Object[]{str}, -770740723, 770740726, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c())).booleanValue();
    }

    static java.lang.String b() {
        return (java.lang.String) e(new java.lang.Object[0], -1475193129, 1475193136, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    private static void n(android.content.Context context) {
        e(new java.lang.Object[]{context}, 340781284, -340781280, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    static int j(android.content.Context context) {
        return ((java.lang.Integer) e(new java.lang.Object[]{context}, 922074868, -922074866, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c())).intValue();
    }

    static java.lang.String a(java.lang.String str) {
        return (java.lang.String) e(new java.lang.Object[]{str}, -1029329835, 1029329840, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    static com.facetec.sdk.FaceTecSDKStatus e(android.content.Context context) {
        return (com.facetec.sdk.FaceTecSDKStatus) e(new java.lang.Object[]{context}, -1332564622, 1332564630, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a() {
        java.lang.Object b2;
        int i2;
        com.facetec.sdk.dq dqVar = new com.facetec.sdk.dq();
        byte[] bArr = v;
        short s2 = bArr[38];
        java.lang.Object[] objArr = new java.lang.Object[1];
        z(s2, (short) (s2 | 361), bArr[34], objArr);
        int i3 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s3 = (short) 1293;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        z(s3, (short) 581, bArr[38], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s4 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            char c2 = 666;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            z(s3, s4, bArr[666], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            z((short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL), (short) 577, (byte) (-bArr[662]), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            z(s3, s4, bArr[666], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i4]};
                short s5 = (short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                short s6 = (short) 565;
                byte[] bArr2 = v;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                z(s5, s6, bArr2[c2], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[i3]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                z((short) 1258, (short) 575, (byte) 74, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                z(s3, s4, bArr2[666], objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                z(s5, s6, bArr2[666], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                z((short) 1252, (short) 574, (byte) (bArr2[666] - 1), objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i4++;
                i3 = 0;
                c2 = 666;
            }
            while (true) {
                int i5 = i3 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    if (i3 >= 33 && i3 < 37) {
                        i3 = 31;
                    } else {
                        if (i3 < 50 || i3 >= 56) {
                            throw th;
                        }
                        i3 = 48;
                    }
                    dqVar.j = th;
                    dqVar.a(63);
                }
                switch (dqVar.a(iArr[i3])) {
                    case -31:
                        i3 = 61;
                    case -30:
                        dqVar.a(39);
                        int i6 = dqVar.b;
                        i5 = (i6 == 10 || i6 != 58) ? 20 : 32;
                        break;
                    case -29:
                        i3 = 56;
                    case -28:
                        dqVar.a(39);
                        int i7 = dqVar.b;
                        if (i7 != 0 && i7 == 1) {
                            i3 = 1;
                        }
                        i3 = 49;
                        break;
                    case -27:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i5 = 55;
                        }
                    case -26:
                        i3 = 57;
                    case -25:
                        i3 = 59;
                    case -24:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i5 = 47;
                        }
                    case -23:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        w = dqVar.b;
                    case -22:
                        i2 = x;
                        dqVar.e = i2;
                        dqVar.a(4);
                    case -21:
                        dqVar.a(8);
                        throw ((java.lang.Throwable) dqVar.f);
                        break;
                    case -20:
                        i3 = 62;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i3 = 64;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i5 = 30;
                        }
                    case -17:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        x = dqVar.b;
                    case -16:
                        i2 = w;
                        dqVar.e = i2;
                        dqVar.a(4);
                    case -15:
                        i3 = 37;
                    case -14:
                        i3 = 22;
                    case -13:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        b2 = com.facetec.sdk.dk.b((java.lang.Runnable) dqVar.f);
                        dqVar.j = b2;
                        dqVar.a(6);
                    case -12:
                        b2 = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.q();
                            }
                        };
                        dqVar.j = b2;
                        dqVar.a(6);
                    case -11:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        k = (com.facetec.sdk.bj.e) dqVar.f;
                    case -10:
                        b2 = com.facetec.sdk.bj.e.NONE;
                        dqVar.j = b2;
                        dqVar.a(6);
                    case -9:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        e = (java.lang.String) dqVar.f;
                    case -8:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        g = (com.facetec.sdk.bj.c) dqVar.f;
                    case -7:
                        b2 = com.facetec.sdk.bj.c.NEVER_VALIDATED;
                        dqVar.j = b2;
                        dqVar.a(6);
                    case -6:
                        return;
                    case -5:
                        i3 = 6;
                    case -4:
                        i3 = 5;
                    case -3:
                        dqVar.a(28);
                        i3 = dqVar.b == 0 ? 4 : i5;
                    case -2:
                        i2 = com.facetec.sdk.cq.c();
                        dqVar.e = i2;
                        dqVar.a(4);
                    case -1:
                        i3 = 16;
                    default:
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0283 A[Catch: all -> 0x03eb, TryCatch #8 {all -> 0x03eb, blocks: (B:44:0x032e, B:47:0x027d, B:49:0x0283, B:50:0x0284, B:87:0x0285, B:88:0x0292, B:61:0x0293, B:164:0x02a8, B:166:0x02bd, B:168:0x02d2, B:171:0x02ec, B:174:0x02f1, B:176:0x0306, B:178:0x0310, B:180:0x0325, B:182:0x033e, B:184:0x034b, B:186:0x035d, B:190:0x037c, B:194:0x039b, B:198:0x03b9, B:119:0x03d4), top: B:60:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0284 A[Catch: all -> 0x03eb, TryCatch #8 {all -> 0x03eb, blocks: (B:44:0x032e, B:47:0x027d, B:49:0x0283, B:50:0x0284, B:87:0x0285, B:88:0x0292, B:61:0x0293, B:164:0x02a8, B:166:0x02bd, B:168:0x02d2, B:171:0x02ec, B:174:0x02f1, B:176:0x0306, B:178:0x0310, B:180:0x0325, B:182:0x033e, B:184:0x034b, B:186:0x035d, B:190:0x037c, B:194:0x039b, B:198:0x03b9, B:119:0x03d4), top: B:60:0x0293 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(android.content.Context context) {
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.Throwable cause;
        com.facetec.sdk.dq dqVar = new com.facetec.sdk.dq(context);
        byte[] bArr = v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        z((short) 349, (short) 318, bArr[34], objArr);
        char c2 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s2 = (short) 1293;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        z(s2, (short) 581, bArr[38], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            char c3 = 666;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            z((short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL), (short) 577, (byte) (-bArr[662]), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                short s4 = (short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                short s5 = (short) 565;
                byte[] bArr2 = v;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                z(s4, s5, bArr2[c3], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                z((short) 1258, (short) 575, (byte) 74, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                z(s2, s3, bArr2[666], objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                z(s4, s5, bArr2[666], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                z((short) 1252, (short) 574, (byte) (bArr2[666] - 1), objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i2++;
                c2 = 0;
                c3 = 666;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i3 >= 52 || i3 >= 57) {
                        throw th;
                    }
                    dqVar.j = th;
                    dqVar.a(63);
                    i3 = 50;
                }
                switch (dqVar.a(iArr[i3])) {
                    case -38:
                        i3 = 72;
                    case -37:
                        dqVar.a(39);
                        int i5 = dqVar.b;
                        if (i5 != 0 && i5 == 1) {
                            i3 = 5;
                        }
                        i3 = 13;
                        break;
                    case -36:
                        i3 = 67;
                    case -35:
                        dqVar.a(39);
                        if (dqVar.b != 0) {
                            i4 = 51;
                        } else {
                            i3 = 1;
                        }
                    case -34:
                        i3 = 36;
                    case -33:
                        i3 = 66;
                    case -32:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i4 = 65;
                        }
                    case -31:
                        i3 = 73;
                    case -30:
                        i3 = 75;
                    case -29:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i4 = 56;
                        }
                    case -28:
                        i3 = 68;
                    case -27:
                        i3 = 70;
                    case -26:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i4 = 49;
                        }
                    case -25:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        x = dqVar.b;
                    case -24:
                        dqVar.e = w;
                        dqVar.a(4);
                    case -23:
                        return;
                    case -22:
                        i3 = 38;
                    case -21:
                        i3 = 57;
                    case -20:
                        obj = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.k();
                            }
                        };
                        dqVar.j = obj;
                        dqVar.a(6);
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        obj = com.facetec.sdk.dk.e((java.lang.Runnable) dqVar.f);
                        dqVar.j = obj;
                        dqVar.a(6);
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        obj = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.o();
                            }
                        };
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -17:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        obj = c((android.content.Context) dqVar.f);
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -16:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context2 = (android.content.Context) dqVar.f;
                        dqVar.a(2);
                        obj = d(context2, dqVar.b != 0);
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -15:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        obj = g((android.content.Context) dqVar.f);
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -14:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        com.facetec.sdk.ax.e((android.content.Context) dqVar.f);
                    case -13:
                        try {
                            dqVar.e = 1;
                            dqVar.a(1);
                            dqVar.a(7);
                            com.facetec.sdk.cg.c((android.content.Context) dqVar.f);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i3 >= 52) {
                                break;
                            }
                            throw th;
                        }
                    case -12:
                        dqVar.a(8);
                        throw ((java.lang.Throwable) dqVar.f);
                    case -11:
                        try {
                            byte[] bArr3 = v;
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                z(bArr3[711], (short) 558, bArr3[666], objArr14);
                                try {
                                    try {
                                        obj = java.lang.Class.forName((java.lang.String) objArr14[0]).getDeclaredConstructor(null).newInstance(null);
                                        dqVar.j = obj;
                                        dqVar.a(6);
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    cause = th.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                        }
                    case -10:
                        i3 = 11;
                    case -9:
                        dqVar.a(12);
                        i3 = dqVar.b == 0 ? 10 : i4;
                    case -8:
                        try {
                            byte[] bArr4 = v;
                            short s6 = (short) (-bArr4[1865]);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            z(s6, (short) (s6 | 516), bArr4[666], objArr15);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            z((short) (-bArr4[643]), (short) 569, (byte) (bArr4[686] + 1), objArr16);
                            dqVar.j = cls4.getMethod((java.lang.String) objArr16[0], null).invoke(null, null);
                            dqVar.a(6);
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause2 = th7.getCause();
                            if (cause2 == null) {
                                throw th7;
                            }
                            throw cause2;
                        }
                    case -7:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        java.lang.Object obj2 = dqVar.f;
                        short s7 = (short) 86;
                        short s8 = (short) 565;
                        try {
                            byte[] bArr5 = v;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            z(s7, s8, (byte) (-bArr5[687]), objArr17);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            z((short) (bArr5[593] + 1), (short) 573, (byte) 59, objArr18);
                            invoke = cls5.getMethod((java.lang.String) objArr18[0], null).invoke(obj2, null);
                            dqVar.j = invoke;
                            dqVar.a(6);
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause3 = th8.getCause();
                            if (cause3 == null) {
                                throw th8;
                            }
                            throw cause3;
                        }
                    case -6:
                        short s9 = (short) 86;
                        short s10 = (short) 565;
                        try {
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            z(s9, s10, (byte) (-v[687]), objArr19);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            z(r12[694], (short) 569, (byte) 59, objArr20);
                            invoke = cls6.getMethod((java.lang.String) objArr20[0], null).invoke(null, null);
                            dqVar.j = invoke;
                            dqVar.a(6);
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause4 = th9.getCause();
                            if (cause4 == null) {
                                throw th9;
                            }
                            throw cause4;
                        }
                    case -5:
                        i3 = 13;
                    case -4:
                        i3 = 5;
                    case -3:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i3 = 4;
                        }
                    case -2:
                        dqVar.e = q ? 1 : 0;
                        dqVar.a(4);
                    case -1:
                        i3 = 32;
                    default:
                }
            }
            throw th;
        } catch (java.lang.Throwable th10) {
            java.lang.Throwable cause5 = th10.getCause();
            if (cause5 == null) {
                throw th10;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0133. Please report as an issue. */
    private static void c(android.content.Context context, java.lang.String str, java.lang.String str2, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        int i2;
        java.lang.Object obj;
        java.lang.Object bVar;
        com.facetec.sdk.dq dqVar = new com.facetec.sdk.dq(context, str, str2, initializeCallback);
        byte[] bArr = v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        z((short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS, (short) 393, bArr[34], objArr);
        char c2 = 0;
        java.lang.String str3 = (java.lang.String) objArr[0];
        short s2 = (short) 1293;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        z(s2, (short) 581, bArr[38], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            char c3 = 666;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s4 = (short) 577;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            z((short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL), s4, (byte) (-bArr[662]), objArr5);
            java.lang.String str4 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str3, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                short s5 = (short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                short s6 = (short) 565;
                byte[] bArr2 = v;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                z(s5, s6, bArr2[c3], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                java.lang.Object[] objArr10 = objArr7;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                z((short) 1258, (short) 575, (byte) 74, objArr11);
                java.lang.String str5 = (java.lang.String) objArr11[0];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                z(s2, s3, bArr2[666], objArr12);
                java.lang.Object invoke = cls2.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr8);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                z(s5, s6, bArr2[666], objArr13);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                z((short) 1252, (short) 574, (byte) (bArr2[666] - 1), objArr14);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                i3++;
                objArr7 = objArr10;
                c2 = 0;
                c3 = 666;
            }
            int i4 = 0;
            while (true) {
                int i5 = 6;
                switch (dqVar.a(iArr[i4])) {
                    case -28:
                        i4 = 31;
                    case -27:
                        i4 = 55;
                    case -26:
                        dqVar.a(5);
                        i4 = dqVar.b == 0 ? 54 : i4 + 1;
                    case -25:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        w = dqVar.b;
                    case -24:
                        i2 = x;
                        dqVar.e = i2;
                        i5 = 4;
                        dqVar.a(i5);
                    case -23:
                        i4 = 33;
                    case -22:
                        i4 = 45;
                    case -21:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i4 = 44;
                        }
                    case -20:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        x = dqVar.b;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i2 = w;
                        dqVar.e = i2;
                        i5 = 4;
                        dqVar.a(i5);
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        break;
                    case -17:
                        i4 = 1;
                    case -16:
                        i4 = 46;
                    case -15:
                        obj = com.facetec.sdk.bj.c.REJECTED;
                        dqVar.j = obj;
                        dqVar.a(i5);
                    case -14:
                        i4 = 35;
                    case -13:
                        dqVar.e = 3;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context2 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback2 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                        dqVar.a(2);
                        a(context2, initializeCallback2, dqVar.b != 0);
                    case -12:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context3 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        com.facetec.sdk.d.c(context3, (com.facetec.sdk.d.b) dqVar.f);
                    case -11:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        com.facetec.sdk.d.b bVar2 = (com.facetec.sdk.d.b) dqVar.f;
                        dqVar.a(7);
                        bVar2.f3490a = (java.lang.Boolean) dqVar.f;
                    case -10:
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        z((short) 369, (short) 565, v[666], objArr15);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        z((short) 353, s4, (byte) 26, objArr16);
                        obj = cls4.getField((java.lang.String) objArr16[0]).get(null);
                        dqVar.j = obj;
                        dqVar.a(i5);
                    case -9:
                        bVar = new com.facetec.sdk.d.b();
                        dqVar.j = bVar;
                        dqVar.a(6);
                    case -8:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        g = (com.facetec.sdk.bj.c) dqVar.f;
                    case -7:
                        bVar = com.facetec.sdk.bj.c.VALIDATED;
                        dqVar.j = bVar;
                        dqVar.a(6);
                    case -6:
                        i4 = 22;
                    case -5:
                        i4 = 8;
                    case -4:
                        dqVar.a(12);
                        if (dqVar.b == 0) {
                            i4 = 7;
                        }
                    case -3:
                        bVar = com.facetec.sdk.ca.c.VALIDATED;
                        dqVar.j = bVar;
                        dqVar.a(6);
                    case -2:
                        dqVar.e = 3;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context4 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        java.lang.String str6 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        bVar = com.facetec.sdk.ca.a(context4, str6, (java.lang.String) dqVar.f);
                        dqVar.j = bVar;
                        dqVar.a(6);
                    case -1:
                        i4 = 28;
                    default:
                }
                return;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void c(android.content.Context context, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        com.facetec.sdk.dq dqVar = new com.facetec.sdk.dq(context, initializeCallback);
        byte[] bArr = v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        z((short) 700, (short) 438, bArr[34], objArr);
        int i2 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s2 = (short) 1293;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        z(s2, (short) 581, bArr[38], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            char c2 = 666;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            z((short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL), (short) 577, (byte) (-bArr[662]), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                short s4 = (short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                short s5 = (short) 565;
                byte[] bArr2 = v;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                z(s4, s5, bArr2[c2], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[i2]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                z((short) 1258, (short) 575, (byte) 74, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                z(s2, s3, bArr2[666], objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                z(s4, s5, bArr2[666], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                z((short) 1252, (short) 574, (byte) (bArr2[666] - 1), objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i3++;
                i2 = 0;
                c2 = 666;
            }
            while (true) {
                int i4 = i2;
                while (true) {
                    i2 = i4 + 1;
                    try {
                    } catch (java.lang.Throwable th) {
                        if (i4 < 24 || i4 >= 27) {
                            throw th;
                        }
                        dqVar.j = th;
                        dqVar.a(63);
                        i4 = 22;
                    }
                    switch (dqVar.a(iArr[i4])) {
                        case -17:
                            i4 = 40;
                        case -16:
                            dqVar.a(39);
                            int i5 = dqVar.b;
                            if (i5 != 16 && i5 == 87) {
                                i2 = 9;
                                break;
                            } else {
                                i2 = 23;
                                break;
                            }
                            break;
                        case -15:
                            i4 = 1;
                        case -14:
                            i4 = 39;
                        case -13:
                            dqVar.a(5);
                            if (dqVar.b == 0) {
                                i4 = 38;
                            }
                            break;
                        case -12:
                            dqVar.a(8);
                            throw ((java.lang.Throwable) dqVar.f);
                            break;
                        case -11:
                            i4 = 41;
                        case -10:
                            i4 = 43;
                        case -9:
                            dqVar.a(5);
                            if (dqVar.b != 0) {
                                break;
                            } else {
                                i2 = 21;
                                break;
                            }
                        case -8:
                            dqVar.e = 1;
                            dqVar.a(1);
                            dqVar.a(2);
                            w = dqVar.b;
                            break;
                        case -7:
                            dqVar.e = x;
                            dqVar.a(4);
                            break;
                        case -6:
                            return;
                        case -5:
                            i4 = 27;
                        case -4:
                            i4 = 11;
                        case -3:
                            dqVar.e = 2;
                            dqVar.a(1);
                            dqVar.a(7);
                            android.content.Context context2 = (android.content.Context) dqVar.f;
                            dqVar.a(7);
                            com.facetec.sdk.aw.b(new java.lang.Object[]{context2, (com.facetec.sdk.aw.e) dqVar.f}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), 232603451, -232603451, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b());
                            break;
                        case -2:
                            dqVar.e = 2;
                            dqVar.a(1);
                            dqVar.a(7);
                            final android.content.Context context3 = (android.content.Context) dqVar.f;
                            dqVar.a(7);
                            final com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback2 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                            dqVar.j = new com.facetec.sdk.aw.e() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda11
                                @Override // com.facetec.sdk.aw.e
                                public final void onCompletion(com.facetec.sdk.aw.a aVar, java.lang.String str4) {
                                    com.facetec.sdk.bj.d(context3, initializeCallback2, aVar, str4);
                                }
                            };
                            dqVar.a(6);
                            break;
                        case -1:
                            i4 = 6;
                    }
                }
            }
            throw th;
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0376, code lost:
    
        if (r0 == 76) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        java.lang.Object obj;
        int i2;
        com.facetec.sdk.dq dqVar = new com.facetec.sdk.dq(context, str, str2, str3, initializeCallback);
        int i3 = B;
        byte[] bArr = v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        z((short) 1135, (short) (i3 & 927), bArr[34], objArr);
        int i4 = 0;
        java.lang.String str4 = (java.lang.String) objArr[0];
        short s2 = (short) 1293;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        z(s2, (short) 581, bArr[38], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            char c2 = 666;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            z((short) (i3 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL), (short) 577, (byte) (-bArr[662]), objArr5);
            java.lang.String str5 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str4, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i5]};
                short s4 = (short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                short s5 = (short) 565;
                byte[] bArr2 = v;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                z(s4, s5, bArr2[c2], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[i4]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                z((short) 1258, (short) 575, (byte) 74, objArr10);
                java.lang.String str6 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                z(s2, s3, bArr2[666], objArr11);
                java.lang.Object invoke = cls2.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                z(s4, s5, bArr2[666], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                z((short) 1252, (short) 574, (byte) (bArr2[666] - 1), objArr13);
                iArr[i5] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i5++;
                i4 = 0;
                c2 = 666;
            }
            int i6 = i4;
            while (true) {
                int i7 = i6 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    if (i6 < 69 || i6 >= 72) {
                        throw th;
                    }
                    dqVar.j = th;
                    i6 = 63;
                    dqVar.a(63);
                }
                switch (dqVar.a(iArr[i6])) {
                    case -54:
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    case -53:
                        dqVar.a(39);
                        int i8 = dqVar.b;
                        if (i8 != 23) {
                            break;
                        }
                        i6 = 8;
                    case -52:
                        i6 = 118;
                    case -51:
                        dqVar.a(39);
                        int i9 = dqVar.b;
                        if (i9 != 76 && i9 == 83) {
                            i7 = 64;
                            i6 = i7;
                        }
                        i6 = 29;
                        break;
                    case -50:
                        i6 = 113;
                    case -49:
                        dqVar.a(39);
                        i7 = dqVar.b != 0 ? 18 : 90;
                        i6 = i7;
                    case -48:
                        i6 = 108;
                    case -47:
                        dqVar.a(39);
                        i7 = dqVar.b != 29 ? 35 : 53;
                        i6 = i7;
                    case -46:
                        i6 = 103;
                    case -45:
                        dqVar.a(39);
                        if (dqVar.b != 49) {
                            i6 = 8;
                        }
                        i6 = 11;
                    case -44:
                        i6 = 15;
                    case -43:
                        i6 = 99;
                    case -42:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i7 = 98;
                        }
                        i6 = i7;
                    case -41:
                        i6 = 104;
                    case -40:
                        i6 = 106;
                    case -39:
                        dqVar.a(12);
                        if (dqVar.b == 0) {
                            i7 = 89;
                        }
                        i6 = i7;
                    case -38:
                        i6 = 1;
                    case -37:
                        i6 = 83;
                    case -36:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i7 = 82;
                        }
                        i6 = i7;
                    case -35:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        x = dqVar.b;
                        i6 = i7;
                    case -34:
                        i2 = w;
                        dqVar.e = i2;
                        dqVar.a(4);
                        i6 = i7;
                    case -33:
                        dqVar.e = 5;
                        dqVar.a(1);
                        dqVar.a(7);
                        final java.lang.String str7 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        final android.content.Context context2 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        final com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback2 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                        dqVar.a(7);
                        final java.lang.String str8 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        final java.lang.String str9 = (java.lang.String) dqVar.f;
                        obj = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.d(str7, context2, initializeCallback2, str8, str9);
                            }
                        };
                        dqVar.j = obj;
                        dqVar.a(6);
                        i6 = i7;
                    case -32:
                        dqVar.a(8);
                        throw ((java.lang.Throwable) dqVar.f);
                        break;
                    case -31:
                        i6 = 119;
                    case -30:
                        i6 = 121;
                    case -29:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i7 = 62;
                        }
                        i6 = i7;
                    case -28:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        w = dqVar.b;
                        i6 = i7;
                    case -27:
                        i2 = x;
                        dqVar.e = i2;
                        dqVar.a(4);
                        i6 = i7;
                    case -26:
                        i6 = 72;
                    case -25:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        final android.content.Context context3 = (android.content.Context) dqVar.f;
                        dqVar.j = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda10
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.p(context3);
                            }
                        };
                        dqVar.a(6);
                        i6 = i7;
                    case -24:
                        i6 = 40;
                    case -23:
                        i6 = 49;
                    case -22:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        obj = com.facetec.sdk.dk.e((java.lang.Runnable) dqVar.f);
                        dqVar.j = obj;
                        dqVar.a(6);
                        i6 = i7;
                    case -21:
                        dqVar.e = 5;
                        dqVar.a(1);
                        dqVar.a(7);
                        final java.lang.String str10 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        final android.content.Context context4 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        final com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback3 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                        dqVar.a(7);
                        final java.lang.String str11 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        final java.lang.String str12 = (java.lang.String) dqVar.f;
                        obj = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.d(str10, context4, initializeCallback3, str11, str12);
                            }
                        };
                        dqVar.j = obj;
                        dqVar.a(6);
                        i6 = i7;
                    case -20:
                        i6 = 109;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i6 = 111;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i6 = 28;
                        }
                        i6 = i7;
                    case -17:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        i2 = h((android.content.Context) dqVar.f);
                        dqVar.e = i2;
                        dqVar.a(4);
                        i6 = i7;
                    case -16:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        k = (com.facetec.sdk.bj.e) dqVar.f;
                        i6 = i7;
                    case -15:
                        obj = com.facetec.sdk.bj.e.LICENSE;
                        dqVar.j = obj;
                        dqVar.a(6);
                        i6 = i7;
                    case -14:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        e = (java.lang.String) dqVar.f;
                        i6 = i7;
                    case -13:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context5 = (android.content.Context) dqVar.f;
                        dqVar.a(2);
                        e(context5, dqVar.b != 0);
                        i6 = i7;
                    case -12:
                        i6 = 114;
                    case -11:
                        i6 = 116;
                    case -10:
                        dqVar.a(15);
                        if (dqVar.b == 0) {
                            i7 = 14;
                        }
                        i6 = i7;
                    case -9:
                        return;
                    case -8:
                        dqVar.e = 3;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context6 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback4 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                        dqVar.a(2);
                        a(context6, initializeCallback4, dqVar.b != 0);
                        i6 = i7;
                    case -7:
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                    case -6:
                        i6 = 126;
                    case -5:
                        dqVar.a(12);
                        if (dqVar.b == 0) {
                            i6 = 7;
                        }
                        i6 = i7;
                    case -4:
                        obj = com.facetec.sdk.bj.c.VALIDATED;
                        dqVar.j = obj;
                        dqVar.a(6);
                        i6 = i7;
                    case -3:
                        obj = g;
                        dqVar.j = obj;
                        dqVar.a(6);
                        i6 = i7;
                    case -2:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        l = dqVar.b != 0;
                        i6 = i7;
                    case -1:
                        i6 = 45;
                    default:
                        i6 = i7;
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(android.content.Context context, java.lang.String str, java.lang.String str2, com.facetec.sdk.bk bkVar, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        java.lang.Object obj;
        int i2;
        java.lang.Object obj2;
        int i3;
        int i4;
        boolean z;
        com.facetec.sdk.dq dqVar = new com.facetec.sdk.dq(context, str, str2, bkVar, initializeCallback);
        byte[] bArr = v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        z((short) 1874, bArr[38], bArr[34], objArr);
        char c2 = 0;
        java.lang.String str3 = (java.lang.String) objArr[0];
        short s2 = (short) 1293;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        z(s2, (short) 581, bArr[38], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            char c3 = 666;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            z((short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL), (short) 577, (byte) (-bArr[662]), objArr5);
            java.lang.String str4 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            z(s2, s3, bArr[666], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str3, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i5]};
                short s4 = (short) (B | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                short s5 = (short) 565;
                byte[] bArr2 = v;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                z(s4, s5, bArr2[c3], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                z((short) 1258, (short) 575, (byte) 74, objArr10);
                java.lang.String str5 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                z(s2, s3, bArr2[666], objArr11);
                java.lang.Object invoke = cls2.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                z(s4, s5, bArr2[666], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                z((short) 1252, (short) 574, (byte) (bArr2[666] - 1), objArr13);
                iArr[i5] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i5++;
                c2 = 0;
                c3 = 666;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                switch (dqVar.a(iArr[i6])) {
                    case -79:
                        i7 = 160;
                    case -78:
                        dqVar.a(39);
                        i7 = dqVar.b != 0 ? 37 : 137;
                    case -77:
                        i7 = 155;
                    case -76:
                        dqVar.a(39);
                        int i8 = dqVar.b;
                        i7 = (i8 == 0 || i8 != 1) ? 66 : 101;
                    case -75:
                        i7 = 150;
                    case -74:
                        dqVar.a(39);
                        i7 = dqVar.b != 26 ? 126 : 52;
                    case -73:
                        i6 = 34;
                    case -72:
                        i7 = 149;
                    case -71:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i7 = 148;
                        }
                    case -70:
                        i7 = 42;
                    case -69:
                        i7 = 136;
                    case -68:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i7 = 135;
                        }
                    case -67:
                        i7 = 98;
                    case -66:
                        i7 = 121;
                    case -65:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i7 = 120;
                        }
                    case -64:
                        i7 = 60;
                    case -63:
                        i7 = 110;
                    case -62:
                        dqVar.a(28);
                        if (dqVar.b == 0) {
                            i7 = 109;
                        }
                    case -61:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        x = dqVar.b;
                    case -60:
                        i2 = w;
                        dqVar.e = i2;
                        dqVar.a(4);
                    case -59:
                        i6 = 1;
                    case -58:
                        return;
                    case -57:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        final android.content.Context context2 = (android.content.Context) dqVar.f;
                        obj = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.q(context2);
                            }
                        };
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -56:
                        i7 = 111;
                    case -55:
                        obj = com.facetec.sdk.c.INIT_FAIL_DEVICE_NOT_SUPPORTED;
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -54:
                        i7 = 85;
                    case -53:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        obj = com.facetec.sdk.dk.e((java.lang.Runnable) dqVar.f);
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -52:
                        dqVar.e = 3;
                        dqVar.a(1);
                        dqVar.a(7);
                        final java.lang.String str6 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        final android.content.Context context3 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        final com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback2 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                        dqVar.j = new java.lang.Runnable() { // from class: com.facetec.sdk.bj$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.bj.b(str6, context3, initializeCallback2);
                            }
                        };
                        dqVar.a(6);
                    case -51:
                        i7 = 76;
                    case -50:
                        i7 = 71;
                    case -49:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i7 = 70;
                        }
                    case -48:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        i2 = h((android.content.Context) dqVar.f);
                        dqVar.e = i2;
                        dqVar.a(4);
                    case -47:
                        i7 = 94;
                    case -46:
                        obj = com.facetec.sdk.bj.c.REJECTED;
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -45:
                        i7 = 156;
                    case -44:
                        i7 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -43:
                        dqVar.a(15);
                        if (dqVar.b == 0) {
                            i7 = 59;
                        }
                    case -42:
                        obj = e;
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -41:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        k = (com.facetec.sdk.bj.e) dqVar.f;
                    case -40:
                        obj = com.facetec.sdk.bj.e.NETWORK;
                        dqVar.j = obj;
                        dqVar.a(6);
                    case -39:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        e = (java.lang.String) dqVar.f;
                    case -38:
                        i7 = 96;
                    case -37:
                        dqVar.e = 3;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context4 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback3 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) dqVar.f;
                        dqVar.a(2);
                        a(context4, initializeCallback3, dqVar.b != 0);
                    case -36:
                        obj2 = com.facetec.sdk.c.INIT_SKIPPED_APP_VALIDATED;
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -35:
                        i3 = 151;
                        i7 = i3;
                    case -34:
                        i3 = 153;
                        i7 = i3;
                    case -33:
                        dqVar.a(12);
                        if (dqVar.b == 0) {
                            i3 = 41;
                            i7 = i3;
                        }
                    case -32:
                        obj2 = com.facetec.sdk.bj.c.VALIDATED;
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -31:
                        obj2 = g;
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -30:
                        i6 = 37;
                    case -29:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        g = (com.facetec.sdk.bj.c) dqVar.f;
                    case -28:
                        obj2 = com.facetec.sdk.bj.c.NEVER_VALIDATED;
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -27:
                        i3 = 161;
                        i7 = i3;
                    case -26:
                        i3 = 163;
                        i7 = i3;
                    case -25:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i3 = 33;
                            i7 = i3;
                        }
                    case -24:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        java.lang.Object obj3 = dqVar.f;
                        dqVar.a(7);
                        java.lang.Object[] objArr14 = {dqVar.f};
                        byte[] bArr3 = v;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        z(s2, s3, bArr3[666], objArr15);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        z((short) 1163, (short) 574, (byte) (bArr3[686] + 1), objArr16);
                        java.lang.String str7 = (java.lang.String) objArr16[0];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        z((short) 1156, (short) 560, bArr3[666], objArr17);
                        i4 = ((java.lang.Boolean) cls4.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr17[0])).invoke(obj3, objArr14)).booleanValue();
                        dqVar.e = i4;
                        dqVar.a(4);
                    case -23:
                        obj2 = "com.facetec.zoomlogin";
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -22:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        java.lang.Object obj4 = dqVar.f;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        z((short) 1198, (short) 559, (byte) (-v[687]), objArr18);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        z((short) 1176, (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, (byte) 59, objArr19);
                        obj2 = cls5.getMethod((java.lang.String) objArr19[0], null).invoke(obj4, null);
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -21:
                        dqVar.e = 4;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context5 = (android.content.Context) dqVar.f;
                        dqVar.a(7);
                        com.facetec.sdk.c cVar = (com.facetec.sdk.c) dqVar.f;
                        dqVar.a(7);
                        java.lang.String str8 = (java.lang.String) dqVar.f;
                        dqVar.a(7);
                        com.facetec.sdk.t.c(context5, cVar, str8, (java.lang.Throwable) dqVar.f);
                    case -20:
                        obj2 = com.facetec.sdk.c.INIT_START;
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        android.content.Context context6 = (android.content.Context) dqVar.f;
                        dqVar.a(2);
                        e(context6, dqVar.b != 0);
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        com.facetec.sdk.t.b = (java.lang.String) dqVar.f;
                    case -17:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        obj2 = dqVar.f.toString();
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -16:
                        short s6 = (short) 1220;
                        short s7 = (short) com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
                        byte[] bArr4 = v;
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        z(s6, s7, bArr4[666], objArr20);
                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        z((short) 1207, (short) 572, bArr4[694], objArr21);
                        obj2 = cls6.getMethod((java.lang.String) objArr21[0], null).invoke(null, null);
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -15:
                        i6 = 20;
                    case -14:
                        i6 = 16;
                    case -13:
                        dqVar.a(5);
                        i6 = dqVar.b == 0 ? 15 : i7;
                    case -12:
                        dqVar.e = 2;
                        dqVar.a(1);
                        dqVar.a(7);
                        java.lang.Object obj5 = dqVar.f;
                        dqVar.a(7);
                        z = obj5.equals(dqVar.f);
                        i4 = z;
                        dqVar.e = i4;
                        dqVar.a(4);
                    case -11:
                        obj2 = "";
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -10:
                        obj2 = com.facetec.sdk.t.b;
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -9:
                        dqVar.a(8);
                        throw ((java.lang.Throwable) dqVar.f);
                    case -8:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(7);
                        java.lang.Object[] objArr22 = {dqVar.f};
                        byte[] bArr5 = v;
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        z((short) 1245, (short) 556, bArr5[666], objArr23);
                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        z(s2, s3, bArr5[666], objArr24);
                        obj2 = cls7.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr24[0])).newInstance(objArr22);
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -7:
                        obj2 = "FaceTec: Development mode not supported in minimal library";
                        dqVar.j = obj2;
                        dqVar.a(6);
                    case -6:
                        i6 = 10;
                    case -5:
                        i6 = 7;
                    case -4:
                        dqVar.a(5);
                        if (dqVar.b == 0) {
                            i6 = 6;
                        }
                    case -3:
                        z = d();
                        i4 = z;
                        dqVar.e = i4;
                        dqVar.a(4);
                    case -2:
                        dqVar.e = 1;
                        dqVar.a(1);
                        dqVar.a(2);
                        l = dqVar.b != 0;
                    case -1:
                        i6 = 90;
                    default:
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
