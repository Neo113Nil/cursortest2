package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class et extends com.facetec.sdk.ew {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static long f3556a;
    private static char b;
    private static long c;
    private static int d;
    private static char[] e;
    private static int f;
    private static int i;

    private static java.lang.String $$g(int i2, byte b2, int i3) {
        int i4 = 116 - i2;
        byte[] bArr = $$c;
        int i5 = i3 * 3;
        int i6 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i4 += i5;
            i6++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i4 += bArr[i6];
            i6++;
        }
    }

    private static void g(int i2, short s, byte b2, java.lang.Object[] objArr) {
        int i3 = (s * 4) + 4;
        byte[] bArr = $$a;
        int i4 = 101 - b2;
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = i3 + (-i5);
        }
        while (true) {
            int i7 = i4;
            int i8 = i3;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 = i8 + 1;
                i4 = i7 + (-bArr[i8]);
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{126, 100, 75, -47};
        $$b = 150;
    }

    static void init$1() {
        $$c = new byte[]{85, 41, -73, -3};
        $$f = 73;
    }

    public et(java.lang.String str) {
        super(str);
    }

    public et(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public et(java.lang.Throwable th) {
        super(th);
    }

    private static void h(char c2, int i2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i3];
        hhVar.e = 0;
        while (hhVar.e < i3) {
            $11 = ($10 + 41) % 128;
            int i4 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(e[i2 + i4])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45150), 2151 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 24 - android.view.View.resolveSize(0, 0), 1926116241, false, $$g((byte) 11, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(c), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    byte b3 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(0), 1834 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, -1880730373, false, $$g((byte) 10, b3, b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.graphics.Color.alpha(0) + 2341, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, -1839099840, false, $$g((byte) 14, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                $10 = ($11 + 81) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        hhVar.e = 0;
        while (hhVar.e < i3) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                byte b5 = (byte) 0;
                d5 = com.facetec.sdk.al.c((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 2341 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, -1839099840, false, $$g((byte) 14, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void j(java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        char c3;
        if (str3 != null) {
            $11 = ($10 + 69) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != 0) {
            $11 = ($10 + 81) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            cArr3 = str.toCharArray();
            $10 = ($11 + 33) % 128;
        } else {
            cArr3 = str;
        }
        char[] cArr6 = cArr3;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = cArr4.length;
        char[] cArr7 = new char[length];
        int length2 = cArr6.length;
        char[] cArr8 = new char[length2];
        int i3 = 0;
        java.lang.System.arraycopy(cArr4, 0, cArr7, 0, length);
        java.lang.System.arraycopy(cArr6, 0, cArr8, 0, length2);
        cArr7[0] = (char) (cArr7[0] ^ c2);
        cArr8[2] = (char) (cArr8[2] + ((char) i2));
        int length3 = cArr5.length;
        char[] cArr9 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                if (d2 == null) {
                    char lastIndexOf = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3));
                    int size = android.view.View.MeasureSpec.getSize(i3);
                    int threadPriority = android.os.Process.getThreadPriority(i3);
                    byte b2 = (byte) 5;
                    byte b3 = (byte) (b2 - 5);
                    java.lang.String $$g = $$g(b2, b3, b3);
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i3] = java.lang.Object.class;
                    d2 = com.facetec.sdk.al.c(lastIndexOf, size + 988, 24 - ((threadPriority + 20) >> 6), 326823045, false, $$g, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                if (d3 == null) {
                    char size2 = (char) android.view.View.MeasureSpec.getSize(i3);
                    int green = android.graphics.Color.green(i3);
                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                    byte b4 = (byte) i3;
                    java.lang.String $$g2 = $$g((byte) ($$f & 62), b4, b4);
                    java.lang.Class[] clsArr2 = new java.lang.Class[1];
                    clsArr2[i3] = java.lang.Object.class;
                    d3 = com.facetec.sdk.al.c(size2, green + 1505, (scrollBarFadeDuration >> 16) + 24, -750364609, false, $$g2, clsArr2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                char c4 = cArr7[hsVar.d % 4];
                java.lang.Object[] objArr4 = new java.lang.Object[3];
                objArr4[2] = java.lang.Integer.valueOf(cArr8[intValue]);
                objArr4[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr4[i3] = hsVar;
                java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                if (d4 == null) {
                    byte b5 = (byte) 2;
                    byte b6 = (byte) (b5 - 2);
                    d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 26699), 640 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 23 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 510477072, false, $$g(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr7[intValue2] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                if (d5 == null) {
                    char keyRepeatDelay = (char) (409 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    java.lang.String $$g3 = $$g(b7, b8, b8);
                    c3 = 2;
                    d5 = com.facetec.sdk.al.c(keyRepeatDelay, lastIndexOf2 + 2199, 24 - packedPositionGroup, -340948215, false, $$g3, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr8[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                cArr7[intValue2] = hsVar.b;
                cArr9[hsVar.d] = (char) ((((cArr7[intValue2] ^ cArr5[hsVar.d]) ^ (f3556a ^ 9010024738234916139L)) ^ ((int) (d ^ 9010024738234916139L))) ^ ((char) (b ^ 9010024738234916139L)));
                hsVar.d++;
                $10 = ($11 + 29) % 128;
                i3 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr9);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f = 0;
        i = 1;
        e = new char[]{27752, 33425, 45564, 41182, 55275, 50716, 62758, 58449, 7003, 2668, 14487, 34027, 27205, 22904, 18443, 16251, 11993, 7666, 3217, 62352, 58095, 53312, 51044, 46623, 42292, 38033, 31740, 27361, 22914, 18617, 15951, 11635, 7185, 830, 62164, 57793, 53422, 51102, 46763, 15358, 27771, 33420, 45474, 41183, 55268, 50697, 59391, 2322, 14886, 11076, 23662, 19869, 32423, 27763, 33425, 45478, 41177, 55290, 62200, 7199, 12091, 15944, 18785, 22674, 27583, 31425, 34247, 38116, 42578, 45355, 49232, 54113, 58014, 3516, 17019, 44188, 40888, 36559, 63974, 59396, 56107, 51717, 13637, 9328, 55162, 14725, 2734, 7122, 27892, 32028, 20001, 27753, 33421, 27753, 33418, 45491, 41156, 55294, 50737, 62773, 58447, 6990, 2678, 14509, 12218, 24261, 19949, 31753, 37671, 33341, 45403, 41084, 54914, 27758, 33420, 45491, 41173, 55279, 50716, 62765, 58451, 6990, 2683, 14532, 27759, 33424, 45477, 41183, 55268, 50698, 62749, 58447, 6996, 2680, 14493, 8071, 61816, 49741, 54071, 41996, 46562, 34549, 38844, 26807, 31121, 19269, 23639, 11564, 15872, 4069, 60535, 648, 12733, 8391, 22524, 17938, 29957, 25677, 39771, 35435, 47240, 44961, 57054, 52709, 27701, 33421, 45483, 41157, 55294, 50699, 62767, 58377, 7000, 2679, 14492, 12281, 27701, 33422, 45472, 41177, 55273, 50753, 62769, 58435, 6998, 2680, 14557, 12197, 24286, 19951, 31766, 37683, 33321, 20893, 48933, 35843, 40301, 59990, 64419, 51335, 55713, 9953, 14292, 1331, 4624, 27701, 33416, 45495, 41176, 55278, 50689, 62768, 58377, 7000, 2679, 14492, 62252, 7572, 11945, 16326, 18685, 27701, 33435, 45478, 41173, 44973, 16718, 29285, 25372, 5242, 1475, 14058, 10139, 55498, 51635, 64345, 60503, 40208, 36401, 49113, 20725, 16875, 29326, 1931, 59699, 55822, 52065, 48218, 44543, 27701, 33421, 45483, 41157, 55294, 50699, 62767, 58377, 6985, 2682, 14557, 12206, 24264, 19943, 31756, 37737, 27701, 33421, 45483, 41157, 55294, 50699, 62767, 58377, 6991, 2669, 14464, 12281, 24285, 19947, 31823, 37672, 33343, 45403, 41078, 55003, 50616, 62657, 60397, 6674, 2389, 11915, 49203, 62229, 57979, 38208, 33973, 46993, 42679, 23036, 18626, 31269, 27910, 7227, 41927, 19836, 32338, 28459, 6171, 2483, 15043, 11185, 54436, 50570, 63279, 57417, 37175, 33289, 46078, 23744, 19931, 18997, 42170, 38795, 34555, 61859, 57393, 27701, 33422, 45472, 41177, 55273, 50753, 45404, 24570, 27860, 32170, 2701, 7027, 10328, 21576, 47856, 35286, 39096, 61400, 65141, 52556, 56436, 9012, 12806, 227, 6082, 26297, 30086, 17511, 43796, 47703, 35116, 38915, 61154, 64980, 52394, 27701, 33434, 45495, 41152, 55205, 50708, 62779, 58433, 6995, 2669, 14489, 27760, 33439, 45476, 41175, 55204, 50690, 62755, 58440, 7005, 2608, 14502, 12222, 24280, 19947, 31747, 37666};
        c = 7321493800330560254L;
        f3556a = 9010024738234916139L;
        d = 603544875;
        b = (char) 48451;
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x2e44, code lost:
    
        r3 = r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x2e47, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x2e56, code lost:
    
        if (r2 == null) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04dd, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) != 477111747) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x05f4, code lost:
    
        if (((r1 ^ r3) | (r3 & r1)) != 477111747) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x092c, code lost:
    
        if (((r1 & (((((783058907 | r3) * 764) + 491890758) + (((~(r2 | 783058907)) | 5326852) * (-1528))) + ((139545108 | r3) * 764))) | ((((((~((-14505717) | r8)) | (~(1451732126 | r7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 948142939) + (((~((-8717461) | r7)) | (~(1457520382 | r8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) & r4)) == 542074309) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x16cd, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) == 477111747) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x18dd A[Catch: all -> 0x40cd, TryCatch #11 {all -> 0x40cd, blocks: (B:3:0x000b, B:6:0x0017, B:7:0x0048, B:14:0x01a2, B:16:0x01af, B:17:0x01ef, B:29:0x02f3, B:31:0x0300, B:32:0x0338, B:34:0x036a, B:36:0x0377, B:37:0x03b9, B:39:0x03c2, B:41:0x03da, B:42:0x0417, B:48:0x0966, B:50:0x0973, B:51:0x09af, B:58:0x111c, B:60:0x1129, B:61:0x115d, B:64:0x11c3, B:66:0x11d0, B:67:0x120a, B:71:0x12d6, B:73:0x12e3, B:74:0x1319, B:76:0x1344, B:78:0x1351, B:79:0x1384, B:83:0x139e, B:85:0x13b4, B:86:0x13f4, B:92:0x15c9, B:94:0x15e0, B:95:0x161b, B:99:0x18d0, B:101:0x18dd, B:102:0x1919, B:104:0x19ff, B:106:0x1a0c, B:107:0x1a44, B:117:0x1b95, B:119:0x1ba2, B:120:0x1bd3, B:122:0x1ce4, B:124:0x1cf1, B:125:0x1d26, B:142:0x2019, B:144:0x2026, B:145:0x2069, B:177:0x2561, B:179:0x256e, B:180:0x25a8, B:199:0x29c3, B:201:0x29d0, B:202:0x2a0b, B:214:0x2baf, B:216:0x2bd2, B:217:0x2c1a, B:249:0x2e5e, B:251:0x2e64, B:252:0x2e99, B:265:0x3614, B:267:0x3626, B:268:0x365f, B:274:0x3767, B:276:0x376d, B:277:0x379e, B:283:0x38ee, B:285:0x3912, B:286:0x3960, B:292:0x3b0d, B:294:0x3b1a, B:295:0x3b52, B:301:0x3c72, B:303:0x3c78, B:304:0x3cac, B:310:0x3ddc, B:312:0x3de2, B:313:0x3e1c, B:319:0x3f31, B:321:0x3f59, B:322:0x3fb1, B:339:0x2fb8, B:341:0x2fbe, B:342:0x2ff6, B:350:0x3139, B:352:0x313f, B:353:0x3177, B:358:0x32b8, B:360:0x32be, B:361:0x32f2, B:366:0x3443, B:368:0x3449, B:369:0x347c, B:467:0x1709, B:469:0x1716, B:470:0x1750, B:486:0x14ab, B:488:0x14c2, B:489:0x1502, B:497:0x0a89, B:499:0x0a96, B:500:0x0ac5, B:507:0x04f6, B:509:0x050d, B:510:0x0547, B:513:0x05f8, B:515:0x060f, B:516:0x064e, B:522:0x0725, B:524:0x073c, B:525:0x077d, B:531:0x0841, B:533:0x0858, B:534:0x0892), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x1a0c A[Catch: all -> 0x40cd, TryCatch #11 {all -> 0x40cd, blocks: (B:3:0x000b, B:6:0x0017, B:7:0x0048, B:14:0x01a2, B:16:0x01af, B:17:0x01ef, B:29:0x02f3, B:31:0x0300, B:32:0x0338, B:34:0x036a, B:36:0x0377, B:37:0x03b9, B:39:0x03c2, B:41:0x03da, B:42:0x0417, B:48:0x0966, B:50:0x0973, B:51:0x09af, B:58:0x111c, B:60:0x1129, B:61:0x115d, B:64:0x11c3, B:66:0x11d0, B:67:0x120a, B:71:0x12d6, B:73:0x12e3, B:74:0x1319, B:76:0x1344, B:78:0x1351, B:79:0x1384, B:83:0x139e, B:85:0x13b4, B:86:0x13f4, B:92:0x15c9, B:94:0x15e0, B:95:0x161b, B:99:0x18d0, B:101:0x18dd, B:102:0x1919, B:104:0x19ff, B:106:0x1a0c, B:107:0x1a44, B:117:0x1b95, B:119:0x1ba2, B:120:0x1bd3, B:122:0x1ce4, B:124:0x1cf1, B:125:0x1d26, B:142:0x2019, B:144:0x2026, B:145:0x2069, B:177:0x2561, B:179:0x256e, B:180:0x25a8, B:199:0x29c3, B:201:0x29d0, B:202:0x2a0b, B:214:0x2baf, B:216:0x2bd2, B:217:0x2c1a, B:249:0x2e5e, B:251:0x2e64, B:252:0x2e99, B:265:0x3614, B:267:0x3626, B:268:0x365f, B:274:0x3767, B:276:0x376d, B:277:0x379e, B:283:0x38ee, B:285:0x3912, B:286:0x3960, B:292:0x3b0d, B:294:0x3b1a, B:295:0x3b52, B:301:0x3c72, B:303:0x3c78, B:304:0x3cac, B:310:0x3ddc, B:312:0x3de2, B:313:0x3e1c, B:319:0x3f31, B:321:0x3f59, B:322:0x3fb1, B:339:0x2fb8, B:341:0x2fbe, B:342:0x2ff6, B:350:0x3139, B:352:0x313f, B:353:0x3177, B:358:0x32b8, B:360:0x32be, B:361:0x32f2, B:366:0x3443, B:368:0x3449, B:369:0x347c, B:467:0x1709, B:469:0x1716, B:470:0x1750, B:486:0x14ab, B:488:0x14c2, B:489:0x1502, B:497:0x0a89, B:499:0x0a96, B:500:0x0ac5, B:507:0x04f6, B:509:0x050d, B:510:0x0547, B:513:0x05f8, B:515:0x060f, B:516:0x064e, B:522:0x0725, B:524:0x073c, B:525:0x077d, B:531:0x0841, B:533:0x0858, B:534:0x0892), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x1af0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x1ba2 A[Catch: all -> 0x40cd, TryCatch #11 {all -> 0x40cd, blocks: (B:3:0x000b, B:6:0x0017, B:7:0x0048, B:14:0x01a2, B:16:0x01af, B:17:0x01ef, B:29:0x02f3, B:31:0x0300, B:32:0x0338, B:34:0x036a, B:36:0x0377, B:37:0x03b9, B:39:0x03c2, B:41:0x03da, B:42:0x0417, B:48:0x0966, B:50:0x0973, B:51:0x09af, B:58:0x111c, B:60:0x1129, B:61:0x115d, B:64:0x11c3, B:66:0x11d0, B:67:0x120a, B:71:0x12d6, B:73:0x12e3, B:74:0x1319, B:76:0x1344, B:78:0x1351, B:79:0x1384, B:83:0x139e, B:85:0x13b4, B:86:0x13f4, B:92:0x15c9, B:94:0x15e0, B:95:0x161b, B:99:0x18d0, B:101:0x18dd, B:102:0x1919, B:104:0x19ff, B:106:0x1a0c, B:107:0x1a44, B:117:0x1b95, B:119:0x1ba2, B:120:0x1bd3, B:122:0x1ce4, B:124:0x1cf1, B:125:0x1d26, B:142:0x2019, B:144:0x2026, B:145:0x2069, B:177:0x2561, B:179:0x256e, B:180:0x25a8, B:199:0x29c3, B:201:0x29d0, B:202:0x2a0b, B:214:0x2baf, B:216:0x2bd2, B:217:0x2c1a, B:249:0x2e5e, B:251:0x2e64, B:252:0x2e99, B:265:0x3614, B:267:0x3626, B:268:0x365f, B:274:0x3767, B:276:0x376d, B:277:0x379e, B:283:0x38ee, B:285:0x3912, B:286:0x3960, B:292:0x3b0d, B:294:0x3b1a, B:295:0x3b52, B:301:0x3c72, B:303:0x3c78, B:304:0x3cac, B:310:0x3ddc, B:312:0x3de2, B:313:0x3e1c, B:319:0x3f31, B:321:0x3f59, B:322:0x3fb1, B:339:0x2fb8, B:341:0x2fbe, B:342:0x2ff6, B:350:0x3139, B:352:0x313f, B:353:0x3177, B:358:0x32b8, B:360:0x32be, B:361:0x32f2, B:366:0x3443, B:368:0x3449, B:369:0x347c, B:467:0x1709, B:469:0x1716, B:470:0x1750, B:486:0x14ab, B:488:0x14c2, B:489:0x1502, B:497:0x0a89, B:499:0x0a96, B:500:0x0ac5, B:507:0x04f6, B:509:0x050d, B:510:0x0547, B:513:0x05f8, B:515:0x060f, B:516:0x064e, B:522:0x0725, B:524:0x073c, B:525:0x077d, B:531:0x0841, B:533:0x0858, B:534:0x0892), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x1cf1 A[Catch: all -> 0x40cd, TryCatch #11 {all -> 0x40cd, blocks: (B:3:0x000b, B:6:0x0017, B:7:0x0048, B:14:0x01a2, B:16:0x01af, B:17:0x01ef, B:29:0x02f3, B:31:0x0300, B:32:0x0338, B:34:0x036a, B:36:0x0377, B:37:0x03b9, B:39:0x03c2, B:41:0x03da, B:42:0x0417, B:48:0x0966, B:50:0x0973, B:51:0x09af, B:58:0x111c, B:60:0x1129, B:61:0x115d, B:64:0x11c3, B:66:0x11d0, B:67:0x120a, B:71:0x12d6, B:73:0x12e3, B:74:0x1319, B:76:0x1344, B:78:0x1351, B:79:0x1384, B:83:0x139e, B:85:0x13b4, B:86:0x13f4, B:92:0x15c9, B:94:0x15e0, B:95:0x161b, B:99:0x18d0, B:101:0x18dd, B:102:0x1919, B:104:0x19ff, B:106:0x1a0c, B:107:0x1a44, B:117:0x1b95, B:119:0x1ba2, B:120:0x1bd3, B:122:0x1ce4, B:124:0x1cf1, B:125:0x1d26, B:142:0x2019, B:144:0x2026, B:145:0x2069, B:177:0x2561, B:179:0x256e, B:180:0x25a8, B:199:0x29c3, B:201:0x29d0, B:202:0x2a0b, B:214:0x2baf, B:216:0x2bd2, B:217:0x2c1a, B:249:0x2e5e, B:251:0x2e64, B:252:0x2e99, B:265:0x3614, B:267:0x3626, B:268:0x365f, B:274:0x3767, B:276:0x376d, B:277:0x379e, B:283:0x38ee, B:285:0x3912, B:286:0x3960, B:292:0x3b0d, B:294:0x3b1a, B:295:0x3b52, B:301:0x3c72, B:303:0x3c78, B:304:0x3cac, B:310:0x3ddc, B:312:0x3de2, B:313:0x3e1c, B:319:0x3f31, B:321:0x3f59, B:322:0x3fb1, B:339:0x2fb8, B:341:0x2fbe, B:342:0x2ff6, B:350:0x3139, B:352:0x313f, B:353:0x3177, B:358:0x32b8, B:360:0x32be, B:361:0x32f2, B:366:0x3443, B:368:0x3449, B:369:0x347c, B:467:0x1709, B:469:0x1716, B:470:0x1750, B:486:0x14ab, B:488:0x14c2, B:489:0x1502, B:497:0x0a89, B:499:0x0a96, B:500:0x0ac5, B:507:0x04f6, B:509:0x050d, B:510:0x0547, B:513:0x05f8, B:515:0x060f, B:516:0x064e, B:522:0x0725, B:524:0x073c, B:525:0x077d, B:531:0x0841, B:533:0x0858, B:534:0x0892), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x1df6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x2017  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x212e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x218e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x24ad  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x252c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x3602  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x3613  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x212b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x1917  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x16d5  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1834  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x40d5  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x40d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] e$896c745(java.lang.Object obj) {
        java.lang.Throwable cause;
        java.lang.String str;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3;
        long j6;
        long j7;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object d2;
        java.lang.String str4;
        long j8;
        java.lang.Object d3;
        java.lang.Object d4;
        long j9;
        java.lang.Object d5;
        java.lang.String[] strArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object[] objArr;
        char c2;
        char c3;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        long j10;
        java.lang.String str13;
        java.lang.Object[] objArr2;
        java.lang.String[] strArr2;
        int i9;
        java.lang.String[] strArr3;
        java.lang.Object obj2;
        java.lang.String str14;
        int i10;
        int i11;
        int i12;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String str15;
        int i13;
        int i14;
        i = (f + 93) % 128;
        try {
            java.lang.Object d6 = com.facetec.sdk.al.d(60475645);
            str = "";
            if (d6 == null) {
                char scrollBarFadeDuration = (char) (41371 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                byte b2 = (byte) 0;
                byte b3 = b2;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                g(b2, b3, (byte) (b3 + 1), objArr3);
                d6 = com.facetec.sdk.al.c(scrollBarFadeDuration, indexOf + 615, 23 - packedPositionChild, -1535790587, false, (java.lang.String) objArr3[0], new java.lang.Class[0]);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, null)).longValue();
            long j11 = 289177603;
            j = -300;
            j2 = 302;
            j3 = -301;
            long elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
            j4 = -1;
            long j12 = longValue ^ j4;
            j5 = 301;
            long j13 = (((((j * j11) + (j2 * longValue)) + ((((j11 | longValue) | elapsedCpuTime) ^ j4) * j3)) + ((((j12 | elapsedCpuTime) ^ j4) | (((elapsedCpuTime ^ j4) | j11) ^ j4)) * j3)) + ((j12 | (((j11 ^ j4) | elapsedCpuTime) ^ j4)) * j5)) - 816368897;
            int nextInt = new java.util.Random().nextInt(1073958331);
            i2 = ((int) (j13 >> 32)) & ((((~((-710935553) | nextInt)) * (-301)) - 1304332058) + (((~((~nextInt) | (-996246529))) | (~(nextInt | 1861494356))) * (-301)) + (((~(996246528 | nextInt)) | 1861494356) * 301));
            int i15 = (int) j13;
            int myPid = android.os.Process.myPid();
            int i16 = ~((-1558636409) | myPid);
            i3 = i15 & ((((~((~myPid) | (-1558636409))) | 276833568) * (-245)) + 2018554540 + (i16 * (-245)) + ((i16 | 1299104477) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
        } catch (java.lang.Throwable th2) {
            cause = th2.getCause();
            if (cause == null) {
            }
        }
        if (((i2 ^ i3) | (i2 & i3)) != 0) {
            java.lang.Object[] objArr4 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, new int[]{0}};
            int nextInt2 = new java.util.Random().nextInt();
            int i17 = ~nextInt2;
            int i18 = ~(923001578 | nextInt2);
            int i19 = (-1366647373) - (~(((((((~(nextInt2 | 695216381)) | (~((-553656553) | i17))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 865967489) + (((~((-695216382) | i17)) | i18) * (-1040))) + ((((~(i17 | (-923001579))) | 141559829) | i18) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)) + 16));
            int i20 = i19 << 13;
            int i21 = (~(i20 & i19)) & (i20 | i19);
            int i22 = i21 ^ (i21 >>> 17);
            int i23 = i22 << 5;
            ((int[]) objArr4[1])[0] = (~(i22 & i23)) & (i22 | i23);
            return objArr4;
        }
        char packedPositionGroup = (char) android.widget.ExpandableListView.getPackedPositionGroup(0L);
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i24 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        h(packedPositionGroup, ((lastIndexOf | 1) << 1) - (lastIndexOf ^ 1), ((i24 | 12) << 1) - (i24 ^ 12), objArr5);
        java.lang.Object[] objArr6 = {(java.lang.String) objArr5[0]};
        java.lang.Object d7 = com.facetec.sdk.al.d(1590238701);
        if (d7 == null) {
            char c4 = (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            float minVolume = android.media.AudioTrack.getMinVolume();
            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
            byte b4 = (byte) 0;
            byte b5 = b4;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            g(b4, b5, b5, objArr7);
            d7 = com.facetec.sdk.al.c(c4, 2078 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 24 - resolveSizeAndState, -114923755, false, (java.lang.String) objArr7[0], new java.lang.Class[]{java.lang.String.class});
        }
        java.lang.String str16 = (java.lang.String) ((java.lang.reflect.Method) d7).invoke(null, objArr6);
        if (str16 != null) {
            f = (i + 85) % 128;
            int i25 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            int axisFromString = android.view.MotionEvent.axisFromString("");
            int e2 = com.facetec.sdk.fp.b.e();
            int i26 = axisFromString | 1;
            int i27 = ~axisFromString;
            int i28 = ~((i27 ^ (-2)) | (i27 & (-2)));
            int i29 = ~e2;
            int i30 = (i27 ^ i29) | (i29 & i27);
            int i31 = ~i30;
            int i32 = (i28 ^ i31) | (i28 & i31);
            int i33 = ~((i26 ^ e2) | (i26 & e2));
            j7 = j2;
            int i34 = (axisFromString * 503) + 503 + (i26 * (-502)) + (((i32 & i33) | (i32 ^ i33)) * (-502));
            int i35 = ~((i30 & 1) | (i30 ^ 1));
            int i36 = ~((axisFromString ^ 1) | (axisFromString & 1) | e2);
            int i37 = ((i35 ^ i36) | (i35 & i36)) * 502;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            j("\u0000\u0000\u0000\u0000", (char) ((58394 & i25) + (i25 | 58394)), "흮蟲ᘫ\ua7e0醌\ue1d1", "徼ǉᥝ胤", (i34 ^ i37) + ((i37 & i34) << 1), objArr8);
            java.lang.String str17 = (java.lang.String) objArr8[0];
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            j("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.blue(0), "왢⨬虖欺壿ꩁ駹ၗ", "ᙿ\uf301ꄑ蹐", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr9);
            java.lang.String[] strArr4 = {str17, (java.lang.String) objArr9[0]};
            int i38 = 0;
            while (true) {
                if (i38 >= 2) {
                    str2 = str;
                    j6 = j;
                    break;
                }
                int i39 = i;
                int i40 = ((i39 | 33) << 1) - (i39 ^ 33);
                f = i40 % 128;
                if (i40 % 2 != 0) {
                    str16.contains(strArr4[i38]);
                    throw null;
                }
                if (str16.contains(strArr4[i38])) {
                    int i41 = f;
                    i = ((i41 ^ 41) + ((i41 & 41) << 1)) % 128;
                    char scrollBarFadeDuration2 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int myTid = android.os.Process.myTid() >> 22;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", scrollBarFadeDuration2, "咮䍉\ud983莙䬛亓琎氙迦囃ꐁ앾覬搟篡풔\ue7ce\ueb6d\uf63e곹؝屇작", "ݶꤦ綝냖", (((-1649859065) | myTid) << 1) - (myTid ^ (-1649859065)), objArr10);
                    java.lang.Object[] objArr11 = {(java.lang.String) objArr10[0]};
                    java.lang.Object d8 = com.facetec.sdk.al.d(1590238701);
                    if (d8 == null) {
                        char gidForName = (char) ((-1) - android.os.Process.getGidForName(str));
                        int size = android.view.View.MeasureSpec.getSize(0);
                        int gidForName2 = android.os.Process.getGidForName(str);
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        g(b6, b7, b7, objArr12);
                        d8 = com.facetec.sdk.al.c(gidForName, size + 2078, 23 - gidForName2, -114923755, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object invoke = ((java.lang.reflect.Method) d8).invoke(null, objArr11);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", (char) (19694 - (~(-android.graphics.ImageFormat.getBitsPerPixel(0)))), "⾊궧\ued93ᰧ閹\udae9m⟖\uf8d5럒ᯅ䄈襈\u0a7f暖绊ᷣ킉ꅮ쬈뼳뢘Ɦퟟ鞤땘聘齌缤﹌", "暪㶘\uf0a1浌", 0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), objArr13);
                    java.lang.Object[] objArr14 = {(java.lang.String) objArr13[0]};
                    java.lang.Object d9 = com.facetec.sdk.al.d(1590238701);
                    if (d9 == null) {
                        char tapTimeout = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                        int indexOf2 = android.text.TextUtils.indexOf(str, str, 0);
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        j6 = j;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        g(b8, b9, b9, objArr15);
                        d9 = com.facetec.sdk.al.c(tapTimeout, 2077 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), indexOf2 + 24, -114923755, false, (java.lang.String) objArr15[0], new java.lang.Class[]{java.lang.String.class});
                    } else {
                        j6 = j;
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) d9).invoke(null, objArr14);
                    if (invoke != null) {
                        java.lang.Object[] objArr16 = {invoke, 42};
                        java.lang.Object d10 = com.facetec.sdk.al.d(-582857820);
                        if (d10 == null) {
                            char gidForName3 = (char) ((-1) - android.os.Process.getGidForName(str));
                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            g(b10, b11, (byte) (b11 + 1), objArr17);
                            d10 = com.facetec.sdk.al.c(gidForName3, 2366 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), 24 - normalizeMetaState, 2058170716, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr16)).longValue();
                        long j14 = -453987255;
                        obj3 = invoke;
                        obj4 = invoke2;
                        long j15 = longValue2 ^ j4;
                        long j16 = 494;
                        long j17 = j14 ^ j4;
                        str2 = str;
                        long maxMemory = ((int) java.lang.Runtime.getRuntime().maxMemory()) ^ j4;
                        long j18 = (495 * j14) + ((-493) * longValue2) + ((j14 | j15) * (-988)) + ((longValue2 | j17 | maxMemory) * j16) + (j16 * (((maxMemory | longValue2) ^ j4) | ((j17 | j15) ^ j4) | ((longValue2 | j14) ^ j4))) + 1613184653;
                        int myTid2 = android.os.Process.myTid();
                        int i42 = ~myTid2;
                        int i43 = ((int) (j18 >> 32)) & ((((~((-1455449650) | myTid2)) | (~((-134742081) | i42))) * 920) + 2038856378 + (((~(152965318 | i42)) | 1455449649) * 920) + (((~(myTid2 | 1608414967)) | (~(i42 | (-1455449650))) | (~((-134742081) | myTid2))) * 920));
                        int myUid = android.os.Process.myUid();
                        int i44 = ~myUid;
                        int i45 = (~((-1623367977) | i44)) | 541106176 | (~(1234372909 | i44));
                        int i46 = ((int) j18) & ((((~(myUid | (-152111110))) | i45) * 590) + 436596431 + (i45 * (-1180)) + (((~(i44 | 1623367976)) | (~((-1234372910) | i44))) * 590));
                    } else {
                        obj3 = invoke;
                        obj4 = invoke2;
                        str2 = str;
                    }
                    if (obj4 != null) {
                        int i47 = i;
                        int i48 = (i47 & 99) + (i47 | 99);
                        f = i48 % 128;
                        if (i48 % 2 != 0) {
                            java.lang.Object[] objArr18 = {obj4, 33};
                            java.lang.Object d11 = com.facetec.sdk.al.d(-582857820);
                            if (d11 == null) {
                                char red = (char) android.graphics.Color.red(0);
                                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                g(b12, b13, (byte) (b13 + 1), objArr19);
                                d11 = com.facetec.sdk.al.c(red, 2365 - resolveOpacity, 25 - (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)), 2058170716, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr18)).longValue();
                            long j19 = 385271880;
                            int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                            long j20 = -518;
                            long j21 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                            long j22 = elapsedCpuTime3;
                            long j23 = (j19 ^ j4) | (j22 ^ j4);
                            long j24 = (j20 * j19) + (j20 * longValue3) + (((j23 ^ j4) | longValue3) * j21) + ((-519) * (((j23 | longValue3) ^ j4) | (((j19 | longValue3) | j22) ^ j4))) + (j21 * (((longValue3 | j22) ^ j4) | j19)) + 773925518;
                            int nextInt3 = new java.util.Random().nextInt();
                            int i49 = ((int) (j24 << 75)) & (((((~((-738346115) | r7)) | (-2119394771)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 2010450326) + (((~((~nextInt3) | (-1040344531))) | (-1817396355)) * (-440)) + ((nextInt3 | (-738346115)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                            int myPid2 = android.os.Process.myPid();
                            int i50 = ((int) j24) & ((((~myPid2) | (-1244206358)) * 1444) + 1153123995 + (((~(myPid2 | 943676084)) | (-2050973622) | (~(1914064801 | myPid2))) * (-1444)) + 668824890);
                        } else {
                            java.lang.Object[] objArr20 = {obj4, 42};
                            java.lang.Object d12 = com.facetec.sdk.al.d(-582857820);
                            if (d12 == null) {
                                char c5 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                                byte b14 = (byte) 0;
                                byte b15 = b14;
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                g(b14, b15, (byte) (b15 + 1), objArr21);
                                d12 = com.facetec.sdk.al.c(c5, 2366 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), 24 - (maxKeyCode >> 16), 2058170716, false, (java.lang.String) objArr21[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d12).invoke(null, objArr20)).longValue();
                            long j25 = -554568716;
                            long j26 = j25 ^ j4;
                            str15 = str2;
                            long j27 = 717;
                            long elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                            long j28 = elapsedRealtime ^ j4;
                            long j29 = (j25 | longValue4) ^ j4;
                            long j30 = j26 | (longValue4 ^ j4);
                            long j31 = ((-716) * j25) + (1435 * longValue4) + ((-1434) * (longValue4 | j26)) + ((((j28 | longValue4) ^ j4) | j29 | ((j30 | elapsedRealtime) ^ j4)) * j27) + (j27 * (((longValue4 | elapsedRealtime) ^ j4) | ((j30 | j28) ^ j4) | j29)) + 1713766114;
                            int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                            int i51 = ((int) (j31 >> 32)) & (((((~((-1507552239) | r3)) | (-70325828)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~((~elapsedRealtime2) | (-1114691))) | (~((-69211138) | elapsedRealtime2))) * (-519)) + (((~(elapsedRealtime2 | (-70325828))) | 1507552238) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                            int i52 = ~uptimeMillis2;
                            int i53 = ((int) j31) & (((((~((-861687007) | uptimeMillis2)) | (~(1996053879 | i52))) * (-1808)) - 407695859) + (((~((-844647511) | uptimeMillis2)) | (~(2013093375 | i52))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(uptimeMillis2 | (-1996053880))) | android.R.string.PERSOSUBSTATE_RUIM_SERVICE_PROVIDER_ENTRY | (~(i52 | 861687006))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                            if (((i51 ^ i53) | (i51 & i53)) == 477111747) {
                                str2 = str15;
                            }
                            if (obj3 == null) {
                                java.lang.Object[] objArr22 = {obj3, 42};
                                java.lang.Object d13 = com.facetec.sdk.al.d(-582857820);
                                if (d13 == null) {
                                    str = str15;
                                    char offsetAfter = (char) android.text.TextUtils.getOffsetAfter(str, 0);
                                    long elapsedCpuTime4 = android.os.Process.getElapsedCpuTime();
                                    float complexToFloat = android.util.TypedValue.complexToFloat(0);
                                    byte b16 = (byte) 0;
                                    byte b17 = b16;
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    g(b16, b17, (byte) (b17 + 1), objArr23);
                                    d13 = com.facetec.sdk.al.c(offsetAfter, 2366 - (elapsedCpuTime4 > 0L ? 1 : (elapsedCpuTime4 == 0L ? 0 : -1)), 24 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 2058170716, false, (java.lang.String) objArr23[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                } else {
                                    str = str15;
                                }
                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, objArr22)).longValue();
                                long j32 = -219163469;
                                int myUid2 = android.os.Process.myUid();
                                long j33 = -518;
                                long j34 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                long j35 = myUid2;
                                long j36 = (j32 ^ j4) | (j35 ^ j4);
                                long j37 = (j33 * j32) + (j33 * longValue5) + (((j36 ^ j4) | longValue5) * j34) + ((-519) * (((j36 | longValue5) ^ j4) | (((j32 | longValue5) | j35) ^ j4))) + (j34 * (((longValue5 | j35) ^ j4) | j32)) + 1378360867;
                                int i54 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i55 = ((int) (j37 >> 32)) & ((((~((-1137473995) | i54)) | 1116221578) * 305) + 1704617878 + (((~((~i54) | (-1137473995))) | 1720266890) * 305));
                                int myTid3 = android.os.Process.myTid();
                                int i56 = ~((-1052846533) | (~myTid3));
                                int i57 = ((int) j37) & ((((((~(r7 | 1052846532)) | ((~(384379877 | r7)) | (-1055468518))) | (~((-381757893) | myTid3))) * (-84)) - 1905160647) + (((~(myTid3 | 1052846532)) | (-384379878) | i56) * (-84)) + ((381757892 | i56) * 84));
                                if (((i57 ^ i55) | (i55 & i57)) == -1032769152) {
                                    str2 = str;
                                }
                            } else {
                                str = str15;
                            }
                            if (obj4 != null) {
                                java.lang.Object[] objArr24 = {obj4, 42};
                                java.lang.Object d14 = com.facetec.sdk.al.d(-582857820);
                                if (d14 == null) {
                                    char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                                    int gidForName4 = android.os.Process.getGidForName(str);
                                    byte b18 = (byte) 0;
                                    byte b19 = b18;
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    g(b18, b19, (byte) (b19 + 1), objArr25);
                                    d14 = com.facetec.sdk.al.c(scrollBarSize, 2365 - (doubleTapTimeout >> 16), 23 - gidForName4, 2058170716, false, (java.lang.String) objArr25[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d14).invoke(null, objArr24)).longValue();
                                long j38 = 56950459;
                                long j39 = 530;
                                long j40 = 529;
                                str2 = str;
                                long myTid4 = android.os.Process.myTid();
                                long j41 = org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (j39 * j38) + (j39 * longValue6) + (((((myTid4 ^ j4) | j38) ^ j4) | ((j38 | longValue6) ^ j4)) * j40) + (j40 * ((longValue6 ^ j4) | ((myTid4 | j38) ^ j4))) + 1102246939;
                                int i58 = (int) (j41 >> 32);
                                int i59 = ~((int) android.os.SystemClock.uptimeMillis());
                                int i60 = ~(654167503 | i59);
                                int i61 = (int) j41;
                                int nextInt4 = new java.util.Random().nextInt();
                                int i62 = ~nextInt4;
                            }
                        }
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            char c6 = (char) (59612 - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))));
                            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                            java.lang.String str18 = str2;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            h(c6, (longPressTimeout & 11) + (longPressTimeout | 11), 28 - (~(-(-android.text.TextUtils.lastIndexOf(str18, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))), objArr26);
                            java.lang.Object[] objArr27 = {(java.lang.String) objArr26[0]};
                            java.lang.Object d15 = com.facetec.sdk.al.d(1450487247);
                            if (d15 == null) {
                                char c7 = (char) (6934 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                                byte b20 = (byte) 0;
                                byte b21 = b20;
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                g(b20, b21, (byte) (b21 + 3), objArr28);
                                d15 = com.facetec.sdk.al.c(c7, 2390 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (keyRepeatDelay >> 16) + 23, -241445065, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, objArr27)).longValue();
                            long j42 = 159512178;
                            long j43 = 881;
                            long j44 = -880;
                            long j45 = j42 ^ j4;
                            long j46 = longValue7 ^ j4;
                            str2 = str18;
                            long nextInt5 = new java.util.Random().nextInt(1575459449);
                            long j47 = (nextInt5 | j42) ^ j4;
                            long j48 = (j42 * j43) + (j43 * longValue7) + ((((j45 | j46) ^ j4) | ((j45 | nextInt5) ^ j4) | ((j46 | nextInt5) ^ j4)) * j44) + (j44 * (longValue7 | (((nextInt5 ^ j4) | j45) ^ j4) | j47)) + (880 * j47) + 1691664463;
                            int myPid3 = android.os.Process.myPid();
                            int i63 = ~myPid3;
                            int i64 = ~(myPid3 | 866122666);
                            int i65 = ((int) (j48 >> 32)) & ((((((~((-589224611) | i63)) | 571103744) | i64) * (-252)) - 673518166) + ((i64 | (~(i63 | (-18120867)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                            int i66 = ((int) j48) & ((((((~((~r3) | (-563251614))) | 8519832) * 446) - 384374209) + (((~(((int) android.os.Process.getElapsedCpuTime()) | (-554731782))) | (-2008997856)) * 446)) - 495122224);
                            int i67 = (i65 ^ i66) | (i65 & i66);
                            i14 = 1;
                            if (i67 == 1) {
                                i13 = 0;
                                int[] iArr = new int[i14];
                                int[] iArr2 = new int[i14];
                                iArr2[i13] = i13;
                                iArr[i13] = 260;
                                java.lang.Object[] objArr29 = {null, new int[i14], iArr, iArr2};
                                int i68 = ~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | 736457573);
                                int i69 = -(-(((190931813 | i68) * (-970)) + 1259473049 + ((i68 | 545525760) * 970) + 16));
                                int i70 = (i69 & (-1366647372)) + (i69 | (-1366647372));
                                int i71 = i70 << 13;
                                int i72 = (~(i71 & i70)) & (i71 | i70);
                                int i73 = i72 ^ (i72 >>> 17);
                                int i74 = i73 << 5;
                                ((int[]) objArr29[1])[0] = (i73 & (~i74)) | ((~i73) & i74);
                                return objArr29;
                            }
                        } else {
                            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            j("\u0000\u0000\u0000\u0000", (char) ((keyRepeatTimeout & 19771) + (keyRepeatTimeout | 19771)), "赿瑰构珼\u0890ᙵ伇⤱쀒硱煦䇍फ", "吧癈㮒\ue74d", (-1837741996) - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr30);
                            java.lang.Object[] objArr31 = {(java.lang.String) objArr30[0]};
                            java.lang.Object d16 = com.facetec.sdk.al.d(1590238701);
                            if (d16 == null) {
                                char bitsPerPixel = (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
                                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                int keyCodeFromString = android.view.KeyEvent.keyCodeFromString(str2);
                                byte b22 = (byte) 0;
                                byte b23 = b22;
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                g(b22, b23, b23, objArr32);
                                d16 = com.facetec.sdk.al.c(bitsPerPixel, absoluteGravity + 2078, 24 - keyCodeFromString, -114923755, false, (java.lang.String) objArr32[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            java.lang.Object invoke3 = ((java.lang.reflect.Method) d16).invoke(null, objArr31);
                            i13 = 0;
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            h((char) (22484 - (~(-android.graphics.Color.green(0)))), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 39, 0 - (~(-android.graphics.Color.argb(0, 0, 0, 0))), objArr33);
                            if (invoke3.equals((java.lang.String) objArr33[0])) {
                                i14 = 1;
                                int[] iArr3 = new int[i14];
                                int[] iArr22 = new int[i14];
                                iArr22[i13] = i13;
                                iArr3[i13] = 260;
                                java.lang.Object[] objArr292 = {null, new int[i14], iArr3, iArr22};
                                int i682 = ~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | 736457573);
                                int i692 = -(-(((190931813 | i682) * (-970)) + 1259473049 + ((i682 | 545525760) * 970) + 16));
                                int i702 = (i692 & (-1366647372)) + (i692 | (-1366647372));
                                int i712 = i702 << 13;
                                int i722 = (~(i712 & i702)) & (i712 | i702);
                                int i732 = i722 ^ (i722 >>> 17);
                                int i742 = i732 << 5;
                                ((int[]) objArr292[1])[0] = (i732 & (~i742)) | ((~i732) & i742);
                                return objArr292;
                            }
                        }
                        cause = th2.getCause();
                        if (cause == null) {
                            throw cause;
                        }
                        throw th2;
                    }
                    str15 = str2;
                    if (obj3 == null) {
                    }
                    if (obj4 != null) {
                    }
                } else {
                    i38 = (i38 ^ 1) + ((i38 & 1) << 1);
                    str = str;
                }
            }
        } else {
            j6 = j;
            j7 = j2;
        }
        str2 = str;
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "膊辆✩\uf807琨콎橳\udce5", "軖\ue688䫾؊", 16777215 - (~android.graphics.Color.rgb(0, 0, 0)), objArr34);
        java.lang.String str19 = (java.lang.String) objArr34[0];
        char normalizeMetaState2 = (char) android.view.KeyEvent.normalizeMetaState(0);
        java.lang.String str20 = str2;
        int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i75 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int e3 = com.facetec.sdk.fp.b.e();
        int i76 = i75 * 483;
        int i77 = ((i76 | 1452) << 1) - (i76 ^ 1452);
        int i78 = ~i75;
        int i79 = ~((i78 ^ (-7)) | (i78 & (-7)));
        int i80 = ~e3;
        int i81 = (i80 & i78) | (i78 ^ i80);
        int i82 = ~i81;
        int i83 = ((i82 ^ i79) | (i82 & i79)) * (-241);
        int i84 = (i77 & i83) + (i83 | i77);
        int i85 = -(-((i75 | 6) * (-482)));
        int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
        int i87 = ~((i75 & (-7)) | (i75 ^ (-7)));
        int i88 = ~((i81 ^ 6) | (i81 & 6));
        int i89 = -(-(((i87 ^ i88) | (i88 & i87)) * 241));
        java.lang.Object[] objArr35 = new java.lang.Object[1];
        h(normalizeMetaState2, 39 - lastIndexOf2, (i86 & i89) + (i89 | i86), objArr35);
        java.lang.String str21 = (java.lang.String) objArr35[0];
        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
        java.lang.Object[] objArr36 = new java.lang.Object[1];
        h((char) ((35713 & fadingEdgeLength) + (fadingEdgeLength | 35713)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, objArr36);
        java.lang.String str22 = (java.lang.String) objArr36[0];
        java.lang.Object[] objArr37 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) android.view.Gravity.getAbsoluteGravity(0, 0), "楢ᖼ\u2062ꀳ⾤\uf041\uf2fe墴陱", "謍ꗬꌂᗭ", 44428426 - (~(-android.view.View.MeasureSpec.getMode(0))), objArr37);
        java.lang.String str23 = (java.lang.String) objArr37[0];
        int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
        char c8 = (char) ((40447 ^ longPressTimeout2) + ((longPressTimeout2 & 40447) << 1));
        java.lang.Object[] objArr38 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", c8, "뼆匒辸糆㵗璀", "䪵倫￩Ν", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr38);
        java.lang.String str24 = (java.lang.String) objArr38[0];
        char c9 = (char) (60262 - (~(-android.text.TextUtils.lastIndexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))));
        int i90 = -android.text.TextUtils.lastIndexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr39 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", c9, "\udbad蚨灷ᒧ뤆컑胦斓ੴ༃≳볽\ue9b9", "躗ﵴ校퇫", (570258573 ^ i90) + ((i90 & 570258573) << 1), objArr39);
        java.lang.String str25 = (java.lang.String) objArr39[0];
        char c10 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        int i91 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
        int i92 = -(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        h(c10, ((i91 | 53) << 1) - (i91 ^ 53), ((i92 | 5) << 1) - (i92 ^ 5), objArr40);
        java.lang.String str26 = (java.lang.String) objArr40[0];
        int i93 = -android.text.TextUtils.getOffsetBefore(str20, 0);
        int e4 = com.facetec.sdk.fp.b.e();
        int i94 = (i93 * (-520)) + 29922084;
        int i95 = ~i93;
        int i96 = 57322 | i95;
        int i97 = (~((i96 ^ e4) | (i96 & e4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
        int i98 = ~((i93 & (-57323)) | ((-57323) ^ i93));
        int i99 = (((i94 & i97) + (i94 | i97)) - (~(-(-(i98 * (-1042)))))) - 1;
        int i100 = ~e4;
        int i101 = (i100 ^ i95) | (i95 & i100);
        int i102 = ~((i101 ^ 57322) | (57322 & i101));
        int i103 = -(-(((i98 ^ i102) | (i102 & i98)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
        java.lang.Object[] objArr41 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) ((i99 & i103) + (i103 | i99)), "㫌\u0d51児瑛\uf357䇅", "쀢왬\ueaa2雟", (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), objArr41);
        java.lang.String str27 = (java.lang.String) objArr41[0];
        int i104 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (((54506 | i104) << 1) - (i104 ^ 54506)), "⏷ꤞ", "ﹼ僕\uea03퓔", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr42);
        java.lang.String str28 = (java.lang.String) objArr42[0];
        int scrollBarFadeDuration3 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
        int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
        int e5 = com.facetec.sdk.fp.b.e();
        int i105 = (e5 ^ 58) | (e5 & 58);
        int i106 = ~doubleTapTimeout2;
        int i107 = (doubleTapTimeout2 * 628) + 36424 + (((i105 ^ i106) | (i105 & i106)) * (-627));
        int i108 = ~((e5 ^ (-59)) | (e5 & (-59)));
        int i109 = ((i108 ^ doubleTapTimeout2) | (i108 & doubleTapTimeout2)) * (-627);
        int i110 = ((i107 | i109) << 1) - (i109 ^ i107);
        int i111 = ~e5;
        int i112 = ~((i111 ^ 58) | (i111 & 58));
        int i113 = ~((doubleTapTimeout2 ^ e5) | (doubleTapTimeout2 & e5));
        int i114 = ((i113 ^ i112) | (i113 & i112)) * 627;
        java.lang.Object[] objArr43 = new java.lang.Object[1];
        h((char) ((40590 ^ scrollBarFadeDuration3) + ((scrollBarFadeDuration3 & 40590) << 1)), (i110 ^ i114) + ((i114 & i110) << 1), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr43);
        java.lang.String str29 = (java.lang.String) objArr43[0];
        char red2 = (char) (11789 - android.graphics.Color.red(0));
        int i115 = -android.text.TextUtils.lastIndexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int i116 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        java.lang.Object[] objArr44 = new java.lang.Object[1];
        h(red2, (i115 ^ 73) + ((i115 & 73) << 1), (i116 ^ 10) + ((i116 & 10) << 1), objArr44);
        java.lang.String str30 = (java.lang.String) objArr44[0];
        int i117 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
        char c11 = (char) ((i117 ^ 1) + ((i117 & 1) << 1));
        int i118 = -android.text.TextUtils.lastIndexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr45 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", c11, "䅆岼䙈\ue757䲯䠡ᇤ跥", "磜癿丅䲶", (~i118) + (i118 << 1), objArr45);
        java.lang.String str31 = (java.lang.String) objArr45[0];
        java.lang.Object[] objArr46 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), "꧸咏ڦ㪀ⴽ\uec94\uf78c┏麣㦩貜洍", "享䛶灿\udabd", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr46);
        java.lang.String str32 = (java.lang.String) objArr46[0];
        int i119 = -android.view.View.MeasureSpec.getSize(0);
        char c12 = (char) ((59178 ^ i119) + ((i119 & 59178) << 1));
        int i120 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        java.lang.Object[] objArr47 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", c12, "횇ઃ┸ή\ud8b8靷溡\u0bd5蝀\ue747슖ⶴ\uec94旘", "췱ẗ⫾ꧧ", (i120 ^ 1) + ((i120 & 1) << 1), objArr47);
        java.lang.String str33 = (java.lang.String) objArr47[0];
        char defaultSize = (char) android.view.View.getDefaultSize(0, 0);
        int i121 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
        java.lang.Object[] objArr48 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", defaultSize, "㺣\ud7a5툵䪐歃嫙罩", "ṟ眾鴇貮", (125255198 & i121) + (i121 | 125255198), objArr48);
        java.lang.String str34 = (java.lang.String) objArr48[0];
        char scrollDefaultDelay = (char) (47891 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
        int gidForName5 = android.os.Process.getGidForName(str20);
        int i122 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
        java.lang.Object[] objArr49 = new java.lang.Object[1];
        h(scrollDefaultDelay, gidForName5 + 85, ((i122 | 7) << 1) - (i122 ^ 7), objArr49);
        java.lang.String str35 = (java.lang.String) objArr49[0];
        char edgeSlop = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
        int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
        java.lang.Object[] objArr50 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", edgeSlop, "\ude97欏簋댱쬉鈹쿃", "金훰`㕣", (((-271126383) | touchSlop) << 1) - (touchSlop ^ (-271126383)), objArr50);
        java.lang.String str36 = (java.lang.String) objArr50[0];
        char makeMeasureSpec = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i123 = -(-android.graphics.Color.argb(0, 0, 0, 0));
        int i124 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int e6 = com.facetec.sdk.fp.b.e();
        int i125 = ~i124;
        int i126 = (i124 * (-381)) + 384 + (i125 * (-191));
        int i127 = ~((e6 ^ 2) | (e6 & 2));
        int i128 = -(-(((i124 ^ i127) | (i127 & i124)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        int i129 = ~(i125 | 2);
        int i130 = ~e6;
        int i131 = ~((i130 ^ 2) | (i130 & 2));
        java.lang.Object[] objArr51 = new java.lang.Object[1];
        h(makeMeasureSpec, (i123 & 91) + (i123 | 91), (((i126 ^ i128) + ((i128 & i126) << 1)) - (~(-(-(((i131 ^ i129) | (i129 & i131)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))))) - 1, objArr51);
        java.lang.String str37 = (java.lang.String) objArr51[0];
        char myPid4 = (char) (android.os.Process.myPid() >> 22);
        int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay();
        int i132 = -(-android.view.MotionEvent.axisFromString(str20));
        java.lang.Object[] objArr52 = new java.lang.Object[1];
        h(myPid4, 93 - (scrollDefaultDelay2 >> 16), (i132 & 21) + (i132 | 21), objArr52);
        java.lang.String str38 = (java.lang.String) objArr52[0];
        java.lang.Object[] objArr53 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (19819 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), "锝\ue271ᗁ洍\uddbe큩", "\udb58宫殽硍", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr53);
        java.lang.String str39 = (java.lang.String) objArr53[0];
        java.lang.Object[] objArr54 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (34310 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8)))), "矴ꀄ", "㩏迮ݵ⦆", android.text.TextUtils.indexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, objArr54);
        java.lang.String str40 = (java.lang.String) objArr54[0];
        java.lang.Object[] objArr55 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (7400 - android.text.TextUtils.getOffsetAfter(str20, 0)), "鷜划\ued36萍援刁\ue094攒⛕잴ﭞ\uef0a\ue95d絸줰\udfc6", "㖃汩\ue8e0儜", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr55);
        java.lang.String str41 = (java.lang.String) objArr55[0];
        java.lang.Object[] objArr56 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) ((-android.view.MotionEvent.axisFromString(str20)) - 1), "㩕⪉緭낇륜՝㈉榄댲", "\u06ddம\u09cf\u197f", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 821318139, objArr56);
        java.lang.String str42 = (java.lang.String) objArr56[0];
        java.lang.Object[] objArr57 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.getMode(0), "멩⏞蛑ﵽ艾ꩉ佬䨔쿽⚢", "ධ㙤種邃", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr57);
        java.lang.String str43 = (java.lang.String) objArr57[0];
        java.lang.Object[] objArr58 = new java.lang.Object[1];
        h((char) android.view.KeyEvent.keyCodeFromString(str20), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 112, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr58);
        java.lang.String str44 = (java.lang.String) objArr58[0];
        char trimmedLength = (char) android.text.TextUtils.getTrimmedLength(str20);
        int i133 = -android.text.TextUtils.indexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr59 = new java.lang.Object[1];
        h(trimmedLength, ((i133 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i133 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), 10 - (~(-(-android.widget.ExpandableListView.getPackedPositionType(0L)))), objArr59);
        java.lang.String str45 = (java.lang.String) objArr59[0];
        int i134 = -android.text.TextUtils.indexOf(str20, str20);
        int normalizeMetaState3 = android.view.KeyEvent.normalizeMetaState(0);
        int i135 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        java.lang.Object[] objArr60 = new java.lang.Object[1];
        h((char) ((i134 & 29672) + (i134 | 29672)), normalizeMetaState3 + 135, ((i135 | 15) << 1) - (i135 ^ 15), objArr60);
        java.lang.String str46 = (java.lang.String) objArr60[0];
        int threadPriority = (android.os.Process.getThreadPriority(0) + 20) >> 6;
        int i136 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        java.lang.Object[] objArr61 = new java.lang.Object[1];
        h((char) ((32792 & threadPriority) + (threadPriority | 32792)), (i136 & 150) + (i136 | 150), 14 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr61);
        java.lang.String[] strArr5 = {str19, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, (java.lang.String) objArr61[0]};
        int i137 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i138 = -android.view.MotionEvent.axisFromString(str20);
        int i139 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        java.lang.Object[] objArr62 = new java.lang.Object[1];
        h((char) ((i137 & 1) + (i137 | 1)), (-2) - (~i138), (i139 & 11) + (i139 | 11), objArr62);
        java.lang.Object[] objArr63 = {(java.lang.String) objArr62[0]};
        java.lang.Object d17 = com.facetec.sdk.al.d(1590238701);
        if (d17 == null) {
            char myTid5 = (char) (android.os.Process.myTid() >> 22);
            int offsetBefore = android.text.TextUtils.getOffsetBefore(str20, 0);
            long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
            byte b24 = (byte) 0;
            byte b25 = b24;
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            g(b24, b25, b25, objArr64);
            d17 = com.facetec.sdk.al.c(myTid5, offsetBefore + 2078, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 24, -114923755, false, (java.lang.String) objArr64[0], new java.lang.Class[]{java.lang.String.class});
        }
        java.lang.Object invoke4 = ((java.lang.reflect.Method) d17).invoke(null, objArr63);
        if (invoke4 != null) {
            int i140 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            j("\u0000\u0000\u0000\u0000", (char) (((58393 | i140) << 1) - (i140 ^ 58393)), "흮蟲ᘫ\ua7e0醌\ue1d1", "徼ǉᥝ胤", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr65);
            java.lang.String str47 = (java.lang.String) objArr65[0];
            int i141 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
            java.lang.Object[] objArr66 = new java.lang.Object[1];
            j("\u0000\u0000\u0000\u0000", (char) (((i141 | 1) << 1) - (i141 ^ 1)), "왢⨬虖欺壿ꩁ駹ၗ", "ᙿ\uf301ꄑ蹐", (-2) - (~(-(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr66);
            java.lang.Object[] objArr67 = {invoke4, new java.lang.String[]{str47, (java.lang.String) objArr66[0]}};
            java.lang.Object d18 = com.facetec.sdk.al.d(-1033567267);
            if (d18 == null) {
                char fadingEdgeLength2 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int indexOf3 = android.text.TextUtils.indexOf(str20, str20, 0, 0);
                byte b26 = (byte) 0;
                byte b27 = b26;
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                g(b26, b27, (byte) (b27 + 1), objArr68);
                d18 = com.facetec.sdk.al.c(fadingEdgeLength2, 661 - lastIndexOf3, indexOf3 + 23, 1703573797, false, (java.lang.String) objArr68[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
            }
            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d18).invoke(null, objArr67)).longValue();
            long j49 = -707821553;
            long j50 = -754;
            long j51 = j49 ^ j4;
            long j52 = j51 | longValue8;
            long myPid5 = android.os.Process.myPid();
            long j53 = myPid5 ^ j4;
            long j54 = (755 * j49) + ((-753) * longValue8) + (((j52 ^ j4) | ((j51 | myPid5) ^ j4) | ((longValue8 | myPid5) ^ j4)) * j50) + ((((longValue8 | (j49 | j53)) ^ j4) | ((j52 | myPid5) ^ j4)) * j50) + (754 * (j51 | j53)) + 1330750811;
            int myPid6 = android.os.Process.myPid();
            int i142 = ~(810600345 | (~myPid6));
            int i143 = ((int) (j54 >> 32)) & (((((5244160 | i142) | (~((-810600346) | myPid6))) * (-338)) - 1085214806) + (((~(myPid6 | (-805356186))) | i142) * 338));
            int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
            int i144 = ((int) j54) & ((((~uptimeMillis3) | (-306205258)) * 1444) + 1153123995 + (((~(uptimeMillis3 | (-565511162))) | 565510576 | (~((-871715249) | uptimeMillis3))) * (-1444)) + 2036863458);
            if (((i143 ^ i144) | (i143 & i144)) != 0) {
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), "咮䍉\ud983莙䬛亓琎氙迦囃ꐁ앾覬搟篡풔\ue7ce\ueb6d\uf63e곹؝屇작", "ݶꤦ綝냖", 9783 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr69);
                java.lang.Object[] objArr70 = {(java.lang.String) objArr69[0]};
                java.lang.Object d19 = com.facetec.sdk.al.d(1590238701);
                if (d19 == null) {
                    char c13 = (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int indexOf4 = android.text.TextUtils.indexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int indexOf5 = android.text.TextUtils.indexOf(str20, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    byte b28 = (byte) 0;
                    byte b29 = b28;
                    java.lang.Object[] objArr71 = new java.lang.Object[1];
                    g(b28, b29, b29, objArr71);
                    d19 = com.facetec.sdk.al.c(c13, indexOf4 + 2079, 23 - indexOf5, -114923755, false, (java.lang.String) objArr71[0], new java.lang.Class[]{java.lang.String.class});
                }
                java.lang.Object invoke5 = ((java.lang.reflect.Method) d19).invoke(null, objArr70);
                java.lang.Object[] objArr72 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) (19696 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), "⾊궧\ued93ᰧ閹\udae9m⟖\uf8d5럒ᯅ䄈襈\u0a7f暖绊ᷣ킉ꅮ쬈뼳뢘Ɦퟟ鞤땘聘齌缤﹌", "暪㶘\uf0a1浌", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr72);
                java.lang.Object[] objArr73 = {(java.lang.String) objArr72[0]};
                java.lang.Object d20 = com.facetec.sdk.al.d(1590238701);
                if (d20 == null) {
                    char scrollBarSize2 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    int longPressTimeout3 = android.view.ViewConfiguration.getLongPressTimeout();
                    int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                    byte b30 = (byte) 0;
                    byte b31 = b30;
                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                    g(b30, b31, b31, objArr74);
                    d20 = com.facetec.sdk.al.c(scrollBarSize2, (longPressTimeout3 >> 16) + 2078, 24 - deadChar, -114923755, false, (java.lang.String) objArr74[0], new java.lang.Class[]{java.lang.String.class});
                }
                java.lang.Object invoke6 = ((java.lang.reflect.Method) d20).invoke(null, objArr73);
                if (invoke5 != null) {
                    int i145 = f;
                    int i146 = (i145 ^ 119) + ((i145 & 119) << 1);
                    i = i146 % 128;
                    if (i146 % 2 == 0) {
                        java.lang.Object[] objArr75 = {invoke5, 32};
                        java.lang.Object d21 = com.facetec.sdk.al.d(-582857820);
                        if (d21 == null) {
                            char c14 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int green = android.graphics.Color.green(0);
                            int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                            byte b32 = (byte) 0;
                            byte b33 = b32;
                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                            g(b32, b33, (byte) (b33 + 1), objArr76);
                            d21 = com.facetec.sdk.al.c(c14, 2365 - green, bitsPerPixel2 + 25, 2058170716, false, (java.lang.String) objArr76[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d21).invoke(null, objArr75)).longValue();
                        long j55 = 2339665;
                        obj2 = invoke6;
                        str3 = str20;
                        long j56 = ((longValue9 ^ j4) | j55) ^ j4;
                        long elapsedCpuTime5 = (((int) android.os.Process.getElapsedCpuTime()) | j55) ^ j4;
                        strArr3 = strArr5;
                        long j57 = 658;
                        long j58 = (659 * j55) + ((-657) * longValue9) + ((((longValue9 | (j55 ^ j4)) ^ j4) | j56 | elapsedCpuTime5) * (-658)) + (j57 * j56) + (j57 * (elapsedCpuTime5 | j56)) + 1156857733;
                        int nextInt6 = new java.util.Random().nextInt();
                        int i147 = ((int) (j58 << 66)) & ((((~((~nextInt6) | (-2144989864))) | (-707763453)) * (-235)) + 1062329465 + (((~((-2144989864) | nextInt6)) | (-707763453)) * (-470)) + (((~(nextInt6 | (-705269925))) | (-2147483392)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                        int i148 = ~(android.os.Process.myUid() | (-690506896));
                        int i149 = ((int) j58) & (((746719514 | i148) * (-220)) + 451194383 + ((i148 | 671090698) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1865016838);
                        if (((i147 ^ i149) | (i147 & i149)) != 477111747) {
                            str14 = str3;
                        }
                        i10 = 0;
                        i11 = 0;
                        while (i10 < 28) {
                            java.lang.String str48 = strArr3[i10];
                            int i150 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr77 = new java.lang.Object[1];
                            h((char) ((~i150) + (i150 << 1)), 163 - (~(-android.view.View.MeasureSpec.getMode(0))), (-16777205) - (~(-android.graphics.Color.rgb(0, 0, 0))), objArr77);
                            java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).concat(java.lang.String.valueOf(str48))};
                            java.lang.Object d22 = com.facetec.sdk.al.d(1873189073);
                            if (d22 == null) {
                                char c15 = (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6935);
                                long uptimeMillis4 = android.os.SystemClock.uptimeMillis();
                                int normalizeMetaState4 = android.view.KeyEvent.normalizeMetaState(0);
                                byte b34 = (byte) 0;
                                byte b35 = b34;
                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                g(b34, b35, (byte) (b35 + 1), objArr79);
                                d22 = com.facetec.sdk.al.c(c15, (uptimeMillis4 > 0L ? 1 : (uptimeMillis4 == 0L ? 0 : -1)) + 2388, 23 - normalizeMetaState4, -934682071, false, (java.lang.String) objArr79[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr78)).longValue();
                            long j59 = -922540456;
                            int i151 = i10;
                            int i152 = i11;
                            long nextInt7 = new java.util.Random().nextInt();
                            long j60 = longValue10 ^ j4;
                            long j61 = 676;
                            long j62 = nextInt7 ^ j4;
                            long j63 = (677 * j59) + ((-675) * longValue10) + ((j59 | nextInt7 | j60) * (-676)) + ((((j60 | j59) ^ j4) | ((j62 | j59) ^ j4)) * j61) + (j61 * (((nextInt7 | (longValue10 | j59)) ^ j4) | (((j59 ^ j4) | j60) ^ j4) | ((j60 | j62) ^ j4))) + 1859620099;
                            int myTid6 = android.os.Process.myTid();
                            int i153 = ~myTid6;
                            int i154 = ~(myTid6 | (-307627177));
                            int i155 = ((int) (j63 >> 32)) & ((((~((-1814125396) | i153)) | 1744853587 | i154) * (-502)) + 1180398700 + ((i154 | (~(i153 | (-69271809)))) * 502));
                            int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i156 = ((int) j63) & (((~(1978881599 | maxMemory2)) * (-301)) + 1104178618 + (((~((-905139256) | maxMemory2)) | (~((~maxMemory2) | 1952601630))) * (-301)) + (((~(maxMemory2 | (-1952601631))) | (-905139256)) * 301));
                            if (((i155 ^ i156) | (i155 & i156)) == 0) {
                                int i157 = i + 65;
                                f = i157 % 128;
                                if (i157 % 2 == 0) {
                                    i12 = 0;
                                    i11 = (i152 - (~(-(-i12)))) - 1;
                                    i10 = (i151 & 1) + (i151 | 1);
                                }
                            }
                            i12 = 1;
                            i11 = (i152 - (~(-(-i12)))) - 1;
                            i10 = (i151 & 1) + (i151 | 1);
                        }
                        if (i11 >= 25.2d) {
                            java.lang.Object[] objArr80 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, new int[]{0}};
                            int myTid7 = android.os.Process.myTid();
                            int i158 = ~myTid7;
                            int i159 = ((myTid7 | 409191383) * 614) + 460271265 + (((~((-608806796) | i158)) | 4293507 | (~(1009411164 | i158))) * (-1228)) + (((~(i158 | (-604513289))) | (~(1013704671 | i158))) * 614);
                            int i160 = -(-((i159 ^ 16) + ((i159 & 16) << 1)));
                            int i161 = (i160 ^ (-1366647372)) + ((i160 & (-1366647372)) << 1);
                            int i162 = i161 << 13;
                            int i163 = ((~i162) & i161) | ((~i161) & i162);
                            int i164 = i163 ^ (i163 >>> 17);
                            int i165 = i164 << 5;
                            ((int[]) objArr80[1])[0] = (~(i164 & i165)) & (i164 | i165);
                            return objArr80;
                        }
                    } else {
                        strArr3 = strArr5;
                        obj2 = invoke6;
                        java.lang.Object[] objArr81 = {invoke5, 42};
                        java.lang.Object d23 = com.facetec.sdk.al.d(-582857820);
                        if (d23 == null) {
                            char minimumFlingVelocity = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            str14 = str20;
                            int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int argb = android.graphics.Color.argb(0, 0, 0, 0);
                            byte b36 = (byte) 0;
                            byte b37 = b36;
                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                            g(b36, b37, (byte) (b37 + 1), objArr82);
                            d23 = com.facetec.sdk.al.c(minimumFlingVelocity, lastIndexOf4 + 2366, argb + 24, 2058170716, false, (java.lang.String) objArr82[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        } else {
                            str14 = str20;
                        }
                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr81)).longValue();
                        long j64 = 273145796;
                        long j65 = -375;
                        long j66 = 376;
                        long nextInt8 = new java.util.Random().nextInt(48317542);
                        long j67 = j64 ^ j4;
                        long j68 = (j64 | longValue11) ^ j4;
                        long j69 = (j65 * j64) + (j65 * longValue11) + ((((j67 | (longValue11 ^ j4)) ^ j4) | nextInt8 | j68) * j66) + ((-376) * ((((nextInt8 ^ j4) | j64) ^ j4) | j68)) + (j66 * (longValue11 | ((j67 | nextInt8) ^ j4))) + 886051602;
                        int i166 = ((int) (j69 >> 32)) & ((((((~(457331108 | r7)) | 1621927499) * 576) - 1771464918) + (((~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | 2079258607)) | 272630020) * 576)) - 2072631104);
                        int i167 = ~android.os.Process.myPid();
                        int i168 = ((int) j69) & ((((((~((-1369440258) | i167)) | (~((-67669) | i167))) * (-184)) + 1019428157) + (((~(i167 | 33926910)) | ((~(1403299499 | i167)) | (-1403367168))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 1935133416);
                        if (((i166 ^ i168) | (i166 & i168)) == 477111747) {
                            str3 = str14;
                            i10 = 0;
                            i11 = 0;
                            while (i10 < 28) {
                            }
                            if (i11 >= 25.2d) {
                            }
                        }
                    }
                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "뵘閐\ue363麚எ揿꒿੫\udbee쿹ᨫ\uea58켷\uddb5瞨㲣勞⅛袉辡檼뙖⧗", "ꦆ$䲡北", android.graphics.Color.argb(0, 0, 0, 0) - 1593826135, objArr83);
                    java.lang.Object[] objArr84 = {(java.lang.String) objArr83[0]};
                    d2 = com.facetec.sdk.al.d(-864328554);
                    if (d2 == null) {
                        str4 = str3;
                        char indexOf6 = (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                        int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                        int myPid7 = android.os.Process.myPid();
                        byte b38 = (byte) 0;
                        byte b39 = b38;
                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                        g(b38, b39, (byte) (b39 + 3), objArr85);
                        d2 = com.facetec.sdk.al.c(indexOf6, (tapTimeout2 >> 16) + 2341, 24 - (myPid7 >> 22), 1804869230, false, (java.lang.String) objArr85[0], new java.lang.Class[]{java.lang.String.class});
                    } else {
                        str4 = str3;
                    }
                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr84)).longValue();
                    long j70 = -99437248;
                    long j71 = 130;
                    long j72 = longValue12 ^ j4;
                    java.lang.String str49 = str4;
                    long myPid8 = android.os.Process.myPid();
                    long j73 = j72 | j70;
                    long j74 = ((-129) * j70) + (131 * longValue12) + ((((j72 | (myPid8 ^ j4)) | j70) ^ j4) * j71) + ((-260) * (j73 ^ j4)) + (j71 * (((longValue12 | (j70 ^ j4)) ^ j4) | ((j73 | myPid8) ^ j4))) + 1147635668;
                    int nextInt9 = new java.util.Random().nextInt(1672695563);
                    int i169 = ~nextInt9;
                    int i170 = ((int) (j74 >> 32)) & (((((~(699024489 | nextInt9)) | (~(2136250900 | i169))) * (-1808)) - 1851217734) + (((~((-1448385045) | nextInt9)) | (~((-11158634) | i169))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(nextInt9 | (-2136250901))) | (-2147409534) | (~(i169 | (-699024490)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                    int myTid8 = android.os.Process.myTid();
                    int i171 = ~myTid8;
                    int i172 = ~(1440461576 | myTid8);
                    int i173 = ((int) j74) & ((((~((-3235167) | i171)) | i172) * 1150) + 334239082 + ((i172 | (~((-1440461577) | i171))) * (-575)) + (((~(myTid8 | (-3235167))) | (~(i171 | 3235166))) * 575));
                    j8 = (i170 ^ i173) | (i170 & i173);
                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                    h((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 174 - (~(-android.text.TextUtils.lastIndexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))), 17 - android.view.KeyEvent.normalizeMetaState(0), objArr86);
                    java.lang.Object[] objArr87 = {(java.lang.String) objArr86[0]};
                    d3 = com.facetec.sdk.al.d(-864328554);
                    if (d3 == null) {
                        char c16 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int green2 = android.graphics.Color.green(0);
                        int defaultSize2 = android.view.View.getDefaultSize(0, 0);
                        byte b40 = (byte) 0;
                        byte b41 = b40;
                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                        g(b40, b41, (byte) (b41 + 3), objArr88);
                        d3 = com.facetec.sdk.al.c(c16, 2341 - green2, 24 - defaultSize2, 1804869230, false, (java.lang.String) objArr88[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr87)).longValue();
                    long j75 = -1040119239;
                    long myUid3 = android.os.Process.myUid();
                    long j76 = longValue13 ^ j4;
                    long j77 = (j6 * j75) + (j7 * longValue13) + ((((longValue13 | j75) | myUid3) ^ j4) * j3) + ((((j76 | myUid3) ^ j4) | (((myUid3 ^ j4) | j75) ^ j4)) * j3) + (((((j75 ^ j4) | myUid3) ^ j4) | j76) * j5) + 2088317659;
                    int nextInt10 = new java.util.Random().nextInt();
                    int i174 = ((int) (j77 >> 32)) & ((((~((-1811987610) | nextInt10)) | (-2052512376)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1322639844 + (((~((~nextInt10) | (-1811987610))) | (-2052512376)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                    int nextInt11 = new java.util.Random().nextInt(123973977);
                    int i175 = ~nextInt11;
                    int i176 = ((int) j77) & ((((~((-474153190) | i175)) | 67108897) * (-108)) + 2060331471 + (((~(i175 | (-963073221))) | (~(963073220 | nextInt11)) | 556028928) * 54) + ((nextInt11 | 556028928) * 54));
                    long j78 = (i174 ^ i176) | (i174 & i176);
                    if (j8 > 0) {
                        int i177 = i;
                        f = (i177 + 15) % 128;
                        if (j78 > 0 && j78 - 3 < j8) {
                            f = (i177 + 69) % 128;
                            java.lang.Object[] objArr89 = {null, new int[1], new int[]{247}, new int[]{0}};
                            int nextInt12 = new java.util.Random().nextInt(1694701754);
                            int i178 = ((((~(940915463 | nextInt12)) | 677302496) * 56) - 1676637153) + (((~((~nextInt12) | 677302496)) | 940915463) * 56);
                            int i179 = ((i178 ^ 16) + ((i178 & 16) << 1)) - 1366647372;
                            int i180 = i179 << 13;
                            int i181 = (i179 & (~i180)) | ((~i179) & i180);
                            int i182 = i181 ^ (i181 >>> 17);
                            ((int[]) objArr89[1])[0] = i182 ^ (i182 << 5);
                            return objArr89;
                        }
                    }
                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "뵘閐\ue363麚எ揿꒿੫\udbee쿹ᨫ\uea58켷\uddb5瞨㲣勞⅛袉辡檼뙖⧗", "ꦆ$䲡北", (-1593826135) - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr90);
                    java.lang.Object[] objArr91 = {(java.lang.String) objArr90[0]};
                    d4 = com.facetec.sdk.al.d(-864328554);
                    if (d4 == null) {
                        char bitsPerPixel3 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1);
                        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                        int capsMode = android.text.TextUtils.getCapsMode(str49, 0, 0);
                        byte b42 = (byte) 0;
                        byte b43 = b42;
                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                        g(b42, b43, (byte) (b43 + 3), objArr92);
                        d4 = com.facetec.sdk.al.c(bitsPerPixel3, 2341 - absoluteGravity2, capsMode + 24, 1804869230, false, (java.lang.String) objArr92[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr91)).longValue();
                    long j79 = 751535169;
                    long j80 = -755;
                    long j81 = ((j79 ^ j4) | (longValue14 ^ j4)) ^ j4;
                    long j82 = longValue14 | j79;
                    long nextInt13 = new java.util.Random().nextInt();
                    long j83 = (j79 * j80) + (j80 * longValue14) + (1512 * j81) + ((-756) * (((j82 | nextInt13) ^ j4) | j81)) + (756 * (j82 | (nextInt13 ^ j4))) + 296663251;
                    int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                    int i183 = (~((-215998651) | freeMemory)) | 147480752;
                    int i184 = ((int) (j83 >> 32)) & ((i183 * 992) + 1537498186 + ((i183 | (~((~freeMemory) | 1289745658))) * (-496)) + ((freeMemory | 1221227760) * 496));
                    int i185 = (int) j83;
                    int myPid9 = android.os.Process.myPid();
                    int i186 = ~myPid9;
                    int i187 = i185 & ((((-1933499755) | i186) * (-757)) + 1765507630 + ((~((-286557505) | myPid9)) * 1514) + (((~(myPid9 | (-1646942251))) | (~(i186 | (-496273345))) | 209715840) * 757));
                    j9 = (i184 ^ i187) | (i184 & i187);
                    int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int e7 = com.facetec.sdk.fp.b.e();
                    int i188 = ~e7;
                    int i189 = ~((i188 ^ resolveOpacity2) | (i188 & resolveOpacity2));
                    int i190 = ~resolveOpacity2;
                    int i191 = (i190 ^ (-56928)) | ((-56928) & i190);
                    int i192 = ~((i191 ^ e7) | (e7 & i191));
                    int i193 = ((resolveOpacity2 * 860) - 48843366) + (((e7 & resolveOpacity2) | (resolveOpacity2 ^ e7)) * (-859)) + (((i192 & i189) | (i189 ^ i192)) * 859);
                    int i194 = ~(((-56928) ^ i188) | (i188 & (-56928)));
                    int i195 = ~((resolveOpacity2 ^ (-56928)) | ((-56928) & resolveOpacity2));
                    int i196 = -(-(((i194 ^ i195) | (i195 & i194)) * 859));
                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", (char) ((i193 & i196) + (i196 | i193)), "状흉ꤜ쫥", "觖⥲引痞", android.view.KeyEvent.normalizeMetaState(0), objArr93);
                    java.lang.Object[] objArr94 = {(java.lang.String) objArr93[0]};
                    d5 = com.facetec.sdk.al.d(-864328554);
                    if (d5 == null) {
                        char scrollDefaultDelay3 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop();
                        int red3 = android.graphics.Color.red(0);
                        byte b44 = (byte) 0;
                        byte b45 = b44;
                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                        g(b44, b45, (byte) (b45 + 3), objArr95);
                        d5 = com.facetec.sdk.al.c(scrollDefaultDelay3, (edgeSlop2 >> 16) + 2341, red3 + 24, 1804869230, false, (java.lang.String) objArr95[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr94)).longValue();
                    long j84 = 583231972;
                    long j85 = 52;
                    long nextInt14 = new java.util.Random().nextInt(667039300) ^ j4;
                    long j86 = nextInt14 | j84;
                    long j87 = longValue15 ^ j4;
                    long j88 = j84 ^ j4;
                    long j89 = ((-51) * j84) + (53 * longValue15) + (((j86 | longValue15) ^ j4) * j85) + ((-52) * (((j87 | j84) ^ j4) | ((j87 | nextInt14) ^ j4) | (j86 ^ j4))) + (j85 * (((j88 | longValue15) ^ j4) | ((j88 | nextInt14) ^ j4))) + 464966448;
                    int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                    int i197 = ~freeMemory2;
                    int i198 = ((int) (j89 >> 32)) & ((((-1646384266) | freeMemory2) * 140) + 777117962 + (((~((-1646384266) | i197)) | 570425344) * (-280)) + (((~(freeMemory2 | (-570425345))) | (~(i197 | (-1211356620))) | 135397698) * 140));
                    int i199 = ~new java.util.Random().nextInt(1415605373);
                    int i200 = ((int) j89) & (((((-1384597703) | r4) * 764) - 449473107) + (((~(i199 | (-1384597703))) | 1350844420) * (-1528)) + ((1369719845 | (~((-52628708) | i199))) * 764));
                    long j90 = (i198 ^ i200) | (i198 & i200);
                    if (j9 > 0) {
                        int i201 = i;
                        f = (i201 + 25) % 128;
                        if (j90 > 0) {
                            int i202 = i201 + 73;
                            f = i202 % 128;
                            if (i202 % 2 == 0 ? j90 + 100 < j9 : j90 * 100 < j9) {
                                java.lang.Object[] objArr96 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, new int[]{0}};
                                int elapsedCpuTime6 = (int) android.os.Process.getElapsedCpuTime();
                                int i203 = ~elapsedCpuTime6;
                                int i204 = ((384341917 | elapsedCpuTime6) * (-859)) + 2012844904 + (((~(elapsedCpuTime6 | (-8918025))) | (~(384341917 | i203))) * 859) + (((~((-1233876043) | i203)) | 1224958018) * 859);
                                int i205 = (i204 & 16) + (i204 | 16);
                                int e8 = com.facetec.sdk.fp.b.e();
                                int i206 = i205 * (-167);
                                int i207 = ~i205;
                                int i208 = ~(1366647371 | i207);
                                int i209 = ~e8;
                                int i210 = ~((1366647371 & i209) | (1366647371 ^ i209));
                                int i211 = (596844436 ^ i206) + ((i206 & 596844436) << 1) + (((i208 & i210) | (i208 ^ i210)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                int i212 = (1366647371 & i207) | (1366647371 ^ i207);
                                int i213 = -(-((~((i212 ^ e8) | (i212 & e8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                int i214 = (i211 & i213) + (i213 | i211);
                                int i215 = ~((i207 ^ i209) | (i209 & i207));
                                int i216 = ~((i207 ^ (-1366647372)) | (i207 & (-1366647372)));
                                int i217 = (i205 ^ 1366647371) | (1366647371 & i205);
                                int i218 = -(-(((~((i217 ^ e8) | (i217 & e8))) | (i216 & i215) | (i215 ^ i216)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                int i219 = (i214 ^ i218) + ((i218 & i214) << 1);
                                int i220 = (i219 << 13) ^ i219;
                                int i221 = i220 >>> 17;
                                int i222 = (i220 & (~i221)) | ((~i220) & i221);
                                int i223 = i222 << 5;
                                ((int[]) objArr96[1])[0] = (i222 & (~i223)) | ((~i222) & i223);
                                return objArr96;
                            }
                        }
                    }
                    int i224 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    char c17 = (char) ((i224 & 1) + (i224 | 1));
                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", c17, "샰⤡ૅ팲뒇䠤Ώ", "璏പ笣ꧻ", 588065396 - android.view.View.resolveSize(0, 0), objArr97);
                    java.lang.String str50 = (java.lang.String) objArr97[0];
                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.red(0), "\uf3a3췧\u0ef2蝓\ua8cb룖ﹰǥ攬₶歛", "칂翵婘\ud83a", 1484781005 - (~(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr98);
                    java.lang.String str51 = (java.lang.String) objArr98[0];
                    char c18 = (char) (15783 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))));
                    int i225 = -android.view.KeyEvent.keyCodeFromString(str49);
                    int i226 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                    h(c18, (i225 & 193) + (i225 | 193), (i226 & 12) + (i226 | 12), objArr99);
                    java.lang.String str52 = (java.lang.String) objArr99[0];
                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                    j("\u0000\u0000\u0000\u0000", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u1fd4͑ڢ欧퐉菂敁Ŕ飹땊챽腥", "྆\ued11举璳", android.os.Process.myPid() >> 22, objArr100);
                    java.lang.String str53 = (java.lang.String) objArr100[0];
                    char c19 = (char) (0 - (~android.text.TextUtils.lastIndexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    int i227 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                    h(c19, (i227 ^ 205) + ((i227 & 205) << 1), (packedPositionChild2 & 12) + (packedPositionChild2 | 12), objArr101);
                    java.lang.String str54 = (java.lang.String) objArr101[0];
                    char combineMeasuredStates = (char) (android.view.View.combineMeasuredStates(0, 0) + 40729);
                    int i228 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i229 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                    h(combineMeasuredStates, ((i228 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1) - (i228 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE), (i229 ^ 6) + ((i229 & 6) << 1), objArr102);
                    java.lang.String str55 = (java.lang.String) objArr102[0];
                    char c20 = (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
                    int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay();
                    int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str49);
                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                    h(c20, (keyRepeatDelay2 >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, ((keyCodeFromString2 | 4) << 1) - (keyCodeFromString2 ^ 4), objArr103);
                    strArr = new java.lang.String[]{str50, str51, str52, str53, str54, str55, (java.lang.String) objArr103[0]};
                    i4 = 0;
                    while (true) {
                        if (i4 >= 7) {
                            i5 = 0;
                            break;
                        }
                        java.lang.Object[] objArr104 = {strArr[i4]};
                        java.lang.Object d24 = com.facetec.sdk.al.d(493527529);
                        if (d24 == null) {
                            char c21 = (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int indexOf7 = android.text.TextUtils.indexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                            byte b46 = (byte) 0;
                            byte b47 = b46;
                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                            g(b46, b47, (byte) (b47 + 1), objArr105);
                            d24 = com.facetec.sdk.al.c(c21, indexOf7 + 1013, (touchSlop2 >> 8) + 24, -1165632751, false, (java.lang.String) objArr105[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d24).invoke(null, objArr104)).longValue();
                        long j91 = -219438718;
                        long j92 = j91 ^ j4;
                        strArr2 = strArr;
                        i9 = i4;
                        long nextInt15 = new java.util.Random().nextInt(292179564);
                        long j93 = longValue16 | nextInt15;
                        long j94 = ((((((-464) * j91) + ((-929) * longValue16)) + ((-465) * (j92 | (j93 ^ j4)))) + (930 * (((nextInt15 | j92) ^ j4) | longValue16))) + (465 * (j93 | j92))) - 1795159323;
                        int elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                        int i230 = ~elapsedRealtime3;
                        int i231 = ((int) (j94 >> 32)) & (((elapsedRealtime3 | 1235324948) * 614) + 512809186 + (((~(1912282416 | i230)) | 134250500 | (~((-945458469) | i230))) * (-1228)) + (((~(i230 | 2046532916)) | (~((-811207969) | i230))) * 614));
                        int i232 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        int i233 = ~i232;
                        int i234 = ((int) j94) & ((((((~((-486747855) | i233)) | 268502088) | r3) * (-713)) - 579273964) + ((~(i232 | 2142220030)) * 1426) + ((~(1923974264 | i233)) * 713));
                        if (((i231 ^ i234) | (i231 & i234)) != 0) {
                            i5 = i9 + 90;
                            break;
                        }
                        i4 = ((i9 & 1) << 1) + (i9 ^ 1);
                        strArr = strArr2;
                    }
                    if (i5 != 0) {
                        java.lang.Object[] objArr106 = {null, new int[1], new int[]{i5}, new int[]{0}};
                        int maxMemory3 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i235 = ((((~((-226236271) | maxMemory3)) | 218628870) * (-283)) - 934321271) + ((~(maxMemory3 | (-7607401))) * 283) + 16;
                        int i236 = (i235 ^ (-1366647372)) + (((-1366647372) & i235) << 1);
                        int i237 = i236 << 13;
                        int i238 = (~(i237 & i236)) & (i236 | i237);
                        int i239 = i238 >>> 17;
                        int i240 = (i238 & (~i239)) | ((~i238) & i239);
                        int i241 = i240 << 5;
                        ((int[]) objArr106[1])[0] = (~(i240 & i241)) & (i240 | i241);
                        return objArr106;
                    }
                    try {
                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                        j("\u0000\u0000\u0000\u0000", (char) (42474 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "⺱ߦ\uf064佴﹜ꢖ擁乺⸚˨衍뭍霍", "\uf48f䮋\ue938ڥ", android.graphics.Color.rgb(0, 0, 0) + 961252340, objArr107);
                        try {
                            java.lang.Object[] objArr108 = {(java.lang.String) objArr107[0]};
                            java.lang.Object d25 = com.facetec.sdk.al.d(1590238701);
                            if (d25 == null) {
                                char axisFromString2 = (char) (android.view.MotionEvent.axisFromString(str49) + 1);
                                int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                float length = android.graphics.PointF.length(0.0f, 0.0f);
                                byte b48 = (byte) 0;
                                byte b49 = b48;
                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                g(b48, b49, b49, objArr109);
                                d25 = com.facetec.sdk.al.c(axisFromString2, 2078 - packedPositionGroup2, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 24, -114923755, false, (java.lang.String) objArr109[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            str13 = (java.lang.String) ((java.lang.reflect.Method) d25).invoke(null, objArr108);
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause2 = th3.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    try {
                        if (str13 != null) {
                            char fadingEdgeLength3 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i242 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int e9 = com.facetec.sdk.fp.b.e();
                            int i243 = -(-(i242 * (-963)));
                            int i244 = (i243 & (-964)) + (i243 | (-964));
                            int i245 = ~i242;
                            int i246 = ~((-441066558) | e9);
                            int i247 = (427465201 ^ i244) + ((i244 & 427465201) << 1) + (((i245 ^ i246) | (i245 & i246)) * (-964));
                            int i248 = ~e9;
                            int i249 = ~((i248 ^ (-441066558)) | ((-441066558) & i248));
                            int i250 = ~((i242 ^ (-441066558)) | ((-441066558) & i242));
                            int i251 = ((i249 ^ i250) | (i249 & i250)) * (-964);
                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                            j("\u0000\u0000\u0000\u0000", fadingEdgeLength3, "쳵\uf531݉釛햼뽦昷濆ꗽ욅菪", "㷢䨤霚횛", (i247 & i251) + (i251 | i247), objArr110);
                            java.lang.String[] strArr6 = {(java.lang.String) objArr110[0]};
                            for (int i252 = 0; i252 <= 0; i252++) {
                                if (!str13.contains(strArr6[i252])) {
                                }
                            }
                            int i253 = f;
                            i = ((i253 ^ 13) + ((i253 & 13) << 1)) % 128;
                            i6 = 0;
                            if (i6 != 0) {
                                int i254 = f;
                                i = (((i254 | 99) << 1) - (i254 ^ 99)) % 128;
                                java.lang.Object[] objArr111 = {null, new int[1], new int[]{i6}, new int[]{0}};
                                int i255 = ~((int) android.os.SystemClock.elapsedRealtime());
                                int i256 = (((((~(r2 | (-1473973016))) | 10027024) | (~(1608190935 | i255))) * 886) - 747812339) + (((~(1473973015 | i255)) | 144244944) * (-1772)) + ((~(i255 | 144244944)) * 886);
                                int i257 = (i256 ^ 16) + ((i256 & 16) << 1);
                                int i258 = (i257 ^ (-1366647372)) + (((-1366647372) & i257) << 1);
                                int i259 = i258 << 13;
                                int i260 = (~(i259 & i258)) & (i259 | i258);
                                int i261 = i260 >>> 17;
                                int i262 = (i260 & (~i261)) | ((~i260) & i261);
                                int i263 = i262 << 5;
                                ((int[]) objArr111[1])[0] = (~(i262 & i263)) & (i262 | i263);
                                return objArr111;
                            }
                            int i264 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                            char c22 = (char) ((42473 & i264) + (i264 | 42473));
                            int i265 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                            j("\u0000\u0000\u0000\u0000", c22, "⺱ߦ\uf064佴﹜ꢖ擁乺⸚˨衍뭍霍", "\uf48f䮋\ue938ڥ", (944475124 ^ i265) + ((i265 & 944475124) << 1), objArr112);
                            java.lang.Object[] objArr113 = {(java.lang.String) objArr112[0]};
                            java.lang.Object d26 = com.facetec.sdk.al.d(1590238701);
                            if (d26 == null) {
                                char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                                int alpha = android.graphics.Color.alpha(0);
                                int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
                                byte b50 = (byte) 0;
                                byte b51 = b50;
                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                g(b50, b51, b51, objArr114);
                                d26 = com.facetec.sdk.al.c(rgb, 2078 - alpha, (maxKeyCode2 >> 16) + 24, -114923755, false, (java.lang.String) objArr114[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            java.lang.String str56 = (java.lang.String) ((java.lang.reflect.Method) d26).invoke(null, objArr113);
                            if (str56 != null) {
                                char gidForName6 = (char) (android.os.Process.getGidForName(str49) + 1);
                                int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                int e10 = com.facetec.sdk.fp.b.e();
                                int i266 = keyRepeatTimeout2 * 236;
                                int i267 = ~keyRepeatTimeout2;
                                int i268 = ~e10;
                                int i269 = ~((i268 ^ i267) | (i268 & i267));
                                int i270 = (((1583918139 | i266) << 1) - (i266 ^ 1583918139)) + (((441066557 & i269) | (i269 ^ 441066557)) * (-235));
                                int i271 = ~((i267 ^ e10) | (i267 & e10));
                                int i272 = -(-(((i271 ^ 441066557) | (441066557 & i271)) * (-470)));
                                int i273 = (i270 & i272) + (i272 | i270);
                                int i274 = ~(keyRepeatTimeout2 | (-441066558));
                                int i275 = 441066557 | i267;
                                int i276 = ~((e10 ^ i275) | (e10 & i275));
                                int i277 = -(-(((i274 ^ i276) | (i274 & i276)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                j("\u0000\u0000\u0000\u0000", gidForName6, "쳵\uf531݉釛햼뽦昷濆ꗽ욅菪", "㷢䨤霚횛", (i273 & i277) + (i277 | i273), objArr115);
                                java.lang.String[] strArr7 = {(java.lang.String) objArr115[0]};
                                int i278 = 0;
                                while (true) {
                                    if (i278 <= 0) {
                                        int i279 = i + 49;
                                        f = i279 % 128;
                                        if (i279 % 2 != 0) {
                                            str56.contains(strArr7[i278]);
                                            java.lang.Object obj5 = null;
                                            obj5.hashCode();
                                            throw null;
                                        }
                                        if (str56.contains(strArr7[i278])) {
                                            f = (i + 89) % 128;
                                            break;
                                        }
                                        int i280 = i278 + 99;
                                        i278 = (i280 ^ (-98)) + ((i280 & (-98)) << 1);
                                    } else {
                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "\ue071釩돧\ue0fb煑◂氵\uef41꼞䳳躔鬙", "ꋧᚹ\u2e7e궢", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr116);
                                        java.lang.String str57 = (java.lang.String) objArr116[0];
                                        int i281 = -android.text.TextUtils.getCapsMode(str49, 0, 0);
                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", (char) (((64704 | i281) << 1) - (i281 ^ 64704)), "ṗ닞컽봎벧諧쩈쮽灹\ue082₿우髹揎\u177c謹", "ﳊ\ufb19샽샼", android.text.TextUtils.getOffsetBefore(str49, 0), objArr117);
                                        java.lang.String str58 = (java.lang.String) objArr117[0];
                                        int i282 = -android.text.TextUtils.indexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                        int e11 = com.facetec.sdk.fp.b.e();
                                        int i283 = (i282 * 465) - 15263258;
                                        int i284 = ~e11;
                                        int i285 = ~(((-32967) & i284) | ((-32967) ^ i284));
                                        int i286 = ~(((-32967) ^ i282) | ((-32967) & i282));
                                        int i287 = (i285 ^ i286) | (i285 & i286);
                                        int i288 = ~((i284 ^ i282) | (i284 & i282));
                                        int i289 = -(-(((i288 ^ i287) | (i287 & i288)) * 464));
                                        int i290 = (i283 ^ i289) + ((i283 & i289) << 1);
                                        int i291 = ~i282;
                                        int i292 = -(-(((i291 ^ e11) | (i291 & e11) | (-32967)) * (-464)));
                                        int i293 = (i290 & i292) + (i292 | i290);
                                        int i294 = ~((i282 ^ e11) | (i282 & e11));
                                        int i295 = -(-(((i294 ^ i286) | (i294 & i286)) * 464));
                                        char c23 = (char) ((i293 & i295) + (i295 | i293));
                                        int i296 = -android.text.TextUtils.lastIndexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", c23, "陕젷踀䥛ﰁ鑘㢽⭚聦䘇蝒ꝋꦢ퓥瘆\u139b蝰", "榖ﰓ윽첀", (1039930216 ^ i296) + ((i296 & 1039930216) << 1), objArr118);
                                        java.lang.String str59 = (java.lang.String) objArr118[0];
                                        int i297 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int i298 = -android.text.TextUtils.indexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                        int lastIndexOf5 = android.text.TextUtils.lastIndexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                        h((char) ((i297 ^ 27581) + ((i297 & 27581) << 1)), (i298 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + (i298 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE), (lastIndexOf5 ^ 7) + ((lastIndexOf5 & 7) << 1), objArr119);
                                        java.lang.String str60 = (java.lang.String) objArr119[0];
                                        int i299 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                        char c24 = (char) ((~i299) + (i299 << 1));
                                        int i300 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                        h(c24, (i300 & 163) + (i300 | 163), 11 - (~(android.os.Process.myPid() >> 22)), objArr120);
                                        java.lang.String str61 = (java.lang.String) objArr120[0];
                                        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", (char) ((mirror ^ 507) + ((mirror & 507) << 1)), "\ue693ᬚ\udc80\uedbf\uecd2ⵟ㨓䐢덆㫹ﳜ뇘᪲畤씓栔⒓", "䐩뾐⭱ଂ", 1908379715 - (~(-android.graphics.drawable.Drawable.resolveOpacity(0, 0))), objArr121);
                                        java.lang.String str62 = (java.lang.String) objArr121[0];
                                        char green3 = (char) android.graphics.Color.green(0);
                                        int i301 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", green3, "䳛輖鵃䬦컴華笁쳬䪸︆\u0a3bꮟ⟢樶蒪Ⲭઈ貢副뚥́", "\uf7e7\u171b倡췤", ((555162614 | i301) << 1) - (i301 ^ 555162614), objArr122);
                                        java.lang.String str63 = (java.lang.String) objArr122[0];
                                        char mode = (char) android.view.View.MeasureSpec.getMode(0);
                                        int indexOf8 = android.text.TextUtils.indexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                        int i302 = -android.view.KeyEvent.normalizeMetaState(0);
                                        int e12 = com.facetec.sdk.fp.b.e();
                                        int i303 = i302 * 371;
                                        int i304 = ((i303 | 5936) << 1) - (i303 ^ 5936);
                                        int i305 = ~e12;
                                        int i306 = ~i302;
                                        int i307 = -(-(((~(i305 | (-17))) | (~((i306 ^ e12) | (i306 & e12)))) * (-370)));
                                        int i308 = ~((i305 ^ i306) | (i305 & i306));
                                        int i309 = ~((e12 ^ (-17)) | (e12 & (-17)));
                                        int i310 = (i309 ^ i308) | (i309 & i308);
                                        int i311 = ~(i302 | 16);
                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                        h(mode, 249 - (~indexOf8), ((((((i304 | i307) << 1) - (i304 ^ i307)) - (~(-(-(((i310 ^ i311) | (i310 & i311)) * (-370)))))) - 1) - (~(-(-((~((i302 ^ 16) | (i302 & 16))) * com.knotapi.knot.utilities.Constants.ID_KROGER))))) - 1, objArr123);
                                        java.lang.String str64 = (java.lang.String) objArr123[0];
                                        int i312 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        char c25 = (char) ((~i312) + (i312 << 1));
                                        int i313 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        int e13 = com.facetec.sdk.fp.b.e();
                                        int i314 = i313 * 980;
                                        int i315 = ((-259170) & i314) + (i314 | (-259170));
                                        int i316 = ~e13;
                                        int i317 = (~((i316 & (-266)) | (i316 ^ (-266)))) * 979;
                                        int i318 = (i315 ^ i317) + ((i315 & i317) << 1);
                                        int i319 = -(-(((i313 ^ e13) | (i313 & e13)) * (-979)));
                                        int i320 = ~(e13 | (-266));
                                        int i321 = ~(i313 | i316);
                                        int lastIndexOf6 = android.text.TextUtils.lastIndexOf(str49, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                        h(c25, (i318 & i319) + (i319 | i318) + (((i321 ^ i320) | (i321 & i320)) * 979), ((lastIndexOf6 | 26) << 1) - (lastIndexOf6 ^ 26), objArr124);
                                        java.lang.String str65 = (java.lang.String) objArr124[0];
                                        char c26 = (char) (17085 - (~(-(-android.text.TextUtils.indexOf(str49, str49)))));
                                        int i322 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i323 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                        h(c26, ((i322 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE) << 1) - (i322 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE), ((i323 | 13) << 1) - (i323 ^ 13), objArr125);
                                        java.lang.String str66 = (java.lang.String) objArr125[0];
                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.argb(0, 0, 0, 0), "庑弳螎蝘\uea36㟨蠚仜長", "堶鯍ϸ뼪", (android.os.Process.myPid() >> 22) - 124007080, objArr126);
                                        java.lang.String str67 = (java.lang.String) objArr126[0];
                                        int i324 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                        j("\u0000\u0000\u0000\u0000", (char) ((~i324) + (i324 << 1)), "ｐ晱้ă\uf759ᨙ呏鐬", "ᅹ죈⧨닁", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr127);
                                        java.lang.String[] strArr8 = {str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, (java.lang.String) objArr127[0]};
                                        int i325 = 0;
                                        while (i325 < 12) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(strArr8[i325]);
                                            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                            int e14 = com.facetec.sdk.fp.b.e();
                                            int i326 = maximumDrawingCacheSize * 491;
                                            int i327 = ~maximumDrawingCacheSize;
                                            int i328 = ((-34312) & i327) | ((-34312) ^ i327);
                                            int i329 = ~e14;
                                            int i330 = ((((-16778079) ^ i326) + ((i326 & (-16778079)) << 1)) - (~(-(-(((i328 & i329) | (i328 ^ i329)) * (-490)))))) - 1;
                                            int i331 = -(-(((~(maximumDrawingCacheSize | (-34312))) | (~((e14 ^ (-34312)) | ((-34312) & e14)))) * 490));
                                            int i332 = ((i330 | i331) << 1) - (i331 ^ i330);
                                            int i333 = -(-(i327 * 490));
                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                            j("\u0000\u0000\u0000\u0000", (char) ((i332 & i333) + (i333 | i332)), "矴ꀄ", "㩏迮ݵ⦆", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr128);
                                            sb.append((java.lang.String) objArr128[0]);
                                            java.lang.Object[] objArr129 = {sb.toString()};
                                            java.lang.Object d27 = com.facetec.sdk.al.d(2084539986);
                                            if (d27 == null) {
                                                char red4 = (char) (android.graphics.Color.red(0) + 6935);
                                                int touchSlop3 = android.view.ViewConfiguration.getTouchSlop();
                                                int scrollBarSize3 = android.view.ViewConfiguration.getScrollBarSize();
                                                byte b52 = (byte) 0;
                                                byte b53 = b52;
                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                g(b52, b53, b53, objArr130);
                                                d27 = com.facetec.sdk.al.c(red4, (touchSlop3 >> 8) + 2389, 23 - (scrollBarSize3 >> 8), -607062870, false, (java.lang.String) objArr130[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d27).invoke(null, objArr129)).longValue();
                                            long j95 = -294399755;
                                            long j96 = 614;
                                            java.lang.String[] strArr9 = strArr8;
                                            int i334 = i325;
                                            long elapsedCpuTime7 = (int) android.os.Process.getElapsedCpuTime();
                                            long j97 = j95 ^ j4;
                                            long j98 = (j97 | longValue17) ^ j4;
                                            long j99 = longValue17 ^ j4;
                                            long j100 = elapsedCpuTime7 ^ j4;
                                            long j101 = (615 * j95) + ((-613) * longValue17) + ((elapsedCpuTime7 | j98 | ((j99 | j95) ^ j4)) * j96) + ((-1228) * (((j97 | j100) ^ j4) | j98 | ((j100 | longValue17) ^ j4))) + (j96 * ((((j97 | j99) | j100) ^ j4) | ((longValue17 | (j95 | j100)) ^ j4))) + 1266549097;
                                            int myPid10 = android.os.Process.myPid();
                                            int i335 = ~myPid10;
                                            int i336 = ((int) (j101 >> 32)) & ((((1149310084 | myPid10) * 988) - 126817770) + (((~(1283822735 | i335)) | 18891024) * (-1976)) + (((~(myPid10 | (-153403676))) | 1149310084 | (~(i335 | 153403675))) * 988));
                                            int i337 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                            int i338 = ((int) j101) & (((r4 * 992) - 1537497691) + (((~((-2034219333) | i337)) | 823505152 | (~((~i337) | 2034235733))) * (-496)) + ((i337 | 823521553) * 496));
                                            if (((i336 ^ i338) | (i336 & i338)) != 0) {
                                                int i339 = f;
                                                int i340 = (i339 & 119) + (i339 | 119);
                                                i = i340 % 128;
                                                i7 = i340 % 2 == 0 ? i334 - 126 : ((i334 | 110) << 1) - (i334 ^ 110);
                                            } else {
                                                i325 = i334 + 1;
                                                strArr8 = strArr9;
                                            }
                                        }
                                    }
                                }
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                java.lang.Object[] objArr131 = {null, new int[1], new int[]{i7}, new int[]{0}};
                                int nextInt16 = new java.util.Random().nextInt(774725543);
                                int i341 = ~nextInt16;
                                int i342 = (((~((-836882489) | i341)) | (~((-781335472) | i341))) * (-867)) + 158882620 + (((~((-836882489) | nextInt16)) | 545263656 | (~((-781335472) | nextInt16))) * (-1734)) + (((~(nextInt16 | (-291618833))) | (~(i341 | (-545263657))) | (~((-236071816) | nextInt16))) * 867);
                                int i343 = -(-((i342 & 16) + (i342 | 16)));
                                int i344 = (i343 ^ (-1366647372)) + ((i343 & (-1366647372)) << 1);
                                int i345 = i344 << 13;
                                int i346 = (~(i345 & i344)) & (i345 | i344);
                                int i347 = i346 >>> 17;
                                int i348 = (i346 & (~i347)) | ((~i346) & i347);
                                int i349 = i348 << 5;
                                ((int[]) objArr131[1])[0] = (~(i348 & i349)) & (i348 | i349);
                                return objArr131;
                            }
                            long[] jArr = {472001035};
                            char c27 = (char) (53233 - (~(-(android.view.ViewConfiguration.getTapTimeout() >> 16))));
                            int i350 = -android.text.TextUtils.indexOf(str49, str49, 0, 0);
                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                            h(c27, (i350 & 303) + (i350 | 303), 16 - (~(-(-android.view.KeyEvent.getDeadChar(0, 0)))), objArr132);
                            java.lang.Object[] objArr133 = {(java.lang.String) objArr132[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                            java.lang.Object d28 = com.facetec.sdk.al.d(2143203995);
                            if (d28 == null) {
                                char keyCodeFromString3 = (char) (18697 - android.view.KeyEvent.keyCodeFromString(str49));
                                int resolveOpacity3 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                int resolveSizeAndState2 = android.view.View.resolveSizeAndState(0, 0, 0);
                                byte b54 = (byte) 0;
                                byte b55 = b54;
                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                g(b54, b55, (byte) (b55 + 3), objArr134);
                                d28 = com.facetec.sdk.al.c(keyCodeFromString3, 1787 - resolveOpacity3, 24 - resolveSizeAndState2, -665728925, false, (java.lang.String) objArr134[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                            }
                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d28).invoke(null, objArr133)).longValue();
                            long j102 = 527303533;
                            int myPid11 = android.os.Process.myPid();
                            long j103 = -167;
                            long j104 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                            long j105 = j102 ^ j4;
                            long j106 = longValue18 ^ j4;
                            long j107 = j105 | j106;
                            long j108 = myPid11;
                            long j109 = j108 ^ j4;
                            long j110 = (((((j103 * j102) + (j103 * longValue18)) + (((j107 ^ j4) | ((j106 | j109) ^ j4)) * j104)) + (((j107 | j108) ^ j4) * j104)) + (j104 * ((((longValue18 | j105) ^ j4) | ((j105 | j109) ^ j4)) | ((j108 | (j102 | j106)) ^ j4)))) - 1027918167;
                            int myTid9 = android.os.Process.myTid();
                            int i351 = ~myTid9;
                            int i352 = ((int) (j110 >> 32)) & ((((~((-1193450657) | i351)) | 243775754) * (-90)) + 1687905420 + (((~((-1193450657) | myTid9)) | (-1336393131)) * (-45)) + (((~(myTid9 | (-243775755))) | (-1193450657) | (~(i351 | 243775754))) * 45));
                            int nextInt17 = new java.util.Random().nextInt();
                            int i353 = ~nextInt17;
                            int i354 = ((int) j110) & ((((((~(964655517 | nextInt17)) | (~((-472570893) | i353))) | r5) * (-516)) - 1949822447) + (((~(nextInt17 | 1031798173)) | (~(i353 | (-559227282)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((559227281 | (~((-964655518) | i353))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                            if (((i354 ^ i352) | (i352 & i354)) != 0) {
                                i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                            } else {
                                i = (f + 7) % 128;
                                i8 = 0;
                            }
                            if (i8 != 0) {
                                java.lang.Object[] objArr135 = {null, new int[1], new int[]{i8}, new int[]{0}};
                                int maxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i355 = ~(334702338 | maxMemory4);
                                int i356 = -(-((((((~((-334702339) | maxMemory4)) | 8397824) | (~((-1283515622) | maxMemory4))) * (-880)) - 279120393) + (((~((~maxMemory4) | (-334702339))) | 1283515621 | i355) * (-880)) + (i355 * 880) + 16));
                                int i357 = (i356 ^ (-1366647372)) + ((i356 & (-1366647372)) << 1);
                                int i358 = i357 << 13;
                                int i359 = ((~i358) & i357) | ((~i357) & i358);
                                int i360 = i359 >>> 17;
                                int i361 = (~(i359 & i360)) & (i359 | i360);
                                int i362 = i361 << 5;
                                ((int[]) objArr135[1])[0] = (i361 & (~i362)) | ((~i361) & i362);
                                return objArr135;
                            }
                            long[] jArr2 = {472001035};
                            int i363 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                            int i364 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i365 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                            java.lang.Object[] objArr136 = new java.lang.Object[1];
                            h((char) ((i363 & 14461) + (i363 | 14461)), 338 - (~i364), ((i365 | 22) << 1) - (i365 ^ 22), objArr136);
                            try {
                                bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr136[0]));
                                j10 = 0;
                            } catch (java.io.IOException unused2) {
                                bufferedInputStream2 = null;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                bufferedInputStream = null;
                            }
                            loop5: while (true) {
                                try {
                                    int read = bufferedInputStream2.read();
                                    if (read != -1) {
                                        j10 = ((j10 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                        int i366 = 0;
                                        while (i366 < 1) {
                                            int i367 = i + 57;
                                            f = i367 % 128;
                                            if (i367 % 2 != 0) {
                                                break loop5;
                                            }
                                            if (j10 == jArr2[i366]) {
                                                int i368 = i366 + 1;
                                                try {
                                                    bufferedInputStream2.close();
                                                } catch (java.lang.Exception unused3) {
                                                }
                                                if (i368 != 0) {
                                                    java.lang.Object[] objArr137 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, new int[]{0}};
                                                    int i369 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                    int i370 = -(-((((~((-916896771) | i369)) | 371372034) * (-566)) + 1361391699 + ((~(i369 | (-545524737))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST) + 16));
                                                    int i371 = (i370 & (-1366647372)) + (i370 | (-1366647372));
                                                    int i372 = i371 << 13;
                                                    int i373 = (~(i372 & i371)) & (i372 | i371);
                                                    int i374 = i373 >>> 17;
                                                    int i375 = (~(i373 & i374)) & (i373 | i374);
                                                    ((int[]) objArr137[1])[0] = i375 ^ (i375 << 5);
                                                    return objArr137;
                                                }
                                            } else {
                                                int i376 = ((i366 | (-95)) << 1) - (i366 ^ (-95));
                                                i366 = ((i376 | 96) << 1) - (i376 ^ 96);
                                            }
                                        }
                                    }
                                } catch (java.io.IOException unused4) {
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    bufferedInputStream = bufferedInputStream2;
                                    if (bufferedInputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        bufferedInputStream.close();
                                        throw th;
                                    } catch (java.lang.Exception unused5) {
                                        throw th;
                                    }
                                }
                                try {
                                    bufferedInputStream2.close();
                                    break;
                                } catch (java.lang.Exception unused6) {
                                }
                            }
                            java.lang.Object d29 = com.facetec.sdk.al.d(-1699488110);
                            if (d29 == null) {
                                char c28 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22874);
                                int red5 = android.graphics.Color.red(0);
                                float complexToFloat2 = android.util.TypedValue.complexToFloat(0);
                                byte b56 = (byte) 0;
                                byte b57 = b56;
                                java.lang.Object[] objArr138 = new java.lang.Object[1];
                                g(b56, b57, (byte) (b57 + 1), objArr138);
                                d29 = com.facetec.sdk.al.c(c28, red5 + com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Type.ALL, 23 - (complexToFloat2 > 0.0f ? 1 : (complexToFloat2 == 0.0f ? 0 : -1)), 1029481578, false, (java.lang.String) objArr138[0], new java.lang.Class[0]);
                            }
                            long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d29).invoke(null, null)).longValue();
                            long j111 = 369542797;
                            long j112 = 371;
                            long j113 = -370;
                            long j114 = longValue19 ^ j4;
                            long maxMemory5 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            long j115 = maxMemory5 ^ j4;
                            long j116 = j111 ^ j4;
                            long j117 = (longValue19 | j111) ^ j4;
                            long j118 = (((((j111 * j112) + (j112 * longValue19)) + ((((j114 | j115) ^ j4) | ((j116 | maxMemory5) ^ j4)) * j113)) + (j113 * ((((j116 | j115) ^ j4) | ((maxMemory5 | j114) ^ j4)) | j117))) + (com.knotapi.knot.utilities.Constants.ID_KROGER * j117)) - 1557307380;
                            int maxMemory6 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i377 = ((int) (j118 >> 32)) & (((((-362108305) | maxMemory6) * 376) - 2088991750) + (((~((~maxMemory6) | (-1341156323))) | 1247816290) * (-376)) + (((~(maxMemory6 | 1341156322)) | (-1516584563)) * 376));
                            int i378 = (int) j118;
                            int nextInt18 = new java.util.Random().nextInt(1444618911);
                            int i379 = ~nextInt18;
                            int i380 = i378 & ((((((~((-400299333) | i379)) | 307762432) | r3) * (-502)) - 1559308203) + (((~(nextInt18 | (-1744988843))) | (~(i379 | (-92536901)))) * 502));
                            if (((i377 ^ i380) | (i380 & i377)) == 0) {
                                java.lang.Object d30 = com.facetec.sdk.al.d(33831608);
                                if (d30 == null) {
                                    str5 = str49;
                                    char indexOf9 = (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 44825);
                                    float length2 = android.graphics.PointF.length(0.0f, 0.0f);
                                    int mode2 = android.view.View.MeasureSpec.getMode(0);
                                    byte b58 = (byte) 0;
                                    byte b59 = b58;
                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                    g(b58, b59, b59, objArr139);
                                    d30 = com.facetec.sdk.al.c(indexOf9, 685 - (length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1)), mode2 + 23, -1511309248, false, (java.lang.String) objArr139[0], new java.lang.Class[0]);
                                } else {
                                    str5 = str49;
                                }
                                long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) d30).invoke(null, null)).longValue();
                                long j119 = 1750947978;
                                long j120 = 367;
                                long j121 = -366;
                                long j122 = longValue20 ^ j4;
                                long j123 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                long j124 = 366;
                                long j125 = (((((j120 * j119) + (j120 * longValue20)) + ((j119 | longValue20) * j121)) + ((j119 | ((j122 | j123) ^ j4)) * j121)) + (((((j119 ^ j4) | longValue20) ^ j4) | (((j119 | j122) | j123) ^ j4)) * j124)) - 1982732832;
                                int i381 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i382 = ~i381;
                                int uptimeMillis5 = (int) android.os.SystemClock.uptimeMillis();
                                int i383 = ((((int) j125) & (((((~((-1714587137) | uptimeMillis5)) * (-301)) + 491226848) + (((~(1735642889 | uptimeMillis5)) | (~((~uptimeMillis5) | 298416479))) * (-301))) + (((~(uptimeMillis5 | (-298416480))) | 1735642889) * 301))) | (((int) (j125 >> 32)) & ((((((~((-1922672926) | i382)) | ((~(485446514 | i382)) | 1645258765)) * (-1136)) + 1738041050) + ((((~((-1922672926) | i381)) | (~(485446514 | i381))) | (~((-208032355) | i382))) * (-568))) + (((~(i381 | (-1645258766))) | ((~(i382 | 1922672925)) | (~((-485446515) | i382)))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                                if (i383 != 0) {
                                    objArr = new java.lang.Object[]{null, new int[1], new int[]{i383}, new int[]{0}};
                                    int i384 = (-1366647373) - (~(-(-((((((~((-1012211760) | r1)) | (-606006201)) * (-933)) - 1644084838) + (((~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | (-606006201))) | 707472) * 933)) - 160838320))));
                                    int i385 = i384 << 13;
                                    int i386 = ((~i385) & i384) | ((~i384) & i385);
                                    int i387 = i386 >>> 17;
                                    int i388 = (~(i386 & i387)) & (i386 | i387);
                                    int i389 = i388 << 5;
                                    int[] iArr4 = (int[]) objArr[1];
                                    int i390 = (i388 & (~i389)) | ((~i388) & i389);
                                    c2 = 0;
                                    iArr4[0] = i390;
                                    str8 = str5;
                                } else {
                                    java.lang.Object d31 = com.facetec.sdk.al.d(39533378);
                                    if (d31 == null) {
                                        char trimmedLength2 = (char) android.text.TextUtils.getTrimmedLength(str5);
                                        float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                        int edgeSlop3 = android.view.ViewConfiguration.getEdgeSlop();
                                        byte b60 = (byte) 0;
                                        byte b61 = b60;
                                        java.lang.Object[] objArr140 = new java.lang.Object[1];
                                        g(b60, b61, b61, objArr140);
                                        d31 = com.facetec.sdk.al.c(trimmedLength2, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 2221, 24 - (edgeSlop3 >> 16), -1514913350, false, (java.lang.String) objArr140[0], new java.lang.Class[0]);
                                    }
                                    long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) d31).invoke(null, null)).longValue();
                                    long j126 = 963442355;
                                    long j127 = longValue21 ^ j4;
                                    long maxMemory7 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    long j128 = (((((j120 * j126) + (j120 * longValue21)) + ((j126 | longValue21) * j121)) + ((j126 | ((j127 | maxMemory7) ^ j4)) * j121)) + ((((longValue21 | (j126 ^ j4)) ^ j4) | (((j126 | j127) | maxMemory7) ^ j4)) * j124)) - 1203046778;
                                    int elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                                    int i391 = ~elapsedRealtime4;
                                    int i392 = ((int) (j128 >> 32)) & ((((~(2143255086 | i391)) | (~((-84410377) | elapsedRealtime4)) | (~((-1344358913) | elapsedRealtime4))) * 765) + 233856819 + (((~(2058844710 | i391)) | (-2143255087)) * 1530) + (((~(elapsedRealtime4 | 2058844710)) | (~(i391 | (-1344358913)))) * 765));
                                    int myTid10 = android.os.Process.myTid();
                                    int i393 = ((int) j128) & (((((~((-1258422953) | myTid10)) | (~(1599317933 | myTid10))) * 69) - 645864274) + (((~(myTid10 | (-1527973806))) | 269550853 | (~(1329767080 | myTid10))) * (-69)) + 627777536);
                                    if (((i393 ^ i392) | (i392 & i393)) != 0) {
                                        int i394 = i;
                                        f = ((i394 ^ 91) + ((i394 & 91) << 1)) % 128;
                                        objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, new int[]{0}};
                                        int nextInt19 = new java.util.Random().nextInt(582402286);
                                        int i395 = ~nextInt19;
                                        int i396 = (((730196674 | nextInt19) * (-859)) - 809136714) + (((~(nextInt19 | (-545529857))) | (~(730196674 | i395))) * 859) + (((~((-888021286) | i395)) | 342491429) * 859);
                                        int i397 = -(-((i396 ^ 16) + ((i396 & 16) << 1)));
                                        int i398 = ((i397 | (-1366647372)) << 1) - (i397 ^ (-1366647372));
                                        int i399 = i398 << 13;
                                        int i400 = (~(i399 & i398)) & (i399 | i398);
                                        int i401 = i400 ^ (i400 >>> 17);
                                        int i402 = i401 << 5;
                                        ((int[]) objArr[1])[0] = (i401 & (~i402)) | ((~i401) & i402);
                                        str6 = str5;
                                    } else {
                                        java.lang.Object d32 = com.facetec.sdk.al.d(39530495);
                                        if (d32 == null) {
                                            char indexOf10 = (char) android.text.TextUtils.indexOf(str5, str5, 0, 0);
                                            int axisFromString3 = android.view.MotionEvent.axisFromString(str5);
                                            int gidForName7 = android.os.Process.getGidForName(str5);
                                            byte b62 = (byte) 0;
                                            byte b63 = b62;
                                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                                            g(b62, b63, (byte) (b63 + 3), objArr141);
                                            d32 = com.facetec.sdk.al.c(indexOf10, axisFromString3 + 2223, 23 - gidForName7, -1514908409, false, (java.lang.String) objArr141[0], new java.lang.Class[0]);
                                        }
                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) d32).invoke(null, null)).longValue();
                                        long j129 = -1028906293;
                                        long j130 = -948;
                                        long j131 = j129 ^ j4;
                                        long j132 = longValue22 ^ j4;
                                        str6 = str5;
                                        long nextInt20 = new java.util.Random().nextInt();
                                        long j133 = ((((((-947) * j129) + (949 * longValue22)) + ((((j132 | nextInt20) ^ j4) | j131) * j130)) + (j130 * (((j131 | j132) | (nextInt20 ^ j4)) ^ j4))) + (948 * (j132 | j129))) - 914501169;
                                        int elapsedCpuTime8 = (int) android.os.Process.getElapsedCpuTime();
                                        int i403 = ~elapsedCpuTime8;
                                        int i404 = ((int) (j133 >> 32)) & (((((~((-2121108408) | i403)) | r4) * 1150) - 334238508) + (((~(683881996 | elapsedCpuTime8)) | (~((-683881997) | i403))) * (-575)) + (((~(elapsedCpuTime8 | (-2121108408))) | (~(i403 | 2121108407))) * 575));
                                        int i405 = ((int) j133) & (((((~(159023111 | r3)) | 1278203298) * (-948)) - 1311331247) + ((~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | 1300223399)) * (-948)) + 473884620);
                                        if (((i404 ^ i405) | (i404 & i405)) != 0) {
                                            objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, new int[]{0}};
                                            int nextInt21 = new java.util.Random().nextInt();
                                            int i406 = (((~(1436457521 | nextInt21)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 440502481) + (((~((~nextInt21) | 1436457521)) | 9703472) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                            int e15 = com.facetec.sdk.fp.b.e();
                                            int i407 = ~(i406 | 16);
                                            int i408 = ~((e15 ^ 16) | (e15 & 16));
                                            int i409 = (i407 ^ i408) | (i407 & i408);
                                            int i410 = ~(i406 | e15);
                                            int i411 = ~e15;
                                            int i412 = ~i406;
                                            int i413 = ~((i412 ^ (-17)) | (i412 & (-17)));
                                            int i414 = ((((i406 * (-743)) - 11888) + (((i409 ^ i410) | (i409 & i410)) * (-744))) - (~(-(-(((i411 & i413) | (i411 ^ i413)) * 744))))) - 1;
                                            int i415 = (i406 & 16) | (i406 ^ 16);
                                            int i416 = -(-(((e15 ^ i415) | (e15 & i415)) * 744));
                                            int i417 = -(-((i414 & i416) + (i416 | i414)));
                                            int i418 = ((i417 | (-1366647372)) << 1) - (i417 ^ (-1366647372));
                                            int i419 = (i418 << 13) ^ i418;
                                            int i420 = i419 ^ (i419 >>> 17);
                                            int i421 = i420 << 5;
                                            ((int[]) objArr[1])[0] = (~(i420 & i421)) & (i420 | i421);
                                        } else {
                                            java.lang.Object d33 = com.facetec.sdk.al.d(589612749);
                                            if (d33 == null) {
                                                char fadingEdgeLength4 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                str7 = str6;
                                                int offsetAfter2 = android.text.TextUtils.getOffsetAfter(str7, 0);
                                                int packedPositionGroup3 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                byte b64 = (byte) 0;
                                                byte b65 = b64;
                                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                g(b64, b65, b65, objArr142);
                                                d33 = com.facetec.sdk.al.c(fadingEdgeLength4, offsetAfter2 + 2174, 24 - packedPositionGroup3, -2067022795, false, (java.lang.String) objArr142[0], new java.lang.Class[0]);
                                            } else {
                                                str7 = str6;
                                            }
                                            long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) d33).invoke(null, null)).longValue();
                                            long j134 = -875162666;
                                            int freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                            long j135 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                                            long j136 = -252;
                                            long j137 = longValue23 ^ j4;
                                            str8 = str7;
                                            long j138 = freeMemory3;
                                            long j139 = j137 | (j138 ^ j4);
                                            long j140 = j134 | longValue23;
                                            long j141 = (j140 | j138) ^ j4;
                                            long j142 = (j135 * j134) + (j135 * longValue23) + (((((j134 ^ j4) | j137) ^ j4) | (j139 ^ j4) | j141) * j136) + (j136 * j140) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE * (((j134 | j139) ^ j4) | j141)) + 1858331695;
                                            int i422 = ~new java.util.Random().nextInt(1241426912);
                                            int maxMemory8 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                            int i423 = ~maxMemory8;
                                            int i424 = i422 | 1055244010;
                                            if (((((int) j142) & (((1606344189 | i423) * (-369)) + 802172634 + (((~((-1253493978) | i423)) | 1604246908) * (-369)) + (((~(maxMemory8 | 1253493977)) | 352850212 | (~(i423 | (-2097282)))) * 369))) | (((int) (j142 >> 32)) & ((((((~i424) | 381982400) * (-828)) + 1754752898) + (i424 * (-828))) - 1863680020))) != 0) {
                                                objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                                int i425 = (-1366647373) - (~((((((~((-1538281042) | r1)) | (-79936919)) * (-964)) - 1287321521) + (((~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | (-1538281042))) | 1529889345) * (-964))) + 16));
                                                int i426 = i425 << 13;
                                                int i427 = (~(i426 & i425)) & (i426 | i425);
                                                int i428 = i427 >>> 17;
                                                int i429 = (~(i427 & i428)) & (i427 | i428);
                                                int i430 = i429 << 5;
                                                int[] iArr5 = (int[]) objArr[1];
                                                int i431 = (i429 & (~i430)) | ((~i429) & i430);
                                                c2 = 0;
                                                iArr5[0] = i431;
                                            } else {
                                                objArr = new java.lang.Object[]{null, new int[1], new int[]{0}, new int[]{0}};
                                                int uptimeMillis6 = (int) android.os.SystemClock.uptimeMillis();
                                                int i432 = ((((-1550052296) | uptimeMillis6) * 376) - 1241345889) + (((~((~uptimeMillis6) | 373904211)) | (-1584135128)) * (-376)) + (((~(uptimeMillis6 | (-373904212))) | 1244313748) * 376);
                                                int i433 = ((i432 | (-1366647372)) << 1) - (i432 ^ (-1366647372));
                                                int i434 = (i433 << 13) ^ i433;
                                                int i435 = i434 >>> 17;
                                                int i436 = (~(i434 & i435)) & (i434 | i435);
                                                c2 = 0;
                                                ((int[]) objArr[1])[0] = i436 ^ (i436 << 5);
                                            }
                                        }
                                    }
                                }
                                c3 = 3;
                                if (((int[]) objArr[c3])[c2] == ((int[]) objArr[2])[c2]) {
                                    int i437 = i + 87;
                                    f = i437 % 128;
                                    if (i437 % 2 == 0) {
                                        return objArr;
                                    }
                                    java.lang.Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                java.lang.Object[] objArr143 = {2};
                                java.lang.Object d34 = com.facetec.sdk.al.d(-1836228463);
                                if (d34 == null) {
                                    char axisFromString4 = (char) ((-1) - android.view.MotionEvent.axisFromString(str8));
                                    int mode3 = android.view.View.MeasureSpec.getMode(0);
                                    int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                    byte b66 = (byte) 0;
                                    byte b67 = b66;
                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                    g(b66, b67, (byte) (b67 + 1), objArr144);
                                    d34 = com.facetec.sdk.al.c(axisFromString4, 455 - mode3, 24 - makeMeasureSpec2, 895621737, false, (java.lang.String) objArr144[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) d34).invoke(null, objArr143)).longValue();
                                long j143 = -448069761;
                                long j144 = 628;
                                long j145 = -627;
                                long j146 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                long j147 = (((((j144 * j143) + (j144 * longValue24)) + (((longValue24 | j146) | (j143 ^ j4)) * j145)) + (j145 * ((((longValue24 ^ j4) | j146) ^ j4) | j143))) + (627 * (((longValue24 | (j146 ^ j4)) ^ j4) | ((j143 | j146) ^ j4)))) - 922457844;
                                int nextInt22 = new java.util.Random().nextInt(2026260234);
                                int myTid11 = android.os.Process.myTid();
                                if (((((int) j147) & (((((~((-168050689) | myTid11)) | 537989673) * 449) - 1660963197) + (((~((~myTid11) | (-168050689))) | 537989673) * 449))) | (((int) (j147 >> 32)) & ((((~((~nextInt22) | (-1538334529))) | 1252002560) * 529) + 1520786966 + (((~(nextInt22 | (-1538334529))) | 1319406356) * 529)))) == 2) {
                                    java.lang.Object[] objArr145 = {null, new int[1], new int[]{270}, new int[]{0}};
                                    int nextInt23 = new java.util.Random().nextInt();
                                    int i438 = ~nextInt23;
                                    int i439 = ((((((~(1529944058 | i438)) | 88273901) * (-1042)) + 2127342962) + ((1529944058 | nextInt23) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) + ((((~(nextInt23 | (-88273902))) | 16782312) | (~(i438 | 1601435647))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) - 1366647356;
                                    int i440 = (i439 << 13) ^ i439;
                                    int i441 = i440 >>> 17;
                                    int i442 = (i440 & (~i441)) | ((~i440) & i441);
                                    ((int[]) objArr145[1])[0] = i442 ^ (i442 << 5);
                                    return objArr145;
                                }
                                java.lang.Object d35 = com.facetec.sdk.al.d(-1753496434);
                                if (d35 == null) {
                                    char keyCodeFromString4 = (char) (409 - android.view.KeyEvent.keyCodeFromString(str8));
                                    str9 = str8;
                                    int offsetAfter3 = android.text.TextUtils.getOffsetAfter(str9, 0);
                                    int lastIndexOf7 = android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    byte b68 = (byte) 0;
                                    byte b69 = b68;
                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                    g(b68, b69, b69, objArr146);
                                    d35 = com.facetec.sdk.al.c(keyCodeFromString4, 2198 - offsetAfter3, lastIndexOf7 + 25, 815054454, false, (java.lang.String) objArr146[0], new java.lang.Class[0]);
                                } else {
                                    str9 = str8;
                                }
                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) d35).invoke(null, null)).longValue();
                                long j148 = -603499577;
                                long j149 = -318;
                                long j150 = j148 ^ j4;
                                long j151 = longValue25 ^ j4;
                                java.lang.String str68 = str9;
                                long nextInt24 = new java.util.Random().nextInt(975550305);
                                long j152 = ((-317) * j148) + (319 * longValue25) + ((((((nextInt24 ^ j4) | j148) | longValue25) ^ j4) | (((j150 | j151) | nextInt24) ^ j4)) * j149) + ((((j151 | j148) ^ j4) | ((j148 | nextInt24) ^ j4)) * j149) + (318 * (((j150 | nextInt24) ^ j4) | j151)) + 1328737115;
                                int elapsedCpuTime9 = (int) android.os.Process.getElapsedCpuTime();
                                int i443 = ~elapsedCpuTime9;
                                int i444 = ((int) (j152 >> 32)) & ((((~(1471693323 | i443)) | (~((-1386047562) | elapsedCpuTime9))) * 959) + 1967134503 + (((~(elapsedCpuTime9 | 1471693323)) | (~(i443 | (-1386047562)))) * 959));
                                int myTid12 = android.os.Process.myTid();
                                int i445 = ~myTid12;
                                int i446 = ((int) j152) & ((((~(920494985 | i445)) | (-2013112270) | (~((-844628617) | myTid12))) * 717) + 1711839461 + (((~(myTid12 | 920494985)) | (~(i445 | (-844628617))) | (-2013112270)) * 717));
                                if (((i444 ^ i446) | (i444 & i446)) != 0) {
                                    java.lang.Object[] objArr147 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, new int[]{0}};
                                    int myPid12 = android.os.Process.myPid();
                                    int i447 = (~((-108753996) | myPid12)) | 7869448;
                                    int i448 = ((((i447 * 992) + 2140994647) + ((i447 | (~((~myPid12) | 1610348511))) * (-496))) + ((myPid12 | 1509463964) * 496)) - 1366647356;
                                    int i449 = (i448 << 13) ^ i448;
                                    int i450 = i449 ^ (i449 >>> 17);
                                    int i451 = i450 << 5;
                                    ((int[]) objArr147[1])[0] = (~(i450 & i451)) & (i450 | i451);
                                    return objArr147;
                                }
                                long[] jArr3 = {624887784092251L};
                                int i452 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int keyRepeatTimeout3 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                int i453 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                h((char) (((53234 | i452) << 1) - (i452 ^ 53234)), 303 - (keyRepeatTimeout3 >> 16), (i453 ^ 16) + ((i453 & 16) << 1), objArr148);
                                java.lang.Object[] objArr149 = {(java.lang.String) objArr148[0], 3, 2251799813685247L, jArr3};
                                java.lang.Object d36 = com.facetec.sdk.al.d(2143203995);
                                if (d36 == null) {
                                    char mode4 = (char) (android.view.View.MeasureSpec.getMode(0) + 18697);
                                    str10 = str68;
                                    int offsetAfter4 = android.text.TextUtils.getOffsetAfter(str10, 0);
                                    int indexOf11 = android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    byte b70 = (byte) 0;
                                    byte b71 = b70;
                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                    g(b70, b71, (byte) (b71 + 3), objArr150);
                                    d36 = com.facetec.sdk.al.c(mode4, 1787 - offsetAfter4, indexOf11 + 25, -665728925, false, (java.lang.String) objArr150[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                } else {
                                    str10 = str68;
                                }
                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) d36).invoke(null, objArr149)).longValue();
                                long j153 = -484204406;
                                long j154 = -754;
                                long j155 = j153 ^ j4;
                                long j156 = j155 | longValue26;
                                long uptimeMillis7 = (int) android.os.SystemClock.uptimeMillis();
                                long j157 = uptimeMillis7 ^ j4;
                                long j158 = (((((755 * j153) + ((-753) * longValue26)) + ((((j156 ^ j4) | ((j155 | uptimeMillis7) ^ j4)) | ((longValue26 | uptimeMillis7) ^ j4)) * j154)) + (j154 * (((longValue26 | (j153 | j157)) ^ j4) | ((j156 | uptimeMillis7) ^ j4)))) + (754 * (j157 | j155))) - 16410228;
                                int nextInt25 = new java.util.Random().nextInt(1350069167);
                                int i454 = ~nextInt25;
                                int i455 = ((int) (j158 >> 32)) & ((((27328648 | i454) * (-192)) - 1788177110) + (((~(1375159022 | i454)) | (-1509910511)) * (-384)) + (((~(nextInt25 | 1509910510)) | (~(i454 | (-134751489))) | (~((-1347830375) | nextInt25))) * 192));
                                int maxMemory9 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i456 = ((int) j158) & (((((~(2002029233 | r5)) | 855711652) * (-1042)) - 1668231968) + ((2002029233 | maxMemory9) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(maxMemory9 | (-855711653))) | 855640736 | (~((~maxMemory9) | 2002100149))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                if (((i455 ^ i456) | (i455 & i456)) != 0) {
                                    f = (i + 49) % 128;
                                    java.lang.Object[] objArr151 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, new int[]{0}};
                                    int elapsedCpuTime10 = (int) android.os.Process.getElapsedCpuTime();
                                    int i457 = ~elapsedCpuTime10;
                                    int i458 = (((~((-103955414) | i457)) | (-1514262547)) * (-865)) + 1473259978 + ((~(elapsedCpuTime10 | 103955413)) * 865) + (((~((-1514262547) | i457)) | (~(i457 | 103955413))) * 865);
                                    int i459 = ((i458 | 16) << 1) - (i458 ^ 16);
                                    int e16 = com.facetec.sdk.fp.b.e();
                                    int i460 = i459 * (-559);
                                    int i461 = ~e16;
                                    int i462 = (1366647371 & i459) | (1366647371 ^ i459);
                                    int i463 = ((((2109970292 ^ i460) + ((i460 & 2109970292) << 1)) - (~(-(-((~((i461 & i459) | (i461 ^ i459))) * (-560)))))) - 1) + ((~((e16 ^ i462) | (i462 & e16))) * (-560));
                                    int i464 = ~i459;
                                    int i465 = ~((i464 ^ (-1366647372)) | (i464 & (-1366647372)));
                                    int i466 = ~(((-1366647372) ^ i461) | (i461 & (-1366647372)));
                                    int i467 = -(-(((i465 ^ i466) | (i465 & i466)) * 560));
                                    int i468 = (i463 ^ i467) + ((i467 & i463) << 1);
                                    int i469 = i468 << 13;
                                    int i470 = (~(i469 & i468)) & (i469 | i468);
                                    int i471 = i470 ^ (i470 >>> 17);
                                    ((int[]) objArr151[1])[0] = i471 ^ (i471 << 5);
                                    return objArr151;
                                }
                                char c29 = (char) ((-2) - (~(-android.view.MotionEvent.axisFromString(str10))));
                                int i472 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                h(c29, (i472 ^ 362) + ((i472 & 362) << 1), 10 - (~(-(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr152);
                                java.lang.Object[] objArr153 = {(java.lang.String) objArr152[0]};
                                java.lang.Object d37 = com.facetec.sdk.al.d(1873189073);
                                if (d37 == null) {
                                    char jumpTapTimeout = (char) (6935 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                    int indexOf12 = android.text.TextUtils.indexOf(str10, str10);
                                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                    byte b72 = (byte) 0;
                                    byte b73 = b72;
                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                    g(b72, b73, (byte) (b73 + 1), objArr154);
                                    d37 = com.facetec.sdk.al.c(jumpTapTimeout, 2389 - indexOf12, packedPositionType + 23, -934682071, false, (java.lang.String) objArr154[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) d37).invoke(null, objArr153)).longValue();
                                long j159 = -8734940;
                                int i473 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                long j160 = com.visa.cbp.getCertUsage.setODAData;
                                long j161 = j159 ^ j4;
                                long j162 = com.visa.cbp.getCertUsage.getODAData;
                                java.lang.String str69 = str10;
                                long j163 = i473;
                                long j164 = j163 ^ j4;
                                long j165 = ((-665) * j159) + (j160 * longValue27) + ((-333) * j161) + ((((j161 | j164) ^ j4) | ((longValue27 | j163) ^ j4)) * j162) + (j162 * (((longValue27 | j164) ^ j4) | ((j163 | j161) ^ j4))) + 945814583;
                                int maxMemory10 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i474 = ((int) (j165 >> 32)) & ((((1074102608 | r3) * (-476)) - 1782476110) + ((~((-25170947) | maxMemory10)) * 952) + ((~((~maxMemory10) | (-25170947))) * 476));
                                int elapsedRealtime5 = (int) android.os.SystemClock.elapsedRealtime();
                                int i475 = ((int) j165) & ((((((~(85970055 | r4)) | 1351256354) | (~((-85970056) | elapsedRealtime5))) * (-564)) - 780324911) + ((~(elapsedRealtime5 | (-85279878))) * 1128) + (((~(1351256354 | (~elapsedRealtime5))) | 690178) * 564));
                                if (((i474 ^ i475) | (i474 & i475)) != 0) {
                                    java.lang.Object[] objArr155 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                    int myPid13 = android.os.Process.myPid();
                                    int i476 = ~myPid13;
                                    int i477 = (((~((-8915256) | myPid13)) | 2311 | (~(1609302704 | myPid13))) * (-754)) + 1811891589 + (((~(myPid13 | (-2312))) | (~(1609305015 | i476))) * (-754)) + (((-8915256) | i476) * 754);
                                    int i478 = -(-((i477 ^ 16) + ((i477 & 16) << 1)));
                                    int i479 = (i478 & (-1366647372)) + (i478 | (-1366647372));
                                    int i480 = i479 << 13;
                                    int i481 = ((~i480) & i479) | ((~i479) & i480);
                                    int i482 = i481 >>> 17;
                                    int i483 = (~(i481 & i482)) & (i481 | i482);
                                    ((int[]) objArr155[1])[0] = i483 ^ (i483 << 5);
                                    return objArr155;
                                }
                                java.lang.Object d38 = com.facetec.sdk.al.d(-2029373905);
                                if (d38 == null) {
                                    char c30 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19037);
                                    int scrollBarFadeDuration4 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                    int defaultSize3 = android.view.View.getDefaultSize(0, 0);
                                    byte b74 = (byte) 0;
                                    byte b75 = b74;
                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                    g(b74, b75, (byte) (b75 + 1), objArr156);
                                    d38 = com.facetec.sdk.al.c(c30, (scrollBarFadeDuration4 >> 16) + 940, 24 - defaultSize3, 551898327, false, (java.lang.String) objArr156[0], new java.lang.Class[0]);
                                }
                                long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) d38).invoke(null, null)).longValue();
                                long j166 = 218801825;
                                long j167 = longValue28 ^ j4;
                                long j168 = 494;
                                long j169 = j166 ^ j4;
                                long myTid13 = android.os.Process.myTid() ^ j4;
                                long j170 = (495 * j166) + ((-493) * longValue28) + ((-988) * (j166 | j167)) + ((longValue28 | j169 | myTid13) * j168) + (j168 * (((longValue28 | j166) ^ j4) | ((myTid13 | longValue28) ^ j4) | ((j167 | j169) ^ j4))) + 328115911;
                                int i484 = ((int) (j170 >> 32)) & (((((~(537329721 | r2)) | (-1974556133)) * (-983)) - 2048784265) + (((~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | (-1974556133))) | 536936480) * 983));
                                int nextInt26 = new java.util.Random().nextInt();
                                int i485 = ~nextInt26;
                                int i486 = ((int) j170) & ((((~((-409525691) | i485)) | (~(1846752100 | nextInt26)) | (~((-1846752101) | i485))) * 959) + 834615598 + (((~(nextInt26 | (-409525691))) | (~(i485 | 1846752100)) | (~((-1846752101) | nextInt26))) * 959));
                                if (((i484 ^ i486) | (i484 & i486)) != 0) {
                                    i = (f + 113) % 128;
                                    java.lang.Object[] objArr157 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, new int[]{0}};
                                    int freeMemory4 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                    int i487 = -(-(((((-527688648) | freeMemory4) * 376) - 1241345889) + (((~((~freeMemory4) | 753948436)) | (-1072953304)) * (-376)) + (((~(freeMemory4 | (-753948437))) | 864269523) * 376) + 16));
                                    int i488 = (i487 & (-1366647372)) + (i487 | (-1366647372));
                                    int i489 = i488 << 13;
                                    int i490 = (~(i489 & i488)) & (i489 | i488);
                                    int i491 = i490 >>> 17;
                                    int i492 = (~(i490 & i491)) & (i490 | i491);
                                    int i493 = i492 << 5;
                                    ((int[]) objArr157[1])[0] = (i492 & (~i493)) | ((~i492) & i493);
                                    return objArr157;
                                }
                                java.lang.Object d39 = com.facetec.sdk.al.d(1671466082);
                                if (d39 == null) {
                                    str11 = str69;
                                    char capsMode2 = (char) (android.text.TextUtils.getCapsMode(str11, 0, 0) + 58898);
                                    int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout();
                                    int scrollBarFadeDuration5 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                    byte b76 = (byte) 0;
                                    byte b77 = b76;
                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                    g(b76, b77, (byte) (b77 + 3), objArr158);
                                    d39 = com.facetec.sdk.al.c(capsMode2, (jumpTapTimeout2 >> 16) + 1529, 23 - (scrollBarFadeDuration5 >> 16), -1001392486, false, (java.lang.String) objArr158[0], new java.lang.Class[0]);
                                } else {
                                    str11 = str69;
                                }
                                long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) d39).invoke(null, null)).longValue();
                                long j171 = -1011065936;
                                int maxMemory11 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j172 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                                long j173 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                long j174 = maxMemory11;
                                java.lang.String str70 = str11;
                                long j175 = j174 ^ j4;
                                long j176 = (((((j172 * j171) + ((-215) * longValue29)) + (((j171 | j174) ^ j4) * j173)) + ((-216) * (((longValue29 ^ j4) | j171) | j175))) + (j173 * (((j171 | j175) ^ j4) | longValue29))) - 587445943;
                                int nextInt27 = new java.util.Random().nextInt(65481796);
                                int i494 = ((int) (j176 >> 32)) & (((((-272766341) | nextInt27) * 376) - 2088991750) + (((~((~nextInt27) | 854865303)) | (-854996376)) * (-376)) + (((~(nextInt27 | (-854865304))) | 582361107) * 376));
                                int i495 = ~android.os.Process.myUid();
                                int i496 = ((int) j176) & ((((-696361217) | i495) * 494) + 3833087 + (((~(i495 | (-1065745229))) | (-698458386)) * 494));
                                if (((i494 ^ i496) | (i494 & i496)) != 0) {
                                    java.lang.Object[] objArr159 = {null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, new int[]{0}};
                                    int maxMemory12 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    int i497 = ((((~((-1124884825) | r3)) | 493333135) * 226) - 851784976) + (((~((~maxMemory12) | (-1107837265))) | (~((-493333136) | maxMemory12)) | 476285575) * (-113)) + ((~(maxMemory12 | (-1124884825))) * 113);
                                    int i498 = -(-((i497 & 16) + (i497 | 16)));
                                    int i499 = (i498 ^ (-1366647372)) + ((i498 & (-1366647372)) << 1);
                                    int i500 = i499 << 13;
                                    int i501 = ((~i500) & i499) | ((~i499) & i500);
                                    int i502 = i501 >>> 17;
                                    int i503 = (~(i501 & i502)) & (i501 | i502);
                                    ((int[]) objArr159[1])[0] = i503 ^ (i503 << 5);
                                    return objArr159;
                                }
                                java.lang.Object[] objArr160 = {0, obj, -1366647372, 16777216};
                                java.lang.Object d40 = com.facetec.sdk.al.d(-1695430476);
                                if (d40 == null) {
                                    str12 = str70;
                                    d40 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(0), 2270 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.indexOf(str12, str12, 0) + 24, 1025421900, false, null, new java.lang.Class[]{java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) android.text.TextUtils.getTrimmedLength(str12), 2247 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-16777192) - android.graphics.Color.rgb(0, 0, 0)), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                } else {
                                    str12 = str70;
                                }
                                java.lang.Object newInstance = ((java.lang.reflect.Constructor) d40).newInstance(objArr160);
                                try {
                                    int i504 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i505 = -android.view.View.combineMeasuredStates(0, 0);
                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                    h((char) ((i504 ^ 1) + ((i504 & 1) << 1)), (i505 ^ 372) + ((i505 & 372) << 1), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr161);
                                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr161[0]);
                                    int i506 = -android.text.TextUtils.indexOf(str12, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int e17 = com.facetec.sdk.fp.b.e();
                                    int i507 = (i506 * (-129)) + 485879;
                                    int i508 = ~e17;
                                    int i509 = -(-((~((i508 ^ (-3710)) | (i508 & (-3710)) | i506)) * 130));
                                    int i510 = (i507 ^ i509) + ((i507 & i509) << 1);
                                    int i511 = (~(i506 | (-3710))) * (-260);
                                    int i512 = (i510 & i511) + (i511 | i510);
                                    int i513 = ~i506;
                                    int i514 = (i506 ^ (-3710)) | (i506 & (-3710));
                                    int i515 = -(-(((~((i514 ^ e17) | (i514 & e17))) | (~((i513 & 3709) | (i513 ^ 3709)))) * 130));
                                    char c31 = (char) ((i512 ^ i515) + ((i515 & i512) << 1));
                                    int i516 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                    j("\u0000\u0000\u0000\u0000", c31, "迩⽆驐㉛웴", "땔\uefa0縟䨎", (535797942 & i516) + (i516 | 535797942), objArr162);
                                    cls.getMethod((java.lang.String) objArr162[0], null).invoke(newInstance, null);
                                    java.lang.Object[] objArr163 = {null, new int[1], new int[]{0}, new int[]{0}};
                                    int myPid14 = android.os.Process.myPid();
                                    int i517 = (-1366647373) - (~((((((~((~myPid14) | (-744917415))) | 873300545) * (-235)) - 1285453153) + (((~((-744917415) | myPid14)) | 873300545) * (-470))) + (((~(myPid14 | (-140642727))) | 269025857) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)));
                                    int i518 = i517 << 13;
                                    int i519 = (~(i518 & i517)) & (i518 | i517);
                                    int i520 = i519 >>> 17;
                                    int i521 = (i519 & (~i520)) | ((~i519) & i520);
                                    int i522 = i521 << 5;
                                    ((int[]) objArr163[1])[0] = (i521 & (~i522)) | ((~i521) & i522);
                                    return objArr163;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause3 = th6.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th6;
                                }
                            }
                            objArr = new java.lang.Object[]{null, new int[1], new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{0}};
                            int i523 = ~((int) android.os.Process.getElapsedCpuTime());
                            int i524 = (((-201411396) | i523) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 944085855 + (((~(i523 | 862630052)) | (-509864936)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                            int i525 = (-1366647373) - (~(-(-(((i524 | 16) << 1) - (i524 ^ 16)))));
                            int i526 = i525 << 13;
                            int i527 = (~(i526 & i525)) & (i526 | i525);
                            int i528 = i527 >>> 17;
                            int i529 = (~(i527 & i528)) & (i527 | i528);
                            int i530 = i529 << 5;
                            ((int[]) objArr[1])[0] = (~(i529 & i530)) & (i529 | i530);
                            str6 = str49;
                            str8 = str6;
                            c3 = 3;
                            c2 = 0;
                            if (((int[]) objArr[c3])[c2] == ((int[]) objArr[2])[c2]) {
                            }
                        }
                        java.lang.Object[] objArr164 = {(java.lang.String) objArr2[0]};
                        java.lang.Object d41 = com.facetec.sdk.al.d(1590238701);
                        if (d41 == null) {
                            char rgb2 = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                            int keyRepeatDelay3 = android.view.ViewConfiguration.getKeyRepeatDelay();
                            int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte b78 = (byte) 0;
                            byte b79 = b78;
                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                            g(b78, b79, b79, objArr165);
                            d41 = com.facetec.sdk.al.c(rgb2, 2078 - (keyRepeatDelay3 >> 16), 24 - makeMeasureSpec3, -114923755, false, (java.lang.String) objArr165[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.Object invoke7 = ((java.lang.reflect.Method) d41).invoke(null, objArr164);
                        if (invoke7 != null) {
                            int i531 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int e18 = com.facetec.sdk.fp.b.e();
                            int i532 = (i531 * (-716)) - 1435;
                            int i533 = ~i531;
                            int i534 = -(-(((~i533) | i533) * (-1434)));
                            int i535 = ~e18;
                            int i536 = ~((~i535) | i535);
                            int i537 = ~(i531 | i533);
                            int i538 = i536 | i537;
                            int i539 = ~((e18 ^ i533) | (e18 & i533));
                            int i540 = ~((i533 & i535) | (i533 ^ i535));
                            char c32 = (char) ((((((i532 | i534) << 1) - (i532 ^ i534)) + (((i539 ^ i538) | (i539 & i538)) * 717)) - (~(-(-(((i537 ^ i540) | (i537 & i540)) * 717))))) - 1);
                            int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                            int e19 = com.facetec.sdk.fp.b.e();
                            int i541 = minimumFlingVelocity2 * (-518);
                            int i542 = ((543246454 | i541) << 1) - (i541 ^ 543246454);
                            int i543 = ~minimumFlingVelocity2;
                            int i544 = ~e19;
                            int i545 = (i543 ^ i544) | (i544 & i543);
                            int i546 = ~i545;
                            int i547 = -(-(((i546 ^ 1076838807) | (1076838807 & i546)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                            int i548 = ((i542 | i547) << 1) - (i542 ^ i547);
                            int i549 = ~((i545 ^ 1076838807) | (1076838807 & i545));
                            int i550 = 1076838807 | minimumFlingVelocity2;
                            int i551 = ~((i550 ^ e19) | (i550 & e19));
                            int i552 = -(-(((i549 ^ i551) | (i549 & i551)) * (-519)));
                            int i553 = ~((e19 ^ 1076838807) | (1076838807 & e19));
                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                            j("\u0000\u0000\u0000\u0000", c32, "鸽釒嶄틲໖稵뺖", "靗⽁\ue140⧥", (((i548 & i552) + (i552 | i548)) - (~(((minimumFlingVelocity2 ^ i553) | (minimumFlingVelocity2 & i553)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - 1, objArr166);
                            if (invoke7.equals((java.lang.String) objArr166[0])) {
                                char myPid15 = (char) (android.os.Process.myPid() >> 22);
                                int i554 = -(android.os.Process.myPid() >> 22);
                                java.lang.Object[] objArr167 = new java.lang.Object[1];
                                j("\u0000\u0000\u0000\u0000", myPid15, "퓡渾盯九麀觮瑏딕먖\uf0ee핒耾腝뽊脲⭐ꊄҴ1⫖䫋◲塔", "忭\ud941ﭔ⃫", ((1423524191 | i554) << 1) - (i554 ^ 1423524191), objArr167);
                                try {
                                    java.lang.Object[] objArr168 = {(java.lang.String) objArr167[0]};
                                    java.lang.Object d42 = com.facetec.sdk.al.d(1590238701);
                                    if (d42 == null) {
                                        char threadPriority2 = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                                        int rgb3 = android.graphics.Color.rgb(0, 0, 0);
                                        byte b80 = (byte) 0;
                                        byte b81 = b80;
                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                        g(b80, b81, b81, objArr169);
                                        d42 = com.facetec.sdk.al.c(threadPriority2, (pressedStateDuration >> 16) + 2078, (-16777192) - rgb3, -114923755, false, (java.lang.String) objArr169[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    java.lang.String str71 = (java.lang.String) ((java.lang.reflect.Method) d42).invoke(null, objArr168);
                                    if (str71 != null) {
                                        int i555 = f + 87;
                                        i = i555 % 128;
                                        if (i555 % 2 == 0) {
                                            java.lang.Integer.parseInt(str71);
                                            java.lang.Object obj7 = null;
                                            obj7.hashCode();
                                            throw null;
                                        }
                                        int parseInt = java.lang.Integer.parseInt(str71);
                                        if (parseInt != 0) {
                                            com.facetec.sdk.fp.b.e();
                                            com.facetec.sdk.fp.b.e();
                                            i6 = (parseInt & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) + (parseInt | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                                            if (i6 != 0) {
                                            }
                                        }
                                    }
                                } catch (java.lang.Throwable th7) {
                                    java.lang.Throwable cause4 = th7.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th7;
                                }
                            }
                        }
                        i6 = 0;
                        if (i6 != 0) {
                        }
                    } catch (java.lang.Throwable th8) {
                        java.lang.Throwable cause5 = th8.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th8;
                    }
                    int i556 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i557 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                    int i558 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                    objArr2 = new java.lang.Object[1];
                    h((char) (((50142 | i556) << 1) - (i556 ^ 50142)), (i557 ^ 225) + ((i557 & 225) << 1), (i558 ^ 18) + ((i558 & 18) << 1), objArr2);
                } else {
                    strArr3 = strArr5;
                    obj2 = invoke6;
                    str14 = str20;
                }
                if (obj2 != null) {
                    java.lang.Object[] objArr170 = {obj2, 42};
                    java.lang.Object d43 = com.facetec.sdk.al.d(-582857820);
                    if (d43 == null) {
                        char minimumFlingVelocity3 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int longPressTimeout4 = android.view.ViewConfiguration.getLongPressTimeout();
                        int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                        byte b82 = (byte) 0;
                        byte b83 = b82;
                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                        g(b82, b83, (byte) (b83 + 1), objArr171);
                        d43 = com.facetec.sdk.al.c(minimumFlingVelocity3, 2365 - (longPressTimeout4 >> 16), argb2 + 24, 2058170716, false, (java.lang.String) objArr171[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                    }
                    long longValue30 = ((java.lang.Long) ((java.lang.reflect.Method) d43).invoke(null, objArr170)).longValue();
                    long j177 = -788010544;
                    long j178 = 672;
                    long elapsedCpuTime11 = (int) android.os.Process.getElapsedCpuTime();
                    str3 = str14;
                    long j179 = elapsedCpuTime11 ^ j4;
                    long j180 = longValue30 ^ j4;
                    long j181 = (673 * j177) + ((-1343) * longValue30) + ((((j177 | elapsedCpuTime11) ^ j4) | longValue30) * j178) + ((-672) * (((elapsedCpuTime11 | longValue30) ^ j4) | (((j177 ^ j4) | j179) ^ j4))) + (j178 * (((j180 | j179) ^ j4) | ((j180 | j177) ^ j4))) + 1947207942;
                    int myTid14 = android.os.Process.myTid();
                    int i559 = ~myTid14;
                    int i560 = ((int) (j181 >> 32)) & ((((((~((-1201424609) | i559)) | 1099972640) | r2) * (-713)) - 1563447568) + ((~(myTid14 | (-134349835))) * 1426) + ((~((-235801803) | i559)) * 713));
                    int uptimeMillis8 = (int) android.os.SystemClock.uptimeMillis();
                    int i561 = ~uptimeMillis8;
                    int i562 = ((int) j181) & ((((~((-658423632) | i561)) | (-2095650042)) * (-602)) + 318850644 + (((~(uptimeMillis8 | (-658423632))) | 51817222 | (~((-1489043633) | i561))) * (-301)) + ((~((-2095650042) | i561)) * 301));
                } else {
                    str3 = str14;
                }
                java.lang.Object[] objArr832 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "뵘閐\ue363麚எ揿꒿੫\udbee쿹ᨫ\uea58켷\uddb5瞨㲣勞⅛袉辡檼뙖⧗", "ꦆ$䲡北", android.graphics.Color.argb(0, 0, 0, 0) - 1593826135, objArr832);
                java.lang.Object[] objArr842 = {(java.lang.String) objArr832[0]};
                d2 = com.facetec.sdk.al.d(-864328554);
                if (d2 == null) {
                }
                long longValue122 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr842)).longValue();
                long j702 = -99437248;
                long j712 = 130;
                long j722 = longValue122 ^ j4;
                java.lang.String str492 = str4;
                long myPid82 = android.os.Process.myPid();
                long j732 = j722 | j702;
                long j742 = ((-129) * j702) + (131 * longValue122) + ((((j722 | (myPid82 ^ j4)) | j702) ^ j4) * j712) + ((-260) * (j732 ^ j4)) + (j712 * (((longValue122 | (j702 ^ j4)) ^ j4) | ((j732 | myPid82) ^ j4))) + 1147635668;
                int nextInt92 = new java.util.Random().nextInt(1672695563);
                int i1692 = ~nextInt92;
                int i1702 = ((int) (j742 >> 32)) & (((((~(699024489 | nextInt92)) | (~(2136250900 | i1692))) * (-1808)) - 1851217734) + (((~((-1448385045) | nextInt92)) | (~((-11158634) | i1692))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(nextInt92 | (-2136250901))) | (-2147409534) | (~(i1692 | (-699024490)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                int myTid82 = android.os.Process.myTid();
                int i1712 = ~myTid82;
                int i1722 = ~(1440461576 | myTid82);
                int i1732 = ((int) j742) & ((((~((-3235167) | i1712)) | i1722) * 1150) + 334239082 + ((i1722 | (~((-1440461577) | i1712))) * (-575)) + (((~(myTid82 | (-3235167))) | (~(i1712 | 3235166))) * 575));
                j8 = (i1702 ^ i1732) | (i1702 & i1732);
                java.lang.Object[] objArr862 = new java.lang.Object[1];
                h((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 174 - (~(-android.text.TextUtils.lastIndexOf(str492, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))), 17 - android.view.KeyEvent.normalizeMetaState(0), objArr862);
                java.lang.Object[] objArr872 = {(java.lang.String) objArr862[0]};
                d3 = com.facetec.sdk.al.d(-864328554);
                if (d3 == null) {
                }
                long longValue132 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr872)).longValue();
                long j752 = -1040119239;
                long myUid32 = android.os.Process.myUid();
                long j762 = longValue132 ^ j4;
                long j772 = (j6 * j752) + (j7 * longValue132) + ((((longValue132 | j752) | myUid32) ^ j4) * j3) + ((((j762 | myUid32) ^ j4) | (((myUid32 ^ j4) | j752) ^ j4)) * j3) + (((((j752 ^ j4) | myUid32) ^ j4) | j762) * j5) + 2088317659;
                int nextInt102 = new java.util.Random().nextInt();
                int i1742 = ((int) (j772 >> 32)) & ((((~((-1811987610) | nextInt102)) | (-2052512376)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1322639844 + (((~((~nextInt102) | (-1811987610))) | (-2052512376)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                int nextInt112 = new java.util.Random().nextInt(123973977);
                int i1752 = ~nextInt112;
                int i1762 = ((int) j772) & ((((~((-474153190) | i1752)) | 67108897) * (-108)) + 2060331471 + (((~(i1752 | (-963073221))) | (~(963073220 | nextInt112)) | 556028928) * 54) + ((nextInt112 | 556028928) * 54));
                long j782 = (i1742 ^ i1762) | (i1742 & i1762);
                if (j8 > 0) {
                }
                java.lang.Object[] objArr902 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "뵘閐\ue363麚எ揿꒿੫\udbee쿹ᨫ\uea58켷\uddb5瞨㲣勞⅛袉辡檼뙖⧗", "ꦆ$䲡北", (-1593826135) - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr902);
                java.lang.Object[] objArr912 = {(java.lang.String) objArr902[0]};
                d4 = com.facetec.sdk.al.d(-864328554);
                if (d4 == null) {
                }
                long longValue142 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr912)).longValue();
                long j792 = 751535169;
                long j802 = -755;
                long j812 = ((j792 ^ j4) | (longValue142 ^ j4)) ^ j4;
                long j822 = longValue142 | j792;
                long nextInt132 = new java.util.Random().nextInt();
                long j832 = (j792 * j802) + (j802 * longValue142) + (1512 * j812) + ((-756) * (((j822 | nextInt132) ^ j4) | j812)) + (756 * (j822 | (nextInt132 ^ j4))) + 296663251;
                int freeMemory5 = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i1832 = (~((-215998651) | freeMemory5)) | 147480752;
                int i1842 = ((int) (j832 >> 32)) & ((i1832 * 992) + 1537498186 + ((i1832 | (~((~freeMemory5) | 1289745658))) * (-496)) + ((freeMemory5 | 1221227760) * 496));
                int i1852 = (int) j832;
                int myPid92 = android.os.Process.myPid();
                int i1862 = ~myPid92;
                int i1872 = i1852 & ((((-1933499755) | i1862) * (-757)) + 1765507630 + ((~((-286557505) | myPid92)) * 1514) + (((~(myPid92 | (-1646942251))) | (~(i1862 | (-496273345))) | 209715840) * 757));
                j9 = (i1842 ^ i1872) | (i1842 & i1872);
                int resolveOpacity22 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                int e72 = com.facetec.sdk.fp.b.e();
                int i1882 = ~e72;
                int i1892 = ~((i1882 ^ resolveOpacity22) | (i1882 & resolveOpacity22));
                int i1902 = ~resolveOpacity22;
                int i1912 = (i1902 ^ (-56928)) | ((-56928) & i1902);
                int i1922 = ~((i1912 ^ e72) | (e72 & i1912));
                int i1932 = ((resolveOpacity22 * 860) - 48843366) + (((e72 & resolveOpacity22) | (resolveOpacity22 ^ e72)) * (-859)) + (((i1922 & i1892) | (i1892 ^ i1922)) * 859);
                int i1942 = ~(((-56928) ^ i1882) | (i1882 & (-56928)));
                int i1952 = ~((resolveOpacity22 ^ (-56928)) | ((-56928) & resolveOpacity22));
                int i1962 = -(-(((i1942 ^ i1952) | (i1952 & i1942)) * 859));
                java.lang.Object[] objArr932 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) ((i1932 & i1962) + (i1962 | i1932)), "状흉ꤜ쫥", "觖⥲引痞", android.view.KeyEvent.normalizeMetaState(0), objArr932);
                java.lang.Object[] objArr942 = {(java.lang.String) objArr932[0]};
                d5 = com.facetec.sdk.al.d(-864328554);
                if (d5 == null) {
                }
                long longValue152 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr942)).longValue();
                long j842 = 583231972;
                long j852 = 52;
                long nextInt142 = new java.util.Random().nextInt(667039300) ^ j4;
                long j862 = nextInt142 | j842;
                long j872 = longValue152 ^ j4;
                long j882 = j842 ^ j4;
                long j892 = ((-51) * j842) + (53 * longValue152) + (((j862 | longValue152) ^ j4) * j852) + ((-52) * (((j872 | j842) ^ j4) | ((j872 | nextInt142) ^ j4) | (j862 ^ j4))) + (j852 * (((j882 | longValue152) ^ j4) | ((j882 | nextInt142) ^ j4))) + 464966448;
                int freeMemory22 = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i1972 = ~freeMemory22;
                int i1982 = ((int) (j892 >> 32)) & ((((-1646384266) | freeMemory22) * 140) + 777117962 + (((~((-1646384266) | i1972)) | 570425344) * (-280)) + (((~(freeMemory22 | (-570425345))) | (~(i1972 | (-1211356620))) | 135397698) * 140));
                int i1992 = ~new java.util.Random().nextInt(1415605373);
                int i2002 = ((int) j892) & (((((-1384597703) | r4) * 764) - 449473107) + (((~(i1992 | (-1384597703))) | 1350844420) * (-1528)) + ((1369719845 | (~((-52628708) | i1992))) * 764));
                long j902 = (i1982 ^ i2002) | (i1982 & i2002);
                if (j9 > 0) {
                }
                int i2242 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                char c172 = (char) ((i2242 & 1) + (i2242 | 1));
                java.lang.Object[] objArr972 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", c172, "샰⤡ૅ팲뒇䠤Ώ", "璏പ笣ꧻ", 588065396 - android.view.View.resolveSize(0, 0), objArr972);
                java.lang.String str502 = (java.lang.String) objArr972[0];
                java.lang.Object[] objArr982 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.red(0), "\uf3a3췧\u0ef2蝓\ua8cb룖ﹰǥ攬₶歛", "칂翵婘\ud83a", 1484781005 - (~(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr982);
                java.lang.String str512 = (java.lang.String) objArr982[0];
                char c182 = (char) (15783 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))));
                int i2252 = -android.view.KeyEvent.keyCodeFromString(str492);
                int i2262 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                java.lang.Object[] objArr992 = new java.lang.Object[1];
                h(c182, (i2252 & 193) + (i2252 | 193), (i2262 & 12) + (i2262 | 12), objArr992);
                java.lang.String str522 = (java.lang.String) objArr992[0];
                java.lang.Object[] objArr1002 = new java.lang.Object[1];
                j("\u0000\u0000\u0000\u0000", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u1fd4͑ڢ欧퐉菂敁Ŕ飹땊챽腥", "྆\ued11举璳", android.os.Process.myPid() >> 22, objArr1002);
                java.lang.String str532 = (java.lang.String) objArr1002[0];
                char c192 = (char) (0 - (~android.text.TextUtils.lastIndexOf(str492, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                int i2272 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                int packedPositionChild22 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                java.lang.Object[] objArr1012 = new java.lang.Object[1];
                h(c192, (i2272 ^ 205) + ((i2272 & 205) << 1), (packedPositionChild22 & 12) + (packedPositionChild22 | 12), objArr1012);
                java.lang.String str542 = (java.lang.String) objArr1012[0];
                char combineMeasuredStates2 = (char) (android.view.View.combineMeasuredStates(0, 0) + 40729);
                int i2282 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i2292 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                java.lang.Object[] objArr1022 = new java.lang.Object[1];
                h(combineMeasuredStates2, ((i2282 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1) - (i2282 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE), (i2292 ^ 6) + ((i2292 & 6) << 1), objArr1022);
                java.lang.String str552 = (java.lang.String) objArr1022[0];
                char c202 = (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
                int keyRepeatDelay22 = android.view.ViewConfiguration.getKeyRepeatDelay();
                int keyCodeFromString22 = android.view.KeyEvent.keyCodeFromString(str492);
                java.lang.Object[] objArr1032 = new java.lang.Object[1];
                h(c202, (keyRepeatDelay22 >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, ((keyCodeFromString22 | 4) << 1) - (keyCodeFromString22 ^ 4), objArr1032);
                strArr = new java.lang.String[]{str502, str512, str522, str532, str542, str552, (java.lang.String) objArr1032[0]};
                i4 = 0;
                while (true) {
                    if (i4 >= 7) {
                    }
                    i4 = ((i9 & 1) << 1) + (i9 ^ 1);
                    strArr = strArr2;
                }
                if (i5 != 0) {
                }
            }
        }
        str3 = str20;
        java.lang.Object[] objArr8322 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "뵘閐\ue363麚எ揿꒿੫\udbee쿹ᨫ\uea58켷\uddb5瞨㲣勞⅛袉辡檼뙖⧗", "ꦆ$䲡北", android.graphics.Color.argb(0, 0, 0, 0) - 1593826135, objArr8322);
        java.lang.Object[] objArr8422 = {(java.lang.String) objArr8322[0]};
        d2 = com.facetec.sdk.al.d(-864328554);
        if (d2 == null) {
        }
        long longValue1222 = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr8422)).longValue();
        long j7022 = -99437248;
        long j7122 = 130;
        long j7222 = longValue1222 ^ j4;
        java.lang.String str4922 = str4;
        long myPid822 = android.os.Process.myPid();
        long j7322 = j7222 | j7022;
        long j7422 = ((-129) * j7022) + (131 * longValue1222) + ((((j7222 | (myPid822 ^ j4)) | j7022) ^ j4) * j7122) + ((-260) * (j7322 ^ j4)) + (j7122 * (((longValue1222 | (j7022 ^ j4)) ^ j4) | ((j7322 | myPid822) ^ j4))) + 1147635668;
        int nextInt922 = new java.util.Random().nextInt(1672695563);
        int i16922 = ~nextInt922;
        int i17022 = ((int) (j7422 >> 32)) & (((((~(699024489 | nextInt922)) | (~(2136250900 | i16922))) * (-1808)) - 1851217734) + (((~((-1448385045) | nextInt922)) | (~((-11158634) | i16922))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(nextInt922 | (-2136250901))) | (-2147409534) | (~(i16922 | (-699024490)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
        int myTid822 = android.os.Process.myTid();
        int i17122 = ~myTid822;
        int i17222 = ~(1440461576 | myTid822);
        int i17322 = ((int) j7422) & ((((~((-3235167) | i17122)) | i17222) * 1150) + 334239082 + ((i17222 | (~((-1440461577) | i17122))) * (-575)) + (((~(myTid822 | (-3235167))) | (~(i17122 | 3235166))) * 575));
        j8 = (i17022 ^ i17322) | (i17022 & i17322);
        java.lang.Object[] objArr8622 = new java.lang.Object[1];
        h((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 174 - (~(-android.text.TextUtils.lastIndexOf(str4922, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))), 17 - android.view.KeyEvent.normalizeMetaState(0), objArr8622);
        java.lang.Object[] objArr8722 = {(java.lang.String) objArr8622[0]};
        d3 = com.facetec.sdk.al.d(-864328554);
        if (d3 == null) {
        }
        long longValue1322 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr8722)).longValue();
        long j7522 = -1040119239;
        long myUid322 = android.os.Process.myUid();
        long j7622 = longValue1322 ^ j4;
        long j7722 = (j6 * j7522) + (j7 * longValue1322) + ((((longValue1322 | j7522) | myUid322) ^ j4) * j3) + ((((j7622 | myUid322) ^ j4) | (((myUid322 ^ j4) | j7522) ^ j4)) * j3) + (((((j7522 ^ j4) | myUid322) ^ j4) | j7622) * j5) + 2088317659;
        int nextInt1022 = new java.util.Random().nextInt();
        int i17422 = ((int) (j7722 >> 32)) & ((((~((-1811987610) | nextInt1022)) | (-2052512376)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1322639844 + (((~((~nextInt1022) | (-1811987610))) | (-2052512376)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int nextInt1122 = new java.util.Random().nextInt(123973977);
        int i17522 = ~nextInt1122;
        int i17622 = ((int) j7722) & ((((~((-474153190) | i17522)) | 67108897) * (-108)) + 2060331471 + (((~(i17522 | (-963073221))) | (~(963073220 | nextInt1122)) | 556028928) * 54) + ((nextInt1122 | 556028928) * 54));
        long j7822 = (i17422 ^ i17622) | (i17422 & i17622);
        if (j8 > 0) {
        }
        java.lang.Object[] objArr9022 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "뵘閐\ue363麚எ揿꒿੫\udbee쿹ᨫ\uea58켷\uddb5瞨㲣勞⅛袉辡檼뙖⧗", "ꦆ$䲡北", (-1593826135) - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr9022);
        java.lang.Object[] objArr9122 = {(java.lang.String) objArr9022[0]};
        d4 = com.facetec.sdk.al.d(-864328554);
        if (d4 == null) {
        }
        long longValue1422 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr9122)).longValue();
        long j7922 = 751535169;
        long j8022 = -755;
        long j8122 = ((j7922 ^ j4) | (longValue1422 ^ j4)) ^ j4;
        long j8222 = longValue1422 | j7922;
        long nextInt1322 = new java.util.Random().nextInt();
        long j8322 = (j7922 * j8022) + (j8022 * longValue1422) + (1512 * j8122) + ((-756) * (((j8222 | nextInt1322) ^ j4) | j8122)) + (756 * (j8222 | (nextInt1322 ^ j4))) + 296663251;
        int freeMemory52 = (int) java.lang.Runtime.getRuntime().freeMemory();
        int i18322 = (~((-215998651) | freeMemory52)) | 147480752;
        int i18422 = ((int) (j8322 >> 32)) & ((i18322 * 992) + 1537498186 + ((i18322 | (~((~freeMemory52) | 1289745658))) * (-496)) + ((freeMemory52 | 1221227760) * 496));
        int i18522 = (int) j8322;
        int myPid922 = android.os.Process.myPid();
        int i18622 = ~myPid922;
        int i18722 = i18522 & ((((-1933499755) | i18622) * (-757)) + 1765507630 + ((~((-286557505) | myPid922)) * 1514) + (((~(myPid922 | (-1646942251))) | (~(i18622 | (-496273345))) | 209715840) * 757));
        j9 = (i18422 ^ i18722) | (i18422 & i18722);
        int resolveOpacity222 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        int e722 = com.facetec.sdk.fp.b.e();
        int i18822 = ~e722;
        int i18922 = ~((i18822 ^ resolveOpacity222) | (i18822 & resolveOpacity222));
        int i19022 = ~resolveOpacity222;
        int i19122 = (i19022 ^ (-56928)) | ((-56928) & i19022);
        int i19222 = ~((i19122 ^ e722) | (e722 & i19122));
        int i19322 = ((resolveOpacity222 * 860) - 48843366) + (((e722 & resolveOpacity222) | (resolveOpacity222 ^ e722)) * (-859)) + (((i19222 & i18922) | (i18922 ^ i19222)) * 859);
        int i19422 = ~(((-56928) ^ i18822) | (i18822 & (-56928)));
        int i19522 = ~((resolveOpacity222 ^ (-56928)) | ((-56928) & resolveOpacity222));
        int i19622 = -(-(((i19422 ^ i19522) | (i19522 & i19422)) * 859));
        java.lang.Object[] objArr9322 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) ((i19322 & i19622) + (i19622 | i19322)), "状흉ꤜ쫥", "觖⥲引痞", android.view.KeyEvent.normalizeMetaState(0), objArr9322);
        java.lang.Object[] objArr9422 = {(java.lang.String) objArr9322[0]};
        d5 = com.facetec.sdk.al.d(-864328554);
        if (d5 == null) {
        }
        long longValue1522 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr9422)).longValue();
        long j8422 = 583231972;
        long j8522 = 52;
        long nextInt1422 = new java.util.Random().nextInt(667039300) ^ j4;
        long j8622 = nextInt1422 | j8422;
        long j8722 = longValue1522 ^ j4;
        long j8822 = j8422 ^ j4;
        long j8922 = ((-51) * j8422) + (53 * longValue1522) + (((j8622 | longValue1522) ^ j4) * j8522) + ((-52) * (((j8722 | j8422) ^ j4) | ((j8722 | nextInt1422) ^ j4) | (j8622 ^ j4))) + (j8522 * (((j8822 | longValue1522) ^ j4) | ((j8822 | nextInt1422) ^ j4))) + 464966448;
        int freeMemory222 = (int) java.lang.Runtime.getRuntime().freeMemory();
        int i19722 = ~freeMemory222;
        int i19822 = ((int) (j8922 >> 32)) & ((((-1646384266) | freeMemory222) * 140) + 777117962 + (((~((-1646384266) | i19722)) | 570425344) * (-280)) + (((~(freeMemory222 | (-570425345))) | (~(i19722 | (-1211356620))) | 135397698) * 140));
        int i19922 = ~new java.util.Random().nextInt(1415605373);
        int i20022 = ((int) j8922) & (((((-1384597703) | r4) * 764) - 449473107) + (((~(i19922 | (-1384597703))) | 1350844420) * (-1528)) + ((1369719845 | (~((-52628708) | i19922))) * 764));
        long j9022 = (i19822 ^ i20022) | (i19822 & i20022);
        if (j9 > 0) {
        }
        int i22422 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        char c1722 = (char) ((i22422 & 1) + (i22422 | 1));
        java.lang.Object[] objArr9722 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", c1722, "샰⤡ૅ팲뒇䠤Ώ", "璏പ笣ꧻ", 588065396 - android.view.View.resolveSize(0, 0), objArr9722);
        java.lang.String str5022 = (java.lang.String) objArr9722[0];
        java.lang.Object[] objArr9822 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) android.graphics.Color.red(0), "\uf3a3췧\u0ef2蝓\ua8cb룖ﹰǥ攬₶歛", "칂翵婘\ud83a", 1484781005 - (~(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr9822);
        java.lang.String str5122 = (java.lang.String) objArr9822[0];
        char c1822 = (char) (15783 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))));
        int i22522 = -android.view.KeyEvent.keyCodeFromString(str4922);
        int i22622 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
        java.lang.Object[] objArr9922 = new java.lang.Object[1];
        h(c1822, (i22522 & 193) + (i22522 | 193), (i22622 & 12) + (i22622 | 12), objArr9922);
        java.lang.String str5222 = (java.lang.String) objArr9922[0];
        java.lang.Object[] objArr10022 = new java.lang.Object[1];
        j("\u0000\u0000\u0000\u0000", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u1fd4͑ڢ欧퐉菂敁Ŕ飹땊챽腥", "྆\ued11举璳", android.os.Process.myPid() >> 22, objArr10022);
        java.lang.String str5322 = (java.lang.String) objArr10022[0];
        char c1922 = (char) (0 - (~android.text.TextUtils.lastIndexOf(str4922, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
        int i22722 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        int packedPositionChild222 = android.widget.ExpandableListView.getPackedPositionChild(0L);
        java.lang.Object[] objArr10122 = new java.lang.Object[1];
        h(c1922, (i22722 ^ 205) + ((i22722 & 205) << 1), (packedPositionChild222 & 12) + (packedPositionChild222 | 12), objArr10122);
        java.lang.String str5422 = (java.lang.String) objArr10122[0];
        char combineMeasuredStates22 = (char) (android.view.View.combineMeasuredStates(0, 0) + 40729);
        int i22822 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i22922 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        java.lang.Object[] objArr10222 = new java.lang.Object[1];
        h(combineMeasuredStates22, ((i22822 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) << 1) - (i22822 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE), (i22922 ^ 6) + ((i22922 & 6) << 1), objArr10222);
        java.lang.String str5522 = (java.lang.String) objArr10222[0];
        char c2022 = (char) (0 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
        int keyRepeatDelay222 = android.view.ViewConfiguration.getKeyRepeatDelay();
        int keyCodeFromString222 = android.view.KeyEvent.keyCodeFromString(str4922);
        java.lang.Object[] objArr10322 = new java.lang.Object[1];
        h(c2022, (keyRepeatDelay222 >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, ((keyCodeFromString222 | 4) << 1) - (keyCodeFromString222 ^ 4), objArr10322);
        strArr = new java.lang.String[]{str5022, str5122, str5222, str5322, str5422, str5522, (java.lang.String) objArr10322[0]};
        i4 = 0;
        while (true) {
            if (i4 >= 7) {
            }
            i4 = ((i9 & 1) << 1) + (i9 ^ 1);
            strArr = strArr2;
        }
        if (i5 != 0) {
        }
    }
}
