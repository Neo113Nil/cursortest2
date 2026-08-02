package util.h.xy.cq;

/* loaded from: classes18.dex */
final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static char getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static long getOutputMinFrameDuration;
    private static long getOutputSizes;
    private static char getOutputStallDuration;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputMinFrameDuration ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor();
        getOutputFormats = util.h.xy.cq.ma.class.getName();
        int i = getHighSpeedVideoFpsRangesFor + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 79) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 125) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputStallDuration ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private ma() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v32, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v43 */
    private static util.h.xy.cj.mb getHighResolutionOutputSizeshNQ4ISI(util.h.xy.cq.me meVar, util.h.xy.cq.mb mbVar, byte[] bArr, byte[] bArr2) throws util.h.xy.ck.rc {
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        util.h.xy.ci.ra m25931;
        java.lang.String obj;
        util.h.xy.cn.ma m25980;
        if (!util.h.xy.cv.ra.m26070(meVar.m26014()) && !util.h.xy.cv.ra.m26070(meVar.m26004()) && !util.h.xy.cv.ra.m26070(bArr) && !util.h.xy.cv.ra.m26070(bArr2)) {
            if (!util.h.xy.cv.ra.m26070(mbVar.getInputSizeshNQ4ISI)) {
                int i = util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor;
                util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = ((i ^ 111) + ((i & 111) << 1)) % 128;
                if (!util.h.xy.cv.ra.m26070(mbVar.Camera2StreamConfigurationMap)) {
                    int i2 = util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor;
                    int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
                    util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % 2 != 0) {
                        util.h.xy.cv.ra.m26070(mbVar.getOutputMinFrameDuration);
                        throw new java.lang.ArithmeticException();
                    }
                    if (!util.h.xy.cv.ra.m26070(mbVar.getOutputMinFrameDuration)) {
                        util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = (util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor + 87) % 128;
                        if (!util.h.xy.cv.ra.m26070(mbVar.getHighSpeedVideoSizes)) {
                            int i4 = util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor;
                            int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
                            util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = i5 % 128;
                            ?? r10 = i5 % 2;
                            if (r10 != 0) {
                                util.h.xy.cv.ra.m26070(mbVar.getHighResolutionOutputSizeshNQ4ISI);
                                throw new java.lang.ArithmeticException();
                            }
                            if (!util.h.xy.cv.ra.m26070(mbVar.getHighResolutionOutputSizeshNQ4ISI)) {
                                ?? r3 = (util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor + 39) % 128;
                                util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = r3;
                                try {
                                    try {
                                        try {
                                            try {
                                                m25931 = util.h.xy.ci.ra.m25931();
                                                try {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1105);
                                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRanges(android.view.View.combineMeasuredStates(0, 0) + 5, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38, (char) (10653 - android.view.KeyEvent.getDeadChar(0, 0)), objArr);
                                                    sb.append(new java.lang.String(m25933, ((java.lang.String) objArr[0]).intern()));
                                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12, 44 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
                                                    sb.append(((java.lang.String) objArr2[0]).intern());
                                                    obj = sb.toString();
                                                    bArr3 = util.h.xy.cq.b.getHighSpeedVideoFpsRanges(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(), util.h.xy.cv.ra.m26072(bArr, bArr2, meVar.m26004()), null, null).get(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI);
                                                } catch (util.h.xy.cn.b e) {
                                                    e = e;
                                                    bArr3 = null;
                                                }
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                util.h.xy.cv.ra.m26068(bArr3, r3, r10);
                                                throw th;
                                            }
                                        } catch (util.h.xy.cn.b e2) {
                                            e = e2;
                                            bArr4 = null;
                                            r10 = 0;
                                            bArr5 = null;
                                        }
                                    } catch (java.io.UnsupportedEncodingException unused) {
                                    } catch (java.net.MalformedURLException unused2) {
                                    } catch (util.h.xy.cm.ma unused3) {
                                        bArr3 = null;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        bArr3 = null;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    r3 = bArr6;
                                    util.h.xy.cv.ra.m26068(bArr3, r3, r10);
                                    throw th;
                                }
                                try {
                                    r10 = new byte[16];
                                    try {
                                        int i6 = util.h.xy.cq.mb.getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                        util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            byte[] bArr7 = mbVar.getInputSizeshNQ4ISI;
                                            util.h.xy.fb.a.m26823(bArr7, bArr7.length);
                                            throw new java.lang.NullPointerException();
                                        }
                                        byte[] bArr8 = mbVar.getInputSizeshNQ4ISI;
                                        byte[] m26823 = util.h.xy.fb.a.m26823(bArr8, bArr8.length);
                                        int i7 = util.h.xy.cq.mb.getHighSpeedVideoFpsRanges;
                                        int i8 = (i7 ^ 79) + ((i7 & 79) << 1);
                                        util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            throw new java.lang.NullPointerException();
                                        }
                                        bArr6 = util.h.xy.cm.rb.m25974(bArr3, r10, m26823);
                                        try {
                                            int i9 = util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor;
                                            util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = ((i9 & 73) + (i9 | 73)) % 128;
                                            byte[] bArr9 = mbVar.getHighResolutionOutputSizeshNQ4ISI;
                                            byte[] m268232 = util.h.xy.fb.a.m26823(bArr9, bArr9.length);
                                            int i10 = util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor;
                                            int i11 = (i10 & 73) + (i10 | 73);
                                            util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = i11 % 128;
                                            if (i11 % 2 != 0) {
                                                throw null;
                                            }
                                            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(obj, meVar, m268232, bArr6);
                                            java.util.HashMap hashMap = new java.util.HashMap();
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", "", 0) + 13, 56 - android.view.View.MeasureSpec.getSize(0), (char) (18848 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
                                            hashMap.put(((java.lang.String) objArr3[0]).intern(), highSpeedVideoSizes);
                                            util.h.xy.cn.mb mbVar2 = new util.h.xy.cn.mb();
                                            byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1106);
                                            if (util.h.xy.cv.ra.m26070(m259332)) {
                                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 68, (char) (15491 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr4);
                                                m25980 = mbVar2.m25981(obj, null, null, ((java.lang.String) objArr4[0]).intern(), hashMap);
                                            } else {
                                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, 37 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (10654 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr5);
                                                java.lang.String str = new java.lang.String(m259332, ((java.lang.String) objArr5[0]).intern());
                                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 69, (char) (15491 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr6);
                                                m25980 = mbVar2.m25980(obj, null, null, ((java.lang.String) objArr6[0]).intern(), hashMap, java.lang.Integer.parseInt(str));
                                            }
                                            util.h.xy.cj.mb Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m25980, meVar, mbVar, bArr3);
                                            util.h.xy.cv.ra.m26068(bArr3, bArr6, r10);
                                            return Camera2StreamConfigurationMap2;
                                        } catch (java.io.UnsupportedEncodingException unused4) {
                                            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(0) + 18, android.widget.ExpandableListView.getPackedPositionChild(0L) + 111, (char) android.text.TextUtils.getTrimmedLength(""), objArr7);
                                            throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr7[0]).intern());
                                        } catch (java.net.MalformedURLException unused5) {
                                            util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1114;
                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(12 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 129 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (45296 - android.graphics.Color.green(0)), objArr8);
                                            throw new util.h.xy.ck.rc(dVar2, ((java.lang.String) objArr8[0]).intern());
                                        } catch (util.h.xy.cm.ma unused6) {
                                            util.h.xy.ck.d dVar3 = util.h.xy.ck.d.f1110;
                                            try {
                                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 37, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 73, (char) (4419 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr9);
                                                throw new util.h.xy.ck.rc(dVar3, ((java.lang.String) objArr9[0]).intern());
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause = th4.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th4;
                                            }
                                        } catch (util.h.xy.cn.b e3) {
                                            e = e3;
                                            bArr5 = bArr6;
                                            bArr4 = bArr3;
                                            r10 = r10;
                                            try {
                                                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e.getMessage(), e);
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                                bArr3 = bArr4;
                                                r3 = bArr5;
                                                util.h.xy.cv.ra.m26068(bArr3, r3, r10);
                                                throw th;
                                            }
                                        }
                                    } catch (java.io.UnsupportedEncodingException unused7) {
                                    } catch (java.net.MalformedURLException unused8) {
                                    } catch (util.h.xy.cm.ma unused9) {
                                        bArr6 = null;
                                        util.h.xy.ck.d dVar32 = util.h.xy.ck.d.f1110;
                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 37, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 73, (char) (4419 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr92);
                                        throw new util.h.xy.ck.rc(dVar32, ((java.lang.String) objArr92[0]).intern());
                                    } catch (util.h.xy.cn.b e4) {
                                        e = e4;
                                        bArr4 = bArr3;
                                        bArr5 = null;
                                        r10 = r10;
                                        throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e.getMessage(), e);
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        r3 = 0;
                                        util.h.xy.cv.ra.m26068(bArr3, r3, r10);
                                        throw th;
                                    }
                                } catch (java.io.UnsupportedEncodingException unused10) {
                                    util.h.xy.ck.d dVar4 = util.h.xy.ck.d.f1114;
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(0) + 18, android.widget.ExpandableListView.getPackedPositionChild(0L) + 111, (char) android.text.TextUtils.getTrimmedLength(""), objArr72);
                                    throw new util.h.xy.ck.rc(dVar4, ((java.lang.String) objArr72[0]).intern());
                                } catch (java.net.MalformedURLException unused11) {
                                    util.h.xy.ck.d dVar22 = util.h.xy.ck.d.f1114;
                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(12 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 129 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (45296 - android.graphics.Color.green(0)), objArr82);
                                    throw new util.h.xy.ck.rc(dVar22, ((java.lang.String) objArr82[0]).intern());
                                } catch (util.h.xy.cm.ma unused12) {
                                    r10 = 0;
                                    bArr6 = null;
                                    util.h.xy.ck.d dVar322 = util.h.xy.ck.d.f1110;
                                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 37, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 73, (char) (4419 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr922);
                                    throw new util.h.xy.ck.rc(dVar322, ((java.lang.String) objArr922[0]).intern());
                                } catch (util.h.xy.cn.b e5) {
                                    e = e5;
                                    r10 = 0;
                                    bArr4 = bArr3;
                                    bArr5 = null;
                                    r10 = r10;
                                    throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e.getMessage(), e);
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    r10 = 0;
                                    r3 = 0;
                                    util.h.xy.cv.ra.m26068(bArr3, r3, r10);
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
            int i12 = util.h.xy.cq.mb.getHighSpeedVideoFpsRanges;
            util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor = ((i12 ^ 115) + ((i12 & 115) << 1)) % 128;
        }
        util.h.xy.ck.d dVar5 = util.h.xy.ck.d.f1114;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
        throw new util.h.xy.ck.rc(dVar5, ((java.lang.String) objArr10[0]).intern());
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, util.h.xy.cq.me meVar, byte[] bArr, byte[] bArr2) throws util.h.xy.cm.ma, util.h.xy.ck.rc, java.io.UnsupportedEncodingException, java.net.MalformedURLException {
        util.h.xy.ci.ra m25931 = util.h.xy.ci.ra.m25931();
        byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1107);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 6, 39 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (10652 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
        java.lang.String str2 = new java.lang.String(m25933, ((java.lang.String) objArr[0]).intern());
        byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1104);
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(0) + 5, 37 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10653), objArr2);
            java.lang.String str3 = new java.lang.String(m259332, ((java.lang.String) objArr2[0]).intern());
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', 140 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (50600 - android.view.KeyEvent.normalizeMetaState(0)), objArr3);
            hashMap.put(((java.lang.String) objArr3[0]).intern(), str2);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTapTimeout() >> 16) + 18, 146 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0), objArr4);
            hashMap.put(((java.lang.String) objArr4[0]).intern(), str3);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, android.view.View.getDefaultSize(0, 0) + 163, (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr5);
            java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(11 - android.view.View.MeasureSpec.getSize(0), android.view.KeyEvent.getDeadChar(0, 0) + 185, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21402), objArr6);
            hashMap.put(intern, ((java.lang.String) objArr6[0]).intern());
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.KeyEvent.getMaxKeyCode() >> 16) + 15, android.view.KeyEvent.keyCodeFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) android.view.View.MeasureSpec.getMode(0), objArr7);
            hashMap.put(((java.lang.String) objArr7[0]).intern(), java.lang.String.valueOf(meVar.m26009()));
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(10 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 211, (char) (13004 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr8);
            java.lang.String intern2 = ((java.lang.String) objArr8[0]).intern();
            byte[] m26014 = meVar.m26014();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(5 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10652), objArr9);
            hashMap.put(intern2, new java.lang.String(m26014, ((java.lang.String) objArr9[0]).intern()));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 222 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (63783 - android.text.TextUtils.indexOf("", "")), objArr10);
            java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, 235 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr11);
            hashMap.put(intern3, ((java.lang.String) objArr11[0]).intern());
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(11 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 238 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
            java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 5, 38 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10653), objArr13);
            hashMap.put(intern4, new java.lang.String(bArr, ((java.lang.String) objArr13[0]).intern()));
            java.lang.String highSpeedVideoFpsRanges = util.h.xy.cq.b.getHighSpeedVideoFpsRanges(new java.util.HashMap(hashMap));
            java.net.URL url = new java.net.URL(str);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(11 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 185, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21402), objArr14);
            java.lang.String highSpeedVideoSizes = util.h.xy.cq.b.getHighSpeedVideoSizes(url, hashMap, null, ((java.lang.String) objArr14[0]).intern(), bArr2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-16776967) - android.graphics.Color.rgb(0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr15);
            sb.append(((java.lang.String) objArr15[0]).intern());
            sb.append(highSpeedVideoFpsRanges);
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 255, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18632), objArr16);
            sb.append(((java.lang.String) objArr16[0]).intern());
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, 256 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 21744), objArr17);
            sb.append(((java.lang.String) objArr17[0]).intern());
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr18);
            sb.append(((java.lang.String) objArr18[0]).intern());
            sb.append(highSpeedVideoSizes);
            return sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static util.h.xy.cj.mb Camera2StreamConfigurationMap(util.h.xy.cn.ma maVar, util.h.xy.cq.me meVar, util.h.xy.cq.mb mbVar, byte[] bArr) throws util.h.xy.ck.rc {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] m25974;
        int m25977 = maVar.m25977();
        byte[] m25976 = maVar.m25976();
        if (m25977 / 100 != 2) {
            return util.h.xy.cq.b.Camera2StreamConfigurationMap(m25977, m25976);
        }
        try {
            try {
                bArr2 = new byte[16];
                try {
                    bArr3 = util.h.xy.cm.rb.m25974(bArr, bArr2, mbVar.getInputSizeshNQ4ISI);
                    try {
                        byte[] m259742 = util.h.xy.cm.rb.m25974(bArr, bArr2, mbVar.Camera2StreamConfigurationMap);
                        try {
                            m25974 = util.h.xy.cm.rb.m25974(bArr, bArr2, mbVar.getOutputMinFrameDuration);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bArr6 = m259742;
                            bArr7 = null;
                        }
                        try {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(util.h.xy.ct.ma.b.f1126, mbVar.getHighResolutionOutputSizeshNQ4ISI);
                            hashMap.put(util.h.xy.ct.ma.b.f1124, bArr3);
                            hashMap.put(util.h.xy.ct.ma.b.f1123, m259742);
                            hashMap.put(util.h.xy.ct.ma.b.f1125, mbVar.getHighSpeedVideoSizes);
                            util.h.xy.ct.rc.m26047().mo26032(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107), m25974, hashMap);
                            util.h.xy.cv.ra.m26068(mbVar.getInputSizeshNQ4ISI, mbVar.Camera2StreamConfigurationMap, mbVar.getOutputMinFrameDuration, mbVar.getHighSpeedVideoSizes, mbVar.getHighResolutionOutputSizeshNQ4ISI, bArr2, bArr3, m25974, m259742);
                            int i = util.h.xy.cq.mb.getHighSpeedVideoFpsRangesFor;
                            util.h.xy.cq.mb.getHighSpeedVideoFpsRanges = ((i ^ 99) + ((i & 99) << 1)) % 128;
                            meVar.m26015();
                            return new util.h.xy.cj.mb(m25977, null, null);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            bArr6 = m259742;
                            bArr7 = m25974;
                            bArr4 = bArr7;
                            bArr5 = bArr6;
                            util.h.xy.cv.ra.m26068(mbVar.getInputSizeshNQ4ISI, mbVar.Camera2StreamConfigurationMap, mbVar.getOutputMinFrameDuration, mbVar.getHighSpeedVideoSizes, mbVar.getHighResolutionOutputSizeshNQ4ISI, bArr2, bArr3, bArr4, bArr5);
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        bArr4 = null;
                        bArr5 = null;
                        util.h.xy.cv.ra.m26068(mbVar.getInputSizeshNQ4ISI, mbVar.Camera2StreamConfigurationMap, mbVar.getOutputMinFrameDuration, mbVar.getHighSpeedVideoSizes, mbVar.getHighResolutionOutputSizeshNQ4ISI, bArr2, bArr3, bArr4, bArr5);
                        throw th;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bArr3 = null;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                bArr2 = null;
                bArr3 = null;
            }
        } catch (java.io.IOException e) {
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1108;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(0) + 28, android.text.TextUtils.getOffsetAfter("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.ck.rc(dVar, sb.toString(), e);
        } catch (util.h.xy.cm.ma e2) {
            util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1110;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getMode(0) + 28, 272 - android.view.KeyEvent.keyCodeFromString(""), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(e2.getMessage());
            throw new util.h.xy.ck.rc(dVar2, sb2.toString(), e2);
        } catch (util.h.xy.ct.mc e3) {
            util.h.xy.ck.d dVar3 = util.h.xy.ck.d.f1108;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(28 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 273 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr3);
                sb3.append(((java.lang.String) objArr3[0]).intern());
                sb3.append(e3.getMessage());
                throw new util.h.xy.ck.rc(dVar3, sb3.toString(), e3);
            } catch (java.lang.Throwable th6) {
                java.lang.Throwable cause = th6.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th6;
            }
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.ct.mc, java.io.IOException, java.security.cert.CertificateException, util.h.xy.cm.ma {
        java.io.ByteArrayInputStream byteArrayInputStream = null;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.Gravity.getAbsoluteGravity(0, 0) + 1178, 300 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 53767), objArr);
            java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(((java.lang.String) objArr[0]).intern().getBytes());
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(5 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1478 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.View.resolveSize(0, 0) + 45250), objArr2);
                try {
                    java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("ᚃ賈錏ᖳ\ud8d0듐燥羽僴嬓\uf116Aᯱ㛐ⵁ僺夅㨀ꌔ\udfe5樽⅟꺂廆椃ꌑ훦턐㢫甜ᢉ殂\ua4c8堾ꠤ\uf3f8籇\uedd9", 37 - android.view.KeyEvent.normalizeMetaState(0), objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("섑튒\ue600﮼輜ꂀ됄䦐崐溜ș", 4994 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 73) % 128;
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("ᚃ賈錏ᖳ\ud8d0듐燥羽僴嬓\uf116Aᯱ㛐ⵁ僺夅㨀ꌔ\udfe5樽⅟꺂廆椃ꌑ훦턐㢫甜ᢉ殂\ua4c8堾ꠤ\uf3f8籇\uedd9", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 37, objArr6);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("팾\u1755鮩\ue803溲竁㢫甜琛椝夅㨀灤뱈ᣑﲈ鼼⤸\uf467犡", 18 - android.view.MotionEvent.axisFromString(""), objArr7);
                        java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr7[0], java.io.InputStream.class).invoke(invoke, byteArrayInputStream2);
                        try {
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("ᚃ賈錏ᖳ\ud8d0듐燥羽僴嬓\uf116Aᯱ㛐ⵁ僺夅㨀ꌔ\udfe5樽⅟꺂廆椃ꌑ훦턐㢫甜", 30 - android.text.TextUtils.indexOf("", "", 0), objArr8);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("팾\u1755䁹灔诚㑜퀀\ue738\u2e74\ueb14ꚅ繷", 12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
                            java.lang.Object invoke3 = cls3.getMethod((java.lang.String) objArr9[0], null).invoke(invoke2, null);
                            int i = (getHighSpeedVideoFpsRangesFor + 73) % 128;
                            getHighSpeedVideoFpsRanges = i;
                            getHighSpeedVideoFpsRangesFor = (i + 15) % 128;
                            try {
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("ᚃ賈錏ᖳ\ud8d0듐燥羽僴嬓\uf116Aᯱ㛐ἦ\uf4cbν糋ᣑﲈ猁䙠籇\uedd9", android.view.View.getDefaultSize(0, 0) + 23, objArr10);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("섑ᾄ簬嫶뭄駦\uf693휳㖫ቝ", 56983 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr11);
                                if (!util.h.xy.cm.c.m25961((byte[]) cls4.getMethod((java.lang.String) objArr11[0], null).invoke(invoke3, null), bArr, util.h.xy.cm.ra.f1119)) {
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                                    try {
                                        byteArrayInputStream2.close();
                                    } catch (java.io.IOException unused) {
                                    }
                                    return false;
                                }
                                util.h.xy.cs.b m26021 = util.h.xy.cs.a.m26021();
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, 1483 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47714), objArr12);
                                if (!m26021.mo26025(((java.lang.String) objArr12[0]).intern())) {
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 37) % 128;
                                    util.h.xy.cs.b m260212 = util.h.xy.cs.a.m26021();
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, android.view.View.MeasureSpec.getSize(0) + 1483, (char) (47714 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr13);
                                    m260212.mo26024(((java.lang.String) objArr13[0]).intern(), bArr);
                                }
                                try {
                                    byteArrayInputStream2.close();
                                } catch (java.io.IOException unused2) {
                                }
                                return true;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
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
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    static util.h.xy.cj.mb getHighResolutionOutputSizeshNQ4ISI(util.h.xy.cn.ma maVar, util.h.xy.cq.me meVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.ck.rc {
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        java.lang.Object obj;
        byte[] bArr9;
        byte[] bArr10;
        byte[] m26065;
        byte[] bytes;
        int m25977 = maVar.m25977();
        byte[] m25976 = maVar.m25976();
        if (m25977 / 100 == 2) {
            if (util.h.xy.cv.ra.m26070(m25976)) {
                util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, android.text.TextUtils.getOffsetBefore("", 0) + 1499, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr);
                throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr[0]).intern());
            }
            ?? r9 = 48;
            try {
                try {
                    java.util.Map<java.lang.String, java.lang.String> highResolutionOutputSizeshNQ4ISI = util.h.xy.cq.b.getHighResolutionOutputSizeshNQ4ISI(m25976);
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(23 - android.graphics.Color.green(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1544, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr2);
                        if (!getHighSpeedVideoFpsRangesFor(util.h.xy.cv.ma.m26065(highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr2[0]).intern())))) {
                            util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1115;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(38 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + 1567, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                            throw new util.h.xy.ck.rc(dVar2, ((java.lang.String) objArr3[0]).intern());
                        }
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(android.view.KeyEvent.getDeadChar(0, 0) + 18, 1604 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                        m25976 = util.h.xy.cv.ma.m26065(highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr4[0]).intern()));
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 23, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1622, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr5);
                            m26065 = util.h.xy.cv.ma.m26065(highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr5[0]).intern()));
                        } catch (java.io.IOException e) {
                            e = e;
                            bArr8 = null;
                            obj = null;
                            bArr7 = null;
                            try {
                                util.h.xy.ck.d dVar3 = util.h.xy.ck.d.f1115;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                try {
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 39, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1653, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
                                    sb.append(((java.lang.String) objArr6[0]).intern());
                                    sb.append(e.getMessage());
                                    throw new util.h.xy.ck.rc(dVar3, sb.toString());
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                bArr4 = bArr8;
                                r9 = obj;
                                bArr6 = m25976;
                                bArr5 = r9;
                                util.h.xy.cv.ra.m26068(bArr6, bArr7, bArr4, bArr5);
                                throw th;
                            }
                        } catch (java.security.cert.CertificateException e2) {
                            e = e2;
                            util.h.xy.ck.d dVar4 = util.h.xy.ck.d.f1115;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 39, 1701 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr7);
                            sb2.append(((java.lang.String) objArr7[0]).intern());
                            sb2.append(e.getMessage());
                            throw new util.h.xy.ck.rc(dVar4, sb2.toString());
                        } catch (util.h.xy.cm.ma e3) {
                            e = e3;
                            util.h.xy.ck.d dVar5 = util.h.xy.ck.d.f1110;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38, 1653 - android.text.TextUtils.indexOf("", ""), (char) android.view.View.MeasureSpec.getMode(0), objArr8);
                            sb3.append(((java.lang.String) objArr8[0]).intern());
                            sb3.append(e.getMessage());
                            throw new util.h.xy.ck.rc(dVar5, sb3.toString());
                        } catch (util.h.xy.ct.mc e4) {
                            e = e4;
                            util.h.xy.ck.d dVar6 = util.h.xy.ck.d.f1108;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(39 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1654 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
                            sb4.append(((java.lang.String) objArr9[0]).intern());
                            sb4.append(e.getMessage());
                            throw new util.h.xy.ck.rc(dVar6, sb4.toString());
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            bArr9 = null;
                        }
                        try {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(8 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1644, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr10);
                            bArr8 = util.h.xy.cv.ma.m26065(highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr10[0]).intern()));
                            try {
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(11 - android.view.KeyEvent.normalizeMetaState(0), 237 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
                                java.lang.String str = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr11[0]).intern());
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4, android.text.TextUtils.getCapsMode("", 0, 0) + 38, (char) (android.view.View.MeasureSpec.getMode(0) + 10653), objArr12);
                                bytes = str.getBytes(((java.lang.String) objArr12[0]).intern());
                                try {
                                    bArr10 = bytes;
                                    bArr9 = m26065;
                                } catch (java.io.IOException e5) {
                                    e = e5;
                                    bArr10 = bytes;
                                    bArr9 = m26065;
                                } catch (java.security.cert.CertificateException e6) {
                                    e = e6;
                                } catch (util.h.xy.cm.ma e7) {
                                    e = e7;
                                } catch (util.h.xy.ct.mc e8) {
                                    e = e8;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    bArr10 = bytes;
                                    bArr9 = m26065;
                                }
                            } catch (java.io.IOException e9) {
                                e = e9;
                                bArr7 = m26065;
                                obj = null;
                                util.h.xy.ck.d dVar32 = util.h.xy.ck.d.f1115;
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 39, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1653, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr62);
                                sb5.append(((java.lang.String) objArr62[0]).intern());
                                sb5.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar32, sb5.toString());
                            } catch (java.security.cert.CertificateException e10) {
                                e = e10;
                            } catch (util.h.xy.cm.ma e11) {
                                e = e11;
                            } catch (util.h.xy.ct.mc e12) {
                                e = e12;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                bArr9 = m26065;
                                bArr10 = null;
                            }
                            try {
                                util.h.xy.cj.mb highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(meVar, new util.h.xy.cq.mb(bytes, m25976, m26065, bArr8, bArr3), bArr, bArr2);
                                util.h.xy.cv.ra.m26068(m25976, bArr9, bArr8, bArr10);
                                return highResolutionOutputSizeshNQ4ISI2;
                            } catch (java.io.IOException e13) {
                                e = e13;
                                bArr7 = bArr9;
                                obj = bArr10;
                                util.h.xy.ck.d dVar322 = util.h.xy.ck.d.f1115;
                                java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr622 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 39, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1653, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr622);
                                sb52.append(((java.lang.String) objArr622[0]).intern());
                                sb52.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar322, sb52.toString());
                            } catch (java.security.cert.CertificateException e14) {
                                e = e14;
                                util.h.xy.ck.d dVar42 = util.h.xy.ck.d.f1115;
                                java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 39, 1701 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr72);
                                sb22.append(((java.lang.String) objArr72[0]).intern());
                                sb22.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar42, sb22.toString());
                            } catch (util.h.xy.cm.ma e15) {
                                e = e15;
                                util.h.xy.ck.d dVar52 = util.h.xy.ck.d.f1110;
                                java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38, 1653 - android.text.TextUtils.indexOf("", ""), (char) android.view.View.MeasureSpec.getMode(0), objArr82);
                                sb32.append(((java.lang.String) objArr82[0]).intern());
                                sb32.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar52, sb32.toString());
                            } catch (util.h.xy.ct.mc e16) {
                                e = e16;
                                util.h.xy.ck.d dVar62 = util.h.xy.ck.d.f1108;
                                java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(39 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1654 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr92);
                                sb42.append(((java.lang.String) objArr92[0]).intern());
                                sb42.append(e.getMessage());
                                throw new util.h.xy.ck.rc(dVar62, sb42.toString());
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bArr7 = bArr9;
                                bArr4 = bArr8;
                                r9 = bArr10;
                                bArr6 = m25976;
                                bArr5 = r9;
                                util.h.xy.cv.ra.m26068(bArr6, bArr7, bArr4, bArr5);
                                throw th;
                            }
                        } catch (java.io.IOException e17) {
                            e = e17;
                            bArr7 = m26065;
                            bArr8 = null;
                        } catch (java.security.cert.CertificateException e18) {
                            e = e18;
                            util.h.xy.ck.d dVar422 = util.h.xy.ck.d.f1115;
                            java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr722 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 39, 1701 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr722);
                            sb222.append(((java.lang.String) objArr722[0]).intern());
                            sb222.append(e.getMessage());
                            throw new util.h.xy.ck.rc(dVar422, sb222.toString());
                        } catch (util.h.xy.cm.ma e19) {
                            e = e19;
                            util.h.xy.ck.d dVar522 = util.h.xy.ck.d.f1110;
                            java.lang.StringBuilder sb322 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr822 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38, 1653 - android.text.TextUtils.indexOf("", ""), (char) android.view.View.MeasureSpec.getMode(0), objArr822);
                            sb322.append(((java.lang.String) objArr822[0]).intern());
                            sb322.append(e.getMessage());
                            throw new util.h.xy.ck.rc(dVar522, sb322.toString());
                        } catch (util.h.xy.ct.mc e20) {
                            e = e20;
                            util.h.xy.ck.d dVar622 = util.h.xy.ck.d.f1108;
                            java.lang.StringBuilder sb422 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr922 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(39 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1654 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr922);
                            sb422.append(((java.lang.String) objArr922[0]).intern());
                            sb422.append(e.getMessage());
                            throw new util.h.xy.ck.rc(dVar622, sb422.toString());
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            bArr9 = m26065;
                            bArr10 = null;
                            bArr8 = null;
                            bArr7 = bArr9;
                            bArr4 = bArr8;
                            r9 = bArr10;
                            bArr6 = m25976;
                            bArr5 = r9;
                            util.h.xy.cv.ra.m26068(bArr6, bArr7, bArr4, bArr5);
                            throw th;
                        }
                    } catch (java.lang.Throwable th8) {
                        java.lang.Throwable cause2 = th8.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th8;
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    bArr4 = null;
                    bArr7 = null;
                }
            } catch (java.io.IOException e21) {
                e = e21;
                m25976 = null;
            } catch (java.security.cert.CertificateException e22) {
                e = e22;
            } catch (util.h.xy.cm.ma e23) {
                e = e23;
            } catch (util.h.xy.ct.mc e24) {
                e = e24;
            } catch (java.lang.Throwable th10) {
                th = th10;
                bArr4 = null;
                bArr5 = null;
                bArr6 = null;
                bArr7 = null;
                util.h.xy.cv.ra.m26068(bArr6, bArr7, bArr4, bArr5);
                throw th;
            }
        } else {
            return util.h.xy.cq.b.Camera2StreamConfigurationMap(m25977, m25976);
        }
    }

    static byte[] getHighSpeedVideoFpsRanges(util.h.xy.cm.b bVar) throws util.h.xy.ck.rc {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", "", 0) + 5, 39 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (10653 - android.text.TextUtils.getTrimmedLength("")), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            byte[] m25933 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1103);
            byte[] m259332 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1102);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(2 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1692 - android.view.KeyEvent.normalizeMetaState(0), (char) (21142 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr2);
            hashMap.put(((java.lang.String) objArr2[0]).intern(), new java.lang.String(m25933, intern));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 1693 - android.view.MotionEvent.axisFromString(""), (char) (android.view.View.MeasureSpec.getSize(0) + 54882), objArr3);
            hashMap.put(((java.lang.String) objArr3[0]).intern(), new java.lang.String(m259332, intern));
            java.lang.String m26064 = util.h.xy.cv.ma.m26064(util.h.xy.cm.c.m25964(bVar.m25959(), bVar.m25960(), hashMap));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.red(0) + 32, android.graphics.Color.argb(0, 0, 0, 0) + 1706, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(m26064);
            byte[] bytes = sb.toString().getBytes(intern);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("㫧\udcf9읩奨㞼킱\ue843鈺➈\uf0ce쿸◍꼞譧铟見", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, objArr5);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("섻蕒䧲ఌ키铎孫ῡ\ue20bꚩ櫁ㅳ", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17509, objArr6);
            java.lang.String str = (java.lang.String) cls.getField((java.lang.String) objArr6[0]).get(null);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("㫧\udcf9읩奨㞼킱\ue843鈺➈\uf0ce쿸◍꼞譧铟見", 16 - android.text.TextUtils.getTrimmedLength(""), objArr7);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\uda16쑱侒荒험\ud900", 5 - android.view.View.resolveSizeAndState(0, 0, 0), objArr8);
            java.lang.String str2 = (java.lang.String) cls2.getField((java.lang.String) objArr8[0]).get(null);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.combineMeasuredStates(0, 0) + 1, 1738 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9);
            sb2.append(((java.lang.String) objArr9[0]).intern());
            sb2.append(str2);
            java.lang.String obj = sb2.toString();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(5 - android.view.View.MeasureSpec.getMode(0), 1739 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr10);
            java.lang.String encode = java.net.URLEncoder.encode(obj, ((java.lang.String) objArr10[0]).intern());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(25 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + 1744, (char) (15986 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr11);
            sb3.append(((java.lang.String) objArr11[0]).intern());
            sb3.append(encode);
            byte[] bytes2 = sb3.toString().getBytes(intern);
            if (!util.h.xy.ct.rc.m26046().mo26040()) {
                byte[] m25992 = new util.h.xy.cp.ma().m25992(util.h.xy.cr.ra.m26018());
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(19 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1770, (char) (32973 - android.view.View.resolveSize(0, 0)), objArr12);
                sb4.append(((java.lang.String) objArr12[0]).intern());
                sb4.append(util.h.xy.cv.ma.m26064(m25992));
                return util.h.xy.cv.ra.m26072(bytes, bytes2, sb4.toString().getBytes(intern));
            }
            byte[] mo26041 = util.h.xy.ct.rc.m26046().mo26041();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 101) % 128;
            try {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 20, 1770 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32973), objArr13);
                sb5.append(((java.lang.String) objArr13[0]).intern());
                sb5.append(util.h.xy.cv.ma.m26064(mo26041));
                byte[] m26072 = util.h.xy.cv.ra.m26072(bytes, bytes2, sb5.toString().getBytes(intern));
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 41) % 128;
                return m26072;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e.getMessage(), e);
        } catch (util.h.xy.cm.ma e2) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, e2.getMessage(), e2);
        } catch (util.h.xy.ct.mc e3) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1108, e3.getMessage(), e3);
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = (char) 17021;
        getInputSizeshNQ4ISI = (char) 55512;
        getHighResolutionOutputSizeshNQ4ISI = (char) 17729;
        getOutputStallDuration = (char) 32795;
        getOutputMinFrameDuration = -5093240013853822227L;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        char[] cArr = new char[1789];
        java.nio.ByteBuffer.wrap("\u009cH\u0011\u001f\u0086\u00824>©¬_AÌÍBt÷õd\u0094\u001aA\u008f°=3²Ö TÕüKdø\u001fm\u0095ã\"\u0090á\u0006E»Î)1ÞñS\u0094Á\u0013v·ä.\u0099Ã\u000fL¼±2b§\u001eT\u008cÊ<\u007f¨íEµé8\u0098¯\u001a\u001dá\u0080d\u009c.\u0011\u0015\u0086\u00804$©µ_YÌ\u008eBr÷îd\u009c\u001a\f\u008f¸=5ÕàX¤Ï5}\u0099à\u000e\u0016ã\u0085h\u000bË¾@-%S¨Æ\u001et\u008f Ò-½º1\b\u0086\u008d\u0000\u0000G\u0097×%z¸÷NUÝ\u0092S=æ¬uÙ\u000b@\u009eµ,q£\u00871\u001cÄ¼Z+éR|\u0085òa\u0081ê\u0017Uª\u00958'ÏªBÖÐ@gæõv\u0088Õ\u001e\r\u00ad°#$¶QEÀÛgn«\u009cT\u0011\u001f\u0086\u008940©£_]ÌÄB1÷õd\u009e\u001aA\u008f´=/²Ò NÕõKdø_,¸¡ï6g\u0084À\u0019]ï¨|5òÁG$ÔSªÝ?\u000fYÛÔ¼C(ñ\u0095l\u0004\u009cn\u0011\u0010\u0086\u00944%©©_nÌÂB~÷ïd\u0082\u001a\u0014\u008f¼=$²Ã ~ÕúKdø\b\u009cn\u0011\u0010\u0086\u00944%©©_nÌÒBx÷æd\u009f\u001a\u0000\u008f¥=4²Ã DÕÎKlø\u0014m\u0095ã9\u0090®\u0006UÏÓB¦Õ:g\u0088úv\fø\u009fs\u0011Ê¤)7^IÍ\u009cn\u0011\u0010\u0086\u00944%©©_nÌÕBx÷ìd\u0094\u001a\u0012\u008f¥= ²Ü Q®¢#Ü´X\u0006é\u009bem¢þ\u0003p²Å#V^(ÈeBè7\u007f³Í\u0002P\u008e¦I5ð»S\u000eÔ\u009d¥ã/v\u0099Ä\b\u009c0\u0011_\u0086Ó\u009cn\u0011\u0010\u0086\u00944%©©_nÌÕB~÷êd\u0094\u001a\u000f\u009cN\u00110\u0086\u00944%©©_\u0011ÔåÈ\u009eEàÒd`ÕýY\u000b\u009e\u0098\"\u0016\u0088£\u00160oNðÛUiÄæ3t´\u009c<\u009cG\u0011\u0010\u0086\u00884=©á_EÌÎB1÷òd\u0090\u001a\u0017\u008f´=a²Ò MÕøKdø\u001fm\u0095ãq\u0090²\u0006T»Â)cÞäS\u0085Á\u0012vñN+Ã[TËæ{{ë\u008dt\u001eã\u0090Q%Ï¶¸ÈF]\u0095ï\u0003`äòr\u0007ß\u0099@*?¿¥1\u0017B\u0092Ôsi\u008bû;\f«\u0081Û\u0013K¤Û6LKûÝonßàBu=\u0086\u009c\u0018\u0015\u00ad\u0085?w°ÉÂ$Wáè·z\u0011\u008f\u009f\u0001\u0004\u0092÷$A¹ßËL\\7Ñ©c3ô\u0089\u0006u\u009bü-n¾ä3\u0091E\u000eÖýh\rýû\u000fg\u0080ù\u0012A§58¥J'ß\u0081Qeâët\"\u0089¿\u001a´¬'!\u009b³\u0005ÄûVaë¦}~\u008e5\u0003\u009c\u0095\u0017&\u008c¸tÍÁ_XÐÐe´÷'\b\u008f\u009a\u0012/»¡,2×DjÙ8j®ü\u001bq\u0097\u0083E\u0014Ñ¦U;×L¯Þ\"S\u0080å\u0017vç\u0088o\u001dÓ¯q <µ²Ç\u0004X¼ês\u007fþñ[\u0002Ä\u0097£)!º\u0097ÌwAãÓcdÔö~\u000b;\u009c©.\u0003£ô5ZFÓØLm´þ°p\u0011\u0085´\u0017u¨ü:JOßÁ@R,ç\u0096y\f\u008a\u009e\u001cU\u0091Þ#Q´ÂÉ·[1ì\u0094~!óø\u0005p\u0096\u009b(\f½4Î§@9Õ\u0092grø\u0096\nr\u009fê\u0010\u0094¢17\u0090I5ÚÒlaá®sa\u0084#\u0019®«\u0004<ªN\u007fÃãUnæ¶{¬\u008d\"\u001e\u0093\u0090\u000b%û·gÈùZAï7`×ò\u0003\u0007\u0083\u0099u*Þ¼[1ÂB¢Ô3i\u008cû\u0012\fû\u009et\u0013×¥q62K\u0081Ý\u000fn\u0082à`u÷\u0087G\u0018Â\u00ad³?\u0011°²Â\u000eWìéqz§\u008cn\u0001{\u0092ì$4¹\u008eËd\\Ðî[cÄôÂ\u0006>\u009b\u0092-\u0012¾ó0\\EÛ×Bh\u001dý\u009e\u000f\u0019\u0080\u0082\u0012w§\u00949[Jìß\u009dQVâ\u0099t\u0000\u0089Ù\u001b~¬Ò>R³?Ä\u009cV\u001bë\u0082}]\u008eÞ\u0000X\u0095ì&·¸TÍ\u009b_,ÐÝb\u0016÷Ù\t@\u009a\u0019/\u0091¡42\u0092DsÙêk[üÇq\u009d\u0083!\u0014\u0097¦w;ãMcÞÔPnå;v¥\u0088[\u001dÌ¯c \u0096²uÇþXµê\u001c\u007f\u0097ñ\f\u0002ô\u0094A)Ø»PÌ4A§Ó1d\u0092öw\u000bÊ\u009dX.Î£»54FµØ1mðÿwpÏ\u0082B\u0017 ¨·:\u0007O\u008eÁsRÑä#yÒ\u008a\u0097\u001c1\u0091ã#(´ïÆ~[Ôíp~\u0015ó\u008b\u0005\u0003\u0096¡(`½ËÏz@êÕ\u0092g\u001cø\u0093\n\u001f\u009fû\u0011d¢Ï4AI7Ú×l\u0003á\u0083s;\u0084¬\u0016U«î<»N6Ã\u0084UtæàxR\u008dÏ\u001fQ\u0090\u000e%Ö·4È¿Ztï÷aròÁ\u0007£\u0099\u0001*\u0082¼\u000e1äCMÔÛfWû\u0001\f\u0091\u009e\u0015\u0013¡¥o6âH@Ý×n§à*u\u0093\u00871\u0018øªh?Ä±jÂ;W\u009eé\u0013z\u0082\u008cw\u0001é\u0093T$á¹¸Ë0\\\u0094î\u0007cûõr\u0006Ô\u00986-\u0012¾\u008a04E\u0091×phÕú\u001b\u000f\u008c\u0080\u0092\u0012!§î91JÑÜ|Qåãqt3\u0089§\u001b\u000f¬\u008e>}³ÉÅLVÏë\u008c}\f\u008eæ\u0000\u0005\u0095÷'w¸ÏÊ@_=ÐÒb\u0013÷\u0083\tw\u009aå,[¡Â2\u0091D?Ù\u008fk\u0007üô\u000eg\u0083×\u0015o¦5;\u0092M4ÞíP^ååwR\u0088©\u001d·¯Q µ²%ÇÆYQêÑ|Bñ\u001f\u0002¢\u0094\u0019)¶»`Ì\u008d^XÓÁdûöl\u000b¬\u009d\u001e.Å @5ÄGkØEm\u0085ÿep¿\u0082d\u0017â©o:òO\u0095Á\u0016R¾ä\byð\u008bs\u001cû®V#2´³Æ\u0013[¡íe~äðD\u0005è\u0096\u0082(^½½Ï>@ÚÒSgåùI\n.\u009f°\u0011\u0007¢\u00ad4aI\u0093Û@l·á\u009bs%\u0084ï\u0016!«ø=\u001fNøÀKU]æÑx>\u008d\u009c\u001fy\u0090Õ\"P·ñÈ³Z\"ïÛaLòÂ\u0004P\u0099ï+D¼&1ÒC%Ô fDûÏ\rt\u009eÂ\u0013\u0098¥\t6\u009dH\u001fÝÔoQàærR\u0087B\u0018ßª0?¼±cÂÎTWééz§\u008c0\u0001\u0080\u00931$\u0081¶|Ë§]dî%c¼õa\u0006\u008a\u0098g-Î¿x0ÁE\u008f×>h¡ú\u0007\u000f\u0087\u0081G\u0012Þ¤R9<JÖÜ<Q¼ãFtþ\u0086{\u001bã¬Å>^³\u0091Å\u0013V»è,}ý\u008f3\u0000A\u0095Ð'\u000e¸£Ês_äÑ|bâ÷¯\t>\u009a ,~¡Æ3IDÓÖLk\u0010ü´\u000e\u0010\u0083\u008d\u0015y¦ä8&MìÞµP$å¬w<\u0088÷\u001aB¯Ô!a²8Ç°Y\u001eê\u0097|\u0002ñã\u0003P\u0094á)§»3Ì§^,Óæe^öÌ\bm\u009d\u0006.\u0090 \u00115\u0087G\u000eØÓj=ÿòp¢\u0082'\u0017¢©*:ðLcÁ\u009bS\fä\u0017y\u008b\u008b\u001b\u001c\u0087®{#þµaÆñ[\u0091í<~îð\u0001\u0005÷\u0097\u0017(ÃºbÏ?@\u0091Ò\u0005g\u0084ùZ\nÜ\u009cU\u0011Ä¢\u009a4/I\u0097Û\u0013lÇþLsÆ\u0085~\u0016,«\u008d=&N°ÀqUçç.xó\u008dÝ\u001f\u0012\u0090\u0082\"\u0007·ÂÉJZÐìCa\u0017ò\u008b\u0004\u001b\u0099\u0087+{¼þÎoCîÔ\u0095f\u0007û\u0084\r0\u009eû\u0010a¥¦7~H{Ýìo\u0015à¼rw\u0087ì\u0019Tªá?¸±0Â\u0094T\u0007éï{r\u008c×\u001ej\u00938$®¶\u001bË\u0097]EîÑ`Uõ×\u0006¯\u0098\"-\u0080¿\u00170çBo×Óiqú<\u000f²\u0081\u0004\u0012¼¤s9þK[ÜÄQ£ã!t\u0097\u0086w\u001bã\u00adc>Ô°~Å;V©è\u0003}ô\u008fZ\u0000Ó\u0092L'´¸°Ê\u0011_´ÑubüôJ\tß\u009b@,,¡\u00963[DÌÖlkþýu\u000eþ\u0083±\u0015\"¦\u00978\u0011MôßAPØâPw4\u0088§\u001a9¯\u0092!r²\u0096ÄrYêê\u0094|1ñ\u0090\u00035\u0094Ò&a»®Ía^#Ó®e\u0004öª\b\u007f\u009dã/n ¶5¬G\"Ø\u0093j\u000bÿûqg\u0082ù\u0014A©7:×L\u0003Á\u0083SuäÞv[\u008bÂ\u001c¢®3#\u008cµ\u0012ÆûXtí×\u007fqð2\u0005\u0081\u0097\u000f(\u0082º;Ï¬A@Ò×g§ù\"\n\u0093\u009c1\u0011Ò£n4ÌFQÛGl\u008eþ4s\u008e\u0085d\u0016Ð¨q=áN\u009dÀ'Uãçrx\u0082\u008al\u001fø\u0091@\"\u0003·¥É\u001eZòìYaÑóR\u0004Ç\u0099¯+\"¼\u0080Î\u0014C\u0086ÕrfÔøG\r#\u009e\u0091\u0010\u0017¥±7sHäÚ9oüà·r-\u0087\u0094\u0019!ªÑ<W±þÃmT\u001cé©{\u0006\u008c\u0097\u001eg\u0093â%\u001b¶\u008cË·]\u0001î\u0099`\u0004õß\u0007Q\u0098×*q¿\u00110¿B5×\u0085igúõ\fn\u0081È\u0012\u008e¤Q9\u008cK>Üùnhãòu?\u0086O\u001b\u009e\u00ad3>µ°\u000fÅ×WQèÜ}\u0081\u008f\u0016\u0000¼\u0092!'Æ¹oÊì\\NÑ\u0013b®ô\u0005\t²\u009b\u0003,Í¾^3\u00adD\u0092ÖUk\u008fý\u0001\u000eú\u0080g\u0015¥§B8GM\u0094ßbPóâew\u0092\u0089n\u001aÍ¯û!l²®Ä\rYóë`|Ú\u008e?\u0003?\u0094\u0096&a»³ÍD^ÎÐXe¿ö\u0083\b\u001f\u009d´/\t ð2\u0011G¥Ùgj:ÿ\u0094q!\u0082¼\u0014Z©Õ;SL\u00adÁ\u0090S\u000eä²v\u0014\u008b÷\u001dB®× mµ?Æ¤X\u001bí\u0096\u007feðÿ\u0002g\u0097Ô(Ýº\u0007ÏáA\u0010ÒÚdaùÇ\u000bN\u009c1\u0011Ð£\u00174\u009fF@ÛÂmBþµs\u0080\u0085\u000e\u0016Û¨L=äO\tÀÆR~ç2x´\u008a?\u001f\u009f\u0091x\"\u009f´&ÉÇZ\u0084ì\u0011a\u009fó\u0015\u0004û\u0096\u001e+ÿ½7Î\u001aC\u0089Õ$fòø\u0003\rï\u009fr\u0010ü¥¬7QH\u0097Ú\u0014oÆá\u0014ró\u0084J\u00192ª\u0083<\u0018±óÃaTíæx{Ï\u008cÅ\u001e\n\u0093¼%7¶\u0085È_]£ï_`\u0010õ\u0089\u0007e\u0098ª*\u0000¿\u009e1PB´×²i\u000eú±\f{\u0081»\u0013,¤»6+K[ÜËn{ã\u0083ux\u0086â\u00186\u00adÅ>³°4Å\u0082W\u000fèðzo\u008fÕ\u0001G\u0092\"'£¹{Êë\\\u001bÑ\u008bc;ô\u008b\tü,\u009b¡\u009d6\u0016\u0084£\u0019:&\u0011«v<â\u008e_\u0013Îå\u0010v¦ø\u0001M\u0097Þú e5Ú\u0087@\b²\u009a7o\u0096\u009c`\u0011\u0012\u0086\u008244©²_BÌþBe÷îd\u009a\u001a\u0004\u008f¿=a²× @ÕøKmø\u0014m\u0085ã\u007f\u0090á\u0006c»Ä)bÞñS\u009eÁ\u000fv¢ä$\u0099\u0091\u000fC¼þ2e§\bTÁÊ8\u007f²í\u0011bÄ\u0010|\u0085ñ:\u0085¨\u0018]ÿ\u009ce\u0011\u0010\u0086\u00944%©©_nÌÓBt÷àd\u009d\u001a\f\u008f\u008e=\"²Ô SÕåKhø\u0017m\u0088ã2\u0090 \u0006E»Ä\u009cG\u0011\u0010\u0086\u00884=©¤_UÌ\u0081Be÷îdÑ\u001a\u0017\u008f´=3²Ø GÕèK!ø\u0005m\u0089ã4\u0090á\u0006C»Ä)pÞíS\u009cÁAv²ä$\u0099Ã\u000fU¼ø2g§\u0018T\u0082Ê0\u007fµíT\u009cn\u0011\u0010\u0086\u00944%©©_nÌÕB~÷êd\u0094\u001a\u000f\u008f\u008e=2²Ô BÕãKdø\u0005\u009ce\u0011\u0010\u0086\u00944%©©_nÌÂBy÷àd\u009d\u001a\r\u008f´=/²Ö DÕÎKrø\u0014m\u0082ã#\u0090¤\u0006E\u009ce\u0011\u0010\u0086\u00944%©©_nÌÀBx÷ê\u009cG\u0011\u0010\u0086\u00884=©¤_UÌ\u0081Be÷îdÑ\u001a\u0011\u008f£=.²Ò DÕâKrøQm\u0080ã2\u0090¢\u0006T»Ò)bÞÞS\u0085Á\u000evºä$\u0099ß\u000f\u0001¼ã2d§\u0002T\u0091Ê>\u007f¯íBbÄÎÕC¨J\u0006Ç~PââZ\u007fÏ\u0089\u0012\u001a§\u0094\u0017!\u0091²öÌpYÀ\u009ce\u0011\u0010\u0086\u00944%©©_nÌÒBx÷æd\u009f\u001a\u0000\u008f¥=4²Ã DÕÎKbø\u001dm\u0088ã4\u0090¯\u0006E»þ)rÞäS\u0083Á\u0015v\u008eä3\u0099Ô\u000fP¼¬\u009c!\u009cT\u0011%\u0086§4|©ù¢U/g¸ò\nV\u0097Ça+ò\u008c|\u0007É\u0096Zõ$z±À\u0003V\u008c\u009c\u001e7ë\u0086u\u0000Æ`SáÝJ®Ã87\u0085º\u0017\fà\u009dm¾\u001cê\u0091Ø\u0006M´é)xß\u0094L3Âºw%äR\u009aË\u000fy½þ2\f \u009eU5Ë¢xÈí\u0011".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1789);
        getHighSpeedVideoSizesFor = cArr;
        getOutputSizes = 8952073561310630257L;
    }
}
