package util.h.xy.e;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static int getOutputSizes;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 99) % 128;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getOutputSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 55) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 119) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getHighSpeedVideoFpsRanges;
        if (iArr3 != null) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = i2 + 35;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            getHighSpeedVideoFpsRangesFor = (i2 + 93) % 128;
            for (int i4 = 0; i4 < length; i4++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 65) % 128;
                iArr2[i4] = (int) (iArr3[i4] ^ (-5569649899877129369L));
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRanges;
        if (iArr5 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 7) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr4[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x1184, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRangesFor(com.google.common.base.Ascii.US, ((java.lang.String) r15[0]).intern(), 56).intern()) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x14bd, code lost:
    
        if (r7.contains(getHighSpeedVideoFpsRanges(((java.lang.String) r14[0]).intern(), true, 44, 2841, 55).intern()) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x14ff, code lost:
    
        util.h.xy.e.ra.getInputSizeshNQ4ISI = (util.h.xy.e.ra.getHighSpeedVideoSizesFor + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x151a, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r0).get(null)).contains(r5) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x151c, code lost:
    
        r7 = util.h.xy.e.ra.getInputSizeshNQ4ISI;
        util.h.xy.e.ra.getHighSpeedVideoSizesFor = (((r7 | 97) << 1) - (r7 ^ 97)) % 128;
        r7 = (java.lang.String) java.lang.Class.forName(r3).getField(r0).get(null);
        r14 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1089868277, -2127690058, -93573439, 2116305063, -1145712138, -401537366}, android.widget.ExpandableListView.getPackedPositionChild(0) + 13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x1563, code lost:
    
        if (r7.contains(getHighSpeedVideoFpsRangesFor((byte) 125, ((java.lang.String) r14[0]).intern(), 12).intern()) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x1565, code lost:
    
        r7 = util.h.xy.e.ra.getHighSpeedVideoSizesFor;
        r9 = r7 & 1;
        r9 = r9 + ((r7 ^ 1) | r9);
        util.h.xy.e.ra.getInputSizeshNQ4ISI = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x1573, code lost:
    
        if ((r9 % 2) != 0) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x1575, code lost:
    
        r9 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x158a, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r0).get(null)).contains(r9) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x158c, code lost:
    
        r7 = util.h.xy.e.ra.getHighSpeedVideoSizesFor;
        r10 = r7 & 23;
        util.h.xy.e.ra.getInputSizeshNQ4ISI = (r10 + ((r7 ^ 23) | r10)) % 128;
        r7 = (java.lang.String) java.lang.Class.forName(r3).getField(r0).get(null);
        r15 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1076517835, 119213498, -1069875609, 1527451437, 1223344101, 1732271734}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 12, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x15d4, code lost:
    
        if (r7.contains(getHighSpeedVideoFpsRangesFor((byte) 69, ((java.lang.String) r15[0]).intern(), 12).intern()) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x15d7, code lost:
    
        r34 = r1;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x044c, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x177a, code lost:
    
        if (r0 != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x15dd, code lost:
    
        ((java.lang.String) java.lang.Class.forName(r3).getField(r0).get(null)).contains(r50);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x15f1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x14fd, code lost:
    
        if (r7.contains(getHighSpeedVideoFpsRanges(((java.lang.String) r15[0]).intern(), false, 14, 257, 14).intern()) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x11d3, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRangesFor((byte) 43, ((java.lang.String) r15[0]).intern(), 8).intern()) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x10a2, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r12).get(null)).equals(getHighSpeedVideoFpsRangesFor((byte) 126, r12, 6).intern()) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0e41, code lost:
    
        if (r0.equals(getHighSpeedVideoFpsRanges(((java.lang.String) r13[0]).intern(), true, 28, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 6).intern()) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0cd6, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRangesFor((byte) 35, ((java.lang.String) r12[0]).intern(), 10).intern()) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0a29, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r5) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0a2b, code lost:
    
        r0 = util.h.xy.e.ra.getHighSpeedVideoSizesFor;
        r10 = r0 ^ 91;
        r0 = ((r0 & 91) | r10) << 1;
        r10 = -r10;
        r13 = (r0 ^ r10) + ((r0 & r10) << 1);
        util.h.xy.e.ra.getInputSizeshNQ4ISI = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0a40, code lost:
    
        if ((r13 % 2) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0a42, code lost:
    
        r0 = (java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null);
        r14 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1089868277, -2127690058, -93573439, 2116305063, -1145712138, -401537366}, android.widget.ExpandableListView.getPackedPositionType(0) + 12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0a7b, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRangesFor((byte) 1, ((java.lang.String) r14[0]).intern(), 52).intern()) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0ad0, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r7) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0ad2, code lost:
    
        r0 = util.h.xy.e.ra.getHighSpeedVideoSizesFor;
        r10 = r0 & 39;
        r0 = -(-((r0 ^ 39) | r10));
        r12 = (r10 ^ r0) + ((r0 & r10) << 1);
        util.h.xy.e.ra.getInputSizeshNQ4ISI = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0ae7, code lost:
    
        if ((r12 % 2) != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0afc, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r11) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0afe, code lost:
    
        r0 = util.h.xy.e.ra.getHighSpeedVideoSizesFor;
        r10 = r0 & 17;
        r0 = (r0 | 17) & (~r10);
        r10 = r10 << 1;
        r12 = (r0 & r10) + (r0 | r10);
        util.h.xy.e.ra.getInputSizeshNQ4ISI = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0b13, code lost:
    
        if ((r12 % 2) != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0b15, code lost:
    
        r10 = null;
        r12 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0b2a, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r12) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0b2d, code lost:
    
        ((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r50);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0b46, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0b47, code lost:
    
        ((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0b59, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0a7e, code lost:
    
        r0 = (java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null);
        r14 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1089868277, -2127690058, -93573439, 2116305063, -1145712138, -401537366}, 12 - (android.view.ViewConfiguration.getTouchSlop() >> 8), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0abb, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRangesFor((byte) 125, ((java.lang.String) r14[0]).intern(), 12).intern()) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0a14, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRanges(((java.lang.String) r14[0]).intern(), false, 7, 263, 2).intern()) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0691, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r9).get(null)).contains(r11) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0693, code lost:
    
        r1 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06a7, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r9).get(null)).contains(r1) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06a9, code lost:
    
        r40 = r15;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x067c, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRanges(((java.lang.String) r13[0]).intern(), false, 3, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 3).intern()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0629, code lost:
    
        if (r1.contains(getHighSpeedVideoFpsRanges(((java.lang.String) r0[0]).intern(), false, 4, 18989, 5).intern()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x08f3, code lost:
    
        if (((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null)).contains(r5) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x09c8, code lost:
    
        if (r0.contains(getHighSpeedVideoFpsRanges(((java.lang.String) r14[0]).intern(), false, 3, 12108, 3).intern()) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b5a, code lost:
    
        r12 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0b5c, code lost:
    
        r0 = r4 & 87;
        r4 = (r4 | 87) & (~r0);
        r0 = -(-(r0 << 1));
        r13 = ((r4 | r0) << 1) - (r0 ^ r4);
        r0 = (r13 & 85) | ((~r13) & (-86));
        r4 = -(-((r13 & (-86)) << 1));
        r4 = (r0 & r4) + (r0 | r4);
        r0 = new java.lang.StringBuilder();
        r13 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{927462275, -1281007666, 339836470, 2033062444, 232287785, 347936231, -211150791, -144799714}, 15 - android.text.TextUtils.getCapsMode("", 0, 0), r13);
        r0.append(getHighSpeedVideoFpsRangesFor((byte) 65, ((java.lang.String) r13[0]).intern(), 15).intern());
        r10 = null;
        r0.append((java.lang.String) java.lang.Class.forName(r3).getField(r8).get(null));
        r2.append(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0dfa, code lost:
    
        if (r0.equals(getHighSpeedVideoFpsRanges(((java.lang.String) r13[0]).intern(), true, 23, 26564, 91).intern()) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e43, code lost:
    
        r0 = (java.lang.String) java.lang.Class.forName(r3).getField(r2).get(null);
        r37 = r7;
        r7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ufffa\u000f\u0016￪￬\u0007\ufffa\ufff6\u0088\u0013\ufff0￫￬￭￮￬\u0006\u0018�\u0016\u0005\ufff8\ufff4￫\ufff4", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 8, 147 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), false, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0e99, code lost:
    
        if (r0.equals(getHighSpeedVideoFpsRangesFor((byte) 106, ((java.lang.String) r7[0]).intern(), 25).intern()) != false) goto L163;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:165:0x1acc. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x12da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x13e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x16aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x196e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1acf  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x1b83  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x1b8d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x1ad3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x1b0b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1b47  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1b4b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1b5d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x1b6f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x199d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x19a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x19f1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1a1b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x1a33  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1a4f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1a7f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1aaa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1a2f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1712 A[Catch: all -> 0x1b97, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x1b97, blocks: (B:139:0x16ab, B:235:0x1712, B:238:0x172d, B:242:0x1b8f, B:244:0x1b95, B:245:0x1b96, B:237:0x1716), top: B:136:0x16a8, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x166e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x129d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0f96  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0ea4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1ba7  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x1ba8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f55  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0ff6  */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.c.mb m26472() {
        java.lang.Throwable cause;
        java.lang.String intern;
        java.lang.String intern2;
        java.lang.String intern3;
        java.lang.String intern4;
        java.lang.String intern5;
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj;
        java.lang.String str5;
        int i;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Object obj2;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.Object obj3;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.Object[] objArr;
        java.lang.Object obj4;
        java.lang.String str18;
        java.lang.String str19;
        int i2;
        java.lang.Class<?> cls;
        java.lang.Object[] objArr2;
        boolean z;
        java.lang.String str20;
        java.lang.String str21;
        java.lang.String str22;
        int i3;
        int i4;
        java.lang.Object newInstance;
        char c;
        char c2;
        java.lang.Object obj5;
        java.lang.String str23;
        char c3;
        util.h.xy.c.mb mbVar;
        java.lang.String str24;
        java.lang.String intern6;
        int i5;
        java.lang.Object obj6;
        java.lang.String str25;
        java.lang.Object[] objArr3;
        int i6;
        java.lang.String str26;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ufff5\ufffb\u001d\u000e\ufff7\ufff2", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.red(0) + 138, true, objArr5);
        java.lang.String intern7 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{566008737, -984957870, -1552356634, -1588519638, -360650528, -173021943, 717453403, 1004233053}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr6);
        java.lang.String intern8 = getHighSpeedVideoFpsRangesFor((byte) 6, ((java.lang.String) objArr6[0]).intern(), 16).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\b\ufff6\u0007\u0003\u0005\u0002\ufff7", android.text.TextUtils.indexOf("", "", 0) + 7, android.text.TextUtils.getTrimmedLength("") + 5, 123 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), false, objArr7);
        java.lang.String intern9 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr7[0]).intern(), false, 7, 236, 5).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-998140398, 1868205299, -494955284, 183556569, -1296575980, 908684297}, android.graphics.Color.rgb(0, 0, 0) + 16777228, objArr8);
        java.lang.String intern10 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr8[0]).intern(), false, 12, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 3).intern();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-16526553, -1246738432, -75748374, -899500123}, 6 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr9);
        java.lang.String intern11 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr9[0]).intern(), true, 5, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 1).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-1555289252, 421324706}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, objArr10);
        java.lang.String intern12 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr10[0]).intern(), false, 4, 258, 1).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\n￭\u000b\ufffa\u0006\u0001", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, 4 - android.view.View.resolveSizeAndState(0, 0, 0), 153 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, objArr11);
        java.lang.String intern13 = getHighSpeedVideoFpsRangesFor((byte) 118, ((java.lang.String) objArr11[0]).intern(), 6).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ￖQ\uffd9", android.text.TextUtils.getTrimmedLength("") + 3, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'w', true, objArr12);
        java.lang.String intern14 = getHighSpeedVideoFpsRangesFor((byte) 5, ((java.lang.String) objArr12[0]).intern(), 3).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("￩\ufffaW\uffdd￬", 5 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, false, objArr13);
        java.lang.String intern15 = getHighSpeedVideoFpsRangesFor((byte) 58, ((java.lang.String) objArr13[0]).intern(), 5).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u000e\t\uffd9�￩\u0017\u0014", 7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 4 - android.view.View.resolveSize(0, 0), 123 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), false, objArr14);
        java.lang.String intern16 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr14[0]).intern(), false, 7, 250, 7).intern();
        try {
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff8\uffff￼\t\ufff8\u000e\ufffb\t", android.text.TextUtils.indexOf("", "") + 8, 7 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 123 - (android.view.ViewConfiguration.getTapTimeout() >> 16), false, objArr15);
            intern = getHighSpeedVideoFpsRanges(((java.lang.String) objArr15[0]).intern(), true, 8, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 3).intern();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff0\uffff\u0004\u0000\u0006ￜP\ufffe\u0000\ufff2\ufff1", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 7 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 163 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), true, objArr16);
            intern2 = getHighSpeedVideoFpsRangesFor((byte) 36, ((java.lang.String) objArr16[0]).intern(), 11).intern();
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("￮\ufffb^\ufff3\ufff4￣\ufff2", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 6, 3 - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 155, false, objArr17);
            intern3 = getHighSpeedVideoFpsRangesFor((byte) 14, ((java.lang.String) objArr17[0]).intern(), 7).intern();
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{375369719, -1263212001, -720658237, -2120041707, 1570392338, 967299694}, 11 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr18);
            intern4 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr18[0]).intern(), false, 10, 257, 8).intern();
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000f\u0003\u0005\n\uffff\u0005\u0004\uffdd\ufffb\u0004", 10 - android.text.TextUtils.getCapsMode("", 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, false, objArr19);
            intern5 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr19[0]).intern(), false, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 5).intern();
            sb = new java.lang.StringBuilder();
        } catch (java.lang.Throwable th) {
            cause = th.getCause();
            if (cause != null) {
            }
        }
        try {
            if (java.lang.Class.forName(intern8).getField(intern9).get(null) != null) {
                java.lang.String str27 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null);
                str2 = intern13;
                str = intern11;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-2045818642, 722642101}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, objArr20);
                str3 = intern4;
                if (!str27.contains(getHighSpeedVideoFpsRanges(((java.lang.String) objArr20[0]).intern(), true, 3, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, 2).intern())) {
                    int i7 = getHighSpeedVideoSizesFor;
                    int i8 = (i7 & (-68)) | ((~i7) & 67);
                    int i9 = (i7 & 67) << 1;
                    getInputSizeshNQ4ISI = ((i8 & i9) + (i9 | i8)) % 128;
                    if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern12)) {
                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 59) % 128;
                        java.lang.String str28 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1089868277, -2127690058, -93573439, 2116305063, -1145712138, -401537366}, 12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr21);
                        if (!str28.contains(getHighSpeedVideoFpsRangesFor((byte) 125, ((java.lang.String) objArr21[0]).intern(), 12).intern()) && !((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern16)) {
                            int i10 = getInputSizeshNQ4ISI;
                            getHighSpeedVideoSizesFor = ((i10 ^ 9) + ((i10 & 9) << 1)) % 128;
                            if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern14)) {
                                int i11 = getHighSpeedVideoSizesFor;
                                int i12 = i11 ^ 85;
                                int i13 = ((i11 & 85) | i12) << 1;
                                int i14 = -i12;
                                getInputSizeshNQ4ISI = ((i13 & i14) + (i13 | i14)) % 128;
                            }
                        }
                    }
                }
                if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern16)) {
                    str4 = "";
                } else {
                    int i15 = getInputSizeshNQ4ISI;
                    getHighSpeedVideoSizesFor = (((i15 & 92) + (i15 | 92)) - 1) % 128;
                    str4 = intern16;
                }
                if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern3)) {
                    str4 = intern3;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String str29 = str4;
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\ufff0\uffefv\u0006\u0005\u0004\u0003\ufffb\u0001\u0000\uffff￦￩\ufff2￩", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, 149 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), true, objArr22);
                sb2.append(getHighSpeedVideoFpsRangesFor(com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, ((java.lang.String) objArr22[0]).intern(), 15).intern());
                obj = null;
                sb2.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null));
                sb.append(sb2.toString());
                str5 = str29;
                i = 1;
                if (java.lang.Class.forName(intern8).getField(intern10).get(obj) != null) {
                    java.lang.String str30 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(obj);
                    str7 = str5;
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-1895249221, 2011430163, -1335112967, -660208832}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, objArr23);
                    str8 = intern9;
                    if (str30.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr23[0]).intern(), false, 7, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 3).intern())) {
                        str6 = intern3;
                        str9 = str3;
                        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 21) % 128;
                    } else {
                        if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null)).equals(intern5)) {
                            str6 = intern3;
                        } else {
                            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 97) % 128;
                            if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null)).contains(intern12)) {
                                int i16 = getInputSizeshNQ4ISI;
                                int i17 = i16 & 79;
                                int i18 = (i16 | 79) & (~i17);
                                int i19 = i17 << 1;
                                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                                getHighSpeedVideoSizesFor = i20 % 128;
                                if (i20 % 2 == 0) {
                                    java.lang.String str31 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null);
                                    str6 = intern3;
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uffff\u0006\ufffb", 3 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-16777093) - android.graphics.Color.rgb(0, 0, 0), true, objArr24);
                                } else {
                                    str6 = intern3;
                                    java.lang.String str32 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null);
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uffff\u0006\ufffb", 3 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1 - android.graphics.Color.alpha(0), 123 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr25);
                                }
                                cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                            str6 = intern3;
                            str9 = str3;
                            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 117) % 128;
                        }
                        str9 = str3;
                    }
                    int i21 = i & 17;
                    int i22 = ((i ^ 17) | i21) << 1;
                    int i23 = -((~i21) & 17);
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    int i25 = i24 & (-16);
                    if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null)).equals(intern5)) {
                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 77) % 128;
                        str7 = intern5;
                    } else if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null)).contains(intern12)) {
                        int i26 = getInputSizeshNQ4ISI;
                        int i27 = (((i26 ^ 113) | (i26 & 113)) << 1) - ((i26 & (-114)) | ((~i26) & 113));
                        getHighSpeedVideoSizesFor = i27 % 128;
                        if (i27 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        str7 = intern12;
                    } else if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null)).contains(intern14)) {
                        int i28 = getHighSpeedVideoSizesFor;
                        int i29 = i28 & 81;
                        int i30 = i29 + ((i28 ^ 81) | i29);
                        getInputSizeshNQ4ISI = i30 % 128;
                        if (i30 % 2 != 0) {
                            throw null;
                        }
                        str7 = intern14;
                    } else if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null)).contains(str9)) {
                        int i31 = getHighSpeedVideoSizesFor;
                        getInputSizeshNQ4ISI = (((i31 | 119) << 1) - (i31 ^ 119)) % 128;
                        str7 = str9;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    str10 = intern5;
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{2073216625, 267055663, -754625823, 2127383271, 2067139522, 802505733, -724659809, 694738533, 1780737506, 48697370, -1622601969, -1461457920}, 22 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr26);
                    int i32 = i25 + ((i24 ^ (-16)) | i25);
                    sb3.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr26[0]).intern(), false, 21, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 7).intern());
                    obj = null;
                    sb3.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern10).get(null));
                    sb.append(sb3.toString());
                    i = i32;
                } else {
                    str6 = intern3;
                    str7 = str5;
                    str8 = intern9;
                    str9 = str3;
                    str10 = intern5;
                }
                str11 = str;
                if (java.lang.Class.forName(intern8).getField(str11).get(obj) != null) {
                    int i33 = getHighSpeedVideoSizesFor;
                    int i34 = i33 | 43;
                    getInputSizeshNQ4ISI = ((i34 << 1) - ((~(i33 & 43)) & i34)) % 128;
                    java.lang.String str33 = (java.lang.String) java.lang.Class.forName(intern8).getField(str11).get(null);
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-1343018745, -230357789, -49231194, 628967718}, 7 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
                    if (!str33.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr27[0]).intern(), false, 7, 263, 2).intern())) {
                        int i35 = getInputSizeshNQ4ISI + 20;
                        getHighSpeedVideoSizesFor = ((~i35) + (i35 << 1)) % 128;
                        java.lang.String str34 = (java.lang.String) java.lang.Class.forName(intern8).getField(str11).get(null);
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-919850801, 413710638, -1032956701, 872153432, -2038515232, -1499800676}, 11 - android.graphics.Color.green(0), objArr28);
                        if (!str34.equals(getHighSpeedVideoFpsRangesFor((byte) 74, ((java.lang.String) objArr28[0]).intern(), 11).intern())) {
                            java.lang.String str35 = (java.lang.String) java.lang.Class.forName(intern8).getField(str11).get(null);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("<<\uffc1ￇ", 4 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2 - android.graphics.Color.blue(0), 193 - android.graphics.Color.green(0), true, objArr29);
                            if (!str35.equals(getHighSpeedVideoFpsRangesFor((byte) 46, ((java.lang.String) objArr29[0]).intern(), 4).intern())) {
                            }
                        }
                    }
                    int i36 = i & (-108);
                    int i37 = (i | (-108)) & (~i36);
                    int i38 = -(-(i36 << 1));
                    int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                    int i40 = ((i39 ^ 109) | (i39 & 109)) << 1;
                    int i41 = -((i39 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i39) & 109));
                    i = (i40 ^ i41) + ((i40 & i41) << 1);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{927462275, -1281007666, 56828878, 1819615365, -1779296473, -1399010611, 730645811, 1556541279}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr30);
                    sb4.append(getHighSpeedVideoFpsRangesFor((byte) 14, ((java.lang.String) objArr30[0]).intern(), 14).intern());
                    obj2 = null;
                    sb4.append((java.lang.String) java.lang.Class.forName(intern8).getField(str11).get(null));
                    sb.append(sb4.toString());
                    str12 = str2;
                    if (java.lang.Class.forName(intern8).getField(str12).get(obj2) == null) {
                        int i42 = getHighSpeedVideoSizesFor;
                        int i43 = (i42 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i42 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        int i44 = (~i43) + (i43 << 1);
                        getInputSizeshNQ4ISI = i44 % 128;
                        if (i44 % 2 != 0) {
                            java.lang.String str36 = (java.lang.String) java.lang.Class.forName(intern8).getField(str12).get(null);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1343018745, -230357789, -49231194, 628967718}, android.text.TextUtils.getTrimmedLength("") + 7, objArr31);
                        } else {
                            java.lang.String str37 = (java.lang.String) java.lang.Class.forName(intern8).getField(str12).get(null);
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1343018745, -230357789, -49231194, 628967718}, 8 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr32);
                        }
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    } else {
                        str13 = str6;
                        obj3 = null;
                    }
                    if (java.lang.Class.forName(intern8).getField(intern15).get(obj3) == null) {
                        java.lang.String str38 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(obj3);
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2045818642, 722642101}, 3 - android.text.TextUtils.indexOf("", "", 0), objArr33);
                        str15 = intern10;
                        if (!str38.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr33[0]).intern(), true, 3, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, 2).intern())) {
                            int i45 = getHighSpeedVideoSizesFor + 38;
                            int i46 = (~i45) + (i45 << 1);
                            getInputSizeshNQ4ISI = i46 % 128;
                            if (i46 % 2 != 0) {
                                java.lang.String str39 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\ufff2\ufff2\u0002￼\u000f\u0005\ufffe\ufff6\u0015\u0002", 11 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 8 - android.view.MotionEvent.axisFromString(""), 139 - android.text.TextUtils.getOffsetAfter("", 0), false, objArr34);
                                if (!str39.contains(getHighSpeedVideoFpsRangesFor((byte) 66, ((java.lang.String) objArr34[0]).intern(), 74).intern())) {
                                    str16 = str13;
                                }
                            } else {
                                java.lang.String str40 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                                str16 = str13;
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\ufff2\ufff2\u0002￼\u000f\u0005\ufffe\ufff6\u0015\u0002", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, 9 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, false, objArr35);
                            }
                            int i47 = getInputSizeshNQ4ISI + 112;
                            getHighSpeedVideoSizesFor = ((~i47) + (i47 << 1)) % 128;
                            java.lang.String str41 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1952813340, -1344705535, -82467660, 417725402, 1980285562, 2104857209, -1701805453, 1634494387}, android.view.View.resolveSize(0, 0) + 14, objArr36);
                            if (!str41.contains(getHighSpeedVideoFpsRanges(((java.lang.String) objArr36[0]).intern(), false, 14, 257, 14).intern())) {
                                int i48 = getHighSpeedVideoSizesFor;
                                int i49 = i48 ^ 51;
                                int i50 = ((i48 & 51) | i49) << 1;
                                int i51 = -i49;
                                getInputSizeshNQ4ISI = (((i50 | i51) << 1) - (i50 ^ i51)) % 128;
                                if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null)).contains(intern16)) {
                                    getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 69) % 128;
                                    if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null)).contains(str9)) {
                                        int i52 = getInputSizeshNQ4ISI;
                                        int i53 = i52 & 103;
                                        int i54 = ((i52 ^ 103) | i53) << 1;
                                        int i55 = -((i52 | 103) & (~i53));
                                        getHighSpeedVideoSizesFor = ((i54 ^ i55) + ((i55 & i54) << 1)) % 128;
                                        if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null)).contains(intern12)) {
                                            int i56 = (-2) - (~(getInputSizeshNQ4ISI + 44));
                                            getHighSpeedVideoSizesFor = i56 % 128;
                                            if (i56 % 2 == 0) {
                                                java.lang.String str42 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-623380271, 2006305303, 198766089, -2074047925, -988598770, 1969476365, 1674462574, 81255887, -1627556857, 1733596190, 1132053726, -1121903883, 373826730, 397625545}, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 29, objArr37);
                                            } else {
                                                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 29) % 128;
                                                java.lang.String str43 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-623380271, 2006305303, 198766089, -2074047925, -988598770, 1969476365, 1674462574, 81255887, -1627556857, 1733596190, 1132053726, -1121903883, 373826730, 397625545}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 29, objArr38);
                                            }
                                        }
                                    }
                                }
                            }
                            str14 = intern16;
                            int i57 = (((i ^ (-66)) | (i & (-66))) << 1) - ((i & 65) | ((~i) & (-66)));
                            i = (((i57 | 68) << 1) - (i57 ^ 68)) - 1;
                            str25 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                            objArr3 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6, objArr3);
                            if (str25.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern(), false, 5, 259, 5).intern())) {
                                i6 = 1;
                            } else {
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 6, objArr39);
                                java.lang.String intern17 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr39[0]).intern(), false, 5, 259, 5).intern();
                                int i58 = getHighSpeedVideoSizesFor;
                                i6 = 1;
                                getInputSizeshNQ4ISI = ((i58 ^ 79) + ((i58 & 79) << 1)) % 128;
                                str7 = intern17;
                            }
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr40 = new java.lang.Object[i6];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-678541994, -1914173973, 931501099, 857948316, 1939828077, 159719888, 2131324830, -1263740519}, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr40);
                            sb5.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr40[0]).intern(), false, 14, 231, 13).intern());
                            obj4 = null;
                            sb5.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null));
                            sb.append(sb5.toString());
                            if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
                                int i59 = getHighSpeedVideoSizesFor;
                                int i60 = i59 & 81;
                                int i61 = i59 | 81;
                                getInputSizeshNQ4ISI = ((i60 & i61) + (i61 | i60)) % 128;
                                java.lang.String str44 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null);
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{1943835549, -1967180587, -1640844782, -1525805198}, 8 - android.text.TextUtils.getOffsetAfter("", 0), objArr41);
                                if (str44.equals(getHighSpeedVideoFpsRangesFor((byte) 70, ((java.lang.String) objArr41[0]).intern(), 8).intern())) {
                                    str18 = intern7;
                                } else {
                                    int i62 = getHighSpeedVideoSizesFor;
                                    int i63 = (i62 & 114) + (i62 | 114);
                                    int i64 = (~i63) + (i63 << 1);
                                    getInputSizeshNQ4ISI = i64 % 128;
                                    if (i64 % 2 != 0) {
                                        java.lang.String str45 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null);
                                        str18 = intern7;
                                        if (!str45.equals(getHighSpeedVideoFpsRangesFor(com.google.common.base.Ascii.US, str18, 64).intern())) {
                                            obj6 = null;
                                            java.lang.String str46 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(obj6);
                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\ufff3\u0002\ufffe\u000b\u0003\u0004", 6 - android.view.View.MeasureSpec.getMode(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 4, 139 - android.view.KeyEvent.normalizeMetaState(0), false, objArr42);
                                            if (!str46.contains(getHighSpeedVideoFpsRangesFor((byte) 114, ((java.lang.String) objArr42[0]).intern(), 6).intern())) {
                                                int i65 = getHighSpeedVideoSizesFor;
                                                int i66 = ((i65 ^ 59) | (i65 & 59)) << 1;
                                                int i67 = -((i65 & (-60)) | ((~i65) & 59));
                                                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                                                getInputSizeshNQ4ISI = i68 % 128;
                                                if (i68 % 2 != 0) {
                                                    ((java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null)).contains(intern14);
                                                    throw new java.lang.ArithmeticException();
                                                }
                                                if (!((java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null)).contains(intern14)) {
                                                    int i69 = getInputSizeshNQ4ISI;
                                                    int i70 = i69 ^ 125;
                                                    int i71 = ((((i69 & 125) | i70) << 1) - (~(-i70))) - 1;
                                                    getHighSpeedVideoSizesFor = i71 % 128;
                                                    if (i71 % 2 == 0) {
                                                        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 3) % 128;
                                                        java.lang.String str47 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null);
                                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-1805709195, 1371236636, -1017711065, 726385668}, android.graphics.Color.green(0) + 8, objArr43);
                                                    } else {
                                                        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 19) % 128;
                                                        java.lang.String str48 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null);
                                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-1805709195, 1371236636, -1017711065, 726385668}, 8 - android.graphics.Color.argb(0, 0, 0, 0), objArr44);
                                                    }
                                                    cls = java.lang.Class.forName(intern8);
                                                    objArr2 = new java.lang.Object[i2];
                                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                                                    if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                                                        java.lang.Class<?> cls2 = java.lang.Class.forName(intern8);
                                                        java.lang.Object[] objArr45 = new java.lang.Object[i2];
                                                        getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, android.graphics.Color.argb(0, 0, 0, 0) + 10, objArr45);
                                                        java.lang.String str49 = (java.lang.String) cls2.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr45[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null);
                                                        java.lang.Object[] objArr46 = new java.lang.Object[i2];
                                                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-1895249221, 2011430163, -1335112967, -660208832}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 7, objArr46);
                                                        if (str49.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr46[0]).intern(), false, 7, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 3).intern())) {
                                                            int i72 = i & (-104);
                                                            int i73 = (i | (-104)) & (~i72);
                                                            int i74 = -(-(i72 << 1));
                                                            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                                                            int i76 = i75 & 105;
                                                            int i77 = -(-((i75 ^ 105) | i76));
                                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{927462275, -1281007666, 56828878, 1819615365, -342194449, -1602052306, -145048256, -346469324, 1726699743, -969342648}, 19 - android.text.TextUtils.indexOf("", "", 0), objArr47);
                                                            sb6.append(getHighSpeedVideoFpsRangesFor((byte) 124, ((java.lang.String) objArr47[0]).intern(), 19).intern());
                                                            java.lang.Class<?> cls3 = java.lang.Class.forName(intern8);
                                                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 10 - android.view.View.MeasureSpec.getMode(0), objArr48);
                                                            sb6.append((java.lang.String) cls3.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr48[0]).intern(), true, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null));
                                                            sb.append(sb6.toString());
                                                            i = (i76 & i77) + (i76 | i77);
                                                            z = true;
                                                            if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                                                                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 113) % 128;
                                                                java.lang.String str50 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern2).get(null);
                                                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1343018745, -230357789, -49231194, 628967718}, 7 - android.text.TextUtils.indexOf("", "", 0, 0), objArr49);
                                                                if (str50.contains(getHighSpeedVideoFpsRanges(((java.lang.String) objArr49[0]).intern(), false, 7, 263, 2).intern())) {
                                                                    str22 = str16;
                                                                    getOutputMinFrameDuration = (getHighSpeedVideoSizes + 75) % 128;
                                                                } else {
                                                                    java.lang.String str51 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern2).get(null);
                                                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-919850801, 413710638, -1032956701, 872153432, -2038515232, -1499800676}, 11 - android.text.TextUtils.getOffsetBefore("", 0), objArr50);
                                                                    if (!str51.contains(getHighSpeedVideoFpsRangesFor((byte) 74, ((java.lang.String) objArr50[0]).intern(), 11).intern())) {
                                                                        int i78 = getInputSizeshNQ4ISI;
                                                                        int i79 = i78 & 29;
                                                                        int i80 = (i79 - (~((i78 ^ 29) | i79))) - 1;
                                                                        getHighSpeedVideoSizesFor = i80 % 128;
                                                                        if (i80 % 2 == 0) {
                                                                            java.lang.String str52 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern2).get(null);
                                                                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1952813340, -1344705535, -82467660, 417725402, 1980285562, 2104857209, -1701805453, 1634494387}, android.view.MotionEvent.axisFromString("") + 15, objArr51);
                                                                        } else {
                                                                            java.lang.String str53 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern2).get(null);
                                                                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1952813340, -1344705535, -82467660, 417725402, 1980285562, 2104857209, -1701805453, 1634494387}, 15 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr52);
                                                                        }
                                                                        java.lang.Object[] objArr53 = new java.lang.Object[i3];
                                                                        getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr53);
                                                                        java.lang.String intern18 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr53[0]).intern(), false, 42, 257, 42).intern();
                                                                        i4 = getInputSizeshNQ4ISI + 81;
                                                                        getHighSpeedVideoSizesFor = i4 % 128;
                                                                        if (i4 % 2 != 0) {
                                                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                                            objArr54[1] = intern18;
                                                                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                                            Camera2StreamConfigurationMap("ￒ\r\u0013ￒ￪\r\u0010\t\u000e\u0005\u001a\u0005", 12 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 9 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 124 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), true, objArr55);
                                                                            java.lang.Class<?> cls4 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr55[0]).intern(), false, 17, 7216, 1).intern());
                                                                            java.lang.Class<?>[] clsArr = new java.lang.Class[0];
                                                                            clsArr[0] = java.lang.String.class;
                                                                            newInstance = cls4.getDeclaredConstructor(clsArr).newInstance(objArr54);
                                                                            if (z) {
                                                                                getHighSpeedVideoSizes = (getOutputMinFrameDuration + 51) % 128;
                                                                                if (i < 3) {
                                                                                    int i81 = getInputSizeshNQ4ISI;
                                                                                    int i82 = i81 + 27;
                                                                                    getHighSpeedVideoSizesFor = i82 % 128;
                                                                                    if (i82 % 2 == 0) {
                                                                                        throw null;
                                                                                    }
                                                                                    int i83 = getHighSpeedVideoSizes + 73;
                                                                                    getOutputMinFrameDuration = i83 % 128;
                                                                                    if (i83 % 2 != 0) {
                                                                                        throw new java.lang.ArithmeticException();
                                                                                    }
                                                                                    int i84 = i81 & 21;
                                                                                    getHighSpeedVideoSizesFor = (((i81 | 21) & (~i84)) + (i84 << 1)) % 128;
                                                                                    try {
                                                                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                                                        Camera2StreamConfigurationMap("ￒ\r\u0013ￒ￪\r\u0010\t\u000e\u0005\u001a\u0005", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, android.text.TextUtils.getCapsMode("", 0, 0) + 9, 123 - android.view.View.getDefaultSize(0, 0), true, objArr56);
                                                                                        java.lang.Class<?> cls5 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr56[0]).intern(), true, 12, 251, 1).intern());
                                                                                        try {
                                                                                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                                            Camera2StreamConfigurationMap("\uffff\ufffe￤￥\ufff9￫\uffdfÍ￣￤￬", 11 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 156 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, objArr57);
                                                                                            if (((java.lang.Boolean) cls5.getMethod(getHighSpeedVideoFpsRangesFor((byte) 117, ((java.lang.String) objArr57[0]).intern(), 11).intern(), null).invoke(newInstance, null)).booleanValue()) {
                                                                                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                                                                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1417663892, 1281825355, -1689490627, -2030813715, 1471726854, -647908254, -756539532, -1191158540, 1854168871, -231724767}, 21 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr58);
                                                                                                sb7.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr58[0]).intern(), true, 20, 247, 2).intern());
                                                                                                int i85 = getHighSpeedVideoSizesFor;
                                                                                                int i86 = i85 & 55;
                                                                                                int i87 = (i85 | 55) & (~i86);
                                                                                                int i88 = i86 << 1;
                                                                                                getInputSizeshNQ4ISI = (((i87 | i88) << 1) - (i87 ^ i88)) % 128;
                                                                                                try {
                                                                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                                                                    Camera2StreamConfigurationMap("ￒ\r\u0013ￒ￪\r\u0010\t\u000e\u0005\u001a\u0005", android.view.View.resolveSize(0, 0) + 12, 8 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 123 - android.text.TextUtils.indexOf("", "", 0, 0), true, objArr59);
                                                                                                    java.lang.Class<?> cls6 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr59[0]).intern(), true, 12, 251, 1).intern());
                                                                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                                                    c = '\b';
                                                                                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{617756316, -1110691657, 1299713999, -964060178}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, objArr60);
                                                                                                    c2 = 4;
                                                                                                    sb7.append((java.lang.String) cls6.getMethod(getHighSpeedVideoFpsRanges(((java.lang.String) objArr60[0]).intern(), false, 7, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 4).intern(), null).invoke(newInstance, null));
                                                                                                    sb.append(sb7.toString());
                                                                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{775843546, 1903102563, 1977834259, 1614434532, 748809095, -2011926503}, 10 - android.text.TextUtils.indexOf("", "", 0, 0), objArr61);
                                                                                                    str7 = getHighSpeedVideoFpsRangesFor((byte) 39, ((java.lang.String) objArr61[0]).intern(), 10).intern();
                                                                                                    i += 10;
                                                                                                } catch (java.lang.Throwable th2) {
                                                                                                    java.lang.Throwable cause2 = th2.getCause();
                                                                                                    if (cause2 != null) {
                                                                                                        throw cause2;
                                                                                                    }
                                                                                                    throw th2;
                                                                                                }
                                                                                            }
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
                                                                            }
                                                                            c = '\b';
                                                                            c2 = 4;
                                                                        } else {
                                                                            java.lang.Object[] objArr62 = {intern18};
                                                                            try {
                                                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                                                Camera2StreamConfigurationMap("ￒ\r\u0013ￒ￪\r\u0010\t\u000e\u0005\u001a\u0005", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 12, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 9, 124 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, objArr63);
                                                                                newInstance = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr63[0]).intern(), true, 12, 251, 1).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr62);
                                                                            } catch (java.lang.Throwable th5) {
                                                                                java.lang.Throwable cause5 = th5.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                        obj5 = str7;
                                                                        switch (obj5.hashCode()) {
                                                                            case -1555811265:
                                                                                str23 = str10;
                                                                                c3 = 2;
                                                                                if (obj5.equals(str23)) {
                                                                                    int i89 = getHighSpeedVideoSizesFor;
                                                                                    int i90 = i89 & 87;
                                                                                    int i91 = ((i89 ^ 87) | i90) << 1;
                                                                                    int i92 = -((i89 | 87) & (~i90));
                                                                                    getInputSizeshNQ4ISI = ((i91 ^ i92) + ((i92 & i91) << 1)) % 128;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            case -938287055:
                                                                                if (obj5.equals(getHighSpeedVideoFpsRangesFor((byte) 126, str21, 6).intern())) {
                                                                                    int i93 = getInputSizeshNQ4ISI;
                                                                                    int i94 = i93 & 7;
                                                                                    int i95 = (i93 | 7) & (~i94);
                                                                                    int i96 = -(-(i94 << 1));
                                                                                    getHighSpeedVideoSizesFor = ((i95 & i96) + (i95 | i96)) % 128;
                                                                                    c3 = 7;
                                                                                    str23 = str10;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case -704799232:
                                                                                if (obj5.equals(str14)) {
                                                                                    int i97 = getHighSpeedVideoSizesFor;
                                                                                    int i98 = i97 & 89;
                                                                                    int i99 = (~i98) & (i97 | 89);
                                                                                    int i100 = i98 << 1;
                                                                                    int i101 = (i99 & i100) + (i100 | i99);
                                                                                    getInputSizeshNQ4ISI = i101 % 128;
                                                                                    if (i101 % 2 != 0) {
                                                                                        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 97) % 128;
                                                                                    }
                                                                                    getInputSizeshNQ4ISI = (i97 + 117) % 128;
                                                                                    str23 = str10;
                                                                                    c3 = 1;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case -615405669:
                                                                                if (obj5.equals(str20)) {
                                                                                    int i102 = getHighSpeedVideoSizesFor + 125;
                                                                                    getInputSizeshNQ4ISI = i102 % 128;
                                                                                    if (i102 % 2 == 0) {
                                                                                        c3 = 5;
                                                                                        str23 = str10;
                                                                                        break;
                                                                                    }
                                                                                    str23 = str10;
                                                                                    c3 = 3;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 109271:
                                                                                if (obj5.equals(intern14)) {
                                                                                    int i103 = getInputSizeshNQ4ISI;
                                                                                    getHighSpeedVideoSizesFor = ((i103 & 25) + (i103 | 25)) % 128;
                                                                                    c3 = c2;
                                                                                    str23 = str10;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 2045346:
                                                                                if (obj5.equals(intern12)) {
                                                                                    int i104 = getHighSpeedVideoSizesFor;
                                                                                    int i105 = i104 & 55;
                                                                                    int i106 = -(-((i104 ^ 55) | i105));
                                                                                    int i107 = ((i105 ^ i106) + ((i106 & i105) << 1)) % 128;
                                                                                    getInputSizeshNQ4ISI = i107;
                                                                                    int i108 = i107 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                                                                    int i109 = -(-((i107 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i108));
                                                                                    getHighSpeedVideoSizesFor = (((i108 | i109) << 1) - (i108 ^ i109)) % 128;
                                                                                    str23 = str10;
                                                                                    c3 = 3;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 63403614:
                                                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, 5 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr64);
                                                                                if (obj5.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr64[0]).intern(), false, 5, 259, 5).intern())) {
                                                                                    int i110 = getHighSpeedVideoSizesFor;
                                                                                    getInputSizeshNQ4ISI = ((i110 & 37) + (i110 | 37)) % 128;
                                                                                    str23 = str10;
                                                                                    c3 = 0;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 263050109:
                                                                                if (obj5.equals(str22)) {
                                                                                    str23 = str10;
                                                                                    c3 = 6;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 1958697989:
                                                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{775843546, 1903102563, 1977834259, 1614434532, 748809095, -2011926503}, android.view.View.resolveSize(0, 0) + 10, objArr65);
                                                                                if (obj5.equals(getHighSpeedVideoFpsRangesFor((byte) 39, ((java.lang.String) objArr65[0]).intern(), 10).intern())) {
                                                                                    c3 = c;
                                                                                    str23 = str10;
                                                                                    break;
                                                                                }
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                            default:
                                                                                str23 = str10;
                                                                                c3 = 65535;
                                                                                break;
                                                                        }
                                                                        switch (c3) {
                                                                            case 0:
                                                                                mbVar = null;
                                                                                str24 = (java.lang.String) java.lang.Class.forName(intern8).getField(str19).get(null);
                                                                                i5 = 3;
                                                                                break;
                                                                            case 1:
                                                                                mbVar = null;
                                                                                str24 = (java.lang.String) java.lang.Class.forName(intern8).getField(str8).get(null);
                                                                                i5 = 3;
                                                                                break;
                                                                            case 2:
                                                                            case 3:
                                                                            case 4:
                                                                            case 5:
                                                                                mbVar = null;
                                                                                str24 = (java.lang.String) java.lang.Class.forName(intern8).getField(str15).get(null);
                                                                                i5 = 3;
                                                                                break;
                                                                            case 6:
                                                                                str24 = str23;
                                                                                i5 = 3;
                                                                                mbVar = null;
                                                                                break;
                                                                            case 7:
                                                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                                Camera2StreamConfigurationMap("\u0011\u000e\u0013\u0000\u000b\u0014\f￤\uffbf\u000e\b\u0003\u0014\u0013\ufff2\uffbf\u0003\b\u000e\u0011\u0003\r￠", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18, 123 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr66);
                                                                                intern6 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr66[0]).intern(), true, 23, 256, 6).intern();
                                                                                str24 = intern6;
                                                                                i5 = 3;
                                                                                mbVar = null;
                                                                                break;
                                                                            case '\b':
                                                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{775843546, 1903102563, 1977834259, 1614434532, 748809095, -2011926503}, 10 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr67);
                                                                                intern6 = getHighSpeedVideoFpsRangesFor((byte) 39, ((java.lang.String) objArr67[0]).intern(), 10).intern();
                                                                                int i111 = getHighSpeedVideoSizesFor;
                                                                                getInputSizeshNQ4ISI = ((i111 ^ 77) + ((i111 & 77) << 1)) % 128;
                                                                                str24 = intern6;
                                                                                i5 = 3;
                                                                                mbVar = null;
                                                                                break;
                                                                            default:
                                                                                mbVar = null;
                                                                                str24 = null;
                                                                                i5 = 3;
                                                                                break;
                                                                        }
                                                                        return i < i5 ? new util.h.xy.c.mb(str24, sb.toString()) : mbVar;
                                                                    }
                                                                    str22 = str16;
                                                                }
                                                                int i112 = i & 1;
                                                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                                                str21 = str18;
                                                                java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{1241821992, 1577015033, 1054241434, 1606066004, 1121945828, 365079380, 2010727975, -1164847546, -907692110, -1052020884}, android.view.KeyEvent.keyCodeFromString("") + 20, objArr68);
                                                                str20 = str9;
                                                                sb8.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr68[0]).intern(), true, 20, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 15).intern());
                                                                sb8.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern2).get(null));
                                                                sb.append(sb8.toString());
                                                                int i113 = getHighSpeedVideoSizesFor;
                                                                int i114 = i113 | 21;
                                                                int i115 = i114 << 1;
                                                                int i116 = -((~(i113 & 21)) & i114);
                                                                getInputSizeshNQ4ISI = ((i115 & i116) + (i116 | i115)) % 128;
                                                                i3 = 1;
                                                                i = (i112 - (~(-(-((i ^ 1) | i112))))) - 1;
                                                                java.lang.Object[] objArr532 = new java.lang.Object[i3];
                                                                getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr532);
                                                                java.lang.String intern182 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr532[0]).intern(), false, 42, 257, 42).intern();
                                                                i4 = getInputSizeshNQ4ISI + 81;
                                                                getHighSpeedVideoSizesFor = i4 % 128;
                                                                if (i4 % 2 != 0) {
                                                                }
                                                                obj5 = str7;
                                                                switch (obj5.hashCode()) {
                                                                    case -1555811265:
                                                                        break;
                                                                    case -938287055:
                                                                        break;
                                                                    case -704799232:
                                                                        break;
                                                                    case -615405669:
                                                                        break;
                                                                    case 109271:
                                                                        break;
                                                                    case 2045346:
                                                                        break;
                                                                    case 63403614:
                                                                        break;
                                                                    case 263050109:
                                                                        break;
                                                                    case 1958697989:
                                                                        break;
                                                                }
                                                                switch (c3) {
                                                                }
                                                                if (i < i5) {
                                                                }
                                                            } else {
                                                                str20 = str9;
                                                                str21 = str18;
                                                                str22 = str16;
                                                            }
                                                            i3 = 1;
                                                            java.lang.Object[] objArr5322 = new java.lang.Object[i3];
                                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr5322);
                                                            java.lang.String intern1822 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr5322[0]).intern(), false, 42, 257, 42).intern();
                                                            i4 = getInputSizeshNQ4ISI + 81;
                                                            getHighSpeedVideoSizesFor = i4 % 128;
                                                            if (i4 % 2 != 0) {
                                                            }
                                                            obj5 = str7;
                                                            switch (obj5.hashCode()) {
                                                                case -1555811265:
                                                                    break;
                                                                case -938287055:
                                                                    break;
                                                                case -704799232:
                                                                    break;
                                                                case -615405669:
                                                                    break;
                                                                case 109271:
                                                                    break;
                                                                case 2045346:
                                                                    break;
                                                                case 63403614:
                                                                    break;
                                                                case 263050109:
                                                                    break;
                                                                case 1958697989:
                                                                    break;
                                                            }
                                                            switch (c3) {
                                                            }
                                                            if (i < i5) {
                                                            }
                                                        }
                                                    }
                                                    z = false;
                                                    if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                                                    }
                                                    i3 = 1;
                                                    java.lang.Object[] objArr53222 = new java.lang.Object[i3];
                                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr53222);
                                                    java.lang.String intern18222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr53222[0]).intern(), false, 42, 257, 42).intern();
                                                    i4 = getInputSizeshNQ4ISI + 81;
                                                    getHighSpeedVideoSizesFor = i4 % 128;
                                                    if (i4 % 2 != 0) {
                                                    }
                                                    obj5 = str7;
                                                    switch (obj5.hashCode()) {
                                                        case -1555811265:
                                                            break;
                                                        case -938287055:
                                                            break;
                                                        case -704799232:
                                                            break;
                                                        case -615405669:
                                                            break;
                                                        case 109271:
                                                            break;
                                                        case 2045346:
                                                            break;
                                                        case 63403614:
                                                            break;
                                                        case 263050109:
                                                            break;
                                                        case 1958697989:
                                                            break;
                                                    }
                                                    switch (c3) {
                                                    }
                                                    if (i < i5) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str18 = intern7;
                                        obj6 = null;
                                    }
                                }
                                int i117 = i & 7;
                                int i118 = -(-(i | 7));
                                int i119 = (i117 & i118) + (i117 | i118);
                                int i120 = i119 & (-6);
                                int i121 = (i119 ^ (-6)) | i120;
                                if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null)).contains(getHighSpeedVideoFpsRangesFor((byte) 126, str18, 6).intern())) {
                                    int i122 = getInputSizeshNQ4ISI;
                                    getHighSpeedVideoSizesFor = ((i122 ^ 13) + ((i122 & 13) << 1)) % 128;
                                    str7 = getHighSpeedVideoFpsRangesFor((byte) 126, str18, 6).intern();
                                }
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                str19 = intern15;
                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\u001c￦\u0000\ufff9\n￼\u000f\ufff9\n�\ufff2\uffd8ￂ\ufffa-!$", 17 - android.view.View.MeasureSpec.getMode(0), 1 - android.view.View.MeasureSpec.getMode(0), 123 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr69);
                                sb9.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr69[0]).intern(), true, 17, 231, 6).intern());
                                sb9.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern).get(null));
                                sb.append(sb9.toString());
                                i2 = 1;
                                i = (i120 ^ i121) + ((i120 & i121) << 1);
                                cls = java.lang.Class.forName(intern8);
                                objArr2 = new java.lang.Object[i2];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                                if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                                }
                                z = false;
                                if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                                }
                                i3 = 1;
                                java.lang.Object[] objArr532222 = new java.lang.Object[i3];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr532222);
                                java.lang.String intern182222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr532222[0]).intern(), false, 42, 257, 42).intern();
                                i4 = getInputSizeshNQ4ISI + 81;
                                getHighSpeedVideoSizesFor = i4 % 128;
                                if (i4 % 2 != 0) {
                                }
                                obj5 = str7;
                                switch (obj5.hashCode()) {
                                    case -1555811265:
                                        break;
                                    case -938287055:
                                        break;
                                    case -704799232:
                                        break;
                                    case -615405669:
                                        break;
                                    case 109271:
                                        break;
                                    case 2045346:
                                        break;
                                    case 63403614:
                                        break;
                                    case 263050109:
                                        break;
                                    case 1958697989:
                                        break;
                                }
                                switch (c3) {
                                }
                                if (i < i5) {
                                }
                            } else {
                                str18 = intern7;
                            }
                            str19 = intern15;
                            i2 = 1;
                            cls = java.lang.Class.forName(intern8);
                            objArr2 = new java.lang.Object[i2];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                            if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                            }
                            z = false;
                            if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                            }
                            i3 = 1;
                            java.lang.Object[] objArr5322222 = new java.lang.Object[i3];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr5322222);
                            java.lang.String intern1822222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr5322222[0]).intern(), false, 42, 257, 42).intern();
                            i4 = getInputSizeshNQ4ISI + 81;
                            getHighSpeedVideoSizesFor = i4 % 128;
                            if (i4 % 2 != 0) {
                            }
                            obj5 = str7;
                            switch (obj5.hashCode()) {
                                case -1555811265:
                                    break;
                                case -938287055:
                                    break;
                                case -704799232:
                                    break;
                                case -615405669:
                                    break;
                                case 109271:
                                    break;
                                case 2045346:
                                    break;
                                case 63403614:
                                    break;
                                case 263050109:
                                    break;
                                case 1958697989:
                                    break;
                            }
                            switch (c3) {
                            }
                            if (i < i5) {
                            }
                        }
                        str14 = intern16;
                        str16 = str13;
                        int i572 = (((i ^ (-66)) | (i & (-66))) << 1) - ((i & 65) | ((~i) & (-66)));
                        i = (((i572 | 68) << 1) - (i572 ^ 68)) - 1;
                        str25 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                        objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6, objArr3);
                        if (str25.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern(), false, 5, 259, 5).intern())) {
                        }
                        java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr402 = new java.lang.Object[i6];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-678541994, -1914173973, 931501099, 857948316, 1939828077, 159719888, 2131324830, -1263740519}, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr402);
                        sb52.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr402[0]).intern(), false, 14, 231, 13).intern());
                        obj4 = null;
                        sb52.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null));
                        sb.append(sb52.toString());
                        if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
                        }
                        str19 = intern15;
                        i2 = 1;
                        cls = java.lang.Class.forName(intern8);
                        objArr2 = new java.lang.Object[i2];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                        if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                        }
                        z = false;
                        if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                        }
                        i3 = 1;
                        java.lang.Object[] objArr53222222 = new java.lang.Object[i3];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr53222222);
                        java.lang.String intern18222222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr53222222[0]).intern(), false, 42, 257, 42).intern();
                        i4 = getInputSizeshNQ4ISI + 81;
                        getHighSpeedVideoSizesFor = i4 % 128;
                        if (i4 % 2 != 0) {
                        }
                        obj5 = str7;
                        switch (obj5.hashCode()) {
                            case -1555811265:
                                break;
                            case -938287055:
                                break;
                            case -704799232:
                                break;
                            case -615405669:
                                break;
                            case 109271:
                                break;
                            case 2045346:
                                break;
                            case 63403614:
                                break;
                            case 263050109:
                                break;
                            case 1958697989:
                                break;
                        }
                        switch (c3) {
                        }
                        if (i < i5) {
                        }
                    } else {
                        str14 = intern16;
                        str15 = intern10;
                        str16 = str13;
                        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 31) % 128;
                    }
                    str17 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                    objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, 5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                    if (!str17.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern(), false, 5, 259, 5).intern())) {
                        obj4 = null;
                        if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
                        }
                        str19 = intern15;
                        i2 = 1;
                        cls = java.lang.Class.forName(intern8);
                        objArr2 = new java.lang.Object[i2];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                        if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                        }
                        z = false;
                        if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                        }
                        i3 = 1;
                        java.lang.Object[] objArr532222222 = new java.lang.Object[i3];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr532222222);
                        java.lang.String intern182222222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr532222222[0]).intern(), false, 42, 257, 42).intern();
                        i4 = getInputSizeshNQ4ISI + 81;
                        getHighSpeedVideoSizesFor = i4 % 128;
                        if (i4 % 2 != 0) {
                        }
                        obj5 = str7;
                        switch (obj5.hashCode()) {
                            case -1555811265:
                                break;
                            case -938287055:
                                break;
                            case -704799232:
                                break;
                            case -615405669:
                                break;
                            case 109271:
                                break;
                            case 2045346:
                                break;
                            case 63403614:
                                break;
                            case 263050109:
                                break;
                            case 1958697989:
                                break;
                        }
                        switch (c3) {
                        }
                        if (i < i5) {
                        }
                    }
                    int i5722 = (((i ^ (-66)) | (i & (-66))) << 1) - ((i & 65) | ((~i) & (-66)));
                    i = (((i5722 | 68) << 1) - (i5722 ^ 68)) - 1;
                    str25 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                    objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6, objArr3);
                    if (str25.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern(), false, 5, 259, 5).intern())) {
                    }
                    java.lang.StringBuilder sb522 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr4022 = new java.lang.Object[i6];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-678541994, -1914173973, 931501099, 857948316, 1939828077, 159719888, 2131324830, -1263740519}, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4022);
                    sb522.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr4022[0]).intern(), false, 14, 231, 13).intern());
                    obj4 = null;
                    sb522.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null));
                    sb.append(sb522.toString());
                    if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
                    }
                    str19 = intern15;
                    i2 = 1;
                    cls = java.lang.Class.forName(intern8);
                    objArr2 = new java.lang.Object[i2];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                    if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                    }
                    z = false;
                    if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                    }
                    i3 = 1;
                    java.lang.Object[] objArr5322222222 = new java.lang.Object[i3];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr5322222222);
                    java.lang.String intern1822222222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr5322222222[0]).intern(), false, 42, 257, 42).intern();
                    i4 = getInputSizeshNQ4ISI + 81;
                    getHighSpeedVideoSizesFor = i4 % 128;
                    if (i4 % 2 != 0) {
                    }
                    obj5 = str7;
                    switch (obj5.hashCode()) {
                        case -1555811265:
                            break;
                        case -938287055:
                            break;
                        case -704799232:
                            break;
                        case -615405669:
                            break;
                        case 109271:
                            break;
                        case 2045346:
                            break;
                        case 63403614:
                            break;
                        case 263050109:
                            break;
                        case 1958697989:
                            break;
                    }
                    switch (c3) {
                    }
                    if (i < i5) {
                    }
                }
                obj2 = null;
                str12 = str2;
                if (java.lang.Class.forName(intern8).getField(str12).get(obj2) == null) {
                }
                if (java.lang.Class.forName(intern8).getField(intern15).get(obj3) == null) {
                }
                str17 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, 5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                if (!str17.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern(), false, 5, 259, 5).intern())) {
                }
                int i57222 = (((i ^ (-66)) | (i & (-66))) << 1) - ((i & 65) | ((~i) & (-66)));
                i = (((i57222 | 68) << 1) - (i57222 ^ 68)) - 1;
                str25 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6, objArr3);
                if (str25.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern(), false, 5, 259, 5).intern())) {
                }
                java.lang.StringBuilder sb5222 = new java.lang.StringBuilder();
                java.lang.Object[] objArr40222 = new java.lang.Object[i6];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-678541994, -1914173973, 931501099, 857948316, 1939828077, 159719888, 2131324830, -1263740519}, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr40222);
                sb5222.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr40222[0]).intern(), false, 14, 231, 13).intern());
                obj4 = null;
                sb5222.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null));
                sb.append(sb5222.toString());
                if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
                }
                str19 = intern15;
                i2 = 1;
                cls = java.lang.Class.forName(intern8);
                objArr2 = new java.lang.Object[i2];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                }
                z = false;
                if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                }
                i3 = 1;
                java.lang.Object[] objArr53222222222 = new java.lang.Object[i3];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr53222222222);
                java.lang.String intern18222222222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr53222222222[0]).intern(), false, 42, 257, 42).intern();
                i4 = getInputSizeshNQ4ISI + 81;
                getHighSpeedVideoSizesFor = i4 % 128;
                if (i4 % 2 != 0) {
                }
                obj5 = str7;
                switch (obj5.hashCode()) {
                    case -1555811265:
                        break;
                    case -938287055:
                        break;
                    case -704799232:
                        break;
                    case -615405669:
                        break;
                    case 109271:
                        break;
                    case 2045346:
                        break;
                    case 63403614:
                        break;
                    case 263050109:
                        break;
                    case 1958697989:
                        break;
                }
                switch (c3) {
                }
                if (i < i5) {
                }
            } else {
                str = intern11;
                str2 = intern13;
                str3 = intern4;
            }
            if (!str26.equals(getHighSpeedVideoFpsRangesFor((byte) 69, ((java.lang.String) objArr4[0]).intern(), 12).intern())) {
                obj = null;
                str5 = "";
                i = 0;
                if (java.lang.Class.forName(intern8).getField(intern10).get(obj) != null) {
                }
                str11 = str;
                if (java.lang.Class.forName(intern8).getField(str11).get(obj) != null) {
                }
                obj2 = null;
                str12 = str2;
                if (java.lang.Class.forName(intern8).getField(str12).get(obj2) == null) {
                }
                if (java.lang.Class.forName(intern8).getField(intern15).get(obj3) == null) {
                }
                str17 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, 5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                if (!str17.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern(), false, 5, 259, 5).intern())) {
                }
                int i572222 = (((i ^ (-66)) | (i & (-66))) << 1) - ((i & 65) | ((~i) & (-66)));
                i = (((i572222 | 68) << 1) - (i572222 ^ 68)) - 1;
                str25 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
                objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6, objArr3);
                if (str25.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern(), false, 5, 259, 5).intern())) {
                }
                java.lang.StringBuilder sb52222 = new java.lang.StringBuilder();
                java.lang.Object[] objArr402222 = new java.lang.Object[i6];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-678541994, -1914173973, 931501099, 857948316, 1939828077, 159719888, 2131324830, -1263740519}, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr402222);
                sb52222.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr402222[0]).intern(), false, 14, 231, 13).intern());
                obj4 = null;
                sb52222.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null));
                sb.append(sb52222.toString());
                if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
                }
                str19 = intern15;
                i2 = 1;
                cls = java.lang.Class.forName(intern8);
                objArr2 = new java.lang.Object[i2];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
                }
                z = false;
                if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
                }
                i3 = 1;
                java.lang.Object[] objArr532222222222 = new java.lang.Object[i3];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr532222222222);
                java.lang.String intern182222222222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr532222222222[0]).intern(), false, 42, 257, 42).intern();
                i4 = getInputSizeshNQ4ISI + 81;
                getHighSpeedVideoSizesFor = i4 % 128;
                if (i4 % 2 != 0) {
                }
                obj5 = str7;
                switch (obj5.hashCode()) {
                    case -1555811265:
                        break;
                    case -938287055:
                        break;
                    case -704799232:
                        break;
                    case -615405669:
                        break;
                    case 109271:
                        break;
                    case 2045346:
                        break;
                    case 63403614:
                        break;
                    case 263050109:
                        break;
                    case 1958697989:
                        break;
                }
                switch (c3) {
                }
                if (i < i5) {
                }
            }
            if (i4 % 2 != 0) {
            }
            obj5 = str7;
            switch (obj5.hashCode()) {
                case -1555811265:
                    break;
                case -938287055:
                    break;
                case -704799232:
                    break;
                case -615405669:
                    break;
                case 109271:
                    break;
                case 2045346:
                    break;
                case 63403614:
                    break;
                case 263050109:
                    break;
                case 1958697989:
                    break;
            }
            switch (c3) {
            }
            if (i < i5) {
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
        str26 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null);
        objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1076517835, 119213498, -1069875609, 1527451437, 1223344101, 1732271734}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12, objArr4);
        if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern16)) {
        }
        if (((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null)).contains(intern3)) {
        }
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
        java.lang.String str292 = str4;
        java.lang.Object[] objArr222 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ufff0\uffefv\u0006\u0005\u0004\u0003\ufffb\u0001\u0000\uffff￦￩\ufff2￩", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, 149 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), true, objArr222);
        sb22.append(getHighSpeedVideoFpsRangesFor(com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, ((java.lang.String) objArr222[0]).intern(), 15).intern());
        obj = null;
        sb22.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern9).get(null));
        sb.append(sb22.toString());
        str5 = str292;
        i = 1;
        if (java.lang.Class.forName(intern8).getField(intern10).get(obj) != null) {
        }
        str11 = str;
        if (java.lang.Class.forName(intern8).getField(str11).get(obj) != null) {
        }
        obj2 = null;
        str12 = str2;
        if (java.lang.Class.forName(intern8).getField(str12).get(obj2) == null) {
        }
        if (java.lang.Class.forName(intern8).getField(intern15).get(obj3) == null) {
        }
        str17 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
        objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, 5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        if (!str17.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern(), false, 5, 259, 5).intern())) {
        }
        int i5722222 = (((i ^ (-66)) | (i & (-66))) << 1) - ((i & 65) | ((~i) & (-66)));
        i = (((i5722222 | 68) << 1) - (i5722222 ^ 68)) - 1;
        str25 = (java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null);
        objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-430158221, 1374647631, -420755149, 1597252998}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6, objArr3);
        if (str25.equals(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern(), false, 5, 259, 5).intern())) {
        }
        java.lang.StringBuilder sb522222 = new java.lang.StringBuilder();
        java.lang.Object[] objArr4022222 = new java.lang.Object[i6];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-678541994, -1914173973, 931501099, 857948316, 1939828077, 159719888, 2131324830, -1263740519}, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4022222);
        sb522222.append(getHighSpeedVideoFpsRanges(((java.lang.String) objArr4022222[0]).intern(), false, 14, 231, 13).intern());
        obj4 = null;
        sb522222.append((java.lang.String) java.lang.Class.forName(intern8).getField(intern15).get(null));
        sb.append(sb522222.toString());
        if (java.lang.Class.forName(intern8).getField(intern).get(obj4) != null) {
        }
        str19 = intern15;
        i2 = 1;
        cls = java.lang.Class.forName(intern8);
        objArr2 = new java.lang.Object[i2];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{46393241, 1818846176, 1239992931, 584713303, -426416068, -1831340304}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        if (cls.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), i2, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 7).intern()).get(null) != null) {
        }
        z = false;
        if (java.lang.Class.forName(intern8).getField(intern2).get(null) == null) {
        }
        i3 = 1;
        java.lang.Object[] objArr5322222222222 = new java.lang.Object[i3];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{192817514, 1471310821, -1316149855, 1644586524, 1665382063, -1735628397, -1453491680, 917728646, -995001608, -279395354, 1716255937, -1079627993, 1590153166, -1315223297, 1731923400, -555862991, 650885328, 1775447168, 1991603059, -19977295, -893183306, -80193681}, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr5322222222222);
        java.lang.String intern1822222222222 = getHighSpeedVideoFpsRanges(((java.lang.String) objArr5322222222222[0]).intern(), false, 42, 257, 42).intern();
        i4 = getInputSizeshNQ4ISI + 81;
        getHighSpeedVideoSizesFor = i4 % 128;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, boolean z, int i, int i2, int i3) {
        int i4 = getHighSpeedVideoSizesFor;
        int i5 = i4 + 13;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] cArr = str;
        if (str != null) {
            int i6 = i4 + 43;
            getInputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[i];
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 21) % 128;
            char c = (char) (cArr2[i8] + i2);
            cArr3[i8] = c;
            cArr3[i8] = (char) (c - getInputFormats);
        }
        if (i3 > 0) {
            int i9 = getHighSpeedVideoSizes + 77;
            getOutputMinFrameDuration = i9 % 128;
            if (i9 % 2 == 0) {
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 91) % 128;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                int i10 = i - i3;
                java.lang.System.arraycopy(cArr4, 0, cArr3, i10, i3);
                java.lang.System.arraycopy(cArr4, i3, cArr3, 0, i10);
                int i11 = getHighSpeedVideoSizes + 39;
                getOutputMinFrameDuration = i11 % 128;
                if (i11 % 2 != 0) {
                    getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI >>> 30) * 28031;
                } else {
                    int i12 = getInputSizeshNQ4ISI + 45;
                    getHighSpeedVideoSizesFor = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        }
        if (z) {
            char[] cArr5 = new char[i];
            while (i7 < i) {
                int i14 = getHighSpeedVideoSizes + 17;
                getOutputMinFrameDuration = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr5[i7] = cArr3[(i * i7) + 1];
                    i7 += 21;
                } else {
                    cArr5[i7] = cArr3[(i - i7) - 1];
                    i7++;
                }
            }
            cArr3 = cArr5;
        } else {
            getHighSpeedVideoSizes = (getOutputMinFrameDuration + 49) % 128;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i15 = getOutputMinFrameDuration;
        int i16 = (i15 + 29) % 128;
        getHighSpeedVideoSizes = i16;
        int i17 = getInputSizeshNQ4ISI + 107;
        getHighSpeedVideoSizesFor = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = i16 + 67;
            getOutputMinFrameDuration = i18 % 128;
            int i19 = i18 % 2;
            throw new java.lang.ArithmeticException();
        }
        int i20 = i15 + 39;
        getHighSpeedVideoSizes = i20 % 128;
        if (i20 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i) {
        char c;
        char c2;
        char[] cArr = str;
        if (str != null) {
            int i2 = getInputSizeshNQ4ISI + 33;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = getHighResolutionOutputSizeshNQ4ISI;
        char c3 = getOutputFormats;
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i3 = getInputSizeshNQ4ISI + 101;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                i += 33;
                cArr4[i] = (char) (cArr2[i] - b);
            } else {
                int i4 = getOutputMinFrameDuration + 77;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 == 0) {
                    i += 100;
                    cArr4[i] = (char) (cArr2[i] % b);
                } else {
                    i--;
                    cArr4[i] = (char) (cArr2[i] - b);
                }
            }
        }
        if (i > 1) {
            getHighSpeedVideoSizes = (getOutputMinFrameDuration + 47) % 128;
            for (int i5 = 0; i5 < i; i5 += 2) {
                int i6 = getHighSpeedVideoSizesFor + 25;
                getInputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 != 0) {
                    c = cArr2[i5];
                    c2 = c;
                } else {
                    c = cArr2[i5];
                    c2 = cArr2[i5 + 1];
                    if (c != c2) {
                        int m25285 = util.h.xy.b.b.m25285(c, c3);
                        int m25286 = util.h.xy.b.b.m25286(c, c3);
                        int m252852 = util.h.xy.b.b.m25285(c2, c3);
                        int m252862 = util.h.xy.b.b.m25286(c2, c3);
                        if (m25286 == m252862) {
                            int m25283 = util.h.xy.b.b.m25283(m25285, c3);
                            int m252832 = util.h.xy.b.b.m25283(m252852, c3);
                            int m25284 = util.h.xy.b.b.m25284(m25283, m25286, c3);
                            int m252842 = util.h.xy.b.b.m25284(m252832, m252862, c3);
                            cArr4[i5] = cArr3[m25284];
                            cArr4[i5 + 1] = cArr3[m252842];
                            getHighSpeedVideoSizes = (getOutputMinFrameDuration + 65) % 128;
                        } else {
                            int i7 = (getOutputMinFrameDuration + 45) % 128;
                            getHighSpeedVideoSizes = i7;
                            if (m25285 == m252852) {
                                int m252833 = util.h.xy.b.b.m25283(m25286, c3);
                                int m252834 = util.h.xy.b.b.m25283(m252862, c3);
                                int m252843 = util.h.xy.b.b.m25284(m25285, m252833, c3);
                                int m252844 = util.h.xy.b.b.m25284(m252852, m252834, c3);
                                cArr4[i5] = cArr3[m252843];
                                cArr4[i5 + 1] = cArr3[m252844];
                            } else {
                                int i8 = i7 + 57;
                                getOutputMinFrameDuration = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int m252845 = util.h.xy.b.b.m25284(m25285, m252862, c3);
                                    int m252846 = util.h.xy.b.b.m25284(m252852, m25286, c3);
                                    cArr4[i5] = cArr3[m252845];
                                    cArr4[i5] = cArr3[m252846];
                                } else {
                                    int m252847 = util.h.xy.b.b.m25284(m25285, m252862, c3);
                                    int m252848 = util.h.xy.b.b.m25284(m252852, m25286, c3);
                                    cArr4[i5] = cArr3[m252847];
                                    cArr4[i5 + 1] = cArr3[m252848];
                                }
                                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 113) % 128;
                            }
                        }
                    }
                }
                cArr4[i5] = (char) (c - b);
                cArr4[i5 + 1] = (char) (c2 - b);
            }
        }
        return new java.lang.String(cArr4);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = 0;
        getHighSpeedVideoSizesFor = 1;
        getOutputFormats = (char) 7;
        getHighResolutionOutputSizeshNQ4ISI = new char[]{'a', 'n', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'r', 'o', 'i', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, io.ktor.util.date.GMTDateParser.SECONDS, 'B', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'l', 't', 'V', io.ktor.util.date.GMTDateParser.MONTH, '_', 'H', 'g', 'x', 'v', 'b', '8', '6', 'p', '4', 'P', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'O', 'D', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'C', 'T', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, ' ', 'e', 'c', '\n', 'A', 'N', 'E', 'I', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 'k', 'S', 'K', 'f', io.ktor.util.date.GMTDateParser.HOURS, 'F', 'G', 'y'};
        getInputFormats = 159;
        int i = getOutputMinFrameDuration + 99;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRanges = new int[]{622251648, 608709194, -1364036564, -2106713846, 1599012055, 449716118, -1499125429, -1996648604, -735105227, -18902484, 888388369, 1837709414, -1287871641, 1179658009, 1578054361, -508348351, 211329435, 1611672472};
        getOutputSizes = -1231763731;
    }
}
