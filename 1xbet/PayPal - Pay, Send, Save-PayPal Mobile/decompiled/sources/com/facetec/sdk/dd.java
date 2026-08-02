package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class dd extends com.facetec.sdk.au {

    /* renamed from: a, reason: collision with root package name */
    android.widget.ImageView f3502a;
    android.widget.ImageView b;
    android.widget.ImageView c;
    android.widget.ImageView d;
    android.widget.LinearLayout e;
    android.widget.TextView f;
    android.widget.TextView g;
    android.widget.TextView h;
    android.widget.TextView i;
    android.widget.LinearLayout j;
    com.facetec.sdk.di k;
    android.graphics.drawable.GradientDrawable l;
    android.widget.TextView m;
    android.widget.TextView n;

    /* renamed from: o, reason: collision with root package name */
    android.graphics.Bitmap f3503o;
    private android.widget.ImageView p;
    private android.widget.LinearLayout q;
    private android.widget.LinearLayout r;
    private android.widget.LinearLayout s;
    private android.widget.TextView u;
    private androidx.core.graphics.drawable.RoundedBitmapDrawable x;
    boolean t = false;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener y = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.dd.4
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;

        /* renamed from: a, reason: collision with root package name */
        private static int f3504a;
        private static long b;
        private static int d;
        private static char[] e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(byte b2, int i, byte b3) {
            int i2;
            int i3 = b3 + 102;
            int i4 = b2 + 4;
            int i5 = i * 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i6;
                int i8 = 0;
                i3 += i7;
                i2 = i8;
                i4++;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i6) {
                    return new java.lang.String(bArr2, 0);
                }
                i7 = bArr[i4];
                i3 += i7;
                i2 = i8;
                i4++;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                i4++;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void g(short s, byte b2, int i, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4;
            byte[] bArr = $$a;
            int i5 = (s * 4) + 4;
            int i6 = 1 - (b2 * 2);
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                i3 = i5;
                int i7 = i6;
                i4 = 0;
                i5 += -i7;
                i3++;
                i2 = i4;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i4 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i3];
                i5 += -i7;
                i3++;
                i2 = i4;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i4 == i6) {
                }
            } else {
                int i8 = 99 - (i * 2);
                i2 = 0;
                i3 = i5;
                i5 = i8;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i4 == i6) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{60, 118, 94, 10};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
        }

        static void init$1() {
            $$c = new byte[]{126, 75, -119, -91};
            $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
        }

        private static void f(char c, int i, int i2, java.lang.Object[] objArr) {
            com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
            long[] jArr = new long[i2];
            hhVar.e = 0;
            $10 = ($11 + 41) % 128;
            while (hhVar.e < i2) {
                int i3 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(e[i + i3])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                    if (d2 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 45150), android.view.View.MeasureSpec.getSize(0) + 2150, android.view.View.MeasureSpec.getSize(0) + 24, 1926116241, false, $$e(b2, b3, (byte) (b3 + 3)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(b), java.lang.Integer.valueOf(c)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                    if (d3 == null) {
                        byte b4 = (byte) (-1);
                        d3 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.graphics.Color.red(0) + 1834, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, -1880730373, false, $$e(b4, (byte) (b4 + 1), (byte) $$c.length), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                    if (d4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        d4 = com.facetec.sdk.al.c((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.graphics.Color.argb(0, 0, 0, 0) + 2341, 24 - android.text.TextUtils.indexOf("", ""), -1839099840, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
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
                int i4 = $11 + 77;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr[hhVar.e] = (char) jArr[hhVar.e];
                    java.lang.Object[] objArr5 = {hhVar, hhVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
                    if (d5 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2341 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 25 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1839099840, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                    throw null;
                }
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr6 = {hhVar, hhVar};
                java.lang.Object d6 = com.facetec.sdk.al.d(898558648);
                if (d6 == null) {
                    byte b9 = (byte) (-1);
                    byte b10 = (byte) (b9 + 1);
                    d6 = com.facetec.sdk.al.c((char) android.view.KeyEvent.keyCodeFromString(""), 2341 - android.text.TextUtils.getOffsetAfter("", 0), 24 - android.view.Gravity.getAbsoluteGravity(0, 0), -1839099840, false, $$e(b9, b10, b10), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d6).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f3504a = (d + 103) % 128;
            com.facetec.sdk.dd.this.d();
            if (com.facetec.sdk.dd.this.t) {
                return;
            }
            com.facetec.sdk.dd.this.t = true;
            com.facetec.sdk.dd.this.a();
            int i = d + 105;
            f3504a = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 / 0;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            d = 0;
            f3504a = 1;
            e = new char[]{27763, 58346, 29528, 49910, 21108, 41440, 12655, 33000, 4199, 26611, 63303, 18132, 54864, 9683, 46421, 1236, 37982, 60364, 31560, 17539, 51990, 23451, 59913, 31377, 35093, 6529, 43047, 14467, 20253, 57262, 28208, 65202, 3366, 40377, 11326, 48289, 49973, 22470, 55370, 18629, 63836, 27076, 39489, 2769, 47900, 11216, 23631, 52375, 32066, 60902, 7778, 36600, 16237, 33068, 3827, 40572, 12281, 48928, 19687, 56436, 28132, 64885, 35581, 6769, 43917, 15171, 51393, 22603, 59867, 31060, 1695, 38465, 10184, 46942, 17631, 54312, 26024, 62764, 33511, 4654, 41895, 13093, 49318, 20540, 57776, 28951, 65215, 36369, 8088, 44814, 15503, 52244, 23940, 44407, 8949, 45679, 27701, 58345, 29550, 49916, 21109, 41402, 12667, 33014, 4209, 26542, 63343, 18142, 54860, 9683, 46421, 1243, 37893, 60367, 31576, 51921, 23111, 43462, 14653, 34944, 6199, 28607, 65333, 20137, 56866, 11688, 48420, 35344, 27701, 58346, 29541, 49888, 21049, 41470, 12653, 33021, 4204, 26596, 63336, 18068, 54874, 9688, 46418, 1218, 37965, 60294, 31576, 51921, 23111, 43462, 14641, 34993, 6197, 28670, 65312, 20153, 56879, 11694, 48425, 3241, 39965, 5030, 25363, 62109};
            b = -5566256048520174695L;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x07b6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x07c0 A[Catch: Exception -> 0x0a4c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0a4c, blocks: (B:40:0x0740, B:46:0x07c0, B:49:0x0884, B:52:0x0899, B:55:0x0908, B:58:0x09bd), top: B:39:0x0740 }] */
        /* JADX WARN: Type inference failed for: r21v0, types: [long] */
        /* JADX WARN: Type inference failed for: r21v1 */
        /* JADX WARN: Type inference failed for: r21v2 */
        /* JADX WARN: Type inference failed for: r21v7 */
        /* JADX WARN: Type inference failed for: r5v57, types: [int] */
        /* JADX WARN: Type inference failed for: r5v58 */
        /* JADX WARN: Type inference failed for: r5v72, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v74 */
        /* JADX WARN: Type inference failed for: r5v76, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v87, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v90, types: [boolean] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] c(int i, int i2) {
            java.lang.Object[] objArr;
            java.lang.Object[] objArr2;
            int i3;
            java.lang.CharSequence charSequence;
            java.lang.String str;
            ?? r5;
            java.io.File file;
            java.lang.CharSequence charSequence2;
            java.io.File file2;
            java.io.FileReader fileReader;
            java.io.BufferedReader bufferedReader;
            java.io.BufferedReader bufferedReader2;
            java.io.FileReader fileReader2;
            int i4 = ~i;
            com.facetec.sdk.fl.AnonymousClass18.d();
            try {
                char maximumDrawingCacheSize = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int indexOf = android.text.TextUtils.indexOf("", "", 0);
                int myPid = android.os.Process.myPid() >> 22;
                int i5 = myPid * (-300);
                int i6 = myPid | 19;
                int i7 = ~myPid;
                int i8 = ~((i7 & i) | (i7 ^ i));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                f(maximumDrawingCacheSize, indexOf, (i5 & 5738) + (i5 | 5738) + ((~((i6 ^ i) | (i6 & i))) * (-301)) + (((~((myPid & i4) | (i4 ^ myPid))) | (~((i ^ (-20)) | (i & (-20))))) * (-301)) + (((i8 & (-20)) | (i8 ^ (-20))) * 301), objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                f((char) (10477 - (~(-(-android.view.Gravity.getAbsoluteGravity(0, 0))))), 18 - (~(-android.view.KeyEvent.getDeadChar(0, 0))), android.view.View.MeasureSpec.getSize(0) + 18, objArr4);
                java.lang.String[] strArr = {(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                int i9 = 0;
                while (true) {
                    if (i9 >= 2) {
                        objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[1]};
                        int i10 = (((((~((-894522036) | i4)) | 827330608) | r5) * (-502)) - 467163901) + (((~((-2632013) | i)) | (~((-67191428) | i4))) * 502);
                        int d2 = com.facetec.sdk.fl.AnonymousClass18.d();
                        int i11 = i10 * (-129);
                        int i12 = i2 * 131;
                        int i13 = ~i2;
                        int i14 = ~d2;
                        int i15 = (i13 & i10) | (i13 ^ i10);
                        int i16 = ((((i11 & i12) + (i11 | i12)) + ((~(((i13 & i14) | (i13 ^ i14)) | i10)) * 130)) - (~((~i15) * (-260)))) - 1;
                        int i17 = ~i10;
                        int i18 = ((~((d2 ^ i15) | (d2 & i15))) | (~((i17 ^ i2) | (i17 & i2)))) * 130;
                        int i19 = ((i16 | i18) << 1) - (i18 ^ i16);
                        int i20 = i19 << 13;
                        int i21 = (~(i20 & i19)) & (i20 | i19);
                        int i22 = i21 >>> 17;
                        int i23 = (~(i21 & i22)) & (i21 | i22);
                        int i24 = i23 << 5;
                        ((int[]) objArr[3])[0] = (~(i23 & i24)) & (i23 | i24);
                        break;
                    }
                    java.lang.String str2 = strArr[i9];
                    char argb = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 15293);
                    int i25 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i26 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f(argb, (i25 & 37) + (i25 | 37), (i26 ^ 17) + ((i26 & 17) << 1), objArr5);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    if (((java.lang.Boolean) cls.getMethod(str2, new java.lang.Class[0]).invoke(cls, null)).booleanValue()) {
                        com.facetec.sdk.fl.AnonymousClass18.d();
                        objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i ^ 1}, new int[]{(~(r5 & r7)) & r11}};
                        int i27 = ((((~((-95038045) | i4)) | (~((-729660552) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) - 1189656452) + (((~((-95038045) | i)) | 19408900) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (((~((-729660552) | i4)) | 95038044) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE);
                        int i28 = i27 * (-949);
                        int i29 = ~i27;
                        int i30 = ~((i29 ^ i4) | (i29 & i4));
                        int i31 = ~((i & (-17)) | (i ^ (-17)));
                        int i32 = ((((((i28 | (-15184)) << 1) - (i28 ^ (-15184))) - (~(((i30 & i31) | (i30 ^ i31)) * 1900))) - 1) - (~(-(-(((~((i4 ^ 16) | (i4 & 16))) | (~((i27 ^ i) | (i27 & i)))) * (-950)))))) - 1;
                        int i33 = -(-(((~(i27 | i4)) | (~((i ^ 16) | (i & 16)))) * 950));
                        int i34 = -(-(((i32 | i33) << 1) - (i33 ^ i32)));
                        int i35 = (i2 & i34) + (i34 | i2);
                        int i36 = i35 << 13;
                        int i37 = ((~i36) & i35) | ((~i35) & i36);
                        int i38 = i37 >>> 17;
                        int i39 = (i37 & (~i38)) | ((~i37) & i38);
                        int i40 = i39 << 5;
                        int i41 = i39 | i40;
                        break;
                    }
                    i9++;
                }
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i ^ 2}, new int[1]};
                int i42 = ((((~((-430662593) | i)) | 287834880) * 345) - 228475144) + (((~((-430662593) | i4)) | 106201123) * 345) + ((~((-287834881) | i)) * 345);
                int d3 = com.facetec.sdk.fl.AnonymousClass18.d();
                int i43 = i42 * (-864);
                int i44 = (i43 & 13856) + (i43 | 13856);
                int i45 = ~i42;
                int i46 = ~d3;
                int i47 = ((~((i46 & (-17)) | (i46 ^ (-17)))) | i45) * (-865);
                int i48 = (((i44 ^ i47) + ((i44 & i47) << 1)) - (~((~((d3 & 16) | (d3 ^ 16))) * 865))) - 1;
                int i49 = ~((i45 ^ i46) | (i45 & i46));
                int i50 = ~(i46 | 16);
                int i51 = ((i49 ^ i50) | (i50 & i49)) * 865;
                int i52 = -(-(((i48 | i51) << 1) - (i51 ^ i48)));
                int i53 = (i2 & i52) + (i52 | i2);
                int i54 = i53 << 13;
                int i55 = (~(i54 & i53)) & (i54 | i53);
                int i56 = i55 >>> 17;
                int i57 = (i55 & (~i56)) | ((~i55) & i56);
                int i58 = i57 << 5;
                ((int[]) objArr[3])[0] = (~(i57 & i58)) & (i57 | i58);
            }
            if (i != ((int[]) objArr[2])[0]) {
                int i59 = d;
                int i60 = ((i59 | 47) << 1) - (i59 ^ 47);
                f3504a = i60 % 128;
                if (i60 % 2 != 0) {
                    return objArr;
                }
                throw null;
            }
            try {
                java.lang.Object d4 = com.facetec.sdk.al.d(-1447165611);
                if (d4 == null) {
                    char c = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18950);
                    char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    g(b2, b3, b3, objArr6);
                    d4 = com.facetec.sdk.al.c(c, 2150 - mirror, (windowTouchSlop >> 8) + 24, 240221101, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, null)).longValue();
                long j = -618004067;
                long j2 = 988;
                long j3 = -1;
                ?? r21 = longValue ^ j3;
                long j4 = i;
                long j5 = j4 ^ j3;
                long j6 = (((((com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j) + ((-987) * longValue)) + (((((r21 | j5) | j) ^ j3) | (((j | longValue) | j4) ^ j3)) * j2)) + ((-988) * (j | r21))) + (((j3 ^ ((j5 | j) | longValue)) | (((r21 | j4) ^ j3) | (((j ^ j3) | r21) ^ j3))) * j2)) - 1148040253;
                int i61 = ((int) (j6 >> 32)) & (((((~((-585772560) | i4)) | 2022998970) * (-1042)) - 897439292) + (((-585772560) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-2022998971) | i)) | 1477738928 | (~((-40512518) | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                int nextInt = new java.util.Random().nextInt(674151889);
                int i62 = ~nextInt;
                int i63 = ((int) j6) & ((((~(1155605925 | i62)) | (-281620485)) * 226) + 2055568080 + (((~(i62 | (-268963841))) | (~(281620484 | nextInt)) | 1142949281) * (-113)) + ((~(nextInt | 1155605925)) * 113));
                if (((i61 ^ i63) | (i61 & i63)) == 1) {
                    f3504a = (d + 59) % 128;
                    objArr2 = new java.lang.Object[]{null, new int[]{i}, new int[]{i ^ 10}, new int[1]};
                    int myTid = android.os.Process.myTid();
                    int i64 = ~myTid;
                    int i65 = ((622317488 | myTid) * (-859)) + 772797010 + (((~(myTid | (-68159281))) | (~(622317488 | i64))) * 859) + (((~((-202381108) | i64)) | 134221827) * 859);
                    int i66 = (i65 & 16) + (i65 | 16);
                    int d5 = com.facetec.sdk.fl.AnonymousClass18.d();
                    int i67 = ~d5;
                    int i68 = ~i66;
                    int i69 = ~((i68 ^ i2) | (i68 & i2));
                    int i70 = (((i66 * 193) - (~(-(-(i2 * 193))))) - 1) + (((i69 & i67) | (i69 ^ i67)) * (-192));
                    int i71 = ~i2;
                    int i72 = ~(i68 | i71);
                    int i73 = i67 | i71;
                    int i74 = ~i73;
                    int i75 = ((i72 ^ i74) | (i72 & i74)) * (-384);
                    int i76 = (i71 ^ i68) | (i71 & i68);
                    int i77 = (~((i76 ^ d5) | (i76 & d5))) | (~(i73 | i66));
                    int i78 = i66 | i2;
                    int i79 = ~((i78 ^ d5) | (i78 & d5));
                    int i80 = (((i70 | i75) << 1) - (i70 ^ i75)) + (((i79 ^ i77) | (i79 & i77)) * 192);
                    int i81 = i80 << 13;
                    int i82 = ((~i81) & i80) | ((~i80) & i81);
                    int i83 = i82 >>> 17;
                    int i84 = (i82 & (~i83)) | ((~i82) & i83);
                    int i85 = i84 << 5;
                    int[] iArr = (int[]) objArr2[3];
                    int i86 = (i84 & (~i85)) | ((~i84) & i85);
                    i3 = 0;
                    iArr[0] = i86;
                } else {
                    objArr2 = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[1]};
                    int i87 = (((((~((-971816121) | i4)) | 147100816) | r2) * (-713)) - 239529576) + ((~(971832828 | i)) * 1426) + ((~(147117524 | i4)) * 713);
                    int d6 = com.facetec.sdk.fl.AnonymousClass18.d();
                    int i88 = -(-(i87 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL));
                    int i89 = (i87 ^ (-1)) | i87;
                    int i90 = (~((i89 ^ d6) | (i89 & d6))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                    int i91 = (i88 ^ i90) + ((i88 & i90) << 1);
                    int i92 = ~(~i87);
                    int i93 = -(-(i92 * (-1042)));
                    int i94 = ~d6;
                    int i95 = ~(i94 | (i94 ^ (-1)) | i87);
                    int i96 = -(-((i91 ^ i93) + ((i93 & i91) << 1) + (((i95 ^ i92) | (i95 & i92)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)));
                    int i97 = (i2 ^ i96) + ((i96 & i2) << 1);
                    int i98 = (i97 << 13) ^ i97;
                    int i99 = i98 >>> 17;
                    int i100 = (i98 & (~i99)) | ((~i98) & i99);
                    int i101 = i100 << 5;
                    int[] iArr2 = (int[]) objArr2[3];
                    int i102 = (i100 & (~i101)) | ((~i100) & i101);
                    i3 = 0;
                    iArr2[0] = i102;
                }
                if (i != ((int[]) objArr2[2])[i3]) {
                    int i103 = f3504a + 41;
                    d = i103 % 128;
                    if (i103 % 2 != 0) {
                        int i104 = 96 / i3;
                    }
                    return objArr2;
                }
                try {
                    char c2 = (char) (60696 - (~(-(android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                    int i105 = -android.view.KeyEvent.getDeadChar(i3, i3);
                    int i106 = i105 * (-711);
                    int i107 = (37789 & i106) + (i106 | 37789);
                    int i108 = ~(i105 | (-54));
                    int i109 = ~((i4 ^ i105) | (i4 & i105));
                    int i110 = ((i108 ^ i109) | (i108 & i109)) * (-712);
                    int i111 = ((i107 | i110) << 1) - (i110 ^ i107);
                    int i112 = i4 | (-54);
                    int i113 = ~((i112 ^ i105) | (i112 & i105));
                    int i114 = i105 | 53;
                    int i115 = ~((i114 ^ i) | (i114 & i));
                    int i116 = ((i115 ^ i113) | (i115 & i113)) * (-712);
                    int i117 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int d7 = com.facetec.sdk.fl.AnonymousClass18.d();
                    int i118 = i117 * (-563);
                    int i119 = (i118 & 23165) + (i118 | 23165);
                    int i120 = ~i117;
                    int i121 = ~d7;
                    int i122 = ~((i121 & (-42)) | (i121 ^ (-42)));
                    int i123 = ((i122 ^ i120) | (i122 & i120) | (~((d7 ^ 41) | (d7 & 41)))) * (-564);
                    int i124 = (i120 & 41) | (i120 ^ 41);
                    int i125 = ((((i119 | i123) << 1) - (i119 ^ i123)) - (~(-(-((~((d7 ^ i124) | (i124 & d7))) * 1128))))) - 1;
                    int i126 = ((~((i117 ^ 41) | (i117 & 41))) | (~((i121 & i120) | (i120 ^ i121)))) * 564;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    f(c2, (i111 & i116) + (i116 | i111) + (((i109 & (-54)) | (i109 ^ (-54))) * 712), (i125 & i126) + (i126 | i125), objArr7);
                    file2 = new java.io.File((java.lang.String) objArr7[0]);
                } catch (java.lang.Exception unused2) {
                    r21 = "";
                }
                if (!file2.canRead()) {
                    charSequence2 = "";
                    str = null;
                    charSequence = charSequence2;
                    try {
                        char windowTouchSlop2 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                        int i127 = pressedStateDuration * (-523);
                        int i128 = ((i127 | 25248) << 1) - (i127 ^ 25248);
                        int i129 = ~pressedStateDuration;
                        int i130 = ~((i129 ^ 96) | (i129 & 96));
                        int i131 = ~((pressedStateDuration & (-97)) | (pressedStateDuration ^ (-97)));
                        int i132 = (i130 & i131) | (i130 ^ i131);
                        int i133 = ~((i ^ (-97)) | (i & (-97)));
                        int i134 = -(-(((i132 ^ i133) | (i132 & i133)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                        int i135 = (i128 & i134) + (i128 | i134);
                        int i136 = -(-(i131 * (-786)));
                        int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                        int i138 = i130 | (~(i4 | (-97)));
                        int i139 = -(-(((i131 ^ i138) | (i138 & i131)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                        java.lang.CharSequence charSequence3 = charSequence;
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        f(windowTouchSlop2, (i137 ^ i139) + ((i139 & i137) << 1), android.text.TextUtils.lastIndexOf(charSequence3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, objArr8);
                        r5 = (java.lang.String) objArr8[0];
                        file = new java.io.File((java.lang.String) r5);
                        if (file.canRead()) {
                            try {
                                try {
                                    java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                    char alpha = (char) (58939 - android.graphics.Color.alpha(0));
                                    int threadPriority = android.os.Process.getThreadPriority(0);
                                    int d8 = com.facetec.sdk.fl.AnonymousClass18.d();
                                    int i140 = 7419 - (~(threadPriority * 371));
                                    int i141 = ~threadPriority;
                                    int i142 = ~d8;
                                    int i143 = ~(i141 | i142);
                                    int i144 = ~(d8 | (-21));
                                    int i145 = ((i143 ^ i144) | (i143 & i144)) * (-370);
                                    int i146 = ~((i142 ^ (-21)) | (i142 & (-21)));
                                    int i147 = ~((d8 ^ i141) | (d8 & i141));
                                    int i148 = (i147 ^ i146) | (i147 & i146);
                                    int i149 = ~((threadPriority ^ 20) | (threadPriority & 20));
                                    int i150 = (i140 & i145) + (i140 | i145) + (((i148 ^ i149) | (i148 & i149)) * (-370));
                                    int i151 = i149 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                    int i152 = -((((i150 | i151) << 1) - (i151 ^ i150)) >> 6);
                                    int i153 = (i152 * (-51)) + 6731;
                                    int i154 = ~com.facetec.sdk.fl.AnonymousClass18.d();
                                    int i155 = i154 | i152;
                                    int i156 = (~((i155 & 127) | (i155 ^ 127))) * 52;
                                    int i157 = (i153 & i156) + (i153 | i156);
                                    int i158 = ~((i154 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i154 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                    int i159 = ~((i152 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i152 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                    int i160 = (i158 & i159) | (i158 ^ i159);
                                    int i161 = ~i155;
                                    int i162 = ((i160 ^ i161) | (i160 & i161)) * (-52);
                                    int i163 = (i157 ^ i162) + ((i162 & i157) << 1);
                                    int i164 = ~i152;
                                    int i165 = ~((i154 ^ i164) | (i154 & i164));
                                    int i166 = ~((i164 ^ 127) | (i164 & 127));
                                    int i167 = ((i166 ^ i165) | (i166 & i165)) * 52;
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    f(alpha, (i163 & i167) + (i167 | i163), 0 - (~(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), objArr9);
                                    r5 = readLine.equals((java.lang.String) objArr9[0]);
                                    int i168 = f3504a;
                                    d = ((i168 ^ 89) + ((i168 & 89) << 1)) % 128;
                                    if (r5 != 0) {
                                        char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                        int i169 = -android.view.KeyEvent.getDeadChar(0, 0);
                                        int i170 = (i169 ^ 128) | (i169 & 128);
                                        int i171 = ~i169;
                                        int i172 = ~((i171 ^ (-129)) | (i171 & (-129)));
                                        int i173 = (i171 ^ i4) | (i171 & i4);
                                        int i174 = ~i173;
                                        int i175 = (i172 ^ i174) | (i172 & i174);
                                        int i176 = i169 | 128;
                                        int i177 = ~((i176 ^ i) | (i176 & i));
                                        int i178 = (i169 * 503) + 64384 + (i170 * (-502)) + (((i175 ^ i177) | (i177 & i175)) * (-502));
                                        int i179 = ~(i173 | 128);
                                        int i180 = ~((i170 ^ i) | (i170 & i));
                                        int i181 = -(-(((i180 ^ i179) | (i179 & i180)) * 502));
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        f(packedPositionType, ((i178 | i181) << 1) - (i178 ^ i181), 35 - (~(-android.graphics.Color.argb(0, 0, 0, 0))), objArr10);
                                        r5 = (java.lang.String) objArr10[0];
                                        java.io.File file3 = new java.io.File((java.lang.String) r5);
                                        if (file3.canRead()) {
                                            try {
                                                java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                int lastIndexOf = android.text.TextUtils.lastIndexOf(charSequence3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int d9 = com.facetec.sdk.fl.AnonymousClass18.d();
                                                int i182 = (lastIndexOf * (-721)) - 42495740;
                                                int i183 = ~d9;
                                                int i184 = ~lastIndexOf;
                                                int i185 = ~((-58941) | i184);
                                                int i186 = -(-(((i183 ^ i185) | (i183 & i185) | (~((lastIndexOf ^ 58940) | (lastIndexOf & 58940)))) * 1444));
                                                int i187 = (((i182 | i186) << 1) - (i182 ^ i186)) + (((~((d9 & lastIndexOf) | (lastIndexOf ^ d9))) | (~(lastIndexOf | 58940)) | (~((d9 & 58940) | (d9 ^ 58940)))) * (-1444));
                                                int i188 = ~(i184 | 58940);
                                                int i189 = ~(lastIndexOf | (-58941));
                                                int i190 = ((i188 ^ i189) | (i188 & i189)) * 722;
                                                int lastIndexOf2 = android.text.TextUtils.lastIndexOf(charSequence3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                int d10 = com.facetec.sdk.fl.AnonymousClass18.d();
                                                int i191 = ~makeMeasureSpec;
                                                int i192 = ~((d10 ^ (-2)) | (d10 & (-2)));
                                                int i193 = (((makeMeasureSpec * (-947)) + 949) - (~(-(-(((i192 & i191) | (i191 ^ i192)) * (-948)))))) - 1;
                                                int i194 = (i191 ^ (-2)) | (i191 & (-2));
                                                int i195 = ~d10;
                                                int i196 = -(-((~((i195 ^ i194) | (i195 & i194))) * (-948)));
                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                f((char) (((i187 | i190) << 1) - (i190 ^ i187)), 126 - lastIndexOf2, (((i193 | i196) << 1) - (i196 ^ i193)) + ((makeMeasureSpec | (-2)) * 948), objArr11);
                                                r5 = readLine2.equals((java.lang.String) objArr11[0]);
                                                if (r5 != 0) {
                                                    int i197 = f3504a + 53;
                                                    int i198 = i197 % 128;
                                                    d = i198;
                                                    if (i197 % 2 != 0) {
                                                        throw null;
                                                    }
                                                    if (str != null) {
                                                        f3504a = ((i198 & 17) + (i198 | 17)) % 128;
                                                        java.lang.Object[] objArr12 = {str, new int[]{i}, new int[]{i ^ 20}, new int[]{(~(r1 & r3)) & r4}};
                                                        int i199 = ~(405824960 | i4);
                                                        int i200 = (((~(i4 | (-405824961))) | (~((-418873636) | i4)) | 405799168 | (~(418899427 | i))) * (-84)) + 1379903839 + (((~(i | (-405824961))) | 418873635 | i199) * (-84)) + (((-418899428) | i199) * 84) + 16;
                                                        int i201 = (i2 & i200) + (i2 | i200);
                                                        int i202 = i201 << 13;
                                                        int i203 = (~(i201 & i202)) & (i201 | i202);
                                                        int i204 = i203 >>> 17;
                                                        int i205 = (i203 & (~i204)) | ((~i203) & i204);
                                                        int i206 = i205 << 5;
                                                        int i207 = i205 | i206;
                                                        return objArr12;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            } catch (java.lang.Exception unused3) {
                            }
                        } else {
                            d = (f3504a + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        }
                    } catch (java.lang.Exception unused4) {
                    }
                    r5 = i2;
                    java.lang.Object[] objArr13 = {null, new int[]{i}, new int[]{i}, new int[1]};
                    int i208 = ((((-179350205) | r2) * 764) - 1711957893) + (((~((-179350205) | i4)) | 177242272) * (-1528)) + (((~(1004048800 | i4)) | (-828914461)) * 764);
                    int d11 = com.facetec.sdk.fl.AnonymousClass18.d();
                    int i209 = i208 * 407;
                    int i210 = ~i208;
                    int i211 = ~((i210 & d11) | (i210 ^ d11));
                    int i212 = ~d11;
                    int i213 = ~((i212 ^ i208) | (i212 & i208));
                    int i214 = ((i211 ^ i213) | (i211 & i213)) * (-406);
                    int i215 = ((i209 | i214) << 1) - (i209 ^ i214);
                    int i216 = (~(i210 | i212)) * (-406);
                    int i217 = ~(d11 | (d11 ^ (-1)));
                    int i218 = ~(i208 | i212);
                    int i219 = (i215 & i216) + (i216 | i215) + (((i217 ^ i218) | (i217 & i218)) * 406);
                    int i220 = (i219 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (r5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                    int i221 = ~i219;
                    int i222 = ~r5;
                    int i223 = ~((i221 ^ i222) | (i221 & i222));
                    int i224 = (i4 ^ i222) | (i4 & i222);
                    int i225 = ~i224;
                    int i226 = (i223 ^ i225) | (i223 & i225);
                    int i227 = (i219 ^ r5) | (i219 & r5);
                    int i228 = ~(i227 | i);
                    int i229 = ((i226 ^ i228) | (i226 & i228)) * (-252);
                    int i230 = (i220 & i229) + (i220 | i229) + (i227 * (-252));
                    int i231 = r5 | i219;
                    int i232 = ((~((i ^ i231) | (i & i231))) | (~((i224 & i219) | (i224 ^ i219)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                    int i233 = (i230 & i232) + (i232 | i230);
                    int i234 = i233 << 13;
                    int i235 = ((~i234) & i233) | ((~i233) & i234);
                    int i236 = i235 >>> 17;
                    int i237 = (~(i235 & i236)) & (i235 | i236);
                    ((int[]) objArr13[3])[0] = i237 ^ (i237 << 5);
                    return objArr13;
                }
                try {
                    fileReader = new java.io.FileReader(file2);
                    bufferedReader = new java.io.BufferedReader(fileReader);
                } catch (java.lang.Exception unused5) {
                }
                try {
                    str = bufferedReader.readLine();
                    try {
                        int i238 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int d12 = com.facetec.sdk.fl.AnonymousClass18.d();
                        int i239 = i238 * (-575);
                        int i240 = ~i238;
                        int i241 = ~((i240 ^ (-49411)) | (i240 & (-49411)));
                        int i242 = ~((d12 ^ (-49411)) | (d12 & (-49411)));
                        int i243 = ((((-28410750) & i239) + (i239 | (-28410750))) - (~(-(-(((i241 ^ i242) | (i242 & i241)) * 576))))) - 1;
                        int i244 = ~((49410 ^ i240) | (i240 & 49410));
                        int i245 = ~d12;
                        int i246 = ~(i238 | (i245 & (-49411)) | (i245 ^ (-49411)));
                        int i247 = ((i246 ^ i244) | (i246 & i244)) * 576;
                        int i248 = (i243 & i247) + (i247 | i243);
                        int i249 = i241 * 576;
                        char c3 = (char) ((i248 ^ i249) + ((i248 & i249) << 1));
                        int i250 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int d13 = com.facetec.sdk.fl.AnonymousClass18.d();
                        int i251 = (i250 * 758) - 106596;
                        int i252 = ~d13;
                        int i253 = ((i250 ^ i252) | (i250 & i252)) * (-757);
                        int i254 = (i250 ^ (-142)) | (i250 & (-142));
                        int i255 = ~((~i250) | (-142));
                        int i256 = ~((i252 ^ (-142)) | (i252 & (-142)));
                        int i257 = (i250 ^ 141) | (i250 & 141);
                        int i258 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i259 = ~i258;
                        r21 = "";
                        int i260 = ~(i259 | (-4) | i4);
                        bufferedReader2 = bufferedReader;
                        int i261 = ~((i ^ 3) | (i & 3));
                        fileReader2 = fileReader;
                        int i262 = (i258 * (-519)) + 1563 + (((i260 & i261) | (i261 ^ i260)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL);
                        int i263 = ~(i4 | (-4));
                        int i264 = ~((i258 ^ i) | (i258 & i));
                        int i265 = (i263 | i264) * (-1040);
                        int i266 = (i262 & i265) + (i262 | i265);
                        int i267 = ~((i259 & i4) | (i259 ^ i4));
                        int i268 = ~((i258 ^ (-4)) | (i258 & (-4)));
                        int i269 = (i267 ^ i268) | (i268 & i267);
                        int i270 = ((i269 ^ i264) | (i269 & i264)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
                        try {
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            f(c3, (i251 & i253) + (i251 | i253) + ((~((i254 ^ d13) | (i254 & d13))) * 1514) + (((~((i257 & d13) | (i257 ^ d13))) | (i256 ^ i255) | (i256 & i255)) * 757), (i266 ^ i270) + ((i270 & i266) << 1), objArr14);
                            if (!str.equals((java.lang.String) objArr14[0])) {
                                int i271 = f3504a + 3;
                                d = i271 % 128;
                                if (i271 % 2 != 0) {
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    throw null;
                                }
                                fileReader2.close();
                                bufferedReader2.close();
                                charSequence = r21;
                                char windowTouchSlop22 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                int i1272 = pressedStateDuration2 * (-523);
                                int i1282 = ((i1272 | 25248) << 1) - (i1272 ^ 25248);
                                int i1292 = ~pressedStateDuration2;
                                int i1302 = ~((i1292 ^ 96) | (i1292 & 96));
                                int i1312 = ~((pressedStateDuration2 & (-97)) | (pressedStateDuration2 ^ (-97)));
                                int i1322 = (i1302 & i1312) | (i1302 ^ i1312);
                                int i1332 = ~((i ^ (-97)) | (i & (-97)));
                                int i1342 = -(-(((i1322 ^ i1332) | (i1322 & i1332)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                                int i1352 = (i1282 & i1342) + (i1282 | i1342);
                                int i1362 = -(-(i1312 * (-786)));
                                int i1372 = ((i1352 | i1362) << 1) - (i1362 ^ i1352);
                                int i1382 = i1302 | (~(i4 | (-97)));
                                int i1392 = -(-(((i1312 ^ i1382) | (i1382 & i1312)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                                java.lang.CharSequence charSequence32 = charSequence;
                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                f(windowTouchSlop22, (i1372 ^ i1392) + ((i1392 & i1372) << 1), android.text.TextUtils.lastIndexOf(charSequence32, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, objArr82);
                                r5 = (java.lang.String) objArr82[0];
                                file = new java.io.File((java.lang.String) r5);
                                if (file.canRead()) {
                                }
                                r5 = i2;
                                java.lang.Object[] objArr132 = {null, new int[]{i}, new int[]{i}, new int[1]};
                                int i2082 = ((((-179350205) | r2) * 764) - 1711957893) + (((~((-179350205) | i4)) | 177242272) * (-1528)) + (((~(1004048800 | i4)) | (-828914461)) * 764);
                                int d112 = com.facetec.sdk.fl.AnonymousClass18.d();
                                int i2092 = i2082 * 407;
                                int i2102 = ~i2082;
                                int i2112 = ~((i2102 & d112) | (i2102 ^ d112));
                                int i2122 = ~d112;
                                int i2132 = ~((i2122 ^ i2082) | (i2122 & i2082));
                                int i2142 = ((i2112 ^ i2132) | (i2112 & i2132)) * (-406);
                                int i2152 = ((i2092 | i2142) << 1) - (i2092 ^ i2142);
                                int i2162 = (~(i2102 | i2122)) * (-406);
                                int i2172 = ~(d112 | (d112 ^ (-1)));
                                int i2182 = ~(i2082 | i2122);
                                int i2192 = (i2152 & i2162) + (i2162 | i2152) + (((i2172 ^ i2182) | (i2172 & i2182)) * 406);
                                int i2202 = (i2192 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (r5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                int i2212 = ~i2192;
                                int i2222 = ~r5;
                                int i2232 = ~((i2212 ^ i2222) | (i2212 & i2222));
                                int i2242 = (i4 ^ i2222) | (i4 & i2222);
                                int i2252 = ~i2242;
                                int i2262 = (i2232 ^ i2252) | (i2232 & i2252);
                                int i2272 = (i2192 ^ r5) | (i2192 & r5);
                                int i2282 = ~(i2272 | i);
                                int i2292 = ((i2262 ^ i2282) | (i2262 & i2282)) * (-252);
                                int i2302 = (i2202 & i2292) + (i2202 | i2292) + (i2272 * (-252));
                                int i2312 = r5 | i2192;
                                int i2322 = ((~((i ^ i2312) | (i & i2312))) | (~((i2242 & i2192) | (i2242 ^ i2192)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                                int i2332 = (i2302 & i2322) + (i2322 | i2302);
                                int i2342 = i2332 << 13;
                                int i2352 = ((~i2342) & i2332) | ((~i2332) & i2342);
                                int i2362 = i2352 >>> 17;
                                int i2372 = (~(i2352 & i2362)) & (i2352 | i2362);
                                ((int[]) objArr132[3])[0] = i2372 ^ (i2372 << 5);
                                return objArr132;
                            }
                            fileReader2.close();
                            bufferedReader2.close();
                            f3504a = (d + 109) % 128;
                            int i272 = f3504a;
                            int i273 = (i272 ^ 83) + ((i272 & 83) << 1);
                            d = i273 % 128;
                            int i274 = i273 % 2;
                            charSequence2 = r21;
                            str = null;
                            charSequence = charSequence2;
                            char windowTouchSlop222 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            int pressedStateDuration22 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                            int i12722 = pressedStateDuration22 * (-523);
                            int i12822 = ((i12722 | 25248) << 1) - (i12722 ^ 25248);
                            int i12922 = ~pressedStateDuration22;
                            int i13022 = ~((i12922 ^ 96) | (i12922 & 96));
                            int i13122 = ~((pressedStateDuration22 & (-97)) | (pressedStateDuration22 ^ (-97)));
                            int i13222 = (i13022 & i13122) | (i13022 ^ i13122);
                            int i13322 = ~((i ^ (-97)) | (i & (-97)));
                            int i13422 = -(-(((i13222 ^ i13322) | (i13222 & i13322)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                            int i13522 = (i12822 & i13422) + (i12822 | i13422);
                            int i13622 = -(-(i13122 * (-786)));
                            int i13722 = ((i13522 | i13622) << 1) - (i13622 ^ i13522);
                            int i13822 = i13022 | (~(i4 | (-97)));
                            int i13922 = -(-(((i13122 ^ i13822) | (i13822 & i13122)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                            java.lang.CharSequence charSequence322 = charSequence;
                            java.lang.Object[] objArr822 = new java.lang.Object[1];
                            f(windowTouchSlop222, (i13722 ^ i13922) + ((i13922 & i13722) << 1), android.text.TextUtils.lastIndexOf(charSequence322, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, objArr822);
                            r5 = (java.lang.String) objArr822[0];
                            file = new java.io.File((java.lang.String) r5);
                            if (file.canRead()) {
                            }
                            r5 = i2;
                            java.lang.Object[] objArr1322 = {null, new int[]{i}, new int[]{i}, new int[1]};
                            int i20822 = ((((-179350205) | r2) * 764) - 1711957893) + (((~((-179350205) | i4)) | 177242272) * (-1528)) + (((~(1004048800 | i4)) | (-828914461)) * 764);
                            int d1122 = com.facetec.sdk.fl.AnonymousClass18.d();
                            int i20922 = i20822 * 407;
                            int i21022 = ~i20822;
                            int i21122 = ~((i21022 & d1122) | (i21022 ^ d1122));
                            int i21222 = ~d1122;
                            int i21322 = ~((i21222 ^ i20822) | (i21222 & i20822));
                            int i21422 = ((i21122 ^ i21322) | (i21122 & i21322)) * (-406);
                            int i21522 = ((i20922 | i21422) << 1) - (i20922 ^ i21422);
                            int i21622 = (~(i21022 | i21222)) * (-406);
                            int i21722 = ~(d1122 | (d1122 ^ (-1)));
                            int i21822 = ~(i20822 | i21222);
                            int i21922 = (i21522 & i21622) + (i21622 | i21522) + (((i21722 ^ i21822) | (i21722 & i21822)) * 406);
                            int i22022 = (i21922 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (r5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                            int i22122 = ~i21922;
                            int i22222 = ~r5;
                            int i22322 = ~((i22122 ^ i22222) | (i22122 & i22222));
                            int i22422 = (i4 ^ i22222) | (i4 & i22222);
                            int i22522 = ~i22422;
                            int i22622 = (i22322 ^ i22522) | (i22322 & i22522);
                            int i22722 = (i21922 ^ r5) | (i21922 & r5);
                            int i22822 = ~(i22722 | i);
                            int i22922 = ((i22622 ^ i22822) | (i22622 & i22822)) * (-252);
                            int i23022 = (i22022 & i22922) + (i22022 | i22922) + (i22722 * (-252));
                            int i23122 = r5 | i21922;
                            int i23222 = ((~((i ^ i23122) | (i & i23122))) | (~((i22422 & i21922) | (i22422 ^ i21922)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                            int i23322 = (i23022 & i23222) + (i23222 | i23022);
                            int i23422 = i23322 << 13;
                            int i23522 = ((~i23422) & i23322) | ((~i23322) & i23422);
                            int i23622 = i23522 >>> 17;
                            int i23722 = (~(i23522 & i23622)) & (i23522 | i23622);
                            ((int[]) objArr1322[3])[0] = i23722 ^ (i23722 << 5);
                            return objArr1322;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileReader2 = fileReader;
                        bufferedReader2 = bufferedReader;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    fileReader2 = fileReader;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }
    };

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_retry_screen_center_content_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.facetec.sdk.db o2;
        java.lang.String str;
        super.onViewCreated(view, bundle);
        this.s = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.contentLayout);
        this.i = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.headerTextView);
        this.h = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.messageTextView);
        this.g = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.instructionMessage1TextView);
        this.f = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.instructionMessage2TextView);
        this.n = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.yourZoomSubimageTextView);
        this.m = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.idealZoomSubimageTextView);
        this.c = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.yourZoomImage);
        this.p = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.idealZoomImage);
        this.b = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.idealZoomImageBorder);
        this.f3502a = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.yourZoomImageBorder);
        this.d = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.idealOval);
        this.k = (com.facetec.sdk.di) view.findViewById(com.facetec.sdk.R.id.idealImageSlideshowView);
        this.u = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.cancelButtonSpacer);
        this.e = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.idealZoomLayout);
        this.j = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.yourZoomLayout);
        this.r = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.sideBySideLayout);
        this.q = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.headerAndSubheaderLayout);
        this.h.setImportantForAccessibility(1);
        this.g.setImportantForAccessibility(1);
        this.f.setImportantForAccessibility(1);
        if (((int[]) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -230834020, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 230834030)).length != 0) {
            this.p.setVisibility(4);
        }
        com.facetec.sdk.dp.e(this.i, (java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 372156401, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{true, false}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -372156376));
        com.facetec.sdk.dp.e(this.h, com.facetec.sdk.dm.h(true, false));
        java.lang.String c = com.facetec.sdk.dm.c(true);
        java.lang.String a2 = com.facetec.sdk.dm.a(true);
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity != null && faceTecSessionActivity.L != null) {
            o2 = faceTecSessionActivity.L;
        } else {
            o2 = com.facetec.sdk.cq.o();
        }
        java.lang.String str2 = "";
        if (com.facetec.sdk.FaceTecSDK.f3366a.enableOfficialIDPhoto) {
            str = com.facetec.sdk.dm.bb();
            this.h.setText(com.facetec.sdk.dm.aZ());
            com.facetec.sdk.dp.e(this.h, com.facetec.sdk.dm.aZ());
            this.n.setText(com.facetec.sdk.dm.bf());
            this.m.setText(com.facetec.sdk.dm.bc());
            this.g.setMaxLines(3);
            this.d.setVisibility(8);
            this.f.setVisibility(8);
        } else {
            int i = com.facetec.sdk.dd.AnonymousClass2.b[o2.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    this.f.setVisibility(8);
                } else if (i == 4) {
                    c = (java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1345253994, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{true}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1345253982);
                    this.f.setVisibility(8);
                }
                a2 = "";
            } else {
                this.g.setVisibility(8);
                c = "";
            }
            this.n.setText((java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1728136911, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{true}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1728136916));
            this.m.setText(com.facetec.sdk.dm.d(true));
            str = c;
            str2 = a2;
        }
        this.g.setText(str);
        this.f.setText(str2);
        this.n.setImportantForAccessibility(2);
        this.m.setImportantForAccessibility(2);
        this.j.setImportantForAccessibility(1);
        this.j.setContentDescription(this.n.getText());
        this.e.setImportantForAccessibility(1);
        this.e.setContentDescription(this.m.getText());
        this.i.setTypeface(com.facetec.sdk.dm.J());
        this.h.setTypeface(com.facetec.sdk.dm.K());
        this.g.setTypeface(com.facetec.sdk.dm.P());
        this.f.setTypeface(com.facetec.sdk.dm.P());
        this.n.setTypeface(com.facetec.sdk.dm.P());
        this.m.setTypeface(com.facetec.sdk.dm.P());
        if (!com.facetec.sdk.FaceTecSDK.f3366a.enableOfficialIDPhoto) {
            this.i.setLineSpacing(0.0f, 1.1f);
            this.h.setLineSpacing(0.0f, 1.1f);
            this.g.setLineSpacing(0.0f, 1.1f);
            this.f.setLineSpacing(0.0f, 1.1f);
        }
        this.i.setTextColor(com.facetec.sdk.dm.j(getActivity()));
        this.h.setTextColor(com.facetec.sdk.dm.i(getActivity()));
        this.g.setTextColor(com.facetec.sdk.dm.i(getActivity()));
        this.f.setTextColor(com.facetec.sdk.dm.i(getActivity()));
        this.n.setTextColor(com.facetec.sdk.dm.i(getActivity()));
        this.m.setTextColor(com.facetec.sdk.dm.i(getActivity()));
        float a3 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        float f = 20.0f * a3;
        this.i.setTextSize(2, a3 * 28.0f);
        this.h.setTextSize(2, f);
        this.g.setTextSize(2, f);
        this.f.setTextSize(2, f);
        this.n.setTextSize(2, f);
        this.m.setTextSize(2, f);
        this.f3503o = null;
        this.x = null;
        if (faceTecSessionActivity == null) {
            return;
        }
        if (faceTecSessionActivity.E != null) {
            this.f3503o = faceTecSessionActivity.E;
        }
        android.content.res.Resources resources = getResources();
        getActivity();
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(resources, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1872583944, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1872583935)).intValue());
        b();
        this.p.setImageDrawable(androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.create(resources, decodeResource));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        this.l = gradientDrawable;
        gradientDrawable.setCornerRadius(com.facetec.sdk.ay.d((int) (com.facetec.sdk.dm.z() * com.facetec.sdk.dm.b())));
        this.l.setStroke((int) com.facetec.sdk.ay.d(java.lang.Math.max(com.facetec.sdk.dm.k() == 0 ? 0 : 1, (int) (com.facetec.sdk.dm.k() * com.facetec.sdk.dm.b()))), com.facetec.sdk.dm.r(getActivity()));
        this.l.setColor(0);
        androidx.core.graphics.drawable.RoundedBitmapDrawable create = androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.create(resources, decodeResource);
        create.setAlpha(0);
        this.b.setImageDrawable(create);
        this.b.setBackground(this.l);
        this.f3502a.setImageDrawable(create);
        this.f3502a.setBackground(this.l);
        this.c.setBackground(this.l);
        this.p.setBackground(this.l);
        this.c.setClipToOutline(true);
        this.p.setClipToOutline(true);
        this.c.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        this.p.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        this.d.setColorFilter(com.facetec.sdk.dm.t(getActivity()), android.graphics.PorterDuff.Mode.SRC_IN);
        float a4 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        int d = com.facetec.sdk.dm.d();
        int round = java.lang.Math.round(d / 2.0f);
        int round2 = (int) java.lang.Math.round(faceTecSessionActivity.k * 0.45d);
        if (this.f3503o != null) {
            float height = r10.getHeight() / this.f3503o.getWidth();
            if (com.facetec.sdk.dm.c() >= height) {
                round2 = java.lang.Math.round((java.lang.Math.round(java.lang.Math.round(faceTecSessionActivity.m) - (r5 * 3.0f)) / 2.0f) * height);
            }
        }
        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) this.i.getLayoutParams())).bottomMargin = java.lang.Math.round(com.facetec.sdk.ay.d(5) * a4);
        int round3 = java.lang.Math.round(com.facetec.sdk.ay.d(5) * a4);
        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) this.m.getLayoutParams())).topMargin = round3;
        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) this.n.getLayoutParams())).topMargin = round3;
        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) this.r.getLayoutParams())).topMargin = java.lang.Math.round(com.facetec.sdk.ay.d(5) * a4);
        ((android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.idealZoomImageContainer)).getLayoutParams().height = round2;
        ((android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.yourZoomImageContainer)).getLayoutParams().height = round2;
        ((android.widget.LinearLayout.LayoutParams) this.j.getLayoutParams()).setMarginEnd(round);
        ((android.widget.LinearLayout.LayoutParams) this.e.getLayoutParams()).setMarginStart(round);
        view.setPadding(d, d, d, 0);
    }

    /* renamed from: com.facetec.sdk.dd$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.facetec.sdk.db.values().length];
            b = iArr;
            try {
                iArr[com.facetec.sdk.db.LIGHTING_AND_NEUTRAL_EXPRESSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.facetec.sdk.db.LIGHTING_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.facetec.sdk.db.NEUTRAL_EXPRESSION_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.facetec.sdk.db.BLURRY_ONLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        d();
    }

    final void b() {
        android.content.res.Resources resources;
        int identifier;
        if (this.f3503o != null) {
            float height = r0.getHeight() / this.f3503o.getWidth();
            if (height <= 1.776f) {
                float height2 = this.f3503o.getHeight() / 1.776f;
                if (this.f3503o.getWidth() - height2 > 0.0f) {
                    this.f3503o = android.graphics.Bitmap.createBitmap(this.f3503o, (int) ((r1.getWidth() - height2) / 2.0f), 0, (int) height2, this.f3503o.getHeight());
                }
            } else if (height > 1.776f) {
                float width = this.f3503o.getWidth() * 1.776f;
                if (this.f3503o.getHeight() - width > 0.0f) {
                    this.f3503o = android.graphics.Bitmap.createBitmap(this.f3503o, 0, (int) ((r1.getHeight() - width) / 2.0f), this.f3503o.getWidth(), (int) width);
                }
            }
            int width2 = (int) (this.f3503o.getWidth() * 0.75d);
            int height3 = (int) (this.f3503o.getHeight() * 0.75d);
            android.graphics.Bitmap bitmap = this.f3503o;
            this.f3503o = android.graphics.Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width2) / 2, (this.f3503o.getHeight() - height3) / 2, width2, height3);
            this.x = androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.create(getResources(), this.f3503o);
        }
        if (c(com.facetec.sdk.Cdo.YOUR_ZOOM_IMAGE_OVERRIDE) && (identifier = (resources = getResources()).getIdentifier("zoom_your_zoom_image_override", "drawable", getActivity().getPackageName())) != 0) {
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(resources, identifier);
            this.f3503o = decodeResource;
            this.x = androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.create(resources, decodeResource);
        }
        if (!com.facetec.sdk.bd.h) {
            this.c.setScaleX(-1.0f);
        }
        this.c.setImageDrawable(this.x);
    }

    final android.widget.TextView e() {
        return this.i;
    }

    final void a() {
        float f;
        float f2;
        float a2 = com.facetec.sdk.dm.a();
        float b = com.facetec.sdk.dm.b();
        int round = java.lang.Math.round(com.facetec.sdk.dm.d() * com.facetec.sdk.dm.b());
        int measuredHeight = this.s.getMeasuredHeight();
        if (java.util.Locale.getDefault().getLanguage().equals("ar")) {
            f = 0.08f;
            f2 = 0.09f;
        } else {
            f = 0.06f;
            f2 = 0.07f;
        }
        float f3 = measuredHeight;
        int round2 = java.lang.Math.round(f * f3);
        if (com.facetec.sdk.dm.c() < 1.4d && com.facetec.sdk.dp.d().heightPixels < 900) {
            round2 = java.lang.Math.round(f3 * f2);
        }
        int round3 = (int) java.lang.Math.round(round2 * 0.85d);
        int round4 = (int) java.lang.Math.round(round3 * 0.85d);
        int i = ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.LinearLayout.LayoutParams) this.m.getLayoutParams())).topMargin;
        int height = this.p.getHeight();
        this.q.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.r.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams).height = height + round4 + i;
        layoutParams.weight = 0.0f;
        this.r.setLayoutParams(layoutParams);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.i.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams2).height = round2;
        layoutParams2.weight = 0.0f;
        this.i.setLayoutParams(layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.h.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams3).height = round3;
        layoutParams3.weight = 0.0f;
        this.h.setLayoutParams(layoutParams3);
        this.g.setLayoutParams(layoutParams3);
        this.f.setLayoutParams(layoutParams3);
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.m.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams4).height = round4;
        this.m.setLayoutParams(layoutParams4);
        this.n.setLayoutParams(layoutParams4);
        int width = this.i.getWidth();
        if (com.facetec.sdk.dm.bm()) {
            int round5 = java.lang.Math.round(com.facetec.sdk.ay.d(35) * b * a2);
            this.u.getLocationInWindow(new int[2]);
            int round6 = (int) ((r10[1] + round5) - java.lang.Math.round(round / 2.0d));
            int[] iArr = new int[2];
            this.i.getLocationInWindow(iArr);
            if (iArr[1] < round6) {
                width -= round5 << 1;
            }
        }
        com.facetec.sdk.ay.d dVar = new com.facetec.sdk.ay.d(width, round2);
        com.facetec.sdk.ay.d dVar2 = new com.facetec.sdk.ay.d(this.h.getWidth(), round3);
        com.facetec.sdk.ay.d dVar3 = new com.facetec.sdk.ay.d(this.g.getWidth(), round3);
        com.facetec.sdk.ay.d dVar4 = new com.facetec.sdk.ay.d(this.f.getWidth(), round3);
        com.facetec.sdk.ay.d dVar5 = new com.facetec.sdk.ay.d(this.m.getWidth(), round4);
        com.facetec.sdk.ay.d dVar6 = new com.facetec.sdk.ay.d(this.n.getWidth(), round4);
        int round7 = java.lang.Math.round(com.facetec.sdk.ay.c(8));
        int round8 = java.lang.Math.round(com.facetec.sdk.ay.c(40));
        int round9 = java.lang.Math.round(com.facetec.sdk.ay.c(5));
        int round10 = java.lang.Math.round(com.facetec.sdk.ay.c(36));
        int c = com.facetec.sdk.ay.c(this.i, dVar, round7, round8);
        int c2 = com.facetec.sdk.ay.c(this.h, dVar2, round9, round10);
        int c3 = com.facetec.sdk.ay.c(this.g, dVar3, round9, round10);
        int c4 = com.facetec.sdk.ay.c(this.f, dVar4, round9, round10);
        int c5 = com.facetec.sdk.ay.c(this.m, dVar5, round9, round10);
        int c6 = com.facetec.sdk.ay.c(this.n, dVar6, round9, round10);
        int round11 = (int) java.lang.Math.round(c * 0.85d);
        if (c2 >= round11) {
            c2 = round11;
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.enableOfficialIDPhoto) {
            c4 = c2;
        } else {
            if (this.g.getText().toString().isEmpty() || c3 >= c2) {
                c3 = c2;
            }
            if (this.f.getText().toString().isEmpty() || c4 >= c3) {
                c4 = c3;
            }
        }
        int round12 = (int) java.lang.Math.round(c4 * 0.85d);
        if (c5 >= round12) {
            c5 = round12;
        }
        if (c6 >= c5) {
            c6 = c5;
        }
        this.i.setTextSize(0, c);
        float f4 = c4;
        this.h.setTextSize(0, f4);
        this.g.setTextSize(0, f4);
        this.f.setTextSize(0, f4);
        float f5 = c6;
        this.m.setTextSize(0, f5);
        this.n.setTextSize(0, f5);
        this.i.getLayoutParams().height = -2;
        this.h.getLayoutParams().height = -2;
        this.g.getLayoutParams().height = -2;
        this.f.getLayoutParams().height = -2;
        this.m.getLayoutParams().height = -2;
        this.n.getLayoutParams().height = -2;
        this.r.getLayoutParams().height = -2;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.dd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dd.this.f();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(this.y);
    }

    final void d() {
        android.widget.TextView textView = this.i;
        if (textView != null) {
            textView.getViewTreeObserver().removeOnGlobalLayoutListener(this.y);
        }
    }

    private static boolean c(com.facetec.sdk.Cdo cdo) {
        for (int i = 0; i < com.facetec.sdk.du.e.length(); i++) {
            try {
                org.json.JSONObject jSONObject = com.facetec.sdk.du.e.getJSONObject(i);
                java.lang.String string = jSONObject.getString("overrideKey");
                com.facetec.sdk.Cdo cdo2 = (com.facetec.sdk.Cdo) jSONObject.get("type");
                if (com.facetec.sdk.FaceTecSDK.f3366a.p.get(string) != null && com.facetec.sdk.FaceTecSDK.f3366a.p.get(string).equals(jSONObject.getString("overrideValue")) && cdo2 == cdo) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    final void d(final java.lang.Runnable runnable) {
        if (com.facetec.sdk.eb.d()) {
            this.h.setAlpha(1.0f);
            this.i.setAlpha(1.0f);
            this.j.setAlpha(1.0f);
            this.e.setAlpha(1.0f);
            this.f.setAlpha(1.0f);
            this.g.setAlpha(1.0f);
            new com.facetec.sdk.au.b(runnable).run();
            return;
        }
        this.h.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        final int i = 500;
        final int i2 = 300;
        this.i.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.dd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dd.this.c(i, i2, runnable);
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final int i, final int i2, final java.lang.Runnable runnable) {
        this.j.animate().alpha(1.0f).setDuration(i).setStartDelay(i2).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.dd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dd.this.d(i, i2, runnable);
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final int i, final int i2, final java.lang.Runnable runnable) {
        this.e.animate().alpha(1.0f).setDuration(i).setStartDelay(i2).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.dd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.dd.this.b(i, i2, runnable);
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, int i2, java.lang.Runnable runnable) {
        long j = i;
        long j2 = i2;
        this.f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).setListener(null).start();
        this.g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).setListener(null).withEndAction(new com.facetec.sdk.au.b(runnable));
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
