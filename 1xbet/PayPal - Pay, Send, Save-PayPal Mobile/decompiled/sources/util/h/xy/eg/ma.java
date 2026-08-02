package util.h.xy.eg;

/* loaded from: classes18.dex */
public final class ma {
    private static final util.h.xy.ew.rd Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes;
    private static int getInputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizesFor;
    private util.h.xy.eg.b getInputFormats;
    private java.security.SecureRandom getOutputFormats;
    private final util.h.xy.dh.i getOutputMinFrameDuration;

    private static void Camera2StreamConfigurationMap(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 49) % 128;
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                int i7 = getHighSpeedVideoFpsRangesFor + 17;
                getHighSpeedVideoFpsRanges = i7 % 128;
                if (i7 % 2 == 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 1) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    int i8 = getHighSpeedVideoFpsRangesFor + 85;
                    getHighSpeedVideoFpsRanges = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] / 3) - c);
                    } else {
                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    }
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            int i9 = getHighSpeedVideoFpsRanges + 39;
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 47) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 55) % 128;
        char[] cArr6 = new char[i3];
        maVar.f2631 = 0;
        while (maVar.f2631 < i3) {
            cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 103) % 128;
            while (maVar.f2631 < i3) {
                cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    /* renamed from: util.h.xy.eg.ma$ma, reason: collision with other inner class name */
    class C0267ma implements util.h.xy.ew.me {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizes;
        protected java.lang.Object getHighSpeedVideoFpsRangesFor;
        private util.h.xy.ep.mc getInputSizeshNQ4ISI;
        private util.h.xy.ed.a getOutputFormats;
        private static char[] getOutputMinFrameDuration = {64221, 64234, 64193, 64281, 64196, 64214, 64212, 64198, 64197, 64210, 64199, 64194, 64228, 64229, 64217, 64215, 64216, 64222};
        private static int getInputFormats = -1074857141;
        private static boolean getHighSpeedVideoSizesFor = true;
        private static boolean getHighResolutionOutputSizeshNQ4ISI = true;

        @Override // util.h.xy.ew.me
        /* renamed from: ˋ, reason: contains not printable characters */
        public util.h.xy.ew.rc mo26573() {
            util.h.xy.ew.rc rcVar = new util.h.xy.ew.rc(this.getOutputFormats, this.getInputSizeshNQ4ISI.m26663());
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 41) % 128;
            return rcVar;
        }

        @Override // util.h.xy.ew.me
        /* renamed from: ˋ, reason: contains not printable characters */
        public java.io.OutputStream mo26572(java.io.OutputStream outputStream) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i & 91) + (i | 91)) % 128;
            util.h.xy.em.ra m26686 = util.h.xy.eq.a.m26686(outputStream, this.getHighSpeedVideoFpsRangesFor);
            int i2 = Camera2StreamConfigurationMap + 37;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                return m26686;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // util.h.xy.ew.me
        /* renamed from: ᐝ, reason: contains not printable characters */
        public util.h.xy.ed.a mo26574() {
            int i = getHighSpeedVideoSizes;
            int i2 = (i & 55) + (i | 55);
            int i3 = i2 % 128;
            Camera2StreamConfigurationMap = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            util.h.xy.ed.a aVar = this.getOutputFormats;
            getHighSpeedVideoSizes = (i3 + 45) % 128;
            return aVar;
        }

        C0267ma(util.h.xy.dh.i iVar, int i, java.security.SecureRandom secureRandom) throws util.h.xy.ea.d {
            if (secureRandom == null) {
                try {
                    int i2 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i3 = i2 * (-751);
                    int i4 = ~i2;
                    int i5 = ~((i4 & (-129)) | (i4 ^ (-129)));
                    int i6 = ~(i4 | i);
                    int i7 = i4 | 128;
                    int i8 = -(-((~((i ^ i7) | (i7 & i))) * (-1504)));
                    int i9 = ~((i4 & 128) | (i4 ^ 128));
                    int i10 = ~((i2 ^ (-129)) | (i2 & (-129)));
                    int i11 = (((((i3 ^ (-96128)) + ((i3 & (-96128)) << 1)) + (((i5 & i6) | (i5 ^ i6)) * 1504)) - (~i8)) - 1) + (((i10 & i9) | (i10 ^ i9)) * 752);
                    byte[] bytes = "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081".getBytes("ISO-8859-1");
                    util.h.xz.b.md mdVar = new util.h.xz.b.md();
                    char[] cArr = getOutputMinFrameDuration;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        for (int i12 = 0; i12 < length; i12++) {
                            cArr2[i12] = (char) (cArr[i12] ^ (-3299939579226817547L));
                        }
                        cArr = cArr2;
                    }
                    int i13 = (int) ((-3299939579226817547L) ^ getInputFormats);
                    if (getHighResolutionOutputSizeshNQ4ISI) {
                        mdVar.f2642 = bytes.length;
                        char[] cArr3 = new char[mdVar.f2642];
                        mdVar.f2643 = 0;
                        while (mdVar.f2643 < mdVar.f2642) {
                            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i11] - i13);
                            mdVar.f2643++;
                        }
                        java.lang.String str = new java.lang.String(cArr3);
                        java.lang.String str2 = str;
                        secureRandom = (java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null);
                    } else {
                        if (getHighSpeedVideoSizesFor) {
                            throw new java.lang.NullPointerException();
                        }
                        throw new java.lang.NullPointerException();
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            util.h.xy.eg.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.eg.ma.this);
            this.getInputSizeshNQ4ISI = new util.h.xy.ep.mc(util.h.xy.eg.b.getHighSpeedVideoFpsRanges(iVar, secureRandom).mo26533());
            util.h.xy.eg.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.eg.ma.this);
            util.h.xy.ed.a highResolutionOutputSizeshNQ4ISI = util.h.xy.eg.b.getHighResolutionOutputSizeshNQ4ISI(iVar, this.getInputSizeshNQ4ISI, secureRandom);
            this.getOutputFormats = highResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = util.h.xy.eg.b.getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI);
        }
    }

    final class ra extends util.h.xy.eg.ma.C0267ma implements util.h.xy.ew.d {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoSizesFor = 0;
        private static int getInputSizeshNQ4ISI = 1;
        private static char[] getOutputFormats = {41897, 41881, 41900, 41910, 41918, 41899, 41911, 41880, 41919, 41902, 41896, 41980, 41875, 41904, 41906, 41885, 41893, 41913, 41917, 41865, 41981, 41907, 41908, 41909, 41912};
        private static char getOutputMinFrameDuration = 38467;
        private util.h.xy.eo.mb getInputFormats;
        private util.h.xy.ew.mc getOutputStallDurationlomOqCM;

        @Override // util.h.xy.ew.b
        /* renamed from: ˊ, reason: contains not printable characters */
        public final byte[] mo26575() {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 47) % 128;
            byte[] m26728 = this.getOutputStallDurationlomOqCM.m26728();
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 77) % 128;
            return m26728;
        }

        @Override // util.h.xy.eg.ma.C0267ma, util.h.xy.ew.me
        /* renamed from: ˋ */
        public final java.io.OutputStream mo26572(java.io.OutputStream outputStream) {
            util.h.xy.ew.mc mcVar = new util.h.xy.ew.mc(outputStream, this.getInputFormats.mo26641().length);
            this.getOutputStallDurationlomOqCM = mcVar;
            util.h.xy.em.ra m26686 = util.h.xy.eq.a.m26686(mcVar, this.getHighSpeedVideoFpsRangesFor);
            int i = getInputSizeshNQ4ISI + 111;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                return m26686;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
        
            if (r7.f2641 == r7.f2636) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
        
            r7.f2639 = r7.f2641 / r9;
            r7.f2640 = r7.f2641 % r9;
            r7.f2637 = r7.f2636 / r9;
            r7.f2635 = r7.f2636 % r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
        
            if (r7.f2640 != r7.f2635) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
        
            util.h.xy.eg.ma.ra.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.eg.ma.ra.Camera2StreamConfigurationMap + 57) % 128;
            r7.f2639 = ((r7.f2639 + r9) - 1) % r9;
            r7.f2637 = ((r7.f2637 + r9) - 1) % r9;
            r11 = r7.f2639;
            r12 = r7.f2640;
            r13 = r7.f2637;
            r14 = r7.f2635;
            r10[r7.f2638] = r8[(r11 * r9) + r12];
            r10[r7.f2638 + 1] = r8[(r13 * r9) + r14];
            r11 = util.h.xy.eg.ma.ra.getHighResolutionOutputSizeshNQ4ISI + 67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
        
            util.h.xy.eg.ma.ra.Camera2StreamConfigurationMap = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
        
            if (r7.f2639 != r7.f2637) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
        
            r7.f2640 = ((r7.f2640 + r9) - 1) % r9;
            r7.f2635 = ((r7.f2635 + r9) - 1) % r9;
            r11 = r7.f2639;
            r12 = r7.f2640;
            r13 = r7.f2637;
            r14 = r7.f2635;
            r10[r7.f2638] = r8[(r11 * r9) + r12];
            r10[r7.f2638 + 1] = r8[(r13 * r9) + r14];
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0151, code lost:
        
            r11 = r7.f2639;
            r12 = r7.f2635;
            r13 = r7.f2637;
            r14 = r7.f2640;
            r10[r7.f2638] = r8[(r11 * r9) + r12];
            r10[r7.f2638 + 1] = r8[(r13 * r9) + r14];
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        
            r10[r7.f2638] = (char) (r7.f2641 - r1);
            r10[r7.f2638 + 1] = (char) (r7.f2636 - r1);
            r11 = util.h.xy.eg.ma.ra.getHighResolutionOutputSizeshNQ4ISI + 17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
        
            if (r7.f2641 == r7.f2636) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        ra(util.h.xy.dh.i iVar, int i, java.security.SecureRandom secureRandom) throws util.h.xy.ea.d {
            super(iVar, i, secureRandom);
            int i2;
            int i3 = getHighSpeedVideoSizesFor + 5;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
                throw null;
            }
            if (this.getHighSpeedVideoFpsRangesFor instanceof util.h.xy.eo.mb) {
                util.h.xy.eo.mb mbVar = (util.h.xy.eo.mb) this.getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 109) % 128;
                this.getInputFormats = mbVar;
                return;
            }
            char edgeSlop = (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 28);
            java.lang.Object[] objArr = new java.lang.Object[1];
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize() >> 8;
            int i4 = scrollBarSize + 81;
            char[] charArray = "\u0018\u0013\u0013\u0003\f\u0012\f\u000b\u0001\u0010\t\u0005\u0012\u0013\f\u000f\n\u0010\u0005\u000f\u0002\u0016\n\u000b\u0003\r\u000f\r\u0013\u0016\f\r\u0005\u000f\u0003\u0001\u000b\f\u0004\u000b\t\u0005\u0011\u0001\u000b\u0014\u0006\u000e\b\u0014\f\u0014\u0014\u0001\u000b\f\u0014\u0005\f\u0014\u0013\f\r\u0014\r\u0017\u0013\u0016\f\u0006\u000f\r\u0010\r\r\u0003\u0007\u0002\u0013\u0007㗗".toCharArray();
            util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
            char[] cArr = getOutputFormats;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    cArr2[i5] = (char) (cArr[i5] ^ 4042185467053315654L);
                    i5++;
                    length = length;
                }
                cArr = cArr2;
            }
            char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
            char[] cArr3 = new char[i4];
            if (i4 % 2 != 0) {
                i2 = scrollBarSize + 80;
                cArr3[i2] = (char) (charArray[i2] - edgeSlop);
            } else {
                i2 = i4;
            }
            if (i2 > 1) {
                int i6 = 0;
                while (true) {
                    mcVar.f2638 = i6;
                    if (mcVar.f2638 >= i2) {
                        break;
                    }
                    int i7 = getHighResolutionOutputSizeshNQ4ISI + 89;
                    Camera2StreamConfigurationMap = i7 % 128;
                    if (i7 % 2 == 0) {
                        mcVar.f2641 = charArray[mcVar.f2638];
                        mcVar.f2636 = charArray[mcVar.f2638];
                    } else {
                        mcVar.f2641 = charArray[mcVar.f2638];
                        mcVar.f2636 = charArray[mcVar.f2638 + 1];
                    }
                    i6 = mcVar.f2638 + 2;
                }
            }
            int i8 = 0;
            while (i8 < i4) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 77;
                Camera2StreamConfigurationMap = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr3[i8] = (char) (cArr3[i8] ^ 18068);
                    i8 += 17;
                } else {
                    cArr3[i8] = (char) (cArr3[i8] ^ 13722);
                    i8++;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    static {
        Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap = util.h.xy.ew.mb.f2180;
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 73) % 128;
    }

    static /* synthetic */ util.h.xy.eg.b getHighResolutionOutputSizeshNQ4ISI(util.h.xy.eg.ma maVar) {
        int i = getInputSizeshNQ4ISI + 97;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.eg.b bVar = maVar.getInputFormats;
        if (i % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ew.me m26571() throws util.h.xy.ea.d {
        int i = getInputSizeshNQ4ISI + 47;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.eg.b.getHighSpeedVideoSizes(this.getOutputMinFrameDuration);
            throw null;
        }
        if (!util.h.xy.eg.b.getHighSpeedVideoSizes(this.getOutputMinFrameDuration)) {
            return new util.h.xy.eg.ma.C0267ma(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getOutputFormats);
        }
        util.h.xy.eg.ma.ra raVar = new util.h.xy.eg.ma.ra(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getOutputFormats);
        int i2 = getInputSizeshNQ4ISI + 33;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    public ma(util.h.xy.dh.i iVar, int i) {
        this.getInputFormats = new util.h.xy.eg.b();
        this.getOutputMinFrameDuration = iVar;
        int mo26727 = Camera2StreamConfigurationMap.mo26727(iVar);
        if (iVar.m26325(util.h.xy.du.ra.f1735)) {
            if (i == 168 || i == mo26727) {
                this.getHighSpeedVideoSizesFor = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                return;
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{0, 54, 71, 46}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
        }
        if (iVar.m26325(util.h.xy.dr.mb.f1524)) {
            if (i == 56 || i == mo26727) {
                this.getHighSpeedVideoSizesFor = 56;
                return;
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{0, 54, 71, 46}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
        }
        if (mo26727 <= 0 || mo26727 == i) {
            this.getHighSpeedVideoSizesFor = i;
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{0, 54, 71, 46}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
    }

    public ma(util.h.xy.dh.i iVar) {
        this(iVar, Camera2StreamConfigurationMap.mo26727(iVar));
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = new char[]{42350, 42451, 42469, 42444, 42452, 42486, 42478, 42471, 42476, 42482, 42450, 42276, 42448, 42446, 42488, 42472, 42478, 42472, 42468, 42470, 42465, 42476, 42482, 42477, 42452, 42445, 42474, 42476, 42455, 42452, 42475, 42469, 42488, 42480, 42475, 42482, 42449, 42444, 42479, 42486, 42479, 42468, 42474, 42477, 42482, 42479, 42447, 42442, 42479, 42486, 42482, 42476, 42475, 42479};
    }
}
