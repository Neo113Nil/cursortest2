package util.h.xy.d;

/* loaded from: classes5.dex */
public class rf implements com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus {
    private static char[] Camera2StreamConfigurationMap = null;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static long getHighSpeedVideoSizesFor = 0;
    private static final java.lang.String getInputFormats;
    private static int getOutputFormats = 1;
    private final util.h.xy.d.b getInputSizeshNQ4ISI;
    private final util.h.xy.d.b getOutputMinFrameDuration;
    private final util.h.xy.d.d getOutputStallDuration;

    static {
        getHighSpeedVideoSizes();
        getInputFormats = util.h.xy.d.rf.class.getName();
        int i = getOutputFormats + 55;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public rf(util.h.xy.d.b bVar, util.h.xy.d.b bVar2, util.h.xy.d.d dVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int alpha = android.graphics.Color.alpha(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(alpha + 6, android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.getOutputMinFrameDuration = bVar;
        this.getInputSizeshNQ4ISI = bVar2;
        this.getOutputStallDuration = dVar;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus
    public com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState getState() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{4, 7, 121, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m26136 = this.getOutputMinFrameDuration.m26136();
        if (this.getInputSizeshNQ4ISI != null) {
            int i = getHighSpeedVideoFpsRangesFor + 17;
            getOutputFormats = i % 128;
            if (i % 2 == 0) {
                m26136.equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN);
                throw null;
            }
            if (!m26136.equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN)) {
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 109) % 128;
                if (!this.getInputSizeshNQ4ISI.m26136().equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN)) {
                    if (m26136.equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED) || this.getInputSizeshNQ4ISI.m26136().equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED)) {
                        return com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED;
                    }
                    if (!m26136.equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) && !this.getInputSizeshNQ4ISI.m26136().equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED)) {
                        if (!m26136.equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) || !this.getInputSizeshNQ4ISI.m26136().equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE)) {
                            return m26136;
                        }
                        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 119) % 128;
                        return com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
                    }
                    com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED;
                    int i2 = getOutputFormats + 73;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 == 0) {
                        return digitalizedCardState;
                    }
                    throw new java.lang.ArithmeticException();
                }
            }
            return com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN;
        }
        return m26136;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus
    public int getNumberOfPaymentsLeft() {
        int m26139;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(9 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 6 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27058 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.getOutputMinFrameDuration.m26133() == util.h.xy.d.mg.f1144) {
            m26139 = this.getOutputMinFrameDuration.m26135();
        } else {
            m26139 = this.getOutputMinFrameDuration.m26139();
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 101) % 128;
        }
        if (this.getOutputMinFrameDuration.m26133() != util.h.xy.d.mg.f1144 && this.getOutputMinFrameDuration.m26142() != 0) {
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 13) % 128;
            try {
                this.getOutputStallDuration.m26180();
                if (util.h.xy.k.ra.f2243.m26968(this.getOutputStallDuration.m26180())) {
                    if (util.h.xy.f.b.f2201.m26773(false)) {
                        int i = getOutputFormats + 105;
                        getHighSpeedVideoFpsRangesFor = i % 128;
                        m26139 = i % 2 != 0 ? m26139 + 96 : m26139 + 1;
                    }
                    this.getOutputStallDuration.m26180();
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 69) % 128;
                }
                return m26139;
            } catch (java.lang.Exception e) {
                e.getMessage();
                return m26139;
            }
        }
        this.getOutputStallDuration.m26180();
        return m26139;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 13) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizesFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 91) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 77) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus
    public boolean needsReplenishment() {
        boolean z;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{11, 7, 7, 5}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (getState() != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) {
            boolean m26259 = m26259();
            if (this.getOutputStallDuration.m26179() != null) {
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 75) % 128;
                if (!this.getOutputStallDuration.m26179().isEmpty()) {
                    z = m26258();
                    if (m26259 && !z) {
                        return false;
                    }
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 121) % 128;
                    return true;
                }
            }
            z = false;
            if (m26259) {
            }
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 121) % 128;
            return true;
        }
        int i = getOutputFormats + 101;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m26259() {
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 27) % 128;
        int numberOfPaymentsLeft = getNumberOfPaymentsLeft();
        this.getOutputMinFrameDuration.m26141();
        if (numberOfPaymentsLeft <= this.getOutputMinFrameDuration.m26141()) {
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 45) % 128;
            return true;
        }
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        return Camera2StreamConfigurationMap();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m26258() {
        int auxiliaryNumberOfPaymentsLeft = getAuxiliaryNumberOfPaymentsLeft();
        this.getInputSizeshNQ4ISI.m26141();
        if (auxiliaryNumberOfPaymentsLeft > this.getInputSizeshNQ4ISI.m26141()) {
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            return getHighSpeedVideoFpsRanges();
        }
        int i = getOutputFormats;
        getHighSpeedVideoFpsRangesFor = (i + 55) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 51) % 128;
        return true;
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr2 = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr2 != null) {
            int i5 = getHighSpeedVideoSizes + 69;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                cArr[i6] = (char) (cArr2[i6] ^ (-8125198844289309347L));
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 37) % 128;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr2, i, cArr3, 0, i2);
        if (bytes != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 41) % 128;
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                int i7 = getHighSpeedVideoFpsRanges + 9;
                getHighSpeedVideoSizes = i7 % 128;
                if (i7 % 2 != 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 1) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 85) % 128;
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 79) % 128;
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i9 = getHighSpeedVideoSizes + 99;
        getHighSpeedVideoFpsRanges = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus
    public java.lang.String getExpiryDate() {
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 107) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(8 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            try {
                util.h.xy.d.rb m26933 = util.h.xy.k.ra.m26933(true, this.getOutputStallDuration.m26180().getBytes(), this.getOutputMinFrameDuration.m26132());
                if (m26933 != null) {
                    return m26933.m26226();
                }
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 119) % 128;
                return null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
                return null;
            } catch (java.lang.Exception e2) {
                e2.getMessage();
                return null;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bb, code lost:
    
        r3 = util.h.xy.d.rf.getHighSpeedVideoFpsRangesFor + 29;
        util.h.xy.d.rf.getOutputFormats = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c3, code lost:
    
        if ((r3 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cb, code lost:
    
        if (r13.getInputSizeshNQ4ISI.m26142() == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cd, code lost:
    
        r13.getOutputStallDuration.m26179();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00de, code lost:
    
        if (util.h.xy.k.ra.f2243.m26968(r13.getOutputStallDuration.m26179()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        if (util.h.xy.f.b.f2201.m26773(true) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e8, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ea, code lost:
    
        r13.getOutputStallDuration.m26179();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ef, code lost:
    
        r2 = util.h.xy.d.rf.getHighSpeedVideoFpsRangesFor + 67;
        util.h.xy.d.rf.getOutputFormats = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f8, code lost:
    
        if ((r2 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fa, code lost:
    
        r1 = 3 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fd, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
    
        r1.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0101, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0102, code lost:
    
        r13.getInputSizeshNQ4ISI.m26142();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0109, code lost:
    
        r13.getOutputStallDuration.m26179();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        r0 = r13.getInputSizeshNQ4ISI.m26139();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", r3);
        r0 = ((java.lang.String) r3[0]).intern();
        r2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{29, 13, 0, 2}, "\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", r2);
        util.h.xy.am.ma.m25027(r0, ((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r13.getInputSizeshNQ4ISI == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r13.getInputSizeshNQ4ISI == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a2, code lost:
    
        if (r13.getInputSizeshNQ4ISI.m26133() != util.h.xy.d.mg.f1144) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a4, code lost:
    
        r0 = r13.getInputSizeshNQ4ISI.m26135();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b9, code lost:
    
        if (r13.getInputSizeshNQ4ISI.m26133() == util.h.xy.d.mg.f1144) goto L36;
     */
    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getAuxiliaryNumberOfPaymentsLeft() {
        int i = getOutputFormats + 53;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{18, 11, 163, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{18, 11, 163, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Camera2StreamConfigurationMap() {
        util.h.xy.d.rb m26933;
        int i = getHighSpeedVideoFpsRangesFor + 91;
        getOutputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                m26933 = util.h.xy.k.ra.m26933(true, this.getOutputStallDuration.m26180().getBytes(), this.getOutputMinFrameDuration.m26132());
                if (m26933 == null) {
                    int i2 = getHighSpeedVideoFpsRangesFor + 87;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                try {
                    return m26257(m26933.m26226(), this.getOutputMinFrameDuration.m26131());
                } catch (java.text.ParseException e) {
                    e.getMessage();
                    return false;
                }
            }
            m26933 = util.h.xy.k.ra.m26933(true, this.getOutputStallDuration.m26180().getBytes(), this.getOutputMinFrameDuration.m26132());
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            e2.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoFpsRanges() {
        util.h.xy.d.rb m26933;
        int i = getOutputFormats + 81;
        getHighSpeedVideoFpsRangesFor = i % 128;
        try {
            if (i % 2 != 0) {
                m26933 = util.h.xy.k.ra.m26933(true, this.getOutputStallDuration.m26179().getBytes(), this.getInputSizeshNQ4ISI.m26132());
                if (m26933 == null) {
                    return false;
                }
                try {
                    boolean m26257 = m26257(m26933.m26226(), this.getInputSizeshNQ4ISI.m26131());
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 101) % 128;
                    return m26257;
                } catch (java.text.ParseException e) {
                    e.getMessage();
                    return false;
                }
            }
            m26933 = util.h.xy.k.ra.m26933(true, this.getOutputStallDuration.m26179().getBytes(), this.getInputSizeshNQ4ISI.m26132());
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            e2.getMessage();
            return false;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26257(java.lang.String str, long j) throws java.text.ParseException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 4, 43, 1}, "\u0001\u0001\u0000\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(11 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, (char) (18154 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{42, 19, 94, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000", objArr3);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr3[0]).intern(), java.util.Locale.US);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(9 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        simpleDateFormat.parse(sb.toString()).getTime();
        new java.util.Date();
        new java.util.Date().getTime();
        if ((r9.getTime() - new java.util.Date().getTime()) / 1000.0d > j * 24.0d * 60.0d * 60.0d) {
            return false;
        }
        int i = (getOutputFormats + 97) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        getOutputFormats = (i + 61) % 128;
        return true;
    }

    static void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{42342, 42279, 42276, 42282, 42299, 42395, 42478, 42473, 42394, 42393, 42465, 42352, 42248, 42271, 42264, 42250, 42255, 42263, 42282, 42412, 42415, 42412, 42423, 42426, 42368, 42371, 42412, 42419, 42427, 42314, 42339, 42260, 42270, 42262, 42259, 42342, 42343, 42265, 42266, 42259, 42258, 42259, 42294, 42378, 42378, 42378, 42476, 42438, 42486, 42438, 42491, 42399, 42493, 42447, 42491, 42434, 42476, 42390, 42476, 42473, 42380};
        Camera2StreamConfigurationMap = new char[]{40005, 36646, 47770, 42596, 53695, 64694, 62967, 59028, 54056, 53206, 47117, 38144, 33189, 29248, 28355, 23419, 40005, 36646, 47770, 42596, 53695, 64690, 59420, 7161, 55983, 51660, 64624, 57486, 38741, 47702, 44798, 23827, 16792, 29737, 6993, 39969, 36693, 47865, 42519, 53665, 64709, 59491, 7053, 1808};
        getHighSpeedVideoSizesFor = -8103637425824231579L;
    }
}
