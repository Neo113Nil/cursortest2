package util.h.xy.bt;

/* loaded from: classes18.dex */
public class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static long getInputSizeshNQ4ISI;
    private static char getOutputMinFrameDuration;
    private util.h.xy.d.md getInputFormats;
    private util.h.xy.bt.a getOutputFormats;
    private com.gemalto.mfs.mwsdk.dcm.PaymentType getOutputSizeshNQ4ISI;
    private util.h.xy.bt.mb.ra getOutputStallDuration;

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoSizesFor = "mb";
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 99) % 128;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ma {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static final /* synthetic */ util.h.xy.bt.mb.ma[] getHighSpeedVideoSizes;
        private static int getOutputFormats = 1;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.bt.mb.ma f1037;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.bt.mb.ma f1038;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bt.mb.ma f1039;

        private ma(java.lang.String str, int i) {
        }

        public static util.h.xy.bt.mb.ma valueOf(java.lang.String str) {
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
            util.h.xy.bt.mb.ma maVar = (util.h.xy.bt.mb.ma) java.lang.Enum.valueOf(util.h.xy.bt.mb.ma.class, str);
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
            return maVar;
        }

        public static util.h.xy.bt.mb.ma[] values() {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 101) % 128;
            util.h.xy.bt.mb.ma[] maVarArr = (util.h.xy.bt.mb.ma[]) getHighSpeedVideoSizes.clone();
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 23) % 128;
            return maVarArr;
        }

        static {
            util.h.xy.bt.mb.ma[] maVarArr;
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufffb\u0006\ufff5\ufff3\u0011\u0006\ufff7\u000b\u0011\u0006\u0001\u0000\ufff6\ufff7\u0006\ufff3\b", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, android.graphics.Color.rgb(0, 0, 0) + 16777228, 242 - android.widget.ExpandableListView.getPackedPositionChild(0L), true, objArr);
            util.h.xy.bt.mb.ma maVar = new util.h.xy.bt.mb.ma(((java.lang.String) objArr[0]).intern(), 0);
            f1038 = maVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufff7\ufff9\u0015\n\u0002\u000b\ufff7￼\ufffb\ufffa\ufffb\u0002\ufff8\ufff7\u0002\uffff\ufff7\f\ufff7\u0015\ufffa\b", android.view.View.resolveSizeAndState(0, 0, 0) + 22, android.view.KeyEvent.getDeadChar(0, 0) + 10, android.graphics.Color.argb(0, 0, 0, 0) + 239, true, objArr2);
            util.h.xy.bt.mb.ma maVar2 = new util.h.xy.bt.mb.ma(((java.lang.String) objArr2[0]).intern(), 1);
            f1037 = maVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\n\u0001\t\u0014\ufff8\ufff6\u0007\ufff9\u0014\u0003\u0004\t\u0014\ufff6\u000b\ufff6\ufffe\u0001\ufff6\ufff7\u0001\ufffa\ufff9\ufffa\ufffb\ufff6", 26 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 22, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, false, objArr3);
            util.h.xy.bt.mb.ma maVar3 = new util.h.xy.bt.mb.ma(((java.lang.String) objArr3[0]).intern(), 2);
            f1039 = maVar3;
            int i = getOutputFormats;
            int i2 = i + 53;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                maVarArr = new util.h.xy.bt.mb.ma[4];
                maVarArr[1] = maVar;
                maVarArr[0] = maVar2;
                maVarArr[5] = maVar3;
            } else {
                maVarArr = new util.h.xy.bt.mb.ma[]{maVar, maVar2, maVar3};
            }
            getHighSpeedVideoSizes = maVarArr;
            int i3 = i + 85;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
            char[] charArray = str.toCharArray();
            util.h.xz.b.ra raVar = new util.h.xz.b.ra();
            char[] cArr = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                raVar.f2650 = charArray[raVar.f2649];
                cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
                int i4 = raVar.f2649;
                cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
                raVar.f2649++;
                int i5 = Camera2StreamConfigurationMap + 5;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                int i6 = i5 % 2;
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
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 79) % 128;
                while (raVar.f2649 < i) {
                    cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                    raVar.f2649++;
                }
                cArr = cArr3;
            }
            java.lang.String str2 = new java.lang.String(cArr);
            int i7 = getHighSpeedVideoFpsRangesFor + 37;
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getHighSpeedVideoFpsRanges = -1231763917;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ra {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static char getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;
        private static final /* synthetic */ util.h.xy.bt.mb.ra[] getInputFormats;
        private static long getInputSizeshNQ4ISI;
        private static int getOutputMinFrameDuration;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.bt.mb.ra f1041;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.bt.mb.ra f1042;

        private ra(java.lang.String str, int i) {
        }

        public static util.h.xy.bt.mb.ra valueOf(java.lang.String str) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
            util.h.xy.bt.mb.ra raVar = (util.h.xy.bt.mb.ra) java.lang.Enum.valueOf(util.h.xy.bt.mb.ra.class, str);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 111) % 128;
            return raVar;
        }

        public static util.h.xy.bt.mb.ra[] values() {
            int i = getHighSpeedVideoSizes + 101;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            util.h.xy.bt.mb.ra[] raVarArr = getInputFormats;
            if (i % 2 == 0) {
                return (util.h.xy.bt.mb.ra[]) raVarArr.clone();
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            util.h.xy.bt.mb.ra[] raVarArr;
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("崊枍Ꮎ昺轊琜렼鋤羕燵⏪厝瘘蠟ⶖ\ue6d7곱", (char) (14859 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1534729456 + (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\uf1f6稜ਜ਼嬺", "\u0000\u0000\u0000\u0000", objArr);
            util.h.xy.bt.mb.ra raVar = new util.h.xy.bt.mb.ra(((java.lang.String) objArr[0]).intern(), 0);
            f1041 = raVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("尦伴阯ン\ueac0坫", (char) (android.text.TextUtils.getTrimmedLength("") + 48135), android.graphics.Color.green(0), "漪詬߯﮼", "\u0000\u0000\u0000\u0000", objArr2);
            util.h.xy.bt.mb.ra raVar2 = new util.h.xy.bt.mb.ra(((java.lang.String) objArr2[0]).intern(), 1);
            f1042 = raVar2;
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = i + 39;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                raVarArr = new util.h.xy.bt.mb.ra[2];
                raVarArr[1] = raVar;
                raVarArr[1] = raVar2;
            } else {
                raVarArr = new util.h.xy.bt.mb.ra[]{raVar, raVar2};
            }
            getHighSpeedVideoSizes = (i + 9) % 128;
            getInputFormats = raVarArr;
            int i3 = i + 79;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
            char[] charArray = str3.toCharArray();
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 13) % 128;
            char[] charArray2 = str2.toCharArray();
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 7) % 128;
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
                int i2 = (rcVar.f2652 + 2) % 4;
                int i3 = (rcVar.f2652 + 3) % 4;
                rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
                cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
                cArr[i3] = rcVar.f2653;
                cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
                rcVar.f2652++;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getInputSizeshNQ4ISI = 2457411417541981002L;
            getOutputMinFrameDuration = 294925130;
            getHighSpeedVideoFpsRangesFor = (char) 50561;
        }
    }

    public mb(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, util.h.xy.bt.mb.ra raVar, util.h.xy.bt.a aVar) {
        this.getOutputStallDuration = util.h.xy.bt.mb.ra.f1041;
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
        this.getInputFormats = null;
        this.getOutputFormats = null;
        this.getOutputSizeshNQ4ISI = paymentType;
        this.getInputFormats = (util.h.xy.d.md) digitalizedCard;
        this.getOutputStallDuration = raVar;
        this.getOutputFormats = aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m25625() {
        boolean highSpeedVideoFpsRanges;
        synchronized (this) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 13) % 128;
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges) {
                util.h.xy.bu.ma maVar = new util.h.xy.bu.ma();
                Camera2StreamConfigurationMap(util.h.xy.bf.c.f934.m25413(), null, new util.h.xy.bw.ma(), maVar);
                util.h.xy.bu.b.f1050.m25646(maVar);
            }
            int i = getHighSpeedVideoFpsRanges + 5;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m25624(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener) {
        boolean highSpeedVideoFpsRanges;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor + 9;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                getHighSpeedVideoFpsRanges();
                util.h.xy.bu.b.f1050.m25643();
                throw new java.lang.ArithmeticException();
            }
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (util.h.xy.bu.b.f1050.m25643()) {
                highSpeedVideoFpsRanges = true;
            } else {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 103) % 128;
                if (highSpeedVideoFpsRanges) {
                    util.h.xy.bu.ma maVar = new util.h.xy.bu.ma();
                    Camera2StreamConfigurationMap(paymentServiceListener, cardActivationListener, new util.h.xy.bw.ma(), maVar);
                    util.h.xy.bu.b.f1050.m25646(maVar);
                }
            }
        }
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r14.getOutputSizeshNQ4ISI == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoFpsRanges() {
        long currentTimeMillis;
        byte[] m27616;
        char c;
        util.h.xy.bt.a aVar;
        boolean z = true;
        util.h.xy.bg.a.f944.m25453(new java.util.concurrent.CountDownLatch(1));
        try {
            try {
                if (!util.h.xy.bq.b.m25556(this.getOutputSizeshNQ4ISI, this.getInputFormats) && this.getOutputSizeshNQ4ISI != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                    if (this.getOutputSizeshNQ4ISI != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 11) % 128;
                    }
                    byte[] bArr = new byte[2];
                    com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP;
                    if (this.getOutputSizeshNQ4ISI == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                        bArr[0] = 2;
                        bArr[1] = 1;
                        profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP;
                    } else if (this.getOutputSizeshNQ4ISI == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                        bArr[0] = 1;
                        bArr[1] = 3;
                        profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR;
                    }
                    util.h.xy.q.b.m27055(bArr, this.getInputFormats.getTokenizedCardID(), profileChannel);
                    util.h.xy.bg.a.f944.m25456().countDown();
                    aVar = this.getOutputFormats;
                    if (aVar != null) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 21) % 128;
                        aVar.mo25566();
                    }
                    return z;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0a7a㴍浫\udd5a煳㷅ꊱἶՑ眒ỽ⟂谰䰁줾⭓龃ा応䈗蒫ᔨㅘ\uf006쵃ֈ垟䜗\ude54⢻췭뭜⪟ꋛ\uf65b啞ꀱᚍ➓ꥍۄ変ᐰᙢ증动\uf18e\uf4f0뮫ᕛ卋턓⣀히쫸䔪獬ឋ䣎괎", c, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22, "숱杏\udfed篲", "\u0000\u0000\u0000\u0000", objArr);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
                if (m27616[0] == 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("뼰뮦嶵䨘㈤⡴\u074c瓼ᡂ䓵蔮ὕ暛讫ꥏꖿ㍱㶆Ⱇ￢\udd45\ud943棪ꒊ숍閰袜꽪䡘\udaf0纁邜䉑\uf48d嶢翷棿\uf016筩혘硶皭ዛ䉓㜯휐\ued43", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1016107071 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "㾎邐唼洸", "\u0000\u0000\u0000\u0000", objArr2);
                    Camera2StreamConfigurationMap(1, ((java.lang.String) objArr2[0]).intern(), null);
                    z = false;
                    util.h.xy.bg.a.f944.m25456().countDown();
                    aVar = this.getOutputFormats;
                    if (aVar != null) {
                    }
                    return z;
                }
                util.h.xy.bt.mb.EnumC0263mb.f1040.m25626(util.h.xy.bt.mb.ma.f1037);
                util.h.xy.bt.mb.ma maVar = util.h.xy.bt.mb.ma.f1037;
                util.h.xy.bg.a.f944.m25456().countDown();
                aVar = this.getOutputFormats;
                if (aVar != null) {
                }
                return z;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            byte[] bArr2 = new byte[2];
            util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
            boolean z2 = (m26956 == null || m26956.m26179() == null) ? false : true;
            if (this.getOutputSizeshNQ4ISI == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                if (z2) {
                    bArr2[1] = 1;
                }
            } else if (this.getOutputSizeshNQ4ISI == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                bArr2[0] = 1;
            } else if (this.getOutputSizeshNQ4ISI == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                bArr2[0] = 2;
            }
            byte b = bArr2[0];
            currentTimeMillis = java.lang.System.currentTimeMillis();
            m27616 = util.h.xy.v.b.f2439.m27616(bArr2);
            c = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 97) % 128;
        } catch (java.lang.Throwable th2) {
            try {
                Camera2StreamConfigurationMap(1, th2.getMessage(), th2);
                return false;
            } finally {
                util.h.xy.bg.a.f944.m25456().countDown();
                util.h.xy.bt.a aVar2 = this.getOutputFormats;
                if (aVar2 != null) {
                    aVar2.mo25566();
                }
            }
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 3) % 128;
        getHighSpeedVideoSizes = (i2 + 115) % 128;
        char[] charArray = str3.toCharArray();
        int i3 = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        getHighSpeedVideoSizes = i3;
        char[] cArr = charArray;
        int i4 = i3 + 31;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr2, 0, length);
        java.lang.System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
            int i5 = (rcVar.f2652 + 2) % 4;
            int i6 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i5]) % 65535);
            cArr3[i6] = (char) (((cArr2[i6] * 32718) + cArr3[i5]) / 65535);
            cArr2[i6] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i6] ^ charArray3[rcVar.f2652]) ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getOutputMinFrameDuration ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private void Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener, util.h.xy.bw.mb mbVar, util.h.xy.bu.ma maVar) {
        util.h.xy.bq.mb mbVar2;
        util.h.xy.bq.rd rdVar;
        util.h.xy.u.b m25517 = util.h.xy.bm.ma.f984.m25517();
        if (m25517 == util.h.xy.u.b.f2432) {
            int i = getHighSpeedVideoFpsRanges + 49;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                getHighSpeedVideoFpsRangesFor(paymentServiceListener, maVar);
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoFpsRangesFor(paymentServiceListener, maVar);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            return;
        }
        if (m25517 != util.h.xy.u.b.f2435 && m25517 != util.h.xy.u.b.f2433) {
            util.h.xy.u.b bVar = util.h.xy.u.b.f2434;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("땳ᷬ\ue857\uf831덆봶䏵\uddb3귉熌\uf70c\u0bc9嫸ኸ꾍ꑨᘢ槖ဌ驶彩", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 647425616, "僘雮ᔦ⠇", "\u0000\u0000\u0000\u0000", objArr);
            Camera2StreamConfigurationMap(2, ((java.lang.String) objArr[0]).intern(), null);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 5) % 128;
            return;
        }
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m25516 = util.h.xy.bm.ma.f984.m25516();
        if (m25516 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
            int i2 = getHighSpeedVideoFpsRanges + 121;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD;
                throw null;
            }
            if (m25516 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                if (m25516 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("퍻熈\ue302臕\ud8a5\uf372ᝄ盝욝远읐\udc9f독\uf4f0譡\udb61ᴓ绌鲂挄뺲쌘ࣀꝝ畊᳣ₔ㘆얅孢ᩐ퓭ﻚ\udcc0", (char) android.view.View.getDefaultSize(0, 0), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\ued0a嗘໋䏏", "\u0000\u0000\u0000\u0000", objArr2);
                    Camera2StreamConfigurationMap(3, ((java.lang.String) objArr2[0]).intern(), null);
                    return;
                }
                if (util.h.xy.bu.b.f1050.m25642() == null) {
                    rdVar = new util.h.xy.bq.rd(paymentServiceListener, mbVar, this.getOutputStallDuration != util.h.xy.bt.mb.ra.f1041);
                } else {
                    rdVar = (util.h.xy.bq.rd) util.h.xy.bu.b.f1050.m25642();
                }
                if (rdVar.mo25562(this.getOutputSizeshNQ4ISI, this.getInputFormats)) {
                    maVar.m25664(rdVar);
                    Camera2StreamConfigurationMap(cardActivationListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.SUCCESS);
                    return;
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("붋鹫叭掼ﲞ悿⮾䐴\ue7a1㣩싿ٜধ煉\u07b6扦ᥱ䗕ಜ\ue5eb볈骗㜞讖뀡䍩ﰹ㴹", (char) (39684 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "꿯듚ӗ뾛", "\u0000\u0000\u0000\u0000", objArr3);
                    Camera2StreamConfigurationMap(1, ((java.lang.String) objArr3[0]).intern(), null);
                    return;
                }
            }
        }
        if (util.h.xy.bu.b.f1050.m25642() == null) {
            mbVar2 = new util.h.xy.bq.mb(paymentServiceListener, mbVar, m25516, this.getOutputStallDuration != util.h.xy.bt.mb.ra.f1041);
        } else {
            mbVar2 = (util.h.xy.bq.mb) util.h.xy.bu.b.f1050.m25642();
        }
        if (mbVar2.mo25562(this.getOutputSizeshNQ4ISI, this.getInputFormats)) {
            maVar.m25664(mbVar2);
            Camera2StreamConfigurationMap(cardActivationListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.SUCCESS);
        } else {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("붋鹫叭掼ﲞ悿⮾䐴\ue7a1㣩싿ٜধ煉\u07b6扦ᥱ䗕ಜ\ue5eb볈骗㜞讖뀡䍩ﰹ㴹", (char) (android.text.TextUtils.getOffsetBefore("", 0) + 39684), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, "꿯듚ӗ뾛", "\u0000\u0000\u0000\u0000", objArr4);
            Camera2StreamConfigurationMap(1, ((java.lang.String) objArr4[0]).intern(), null);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, util.h.xy.bu.ma maVar) {
        util.h.xy.bq.ma maVar2 = new util.h.xy.bq.ma(paymentServiceListener, false);
        if (maVar2.mo25562(this.getOutputSizeshNQ4ISI, this.getInputFormats)) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 39) % 128;
            maVar.m25664(maVar2);
            util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
        }
        int i = getHighSpeedVideoFpsRangesFor + 83;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Throwable th) {
        int i2 = getHighSpeedVideoFpsRanges + 51;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            util.h.xy.bt.a aVar = this.getOutputFormats;
            if (aVar != null) {
                getHighSpeedVideoFpsRanges = (i3 + 53) % 128;
                aVar.mo25464(i, str, th);
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 35) % 128;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode) {
        int i = (getHighSpeedVideoFpsRangesFor + 101) % 128;
        getHighSpeedVideoFpsRanges = i;
        if (cardActivationListener != null) {
            getHighSpeedVideoFpsRangesFor = (i + 39) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("潱혋䁤\ue78f", (char) (1166 - android.text.TextUtils.getOffsetAfter("", 0)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, "뎪朂軨㐄", "\u0000\u0000\u0000\u0000", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\uec38꘥앚获ꊠ鮅ǽ╁势痩潷붉", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, "珯⠘虪㿌", "\u0000\u0000\u0000\u0000", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            cardActivationListener.onCardActivated(paymentServiceErrorCode);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: util.h.xy.bt.mb$mb, reason: collision with other inner class name */
    public static final class EnumC0263mb {
        private static final java.lang.String Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static char[] getHighSpeedVideoFpsRanges = null;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static final /* synthetic */ util.h.xy.bt.mb.EnumC0263mb[] getHighSpeedVideoSizes;
        private static int getInputFormats = 1;
        private static int getOutputMinFrameDuration;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bt.mb.EnumC0263mb f1040;

        private EnumC0263mb(java.lang.String str) {
        }

        public static util.h.xy.bt.mb.EnumC0263mb valueOf(java.lang.String str) {
            int i = getOutputMinFrameDuration + 81;
            getInputFormats = i % 128;
            util.h.xy.bt.mb.EnumC0263mb enumC0263mb = (util.h.xy.bt.mb.EnumC0263mb) java.lang.Enum.valueOf(util.h.xy.bt.mb.EnumC0263mb.class, str);
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            getInputFormats = (getOutputMinFrameDuration + 7) % 128;
            return enumC0263mb;
        }

        public static util.h.xy.bt.mb.EnumC0263mb[] values() {
            int i = getOutputMinFrameDuration + 3;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            util.h.xy.bt.mb.EnumC0263mb[] enumC0263mbArr = (util.h.xy.bt.mb.EnumC0263mb[]) getHighSpeedVideoSizes.clone();
            int i2 = getOutputMinFrameDuration + 7;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                return enumC0263mbArr;
            }
            throw null;
        }

        static {
            util.h.xy.bt.mb.EnumC0263mb[] enumC0263mbArr;
            getHighSpeedVideoFpsRanges();
            int[] iArr = {0, 8, 132, 0};
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            byte[] bytes = "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000".getBytes("ISO-8859-1");
            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = getHighSpeedVideoFpsRanges;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
                for (int i5 = 0; i5 < length; i5++) {
                    cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i2];
            java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
            if (bytes != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 67) % 128;
                char[] cArr4 = new char[i2];
                maVar.f2631 = 0;
                char c = 0;
                while (maVar.f2631 < i2) {
                    if (bytes[maVar.f2631] == 1) {
                        int i6 = getHighResolutionOutputSizeshNQ4ISI + 55;
                        getHighSpeedVideoFpsRangesFor = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = maVar.f2631;
                            char c2 = cArr3[maVar.f2631];
                            cArr4[i7] = 0;
                        } else {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        }
                    } else {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    }
                    c = cArr4[maVar.f2631];
                    maVar.f2631++;
                }
                cArr3 = cArr4;
            }
            if (i4 > 0) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
                char[] cArr5 = new char[i2];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
                int i8 = i2 - i4;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i4);
                java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i8);
            }
            if (i3 > 0) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i2) {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                    maVar.f2631++;
                }
            }
            util.h.xy.bt.mb.EnumC0263mb enumC0263mb = new util.h.xy.bt.mb.EnumC0263mb(new java.lang.String(cArr3).intern());
            f1040 = enumC0263mb;
            int i9 = getInputFormats + 105;
            getOutputMinFrameDuration = i9 % 128;
            if (i9 % 2 != 0) {
                enumC0263mbArr = new util.h.xy.bt.mb.EnumC0263mb[0];
                enumC0263mbArr[0] = enumC0263mb;
            } else {
                enumC0263mbArr = new util.h.xy.bt.mb.EnumC0263mb[]{enumC0263mb};
            }
            getHighSpeedVideoSizes = enumC0263mbArr;
            Camera2StreamConfigurationMap = util.h.xy.bt.mb.EnumC0263mb.class.getSimpleName();
            int i10 = getOutputMinFrameDuration + 57;
            getInputFormats = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final void m25626(util.h.xy.bt.mb.ma maVar) {
            util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f977, new util.h.xy.bk.ra(maVar));
            getOutputMinFrameDuration = (getInputFormats + 107) % 128;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.bt.mb.ma m25627() {
            int i = getOutputMinFrameDuration + 11;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                util.h.xy.bt.mb.ma maVar = (util.h.xy.bt.mb.ma) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f977).m25508();
                getInputFormats = (getOutputMinFrameDuration + 121) % 128;
                return maVar;
            }
            throw null;
        }

        static void getHighSpeedVideoFpsRanges() {
            getHighSpeedVideoFpsRanges = new char[]{42299, 42386, 42377, 42378, 42387, 42390, 42385, 42389};
        }
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = 2457411417541981002L;
        Camera2StreamConfigurationMap = 443730449;
        getOutputMinFrameDuration = (char) 13130;
    }
}
