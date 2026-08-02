package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.ck.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static byte[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static long getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static short[] getOutputStallDuration;
    private final util.h.xy.cq.me getOutputSizes;

    static {
        getHighSpeedVideoSizes();
        getOutputMinFrameDuration = util.h.xy.cq.ra.class.getName();
        int i = getHighResolutionOutputSizeshNQ4ISI + 83;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ra(util.h.xy.cq.me meVar) {
        this.getOutputSizes = meVar;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 9) % 128;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 107) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            int i3 = getHighSpeedVideoSizes + 83;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                jArr[dVar.f2629] = (cArr[dVar.f2629] - (dVar.f2629 * dVar.f2628)) + (getHighSpeedVideoSizesFor * (-7508379876853140581L));
                i2 = dVar.f2629 >> 1;
            } else {
                jArr[dVar.f2629] = ((-7508379876853140581L) ^ getHighSpeedVideoSizesFor) ^ (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int length;
        byte[] bArr;
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
        int i6 = i5 == -1 ? 1 : 0;
        if (i6 != 0) {
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i5 = bArr2 != null ? (byte) (((byte) (getHighSpeedVideoFpsRangesFor[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)))) : (short) (((short) (getOutputStallDuration[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            meVar.f2647 = ((i + i5) - 2) + ((int) (getInputFormats ^ (-2689713159175858216L))) + i6;
            meVar.f2644 = (char) (i3 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getHighSpeedVideoFpsRangesFor;
            if (bArr4 != null) {
                int i8 = getHighSpeedVideoSizes + 65;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i4 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i4 = 0;
                }
                while (i4 < length) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 87) % 128;
                    bArr[i4] = (byte) (bArr4[i4] ^ (-2689713159175858216L));
                    i4++;
                }
                bArr4 = bArr;
            }
            boolean z = bArr4 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 87) % 128;
                if (z) {
                    byte[] bArr5 = getHighSpeedVideoFpsRangesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 107) % 128;
                } else {
                    short[] sArr = getOutputStallDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    @Override // util.h.xy.ck.b
    /* renamed from: ᐝ */
    public final byte[] mo25941(byte[] bArr) throws util.h.xy.ck.rc {
        int i = getOutputFormats + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap(bArr);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr);
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 7) % 128;
        return Camera2StreamConfigurationMap2;
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.ck.rc {
        byte[] bArr2;
        int i = getHighResolutionOutputSizeshNQ4ISI + 53;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            if (util.h.xy.ck.ra.f1116.m25946()) {
                getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
                if (util.h.xy.ck.ra.f1116.m25949().mo25939()) {
                    try {
                        try {
                            util.h.xy.ct.ma m26047 = util.h.xy.ct.rc.m26047();
                            byte[] m25933 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107);
                            if (!mo25939()) {
                                util.h.xy.ck.d dVar = util.h.xy.ck.d.f1115;
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("먮꒩蝜\ue1ea샟⌭\u0dd5汳伆ꦾ衕\ueab0햕㐳ᚕ煵倞늾鵁￭\ude81㤺ᯄ穯攂䞶Ꙅ胤\ue3c7숤Ⳁར渴䣈ꭼ詘\uf4b6흊ㆽ႟猲巜백鼃料\ud851㫻◔Ъ暊䅻ꀍ芾\ued5b쿨⺟ष殌", 7842 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                                throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr[0]).intern());
                            }
                            bArr2 = m26047.mo26035(m25933, this.getOutputSizes.m26006(), util.h.xy.ct.ma.b.f1125.m26043()).get(util.h.xy.ct.ma.b.f1125);
                            try {
                                byte[] m25963 = util.h.xy.cm.c.m25963(bArr2, bArr);
                                util.h.xy.cv.ra.m26066(bArr2);
                                return m25963;
                            } catch (util.h.xy.cm.ma e) {
                                e = e;
                                util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1110;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("먽෯헸鷈旊ⷖ\uf5e5붼ּ췆閚嶕╠\ued64딽終앞赍唨ᴺ\ue53a광甆㵘蓧䳷ᓭ\udccd꒗", 47093 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
                                sb.append(((java.lang.String) objArr2[0]).intern());
                                sb.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar2, sb.toString(), e);
                            } catch (util.h.xy.ct.mc e2) {
                                e = e2;
                                util.h.xy.ck.d dVar3 = util.h.xy.ck.d.f1108;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("먽෯헸鷈旊ⷖ\uf5e5붼ּ췆閚嶕╠\ued64딽終앞赍唨ᴺ\ue53a광甆㵘蓧䳷ᓭ\udccd꒗", 47093 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                                sb2.append(((java.lang.String) objArr3[0]).intern());
                                sb2.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar3, sb2.toString(), e);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                util.h.xy.cv.ra.m26066(bArr2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            bArr2 = null;
                        }
                    } catch (util.h.xy.cm.ma e3) {
                        e = e3;
                    } catch (util.h.xy.ct.mc e4) {
                        e = e4;
                    }
                }
            }
            util.h.xy.ck.d dVar4 = util.h.xy.ck.d.f1109;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("먮쀝临퐶刏\ud87c晠\uec8d檷\uf0b5纉蓨˨襊\u173f鴥ᬋꅻ⽯떆㎰릮쟙䷽쯧噖\udc38娢\ue053渺\uf46c犅\uf8afڦ賔\u0aca郻Ἓꔆ〈ꥇ㝃뵭㯜䆓쾥喝폐姮\ue40c戇\ue83b癍ﱏ稵肌\u0e8b钿ዊ颌⛥괟⬜넥㽞䕝썥䤪", 31253 - android.text.TextUtils.getTrimmedLength(""), objArr4);
            throw new util.h.xy.ck.rc(dVar4, ((java.lang.String) objArr4[0]).intern());
        }
        util.h.xy.ck.ra.f1116.m25946();
        throw null;
    }

    @Override // util.h.xy.ck.b
    /* renamed from: ˏ */
    public final boolean mo25939() {
        int i = (getOutputFormats + 79) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        util.h.xy.cq.me meVar = this.getOutputSizes;
        if (meVar != null) {
            int i2 = i + 117;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.cv.ra.m26070(meVar.m26006());
                throw new java.lang.ArithmeticException();
            }
            if (!util.h.xy.cv.ra.m26070(meVar.m26006())) {
                byte[] m26006 = this.getOutputSizes.m26006();
                int length = m26006.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (m26006[i3] != 0) {
                        int i4 = getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = i4 + 51;
                        getOutputFormats = i5 % 128;
                        r3 = i5 % 2 == 0;
                        int i6 = i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        getOutputFormats = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        i3++;
                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                    }
                }
            }
        }
        int i7 = getOutputFormats + 57;
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 != 0) {
            return r3;
        }
        throw null;
    }

    @Override // util.h.xy.ck.b
    /* renamed from: ᐝ */
    public final util.h.xy.cj.mb mo25940() throws util.h.xy.ck.rc {
        int i = getHighResolutionOutputSizeshNQ4ISI + 37;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.cj.mb Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 103) % 128;
        return Camera2StreamConfigurationMap2;
    }

    private util.h.xy.cj.mb Camera2StreamConfigurationMap() throws util.h.xy.ck.rc {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 15) % 128;
        if (!util.h.xy.ck.ra.f1116.m25946()) {
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1109;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1251839485, (short) (30 - android.text.TextUtils.indexOf("", "")), (byte) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 31, 524617055 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.cj.mb m26003 = new util.h.xy.cq.e(this.getOutputSizes).m26003();
        if (m26003.m25938() / 100 != 2) {
            return m26003;
        }
        util.h.xy.cj.mb highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        return highSpeedVideoFpsRanges;
    }

    private util.h.xy.cj.mb getHighSpeedVideoFpsRanges() throws util.h.xy.ck.rc {
        util.h.xy.cn.ma m25980;
        util.h.xy.cq.ra raVar = this;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((-1251839447) - android.view.View.getDefaultSize(0, 0), (short) (android.graphics.Color.green(0) - 77), (byte) (android.view.ViewConfiguration.getTouchSlop() >> 8), (-31) - android.text.TextUtils.getOffsetAfter("", 0), 524617094 - android.view.KeyEvent.keyCodeFromString(""), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
        } catch (java.io.IOException e) {
            e = e;
        } catch (util.h.xy.cm.ma e2) {
            e = e2;
        } catch (util.h.xy.cn.b e3) {
            e = e3;
        } catch (util.h.xy.ct.mc e4) {
            e = e4;
        }
        try {
            try {
                if (util.h.xy.ct.rc.m26046().mo26040()) {
                    byte[] mo26041 = util.h.xy.ct.rc.m26046().mo26041();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-1251839465) - android.text.TextUtils.getTrimmedLength(""), (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 107), (byte) android.view.View.MeasureSpec.getSize(0), (-30) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1445 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(util.h.xy.cv.ma.m26064(mo26041));
                    byte[] bytes = sb.toString().getBytes(intern);
                    java.lang.String highResolutionOutputSizeshNQ4ISI = raVar.getHighResolutionOutputSizeshNQ4ISI(bytes);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("먺蚻썥ఌ䣀門혬ዲ徲顒\ue500⇓扩", 15541 - android.view.View.MeasureSpec.getMode(0), objArr3);
                    hashMap.put(((java.lang.String) objArr3[0]).intern(), highResolutionOutputSizeshNQ4ISI);
                    util.h.xy.ci.ra m25931 = util.h.xy.ci.ra.m25931();
                    byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1105);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(new java.lang.String(m25933, intern));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-1251839442) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) (90 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (-31) - android.view.View.MeasureSpec.getMode(0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 524617025, objArr4);
                    sb2.append(((java.lang.String) objArr4[0]).intern());
                    java.lang.String obj = sb2.toString();
                    util.h.xy.cn.mb mbVar = new util.h.xy.cn.mb();
                    byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1106);
                    if (util.h.xy.cv.ra.m26070(m259332)) {
                        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        short jumpTapTimeout = (short) ((-61) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 59) % 128;
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((-1251839411) - indexOf, jumpTapTimeout, (byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (-30) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 524617057, objArr5);
                            m25980 = mbVar.m25981(obj, null, bytes, ((java.lang.String) objArr5[0]).intern(), hashMap);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        java.lang.String str = new java.lang.String(m259332, intern);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((-1251839410) - android.widget.ExpandableListView.getPackedPositionType(0L), (short) (android.graphics.Color.green(0) - 61), (byte) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 31, 524617057 - android.view.KeyEvent.keyCodeFromString(""), objArr6);
                        m25980 = mbVar.m25980(obj, null, bytes, ((java.lang.String) objArr6[0]).intern(), hashMap, java.lang.Integer.parseInt(str));
                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
                    }
                } else {
                    byte[] m25992 = new util.h.xy.cp.ma().m25992(util.h.xy.cr.ra.m26018());
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-1251839464) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 106), (byte) android.text.TextUtils.getTrimmedLength(""), (-31) - android.view.KeyEvent.getDeadChar(0, 0), 524617077 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7);
                    sb3.append(((java.lang.String) objArr7[0]).intern());
                    sb3.append(util.h.xy.cv.ma.m26064(m25992));
                    byte[] bytes2 = sb3.toString().getBytes(intern);
                    raVar = this;
                    java.lang.String highResolutionOutputSizeshNQ4ISI2 = raVar.getHighResolutionOutputSizeshNQ4ISI(bytes2);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("먺蚻썥ఌ䣀門혬ዲ徲顒\ue500⇓扩", 15541 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr8);
                    hashMap.put(((java.lang.String) objArr8[0]).intern(), highResolutionOutputSizeshNQ4ISI2);
                    util.h.xy.ci.ra m259312 = util.h.xy.ci.ra.m25931();
                    byte[] m259333 = m259312.m25933(util.h.xy.ci.mb.f1105);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(new java.lang.String(m259333, intern));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-1251839442) - android.view.View.MeasureSpec.getMode(0), (short) (android.text.TextUtils.indexOf("", "", 0) + 90), (byte) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 31, 524617024 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
                    sb4.append(((java.lang.String) objArr9[0]).intern());
                    java.lang.String obj2 = sb4.toString();
                    util.h.xy.cn.mb mbVar2 = new util.h.xy.cn.mb();
                    byte[] m259334 = m259312.m25933(util.h.xy.ci.mb.f1106);
                    if (util.h.xy.cv.ra.m26070(m259334)) {
                        try {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((-1251839410) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 62), (byte) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 32, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 524617057, objArr10);
                            m25980 = mbVar2.m25981(obj2, null, bytes2, ((java.lang.String) objArr10[0]).intern(), hashMap);
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } else {
                        java.lang.String str2 = new java.lang.String(m259334, intern);
                        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        short axisFromString = (short) (android.view.MotionEvent.axisFromString("") - 60);
                        byte scrollBarSize = (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
                        try {
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(mirror - 36322, axisFromString, scrollBarSize, (-31) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), android.widget.ExpandableListView.getPackedPositionType(0L) + 524617057, objArr11);
                            m25980 = mbVar2.m25980(obj2, null, bytes2, ((java.lang.String) objArr11[0]).intern(), hashMap, java.lang.Integer.parseInt(str2));
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                }
                return getHighSpeedVideoFpsRangesFor(m25980);
            } catch (java.io.IOException e5) {
                e = e5;
                java.io.IOException iOException = e;
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, iOException.getMessage(), iOException);
            } catch (util.h.xy.cm.ma e6) {
                e = e6;
                util.h.xy.cm.ma maVar = e;
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, maVar.getMessage(), maVar);
            } catch (util.h.xy.cn.b e7) {
                e = e7;
                util.h.xy.cn.b bVar = e;
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, bVar.getMessage(), bVar);
            } catch (util.h.xy.ct.mc e8) {
                e = e8;
                util.h.xy.ct.mc mcVar = e;
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1108, mcVar.getMessage(), mcVar);
            }
        } catch (java.io.IOException e9) {
            e = e9;
            java.io.IOException iOException2 = e;
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, iOException2.getMessage(), iOException2);
        } catch (util.h.xy.cm.ma e10) {
            e = e10;
            util.h.xy.cm.ma maVar2 = e;
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, maVar2.getMessage(), maVar2);
        } catch (util.h.xy.cn.b e11) {
            e = e11;
            util.h.xy.cn.b bVar2 = e;
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, bVar2.getMessage(), bVar2);
        } catch (util.h.xy.ct.mc e12) {
            e = e12;
            util.h.xy.ct.mc mcVar2 = e;
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1108, mcVar2.getMessage(), mcVar2);
        }
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:104:0x0225 */
    private util.h.xy.cj.mb getHighSpeedVideoFpsRangesFor(util.h.xy.cn.ma maVar) throws util.h.xy.ck.rc {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        int m25977 = maVar.m25977();
        byte[] bArr12 = null;
        try {
            try {
                try {
                    byte[] m25976 = maVar.m25976();
                    java.util.Map<java.lang.String, java.lang.String> highResolutionOutputSizeshNQ4ISI = util.h.xy.cq.b.getHighResolutionOutputSizeshNQ4ISI(m25976);
                    if (m25977 / 100 != 2) {
                        util.h.xy.cj.mb Camera2StreamConfigurationMap2 = util.h.xy.cq.b.Camera2StreamConfigurationMap(m25977, m25976);
                        util.h.xy.cv.ra.m26068(null, null, null, null, null, null);
                        return Camera2StreamConfigurationMap2;
                    }
                    int i = getOutputFormats + 5;
                    getHighResolutionOutputSizeshNQ4ISI = i % 128;
                    try {
                        if (i % 2 != 0) {
                            if (util.h.xy.cv.ra.m26070(m25976)) {
                                util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoSizes((-1251839406) - android.text.TextUtils.indexOf("", ""), (short) (android.text.TextUtils.indexOf("", "", 0, 0) - 98), (byte) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.graphics.ImageFormat.getBitsPerPixel(0) - 30, 524617047 + android.view.View.MeasureSpec.getSize(0), objArr);
                                throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr[0]).intern());
                            }
                            bArr9 = util.h.xy.ct.rc.m26047().mo26035(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107), null, util.h.xy.ct.ma.b.f1126.m26043() | util.h.xy.ct.ma.b.f1123.m26043()).get(util.h.xy.ct.ma.b.f1123);
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("먟楙ᲈ쏆\uf71f驫䦈糇\u2008", 54083 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                                bArr8 = util.h.xy.cv.ma.m26065(highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr2[0]).intern()));
                            } catch (java.io.UnsupportedEncodingException unused) {
                            } catch (util.h.xy.cm.ma unused2) {
                            } catch (util.h.xy.ct.mc unused3) {
                            } catch (java.lang.Throwable th) {
                                th = th;
                                bArr8 = null;
                            }
                            try {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("먟ȝ쨀鈚娏∇\uea22눯稰숷詔剙ᩁ\ue27fꩰ牼㩪良䩱ኗ\uda81ꊁ檕㊣戴䊠ત튫髚拟⫝̸\uf2d6", 47111 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                                java.lang.String str = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr3[0]).intern());
                                if (str == null) {
                                    getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 41) % 128;
                                    this.getOutputSizes.m26012(-1);
                                } else {
                                    this.getOutputSizes.m26012(java.lang.Integer.parseInt(str));
                                    getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                                }
                                bArr7 = util.h.xy.cv.ra.m26072(bArr9, this.getOutputSizes.m26004());
                                try {
                                    bArr10 = util.h.xy.cq.b.getHighSpeedVideoFpsRanges(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(), bArr7, null, null).get(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI);
                                    try {
                                        bArr11 = new byte[16];
                                    } catch (java.io.UnsupportedEncodingException unused4) {
                                        util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1114;
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1251839338, (short) ((-49) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (byte) android.view.View.getDefaultSize(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 30, 524617062 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                                        throw new util.h.xy.ck.rc(dVar2, ((java.lang.String) objArr4[0]).intern());
                                    } catch (util.h.xy.cm.ma unused5) {
                                        util.h.xy.ck.d dVar3 = util.h.xy.ck.d.f1110;
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", 28403 - android.view.View.resolveSize(0, 0), objArr5);
                                        throw new util.h.xy.ck.rc(dVar3, ((java.lang.String) objArr5[0]).intern());
                                    } catch (util.h.xy.ct.mc unused6) {
                                        util.h.xy.ck.d dVar4 = util.h.xy.ck.d.f1108;
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", android.view.KeyEvent.keyCodeFromString("") + 28403, objArr6);
                                        throw new util.h.xy.ck.rc(dVar4, ((java.lang.String) objArr6[0]).intern());
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        bArr11 = null;
                                        bArr4 = null;
                                        bArr12 = bArr8;
                                        bArr = bArr9;
                                        bArr2 = bArr10;
                                        bArr3 = bArr11;
                                        bArr5 = bArr7;
                                        util.h.xy.cv.ra.m26068(bArr, bArr2, bArr3, bArr4, bArr12, bArr5);
                                        throw th;
                                    }
                                } catch (java.io.UnsupportedEncodingException unused7) {
                                    util.h.xy.ck.d dVar22 = util.h.xy.ck.d.f1114;
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1251839338, (short) ((-49) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (byte) android.view.View.getDefaultSize(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 30, 524617062 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr42);
                                    throw new util.h.xy.ck.rc(dVar22, ((java.lang.String) objArr42[0]).intern());
                                } catch (util.h.xy.cm.ma unused8) {
                                    util.h.xy.ck.d dVar32 = util.h.xy.ck.d.f1110;
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", 28403 - android.view.View.resolveSize(0, 0), objArr52);
                                    throw new util.h.xy.ck.rc(dVar32, ((java.lang.String) objArr52[0]).intern());
                                } catch (util.h.xy.ct.mc unused9) {
                                    util.h.xy.ck.d dVar42 = util.h.xy.ck.d.f1108;
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", android.view.KeyEvent.keyCodeFromString("") + 28403, objArr62);
                                    throw new util.h.xy.ck.rc(dVar42, ((java.lang.String) objArr62[0]).intern());
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    bArr10 = null;
                                    bArr11 = null;
                                    bArr4 = null;
                                    bArr12 = bArr8;
                                    bArr = bArr9;
                                    bArr2 = bArr10;
                                    bArr3 = bArr11;
                                    bArr5 = bArr7;
                                    util.h.xy.cv.ra.m26068(bArr, bArr2, bArr3, bArr4, bArr12, bArr5);
                                    throw th;
                                }
                                try {
                                    byte[] m25974 = util.h.xy.cm.rb.m25974(bArr10, bArr11, bArr8);
                                    try {
                                        this.getOutputSizes.m26013(m25974);
                                        util.h.xy.cj.mb mbVar = new util.h.xy.cj.mb(m25977, null, null);
                                        util.h.xy.cv.ra.m26068(bArr9, bArr10, bArr11, m25974, bArr8, bArr7);
                                        return mbVar;
                                    } catch (java.io.UnsupportedEncodingException unused10) {
                                        util.h.xy.ck.d dVar222 = util.h.xy.ck.d.f1114;
                                        java.lang.Object[] objArr422 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1251839338, (short) ((-49) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (byte) android.view.View.getDefaultSize(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 30, 524617062 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr422);
                                        throw new util.h.xy.ck.rc(dVar222, ((java.lang.String) objArr422[0]).intern());
                                    } catch (util.h.xy.cm.ma unused11) {
                                        util.h.xy.ck.d dVar322 = util.h.xy.ck.d.f1110;
                                        java.lang.Object[] objArr522 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", 28403 - android.view.View.resolveSize(0, 0), objArr522);
                                        throw new util.h.xy.ck.rc(dVar322, ((java.lang.String) objArr522[0]).intern());
                                    } catch (util.h.xy.ct.mc unused12) {
                                        util.h.xy.ck.d dVar422 = util.h.xy.ck.d.f1108;
                                        java.lang.Object[] objArr622 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", android.view.KeyEvent.keyCodeFromString("") + 28403, objArr622);
                                        throw new util.h.xy.ck.rc(dVar422, ((java.lang.String) objArr622[0]).intern());
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        bArr12 = bArr8;
                                        bArr = bArr9;
                                        bArr2 = bArr10;
                                        bArr3 = bArr11;
                                        bArr4 = m25974;
                                        bArr5 = bArr7;
                                        util.h.xy.cv.ra.m26068(bArr, bArr2, bArr3, bArr4, bArr12, bArr5);
                                        throw th;
                                    }
                                } catch (java.io.UnsupportedEncodingException unused13) {
                                    util.h.xy.ck.d dVar2222 = util.h.xy.ck.d.f1114;
                                    java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1251839338, (short) ((-49) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (byte) android.view.View.getDefaultSize(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 30, 524617062 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4222);
                                    throw new util.h.xy.ck.rc(dVar2222, ((java.lang.String) objArr4222[0]).intern());
                                } catch (util.h.xy.cm.ma unused14) {
                                    util.h.xy.ck.d dVar3222 = util.h.xy.ck.d.f1110;
                                    java.lang.Object[] objArr5222 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", 28403 - android.view.View.resolveSize(0, 0), objArr5222);
                                    throw new util.h.xy.ck.rc(dVar3222, ((java.lang.String) objArr5222[0]).intern());
                                } catch (util.h.xy.ct.mc unused15) {
                                    util.h.xy.ck.d dVar4222 = util.h.xy.ck.d.f1108;
                                    java.lang.Object[] objArr6222 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("먽퓩柴\uf6ceǒ邠⏩늪춌峐\uef75繸襰ᡏꭔ㨵唸\ue478真蘗ჴꏤ㋶䷀\udcc0澥ﻵ়额⮓멬픶摺\uf75dى鄪′댊숝崗\uefe0绱觑ᣏꮟ㪮喨\ue4c6瞛蚙ᅾꁡ㍄䉛\udd5d氫", android.view.KeyEvent.keyCodeFromString("") + 28403, objArr6222);
                                    throw new util.h.xy.ck.rc(dVar4222, ((java.lang.String) objArr6222[0]).intern());
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    bArr4 = null;
                                    bArr12 = bArr8;
                                    bArr = bArr9;
                                    bArr2 = bArr10;
                                    bArr3 = bArr11;
                                    bArr5 = bArr7;
                                    util.h.xy.cv.ra.m26068(bArr, bArr2, bArr3, bArr4, bArr12, bArr5);
                                    throw th;
                                }
                            } catch (java.io.UnsupportedEncodingException unused16) {
                            } catch (util.h.xy.cm.ma unused17) {
                            } catch (util.h.xy.ct.mc unused18) {
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bArr7 = null;
                                bArr10 = null;
                                bArr11 = null;
                                bArr4 = null;
                                bArr12 = bArr8;
                                bArr = bArr9;
                                bArr2 = bArr10;
                                bArr3 = bArr11;
                                bArr5 = bArr7;
                                util.h.xy.cv.ra.m26068(bArr, bArr2, bArr3, bArr4, bArr12, bArr5);
                                throw th;
                            }
                        } else {
                            util.h.xy.cv.ra.m26070(m25976);
                            throw new java.lang.ArithmeticException();
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        bArr8 = null;
                        bArr9 = null;
                        bArr7 = null;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    bArr = null;
                    bArr12 = bArr6;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                bArr = null;
                bArr2 = null;
                bArr3 = null;
                bArr4 = null;
                bArr5 = null;
                util.h.xy.cv.ra.m26068(bArr, bArr2, bArr3, bArr4, bArr12, bArr5);
                throw th;
            }
        } catch (java.io.UnsupportedEncodingException unused19) {
        } catch (util.h.xy.cm.ma unused20) {
        } catch (util.h.xy.ct.mc unused21) {
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to calculate best type for var: r3v12 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v15 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v18 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v19 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v21 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v46 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x06a1: MOVE (r29 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:139:0x06a1 */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(byte[] r31) throws util.h.xy.ck.rc {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: util.h.xy.cq.ra.getHighResolutionOutputSizeshNQ4ISI(byte[]):java.lang.String");
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = 1645371751373507040L;
        getInputFormats = -1388537307;
        getInputSizeshNQ4ISI = -408873018;
        Camera2StreamConfigurationMap = 119270711;
        getHighSpeedVideoFpsRangesFor = new byte[]{46, 71, 57, 3, 58, 7, 7, 62, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -1, 87, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -13, 72, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.google.common.base.Ascii.FF, 56, -17, 75, -37, 44, -122, 67, 66, 84, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 75, 122, 75, 86, 66, 64, 68, 84, 81, 76, 113, 74, 63, Byte.MIN_VALUE, -52, -25, -108, -38, 67, 69, 115, 99, 69, 66, 125, 98, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 84, 101, 113, 120, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 97, 124, 120, 67, 116, com.visa.cbp.getEncExpo.IResultReceiver, 123, 66, 125, 98, 0, -75, 66, 125, 98, 123, 3, 62, -26, com.visa.cbp.getEncExpo.registerForActivityResult, -28, -3, com.visa.cbp.getEncExpo.kernelVersion, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -66, -67, -78, Byte.MAX_VALUE, -41, -76, 115, -47, -81, -113, -73, 124, -59, -116, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -71, -71, -121, -88, -83, 76, -116, -13, -69, -113, -74, -118, -70, -84, -117, 106, -47, -95, 124, -59, -117, -83, -72, -124, -113, -80, -77, -121, -114, -71, -82, 123, -51, -123, -67, -77, -114, -73, -113, 106, -53, -123, 110, -58, -71, -125, -67, -78, -91, 44, 34, -22, -2, -27, -2, -30, -82, 58, -12, 93, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -14, -29, -22, -14, -13, -110, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 32, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -36, 62, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -37, 57, 41, com.google.common.base.Ascii.US, 8, 105, com.google.common.base.Ascii.GS, 10, 100, 16, 97, 1, 99, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.ESC, 0, 110, 32, -66, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -67, 88, -79, -89, -77, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -86, 92, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -73, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 93, -80, -67, -88, 93, -69, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -95, 88, -88, -93, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -79, 73, -87, -74, -95, 86, -81, 44, 14, 17, com.google.common.base.Ascii.VT, 13, 59, 103, 2, 5, 8, 9, 5, 0, 19, 16, com.google.common.base.Ascii.VT, 48, 9, 46, 88, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 88, -73, -69, -67, 83, -73, -78, -94, -78, -87, -92, -78, -82, -115, 88, -87, 88, 48, -53, -105, -126, 87, -107, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 121, 97, 100, 44, -93, 98, 100, 18, 114, com.google.common.base.Ascii.US, 60, -47, 75, 71, 75, 77, 86, 87, 2, -107, 93, 123, 91, 69, 93, 76, 58, -101, 85, 62, -109, 83, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 65, 72, 62, -107, 83, 77, 75, 91, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -99, 66, 83, 68, 93, 87, 108};
    }
}
