package util.h.xy.w;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static char[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static final java.lang.String getOutputFormats;
    private static util.h.xy.w.ra getOutputMinFrameDuration = null;
    private static int getOutputMinFrameDurationlomOqCM = 1;
    private com.gemalto.mfs.mwsdk.dcm.AbstractWalletPinService getOutputSizes;
    private com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener getOutputStallDuration;
    private util.h.xy.w.mb getValidOutputFormatsForInputhNQ4ISI;
    private com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier getOutputSizeshNQ4ISI = null;
    private boolean toString = false;
    private boolean getOutputStallDurationlomOqCM = false;
    private boolean unwrapAs = false;
    private boolean isOutputSupportedForhNQ4ISI = false;

    static /* synthetic */ com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier Camera2StreamConfigurationMap(util.h.xy.w.ra raVar) {
        int i = getHighSpeedVideoSizesFor + 91;
        getOutputMinFrameDurationlomOqCM = i % 128;
        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier = raVar.getOutputSizeshNQ4ISI;
        if (i % 2 != 0) {
            return cHCodeVerifier;
        }
        throw null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.w.ra raVar, final com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode, final java.lang.String str) {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 37) % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.w.ra.3
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static int getInputFormats = 1;
            private static long getInputSizeshNQ4ISI = 681985108349326991L;
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoSizes(java.lang.String str2, int i, java.lang.Object[] objArr) {
                char[] charArray = str2.toCharArray();
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 57) % 128;
                char[] cArr = charArray;
                util.h.xz.b.d dVar = new util.h.xz.b.d();
                dVar.f2628 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < cArr.length) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 35) % 128;
                    jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputSizeshNQ4ISI ^ (-7508379876853140581L));
                    dVar.f2629++;
                }
                char[] cArr2 = new char[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < cArr.length) {
                    cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                    dVar.f2629++;
                }
                objArr[0] = new java.lang.String(cArr2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputFormats = (getOutputMinFrameDuration + 95) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ꕘ鰽\ud7af़", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14713, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    getOutputMinFrameDuration = (getInputFormats + 57) % 128;
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("ꕃ풍䛎\uf061扣鶼\u0fef뤿⭲ꕊ풋", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 29129, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this).onError(walletPinErrorCode, str);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    util.h.xy.w.ra.getHighSpeedVideoSizes();
                    th2.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ꕘ鰽\ud7af़", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 14713, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ꕃ㱓靲湿섛堢㏓諡涂쒔德㚬", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39191, objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
            }
        });
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = i + 35;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 79;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ boolean Camera2StreamConfigurationMap(byte[] bArr) {
        boolean m26766;
        int i = getOutputMinFrameDurationlomOqCM + 35;
        getHighSpeedVideoSizesFor = i % 128;
        if (util.h.xy.j.ma.f2241.m26900() != null) {
            getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 93) % 128;
            if (util.h.xy.j.ma.f2241.m26900() != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
                m26766 = false;
                if (i % 2 != 0) {
                    return m26766;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        m26766 = util.h.xy.f.b.f2201.m26766(bArr, util.h.xy.at.ma.m25117());
        util.h.xy.at.ma.m25116();
        getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 35) % 128;
        if (i % 2 != 0) {
        }
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(util.h.xy.w.ra raVar) {
        int i = getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoSizesFor = (i + 51) % 128;
        raVar.toString = false;
        getHighSpeedVideoSizesFor = (i + 73) % 128;
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(util.h.xy.w.ra raVar) {
        int i = getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoSizesFor = (i + 61) % 128;
        boolean z = raVar.unwrapAs;
        getHighSpeedVideoSizesFor = (i + 103) % 128;
        return z;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(util.h.xy.w.ra raVar) {
        int i = getHighSpeedVideoSizesFor + 95;
        int i2 = i % 128;
        getOutputMinFrameDurationlomOqCM = i2;
        boolean z = raVar.getOutputStallDurationlomOqCM;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = i2 + 113;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = (getOutputMinFrameDurationlomOqCM + 61) % 128;
        getHighSpeedVideoSizesFor = i;
        java.lang.String str = getOutputFormats;
        int i2 = i + 83;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ util.h.xy.w.mb getHighSpeedVideoSizes(util.h.xy.w.ra raVar) {
        int i = getHighSpeedVideoSizesFor;
        getOutputMinFrameDurationlomOqCM = (i + 5) % 128;
        util.h.xy.w.mb mbVar = raVar.getValidOutputFormatsForInputhNQ4ISI;
        int i2 = i + 39;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        if (i2 % 2 != 0) {
            return mbVar;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener getHighSpeedVideoSizesFor(util.h.xy.w.ra raVar) {
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 103;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener walletPinEventListener = raVar.getOutputStallDuration;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getOutputMinFrameDurationlomOqCM = (i + 107) % 128;
        return walletPinEventListener;
    }

    static /* synthetic */ boolean getInputFormats(util.h.xy.w.ra raVar) {
        int i = getHighSpeedVideoSizesFor + 43;
        getOutputMinFrameDurationlomOqCM = i % 128;
        boolean z = raVar.toString;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ boolean getInputSizeshNQ4ISI(util.h.xy.w.ra raVar) {
        int i = (getHighSpeedVideoSizesFor + 9) % 128;
        getOutputMinFrameDurationlomOqCM = i;
        boolean z = raVar.isOutputSupportedForhNQ4ISI;
        int i2 = i + 3;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getOutputFormats = util.h.xy.w.ra.class.getName();
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 97) % 128;
    }

    private ra() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.w.ra m27672() {
        util.h.xy.w.ra raVar;
        synchronized (util.h.xy.w.ra.class) {
            int i = getOutputMinFrameDurationlomOqCM + 83;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                if (getOutputMinFrameDuration == null) {
                    getOutputMinFrameDuration = new util.h.xy.w.ra();
                    getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 71) % 128;
                }
                raVar = getOutputMinFrameDuration;
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        return raVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27674(com.gemalto.mfs.mwsdk.dcm.AbstractWalletPinService abstractWalletPinService) {
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 107) % 128;
        this.getOutputSizes = abstractWalletPinService;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", android.view.View.resolveSize(0, 0) + 4, android.view.Gravity.getAbsoluteGravity(0, 0) + 4, 236 - android.text.TextUtils.indexOf("", "", 0), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSize(0, 0) + 127, "\u0086\u0085\u0084\u0085\u0082\u0081\u0085\u0084\u0083\u0082\u0081", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.getOutputStallDuration = abstractWalletPinService.setupListener();
        int i = getOutputMinFrameDurationlomOqCM + 3;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m27675() {
        int i = getOutputMinFrameDurationlomOqCM + 9;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2188);
            throw new java.lang.ArithmeticException();
        }
        boolean m26755 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2188);
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 3) % 128;
        return m26755;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 byte[], still in use, count: 2, list:
          (r0v19 byte[] A[IMMUTABLE_TYPE]) from 0x001c: AGET (r0v19 byte[] A[IMMUTABLE_TYPE]), (0 ??[int, short, byte, char]) A[WRAPPED] (LINE:101)
          (r0v19 byte[]) from 0x002d: PHI (r0v6 byte[] A[IMMUTABLE_TYPE]) = (r0v5 byte[]), (r0v19 byte[]) binds: [B:17:0x002b, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m27678() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        /*
            r4 = this;
            boolean r0 = r4.m27675()
            r1 = 0
            if (r0 == 0) goto L62
            int r0 = util.h.xy.w.ra.getOutputMinFrameDurationlomOqCM
            int r0 = r0 + 23
            int r2 = r0 % 128
            util.h.xy.w.ra.getHighSpeedVideoSizesFor = r2
            int r0 = r0 % 2
            r2 = 1
            if (r0 == 0) goto L21
            util.h.xy.f.b r0 = util.h.xy.f.b.f2201
            util.h.xy.f.ma r3 = util.h.xy.f.ma.f2207
            byte[] r0 = r0.m26758(r3, r1)
            r3 = r0[r1]
            if (r3 != 0) goto L43
            goto L2d
        L21:
            util.h.xy.f.b r0 = util.h.xy.f.b.f2201
            util.h.xy.f.ma r3 = util.h.xy.f.ma.f2207
            byte[] r0 = r0.m26758(r3, r1)
            r3 = r0[r1]
            if (r3 != r2) goto L43
        L2d:
            r0 = r0[r2]
            if (r0 != r2) goto L3a
            int r0 = util.h.xy.w.ra.getOutputMinFrameDurationlomOqCM
            int r0 = r0 + 67
            int r0 = r0 % 128
            util.h.xy.w.ra.getHighSpeedVideoSizesFor = r0
            return r2
        L3a:
            int r0 = util.h.xy.w.ra.getOutputMinFrameDurationlomOqCM
            int r0 = r0 + 15
            int r0 = r0 % 128
            util.h.xy.w.ra.getHighSpeedVideoSizesFor = r0
            return r1
        L43:
            java.lang.String r0 = ""
            r3 = 48
            int r0 = android.text.TextUtils.indexOf(r0, r3, r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r0 = 126 - r0
            java.lang.String r3 = "\u008c\u0095\u008b\u0089\u0092\u008d\u0094\u008e\u0090\u008c\u0093\u008f\u0090\u0093\u008d\u008c\u0092\u008c\u0091\u0090\u008e\u008c\u0090\u008d\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087"
            getHighSpeedVideoFpsRangesFor(r0, r3, r2)
            com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException r0 = new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException
            r1 = r2[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.<init>(r1)
            throw r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: util.h.xy.w.ra.m27678():boolean");
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27679() {
        if (!m27675()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, 4 - android.view.View.combineMeasuredStates(0, 0), 236 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0082\u0081\u0085\u009e\u0084\u0082\u0081\u0085\u009d\u0084\u0083\u0082\u0081", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            this.getOutputSizes.onSetWalletPin(Camera2StreamConfigurationMap(util.h.xy.w.mb.Camera2StreamConfigurationMap));
            int i = getHighSpeedVideoSizesFor + 101;
            getOutputMinFrameDurationlomOqCM = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 / 5;
                return;
            }
            return;
        }
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 119) % 128;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", 4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 4 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 236, true, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 125) % 128;
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\u0001￦\u0000\b\u000f�\u0007￦\b\u000f\u000b", 11 - (jumpTapTimeout >> 16), 4 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 234 - android.view.View.MeasureSpec.getMode(0), true, objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
            com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener walletPinEventListener = this.getOutputStallDuration;
            com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_ALREADY_EXISTING;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, "\u009c\u008d\u008c\u009a\u0091\u009b\u008e\u008d\u008e\u0091\u008d\u008e\u008c\u0098\u008d\u008e\u008f\u0088\u0088\u0089\u009a\u008d\u0099\u008e\u0098\u0091\u0097\u008c\u008d\u0094\u0096\u0089\u008c\u0090\u008b\u0089\u008d\u0088\u0091\u0082\u008d\u008e\u008c\u008b\u008b\u0089\u0081", objArr5);
            walletPinEventListener.onError(walletPinErrorCode, ((java.lang.String) objArr5[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 25) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 15) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
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
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 61) % 128;
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27676() {
        if (!m27675()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", android.widget.ExpandableListView.getPackedPositionType(0L) + 4, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, 236 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), " \u009e\u0084\u0082\u0081\u009f\u009d\u0084\u0083\u0082\u0081", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener walletPinEventListener = this.getOutputStallDuration;
            com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_EXISTING;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\u000e\u000bￆ\u001d\u0007\u0012\u0012\u000b\u001aￆ\u0016\u000f\u0014ￒￆ\u001a\u000e\u000bￆ\u001d\u0007\u0012\u0012\u000b\u001aￆ\u0016\u000f\u0014ￆ\u000e\u0007\u0019ￆ\u0014\u0015\u001aￆ\b\u000b\u000b\u0014ￆ\u0019\u000b\u001aￆ\b\u000b\f\u0015\u0018\u000bￆￇ\t\u0007\u0014\u0014\u0015\u001aￆ\t\u000e\u0007\u0014\r\u000bￆ\u001a", 69 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56, android.text.TextUtils.getTrimmedLength("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, false, objArr3);
            walletPinEventListener.onError(walletPinErrorCode, ((java.lang.String) objArr3[0]).intern());
        } else {
            getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 63) % 128;
            this.getOutputStallDurationlomOqCM = true;
            this.unwrapAs = false;
            if (this.toString) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", 4 - android.view.View.resolveSize(0, 0), 3 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 236 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr4);
                java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 127, "\u0082\u0081\u0085\u009e\u0084\u0082\u0081\u009f\u009d\u0084\u0083\u0082\u0081", objArr5);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                this.getOutputSizes.onSetWalletPin(Camera2StreamConfigurationMap(util.h.xy.w.mb.getHighResolutionOutputSizeshNQ4ISI));
            } else {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 4 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 236, true, objArr6);
                java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\u0010\uffd9\t\u0010\u000f\b\uffe7\t\u0010￼\u0002\uffe7\u0001\t", 14 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 2 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, true, objArr7);
                    util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr7[0]).intern());
                    this.getOutputSizes.onVerifyWalletPin(Camera2StreamConfigurationMap(util.h.xy.w.mb.getHighSpeedVideoSizes));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        int i = getOutputMinFrameDurationlomOqCM + 15;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i2 + 83) % 128;
        getHighSpeedVideoFpsRanges = (i2 + 43) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 95) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ Camera2StreamConfigurationMap);
        if (!getHighSpeedVideoFpsRangesFor) {
            if (!getHighResolutionOutputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i5 = getHighSpeedVideoSizes + 67;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        util.h.xy.f.b.f2201.m26764(util.h.xy.f.ma.f2207, r0, false);
        r13.toString = false;
        util.h.xy.f.b.f2201.m26747();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0 ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0 ? 0 : -1)) + 3, 4 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.View.MeasureSpec.getSize(0) + 236, true, r12);
        r14 = ((java.lang.String) r12[0]).intern();
        r2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\u0005￤\u0002\u0006\r\ufff7￤\ufffe\u0006\r\u0006\r\f", 13 - android.graphics.Color.blue(0), 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 236 - android.text.TextUtils.getOffsetBefore("", 0), true, r2);
        util.h.xy.am.ma.m25027(r14, ((java.lang.String) r2[0]).intern());
        r13.getOutputSizes.onVerifyWalletPin(Camera2StreamConfigurationMap(util.h.xy.w.mb.getHighSpeedVideoSizes));
        r14 = util.h.xy.w.ra.getHighSpeedVideoSizesFor + 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cd, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        r0 = r14.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d2, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        if (r13.toString != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r13.toString != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        r14 = r13.isOutputSupportedForhNQ4ISI;
        util.h.xy.w.ra.getHighSpeedVideoSizesFor = (r4 + 99) % 128;
        r0 = new byte[]{0};
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r14 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r4 = (r4 + 91) % 128;
        util.h.xy.w.ra.getHighSpeedVideoSizesFor = r4;
        r0[0] = 1;
        util.h.xy.w.ra.getOutputMinFrameDurationlomOqCM = (r4 + 85) % 128;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27677(boolean z) {
        int i;
        if (m27675()) {
            int i2 = getHighSpeedVideoSizesFor + 3;
            int i3 = i2 % 128;
            getOutputMinFrameDurationlomOqCM = i3;
            if (i2 % 2 == 0) {
                this.getOutputStallDurationlomOqCM = false;
                this.unwrapAs = false;
                this.isOutputSupportedForhNQ4ISI = z;
            } else {
                this.getOutputStallDurationlomOqCM = false;
                this.unwrapAs = true;
                this.isOutputSupportedForhNQ4ISI = z;
            }
            getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 23) % 128;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\ufff9\uffff\u0006\u0002", 4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, 236 - android.text.TextUtils.indexOf("", "", 0, 0), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.graphics.Color.argb(0, 0, 0, 0), " \u009e\u0084\u0086\u0082\u0081¡\u0084\u0083\u0082\u0081", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener walletPinEventListener = this.getOutputStallDuration;
        com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_EXISTING;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\u0005\f\u0003\n\u0005\u0010\u000f\u0005\u0014\u0001ﾼ\u0010\u000b\nﾼ\n", 16 - android.view.View.resolveSize(0, 0), 2 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, true, objArr3);
        walletPinEventListener.onError(walletPinErrorCode, ((java.lang.String) objArr3[0]).intern());
        i = getHighSpeedVideoSizesFor + 43;
        getOutputMinFrameDurationlomOqCM = i % 128;
        getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 23) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m27673() throws com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException {
        getOutputMinFrameDurationlomOqCM = (getHighSpeedVideoSizesFor + 71) % 128;
        if (!m27675()) {
            return -1;
        }
        getHighSpeedVideoSizesFor = (getOutputMinFrameDurationlomOqCM + 59) % 128;
        byte[] m26758 = util.h.xy.f.b.f2201.m26758(util.h.xy.f.ma.f2204, false);
        if (m26758[0] == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\t\u000b\uffffﾼ\b�\n\u000e\u0001\u0010\n￥\u0003\n\u0005\u0007\u000e\u000b\u0013ﾼ\u0010\u000b\nﾼ\u0010\n\u0001\n\u000b\f", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30, 12 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 262 - android.view.Gravity.getAbsoluteGravity(0, 0), true, objArr);
            throw new com.gemalto.mfs.mwsdk.dcm.exception.WalletPinException(((java.lang.String) objArr[0]).intern());
        }
        return new java.lang.Byte(m26758[1]).intValue();
    }

    private com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier Camera2StreamConfigurationMap(util.h.xy.w.mb mbVar) {
        this.getValidOutputFormatsForInputhNQ4ISI = mbVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.view.KeyEvent.normalizeMetaState(0), "\u008d¢\u0088\u008f\u0091\u008e\u009a¡", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.getValidOutputFormatsForInputhNQ4ISI);
        final java.lang.String obj = sb.toString();
        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier = this.getOutputSizeshNQ4ISI;
        if (cHCodeVerifier == null) {
            util.h.xy.ap.ma maVar = new util.h.xy.ap.ma(new util.h.xy.at.mb() { // from class: util.h.xy.w.ra.1
                private static int getHighSpeedVideoFpsRanges = 0;
                private static int getHighSpeedVideoSizes = 1;
                private static char[] getInputSizeshNQ4ISI = {41970, 41877, 41958, 41906, 41897, 41980, 41872, 41898, 41883, 41893, 41875, 41917, 41912, 41900, 41899, 41881, 41904, 41905, 41909, 41876, 41971, 41896, 41868, 41903, 41914, 41913, 41867, 41918, 41908, 41919, 41907, 41915, 41887, 41902, 41874, 41866};
                private static char getOutputMinFrameDuration = 38464;
                private static char getHighSpeedVideoSizesFor = 44498;
                private static char getHighSpeedVideoFpsRangesFor = 36959;
                private static char getInputFormats = 34209;
                private static char getOutputFormats = 14017;

                private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr2) {
                    int i2;
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.e eVar = new util.h.xz.b.e();
                    char[] cArr = new char[charArray.length];
                    eVar.f2630 = 0;
                    char[] cArr2 = new char[2];
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 35) % 128;
                    while (eVar.f2630 < charArray.length) {
                        int i3 = getHighSpeedVideoSizes + 93;
                        getHighSpeedVideoFpsRanges = i3 % 128;
                        int i4 = 58224;
                        if (i3 % 2 != 0) {
                            cArr2[0] = charArray[eVar.f2630];
                            cArr2[0] = charArray[eVar.f2630];
                            i2 = 1;
                        } else {
                            cArr2[0] = charArray[eVar.f2630];
                            cArr2[1] = charArray[eVar.f2630 + 1];
                            i2 = 0;
                        }
                        while (i2 < 16) {
                            int i5 = getHighSpeedVideoSizes;
                            getHighSpeedVideoFpsRanges = (i5 + 29) % 128;
                            char c = cArr2[1];
                            char c2 = cArr2[0];
                            char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                            cArr2[1] = c3;
                            cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                            i4 -= 40503;
                            i2++;
                            getHighSpeedVideoFpsRanges = (i5 + 65) % 128;
                        }
                        cArr[eVar.f2630] = cArr2[0];
                        cArr[eVar.f2630 + 1] = cArr2[1];
                        eVar.f2630 += 2;
                    }
                    objArr2[0] = new java.lang.String(cArr, 0, i);
                }

                @Override // util.h.xy.at.mb
                /* renamed from: ᐝ */
                public final void mo25118(byte[] bArr) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 28), "\n\u0012\u0002\u001f", 4 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                    util.h.xy.w.ra.getHighSpeedVideoSizes();
                    synchronized (util.h.xy.w.ra.class) {
                        if (bArr.length <= 32 && bArr.length >= 4) {
                            byte[] m25117 = util.h.xy.at.ma.m25117();
                            int i = util.h.xy.w.ra.AnonymousClass2.getHighSpeedVideoFpsRanges[util.h.xy.w.ra.getHighSpeedVideoSizes(util.h.xy.w.ra.this).ordinal()];
                            if (i == 1) {
                                byte[] bArr2 = new byte[bArr.length];
                                int i2 = 0;
                                for (byte b : bArr) {
                                    byte b2 = (byte) (b ^ m25117[i2 % m25117.length]);
                                    bArr2[i2] = b2;
                                    if (b2 < 48 || ((b2 > 57 && b2 < 65) || ((b2 > 90 && b2 < 97) || b2 > 122))) {
                                        util.h.xy.w.ra raVar = util.h.xy.w.ra.this;
                                        com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_CONDITION_NOT_SATISFIED;
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        sb2.append(obj);
                                        try {
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges((byte) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 39), "\u001d\u0006\u0016\f\u0018\r\u0000\u0011\u0001\u001c\u0003\u0017#\u0000\u0015\u0000\b\u0006\f\u0016\u0011\u0000\u0011\b㘞㘞\u001b\u0013\u0004\u0017\u0004\u001f\u0000\u001d\u001f\"\u0017\u0011\u0014\u0003\u0000#\u0004\u000f\u000b\u0003\n\u0011\u0010\u0019\n#\u0005\u0010\u001c\u001a\u001e\u0015#\u000b\u0016\u0005㘒㘒\u001f\"\u0013\u001b㘦", 69 - android.text.TextUtils.getTrimmedLength(""), objArr3);
                                            sb2.append(((java.lang.String) objArr3[0]).intern());
                                            util.h.xy.w.ra.Camera2StreamConfigurationMap(raVar, walletPinErrorCode, sb2.toString());
                                            util.h.xy.w.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.w.ra.this);
                                            return;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    i2++;
                                }
                                if (util.h.xy.w.ra.Camera2StreamConfigurationMap(bArr)) {
                                    util.h.xy.w.ra.getHighSpeedVideoSizes();
                                    try {
                                        util.h.xy.u.a.f2431.m27486(false);
                                        util.h.xy.j.ma.f2241.m26903(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN);
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                        util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this).onError(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_SET_FAILED, e.getLocalizedMessage());
                                    }
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("垮矵윥ड़痵\udd7fັ\uf815ᄫࡌꇱꟀ", 12 - android.text.TextUtils.indexOf("", "", 0, 0), objArr4);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                                    util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this).onPinSet();
                                } else {
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("垮矵윥ड़痵\udd7fັ\uf815ᄫࡌꇱꟀ䳃㷧", android.view.KeyEvent.keyCodeFromString("") + 13, objArr5);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                                    com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener highSpeedVideoSizesFor = util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this);
                                    com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode2 = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_SET_FAILED;
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    sb3.append(obj);
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 97), "\u001d\u0006\u0016\f\u0018\r", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6, objArr6);
                                    sb3.append(((java.lang.String) objArr6[0]).intern());
                                    highSpeedVideoSizesFor.onError(walletPinErrorCode2, sb3.toString());
                                }
                            } else if (i == 2) {
                                byte[] bArr3 = new byte[1];
                                if (util.h.xy.w.ra.this.m27680(bArr, bArr3)) {
                                    util.h.xy.w.ra.getHighSpeedVideoSizes();
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("垮矵윥ड़痵\udd7fັ\uf815ᄫࡌ\ue595勀", android.view.View.getDefaultSize(0, 0) + 12, objArr7);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
                                    util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this).onPinVerified();
                                    if (util.h.xy.w.ra.getInputFormats(util.h.xy.w.ra.this)) {
                                        util.h.xy.w.ra.getHighSpeedVideoSizes();
                                        util.h.xy.w.ra.getHighSpeedVideoSizes(util.h.xy.w.ra.this);
                                        if (util.h.xy.w.ra.getHighSpeedVideoFpsRangesFor(util.h.xy.w.ra.this)) {
                                            util.h.xy.w.ra.this.m27676();
                                        } else if (util.h.xy.w.ra.getHighSpeedVideoFpsRanges(util.h.xy.w.ra.this)) {
                                            util.h.xy.w.ra raVar2 = util.h.xy.w.ra.this;
                                            raVar2.m27677(util.h.xy.w.ra.getInputSizeshNQ4ISI(raVar2));
                                        }
                                    }
                                } else {
                                    util.h.xy.w.ra.getHighSpeedVideoSizes();
                                    byte b3 = bArr3[0];
                                    final com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener m25036 = ((util.h.xy.ap.ma) util.h.xy.w.ra.Camera2StreamConfigurationMap(util.h.xy.w.ra.this)).m25036();
                                    if (m25036 != null) {
                                        byte[] m26758 = util.h.xy.f.b.f2201.m26758(util.h.xy.f.ma.f2204, false);
                                        final java.lang.Byte b4 = new java.lang.Byte(m26758[1]);
                                        if (m26758[0] == 0) {
                                            util.h.xy.w.ra raVar3 = util.h.xy.w.ra.this;
                                            com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode3 = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_VERIFY_INTERNAL_ERROR;
                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                            sb4.append(obj);
                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("ꊺ깶ꂏ뒩︕뚫㣗\uede9㏢\uf37a\ue133╾ˏ՚瑴璿ṁ쐭พ缘觮刔騊Ɲ쇛⊢㕻퉁ᵫ햘", android.view.KeyEvent.keyCodeFromString("") + 30, objArr8);
                                            sb4.append(((java.lang.String) objArr8[0]).intern());
                                            util.h.xy.w.ra.Camera2StreamConfigurationMap(raVar3, walletPinErrorCode3, sb4.toString());
                                        } else if (b4.intValue() <= 0) {
                                            try {
                                                util.h.xy.w.ra.getHighSpeedVideoSizes();
                                                util.h.xy.k.a.m26907(true);
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                                            }
                                            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.w.ra.1.2
                                                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                                private static int getHighSpeedVideoFpsRanges = 0;
                                                private static int getHighSpeedVideoFpsRangesFor = 0;
                                                private static long getHighSpeedVideoSizesFor = -5936630317159022478L;
                                                private static int getInputFormats = 1;
                                                private static int getInputSizeshNQ4ISI = 294925130;
                                                private static char getOutputFormats = 13130;

                                                private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i3, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr9) {
                                                    int i4 = getHighSpeedVideoFpsRanges + 75;
                                                    getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                                                    if (i4 % 2 == 0) {
                                                        throw null;
                                                    }
                                                    char[] charArray = str3.toCharArray();
                                                    getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                                                    char[] charArray2 = str2.toCharArray();
                                                    char[] charArray3 = str.toCharArray();
                                                    util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                                                    int length = charArray2.length;
                                                    char[] cArr = new char[length];
                                                    int length2 = charArray.length;
                                                    char[] cArr2 = new char[length2];
                                                    java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
                                                    java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
                                                    cArr[0] = (char) (cArr[0] ^ c);
                                                    cArr2[2] = (char) (cArr2[2] + ((char) i3));
                                                    int length3 = charArray3.length;
                                                    char[] cArr3 = new char[length3];
                                                    rcVar.f2652 = 0;
                                                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 27) % 128;
                                                    while (rcVar.f2652 < length3) {
                                                        int i5 = (rcVar.f2652 + 2) % 4;
                                                        int i6 = (rcVar.f2652 + 3) % 4;
                                                        rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i5]) % 65535);
                                                        cArr2[i6] = (char) (((cArr[i6] * 32718) + cArr2[i5]) / 65535);
                                                        cArr[i6] = rcVar.f2653;
                                                        cArr3[rcVar.f2652] = (char) ((((cArr[i6] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getOutputFormats ^ 2457411417541981002L)));
                                                        rcVar.f2652++;
                                                    }
                                                    objArr9[0] = new java.lang.String(cArr3);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    getInputFormats = (getHighSpeedVideoFpsRangesFor + 85) % 128;
                                                    try {
                                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRanges("ဎ揼醼喨", (char) (android.graphics.Color.rgb(0, 0, 0) + 16780948), android.text.TextUtils.getOffsetBefore("", 0), "鸫蘖鐦簎", "㌸ླྀꂄ辆", objArr9);
                                                        java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
                                                        int i3 = getInputFormats;
                                                        getHighSpeedVideoFpsRangesFor = (i3 + 77) % 128;
                                                        getHighSpeedVideoFpsRangesFor = (i3 + 89) % 128;
                                                        try {
                                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRanges("횟翸賈酟嫍\ufe1c瞌왼⩥\uee89》藅", (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), android.view.ViewConfiguration.getLongPressTimeout() >> 16, "ꚭハ潞祮", "㌸ླྀꂄ辆", objArr10);
                                                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr10[0]).intern());
                                                            m25036.maxRetryReached();
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 == null) {
                                                                throw th2;
                                                            }
                                                            throw cause2;
                                                        }
                                                    } catch (java.lang.Throwable th3) {
                                                        util.h.xy.w.ra.getHighSpeedVideoSizes();
                                                        th3.getMessage();
                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRanges("ဎ揼醼喨", (char) (android.view.MotionEvent.axisFromString("") + 3733), android.view.View.resolveSize(0, 0), "鸫蘖鐦簎", "㌸ླྀꂄ辆", objArr11);
                                                        java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
                                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRanges("洓䅫쫤ᕻ遱\udfa7禠옪畡\ue955㨁㘣繥", (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31069), (-1764276643) - android.graphics.Color.alpha(0), "崂흆嶖⑹", "㌸ླྀꂄ辆", objArr12);
                                                        util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr12[0]).intern());
                                                    }
                                                }
                                            });
                                        } else {
                                            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.w.ra.1.1
                                                private static int getHighSpeedVideoFpsRangesFor = 1;
                                                private static int getHighSpeedVideoSizes = 0;
                                                private static int getHighSpeedVideoSizesFor = 0;
                                                private static char[] getInputFormats = {42353, 42249, 42259, 42258, 42314, 42342, 42257, 42254, 42259, 42256, 42255, 42339, 42271, 42258, 42264, 42264, 42264, 42454, 42450, 42444, 42449, 42455, 42295, 42291, 42440, 42446, 42440, 42444, 42452, 42448, 42451, 42451, 42441, 42447, 42441, 42364, 42264, 42343, 42342, 42257, 42254, 42259, 42264, 42256, 42255, 42339, 42271, 42258};
                                                private static int getOutputMinFrameDuration = 1;

                                                private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr9) {
                                                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                    byte[] bytes = str.getBytes("ISO-8859-1");
                                                    util.h.xz.b.ma maVar2 = new util.h.xz.b.ma();
                                                    int i3 = iArr[0];
                                                    int i4 = iArr[1];
                                                    int i5 = iArr[2];
                                                    int i6 = iArr[3];
                                                    char[] cArr = getInputFormats;
                                                    if (cArr != null) {
                                                        int length = cArr.length;
                                                        char[] cArr2 = new char[length];
                                                        for (int i7 = 0; i7 < length; i7++) {
                                                            cArr2[i7] = (char) (cArr[i7] ^ (-8125198844289309347L));
                                                        }
                                                        cArr = cArr2;
                                                    }
                                                    char[] cArr3 = new char[i4];
                                                    java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
                                                    if (bytes != null) {
                                                        char[] cArr4 = new char[i4];
                                                        maVar2.f2631 = 0;
                                                        char c = 0;
                                                        while (maVar2.f2631 < i4) {
                                                            if (bytes[maVar2.f2631] == 1) {
                                                                cArr4[maVar2.f2631] = (char) (((cArr3[maVar2.f2631] * 2) + 1) - c);
                                                            } else {
                                                                cArr4[maVar2.f2631] = (char) ((cArr3[maVar2.f2631] * 2) - c);
                                                            }
                                                            c = cArr4[maVar2.f2631];
                                                            maVar2.f2631++;
                                                        }
                                                        cArr3 = cArr4;
                                                    }
                                                    if (i6 > 0) {
                                                        int i8 = getHighSpeedVideoSizes + 81;
                                                        getHighSpeedVideoFpsRangesFor = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            char[] cArr5 = new char[i4];
                                                            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
                                                            java.lang.System.arraycopy(cArr5, 0, cArr3, i4 >>> i6, i6);
                                                            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i4 - i6);
                                                        } else {
                                                            char[] cArr6 = new char[i4];
                                                            java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i4);
                                                            int i9 = i4 - i6;
                                                            java.lang.System.arraycopy(cArr6, 0, cArr3, i9, i6);
                                                            java.lang.System.arraycopy(cArr6, i6, cArr3, 0, i9);
                                                        }
                                                    }
                                                    if (z) {
                                                        char[] cArr7 = new char[i4];
                                                        maVar2.f2631 = 0;
                                                        while (maVar2.f2631 < i4) {
                                                            cArr7[maVar2.f2631] = cArr3[(i4 - maVar2.f2631) - 1];
                                                            maVar2.f2631++;
                                                        }
                                                        cArr3 = cArr7;
                                                    }
                                                    if (i5 > 0) {
                                                        maVar2.f2631 = 0;
                                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 41) % 128;
                                                        while (maVar2.f2631 < i4) {
                                                            cArr3[maVar2.f2631] = (char) (cArr3[maVar2.f2631] - iArr[2]);
                                                            maVar2.f2631++;
                                                        }
                                                    }
                                                    objArr9[0] = new java.lang.String(cArr3);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    try {
                                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 4, 8, 3}, "\u0000\u0001\u0000\u0001", objArr9);
                                                        java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
                                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(true, new int[]{4, 12, 0, 4}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", objArr10);
                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr10[0]).intern());
                                                        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode cHCodeVerifierErrorCode = com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode.WRONG_PIN;
                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(true, new int[]{16, 19, 39, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr11);
                                                        m25036.onVerificationError(b4.intValue(), new util.h.xy.v.mc(cHCodeVerifierErrorCode, ((java.lang.String) objArr11[0]).intern()));
                                                        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 85) % 128;
                                                    } catch (java.lang.Throwable th2) {
                                                        util.h.xy.w.ra.getHighSpeedVideoSizes();
                                                        th2.getMessage();
                                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 4, 8, 3}, "\u0000\u0001\u0000\u0001", objArr12);
                                                        java.lang.String intern3 = ((java.lang.String) objArr12[0]).intern();
                                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI(true, new int[]{35, 13, 0, 6}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000", objArr13);
                                                        util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr13[0]).intern());
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            } else if (i == 3) {
                                byte[] bArr4 = new byte[bArr.length];
                                int i3 = 0;
                                for (byte b5 : bArr) {
                                    byte b6 = (byte) (b5 ^ m25117[i3 % m25117.length]);
                                    bArr4[i3] = b6;
                                    if (b6 < 48 || ((b6 > 57 && b6 < 65) || ((b6 > 90 && b6 < 97) || b6 > 122))) {
                                        util.h.xy.w.ra raVar4 = util.h.xy.w.ra.this;
                                        com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode4 = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_CONDITION_NOT_SATISFIED;
                                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                        sb5.append(obj);
                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((byte) ((-16777176) - android.graphics.Color.rgb(0, 0, 0)), "\u001d\u0006\u0016\f\u0018\r\u0000\u0011\u0001\u001c\u0003\u0017#\u0000\u0015\u0000\b\u0006\f\u0016\u0011\u0000\u0011\b㘞㘞\u001b\u0013\u0004\u0017\u0004\u001f\u0000\u001d\u001f\"\u0017\u0011\u0014\u0003\u0000#\u0004\u000f\u000b\u0003\n\u0011\u0010\u0019\n#\u0005\u0010\u001c\u001a\u001e\u0015#\u000b\u0016\u0005㘒㘒\u001f\"\u0013\u001b㘦", 68 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr9);
                                        sb5.append(((java.lang.String) objArr9[0]).intern());
                                        util.h.xy.w.ra.Camera2StreamConfigurationMap(raVar4, walletPinErrorCode4, sb5.toString());
                                        util.h.xy.w.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.w.ra.this);
                                        return;
                                    }
                                    i3++;
                                }
                                util.h.xy.w.ra.getHighSpeedVideoSizes();
                                util.h.xy.w.ra.getHighSpeedVideoSizes(util.h.xy.w.ra.this);
                                if (util.h.xy.w.ra.Camera2StreamConfigurationMap(bArr)) {
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("垮矵윥ड़痵\udd7fັ\uf815ᄫࡌ郓蕑", 13 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr10[0]).intern());
                                    util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this).onPinChanged();
                                } else {
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((byte) (109 - android.view.KeyEvent.normalizeMetaState(0)), "\u001c\u0014\u0012\u0001\u000e\u0002\u0017\u001f\u0004\u0006\u0014\"㙌", 13 - android.view.View.MeasureSpec.getMode(0), objArr11);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr11[0]).intern());
                                    com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener highSpeedVideoSizesFor2 = util.h.xy.w.ra.getHighSpeedVideoSizesFor(util.h.xy.w.ra.this);
                                    com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode5 = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_NOT_CHANGED;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(obj);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((byte) (97 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\u001d\u0006\u0016\f\u0018\r", android.view.View.MeasureSpec.getSize(0) + 6, objArr12);
                                    sb6.append(((java.lang.String) objArr12[0]).intern());
                                    highSpeedVideoSizesFor2.onError(walletPinErrorCode5, sb6.toString());
                                }
                                util.h.xy.w.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.w.ra.this);
                            }
                            return;
                        }
                        util.h.xy.w.ra raVar5 = util.h.xy.w.ra.this;
                        com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode6 = com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode.PIN_CONDITION_NOT_SATISFIED;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(obj);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((byte) (31 - android.text.TextUtils.getOffsetAfter("", 0)), "\u001d\u0006\u0016\f\u0018\r\u0000\u0011\u0001\u001c\u0003\u0017#\u0000\u0015\u0000\b\u0006\f\u0016\u0011\u0000\u0011\b㘕㘕\u001b\u0013\u0004\u0017\u0004\u001f\u0004\u0011\u001b\u0001!\u0013㘑", 39 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
                        sb7.append(((java.lang.String) objArr13[0]).intern());
                        sb7.append(bArr.length);
                        util.h.xy.w.ra.Camera2StreamConfigurationMap(raVar5, walletPinErrorCode6, sb7.toString());
                        util.h.xy.w.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.w.ra.this);
                    }
                }

                private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr2) {
                    int i2;
                    int length;
                    char[] cArr;
                    int i3;
                    int i4 = getHighSpeedVideoFpsRanges + 39;
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                    char[] cArr2 = getInputSizeshNQ4ISI;
                    if (cArr2 != null) {
                        int i5 = getHighSpeedVideoFpsRanges + 77;
                        getHighSpeedVideoSizes = i5 % 128;
                        if (i5 % 2 == 0) {
                            length = cArr2.length;
                            cArr = new char[length];
                            i3 = 1;
                        } else {
                            length = cArr2.length;
                            cArr = new char[length];
                            i3 = 0;
                        }
                        while (i3 < length) {
                            cArr[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
                            i3++;
                        }
                        cArr2 = cArr;
                    }
                    char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 65) % 128;
                        i2 = i - 1;
                        cArr3[i2] = (char) (charArray[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        mcVar.f2638 = 0;
                        while (mcVar.f2638 < i2) {
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 99) % 128;
                            mcVar.f2641 = charArray[mcVar.f2638];
                            mcVar.f2636 = charArray[mcVar.f2638 + 1];
                            if (mcVar.f2641 == mcVar.f2636) {
                                int i6 = getHighSpeedVideoFpsRanges + 39;
                                getHighSpeedVideoSizes = i6 % 128;
                                if (i6 % 2 == 0) {
                                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                    cArr3[mcVar.f2638] = (char) (mcVar.f2636 << b);
                                } else {
                                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                                }
                            } else {
                                mcVar.f2639 = mcVar.f2641 / c;
                                mcVar.f2640 = mcVar.f2641 % c;
                                mcVar.f2637 = mcVar.f2636 / c;
                                mcVar.f2635 = mcVar.f2636 % c;
                                if (mcVar.f2640 == mcVar.f2635) {
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 39) % 128;
                                    mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                    mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                    int i7 = mcVar.f2639;
                                    int i8 = mcVar.f2640;
                                    int i9 = mcVar.f2637;
                                    int i10 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr2[(i7 * c) + i8];
                                    cArr3[mcVar.f2638 + 1] = cArr2[(i9 * c) + i10];
                                } else if (mcVar.f2639 == mcVar.f2637) {
                                    mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                    mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                    int i11 = mcVar.f2639;
                                    int i12 = mcVar.f2640;
                                    int i13 = mcVar.f2637;
                                    int i14 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr2[(i11 * c) + i12];
                                    cArr3[mcVar.f2638 + 1] = cArr2[(i13 * c) + i14];
                                } else {
                                    int i15 = mcVar.f2639;
                                    int i16 = mcVar.f2635;
                                    int i17 = mcVar.f2637;
                                    int i18 = mcVar.f2640;
                                    cArr3[mcVar.f2638] = cArr2[(i15 * c) + i16];
                                    cArr3[mcVar.f2638 + 1] = cArr2[(i17 * c) + i18];
                                }
                            }
                            mcVar.f2638 += 2;
                        }
                    }
                    for (int i19 = 0; i19 < i; i19++) {
                        cArr3[i19] = (char) (cArr3[i19] ^ 13722);
                    }
                    objArr2[0] = new java.lang.String(cArr3);
                }
            });
            this.getOutputSizeshNQ4ISI = maVar;
            return maVar;
        }
        int i = (getHighSpeedVideoSizesFor + 107) % 128;
        getOutputMinFrameDurationlomOqCM = i;
        getHighSpeedVideoSizesFor = (i + 79) % 128;
        return cHCodeVerifier;
    }

    /* renamed from: util.h.xy.w.ra$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        static {
            int[] iArr = new int[util.h.xy.w.mb.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[util.h.xy.w.mb.Camera2StreamConfigurationMap.ordinal()] = 1;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 113) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.w.mb.getHighSpeedVideoSizes.ordinal()] = 2;
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.w.mb.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 87) + (i | 87);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[Catch: InternalComponentException -> 0x0048, TRY_ENTER, TryCatch #2 {InternalComponentException -> 0x0048, blocks: (B:11:0x0041, B:17:0x0045), top: B:9:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[Catch: InternalComponentException -> 0x0048, TRY_LEAVE, TryCatch #2 {InternalComponentException -> 0x0048, blocks: (B:11:0x0041, B:17:0x0045), top: B:9:0x003f }] */
    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m27680(byte[] bArr, byte[] bArr2) {
        byte[] m26774;
        boolean z;
        boolean z2;
        int i;
        int i2 = getOutputMinFrameDurationlomOqCM + 41;
        getHighSpeedVideoSizesFor = i2 % 128;
        boolean z3 = true;
        if (i2 % 2 != 0) {
            this.toString = true;
            try {
                m26774 = util.h.xy.f.b.f2201.m26774(bArr, util.h.xy.at.ma.m25117());
                if (m26774[0] != 1) {
                    z = true;
                    try {
                        util.h.xy.ar.b.m25074(bArr);
                        bArr2[0] = m26774[1];
                        z3 = z;
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        e = e;
                        z3 = z;
                        e.getMessage();
                        util.h.xy.at.ma.m25116();
                        return z3;
                    }
                } else {
                    z2 = true;
                    i = getOutputMinFrameDurationlomOqCM + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getHighSpeedVideoSizesFor = i % 128;
                    try {
                        if (i % 2 == 0) {
                            this.toString = true;
                            z3 = false;
                        } else {
                            this.toString = true;
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                        z3 = z2;
                        e = e2;
                        e.getMessage();
                        util.h.xy.at.ma.m25116();
                        return z3;
                    }
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                e = e3;
                e.getMessage();
                util.h.xy.at.ma.m25116();
                return z3;
            }
        } else {
            this.toString = false;
            try {
                m26774 = util.h.xy.f.b.f2201.m26774(bArr, util.h.xy.at.ma.m25117());
                if (m26774[0] != 1) {
                    z = false;
                    util.h.xy.ar.b.m25074(bArr);
                    bArr2[0] = m26774[1];
                    z3 = z;
                } else {
                    z2 = false;
                    i = getOutputMinFrameDurationlomOqCM + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getHighSpeedVideoSizesFor = i % 128;
                    if (i % 2 == 0) {
                    }
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e4) {
                e = e4;
                z3 = false;
                e.getMessage();
                util.h.xy.at.ma.m25116();
                return z3;
            }
        }
        util.h.xy.at.ma.m25116();
        return z3;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputSizeshNQ4ISI = -1231763916;
        getInputFormats = new char[]{64344, 64339, 64363, 64369, 64348, 64343, 64350, 64305, 64322, 64333, 64311, 64334, 64387, 64319, 64304, 64317, 64330, 64313, 64307, 64314, 64318, 64335, 64315, 64316, 64375, 64332, 64312, 64386, 64362, 64336, 64364, 64366, 64354, 64357};
        Camera2StreamConfigurationMap = -1074857053;
        getHighResolutionOutputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRangesFor = true;
    }
}
