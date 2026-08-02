package com.facetec.sdk;

/* loaded from: classes8.dex */
final class JNI {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.Object, java.lang.String> f3372a;
    private static int b;
    private static final byte[] c = null;
    private static final int d = 0;
    private static int e;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    @interface e {
        long b();
    }

    private static native void fnm(java.lang.Class<com.facetec.sdk.cq> cls, java.lang.Class<com.facetec.sdk.ea> cls2);

    private static native void rnm(long j, java.lang.String str, java.lang.String str2);

    JNI() {
    }

    static {
        a();
        b = 0;
        e = 1;
        java.util.HashMap hashMap = new java.util.HashMap();
        f3372a = hashMap;
        hashMap.put(java.lang.Boolean.TYPE, "Z");
        hashMap.put(java.lang.Byte.TYPE, "B");
        hashMap.put(java.lang.Character.TYPE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
        hashMap.put(java.lang.Double.TYPE, "D");
        hashMap.put(java.lang.Float.TYPE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        hashMap.put(java.lang.Integer.TYPE, com.visa.cbp.getEncExpo.warmup);
        hashMap.put(java.lang.Long.TYPE, "J");
        hashMap.put(java.lang.Short.TYPE, "S");
        hashMap.put(java.lang.Void.TYPE, "V");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i, byte b2, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = b2 + 44;
        byte[] bArr = c;
        int i5 = 1068 - i2;
        byte[] bArr2 = new byte[275 - i];
        int i6 = 274 - i;
        if (bArr == null) {
            i4 = i6;
            int i7 = i5;
            int i8 = 0;
            i4 += i5;
            i5 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i5 + 1;
            i7 = i9;
            i5 = bArr[i9];
            i4 += i5;
            i5 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    static void a() {
        byte[] bArr = new byte[1075];
        java.lang.System.arraycopy("\u000e\u0006%¶\u0004û\u0005û\u0006ú\u0007ù\u0001\u0005ú\u0001\u0006ù\u000bõ\fô\u0001\u0007ø\ró\u0001\b÷\u0001\tö\u0005\u0000û\u0005\u0001ú\u0005\u0002ù\u0005\u0003ø\u0001\nõ\u0005\u0006õ\u0001\u000bô\u0001\fó\u0001\u0004ÿü\u0001\u0004\u0000û\ró\u0005\bó\u0006þü\fô\u0001\b÷\u0001\u0004\u0001ú\u0006ÿû\u0005\u0002ù\u0005\u0003ø\u0001\u0004\u0002ù\u0006\u0000ú\u0005\u0003ø\u0001\u0004\u0003ø\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0001\u0004\u0000û\u0006\u0002ø\u0007ù\u0001\u0005ú\u0005\bó\u0006þü\fô\u0001\u0006ù\u0001\u0004\u0006õ\u0006\u0004ö\u0001\u0004\u0007ô\u0006\u0005õ\u0001\u0004\u0007ô\u0001\u0004\bó\u0006\u0006ô\u0001\u0005þü\u0006\u0007ó\u0001\u0005þ÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\u0004û\u0007þû\u0007ÿú\u0001\u0005ú\u0001\u0006ù\u0006\u0000ú\u0006\u0000ú\u0005\u0003ø\fô\u0001\u0007ø\ró\u0001\b÷\u0001\tö\u0007\u0000ù\u0007\u0001ø\u0007\u0002÷\u0001\nõ\u0006\u0000ú\u0005\u0003ø\u0001\u000bô\u0001\fó\u0001\u0004ÿü\u0001\u0004ÿü\u0001\u0004\u0000û\u0007\u0003ö\u0007\u0002÷\u0001\u0004\u0001ú\u0006\u0000ú\u0005\u0003ø\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0001\u0004\u0004÷\u0001\u0004\u0004\u0004û\u0006ú\u0001\u0005ú\u0007\u0005ô\u0005û\u0006ú\u0001\u0006ù\u0007ù\u0001\u0007ø\u0001\b÷\u0006\u0000ú\u0007\u0006ó\u0001\tö\ró\u0001\nõ\u0001\u000bô\büü\u0007\u0002÷\u0001\fó\u0006\u0000ú\u0005\u0003ø\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0001\u0004\u0001ú\u0001\u0004\u0002ù\býû\bþú\u0005\u0003ø\u0001\u0004\u0003ø\u0006\u0000ú\u0005\u0003ø\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0001\u0004\u0006õ\u0001\u0004\u0006÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õþ\u000fÚ\u0013\fø\u0004û\u0001\u0005ú\u0001\u0006ù\bÿù\u0001\u0007ø\b\u0000ø\b\u0001÷\b\u0002ö\u0001\b÷\b\u0003õ\b\u0005ó\u0001\tö\u0001\nõ\u0001\u000bô\tûü\tüû\týú\u0001\fó\u0001\u0004ÿü\fô\tþù\u0001\b÷\tÿø\u0001\u0004\u0000û\u0007þû\u0001\u0004\u0001ú\u0001\fó\u0001\u0004ÿü\t\u0000÷\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0006\u0000ú\u0007\u0006ó\u0001\u0004\u0004÷\ró\u0001\u0004\u0005ö\u0001\u0004\u0006õ\t\u0001ö\t\u0002õ\t\u0003ô\u0005\u0003ø\u0001\u0004\u0007ô\u0006\u0000ú\u0005\u0003ø\u0001\u0004\bó\u0001\u0005þü\u0001\u0005ÿû\t\u0004ó\núü\nûû\u0001\fó\u0001\u0004ÿü\fô\nüú\u0001\b÷\u0001\u0005\u0000ú\nýù\t\u0002õ\t\u0003ô\u0005\u0003ø\u0001\u0005\u0001ù\u0005\u0006õ\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0001\u0005\u0004ö\u0001\u0005\u0004ö\u0001\u0005\u0005õ\nþø\u0001\u0005\u0006ô\nÿ÷\u0001\u0005\u0006ô\u0001\u0005\u0007ó\n\u0000ö\u0001\u0006ýü\n\u0001õ\u0001\u0006ý÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùÛ3ô\u0003ø\u0001\rþ\u000fÜ\u0011\u0011ï\fø\u000fñ\râ%÷õ\u000e\u000f\u0000õ\töþ\u000fÞ\u0013\u000f\u0001ýüæ%÷õ\u0004û\u0007þû\u0001\u0005ú\u0001\u0006ù\u0001\u0007ø\u0001\b÷\u0007þû\u0001\tö\n\u0002ô\u0001\nõ\u0001\u000bô\u0007þû\u0001\fó\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0007þû\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0001\u0004\u0006õ\u0007þû\u0001\u0004\u0007ô\u0001\u0004\bó\u0001\u0005þü\u0001\u0005ÿû\u0001\u000bô\u0007þû\u0001\u0005\u0000ú\n\u0003ó\u0001\u0005\u0001ù\u0001\u0004ÿü\u000bùü\u0001\u0005\u0002ø\u0001\u0004\u0000û\u0001\u0005\u0003÷\u0006\u0000ú\u0006\u0000ú\u000búû\u0001\u0005\u0004ö\ró\u0001\u0005\u0003÷\ró\u0001\u0005\u0003÷\u0001\u0005\u0005õ\u000bûú\bþú\u0005\u0003ø\u0001\u0005\u0006ô\u0005\u0006õ\u0001\u0005\u0007ó\u0001\u0006ýü\u0001\u0006þû\u0001\u0006ÿú\ró\u0005\bó\u0006þü\fô\u0001\u0005\u0003÷\u0001\u0005\u0005õ\u000büù\bþú\u0005\u0003ø\u0001\u0005\u0006ô\u0005\u0006õ\u0001\u0006\u0000ù\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u0001\u0006\u0002÷\u0001\u0006\u0003ö\u000býø\u0001\u0006\u0004õ\u000bþ÷\u0001\u0006\u0004õ\u0001\u0006\u0005ô\u000bÿö\u0001\u0006\u0006ó\u000b\u0000õ\u0001\u0006\u0006÷\u0015ëÍGÿõ\u0003Â\u001f\u0014\u000fþ\u000f÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011ó\u000büõ\u0002\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 1075);
        c = bArr;
        d = 91;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039d A[Catch: all -> 0x0419, TryCatch #13 {all -> 0x0419, blocks: (B:106:0x0397, B:108:0x039d, B:109:0x039e, B:147:0x03a6), top: B:146:0x03a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039e A[Catch: all -> 0x0419, TryCatch #13 {all -> 0x0419, blocks: (B:106:0x0397, B:108:0x039d, B:109:0x039e, B:147:0x03a6), top: B:146:0x03a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0417 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:26:0x043e, B:38:0x03f9, B:169:0x0411, B:171:0x0417, B:172:0x0418, B:188:0x041f, B:122:0x0437, B:123:0x0447, B:124:0x045c, B:191:0x047d, B:192:0x048b, B:129:0x048c, B:135:0x04ac, B:140:0x04cb), top: B:37:0x03f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0418 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:26:0x043e, B:38:0x03f9, B:169:0x0411, B:171:0x0417, B:172:0x0418, B:188:0x041f, B:122:0x0437, B:123:0x0447, B:124:0x045c, B:191:0x047d, B:192:0x048b, B:129:0x048c, B:135:0x04ac, B:140:0x04cb), top: B:37:0x03f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0509 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String b(java.lang.Class<?> cls) {
        int i;
        java.lang.Throwable cause;
        java.lang.Object invoke;
        java.lang.Throwable cause2;
        int i2;
        int i3;
        int i4;
        com.facetec.sdk.dz dzVar = new com.facetec.sdk.dz(cls);
        byte[] bArr = c;
        short s = bArr[34];
        byte b2 = bArr[12];
        java.lang.Object[] objArr = new java.lang.Object[1];
        f(s, b2, (short) (b2 | 302), objArr);
        char c2 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s2 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
        byte b3 = bArr[34];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        f(s2, b3, (short) (b3 | 898), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) 259;
            char c3 = 175;
            short s4 = (short) 898;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f(s3, bArr[175], s4, objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f((short) 270, bArr[1044], (short) 883, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(s3, bArr[175], s4, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i5]};
                short s5 = (short) 258;
                byte[] bArr2 = c;
                byte b4 = bArr2[c3];
                short s6 = (short) 879;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(s5, b4, s6, objArr9);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                short s7 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                byte b5 = (byte) (-bArr2[3]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f(s7, b5, (short) (b5 | com.google.common.base.Ascii.NAK), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                f(s3, bArr2[175], s4, objArr11);
                java.lang.Object invoke2 = cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                f(s5, bArr2[175], s6, objArr12);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (byte) (bArr2[175] - 1), (short) 857, objArr13);
                iArr[i5] = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i5++;
                c2 = 0;
                c3 = 175;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                    i = 53;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i6 >= 56) {
                    }
                    throw th;
                }
                switch (dzVar.c(iArr[i6])) {
                    case -39:
                        i7 = 75;
                        i6 = i7;
                    case -38:
                        dzVar.c(25);
                        i7 = dzVar.f3534a != 40 ? 43 : 55;
                        i6 = i7;
                    case -37:
                        i = 70;
                        i6 = i;
                    case -36:
                        dzVar.c(25);
                        i7 = dzVar.f3534a != 31 ? 26 : 21;
                        i6 = i7;
                    case -35:
                        i6 = 1;
                    case -34:
                        i7 = 69;
                        i6 = i7;
                    case -33:
                        dzVar.c(23);
                        if (dzVar.f3534a == 0) {
                            i7 = 68;
                        }
                        i6 = i7;
                    case -32:
                        dzVar.c(18);
                        throw ((java.lang.Throwable) dzVar.j);
                    case -31:
                        i7 = 76;
                        i6 = i7;
                    case -30:
                        i7 = 78;
                        i6 = i7;
                    case -29:
                        dzVar.c(23);
                        if (dzVar.f3534a == 0) {
                            i6 = i;
                        }
                        i6 = i7;
                    case -28:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        e = dzVar.f3534a;
                        i6 = i7;
                    case -27:
                        i3 = b;
                        dzVar.c = i3;
                        dzVar.c(10);
                        i6 = i7;
                    case -26:
                        i6 = 60;
                    case -25:
                        dzVar.c(18);
                        return (java.lang.String) dzVar.j;
                    case -24:
                        try {
                            dzVar.c = 2;
                            dzVar.c(4);
                            dzVar.c(6);
                            java.lang.Object obj = dzVar.j;
                            dzVar.c(15);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                try {
                                    objArr14[0] = java.lang.Character.valueOf((char) dzVar.f3534a);
                                    try {
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, c[175], (short) 358, objArr15);
                                        try {
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            f((short) 269, (byte) 53, (short) 320, objArr16);
                                            try {
                                                invoke = cls5.getMethod((java.lang.String) objArr16[0], java.lang.Character.TYPE).invoke(obj, objArr14);
                                                try {
                                                    dzVar.f = invoke;
                                                    dzVar.c(37);
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    if (i6 >= 56 || i6 >= 60) {
                                                        throw th;
                                                    }
                                                    dzVar.f = th;
                                                    dzVar.c(30);
                                                    i7 = 54;
                                                    i6 = i7;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    cause = th.getCause();
                                    if (cause == null) {
                                    }
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            if (i6 >= 56) {
                            }
                            throw th;
                        }
                        i6 = i7;
                        break;
                    case -23:
                        try {
                            dzVar.c = 3;
                            dzVar.c(4);
                            dzVar.c(6);
                            java.lang.Object obj2 = dzVar.j;
                            dzVar.c(15);
                            char c4 = (char) dzVar.f3534a;
                            dzVar.c(15);
                            try {
                                java.lang.Object[] objArr17 = {java.lang.Character.valueOf(c4), java.lang.Character.valueOf((char) dzVar.f3534a)};
                                byte[] bArr3 = c;
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                f(s3, bArr3[175], s4, objArr18);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                try {
                                    try {
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, (byte) (-bArr3[449]), bArr3[34], objArr19);
                                        invoke = cls6.getMethod((java.lang.String) objArr19[0], java.lang.Character.TYPE, java.lang.Character.TYPE).invoke(obj2, objArr17);
                                        dzVar.f = invoke;
                                        dzVar.c(37);
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        cause2 = th.getCause();
                                        if (cause2 == null) {
                                            throw cause2;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    cause2 = th.getCause();
                                    if (cause2 == null) {
                                    }
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            if (i6 >= 56) {
                            }
                            throw th;
                        }
                        i6 = i7;
                        break;
                    case -22:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        invoke = ((java.lang.Class) dzVar.j).getName();
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -21:
                        invoke = "L";
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -20:
                        i2 = 41;
                        i6 = i2;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        invoke = dzVar.j;
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dzVar.c = 2;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj3 = dzVar.j;
                        dzVar.c(6);
                        try {
                            java.lang.Object[] objArr20 = {dzVar.j};
                            short s8 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                            byte[] bArr4 = c;
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            f(s8, bArr4[175], (short) 29, objArr21);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, (byte) 59, bArr4[448], objArr22);
                            java.lang.String str4 = (java.lang.String) objArr22[0];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            f(s3, bArr4[175], bArr4[452], objArr23);
                            invoke = cls7.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr23[0])).invoke(obj3, objArr20);
                            dzVar.f = invoke;
                            dzVar.c(37);
                            i6 = i7;
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause3 = th13.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th13;
                        }
                    case -17:
                        invoke = f3372a;
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -16:
                        i2 = 71;
                        i6 = i2;
                    case -15:
                        i2 = 73;
                        i6 = i2;
                    case -14:
                        dzVar.c(16);
                        if (dzVar.f3534a == 0) {
                            i2 = 20;
                            i6 = i2;
                        }
                        i6 = i7;
                    case -13:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        i4 = ((java.lang.Class) dzVar.j).isPrimitive();
                        i3 = i4;
                        dzVar.c = i3;
                        dzVar.c(10);
                        i6 = i7;
                    case -12:
                        i2 = 45;
                        i6 = i2;
                    case -11:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        invoke = dzVar.j.toString();
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -10:
                        dzVar.c = 2;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj4 = dzVar.j;
                        dzVar.c(6);
                        try {
                            java.lang.Object[] objArr24 = {dzVar.j};
                            short s9 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                            byte[] bArr5 = c;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            f(s9, bArr5[175], (short) 358, objArr25);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            f((short) 269, (byte) 53, (short) 320, objArr26);
                            java.lang.String str5 = (java.lang.String) objArr26[0];
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            f(s3, bArr5[175], s4, objArr27);
                            invoke = cls8.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr27[0])).invoke(obj4, objArr24);
                            dzVar.f = invoke;
                            dzVar.c(37);
                            i6 = i7;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th14;
                        }
                    case -9:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        invoke = b((java.lang.Class<?>) dzVar.j);
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -8:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        try {
                            java.lang.Object[] objArr28 = {dzVar.j};
                            short s10 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                            byte[] bArr6 = c;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            f(s10, bArr6[175], (short) 358, objArr29);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            f(s3, bArr6[175], s4, objArr30);
                            invoke = cls9.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr30[0])).newInstance(objArr28);
                            dzVar.f = invoke;
                            dzVar.c(37);
                            i6 = i7;
                        } catch (java.lang.Throwable th15) {
                            java.lang.Throwable cause5 = th15.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th15;
                        }
                    case -7:
                        invoke = "[";
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -6:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        invoke = ((java.lang.Class) dzVar.j).getComponentType();
                        dzVar.f = invoke;
                        dzVar.c(37);
                        i6 = i7;
                    case -5:
                        i = 16;
                        i6 = i;
                    case -4:
                        i6 = 6;
                    case -3:
                        dzVar.c(16);
                        if (dzVar.f3534a == 0) {
                            i2 = 5;
                            i6 = i2;
                        }
                        i6 = i7;
                    case -2:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        i4 = ((java.lang.Class) dzVar.j).isArray();
                        i3 = i4;
                        dzVar.c = i3;
                        dzVar.c(10);
                        i6 = i7;
                    case -1:
                        i6 = 37;
                    default:
                        i6 = i7;
                }
            }
            throw th;
        } catch (java.lang.Throwable th16) {
            java.lang.Throwable cause6 = th16.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th16;
        }
    }

    static java.lang.String b(java.lang.reflect.Method method) {
        int i;
        int i2;
        java.lang.Object obj;
        java.lang.Object invoke;
        com.facetec.sdk.dz dzVar = new com.facetec.sdk.dz(method);
        short s = (short) (d & 61);
        byte[] bArr = c;
        byte b2 = bArr[12];
        java.lang.Object[] objArr = new java.lang.Object[1];
        f(s, b2, (short) (b2 | 606), objArr);
        char c2 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s2 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
        byte b3 = bArr[34];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        f(s2, b3, (short) (b3 | 898), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s3 = (short) 259;
            char c3 = 175;
            short s4 = (short) 898;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f(s3, bArr[175], s4, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f((short) 270, bArr[1044], (short) 883, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(s3, bArr[175], s4, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                short s5 = (short) 258;
                byte[] bArr2 = c;
                short s6 = (short) 879;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(s5, bArr2[c3], s6, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                short s7 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                byte b4 = (byte) (-bArr2[3]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f(s7, b4, (short) (b4 | com.google.common.base.Ascii.NAK), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                f(s3, bArr2[175], s4, objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                f(s5, bArr2[175], s6, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (byte) (bArr2[175] - 1), (short) 857, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i3++;
                c2 = 0;
                c3 = 175;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                switch (dzVar.c(iArr[i4])) {
                    case -30:
                        i4 = 71;
                    case -29:
                        dzVar.c(25);
                        int i6 = dzVar.f3534a;
                        i4 = (i6 == 0 || i6 != 1) ? 36 : 22;
                        break;
                    case -28:
                        i4 = 66;
                    case -27:
                        dzVar.c(25);
                        int i7 = dzVar.f3534a;
                        i4 = (i7 == 19 || i7 != 45) ? 47 : 14;
                        break;
                    case -26:
                        i4 = 34;
                    case -25:
                        i4 = 65;
                    case -24:
                        dzVar.c(16);
                        i4 = dzVar.f3534a == 0 ? 64 : i5;
                    case -23:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        b = dzVar.f3534a;
                    case -22:
                        i = e;
                        dzVar.c = i;
                        i2 = 10;
                        dzVar.c(i2);
                    case -21:
                        i4 = 67;
                    case -20:
                        i4 = 69;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dzVar.c(23);
                        if (dzVar.f3534a == 0) {
                            i4 = 46;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        e = dzVar.f3534a;
                    case -17:
                        i = b;
                        dzVar.c = i;
                        i2 = 10;
                        dzVar.c(i2);
                    case -16:
                        dzVar.c(18);
                        return (java.lang.String) dzVar.j;
                    case -15:
                        i4 = 1;
                    case -14:
                        i4 = 55;
                    case -13:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        obj = dzVar.j.toString();
                        dzVar.f = obj;
                        i2 = 37;
                        dzVar.c(i2);
                    case -12:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj2 = dzVar.j;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        f((short) (d | 160), c[175], (short) 636, objArr14);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                        byte b5 = (byte) 59;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, b5, (short) (b5 | 256), objArr15);
                        obj = cls4.getMethod((java.lang.String) objArr15[0], null).invoke(obj2, null);
                        dzVar.f = obj;
                        i2 = 37;
                        dzVar.c(i2);
                    case -11:
                        dzVar.c = 2;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj3 = dzVar.j;
                        dzVar.c(15);
                        java.lang.Object[] objArr16 = {java.lang.Character.valueOf((char) dzVar.f3534a)};
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, c[175], (short) 358, objArr17);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        f((short) 269, (byte) 53, (short) 320, objArr18);
                        invoke = cls5.getMethod((java.lang.String) objArr18[0], java.lang.Character.TYPE).invoke(obj3, objArr16);
                        dzVar.f = invoke;
                        dzVar.c(37);
                    case -10:
                        dzVar.c = 2;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj4 = dzVar.j;
                        dzVar.c(6);
                        java.lang.Object[] objArr19 = {dzVar.j};
                        short s8 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                        byte[] bArr3 = c;
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        f(s8, bArr3[175], (short) 358, objArr20);
                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        f((short) 269, (byte) 53, (short) 320, objArr21);
                        java.lang.String str4 = (java.lang.String) objArr21[0];
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        f(s3, bArr3[175], s4, objArr22);
                        invoke = cls6.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr22[0])).invoke(obj4, objArr19);
                        dzVar.f = invoke;
                        dzVar.c(37);
                    case -9:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        invoke = b((java.lang.Class<?>) dzVar.j);
                        dzVar.f = invoke;
                        dzVar.c(37);
                    case -8:
                        i4 = 72;
                    case -7:
                        i4 = 74;
                    case -6:
                        dzVar.c(48);
                        if (dzVar.f3534a == 0) {
                            i4 = 13;
                        }
                    case -5:
                        i4 = 9;
                    case -4:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj5 = dzVar.j;
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        f((short) (d | 160), c[175], (short) 636, objArr23);
                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        f((short) 258, (byte) 59, (short) 336, objArr24);
                        invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj5, null);
                        dzVar.f = invoke;
                        dzVar.c(37);
                    case -3:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object[] objArr25 = {dzVar.j};
                        short s9 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                        byte[] bArr4 = c;
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        f(s9, bArr4[175], (short) 358, objArr26);
                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        f(s3, bArr4[175], s4, objArr27);
                        invoke = cls8.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr27[0])).newInstance(objArr25);
                        dzVar.f = invoke;
                        dzVar.c(37);
                    case -2:
                        invoke = "(";
                        dzVar.f = invoke;
                        dzVar.c(37);
                    case -1:
                        i4 = 31;
                    default:
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void a(long j, java.lang.reflect.Method method) {
        int i;
        com.facetec.sdk.dz dzVar = new com.facetec.sdk.dz(j, method);
        byte[] bArr = c;
        byte b2 = bArr[12];
        java.lang.Object[] objArr = new java.lang.Object[1];
        f((short) 163, b2, (short) (b2 | 746), objArr);
        char c2 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
        byte b3 = bArr[34];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        f(s, b3, (short) (b3 | 898), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s2 = (short) 259;
            char c3 = 175;
            short s3 = (short) 898;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f(s2, bArr[175], s3, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f((short) 270, bArr[1044], (short) 883, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(s2, bArr[175], s3, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                short s4 = (short) 258;
                byte[] bArr2 = c;
                byte b4 = bArr2[c3];
                short s5 = (short) 879;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(s4, b4, s5, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                short s6 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                byte b5 = (byte) (-bArr2[3]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f(s6, b5, (short) (b5 | com.google.common.base.Ascii.NAK), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                f(s2, bArr2[175], s3, objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                f(s4, bArr2[175], s5, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (byte) (bArr2[175] - 1), (short) 857, objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c2 = 0;
                c3 = 175;
            }
            int i3 = 0;
            while (true) {
                switch (dzVar.c(iArr[i3])) {
                    case -17:
                        i3 = 13;
                    case -16:
                        i3 = 35;
                    case -15:
                        dzVar.c(16);
                        i3 = dzVar.f3534a == 0 ? 34 : i3 + 1;
                    case -14:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        b = dzVar.f3534a;
                    case -13:
                        i = e;
                        dzVar.c = i;
                        dzVar.c(10);
                    case -12:
                        i3 = 1;
                    case -11:
                        i3 = 24;
                    case -10:
                        dzVar.c(23);
                        if (dzVar.f3534a == 0) {
                            i3 = 23;
                        }
                    case -9:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        e = dzVar.f3534a;
                    case -8:
                        i = b;
                        dzVar.c = i;
                        dzVar.c(10);
                    case -7:
                        return;
                    case -6:
                        i3 = 15;
                    case -5:
                        i3 = 25;
                    case -4:
                        dzVar.c = 3;
                        dzVar.c(4);
                        dzVar.c(5);
                        long j2 = dzVar.b;
                        dzVar.c(6);
                        java.lang.String str4 = (java.lang.String) dzVar.j;
                        dzVar.c(6);
                        e(j2, str4, (java.lang.String) dzVar.j);
                    case -3:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Object obj = dzVar.j;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        f((short) (d | 160), c[175], (short) 636, objArr14);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, (byte) 59, (short) 613, objArr15);
                        dzVar.f = cls4.getMethod((java.lang.String) objArr15[0], null).invoke(obj, null);
                        dzVar.c(37);
                    case -2:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(6);
                        dzVar.f = b((java.lang.reflect.Method) dzVar.j);
                        dzVar.c(37);
                    case -1:
                        i3 = 10;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x012d. Please report as an issue. */
    static void b(java.lang.Class<com.facetec.sdk.cq> cls, java.lang.Class<com.facetec.sdk.ea> cls2) {
        int i;
        com.facetec.sdk.dz dzVar = new com.facetec.sdk.dz(cls, cls2);
        byte[] bArr = c;
        java.lang.Object[] objArr = new java.lang.Object[1];
        f((short) 171, bArr[12], (short) 850, objArr);
        int i2 = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
        byte b2 = bArr[34];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        f(s, b2, (short) (b2 | 898), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s2 = (short) 259;
            char c2 = 175;
            short s3 = (short) 898;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f(s2, bArr[175], s3, objArr4);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f((short) 270, bArr[1044], (short) 883, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(s2, bArr[175], s3, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls3.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                short s4 = (short) 258;
                byte[] bArr2 = c;
                short s5 = (short) 879;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(s4, bArr2[c2], s5, objArr9);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr9[i2]);
                short s6 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                byte b3 = (byte) (-bArr2[3]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f(s6, b3, (short) (b3 | com.google.common.base.Ascii.NAK), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                f(s2, bArr2[175], s3, objArr11);
                java.lang.Object invoke = cls4.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                f(s4, bArr2[175], s5, objArr12);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (byte) (bArr2[175] - 1), (short) 857, objArr13);
                iArr[i3] = ((java.lang.Integer) cls5.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i3++;
                i2 = 0;
                c2 = 175;
            }
            while (true) {
                switch (dzVar.c(iArr[i2])) {
                    case -15:
                        i2 = 1;
                    case -14:
                        i2 = 32;
                    case -13:
                        dzVar.c(23);
                        i2 = dzVar.f3534a == 0 ? 31 : i2 + 1;
                    case -12:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        e = dzVar.f3534a;
                    case -11:
                        i = b;
                        dzVar.c = i;
                        dzVar.c(10);
                    case -10:
                        i2 = 10;
                    case -9:
                        i2 = 22;
                    case -8:
                        dzVar.c(16);
                        if (dzVar.f3534a == 0) {
                            i2 = 21;
                        }
                    case -7:
                        dzVar.c = 1;
                        dzVar.c(4);
                        dzVar.c(15);
                        b = dzVar.f3534a;
                    case -6:
                        i = e;
                        dzVar.c = i;
                        dzVar.c(10);
                    case -5:
                        break;
                    case -4:
                        i2 = 23;
                    case -3:
                        i2 = 12;
                    case -2:
                        dzVar.c = 2;
                        dzVar.c(4);
                        dzVar.c(6);
                        java.lang.Class cls6 = (java.lang.Class) dzVar.j;
                        dzVar.c(6);
                        fnm(cls6, (java.lang.Class) dzVar.j);
                    case -1:
                        i2 = 5;
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x018a, code lost:
    
        r1.c = r7;
        r1.c(10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(long j, java.lang.String str, java.lang.String str2) {
        int i;
        int i2;
        com.facetec.sdk.dz dzVar = new com.facetec.sdk.dz(j, str, str2);
        byte[] bArr = c;
        byte b2 = bArr[12];
        java.lang.Object[] objArr = new java.lang.Object[1];
        f((short) 107, b2, (short) (b2 | 1064), objArr);
        int i3 = 0;
        java.lang.String str3 = (java.lang.String) objArr[0];
        short s = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
        byte b3 = bArr[34];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        f(s, b3, (short) (b3 | 898), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s2 = (short) 259;
            char c2 = 175;
            short s3 = (short) 898;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            f(s2, bArr[175], s3, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            f((short) 270, bArr[1044], (short) 883, objArr5);
            java.lang.String str4 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(s2, bArr[175], s3, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str3, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i4]};
                short s4 = (short) 258;
                byte[] bArr2 = c;
                short s5 = (short) 879;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(s4, bArr2[c2], s5, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[i3]);
                short s6 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                byte b4 = (byte) (-bArr2[3]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f(s6, b4, (short) (b4 | com.google.common.base.Ascii.NAK), objArr10);
                java.lang.String str5 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                f(s2, bArr2[175], s3, objArr11);
                java.lang.Object invoke = cls2.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                f(s4, bArr2[175], s5, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                f((short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (byte) (bArr2[175] - 1), (short) 857, objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i4++;
                c2 = 175;
                i3 = 0;
            }
            while (true) {
                int i5 = i3;
                while (true) {
                    i3 = i5 + 1;
                    try {
                    } catch (java.lang.Throwable th) {
                        if (i5 >= 23 && i5 < 27) {
                            i = 21;
                        } else {
                            if (i5 < 41 || i5 >= 45) {
                                throw th;
                            }
                            i = 37;
                        }
                        i5 = i;
                        dzVar.f = th;
                        dzVar.c(30);
                    }
                    switch (dzVar.c(iArr[i5])) {
                        case -20:
                            i5 = 50;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            dzVar.c(25);
                            int i6 = dzVar.f3534a;
                            if (i6 != 54 && i6 == 62) {
                                i3 = 38;
                                break;
                            } else {
                                i5 = 1;
                            }
                            break;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i5 = 45;
                        case -17:
                            dzVar.c(25);
                            int i7 = dzVar.f3534a;
                            if (i7 != 74 && i7 == 96) {
                                i3 = 9;
                                break;
                            }
                            i3 = 22;
                            break;
                        case -16:
                            i5 = 51;
                        case -15:
                            i5 = 53;
                        case -14:
                            dzVar.c(23);
                            if (dzVar.f3534a != 0) {
                                break;
                            } else {
                                i3 = 36;
                                break;
                            }
                        case -13:
                            dzVar.c = 1;
                            dzVar.c(4);
                            dzVar.c(15);
                            e = dzVar.f3534a;
                            break;
                        case -12:
                            i2 = b;
                            break;
                        case -11:
                            dzVar.c(18);
                            throw ((java.lang.Throwable) dzVar.j);
                            break;
                        case -10:
                            i5 = 46;
                        case -9:
                            i5 = 48;
                        case -8:
                            dzVar.c(16);
                            if (dzVar.f3534a != 0) {
                                break;
                            } else {
                                i3 = 20;
                                break;
                            }
                        case -7:
                            dzVar.c = 1;
                            dzVar.c(4);
                            dzVar.c(15);
                            b = dzVar.f3534a;
                            break;
                        case -6:
                            i2 = e;
                            break;
                        case -5:
                            return;
                        case -4:
                            i5 = 27;
                        case -3:
                            i5 = 11;
                        case -2:
                            dzVar.c = 3;
                            dzVar.c(4);
                            dzVar.c(5);
                            long j2 = dzVar.b;
                            dzVar.c(6);
                            java.lang.String str6 = (java.lang.String) dzVar.j;
                            dzVar.c(6);
                            rnm(j2, str6, (java.lang.String) dzVar.j);
                            break;
                        case -1:
                            i5 = 6;
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
}
