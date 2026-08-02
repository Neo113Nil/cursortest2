package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class fr {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static long f3578a;
    private static char[] b;
    private static int c;
    public static com.facetec.sdk.fr d;
    private static long e;
    private static int i;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(short s, short s2, byte b2) {
        int i2;
        int i3;
        byte[] bArr = $$c;
        int i4 = 110 - b2;
        int i5 = 1 - (s2 * 3);
        int i6 = 3 - (s * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i7 = bArr[i6];
            i4 += -i7;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i2, int i3, byte b2, java.lang.Object[] objArr) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i3 * 4;
        int i6 = 101 - b2;
        int i7 = i2 + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i8;
            int i10 = 0;
            i6 = (-i6) + i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            i7++;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            i9 = i6;
            i6 = bArr[i7];
            i10 = i11;
            i6 = (-i6) + i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            i7++;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            i7++;
            if (i4 == i8) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.NAK, -36, 87, 14};
        $$b = 43;
    }

    static void init$1() {
        $$c = new byte[]{98, -14, -54, 38};
        $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }

    public abstract void a(com.facetec.sdk.gt gtVar) throws java.io.IOException;

    private static void g(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.Object obj = null;
        if (str != null) {
            int i3 = $11 + 15;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str.toCharArray();
                obj.hashCode();
                throw null;
            }
            cArr = str.toCharArray();
            $10 = ($11 + 51) % 128;
        } else {
            cArr = str;
        }
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b2 = com.facetec.sdk.hu.b(e ^ 4732878740741522786L, cArr, i2);
        int i4 = 4;
        huVar.b = 4;
        while (huVar.b < b2.length) {
            $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            huVar.e = huVar.b - i4;
            int i5 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % i4]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(e)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-474326228);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6935), 2389 - android.text.TextUtils.getTrimmedLength(""), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, 1146429908, false, $$e(b3, b4, (byte) (b4 + 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(-57140341);
                if (d3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    d3 = com.facetec.sdk.al.c((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 884, 31 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1534550387, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                i4 = 4;
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

    private static void h(char c2, int i2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i3];
        hhVar.e = 0;
        $10 = ($11 + 67) % 128;
        while (hhVar.e < i3) {
            int i4 = $11 + 7;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(b[i2 / i5])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                    if (d2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        d2 = com.facetec.sdk.al.c((char) (45149 - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2150, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, 1926116241, false, $$e(b2, b3, (byte) (b3 + 5)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(f3578a), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                    if (d3 == null) {
                        byte b4 = (byte) 0;
                        d3 = com.facetec.sdk.al.c((char) android.text.TextUtils.getTrimmedLength(""), 1834 - android.text.TextUtils.indexOf("", ""), android.widget.ExpandableListView.getPackedPositionType(0L) + 24, -1880730373, false, $$e(b4, b4, (byte) $$c.length), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                    if (d4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        d4 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", ""), 2340 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 24, -1839099840, false, $$e(b5, b6, (byte) (b6 | 8)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = hhVar.e;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(b[i2 + i6])};
                java.lang.Object d5 = com.facetec.sdk.al.d(-719238807);
                if (d5 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 45150), 2150 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 24, 1926116241, false, $$e(b7, b8, (byte) (b8 + 5)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(f3578a), java.lang.Integer.valueOf(c2)};
                java.lang.Object d6 = com.facetec.sdk.al.d(671690243);
                if (d6 == null) {
                    byte b9 = (byte) 0;
                    d6 = com.facetec.sdk.al.c((char) android.view.Gravity.getAbsoluteGravity(0, 0), 1835 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 25 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1880730373, false, $$e(b9, b9, (byte) $$c.length), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr6)).longValue();
                java.lang.Object[] objArr7 = {hhVar, hhVar};
                java.lang.Object d7 = com.facetec.sdk.al.d(898558648);
                if (d7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    d7 = com.facetec.sdk.al.c((char) android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2340, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24, -1839099840, false, $$e(b10, b11, (byte) (b11 | 8)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d7).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        hhVar.e = 0;
        while (hhVar.e < i3) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr8 = {hhVar, hhVar};
            java.lang.Object d8 = com.facetec.sdk.al.d(898558648);
            if (d8 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                d8 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2342, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24, -1839099840, false, $$e(b12, b13, (byte) (b13 | 8)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d8).invoke(null, objArr8);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i7 = $11 + 53;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        c = 0;
        i = 1;
        e = -3028250713298148048L;
        b = new char[]{59704, 61798, 55711, 41017, 34913, 37016, 31528, 17261, 56626, 50553, 60866, 37938, 48234, 42113, 20256, 30575, 8083, 1586, 11826, 54913, 63793, 57709, 35200, 45103, 22605, 16600, 27425, 4931, 15254, 8763, 51778, 62107, 38195, 48466, 42377, 19488, 29773, 7308, 3470, 5522, 15737, 17600, 27862, 29798, 40907, 42898, 53093, 54920, 65169, 1663, 10690, 12699, 22840, 24783, 34980, 36981, 48088, 50084, 60286, 62158, 6823, 8823, 17876, 28137, 30063, 40144, 12777, 27771, 29736, 23764, 9543, 3369, 5585, 65127, 50739, 27763, 29731, 23746, 9591, 3378, 27763, 29756, 23763, 9578, 3364, 5511, 43801, 45900, 39870, 57863, 51784, 53929, 14594, 326, 27062, 28679, 22535, 41140, 36617, 38730, 65459, 50699, 27754, 29758, 23769, 9598, 3361, 5595, 65138, 50732, 44751, 46975, 40754, 26571, 18534, 20520, 54491, 52378, 58472, 40388, 46468, 44393, 18137, 10902, 13010, 6695, 25486, 19401, 21282, 47259, 32986, 59431, 61902, 55754, 8483, 3724, 5839, 32292, 18332, 56090, 49994, 60323, 37391, 47699, 41648, 18699, 28992, 6582, 35217, 37313, 47400, 49284, 59608, 61499, 7040, 9163, 19261, 21205, 1978, 8183, 14100, 20132, 26361, 32261, 38292, 44518, 50438, 56484, 62705, 3090, 9131, 15330, 39482, 33331, 43723, 54136, 64302, 58260, 2146, 12330, 22729, 16757, 26982, 37332, 48745, 42538, 52949, 63338, 7942, 27701, 29759, 23759, 9579, 3382, 5585, 65139, 50799, 44744, 46965, 40744, 63777, 57643, 51675, 45183, 38946, 32965, 27495, 21371, 15302, 8810, 2619, 62162, 23034, 16870, 26893, 4276, 26721, 28720, 22737, 8575, 2338, 4563, 64112, 27701, 29736, 23767, 9580, 3363, 5531, 65138, 50735, 44745, 46973, 40746, 26503, 9362, 15512, 5235, 28118, 17803, 23868, 27701, 29759, 23759, 9579, 3382, 5585, 65139, 50799, 44744, 46965, 40744, 26503, 18492, 20513, 14550, 356, 59733, 27701, 29759, 23759, 9579, 3382, 5585, 65139, 50799, 44761, 46968, 40809, 26576, 18544, 20525, 14528, 319, 27701, 29759, 23759, 9579, 3382, 5585, 65139, 50799, 44767, 46959, 40756, 26503, 18533, 20513, 14467, 382, 59679, 61897, 55922, 41557, 35536, 37755, 31505, 17364, 9253, 13499, 11441, 1089, 32229, 21944, 19807, 42749, 40673, 63068, 61424, 51105, 16200, 4275, 23853, 17697, 28125, 5234, 15477, 9422, 53103, 63286, 40861, 1506, 7647, 13624, 19586, 25788, 31804, 27701, 29756, 23748, 9591, 3361, 5531, 27701, 29729, 23769, 9581, 3372, 5568, 65133, 39980, 33905, 44188, 54565, 64816, 58756, 3619, 13938, 24209, 18286, 28494, 38812, 47164, 41085, 51347, 61736};
        f3578a = 6238846267607184460L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1403, code lost:
    
        if (r3 < 25.2d) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x1405, code lost:
    
        com.facetec.sdk.fr.i = (com.facetec.sdk.fr.c + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        r1 = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, new int[]{0}};
        r2 = (int) android.os.Process.getElapsedCpuTime();
        r3 = ~r2;
        r2 = (((((~(r2 | 1472039309)) | ((~((-11829257) | r3)) | (-1606388704))) * (-68)) + 1654006363) + ((~((-134349395) | r3)) * (-68))) + (((~(r3 | (-1472039310))) | (-146178651)) * 68);
        r3 = (r2 ^ 16) + ((r2 & 16) << 1);
        r5 = ((r3 | 1175161750) << 1) - (1175161750 ^ r3);
        r2 = r5 << 13;
        r2 = (~(r2 & r5)) & (r2 | r5);
        r3 = r2 >>> 17;
        r2 = (~(r2 & r3)) & (r2 | r3);
        ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x147d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x118f, code lost:
    
        if (((r2 ^ r3) | (r3 & r2)) == 477111747) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x12a8, code lost:
    
        if (((((int) r2) & ((((((-83919105) | r3) * (-676)) + 1051432089) + (((~((-84599041) | r7)) | 83919104) * 676)) + (((~(r3 | (-679937))) | ((~(r7 | 1352627369)) | (-1436546474))) * 676))) | (((((((~(483049655 | r6)) | ((~(r6 | (-954176756))) | 538252352)) * 464) + 1877584106) + (((-415924404) | r5) * (-464))) + (((~(r5 | 483049655)) | 538252352) * 464)) & r4)) == 477111747) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0932, code lost:
    
        r1 = com.facetec.sdk.fr.i;
        r2 = (r1 & 31) + (r1 | 31);
        com.facetec.sdk.fr.c = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x093f, code lost:
    
        if ((r2 % 2) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0943, code lost:
    
        r1 = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, new int[]{0}};
        r2 = android.os.Process.myUid();
        r3 = ~r2;
        r3 = (((((~(r3 | (-986615940))) | 441090179) | (~(631602020 | r3))) * (-397)) + 1805681107) + ((r2 | 527166439) * 397);
        r2 = (r3 ^ 16) + ((r3 & 16) << 1);
        r4 = (r2 & 1175161750) + (r2 | 1175161750);
        r2 = r4 << 13;
        r2 = ((~r2) & r4) | ((~r4) & r2);
        r3 = r2 >>> 17;
        r2 = (r2 & (~r3)) | ((~r2) & r3);
        ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x09a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0930, code lost:
    
        if (r2.equals((java.lang.String) r10[0]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0552, code lost:
    
        if (((r1 & ((((((~((-2022172680) | r2)) | (~((-584946269) | r4))) * (-1808)) + 335709898) + (((~((-1476552708) | r2)) | (~((-39326297) | r4))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r2 | 584946268)) | 545619972) | (~(r4 | 2022172679))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) r10) & (((((1790425706 | r8) * 376) + 2088992125) + (((~((~r8) | 533132896)) | 1613826058) * (-376))) + (((~(r8 | (-533132897))) | (-1970359307)) * 376)))) != 477111747) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x065d, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) != (-1032769152)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x077d, code lost:
    
        if (((r1 ^ r3) | (r3 & r1)) == 542074309) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x08a5, code lost:
    
        if (((r1 & ((((((~((-1443922478) | r2)) | (~((~r2) | (-6696067)))) * (-318)) + 1528459082) + (((~(1461310013 | r2)) | (-1468006080)) * (-318))) + (((~(r2 | (-1461310014))) | 24083602) * 318))) | ((((((~(1691565891 | r5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 378057645) + (((-16793617) | r8) * (-216))) + (((~(1691565891 | r8)) | 1166174994) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)) & r4)) == 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x106f, code lost:
    
        if (((r2 ^ r3) | (r2 & r3)) != 477111747) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x12aa, code lost:
    
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x12ae, code lost:
    
        if (r2 >= 28) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x12b0, code lost:
    
        r4 = r1[r2];
        r6 = r25;
        r10 = new java.lang.Object[1];
        g("࠴ࠛ蜼㙦朝濆\uf6bb콃褈\ue6c3矧䷗\u0ac6斷\uf53c챯", (-android.text.TextUtils.indexOf(r6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x12d1, code lost:
    
        r4 = new java.lang.Object[]{((java.lang.String) r10[0]).concat(java.lang.String.valueOf(r4))};
        r5 = com.facetec.sdk.al.d(1450487247);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x12dc, code lost:
    
        if (r5 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x12de, code lost:
    
        r9 = (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6935);
        r5 = android.view.ViewConfiguration.getFadingEdgeLength();
        r10 = android.view.View.resolveSizeAndState(0, 0, 0);
        r11 = (byte) (-1);
        r7 = (byte) (r11 + 1);
        r14 = new java.lang.Object[1];
        f(r11, r7, (byte) (r7 + 3), r14);
        r5 = com.facetec.sdk.al.c(r9, (r5 >> 16) + 2389, r10 + 23, -241445065, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x1319, code lost:
    
        r4 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r4)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x1326, code lost:
    
        r9 = 913251058;
        r8 = 464;
        r27 = r4 ^ r23;
        r25 = r6;
        r6 = new java.util.Random().nextInt(1162186946);
        r29 = r6 ^ r23;
        r31 = (r27 | r9) ^ r23;
        r11 = (((((465 * r9) + ((-463) * r4)) + (((((r27 | r29) ^ r23) | r31) | ((r29 | r9) ^ r23)) * r8)) + ((-464) * (((r9 ^ r23) | r6) | r27))) + (r8 * (r31 | ((r9 | r6) ^ r23)))) + 937925583;
        r5 = new java.util.Random().nextInt(1931424638);
        r6 = ~r5;
        r4 = ((int) (r11 >> 32)) & ((((((~((-950163082) | r6)) | r7) * 1150) - 334238508) + (((~((-487063330) | r5)) | (~(487063329 | r6))) * (-575))) + (((~(r5 | (-950163082))) | (~(r6 | 950163081))) * 575));
        r5 = ((int) r11) & (((((~(1496293613 | r6)) | 1361447272) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1451378865) + (((~((~new java.util.Random().nextInt(1056362298)) | 1496293613)) | 2304) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x13db, code lost:
    
        if (((r4 ^ r5) | (r4 & r5)) != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x13dd, code lost:
    
        com.facetec.sdk.fr.i = (com.facetec.sdk.fr.c + 37) % 128;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x13e8, code lost:
    
        r4 = -(-r4);
        r3 = ((r3 | r4) << 1) - (r3 ^ r4);
        r2 = r2 - 70;
        r2 = ((r2 & 71) << 1) + (r2 ^ 71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x13e7, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x14b7 A[Catch: all -> 0x3cc0, TryCatch #0 {all -> 0x3cc0, blocks: (B:3:0x0003, B:5:0x000e, B:6:0x0043, B:13:0x0178, B:15:0x0185, B:16:0x01bf, B:26:0x022c, B:28:0x0236, B:29:0x0272, B:31:0x02ab, B:33:0x02b5, B:34:0x02f2, B:36:0x02fb, B:38:0x0312, B:39:0x035a, B:46:0x07b0, B:48:0x07bd, B:49:0x07f2, B:54:0x0d64, B:56:0x0d71, B:57:0x0db0, B:66:0x0e6d, B:68:0x0e7a, B:69:0x0eb5, B:71:0x0ee6, B:73:0x0ef3, B:74:0x0f36, B:77:0x0f4d, B:79:0x0f64, B:80:0x0faa, B:87:0x12d1, B:89:0x12de, B:90:0x1319, B:104:0x14aa, B:106:0x14b7, B:107:0x14fa, B:109:0x15df, B:111:0x15ec, B:112:0x162c, B:122:0x1799, B:124:0x17a6, B:125:0x17e8, B:127:0x18bc, B:129:0x18c9, B:130:0x1910, B:147:0x1c3c, B:149:0x1c49, B:150:0x1c7f, B:184:0x20db, B:186:0x20e8, B:187:0x211c, B:190:0x2144, B:192:0x2151, B:193:0x2192, B:200:0x2580, B:202:0x258d, B:203:0x25c3, B:217:0x2737, B:219:0x2759, B:220:0x27a5, B:228:0x28f4, B:230:0x2917, B:231:0x2963, B:237:0x2ad3, B:239:0x2ad9, B:240:0x2b1b, B:251:0x31fd, B:253:0x320e, B:254:0x324c, B:260:0x33aa, B:262:0x33b0, B:263:0x33f0, B:269:0x3517, B:271:0x353b, B:272:0x3586, B:278:0x36cb, B:280:0x36d8, B:281:0x3715, B:287:0x3844, B:289:0x384a, B:290:0x3884, B:296:0x39ab, B:298:0x39b1, B:299:0x39ef, B:305:0x3b28, B:307:0x3b50, B:308:0x3bab, B:326:0x2c4c, B:328:0x2c52, B:329:0x2c8d, B:336:0x2dab, B:338:0x2db1, B:339:0x2de8, B:344:0x2ee9, B:346:0x2eef, B:347:0x2f21, B:352:0x3038, B:354:0x303e, B:355:0x3075, B:426:0x108a, B:428:0x109f, B:429:0x10de, B:432:0x1193, B:434:0x11aa, B:435:0x11e5, B:446:0x08be, B:448:0x08cb, B:449:0x0901, B:454:0x0422, B:456:0x0439, B:457:0x0481, B:462:0x055c, B:464:0x0573, B:465:0x05b0, B:470:0x066a, B:472:0x0681, B:473:0x06bd), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x15ec A[Catch: all -> 0x3cc0, TryCatch #0 {all -> 0x3cc0, blocks: (B:3:0x0003, B:5:0x000e, B:6:0x0043, B:13:0x0178, B:15:0x0185, B:16:0x01bf, B:26:0x022c, B:28:0x0236, B:29:0x0272, B:31:0x02ab, B:33:0x02b5, B:34:0x02f2, B:36:0x02fb, B:38:0x0312, B:39:0x035a, B:46:0x07b0, B:48:0x07bd, B:49:0x07f2, B:54:0x0d64, B:56:0x0d71, B:57:0x0db0, B:66:0x0e6d, B:68:0x0e7a, B:69:0x0eb5, B:71:0x0ee6, B:73:0x0ef3, B:74:0x0f36, B:77:0x0f4d, B:79:0x0f64, B:80:0x0faa, B:87:0x12d1, B:89:0x12de, B:90:0x1319, B:104:0x14aa, B:106:0x14b7, B:107:0x14fa, B:109:0x15df, B:111:0x15ec, B:112:0x162c, B:122:0x1799, B:124:0x17a6, B:125:0x17e8, B:127:0x18bc, B:129:0x18c9, B:130:0x1910, B:147:0x1c3c, B:149:0x1c49, B:150:0x1c7f, B:184:0x20db, B:186:0x20e8, B:187:0x211c, B:190:0x2144, B:192:0x2151, B:193:0x2192, B:200:0x2580, B:202:0x258d, B:203:0x25c3, B:217:0x2737, B:219:0x2759, B:220:0x27a5, B:228:0x28f4, B:230:0x2917, B:231:0x2963, B:237:0x2ad3, B:239:0x2ad9, B:240:0x2b1b, B:251:0x31fd, B:253:0x320e, B:254:0x324c, B:260:0x33aa, B:262:0x33b0, B:263:0x33f0, B:269:0x3517, B:271:0x353b, B:272:0x3586, B:278:0x36cb, B:280:0x36d8, B:281:0x3715, B:287:0x3844, B:289:0x384a, B:290:0x3884, B:296:0x39ab, B:298:0x39b1, B:299:0x39ef, B:305:0x3b28, B:307:0x3b50, B:308:0x3bab, B:326:0x2c4c, B:328:0x2c52, B:329:0x2c8d, B:336:0x2dab, B:338:0x2db1, B:339:0x2de8, B:344:0x2ee9, B:346:0x2eef, B:347:0x2f21, B:352:0x3038, B:354:0x303e, B:355:0x3075, B:426:0x108a, B:428:0x109f, B:429:0x10de, B:432:0x1193, B:434:0x11aa, B:435:0x11e5, B:446:0x08be, B:448:0x08cb, B:449:0x0901, B:454:0x0422, B:456:0x0439, B:457:0x0481, B:462:0x055c, B:464:0x0573, B:465:0x05b0, B:470:0x066a, B:472:0x0681, B:473:0x06bd), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x16ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x17a6 A[Catch: all -> 0x3cc0, TryCatch #0 {all -> 0x3cc0, blocks: (B:3:0x0003, B:5:0x000e, B:6:0x0043, B:13:0x0178, B:15:0x0185, B:16:0x01bf, B:26:0x022c, B:28:0x0236, B:29:0x0272, B:31:0x02ab, B:33:0x02b5, B:34:0x02f2, B:36:0x02fb, B:38:0x0312, B:39:0x035a, B:46:0x07b0, B:48:0x07bd, B:49:0x07f2, B:54:0x0d64, B:56:0x0d71, B:57:0x0db0, B:66:0x0e6d, B:68:0x0e7a, B:69:0x0eb5, B:71:0x0ee6, B:73:0x0ef3, B:74:0x0f36, B:77:0x0f4d, B:79:0x0f64, B:80:0x0faa, B:87:0x12d1, B:89:0x12de, B:90:0x1319, B:104:0x14aa, B:106:0x14b7, B:107:0x14fa, B:109:0x15df, B:111:0x15ec, B:112:0x162c, B:122:0x1799, B:124:0x17a6, B:125:0x17e8, B:127:0x18bc, B:129:0x18c9, B:130:0x1910, B:147:0x1c3c, B:149:0x1c49, B:150:0x1c7f, B:184:0x20db, B:186:0x20e8, B:187:0x211c, B:190:0x2144, B:192:0x2151, B:193:0x2192, B:200:0x2580, B:202:0x258d, B:203:0x25c3, B:217:0x2737, B:219:0x2759, B:220:0x27a5, B:228:0x28f4, B:230:0x2917, B:231:0x2963, B:237:0x2ad3, B:239:0x2ad9, B:240:0x2b1b, B:251:0x31fd, B:253:0x320e, B:254:0x324c, B:260:0x33aa, B:262:0x33b0, B:263:0x33f0, B:269:0x3517, B:271:0x353b, B:272:0x3586, B:278:0x36cb, B:280:0x36d8, B:281:0x3715, B:287:0x3844, B:289:0x384a, B:290:0x3884, B:296:0x39ab, B:298:0x39b1, B:299:0x39ef, B:305:0x3b28, B:307:0x3b50, B:308:0x3bab, B:326:0x2c4c, B:328:0x2c52, B:329:0x2c8d, B:336:0x2dab, B:338:0x2db1, B:339:0x2de8, B:344:0x2ee9, B:346:0x2eef, B:347:0x2f21, B:352:0x3038, B:354:0x303e, B:355:0x3075, B:426:0x108a, B:428:0x109f, B:429:0x10de, B:432:0x1193, B:434:0x11aa, B:435:0x11e5, B:446:0x08be, B:448:0x08cb, B:449:0x0901, B:454:0x0422, B:456:0x0439, B:457:0x0481, B:462:0x055c, B:464:0x0573, B:465:0x05b0, B:470:0x066a, B:472:0x0681, B:473:0x06bd), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x18c9 A[Catch: all -> 0x3cc0, TryCatch #0 {all -> 0x3cc0, blocks: (B:3:0x0003, B:5:0x000e, B:6:0x0043, B:13:0x0178, B:15:0x0185, B:16:0x01bf, B:26:0x022c, B:28:0x0236, B:29:0x0272, B:31:0x02ab, B:33:0x02b5, B:34:0x02f2, B:36:0x02fb, B:38:0x0312, B:39:0x035a, B:46:0x07b0, B:48:0x07bd, B:49:0x07f2, B:54:0x0d64, B:56:0x0d71, B:57:0x0db0, B:66:0x0e6d, B:68:0x0e7a, B:69:0x0eb5, B:71:0x0ee6, B:73:0x0ef3, B:74:0x0f36, B:77:0x0f4d, B:79:0x0f64, B:80:0x0faa, B:87:0x12d1, B:89:0x12de, B:90:0x1319, B:104:0x14aa, B:106:0x14b7, B:107:0x14fa, B:109:0x15df, B:111:0x15ec, B:112:0x162c, B:122:0x1799, B:124:0x17a6, B:125:0x17e8, B:127:0x18bc, B:129:0x18c9, B:130:0x1910, B:147:0x1c3c, B:149:0x1c49, B:150:0x1c7f, B:184:0x20db, B:186:0x20e8, B:187:0x211c, B:190:0x2144, B:192:0x2151, B:193:0x2192, B:200:0x2580, B:202:0x258d, B:203:0x25c3, B:217:0x2737, B:219:0x2759, B:220:0x27a5, B:228:0x28f4, B:230:0x2917, B:231:0x2963, B:237:0x2ad3, B:239:0x2ad9, B:240:0x2b1b, B:251:0x31fd, B:253:0x320e, B:254:0x324c, B:260:0x33aa, B:262:0x33b0, B:263:0x33f0, B:269:0x3517, B:271:0x353b, B:272:0x3586, B:278:0x36cb, B:280:0x36d8, B:281:0x3715, B:287:0x3844, B:289:0x384a, B:290:0x3884, B:296:0x39ab, B:298:0x39b1, B:299:0x39ef, B:305:0x3b28, B:307:0x3b50, B:308:0x3bab, B:326:0x2c4c, B:328:0x2c52, B:329:0x2c8d, B:336:0x2dab, B:338:0x2db1, B:339:0x2de8, B:344:0x2ee9, B:346:0x2eef, B:347:0x2f21, B:352:0x3038, B:354:0x303e, B:355:0x3075, B:426:0x108a, B:428:0x109f, B:429:0x10de, B:432:0x1193, B:434:0x11aa, B:435:0x11e5, B:446:0x08be, B:448:0x08cb, B:449:0x0901, B:454:0x0422, B:456:0x0439, B:457:0x0481, B:462:0x055c, B:464:0x0573, B:465:0x05b0, B:470:0x066a, B:472:0x0681, B:473:0x06bd), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x19d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1c3a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1d5f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x1e00  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x2039  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x20c4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x31fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x31fc  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1d5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x190e  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x14f8  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x3cc8  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x3cc9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0d71 A[Catch: all -> 0x3cc0, TryCatch #0 {all -> 0x3cc0, blocks: (B:3:0x0003, B:5:0x000e, B:6:0x0043, B:13:0x0178, B:15:0x0185, B:16:0x01bf, B:26:0x022c, B:28:0x0236, B:29:0x0272, B:31:0x02ab, B:33:0x02b5, B:34:0x02f2, B:36:0x02fb, B:38:0x0312, B:39:0x035a, B:46:0x07b0, B:48:0x07bd, B:49:0x07f2, B:54:0x0d64, B:56:0x0d71, B:57:0x0db0, B:66:0x0e6d, B:68:0x0e7a, B:69:0x0eb5, B:71:0x0ee6, B:73:0x0ef3, B:74:0x0f36, B:77:0x0f4d, B:79:0x0f64, B:80:0x0faa, B:87:0x12d1, B:89:0x12de, B:90:0x1319, B:104:0x14aa, B:106:0x14b7, B:107:0x14fa, B:109:0x15df, B:111:0x15ec, B:112:0x162c, B:122:0x1799, B:124:0x17a6, B:125:0x17e8, B:127:0x18bc, B:129:0x18c9, B:130:0x1910, B:147:0x1c3c, B:149:0x1c49, B:150:0x1c7f, B:184:0x20db, B:186:0x20e8, B:187:0x211c, B:190:0x2144, B:192:0x2151, B:193:0x2192, B:200:0x2580, B:202:0x258d, B:203:0x25c3, B:217:0x2737, B:219:0x2759, B:220:0x27a5, B:228:0x28f4, B:230:0x2917, B:231:0x2963, B:237:0x2ad3, B:239:0x2ad9, B:240:0x2b1b, B:251:0x31fd, B:253:0x320e, B:254:0x324c, B:260:0x33aa, B:262:0x33b0, B:263:0x33f0, B:269:0x3517, B:271:0x353b, B:272:0x3586, B:278:0x36cb, B:280:0x36d8, B:281:0x3715, B:287:0x3844, B:289:0x384a, B:290:0x3884, B:296:0x39ab, B:298:0x39b1, B:299:0x39ef, B:305:0x3b28, B:307:0x3b50, B:308:0x3bab, B:326:0x2c4c, B:328:0x2c52, B:329:0x2c8d, B:336:0x2dab, B:338:0x2db1, B:339:0x2de8, B:344:0x2ee9, B:346:0x2eef, B:347:0x2f21, B:352:0x3038, B:354:0x303e, B:355:0x3075, B:426:0x108a, B:428:0x109f, B:429:0x10de, B:432:0x1193, B:434:0x11aa, B:435:0x11e5, B:446:0x08be, B:448:0x08cb, B:449:0x0901, B:454:0x0422, B:456:0x0439, B:457:0x0481, B:462:0x055c, B:464:0x0573, B:465:0x05b0, B:470:0x066a, B:472:0x0681, B:473:0x06bd), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0dbb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] a$896c745(java.lang.Object obj) {
        java.lang.Throwable cause;
        long j;
        int i2;
        int i3;
        java.lang.String str;
        int i4;
        java.lang.Object d2;
        java.lang.String str2;
        java.lang.String str3;
        long j2;
        java.lang.Object d3;
        java.lang.String str4;
        long j3;
        java.lang.Object d4;
        java.lang.Object d5;
        long j4;
        java.lang.Object d6;
        long j5;
        java.lang.String str5;
        int i5;
        java.lang.String str6;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.String str7;
        java.lang.Object[] objArr;
        int i10;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Throwable th;
        java.lang.String str12;
        java.lang.Object[] objArr2;
        java.lang.Throwable th2;
        int parseInt;
        int i11;
        int i12;
        java.lang.Object obj2;
        java.lang.String str13;
        java.lang.Object obj3;
        java.lang.String str14;
        java.lang.String str15;
        try {
            java.lang.Object d7 = com.facetec.sdk.al.d(60475645);
            if (d7 == null) {
                char maxKeyCode = (char) (41371 - (android.view.KeyEvent.getMaxKeyCode() >> 16));
                int green = android.graphics.Color.green(0);
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                f(b2, b3, (byte) (b3 + 1), objArr3);
                d7 = com.facetec.sdk.al.c(maxKeyCode, 615 - green, 25 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), -1535790587, false, (java.lang.String) objArr3[0], new java.lang.Class[0]);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, null)).longValue();
            long j6 = 172666179;
            j = -1;
            long j7 = j6 ^ j;
            long nextInt = new java.util.Random().nextInt();
            long j8 = (((((303 * j6) + ((-301) * longValue)) + ((-302) * ((((j7 | (nextInt ^ j)) | longValue) ^ j) | (((j6 | longValue) | nextInt) ^ j)))) + ((-604) * (((j7 | longValue) | nextInt) ^ j))) + (302 * (((longValue | nextInt) ^ j) | (((longValue ^ j) | j6) ^ j)))) - 699857473;
            int myTid = android.os.Process.myTid();
            i2 = ((int) (j8 >> 32)) & (((((~((-810012316) | myTid)) | 541230603) * 104) - 2005432166) + ((~((~myTid) | 895995807)) * (-104)) + ((myTid | 627214095) * 104));
            int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i13 = ~maxMemory;
            i3 = ((int) j8) & ((((((~(829679291 | maxMemory)) | (~((-607547119) | i13))) | r8) * (-516)) - 93310687) + (((~(maxMemory | 897052415)) | (~(i13 | (-289505298)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((289505297 | (~((-829679292) | i13))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
        } catch (java.lang.Throwable th3) {
            cause = th3.getCause();
            if (cause == null) {
            }
        }
        if (((i2 ^ i3) | (i2 & i3)) != 0) {
            java.lang.Object[] objArr4 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, new int[]{0}};
            int nextInt2 = new java.util.Random().nextInt();
            int i14 = ((((~((-1320628025) | r4)) | (~((-297589936) | nextInt2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 722190023) + (((~(nextInt2 | (-1308828433))) | (~((~nextInt2) | (-285790344)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            int i15 = (i14 ^ 16) + ((i14 & 16) << 1) + 1175161750;
            int i16 = i15 ^ (i15 << 13);
            int i17 = i16 >>> 17;
            int i18 = (i16 & (~i17)) | ((~i16) & i17);
            int i19 = i18 << 5;
            ((int[]) objArr4[1])[0] = (~(i18 & i19)) & (i18 | i19);
            return objArr4;
        }
        java.lang.String str16 = "";
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        g("灥瀗휰☛㜍뉭\ue691ዳ\uf14c뛘枓逤犔㖠\ue54a", android.text.TextUtils.indexOf("", "", 0, 0), objArr5);
        java.lang.Object[] objArr6 = {(java.lang.String) objArr5[0]};
        int i20 = 1590238701;
        java.lang.Object d8 = com.facetec.sdk.al.d(1590238701);
        if (d8 == null) {
            char blue = (char) android.graphics.Color.blue(0);
            int rgb = android.graphics.Color.rgb(0, 0, 0);
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b4 = (byte) (-1);
            byte b5 = (byte) (b4 + 1);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            f(b4, b5, b5, objArr7);
            d8 = com.facetec.sdk.al.c(blue, rgb + 16779294, makeMeasureSpec + 24, -114923755, false, (java.lang.String) objArr7[0], new java.lang.Class[]{java.lang.String.class});
        }
        java.lang.String str17 = (java.lang.String) ((java.lang.reflect.Method) d8).invoke(null, objArr6);
        int i21 = 2;
        if (str17 != null) {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            g("ᓡᒓ킵\udd4bゆ视ᶁ⥓闁녚", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr8);
            java.lang.String str18 = (java.lang.String) objArr8[0];
            int i22 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int indexOf = android.text.TextUtils.indexOf("", "");
            int i23 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            h((char) (((34117 | i22) << 1) - (i22 ^ 34117)), indexOf, (i23 ^ 7) + ((i23 & 7) << 1), objArr9);
            int i24 = 0;
            java.lang.String[] strArr = {str18, (java.lang.String) objArr9[0]};
            int i25 = 0;
            while (i25 < i21) {
                if (str17.contains(strArr[i25])) {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    g("說陸흼ힰ㝁盂\u173a홄碛뚉阸咉ﭒ㗪ᒪ픩稘댸鎹剪ﳠ㉭ሀ킡羻놣郎", android.view.View.MeasureSpec.makeMeasureSpec(i24, i24), objArr10);
                    java.lang.Object[] objArr11 = {(java.lang.String) objArr10[i24]};
                    java.lang.Object d9 = com.facetec.sdk.al.d(i20);
                    if (d9 == null) {
                        char trimmedLength = (char) android.text.TextUtils.getTrimmedLength(str16);
                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                        int resolveSize = android.view.View.resolveSize(0, 0);
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        f(b6, b7, b7, objArr12);
                        d9 = com.facetec.sdk.al.c(trimmedLength, (edgeSlop >> 16) + 2078, resolveSize + 24, -114923755, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object invoke = ((java.lang.reflect.Method) d9).invoke(null, objArr11);
                    int i26 = -(-android.text.TextUtils.indexOf(str16, str16, 0, 0));
                    int i27 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    h((char) ((45402 ^ i26) + ((i26 & 45402) << 1)), ((i27 | 8) << 1) - (i27 ^ 8), 29 - (~(-android.view.KeyEvent.keyCodeFromString(str16))), objArr13);
                    java.lang.Object[] objArr14 = {(java.lang.String) objArr13[0]};
                    java.lang.Object d10 = com.facetec.sdk.al.d(i20);
                    if (d10 == null) {
                        char defaultSize = (char) android.view.View.getDefaultSize(0, 0);
                        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str16);
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        f(b8, b9, b9, objArr15);
                        d10 = com.facetec.sdk.al.c(defaultSize, 2078 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 24 - keyCodeFromString, -114923755, false, (java.lang.String) objArr15[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) d10).invoke(null, objArr14);
                    if (invoke != null) {
                        java.lang.Object[] objArr16 = new java.lang.Object[i21];
                        objArr16[1] = 42;
                        objArr16[0] = invoke;
                        java.lang.Object d11 = com.facetec.sdk.al.d(-582857820);
                        if (d11 == null) {
                            char indexOf2 = (char) ((-1) - android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (b10 + 1);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            f(b10, b11, (byte) (b11 + 1), objArr17);
                            java.lang.String str19 = (java.lang.String) objArr17[0];
                            java.lang.Class[] clsArr = new java.lang.Class[i21];
                            clsArr[0] = java.lang.String.class;
                            clsArr[1] = java.lang.Integer.TYPE;
                            d11 = com.facetec.sdk.al.c(indexOf2, 2365 - (fadingEdgeLength >> 16), (scrollBarFadeDuration >> 16) + 24, 2058170716, false, str19, clsArr);
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr16)).longValue();
                        long j9 = 381049311;
                        long j10 = 765;
                        long j11 = j9 ^ j;
                        long j12 = longValue2 ^ j;
                        long j13 = j11 | j12;
                        long myUid = android.os.Process.myUid();
                        long j14 = myUid ^ j;
                        str13 = str16;
                        long j15 = ((-1529) * j9) + ((-764) * longValue2) + ((((j13 | j14) ^ j) | (((j11 | longValue2) | myUid) ^ j) | (((j12 | j9) | myUid) ^ j)) * j10) + (1530 * ((j13 ^ j) | ((j11 | j14) ^ j))) + (j10 * (((j11 | myUid) ^ j) | (((j12 | j14) | j9) ^ j))) + 778148087;
                        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i28 = ~freeMemory;
                        if (((((int) (j15 >> 32)) & ((((~((-929643847) | uptimeMillis)) | (-507582565)) * (-964)) + 282408174 + (((~((~uptimeMillis) | (-929643847))) | 556279042) * (-964)))) | ((((~(1822883611 | freeMemory)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1272737837 + (((-285736993) | i28) * (-216)) + (((~(1822883611 | i28)) | 1034857274) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)) & ((int) j15))) == 477111747) {
                            str14 = str13;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                                char c2 = (char) (25018 - (~(android.view.ViewConfiguration.getTapTimeout() >> 16)));
                                str = str14;
                                int indexOf3 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                int i29 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                h(c2, 37 - indexOf3, (i29 ^ 76) + ((i29 & 76) << 1), objArr18);
                                java.lang.Object[] objArr19 = {(java.lang.String) objArr18[0]};
                                java.lang.Object d12 = com.facetec.sdk.al.d(1450487247);
                                if (d12 == null) {
                                    char bitsPerPixel = (char) (6934 - android.graphics.ImageFormat.getBitsPerPixel(0));
                                    int indexOf4 = android.text.TextUtils.indexOf(str, str, 0);
                                    int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str);
                                    byte b12 = (byte) (-1);
                                    byte b13 = (byte) (b12 + 1);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    f(b12, b13, (byte) (b13 + 3), objArr20);
                                    d12 = com.facetec.sdk.al.c(bitsPerPixel, 2389 - indexOf4, 23 - keyCodeFromString2, -241445065, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d12).invoke(null, objArr19)).longValue();
                                long j16 = 978528249;
                                long myPid = android.os.Process.myPid();
                                long j17 = longValue3 ^ j;
                                long j18 = 676;
                                long j19 = myPid ^ j;
                                long j20 = (677 * j16) + ((-675) * longValue3) + ((j16 | myPid | j17) * (-676)) + ((((j17 | j16) ^ j) | ((j19 | j16) ^ j)) * j18) + (j18 * ((((j16 | longValue3) | myPid) ^ j) | (((j16 ^ j) | j17) ^ j) | ((j17 | j19) ^ j))) + 872648392;
                                int i30 = (int) (j20 >> 32);
                                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                                int i31 = (int) j20;
                                int myPid2 = android.os.Process.myPid();
                                int i32 = ~myPid2;
                            } else {
                                str = str14;
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                g("乵万䬂㷙ꬿ詫ﵓ⫹콘⫺籀꠲䲂ꦁﺏ⦁췈", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr21);
                                java.lang.Object[] objArr22 = {(java.lang.String) objArr21[0]};
                                java.lang.Object d13 = com.facetec.sdk.al.d(1590238701);
                                if (d13 == null) {
                                    char indexOf5 = (char) android.text.TextUtils.indexOf(str, str);
                                    int defaultSize2 = android.view.View.getDefaultSize(0, 0);
                                    long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                    byte b14 = (byte) (-1);
                                    byte b15 = (byte) (b14 + 1);
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    f(b14, b15, b15, objArr23);
                                    d13 = com.facetec.sdk.al.c(indexOf5, 2078 - defaultSize2, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 24, -114923755, false, (java.lang.String) objArr23[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                java.lang.Object invoke3 = ((java.lang.reflect.Method) d13).invoke(null, objArr22);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                h((char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24002), 65 - (~(-(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))), android.text.TextUtils.indexOf(str, str, 0) + 1, objArr24);
                            }
                            cause = th3.getCause();
                            if (cause == null) {
                                throw cause;
                            }
                            throw th3;
                        }
                    } else {
                        str13 = str16;
                    }
                    if (invoke2 != null) {
                        java.lang.Object[] objArr25 = {invoke2, 42};
                        java.lang.Object d14 = com.facetec.sdk.al.d(-582857820);
                        if (d14 == null) {
                            str15 = str13;
                            char indexOf6 = (char) android.text.TextUtils.indexOf(str15, str15);
                            int capsMode = android.text.TextUtils.getCapsMode(str15, 0, 0);
                            int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength();
                            byte b16 = (byte) (-1);
                            byte b17 = (byte) (b16 + 1);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            f(b16, b17, (byte) (b17 + 1), objArr26);
                            d14 = com.facetec.sdk.al.c(indexOf6, 2365 - capsMode, 24 - (fadingEdgeLength2 >> 16), 2058170716, false, (java.lang.String) objArr26[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        } else {
                            str15 = str13;
                        }
                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, objArr25)).longValue();
                        long j21 = 552879310;
                        long j22 = 569;
                        long j23 = j21 ^ j;
                        long j24 = longValue4 ^ j;
                        long j25 = j23 | j24;
                        str14 = str15;
                        long elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                        long j26 = elapsedRealtime2 ^ j;
                        obj3 = invoke2;
                        long j27 = j26 | j21;
                        long j28 = (j21 * j22) + (j22 * longValue4) + ((-1136) * ((j25 ^ j) | ((j23 | j26) ^ j) | ((j24 | j26) ^ j))) + ((-568) * (((j23 | elapsedRealtime2) ^ j) | ((j24 | elapsedRealtime2) ^ j) | ((j27 | longValue4) ^ j))) + (com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION * (((j26 | longValue4) ^ j) | (j27 ^ j) | ((j25 | elapsedRealtime2) ^ j))) + 606318088;
                        int i33 = (int) (j28 >> 32);
                        int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i34 = ~maxMemory2;
                        int elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                    } else {
                        obj3 = invoke2;
                        str14 = str13;
                    }
                    if (invoke != null) {
                        java.lang.Object[] objArr27 = {invoke, 42};
                        java.lang.Object d15 = com.facetec.sdk.al.d(-582857820);
                        if (d15 == null) {
                            char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                            int trimmedLength2 = android.text.TextUtils.getTrimmedLength(str14);
                            byte b18 = (byte) (-1);
                            byte b19 = (byte) (b18 + 1);
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            f(b18, b19, (byte) (b19 + 1), objArr28);
                            d15 = com.facetec.sdk.al.c(scrollDefaultDelay, 2365 - (keyRepeatDelay >> 16), 24 - trimmedLength2, 2058170716, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, objArr27)).longValue();
                        long j29 = 277426904;
                        long j30 = -948;
                        long j31 = j29 ^ j;
                        long j32 = longValue5 ^ j;
                        long freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        long j33 = ((-947) * j29) + (949 * longValue5) + ((j31 | ((j32 | freeMemory2) ^ j)) * j30) + (j30 * (((j31 | j32) | (freeMemory2 ^ j)) ^ j)) + (948 * (j29 | j32)) + 881770494;
                        int elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                        int i35 = ~elapsedRealtime4;
                        int i36 = ((int) (j33 >> 32)) & ((((~((-1511266096) | i35)) | (-74039685)) * (-90)) + 1687905420 + (((~((-1511266096) | elapsedRealtime4)) | 74039424) * (-45)) + (((~(elapsedRealtime4 | 74039684)) | (-1511266096) | (~(i35 | (-74039685)))) * 45));
                        int i37 = ((int) j33) & (((((~((-329035045) | r3)) | 1766261454) * (-964)) - 206031459) + (((~((~((int) android.os.SystemClock.uptimeMillis())) | (-329035045))) | android.R.string.defaultVoiceMailAlphaTag) * (-964)));
                    }
                    if (obj3 != null) {
                        i = (c + 49) % 128;
                        java.lang.Object[] objArr29 = {obj3, 42};
                        java.lang.Object d16 = com.facetec.sdk.al.d(-582857820);
                        if (d16 == null) {
                            char normalizeMetaState = (char) android.view.KeyEvent.normalizeMetaState(0);
                            int keyCodeFromString3 = android.view.KeyEvent.keyCodeFromString(str14);
                            int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                            byte b20 = (byte) (-1);
                            byte b21 = (byte) (b20 + 1);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            f(b20, b21, (byte) (b21 + 1), objArr30);
                            d16 = com.facetec.sdk.al.c(normalizeMetaState, 2365 - keyCodeFromString3, rgb2 + 16777240, 2058170716, false, (java.lang.String) objArr30[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d16).invoke(null, objArr29)).longValue();
                        long j34 = 1109720125;
                        long myUid2 = android.os.Process.myUid();
                        long j35 = myUid2 ^ j;
                        long j36 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                        long j37 = longValue6 ^ j;
                        long j38 = (165 * j34) + ((-163) * longValue6) + ((-328) * (((j35 | longValue6) ^ j) | j34)) + ((j34 | myUid2) * j36) + (j36 * (((longValue6 | (j35 | j34)) ^ j) | (((j34 ^ j) | j37) ^ j) | ((j37 | myUid2) ^ j))) + 49477273;
                        int freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i38 = ~freeMemory3;
                        int i39 = ((int) (j38 >> 32)) & ((((~(116469879 | i38)) | 1553696290) * (-90)) + 1687905420 + (((~(116469879 | freeMemory3)) | 39858261) * (-45)) + (((~(freeMemory3 | (-1553696291))) | 116469879 | (~(i38 | 1553696290))) * 45));
                        int i40 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        int i41 = ((int) j38) & (((~((~i40) | (-369100803))) * (-116)) + 2072280017 + (((-924846468) | i40) * 116) + (((~(i40 | 512379942)) | (-1068125608)) * 116));
                    }
                    str = str14;
                } else {
                    i25 = ((i25 | 1) << 1) - (i25 ^ 1);
                    str16 = str16;
                    i20 = 1590238701;
                    i21 = 2;
                    i24 = 0;
                }
            }
            str = str16;
            i4 = i24;
            char resolveSize2 = (char) android.view.View.resolveSize(i4, i4);
            int i42 = -android.text.TextUtils.getOffsetBefore(str, i4);
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            h(resolveSize2, ((i42 | 67) << 1) - (i42 ^ 67), 7 - (~(-(android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr31);
            java.lang.String str20 = (java.lang.String) objArr31[0];
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            g("轚輻䦗רּꦷ좮㮜栱\u0e7c⡪", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr32);
            java.lang.String str21 = (java.lang.String) objArr32[0];
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            g("椈楬힞䲟㞡ᜥ豎랠\ue825뙶ഗ", android.graphics.Color.blue(0), objArr33);
            java.lang.String str22 = (java.lang.String) objArr33[0];
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            g("츪칍岪㙮벜爋\uf6a8튎伇㵂矴偐쳈", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr34);
            java.lang.String str23 = (java.lang.String) objArr34[0];
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            g("㿼㾕蹁\ue0f0湷겪‸ి뻘\uefb2", android.view.View.MeasureSpec.getMode(0), objArr35);
            java.lang.String str24 = (java.lang.String) objArr35[0];
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            g("꽀꼩\ue1cf鑟ǳ﹛咒廙⸥耱헖\udc07궥͊坅嶯⳻", android.view.View.combineMeasuredStates(0, 0), objArr36);
            java.lang.String str25 = (java.lang.String) objArr36[0];
            char combineMeasuredStates = (char) android.view.View.combineMeasuredStates(0, 0);
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
            int i43 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            h(combineMeasuredStates, (scrollBarSize >> 8) + 75, ((i43 | 5) << 1) - (i43 ^ 5), objArr37);
            java.lang.String str26 = (java.lang.String) objArr37[0];
            char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
            int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
            int indexOf7 = android.text.TextUtils.indexOf(str, str, 0, 0);
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            h(packedPositionType, 80 - (scrollBarSize2 >> 8), (indexOf7 & 6) + (indexOf7 | 6), objArr38);
            java.lang.String str27 = (java.lang.String) objArr38[0];
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            g("嫤媍ࣼⶤ\ue8d9퇕", android.graphics.Color.blue(0), objArr39);
            java.lang.String str28 = (java.lang.String) objArr39[0];
            int i44 = -android.graphics.Color.green(0);
            int c3 = com.facetec.sdk.fp.a.c();
            int i45 = i44 * (-159);
            int i46 = ~i44;
            int i47 = ((((-8117745) | i45) << 1) - (i45 ^ (-8117745))) + (((51055 & i46) | (i46 ^ 51055)) * 160);
            int i48 = ~c3;
            int i49 = -(-(((~(i48 | i44)) | (~((51055 ^ i44) | (51055 & i44)))) * (-160)));
            char c4 = (char) (((((i47 | i49) << 1) - (i49 ^ i47)) - (~(-(-((i44 | (~(i48 | (-51056)))) * 160))))) - 1);
            int i50 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            h(c4, ((i50 | 87) << 1) - (i50 ^ 87), 15 - (~android.text.TextUtils.getOffsetBefore(str, 0)), objArr40);
            java.lang.String str29 = (java.lang.String) objArr40[0];
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            g("䲠䳌헥ﳗ㗘銥㰔㈧춉되뵟낵乂㝤", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr41);
            java.lang.String str30 = (java.lang.String) objArr41[0];
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            g("쿞쾮뾤⫛径潊\uea10쿟令\ude5f歙䴟", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr42);
            java.lang.String str31 = (java.lang.String) objArr42[0];
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            g("㖦㗖㣖ꛤ\ud8f6✺是螪뒍夣\ue764ը㝓\uda57斤蓘", android.graphics.Color.argb(0, 0, 0, 0), objArr43);
            java.lang.String str32 = (java.lang.String) objArr43[0];
            char jumpTapTimeout = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            int i51 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            h(jumpTapTimeout, (i51 ^ 102) + ((i51 & 102) << 1), 12 - (~(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr44);
            java.lang.String str33 = (java.lang.String) objArr44[0];
            char windowTouchSlop = (char) (47283 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
            int i52 = -(-(android.os.Process.myPid() >> 22));
            int i53 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            h(windowTouchSlop, (i52 & 116) + (i52 | 116), (i53 ^ 7) + ((i53 & 7) << 1), objArr45);
            java.lang.String str34 = (java.lang.String) objArr45[0];
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            g("ǋƸ斬탣薖櫺ဨ쩻胮ї酿", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr46);
            java.lang.String str35 = (java.lang.String) objArr46[0];
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            g("\ue142\ue131븕ࢷ帶瘞졿횁恾\udfea䥨", android.text.TextUtils.indexOf(str, str, 0), objArr47);
            java.lang.String str36 = (java.lang.String) objArr47[0];
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            g("ЙѪຽ䠧\uee9c㪺", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr48);
            java.lang.String str37 = (java.lang.String) objArr48[0];
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            g("峎岽㧤밼\ud9c2垷糹\uf733\uddf2堡ﶧ痠帪\udb6e罗\uf45d\udf79嶭\uf82b猘妉\udcf3禖\uf1d5", android.text.TextUtils.getOffsetBefore(str, 0), objArr49);
            java.lang.String str38 = (java.lang.String) objArr49[0];
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            g("രൃ껀䊣仦\uf74c艵埛谛켿", android.view.Gravity.getAbsoluteGravity(0, 0), objArr50);
            java.lang.String str39 = (java.lang.String) objArr50[0];
            int axisFromString = android.view.MotionEvent.axisFromString(str);
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            g("蚮蛝\ue0f6꼚Ñ㹤", ((axisFromString | 1) << 1) - (axisFromString ^ 1), objArr51);
            java.lang.String str40 = (java.lang.String) objArr51[0];
            char c5 = (char) (18174 - (~android.graphics.Color.red(0)));
            int offsetBefore = android.text.TextUtils.getOffsetBefore(str, 0);
            int i54 = -android.view.View.combineMeasuredStates(0, 0);
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            h(c5, offsetBefore + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (i54 & 16) + (i54 | 16), objArr52);
            java.lang.String str41 = (java.lang.String) objArr52[0];
            int i55 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i56 = -(-android.graphics.Color.alpha(0));
            int size = android.view.View.MeasureSpec.getSize(0);
            int i57 = (size * 765) - 13743;
            int i58 = ~com.facetec.sdk.fp.a.c();
            int i59 = ~((i58 ^ size) | (i58 & size));
            int i60 = -(-(((i59 & 9) | (i59 ^ 9)) * 764));
            int i61 = ~size;
            int i62 = ~((i61 ^ 9) | (i61 & 9));
            int i63 = ~((i58 ^ 9) | (i58 & 9));
            int i64 = -(-(((i63 ^ i62) | (i63 & i62)) * (-1528)));
            int i65 = ~(i61 | 9);
            int i66 = ~((size & (-10)) | (size ^ (-10)));
            int i67 = (i66 ^ i65) | (i65 & i66);
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            h((char) (((46964 | i55) << 1) - (i55 ^ 46964)), ((i56 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) << 1) - (i56 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE), ((((i57 & i60) + (i57 | i60)) - (~i64)) - 1) + (((i59 & i67) | (i67 ^ i59)) * 764), objArr53);
            java.lang.String str42 = (java.lang.String) objArr53[0];
            char threadPriority = (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 58879);
            int i68 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
            int i69 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            h(threadPriority, (i68 & 148) + (i68 | 148), ((i69 | 9) << 1) - (i69 ^ 9), objArr54);
            java.lang.String str43 = (java.lang.String) objArr54[0];
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            g("鯾鮊䦷肤ꦗ䡛䁡\ue8ce\u1ad3⡟섧樐餚ꬰ䎦", android.view.View.getDefaultSize(0, 0), objArr55);
            java.lang.String str44 = (java.lang.String) objArr55[0];
            int i70 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            g("\uda20\uda55斮\uf07f薒ᇫガ녴嬆ѐ뇌㎼\ud8de蜪㌤", (~i70) + (i70 << 1), objArr56);
            java.lang.String str45 = (java.lang.String) objArr56[0];
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            g("쑼쐉睴忳靈䴝鼠\ued82䕚ᚊṀ潑욉闱鲘\ueef2䟊ጸᯠ", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr57);
            java.lang.String str46 = (java.lang.String) objArr57[0];
            char pressedStateDuration = (char) (27605 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
            int i71 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
            int i72 = -android.view.KeyEvent.keyCodeFromString(str);
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            h(pressedStateDuration, ((i71 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) << 1) - (i71 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE), (i72 & 14) + (i72 | 14), objArr58);
            java.lang.String[] strArr2 = {str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, (java.lang.String) objArr58[0]};
            int i73 = -(-android.os.Process.getGidForName(str));
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            g("灥瀗휰☛㜍뉭\ue691ዳ\uf14c뛘枓逤犔㖠\ue54a", (i73 & 1) + (i73 | 1), objArr59);
            java.lang.Object[] objArr60 = {(java.lang.String) objArr59[0]};
            d2 = com.facetec.sdk.al.d(1590238701);
            if (d2 == null) {
                char indexOf8 = (char) android.text.TextUtils.indexOf(str, str, 0);
                long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                int myPid3 = android.os.Process.myPid();
                byte b22 = (byte) (-1);
                byte b23 = (byte) (b22 + 1);
                java.lang.Object[] objArr61 = new java.lang.Object[1];
                f(b22, b23, b23, objArr61);
                d2 = com.facetec.sdk.al.c(indexOf8, 2079 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), 24 - (myPid3 >> 22), -114923755, false, (java.lang.String) objArr61[0], new java.lang.Class[]{java.lang.String.class});
            }
            str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr60);
            if (str2 != null) {
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                g("ᓡᒓ킵\udd4bゆ视ᶁ⥓闁녚", android.graphics.Color.alpha(0), objArr62);
                java.lang.String str47 = (java.lang.String) objArr62[0];
                int mode = android.view.View.MeasureSpec.getMode(0);
                int c6 = com.facetec.sdk.fp.a.c();
                int i74 = (mode * 193) + 6584581;
                int i75 = ~c6;
                int i76 = ~mode;
                int i77 = ~((34117 & i76) | (34117 ^ i76));
                int i78 = -(-(((i77 ^ i75) | (i77 & i75)) * (-192)));
                int i79 = (i76 & (-34118)) | ((-34118) ^ i76);
                int i80 = ~i79;
                int i81 = i75 | (-34118);
                int i82 = ~i81;
                int i83 = ~((i79 ^ c6) | (i79 & c6));
                int i84 = ~((i81 ^ mode) | (i81 & mode));
                int i85 = (i84 ^ i83) | (i84 & i83);
                int i86 = ~(c6 | (mode ^ 34117) | (34117 & mode));
                char c7 = (char) ((((((i74 | i78) << 1) - (i74 ^ i78)) - (~(-(-(((i80 & i82) | (i80 ^ i82)) * (-384)))))) - 1) + (((i86 ^ i85) | (i85 & i86)) * 192));
                int i87 = 0;
                int i88 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                java.lang.Object[] objArr63 = new java.lang.Object[1];
                h(c7, (-2) - (~i88), (absoluteGravity & 8) + (absoluteGravity | 8), objArr63);
                java.lang.String[] strArr3 = {str47, (java.lang.String) objArr63[0]};
                int i89 = 0;
                int i90 = 2;
                while (i89 < i90) {
                    if (str2.contains(strArr3[i89])) {
                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                        g("說陸흼ힰ㝁盂\u173a홄碛뚉阸咉ﭒ㗪ᒪ픩稘댸鎹剪ﳠ㉭ሀ킡羻놣郎", android.view.View.MeasureSpec.getSize(i87), objArr64);
                        java.lang.Object[] objArr65 = {(java.lang.String) objArr64[i87]};
                        java.lang.Object d17 = com.facetec.sdk.al.d(1590238701);
                        if (d17 == null) {
                            char size2 = (char) android.view.View.MeasureSpec.getSize(i87);
                            int lastIndexOf = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(i87);
                            byte b24 = (byte) (-1);
                            byte b25 = (byte) (b24 + 1);
                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                            f(b24, b25, b25, objArr66);
                            d17 = com.facetec.sdk.al.c(size2, 2077 - lastIndexOf, 24 - normalizeMetaState2, -114923755, false, (java.lang.String) objArr66[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) d17).invoke(null, objArr65);
                        char indexOf9 = (char) (45402 - android.text.TextUtils.indexOf(str, str, 0, 0));
                        int i91 = -(-android.graphics.Color.blue(0));
                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                        h(indexOf9, (i91 & 8) + (i91 | 8), 29 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr67);
                        java.lang.Object[] objArr68 = {(java.lang.String) objArr67[0]};
                        java.lang.Object d18 = com.facetec.sdk.al.d(1590238701);
                        if (d18 == null) {
                            char c8 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                            int myTid2 = android.os.Process.myTid();
                            byte b26 = (byte) (-1);
                            byte b27 = (byte) (b26 + 1);
                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                            f(b26, b27, b27, objArr69);
                            d18 = com.facetec.sdk.al.c(c8, 2078 - (longPressTimeout >> 16), (myTid2 >> 22) + 24, -114923755, false, (java.lang.String) objArr69[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke5 = ((java.lang.reflect.Method) d18).invoke(null, objArr68);
                        if (invoke4 != null) {
                            int i92 = i;
                            c = (((i92 | 95) << 1) - (i92 ^ 95)) % 128;
                            java.lang.Object[] objArr70 = {invoke4, 42};
                            java.lang.Object d19 = com.facetec.sdk.al.d(-582857820);
                            if (d19 == null) {
                                char myPid4 = (char) (android.os.Process.myPid() >> 22);
                                int axisFromString2 = android.view.MotionEvent.axisFromString(str);
                                int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                byte b28 = (byte) (-1);
                                byte b29 = (byte) (b28 + 1);
                                java.lang.Object[] objArr71 = new java.lang.Object[1];
                                f(b28, b29, (byte) (b29 + 1), objArr71);
                                d19 = com.facetec.sdk.al.c(myPid4, axisFromString2 + 2366, lastIndexOf2 + 25, 2058170716, false, (java.lang.String) objArr71[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr70)).longValue();
                            long j39 = -953187946;
                            str3 = str;
                            obj2 = invoke5;
                            long j40 = j39 ^ j;
                            j2 = j;
                            long nextInt3 = new java.util.Random().nextInt();
                            long j41 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
                            long j42 = longValue7 ^ j2;
                            long j43 = (567 * j39) + ((-565) * longValue7) + ((-566) * (((j40 | longValue7) ^ j2) | ((j40 | nextInt3) ^ j2))) + (((j39 | j42) ^ j2) * j41) + (j41 * (((j40 | j42) | nextInt3) ^ j2)) + 2112385344;
                            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                            int i93 = ~uptimeMillis2;
                            int i94 = ((int) (j43 >> 32)) & ((((((~(1245188769 | uptimeMillis2)) | 537232658) | (~((-1612552116) | uptimeMillis2))) * (-754)) - 743684946) + (((~(uptimeMillis2 | (-537232659))) | (~((-1075319458) | i93))) * (-754)) + ((1245188769 | i93) * 754));
                            int i95 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            int i96 = ((int) j43) & ((((~((-1100316677) | i95)) * 623) - 3059480) + (((~i95) | 268443681) * (-623)) + (((~(i95 | (-1844806941))) | 1100316676 | (~(1012933945 | i95))) * 623));
                        } else {
                            str3 = str;
                            obj2 = invoke5;
                            j2 = j;
                        }
                        if (obj2 != null) {
                            int i97 = i;
                            int i98 = (i97 ^ 67) + ((i97 & 67) << 1);
                            c = i98 % 128;
                            if (i98 % 2 != 0) {
                                java.lang.Object[] objArr72 = {obj2, 5};
                                java.lang.Object d20 = com.facetec.sdk.al.d(-582857820);
                                if (d20 == null) {
                                    char scrollBarFadeDuration2 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                                    int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop();
                                    byte b30 = (byte) (-1);
                                    byte b31 = (byte) (b30 + 1);
                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                    f(b30, b31, (byte) (b31 + 1), objArr73);
                                    d20 = com.facetec.sdk.al.c(scrollBarFadeDuration2, 2365 - (maximumDrawingCacheSize >> 24), 24 - (edgeSlop2 >> 16), 2058170716, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d20).invoke(null, objArr72)).longValue();
                                long j44 = -496797679;
                                long j45 = j44 ^ j2;
                                long j46 = longValue8 ^ j2;
                                long maxMemory3 = j45 | (((int) java.lang.Runtime.getRuntime().maxMemory()) ^ j2);
                                int i99 = (int) ((483 * j44) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE * longValue8) + ((-241) * (((j45 | j46) ^ j2) | (maxMemory3 ^ j2))) + ((-482) * (j44 | longValue8)) + (241 * (((longValue8 | maxMemory3) ^ j2) | ((j46 | j44) ^ j2))) + 1655995077);
                                int nextInt4 = new java.util.Random().nextInt();
                                int i100 = i99 & ((((~((~nextInt4) | 870841055)) * (-116)) - 2072279902) + ((868440799 | nextInt4) * 116) + (((~(nextInt4 | (-568785612))) | 566385355) * 116));
                                int nextInt5 = new java.util.Random().nextInt(1943096661);
                                int i101 = i99 & (((((~((-636169635) | r5)) | (~(2073396044 | nextInt5))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1893167745) + (((~(nextInt5 | (-562102529))) | (~((~nextInt5) | 2147463150))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                            } else {
                                java.lang.Object[] objArr74 = {obj2, 42};
                                java.lang.Object d21 = com.facetec.sdk.al.d(-582857820);
                                if (d21 == null) {
                                    char mode2 = (char) android.view.View.MeasureSpec.getMode(0);
                                    int red = android.graphics.Color.red(0);
                                    int scrollBarSize3 = android.view.ViewConfiguration.getScrollBarSize();
                                    byte b32 = (byte) (-1);
                                    byte b33 = (byte) (b32 + 1);
                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                    f(b32, b33, (byte) (b33 + 1), objArr75);
                                    d21 = com.facetec.sdk.al.c(mode2, red + 2365, (scrollBarSize3 >> 8) + 24, 2058170716, false, (java.lang.String) objArr75[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d21).invoke(null, objArr74)).longValue();
                                long j47 = -303670291;
                                int maxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j48 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                                long j49 = -252;
                                long j50 = longValue9 ^ j2;
                                long j51 = maxMemory4;
                                long j52 = j50 | (j51 ^ j2);
                                long j53 = longValue9 | j47;
                                long j54 = (j51 | j53) ^ j2;
                                long j55 = (j48 * j47) + (j48 * longValue9) + (((((j47 ^ j2) | j50) ^ j2) | (j52 ^ j2) | j54) * j49) + (j49 * j53) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE * (((j52 | j47) ^ j2) | j54)) + 1462867689;
                                int i102 = (int) (j55 >> 32);
                                int i103 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i104 = ~i103;
                                int maxMemory5 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i105 = ~maxMemory5;
                            }
                            cause = th3.getCause();
                            if (cause == null) {
                            }
                        }
                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                        g("׳ל犤냭銅眰瀰ힵ蒔ፘ\uf172唡ܐ連玵퓟虅\u16fb\uf4e9发¶鞸畏텉菩ᑽ\uf784", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr76);
                        java.lang.Object[] objArr77 = {(java.lang.String) objArr76[0]};
                        d3 = com.facetec.sdk.al.d(-864328554);
                        if (d3 == null) {
                            str4 = str3;
                            char indexOf10 = (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                            long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
                            float minVolume = android.media.AudioTrack.getMinVolume();
                            byte b34 = (byte) (-1);
                            byte b35 = (byte) (b34 + 1);
                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                            f(b34, b35, (byte) (b35 + 3), objArr78);
                            d3 = com.facetec.sdk.al.c(indexOf10, (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)) + 2340, 24 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 1804869230, false, (java.lang.String) objArr78[0], new java.lang.Class[]{java.lang.String.class});
                        } else {
                            str4 = str3;
                        }
                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr77)).longValue();
                        long j56 = 741925742;
                        int nextInt6 = new java.util.Random().nextInt();
                        long j57 = j56 ^ j2;
                        long j58 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                        java.lang.String str48 = str4;
                        long j59 = nextInt6;
                        long j60 = ((-381) * j56) + (192 * longValue10) + ((-191) * j57) + ((j56 | ((longValue10 | j59) ^ j2)) * j58) + (j58 * (((longValue10 | j57) ^ j2) | (((j59 ^ j2) | longValue10) ^ j2))) + 306272678;
                        int nextInt7 = new java.util.Random().nextInt();
                        int i106 = ~nextInt7;
                        int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                        int i107 = ~uptimeMillis3;
                        j3 = (((int) (j60 >> 32)) & ((((2030625080 | nextInt7) * (-50)) - 505572266) + (((~(nextInt7 | (-1476419633))) | (~(2069818301 | i106))) * 50) + (((~(2030625080 | i106)) | (~(i106 | 593398669)) | (-2069818302)) * 50))) | ((((1667456447 | uptimeMillis3) * (-859)) + 431636200 + (((~((-1113738391) | uptimeMillis3)) | (~(1667456447 | i107))) * 859) + (((~((-1190284439) | i107)) | 76546048) * 859)) & ((int) j60));
                        int size3 = android.view.View.MeasureSpec.getSize(0);
                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        int i108 = -android.text.TextUtils.getOffsetBefore(str48, 0);
                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                        h((char) ((62991 ^ size3) + ((size3 & 62991) << 1)), (packedPositionChild ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) + ((packedPositionChild & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) << 1), ((i108 | 17) << 1) - (i108 ^ 17), objArr79);
                        java.lang.Object[] objArr80 = {(java.lang.String) objArr79[0]};
                        d4 = com.facetec.sdk.al.d(-864328554);
                        if (d4 == null) {
                            char c9 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int rgb3 = android.graphics.Color.rgb(0, 0, 0);
                            int mode3 = android.view.View.MeasureSpec.getMode(0);
                            byte b36 = (byte) (-1);
                            byte b37 = (byte) (b36 + 1);
                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                            f(b36, b37, (byte) (b37 + 3), objArr81);
                            d4 = com.facetec.sdk.al.c(c9, (-16774875) - rgb3, mode3 + 24, 1804869230, false, (java.lang.String) objArr81[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr80)).longValue();
                        long j61 = -813145404;
                        long j62 = j61 ^ j2;
                        long myTid3 = android.os.Process.myTid();
                        long j63 = myTid3 ^ j2;
                        long j64 = ((-563) * j61) + (565 * longValue11) + ((-564) * (j62 | (((longValue11 ^ j2) | j63) ^ j2) | ((longValue11 | myTid3) ^ j2))) + (1128 * ((myTid3 | (j62 | longValue11)) ^ j2)) + (564 * (((longValue11 | j61) ^ j2) | ((j62 | j63) ^ j2))) + 1861343824;
                        int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                        int i109 = ((int) (j64 >> 32)) & ((((~((~elapsedCpuTime3) | (-554324033))) | (~((-1150659721) | elapsedCpuTime3))) * (-302)) + 705941106 + ((~((-554324033) | elapsedCpuTime3)) * (-604)) + (((~(elapsedCpuTime3 | (-1704983753))) | 2097412) * 302));
                        int elapsedRealtime5 = (int) android.os.SystemClock.elapsedRealtime();
                        int i110 = ~elapsedRealtime5;
                        int i111 = ((int) j64) & ((((~((-498774680) | i110)) | (-938451731)) * (-1042)) + 1419264002 + (((-498774680) | elapsedRealtime5) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(elapsedRealtime5 | 938451730)) | (-1073722264) | (~(i110 | (-363504147)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                        long j65 = (i109 ^ i111) | (i109 & i111);
                        if (j3 <= 0 && j65 > 0 && j65 - 3 < j3) {
                            java.lang.Object[] objArr82 = {null, new int[1], new int[]{247}, new int[]{0}};
                            int myTid4 = android.os.Process.myTid();
                            int i112 = ~((~myTid4) | 1072693215);
                            int i113 = (((~((-763719264) | myTid4)) | 545524744 | i112) * (-470)) + 316809879 + (((~(myTid4 | (-218194520))) | i112) * 470);
                            int c10 = com.facetec.sdk.fp.a.c();
                            int i114 = (i113 * 367) + 5872;
                            int i115 = ((i113 ^ 16) | (i113 & 16)) * (-366);
                            int i116 = ~i113;
                            int i117 = (i114 & i115) + (i114 | i115) + (((~((i116 & c10) | (i116 ^ c10))) | 16) * (-366));
                            int i118 = ~((i113 & (-17)) | (i113 ^ (-17)));
                            int i119 = ~(c10 | i116 | 16);
                            int i120 = ((i119 ^ i118) | (i119 & i118)) * 366;
                            int i121 = (((i117 | i120) << 1) - (i120 ^ i117)) + 1175161750;
                            int i122 = i121 << 13;
                            int i123 = ((~i122) & i121) | ((~i121) & i122);
                            int i124 = i123 >>> 17;
                            int i125 = (~(i123 & i124)) & (i123 | i124);
                            ((int[]) objArr82[1])[0] = i125 ^ (i125 << 5);
                            return objArr82;
                        }
                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                        g("׳ל犤냭銅眰瀰ힵ蒔ፘ\uf172唡ܐ連玵퓟虅\u16fb\uf4e9发¶鞸畏텉菩ᑽ\uf784", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr83);
                        java.lang.Object[] objArr84 = {(java.lang.String) objArr83[0]};
                        d5 = com.facetec.sdk.al.d(-864328554);
                        if (d5 == null) {
                            char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int combineMeasuredStates2 = android.view.View.combineMeasuredStates(0, 0);
                            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                            byte b38 = (byte) (-1);
                            byte b39 = (byte) (b38 + 1);
                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                            f(b38, b39, (byte) (b39 + 3), objArr85);
                            d5 = com.facetec.sdk.al.c(doubleTapTimeout, combineMeasuredStates2 + 2341, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 23, 1804869230, false, (java.lang.String) objArr85[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr84)).longValue();
                        long j66 = 830812392;
                        long j67 = 713;
                        long j68 = -712;
                        long j69 = longValue12 ^ j2;
                        long freeMemory4 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        long j70 = freeMemory4 ^ j2;
                        long j71 = (j70 | j66) ^ j2;
                        long j72 = ((-711) * j66) + (j67 * longValue12) + ((((j69 | j66) ^ j2) | j71) * j68) + (((((j69 | j70) | j66) ^ j2) | (((longValue12 | j66) | freeMemory4) ^ j2)) * j68) + (712 * (j69 | j71)) + 217386028;
                        int maxMemory6 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i126 = ~maxMemory6;
                        int i127 = ((int) (j72 >> 32)) & ((((~((-353342907) | maxMemory6)) | (-1083883505)) * (-318)) + 1053550230 + (((~((-1083883505) | maxMemory6)) | (~(1436532730 | i126))) * 318) + (((~(maxMemory6 | 1436532730)) | (~(i126 | (-1083189825)))) * 318));
                        int i128 = ~((int) android.os.SystemClock.elapsedRealtime());
                        int i129 = ((int) j72) & ((((~((-2100107328) | i128)) | (-757633559)) * (-983)) + 1100580356 + (((~(i128 | (-757633559))) | 33280) * 983));
                        j4 = (i127 ^ i129) | (i127 & i129);
                        int i130 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                        g("⌺⌕䌨\uf0d7ꌞ䱿〖\uecff", ((i130 | 1) << 1) - (i130 ^ 1), objArr86);
                        java.lang.Object[] objArr87 = {(java.lang.String) objArr86[0]};
                        d6 = com.facetec.sdk.al.d(-864328554);
                        if (d6 == null) {
                            char red2 = (char) android.graphics.Color.red(0);
                            float minVolume2 = android.media.AudioTrack.getMinVolume();
                            double convertQuartSecToDecDegrees2 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                            byte b40 = (byte) (-1);
                            byte b41 = (byte) (b40 + 1);
                            j5 = j67;
                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                            f(b40, b41, (byte) (b41 + 3), objArr88);
                            d6 = com.facetec.sdk.al.c(red2, (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)) + 2341, (convertQuartSecToDecDegrees2 > 0.0d ? 1 : (convertQuartSecToDecDegrees2 == 0.0d ? 0 : -1)) + 24, 1804869230, false, (java.lang.String) objArr88[0], new java.lang.Class[]{java.lang.String.class});
                        } else {
                            j5 = j67;
                        }
                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr87)).longValue();
                        long j73 = -777527622;
                        long j74 = ((j73 ^ j2) | longValue13) ^ j2;
                        long nextInt8 = new java.util.Random().nextInt();
                        long j75 = nextInt8 ^ j2;
                        long j76 = 594;
                        long j77 = longValue13 ^ j2;
                        long j78 = (j75 | j73) ^ j2;
                        long j79 = (595 * j73) + ((-1187) * longValue13) + ((-1188) * (j74 | ((j75 | longValue13) ^ j2))) + ((j74 | ((nextInt8 | j77) ^ j2) | j78) * j76) + (j76 * (((j77 | j75) ^ j2) | ((j77 | j73) ^ j2) | j78)) + 1825726042;
                        int i131 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        int i132 = ~i131;
                        int i133 = ((int) (j79 >> 32)) & ((((~(1862025061 | i131)) | 285294730 | (~((-995715824) | i131))) * (-754)) + 1075089950 + (((~(i131 | (-285294731))) | (~((-710421094) | i132))) * (-754)) + ((1862025061 | i132) * 754));
                        int i134 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
                        int i135 = ((int) j79) & ((((-34676866) | i134) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 697008989 + (((~(i134 | 1411664236)) | (-34941318)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                        long j80 = (i133 ^ i135) | (i133 & i135);
                        if (j4 > 0 && j80 > 0) {
                            i11 = c;
                            i12 = (i11 & 53) + (i11 | 53);
                            i = i12 % 128;
                            if (i12 % 2 == 0 ? j80 + 100 < j4 : j80 / 100 < j4) {
                                i = ((i11 ^ 21) + ((i11 & 21) << 1)) % 128;
                                java.lang.Object[] objArr89 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, new int[]{0}};
                                int i136 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i137 = ~i136;
                                int i138 = ((((~((-429489825) | i136)) | (~(1188728135 | i137))) * (-1808)) - 1833415121) + (((~((-9964545) | i136)) | (~(1608253415 | i137))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i136 | (-1188728136))) | 419525280 | (~(i137 | 429489824))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                int c11 = com.facetec.sdk.fp.a.c();
                                int i139 = 3087 - (~(i138 * 193));
                                int i140 = ~c11;
                                int i141 = ~((i138 & (-17)) | (i138 ^ (-17)));
                                int i142 = ((i141 ^ i140) | (i141 & i140)) * (-192);
                                int i143 = (i139 & i142) + (i139 | i142);
                                int i144 = ~i138;
                                int i145 = (i144 ^ (-17)) | (i144 & (-17));
                                int i146 = ~i145;
                                int i147 = (i144 & i140) | (i144 ^ i140);
                                int i148 = ~i147;
                                int i149 = ((i148 ^ i146) | (i146 & i148)) * (-384);
                                int i150 = ((i143 | i149) << 1) - (i149 ^ i143);
                                int i151 = (~(i147 | 16)) | (~(i145 | c11));
                                int i152 = i138 | 16;
                                int i153 = ~((c11 ^ i152) | (c11 & i152));
                                int i154 = -(-(((i153 ^ i151) | (i153 & i151)) * 192));
                                int i155 = -(-(((i150 | i154) << 1) - (i154 ^ i150)));
                                int i156 = (i155 ^ 1175161750) + ((i155 & 1175161750) << 1);
                                int i157 = (i156 << 13) ^ i156;
                                int i158 = i157 ^ (i157 >>> 17);
                                int i159 = i158 << 5;
                                ((int[]) objArr89[1])[0] = (i158 & (~i159)) | ((~i158) & i159);
                                return objArr89;
                            }
                        }
                        int i160 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                        g("淃淬㡑\ue400\ud870\uf2b5ⓝ到\uecff妮ꖁ", (i160 & 1) + (i160 | 1), objArr90);
                        java.lang.String str49 = (java.lang.String) objArr90[0];
                        int i161 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        char c12 = (char) ((~i161) + (i161 << 1));
                        str5 = str48;
                        int i162 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i163 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                        h(c12, 187 - (~i162), (i163 ^ 12) + ((i163 & 12) << 1), objArr91);
                        java.lang.String str50 = (java.lang.String) objArr91[0];
                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                        g("䶡䶎줤쾷⤅뎇ཪጂ첝\ua8db踶醖佂⮤೪ၯ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr92);
                        java.lang.String str51 = (java.lang.String) objArr92[0];
                        char maximumDrawingCacheSize2 = (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38164);
                        long uptimeMillis4 = android.os.SystemClock.uptimeMillis();
                        int i164 = -android.graphics.Color.alpha(0);
                        int c13 = com.facetec.sdk.fp.a.c();
                        int i165 = (i164 * (-574)) - 6888;
                        int i166 = ~c13;
                        int i167 = ~i164;
                        int i168 = ~(i167 | i166);
                        int i169 = ~((c13 ^ (-13)) | (c13 & (-13)));
                        int i170 = ((i168 ^ i169) | (i168 & i169)) * 1150;
                        int i171 = ~((i166 ^ 12) | (i166 & 12));
                        int i172 = (((i165 | i170) << 1) - (i165 ^ i170)) + (((i169 ^ i171) | (i171 & i169)) * (-575));
                        int i173 = ~((c13 ^ i167) | (i167 & c13));
                        int i174 = ~((i164 ^ i166) | (i164 & i166));
                        int i175 = ((i174 ^ i173) | (i173 & i174)) * 575;
                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                        h(maximumDrawingCacheSize2, (uptimeMillis4 > 0L ? 1 : (uptimeMillis4 == 0L ? 0 : -1)) + 199, (i172 ^ i175) + ((i175 & i172) << 1), objArr93);
                        java.lang.String str52 = (java.lang.String) objArr93[0];
                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                        g("卬千홣뱩㙇\uf527粨喿퉀랖ﷷ휶冞㓨缳", android.view.KeyEvent.keyCodeFromString(str5), objArr94);
                        java.lang.String str53 = (java.lang.String) objArr94[0];
                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                        g("넠넏룼\u1778壝鲧ힾ㰸〆", android.view.View.getDefaultSize(0, 0), objArr95);
                        java.lang.String str54 = (java.lang.String) objArr95[0];
                        int i176 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int c14 = com.facetec.sdk.fp.a.c();
                        int i177 = i176 * (-317);
                        int i178 = (4394544 ^ i177) + ((i177 & 4394544) << 1);
                        int i179 = ~i176;
                        int i180 = ~c14;
                        int i181 = (i180 ^ i176) | (i180 & i176);
                        int i182 = ((~((i181 ^ 13776) | (i181 & 13776))) | (~((i179 ^ (-13777)) | (i179 & (-13777)) | c14))) * (-318);
                        int i183 = (i178 ^ i182) + ((i178 & i182) << 1);
                        int i184 = ~((i176 ^ (-13777)) | (i176 & (-13777)));
                        int i185 = ~(i176 | c14);
                        int i186 = -(-(((i185 ^ i184) | (i185 & i184)) * (-318)));
                        int i187 = (i183 & i186) + (i186 | i183);
                        int i188 = ~((i179 ^ c14) | (c14 & i179));
                        int i189 = ((i188 ^ (-13777)) | (i188 & (-13777))) * 318;
                        int i190 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                        h((char) (((i187 | i189) << 1) - (i189 ^ i187)), (i190 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i190 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr96);
                        java.lang.String[] strArr4 = {str49, str50, str51, str52, str53, str54, (java.lang.String) objArr96[0]};
                        i5 = 0;
                        while (true) {
                            if (i5 >= 7) {
                                str6 = str5;
                                i6 = 0;
                                break;
                            }
                            java.lang.Object[] objArr97 = {strArr4[i5]};
                            java.lang.Object d22 = com.facetec.sdk.al.d(493527529);
                            if (d22 == null) {
                                char keyCodeFromString4 = (char) android.view.KeyEvent.keyCodeFromString(str5);
                                int offsetBefore2 = android.text.TextUtils.getOffsetBefore(str5, 0);
                                int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout();
                                byte b42 = (byte) (-1);
                                byte b43 = (byte) (b42 + 1);
                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                f(b42, b43, (byte) (b43 + 1), objArr98);
                                d22 = com.facetec.sdk.al.c(keyCodeFromString4, offsetBefore2 + 1012, (longPressTimeout2 >> 16) + 24, -1165632751, false, (java.lang.String) objArr98[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr97)).longValue();
                            long j81 = -1645465427;
                            long j82 = j81 ^ j2;
                            str6 = str5;
                            long j83 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            long j84 = j83 ^ j2;
                            long j85 = longValue14 ^ j2;
                            long j86 = (j83 | (j81 | j85)) ^ j2;
                            long j87 = (((((714 * j81) + (j68 * longValue14)) + (((((longValue14 | j82) ^ j2) | ((j82 | j84) ^ j2)) | j86) * (-713))) + (1426 * j86)) + (((j85 | j84) ^ j2) * j5)) - 369132614;
                            int elapsedRealtime6 = (int) android.os.SystemClock.elapsedRealtime();
                            int nextInt9 = new java.util.Random().nextInt(608245535);
                            if (((((int) (j87 >> 32)) & ((((~(2007518927 | elapsedRealtime6)) | 849889925) * (-502)) + 294732430 + ((~((~elapsedRealtime6) | (-332033))) * (-502)) + (((~(elapsedRealtime6 | 850221957)) | 2007518927) * 502))) | ((((~((-25297290) | nextInt9)) * 623) + 2008476622 + (((~nextInt9) | 134238240) * (-623)) + (((~(nextInt9 | 773083680)) | 25297289 | (~((-664142730) | nextInt9))) * 623)) & ((int) j87))) != 0) {
                                int i191 = c + 55;
                                i = i191 % 128;
                                i6 = i191 % 2 == 0 ? i5 >> 19 : ((i5 | 90) << 1) - (i5 ^ 90);
                            } else {
                                int i192 = ((i5 | (-12)) << 1) - (i5 ^ (-12));
                                i5 = (i192 & 13) + (i192 | 13);
                                str5 = str6;
                            }
                        }
                        if (i6 != 0) {
                            java.lang.Object[] objArr99 = {null, new int[1], new int[]{i6}, new int[]{0}};
                            int nextInt10 = new java.util.Random().nextInt(649484799);
                            int i193 = (((((-604246129) | (~nextInt10)) * (-490)) + 1080955725) + (((~(nextInt10 | (-1011257713))) | 407011584) * 490)) - 1057778096;
                            int c15 = com.facetec.sdk.fp.a.c();
                            int i194 = i193 * (-159);
                            int i195 = ((((i194 | (-2544)) << 1) - (i194 ^ (-2544))) - (~(((i193 ^ (-17)) | (i193 & (-17))) * 160))) - 1;
                            int i196 = ~c15;
                            int i197 = ~((i196 & 16) | (i196 ^ 16));
                            int i198 = ~((i193 ^ 16) | (i193 & 16));
                            int i199 = -(-(((i197 ^ i198) | (i197 & i198)) * (-160)));
                            int i200 = ~(i196 | (~i193));
                            int i201 = (((i195 ^ i199) + ((i199 & i195) << 1)) - (~(-(-(((i200 ^ 16) | (i200 & 16)) * 160))))) + 1175161749;
                            int i202 = i201 << 13;
                            int i203 = (~(i202 & i201)) & (i202 | i201);
                            int i204 = i203 >>> 17;
                            int i205 = (~(i203 & i204)) & (i203 | i204);
                            int i206 = i205 << 5;
                            ((int[]) objArr99[1])[0] = (i205 & (~i206)) | ((~i205) & i206);
                            return objArr99;
                        }
                        java.lang.String str55 = null;
                        try {
                            try {
                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                g("慿愍ຑ맓\ueeac儚祙\uf18e\ue042潢\uf853獀揁\uec1b窈\uf2ef\ue2d3", android.view.View.resolveSize(0, 0), objArr100);
                                try {
                                    java.lang.Object[] objArr101 = {(java.lang.String) objArr100[0]};
                                    java.lang.Object d23 = com.facetec.sdk.al.d(1590238701);
                                    if (d23 == null) {
                                        try {
                                            char myTid5 = (char) (android.os.Process.myTid() >> 22);
                                            int scrollBarSize4 = android.view.ViewConfiguration.getScrollBarSize();
                                            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                                            byte b44 = (byte) (-1);
                                            byte b45 = (byte) (b44 + 1);
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            f(b44, b45, b45, objArr102);
                                            d23 = com.facetec.sdk.al.c(myTid5, (scrollBarSize4 >> 8) + 2078, 24 - resolveSizeAndState, -114923755, false, (java.lang.String) objArr102[0], new java.lang.Class[]{java.lang.String.class});
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            java.lang.Throwable cause2 = th.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th;
                                        }
                                    }
                                    str12 = (java.lang.String) ((java.lang.reflect.Method) d23).invoke(null, objArr101);
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        } catch (java.lang.Exception unused2) {
                        }
                        try {
                            if (str12 != null) {
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                g("쏅쎦뱹뢌屒ᒫ硉됳䋢\udd84串㛻세廴篜", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr103);
                                java.lang.String[] strArr5 = {(java.lang.String) objArr103[0]};
                                for (int i207 = 0; i207 <= 0; i207 = (i207 & 1) + (i207 | 1)) {
                                    if (!str12.contains(strArr5[i207])) {
                                    }
                                }
                                str55 = str6;
                                i7 = 0;
                                if (i7 == 0) {
                                    int i208 = c;
                                    i = ((i208 & 53) + (i208 | 53)) % 128;
                                    java.lang.Object[] objArr104 = {null, new int[1], new int[]{i7}, new int[]{0}};
                                    int myPid5 = android.os.Process.myPid();
                                    int i209 = ~myPid5;
                                    int i210 = (((~((-524129638) | i209)) | (~((-1094088323) | i209))) * (-867)) + 158882620 + (((~((-524129638) | myPid5)) | 20190208 | (~((-1094088323) | myPid5))) * (-1734)) + (((~(myPid5 | (-503939430))) | (~(i209 | (-20190209))) | (~((-1073898115) | myPid5))) * 867);
                                    int i211 = ((i210 | 16) << 1) - (i210 ^ 16);
                                    int i212 = (i211 ^ 1175161750) + ((i211 & 1175161750) << 1);
                                    int i213 = i212 << 13;
                                    int i214 = ((~i213) & i212) | ((~i212) & i213);
                                    int i215 = i214 >>> 17;
                                    int i216 = (i214 & (~i215)) | ((~i214) & i215);
                                    int i217 = i216 << 5;
                                    ((int[]) objArr104[1])[0] = (~(i216 & i217)) & (i216 | i217);
                                    return objArr104;
                                }
                                int i218 = -android.text.TextUtils.lastIndexOf(str55, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                g("慿愍ຑ맓\ueeac儚祙\uf18e\ue042潢\uf853獀揁\uec1b窈\uf2ef\ue2d3", (~i218) + (i218 << 1), objArr105);
                                java.lang.Object[] objArr106 = {(java.lang.String) objArr105[0]};
                                java.lang.Object d24 = com.facetec.sdk.al.d(1590238701);
                                if (d24 == null) {
                                    char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int blue2 = android.graphics.Color.blue(0);
                                    int green2 = android.graphics.Color.green(0);
                                    byte b46 = (byte) (-1);
                                    byte b47 = (byte) (b46 + 1);
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    f(b46, b47, b47, objArr107);
                                    d24 = com.facetec.sdk.al.c(keyRepeatTimeout, 2078 - blue2, green2 + 24, -114923755, false, (java.lang.String) objArr107[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                java.lang.Object invoke6 = ((java.lang.reflect.Method) d24).invoke(null, objArr106);
                                if (invoke6 != null) {
                                    c = (i + 93) % 128;
                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                    g("쏅쎦뱹뢌屒ᒫ硉됳䋢\udd84串㛻세廴篜", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr108);
                                    java.lang.Object[] objArr109 = {invoke6, new java.lang.String[]{(java.lang.String) objArr108[0]}};
                                    java.lang.Object d25 = com.facetec.sdk.al.d(-1033567267);
                                    if (d25 == null) {
                                        char c16 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration();
                                        float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                        byte b48 = (byte) (-1);
                                        byte b49 = (byte) (b48 + 1);
                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                        f(b48, b49, (byte) (b49 + 1), objArr110);
                                        d25 = com.facetec.sdk.al.c(c16, 662 - (pressedStateDuration2 >> 16), (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 22, 1703573797, false, (java.lang.String) objArr110[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                    }
                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d25).invoke(null, objArr109)).longValue();
                                    long j88 = 413907637;
                                    long j89 = ((longValue15 ^ j2) | j88) ^ j2;
                                    long nextInt11 = (new java.util.Random().nextInt(1838771988) | j88) ^ j2;
                                    long j90 = 658;
                                    long j91 = (659 * j88) + ((-657) * longValue15) + ((((longValue15 | (j88 ^ j2)) ^ j2) | j89 | nextInt11) * (-658)) + (j90 * j89) + (j90 * (j89 | nextInt11)) + 209021621;
                                    int myUid3 = android.os.Process.myUid();
                                    int i219 = ((int) (j91 >> 32)) & (((((~((-1005639387) | myUid3)) | 294651008) * (-140)) - 1980546582) + ((~((-710988379) | myUid3)) * 70) + (((~(myUid3 | (-1852101499))) | 1435764128) * 70));
                                    int freeMemory5 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                    int i220 = ((int) j91) & (((((-136331798) | freeMemory5) * (-627)) - 635053948) + (((~(1851967423 | freeMemory5)) | 414741013) * (-627)) + (((~((~freeMemory5) | (-1851967424))) | (~(414741013 | freeMemory5))) * 627));
                                    if (((i219 ^ i220) | (i219 & i220)) != 1) {
                                        int i221 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        int c17 = com.facetec.sdk.fp.a.c();
                                        int i222 = i221 * 615;
                                        int i223 = ((i222 | (-613)) << 1) - (i222 ^ (-613));
                                        int i224 = ~i221;
                                        int i225 = ~((i224 ^ 1) | (i224 & 1));
                                        int i226 = (i225 & c17) | (c17 ^ i225);
                                        int i227 = ~((i221 & (-2)) | (i221 ^ (-2)));
                                        int i228 = -(-(((i226 ^ i227) | (i226 & i227)) * 614));
                                        int i229 = ~c17;
                                        int i230 = ~(i224 | i229);
                                        int i231 = (i225 ^ i230) | (i225 & i230);
                                        int i232 = ~((i229 ^ 1) | (i229 & 1));
                                        int i233 = (((i223 | i228) << 1) - (i223 ^ i228)) + (((i231 ^ i232) | (i231 & i232)) * (-1228));
                                        int i234 = (i224 & (-2)) | (i224 ^ (-2));
                                        int i235 = ~((i234 ^ i229) | (i234 & i229));
                                        int i236 = (i221 ^ i229) | (i221 & i229);
                                        int i237 = ~((i236 ^ 1) | (i236 & 1));
                                        int i238 = ((i237 ^ i235) | (i237 & i235)) * 614;
                                        char c18 = (char) ((i233 ^ i238) + ((i238 & i233) << 1));
                                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                        int indexOf11 = android.text.TextUtils.indexOf(str55, str55, 0);
                                        int c19 = com.facetec.sdk.fp.a.c();
                                        int i239 = ~indexOf11;
                                        int i240 = ((indexOf11 * (-209)) - 2508) + ((~((i239 ^ (-13)) | (i239 & (-13)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                                        int i241 = ~c19;
                                        int i242 = ((~((i241 ^ (-13)) | (i241 & (-13)))) | (~((i239 & c19) | (i239 ^ c19)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                        int i243 = i239 | i241;
                                        int i244 = ~((i243 ^ 12) | (i243 & 12));
                                        int i245 = (indexOf11 ^ (-13)) | (indexOf11 & (-13));
                                        int i246 = ~((c19 ^ i245) | (i245 & c19));
                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                        h(c18, ((tapTimeout | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) << 1) - (tapTimeout ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), (((i240 | i242) << 1) - (i240 ^ i242)) + (((i246 ^ i244) | (i246 & i244)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE), objArr111);
                                        java.lang.String str56 = (java.lang.String) objArr111[0];
                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                        g("뼌뼣㚫쓛횝겉Оఋ㸥圞蕛軘뷿퐨ރ༠㲶勨胉表", android.view.Gravity.getAbsoluteGravity(0, 0), objArr112);
                                        java.lang.String str57 = (java.lang.String) objArr112[0];
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        g("\ue300\ue32f褤\ueeae椒⚺\u2e6b蘸戩\ue891꼮ӫ\ue1f3殧ⷶ蔓悠\ued6cꪻȚ\ue60f", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr113);
                                        java.lang.String str58 = (java.lang.String) objArr113[0];
                                        int i247 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int c20 = com.facetec.sdk.fp.a.c();
                                        int i248 = (i247 * 595) - 22077013;
                                        int i249 = ~i247;
                                        int i250 = ~((i249 ^ 18599) | (i249 & 18599));
                                        int i251 = ~c20;
                                        int i252 = ~((i251 ^ 18599) | (i251 & 18599));
                                        int i253 = -(-(((i252 ^ i250) | (i252 & i250)) * (-1188)));
                                        int i254 = ~(c20 | (-18600));
                                        int i255 = ~((i251 ^ i247) | (i251 & i247));
                                        int i256 = (((i248 & i253) + (i248 | i253)) - (~((((i254 ^ i250) | (i254 & i250)) | i255) * 594))) - 1;
                                        int i257 = (~(i247 | (-18600))) | (~((i251 & (-18600)) | (i251 ^ (-18600))));
                                        int i258 = ((i257 ^ i255) | (i255 & i257)) * 594;
                                        int i259 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                        h((char) ((i256 & i258) + (i258 | i256)), (i259 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (i259 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE), 5 - (~(-(android.os.Process.myPid() >> 22))), objArr114);
                                        java.lang.String str59 = (java.lang.String) objArr114[0];
                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                        g("࠴ࠛ蜼㙦朝濆\uf6bb콃褈\ue6c3矧䷗\u0ac6斷\uf53c챯", android.graphics.Color.red(0), objArr115);
                                        java.lang.String str60 = (java.lang.String) objArr115[0];
                                        char keyRepeatDelay2 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i260 = -android.text.TextUtils.indexOf(str55, str55);
                                        int i261 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int c21 = com.facetec.sdk.fp.a.c();
                                        int i262 = i261 * (-813);
                                        int i263 = (i262 & 6936) + (i262 | 6936);
                                        int i264 = ((~((i261 & (-18)) | (i261 ^ (-18)))) | (~((i261 ^ c21) | (i261 & c21)))) * (-814);
                                        int i265 = ~c21;
                                        int i266 = ~((i265 ^ (-18)) | (i265 & (-18)));
                                        int i267 = ~i261;
                                        int i268 = ~((i267 & 17) | (i267 ^ 17));
                                        int i269 = (i266 ^ i268) | (i266 & i268);
                                        int i270 = ~(i261 | c21);
                                        int i271 = (i263 & i264) + (i264 | i263) + (((i270 ^ i269) | (i269 & i270)) * 407);
                                        int i272 = ~((i267 & c21) | (i267 ^ c21));
                                        int i273 = (i272 ^ i268) | (i272 & i268);
                                        int i274 = ~((c21 ^ 17) | (c21 & 17));
                                        int i275 = ((i273 ^ i274) | (i273 & i274)) * 407;
                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                        h(keyRepeatDelay2, (i260 & 241) + (i260 | 241), (i271 & i275) + (i275 | i271), objArr116);
                                        java.lang.String str61 = (java.lang.String) objArr116[0];
                                        int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str55, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                        g("䧮䧁䣰鴝꣑\uee12巀亗죒⤏\udc9c찃䬜ꩻ幇䶻쩐ⲻ\ud908쪰䲽귣墿䡡쾩", ((lastIndexOf3 | 1) << 1) - (lastIndexOf3 ^ 1), objArr117);
                                        java.lang.String str62 = (java.lang.String) objArr117[0];
                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                        h((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.MeasureSpec.getMode(0) + 258, 15 - (~(-android.graphics.Color.alpha(0))), objArr118);
                                        java.lang.String str63 = (java.lang.String) objArr118[0];
                                        char makeMeasureSpec2 = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i276 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                        int i277 = -android.graphics.Color.alpha(0);
                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                        h(makeMeasureSpec2, 272 - (~i276), (i277 ^ 25) + ((i277 & 25) << 1), objArr119);
                                        java.lang.String str64 = (java.lang.String) objArr119[0];
                                        int i278 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                        long elapsedRealtime7 = android.os.SystemClock.elapsedRealtime();
                                        int i279 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                        h((char) (((i278 | 22670) << 1) - (i278 ^ 22670)), 300 - (elapsedRealtime7 > 0L ? 1 : (elapsedRealtime7 == 0L ? 0 : -1)), (i279 & 14) + (i279 | 14), objArr120);
                                        java.lang.String str65 = (java.lang.String) objArr120[0];
                                        int i280 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                        int c22 = com.facetec.sdk.fp.a.c();
                                        int i281 = (maximumFlingVelocity * 371) + 115752;
                                        int i282 = ~c22;
                                        int i283 = ~((i282 ^ (-313)) | (i282 & (-313)));
                                        int i284 = ~maximumFlingVelocity;
                                        int i285 = ~(i284 | c22);
                                        int i286 = -(-(((i283 ^ i285) | (i283 & i285)) * (-370)));
                                        int i287 = ~((i282 ^ i284) | (i284 & i282));
                                        int i288 = ~((c22 ^ (-313)) | (c22 & (-313)));
                                        int i289 = (i288 ^ i287) | (i288 & i287);
                                        int i290 = ~((maximumFlingVelocity ^ 312) | (maximumFlingVelocity & 312));
                                        int i291 = -(-(((i289 ^ i290) | (i289 & i290)) * (-370)));
                                        int i292 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                        h((char) (((i280 | 12567) << 1) - (i280 ^ 12567)), (((((i281 | i286) << 1) - (i281 ^ i286)) - (~i291)) - 1) + ((~(maximumFlingVelocity | 312)) * com.knotapi.knot.utilities.Constants.ID_KROGER), ((i292 | 8) << 1) - (i292 ^ 8), objArr121);
                                        java.lang.String str66 = (java.lang.String) objArr121[0];
                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                        g("䇉䇦\ude47\uf00d㹦飷ボ㠮샣뾴놏뫦", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr122);
                                        java.lang.String[] strArr6 = {str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, (java.lang.String) objArr122[0]};
                                        for (int i293 = 0; i293 < 12; i293++) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(strArr6[i293]);
                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                            g("蚮蛝\ue0f6꼚Ñ㹤", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr123);
                                            sb.append((java.lang.String) objArr123[0]);
                                            java.lang.Object[] objArr124 = {sb.toString()};
                                            java.lang.Object d26 = com.facetec.sdk.al.d(1873189073);
                                            if (d26 == null) {
                                                char defaultSize3 = (char) (android.view.View.getDefaultSize(0, 0) + 6935);
                                                int gidForName = android.os.Process.getGidForName(str55);
                                                int mode4 = android.view.View.MeasureSpec.getMode(0);
                                                byte b50 = (byte) (-1);
                                                byte b51 = (byte) (b50 + 1);
                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                f(b50, b51, (byte) (b51 + 1), objArr125);
                                                d26 = com.facetec.sdk.al.c(defaultSize3, 2388 - gidForName, mode4 + 23, -934682071, false, (java.lang.String) objArr125[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d26).invoke(null, objArr124)).longValue();
                                            long j92 = -705519873;
                                            long j93 = -919;
                                            long j94 = 920;
                                            long j95 = j92 ^ j2;
                                            long j96 = longValue16 ^ j2;
                                            long j97 = j95 | j96;
                                            long freeMemory6 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                            long j98 = freeMemory6 ^ j2;
                                            long j99 = (j93 * j92) + (j93 * longValue16) + ((((j97 | freeMemory6) ^ j2) | (((j96 | j98) | j92) ^ j2)) * j94) + (((j97 ^ j2) | ((j95 | j98) ^ j2)) * j94) + (j94 * ((((j95 | longValue16) | freeMemory6) ^ j2) | ((j97 | j98) ^ j2) | (((j96 | j92) | freeMemory6) ^ j2))) + 1642599516;
                                            int i294 = (int) (j99 >> 32);
                                            int i295 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                            int i296 = ~i295;
                                            int maxMemory7 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                            int i297 = ~(1453357324 | (~maxMemory7));
                                            if (((((int) j99) & ((((((~(r9 | (-1453357325))) | ((~((-1404383562) | r9)) | 1386230024)) | (~(1471510861 | maxMemory7))) * (-84)) - 1905160647) + (((~(maxMemory7 | (-1453357325))) | 1404383561 | i297) * (-84)) + (((-1471510862) | i297) * 84))) | ((((((~((-1933846790) | i296)) | (~((-496620379) | i295))) * 959) - 1508512311) + (((~(i295 | (-1933846790))) | (~(i296 | (-496620379)))) * 959)) & i294)) != 0) {
                                                i8 = (i293 ^ 110) + ((i293 & 110) << 1);
                                                break;
                                            }
                                        }
                                    }
                                }
                                i8 = 0;
                                if (i8 != 0) {
                                    int i298 = i;
                                    c = ((i298 & 73) + (i298 | 73)) % 128;
                                    java.lang.Object[] objArr126 = {null, new int[1], new int[]{i8}, new int[]{0}};
                                    int i299 = (((((-5376536) | r1) * (-381)) - 389618516) + (((~((~new java.util.Random().nextInt()) | 941748584)) | (-276032280)) * 381)) - 1071345695;
                                    int i300 = i299 << 13;
                                    int i301 = (~(i300 & i299)) & (i300 | i299);
                                    int i302 = i301 >>> 17;
                                    int i303 = (~(i301 & i302)) & (i301 | i302);
                                    int i304 = i303 << 5;
                                    ((int[]) objArr126[1])[0] = (~(i303 & i304)) & (i303 | i304);
                                    int i305 = c + 3;
                                    i = i305 % 128;
                                    if (i305 % 2 != 0) {
                                        return objArr126;
                                    }
                                    java.lang.Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                long[] jArr = {472001035};
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                g("颟颰䰖↗갴≻\ue141苢ᦴⶣ怈 驣꺒\ue28c膐ᬨ⡉斅ہ鷌", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr127);
                                java.lang.Object[] objArr128 = {(java.lang.String) objArr127[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                java.lang.Object d27 = com.facetec.sdk.al.d(2143203995);
                                if (d27 == null) {
                                    char c23 = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18697);
                                    int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength();
                                    int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str55, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    byte b52 = (byte) (-1);
                                    byte b53 = (byte) (b52 + 1);
                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                    f(b52, b53, (byte) (b53 + 3), objArr129);
                                    d27 = com.facetec.sdk.al.c(c23, 1787 - (fadingEdgeLength3 >> 16), 23 - lastIndexOf4, -665728925, false, (java.lang.String) objArr129[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                }
                                long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d27).invoke(null, objArr128)).longValue();
                                long j100 = -238012225;
                                int maxMemory8 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j101 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                long j102 = j100 ^ j2;
                                java.lang.String str67 = str55;
                                long j103 = maxMemory8;
                                long j104 = j103 ^ j2;
                                long j105 = ((((((-183) * j100) + (185 * longValue17)) + ((((j102 | longValue17) ^ j2) | ((j104 | longValue17) ^ j2)) * j101)) + ((-184) * ((((longValue17 ^ j2) | j100) ^ j2) | j103))) + (j101 * ((j102 | j104) ^ j2))) - 262602409;
                                int i306 = ~((int) android.os.SystemClock.uptimeMillis());
                                int nextInt12 = new java.util.Random().nextInt(314262167);
                                int i307 = ~nextInt12;
                                if (((((int) (j105 >> 32)) & (((((~((-816325276) | i306)) | (-620901136)) * (-933)) - 915644698) + (((~(i306 | (-620901136))) | 84021508) * 933) + 1790040544)) | ((((((~((-298142651) | nextInt12)) | (~((-1714069573) | i307))) * (-406)) - 465192577) + ((~((-21299489) | i307)) * (-406)) + (((~(nextInt12 | 1735369060)) | (~(i307 | 298142650))) * 406)) & ((int) j105))) != 0) {
                                    i9 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                } else {
                                    i = (c + 89) % 128;
                                    i9 = 0;
                                }
                                if (i9 != 0) {
                                    int i308 = i;
                                    c = ((i308 & 31) + (i308 | 31)) % 128;
                                    java.lang.Object[] objArr130 = {null, new int[1], new int[]{i9}, new int[]{0}};
                                    int nextInt13 = new java.util.Random().nextInt(1059358779);
                                    int i309 = (((~(660842081 | nextInt13)) | (-1064560616)) * 305) + 1253457024 + (((~((~nextInt13) | 660842081)) | (-957375879)) * 305);
                                    int i310 = ((i309 | 16) << 1) - (i309 ^ 16);
                                    int i311 = (i310 & 1175161750) + (i310 | 1175161750);
                                    int i312 = i311 << 13;
                                    int i313 = ((~i312) & i311) | ((~i311) & i312);
                                    int i314 = i313 ^ (i313 >>> 17);
                                    int i315 = i314 << 5;
                                    ((int[]) objArr130[1])[0] = (i314 & (~i315)) | ((~i314) & i315);
                                    return objArr130;
                                }
                                long[] jArr2 = {472001035};
                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                g("劏加鑧\uaace瑆㛝樓陘폨\uf59b\ueb51ᓌ偬盠榖锲턹\uf038\ueecaሼ域煺潦邢풄\uf2a4", android.text.TextUtils.getOffsetBefore(str67, 0), objArr131);
                                java.lang.Object[] objArr132 = {(java.lang.String) objArr131[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                java.lang.Object d28 = com.facetec.sdk.al.d(2143203995);
                                if (d28 == null) {
                                    char minimumFlingVelocity = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18697);
                                    long elapsedCpuTime4 = android.os.Process.getElapsedCpuTime();
                                    int offsetAfter = android.text.TextUtils.getOffsetAfter(str67, 0);
                                    byte b54 = (byte) (-1);
                                    byte b55 = (byte) (b54 + 1);
                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                    f(b54, b55, (byte) (b55 + 3), objArr133);
                                    d28 = com.facetec.sdk.al.c(minimumFlingVelocity, (elapsedCpuTime4 > 0L ? 1 : (elapsedCpuTime4 == 0L ? 0 : -1)) + 1786, offsetAfter + 24, -665728925, false, (java.lang.String) objArr133[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                }
                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d28).invoke(null, objArr132)).longValue();
                                long j106 = 1111538298;
                                long j107 = 764;
                                java.lang.String str68 = str67;
                                long uptimeMillis5 = ((int) android.os.SystemClock.uptimeMillis()) ^ j2;
                                long j108 = (uptimeMillis5 | j106) ^ j2;
                                long j109 = ((j106 ^ j2) | longValue18) ^ j2;
                                long j110 = (((((765 * j106) + ((-1527) * longValue18)) + ((longValue18 | j108) * j107)) + ((-1528) * (j109 | ((uptimeMillis5 | longValue18) ^ j2)))) + (j107 * ((j109 | (((longValue18 ^ j2) | j106) ^ j2)) | j108))) - 1612152932;
                                int freeMemory7 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                int i316 = ((int) (j110 >> 32)) & ((((1266849419 | r3) * (-757)) - 1756801018) + ((~((-2435349) | freeMemory7)) * 1514) + (((~(freeMemory7 | 1269284767)) | (~((~freeMemory7) | (-170376992))) | 167941643) * 757));
                                int maxMemory9 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i317 = ~maxMemory9;
                                int i318 = ((int) j110) & (((2100483535 | i317) * (-369)) + 802172634 + (((~((-1026741384) | i317)) | 1830999502) * (-369)) + (((~(maxMemory9 | 1026741383)) | 1073742152 | (~(i317 | (-269484034)))) * 369));
                                if (((i316 ^ i318) | (i316 & i318)) != 0) {
                                    java.lang.Object[] objArr134 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, new int[]{0}};
                                    int uptimeMillis6 = (int) android.os.SystemClock.uptimeMillis();
                                    int i319 = (((~((-885998218) | uptimeMillis6)) | 545538056) * 104) + 827274767 + ((~((~uptimeMillis6) | 1072679903)) * (-104)) + ((uptimeMillis6 | 732219742) * 104);
                                    int c24 = com.facetec.sdk.fp.a.c();
                                    int i320 = (i319 * (-139)) + 2256;
                                    int i321 = ~(i319 | (-17));
                                    int i322 = ~((c24 ^ (-17)) | (c24 & (-17)));
                                    int i323 = (i321 | i322) * (-280);
                                    int i324 = ~i319;
                                    int i325 = ~((i324 ^ c24) | (i324 & c24));
                                    int i326 = (i324 ^ (-17)) | (i324 & (-17));
                                    int i327 = ~c24;
                                    int i328 = (i327 & (-17)) | (i327 ^ (-17));
                                    int i329 = ((((i320 & i323) + (i320 | i323)) + (((i322 & i325) | (i322 ^ i325)) * 140)) - (~((((~((c24 ^ i326) | (i326 & c24))) | (~((i319 ^ i328) | (i328 & i319)))) | (~((i327 | i324) | 16))) * 140))) - 1;
                                    int i330 = (i329 ^ 1175161750) + ((1175161750 & i329) << 1);
                                    int i331 = i330 << 13;
                                    int i332 = ((~i331) & i330) | ((~i330) & i331);
                                    int i333 = i332 >>> 17;
                                    int i334 = (~(i332 & i333)) & (i332 | i333);
                                    int i335 = i334 << 5;
                                    ((int[]) objArr134[1])[0] = (i334 & (~i335)) | ((~i334) & i335);
                                    return objArr134;
                                }
                                java.lang.Object d29 = com.facetec.sdk.al.d(-1699488110);
                                if (d29 == null) {
                                    char threadPriority2 = (char) (22875 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                    int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                                    int rgb4 = android.graphics.Color.rgb(0, 0, 0);
                                    byte b56 = (byte) (-1);
                                    byte b57 = (byte) (b56 + 1);
                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                    f(b56, b57, (byte) (b57 + 1), objArr135);
                                    d29 = com.facetec.sdk.al.c(threadPriority2, 2031 - (touchSlop >> 8), (-16777193) - rgb4, 1029481578, false, (java.lang.String) objArr135[0], new java.lang.Class[0]);
                                }
                                long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d29).invoke(null, null)).longValue();
                                long j111 = -1173870182;
                                long j112 = 983;
                                long j113 = longValue19 ^ j2;
                                long j114 = j111 ^ j2;
                                long nextInt14 = new java.util.Random().nextInt() ^ j2;
                                long j115 = ((((((-1965) * j111) + (984 * longValue19)) + ((j111 | j113) * j112)) + ((j114 | ((j113 | nextInt14) ^ j2)) * (-983))) + (j112 * (((j114 | longValue19) ^ j2) | ((j114 | nextInt14) ^ j2)))) - 13894401;
                                int i336 = ((int) (j115 >> 32)) & (((((2001567227 | (~r2)) * (-490)) - 1455734890) + (((~(android.os.Process.myUid() | 1929919705)) | 71647522) * 490)) - 634155666);
                                int nextInt15 = new java.util.Random().nextInt(862265767);
                                int i337 = ((int) j115) & ((((~(2145000054 | nextInt15)) | 2196873) * (-140)) + 1383843083 + ((~(2147196927 | nextInt15)) * 70) + (((~(nextInt15 | 712740831)) | 1436652969) * 70));
                                if (((i336 ^ i337) | (i336 & i337)) != 0) {
                                    int i338 = c + 53;
                                    i = i338 % 128;
                                    if (i338 % 2 != 0) {
                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{0}};
                                        int myPid6 = android.os.Process.myPid();
                                        int i339 = ~myPid6;
                                        int i340 = (((~(myPid6 | 1600755796)) | (~((-17305617) | i339)) | (-1600912344)) * (-68)) + 1328433315 + ((~((-156548) | i339)) * (-68)) + (((~(i339 | (-1600755797))) | (-17462164)) * 68) + 16;
                                        int i341 = ((i340 | 1175161750) << 1) - (i340 ^ 1175161750);
                                        int i342 = i341 << 13;
                                        int i343 = ((~i342) & i341) | ((~i341) & i342);
                                        int i344 = i343 >>> 17;
                                        int i345 = (~(i343 & i344)) & (i343 | i344);
                                        int i346 = i345 << 5;
                                        int[] iArr = (int[]) objArr[1];
                                        int i347 = (i345 & (~i346)) | ((~i345) & i346);
                                        i10 = 0;
                                        iArr[0] = i347;
                                        if (((int[]) objArr[3])[i10] == ((int[]) objArr[2])[i10]) {
                                            return objArr;
                                        }
                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                        objArr136[i10] = 2;
                                        java.lang.Object d30 = com.facetec.sdk.al.d(-1836228463);
                                        if (d30 == null) {
                                            char packedPositionType2 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                            int fadingEdgeLength4 = android.view.ViewConfiguration.getFadingEdgeLength();
                                            str8 = str68;
                                            int indexOf12 = android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i10, i10);
                                            byte b58 = (byte) (-1);
                                            byte b59 = (byte) (b58 + 1);
                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                            f(b58, b59, (byte) (b59 + 1), objArr137);
                                            d30 = com.facetec.sdk.al.c(packedPositionType2, (fadingEdgeLength4 >> 16) + 455, indexOf12 + 25, 895621737, false, (java.lang.String) objArr137[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                        } else {
                                            str8 = str68;
                                        }
                                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) d30).invoke(null, objArr136)).longValue();
                                        long j116 = 630081930;
                                        long j117 = -575;
                                        long j118 = 576;
                                        long j119 = j116 ^ j2;
                                        long j120 = longValue20 ^ j2;
                                        long j121 = (j119 | j120) ^ j2;
                                        long uptimeMillis7 = (int) android.os.SystemClock.uptimeMillis();
                                        long j122 = (((((j117 * j116) + (j117 * longValue20)) + ((j121 | ((j120 | uptimeMillis7) ^ j2)) * j118)) + ((((longValue20 | j119) ^ j2) | ((j116 | (j120 | (uptimeMillis7 ^ j2))) ^ j2)) * j118)) + (j118 * j121)) - 2000609535;
                                        int myUid4 = android.os.Process.myUid();
                                        int i348 = ~myUid4;
                                        int i349 = ((int) (j122 >> 32)) & (((608241732 | myUid4) * 988) + 516917910 + (((~(2087825135 | i348)) | (-2130182128)) * (-1976)) + (((~(myUid4 | 650598724)) | 608241732 | (~(i348 | (-650598725)))) * 988));
                                        int i350 = ~(((int) java.lang.Runtime.getRuntime().maxMemory()) | (-553443630));
                                        int i351 = ((int) j122) & ((((335615056 | i350) * (-196)) - 1919341555) + ((i350 | (-889058686)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                                        if (((i351 ^ i349) | (i349 & i351)) == 2) {
                                            java.lang.Object[] objArr138 = {null, new int[1], new int[]{270}, new int[]{0}};
                                            int myUid5 = android.os.Process.myUid();
                                            int i352 = (((~((-540412578) | myUid5)) | 3538944) * 345) + 1678770584 + (((~((-540412578) | (~myUid5))) | 1074266438) * 345) + ((~(myUid5 | (-3538945))) * 345);
                                            int c25 = com.facetec.sdk.fp.a.c();
                                            int i353 = (-6913) - (~(i352 * 434));
                                            int i354 = ~c25;
                                            int i355 = (i354 ^ (-17)) | (i354 & (-17));
                                            int i356 = -(-((~((i355 ^ i352) | (i355 & i352))) * 433));
                                            int i357 = (i353 ^ i356) + ((i353 & i356) << 1);
                                            int i358 = ~i352;
                                            int i359 = ~((i358 ^ c25) | (i358 & c25));
                                            int i360 = -(-(((i359 ^ (-17)) | (i359 & (-17))) * (-433)));
                                            int i361 = ~((c25 ^ (-17)) | (c25 & (-17)));
                                            int i362 = ~((i352 & 16) | (i352 ^ 16));
                                            int i363 = -(-((((i357 | i360) << 1) - (i360 ^ i357)) + (((i361 ^ i362) | (i361 & i362)) * 433)));
                                            int i364 = (i363 ^ 1175161750) + ((i363 & 1175161750) << 1);
                                            int i365 = i364 << 13;
                                            int i366 = ((~i365) & i364) | ((~i364) & i365);
                                            int i367 = i366 >>> 17;
                                            int i368 = (i366 & (~i367)) | ((~i366) & i367);
                                            int i369 = i368 << 5;
                                            ((int[]) objArr138[1])[0] = (~(i368 & i369)) & (i368 | i369);
                                            com.facetec.sdk.fp.a.c();
                                            com.facetec.sdk.fp.a.c();
                                            return objArr138;
                                        }
                                        java.lang.Object d31 = com.facetec.sdk.al.d(-1753496434);
                                        if (d31 == null) {
                                            char c26 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 408);
                                            float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                                            int scrollBarSize5 = android.view.ViewConfiguration.getScrollBarSize();
                                            byte b60 = (byte) (-1);
                                            byte b61 = (byte) (b60 + 1);
                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                            f(b60, b61, b61, objArr139);
                                            d31 = com.facetec.sdk.al.c(c26, (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)) + 2197, (scrollBarSize5 >> 8) + 24, 815054454, false, (java.lang.String) objArr139[0], new java.lang.Class[0]);
                                        }
                                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) d31).invoke(null, null)).longValue();
                                        long j123 = -1046902784;
                                        long j124 = 503;
                                        long j125 = -502;
                                        long j126 = j123 | longValue21;
                                        long j127 = j123 ^ j2;
                                        long elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
                                        long j128 = j127 | (elapsedCpuTime5 ^ j2);
                                        long j129 = (elapsedCpuTime5 | j126) ^ j2;
                                        long j130 = (j123 * j124) + (j124 * longValue21) + (j126 * j125) + (j125 * (((j127 | (longValue21 ^ j2)) ^ j2) | (j128 ^ j2) | j129)) + (502 * (((j128 | longValue21) ^ j2) | j129)) + 1772140322;
                                        int i370 = (~android.os.Process.myUid()) | 1703295560;
                                        int nextInt16 = new java.util.Random().nextInt();
                                        int i371 = ~nextInt16;
                                        int i372 = ~(nextInt16 | (-433083907));
                                        if (((((int) (j130 >> 32)) & (((i370 * 495) - 1380215335) + (((~i370) | 1610881600) * 495))) | (((((((~(467238823 | i371)) | (-1004142504)) | i372) * (-252)) - 1078066955) + ((i372 | (~(i371 | (-536903681)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)) & ((int) j130))) != 0) {
                                            java.lang.Object[] objArr140 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, new int[]{0}};
                                            int uptimeMillis8 = (int) android.os.SystemClock.uptimeMillis();
                                            int i373 = ~uptimeMillis8;
                                            int i374 = ~(1241127184 | i373);
                                            int i375 = (((~((-1241127185) | uptimeMillis8)) | (~(377090775 | i373)) | i374) * (-516)) + 784406219 + (((~(uptimeMillis8 | (-7868433))) | (~(i373 | (-369222344)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((369222343 | i374) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR);
                                            int i376 = ((i375 | 16) << 1) - (i375 ^ 16);
                                            int i377 = (i376 ^ 1175161750) + ((i376 & 1175161750) << 1);
                                            int i378 = i377 << 13;
                                            int i379 = (~(i378 & i377)) & (i378 | i377);
                                            int i380 = i379 >>> 17;
                                            int i381 = (~(i379 & i380)) & (i379 | i380);
                                            int i382 = i381 << 5;
                                            ((int[]) objArr140[1])[0] = (~(i381 & i382)) & (i381 | i382);
                                            return objArr140;
                                        }
                                        long[] jArr3 = {624887784092251L};
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        g("颟颰䰖↗갴≻\ue141苢ᦴⶣ怈 驣꺒\ue28c膐ᬨ⡉斅ہ鷌", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr141);
                                        java.lang.Object[] objArr142 = {(java.lang.String) objArr141[0], 3, 2251799813685247L, jArr3};
                                        java.lang.Object d32 = com.facetec.sdk.al.d(2143203995);
                                        if (d32 == null) {
                                            char blue3 = (char) (18697 - android.graphics.Color.blue(0));
                                            float length = android.graphics.PointF.length(0.0f, 0.0f);
                                            int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                            byte b62 = (byte) (-1);
                                            byte b63 = (byte) (b62 + 1);
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            f(b62, b63, (byte) (b63 + 3), objArr143);
                                            d32 = com.facetec.sdk.al.c(blue3, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 1787, 24 - (touchSlop2 >> 8), -665728925, false, (java.lang.String) objArr143[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                        }
                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) d32).invoke(null, objArr142)).longValue();
                                        long j131 = 1309243705;
                                        long myTid6 = android.os.Process.myTid();
                                        long j132 = 50;
                                        long j133 = longValue22 ^ j2;
                                        long j134 = myTid6 ^ j2;
                                        long j135 = j133 | j134;
                                        long j136 = (((((51 * j131) + ((-49) * longValue22)) + ((j131 | myTid6) * (-50))) + ((((((j131 ^ j2) | j133) | myTid6) ^ j2) | ((j135 | j131) ^ j2)) * j132)) + (j132 * (((j135 ^ j2) | ((j133 | j131) ^ j2)) | ((j131 | j134) ^ j2)))) - 1809858339;
                                        int nextInt17 = new java.util.Random().nextInt(2101590623);
                                        int i383 = ((int) (j136 >> 32)) & ((((-2729985) | nextInt17) * (-381)) + 388842676 + (((~((~nextInt17) | 897603454)) | (-363440467)) * 381) + 1040123904);
                                        int i384 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                        int i385 = ~i384;
                                        int i386 = ~(326881239 | i385);
                                        int i387 = ((int) j136) & (((((~((-1764107650) | i385)) | 19006849) * (-1188)) - 727451013) + (((~(i384 | 1764107649)) | 19006849 | i386) * 594) + (((~(1764107649 | i385)) | (-2071982040) | i386) * 594));
                                        if (((i383 ^ i387) | (i383 & i387)) != 0) {
                                            java.lang.Object[] objArr144 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, new int[]{0}};
                                            int elapsedRealtime8 = (int) android.os.SystemClock.elapsedRealtime();
                                            int i388 = ~elapsedRealtime8;
                                            int i389 = ((((-1349176262) | elapsedRealtime8) * (-676)) - 1189741317) + (((~(235216914 | i388)) | 1349176261) * 676) + (((~(elapsedRealtime8 | 1584393175)) | (~(i388 | (-1383001046))) | 33824784) * 676);
                                            int i390 = (((i389 | 16) << 1) - (i389 ^ 16)) + 1175161750;
                                            int i391 = i390 << 13;
                                            int i392 = (i390 & (~i391)) | ((~i390) & i391);
                                            int i393 = i392 >>> 17;
                                            int i394 = (i392 & (~i393)) | ((~i392) & i393);
                                            int i395 = i394 << 5;
                                            ((int[]) objArr144[1])[0] = (i394 & (~i395)) | ((~i394) & i395);
                                            return objArr144;
                                        }
                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                        g("㈝㈲\udc50炈㱦髼끉㩼덺붰ㄝ뢥ヤ㻁돗", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr145);
                                        java.lang.Object[] objArr146 = {(java.lang.String) objArr145[0]};
                                        java.lang.Object d33 = com.facetec.sdk.al.d(2084539986);
                                        if (d33 == null) {
                                            char c27 = (char) (6936 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                            int red3 = android.graphics.Color.red(0);
                                            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                            byte b64 = (byte) (-1);
                                            byte b65 = (byte) (b64 + 1);
                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                            f(b64, b65, b65, objArr147);
                                            d33 = com.facetec.sdk.al.c(c27, red3 + 2389, 24 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), -607062870, false, (java.lang.String) objArr147[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) d33).invoke(null, objArr146)).longValue();
                                        long j137 = -243847129;
                                        long j138 = j137 ^ j2;
                                        long j139 = longValue23 ^ j2;
                                        java.lang.String str69 = str8;
                                        long elapsedCpuTime6 = (((int) android.os.Process.getElapsedCpuTime()) ^ j2) | j138;
                                        long j140 = (483 * j137) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE * longValue23) + ((-241) * (((j138 | j139) ^ j2) | (elapsedCpuTime6 ^ j2))) + ((-482) * (j137 | longValue23)) + (241 * (((longValue23 | elapsedCpuTime6) ^ j2) | ((j139 | j137) ^ j2))) + 1215996471;
                                        int i396 = (int) (j140 >> 32);
                                        int freeMemory8 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                        int i397 = (int) j140;
                                        int i398 = ~android.os.Process.myPid();
                                        if (((i396 & ((((~((-100663380) | (~freeMemory8))) | (~(1336563031 | freeMemory8))) * (-272)) + 1494493674 + (((~((-1310855512) | freeMemory8)) | 1210192132) * (-272)) + (((~(freeMemory8 | 1310855511)) | 126370899) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((((~(1040863139 | r4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1552656979) + (((-1078005777) | i398) * (-216)) + (((~(1040863139 | i398)) | 1816877746) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)) & i397)) != 0) {
                                            int i399 = c;
                                            i = (((i399 | 1) << 1) - (i399 ^ 1)) % 128;
                                            java.lang.Object[] objArr148 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                            int nextInt18 = new java.util.Random().nextInt(1828393022);
                                            int i400 = ~nextInt18;
                                            int i401 = ((((~((-163260130) | i400)) | r4) * 1150) - 1144172530) + (((~((-1454957831) | nextInt18)) | (~(1454957830 | i400))) * (-575)) + (((~(nextInt18 | (-163260130))) | (~(i400 | 163260129))) * 575);
                                            int i402 = 1175161749 - (~((i401 & 16) + (i401 | 16)));
                                            int i403 = i402 << 13;
                                            int i404 = ((~i403) & i402) | ((~i402) & i403);
                                            int i405 = i404 >>> 17;
                                            int i406 = (i404 & (~i405)) | ((~i404) & i405);
                                            ((int[]) objArr148[1])[0] = i406 ^ (i406 << 5);
                                            return objArr148;
                                        }
                                        java.lang.Object d34 = com.facetec.sdk.al.d(-2029373905);
                                        if (d34 == null) {
                                            char windowTouchSlop2 = (char) (19038 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            str9 = str69;
                                            int indexOf13 = android.text.TextUtils.indexOf(str9, str9);
                                            int scrollBarFadeDuration3 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                            byte b66 = (byte) (-1);
                                            byte b67 = (byte) (b66 + 1);
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            f(b66, b67, (byte) (b67 + 1), objArr149);
                                            d34 = com.facetec.sdk.al.c(windowTouchSlop2, 940 - indexOf13, (scrollBarFadeDuration3 >> 16) + 24, 551898327, false, (java.lang.String) objArr149[0], new java.lang.Class[0]);
                                        } else {
                                            str9 = str69;
                                        }
                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) d34).invoke(null, null)).longValue();
                                        long j141 = -1444225674;
                                        long j142 = 614;
                                        long j143 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                        long j144 = j141 ^ j2;
                                        long j145 = (j144 | longValue24) ^ j2;
                                        long j146 = longValue24 ^ j2;
                                        java.lang.String str70 = str9;
                                        long j147 = j143 ^ j2;
                                        long j148 = (615 * j141) + ((-613) * longValue24) + ((j143 | j145 | ((j146 | j141) ^ j2)) * j142) + ((-1228) * (((j144 | j147) ^ j2) | j145 | ((j147 | longValue24) ^ j2))) + (j142 * (((longValue24 | (j147 | j141)) ^ j2) | (((j144 | j146) | j147) ^ j2))) + 1991143410;
                                        int myTid7 = android.os.Process.myTid();
                                        int i407 = ~myTid7;
                                        int i408 = ((int) (j148 >> 32)) & ((((((~((-1624506437) | i407)) | (~(1811917821 | myTid7))) | (~((-131361) | myTid7))) * 765) - 1188527238) + (((~(187411385 | i407)) | 1624506436) * 1530) + (((~(myTid7 | 187411385)) | (~(i407 | (-131361)))) * 765));
                                        int myUid6 = android.os.Process.myUid();
                                        int i409 = ~myUid6;
                                        int i410 = ~(myUid6 | 1605200341);
                                        int i411 = ((int) j148) & ((((~((-1336492230) | i409)) | 1252540544 | i410) * (-252)) + 670378069 + ((i410 | (~(i409 | (-83951686)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                                        if (((i408 ^ i411) | (i408 & i411)) != 0) {
                                            java.lang.Object[] objArr150 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, new int[]{0}};
                                            int nextInt19 = new java.util.Random().nextInt(1056362298);
                                            int i412 = (((~((-609812708) | nextInt19)) | 605618176) * 576) + 1532576807 + (((~((~nextInt19) | (-4194532))) | 402787076) * 576) + 2118880166;
                                            int i413 = i412 << 13;
                                            int i414 = (~(i413 & i412)) & (i413 | i412);
                                            int i415 = i414 >>> 17;
                                            int i416 = (~(i414 & i415)) & (i414 | i415);
                                            ((int[]) objArr150[1])[0] = i416 ^ (i416 << 5);
                                            return objArr150;
                                        }
                                        java.lang.Object d35 = com.facetec.sdk.al.d(1671466082);
                                        if (d35 == null) {
                                            char c28 = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58897);
                                            str10 = str70;
                                            int indexOf14 = android.text.TextUtils.indexOf(str10, str10);
                                            int indexOf15 = android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            byte b68 = (byte) (-1);
                                            byte b69 = (byte) (b68 + 1);
                                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                                            f(b68, b69, (byte) (b69 + 3), objArr151);
                                            d35 = com.facetec.sdk.al.c(c28, 1529 - indexOf14, indexOf15 + 24, -1001392486, false, (java.lang.String) objArr151[0], new java.lang.Class[0]);
                                        } else {
                                            str10 = str70;
                                        }
                                        long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) d35).invoke(null, null)).longValue();
                                        long j149 = -935120001;
                                        long j150 = -919;
                                        long j151 = 920;
                                        long j152 = j149 ^ j2;
                                        long j153 = longValue25 ^ j2;
                                        long j154 = j152 | j153;
                                        java.lang.String str71 = str10;
                                        long myUid7 = android.os.Process.myUid();
                                        long j155 = myUid7 ^ j2;
                                        long j156 = (((((j150 * j149) + (j150 * longValue25)) + ((((j154 | myUid7) ^ j2) | (((j153 | j155) | j149) ^ j2)) * j151)) + (((j154 ^ j2) | ((j152 | j155) ^ j2)) * j151)) + (j151 * (((((longValue25 | j152) | myUid7) ^ j2) | ((j154 | j155) ^ j2)) | (((j149 | j153) | myUid7) ^ j2)))) - 663391878;
                                        int freeMemory9 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                        int i417 = ~freeMemory9;
                                        int myTid8 = android.os.Process.myTid();
                                        int i418 = ~myTid8;
                                        if (((((int) j156) & ((((((~((-1575678870) | myTid8)) | (~(1282062016 | i418))) | r7) * (-516)) - 254785623) + (((~(myTid8 | (-1282060929))) | (~(i418 | (-1089)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(1575678869 | i418)) | 1088) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((int) (j156 >> 32)) & ((((((~(1556394235 | freeMemory9)) | 17844480) | (~((-1301346650) | freeMemory9))) * (-754)) - 1890092410) + (((~(freeMemory9 | (-17844481))) | (~((-1283502170) | i417))) * (-754)) + ((1556394235 | i417) * 754)))) != 0) {
                                            java.lang.Object[] objArr152 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                            int nextInt20 = new java.util.Random().nextInt();
                                            int i419 = (((((~((~nextInt20) | (-1358892734))) | 7605288) * 446) + 1447513973) + (((~(nextInt20 | (-1351287446))) | 251719938) * 446)) - 903008848;
                                            int i420 = -(-((i419 & 16) + (i419 | 16)));
                                            int i421 = (i420 ^ 1175161750) + ((i420 & 1175161750) << 1);
                                            int i422 = i421 << 13;
                                            int i423 = ((~i422) & i421) | ((~i421) & i422);
                                            int i424 = i423 >>> 17;
                                            int i425 = (i423 & (~i424)) | ((~i423) & i424);
                                            int i426 = i425 << 5;
                                            ((int[]) objArr152[1])[0] = (i425 & (~i426)) | ((~i425) & i426);
                                            return objArr152;
                                        }
                                        java.lang.Object[] objArr153 = {0, obj, 1175161750, 16777216};
                                        java.lang.Object d36 = com.facetec.sdk.al.d(-1695430476);
                                        if (d36 == null) {
                                            str11 = str71;
                                            d36 = com.facetec.sdk.al.c((char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2270, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 1025421900, false, null, new java.lang.Class[]{java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2246 - android.text.TextUtils.getOffsetAfter(str71, 0), 23 - android.text.TextUtils.indexOf(str71, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                        } else {
                                            str11 = str71;
                                        }
                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) d36).newInstance(objArr153);
                                        i = (c + 67) % 128;
                                        try {
                                            int i427 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i428 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int c29 = com.facetec.sdk.fp.a.c();
                                            int i429 = i428 * 50;
                                            int i430 = ~c29;
                                            int i431 = ~((i430 & (-340)) | (i430 ^ (-340)));
                                            int i432 = ~((i428 ^ (-340)) | (i428 & (-340)));
                                            int i433 = ~i428;
                                            int i434 = ~((i430 ^ i433) | (i433 & i430));
                                            int i435 = (i434 ^ (-340)) | (i434 & (-340));
                                            int i436 = ~((i428 ^ c29) | (i428 & c29));
                                            int i437 = ~((c29 ^ (-340)) | (c29 & (-340)));
                                            int i438 = ~((i428 ^ 339) | (i428 & 339));
                                            int i439 = -(-android.view.KeyEvent.keyCodeFromString(str11));
                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                            h((char) (((61531 | i427) << 1) - (i427 ^ 61531)), ((((((-32883) ^ i429) + ((i429 & (-32883)) << 1)) + (((i431 & i432) | (i431 ^ i432)) * 98)) + (((i435 & i436) | (i435 ^ i436)) * (-49))) - (~(((i438 ^ i437) | (i438 & i437)) * 49))) - 1, (i439 & 16) + (i439 | 16), objArr154);
                                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr154[0]);
                                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                                            g("꿜꾯䐽謥ꐛ\ud88f䯠砋⻠", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr155);
                                            cls.getMethod((java.lang.String) objArr155[0], null).invoke(newInstance, null);
                                            java.lang.Object[] objArr156 = {null, new int[1], new int[]{0}, new int[]{0}};
                                            int uptimeMillis9 = (int) android.os.SystemClock.uptimeMillis();
                                            int i440 = -(-((((~(2399511 | uptimeMillis9)) | (-1617952728)) * 305) + 1253457024 + (((~((~uptimeMillis9) | 2399511)) | (-1615818449)) * 305)));
                                            int i441 = (i440 & 1175161750) + (i440 | 1175161750);
                                            int i442 = i441 << 13;
                                            int i443 = (~(i442 & i441)) & (i442 | i441);
                                            int i444 = i443 >>> 17;
                                            int i445 = (i443 & (~i444)) | ((~i443) & i444);
                                            ((int[]) objArr156[1])[0] = i445 ^ (i445 << 5);
                                            return objArr156;
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause3 = th6.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th6;
                                        }
                                    }
                                }
                                java.lang.Object d37 = com.facetec.sdk.al.d(33831608);
                                if (d37 == null) {
                                    char size4 = (char) (44824 - android.view.View.MeasureSpec.getSize(0));
                                    int resolveSize3 = android.view.View.resolveSize(0, 0);
                                    int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                    byte b70 = (byte) (-1);
                                    byte b71 = (byte) (b70 + 1);
                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                    f(b70, b71, b71, objArr157);
                                    d37 = com.facetec.sdk.al.c(size4, resolveSize3 + 685, 22 - packedPositionChild2, -1511309248, false, (java.lang.String) objArr157[0], new java.lang.Class[0]);
                                }
                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) d37).invoke(null, null)).longValue();
                                long j157 = 895065741;
                                long nextInt21 = new java.util.Random().nextInt(1371401737);
                                long j158 = 859;
                                long j159 = nextInt21 ^ j2;
                                long j160 = longValue26 ^ j2;
                                long j161 = (((((860 * j157) + (longValue26 * (-858))) + ((-859) * (j157 | nextInt21))) + ((((j159 | j157) ^ j2) | ((((j157 ^ j2) | j160) | nextInt21) ^ j2)) * j158)) + (j158 * (((j160 | j157) ^ j2) | ((j160 | j159) ^ j2)))) - 1126850595;
                                int uptimeMillis10 = (int) android.os.SystemClock.uptimeMillis();
                                int i446 = ((int) (j161 >> 32)) & ((((~((~uptimeMillis10) | (-911414654))) | 872551509) * 529) + 1520786966 + (((~(uptimeMillis10 | (-911414654))) | 1946326231) * 529));
                                int myUid8 = android.os.Process.myUid();
                                int i447 = ~myUid8;
                                int i448 = ~(myUid8 | (-1655734315));
                                int i449 = ((int) j161) & ((((~((-223243221) | i447)) | 218507904 | i448) * (-502)) + 879558997 + ((i448 | (~(i447 | (-4735317)))) * 502));
                                int i450 = ((i446 ^ i449) | (i446 & i449)) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                                if (i450 != 0) {
                                    i = (c + 47) % 128;
                                    objArr = new java.lang.Object[]{null, new int[1], new int[]{i450}, new int[]{0}};
                                    int i451 = ((((~((-896232985) | r1)) | 721984975) * (-366)) - 1711980713) + (((~(android.os.Process.myPid() | (-342057489))) | 167809479) * 366);
                                    int i452 = ((i451 | 16) << 1) - (i451 ^ 16);
                                    int i453 = (i452 ^ 1175161750) + ((i452 & 1175161750) << 1);
                                    int i454 = i453 << 13;
                                    int i455 = (~(i454 & i453)) & (i454 | i453);
                                    int i456 = i455 >>> 17;
                                    int i457 = (~(i455 & i456)) & (i455 | i456);
                                    int i458 = i457 << 5;
                                    int[] iArr2 = (int[]) objArr[1];
                                    int i459 = (~(i457 & i458)) & (i457 | i458);
                                    i10 = 0;
                                    iArr2[0] = i459;
                                } else {
                                    java.lang.Object d38 = com.facetec.sdk.al.d(39533378);
                                    if (d38 == null) {
                                        char c30 = (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                        int mode5 = android.view.View.MeasureSpec.getMode(0);
                                        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                                        byte b72 = (byte) (-1);
                                        byte b73 = (byte) (b72 + 1);
                                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                                        f(b72, b73, b73, objArr158);
                                        d38 = com.facetec.sdk.al.c(c30, mode5 + 2222, 25 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), -1514913350, false, (java.lang.String) objArr158[0], new java.lang.Class[0]);
                                    }
                                    long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) d38).invoke(null, null)).longValue();
                                    long j162 = 1817868986;
                                    int myTid9 = android.os.Process.myTid();
                                    long j163 = -500;
                                    long j164 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                    long j165 = longValue27 ^ j2;
                                    long j166 = j162 ^ j2;
                                    long j167 = myTid9;
                                    long j168 = (((((j163 * j162) + (j163 * longValue27)) + ((((j162 | j165) ^ j2) | (((j166 | longValue27) | j167) ^ j2)) * j164)) + (1002 * ((j166 | j165) ^ j2))) + (j164 * ((longValue27 | ((j167 ^ j2) | j166)) ^ j2))) - 2057473409;
                                    int elapsedCpuTime7 = (int) android.os.Process.getElapsedCpuTime();
                                    int i460 = ~((-1101135877) | elapsedCpuTime7);
                                    int i461 = ((int) (j168 >> 32)) & (((i460 | 18512) * (-476)) + 1291371258 + (i460 * 952) + ((~((~elapsedCpuTime7) | (-1101135877))) * 476));
                                    int nextInt22 = new java.util.Random().nextInt();
                                    int i462 = ~nextInt22;
                                    int i463 = ((int) j168) & ((((~((-2025198283) | nextInt22)) | (~(2042599371 | i462))) * (-406)) + 1744642111 + ((~((-1210056769) | i462)) * (-406)) + (((~(nextInt22 | (-832542604))) | (~(i462 | 2025198282))) * 406));
                                    if (((i463 ^ i461) | (i461 & i463)) != 0) {
                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, new int[]{0}};
                                        int i464 = -(-(((((-1077986195) | r1) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 936472609) + (((~((~android.os.Process.myTid()) | 506144845)) | (-1550044120)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 16));
                                        int i465 = (i464 & 1175161750) + (i464 | 1175161750);
                                        int i466 = (i465 << 13) ^ i465;
                                        int i467 = i466 ^ (i466 >>> 17);
                                        int i468 = i467 << 5;
                                        int[] iArr3 = (int[]) objArr[1];
                                        int i469 = (i467 & (~i468)) | ((~i467) & i468);
                                        i10 = 0;
                                        iArr3[0] = i469;
                                    } else {
                                        java.lang.Object d39 = com.facetec.sdk.al.d(39530495);
                                        if (d39 == null) {
                                            char gidForName2 = (char) ((-1) - android.os.Process.getGidForName(str68));
                                            int alpha = android.graphics.Color.alpha(0);
                                            int red4 = android.graphics.Color.red(0);
                                            byte b74 = (byte) (-1);
                                            byte b75 = (byte) (b74 + 1);
                                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                                            f(b74, b75, (byte) (b75 + 3), objArr159);
                                            d39 = com.facetec.sdk.al.c(gidForName2, alpha + 2222, red4 + 24, -1514908409, false, (java.lang.String) objArr159[0], new java.lang.Class[0]);
                                        }
                                        long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) d39).invoke(null, null)).longValue();
                                        long j169 = -1771517051;
                                        int nextInt23 = new java.util.Random().nextInt(735311219);
                                        long j170 = -209;
                                        long j171 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                        long j172 = j169 ^ j2;
                                        long j173 = longValue28 ^ j2;
                                        long j174 = nextInt23;
                                        long j175 = j174 ^ j2;
                                        long j176 = (((((j170 * j169) + (j170 * longValue28)) + (((j172 | j173) ^ j2) * j171)) + ((((j173 | j175) ^ j2) | ((j172 | j174) ^ j2)) * j171)) + (j171 * (((longValue28 | (j172 | j175)) ^ j2) | (((j169 | j173) | j174) ^ j2)))) - 171890411;
                                        int elapsedRealtime9 = (int) android.os.SystemClock.elapsedRealtime();
                                        int i470 = ~(546289946 | elapsedRealtime9);
                                        if (((((int) j176) & ((((((~r2) | 1342222486) * (-828)) - 1754753727) + (((~((int) java.lang.Runtime.getRuntime().freeMemory())) | 1515518399) * (-828))) - 718784768)) | (((int) (j176 >> 32)) & ((((~((~elapsedRealtime9) | 546289946)) | (-1992277984)) * (-245)) + 109972554 + (i470 * (-245)) + ((i470 | 1983516357) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0) {
                                            int i471 = i;
                                            c = ((i471 & 77) + (i471 | 77)) % 128;
                                            objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, new int[]{0}};
                                            int i472 = ~((~new java.util.Random().nextInt(717716666)) | 1474955588);
                                            int i473 = -(-(((1465911620 | i472) * (-970)) + 1735600015 + ((i472 | 9043968) * 970) + 16));
                                            int i474 = ((i473 | 1175161750) << 1) - (i473 ^ 1175161750);
                                            int i475 = i474 << 13;
                                            int i476 = ((~i475) & i474) | ((~i474) & i475);
                                            int i477 = i476 >>> 17;
                                            int i478 = (~(i476 & i477)) & (i476 | i477);
                                            i10 = 0;
                                            ((int[]) objArr[1])[0] = i478 ^ (i478 << 5);
                                        } else {
                                            java.lang.Object d40 = com.facetec.sdk.al.d(589612749);
                                            if (d40 == null) {
                                                str7 = str68;
                                                char capsMode2 = (char) android.text.TextUtils.getCapsMode(str7, 0, 0);
                                                int offsetBefore3 = android.text.TextUtils.getOffsetBefore(str7, 0);
                                                double convertQuartSecToDecDegrees3 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                byte b76 = (byte) (-1);
                                                byte b77 = (byte) (b76 + 1);
                                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                f(b76, b77, b77, objArr160);
                                                d40 = com.facetec.sdk.al.c(capsMode2, offsetBefore3 + 2174, 24 - (convertQuartSecToDecDegrees3 > 0.0d ? 1 : (convertQuartSecToDecDegrees3 == 0.0d ? 0 : -1)), -2067022795, false, (java.lang.String) objArr160[0], new java.lang.Class[0]);
                                            } else {
                                                str7 = str68;
                                            }
                                            long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) d40).invoke(null, null)).longValue();
                                            long j177 = 904521250;
                                            long j178 = -754;
                                            long j179 = j177 ^ j2;
                                            long j180 = j179 | longValue29;
                                            str68 = str7;
                                            long uptimeMillis11 = (int) android.os.SystemClock.uptimeMillis();
                                            long j181 = uptimeMillis11 ^ j2;
                                            long j182 = (755 * j177) + ((-753) * longValue29) + (((j180 ^ j2) | ((j179 | uptimeMillis11) ^ j2) | ((longValue29 | uptimeMillis11) ^ j2)) * j178) + (j178 * (((j180 | uptimeMillis11) ^ j2) | ((longValue29 | (j181 | j177)) ^ j2))) + (754 * (j181 | j179)) + 78647779;
                                            int freeMemory10 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                            int nextInt24 = new java.util.Random().nextInt(1708162951);
                                            if (((((int) (j182 >> 32)) & ((((~((~freeMemory10) | (-1180148590))) | 106078765) * 446) + 384374654 + (((~(freeMemory10 | (-1074069825))) | 150999056) * 446) + 66488934)) | (((((((~((-744394753) | nextInt24)) | 675971072) | (~((-692831658) | nextInt24))) * (-744)) - 1587633331) + (((~nextInt24) | (-761255338)) * 744) + ((nextInt24 | (-675971073)) * 744)) & ((int) j182))) != 0) {
                                                objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                int elapsedRealtime10 = (int) android.os.SystemClock.elapsedRealtime();
                                                int i479 = 1175161749 - (~((((((~((-664598978) | r3)) | (~((-953618983) | elapsedRealtime10))) * (-370)) - 936558651) + ((((~(elapsedRealtime10 | (-664598978))) | (~((~elapsedRealtime10) | (-953618983)))) | (-1071643624)) * (-370))) - 1371149632));
                                                int i480 = i479 << 13;
                                                int i481 = (~(i480 & i479)) & (i480 | i479);
                                                int i482 = i481 ^ (i481 >>> 17);
                                                int i483 = i482 << 5;
                                                int[] iArr4 = (int[]) objArr[1];
                                                int i484 = (i482 & (~i483)) | ((~i482) & i483);
                                                i10 = 0;
                                                iArr4[0] = i484;
                                            } else {
                                                objArr = new java.lang.Object[]{null, new int[1], new int[]{0}, new int[]{0}};
                                                int maxMemory10 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                int i485 = (((~((-461147102) | maxMemory10)) | 453512149) * (-283)) + 1113137246 + ((~(maxMemory10 | (-7634953))) * 283) + 1175161750;
                                                int i486 = i485 << 13;
                                                int i487 = ((~i486) & i485) | ((~i485) & i486);
                                                int i488 = i487 >>> 17;
                                                int i489 = (i487 & (~i488)) | ((~i487) & i488);
                                                int i490 = i489 << 5;
                                                int[] iArr5 = (int[]) objArr[1];
                                                int i491 = (i489 & (~i490)) | ((~i489) & i490);
                                                i10 = 0;
                                                iArr5[0] = i491;
                                            }
                                        }
                                    }
                                }
                                if (((int[]) objArr[3])[i10] == ((int[]) objArr[2])[i10]) {
                                }
                            }
                            java.lang.Object[] objArr161 = {(java.lang.String) objArr2[0]};
                            java.lang.Object d41 = com.facetec.sdk.al.d(1590238701);
                            if (d41 == null) {
                                try {
                                    char c31 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
                                    int alpha2 = android.graphics.Color.alpha(0);
                                    byte b78 = (byte) (-1);
                                    byte b79 = (byte) (b78 + 1);
                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                    f(b78, b79, b79, objArr162);
                                    d41 = com.facetec.sdk.al.c(c31, 2078 - (maxKeyCode2 >> 16), 24 - alpha2, -114923755, false, (java.lang.String) objArr162[0], new java.lang.Class[]{java.lang.String.class});
                                } catch (java.lang.Throwable th7) {
                                    th2 = th7;
                                    java.lang.Throwable cause4 = th2.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th2;
                                }
                            }
                            java.lang.Object invoke7 = ((java.lang.reflect.Method) d41).invoke(null, objArr161);
                            if (invoke7 != null) {
                                int i492 = c;
                                i = (((i492 | 119) << 1) - (i492 ^ 119)) % 128;
                                int i493 = -android.view.View.combineMeasuredStates(0, 0);
                                char c32 = (char) ((i493 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_BGR_THUMBNAIL) + (i493 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_BGR_THUMBNAIL));
                                int i494 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i495 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                h(c32, 215 - (~i494), (i495 ^ 8) + ((i495 & 8) << 1), objArr163);
                                if (invoke7.equals((java.lang.String) objArr163[0])) {
                                    str55 = str6;
                                    int indexOf16 = android.text.TextUtils.indexOf(str55, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    int c33 = com.facetec.sdk.fp.a.c();
                                    int i496 = (indexOf16 * 868) + 868;
                                    int i497 = ~indexOf16;
                                    int i498 = ~c33;
                                    int i499 = ~((i497 ^ i498) | (i497 & i498));
                                    int i500 = ~(i498 | (-2));
                                    int i501 = ((i499 ^ i500) | (i500 & i499)) * (-867);
                                    int i502 = (i497 ^ (-2)) | (i497 & (-2));
                                    int i503 = ~i502;
                                    int i504 = ~((i497 ^ c33) | (i497 & c33));
                                    int i505 = (i496 & i501) + (i496 | i501) + (((i503 & i504) | (i503 ^ i504) | (~((c33 ^ (-2)) | (c33 & (-2))))) * (-1734));
                                    int i506 = ~((i502 & i498) | (i498 ^ i502));
                                    int i507 = (i497 & 1) | (i497 ^ 1);
                                    int i508 = ~((i507 ^ c33) | (i507 & c33));
                                    int i509 = (indexOf16 ^ (-2)) | (indexOf16 & (-2));
                                    int i510 = -(-(((~((c33 ^ i509) | (i509 & c33))) | (i506 ^ i508) | (i506 & i508)) * 867));
                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                    g("ﵭﴝ䀃２ꀴ扚㿄싟籌⇪뺊䁊ﾎꊘ㱕쇲织⑆묁䛠\uf812ꔐ㪵쐯筠⛊롭", (i505 & i510) + (i510 | i505), objArr164);
                                    try {
                                        java.lang.Object[] objArr165 = {(java.lang.String) objArr164[0]};
                                        java.lang.Object d42 = com.facetec.sdk.al.d(1590238701);
                                        if (d42 == null) {
                                            char c34 = (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                            int mode6 = android.view.View.MeasureSpec.getMode(0);
                                            int lastIndexOf5 = android.text.TextUtils.lastIndexOf(str55, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            byte b80 = (byte) (-1);
                                            byte b81 = (byte) (b80 + 1);
                                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                                            f(b80, b81, b81, objArr166);
                                            d42 = com.facetec.sdk.al.c(c34, mode6 + 2078, lastIndexOf5 + 25, -114923755, false, (java.lang.String) objArr166[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.String str72 = (java.lang.String) ((java.lang.reflect.Method) d42).invoke(null, objArr165);
                                        if (str72 != null && (parseInt = java.lang.Integer.parseInt(str72)) != 0) {
                                            i7 = (parseInt ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) + ((parseInt & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1);
                                            if (i7 == 0) {
                                            }
                                        }
                                        i7 = 0;
                                        if (i7 == 0) {
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        java.lang.Throwable cause5 = th8.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th8;
                                    }
                                }
                            }
                            str55 = str6;
                            i7 = 0;
                            if (i7 == 0) {
                            }
                        } catch (java.lang.Throwable th9) {
                            th2 = th9;
                        }
                        objArr2 = new java.lang.Object[1];
                        g("枎柧鸓㎻縯샍\uf376恏\ue6e8\ufffa爡\ue290攰粂\uf0fa挔\ue432縉瞢\ue46e拁笏", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr2);
                    } else {
                        i89 = (i89 ^ 1) + ((i89 & 1) << 1);
                        j = j;
                        str = str;
                        i90 = 2;
                        i87 = 0;
                    }
                }
            }
            str3 = str;
            j2 = j;
            java.lang.Object[] objArr762 = new java.lang.Object[1];
            g("׳ל犤냭銅眰瀰ힵ蒔ፘ\uf172唡ܐ連玵퓟虅\u16fb\uf4e9发¶鞸畏텉菩ᑽ\uf784", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr762);
            java.lang.Object[] objArr772 = {(java.lang.String) objArr762[0]};
            d3 = com.facetec.sdk.al.d(-864328554);
            if (d3 == null) {
            }
            long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr772)).longValue();
            long j562 = 741925742;
            int nextInt62 = new java.util.Random().nextInt();
            long j572 = j562 ^ j2;
            long j582 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
            java.lang.String str482 = str4;
            long j592 = nextInt62;
            long j602 = ((-381) * j562) + (192 * longValue102) + ((-191) * j572) + ((j562 | ((longValue102 | j592) ^ j2)) * j582) + (j582 * (((longValue102 | j572) ^ j2) | (((j592 ^ j2) | longValue102) ^ j2))) + 306272678;
            int nextInt72 = new java.util.Random().nextInt();
            int i1062 = ~nextInt72;
            int uptimeMillis32 = (int) android.os.SystemClock.uptimeMillis();
            int i1072 = ~uptimeMillis32;
            j3 = (((int) (j602 >> 32)) & ((((2030625080 | nextInt72) * (-50)) - 505572266) + (((~(nextInt72 | (-1476419633))) | (~(2069818301 | i1062))) * 50) + (((~(2030625080 | i1062)) | (~(i1062 | 593398669)) | (-2069818302)) * 50))) | ((((1667456447 | uptimeMillis32) * (-859)) + 431636200 + (((~((-1113738391) | uptimeMillis32)) | (~(1667456447 | i1072))) * 859) + (((~((-1190284439) | i1072)) | 76546048) * 859)) & ((int) j602));
            int size32 = android.view.View.MeasureSpec.getSize(0);
            int packedPositionChild3 = android.widget.ExpandableListView.getPackedPositionChild(0L);
            int i1082 = -android.text.TextUtils.getOffsetBefore(str482, 0);
            java.lang.Object[] objArr792 = new java.lang.Object[1];
            h((char) ((62991 ^ size32) + ((size32 & 62991) << 1)), (packedPositionChild3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) + ((packedPositionChild3 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) << 1), ((i1082 | 17) << 1) - (i1082 ^ 17), objArr792);
            java.lang.Object[] objArr802 = {(java.lang.String) objArr792[0]};
            d4 = com.facetec.sdk.al.d(-864328554);
            if (d4 == null) {
            }
            long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr802)).longValue();
            long j612 = -813145404;
            long j622 = j612 ^ j2;
            long myTid32 = android.os.Process.myTid();
            long j632 = myTid32 ^ j2;
            long j642 = ((-563) * j612) + (565 * longValue112) + ((-564) * (j622 | (((longValue112 ^ j2) | j632) ^ j2) | ((longValue112 | myTid32) ^ j2))) + (1128 * ((myTid32 | (j622 | longValue112)) ^ j2)) + (564 * (((longValue112 | j612) ^ j2) | ((j622 | j632) ^ j2))) + 1861343824;
            int elapsedCpuTime32 = (int) android.os.Process.getElapsedCpuTime();
            int i1092 = ((int) (j642 >> 32)) & ((((~((~elapsedCpuTime32) | (-554324033))) | (~((-1150659721) | elapsedCpuTime32))) * (-302)) + 705941106 + ((~((-554324033) | elapsedCpuTime32)) * (-604)) + (((~(elapsedCpuTime32 | (-1704983753))) | 2097412) * 302));
            int elapsedRealtime52 = (int) android.os.SystemClock.elapsedRealtime();
            int i1102 = ~elapsedRealtime52;
            int i1112 = ((int) j642) & ((((~((-498774680) | i1102)) | (-938451731)) * (-1042)) + 1419264002 + (((-498774680) | elapsedRealtime52) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(elapsedRealtime52 | 938451730)) | (-1073722264) | (~(i1102 | (-363504147)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
            long j652 = (i1092 ^ i1112) | (i1092 & i1112);
            if (j3 <= 0) {
            }
            java.lang.Object[] objArr832 = new java.lang.Object[1];
            g("׳ל犤냭銅眰瀰ힵ蒔ፘ\uf172唡ܐ連玵퓟虅\u16fb\uf4e9发¶鞸畏텉菩ᑽ\uf784", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr832);
            java.lang.Object[] objArr842 = {(java.lang.String) objArr832[0]};
            d5 = com.facetec.sdk.al.d(-864328554);
            if (d5 == null) {
            }
            long longValue122 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr842)).longValue();
            long j662 = 830812392;
            long j672 = 713;
            long j682 = -712;
            long j692 = longValue122 ^ j2;
            long freeMemory42 = (int) java.lang.Runtime.getRuntime().freeMemory();
            long j702 = freeMemory42 ^ j2;
            long j712 = (j702 | j662) ^ j2;
            long j722 = ((-711) * j662) + (j672 * longValue122) + ((((j692 | j662) ^ j2) | j712) * j682) + (((((j692 | j702) | j662) ^ j2) | (((longValue122 | j662) | freeMemory42) ^ j2)) * j682) + (712 * (j692 | j712)) + 217386028;
            int maxMemory62 = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i1262 = ~maxMemory62;
            int i1272 = ((int) (j722 >> 32)) & ((((~((-353342907) | maxMemory62)) | (-1083883505)) * (-318)) + 1053550230 + (((~((-1083883505) | maxMemory62)) | (~(1436532730 | i1262))) * 318) + (((~(maxMemory62 | 1436532730)) | (~(i1262 | (-1083189825)))) * 318));
            int i1282 = ~((int) android.os.SystemClock.elapsedRealtime());
            int i1292 = ((int) j722) & ((((~((-2100107328) | i1282)) | (-757633559)) * (-983)) + 1100580356 + (((~(i1282 | (-757633559))) | 33280) * 983));
            j4 = (i1272 ^ i1292) | (i1272 & i1292);
            int i1302 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            java.lang.Object[] objArr862 = new java.lang.Object[1];
            g("⌺⌕䌨\uf0d7ꌞ䱿〖\uecff", ((i1302 | 1) << 1) - (i1302 ^ 1), objArr862);
            java.lang.Object[] objArr872 = {(java.lang.String) objArr862[0]};
            d6 = com.facetec.sdk.al.d(-864328554);
            if (d6 == null) {
            }
            long longValue132 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr872)).longValue();
            long j732 = -777527622;
            long j742 = ((j732 ^ j2) | longValue132) ^ j2;
            long nextInt82 = new java.util.Random().nextInt();
            long j752 = nextInt82 ^ j2;
            long j762 = 594;
            long j772 = longValue132 ^ j2;
            long j782 = (j752 | j732) ^ j2;
            long j792 = (595 * j732) + ((-1187) * longValue132) + ((-1188) * (j742 | ((j752 | longValue132) ^ j2))) + ((j742 | ((nextInt82 | j772) ^ j2) | j782) * j762) + (j762 * (((j772 | j752) ^ j2) | ((j772 | j732) ^ j2) | j782)) + 1825726042;
            int i1312 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i1322 = ~i1312;
            int i1332 = ((int) (j792 >> 32)) & ((((~(1862025061 | i1312)) | 285294730 | (~((-995715824) | i1312))) * (-754)) + 1075089950 + (((~(i1312 | (-285294731))) | (~((-710421094) | i1322))) * (-754)) + ((1862025061 | i1322) * 754));
            int i1342 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
            int i1352 = ((int) j792) & ((((-34676866) | i1342) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 697008989 + (((~(i1342 | 1411664236)) | (-34941318)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            long j802 = (i1332 ^ i1352) | (i1332 & i1352);
            if (j4 > 0) {
                i11 = c;
                i12 = (i11 & 53) + (i11 | 53);
                i = i12 % 128;
                if (i12 % 2 == 0) {
                    i = ((i11 ^ 21) + ((i11 & 21) << 1)) % 128;
                    java.lang.Object[] objArr892 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, new int[]{0}};
                    int i1362 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    int i1372 = ~i1362;
                    int i1382 = ((((~((-429489825) | i1362)) | (~(1188728135 | i1372))) * (-1808)) - 1833415121) + (((~((-9964545) | i1362)) | (~(1608253415 | i1372))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i1362 | (-1188728136))) | 419525280 | (~(i1372 | 429489824))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                    int c112 = com.facetec.sdk.fp.a.c();
                    int i1392 = 3087 - (~(i1382 * 193));
                    int i1402 = ~c112;
                    int i1412 = ~((i1382 & (-17)) | (i1382 ^ (-17)));
                    int i1422 = ((i1412 ^ i1402) | (i1412 & i1402)) * (-192);
                    int i1432 = (i1392 & i1422) + (i1392 | i1422);
                    int i1442 = ~i1382;
                    int i1452 = (i1442 ^ (-17)) | (i1442 & (-17));
                    int i1462 = ~i1452;
                    int i1472 = (i1442 & i1402) | (i1442 ^ i1402);
                    int i1482 = ~i1472;
                    int i1492 = ((i1482 ^ i1462) | (i1462 & i1482)) * (-384);
                    int i1502 = ((i1432 | i1492) << 1) - (i1492 ^ i1432);
                    int i1512 = (~(i1472 | 16)) | (~(i1452 | c112));
                    int i1522 = i1382 | 16;
                    int i1532 = ~((c112 ^ i1522) | (c112 & i1522));
                    int i1542 = -(-(((i1532 ^ i1512) | (i1532 & i1512)) * 192));
                    int i1552 = -(-(((i1502 | i1542) << 1) - (i1542 ^ i1502)));
                    int i1562 = (i1552 ^ 1175161750) + ((i1552 & 1175161750) << 1);
                    int i1572 = (i1562 << 13) ^ i1562;
                    int i1582 = i1572 ^ (i1572 >>> 17);
                    int i1592 = i1582 << 5;
                    ((int[]) objArr892[1])[0] = (i1582 & (~i1592)) | ((~i1582) & i1592);
                    return objArr892;
                }
                i = ((i11 ^ 21) + ((i11 & 21) << 1)) % 128;
                java.lang.Object[] objArr8922 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, new int[]{0}};
                int i13622 = (int) java.lang.Runtime.getRuntime().totalMemory();
                int i13722 = ~i13622;
                int i13822 = ((((~((-429489825) | i13622)) | (~(1188728135 | i13722))) * (-1808)) - 1833415121) + (((~((-9964545) | i13622)) | (~(1608253415 | i13722))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i13622 | (-1188728136))) | 419525280 | (~(i13722 | 429489824))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                int c1122 = com.facetec.sdk.fp.a.c();
                int i13922 = 3087 - (~(i13822 * 193));
                int i14022 = ~c1122;
                int i14122 = ~((i13822 & (-17)) | (i13822 ^ (-17)));
                int i14222 = ((i14122 ^ i14022) | (i14122 & i14022)) * (-192);
                int i14322 = (i13922 & i14222) + (i13922 | i14222);
                int i14422 = ~i13822;
                int i14522 = (i14422 ^ (-17)) | (i14422 & (-17));
                int i14622 = ~i14522;
                int i14722 = (i14422 & i14022) | (i14422 ^ i14022);
                int i14822 = ~i14722;
                int i14922 = ((i14822 ^ i14622) | (i14622 & i14822)) * (-384);
                int i15022 = ((i14322 | i14922) << 1) - (i14922 ^ i14322);
                int i15122 = (~(i14722 | 16)) | (~(i14522 | c1122));
                int i15222 = i13822 | 16;
                int i15322 = ~((c1122 ^ i15222) | (c1122 & i15222));
                int i15422 = -(-(((i15322 ^ i15122) | (i15322 & i15122)) * 192));
                int i15522 = -(-(((i15022 | i15422) << 1) - (i15422 ^ i15022)));
                int i15622 = (i15522 ^ 1175161750) + ((i15522 & 1175161750) << 1);
                int i15722 = (i15622 << 13) ^ i15622;
                int i15822 = i15722 ^ (i15722 >>> 17);
                int i15922 = i15822 << 5;
                ((int[]) objArr8922[1])[0] = (i15822 & (~i15922)) | ((~i15822) & i15922);
                return objArr8922;
                cause = th3.getCause();
                if (cause == null) {
                }
            }
            int i1602 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
            java.lang.Object[] objArr902 = new java.lang.Object[1];
            g("淃淬㡑\ue400\ud870\uf2b5ⓝ到\uecff妮ꖁ", (i1602 & 1) + (i1602 | 1), objArr902);
            java.lang.String str492 = (java.lang.String) objArr902[0];
            int i1612 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            char c122 = (char) ((~i1612) + (i1612 << 1));
            str5 = str482;
            int i1622 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int i1632 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            java.lang.Object[] objArr912 = new java.lang.Object[1];
            h(c122, 187 - (~i1622), (i1632 ^ 12) + ((i1632 & 12) << 1), objArr912);
            java.lang.String str502 = (java.lang.String) objArr912[0];
            java.lang.Object[] objArr922 = new java.lang.Object[1];
            g("䶡䶎줤쾷⤅뎇ཪጂ첝\ua8db踶醖佂⮤೪ၯ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr922);
            java.lang.String str512 = (java.lang.String) objArr922[0];
            char maximumDrawingCacheSize22 = (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38164);
            long uptimeMillis42 = android.os.SystemClock.uptimeMillis();
            int i1642 = -android.graphics.Color.alpha(0);
            int c132 = com.facetec.sdk.fp.a.c();
            int i1652 = (i1642 * (-574)) - 6888;
            int i1662 = ~c132;
            int i1672 = ~i1642;
            int i1682 = ~(i1672 | i1662);
            int i1692 = ~((c132 ^ (-13)) | (c132 & (-13)));
            int i1702 = ((i1682 ^ i1692) | (i1682 & i1692)) * 1150;
            int i1712 = ~((i1662 ^ 12) | (i1662 & 12));
            int i1722 = (((i1652 | i1702) << 1) - (i1652 ^ i1702)) + (((i1692 ^ i1712) | (i1712 & i1692)) * (-575));
            int i1732 = ~((c132 ^ i1672) | (i1672 & c132));
            int i1742 = ~((i1642 ^ i1662) | (i1642 & i1662));
            int i1752 = ((i1742 ^ i1732) | (i1732 & i1742)) * 575;
            java.lang.Object[] objArr932 = new java.lang.Object[1];
            h(maximumDrawingCacheSize22, (uptimeMillis42 > 0L ? 1 : (uptimeMillis42 == 0L ? 0 : -1)) + 199, (i1722 ^ i1752) + ((i1752 & i1722) << 1), objArr932);
            java.lang.String str522 = (java.lang.String) objArr932[0];
            java.lang.Object[] objArr942 = new java.lang.Object[1];
            g("卬千홣뱩㙇\uf527粨喿퉀랖ﷷ휶冞㓨缳", android.view.KeyEvent.keyCodeFromString(str5), objArr942);
            java.lang.String str532 = (java.lang.String) objArr942[0];
            java.lang.Object[] objArr952 = new java.lang.Object[1];
            g("넠넏룼\u1778壝鲧ힾ㰸〆", android.view.View.getDefaultSize(0, 0), objArr952);
            java.lang.String str542 = (java.lang.String) objArr952[0];
            int i1762 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int c142 = com.facetec.sdk.fp.a.c();
            int i1772 = i1762 * (-317);
            int i1782 = (4394544 ^ i1772) + ((i1772 & 4394544) << 1);
            int i1792 = ~i1762;
            int i1802 = ~c142;
            int i1812 = (i1802 ^ i1762) | (i1802 & i1762);
            int i1822 = ((~((i1812 ^ 13776) | (i1812 & 13776))) | (~((i1792 ^ (-13777)) | (i1792 & (-13777)) | c142))) * (-318);
            int i1832 = (i1782 ^ i1822) + ((i1782 & i1822) << 1);
            int i1842 = ~((i1762 ^ (-13777)) | (i1762 & (-13777)));
            int i1852 = ~(i1762 | c142);
            int i1862 = -(-(((i1852 ^ i1842) | (i1852 & i1842)) * (-318)));
            int i1872 = (i1832 & i1862) + (i1862 | i1832);
            int i1882 = ~((i1792 ^ c142) | (c142 & i1792));
            int i1892 = ((i1882 ^ (-13777)) | (i1882 & (-13777))) * 318;
            int i1902 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            java.lang.Object[] objArr962 = new java.lang.Object[1];
            h((char) (((i1872 | i1892) << 1) - (i1892 ^ i1872)), (i1902 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i1902 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr962);
            java.lang.String[] strArr42 = {str492, str502, str512, str522, str532, str542, (java.lang.String) objArr962[0]};
            i5 = 0;
            while (true) {
                if (i5 >= 7) {
                }
                int i1922 = ((i5 | (-12)) << 1) - (i5 ^ (-12));
                i5 = (i1922 & 13) + (i1922 | 13);
                str5 = str6;
            }
            if (i6 != 0) {
            }
        } else {
            str = "";
        }
        i4 = 0;
        char resolveSize22 = (char) android.view.View.resolveSize(i4, i4);
        int i4210 = -android.text.TextUtils.getOffsetBefore(str, i4);
        java.lang.Object[] objArr312 = new java.lang.Object[1];
        h(resolveSize22, ((i4210 | 67) << 1) - (i4210 ^ 67), 7 - (~(-(android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr312);
        java.lang.String str202 = (java.lang.String) objArr312[0];
        java.lang.Object[] objArr322 = new java.lang.Object[1];
        g("轚輻䦗רּꦷ좮㮜栱\u0e7c⡪", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr322);
        java.lang.String str212 = (java.lang.String) objArr322[0];
        java.lang.Object[] objArr332 = new java.lang.Object[1];
        g("椈楬힞䲟㞡ᜥ豎랠\ue825뙶ഗ", android.graphics.Color.blue(0), objArr332);
        java.lang.String str222 = (java.lang.String) objArr332[0];
        java.lang.Object[] objArr342 = new java.lang.Object[1];
        g("츪칍岪㙮벜爋\uf6a8튎伇㵂矴偐쳈", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr342);
        java.lang.String str232 = (java.lang.String) objArr342[0];
        java.lang.Object[] objArr352 = new java.lang.Object[1];
        g("㿼㾕蹁\ue0f0湷겪‸ి뻘\uefb2", android.view.View.MeasureSpec.getMode(0), objArr352);
        java.lang.String str242 = (java.lang.String) objArr352[0];
        java.lang.Object[] objArr362 = new java.lang.Object[1];
        g("꽀꼩\ue1cf鑟ǳ﹛咒廙⸥耱헖\udc07궥͊坅嶯⳻", android.view.View.combineMeasuredStates(0, 0), objArr362);
        java.lang.String str252 = (java.lang.String) objArr362[0];
        char combineMeasuredStates3 = (char) android.view.View.combineMeasuredStates(0, 0);
        int scrollBarSize6 = android.view.ViewConfiguration.getScrollBarSize();
        int i4310 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        java.lang.Object[] objArr372 = new java.lang.Object[1];
        h(combineMeasuredStates3, (scrollBarSize6 >> 8) + 75, ((i4310 | 5) << 1) - (i4310 ^ 5), objArr372);
        java.lang.String str262 = (java.lang.String) objArr372[0];
        char packedPositionType3 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
        int scrollBarSize22 = android.view.ViewConfiguration.getScrollBarSize();
        int indexOf72 = android.text.TextUtils.indexOf(str, str, 0, 0);
        java.lang.Object[] objArr382 = new java.lang.Object[1];
        h(packedPositionType3, 80 - (scrollBarSize22 >> 8), (indexOf72 & 6) + (indexOf72 | 6), objArr382);
        java.lang.String str272 = (java.lang.String) objArr382[0];
        java.lang.Object[] objArr392 = new java.lang.Object[1];
        g("嫤媍ࣼⶤ\ue8d9퇕", android.graphics.Color.blue(0), objArr392);
        java.lang.String str282 = (java.lang.String) objArr392[0];
        int i4410 = -android.graphics.Color.green(0);
        int c35 = com.facetec.sdk.fp.a.c();
        int i4510 = i4410 * (-159);
        int i4610 = ~i4410;
        int i4710 = ((((-8117745) | i4510) << 1) - (i4510 ^ (-8117745))) + (((51055 & i4610) | (i4610 ^ 51055)) * 160);
        int i4810 = ~c35;
        int i4910 = -(-(((~(i4810 | i4410)) | (~((51055 ^ i4410) | (51055 & i4410)))) * (-160)));
        char c42 = (char) (((((i4710 | i4910) << 1) - (i4910 ^ i4710)) - (~(-(-((i4410 | (~(i4810 | (-51056)))) * 160))))) - 1);
        int i5010 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        java.lang.Object[] objArr402 = new java.lang.Object[1];
        h(c42, ((i5010 | 87) << 1) - (i5010 ^ 87), 15 - (~android.text.TextUtils.getOffsetBefore(str, 0)), objArr402);
        java.lang.String str292 = (java.lang.String) objArr402[0];
        java.lang.Object[] objArr412 = new java.lang.Object[1];
        g("䲠䳌헥ﳗ㗘銥㰔㈧춉되뵟낵乂㝤", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr412);
        java.lang.String str302 = (java.lang.String) objArr412[0];
        java.lang.Object[] objArr422 = new java.lang.Object[1];
        g("쿞쾮뾤⫛径潊\uea10쿟令\ude5f歙䴟", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr422);
        java.lang.String str312 = (java.lang.String) objArr422[0];
        java.lang.Object[] objArr432 = new java.lang.Object[1];
        g("㖦㗖㣖ꛤ\ud8f6✺是螪뒍夣\ue764ը㝓\uda57斤蓘", android.graphics.Color.argb(0, 0, 0, 0), objArr432);
        java.lang.String str322 = (java.lang.String) objArr432[0];
        char jumpTapTimeout2 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
        int i512 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        java.lang.Object[] objArr442 = new java.lang.Object[1];
        h(jumpTapTimeout2, (i512 ^ 102) + ((i512 & 102) << 1), 12 - (~(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr442);
        java.lang.String str332 = (java.lang.String) objArr442[0];
        char windowTouchSlop3 = (char) (47283 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        int i522 = -(-(android.os.Process.myPid() >> 22));
        int i532 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
        java.lang.Object[] objArr452 = new java.lang.Object[1];
        h(windowTouchSlop3, (i522 & 116) + (i522 | 116), (i532 ^ 7) + ((i532 & 7) << 1), objArr452);
        java.lang.String str342 = (java.lang.String) objArr452[0];
        java.lang.Object[] objArr462 = new java.lang.Object[1];
        g("ǋƸ斬탣薖櫺ဨ쩻胮ї酿", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr462);
        java.lang.String str352 = (java.lang.String) objArr462[0];
        java.lang.Object[] objArr472 = new java.lang.Object[1];
        g("\ue142\ue131븕ࢷ帶瘞졿횁恾\udfea䥨", android.text.TextUtils.indexOf(str, str, 0), objArr472);
        java.lang.String str362 = (java.lang.String) objArr472[0];
        java.lang.Object[] objArr482 = new java.lang.Object[1];
        g("ЙѪຽ䠧\uee9c㪺", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr482);
        java.lang.String str372 = (java.lang.String) objArr482[0];
        java.lang.Object[] objArr492 = new java.lang.Object[1];
        g("峎岽㧤밼\ud9c2垷糹\uf733\uddf2堡ﶧ痠帪\udb6e罗\uf45d\udf79嶭\uf82b猘妉\udcf3禖\uf1d5", android.text.TextUtils.getOffsetBefore(str, 0), objArr492);
        java.lang.String str382 = (java.lang.String) objArr492[0];
        java.lang.Object[] objArr502 = new java.lang.Object[1];
        g("രൃ껀䊣仦\uf74c艵埛谛켿", android.view.Gravity.getAbsoluteGravity(0, 0), objArr502);
        java.lang.String str392 = (java.lang.String) objArr502[0];
        int axisFromString3 = android.view.MotionEvent.axisFromString(str);
        java.lang.Object[] objArr512 = new java.lang.Object[1];
        g("蚮蛝\ue0f6꼚Ñ㹤", ((axisFromString3 | 1) << 1) - (axisFromString3 ^ 1), objArr512);
        java.lang.String str402 = (java.lang.String) objArr512[0];
        char c52 = (char) (18174 - (~android.graphics.Color.red(0)));
        int offsetBefore4 = android.text.TextUtils.getOffsetBefore(str, 0);
        int i542 = -android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr522 = new java.lang.Object[1];
        h(c52, offsetBefore4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (i542 & 16) + (i542 | 16), objArr522);
        java.lang.String str412 = (java.lang.String) objArr522[0];
        int i552 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        int i562 = -(-android.graphics.Color.alpha(0));
        int size5 = android.view.View.MeasureSpec.getSize(0);
        int i572 = (size5 * 765) - 13743;
        int i582 = ~com.facetec.sdk.fp.a.c();
        int i592 = ~((i582 ^ size5) | (i582 & size5));
        int i602 = -(-(((i592 & 9) | (i592 ^ 9)) * 764));
        int i612 = ~size5;
        int i622 = ~((i612 ^ 9) | (i612 & 9));
        int i632 = ~((i582 ^ 9) | (i582 & 9));
        int i642 = -(-(((i632 ^ i622) | (i632 & i622)) * (-1528)));
        int i652 = ~(i612 | 9);
        int i662 = ~((size5 & (-10)) | (size5 ^ (-10)));
        int i672 = (i662 ^ i652) | (i652 & i662);
        java.lang.Object[] objArr532 = new java.lang.Object[1];
        h((char) (((46964 | i552) << 1) - (i552 ^ 46964)), ((i562 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) << 1) - (i562 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE), ((((i572 & i602) + (i572 | i602)) - (~i642)) - 1) + (((i592 & i672) | (i672 ^ i592)) * 764), objArr532);
        java.lang.String str422 = (java.lang.String) objArr532[0];
        char threadPriority3 = (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 58879);
        int i682 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
        int i692 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
        java.lang.Object[] objArr542 = new java.lang.Object[1];
        h(threadPriority3, (i682 & 148) + (i682 | 148), ((i692 | 9) << 1) - (i692 ^ 9), objArr542);
        java.lang.String str432 = (java.lang.String) objArr542[0];
        java.lang.Object[] objArr552 = new java.lang.Object[1];
        g("鯾鮊䦷肤ꦗ䡛䁡\ue8ce\u1ad3⡟섧樐餚ꬰ䎦", android.view.View.getDefaultSize(0, 0), objArr552);
        java.lang.String str442 = (java.lang.String) objArr552[0];
        int i702 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr562 = new java.lang.Object[1];
        g("\uda20\uda55斮\uf07f薒ᇫガ녴嬆ѐ뇌㎼\ud8de蜪㌤", (~i702) + (i702 << 1), objArr562);
        java.lang.String str452 = (java.lang.String) objArr562[0];
        java.lang.Object[] objArr572 = new java.lang.Object[1];
        g("쑼쐉睴忳靈䴝鼠\ued82䕚ᚊṀ潑욉闱鲘\ueef2䟊ጸᯠ", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr572);
        java.lang.String str462 = (java.lang.String) objArr572[0];
        char pressedStateDuration3 = (char) (27605 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
        int i712 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
        int i722 = -android.view.KeyEvent.keyCodeFromString(str);
        java.lang.Object[] objArr582 = new java.lang.Object[1];
        h(pressedStateDuration3, ((i712 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) << 1) - (i712 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE), (i722 & 14) + (i722 | 14), objArr582);
        java.lang.String[] strArr22 = {str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, str332, str342, str352, str362, str372, str382, str392, str402, str412, str422, str432, str442, str452, str462, (java.lang.String) objArr582[0]};
        int i732 = -(-android.os.Process.getGidForName(str));
        java.lang.Object[] objArr592 = new java.lang.Object[1];
        g("灥瀗휰☛㜍뉭\ue691ዳ\uf14c뛘枓逤犔㖠\ue54a", (i732 & 1) + (i732 | 1), objArr592);
        java.lang.Object[] objArr602 = {(java.lang.String) objArr592[0]};
        d2 = com.facetec.sdk.al.d(1590238701);
        if (d2 == null) {
        }
        str2 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr602);
        if (str2 != null) {
        }
        str3 = str;
        j2 = j;
        java.lang.Object[] objArr7622 = new java.lang.Object[1];
        g("׳ל犤냭銅眰瀰ힵ蒔ፘ\uf172唡ܐ連玵퓟虅\u16fb\uf4e9发¶鞸畏텉菩ᑽ\uf784", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr7622);
        java.lang.Object[] objArr7722 = {(java.lang.String) objArr7622[0]};
        d3 = com.facetec.sdk.al.d(-864328554);
        if (d3 == null) {
        }
        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr7722)).longValue();
        long j5622 = 741925742;
        int nextInt622 = new java.util.Random().nextInt();
        long j5722 = j5622 ^ j2;
        long j5822 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
        java.lang.String str4822 = str4;
        long j5922 = nextInt622;
        long j6022 = ((-381) * j5622) + (192 * longValue1022) + ((-191) * j5722) + ((j5622 | ((longValue1022 | j5922) ^ j2)) * j5822) + (j5822 * (((longValue1022 | j5722) ^ j2) | (((j5922 ^ j2) | longValue1022) ^ j2))) + 306272678;
        int nextInt722 = new java.util.Random().nextInt();
        int i10622 = ~nextInt722;
        int uptimeMillis322 = (int) android.os.SystemClock.uptimeMillis();
        int i10722 = ~uptimeMillis322;
        j3 = (((int) (j6022 >> 32)) & ((((2030625080 | nextInt722) * (-50)) - 505572266) + (((~(nextInt722 | (-1476419633))) | (~(2069818301 | i10622))) * 50) + (((~(2030625080 | i10622)) | (~(i10622 | 593398669)) | (-2069818302)) * 50))) | ((((1667456447 | uptimeMillis322) * (-859)) + 431636200 + (((~((-1113738391) | uptimeMillis322)) | (~(1667456447 | i10722))) * 859) + (((~((-1190284439) | i10722)) | 76546048) * 859)) & ((int) j6022));
        int size322 = android.view.View.MeasureSpec.getSize(0);
        int packedPositionChild32 = android.widget.ExpandableListView.getPackedPositionChild(0L);
        int i10822 = -android.text.TextUtils.getOffsetBefore(str4822, 0);
        java.lang.Object[] objArr7922 = new java.lang.Object[1];
        h((char) ((62991 ^ size322) + ((size322 & 62991) << 1)), (packedPositionChild32 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) + ((packedPositionChild32 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) << 1), ((i10822 | 17) << 1) - (i10822 ^ 17), objArr7922);
        java.lang.Object[] objArr8022 = {(java.lang.String) objArr7922[0]};
        d4 = com.facetec.sdk.al.d(-864328554);
        if (d4 == null) {
        }
        long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr8022)).longValue();
        long j6122 = -813145404;
        long j6222 = j6122 ^ j2;
        long myTid322 = android.os.Process.myTid();
        long j6322 = myTid322 ^ j2;
        long j6422 = ((-563) * j6122) + (565 * longValue1122) + ((-564) * (j6222 | (((longValue1122 ^ j2) | j6322) ^ j2) | ((longValue1122 | myTid322) ^ j2))) + (1128 * ((myTid322 | (j6222 | longValue1122)) ^ j2)) + (564 * (((longValue1122 | j6122) ^ j2) | ((j6222 | j6322) ^ j2))) + 1861343824;
        int elapsedCpuTime322 = (int) android.os.Process.getElapsedCpuTime();
        int i10922 = ((int) (j6422 >> 32)) & ((((~((~elapsedCpuTime322) | (-554324033))) | (~((-1150659721) | elapsedCpuTime322))) * (-302)) + 705941106 + ((~((-554324033) | elapsedCpuTime322)) * (-604)) + (((~(elapsedCpuTime322 | (-1704983753))) | 2097412) * 302));
        int elapsedRealtime522 = (int) android.os.SystemClock.elapsedRealtime();
        int i11022 = ~elapsedRealtime522;
        int i11122 = ((int) j6422) & ((((~((-498774680) | i11022)) | (-938451731)) * (-1042)) + 1419264002 + (((-498774680) | elapsedRealtime522) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(elapsedRealtime522 | 938451730)) | (-1073722264) | (~(i11022 | (-363504147)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
        long j6522 = (i10922 ^ i11122) | (i10922 & i11122);
        if (j3 <= 0) {
        }
        java.lang.Object[] objArr8322 = new java.lang.Object[1];
        g("׳ל犤냭銅眰瀰ힵ蒔ፘ\uf172唡ܐ連玵퓟虅\u16fb\uf4e9发¶鞸畏텉菩ᑽ\uf784", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8322);
        java.lang.Object[] objArr8422 = {(java.lang.String) objArr8322[0]};
        d5 = com.facetec.sdk.al.d(-864328554);
        if (d5 == null) {
        }
        long longValue1222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr8422)).longValue();
        long j6622 = 830812392;
        long j6722 = 713;
        long j6822 = -712;
        long j6922 = longValue1222 ^ j2;
        long freeMemory422 = (int) java.lang.Runtime.getRuntime().freeMemory();
        long j7022 = freeMemory422 ^ j2;
        long j7122 = (j7022 | j6622) ^ j2;
        long j7222 = ((-711) * j6622) + (j6722 * longValue1222) + ((((j6922 | j6622) ^ j2) | j7122) * j6822) + (((((j6922 | j7022) | j6622) ^ j2) | (((longValue1222 | j6622) | freeMemory422) ^ j2)) * j6822) + (712 * (j6922 | j7122)) + 217386028;
        int maxMemory622 = (int) java.lang.Runtime.getRuntime().maxMemory();
        int i12622 = ~maxMemory622;
        int i12722 = ((int) (j7222 >> 32)) & ((((~((-353342907) | maxMemory622)) | (-1083883505)) * (-318)) + 1053550230 + (((~((-1083883505) | maxMemory622)) | (~(1436532730 | i12622))) * 318) + (((~(maxMemory622 | 1436532730)) | (~(i12622 | (-1083189825)))) * 318));
        int i12822 = ~((int) android.os.SystemClock.elapsedRealtime());
        int i12922 = ((int) j7222) & ((((~((-2100107328) | i12822)) | (-757633559)) * (-983)) + 1100580356 + (((~(i12822 | (-757633559))) | 33280) * 983));
        j4 = (i12722 ^ i12922) | (i12722 & i12922);
        int i13022 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        java.lang.Object[] objArr8622 = new java.lang.Object[1];
        g("⌺⌕䌨\uf0d7ꌞ䱿〖\uecff", ((i13022 | 1) << 1) - (i13022 ^ 1), objArr8622);
        java.lang.Object[] objArr8722 = {(java.lang.String) objArr8622[0]};
        d6 = com.facetec.sdk.al.d(-864328554);
        if (d6 == null) {
        }
        long longValue1322 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr8722)).longValue();
        long j7322 = -777527622;
        long j7422 = ((j7322 ^ j2) | longValue1322) ^ j2;
        long nextInt822 = new java.util.Random().nextInt();
        long j7522 = nextInt822 ^ j2;
        long j7622 = 594;
        long j7722 = longValue1322 ^ j2;
        long j7822 = (j7522 | j7322) ^ j2;
        long j7922 = (595 * j7322) + ((-1187) * longValue1322) + ((-1188) * (j7422 | ((j7522 | longValue1322) ^ j2))) + ((j7422 | ((nextInt822 | j7722) ^ j2) | j7822) * j7622) + (j7622 * (((j7722 | j7522) ^ j2) | ((j7722 | j7322) ^ j2) | j7822)) + 1825726042;
        int i13122 = (int) java.lang.Runtime.getRuntime().totalMemory();
        int i13222 = ~i13122;
        int i13322 = ((int) (j7922 >> 32)) & ((((~(1862025061 | i13122)) | 285294730 | (~((-995715824) | i13122))) * (-754)) + 1075089950 + (((~(i13122 | (-285294731))) | (~((-710421094) | i13222))) * (-754)) + ((1862025061 | i13222) * 754));
        int i13422 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
        int i13522 = ((int) j7922) & ((((-34676866) | i13422) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 697008989 + (((~(i13422 | 1411664236)) | (-34941318)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
        long j8022 = (i13322 ^ i13522) | (i13322 & i13522);
        if (j4 > 0) {
        }
        int i16022 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
        java.lang.Object[] objArr9022 = new java.lang.Object[1];
        g("淃淬㡑\ue400\ud870\uf2b5ⓝ到\uecff妮ꖁ", (i16022 & 1) + (i16022 | 1), objArr9022);
        java.lang.String str4922 = (java.lang.String) objArr9022[0];
        int i16122 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        char c1222 = (char) ((~i16122) + (i16122 << 1));
        str5 = str4822;
        int i16222 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int i16322 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        java.lang.Object[] objArr9122 = new java.lang.Object[1];
        h(c1222, 187 - (~i16222), (i16322 ^ 12) + ((i16322 & 12) << 1), objArr9122);
        java.lang.String str5022 = (java.lang.String) objArr9122[0];
        java.lang.Object[] objArr9222 = new java.lang.Object[1];
        g("䶡䶎줤쾷⤅뎇ཪጂ첝\ua8db踶醖佂⮤೪ၯ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr9222);
        java.lang.String str5122 = (java.lang.String) objArr9222[0];
        char maximumDrawingCacheSize222 = (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38164);
        long uptimeMillis422 = android.os.SystemClock.uptimeMillis();
        int i16422 = -android.graphics.Color.alpha(0);
        int c1322 = com.facetec.sdk.fp.a.c();
        int i16522 = (i16422 * (-574)) - 6888;
        int i16622 = ~c1322;
        int i16722 = ~i16422;
        int i16822 = ~(i16722 | i16622);
        int i16922 = ~((c1322 ^ (-13)) | (c1322 & (-13)));
        int i17022 = ((i16822 ^ i16922) | (i16822 & i16922)) * 1150;
        int i17122 = ~((i16622 ^ 12) | (i16622 & 12));
        int i17222 = (((i16522 | i17022) << 1) - (i16522 ^ i17022)) + (((i16922 ^ i17122) | (i17122 & i16922)) * (-575));
        int i17322 = ~((c1322 ^ i16722) | (i16722 & c1322));
        int i17422 = ~((i16422 ^ i16622) | (i16422 & i16622));
        int i17522 = ((i17422 ^ i17322) | (i17322 & i17422)) * 575;
        java.lang.Object[] objArr9322 = new java.lang.Object[1];
        h(maximumDrawingCacheSize222, (uptimeMillis422 > 0L ? 1 : (uptimeMillis422 == 0L ? 0 : -1)) + 199, (i17222 ^ i17522) + ((i17522 & i17222) << 1), objArr9322);
        java.lang.String str5222 = (java.lang.String) objArr9322[0];
        java.lang.Object[] objArr9422 = new java.lang.Object[1];
        g("卬千홣뱩㙇\uf527粨喿퉀랖ﷷ휶冞㓨缳", android.view.KeyEvent.keyCodeFromString(str5), objArr9422);
        java.lang.String str5322 = (java.lang.String) objArr9422[0];
        java.lang.Object[] objArr9522 = new java.lang.Object[1];
        g("넠넏룼\u1778壝鲧ힾ㰸〆", android.view.View.getDefaultSize(0, 0), objArr9522);
        java.lang.String str5422 = (java.lang.String) objArr9522[0];
        int i17622 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
        int c1422 = com.facetec.sdk.fp.a.c();
        int i17722 = i17622 * (-317);
        int i17822 = (4394544 ^ i17722) + ((i17722 & 4394544) << 1);
        int i17922 = ~i17622;
        int i18022 = ~c1422;
        int i18122 = (i18022 ^ i17622) | (i18022 & i17622);
        int i18222 = ((~((i18122 ^ 13776) | (i18122 & 13776))) | (~((i17922 ^ (-13777)) | (i17922 & (-13777)) | c1422))) * (-318);
        int i18322 = (i17822 ^ i18222) + ((i17822 & i18222) << 1);
        int i18422 = ~((i17622 ^ (-13777)) | (i17622 & (-13777)));
        int i18522 = ~(i17622 | c1422);
        int i18622 = -(-(((i18522 ^ i18422) | (i18522 & i18422)) * (-318)));
        int i18722 = (i18322 & i18622) + (i18622 | i18322);
        int i18822 = ~((i17922 ^ c1422) | (c1422 & i17922));
        int i18922 = ((i18822 ^ (-13777)) | (i18822 & (-13777))) * 318;
        int i19022 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        java.lang.Object[] objArr9622 = new java.lang.Object[1];
        h((char) (((i18722 | i18922) << 1) - (i18922 ^ i18722)), (i19022 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) + ((i19022 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE) << 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr9622);
        java.lang.String[] strArr422 = {str4922, str5022, str5122, str5222, str5322, str5422, (java.lang.String) objArr9622[0]};
        i5 = 0;
        while (true) {
            if (i5 >= 7) {
            }
            int i19222 = ((i5 | (-12)) << 1) - (i5 ^ (-12));
            i5 = (i19222 & 13) + (i19222 | 13);
            str5 = str6;
        }
        if (i6 != 0) {
        }
    }
}
