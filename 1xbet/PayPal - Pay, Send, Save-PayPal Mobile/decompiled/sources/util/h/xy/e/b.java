package util.h.xy.e;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static int getOutputMinFrameDurationlomOqCM;
    private static char[] getOutputSizes;
    private static int getOutputSizeshNQ4ISI;
    private static long getOutputStallDuration;
    private static boolean getOutputStallDurationlomOqCM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7, types: [char[]] */
    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i = getOutputMinFrameDuration;
        getInputFormats = (i + 13) % 128;
        int i2 = getOutputMinFrameDurationlomOqCM + 13;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            getInputFormats = (i + 29) % 128;
        }
        if (str != 0) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        char c = cArr[0];
        char[] cArr2 = new char[cArr.length - 1];
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 117) % 128;
        for (int i3 = 1; i3 < cArr.length; i3++) {
            cArr2[i3 - 1] = (char) ((cArr[i3] ^ (i3 * c)) ^ getOutputStallDuration);
        }
        getInputFormats = (getOutputMinFrameDuration + 19) % 128;
        return new java.lang.String(cArr2);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 43) % 128;
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i2 = getHighSpeedVideoFpsRangesFor + 101;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getInputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        java.lang.String str4 = new java.lang.String(cArr3);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 107) % 128;
        objArr[0] = str4;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getOutputSizes;
        if (cArr2 != null) {
            int i4 = getHighSpeedVideoFpsRangesFor + 125;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                cArr[i3] = (char) (cArr2[i3] ^ (-3299939579226817547L));
                i3++;
            }
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getOutputSizeshNQ4ISI);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getOutputStallDurationlomOqCM) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            int i6 = getHighSpeedVideoFpsRangesFor + 41;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 % 1) % mdVar.f2643] + i] / i5);
                i2 = mdVar.f2643 % 1;
            } else {
                cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
                i2 = mdVar.f2643 + 1;
            }
            mdVar.f2643 = i2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x026b, code lost:
    
        if ((r8 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03cf, code lost:
    
        if (r3 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x069f, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.c.a<util.h.xy.c.mb> m26462(android.content.Context context, int i) throws util.h.xy.c.ma {
        boolean z;
        java.lang.Object invoke;
        boolean z2;
        int i2;
        boolean z3;
        int i3 = getHighSpeedVideoSizesFor;
        int i4 = (i3 & 119) + (i3 | 119);
        getOutputMinFrameDurationlomOqCM = i4 % 128;
        int i5 = 2;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.Class<?>[] clsArr = null;
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        util.h.xy.e.mc.m26470(i);
        ?? r6 = 0;
        if ((2031616 & i) == 0) {
            int i6 = (getOutputMinFrameDuration + 91) % 128;
            getInputFormats = i6;
            int i7 = getHighSpeedVideoSizesFor;
            int i8 = i7 ^ 115;
            int i9 = (i7 & 115) << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            getOutputMinFrameDurationlomOqCM = i10 % 128;
            if (i10 % 2 == 0) {
                getOutputMinFrameDuration = (i6 + 117) % 128;
                z3 = false;
            } else {
                z3 = true;
            }
            getOutputMinFrameDurationlomOqCM = (((i7 | 91) << 1) - (i7 ^ 91)) % 128;
        } else {
            getOutputMinFrameDurationlomOqCM = ((-2) - (~(getHighSpeedVideoSizesFor + 2))) % 128;
        }
        int i11 = getOutputMinFrameDuration;
        getInputFormats = (i11 + 53) % 128;
        int i12 = getHighSpeedVideoSizesFor;
        getOutputMinFrameDurationlomOqCM = ((i12 & 73) + (i12 | 73)) % 128;
        if ((65536 & i) == 0) {
            int i13 = i11 + 49;
            getInputFormats = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = i12 & 17;
                int i15 = (i12 | 17) & (~i14);
                int i16 = -(-(i14 << 1));
                getOutputMinFrameDurationlomOqCM = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
                throw new util.h.xy.c.ma(117, null);
            }
        }
        int i17 = getOutputMinFrameDurationlomOqCM;
        int i18 = (i17 & 28) + (i17 | 28);
        int i19 = (~i18) + (i18 << 1);
        getHighSpeedVideoSizesFor = i19 % 128;
        if (i19 % 2 == 0) {
            getInputFormats = (getOutputMinFrameDuration + 29) % 128;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.view.View.MeasureSpec.getSize(0) + 127, "\u008d\u008c\u008b\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern()).intern();
        int i20 = getOutputMinFrameDurationlomOqCM;
        int i21 = i20 ^ 75;
        int i22 = (i20 & 75) << 1;
        getHighSpeedVideoSizesFor = ((i21 & i22) + (i21 | i22)) % 128;
        getHighSpeedVideoSizesFor = ((-2) - (~(((i20 | 38) << 1) - (i20 ^ 38)))) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("军\uf2b9䜑玈嵒铤람Ș칡疜鹍醅\ueef8ᄎ䁅\uf020湋❱䪢\ud85e婾\uecd0给", (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (-1126558282) - android.text.TextUtils.indexOf("", "", 0, 0), "똢\uda15늼呒", "\u0000\u0000\u0000\u0000", objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName(Camera2StreamConfigurationMap(102, ((java.lang.String) objArr2[0]).intern(), 14, false, 23).intern());
            int i23 = 16;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ஒ᪗\udcf8榓丣\udcb9ㅕ柙⟖藀\ue0c8悬ᬨ⊠쀼\uf431", (char) (6169 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, "ܨ㐱ᤷĘ", "\u0000\u0000\u0000\u0000", objArr3);
            java.lang.Object invoke2 = cls.getMethod(Camera2StreamConfigurationMap(106, ((java.lang.String) objArr3[0]).intern(), 1, false, 16).intern(), java.lang.String.class).invoke(context, intern);
            if (invoke2 == null) {
                throw new util.h.xy.c.ma(102, null);
            }
            int i24 = getHighSpeedVideoSizesFor;
            int i25 = i24 | 57;
            getOutputMinFrameDurationlomOqCM = ((i25 << 1) - (i25 & (~(i24 & 57)))) % 128;
            int i26 = i24 & 109;
            int i27 = ((i24 ^ 109) | i26) << 1;
            int i28 = -((i24 | 109) & (~i26));
            getOutputMinFrameDurationlomOqCM = (((i27 | i28) << 1) - (i28 ^ i27)) % 128;
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("⑳㳌虣뢚庑⋝暶䈦묛ឣ㊽彛Ὴꂯ⟉棞\ud93d僗芖⎟끀횧헿圎䳘⳿촦萝ꉑለꕤ䟣ᓙ鯙懥絧嫶쐄❕ꫣǘ⽅녔븯Ƅ痹㚑\uf5ba", (char) android.text.TextUtils.getTrimmedLength(""), android.view.ViewConfiguration.getTouchSlop() >> 8, "\uf7d8휢뫣迲", "\u0000\u0000\u0000\u0000", objArr4);
                java.lang.Class<?> cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr4[0]).intern()).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("朅叭ￖ䌼\ue8ba\ue744⒴녛꺑哺耧駒캻綟\u139c\ue84a―鴖雸薙Ở䈧궻⋾굾ꞷ┙ꀔꋦ\udf68轄ꚞמּ㼕", (char) android.view.KeyEvent.normalizeMetaState(0), android.view.Gravity.getAbsoluteGravity(0, 0), "缟ꢎ㩫\uee94", "\u0000\u0000\u0000\u0000", objArr5);
                java.util.List list = (java.util.List) cls2.getMethod(Camera2StreamConfigurationMap(103, ((java.lang.String) objArr5[0]).intern(), 16, false, 34).intern(), java.lang.Integer.TYPE).invoke(invoke2, 16);
                if ((i & 256) != 0) {
                    int i29 = getHighSpeedVideoSizesFor;
                    int i30 = i29 & 89;
                    int i31 = ((i29 ^ 89) | i30) << 1;
                    int i32 = -((~i30) & (i29 | 89));
                    getOutputMinFrameDurationlomOqCM = (((i31 | i32) << 1) - (i32 ^ i31)) % 128;
                    int i33 = getOutputMinFrameDuration;
                    int i34 = i33 + 65;
                    getInputFormats = i34 % 128;
                    if (i34 % 2 != 0) {
                        int i35 = 2 / 2;
                    }
                    int i36 = ((i29 ^ 91) | (i29 & 91)) << 1;
                    int i37 = -((i29 & (-92)) | ((~i29) & 91));
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    getOutputMinFrameDurationlomOqCM = i38 % 128;
                    if (i38 % 2 == 0) {
                        getInputFormats = (i33 + 23) % 128;
                    }
                    z = true;
                } else {
                    int i39 = getOutputMinFrameDurationlomOqCM;
                    int i40 = i39 & 51;
                    int i41 = (i39 ^ 51) | i40;
                    getHighSpeedVideoSizesFor = ((i40 ^ i41) + ((i41 & i40) << 1)) % 128;
                    z = false;
                }
                if (list != null) {
                    getOutputMinFrameDuration = (getInputFormats + 107) % 128;
                } else {
                    int i42 = getOutputMinFrameDuration + 25;
                    getInputFormats = i42 % 128;
                }
                int i43 = getOutputMinFrameDurationlomOqCM;
                int i44 = (i43 ^ 1) + ((i43 & 1) << 1);
                getHighSpeedVideoSizesFor = i44 % 128;
                if (i44 % 2 != 0) {
                    list.isEmpty();
                    throw null;
                }
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    int i45 = getOutputMinFrameDurationlomOqCM;
                    int i46 = i45 & 47;
                    int i47 = (i45 ^ 47) | i46;
                    getHighSpeedVideoSizesFor = ((i46 & i47) + (i47 | i46)) % 128;
                    util.h.xy.c.a<util.h.xy.c.mb> aVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i48 = getHighSpeedVideoSizesFor;
                        int i49 = i48 & 35;
                        int i50 = (i48 | 35) & (~i49);
                        int i51 = i49 << 1;
                        int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                        getOutputMinFrameDurationlomOqCM = i52 % 128;
                        if (i52 % i5 == 0) {
                            it.next();
                            throw new java.lang.ArithmeticException();
                        }
                        java.lang.Object next = it.next();
                        getOutputMinFrameDuration = (getInputFormats + 53) % 128;
                        int i53 = getOutputMinFrameDurationlomOqCM;
                        int i54 = (((i53 | 26) << 1) - (i53 ^ 26)) - 1;
                        getHighSpeedVideoSizesFor = i54 % 128;
                        if (i54 % i5 != 0) {
                            try {
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getJumpTapTimeout() >> i23) + 127, "ÃÂÁÀ¿¾½¼»º¹¸·¶µ´³²±°¯®\u00ad¬«ª©¨§¦¥¤£¢¡ \u009f\u009e\u009d\u009c\u009b\u009a\u0099\u0098\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090\u008f\u008e", objArr6);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr6[r6]).intern()).intern());
                                char jumpTapTimeout = (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> i23) + 23585);
                                try {
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    objArr7[r6] = java.lang.Integer.valueOf((int) r6);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName("android.os.Process");
                                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                                    clsArr2[r6] = java.lang.Integer.TYPE;
                                    int intValue = ((java.lang.Integer) cls4.getMethod("getThreadPriority", clsArr2).invoke(clsArr, objArr7)).intValue();
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("鵰荘ꓭ瘣銃叉퇱韭젦ꡆ㉴\uf688鷦\ue80e", jumpTapTimeout, (intValue + 20) >> 6, "狅喯ⅅ䅜", "\u0000\u0000\u0000\u0000", objArr8);
                                    invoke = cls3.getMethod(Camera2StreamConfigurationMap(9, ((java.lang.String) objArr8[r6]).intern(), 56, r6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE).intern(), clsArr).invoke(next, clsArr);
                                    if (invoke == null) {
                                        z2 = r6;
                                        i2 = 16;
                                        int i55 = getHighSpeedVideoSizesFor;
                                        int i56 = i55 & 71;
                                        int i57 = (i55 ^ 71) | i56;
                                        getOutputMinFrameDurationlomOqCM = ((i56 & i57) + (i57 | i56)) % 128;
                                        r6 = z2;
                                        i23 = i2;
                                        i5 = 2;
                                        clsArr = null;
                                    }
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(126 - (android.widget.ExpandableListView.getPackedPositionForChild(r6, r6) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(r6, r6) == 0L ? 0 : -1)), "âáàßÞÝÜÛÚÙØ×ÖÕÔÓÒÑÐÏÎÍÌËÊÉÈÇÆÅÄ", objArr9);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr9[r6]).intern()).intern());
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "ìëêéäèçæåäã", objArr10);
                                    if (cls5.getField(Camera2StreamConfigurationMap(105, ((java.lang.String) objArr10[r6]).intern(), 11, r6, 11).intern()).get(invoke) != null) {
                                        int i58 = getOutputMinFrameDurationlomOqCM;
                                        int i59 = i58 & 21;
                                        int i60 = (i58 ^ 21) | i59;
                                        getHighSpeedVideoSizesFor = ((i59 & i60) + (i60 | i59)) % 128;
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.alpha((int) r6) + 127, "âáàßÞÝÜÛÚÙØ×ÖÕÔÓÒÑÐÏÎÍÌËÊÉÈÇÆÅÄ", objArr11);
                                        java.lang.Class<?> cls6 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr11[r6]).intern()).intern());
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 128, "ìëêéäèçæåäã", objArr12);
                                        java.lang.Object obj = cls6.getField(Camera2StreamConfigurationMap(105, ((java.lang.String) objArr12[r6]).intern(), 11, r6, 11).intern()).get(invoke);
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        i2 = 16;
                                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "ñ÷åñöîòõêðîôãóïëãçòïêçñðïãíîãí", objArr13);
                                        java.lang.Class<?> cls7 = java.lang.Class.forName(Camera2StreamConfigurationMap(100, ((java.lang.String) objArr13[r6]).intern(), 15, true, 30).intern());
                                        try {
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 126, "\u0003\u0002\u0001\u0000ÿþýüûúùø", objArr14);
                                            if (getHighSpeedVideoSizes(context, (java.lang.String) cls7.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr14[0]).intern()).intern()).get(obj))) {
                                                int i61 = getHighSpeedVideoSizesFor;
                                                int i62 = ((i61 & 18) + (i61 | 18)) - 1;
                                                getOutputMinFrameDurationlomOqCM = i62 % 128;
                                                if (i62 % 2 == 0) {
                                                    throw new java.lang.ArithmeticException();
                                                }
                                                if (aVar == null) {
                                                    aVar = new util.h.xy.c.a<>();
                                                    int i63 = getHighSpeedVideoSizesFor;
                                                    int i64 = i63 & 83;
                                                    int i65 = -(-((i63 ^ 83) | i64));
                                                    getOutputMinFrameDurationlomOqCM = (((i64 | i65) << 1) - (i65 ^ i64)) % 128;
                                                }
                                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getCapsMode("", 0, 0) + 127, "âáàßÞÝÜÛÚÙØ×ÖÕÔÓÒÑÐÏÎÍÌËÊÉÈÇÆÅÄ", objArr15);
                                                java.lang.Class<?> cls8 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr15[0]).intern()).intern());
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(android.view.View.combineMeasuredStates(0, 0) + 127, "ìëêéäèçæåäã", objArr16);
                                                java.lang.Object obj2 = cls8.getField(Camera2StreamConfigurationMap(105, ((java.lang.String) objArr16[0]).intern(), 11, false, 11).intern()).get(invoke);
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.getTrimmedLength(""), "ñ÷åñöîòõêðîôãóïëãçòïêçñðïãíîãí", objArr17);
                                                java.lang.Class<?> cls9 = java.lang.Class.forName(Camera2StreamConfigurationMap(100, ((java.lang.String) objArr17[0]).intern(), 15, true, 30).intern());
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0003\u0002\u0001\u0000ÿþýüûúùø", objArr18);
                                                java.lang.String m26467 = util.h.xy.e.mc.m26467(context, (java.lang.String) cls9.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr18[0]).intern()).intern()).get(obj2));
                                                if (m26467 != null) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "âáàßÞÝÜÛÚÙØ×ÖÕÔÓÒÑÐÏÎÍÌËÊÉÈÇÆÅÄ", objArr19);
                                                    z2 = false;
                                                    java.lang.Class<?> cls10 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr19[0]).intern()).intern());
                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "ìëêéäèçæåäã", objArr20);
                                                    java.lang.Object obj3 = cls10.getField(Camera2StreamConfigurationMap(105, ((java.lang.String) objArr20[0]).intern(), 11, false, 11).intern()).get(invoke);
                                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "ñ÷åñöîòõêðîôãóïëãçòïêçñðïãíîãí", objArr21);
                                                    java.lang.Class<?> cls11 = java.lang.Class.forName(Camera2StreamConfigurationMap(100, ((java.lang.String) objArr21[0]).intern(), 15, true, 30).intern());
                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.blue(0), "\u0003\u0002\u0001\u0000ÿþýüûúùø", objArr22);
                                                    aVar.m25826(new util.h.xy.c.mb(m26467, (java.lang.String) cls11.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr22[0]).intern()).intern()).get(obj3)));
                                                    if (z) {
                                                        int i66 = getOutputMinFrameDurationlomOqCM;
                                                        int i67 = i66 ^ 107;
                                                        int i68 = -(-((i66 & 107) << 1));
                                                        getHighSpeedVideoSizesFor = ((i67 & i68) + (i68 | i67)) % 128;
                                                        break;
                                                    }
                                                    int i552 = getHighSpeedVideoSizesFor;
                                                    int i562 = i552 & 71;
                                                    int i572 = (i552 ^ 71) | i562;
                                                    getOutputMinFrameDurationlomOqCM = ((i562 & i572) + (i572 | i562)) % 128;
                                                    r6 = z2;
                                                    i23 = i2;
                                                    i5 = 2;
                                                    clsArr = null;
                                                }
                                            }
                                            z2 = false;
                                            int i5522 = getHighSpeedVideoSizesFor;
                                            int i5622 = i5522 & 71;
                                            int i5722 = (i5522 ^ 71) | i5622;
                                            getOutputMinFrameDurationlomOqCM = ((i5622 & i5722) + (i5722 | i5622)) % 128;
                                            r6 = z2;
                                            i23 = i2;
                                            i5 = 2;
                                            clsArr = null;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                    z2 = r6;
                                    i2 = 16;
                                    int i55222 = getHighSpeedVideoSizesFor;
                                    int i56222 = i55222 & 71;
                                    int i57222 = (i55222 ^ 71) | i56222;
                                    getOutputMinFrameDurationlomOqCM = ((i56222 & i57222) + (i57222 | i56222)) % 128;
                                    r6 = z2;
                                    i23 = i2;
                                    i5 = 2;
                                    clsArr = null;
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        } else {
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(android.view.MotionEvent.axisFromString("") + 128, "ÃÂÁÀ¿¾½¼»º¹¸·¶µ´³²±°¯®\u00ad¬«ª©¨§¦¥¤£¢¡ \u009f\u009e\u009d\u009c\u009b\u009a\u0099\u0098\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090\u008f\u008e", objArr23);
                            java.lang.Class<?> cls12 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr23[r6]).intern()).intern());
                            char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, r6, r6) + 23586);
                            try {
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                objArr24[r6] = "";
                                java.lang.Class<?> cls13 = java.lang.Class.forName("android.os.Process");
                                java.lang.Class<?>[] clsArr3 = new java.lang.Class[1];
                                clsArr3[r6] = java.lang.String.class;
                                int intValue2 = ((java.lang.Integer) cls13.getMethod("getGidForName", clsArr3).invoke(clsArr, objArr24)).intValue();
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("鵰荘ꓭ瘣銃叉퇱韭젦ꡆ㉴\uf688鷦\ue80e", lastIndexOf, (-1) - intValue2, "狅喯ⅅ䅜", "\u0000\u0000\u0000\u0000", objArr25);
                                invoke = cls12.getMethod(Camera2StreamConfigurationMap(104, ((java.lang.String) objArr25[r6]).intern(), 10, r6, 14).intern(), clsArr).invoke(next, clsArr);
                            } catch (java.lang.Throwable th4) {
                                java.lang.Throwable cause4 = th4.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th4;
                            }
                        }
                        int i69 = getHighSpeedVideoSizesFor;
                        int i70 = i69 & 27;
                        int i71 = -(-((i69 ^ 27) | i70));
                        getOutputMinFrameDurationlomOqCM = (((i70 | i71) << 1) - (i71 ^ i70)) % 128;
                        return r4;
                    }
                }
                util.h.xy.c.a<util.h.xy.c.mb> aVar2 = null;
                int i692 = getHighSpeedVideoSizesFor;
                int i702 = i692 & 27;
                int i712 = -(-((i692 ^ 27) | i702));
                getOutputMinFrameDurationlomOqCM = (((i702 | i712) << 1) - (i712 ^ i702)) % 128;
                return aVar2;
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String Camera2StreamConfigurationMap(int i, java.lang.String str, int i2, boolean z, int i3) {
        int i4;
        getInputFormats = (getOutputMinFrameDuration + 87) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[i3];
        int i5 = 0;
        int i6 = 0;
        while (i6 < i3) {
            int i7 = getHighSpeedVideoSizesFor + 109;
            getOutputMinFrameDurationlomOqCM = i7 % 128;
            if (i7 % 2 == 0) {
                getOutputMinFrameDuration = (getInputFormats + 115) % 128;
                char c = (char) (i % cArr2[i6]);
                cArr3[i6] = c;
                cArr3[i6] = (char) (c / getOutputFormats);
                i6 += 71;
            } else {
                char c2 = (char) (cArr2[i6] + i);
                cArr3[i6] = c2;
                cArr3[i6] = (char) (c2 - getOutputFormats);
                i6++;
            }
        }
        if (i2 > 0) {
            getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 15) % 128;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            int i8 = i3 - i2;
            java.lang.System.arraycopy(cArr4, 0, cArr3, i8, i2);
            java.lang.System.arraycopy(cArr4, i2, cArr3, 0, i8);
        }
        if (z) {
            getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 71) % 128;
            char[] cArr5 = new char[i3];
            while (i5 < i3) {
                int i9 = getOutputMinFrameDuration;
                int i10 = i9 + 67;
                int i11 = i10 % 128;
                getInputFormats = i11;
                if (i10 % 2 != 0) {
                    int i12 = getHighSpeedVideoSizesFor * 81;
                    getOutputMinFrameDurationlomOqCM = i12 << 14059;
                    if ((i12 >> 4) == 0) {
                        i4 = i11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        getOutputMinFrameDuration = i4 % 128;
                        if (i4 % 2 != 0) {
                            cArr5[i5] = cArr3[(i3 % i5) + 1];
                            i5 += 56;
                        } else {
                            cArr5[i5] = cArr3[(i3 * i5) >>> 1];
                            i5 += 48;
                        }
                    } else {
                        cArr5[i5] = cArr3[(i3 - i5) - 1];
                        i5++;
                        getInputFormats = (i9 + 77) % 128;
                    }
                } else {
                    int i13 = getHighSpeedVideoSizesFor + 17;
                    getOutputMinFrameDurationlomOqCM = i13 % 128;
                    if (i13 % 2 == 0) {
                        i4 = i11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        getOutputMinFrameDuration = i4 % 128;
                        if (i4 % 2 != 0) {
                        }
                    } else {
                        cArr5[i5] = cArr3[(i3 - i5) - 1];
                        i5++;
                        getInputFormats = (i9 + 77) % 128;
                    }
                }
            }
            cArr3 = cArr5;
        }
        return new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03e6, code lost:
    
        if (r0.contains(Camera2StreamConfigurationMap(91, ((java.lang.String) r2[0]).intern(), 23, false, 38).intern()) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoSizes(android.content.Context context, java.lang.String str) throws util.h.xy.c.ma {
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = i ^ 125;
        int i3 = ((((i & 125) | i2) << 1) - (~(-i2))) - 1;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new util.h.xy.c.ma(104, null);
        }
        getOutputMinFrameDuration = (getInputFormats + 111) % 128;
        int i4 = getHighSpeedVideoSizesFor;
        getOutputMinFrameDurationlomOqCM = ((i4 ^ 67) + ((i4 & 67) << 1)) % 128;
        int i5 = (i4 & (-58)) | ((~i4) & 57);
        int i6 = -(-((i4 & 57) << 1));
        getOutputMinFrameDurationlomOqCM = ((i5 & i6) + (i6 | i5)) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("军\uf2b9䜑玈嵒铤람Ș칡疜鹍醅\ueef8ᄎ䁅\uf020湋❱䪢\ud85e婾\uecd0给", (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), (-1126558283) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "똢\uda15늼呒", "\u0000\u0000\u0000\u0000", objArr);
            java.lang.Class<?> cls = java.lang.Class.forName(Camera2StreamConfigurationMap(102, ((java.lang.String) objArr[0]).intern(), 14, false, 23).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0015\u0014\u0013\u0012\u0011\u0010\u000f\u000e\r\f\u000b\n\t\b\u0007\u0006\u0005\u0004", objArr2);
            java.lang.Object invoke = cls.getMethod(getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern()).intern(), null).invoke(context, null);
            if (invoke == null) {
                throw new util.h.xy.c.ma(101, null);
            }
            int i7 = getOutputMinFrameDurationlomOqCM;
            int i8 = ((((i7 ^ 95) | (i7 & 95)) << 1) - ((i7 & (-96)) | ((~i7) & 95))) % 128;
            getHighSpeedVideoSizesFor = i8;
            getOutputMinFrameDurationlomOqCM = ((((i8 & (-36)) | ((~i8) & 35)) - (~(-(-((i8 & 35) << 1))))) - 1) % 128;
            try {
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(126 - android.view.MotionEvent.axisFromString(""), "76543210/.-,+*)('&%$#\"! \u001f\u001e\u001d\u001c\u001b\u001a\u0019\u0018\u0017\u0016", objArr3);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr3[0]).intern()).intern());
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("홃ӻ䲓較槢\ue3db⋉ᴳ绢ᨺ빼揻옦ꔷ駌", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6181), android.text.TextUtils.getCapsMode("", 0, 0) - 597286013, "菃昣ⓜ鈘", "\u0000\u0000\u0000\u0000", objArr4);
                    java.lang.Object invoke2 = cls2.getMethod(getHighSpeedVideoFpsRanges(((java.lang.String) objArr4[0]).intern()).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, str, 4096);
                    if (invoke2 == null) {
                        int i9 = getHighSpeedVideoSizesFor;
                        int i10 = i9 & 51;
                        int i11 = ((i10 - (~((i9 ^ 51) | i10))) - 1) % 128;
                        getOutputMinFrameDurationlomOqCM = i11;
                        int i12 = (((i11 ^ 79) | (i11 & 79)) << 1) - ((i11 & (-80)) | ((~i11) & 79));
                        getHighSpeedVideoSizesFor = i12 % 128;
                        if (i12 % 2 == 0) {
                            getOutputMinFrameDuration = (getInputFormats + 121) % 128;
                            return false;
                        }
                        int i13 = getInputFormats + 101;
                        getOutputMinFrameDuration = i13 % 128;
                        if (i13 % 2 == 0) {
                            return false;
                        }
                        throw null;
                    }
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.view.View.getDefaultSize(0, 0) + 127, "îåðê:=÷<æð÷óíæ;ó9îæ÷õ:÷õ9òï98ð", objArr5);
                    java.lang.Class<?> cls3 = java.lang.Class.forName(Camera2StreamConfigurationMap(98, ((java.lang.String) objArr5[0]).intern(), 21, true, 30).intern());
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("⿏ꊓ튷ᛉ袵嬥爯䳥帅℻䏏㳫퀛丷㥳", (char) (25566 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (-1611936164) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "孄\uebce\udf9f퍣", "\u0000\u0000\u0000\u0000", objArr6);
                    if (cls3.getField(Camera2StreamConfigurationMap(105, ((java.lang.String) objArr6[0]).intern(), 7, true, 15).intern()).get(invoke2) == null) {
                        throw new util.h.xy.c.ma(106, null);
                    }
                    getInputFormats = (getOutputMinFrameDuration + 7) % 128;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "îåðê:=÷<æð÷óíæ;ó9îæ÷õ:÷õ9òï98ð", objArr7);
                    java.lang.Class<?> cls4 = java.lang.Class.forName(Camera2StreamConfigurationMap(98, ((java.lang.String) objArr7[0]).intern(), 21, true, 30).intern());
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("⿏ꊓ튷ᛉ袵嬥爯䳥帅℻䏏㳫퀛丷㥳", (char) (25567 - android.view.KeyEvent.getDeadChar(0, 0)), (-1611936166) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "孄\uebce\udf9f퍣", "\u0000\u0000\u0000\u0000", objArr8);
                    java.lang.Object obj = cls4.getField(Camera2StreamConfigurationMap(105, ((java.lang.String) objArr8[0]).intern(), 7, true, 15).intern()).get(invoke2);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("ᙅ䲡᤹敢\u187b萲崐瀛툛Ṓᩄ\uf2f7쫻㒂ꛊ蟅聫ҵ崙ῲ䲿᰿柖苰臮頄ꚿ藆醌឴껏⢍\ud8a3۵⡉", (char) android.view.Gravity.getAbsoluteGravity(0, 0), (-1980865329) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "켛\uee64얉聫", "\u0000\u0000\u0000\u0000", objArr9);
                    java.lang.Class<?> cls5 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(((java.lang.String) objArr9[0]).intern()).intern());
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("倏ꔭ₣ѓフ\udaf7", (char) (38327 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, "㙼籾뢱ゕ", "\u0000\u0000\u0000\u0000", objArr10);
                    if ((cls5.getField(getHighSpeedVideoFpsRanges(((java.lang.String) objArr10[0]).intern()).intern()).getInt(obj) & 1) != 0) {
                        int i14 = getOutputMinFrameDurationlomOqCM;
                        int i15 = i14 & 107;
                        int i16 = (i14 ^ 107) | i15;
                        getHighSpeedVideoSizesFor = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
                        getHighSpeedVideoSizesFor = ((((i14 ^ 77) | (i14 & 77)) << 1) - ((i14 & (-78)) | ((~i14) & 77))) % 128;
                    } else {
                        int i17 = getOutputMinFrameDuration + 43;
                        getInputFormats = i17 % 128;
                        if (i17 % 2 != 0) {
                            getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor << (-14)) - 3596;
                        } else {
                            getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 91) % 128;
                        }
                        int i18 = getHighSpeedVideoSizesFor;
                        getOutputMinFrameDurationlomOqCM = (((i18 ^ 47) - (~((i18 & 47) << 1))) - 1) % 128;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.resolveSize(0, 0), "îåðê:=÷<æð÷óíæ;ó9îæ÷õ:÷õ9òï98ð", objArr11);
                        java.lang.Class<?> cls6 = java.lang.Class.forName(Camera2StreamConfigurationMap(98, ((java.lang.String) objArr11[0]).intern(), 21, true, 30).intern());
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 127, "ì>êå>;A>@?>ìîë;;ë:ó;", objArr12);
                            java.lang.Object[] objArr13 = (java.lang.Object[]) cls6.getField(Camera2StreamConfigurationMap(108, ((java.lang.String) objArr12[0]).intern(), 20, true, 20).intern()).get(invoke2);
                            if (objArr13 != null) {
                                int i19 = getHighSpeedVideoSizesFor;
                                int i20 = i19 & 111;
                                int i21 = -(-((i19 ^ 111) | i20));
                                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                                getOutputMinFrameDurationlomOqCM = i22 % 128;
                                if (i22 % 2 == 0) {
                                    getOutputMinFrameDuration = (getInputFormats + 121) % 128;
                                    java.util.Arrays.asList(objArr13);
                                    throw new java.lang.ArithmeticException();
                                }
                                java.util.List asList = java.util.Arrays.asList(objArr13);
                                if (asList != null) {
                                    int i23 = getOutputMinFrameDurationlomOqCM + 71;
                                    getHighSpeedVideoSizesFor = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "PPòõNãODåòBNåCìäMLK8ä<>JFIH<GF>@E@DCBò", objArr14);
                                        if (asList.contains(Camera2StreamConfigurationMap(5, ((java.lang.String) objArr14[0]).intern(), 91, false, 63).intern())) {
                                            getInputFormats = (getOutputMinFrameDuration + 125) % 128;
                                            int i24 = getOutputMinFrameDurationlomOqCM;
                                            getHighSpeedVideoSizesFor = ((i24 & 71) + (i24 | 71)) % 128;
                                            int i25 = i24 ^ 81;
                                            int i26 = ((i24 & 81) | i25) << 1;
                                            int i27 = -i25;
                                            getHighSpeedVideoSizesFor = (((i26 | i27) << 1) - (i26 ^ i27)) % 128;
                                            return true;
                                        }
                                    } else {
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "PPòõNãODåòBNåCìäMLK8ä<>JFIH<GF>@E@DCBò", objArr15);
                                    }
                                }
                            } else {
                                getOutputMinFrameDuration = (getInputFormats + 105) % 128;
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i28 = getOutputMinFrameDurationlomOqCM;
                    int i29 = i28 & 17;
                    int i30 = (i28 | 17) & (~i29);
                    int i31 = i29 << 1;
                    int i32 = ((i30 ^ i31) + ((i30 & i31) << 1)) % 128;
                    getHighSpeedVideoSizesFor = i32;
                    int i33 = i32 + 43;
                    getOutputMinFrameDurationlomOqCM = i33 % 128;
                    if (i33 % 2 != 0) {
                        return false;
                    }
                    throw null;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                getInputFormats = (getOutputMinFrameDuration + 63) % 128;
                throw cause3;
            }
            getOutputMinFrameDuration = (getInputFormats + 55) % 128;
            throw th3;
        }
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizesFor = 0;
        getOutputMinFrameDurationlomOqCM = 1;
        getOutputStallDuration = -5908352764500662798L;
        getOutputFormats = 1;
        int i = getOutputMinFrameDuration + 67;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputSizes = new char[]{59118, 16765, 26090, 2693, 12022, 55187, 62510, 39059, 48453, 24013, 26087, 2687, 12017, 20816, 63203, 3323, 41724, 63721, 3809, 42216, 64208, 4393, 42731, 64750, 4867, 43270, 65269, 5386, 43781, 49437, 5899, 44297, 49905, 6431, 44807, 50450, 6945, 45333, 50988, 7460, 45843, 51478, 7912, 46408, 52015, 24876, 46919, 52534, 25419, 47426, 53084, 25928, 47944, 53582, 26462, 48452, 53875, 26726, 48724, 54383, 27237, 32892, 54871, 27788, 33366, 55405, 28241, 40062, 16365, 37623, 27154, 50497, 21359, 13956, 36286, 26777, 49895, 23070, 13552, 35903, 26445, 64875, 22662, 14177, 35532, 25828, 64600, 22321, 11845, 35166, 26453, 64139, 20898, 11444, 34567, 7685, 63806, 20570, 64326, 64336, 64327, 64323, 64348, 64342, 64380, 64347, 64339, 64346, 64332, 64351, 64321, 64349, 64390, 64322, 64350, 64379, 64334, 64365, 64320, 10394, 35864, 64304, 9625, 5336, 17133, 44562, 40059, 53209, 13793, 25844, 20535, 35066, 9071, 47604, 2222, 38675, 25037, 63318, 32261, 52390, 23367, 9676, 43919, 538, 37050, 7980, 59825, 32634, 50698, 62604, 20511, 17171, 29048, 25753, 3013, 1488, 14652, 10249, 55941, 51626, 62458, 61191, 40519, 36975, 34708, 45697, 42238, 21536, 18162, 30059, 26795, 6906, 2547, 15686, 9041, 56992, 52649, 49154, 62252, 57696, 38007, 31658, 46572, 64354, 64384, 64345, 64325, 64344, 64357, 64343, 64376, 64340, 64324, 64328, 64329, 64393, 64338, 64358, 64366, 64378, 64367, 64341, 64361, 64359, 64360, 64309, 64331, 64308};
        getOutputSizeshNQ4ISI = -1074857123;
        getOutputStallDurationlomOqCM = true;
        getHighSpeedVideoFpsRanges = true;
        getHighResolutionOutputSizeshNQ4ISI = 2457411417541981002L;
        Camera2StreamConfigurationMap = 294925130;
        getInputSizeshNQ4ISI = (char) 48932;
    }
}
