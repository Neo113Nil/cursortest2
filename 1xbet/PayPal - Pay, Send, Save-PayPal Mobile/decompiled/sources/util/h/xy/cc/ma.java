package util.h.xy.cc;

/* loaded from: classes5.dex */
public class ma {
    private static long Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static util.h.xy.cc.ma getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static final java.lang.String getOutputMinFrameDuration;
    private static int getOutputSizeshNQ4ISI;
    private long getOutputStallDurationlomOqCM = 86400000;
    private long getOutputMinFrameDurationlomOqCM = 0;

    /* renamed from: util.h.xy.cc.ma$3, reason: invalid class name */
    final class AnonymousClass3 implements java.lang.Runnable {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizesFor = 1;
        private static int getInputFormats = 0;
        private static int getInputSizeshNQ4ISI = -1489246390;
        private static char getOutputFormats = 13130;
        private static long getOutputMinFrameDuration = 2457411417541981002L;
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.TokenSyncError getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.TokenSyncListener getHighSpeedVideoSizes;

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
            char[] charArray = str3.toCharArray();
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
            cArr2[2] = (char) (cArr2[2] + ((char) i));
            int length3 = charArray3.length;
            char[] cArr3 = new char[length3];
            rcVar.f2652 = 0;
            while (rcVar.f2652 < length3) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                int i2 = (rcVar.f2652 + 2) % 4;
                int i3 = (rcVar.f2652 + 3) % 4;
                rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
                cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
                cArr[i3] = rcVar.f2653;
                cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getOutputMinFrameDuration ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getOutputFormats ^ 2457411417541981002L)));
                rcVar.f2652++;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 49) % 128;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        AnonymousClass3(com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener, java.lang.String str, com.gemalto.mfs.mwsdk.dcm.TokenSyncError tokenSyncError) {
            this.getHighSpeedVideoSizes = tokenSyncListener;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = tokenSyncError;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00ba, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
        
            r0 = r12.Camera2StreamConfigurationMap;
            r2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\uf3a3ퟚ᭒麝䜎", (char) (android.view.View.MeasureSpec.getSize(0) + 53892), (-2046580980) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0cd9Χ蒆烒", "\u0000\u0000\u0000\u0000", r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00ea, code lost:
        
            if (r0.equalsIgnoreCase(((java.lang.String) r2[0]).intern()) == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00ec, code lost:
        
            r12.getHighSpeedVideoSizes.onError(r12.getHighSpeedVideoFpsRanges);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00f3, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        
            r0 = util.h.xy.cc.ma.AnonymousClass3.getHighSpeedVideoSizesFor + 121;
            util.h.xy.cc.ma.AnonymousClass3.getInputFormats = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if ((r0 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
        
            r12.getHighSpeedVideoSizes.onStarted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            r12.getHighSpeedVideoSizes.onStarted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            if (r0.equalsIgnoreCase(((java.lang.String) r5[0]).intern()) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
        
            if (r0.equalsIgnoreCase(((java.lang.String) r5[0]).intern()) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0087, code lost:
        
            r0 = r12.Camera2StreamConfigurationMap;
            r2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ಳ嚗ᔁ阒慨\udfb2ꗗ넩蒋", (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), (-9842425) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "ޙ槑\uf6ff\uf209", "\u0000\u0000\u0000\u0000", r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x00b3, code lost:
        
            if (r0.equalsIgnoreCase(((java.lang.String) r2[0]).intern()) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00b5, code lost:
        
            r12.getHighSpeedVideoSizes.onCompleted();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            if (this.getHighSpeedVideoSizes == null) {
                return;
            }
            int i = getInputFormats + 15;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                java.lang.String str = this.Camera2StreamConfigurationMap;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("萚ᷔ툠膭黑렗韾", (char) (android.view.ViewConfiguration.getTapTimeout() % 38), 179871829 >> android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 23, 0), "図뢠舊麗", "\u0000\u0000\u0000\u0000", objArr);
            } else {
                java.lang.String str2 = this.Camera2StreamConfigurationMap;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("萚ᷔ툠膭黑렗韾", (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 179871829 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "図뢠舊麗", "\u0000\u0000\u0000\u0000", objArr2);
            }
        }
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode getHighResolutionOutputSizeshNQ4ISI(int i) {
        com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode;
        int i2 = getHighSpeedVideoFpsRangesFor;
        getOutputFormats = (i2 + 7) % 128;
        int i3 = (i2 + 75) % 128;
        getOutputFormats = i3;
        if (i == 400) {
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_WRONG_FORMAT_OR_MISSING_PARAM;
        } else if (i == 500) {
            getHighSpeedVideoFpsRangesFor = (i3 + 109) % 128;
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_SERVER_ERROR;
            int i4 = getOutputFormats + 109;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        } else if (i == 503) {
            getHighSpeedVideoFpsRangesFor = (i3 + 11) % 128;
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_SERVICE_UNAVAILABLE;
        } else if (i == 9000) {
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_UNEXPECTED_INTERNAL_ERROR;
        } else if (i == 9001) {
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_EXTERNAL_SYSTEM_UNAVAILABLE;
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 87) % 128;
        } else if (i == 9002) {
            getOutputFormats = (i2 + 121) % 128;
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_UNKNOWN_WALLET_PROVIDER_ID;
        } else if (i == 9003) {
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_UNKNOWN_WALLET_ID;
        } else if (i == 9010) {
            int i6 = i3 + 91;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            int i7 = i6 % 2;
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_MISSING_REQUIRED_PARAMETER;
            if (i7 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } else if (i == 11 || i == 13 || i != 12) {
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_SERVER_PROCESS_ERROR;
        } else {
            getOutputFormats = (i2 + 125) % 128;
            tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_ERROR_JSON_DATA_EXCEPTION;
        }
        int i8 = getHighSpeedVideoFpsRangesFor + 63;
        getOutputFormats = i8 % 128;
        if (i8 % 2 != 0) {
            return tokenSyncErrorCode;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = (getHighSpeedVideoFpsRangesFor + 9) % 128;
        getOutputFormats = i;
        java.lang.String str = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRangesFor = (i + 71) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fb, code lost:
    
        if (r2.equalsIgnoreCase(((java.lang.String) r12[0]).intern()) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0155, code lost:
    
        if (r6.equalsIgnoreCase(((java.lang.String) r15[0]).intern()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
    
        getHighResolutionOutputSizeshNQ4ISI(r26, r2, r24, com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_SUCCESS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        if (r2 == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a4, code lost:
    
        if (r5.equalsIgnoreCase(((java.lang.String) r8[0]).intern()) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage, com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener) {
        int i = getOutputFormats;
        getHighSpeedVideoFpsRangesFor = (i + 49) % 128;
        if (str != null) {
            getHighSpeedVideoFpsRangesFor = (i + 75) % 128;
            if (provisioningServiceMessage != null && provisioningServiceMessage.getMsgCode() != null) {
                java.lang.String msgCode = provisioningServiceMessage.getMsgCode();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("￦\u0007\b\u0017\b\u000f\b\uffe7\u0011\b\u000e\u0012\u0017\uffd1\u0012\t\u0011\f\uffd1\ufff3￥", 21 - android.text.TextUtils.getCapsMode("", 0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 255 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), true, objArr);
                if (msgCode.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    int i2 = getHighSpeedVideoFpsRangesFor + 5;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        util.h.xy.ag.a.m24556().m24557(new util.h.xy.cc.ma.AnonymousClass4(tokenSyncListener, str));
                        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 43) % 128;
                        throw null;
                    }
                    util.h.xy.ag.a.m24556().m24557(new util.h.xy.cc.ma.AnonymousClass4(tokenSyncListener, str));
                    getHighSpeedVideoFpsRangesFor = (getOutputFormats + 43) % 128;
                } else {
                    java.lang.String msgCode2 = provisioningServiceMessage.getMsgCode();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufff3\u000e\u0005\u000b\u000f\u0014ￎ\u000f\u0006\u000e\tￎ\ufff0￢￣\u0004\u0005\u0004\u000e\u0005\u0010\u0013\u0015", android.text.TextUtils.getOffsetAfter("", 0) + 23, android.text.TextUtils.indexOf("", "", 0, 0) + 15, 259 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, objArr2);
                    if (!msgCode2.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 37) % 128;
                        java.lang.String msgCode3 = provisioningServiceMessage.getMsgCode();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\u0010\u0007\u000f\nￏ\ufff1￣￤\u0005\u0006\u000e\u0016\u0014\u0006\ufff3\u000f\u0006\f\u0010\u0015ￏ", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22, 7 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 256, true, objArr3);
                    }
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m26210 = ((util.h.xy.d.md) com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(str)).m26210();
                    if (m26210 != null && m26210.isSuccessful() && m26210.getResult() != null) {
                        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState state = m26210.getResult().getState();
                        if (state == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                            java.lang.String msgCode4 = provisioningServiceMessage.getMsgCode();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\u0010\u0007\u000f\nￏ\ufff1￣￤\u0005\u0006\u000e\u0016\u0014\u0006\ufff3\u000f\u0006\f\u0010\u0015ￏ", android.view.View.getDefaultSize(0, 0) + 21, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 257, true, objArr4);
                        }
                        if (state != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) {
                            int i3 = getOutputFormats + 27;
                            getHighSpeedVideoFpsRangesFor = i3 % 128;
                            if (i3 % 2 != 0) {
                                com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED;
                                throw null;
                            }
                        }
                        java.lang.String msgCode5 = provisioningServiceMessage.getMsgCode();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\ufff3\u000e\u0005\u000b\u000f\u0014ￎ\u000f\u0006\u000e\tￎ\ufff0￢￣\u0004\u0005\u0004\u000e\u0005\u0010\u0013\u0015", android.graphics.Color.rgb(0, 0, 0) + 16777239, 15 - android.text.TextUtils.getOffsetBefore("", 0), android.graphics.Color.alpha(0) + 258, true, objArr5);
                    }
                }
            }
        }
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 67) % 128;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener, java.lang.String str, com.gemalto.mfs.mwsdk.dcm.TokenSyncError tokenSyncError) {
        int i = getOutputFormats + 99;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.ag.a.m24556().m24557(new util.h.xy.cc.ma.AnonymousClass3(tokenSyncListener, str, tokenSyncError));
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 31) % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static {
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap();
        getOutputMinFrameDuration = util.h.xy.cc.ma.class.getName();
        getInputFormats = null;
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 55) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.cc.ma m25860() {
        util.h.xy.cc.ma maVar;
        synchronized (util.h.xy.cc.ma.class) {
            int i = getHighSpeedVideoFpsRangesFor + 67;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                if (getInputFormats == null) {
                    getInputFormats = new util.h.xy.cc.ma();
                    int i2 = getOutputFormats + 7;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    int i3 = i2 % 2;
                }
                maVar = getInputFormats;
            } else {
                throw null;
            }
        }
        return maVar;
    }

    private ma() {
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 43) % 128;
        char[] charArray = str3.toCharArray();
        int i2 = getHighSpeedVideoFpsRanges + 47;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 7) % 128;
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
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ r3[rcVar.f2652]) ^ (Camera2StreamConfigurationMap ^ 2457411417541981002L)) ^ ((int) (getOutputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (i4 + 89) % 128;
        int i5 = i4 + 77;
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i6 = raVar.f2649;
            cArr[i6] = (char) (cArr[i6] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 23) % 128;
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                int i7 = getHighSpeedVideoSizes + 117;
                getHighSpeedVideoFpsRanges = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = raVar.f2649;
                    int i9 = raVar.f2649;
                    throw new java.lang.ArithmeticException();
                }
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 91) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25868() {
        long j;
        int i = getHighSpeedVideoFpsRangesFor + 81;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 == 0) {
            this.getOutputStallDurationlomOqCM = 86400000L;
            j = 1;
        } else {
            this.getOutputStallDurationlomOqCM = 86400000L;
            j = 0;
        }
        this.getOutputMinFrameDurationlomOqCM = j;
        getHighSpeedVideoFpsRangesFor = (i2 + 11) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25869(final com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener) {
        util.h.xy.ag.a m24556;
        util.h.xy.cc.ma.AnonymousClass3 anonymousClass3;
        util.h.xy.ag.a m245562;
        util.h.xy.cc.ma.AnonymousClass3 anonymousClass32;
        if (util.h.xy.v.c.m27646().m27647()) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
            long parseLong = highSpeedVideoSizes == null ? 0L : java.lang.Long.parseLong(highSpeedVideoSizes);
            java.lang.String[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 69) % 128;
            if (!m25861(this.getOutputMinFrameDurationlomOqCM, parseLong, highResolutionOutputSizeshNQ4ISI, java.util.Calendar.getInstance())) {
                com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_BLOCKED;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ￂ\u0006\u0007\u0016\u0017\u0005\u0007\u001a\u0007ￂ\u0015\uffc9\u0016\u000bￂ\u0015\u0003ￂ\u0019\u0011\u0010ￂ\u0006\u0007\u0019\u0011\u000e\u000e\u0003ￂ\u0016\u0011\u0010ￂ\u0015\u000bￂ\u0005\u0010\u001b\u0015ￂ\u0010\u0007\r\u0011\ufff6\u001b\u000e\u0016\u0010\u0007\u0005\u0007\u0014", android.text.TextUtils.getCapsMode("", 0, 0) + 55, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, android.view.View.MeasureSpec.getSize(0) + 256, true, objArr);
                tokenSyncListener.onError(new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(tokenSyncErrorCode, ((java.lang.String) objArr[0]).intern()));
                int i = getHighSpeedVideoFpsRangesFor + 71;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
            if (util.h.xy.au.mf.m25169().m25181()) {
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0007\b\ufff5\u0006\b\ufff9\ufff8", android.graphics.Color.alpha(0) + 7, 7 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 239 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, objArr2);
                util.h.xy.ag.a.m24556().m24557(new util.h.xy.cc.ma.AnonymousClass3(tokenSyncListener, ((java.lang.String) objArr2[0]).intern(), null));
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 31) % 128;
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> m26247 = util.h.xy.d.re.m26247();
                if (m26247 == null || !m26247.isSuccessful()) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u0004\ufff7\u0004\u0001\u0004", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 5, android.view.KeyEvent.keyCodeFromString("") + 2, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, true, objArr3);
                    java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                    com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode2 = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_ERROR_GETTING_CARD_LIST;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\uebed᛫\u0b11⿅鵗톦횙럇\ue0ae갖폛摝䡱ぽଡ଼\udff5불檐⬝楉ꬩ↥녮", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1988266597, "鱅絵莉ઢ", "\u0000\u0000\u0000\u0000", objArr4);
                    com.gemalto.mfs.mwsdk.dcm.TokenSyncError tokenSyncError = new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(tokenSyncErrorCode2, ((java.lang.String) objArr4[0]).intern());
                    m24556 = util.h.xy.ag.a.m24556();
                    anonymousClass3 = new util.h.xy.cc.ma.AnonymousClass3(tokenSyncListener, intern, tokenSyncError);
                } else {
                    if (m26247.getResult().length > 0) {
                        arrayList.addAll(java.util.Arrays.asList(m26247.getResult()));
                        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.cc.ma.5
                            private static int Camera2StreamConfigurationMap = 0;
                            private static int getHighSpeedVideoSizes = 1;
                            private static int getInputSizeshNQ4ISI = 0;
                            private static long getOutputFormats = -4723001502812193125L;
                            private static int getOutputMinFrameDuration = 1;

                            private static void getHighSpeedVideoSizes(java.lang.String str, int i2, java.lang.Object[] objArr5) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 99) % 128;
                                char[] charArray = str.toCharArray();
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 33) % 128;
                                char[] cArr = charArray;
                                util.h.xz.b.d dVar = new util.h.xz.b.d();
                                dVar.f2628 = i2;
                                int length = cArr.length;
                                long[] jArr = new long[length];
                                dVar.f2629 = 0;
                                while (dVar.f2629 < cArr.length) {
                                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 71) % 128;
                                    jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputFormats ^ (-7508379876853140581L));
                                    dVar.f2629++;
                                }
                                char[] cArr2 = new char[length];
                                dVar.f2629 = 0;
                                while (dVar.f2629 < cArr.length) {
                                    cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                                    dVar.f2629++;
                                }
                                objArr5[0] = new java.lang.String(cArr2);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                                try {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    int i2 = 0;
                                    while (i2 < 10 && i2 < arrayList.size()) {
                                        int i3 = getInputSizeshNQ4ISI + 101;
                                        getOutputMinFrameDuration = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            arrayList2.add(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId((java.lang.String) arrayList.get(i2)));
                                            i2 += 95;
                                        } else {
                                            arrayList2.add(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId((java.lang.String) arrayList.get(i2)));
                                            i2++;
                                        }
                                    }
                                    java.lang.String m25867 = util.h.xy.cc.ma.this.m25867(arrayList2);
                                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                    org.json.JSONObject jSONObject = new org.json.JSONObject(m25867);
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("൰쮎肸妥ᛅ\ueff9ꓥ紮㨷\uf32e졃腸幪ᒋ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 50924, objArr5);
                                    boolean optBoolean = jSONObject.optBoolean(((java.lang.String) objArr5[0]).intern(), false);
                                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("ൣ땮絬╉\ued4f", 47118 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
                                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray(((java.lang.String) objArr6[0]).intern());
                                    if (optJSONArray != null) {
                                        int i4 = getOutputMinFrameDuration + 17;
                                        getInputSizeshNQ4ISI = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            optJSONArray.length();
                                            throw new java.lang.NullPointerException();
                                        }
                                        if (optJSONArray.length() > 0) {
                                            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 101) % 128;
                                            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 27) % 128;
                                                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("൩䧙", 17597 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr7);
                                                java.lang.String string = jSONObject2.getString(((java.lang.String) objArr7[0]).intern());
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("൳痙ﰻ杳\uefc1嘒", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 30893, objArr8);
                                                hashMap.put(string, jSONObject2.getString(((java.lang.String) objArr8[0]).intern()));
                                                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                            }
                                        }
                                    }
                                    if (optBoolean) {
                                        try {
                                            util.h.xy.cc.ma maVar = util.h.xy.cc.ma.this;
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("ര", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19852, objArr9);
                                            maVar.m25864(((java.lang.String) objArr9[0]).intern(), 120, tokenSyncListener);
                                            int i6 = getInputSizeshNQ4ISI + 45;
                                            getOutputMinFrameDuration = i6 % 128;
                                            if (i6 % 2 == 0) {
                                                int i7 = 3 / 3;
                                            }
                                        } catch (java.lang.Exception unused) {
                                        }
                                    }
                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> m262472 = util.h.xy.d.re.m26247();
                                    if (m262472 != null) {
                                        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 109) % 128;
                                        if (m262472.isSuccessful()) {
                                            if (m262472.getResult().length > 0) {
                                                util.h.xy.cc.ma.this.m25865(hashMap, new java.util.ArrayList(java.util.Arrays.asList(m262472.getResult())), tokenSyncListener);
                                                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                                getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 25) % 128;
                                            }
                                            com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener2 = tokenSyncListener;
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("ൃ菤ရꅑ㟠쐒啖\uebe8砜", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36523, objArr10);
                                            util.h.xy.cc.ma.getHighSpeedVideoSizes(tokenSyncListener2, ((java.lang.String) objArr10[0]).intern(), null);
                                            return;
                                        }
                                    }
                                    com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener3 = tokenSyncListener;
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("\u0d45濍졬⪒蜮", android.text.TextUtils.getTrimmedLength("") + 25247, objArr11);
                                    java.lang.String intern2 = ((java.lang.String) objArr11[0]).intern();
                                    com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode3 = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_ERROR_GETTING_CARD_LIST;
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("\u0d45ᑧ㽘䙐椦灉鬙ꋶ엜\uecc9\uf7bbẉ↛䬱剅畚鰢꜁칚퇣\uf8cdϊ⪺", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6422, objArr12);
                                    util.h.xy.cc.ma.getHighSpeedVideoSizes(tokenSyncListener3, intern2, new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(tokenSyncErrorCode3, ((java.lang.String) objArr12[0]).intern()));
                                } catch (org.json.JSONException e) {
                                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                    e.getMessage();
                                    com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener4 = tokenSyncListener;
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("\u0d45濍졬⪒蜮", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25199, objArr13);
                                    java.lang.String intern3 = ((java.lang.String) objArr13[0]).intern();
                                    com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode4 = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_ERROR_JSON_DATA_EXCEPTION;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("ൊ\uf17a\uf51d蘆\ufde1\ue1b5\ue595\ue87a\uec38퀅퓳\u3b082쌯윞", 64552 - android.view.MotionEvent.axisFromString(""), objArr14);
                                    sb.append(((java.lang.String) objArr14[0]).intern());
                                    sb.append(e.getMessage());
                                    util.h.xy.cc.ma.getHighSpeedVideoSizes(tokenSyncListener4, intern3, new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(tokenSyncErrorCode4, sb.toString()));
                                } catch (util.h.xy.r.b e2) {
                                    int m27063 = e2.m27063();
                                    java.lang.String message = e2.getMessage();
                                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                                    e2.getMessage();
                                    com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode highResolutionOutputSizeshNQ4ISI2 = util.h.xy.cc.ma.getHighResolutionOutputSizeshNQ4ISI(m27063);
                                    com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener5 = tokenSyncListener;
                                    try {
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("\u0d45濍졬⪒蜮", 25248 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr15);
                                        util.h.xy.cc.ma.getHighSpeedVideoSizes(tokenSyncListener5, ((java.lang.String) objArr15[0]).intern(), new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(highResolutionOutputSizeshNQ4ISI2, message));
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                            }
                        }).start();
                        int i2 = getHighSpeedVideoFpsRangesFor + 73;
                        getOutputFormats = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        return;
                    }
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufffb\n\ufffb\ufffa\ufff9\u0005\u0003\u0006\u0002", android.view.View.MeasureSpec.getMode(0) + 9, android.text.TextUtils.indexOf("", "") + 4, android.view.View.combineMeasuredStates(0, 0) + 236, false, objArr5);
                    java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                    m245562 = util.h.xy.ag.a.m24556();
                    anonymousClass32 = new util.h.xy.cc.ma.AnonymousClass3(tokenSyncListener, intern2, null);
                }
            } else {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0004\ufff7\u0004\u0001\u0004", android.graphics.Color.alpha(0) + 5, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, 240 - android.view.View.getDefaultSize(0, 0), true, objArr6);
                java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
                com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode3 = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_ERROR_SDK_NOT_INITIALIZED;
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("쳛ᓬ㈈鳮作怯铜巳ꬖ扎\udc92䁽鑮㥗ꗥ\u0081\u2d69ꌒ\ue1a7糯㸦㕡弢呦뺝䣫跦⣟뛛擛ย\u2e77\uef16\ue62f懚弐⸌ᳳ\uef56\uf67a㇟䌼ힺ꺫뾾廷⃚㪆\u0cf9鮏\u2e77咅", (char) (23389 - android.view.KeyEvent.keyCodeFromString("")), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1, "䫅웣巁汛", "\u0000\u0000\u0000\u0000", objArr7);
                    com.gemalto.mfs.mwsdk.dcm.TokenSyncError tokenSyncError2 = new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(tokenSyncErrorCode3, ((java.lang.String) objArr7[0]).intern());
                    m245562 = util.h.xy.ag.a.m24556();
                    anonymousClass32 = new util.h.xy.cc.ma.AnonymousClass3(tokenSyncListener, intern3, tokenSyncError2);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            m245562.m24557(anonymousClass32);
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 31) % 128;
        }
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0004\ufff7\u0004\u0001\u0004", 5 - android.view.Gravity.getAbsoluteGravity(0, 0), 2 - android.graphics.Color.argb(0, 0, 0, 0), 241 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, objArr8);
        java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
        com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode4 = com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode.TOKEN_SYNC_ERROR_SDK_NOT_INITIALIZED;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0012ﾾ\u0007\f\u0007\u0012\u0007\uffff\n\u0007\u0018\uffff\u0012\u0007\r\fﾾ\f\r\u0012ﾾ\u0001\r\u000b\u000e\n\u0003\u0012\u0003\u0002￡￮\ufff1ﾾ\u0001\r\u000b\u000e\r\f\u0003\f", 42 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 29 - android.graphics.ImageFormat.getBitsPerPixel(0), 260 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr9);
        com.gemalto.mfs.mwsdk.dcm.TokenSyncError tokenSyncError3 = new com.gemalto.mfs.mwsdk.dcm.TokenSyncError(tokenSyncErrorCode4, ((java.lang.String) objArr9[0]).intern());
        m24556 = util.h.xy.ag.a.m24556();
        anonymousClass3 = new util.h.xy.cc.ma.AnonymousClass3(tokenSyncListener, intern4, tokenSyncError3);
        m24556.m24557(anonymousClass3);
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 31) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public long m25863() {
        if (util.h.xy.ag.a.m24556().m24560()) {
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 69) % 128;
            return m25866(java.lang.System.currentTimeMillis(), getHighResolutionOutputSizeshNQ4ISI());
        }
        int i = getHighSpeedVideoFpsRangesFor + 9;
        getOutputFormats = i % 128;
        return i % 2 == 0 ? 1L : 0L;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public long m25866(long j, java.lang.String[] strArr) {
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 85) % 128;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (Camera2StreamConfigurationMap(strArr, calendar)) {
            if (calendar.get(2) == 11) {
                int i = getOutputFormats + 91;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0 ? calendar.get(3) == 1 : calendar.get(5) == 1) {
                    calendar.set(1, calendar.get(1) + 1);
                    calendar.set(3, 2);
                }
            }
            calendar.set(3, calendar.get(3) + 1);
        }
        calendar.set(7, java.lang.Integer.parseInt(strArr[0]));
        calendar.set(11, java.lang.Integer.parseInt(strArr[1]));
        calendar.set(12, java.lang.Integer.parseInt(strArr[2]));
        calendar.set(13, java.lang.Integer.parseInt(strArr[3]));
        calendar.set(14, java.lang.Integer.parseInt(strArr[4]));
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0018\r\u0002\uffbf\u0012\u0002\u0007\u0004\u0003\u0014\u000b\u0004￭\u0004\u0017\u0013\uffbf\ufff3\u000e\n\u0004\r\ufff2", 23 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 12, 307 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, objArr);
        ((java.lang.String) objArr[0]).intern();
        Camera2StreamConfigurationMap(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        int i2 = getOutputFormats + 119;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return timeInMillis;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m25862() {
        long parseLong;
        if (!util.h.xy.ag.a.m24556().m24560()) {
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 43) % 128;
            return false;
        }
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 69) % 128;
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 9) % 128;
            parseLong = 0;
        } else {
            parseLong = java.lang.Long.parseLong(highSpeedVideoSizes);
        }
        return m25861(this.getOutputMinFrameDurationlomOqCM, parseLong, getHighResolutionOutputSizeshNQ4ISI(), java.util.Calendar.getInstance());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011f, code lost:
    
        if ((java.lang.Integer.parseInt(r27[2]) - r3.get(12)) > 0) goto L52;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m25861(long j, long j2, java.lang.String[] strArr, java.util.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        int i = calendar2.get(3);
        int i2 = calendar.get(3);
        int i3 = calendar2.get(1);
        int i4 = calendar.get(1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("柽艚쁅趞颹瀙쇋睈䶆\ueb14訁䒻\uf730\ue931嶬ꝁ튶\ue3d4넿腃\ue805嚔榥澵በ", (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionChild(0L) - 2061547697, "一\u1f47օ젹", "\u0000\u0000\u0000\u0000", objArr);
        ((java.lang.String) objArr[0]).intern();
        Camera2StreamConfigurationMap(calendar2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\ufff3\b\f\u0004￢\u0014\u0011\u0011\u0004\r\u0013\uffbf", android.view.KeyEvent.normalizeMetaState(0) + 12, 4 - android.view.KeyEvent.getDeadChar(0, 0), 259 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr2);
        ((java.lang.String) objArr2[0]).intern();
        Camera2StreamConfigurationMap(calendar);
        java.lang.String str = strArr[0];
        java.lang.String str2 = strArr[1];
        java.lang.String str3 = strArr[2];
        java.lang.String str4 = strArr[3];
        java.lang.String str5 = strArr[4];
        if (j != 0) {
            if (calendar.getTimeInMillis() - j <= 3600000) {
                return false;
            }
        } else {
            if (j2 == 0) {
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 87) % 128;
                boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(strArr, calendar);
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                return Camera2StreamConfigurationMap2;
            }
            if ((calendar.getTimeInMillis() - j2) / this.getOutputStallDurationlomOqCM > 7) {
                return true;
            }
            if (i2 == i) {
                if (java.lang.Integer.parseInt(strArr[0]) - calendar2.get(7) <= 0 && (java.lang.Integer.parseInt(strArr[0]) - calendar2.get(7) != 0 || java.lang.Integer.parseInt(strArr[1]) - calendar2.get(11) <= 0)) {
                    if (java.lang.Integer.parseInt(strArr[0]) - calendar2.get(7) == 0) {
                        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 79) % 128;
                        if (java.lang.Integer.parseInt(strArr[1]) - calendar2.get(11) == 0) {
                        }
                    }
                    if (java.lang.Integer.parseInt(strArr[0]) - calendar2.get(7) != 0 || java.lang.Integer.parseInt(strArr[1]) - calendar2.get(11) != 0 || java.lang.Integer.parseInt(strArr[2]) - calendar2.get(12) != 0 || java.lang.Integer.parseInt(strArr[3]) - calendar2.get(13) <= 0) {
                        if (java.lang.Integer.parseInt(strArr[0]) - calendar2.get(7) == 0 && java.lang.Integer.parseInt(strArr[1]) - calendar2.get(11) == 0 && java.lang.Integer.parseInt(strArr[2]) - calendar2.get(12) == 0 && java.lang.Integer.parseInt(strArr[3]) - calendar2.get(13) == 0) {
                            int i5 = getOutputFormats + 99;
                            getHighSpeedVideoFpsRangesFor = i5 % 128;
                            if (i5 % 2 == 0) {
                            }
                        }
                    }
                }
                return Camera2StreamConfigurationMap(strArr, calendar);
            }
            if ((i2 <= i && i4 <= i3) || !Camera2StreamConfigurationMap(strArr, calendar)) {
                return false;
            }
        }
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 55) % 128;
        return true;
    }

    private static void Camera2StreamConfigurationMap(java.util.Calendar calendar) {
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 15) % 128;
        calendar.get(1);
        calendar.get(3);
        calendar.get(7);
        calendar.get(11);
        calendar.get(12);
        calendar.get(13);
        calendar.get(14);
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 17) % 128;
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String[] strArr, java.util.Calendar calendar) {
        if (calendar.get(7) - java.lang.Integer.parseInt(strArr[0]) <= 0) {
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            if ((calendar.get(7) - java.lang.Integer.parseInt(strArr[0]) != 0 || calendar.get(11) - java.lang.Integer.parseInt(strArr[1]) <= 0) && ((calendar.get(7) - java.lang.Integer.parseInt(strArr[0]) != 0 || calendar.get(11) - java.lang.Integer.parseInt(strArr[1]) != 0 || calendar.get(12) - java.lang.Integer.parseInt(strArr[2]) <= 0) && (calendar.get(7) - java.lang.Integer.parseInt(strArr[0]) != 0 || calendar.get(11) - java.lang.Integer.parseInt(strArr[1]) != 0 || calendar.get(12) - java.lang.Integer.parseInt(strArr[2]) != 0 || calendar.get(13) - java.lang.Integer.parseInt(strArr[3]) <= 0))) {
                if (calendar.get(7) - java.lang.Integer.parseInt(strArr[0]) == 0) {
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                    if (calendar.get(11) - java.lang.Integer.parseInt(strArr[1]) == 0 && calendar.get(12) - java.lang.Integer.parseInt(strArr[2]) == 0 && calendar.get(13) - java.lang.Integer.parseInt(strArr[3]) == 0) {
                        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                        if (calendar.get(14) - java.lang.Integer.parseInt(strArr[4]) < 0) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public java.lang.String m25867(java.util.List<java.lang.String> list) throws util.h.xy.r.b {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            util.h.xy.az.ra m25186 = util.h.xy.au.mf.m25169().m25186(jSONArray);
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25186.m25280()));
            java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25186);
            if (m25186.m25281() == 200) {
                getInputFormats();
            }
            if (util.h.xy.az.ra.m25277(m25142)) {
                return jSONObject.toString();
            }
            java.lang.String m25134 = util.h.xy.au.g.m25127().m25134(m25186);
            int parseInt = java.lang.Integer.parseInt(m25142);
            getOutputFormats = (getHighSpeedVideoFpsRangesFor + 29) % 128;
            if (parseInt == 9000) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0001\u0010\n\u0005ﾼ\u0000\u0001\u0010\uffff\u0001\f\u0014\u0001\n\ufff1\u000e\u000b\u000e\u000e\u0001ﾼ\b�\n\u000e", 25 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 263, true, objArr);
                throw new util.h.xy.r.b(((java.lang.String) objArr[0]).intern(), com.visa.cbp.sdk.facade.data.Constants.ON_ERROR_DAS_GETKEY);
            }
            if (parseInt == 9001) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\ue759\uf611व\uf665匐닭\ue450艓燙焞殁鹎鰹ꮽ竅칼戛ጸ\u082e᱗켗⻦㘛打踓ⵇ⍯牞ሿ후횷ɾ\ue17e", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1739195836) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "䒮嗺炘蟒", "\u0000\u0000\u0000\u0000", objArr2);
                throw new util.h.xy.r.b(((java.lang.String) objArr2[0]).intern(), com.visa.cbp.sdk.facade.data.Constants.ON_SUCCESS_DAS_GETKEY);
            }
            if (parseInt == 9002) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0011\n\r￫\u000f\u0000\u0007\u0007￼\u0012ﾻ\t\u0012\n\t\u0006\t\ufff0\r\n\r\r\u0000ﾻ\uffff￤\r\u0000\uffff\u0004", android.graphics.Color.red(0) + 30, android.text.TextUtils.indexOf("", "") + 18, 263 - android.view.View.resolveSize(0, 0), true, objArr3);
                throw new util.h.xy.r.b(((java.lang.String) objArr3[0]).intern(), 9002);
            }
            if (parseInt == 9003) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0014\u000bﾽ\u0014\ufffe\t\t\u0002\u0011￦\u0001ﾽ\u0002\u000f\u000f\f\u000f\ufff2\u000b\b\u000b\f", 22 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, 261 - android.text.TextUtils.indexOf("", "", 0), false, objArr4);
                throw new util.h.xy.r.b(((java.lang.String) objArr4[0]).intern(), 9003);
            }
            if (parseInt != 9010) {
                util.h.xy.r.b bVar = new util.h.xy.r.b(m25134, parseInt);
                getHighSpeedVideoFpsRangesFor = (getOutputFormats + 57) % 128;
                throw bVar;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u000e\u0005\u0011\r\u0001\u000eﾼ\u0003\n\u0005\u000f\u000f\u0005￩\u000e\u0001\u0010\u0001\t�\u000e�\fﾼ\u0000\u0001", 26 - android.view.View.resolveSizeAndState(0, 0, 0), 14 - android.graphics.Color.argb(0, 0, 0, 0), android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, true, objArr5);
            throw new util.h.xy.r.b(((java.lang.String) objArr5[0]).intern(), com.google.android.libraries.places.api.net.PlacesStatusCodes.OVER_QUERY_LIMIT);
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("㤃픿ﺌ旮歪䫺⊊濄샺\udc0f颣㸜✮챖", (char) (android.text.TextUtils.getOffsetBefore("", 0) + 58204), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, "춳溟岱짣", "\u0000\u0000\u0000\u0000", objArr6);
            sb.append(((java.lang.String) objArr6[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.r.b(sb.toString(), 11);
        } catch (org.json.JSONException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("쀲䇄\ue252ⷾ䷽Ḹ鰞\uf8db왚⪈ﴉ趞\ue432쨻띉", (char) (60662 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.graphics.Color.red(0) + 2129605678, "\u2e7a\uef34\uf67eꧬ", "\u0000\u0000\u0000\u0000", objArr7);
            sb2.append(((java.lang.String) objArr7[0]).intern());
            sb2.append(e2.getMessage());
            throw new util.h.xy.r.b(sb2.toString(), 12);
        } catch (util.h.xy.az.ma e3) {
            int m25272 = e3.m25272();
            if (m25272 == 400) {
                getInputFormats();
                try {
                    long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u000f\uffbf\u0006\r\b\u0012\u0012\b\f\uffbf\u0011\u000e\uffbf\u0000\u0013\u0000\u0003\uffbf\u0003\u0004\u0013\u0013\u0000\f\u0011\u000e\u0005\uffbf\u0006\r\u000e\u0011\ufff6\u0011\u0004\u0013\u0004\f\u0000\u0011\u0000", (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)) + 40, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 32, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 259, true, objArr8);
                    throw new util.h.xy.r.b(((java.lang.String) objArr8[0]).intern(), 400);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (m25272 == 500) {
                getInputFormats();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("∑虁\udfd5玗갩噃굊⏿語뵟ﻵǓ檀ഔ更娀⅌神熺ም㎄", (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (-1885001267) - android.view.View.MeasureSpec.getSize(0), "쵊ꔩ쮏蚓", "\u0000\u0000\u0000\u0000", objArr9);
                throw new util.h.xy.r.b(((java.lang.String) objArr9[0]).intern(), 500);
            }
            if (m25272 == 503) {
                this.getOutputMinFrameDurationlomOqCM = java.lang.System.currentTimeMillis();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\ue853빘쀟蛾֎뛍\uf231毙⮅\ue6bd袺议ꕿꛬย뾖ꗜ\uef85\uf728\ue9f9뿫⫪⟤䟴黑", (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1259036569) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "曘\uf4a0잴燑", "\u0000\u0000\u0000\u0000", objArr10);
                throw new util.h.xy.r.b(((java.lang.String) objArr10[0]).intern(), 503);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("싄Ｍ冴왥߁\u20c5ᬋ䬝\uf7b3ゼ棫醘⏴⪦拑鵭ᅲ媴ꏔഄ뢟", (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1064306745, "왺迷뇀ɖ", "\u0000\u0000\u0000\u0000", objArr11);
            sb3.append(((java.lang.String) objArr11[0]).intern());
            sb3.append(e3.getMessage());
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0015\n\u000bￆￆ\u000b\u0018\u0018\u0015\u0018￩", 11 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 4, android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, false, objArr12);
            sb3.append(((java.lang.String) objArr12[0]).intern());
            sb3.append(e3.m25272());
            throw new util.h.xy.r.b(sb3.toString(), 13);
        }
    }

    private void getInputFormats() {
        int i = getOutputFormats + 109;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRangesFor(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        } else {
            getHighSpeedVideoFpsRangesFor(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25864(java.lang.String str, int i, final com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener) throws util.h.xy.r.b, java.lang.InterruptedException {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\ufffa\ufffb\b\t\ufffb\u0004", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, 3 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, false, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0004\ufff7\u0007", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2, android.graphics.Color.rgb(0, 0, 0) + 16777454, true, objArr2);
        bundle.putString(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\uffff\n\ufff9\ufff7\u0004\u0005", 6 - android.graphics.Color.green(0), 4 - android.view.View.combineMeasuredStates(0, 0), 267 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u000f\u0011￥\u0016\u001a\u0007\ufff0\u0016\u0007￩ￜ\ufff5\ufff2￥\u0006\u0010\u0003\u000f", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 19, 14 - android.view.View.MeasureSpec.getSize(0), 256 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, objArr4);
        bundle.putString(intern2, ((java.lang.String) objArr4[0]).intern());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("荮ႄ囊\u1ad0≀鮄膤ࠃ滒隸栁걛ྣ獆", (char) (44486 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "⥲鎅엌鞭", "\u0000\u0000\u0000\u0000", objArr5);
        bundle.putString(((java.lang.String) objArr5[0]).intern(), str);
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService provisioningBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final util.h.xy.r.b[] bVarArr = {null};
        provisioningBusinessService.processIncomingMessage(bundle, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.cc.ma.2
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static int getInputFormats = 0;
            private static int getInputSizeshNQ4ISI = -1231763813;
            private static int getOutputFormats = 1;

            private static void getHighSpeedVideoFpsRangesFor(java.lang.String str2, int i2, int i3, int i4, java.lang.Object[] objArr6) {
                int i5 = getOutputFormats + 77;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str2.toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i2];
                raVar.f2649 = 0;
                while (raVar.f2649 < i2) {
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + i4);
                    int i6 = raVar.f2649;
                    cArr[i6] = (char) (cArr[i6] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (i3 > 0) {
                    raVar.f2648 = i3;
                    char[] cArr2 = new char[i2];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
                    java.lang.System.arraycopy(cArr2, 0, cArr, i2 - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i2 - raVar.f2648);
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 71) % 128;
                }
                char[] cArr3 = new char[i2];
                raVar.f2649 = 0;
                while (raVar.f2649 < i2) {
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 11) % 128;
                    cArr3[raVar.f2649] = cArr[(i2 - raVar.f2649) - 1];
                    raVar.f2649++;
                }
                objArr6[0] = new java.lang.String(cArr3);
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                provisioningServiceError.getErrorMessage();
                util.h.xy.r.b[] bVarArr2 = bVarArr;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(provisioningServiceError.getCpsErrorCode());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\ufff8\u0012\ufff8", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, 3 - android.text.TextUtils.indexOf("", "", 0), 54 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
                sb.append(((java.lang.String) objArr6[0]).intern());
                sb.append(provisioningServiceError.getErrorMessage());
                bVarArr2[0] = new util.h.xy.r.b(sb.toString(), 4, provisioningServiceError.getCausingException());
                countDownLatch.countDown();
                int i2 = getHighSpeedVideoSizesFor + 91;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onUnsupportedPushContent(android.os.Bundle bundle2) {
                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                util.h.xy.r.b[] bVarArr2 = bVarArr;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u000b\f\f\u0011\u000f\n\ufff1\u0010\n\u0001\u0010\n\u000b\uffdfﾼ\u0004\u000f\u0011￬ﾼ\u0000\u0001\u0010\u000e", 25 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-16777209) - android.graphics.Color.rgb(0, 0, 0), 114 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
                bVarArr2[0] = new util.h.xy.r.b(((java.lang.String) objArr6[0]).intern(), 2);
                countDownLatch.countDown();
                getHighSpeedVideoSizesFor = (getInputFormats + 17) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onServerMessage(java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                int i2 = getInputFormats + 67;
                getHighSpeedVideoSizesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                    com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener2 = tokenSyncListener;
                    if (tokenSyncListener2 != null) {
                        int i3 = getInputFormats + 99;
                        getHighSpeedVideoSizesFor = i3 % 128;
                        if (i3 % 2 != 0) {
                            util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor(str2, provisioningServiceMessage, tokenSyncListener2);
                            return;
                        } else {
                            util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor(str2, provisioningServiceMessage, tokenSyncListener2);
                            throw new java.lang.ArithmeticException();
                        }
                    }
                    return;
                }
                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                throw null;
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onComplete() {
                int i2 = getInputFormats + 29;
                getHighSpeedVideoSizesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                    countDownLatch.countDown();
                    getInputFormats = (getHighSpeedVideoSizesFor + 85) % 128;
                } else {
                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                    countDownLatch.countDown();
                    throw null;
                }
            }
        });
        if (countDownLatch.await(i, java.util.concurrent.TimeUnit.SECONDS)) {
            util.h.xy.r.b bVar = bVarArr[0];
            if (bVar == null) {
                getHighSpeedVideoFpsRangesFor = (getOutputFormats + 121) % 128;
                return;
            }
            int i2 = getHighSpeedVideoFpsRangesFor + 95;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                throw bVar;
            }
            throw bVar;
        }
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0005\u000b\n￪\uffff\u0003\ufffb", 7 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, false, objArr6);
        throw new util.h.xy.r.b(((java.lang.String) objArr6[0]).intern(), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x015a, code lost:
    
        if (r8 != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02e0, code lost:
    
        if (r10.equalsIgnoreCase(((java.lang.String) r15[0]).intern()) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0312, code lost:
    
        if (r10.equalsIgnoreCase(((java.lang.String) r15[0]).intern()) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c8, code lost:
    
        if (r10.equalsIgnoreCase(((java.lang.String) r12[0]).intern()) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cb, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        if (r8 != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.RETIRED) goto L42;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m25865(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.util.List<java.lang.String> list, com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener) {
        int i;
        int i2;
        boolean Camera2StreamConfigurationMap2;
        if (hashMap == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("쁨\uf398\udafa錭촒\uf75e㚕想둟䖞\udbfc夅곜\u20cb儯싆袄앾꘩搷\u0ff9ỳ\uf054푿\udad4\uf2d4\ude43翻ꖜᤃ\uf619\u1f5a\ue329陿\ue621Ⲗ鷇䳠ツ琧ඤ腈홒祢\ua7db", (char) (42386 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1567408924, "ᴑ泃鉝岥", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        boolean z = true;
        for (java.lang.String str : list) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = util.h.xy.k.ra.f2243.m26950(str);
            if (util.h.xy.u.d.m27514(m26950)) {
                com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(m26950.getResult().m26180());
                java.lang.String str2 = hashMap.get(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId(m26950.getResult().m26180()));
                if (str2 != null) {
                    int i3 = getOutputFormats + 39;
                    getHighSpeedVideoFpsRangesFor = i3 % 128;
                    if (i3 % 2 != 0) {
                        ((util.h.xy.d.md) digitalizedCard).m26210();
                        throw null;
                    }
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m26210 = ((util.h.xy.d.md) digitalizedCard).m26210();
                    if (m26210 != null && m26210.isSuccessful()) {
                        int i4 = getOutputFormats + 51;
                        getHighSpeedVideoFpsRangesFor = i4 % 128;
                        if (i4 % 2 != 0) {
                            m26210.getResult();
                            throw null;
                        }
                        if (m26210.getResult() != null) {
                            com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState state = m26210.getResult().getState();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("��\ufffe\r\ufffe\u0005\ufffe", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 7, android.text.TextUtils.getOffsetAfter("", 0) + 1, 233 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr2);
                            if (str2.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25909 = util.h.xy.cg.b.m25907().m25909(m26950.getResult().m26180());
                                z &= m25909.isSuccessful();
                                if (m25909.isSuccessful()) {
                                    m26950.getResult().m26180();
                                    util.h.xy.ag.a.m24556().m24557(new util.h.xy.cc.ma.AnonymousClass4(tokenSyncListener, m26950.getResult().m26180()));
                                    getHighSpeedVideoFpsRangesFor = (getOutputFormats + 43) % 128;
                                } else {
                                    m26950.getResult().m26180();
                                    m25909.getErrorMessage();
                                    getHighResolutionOutputSizeshNQ4ISI(tokenSyncListener, state, m26950.getResult().m26180(), com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_FAIL);
                                }
                            } else {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("怲ㆌ㵙㜰㬋\u3040", (char) (23970 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.getSize(0), "녭ꜛꌯ桝", "\u0000\u0000\u0000\u0000", objArr3);
                                if (str2.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                                    int i5 = getOutputFormats + 87;
                                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
                                        throw new java.lang.ArithmeticException();
                                    }
                                }
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("\ufffa\ufff9\b\n\b\u0005\ufffa\u0003\ufff9", 8 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, android.text.TextUtils.getTrimmedLength("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, false, objArr4);
                                if (!str2.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\f\uffff\n\ufff9\ufff7\u0004\uffff\ufffb", android.graphics.Color.green(0) + 8, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, 236 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, objArr5);
                                }
                                if (state != com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) {
                                }
                                boolean z2 = true;
                                int i6 = (getHighSpeedVideoFpsRangesFor + 13) % 128;
                                getOutputFormats = i6;
                                if (!z2) {
                                    int i7 = i6 + 113;
                                    int i8 = i7 % 128;
                                    getHighSpeedVideoFpsRangesFor = i8;
                                    if (i7 % 2 != 0) {
                                        i = 28961;
                                        i2 = 1;
                                    } else {
                                        i = 23971;
                                        i2 = 0;
                                    }
                                    getOutputFormats = (i8 + 93) % 128;
                                    try {
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("怲ㆌ㵙㜰㬋\u3040", (char) (i + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(i2))).intValue() + 20) >> 6)), android.view.View.combineMeasuredStates(0, 0), "녭ꜛꌯ桝", "\u0000\u0000\u0000\u0000", objArr6);
                                        if (str2.equalsIgnoreCase(((java.lang.String) objArr6[0]).intern())) {
                                            int i9 = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                            getHighSpeedVideoFpsRangesFor = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                Camera2StreamConfigurationMap(tokenSyncListener, m26950.getResult(), state, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE);
                                                throw new java.lang.ArithmeticException();
                                            }
                                            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(tokenSyncListener, m26950.getResult(), state, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE);
                                        } else {
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI("\ufffa\ufff9\b\n\b\u0005\ufffa\u0003\ufff9", 10 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 237 - android.view.View.resolveSizeAndState(0, 0, 0), false, objArr7);
                                            if (!str2.equalsIgnoreCase(((java.lang.String) objArr7[0]).intern())) {
                                                int i10 = getHighSpeedVideoFpsRangesFor + 45;
                                                getOutputFormats = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI("\f\uffff\n\ufff9\ufff7\u0004\uffff\ufffb", android.widget.ExpandableListView.getPackedPositionType(1L) + 73, '8' - android.text.AndroidCharacter.getMirror((char) 22), 10026 << android.graphics.Color.red(1), true, objArr8);
                                                } else {
                                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                    getHighResolutionOutputSizeshNQ4ISI("\f\uffff\n\ufff9\ufff7\u0004\uffff\ufffb", 8 - android.widget.ExpandableListView.getPackedPositionType(0L), '7' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 236 - android.graphics.Color.red(0), true, objArr9);
                                                }
                                            }
                                            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(tokenSyncListener, m26950.getResult(), state, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED);
                                        }
                                        z &= Camera2StreamConfigurationMap2;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    getHighResolutionOutputSizeshNQ4ISI(tokenSyncListener, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN, m26950.getResult().m26180(), com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_FAIL);
                    z = false;
                }
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 27) % 128;
            } else {
                getHighResolutionOutputSizeshNQ4ISI(tokenSyncListener, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.UNKNOWN, str, com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_FAIL);
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0087, code lost:
    
        if (r3.equalsIgnoreCase(((java.lang.String) r6[0]).intern()) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener, util.h.xy.d.d dVar, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState2) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25874;
        boolean isSuccessful;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = ((util.h.xy.d.md) com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(dVar.m26180())).m26209();
        boolean isSuccessful2 = m26209.isSuccessful();
        if (isSuccessful2) {
            com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails result = m26209.getResult();
            java.lang.String scheme = result.getScheme();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("屭Օ츷ㄊ촊謫ﰼᆧ삺ꗂ", (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "俷蠣嵕䜏", "\u0000\u0000\u0000\u0000", objArr);
            if (!scheme.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                java.lang.String scheme2 = result.getScheme();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0003\ufff6\u0001\u0006", 4 - android.view.View.resolveSize(0, 0), 2 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 193, false, objArr2);
            }
            if (digitalizedCardState2 == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) {
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 97) % 128;
                m25874 = util.h.xy.ce.mb.m25873().m25874(dVar.m26180(), digitalizedCardState2);
                if (dVar.m26179() != null) {
                    util.h.xy.ce.mb.m25873().m25875(dVar.m26179(), digitalizedCardState2);
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                }
                isSuccessful = m25874.isSuccessful();
                if (!isSuccessful) {
                    dVar.m26180();
                    getHighResolutionOutputSizeshNQ4ISI(tokenSyncListener, digitalizedCardState2, dVar.m26180(), com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_SUCCESS);
                } else {
                    dVar.m26180();
                    getHighResolutionOutputSizeshNQ4ISI(tokenSyncListener, digitalizedCardState, dVar.m26180(), com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_FAIL);
                }
                return isSuccessful;
            }
            m25874 = util.h.xy.ce.mb.m25873().m25877(dVar, digitalizedCardState2);
            isSuccessful = m25874.isSuccessful();
            if (!isSuccessful) {
            }
            return isSuccessful;
        }
        dVar.m26180();
        getHighResolutionOutputSizeshNQ4ISI(tokenSyncListener, digitalizedCardState, dVar.m26180(), com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus.TOKEN_SYNC_STATUS_FAIL);
        return isSuccessful2;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(final com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener, final com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, final java.lang.String str, final com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus tokenSyncStatus) {
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.cc.ma.1
            private static int Camera2StreamConfigurationMap = 1;
            private static int getInputSizeshNQ4ISI;

            @Override // java.lang.Runnable
            public final void run() {
                Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                tokenSyncListener.onProgressUpdate(str, tokenSyncStatus, digitalizedCardState);
                int i = getInputSizeshNQ4ISI;
                int i2 = (i ^ 41) + ((i & 41) << 1);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
        });
        int i = getOutputFormats + 113;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: util.h.xy.cc.ma$4, reason: invalid class name */
    final class AnonymousClass4 implements java.lang.Runnable {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizes;
        final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.TokenSyncListener getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

        AnonymousClass4(com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = tokenSyncListener;
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i | 17) << 1) - (i ^ 17)) % 128;
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                int i2 = (i ^ 19) + ((i & 19) << 1);
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                    this.getHighResolutionOutputSizeshNQ4ISI.onCardDeleted(this.getHighSpeedVideoFpsRangesFor);
                } else {
                    util.h.xy.cc.ma.getHighSpeedVideoFpsRangesFor();
                    this.getHighResolutionOutputSizeshNQ4ISI.onCardDeleted(this.getHighSpeedVideoFpsRangesFor);
                    throw null;
                }
            }
            int i3 = getHighSpeedVideoSizes;
            int i4 = ((i3 | 45) << 1) - (i3 ^ 45);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static java.lang.String getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRangesFor + 23;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRangesFor = (i2 + 69) % 128;
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (i2 + 69) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("䃾䪒尓릚퉥줴脐֡璐䎹ᴈ→苎", (char) (53047 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), 503250603 + android.view.View.MeasureSpec.getSize(0), "ꭒ\ufefe㜝\udbcf", "\u0000\u0000\u0000\u0000", objArr);
        java.lang.String m25230 = util.h.xy.av.ra.m25230(m24558, ((java.lang.String) objArr[0]).intern());
        int i3 = getHighSpeedVideoFpsRangesFor + 79;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            return m25230;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int i = getOutputFormats;
        getHighSpeedVideoFpsRangesFor = (i + 69) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 105) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("䃾䪒尓릚퉥줴脐֡璐䎹ᴈ→苎", (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 53048), 503250603 + (android.view.KeyEvent.getMaxKeyCode() >> 16), "ꭒ\ufefe㜝\udbcf", "\u0000\u0000\u0000\u0000", objArr);
        util.h.xy.av.ra.m25239(m24558, ((java.lang.String) objArr[0]).intern(), str);
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = -1231763766;
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = -1231763916;
        Camera2StreamConfigurationMap = 2457411417541981002L;
        getOutputSizeshNQ4ISI = 294925130;
        getHighResolutionOutputSizeshNQ4ISI = (char) 26308;
    }

    private java.lang.String[] getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Object obj;
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0) + 26;
        int windowTouchSlop = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 7;
        int i = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
        char[] charArray = "\u0001\u000fￊ�\u0012�\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff".toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[resolveSizeAndState];
        raVar.f2649 = 0;
        while (raVar.f2649 < resolveSizeAndState) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i);
            int i2 = raVar.f2649;
            cArr[i2] = (char) (cArr[i2] - ((int) (getHighSpeedVideoSizesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (windowTouchSlop > 0) {
            raVar.f2648 = windowTouchSlop;
            char[] cArr2 = new char[resolveSizeAndState];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, resolveSizeAndState);
            java.lang.System.arraycopy(cArr2, 0, cArr, resolveSizeAndState - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, resolveSizeAndState - raVar.f2648);
        }
        char[] cArr3 = new char[resolveSizeAndState];
        raVar.f2649 = 0;
        while (raVar.f2649 < resolveSizeAndState) {
            cArr3[raVar.f2649] = cArr[(resolveSizeAndState - raVar.f2649) - 1];
            raVar.f2649++;
        }
        java.lang.String str = new java.lang.String(cArr3);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("酏", (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61902), 933792973 - android.widget.ExpandableListView.getPackedPositionChild(0L), "칌ꢌ켷糱", "\u0000\u0000\u0000\u0000", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i3 = getOutputFormats;
        getHighSpeedVideoFpsRangesFor = (i3 + 41) % 128;
        getHighSpeedVideoFpsRangesFor = (i3 + 69) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\ufffb\ufffe\uffff\u0005\uffff\u0005\ufffb\r￼\u0001", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 11, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4, android.view.KeyEvent.getDeadChar(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, true, objArr2);
        java.lang.String m25230 = util.h.xy.av.ra.m25230(m24558, ((java.lang.String) objArr2[0]).intern());
        if (m25230 == null || m25230.isEmpty()) {
            try {
                int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt(7);
                int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt(16);
                int i4 = getHighSpeedVideoFpsRangesFor + 109;
                getOutputFormats = i4 % 128;
                int nextInt3 = i4 % 2 == 0 ? ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt(11) : ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt(60);
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 3) % 128;
                int nextInt4 = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt(60);
                int nextInt5 = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt(1000);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(nextInt + 1);
                sb.append(intern);
                sb.append(nextInt2 + 6);
                sb.append(intern);
                sb.append(nextInt3);
                sb.append(intern);
                sb.append(nextInt4);
                sb.append(intern);
                sb.append(nextInt5);
                m25230 = sb.toString();
                int i5 = getHighSpeedVideoFpsRangesFor + 65;
                int i6 = i5 % 128;
                getOutputFormats = i6;
                int i7 = i5 % 2;
                int i8 = (i6 + 69) % 128;
                getHighSpeedVideoFpsRangesFor = i8;
                if (i7 == 0) {
                    throw null;
                }
                int i9 = i8 + 35;
                getOutputFormats = i9 % 128;
                int i10 = i9 % 2;
                android.content.Context m245582 = util.h.xy.ag.a.m24556().m24558();
                if (i10 == 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufffb\ufffe\uffff\u0005\uffff\u0005\ufffb\r￼\u0001", 59 / (android.view.ViewConfiguration.getTapTimeout() << 33), 3 >>> (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2064 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false, objArr3);
                    obj = objArr3[0];
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufffb\ufffe\uffff\u0005\uffff\u0005\ufffb\r￼\u0001", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 10, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 269 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, objArr4);
                    obj = objArr4[0];
                }
                util.h.xy.av.ra.m25239(m245582, ((java.lang.String) obj).intern(), m25230);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return m25230.split(intern);
    }
}
