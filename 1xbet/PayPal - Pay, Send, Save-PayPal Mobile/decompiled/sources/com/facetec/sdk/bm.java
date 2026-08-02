package com.facetec.sdk;

/* loaded from: classes8.dex */
public class bm {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static boolean f3431a;
    private static boolean b;
    private static int c;
    private static int d;
    private static char[] e;
    private static int g;

    private static java.lang.String $$g(int i, byte b2, byte b3) {
        int i2 = b2 * 3;
        byte[] bArr = $$c;
        int i3 = 3 - (i * 2);
        int i4 = 122 - b3;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            i3++;
            if (i7 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i4 = (-bArr[i3]) + i4;
            i6 = i7;
        }
    }

    public static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i2;
        int i9 = ~i5;
        int i10 = (~i8) | (~(i9 | i2));
        int i11 = i8 | i9;
        int i12 = (~(i5 | i2)) | (~(i7 | (~i2)));
        int i13 = i2 + i4 + i6 + ((-1311665080) * i3) + (1761575915 * i);
        int i14 = i13 * i13;
        int i15 = ((1226044109 * i2) - 1701849991) + (1226043089 * i4) + (i10 * 510) + (i11 * (-510)) + (i12 * 510) + (1226043599 * i6) + ((-858626504) * i3) + (1069087493 * i) + (1627848704 * i14);
        int i16 = (i2 * (-2073022045)) + 412680192 + (i4 * 1917570655) + (i10 * (-1995296350)) + (i11 * 1995296350) + (i12 * (-1995296350)) + (i6 * (-77725696)) + (i3 * 175112192) + (i * (-649461760)) + (i14 * 1783169024) + (i15 * i15 * 739704832);
        return i16 != 1 ? i16 != 2 ? d(objArr) : e(objArr) : b(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(byte b2, byte b3, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (i * 4);
        int i4 = b3 + 97;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 = (-i4) + i3;
            i3 = i6;
            i2 = i7;
            int i8 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i8];
            i3 = i4;
            i4 = b4;
            i7 = i2 + 1;
            i6 = i8;
            i4 = (-i4) + i3;
            i3 = i6;
            i2 = i7;
            int i82 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            int i822 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    private static void i(byte b2, short s, short s2, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i = 21 - (b2 * 17);
        int i2 = s2 * 17;
        int i3 = 101 - (s * 2);
        byte[] bArr2 = new byte[18 - i2];
        int i4 = -1;
        ?? r6 = i3;
        if (bArr == null) {
            i++;
            r6 = i + i3 + 3;
        }
        while (true) {
            byte b3 = r6;
            int i5 = i;
            i4++;
            bArr2[i4] = b3;
            if (i4 == 17 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i = i5 + 1;
                r6 = b3 + bArr[i5] + 3;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.US, 122, -78, 88};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }

    static void init$1() {
        $$d = new byte[]{89, 125, 6, 47, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$e = 134;
    }

    static void init$2() {
        $$c = new byte[]{80, -114, -63, 91};
        $$f = 44;
    }

    bm() {
    }

    private static byte[] b(java.io.File file) throws java.io.IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            byte[] b2 = b(fileInputStream);
            fileInputStream.close();
            g = (d + 9) % 128;
            return b2;
        } catch (java.lang.Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    static byte[] a(android.content.Context context, java.lang.String str) throws java.lang.Exception {
        int i = g + 125;
        d = i % 128;
        java.io.FileInputStream openFileInput = context.openFileInput(str);
        try {
            if (i % 2 == 0) {
                byte[] b2 = b(openFileInput);
                if (openFileInput != null) {
                    openFileInput.close();
                    g = (d + 47) % 128;
                }
                return b2;
            }
            b(openFileInput);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        } catch (java.lang.Throwable th) {
            if (openFileInput != null) {
                try {
                    openFileInput.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static byte[] b(java.io.FileInputStream fileInputStream) throws java.io.IOException {
        int read;
        int i;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[(int) fileInputStream.getChannel().size()];
        while (fileInputStream.available() > 0) {
            int i2 = d + 81;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                read = fileInputStream.read(bArr);
                i = 1;
            } else {
                read = fileInputStream.read(bArr);
                i = 0;
            }
            byteArrayOutputStream.write(bArr, i, read);
        }
        return byteArrayOutputStream.toByteArray();
    }

    static byte c(android.content.Context context, java.lang.String str) throws java.lang.Exception {
        int i = d + 13;
        g = i % 128;
        if (i % 2 != 0) {
            return (byte) context.openFileInput(str).read();
        }
        context.openFileInput(str).read();
        throw null;
    }

    static void e(android.content.Context context, java.lang.String str, byte[] bArr) throws java.io.IOException {
        d = (g + 101) % 128;
        java.io.FileOutputStream openFileOutput = context.openFileOutput(str, 0);
        openFileOutput.write(bArr);
        openFileOutput.close();
        d = (g + 65) % 128;
    }

    static void b(android.content.Context context, java.lang.String str, byte b2) throws java.io.IOException {
        g = (d + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        java.io.FileOutputStream openFileOutput = context.openFileOutput(str, 0);
        openFileOutput.write(b2);
        openFileOutput.close();
        int i = d + 83;
        g = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void b(java.io.File file, byte[] bArr, byte[] bArr2) throws java.lang.Exception {
        byte[] a2 = new com.facetec.sdk.ae(bArr).a(bArr2);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            fileOutputStream.write(a2);
            fileOutputStream.close();
            g = (d + 93) % 128;
        } catch (java.io.IOException e2) {
            throw e2;
        } catch (java.lang.Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    static void d(android.content.Context context, java.lang.String str, byte[] bArr, byte[] bArr2) throws java.lang.Exception {
        e(context, str, new com.facetec.sdk.ae(bArr).a(bArr2));
        g = (d + 59) % 128;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        java.io.File file = (java.io.File) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] b2 = new com.facetec.sdk.ae(bArr).b(b(file));
        int i = g + 29;
        d = i % 128;
        if (i % 2 == 0) {
            return b2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        byte[] b2 = new com.facetec.sdk.ae(bArr).b(a(context, str));
        int i = d + 73;
        g = i % 128;
        if (i % 2 != 0) {
            return b2;
        }
        throw null;
    }

    private static void f(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $11 = ($10 + 55) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
        char[] cArr = e;
        int i2 = 1;
        int i3 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i4]);
                    java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                    if (d2 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.os.Process.getGidForName("") + 1812, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 23, -1157014744, false, $$g(b2, b3, (byte) (b3 | 57)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 1;
                    i3 = 0;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(c)};
        java.lang.Object d3 = com.facetec.sdk.al.d(-1796435875);
        if (d3 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            d3 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 662 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 23, 855894693, false, $$g(b4, b5, (byte) (b5 | 56)), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
        if (b) {
            $11 = ($10 + 13) % 128;
            hnVar.c = bArr2.length;
            char[] cArr3 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr3[hnVar.f3629a] = (char) (cArr[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i] - intValue);
                java.lang.Object[] objArr4 = {hnVar, hnVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(870267758);
                if (d4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    d4 = com.facetec.sdk.al.c((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), android.text.TextUtils.getCapsMode("", 0, 0) + 1236, 23 - android.os.Process.getGidForName(""), -1808776810, false, $$g(b6, b7, b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (f3431a) {
            $10 = ($11 + 41) % 128;
            hnVar.c = charArray.length;
            char[] cArr4 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                $10 = ($11 + 7) % 128;
                cArr4[hnVar.f3629a] = (char) (cArr[charArray[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                java.lang.Object[] objArr5 = {hnVar, hnVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                if (d5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    d5 = com.facetec.sdk.al.c((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 1236 - android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 24, -1808776810, false, $$g(b8, b9, b9), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                $10 = ($11 + 95) % 128;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        int i5 = 0;
        hnVar.c = iArr.length;
        char[] cArr5 = new char[hnVar.c];
        while (true) {
            hnVar.f3629a = i5;
            if (hnVar.f3629a >= hnVar.c) {
                objArr[0] = new java.lang.String(cArr5);
                return;
            }
            int i6 = $11 + 115;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr5[hnVar.f3629a] = (char) (cArr[iArr[hnVar.c >> hnVar.f3629a] * i] % intValue);
                i5 = hnVar.f3629a;
            } else {
                cArr5[hnVar.f3629a] = (char) (cArr[iArr[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                i5 = hnVar.f3629a + 1;
            }
        }
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        ((java.lang.Number) objArr[0]).longValue();
        ((java.lang.Number) objArr[1]).longValue();
        int i = d;
        g = (((i | 3) << 1) - (i ^ 3)) % 128;
        java.lang.Object obj = com.facetec.sdk.by.e.class.getField(util.h.xy.cb.b.f1091).get(null);
        int i2 = g;
        int i3 = ((i2 ^ 83) | (i2 & 83)) << 1;
        int i4 = -((i2 & (-84)) | ((~i2) & 83));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        d = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 ^ 121;
        int i8 = -(-((i2 & 121) << 1));
        d = ((i7 & i8) + (i8 | i7)) % 128;
        try {
            byte[] bArr = $$d;
            byte b2 = (byte) (-bArr[9]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            i(b2, b2, (byte) (b2 - 1), objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            byte b3 = bArr[9];
            byte b4 = (byte) (b3 + 1);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            i(b4, b4, (byte) (-b3), objArr3);
            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], android.content.Context.class, com.facetec.sdk.by.e.class);
            method.setAccessible(true);
            method.invoke(null, null, obj);
            int i9 = g;
            int i10 = (i9 & (-76)) | ((~i9) & 75);
            int i11 = (i9 & 75) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            d = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 55 / 0;
            }
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void b(long j, long j2) {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)};
        int d2 = com.facetec.sdk.gh.b.d();
        int d3 = com.facetec.sdk.gh.b.d();
        c(objArr, com.facetec.sdk.gh.b.d(), 947509604, com.facetec.sdk.gh.b.d(), -947509604, d2, d3);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        d = 0;
        g = 1;
        e = new char[]{6025, 6042, 6020, 6038, 6043, 6017, 6106, 6023, 6036, 6021, 6055, 6032, 6019, 6057, 6040, 6044, 6049, 6018, 6045, 6039, 6107, 6047, 6109, 6022, 6037, 6105};
        c = -1919674392;
        f3431a = true;
        b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0474, code lost:
    
        if (r0.contains(((java.lang.reflect.Field) r4).get(null)) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] c(android.content.Context context, int i, int i2, int i3) {
        java.lang.Object[] objArr;
        int i4;
        int i5;
        if (context == null) {
            java.lang.Object[] objArr2 = {null, new int[]{i}, new int[]{i}, new int[1]};
            int nextInt = new java.util.Random().nextInt();
            int i6 = (((~((~nextInt) | 805287419)) * (-116)) - 351057913) + ((637416938 | nextInt) * 116) + (((~(nextInt | (-187281658))) | 19411176) * 116);
            int i7 = ~i;
            int i8 = (-1) - (~(-(-(i6 * (-494)))));
            int i9 = ~i6;
            int i10 = i8 + (i9 * (-495)) + (i7 * 495);
            int i11 = ~(i9 | (i9 ^ (-1)));
            int i12 = ~i7;
            int i13 = ((i12 ^ i11) | (i12 & i11)) * 495;
            int i14 = (i3 - (~((i10 ^ i13) + ((i13 & i10) << 1)))) - 1;
            int i15 = i14 << 13;
            int i16 = (i14 & (~i15)) | ((~i14) & i15);
            int i17 = i16 >>> 17;
            int i18 = (i16 & (~i17)) | ((~i16) & i17);
            int i19 = i18 << 5;
            ((int[]) objArr2[3])[0] = (i18 & (~i19)) | ((~i18) & i19);
            return objArr2;
        }
        int i20 = g;
        d = (i20 + 125) % 128;
        d = ((i20 & 121) + (i20 | 121)) % 128;
        try {
            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
            int i21 = (keyCodeFromString * 960) - 243459;
            int i22 = ~i;
            int i23 = ~(i22 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
            int i24 = ~((keyCodeFromString ^ i) | (keyCodeFromString & i));
            int i25 = ((i23 & i24) | (i23 ^ i24)) * 959;
            int i26 = (i21 & i25) + (i21 | i25);
            int i27 = ~((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
            int i28 = ~((keyCodeFromString & i22) | (i22 ^ keyCodeFromString));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            f(null, null, (((122752 & i26) + (i26 | 122752)) - (~(((i28 & i27) | (i27 ^ i28)) * 959))) - 1, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f(null, null, 126 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0089\u008a\u008d", objArr4);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], null).invoke(context, null);
            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f(null, null, (trimmedLength ^ 127) + ((trimmedLength & 127) << 1), "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0087\u0093\u008f\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(null, null, 126 - (~(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), "\u0094\u008d\u0081\u0090\u0092", objArr6);
            if ((cls2.getField((java.lang.String) objArr6[0]).getInt(invoke) & 2) != 0) {
                objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{(~(i & 1)) & (i | 1)}, new int[1]};
                int i29 = ~new java.util.Random().nextInt(207682650);
                int i30 = (((~(583404848 | i29)) | (-786947508)) * (-160)) + 611653731 + (((~(i29 | (-241293748))) | 583404848) * 160);
                int d2 = com.facetec.sdk.gh.b.d();
                int i31 = i30 * (-68);
                int i32 = (i31 ^ 1120) + ((i31 & 1120) << 1);
                int i33 = ~i30;
                int i34 = ~((i33 & (-17)) | (i33 ^ (-17)) | d2);
                int i35 = (i30 ^ 16) | (i30 & 16);
                int i36 = ~((i35 ^ d2) | (i35 & d2));
                int i37 = ((i34 ^ i36) | (i36 & i34)) * 69;
                int i38 = ((i32 | i37) << 1) - (i37 ^ i32);
                int i39 = ~((i30 ^ (-17)) | (i30 & (-17)));
                int i40 = ~((d2 ^ (-17)) | (d2 & (-17)));
                int i41 = (i39 ^ i40) | (i39 & i40);
                int i42 = ~((d2 ^ i30) | (d2 & i30));
                int i43 = -(-(((i41 ^ i42) | (i42 & i41)) * (-69)));
                int i44 = (i38 & i43) + (i43 | i38) + ((~((i33 & 16) | (i33 ^ 16))) * 69);
                int i45 = (i44 * 165) + (i3 * (-163));
                int i46 = ~((i22 ^ i3) | (i22 & i3));
                int i47 = ((i46 ^ i44) | (i46 & i44)) * (-328);
                int i48 = ((i45 | i47) << 1) - (i45 ^ i47);
                int i49 = ((i44 ^ i) | (i44 & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                int i50 = ~i44;
                int i51 = ~i3;
                int i52 = ~((i50 ^ i51) | (i50 & i51));
                int i53 = ~((i51 ^ i) | (i51 & i));
                int i54 = (i52 ^ i53) | (i52 & i53);
                int i55 = ~((i44 ^ i22) | (i44 & i22) | i3);
                int i56 = (((i48 ^ i49) + ((i49 & i48) << 1)) - (~(-(-(((i54 & i55) | (i55 ^ i54)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))))) - 1;
                int i57 = i56 << 13;
                int i58 = (~(i57 & i56)) & (i57 | i56);
                int i59 = i58 >>> 17;
                int i60 = (~(i58 & i59)) & (i58 | i59);
                int i61 = i60 << 5;
                ((int[]) objArr[3])[0] = (i60 & (~i61)) | ((~i60) & i61);
            } else {
                objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[]{(r4 & (~r12)) | r13}};
                int i62 = ((46188184 | i22) * (-192)) + 253038883 + (((~(46194616 | i22)) | 824705028) * (-384)) + (((~((-824705029) | i)) | (~(870899644 | i22)) | (~(i | (-6433)))) * 192);
                int i63 = (i3 & i62) + (i62 | i3);
                int i64 = i63 << 13;
                int i65 = (~(i64 & i63)) & (i63 | i64);
                int i66 = i65 >>> 17;
                int i67 = (i65 & (~i66)) | ((~i65) & i66);
                int i68 = i67 << 5;
                int i69 = (~i67) & i68;
            }
            if (((int[]) objArr[2])[0] != i) {
                int i70 = g;
                int i71 = (i70 ^ 9) + ((i70 & 9) << 1);
                d = i71 % 128;
                if (i71 % 2 != 0) {
                    int i72 = 88 / 0;
                }
                return objArr;
            }
            try {
                java.lang.Object d3 = com.facetec.sdk.al.d(1023220397);
                if (d3 == null) {
                    char c2 = (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42580);
                    int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                    int green = android.graphics.Color.green(0);
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    h(b2, b3, (byte) (b3 - 2), objArr7);
                    d3 = com.facetec.sdk.al.c(c2, 1551 - packedPositionChild, 24 - green, -1693294507, false, (java.lang.String) objArr7[0], new java.lang.Class[0]);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) d3).invoke(null, null);
                java.lang.Object d4 = com.facetec.sdk.al.d(-230269676);
                if (d4 == null) {
                    char c3 = (char) (42581 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int indexOf = android.text.TextUtils.indexOf("", "");
                    long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                    byte length = (byte) $$a.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    h((byte) 0, length, (byte) (length - 4), objArr8);
                    d4 = com.facetec.sdk.al.c(c3, indexOf + 1552, 24 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), 1437149164, false, (java.lang.String) objArr8[0], null);
                }
                if (!set.contains(((java.lang.reflect.Field) d4).get(null))) {
                    int d5 = com.facetec.sdk.gh.b.d();
                    int i73 = ~(((-93736614) & d5) | ((-93736614) ^ d5));
                    int i74 = ~d5;
                    int i75 = -(-((i73 | (~(i74 | 810023575))) * (-1808)));
                    int i76 = ~(((-412294) & d5) | ((-412294) ^ d5));
                    int i77 = i74 | 93736613;
                    int i78 = ~((810023575 & i77) | (i77 ^ 810023575));
                    int i79 = (((1920408236 & i75) + (i75 | 1920408236)) - (~(((i76 ^ i78) | (i78 & i76)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) - 1;
                    int i80 = ~((d5 ^ (-810023576)) | ((-810023576) & d5));
                    int i81 = -(-(((i80 ^ 93324320) | (93324320 & i80) | (~((i74 ^ 93736613) | (i74 & 93736613)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                    int d6 = com.facetec.sdk.gh.b.d();
                    int i82 = ~d6;
                    int i83 = ~((i82 ^ (-17076372)) | (i82 & (-17076372)));
                    int i84 = ((i83 & 17043600) | (17043600 ^ i83)) * (-245);
                    int i85 = ~((d6 & (-17076372)) | (d6 ^ (-17076372)));
                    int i86 = (1712009958 & i84) + (i84 | 1712009958) + (i85 * (-245));
                    int i87 = -(-((i85 | (-2137283741)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                    if ((i79 ^ i81) + ((i81 & i79) << 1) <= (i86 & i87) + (i87 | i86)) {
                        java.lang.Object d7 = com.facetec.sdk.al.d(-233963760);
                        if (d7 == null) {
                            char c4 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42580);
                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            byte b4 = (byte) 0;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            h(b4, b4, b4, objArr9);
                            d7 = com.facetec.sdk.al.c(c4, 1552 - defaultSize, lastIndexOf + 25, 1440908776, false, (java.lang.String) objArr9[0], null);
                        }
                        java.lang.Object obj = null;
                        set.contains(((java.lang.reflect.Field) d7).get(null));
                        obj.hashCode();
                        throw null;
                    }
                    java.lang.Object d8 = com.facetec.sdk.al.d(-233963760);
                    if (d8 == null) {
                        char c5 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42580);
                        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                        byte b5 = (byte) 0;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        h(b5, b5, b5, objArr10);
                        d8 = com.facetec.sdk.al.c(c5, 1551 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), (maximumFlingVelocity >> 16) + 24, 1440908776, false, (java.lang.String) objArr10[0], null);
                    }
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    g = (d + 73) % 128;
                    java.lang.Object[] objArr11 = {null, new int[]{i}, new int[]{i}, new int[1]};
                    int myPid = android.os.Process.myPid();
                    int i88 = ~myPid;
                    int i89 = (((~(103946687 | i88)) | (~((-2103581) | myPid))) * (-831)) + 1734229894 + ((~(930748863 | myPid)) * (-1662)) + (((~(myPid | 928645283)) | (~(i88 | (-928645284))) | (~((-103946688) | myPid))) * 831);
                    int i90 = (((i89 * (-559)) + (i3 * 561)) - (~(-(-((~((i22 ^ i89) | (i22 & i89))) * (-560)))))) - 1;
                    int i91 = (~i3) | i89;
                    int i92 = (~((i ^ i91) | (i & i91))) * (-560);
                    int i93 = ((i90 | i92) << 1) - (i92 ^ i90);
                    int i94 = ~i89;
                    int i95 = ~((i94 ^ i3) | (i94 & i3));
                    int i96 = ~((i3 ^ i22) | (i3 & i22));
                    int i97 = ((i95 ^ i96) | (i95 & i96)) * 560;
                    int i98 = ((i93 | i97) << 1) - (i97 ^ i93);
                    int i99 = i98 << 13;
                    int i100 = ((~i99) & i98) | ((~i98) & i99);
                    int i101 = i100 >>> 17;
                    int i102 = (i100 & (~i101)) | ((~i100) & i101);
                    int i103 = i102 << 5;
                    ((int[]) objArr11[3])[0] = (~(i102 & i103)) & (i102 | i103);
                    d = (g + 97) % 128;
                    return objArr11;
                }
                if ((i2 & 32) != 0) {
                    i4 = 1;
                } else if (android.os.Build.VERSION.SDK_INT > 33) {
                    d = (g + 11) % 128;
                    int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                    int d9 = com.facetec.sdk.gh.b.d();
                    int i104 = packedPositionChild2 * (-574);
                    int i105 = ~packedPositionChild2;
                    int i106 = ~d9;
                    int i107 = ~((i105 ^ i106) | (i105 & i106));
                    int i108 = ~(d9 | (-129));
                    int i109 = ((((-73472) ^ i104) + ((i104 & (-73472)) << 1)) - (~(((i107 ^ i108) | (i107 & i108)) * 1150))) - 1;
                    int i110 = ~((i106 ^ 128) | (i106 & 128));
                    int i111 = ((i110 ^ i108) | (i108 & i110)) * (-575);
                    int i112 = ~((d9 ^ i105) | (d9 & i105));
                    int i113 = ~((packedPositionChild2 ^ i106) | (packedPositionChild2 & i106));
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    f(null, null, (((i109 & i111) + (i111 | i109)) - (~(((i113 ^ i112) | (i113 & i112)) * 575))) - 1, "\u0088\u0084\u0087\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0097\u0083\u0096\u0090\u0090\u0095\u0089\u0086\u0082\u0086\u0095\u0088\u0089\u008a\u0095", objArr12);
                    try {
                        java.lang.Object[] objArr13 = {(java.lang.String) objArr12[0]};
                        java.lang.Object d10 = com.facetec.sdk.al.d(1450487247);
                        if (d10 == null) {
                            char green2 = (char) (6935 - android.graphics.Color.green(0));
                            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            h(b6, b7, (byte) (b7 - 1), objArr14);
                            d10 = com.facetec.sdk.al.c(green2, 2389 - (edgeSlop >> 16), mirror - 25, -241445065, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr13)).longValue();
                        long j = 521943360;
                        long j2 = 433;
                        long j3 = -1;
                        long j4 = j ^ j3;
                        long j5 = i;
                        long j6 = ((-432) * j) + (434 * longValue) + ((((j4 | (j5 ^ j3)) | longValue) ^ j3) * j2) + ((-433) * (j4 | (((longValue ^ j3) | j5) ^ j3))) + ((((longValue | j) ^ j3) | ((j4 | j5) ^ j3)) * j2) + 1329233281;
                        int i114 = ~((-542123137) | i);
                        int i115 = ~(20564166 | i);
                        int i116 = (((int) (j6 >> 32)) & ((((-1996160734) | i114) * (-476)) + 99914466 + (i114 * 952) + ((~((-542123137) | i22)) * 476))) | (((((2099264 | i115) * (-196)) - 349924163) + ((i115 | 18464902) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)) & ((int) j6));
                        i5 = 1;
                        if (i116 == 1) {
                            d = (g + 83) % 128;
                            int[] iArr = new int[i5];
                            int[] iArr2 = new int[i5];
                            iArr[0] = i;
                            iArr2[0] = (i & (-11)) | (i22 & 10);
                            java.lang.Object[] objArr15 = {null, iArr, iArr2, new int[i5]};
                            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                            int i117 = ~((-790834231) | uptimeMillis);
                            int i118 = ~uptimeMillis;
                            int i119 = (((757269522 | i117) * (-280)) - 573702705) + ((i117 | (~((-33864366) | uptimeMillis))) * 140) + (((~(uptimeMillis | (-33564709))) | (~(i118 | (-757269523))) | (~((-299658) | i118))) * 140);
                            int i120 = (i119 * 503) + 8048;
                            int i121 = (i119 ^ 16) | (i119 & 16);
                            int i122 = i121 * (-502);
                            int i123 = (i120 & i122) + (i120 | i122);
                            int i124 = ~i119;
                            int i125 = (i22 ^ (-17)) | (i22 & (-17));
                            int i126 = (~((i124 ^ (-17)) | (i124 & (-17)))) | (~i125);
                            int i127 = ~((i ^ i121) | (i121 & i));
                            int i128 = -(-(((i126 ^ i127) | (i127 & i126)) * (-502)));
                            int i129 = (((i123 ^ i128) + ((i128 & i123) << 1)) - (~((i127 | (~(i125 | i119))) * 502))) - 1;
                            int i130 = (i3 & i129) + (i3 | i129);
                            int i131 = i130 << 13;
                            int i132 = (~(i130 & i131)) & (i130 | i131);
                            int i133 = i132 >>> 17;
                            int i134 = (~(i132 & i133)) & (i132 | i133);
                            ((int[]) objArr15[3])[0] = i134 ^ (i134 << 5);
                            return objArr15;
                        }
                        int i135 = g;
                        d = (((i135 | 107) << 1) - (i135 ^ 107)) % 128;
                        i4 = 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    int i136 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    f(null, null, (i136 & 127) + (i136 | 127), "\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0087\u0085\u0084", objArr16);
                    try {
                        java.lang.Object[] objArr17 = {(java.lang.String) objArr16[0]};
                        java.lang.Object d11 = com.facetec.sdk.al.d(1590238701);
                        if (d11 == null) {
                            char lastIndexOf2 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                            int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString("");
                            byte length2 = (byte) $$a.length;
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            h((byte) 0, length2, (byte) (length2 - 4), objArr18);
                            d11 = com.facetec.sdk.al.c(lastIndexOf2, 2078 - (doubleTapTimeout >> 16), keyCodeFromString2 + 24, -114923755, false, (java.lang.String) objArr18[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) d11).invoke(null, objArr17);
                        int i137 = -android.view.KeyEvent.normalizeMetaState(0);
                        int i138 = i137 * 375;
                        int i139 = ((-94869) & i138) + (i138 | (-94869));
                        int i140 = ~i137;
                        int i141 = i139 + (((~(i140 | 127)) | (~((i22 ^ i137) | (i22 & i137)))) * (-374));
                        int i142 = -(-((~((i137 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i137 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * 748));
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        f(null, null, (((i141 | i142) << 1) - (i141 ^ i142)) + (((~(i137 | i22)) | (~((i140 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i140 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)))) * 374), "\u009a", objArr19);
                        if (invoke2.equals((java.lang.String) objArr19[0])) {
                            i5 = 1;
                            int[] iArr3 = new int[i5];
                            int[] iArr22 = new int[i5];
                            iArr3[0] = i;
                            iArr22[0] = (i & (-11)) | (i22 & 10);
                            java.lang.Object[] objArr152 = {null, iArr3, iArr22, new int[i5]};
                            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                            int i1172 = ~((-790834231) | uptimeMillis2);
                            int i1182 = ~uptimeMillis2;
                            int i1192 = (((757269522 | i1172) * (-280)) - 573702705) + ((i1172 | (~((-33864366) | uptimeMillis2))) * 140) + (((~(uptimeMillis2 | (-33564709))) | (~(i1182 | (-757269523))) | (~((-299658) | i1182))) * 140);
                            int i1202 = (i1192 * 503) + 8048;
                            int i1212 = (i1192 ^ 16) | (i1192 & 16);
                            int i1222 = i1212 * (-502);
                            int i1232 = (i1202 & i1222) + (i1202 | i1222);
                            int i1242 = ~i1192;
                            int i1252 = (i22 ^ (-17)) | (i22 & (-17));
                            int i1262 = (~((i1242 ^ (-17)) | (i1242 & (-17)))) | (~i1252);
                            int i1272 = ~((i ^ i1212) | (i1212 & i));
                            int i1282 = -(-(((i1262 ^ i1272) | (i1272 & i1262)) * (-502)));
                            int i1292 = (((i1232 ^ i1282) + ((i1282 & i1232) << 1)) - (~((i1272 | (~(i1252 | i1192))) * 502))) - 1;
                            int i1302 = (i3 & i1292) + (i3 | i1292);
                            int i1312 = i1302 << 13;
                            int i1322 = (~(i1302 & i1312)) & (i1302 | i1312);
                            int i1332 = i1322 >>> 17;
                            int i1342 = (~(i1322 & i1332)) & (i1322 | i1332);
                            ((int[]) objArr152[3])[0] = i1342 ^ (i1342 << 5);
                            return objArr152;
                        }
                        i4 = 1;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                int[] iArr4 = new int[i4];
                int[] iArr5 = new int[i4];
                iArr4[0] = i;
                iArr5[0] = i;
                java.lang.Object[] objArr20 = {null, iArr4, iArr5, new int[i4]};
                int i143 = ~new java.util.Random().nextInt();
                int i144 = ((~((-550899732) | i143)) * (-783)) + 460957287 + (((~(i143 | 271150760)) | (-553547836)) * 783);
                int i145 = (i144 << 1) - i144;
                int i146 = ((i145 * (-520)) - (~(i3 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL))) - 1;
                int i147 = ~i145;
                int i148 = (i147 ^ i3) | (i147 & i3);
                int i149 = (~((i ^ i148) | (i & i148))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                int i150 = ~i3;
                int i151 = ~((i145 ^ i150) | (i150 & i145));
                int i152 = ~(i3 | (i147 & i22) | (i147 ^ i22));
                int i153 = (((i146 | i149) << 1) - (i149 ^ i146)) + (i151 * (-1042)) + (((i151 & i152) | (i152 ^ i151)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
                int i154 = i153 << 13;
                int i155 = ((~i154) & i153) | ((~i153) & i154);
                int i156 = i155 >>> 17;
                int i157 = (~(i155 & i156)) & (i155 | i156);
                int i158 = i157 << 5;
                ((int[]) objArr20[3])[0] = (i157 & (~i158)) | ((~i157) & i158);
                int i159 = d;
                int i160 = (i159 & 89) + (i159 | 89);
                g = i160 % 128;
                if (i160 % 2 != 0) {
                    return objArr20;
                }
                java.lang.Object obj2 = null;
                obj2.hashCode();
                throw null;
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    static byte[] b(android.content.Context context, java.lang.String str, byte[] bArr) throws java.lang.Exception {
        int d2 = com.facetec.sdk.gh.b.d();
        int d3 = com.facetec.sdk.gh.b.d();
        return (byte[]) c(new java.lang.Object[]{context, str, bArr}, com.facetec.sdk.gh.b.d(), 1741551005, com.facetec.sdk.gh.b.d(), -1741551003, d2, d3);
    }

    static byte[] e(java.io.File file, byte[] bArr) throws java.lang.Exception {
        int d2 = com.facetec.sdk.gh.b.d();
        int d3 = com.facetec.sdk.gh.b.d();
        return (byte[]) c(new java.lang.Object[]{file, bArr}, com.facetec.sdk.gh.b.d(), -1300678471, com.facetec.sdk.gh.b.d(), 1300678472, d2, d3);
    }
}
