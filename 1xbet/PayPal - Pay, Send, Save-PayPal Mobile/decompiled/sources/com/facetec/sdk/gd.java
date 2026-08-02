package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gd extends com.facetec.sdk.fd<java.lang.Object> {
    private static final com.facetec.sdk.fb e = a((com.facetec.sdk.fa) com.facetec.sdk.fc.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.eo f3588a;
    private final com.facetec.sdk.fa c;

    /* synthetic */ gd(com.facetec.sdk.eo eoVar, com.facetec.sdk.fa faVar, byte b) {
        this(eoVar, faVar);
    }

    private gd(com.facetec.sdk.eo eoVar, com.facetec.sdk.fa faVar) {
        this.f3588a = eoVar;
        this.c = faVar;
    }

    private static com.facetec.sdk.fb a(final com.facetec.sdk.fa faVar) {
        return new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gd.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static int[] f3589a;
            private static int b;
            private static int e;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b2, int i, byte b3) {
                int i2;
                byte[] bArr = $$c;
                int i3 = 73 - (b2 * 3);
                int i4 = b3 * 4;
                int i5 = 4 - (i * 2);
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                if (bArr == null) {
                    int i7 = i5;
                    i3 = i6;
                    i2 = 0;
                    i5++;
                    i3 += i7;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i2++;
                    i7 = bArr[i5];
                    i5++;
                    i3 += i7;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void g(int i, byte b2, short s, java.lang.Object[] objArr) {
                int i2;
                int i3;
                int i4 = (i * 3) + 4;
                byte[] bArr = $$a;
                int i5 = s * 2;
                byte[] bArr2 = new byte[1 - i5];
                int i6 = 0 - i5;
                if (bArr == null) {
                    i3 = i4;
                    int i7 = i6;
                    i2 = 0;
                    i4 += i7;
                    i3++;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i2++;
                    i7 = bArr[i3];
                    i4 += i7;
                    i3++;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i6) {
                    }
                } else {
                    int i8 = 101 - b2;
                    i2 = 0;
                    i3 = i4;
                    i4 = i8;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i6) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{66, 105, 75, -104};
                $$b = 100;
            }

            static void init$1() {
                $$c = new byte[]{120, com.google.common.base.Ascii.ETB, -59, 3};
                $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
            }

            @Override // com.facetec.sdk.fb
            public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
                int i = e + 109;
                b = i % 128;
                java.lang.Object obj = null;
                if (i % 2 != 0) {
                    gwVar.a();
                    throw null;
                }
                if (gwVar.a() != java.lang.Object.class) {
                    return null;
                }
                com.facetec.sdk.gd gdVar = new com.facetec.sdk.gd(eoVar, com.facetec.sdk.fa.this, (byte) 0);
                int i2 = b + 83;
                e = i2 % 128;
                if (i2 % 2 != 0) {
                    return gdVar;
                }
                obj.hashCode();
                throw null;
            }

            private static void f(int[] iArr, int i, java.lang.Object[] objArr) {
                com.facetec.sdk.hl hlVar = new com.facetec.sdk.hl();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = f3589a;
                int i2 = -915298838;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i3 = 0;
                    while (i3 < length) {
                        $10 = ($11 + 11) % 128;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i3])};
                            java.lang.Object d = com.facetec.sdk.al.d(-915298838);
                            if (d == null) {
                                d = com.facetec.sdk.al.c((char) (28976 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1694 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 24 - android.view.View.resolveSizeAndState(0, 0, 0), 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            iArr3[i3] = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
                            i3++;
                            $10 = ($11 + 15) % 128;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = f3589a;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i4 = 0;
                    while (i4 < length3) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr5[i4])};
                        java.lang.Object d2 = com.facetec.sdk.al.d(i2);
                        if (d2 == null) {
                            d2 = com.facetec.sdk.al.c((char) (28976 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.view.KeyEvent.normalizeMetaState(0) + 1693, 24 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        iArr6[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                        i4++;
                        i2 = -915298838;
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                hlVar.d = 0;
                while (hlVar.d < iArr.length) {
                    cArr[0] = (char) (iArr[hlVar.d] >> 16);
                    cArr[1] = (char) iArr[hlVar.d];
                    cArr[2] = (char) (iArr[hlVar.d + 1] >> 16);
                    cArr[3] = (char) iArr[hlVar.d + 1];
                    hlVar.c = (cArr[0] << 16) + cArr[1];
                    hlVar.e = (cArr[2] << 16) + cArr[3];
                    com.facetec.sdk.hl.d(iArr4);
                    int i5 = 0;
                    for (int i6 = 16; i5 < i6; i6 = 16) {
                        hlVar.c ^= iArr4[i5];
                        java.lang.Object[] objArr4 = {hlVar, java.lang.Integer.valueOf(com.facetec.sdk.hl.c(hlVar.c)), hlVar, hlVar};
                        java.lang.Object d3 = com.facetec.sdk.al.d(-1807501612);
                        if (d3 == null) {
                            char c = (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                            int size = android.view.View.MeasureSpec.getSize(0);
                            float complexToFloat = android.util.TypedValue.complexToFloat(0);
                            byte b2 = (byte) ($$d & 3);
                            byte b3 = (byte) (b2 - 1);
                            d3 = com.facetec.sdk.al.c(c, 407 - size, 24 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 866962476, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).intValue();
                        hlVar.c = hlVar.e;
                        hlVar.e = intValue;
                        i5++;
                    }
                    int i7 = hlVar.c;
                    hlVar.c = hlVar.e;
                    hlVar.e = i7;
                    hlVar.e ^= iArr4[16];
                    hlVar.c ^= iArr4[17];
                    int i8 = hlVar.c;
                    int i9 = hlVar.e;
                    cArr[0] = (char) (hlVar.c >>> 16);
                    cArr[1] = (char) hlVar.c;
                    cArr[2] = (char) (hlVar.e >>> 16);
                    cArr[3] = (char) hlVar.e;
                    com.facetec.sdk.hl.d(iArr4);
                    cArr2[hlVar.d * 2] = cArr[0];
                    cArr2[(hlVar.d * 2) + 1] = cArr[1];
                    cArr2[(hlVar.d * 2) + 2] = cArr[2];
                    cArr2[(hlVar.d * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr5 = {hlVar, hlVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-260749244);
                    if (d4 == null) {
                        byte b4 = (byte) 0;
                        d4 = com.facetec.sdk.al.c((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 18697), 1787 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, 1469723324, false, $$e(b4, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr5);
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                b = 0;
                e = 1;
                f3589a = new int[]{834378201, 1078345137, -64593554, 1308267944, 1277641588, -620565140, 1219853696, 1593672614, 416981121, 1477765251, 911282799, 1275671186, -1959694257, -1244798429, -1605159341, -887080565, 676376386, 729238586};
            }

            /* JADX WARN: Code restructure failed: missing block: B:38:0x044d, code lost:
            
                if (r0.contains(((java.lang.reflect.Field) r3).get(null)) != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x071e, code lost:
            
                if (r0.equals((java.lang.String) r7[0]) != false) goto L74;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x035c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0368  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] d(android.content.Context context, int i, int i2, int i3) {
                java.lang.Object[] objArr;
                int i4;
                int i5;
                if (context == null) {
                    int i6 = b;
                    e = ((i6 & 121) + (i6 | 121)) % 128;
                    java.lang.Object[] objArr2 = {null, new int[]{i}, new int[]{i}, new int[]{(~(r1 & r2)) & r6}};
                    int i7 = ~i;
                    int i8 = ((((~((-133692789) | i)) | 19392868) * 345) - 228475144) + (((~((-133692789) | i7)) | 671612939) * 345) + ((~((-19392869) | i)) * 345);
                    int i9 = i8 * 407;
                    int i10 = ~i8;
                    int i11 = ~((i10 & i) | (i10 ^ i));
                    int i12 = ~(i8 | i7);
                    int i13 = (i11 | i12) * (-406);
                    int i14 = (i9 & i13) + (i9 | i13);
                    int i15 = -(-((~((i7 ^ i10) | (i10 & i7))) * (-406)));
                    int i16 = (i14 & i15) + (i15 | i14);
                    int i17 = -(-(((~(i | (i ^ (-1)))) | i12) * 406));
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    int i19 = ((i3 | i18) << 1) - (i3 ^ i18);
                    int i20 = i19 << 13;
                    int i21 = (~(i19 & i20)) & (i19 | i20);
                    int i22 = i21 >>> 17;
                    int i23 = (i21 & (~i22)) | ((~i21) & i22);
                    int i24 = i23 << 5;
                    int i25 = i23 | i24;
                    int i26 = (i6 & 11) + (i6 | 11);
                    e = i26 % 128;
                    if (i26 % 2 != 0) {
                        return objArr2;
                    }
                    throw null;
                }
                try {
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int b2 = com.facetec.sdk.px.b();
                    int i27 = (resolveOpacity * (-813)) + 9384;
                    int i28 = ~((resolveOpacity ^ (-24)) | (resolveOpacity & (-24)));
                    int i29 = ~((resolveOpacity ^ b2) | (resolveOpacity & b2));
                    int i30 = ((i28 & i29) | (i28 ^ i29)) * (-814);
                    int i31 = ((i27 | i30) << 1) - (i27 ^ i30);
                    int i32 = ~b2;
                    int i33 = ~((i32 ^ (-24)) | (i32 & (-24)));
                    int i34 = ~resolveOpacity;
                    int i35 = ~((i34 ^ 23) | (i34 & 23));
                    int i36 = ((i33 & i35) | (i33 ^ i35) | i29) * 407;
                    int i37 = (i31 ^ i36) + ((i36 & i31) << 1);
                    int i38 = (~((i34 & b2) | (i34 ^ b2))) | i35;
                    int i39 = ~((b2 & 23) | (b2 ^ 23));
                    int i40 = -(-(((i38 ^ i39) | (i38 & i39)) * 407));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f(new int[]{-833521681, -464317639, -1686435923, -760890905, 264356625, 1218216050, 935725280, -2023517505, -636521741, -423423511, 1466223150, -2082990739}, (i37 & i40) + (i40 | i37), objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    int i41 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    f(new int[]{-63495061, 1410664390, 1285027619, -219865923, 45372293, -548910823, 455480973, 1725543614, -1320857562, -340658447}, ((i41 | 18) << 1) - (i41 ^ 18), objArr4);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], null).invoke(context, null);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f(new int[]{-833521681, -464317639, -1686435923, -760890905, 264356625, 1218216050, 935725280, -2023517505, 312861455, -918261860, 1285027619, -219865923, 45372293, -548910823, 455480973, 1725543614, -1320857562, -340658447}, android.view.Gravity.getAbsoluteGravity(0, 0) + 34, objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    int i42 = -android.view.MotionEvent.axisFromString("");
                    int i43 = i42 * (-813);
                    int i44 = ~((i42 ^ (-5)) | (i42 & (-5)));
                    int i45 = ~((i42 ^ i) | (i42 & i));
                    int i46 = (((i43 ^ 1632) + ((i43 & 1632) << 1)) - (~(-(-(((i44 ^ i45) | (i44 & i45)) * (-814)))))) - 1;
                    int i47 = ~i;
                    int i48 = ~((i47 & (-5)) | (i47 ^ (-5)));
                    int i49 = ~i42;
                    int i50 = ~(i49 | 4);
                    int i51 = (i48 ^ i50) | (i48 & i50);
                    int i52 = ~(i42 | i);
                    int i53 = -(-(((i52 ^ i51) | (i51 & i52)) * 407));
                    int i54 = (i46 ^ i53) + ((i53 & i46) << 1);
                    int i55 = (~((i49 ^ 4) | (i49 & 4))) | (~(i49 | i));
                    int i56 = ~((i ^ 4) | (i & 4));
                    int i57 = ((i55 ^ i56) | (i55 & i56)) * 407;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f(new int[]{-1893576951, -1507857864, -1110809281, 1102070067}, (i54 ^ i57) + ((i57 & i54) << 1), objArr6);
                    if ((cls2.getField((java.lang.String) objArr6[0]).getInt(invoke) & 2) != 0) {
                        int i58 = e;
                        int i59 = i58 + 81;
                        b = i59 % 128;
                        boolean z = i59 % 2 == 0;
                        int i60 = (i58 + 23) % 128;
                        b = i60;
                        if (z) {
                            e = (i60 + 77) % 128;
                            objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i ^ 1}, new int[1]};
                            int i61 = (~android.os.Process.myUid()) | (-14223681);
                            int i62 = (((((~i61) | 838922276) * (-828)) + 775335191) + (i61 * (-828))) - 1107694848;
                            int i63 = -(-(i62 * (-489)));
                            int i64 = ~i62;
                            int i65 = (i64 & (-17)) | (i64 ^ (-17));
                            int i66 = (((i63 ^ 7856) + ((i63 & 7856) << 1)) - (~(-(-(((i65 & i47) | (i65 ^ i47)) * (-490)))))) - 1;
                            int i67 = ~((i64 ^ 16) | (i64 & 16));
                            int i68 = ~((i64 ^ i) | (i64 & i));
                            int i69 = -(-(((i67 ^ i68) | (i68 & i67)) * 490));
                            int i70 = (i66 & i69) + (i69 | i66);
                            int i71 = (i70 & (-8330)) + (i70 | (-8330));
                            int i72 = i71 * (-167);
                            int i73 = i3 * (-167);
                            int i74 = (i72 & i73) + (i72 | i73);
                            int i75 = ~i71;
                            int i76 = ~i3;
                            int i77 = (i75 & i76) | (i75 ^ i76);
                            int i78 = ~i77;
                            int i79 = ~((i76 ^ i47) | (i76 & i47));
                            int i80 = -(-(((i78 & i79) | (i79 ^ i78)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                            int i81 = (i74 & i80) + (i80 | i74);
                            int i82 = (~((i77 & i) | (i77 ^ i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                            int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                            int i84 = ~(i47 | i75);
                            int i85 = ~((i75 ^ i3) | (i75 & i3));
                            int i86 = (i84 ^ i85) | (i85 & i84);
                            int i87 = (i71 ^ i76) | (i71 & i76);
                            int i88 = ~((i87 ^ i) | (i87 & i));
                            int i89 = ((i86 ^ i88) | (i88 & i86)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                            int i90 = ((i83 | i89) << 1) - (i89 ^ i83);
                            int i91 = i90 << 13;
                            int i92 = ((~i91) & i90) | ((~i90) & i91);
                            int i93 = i92 >>> 17;
                            int i94 = (~(i92 & i93)) & (i92 | i93);
                            ((int[]) objArr[3])[0] = i94 ^ (i94 << 5);
                            if (((int[]) objArr[2])[0] == i) {
                                int i95 = e;
                                b = ((i95 & 25) + (i95 | 25)) % 128;
                                return objArr;
                            }
                            try {
                                java.lang.Object d = com.facetec.sdk.al.d(1023220397);
                                if (d == null) {
                                    char tapTimeout = (char) (42581 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                    byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                    int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 + 2);
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    g(b3, b4, (byte) (b4 - 2), objArr7);
                                    d = com.facetec.sdk.al.c(tapTimeout, 1551 - modifierMetaStateMask, packedPositionGroup + 24, -1693294507, false, (java.lang.String) objArr7[0], new java.lang.Class[0]);
                                }
                                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) d).invoke(null, null);
                                java.lang.Object d2 = com.facetec.sdk.al.d(-230269676);
                                if (d2 == null) {
                                    char rgb = (char) ((-16734635) - android.graphics.Color.rgb(0, 0, 0));
                                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    g(b5, b6, b6, objArr8);
                                    d2 = com.facetec.sdk.al.c(rgb, makeMeasureSpec + 1552, keyCodeFromString + 24, 1437149164, false, (java.lang.String) objArr8[0], null);
                                }
                                if (!set.contains(((java.lang.reflect.Field) d2).get(null))) {
                                    int i96 = e;
                                    b = ((i96 ^ 5) + ((i96 & 5) << 1)) % 128;
                                    java.lang.Object d3 = com.facetec.sdk.al.d(-233963760);
                                    if (d3 == null) {
                                        char offsetAfter = (char) (android.text.TextUtils.getOffsetAfter("", 0) + 42581);
                                        int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                                        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                        byte length = (byte) $$a.length;
                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                        g((byte) 0, length, (byte) (length - 4), objArr9);
                                        d3 = com.facetec.sdk.al.c(offsetAfter, (tapTimeout2 >> 16) + 1552, (maximumFlingVelocity >> 16) + 24, 1440908776, false, (java.lang.String) objArr9[0], null);
                                    }
                                }
                                if (android.os.Build.VERSION.SDK_INT == 30) {
                                    int i97 = e;
                                    b = ((i97 ^ 73) + ((i97 & 73) << 1)) % 128;
                                    java.lang.Object[] objArr10 = {null, new int[]{i}, new int[]{i}, new int[1]};
                                    int myUid = android.os.Process.myUid();
                                    int i98 = -(-((((-294128389) | (~myUid)) * (-490)) + 472204233 + (((~(myUid | (-294378255))) | 249866) * 490) + 2136037476));
                                    int i99 = (i3 & i98) + (i98 | i3);
                                    int i100 = i99 << 13;
                                    int i101 = ((~i100) & i99) | ((~i99) & i100);
                                    int i102 = i101 >>> 17;
                                    int i103 = (i101 & (~i102)) | ((~i101) & i102);
                                    int i104 = i103 << 5;
                                    ((int[]) objArr10[3])[0] = (i103 & (~i104)) | ((~i103) & i104);
                                    return objArr10;
                                }
                                if ((i2 & 32) == 0) {
                                    e = (b + 61) % 128;
                                    if (android.os.Build.VERSION.SDK_INT > 33) {
                                        int i105 = e;
                                        b = ((i105 & 85) + (i105 | 85)) % 128;
                                        int i106 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int b7 = com.facetec.sdk.px.b();
                                        int i107 = i106 * (-665);
                                        int i108 = ~i106;
                                        int i109 = (((i107 & 9686) + (i107 | 9686)) - (~(-(-(i108 * (-333)))))) - 1;
                                        int i110 = ~b7;
                                        int i111 = ~((i110 & i108) | (i108 ^ i110));
                                        int i112 = ~((b7 ^ 29) | (b7 & 29));
                                        int i113 = ((i111 ^ i112) | (i111 & i112)) * com.visa.cbp.getCertUsage.getODAData;
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        f(new int[]{1894928644, 1820983792, -913735663, 647110106, 1483301007, 1106484731, -805293612, 915089063, 1308108246, -1455354359, -1956470035, -1375780611, 1260838777, -1472012559}, (i109 & i113) + (i109 | i113) + (((~((i108 ^ b7) | (i108 & b7))) | (~(i110 | 29))) * com.visa.cbp.getCertUsage.getODAData), objArr11);
                                        try {
                                            java.lang.Object[] objArr12 = {(java.lang.String) objArr11[0]};
                                            java.lang.Object d4 = com.facetec.sdk.al.d(1450487247);
                                            if (d4 == null) {
                                                char red = (char) (android.graphics.Color.red(0) + 6935);
                                                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                                                byte b8 = (byte) 0;
                                                byte b9 = (byte) (b8 + 3);
                                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                g(b8, b9, (byte) (b9 - 3), objArr13);
                                                d4 = com.facetec.sdk.al.c(red, 2388 - lastIndexOf, (keyRepeatDelay >> 16) + 23, -241445065, false, (java.lang.String) objArr13[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr12)).longValue();
                                            long j = 669735251;
                                            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                                            long j2 = -518;
                                            long j3 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                            i5 = i47;
                                            long j4 = -1;
                                            long j5 = elapsedRealtime;
                                            long j6 = (j ^ j4) | (j5 ^ j4);
                                            long j7 = (j2 * j) + (j2 * longValue) + (((j6 ^ j4) | longValue) * j3) + ((-519) * (((j6 | longValue) ^ j4) | (((j | longValue) | j5) ^ j4))) + (j3 * (((j5 | longValue) ^ j4) | j)) + 1181441390;
                                            int i114 = (int) (j7 >> 32);
                                            int i115 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                                            int i116 = (int) j7;
                                            int myPid = android.os.Process.myPid();
                                            int i117 = ~((-1624841852) | (~myPid));
                                            if (((i114 & ((((((~(r6 | 1004319497)) | (-2147284812)) | (~((-710456074) | i115))) * 886) - 701614026) + (((~((-1004319498) | i115)) | (-1853421388)) * (-1772)) + ((~(i115 | (-1853421388))) * 886))) | (i116 & (((((((~((-187615442) | r8)) | 187089024) | (~(1624841851 | r8))) | (~((-1624315435) | myPid))) * (-84)) - 1905160647) + (((~(myPid | 1624841851)) | 187615441 | i117) * (-84)) + ((1624315434 | i117) * 84)))) != 1) {
                                                b = (e + 7) % 128;
                                                i4 = 1;
                                            }
                                            e = (b + 5) % 128;
                                            java.lang.Object[] objArr14 = {null, new int[]{i}, new int[]{(i & (-11)) | (i5 & 10)}, new int[1]};
                                            int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                                            int i118 = (((~((-209715203) | freeMemory)) | (-1034944511)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1947721988 + ((~((~freeMemory) | (-209715203))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 16;
                                            int i119 = (i3 ^ i118) + ((i3 & i118) << 1);
                                            int i120 = i119 << 13;
                                            int i121 = (i119 & (~i120)) | ((~i119) & i120);
                                            int i122 = i121 >>> 17;
                                            int i123 = (~(i121 & i122)) & (i121 | i122);
                                            int i124 = i123 << 5;
                                            ((int[]) objArr14[3])[0] = (~(i123 & i124)) & (i123 | i124);
                                            e = (b + 107) % 128;
                                            return objArr14;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                    i5 = i47;
                                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i125 = (indexOf * (-563)) + 7910;
                                    int i126 = ~indexOf;
                                    int i127 = ~(i5 | (-15));
                                    int i128 = (i127 ^ i126) | (i126 & i127);
                                    int i129 = ~((i ^ 14) | (i & 14));
                                    int i130 = -(-(((i128 ^ i129) | (i128 & i129)) * (-564)));
                                    int i131 = (i125 ^ i130) + ((i125 & i130) << 1);
                                    int i132 = (i126 ^ 14) | (i126 & 14);
                                    int i133 = -(-((~((i132 ^ i) | (i132 & i))) * 1128));
                                    int i134 = ((i131 | i133) << 1) - (i133 ^ i131);
                                    int i135 = ~((i126 & i5) | (i126 ^ i5));
                                    int i136 = ~((indexOf ^ 14) | (indexOf & 14));
                                    int i137 = -(-(((i136 ^ i135) | (i136 & i135)) * 564));
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    f(new int[]{1827702315, -269327970, 1308108246, -1455354359, -1956470035, -1375780611, 1070171005, 1697368961}, (i134 ^ i137) + ((i137 & i134) << 1), objArr15);
                                    try {
                                        java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                                        java.lang.Object d5 = com.facetec.sdk.al.d(1590238701);
                                        if (d5 == null) {
                                            char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                                            int threadPriority = android.os.Process.getThreadPriority(0);
                                            byte b10 = (byte) 0;
                                            byte b11 = b10;
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            g(b10, b11, b11, objArr17);
                                            d5 = com.facetec.sdk.al.c(keyRepeatTimeout, 2078 - offsetAfter2, ((threadPriority + 20) >> 6) + 24, -114923755, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.Object invoke2 = ((java.lang.reflect.Method) d5).invoke(null, objArr16);
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        f(new int[]{-268174363, -17602567}, 0 - (~(-(-android.text.TextUtils.indexOf("", "", 0)))), objArr18);
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i4 = 1;
                                }
                                int[] iArr = new int[i4];
                                int[] iArr2 = new int[i4];
                                iArr[0] = i;
                                iArr2[0] = i;
                                java.lang.Object[] objArr19 = {null, iArr, iArr2, new int[i4]};
                                int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                int i138 = ~freeMemory2;
                                int i139 = (((~(821542399 | i138)) | 3156196) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 754186031 + (((~(i138 | 812722415)) | 11976180) * (-440)) + ((freeMemory2 | 821542399) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                int b12 = com.facetec.sdk.px.b();
                                int i140 = i139 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                int i141 = (i139 ^ (-1)) | i139;
                                int i142 = (~((b12 ^ i141) | (b12 & i141))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                int i143 = ((i140 | i142) << 1) - (i142 ^ i140);
                                int i144 = ~(~i139);
                                int i145 = -(-(i144 * (-1042)));
                                int i146 = (i143 & i145) + (i145 | i143);
                                int i147 = ~i141;
                                int i148 = -(-(((i144 ^ i147) | (i144 & i147)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                int i149 = -(-((i146 & i148) + (i148 | i146)));
                                int i150 = ((i3 | i149) << 1) - (i149 ^ i3);
                                int i151 = i150 << 13;
                                int i152 = ((~i151) & i150) | ((~i150) & i151);
                                int i153 = i152 >>> 17;
                                int i154 = (~(i152 & i153)) & (i152 | i153);
                                ((int[]) objArr19[3])[0] = i154 ^ (i154 << 5);
                                return objArr19;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                    }
                    objArr = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[]{(r3 & (~r10)) | r12}};
                    int i155 = ((((~((-302000177) | i)) | (~((-19206785) | i47))) * 497) - 1258377888) + (((~((-503491636) | i47)) | 201491459 | (~((-19206785) | i))) * 497);
                    int i156 = (i155 << 1) - i155;
                    int i157 = ((i156 * lib.android.paypal.com.magnessdk.g.e) - (~(i3 * 407))) - 1;
                    int i158 = ~i3;
                    int i159 = ~((i158 ^ i) | (i158 & i));
                    int i160 = ~((i47 ^ i156) | (i47 & i156) | i3);
                    int i161 = ((i159 ^ i160) | (i159 & i160)) * (-406);
                    int i162 = (((i157 | i161) << 1) - (i157 ^ i161)) + ((~((i158 & i47) | (i158 ^ i47) | i156)) * (-406));
                    int i163 = ~i156;
                    int i164 = -(-(((~((i163 ^ i) | (i163 & i))) | (~((i47 & i3) | (i47 ^ i3)))) * 406));
                    int i165 = (i162 ^ i164) + ((i164 & i162) << 1);
                    int i166 = i165 << 13;
                    int i167 = (~(i166 & i165)) & (i166 | i165);
                    int i168 = i167 >>> 17;
                    int i169 = (i167 & (~i168)) | ((~i167) & i168);
                    int i170 = i169 << 5;
                    int i171 = (~i169) & i170;
                    if (((int[]) objArr[2])[0] == i) {
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        };
    }

    public static com.facetec.sdk.fb d(com.facetec.sdk.fa faVar) {
        if (faVar == com.facetec.sdk.fc.DOUBLE) {
            return e;
        }
        return a(faVar);
    }

    /* renamed from: com.facetec.sdk.gd$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3590a;

        static {
            int[] iArr = new int[com.facetec.sdk.gs.values().length];
            f3590a = iArr;
            try {
                iArr[com.facetec.sdk.gs.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3590a[com.facetec.sdk.gs.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3590a[com.facetec.sdk.gs.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f3590a[com.facetec.sdk.gs.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f3590a[com.facetec.sdk.gs.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f3590a[com.facetec.sdk.gs.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private static java.lang.Object b(com.facetec.sdk.gt gtVar, com.facetec.sdk.gs gsVar) throws java.io.IOException {
        int i = com.facetec.sdk.gd.AnonymousClass5.f3590a[gsVar.ordinal()];
        if (i == 1) {
            gtVar.a();
            return new java.util.ArrayList();
        }
        if (i != 2) {
            return null;
        }
        gtVar.b();
        return new com.facetec.sdk.fp();
    }

    private java.lang.Object a(com.facetec.sdk.gt gtVar, com.facetec.sdk.gs gsVar) throws java.io.IOException {
        int i = com.facetec.sdk.gd.AnonymousClass5.f3590a[gsVar.ordinal()];
        if (i == 3) {
            return gtVar.g();
        }
        if (i == 4) {
            return this.c.c(gtVar);
        }
        if (i == 5) {
            return java.lang.Boolean.valueOf(gtVar.j());
        }
        if (i == 6) {
            gtVar.k();
            return null;
        }
        throw new java.lang.IllegalStateException("Unexpected token: ".concat(java.lang.String.valueOf(gsVar)));
    }

    @Override // com.facetec.sdk.fd
    public final java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        com.facetec.sdk.gs f = gtVar.f();
        java.lang.Object b = b(gtVar, f);
        if (b == null) {
            return a(gtVar, f);
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            if (gtVar.d()) {
                java.lang.String i = b instanceof java.util.Map ? gtVar.i() : null;
                com.facetec.sdk.gs f2 = gtVar.f();
                java.lang.Object b2 = b(gtVar, f2);
                boolean z = b2 != null;
                java.lang.Object a2 = b2 == null ? a(gtVar, f2) : b2;
                if (b instanceof java.util.List) {
                    ((java.util.List) b).add(a2);
                } else {
                    ((java.util.Map) b).put(i, a2);
                }
                if (z) {
                    arrayDeque.addLast(b);
                    b = a2;
                }
            } else {
                if (b instanceof java.util.List) {
                    gtVar.e();
                } else {
                    gtVar.c();
                }
                if (arrayDeque.isEmpty()) {
                    return b;
                }
                b = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.facetec.sdk.fd
    public final void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            guVar.g();
            return;
        }
        com.facetec.sdk.fd e2 = this.f3588a.e(obj.getClass());
        if (e2 instanceof com.facetec.sdk.gd) {
            guVar.e();
            guVar.d();
        } else {
            e2.a(guVar, obj);
        }
    }
}
