package util.h.xy.cw;

/* loaded from: classes5.dex */
final class a extends util.h.xy.cw.b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static long getOutputMinFrameDuration;
    private final util.h.xy.cw.rc getOutputSizeshNQ4ISI;
    private util.h.xy.da.a getOutputStallDurationlomOqCM;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        byte[] bArr = {76, 101, 118, 101, 108, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
        getInputSizeshNQ4ISI = bArr;
        getOutputFormats = new java.lang.String(bArr);
        int i = getInputFormats + 101;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    a(java.lang.String str) throws util.h.xy.da.b {
        super(str);
        this.getOutputSizeshNQ4ISI = new util.h.xy.cw.rc(getHighSpeedVideoSizesFor());
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void mo26073(util.h.xy.da.mb mbVar) throws util.h.xy.da.b {
        byte[] mo26125;
        if (mo26080()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("鷗㳪\udfcc纻ᦁ롣嬁琢锴㑐훢燚Ⴂ뎲務\ued77豟⼺츀棣\u0bfb\uaacd䗱\ue481蝻♅셓怿̓\uddac糍ᾧ뺗妙\uf877魓㨼픁瞯ᚾ뇫傼\uf388鉫ⵔ챙潹ตꣿ䯇\ueab6薇ⓟ읲晘ļꀘ䋴ᶽ볎徿ﺉ餩㡕\udb37稷ᔇ럳囈\uf1a1", android.graphics.ImageFormat.getBitsPerPixel(0) + 41244, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        if (!(mbVar instanceof util.h.xy.cw.mb)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("鷊㾐\ud90f窕ᐛ놛匉\uecc8踄⮔앁暲*\uddb6缹ᣰ먰垼\uf130銴ⰳ즭欝ӋꙞ䏂ᵅ뻅塁\uf5cd靖ゎ툃濋४꫱䐷\ue1d1荿峱ﹻ鯲㕮휯炚ሎ꾁䤙\uea9d萉↚썊鲥㸗\udbb4甴ᚿ뀳䶣\uef6c袻⨥쟥愢ʶ\udc57秕᭐뒗噛\uf3d9贉", 41597 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10901);
        }
        synchronized (getHighSpeedVideoFpsRanges) {
            util.h.xy.da.a m26089 = ((util.h.xy.cw.mb) mbVar).m26089();
            if (m26089 == null) {
                m26089 = util.h.xy.da.a.f1153;
            }
            this.getOutputStallDurationlomOqCM = m26089;
            util.h.xy.cw.rc rcVar = this.getOutputSizeshNQ4ISI;
            java.lang.String highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
            if (util.h.xy.cy.ra.m26123()) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                util.h.xy.cw.rc.Camera2StreamConfigurationMap(26 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr3);
                throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern());
            }
            byte[] highResolutionOutputSizeshNQ4ISI = rcVar.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizesFor, mbVar);
            try {
                byte[] bArr = util.h.xy.cw.rc.getHighSpeedVideoSizes;
                util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 43) % 128;
                rcVar.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, bArr);
                util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 1) % 128;
                byte[] bArr2 = util.h.xy.cw.rc.getHighResolutionOutputSizeshNQ4ISI;
                util.h.xy.cw.mb mbVar2 = (util.h.xy.cw.mb) mbVar;
                int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 45) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    util.h.xy.cw.rc.Camera2StreamConfigurationMap(40 - resolveSizeAndState, 26 - normalizeMetaState, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
                    util.h.xy.db.a aVar = (util.h.xy.db.a) mbVar2.m26087(((java.lang.String) objArr4[0]).intern());
                    util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 125) % 128;
                    if (aVar != null) {
                        mo26125 = aVar.mo26125();
                        if (util.h.xy.cy.ma.m26119(mo26125)) {
                            try {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                util.h.xy.cw.rc.getHighSpeedVideoFpsRanges(android.view.View.resolveSize(0, 0) - 396328396, (short) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 49), (byte) (61 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) - 55, 2006206967 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
                                throw new util.h.xy.da.b(((java.lang.String) objArr5[0]).intern());
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    } else {
                        mo26125 = util.h.xy.cz.b.m26124().mo26125();
                    }
                    if (util.h.xy.cy.ma.m26119(mo26125)) {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        util.h.xy.cw.rc.Camera2StreamConfigurationMap(android.view.View.resolveSizeAndState(0, 0, 0) + 39, 105 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr6);
                        throw new util.h.xy.da.b(((java.lang.String) objArr6[0]).intern());
                    }
                    byte[] bArr3 = new byte[16];
                    java.lang.System.arraycopy(rcVar.getOutputFormats, 32, bArr3, 0, 16);
                    byte[] highSpeedVideoSizes = util.h.xy.cw.rc.getHighSpeedVideoSizes(bArr3, bArr2, util.h.xy.cw.rc.getHighSpeedVideoFpsRangesFor, util.h.xy.cw.rc.Camera2StreamConfigurationMap);
                    try {
                        rcVar.getInputFormats = util.h.xy.cu.ra.m26057(util.h.xy.cu.ra.m26056(mo26125), highSpeedVideoSizes, 1, 128);
                        util.h.xy.cy.ma.m26116(highSpeedVideoSizes, bArr3, mo26125);
                        byte[] m26112 = util.h.xy.cy.ma.m26112(util.h.xy.cy.ma.m26121(new byte[rcVar.getInputFormats.length]));
                        rcVar.getOutputMinFrameDuration = m26112;
                        rcVar.getInputFormats = util.h.xy.cy.ma.m26120(rcVar.getInputFormats, m26112);
                        int i = util.h.xy.cw.rc.getInputSizeshNQ4ISI + 121;
                        util.h.xy.cw.rc.getHighSpeedVideoSizesFor = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                        byte[] bArr4 = util.h.xy.cw.rc.getHighSpeedVideoFpsRanges;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        util.h.xy.cw.rc.Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40, 66 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
                        util.h.xy.db.ma maVar = (util.h.xy.db.ma) ((util.h.xy.cw.mb) mbVar).m26087(((java.lang.String) objArr7[0]).intern());
                        int i2 = util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 97;
                        util.h.xy.cw.rc.getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 == 0) {
                            rcVar.getHighResolutionOutputSizeshNQ4ISI(bArr4, maVar);
                            throw new java.lang.NullPointerException();
                        }
                        rcVar.getHighResolutionOutputSizeshNQ4ISI(bArr4, maVar);
                        util.h.xy.cy.ma.m26113(highResolutionOutputSizeshNQ4ISI);
                        int i3 = util.h.xy.cw.rc.getInputSizeshNQ4ISI + 111;
                        util.h.xy.cw.rc.getHighSpeedVideoSizesFor = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw new java.lang.NullPointerException();
                        }
                        this.Camera2StreamConfigurationMap = true;
                    } catch (java.lang.Throwable th2) {
                        util.h.xy.cy.ma.m26116(highSpeedVideoSizes, bArr3, mo26125);
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            } catch (java.lang.Throwable th4) {
                util.h.xy.cy.ma.m26113(highResolutionOutputSizeshNQ4ISI);
                throw th4;
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputMinFrameDuration ^ (-7508379876853140581L));
            dVar.f2629++;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // util.h.xy.cw.b
    protected final java.lang.String getHighSpeedVideoSizes() {
        int i = getInputFormats + 7;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = getOutputFormats;
        int i3 = i2 + 49;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws util.h.xy.da.b {
        getHighSpeedVideoSizesFor = (getInputFormats + 57) % 128;
        util.h.xy.cw.rc rcVar = this.getOutputSizeshNQ4ISI;
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 15) % 128;
        byte[] Camera2StreamConfigurationMap = rcVar.Camera2StreamConfigurationMap(bArr, false, false);
        util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 41) % 128;
        int i = getInputFormats + 91;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap;
        }
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.da.b {
        int i = getInputFormats + 27;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.cw.rc rcVar = this.getOutputSizeshNQ4ISI;
        if (i % 2 != 0) {
            return rcVar.getHighSpeedVideoSizes(bArr);
        }
        rcVar.getHighSpeedVideoSizes(bArr);
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizesFor + 11;
        getInputFormats = i % 128;
        util.h.xy.cw.rc rcVar = this.getOutputSizeshNQ4ISI;
        int i2 = util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 103;
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = i2 % 128;
        byte[] Camera2StreamConfigurationMap = i2 % 2 == 0 ? rcVar.Camera2StreamConfigurationMap(bArr, false, true) : rcVar.Camera2StreamConfigurationMap(bArr, true, true);
        int i3 = util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 87;
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.cw.b
    protected final byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.da.b {
        getHighSpeedVideoSizesFor = (getInputFormats + 39) % 128;
        util.h.xy.cw.rc rcVar = this.getOutputSizeshNQ4ISI;
        util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 13) % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = rcVar.getHighResolutionOutputSizeshNQ4ISI(bArr, true, true);
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 63) % 128;
        int i = getHighSpeedVideoSizesFor + 35;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final int getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoSizesFor;
        getInputFormats = (i + 49) % 128;
        getInputFormats = (i + 11) % 128;
        return 524288;
    }

    @Override // util.h.xy.cw.b
    protected final void Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizesFor + 99;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            util.h.xy.cw.rc rcVar = this.getOutputSizeshNQ4ISI;
            getHighSpeedVideoSizesFor();
            rcVar.Camera2StreamConfigurationMap();
            getInputFormats = (getHighSpeedVideoSizesFor + 93) % 128;
            return;
        }
        util.h.xy.cw.rc rcVar2 = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor();
        rcVar2.Camera2StreamConfigurationMap();
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final void getHighSpeedVideoFpsRanges() {
        int i = getInputFormats + 11;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            this.getOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        } else {
            this.getOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
            throw new java.lang.ArithmeticException();
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = -6528595483020513768L;
    }
}
