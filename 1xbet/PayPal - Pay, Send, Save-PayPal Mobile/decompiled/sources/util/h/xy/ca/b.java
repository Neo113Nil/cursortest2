package util.h.xy.ca;

/* loaded from: classes5.dex */
public class b implements com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService {
    private static final byte[] Camera2StreamConfigurationMap = null;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static char[] getOutputFormats = null;
    private static int getOutputMinFrameDuration = 0;
    private static boolean getOutputMinFrameDurationlomOqCM = false;
    private static int getOutputSizes = 1;
    private static long getOutputSizeshNQ4ISI;
    private static char getOutputStallDuration;
    private static char[] getOutputStallDurationlomOqCM;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ca.b f1088;
    private com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener _BOUNDARY;
    private java.lang.String _CREATION;
    private com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener accessartificialFrame;
    private com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener coroutineBoundary;
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME = false;
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType unwrapAs = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE;
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType toString = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.ACTIVATION_CODE;
    private byte[] isOutputSupportedFor = null;
    private byte[] getValidOutputFormatsForInputhNQ4ISI = null;
    private boolean CoroutineDebuggingKt = false;
    private final util.h.xy.at.mb coroutineCreation = new util.h.xy.at.mb() { // from class: util.h.xy.ca.b.18
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizes;

        @Override // util.h.xy.at.mb
        /* renamed from: ᐝ */
        public final void mo25118(final byte[] bArr) {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i & 119) + (i | 119);
            int i3 = i2 % 128;
            getHighSpeedVideoSizes = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (bArr != null) {
                int i4 = ((i3 | 85) << 1) - (i3 ^ 85);
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 == 0) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this);
                    throw null;
                }
                if (util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this) != null && util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this) != null) {
                    int i5 = getHighSpeedVideoSizes + 87;
                    Camera2StreamConfigurationMap = i5 % 128;
                    if (i5 % 2 == 0) {
                        int length = util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this).length;
                        throw null;
                    }
                    if (util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this).length > 0) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 115) % 128;
                        if (util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this).length > 0) {
                            int i6 = Camera2StreamConfigurationMap;
                            int i7 = ((i6 | 35) << 1) - (i6 ^ 35);
                            getHighSpeedVideoSizes = i7 % 128;
                            if (i7 % 2 != 0) {
                                util.h.xy.cg.a.m25903(bArr);
                                throw new java.lang.ArithmeticException();
                            }
                            if (util.h.xy.cg.a.m25903(bArr)) {
                                new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.18.2
                                    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                                    private static int getHighSpeedVideoSizes = 1;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i8 = getHighResolutionOutputSizeshNQ4ISI;
                                        getHighSpeedVideoSizes = ((i8 & 61) + (i8 | 61)) % 128;
                                        util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this, util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this), util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this), bArr, util.h.xy.at.ma.m25117());
                                        int i9 = getHighSpeedVideoSizes;
                                        getHighResolutionOutputSizeshNQ4ISI = ((i9 ^ 47) + ((i9 & 47) << 1)) % 128;
                                    }
                                }).start();
                                int i8 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoSizes = (((i8 | 15) << 1) - (i8 ^ 15)) % 128;
                            } else {
                                util.h.xy.ar.b.m25100(util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this), util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this));
                                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.18.1
                                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                    private static int[] getHighSpeedVideoFpsRanges = {711382762, 1490224950, 1731715689, -1998969670, -2021909728, -1222871747, -1602466434, 1871788093, 947274176, -1738291973, 845642370, 1137561498, -1968945854, 557301675, -2083599655, -1926623455, 1710221247, -2050709045};
                                    private static int getHighSpeedVideoFpsRangesFor = 0;
                                    private static int getHighSpeedVideoSizes = 0;
                                    private static int getOutputMinFrameDuration = 1;

                                    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i9, java.lang.Object[] objArr) {
                                        util.h.xz.b.c cVar = new util.h.xz.b.c();
                                        char[] cArr = new char[4];
                                        char[] cArr2 = new char[iArr.length * 2];
                                        int[] iArr2 = getHighSpeedVideoFpsRanges;
                                        if (iArr2 != null) {
                                            int length2 = iArr2.length;
                                            int[] iArr3 = new int[length2];
                                            for (int i10 = 0; i10 < length2; i10++) {
                                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 93) % 128;
                                                iArr3[i10] = (int) (iArr2[i10] ^ (-5569649899877129369L));
                                            }
                                            iArr2 = iArr3;
                                        }
                                        int length3 = iArr2.length;
                                        int[] iArr4 = new int[length3];
                                        int[] iArr5 = getHighSpeedVideoFpsRanges;
                                        if (iArr5 != null) {
                                            int length4 = iArr5.length;
                                            int[] iArr6 = new int[length4];
                                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 13) % 128;
                                            for (int i11 = 0; i11 < length4; i11++) {
                                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 39) % 128;
                                                iArr6[i11] = (int) (iArr5[i11] ^ (-5569649899877129369L));
                                            }
                                            iArr5 = iArr6;
                                        }
                                        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length3);
                                        cVar.f2626 = 0;
                                        while (cVar.f2626 < iArr.length) {
                                            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                                            cArr[1] = (char) iArr[cVar.f2626];
                                            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                                            cArr[3] = (char) iArr[cVar.f2626 + 1];
                                            cVar.f2627 = (cArr[0] << 16) + cArr[1];
                                            cVar.f2625 = (cArr[2] << 16) + cArr[3];
                                            util.h.xz.b.c.m27723(iArr4);
                                            for (int i12 = 0; i12 < 16; i12++) {
                                                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                                                cVar.f2627 ^= iArr4[i12];
                                                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                                int i13 = cVar.f2627;
                                                cVar.f2627 = cVar.f2625;
                                                cVar.f2625 = i13;
                                            }
                                            int i14 = cVar.f2627;
                                            cVar.f2627 = cVar.f2625;
                                            cVar.f2625 = i14;
                                            cVar.f2625 ^= iArr4[16];
                                            cVar.f2627 ^= iArr4[17];
                                            int i15 = cVar.f2627;
                                            int i16 = cVar.f2625;
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
                                        objArr[0] = new java.lang.String(cArr2, 0, i9);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_ACTIVATION_MOBILE_PIN_INVALID_LENGTH;
                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(new int[]{182126806, -1466348015, -964698965, 1539239641, 644912025, -1290873068, -587917953, 1102379820, 1088329309, 1239350381, 242710488, -1446721405, 1590588585, -1216190717}, android.graphics.Color.blue(0) + 26, objArr);
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr[0]).intern(), null);
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(new int[]{-739186386, -1951184664}, 5 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                                        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(new int[]{1317475879, 1843908534, -339105462, 578959656, -1317965570, 1108198238, 1338291023, -387966187}, android.view.Gravity.getAbsoluteGravity(0, 0) + 13, objArr3);
                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onError(provisioningServiceError);
                                        int i9 = getOutputMinFrameDuration + 89;
                                        getHighSpeedVideoSizes = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                });
                                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 95) % 128;
                            }
                        }
                    }
                }
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 89) % 128;
        }
    };
    private final util.h.xy.at.mb isOutputSupportedForhNQ4ISI = new util.h.xy.at.mb() { // from class: util.h.xy.ca.b.20
        @Override // util.h.xy.at.mb
        /* renamed from: ᐝ */
        public final void mo25118(final byte[] bArr) {
            if (bArr != null) {
                synchronized (util.h.xy.ca.b.class) {
                    if (util.h.xy.ca.b.getOutputFormats(util.h.xy.ca.b.this) == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.MOBILE_PIN) {
                        util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.MOBILE_PIN);
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, new byte[bArr.length]);
                        java.lang.System.arraycopy(bArr, 0, util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this), 0, bArr.length);
                        byte[] m25117 = util.h.xy.at.ma.m25117();
                        util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, new byte[m25117.length]);
                        java.lang.System.arraycopy(m25117, 0, util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this), 0, m25117.length);
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.20.5
                            private static int Camera2StreamConfigurationMap = 1;
                            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                            private static int getHighSpeedVideoSizesFor = 0;
                            private static int getInputSizeshNQ4ISI = 1;
                            private static char[] getHighSpeedVideoFpsRangesFor = {41970, 41886, 41871, 41870, 41881, 41983, 41980, 41887, 41872, 41982, 41875, 41971, 41868, 41968, 41877, 41969};
                            private static char getHighSpeedVideoFpsRanges = 38466;

                            /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
                            
                                if (r0.f2641 == r0.f2636) goto L24;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
                            
                                r0.f2639 = r0.f2641 / r2;
                                r0.f2640 = r0.f2641 % r2;
                                r0.f2637 = r0.f2636 / r2;
                                r0.f2635 = r0.f2636 % r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
                            
                                if (r0.f2640 != r0.f2635) goto L28;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
                            
                                r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
                                r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
                                r7 = r0.f2639;
                                r8 = r0.f2640;
                                r9 = r0.f2637;
                                r10 = r0.f2635;
                                r3[r0.f2638] = r1[(r7 * r2) + r8];
                                r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
                            
                                if (r0.f2639 != r0.f2637) goto L31;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:27:0x00e4, code lost:
                            
                                r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
                                r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
                                r7 = r0.f2639;
                                r8 = r0.f2640;
                                r9 = r0.f2637;
                                r10 = r0.f2635;
                                r3[r0.f2638] = r1[(r7 * r2) + r8];
                                r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:29:0x010c, code lost:
                            
                                r7 = r0.f2639;
                                r8 = r0.f2635;
                                r9 = r0.f2637;
                                r10 = r0.f2640;
                                r3[r0.f2638] = r1[(r7 * r2) + r8];
                                r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
                            
                                r3[r0.f2638] = (char) (r0.f2641 - r12);
                                r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
                            
                                if (r0.f2641 == r0.f2636) goto L24;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
                                int i2;
                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
                                char[] charArray = str.toCharArray();
                                util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                                char[] cArr = getHighSpeedVideoFpsRangesFor;
                                if (cArr != null) {
                                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
                                    int length = cArr.length;
                                    char[] cArr2 = new char[length];
                                    for (int i3 = 0; i3 < length; i3++) {
                                        cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                                    }
                                    cArr = cArr2;
                                }
                                char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRanges);
                                char[] cArr3 = new char[i];
                                if (i % 2 != 0) {
                                    i2 = i - 1;
                                    cArr3[i2] = (char) (charArray[i2] - b);
                                } else {
                                    i2 = i;
                                }
                                if (i2 > 1) {
                                    mcVar.f2638 = 0;
                                    while (mcVar.f2638 < i2) {
                                        int i4 = Camera2StreamConfigurationMap + 99;
                                        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            mcVar.f2641 = charArray[mcVar.f2638];
                                            mcVar.f2636 = charArray[mcVar.f2638 << 1];
                                        } else {
                                            mcVar.f2641 = charArray[mcVar.f2638];
                                            mcVar.f2636 = charArray[mcVar.f2638 + 1];
                                        }
                                        mcVar.f2638 += 2;
                                    }
                                }
                                int i5 = Camera2StreamConfigurationMap + 69;
                                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i6 = 5 / 3;
                                }
                                int i7 = 0;
                                while (i7 < i) {
                                    cArr3[i7] = (char) (cArr3[i7] ^ 13722);
                                    i7++;
                                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 51) % 128;
                                }
                                objArr[0] = new java.lang.String(cArr3);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 51), "\f\u0000\u000f\u0006", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr);
                                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.indexOf("", "") + 100), "\r\u0000\u0003\u0001㘮㘮\u0000\u0006\u0002\b\u000b\u0007", android.graphics.Color.alpha(0) + 12, objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onCodeRequired(new util.h.xy.ap.ma(util.h.xy.ca.b.getInputSizeshNQ4ISI(util.h.xy.ca.b.this)));
                                int i = getInputSizeshNQ4ISI + 39;
                                getHighSpeedVideoSizesFor = i % 128;
                                if (i % 2 != 0) {
                                    throw null;
                                }
                            }
                        });
                    } else {
                        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.20.3
                            private static int getHighSpeedVideoFpsRanges = 1;
                            private static int getHighSpeedVideoSizes;

                            @Override // java.lang.Runnable
                            public final void run() {
                                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 91) % 128;
                                util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this, bArr, util.h.xy.at.ma.m25117(), (byte[]) null, (byte[]) null);
                                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 103) % 128;
                            }
                        }).start();
                    }
                }
            }
        }
    };
    private util.h.xy.ca.ma ArtificialStackFrames = new util.h.xy.ca.ma();

    public interface ra {
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Object[] objArr) {
        int i;
        char[] cArr = new char[1];
        if (Camera2StreamConfigurationMap == null) {
            int i2 = getOutputMinFrameDuration;
            int i3 = i2 + 39;
            getOutputSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            getOutputSizes = (i2 + 103) % 128;
            i = 718;
        } else {
            i = 715;
        }
        cArr[0] = (char) i;
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: util.h.xy.ca.b$6, reason: invalid class name */
    final class AnonymousClass6 implements java.lang.Runnable {
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizesFor = 1;
        private static long getOutputFormats = 4792854485451567033L;
        final /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoSizes;

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
                aVar.f2623++;
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        AnonymousClass6(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
            this.getHighSpeedVideoSizes = provisioningServiceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.String intern;
            java.lang.Object obj;
            int i = getHighSpeedVideoSizesFor + 47;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                if (util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this) != null) {
                    int i2 = getHighSpeedVideoSizesFor + 75;
                    getHighSpeedVideoFpsRanges = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("쟝작ꚣ矄ㅢ昚墯ꃪ", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                        intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("獁猑缿鉩\ue8ecʯⵀ봘쐲ᵪ〻\ue088쿧벺囷", -(android.widget.ExpandableListView.getPackedPositionForChild(1, 1) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(1, 1) == 0L ? 0 : -1)), objArr2);
                        obj = objArr2[0];
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("쟝작ꚣ矄ㅢ昚墯ꃪ", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr3);
                        intern = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("獁猑缿鉩\ue8ecʯⵀ봘쐲ᵪ〻\ue088쿧벺囷", -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
                        obj = objArr4[0];
                    }
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onError(this.getHighSpeedVideoSizes);
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 115) % 128;
                    return;
                }
                return;
            }
            util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this);
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 41) % 128;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 21) % 128;
        objArr[0] = str;
    }

    static /* synthetic */ int Camera2StreamConfigurationMap() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputMinFrameDuration + 23;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            getOutputMinFrameDuration();
            throw null;
        }
        int outputMinFrameDuration = getOutputMinFrameDuration();
        getOutputMinFrameDuration = (getOutputSizes + 45) % 128;
        return outputMinFrameDuration;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener Camera2StreamConfigurationMap(util.h.xy.ca.b bVar) {
        int i = getOutputSizes + 81;
        getOutputMinFrameDuration = i % 128;
        com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener accessTokenListener = bVar._BOUNDARY;
        if (i % 2 == 0) {
            return accessTokenListener;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener) {
        int i = getOutputSizes;
        int i2 = i + 19;
        getOutputMinFrameDuration = i2 % 128;
        bVar.accessartificialFrame = enrollingServiceListener;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 63;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            return enrollingServiceListener;
        }
        throw null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, int i) {
        int i2 = getOutputSizes + 57;
        getOutputMinFrameDuration = i2 % 128;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
        bVar.getHighSpeedVideoSizes(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.DEVICE_SUSPICIOUS, 0, -1, null, util.h.xy.ar.b.m25093(i), hashMap));
        int i3 = getOutputSizes + 119;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        int i = getOutputMinFrameDuration + 71;
        getOutputSizes = i % 128;
        bVar.getHighSpeedVideoSizes(provisioningServiceError);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getOutputSizes + 93;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, final java.lang.String str, final int i) {
        getOutputMinFrameDuration = (getOutputSizes + 125) % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.9
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int[] getHighSpeedVideoSizesFor = {595676662, 1529420463, -656514763, -43672611, 1509770841, 249119316, -611213985, 439012720, -9535233, 422756253, -286710318, 810693078, 1840602403, 2066366896, -1641871513, 2001434019, 646074380, -2082823697};
            private static int getOutputFormats = 0;
            private static int getOutputMinFrameDuration = 1;

            private static void Camera2StreamConfigurationMap(int[] iArr, int i2, java.lang.Object[] objArr) {
                int i3;
                int length;
                int[] iArr2;
                int i4;
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = getHighSpeedVideoSizesFor;
                if (iArr3 != null) {
                    int i5 = Camera2StreamConfigurationMap + 81;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    if (i5 % 2 != 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i4 = 1;
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        iArr2[i4] = (int) (iArr3[i4] ^ (-5569649899877129369L));
                        i4++;
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = getHighSpeedVideoSizesFor;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 13) % 128;
                    int i6 = 0;
                    while (i6 < length3) {
                        iArr6[i6] = (int) (iArr5[i6] ^ (-5569649899877129369L));
                        i6++;
                        length2 = length2;
                    }
                    i3 = length2;
                    iArr5 = iArr6;
                } else {
                    i3 = length2;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, i3);
                cVar.f2626 = 0;
                while (cVar.f2626 < iArr.length) {
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr4);
                    for (int i7 = 0; i7 < 16; i7++) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 15) % 128;
                        cVar.f2627 ^= iArr4[i7];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i8 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i8;
                    }
                    int i9 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i9;
                    cVar.f2625 ^= iArr4[16];
                    cVar.f2627 ^= iArr4[17];
                    int i10 = cVar.f2627;
                    int i11 = cVar.f2625;
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
                objArr[0] = new java.lang.String(cArr2, 0, i2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (getOutputFormats + 87) % 128;
                if (util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this) != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.DEVICE_SUSPICIOUS, 0, -1, null, null, hashMap);
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{71225447, -1624229170}, 5 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{1425142752, -1216708706, 1480127682, 173158634, 1571159759, 1687259864}, 11 - android.graphics.Color.blue(0), objArr2);
                    util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                    util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this).onError(str, provisioningServiceError);
                    getOutputMinFrameDuration = (getOutputFormats + 79) % 128;
                }
            }
        });
        int i2 = getOutputSizes;
        getOutputMinFrameDuration = (i2 + 35) % 128;
        int i3 = i2 + 29;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes, java.lang.String str2) {
        int i = getOutputMinFrameDuration + 31;
        getOutputSizes = i % 128;
        bVar.getHighSpeedVideoSizes(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, str, str2, null));
        getOutputMinFrameDuration = (getOutputSizes + 23) % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        int i = getOutputSizes + 121;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.10
            private static int Camera2StreamConfigurationMap = 0;
            private static int getInputFormats = 1;
            private static int getOutputFormats = 0;
            private static int getOutputMinFrameDuration = 1;
            private static char[] getHighSpeedVideoSizesFor = {41868, 41877, 41887, 41872};
            private static char getInputSizeshNQ4ISI = 38468;

            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                getOutputMinFrameDuration = (getOutputFormats + 93) % 128;
                if (util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this) != null) {
                    getOutputMinFrameDuration = (getOutputFormats + 23) % 128;
                    char capsMode = (byte) (android.text.TextUtils.getCapsMode("", 0, 0) + 19);
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                    int i3 = 4 - offsetBefore;
                    char[] charArray = "\u0002\u0001\u0000\u0003".toCharArray();
                    util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                    char[] cArr = getHighSpeedVideoSizesFor;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        Camera2StreamConfigurationMap = (getInputFormats + 33) % 128;
                        int i4 = 0;
                        while (i4 < length) {
                            int i5 = getInputFormats + 101;
                            Camera2StreamConfigurationMap = i5 % 128;
                            if (i5 % 2 != 0) {
                                cArr2[i4] = (char) (cArr[i4] + 4042185467053315654L);
                                i4--;
                            } else {
                                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
                                i4++;
                            }
                        }
                        cArr = cArr2;
                    }
                    char c = (char) (4042185467053315654L ^ getInputSizeshNQ4ISI);
                    char[] cArr3 = new char[i3];
                    if (i3 % 2 != 0) {
                        int i6 = Camera2StreamConfigurationMap;
                        int i7 = i6 + 51;
                        getInputFormats = i7 % 128;
                        if (i7 % 2 == 0) {
                            i2 = 10 - offsetBefore;
                            cArr3[i2] = (char) (charArray[i2] >> capsMode);
                        } else {
                            i2 = 3 - offsetBefore;
                            cArr3[i2] = (char) (charArray[i2] - capsMode);
                        }
                        getInputFormats = (i6 + 89) % 128;
                    } else {
                        i2 = i3;
                    }
                    if (i2 > 1) {
                        Camera2StreamConfigurationMap = (getInputFormats + 45) % 128;
                        mcVar.f2638 = 0;
                        while (mcVar.f2638 < i2) {
                            mcVar.f2641 = charArray[mcVar.f2638];
                            mcVar.f2636 = charArray[mcVar.f2638 + 1];
                            if (mcVar.f2641 == mcVar.f2636) {
                                cArr3[mcVar.f2638] = (char) (mcVar.f2641 - capsMode);
                                cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - capsMode);
                            } else {
                                mcVar.f2639 = mcVar.f2641 / c;
                                mcVar.f2640 = mcVar.f2641 % c;
                                mcVar.f2637 = mcVar.f2636 / c;
                                mcVar.f2635 = mcVar.f2636 % c;
                                if (mcVar.f2640 == mcVar.f2635) {
                                    mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                    mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                    int i8 = mcVar.f2639;
                                    int i9 = mcVar.f2640;
                                    int i10 = mcVar.f2637;
                                    int i11 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                                } else if (mcVar.f2639 == mcVar.f2637) {
                                    Camera2StreamConfigurationMap = (getInputFormats + 81) % 128;
                                    mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                    mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                    int i12 = mcVar.f2639;
                                    int i13 = mcVar.f2640;
                                    int i14 = mcVar.f2637;
                                    int i15 = mcVar.f2635;
                                    cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                                } else {
                                    int i16 = mcVar.f2639;
                                    int i17 = mcVar.f2635;
                                    int i18 = mcVar.f2637;
                                    int i19 = mcVar.f2640;
                                    cArr3[mcVar.f2638] = cArr[(i16 * c) + i17];
                                    cArr3[mcVar.f2638 + 1] = cArr[(i18 * c) + i19];
                                }
                            }
                            mcVar.f2638 += 2;
                        }
                    }
                    for (int i20 = 0; i20 < i3; i20++) {
                        cArr3[i20] = (char) (cArr3[i20] ^ 13722);
                    }
                    util.h.xy.am.ma.m25027(new java.lang.String(cArr3).intern(), str3);
                    util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this).onSuccess(str, str2);
                    getOutputFormats = (getOutputMinFrameDuration + 43) % 128;
                }
            }
        });
        int i2 = (getOutputMinFrameDuration + 121) % 128;
        getOutputSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        getOutputMinFrameDuration = (i2 + 43) % 128;
    }

    static /* synthetic */ byte[] Camera2StreamConfigurationMap(util.h.xy.ca.b bVar, byte[] bArr) {
        int i = getOutputSizes;
        int i2 = i + 125;
        getOutputMinFrameDuration = i2 % 128;
        bVar.isOutputSupportedFor = bArr;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i + 47;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener accessTokenListener) {
        int i = (getOutputSizes + 61) % 128;
        getOutputMinFrameDuration = i;
        bVar._BOUNDARY = accessTokenListener;
        int i2 = i + 119;
        getOutputSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return accessTokenListener;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b bVar) {
        int i = getOutputMinFrameDuration;
        getOutputSizes = (i + 97) % 128;
        com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener = bVar.coroutineBoundary;
        getOutputSizes = (i + 53) % 128;
        return pushServiceListener;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType provisioningServiceCodeType) {
        int i = (getOutputSizes + 25) % 128;
        getOutputMinFrameDuration = i;
        bVar.toString = provisioningServiceCodeType;
        int i2 = i + 43;
        getOutputSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return provisioningServiceCodeType;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b bVar, java.lang.String str) {
        int i = getOutputSizes + 39;
        getOutputMinFrameDuration = i % 128;
        bVar.Camera2StreamConfigurationMap(str);
        if (i % 2 != 0) {
            throw null;
        }
        getOutputMinFrameDuration = (getOutputSizes + 7) % 128;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b bVar, java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError, java.lang.String str2) {
        int i = getOutputMinFrameDuration + 39;
        getOutputSizes = i % 128;
        bVar.Camera2StreamConfigurationMap(str, provisioningServiceError, str2);
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb A[Catch: all -> 0x03af, InternalComponentException -> 0x03b1, TryCatch #7 {InternalComponentException -> 0x03b1, all -> 0x03af, blocks: (B:11:0x0034, B:12:0x0038, B:13:0x003b, B:15:0x003c, B:19:0x0059, B:21:0x005f, B:23:0x0068, B:24:0x00ad, B:32:0x00b1, B:34:0x00b9, B:38:0x00f2, B:40:0x00fc, B:44:0x0103, B:48:0x0129, B:49:0x0141, B:50:0x015d, B:52:0x0166, B:54:0x01cc, B:56:0x01d8, B:58:0x01eb, B:59:0x0203, B:60:0x01ef, B:61:0x01dd, B:62:0x020e, B:64:0x0260, B:66:0x0275, B:69:0x029f, B:71:0x02fb, B:72:0x0302, B:74:0x0311, B:77:0x0339, B:82:0x033b, B:84:0x0341, B:85:0x0342, B:86:0x027f, B:88:0x0343, B:89:0x0348, B:90:0x0349, B:91:0x035b, B:92:0x035e, B:93:0x0371, B:94:0x0379, B:95:0x037a), top: B:5:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ef A[Catch: all -> 0x03af, InternalComponentException -> 0x03b1, TryCatch #7 {InternalComponentException -> 0x03b1, all -> 0x03af, blocks: (B:11:0x0034, B:12:0x0038, B:13:0x003b, B:15:0x003c, B:19:0x0059, B:21:0x005f, B:23:0x0068, B:24:0x00ad, B:32:0x00b1, B:34:0x00b9, B:38:0x00f2, B:40:0x00fc, B:44:0x0103, B:48:0x0129, B:49:0x0141, B:50:0x015d, B:52:0x0166, B:54:0x01cc, B:56:0x01d8, B:58:0x01eb, B:59:0x0203, B:60:0x01ef, B:61:0x01dd, B:62:0x020e, B:64:0x0260, B:66:0x0275, B:69:0x029f, B:71:0x02fb, B:72:0x0302, B:74:0x0311, B:77:0x0339, B:82:0x033b, B:84:0x0341, B:85:0x0342, B:86:0x027f, B:88:0x0343, B:89:0x0348, B:90:0x0349, B:91:0x035b, B:92:0x035e, B:93:0x0371, B:94:0x0379, B:95:0x037a), top: B:5:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b bVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5;
        byte[] bArr6;
        byte[] m25010;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709;
        int i;
        int i2;
        int fadingEdgeLength;
        int i3;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25706;
        int i4 = getOutputSizes + 59;
        getOutputMinFrameDuration = i4 % 128;
        try {
            byte[] m25009 = util.h.xy.al.mb.m25009(true, bArr, bArr2);
            m25010 = util.h.xy.al.mb.m25010(true, bArr, bArr2);
            bArr6 = util.h.xy.ar.b.m25089(m25009, bArr2);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e = e;
            bArr6 = null;
        } catch (java.lang.Throwable th) {
            th = th;
            bArr5 = null;
            bArr6 = bArr5;
            util.h.xy.ar.b.m25095(bArr6);
            util.h.xy.ar.b.m25100(bArr, bArr2);
            util.h.xy.ar.b.m25100(bArr3, bArr4);
            util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
            throw th;
        }
        try {
            if (bArr3 != null) {
                int i5 = getOutputMinFrameDuration;
                getOutputSizes = (i5 + 79) % 128;
                if (bArr4 != null) {
                    int i6 = i5 + 121;
                    getOutputSizes = i6 % 128;
                    if (i6 % 2 == 0) {
                        util.h.xy.ar.b.m25089(bArr3, bArr4);
                        throw null;
                    }
                    util.h.xy.ar.b.m25089(bArr3, bArr4);
                }
            }
            m25709 = new util.h.xy.bv.mh(bArr6, util.h.xy.t.mb.f2417.m27415()).m25709();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            e = e2;
            try {
                util.h.xy.cg.ra.m25918(e);
                util.h.xy.ar.b.m25095(bArr6);
                util.h.xy.ar.b.m25100(bArr, bArr2);
                util.h.xy.ar.b.m25100(bArr3, bArr4);
                util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
                if (i4 % 2 != 0) {
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bArr5 = bArr6;
                bArr6 = bArr5;
                util.h.xy.ar.b.m25095(bArr6);
                util.h.xy.ar.b.m25100(bArr, bArr2);
                util.h.xy.ar.b.m25100(bArr3, bArr4);
                util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            util.h.xy.ar.b.m25095(bArr6);
            util.h.xy.ar.b.m25100(bArr, bArr2);
            util.h.xy.ar.b.m25100(bArr3, bArr4);
            util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
            throw th;
        }
        if (m25709 != null) {
            int i7 = getOutputSizes + 105;
            getOutputMinFrameDuration = i7 % 128;
            if (i7 % 2 != 0) {
                m25709.isSuccessful();
                throw new java.lang.NullPointerException();
            }
            if (m25709.isSuccessful()) {
                util.h.xy.bv.rb result = m25709.getResult();
                if (result == null) {
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                    int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(20 - (pressedStateDuration >> 16), (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr);
                    util.h.xy.ag.a.m24556().m24557(bVar.new AnonymousClass6(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr[0]).intern(), null)));
                    i = (getOutputSizes + 23) % 128;
                } else if (result.m25745() == util.h.xy.bv.rb.ra.f1061) {
                    util.h.xy.ag.a.m24556().m24557(bVar.new AnonymousClass6(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, result.m25751(), result.m25749(), null, result.m25742(), result.m25750())));
                    i = (getOutputSizes + 23) % 128;
                } else {
                    if (result instanceof util.h.xy.bv.h) {
                        getOutputSizes = (getOutputMinFrameDuration + 15) % 128;
                        util.h.xy.bv.h hVar = (util.h.xy.bv.h) result;
                        if (hVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
                            if (hVar.m25694() != null) {
                                try {
                                    util.h.xy.cg.b.m25907().m25912(new java.lang.String(m25010), hVar.m25694(), hVar.m25696());
                                    if (hVar.m25696() != null) {
                                        int i8 = getOutputSizes + 41;
                                        getOutputMinFrameDuration = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            util.h.xy.cg.b.m25907().m25912(util.h.xy.cg.b.m25907().m25908(m25010), hVar.m25694(), hVar.m25696());
                                            throw new java.lang.NullPointerException();
                                        }
                                        util.h.xy.cg.b.m25907().m25912(util.h.xy.cg.b.m25907().m25908(m25010), hVar.m25694(), hVar.m25696());
                                    }
                                    getOutputSizes = (getOutputMinFrameDuration + 19) % 128;
                                    java.lang.String m25694 = hVar.m25694();
                                    java.lang.String m25696 = hVar.m25696();
                                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(resolveOpacity + 4, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 628, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43260), objArr2);
                                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(indexOf + 7, 1109 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (14635 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr3);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                    util.h.xy.bv.ma maVar = new util.h.xy.bv.ma(util.h.xy.ag.a.m24556().m24558());
                                    if (m25696 != null) {
                                        int i9 = getOutputMinFrameDuration + 61;
                                        getOutputSizes = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            m25706 = maVar.m25705(m25010, m25694, m25696);
                                            if (m25706 == null) {
                                                bVar.getHighSpeedVideoFpsRangesFor(m25706);
                                            } else {
                                                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.2
                                                    private static int Camera2StreamConfigurationMap = 1;
                                                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                                    private static char getHighSpeedVideoFpsRangesFor = 13130;
                                                    private static int getHighSpeedVideoSizes = 0;
                                                    private static long getHighSpeedVideoSizesFor = 8820508564872421770L;
                                                    private static int getInputFormats = 294925130;
                                                    private static int getOutputFormats;

                                                    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i10, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr4) {
                                                        int i11 = (getHighSpeedVideoSizes + 53) % 128;
                                                        Camera2StreamConfigurationMap = i11;
                                                        getHighSpeedVideoSizes = (i11 + 89) % 128;
                                                        char[] charArray = str3.toCharArray();
                                                        int i12 = getHighSpeedVideoSizes + 51;
                                                        Camera2StreamConfigurationMap = i12 % 128;
                                                        if (i12 % 2 == 0) {
                                                            throw null;
                                                        }
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
                                                        cArr2[2] = (char) (cArr2[2] + ((char) i10));
                                                        int length3 = charArray3.length;
                                                        char[] cArr3 = new char[length3];
                                                        rcVar.f2652 = 0;
                                                        while (rcVar.f2652 < length3) {
                                                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
                                                            int i13 = (rcVar.f2652 + 2) % 4;
                                                            int i14 = (rcVar.f2652 + 3) % 4;
                                                            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i13]) % 65535);
                                                            cArr2[i14] = (char) (((cArr[i14] * 32718) + cArr2[i13]) / 65535);
                                                            cArr[i14] = rcVar.f2653;
                                                            cArr3[rcVar.f2652] = (char) ((((cArr[i14] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getInputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
                                                            rcVar.f2652++;
                                                        }
                                                        java.lang.String str4 = new java.lang.String(cArr3);
                                                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 15) % 128;
                                                        objArr4[0] = str4;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                        Camera2StreamConfigurationMap("㐤ᗪ∬桟", (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 500), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "潻ꥍ\uf47eࠁ", "틀鈖읤塲", objArr4);
                                                        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                        Camera2StreamConfigurationMap("鲠롅㒡醓ㅎ皱稕ㄖ낧ਯ腅", (char) android.text.TextUtils.indexOf("", "", 0, 0), (-507251686) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u197b쏴ዡ鵲", "틀鈖읤塲", objArr5);
                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                                                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onComplete();
                                                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
                                                    }
                                                });
                                                getOutputSizes = (getOutputMinFrameDuration + 65) % 128;
                                            }
                                            util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1057);
                                        }
                                    }
                                    m25706 = maVar.m25706(m25010, m25694);
                                    getOutputSizes = (getOutputMinFrameDuration + 109) % 128;
                                    if (m25706 == null) {
                                    }
                                    util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1057);
                                } catch (java.lang.Exception unused) {
                                    util.h.xy.cg.b.m25907().m25911(new java.lang.String(m25010));
                                    java.lang.String m256942 = hVar.m25694();
                                    java.util.HashMap hashMap = new java.util.HashMap();
                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
                                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 45, android.graphics.Color.red(0) + 1122, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, -1, m256942, ((java.lang.String) objArr4[0]).intern(), hashMap);
                                    int i10 = getOutputMinFrameDuration + 55;
                                    int i11 = i10 % 128;
                                    getOutputSizes = i11;
                                    if (i10 % 2 == 0) {
                                        throw new java.lang.NullPointerException();
                                    }
                                    getOutputMinFrameDuration = (i11 + 117) % 128;
                                    provisioningServiceError.getErrorMessage();
                                    int i12 = getOutputMinFrameDuration + 109;
                                    getOutputSizes = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        fadingEdgeLength = 4 % (android.view.ViewConfiguration.getFadingEdgeLength() >>> 84);
                                        i3 = 29150;
                                    } else {
                                        fadingEdgeLength = 4 + (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                        i3 = 629;
                                    }
                                    try {
                                        long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(fadingEdgeLength, i3 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), (char) (43261 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr5);
                                        java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                                        int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int blue = android.graphics.Color.blue(0);
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(indexOf2 + 8, blue + 1115, (char) (48690 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr6);
                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                                        com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager cardLifeCycleManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager();
                                        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                                        cardLifeCycleManager.deleteCard(new java.lang.String(m25010, java.nio.charset.StandardCharsets.UTF_8), new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: util.h.xy.ca.b.4
                                            private static int Camera2StreamConfigurationMap = 1;
                                            private static char[] getHighResolutionOutputSizeshNQ4ISI = {42364, 42267, 42257, 42259, 42277, 42419, 42374, 42375, 42424, 42379, 42377, 42370, 42427, 42426, 42455, 42073, 42078, 42067, 42402, 42400, 42069, 42066, 42061, 42071};
                                            private static int getHighSpeedVideoFpsRangesFor = 0;
                                            private static int getInputFormats = 0;
                                            private static int getOutputFormats = 1;

                                            private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr7) {
                                                int i13;
                                                int i14;
                                                int i15 = getHighSpeedVideoFpsRangesFor + 81;
                                                int i16 = i15 % 128;
                                                Camera2StreamConfigurationMap = i16;
                                                if (i15 % 2 == 0) {
                                                    throw null;
                                                }
                                                getHighSpeedVideoFpsRangesFor = (i16 + 55) % 128;
                                                byte[] bytes = str.getBytes("ISO-8859-1");
                                                util.h.xz.b.ma maVar2 = new util.h.xz.b.ma();
                                                int i17 = iArr[0];
                                                int i18 = iArr[1];
                                                int i19 = iArr[2];
                                                int i20 = iArr[3];
                                                char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
                                                if (cArr != null) {
                                                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 35) % 128;
                                                    int length = cArr.length;
                                                    char[] cArr2 = new char[length];
                                                    int i21 = 0;
                                                    while (i21 < length) {
                                                        int i22 = getHighSpeedVideoFpsRangesFor + 13;
                                                        Camera2StreamConfigurationMap = i22 % 128;
                                                        if (i22 % 2 == 0) {
                                                            i14 = i20;
                                                            cArr2[i21] = (char) (cArr[i21] & (-8125198844289309347L));
                                                        } else {
                                                            i14 = i20;
                                                            cArr2[i21] = (char) (cArr[i21] ^ (-8125198844289309347L));
                                                            i21++;
                                                        }
                                                        i20 = i14;
                                                    }
                                                    i13 = i20;
                                                    cArr = cArr2;
                                                } else {
                                                    i13 = i20;
                                                }
                                                char[] cArr3 = new char[i18];
                                                java.lang.System.arraycopy(cArr, i17, cArr3, 0, i18);
                                                if (bytes != null) {
                                                    char[] cArr4 = new char[i18];
                                                    maVar2.f2631 = 0;
                                                    char c = 0;
                                                    while (maVar2.f2631 < i18) {
                                                        int i23 = getHighSpeedVideoFpsRangesFor + 115;
                                                        Camera2StreamConfigurationMap = i23 % 128;
                                                        if (i23 % 2 != 0 ? bytes[maVar2.f2631] != 1 : bytes[maVar2.f2631] != 1) {
                                                            cArr4[maVar2.f2631] = (char) ((cArr3[maVar2.f2631] * 2) - c);
                                                        } else {
                                                            cArr4[maVar2.f2631] = (char) (((cArr3[maVar2.f2631] * 2) + 1) - c);
                                                        }
                                                        c = cArr4[maVar2.f2631];
                                                        maVar2.f2631++;
                                                    }
                                                    cArr3 = cArr4;
                                                }
                                                if (i13 > 0) {
                                                    char[] cArr5 = new char[i18];
                                                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i18);
                                                    int i24 = i18 - i13;
                                                    int i25 = i13;
                                                    java.lang.System.arraycopy(cArr5, 0, cArr3, i24, i25);
                                                    java.lang.System.arraycopy(cArr5, i25, cArr3, 0, i24);
                                                }
                                                if (z) {
                                                    char[] cArr6 = new char[i18];
                                                    maVar2.f2631 = 0;
                                                    while (maVar2.f2631 < i18) {
                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 3) % 128;
                                                        cArr6[maVar2.f2631] = cArr3[(i18 - maVar2.f2631) - 1];
                                                        maVar2.f2631++;
                                                    }
                                                    cArr3 = cArr6;
                                                }
                                                if (i19 > 0) {
                                                    maVar2.f2631 = 0;
                                                    while (maVar2.f2631 < i18) {
                                                        cArr3[maVar2.f2631] = (char) (cArr3[maVar2.f2631] - iArr[2]);
                                                        maVar2.f2631++;
                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                                                    }
                                                }
                                                objArr7[0] = new java.lang.String(cArr3);
                                            }

                                            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
                                            public final void onSuccess(java.lang.String str) {
                                                java.lang.String intern3;
                                                java.lang.Object obj;
                                                int i13 = getOutputFormats + 67;
                                                getInputFormats = i13 % 128;
                                                if (i13 % 2 != 0) {
                                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr7);
                                                    intern3 = ((java.lang.String) objArr7[0]).intern();
                                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(false, new int[]{4, 10, 157, 0}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr8);
                                                    obj = objArr8[0];
                                                } else {
                                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr9);
                                                    intern3 = ((java.lang.String) objArr9[0]).intern();
                                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(true, new int[]{4, 10, 157, 0}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr10);
                                                    obj = objArr10[0];
                                                }
                                                util.h.xy.am.ma.m25027(intern3, ((java.lang.String) obj).intern());
                                                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                                                countDownLatch.countDown();
                                                getInputFormats = (getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                            }

                                            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
                                            public final void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
                                                getInputFormats = (getOutputFormats + 67) % 128;
                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr7);
                                                java.lang.String intern3 = ((java.lang.String) objArr7[0]).intern();
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap(true, new int[]{14, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 9}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr8);
                                                util.h.xy.am.ma.m25029(intern3, ((java.lang.String) objArr8[0]).intern());
                                                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                                                countDownLatch.countDown();
                                                getInputFormats = (getOutputFormats + 29) % 128;
                                            }
                                        });
                                        try {
                                            countDownLatch.await(30L, java.util.concurrent.TimeUnit.SECONDS);
                                        } catch (java.lang.InterruptedException unused2) {
                                        }
                                        bVar.getHighSpeedVideoFpsRangesFor(provisioningServiceError);
                                        int i13 = getOutputMinFrameDuration + 73;
                                        getOutputSizes = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            throw null;
                                        }
                                        util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1057);
                                        util.h.xy.ar.b.m25095(bArr6);
                                        util.h.xy.ar.b.m25100(bArr, bArr2);
                                        util.h.xy.ar.b.m25100(bArr3, bArr4);
                                        util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause = th4.getCause();
                                        if (cause == null) {
                                            throw th4;
                                        }
                                        throw cause;
                                    }
                                }
                            } else {
                                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.2
                                    private static int Camera2StreamConfigurationMap = 1;
                                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                    private static char getHighSpeedVideoFpsRangesFor = 13130;
                                    private static int getHighSpeedVideoSizes = 0;
                                    private static long getHighSpeedVideoSizesFor = 8820508564872421770L;
                                    private static int getInputFormats = 294925130;
                                    private static int getOutputFormats;

                                    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i102, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr42) {
                                        int i112 = (getHighSpeedVideoSizes + 53) % 128;
                                        Camera2StreamConfigurationMap = i112;
                                        getHighSpeedVideoSizes = (i112 + 89) % 128;
                                        char[] charArray = str3.toCharArray();
                                        int i122 = getHighSpeedVideoSizes + 51;
                                        Camera2StreamConfigurationMap = i122 % 128;
                                        if (i122 % 2 == 0) {
                                            throw null;
                                        }
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
                                        cArr2[2] = (char) (cArr2[2] + ((char) i102));
                                        int length3 = charArray3.length;
                                        char[] cArr3 = new char[length3];
                                        rcVar.f2652 = 0;
                                        while (rcVar.f2652 < length3) {
                                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
                                            int i132 = (rcVar.f2652 + 2) % 4;
                                            int i14 = (rcVar.f2652 + 3) % 4;
                                            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i132]) % 65535);
                                            cArr2[i14] = (char) (((cArr[i14] * 32718) + cArr2[i132]) / 65535);
                                            cArr[i14] = rcVar.f2653;
                                            cArr3[rcVar.f2652] = (char) ((((cArr[i14] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getInputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
                                            rcVar.f2652++;
                                        }
                                        java.lang.String str4 = new java.lang.String(cArr3);
                                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 15) % 128;
                                        objArr42[0] = str4;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("㐤ᗪ∬桟", (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 500), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "潻ꥍ\uf47eࠁ", "틀鈖읤塲", objArr42);
                                        java.lang.String intern22 = ((java.lang.String) objArr42[0]).intern();
                                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("鲠롅㒡醓ㅎ皱稕ㄖ낧ਯ腅", (char) android.text.TextUtils.indexOf("", "", 0, 0), (-507251686) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u197b쏴ዡ鵲", "틀鈖읤塲", objArr52);
                                        util.h.xy.am.ma.m25027(intern22, ((java.lang.String) objArr52[0]).intern());
                                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onComplete();
                                        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
                                    }
                                });
                                i2 = (getOutputMinFrameDuration + 65) % 128;
                            }
                        }
                        util.h.xy.ar.b.m25095(bArr6);
                        util.h.xy.ar.b.m25100(bArr, bArr2);
                        util.h.xy.ar.b.m25100(bArr3, bArr4);
                        util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        getOutputSizes = (getOutputMinFrameDuration + 117) % 128;
                        return;
                    }
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.2
                        private static int Camera2StreamConfigurationMap = 1;
                        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                        private static char getHighSpeedVideoFpsRangesFor = 13130;
                        private static int getHighSpeedVideoSizes = 0;
                        private static long getHighSpeedVideoSizesFor = 8820508564872421770L;
                        private static int getInputFormats = 294925130;
                        private static int getOutputFormats;

                        private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i102, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr42) {
                            int i112 = (getHighSpeedVideoSizes + 53) % 128;
                            Camera2StreamConfigurationMap = i112;
                            getHighSpeedVideoSizes = (i112 + 89) % 128;
                            char[] charArray = str3.toCharArray();
                            int i122 = getHighSpeedVideoSizes + 51;
                            Camera2StreamConfigurationMap = i122 % 128;
                            if (i122 % 2 == 0) {
                                throw null;
                            }
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
                            cArr2[2] = (char) (cArr2[2] + ((char) i102));
                            int length3 = charArray3.length;
                            char[] cArr3 = new char[length3];
                            rcVar.f2652 = 0;
                            while (rcVar.f2652 < length3) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
                                int i132 = (rcVar.f2652 + 2) % 4;
                                int i14 = (rcVar.f2652 + 3) % 4;
                                rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i132]) % 65535);
                                cArr2[i14] = (char) (((cArr[i14] * 32718) + cArr2[i132]) / 65535);
                                cArr[i14] = rcVar.f2653;
                                cArr3[rcVar.f2652] = (char) ((((cArr[i14] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getInputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
                                rcVar.f2652++;
                            }
                            java.lang.String str4 = new java.lang.String(cArr3);
                            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 15) % 128;
                            objArr42[0] = str4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("㐤ᗪ∬桟", (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 500), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "潻ꥍ\uf47eࠁ", "틀鈖읤塲", objArr42);
                            java.lang.String intern22 = ((java.lang.String) objArr42[0]).intern();
                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("鲠롅㒡醓ㅎ皱稕ㄖ낧ਯ腅", (char) android.text.TextUtils.indexOf("", "", 0, 0), (-507251686) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u197b쏴ዡ鵲", "틀鈖읤塲", objArr52);
                            util.h.xy.am.ma.m25027(intern22, ((java.lang.String) objArr52[0]).intern());
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onComplete();
                            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
                        }
                    });
                    i2 = (getOutputMinFrameDuration + 65) % 128;
                    getOutputSizes = i2;
                    util.h.xy.ar.b.m25095(bArr6);
                    util.h.xy.ar.b.m25100(bArr, bArr2);
                    util.h.xy.ar.b.m25100(bArr3, bArr4);
                    util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
                    if (i4 % 2 != 0) {
                    }
                }
                getOutputMinFrameDuration = i;
                util.h.xy.ar.b.m25095(bArr6);
                util.h.xy.ar.b.m25100(bArr, bArr2);
                util.h.xy.ar.b.m25100(bArr3, bArr4);
                util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
                if (i4 % 2 != 0) {
                }
            }
        }
        util.h.xy.ag.a.m24556().m24557(bVar.new AnonymousClass6(util.h.xy.cg.ra.m25922(m25709)));
        i = (getOutputSizes + 23) % 128;
        getOutputMinFrameDuration = i;
        util.h.xy.ar.b.m25095(bArr6);
        util.h.xy.ar.b.m25100(bArr, bArr2);
        util.h.xy.ar.b.m25100(bArr3, bArr4);
        util.h.xy.ar.b.m25100(bVar.isOutputSupportedFor, bVar.getValidOutputFormatsForInputhNQ4ISI);
        if (i4 % 2 != 0) {
        }
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener getHighSpeedVideoFpsRanges(util.h.xy.ca.b bVar) {
        int i = getOutputMinFrameDuration;
        getOutputSizes = (i + 51) % 128;
        com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener = bVar.accessartificialFrame;
        int i2 = i + 67;
        getOutputSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return enrollingServiceListener;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = getOutputSizes + 79;
        getOutputMinFrameDuration = i % 128;
        java.lang.String str = getInputSizeshNQ4ISI;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b bVar, java.lang.String str, boolean z, boolean z2) {
        getOutputMinFrameDuration = (getOutputSizes + 11) % 128;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoFpsRangesFor = bVar.getHighSpeedVideoFpsRangesFor(str, z, z2);
        getOutputSizes = (getOutputMinFrameDuration + 51) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        int i = (getOutputMinFrameDuration + 57) % 128;
        getOutputSizes = i;
        bVar.unwrapAs = provisioningServicePinType;
        getOutputMinFrameDuration = (i + 11) % 128;
        return provisioningServicePinType;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (getOutputMinFrameDurationlomOqCM) {
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw null;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b bVar, int i) {
        getOutputSizes = (getOutputMinFrameDuration + 65) % 128;
        bVar.Camera2StreamConfigurationMap(i);
        int i2 = getOutputMinFrameDuration + 51;
        getOutputSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, boolean z) {
        getOutputSizes = (getOutputMinFrameDuration + 103) % 128;
        boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, z);
        int i = getOutputSizes + 3;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b bVar) {
        int i = getOutputMinFrameDuration + 91;
        int i2 = i % 128;
        getOutputSizes = i2;
        byte[] bArr = bVar.isOutputSupportedFor;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = i2 + 25;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener getHighSpeedVideoSizes(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        int i = getOutputSizes;
        getOutputMinFrameDuration = (i + 1) % 128;
        bVar.coroutineBoundary = pushServiceListener;
        int i2 = i + 51;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return pushServiceListener;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.ca.b bVar, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        int i = getOutputMinFrameDuration + 73;
        getOutputSizes = i % 128;
        util.h.xy.ag.a.m24556().m24557(bVar.new AnonymousClass6(provisioningServiceError));
        getOutputMinFrameDuration = (getOutputSizes + 23) % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ byte[] getHighSpeedVideoSizes(util.h.xy.ca.b bVar) {
        int i = getOutputSizes;
        getOutputMinFrameDuration = (i + 43) % 128;
        byte[] bArr = bVar.getValidOutputFormatsForInputhNQ4ISI;
        getOutputMinFrameDuration = (i + 5) % 128;
        return bArr;
    }

    static /* synthetic */ byte[] getHighSpeedVideoSizes(util.h.xy.ca.b bVar, byte[] bArr) {
        int i = getOutputSizes + 17;
        getOutputMinFrameDuration = i % 128;
        bVar.getValidOutputFormatsForInputhNQ4ISI = bArr;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizesFor(util.h.xy.ca.b bVar) {
        int i = (getOutputSizes + 11) % 128;
        getOutputMinFrameDuration = i;
        java.lang.String str = bVar._CREATION;
        getOutputSizes = (i + 39) % 128;
        return str;
    }

    static /* synthetic */ util.h.xy.at.mb getInputFormats(util.h.xy.ca.b bVar) {
        int i = getOutputSizes + 121;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.at.mb mbVar = bVar.isOutputSupportedForhNQ4ISI;
        if (i % 2 == 0) {
            return mbVar;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ util.h.xy.at.mb getInputSizeshNQ4ISI(util.h.xy.ca.b bVar) {
        int i = getOutputSizes + 13;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.at.mb mbVar = bVar.coroutineCreation;
        if (i % 2 == 0) {
            return mbVar;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType getOutputFormats(util.h.xy.ca.b bVar) {
        int i = (getOutputMinFrameDuration + 115) % 128;
        getOutputSizes = i;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType = bVar.unwrapAs;
        int i2 = i + 73;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return provisioningServicePinType;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ boolean getOutputMinFrameDuration(util.h.xy.ca.b bVar) {
        int i = getOutputMinFrameDuration;
        int i2 = i + 49;
        getOutputSizes = i2 % 128;
        bVar.CoroutineDebuggingKt = true;
        if (i2 % 2 == 0) {
            throw null;
        }
        getOutputSizes = (i + 31) % 128;
        return true;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor();
        getInputSizeshNQ4ISI = util.h.xy.ca.b.class.getName();
        f1088 = null;
        getOutputMinFrameDuration = (getOutputSizes + 5) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ca.b m25836(android.content.Context context) {
        util.h.xy.ca.b bVar;
        synchronized (util.h.xy.ca.b.class) {
            getOutputMinFrameDuration = (getOutputSizes + 45) % 128;
            if (f1088 == null) {
                f1088 = new util.h.xy.ca.b();
                int i = getOutputSizes + 11;
                getOutputMinFrameDuration = i % 128;
                int i2 = i % 2;
            }
            bVar = f1088;
        }
        return bVar;
    }

    private b() {
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void initialize() {
        int i;
        int i2;
        int i3 = getOutputSizes + 119;
        getOutputMinFrameDuration = i3 % 128;
        int i4 = i3 % 2 != 0 ? 4 : 3;
        try {
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            int i5 = (getOutputSizes + 33) % 128;
            getOutputMinFrameDuration = i5;
            int i6 = i5 + 119;
            getOutputSizes = i6 % 128;
            if (i6 % 2 == 0) {
                i = (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) * (-1);
                i2 = 3657;
            } else {
                i = (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1;
                i2 = 1559;
            }
            char intValue = (char) (i2 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue());
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(i4 + (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), i, intValue, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6, 4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.text.TextUtils.indexOf("", ""), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputStallDurationlomOqCM;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputStallDuration);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void reset() {
        getOutputMinFrameDuration = (getOutputSizes + 71) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(3 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1560), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 6, android.graphics.Color.green(0) + 10, (char) (51108 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = this._CREATION;
        if (str != null) {
            int i = getOutputMinFrameDuration + 89;
            getOutputSizes = i % 128;
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25095(str.getBytes());
            } else {
                util.h.xy.ar.b.m25095(str.getBytes());
                throw new java.lang.ArithmeticException();
            }
        }
        this.ArtificialStackFrames = new util.h.xy.ca.ma();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = false;
        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.ACTIVATION_CODE;
        this.unwrapAs = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE;
        this._BOUNDARY = null;
        this.coroutineBoundary = null;
        this.accessartificialFrame = null;
        this._CREATION = null;
        this.isOutputSupportedFor = null;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.CoroutineDebuggingKt = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0430 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0431  */
    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processIncomingMessage(android.os.Bundle bundle, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        java.lang.Object obj;
        int i;
        getOutputMinFrameDuration = (getOutputSizes + 97) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(4 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1561), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getMode(0) + 8, 16 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(4 - ((intValue + 20) >> 6), android.text.TextUtils.indexOf("", "", 0) + 628, (char) (43261 - android.graphics.Color.red(0)), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            if (bundle == null || pushServiceListener == null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 31, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 76, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 27733), objArr4);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
            }
            if (!bundle.isEmpty()) {
                if (util.h.xy.v.c.m27646().m27647()) {
                    try {
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(6 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 774, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr5);
                            java.lang.String string = bundle.getString(((java.lang.String) objArr5[0]).intern());
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(3 - android.graphics.Color.red(0), android.view.KeyEvent.normalizeMetaState(0) + 780, (char) (58482 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr6);
                            if (((java.lang.String) objArr6[0]).intern().equals(string)) {
                                try {
                                    int outputMinFrameDuration = getOutputMinFrameDuration();
                                    if (outputMinFrameDuration != -91) {
                                        this.coroutineBoundary = pushServiceListener;
                                        Camera2StreamConfigurationMap(outputMinFrameDuration);
                                    } else {
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, android.view.MotionEvent.axisFromString("") + 812, (char) (40120 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr7);
                                        java.lang.String string2 = bundle.getString(((java.lang.String) objArr7[0]).intern());
                                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                                        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
                                        getOutputSizes = (getOutputMinFrameDuration + 73) % 128;
                                        while (it.hasNext()) {
                                            int i2 = getOutputMinFrameDuration + 105;
                                            getOutputSizes = i2 % 128;
                                            if (i2 % 2 == 0) {
                                                java.lang.String next = it.next();
                                                jSONObject.put(next, org.json.JSONObject.wrap(bundle.get(next)));
                                                throw null;
                                            }
                                            java.lang.String next2 = it.next();
                                            jSONObject.put(next2, org.json.JSONObject.wrap(bundle.get(next2)));
                                        }
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage m25923 = util.h.xy.cg.ra.m25923(jSONObject);
                                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(13 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.getDefaultSize(0, 0) + 817, (char) (android.view.View.getDefaultSize(0, 0) + 39066), objArr8);
                                        if (!((java.lang.String) objArr8[0]).intern().equals(string2)) {
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(18 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 877, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr9);
                                            if (((java.lang.String) objArr9[0]).intern().equals(string2)) {
                                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", "") + 14, android.view.KeyEvent.normalizeMetaState(0) + 894, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
                                                java.lang.String string3 = bundle.getString(((java.lang.String) objArr10[0]).intern());
                                                if (string3 == null || string3.length() == 0) {
                                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                                                    java.lang.String str = this._CREATION;
                                                    try {
                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRanges(32 - android.view.View.combineMeasuredStates(0, 0), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 908, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr11);
                                                        pushServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, str, ((java.lang.String) objArr11[0]).intern(), null));
                                                    } catch (java.lang.Throwable th) {
                                                        java.lang.Throwable cause = th.getCause();
                                                        if (cause == null) {
                                                            throw th;
                                                        }
                                                        throw cause;
                                                    }
                                                }
                                                if (m25923 != null) {
                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTouchSlop() >> 8) + 11, 865 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr12);
                                                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr12[0]).intern());
                                                    pushServiceListener.onServerMessage(null, m25923);
                                                }
                                                util.h.xy.by.ma.f1067.m25805(string3.getBytes());
                                                m25838(string3, pushServiceListener);
                                            }
                                        } else if (m25923 == null) {
                                            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                                            java.lang.String str2 = this._CREATION;
                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 832, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr13);
                                            pushServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, 0, str2, ((java.lang.String) objArr13[0]).intern(), null));
                                        } else {
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 865 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr14);
                                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr14[0]).intern());
                                            pushServiceListener.onServerMessage(null, m25923);
                                        }
                                    }
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                    this.coroutineBoundary = pushServiceListener;
                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                    java.lang.String str3 = this._CREATION;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(28 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 783 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0), objArr15);
                                    sb.append(((java.lang.String) objArr15[0]).intern());
                                    sb.append(e.getMessage());
                                    getHighSpeedVideoSizes(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, 0, str3, sb.toString(), null));
                                }
                            } else {
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(11 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 743 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.blue(0), objArr16);
                                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr16[0]).intern());
                                pushServiceListener.onUnsupportedPushContent(bundle);
                            }
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                            e2.getMessage();
                        }
                    } catch (org.json.JSONException e3) {
                        e3.getMessage();
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetAfter("", 0) + 11, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 744, (char) android.view.View.MeasureSpec.getSize(0), objArr17);
                        obj = objArr17[0];
                    }
                } else {
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes4 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_NOT_INITIALIZED;
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(19 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), android.view.View.MeasureSpec.getSize(0) + 755, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50803), objArr18);
                    pushServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes4, -1, -1, null, ((java.lang.String) objArr18[0]).intern(), null));
                }
                i = getOutputMinFrameDuration + 19;
                getOutputSizes = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                return;
            }
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(10 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 743, (char) android.graphics.Color.green(0), objArr19);
            obj = objArr19[0];
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) obj).intern());
            pushServiceListener.onUnsupportedPushContent(bundle);
            i = getOutputMinFrameDuration + 19;
            getOutputSizes = i % 128;
            if (i % 2 != 0) {
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void retrySession(com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) throws com.gemalto.mfs.mwsdk.provisioning.exception.ExistingRetrySessionException, com.gemalto.mfs.mwsdk.provisioning.exception.NoSessionException {
        getOutputMinFrameDuration = (getOutputSizes + 27) % 128;
        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(modifierMetaStateMask + 5, (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (1560 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(8 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 62792), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.coroutineBoundary = pushServiceListener;
        if (((util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService()).m25840()) {
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(39 - (scrollBarSize >> 8), 643 - android.text.TextUtils.getTrimmedLength(""), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr3);
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.ExistingRetrySessionException(((java.lang.String) objArr3[0]).intern());
        }
        try {
            byte[] m25814 = util.h.xy.by.ma.f1067.m25814();
            if (m25814 != null && !util.h.xy.ar.b.m25070(m25814)) {
                m25838(new java.lang.String(m25814), this.coroutineBoundary);
                getOutputSizes = (getOutputMinFrameDuration + 81) % 128;
                return;
            }
            try {
                long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(26 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), android.text.TextUtils.getTrimmedLength("") + 682, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr4);
                throw new com.gemalto.mfs.mwsdk.provisioning.exception.NoSessionException(((java.lang.String) objArr4[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(37 - (doubleTapTimeout >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 708, (char) android.graphics.Color.blue(0), objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            sb.append(e.getMessage());
            throw new com.gemalto.mfs.mwsdk.provisioning.exception.NoSessionException(sb.toString());
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType getCodeType() {
        java.lang.String intern;
        int i;
        int i2 = getOutputMinFrameDuration + 125;
        getOutputSizes = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(4 / (android.view.ViewConfiguration.getKeyRepeatDelay() - 45), android.graphics.Color.green(0), (char) (24382 << android.view.Gravity.getAbsoluteGravity(1, 1)), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            i = 13;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.green(0), (char) (1560 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            i = 9;
        }
        getOutputMinFrameDuration = (getOutputSizes + 77) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(i - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 31 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10648), objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            return this.toString;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void sendActivationCode(com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener) {
        getOutputMinFrameDuration = (getOutputSizes + 65) % 128;
        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(4 - offsetBefore, 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1560), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(resolveSizeAndState + 8, lastIndexOf + 40, (char) (33193 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        Camera2StreamConfigurationMap(enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE);
        int i = getOutputMinFrameDuration + 21;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void sendActivationCode(com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        getOutputSizes = (getOutputMinFrameDuration + 95) % 128;
        float maxVolume = android.media.AudioTrack.getMaxVolume();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 3, android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (1560 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        getOutputMinFrameDuration = (getOutputSizes + 45) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(9 - normalizeMetaState, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 47, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 26432), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            Camera2StreamConfigurationMap(enrollingServiceListener, provisioningServicePinType);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void sendRequestForReplenishment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener, boolean z) {
        java.lang.String intern;
        int i;
        getOutputSizes = (getOutputMinFrameDuration + 35) % 128;
        int fadingEdgeLength = (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4;
        int i2 = getOutputMinFrameDuration + 87;
        getOutputSizes = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(fadingEdgeLength, (-1) >> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 1L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 1L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionGroup(1L) + 26690), objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                i = 44;
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(fadingEdgeLength, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1560), objArr2);
                intern = ((java.lang.String) objArr2[0]).intern();
                i = 9;
            }
            getOutputMinFrameDuration = (getOutputSizes + 9) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(i + (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), 56 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            m25837(str, pushServiceListener, z, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void sendRequestForReplenishment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        getOutputSizes = (getOutputMinFrameDuration + 115) % 128;
        int defaultSize = android.view.View.getDefaultSize(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(defaultSize + 4, android.view.ViewConfiguration.getTapTimeout() >> 16, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1559), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int indexOf = android.text.TextUtils.indexOf("", "");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(10 - indexOf, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 65, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 16908), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        m25837(str, pushServiceListener, false, null);
        int i = getOutputSizes + 59;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25837(final java.lang.String str, final com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener, final boolean z, final util.h.xy.ca.b.ra raVar) {
        if (str == null || pushServiceListener == null) {
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(32 - packedPositionGroup, 74 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.KeyEvent.keyCodeFromString("") + 27733), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.NULL_CONTEXT;
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(lastIndexOf + 60, 107 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48218), objArr2);
                pushServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -1, -1, null, ((java.lang.String) objArr2[0]).intern(), null));
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.1
            private static int getHighSpeedVideoSizesFor = -408873058;
            private static int getInputFormats = 1;
            private static int getInputSizeshNQ4ISI = 604346664;
            private static int getOutputFormats = 0;
            private static byte[] getOutputMinFrameDuration = {18, -66, 67, -4, com.google.common.base.Ascii.VT, 121, 88, 77, -22, com.google.common.base.Ascii.VT, 66, 76, -78, 82, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -108, 19, -26, -32, 121, -28, -28, 125, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -97, 114, 124, 120, -106, 66, -21, 72, -25, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 47, com.google.common.base.Ascii.DC4, 3, 109, com.google.common.base.Ascii.CAN, 101, com.visa.cbp.getEncExpo.IResultReceiver2, -90, -63, com.google.common.base.Ascii.SUB, 102, -93, -62, 111, -82, -63, com.google.common.base.Ascii.ESC, 110, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, 111, 16, 110, com.google.common.base.Ascii.RS, 17, com.visa.cbp.getEncExpo.IResultReceiver2, 104, 121, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 102, com.google.common.base.Ascii.VT, 110, 10, 18, 19, 103, 72, -62, 111, -82, -47, com.google.common.base.Ascii.ETB, 118, 19, 88, -48, 18, 105, 16, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, 82, 113, com.google.common.base.Ascii.FF, 89, 105, 113, 70, 0, -94, com.google.common.base.Ascii.FS, 123, 16, -43, -1, -88, -123, -14, -99, -51, -123, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -10, -104, 34, -113, 14, 6, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.ETB, kotlin.io.encoding.Base64.padSymbol, 10, 13, 85, -19, 60, 9, 103, 45, 9, -89, -2, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 10, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.SYN, 1, 85, -20, 13, 56, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CAN, -116, -73, -106, -76, -117, 18, -8, -118, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, -72, 57, -63, com.visa.cbp.getEncExpo.startTransaction, 63, -61, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.ETB};
            private static int getOutputSizes = 1213894163;
            private static short[] getOutputSizeshNQ4ISI;

            private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr3) {
                boolean z2;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
                int i5 = i4 == -1 ? 1 : 0;
                if (i5 != 0) {
                    getInputFormats = (getOutputFormats + 53) % 128;
                    byte[] bArr = getOutputMinFrameDuration;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                            i6++;
                            getOutputFormats = (getInputFormats + 75) % 128;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        i4 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getOutputSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                    } else {
                        i4 = (short) (((short) (getOutputSizeshNQ4ISI[((int) (getOutputSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                        int i7 = getInputFormats + 111;
                        getOutputFormats = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                if (i4 > 0) {
                    meVar.f2647 = ((i + i4) - 2) + ((int) (getOutputSizes ^ (-2689713159175858216L))) + i5;
                    meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = getOutputMinFrameDuration;
                    if (bArr3 != null) {
                        getOutputFormats = (getInputFormats + 5) % 128;
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        int i9 = 0;
                        while (i9 < length2) {
                            int i10 = getInputFormats + 29;
                            getOutputFormats = i10 % 128;
                            if (i10 % 2 != 0) {
                                bArr4[i9] = (byte) (bArr3[i9] + 2689713159175858216L);
                            } else {
                                bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                                i9++;
                            }
                        }
                        bArr3 = bArr4;
                    }
                    if (bArr3 != null) {
                        getOutputFormats = (getInputFormats + 81) % 128;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i4) {
                        if (z2) {
                            byte[] bArr5 = getOutputMinFrameDuration;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getOutputSizeshNQ4ISI;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
                objArr3[0] = sb.toString();
            }

            @Override // java.lang.Runnable
            public final void run() {
                char c;
                int Camera2StreamConfigurationMap2;
                com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard;
                util.h.xy.d.rf rfVar;
                util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, pushServiceListener);
                try {
                    Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e = e;
                    c = 1;
                }
                if (Camera2StreamConfigurationMap2 != -91) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this, Camera2StreamConfigurationMap2);
                    return;
                }
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = util.h.xy.k.ra.f2243.m26950(str);
                if (!util.h.xy.u.d.m27514(m26950)) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    util.h.xy.ca.b bVar = util.h.xy.ca.b.this;
                    java.lang.String str2 = str;
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getCapsMode("", 0, 0) + 1342465589, (short) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 3), (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 108), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 71, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1012625753, objArr3);
                    util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar, str2, provisioningServiceErrorCodes2, ((java.lang.String) objArr3[0]).intern());
                    return;
                }
                try {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    digitalizedCard = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(m26950.getResult().m26180());
                    rfVar = (util.h.xy.d.rf) digitalizedCard.getCardState(null).waitToComplete().getResult();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                    e = e2;
                    c = 2;
                }
                if (rfVar != null && rfVar.getState() != null) {
                    if (rfVar.getState().equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED)) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        util.h.xy.ca.b bVar2 = util.h.xy.ca.b.this;
                        java.lang.String m26180 = m26950.getResult().m26180();
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.REPLENISHMENT_NOT_ALLOWED;
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(1342465622 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (short) (59 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (byte) ((-8) - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (-70) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 1012625764, objArr4);
                            util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar2, m26180, provisioningServiceErrorCodes3, ((java.lang.String) objArr4[0]).intern());
                            return;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoFpsRangesFor = util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this, m26950.getResult().m26180(), z, false);
                    if (highSpeedVideoFpsRangesFor != null) {
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, highSpeedVideoFpsRangesFor);
                        return;
                    }
                    if (digitalizedCard.hasAuxiliaryScheme()) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        if (rfVar.m26258()) {
                            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoFpsRangesFor2 = util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this, m26950.getResult().m26179(), z, true);
                            if (highSpeedVideoFpsRangesFor2 != null) {
                                util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(highSpeedVideoFpsRangesFor2.getSdkErrorCode(), highSpeedVideoFpsRangesFor2.getHttpStatusCode(), highSpeedVideoFpsRangesFor2.getCpsErrorCode(), highSpeedVideoFpsRangesFor2.getTokenId() != null ? m26950.getResult().m26180() : null, highSpeedVideoFpsRangesFor2.getErrorMessage(), highSpeedVideoFpsRangesFor2.getStatusAdditionalInfo()));
                                return;
                            }
                            util.h.xy.ca.b bVar3 = util.h.xy.ca.b.this;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.getDeadChar(0, 0) + 1342465672, (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 85), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12), android.graphics.Color.argb(0, 0, 0, 0) - 71, 1012625760 - android.view.KeyEvent.normalizeMetaState(0), objArr5);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(bVar3, ((java.lang.String) objArr5[0]).intern());
                            return;
                        }
                        util.h.xy.ca.b bVar4 = util.h.xy.ca.b.this;
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(1342465687 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) (android.graphics.Color.red(0) - 55), (byte) ((-46) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-72) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1012625760 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr6);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(bVar4, ((java.lang.String) objArr6[0]).intern());
                            return;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    util.h.xy.ca.b bVar5 = util.h.xy.ca.b.this;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1342465685, (short) ((android.view.ViewConfiguration.getTapTimeout() >> 16) - 55), (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) - 46), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 71, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1012625761, objArr7);
                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(bVar5, ((java.lang.String) objArr7[0]).intern());
                    return;
                    e = e2;
                    c = 2;
                    if (c == 1) {
                        util.h.xy.ca.b bVar6 = util.h.xy.ca.b.this;
                        java.lang.String str3 = str;
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes4 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionType(0L) + 1342465700, (short) (android.view.KeyEvent.getDeadChar(0, 0) - 91), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 118), (-71) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1012625765, objArr8);
                        sb.append(((java.lang.String) objArr8[0]).intern());
                        sb.append(e.getMessage());
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar6, str3, provisioningServiceErrorCodes4, sb.toString());
                        return;
                    }
                    if (c == 2) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(1342465729 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) ((-123) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 71, 1012625748 - android.graphics.Color.green(0), objArr9);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr9[0]).intern(), util.h.xy.al.rc.m25022(e));
                        util.h.xy.ca.b bVar7 = util.h.xy.ca.b.this;
                        java.lang.String str4 = str;
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes5 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1342465735, (short) (128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 106), (-72) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1012625752 - android.view.MotionEvent.axisFromString(""), objArr10);
                        sb2.append(((java.lang.String) objArr10[0]).intern());
                        sb2.append(e.getMessage());
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar7, str4, provisioningServiceErrorCodes5, sb2.toString());
                        return;
                    }
                    return;
                }
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                util.h.xy.ca.b bVar8 = util.h.xy.ca.b.this;
                java.lang.String str5 = str;
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes6 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.normalizeMetaState(0) + 1342465605, (short) (16 - android.view.View.MeasureSpec.getSize(0)), (byte) ((-80) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-16777287) - android.graphics.Color.rgb(0, 0, 0), 1012625747 - android.view.KeyEvent.normalizeMetaState(0), objArr11);
                util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar8, str5, provisioningServiceErrorCodes6, ((java.lang.String) objArr11[0]).intern());
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRangesFor(java.lang.String str, boolean z, boolean z2) {
        char c;
        boolean z3;
        boolean z4;
        try {
            java.lang.String m26759 = util.h.xy.f.b.f2201.m26759(str);
            util.h.xy.d.b m26955 = util.h.xy.k.ra.f2243.m26955(str.getBytes(util.h.xy.h.a.f2221));
            m26955.m26133().equals(util.h.xy.d.mg.f1144);
            if (m26759 != null && m26759.equals(com.gemalto.mfs.mwsdk.payment.engine.CardScheme.VISA.toString()) && m26955.m26133().equals(util.h.xy.d.mg.f1144)) {
                z3 = java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1});
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
            }
            c = 4;
            if (!z4) {
                try {
                    return getHighResolutionOutputSizeshNQ4ISI(str, z, z2, false, false);
                } catch (java.lang.Exception e) {
                    e = e;
                    if (c != 3) {
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.INVALID_DIGITALCARDID;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(17 - android.graphics.ImageFormat.getBitsPerPixel(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, (char) (android.view.KeyEvent.keyCodeFromString("") + 29781), objArr);
                        return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -2, -1, str, ((java.lang.String) objArr[0]).intern(), null);
                    }
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(16 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 239 - android.graphics.Color.alpha(0), (char) (35133 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        sb.append(e.getMessage());
                        return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, 0, str, sb.toString(), null);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, z2);
            if (!z && !Camera2StreamConfigurationMap2) {
                return null;
            }
            int m24992 = util.h.xy.ak.ma.f84.m24992(str);
            if (m24992 > 0) {
                if (m24992 != 4) {
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
                    return highSpeedVideoFpsRanges == null ? getHighSpeedVideoFpsRanges(str, true, z3) : highSpeedVideoFpsRanges;
                }
                return getHighSpeedVideoFpsRanges(str, true, z3);
            }
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.REPLENISHMENT_PERMANENT_ERROR;
            try {
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(56 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 166, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
                    return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, 0, null, ((java.lang.String) objArr3[0]).intern(), null);
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
        } catch (java.lang.Exception e2) {
            e = e2;
            c = 3;
            if (c != 3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177 A[Catch: InternalComponentException -> 0x057b, TRY_LEAVE, TryCatch #5 {InternalComponentException -> 0x057b, blocks: (B:50:0x016f, B:52:0x0177), top: B:49:0x016f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRanges(java.lang.String str) {
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType;
        boolean equals;
        org.json.JSONArray m25722;
        byte[] bArr;
        util.h.xy.d.ra m26913;
        util.h.xy.d.rc rcVar;
        util.h.xy.d.b bVar;
        byte[] mo26160;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[][] bArr9;
        byte[][] bArr10;
        byte[] m25090;
        try {
            byte[] m24984 = util.h.xy.ak.ma.f84.m24984();
            try {
                try {
                    try {
                        if (!java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                            paymentType = java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode()) ? com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP : com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                            equals = java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1});
                            if (!equals) {
                                util.h.xy.u.ma m27487 = util.h.xy.u.a.f2431.m27487(true, paymentType);
                                if (m27487.m27528() == util.h.xy.aa.d.f62) {
                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.AUTHENTICATION_REQUIRED;
                                    try {
                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(40 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 285 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9315), objArr);
                                        return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, null, ((java.lang.String) objArr[0]).intern(), null);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                if (m27487.m27528() == util.h.xy.aa.d.f64 || m27487.m27528() == util.h.xy.aa.d.f66) {
                                    try {
                                        util.h.xy.cg.d.m25913();
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(18 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 325 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                                        sb.append(((java.lang.String) objArr2[0]).intern());
                                        sb.append(e.getMessage());
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, sb.toString(), null);
                                        getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
                                        return provisioningServiceError;
                                    }
                                }
                            }
                            byte[] m27456 = util.h.xy.t.mb.f2417.m27456(str.getBytes(util.h.xy.h.a.f2221));
                            m25722 = util.h.xy.bv.mf.m25722(m27456);
                            if (m25722 != null || m25722.length() <= 0) {
                                bArr = null;
                            } else {
                                bArr = m25722.get(m25722.length() - 1).toString().getBytes();
                                m25722.get(m25722.length() - 1);
                            }
                            m26913 = util.h.xy.k.b.m26913(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                            if (m26913 == null) {
                                bVar = m26913.m26219();
                                rcVar = m26913.m26220();
                            } else {
                                rcVar = null;
                                bVar = null;
                            }
                            mo26160 = util.h.xy.k.ma.m26925().mo26160();
                            if (!util.h.xy.ar.b.m25070(mo26160) || util.h.xy.ar.b.m25070(mo26160)) {
                                return getInputFormats();
                            }
                            if (equals || rcVar == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = util.h.xy.u.a.f2431.m27485(rcVar.m26244());
                                if (bArr2 == null) {
                                    return getInputFormats();
                                }
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTouchSlop() >> 8) + 7, 401 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
                                util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), bArr2);
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(6 - android.graphics.Color.alpha(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 409, (char) (64029 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr4);
                                util.h.xy.am.ma.m25030(((java.lang.String) objArr4[0]).intern(), rcVar.m26244());
                            }
                            if (equals) {
                                bArr3 = null;
                            } else {
                                util.h.xy.aw.b bVar2 = new util.h.xy.aw.b();
                                util.h.xy.aw.ra.m25249(bArr2, bVar2, 128);
                                bArr3 = bVar2.m25241();
                                int i = getOutputSizes + 73;
                                getOutputMinFrameDuration = i % 128;
                                if (i % 2 != 0) {
                                    throw null;
                                }
                                util.h.xy.ar.b.m25095(bArr2);
                            }
                            if (rcVar != null) {
                                bArr5 = rcVar.m26240();
                                bArr6 = getHighSpeedVideoSizes(rcVar.m26242());
                                byte[] m26241 = rcVar.m26241();
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6, 415 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr5);
                                util.h.xy.am.ma.m25030(((java.lang.String) objArr5[0]).intern(), rcVar.m26240());
                                bArr4 = m26241;
                            } else {
                                bArr4 = null;
                                bArr5 = null;
                                bArr6 = null;
                            }
                            if (bVar != null) {
                                bArr7 = java.lang.String.valueOf(bVar.m26134()).getBytes();
                                util.h.xy.ar.b.m25074(bArr7);
                                int length = bArr7.length;
                            } else {
                                bArr7 = null;
                            }
                            if (bArr5 != null) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, 420 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (50350 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr6);
                                sb2.append(((java.lang.String) objArr6[0]).intern());
                                sb2.append(util.h.xy.ar.b.m25074(bArr5));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(5 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 433, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr7);
                                sb2.append(((java.lang.String) objArr7[0]).intern());
                                sb2.append(bArr5);
                                if (sb2.toString() != null) {
                                    int length2 = bArr5.length;
                                }
                            }
                            if (mo26160 != null) {
                                util.h.xy.ar.b.m25074(mo26160);
                                int length3 = mo26160.length;
                            }
                            if (bArr7 != null) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                bArr8 = bArr2;
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(13 - android.view.View.combineMeasuredStates(0, 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 441, (char) (19186 - android.view.View.MeasureSpec.getSize(0)), objArr8);
                                sb3.append(((java.lang.String) objArr8[0]).intern());
                                sb3.append(util.h.xy.ar.b.m25074(bArr7));
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(6 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 435, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr9);
                                sb3.append(((java.lang.String) objArr9[0]).intern());
                                sb3.append(bArr7);
                                if (sb3.toString() != null) {
                                    int length4 = bArr7.length;
                                }
                            } else {
                                bArr8 = bArr2;
                            }
                            if (bArr6 != null) {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(13 - android.view.KeyEvent.keyCodeFromString(""), 452 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr10);
                                sb4.append(((java.lang.String) objArr10[0]).intern());
                                sb4.append(util.h.xy.ar.b.m25074(bArr6));
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetBefore("", 0) + 6, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 434, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr11);
                                sb4.append(((java.lang.String) objArr11[0]).intern());
                                sb4.append(bArr6);
                                if (sb4.toString() != null) {
                                    int length5 = bArr6.length;
                                }
                            }
                            if (bArr3 != null) {
                                util.h.xy.ar.b.m25074(bArr3);
                                int length6 = bArr3.length;
                            }
                            if (m27456 != null) {
                                util.h.xy.ar.b.m25074(m27456);
                                int length7 = m27456.length;
                            }
                            if (bArr4 != null) {
                                util.h.xy.ar.b.m25074(bArr4);
                                int length8 = bArr4.length;
                            }
                            if (m27456 == null) {
                                if (equals) {
                                    bArr9 = new byte[][]{new byte[]{1}, new byte[]{4}, new byte[]{6}, new byte[]{18}};
                                    bArr10 = new byte[][]{bArr4, mo26160, bArr7, bArr6};
                                } else {
                                    bArr9 = new byte[][]{new byte[]{2}, new byte[]{4}, new byte[]{6}, new byte[]{18}, new byte[]{19}};
                                    bArr10 = new byte[][]{bArr5, mo26160, bArr7, bArr6, bArr3};
                                }
                            } else if (equals) {
                                bArr9 = new byte[][]{new byte[]{1}, new byte[]{4}, new byte[]{6}, new byte[]{18}, new byte[]{com.google.common.base.Ascii.DC4}};
                                bArr10 = new byte[][]{bArr4, mo26160, bArr7, bArr6, bArr};
                            } else {
                                bArr9 = new byte[][]{new byte[]{2}, new byte[]{4}, new byte[]{6}, new byte[]{18}, new byte[]{19}, new byte[]{com.google.common.base.Ascii.DC4}};
                                bArr10 = new byte[][]{bArr5, mo26160, bArr7, bArr6, bArr3, bArr};
                            }
                            try {
                                byte[] m25024 = util.h.xy.al.rd.m25024(bArr9, bArr10);
                                util.h.xy.ar.b.m25100(mo26160, bArr8, bArr3, bArr5, bArr6, bArr7);
                                util.h.xy.ar.b.m25074(m25024);
                                byte[] m27056 = util.h.xy.q.b.m27056(m25024);
                                byte[] m27623 = m27456 == null ? equals ? util.h.xy.v.b.f2439.m27623(m27056) : util.h.xy.v.b.f2439.m27638(m27056) : equals ? util.h.xy.v.b.f2439.m27635(m27056) : util.h.xy.v.b.f2439.m27632(m27056);
                                if (m27623 == null) {
                                    return null;
                                }
                                byte[] m25107 = util.h.xy.ar.mb.m25107(new byte[]{81}, java.util.Arrays.copyOf(m27623, 8));
                                int length9 = m25107.length;
                                util.h.xy.ar.b.m25074(m25107);
                                if (m27456 != null) {
                                    util.h.xy.ar.mb m25057 = util.h.xy.ar.a.m25057(m27456, (byte) 81);
                                    m25090 = util.h.xy.ar.b.m25090(java.util.Arrays.copyOfRange(m27456, 0, m27456.length - ((m25057 == null ? 0 : m25057.m25112() + 2) + 1)), m25107, new byte[]{m27456[m27456.length - 1]});
                                } else {
                                    m25090 = util.h.xy.ar.b.m25090(m25107, new byte[]{0});
                                }
                                util.h.xy.t.mb.f2417.m27445(str.getBytes(util.h.xy.h.a.f2221), m25090);
                                return null;
                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(33 - android.view.View.MeasureSpec.getMode(0), 466 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 13428), objArr12);
                                sb5.append(((java.lang.String) objArr12[0]).intern());
                                sb5.append(e2.getMessage());
                                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError2 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, sb5.toString(), null);
                                getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
                                return provisioningServiceError2;
                            }
                        }
                        m26913 = util.h.xy.k.b.m26913(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                        if (m26913 == null) {
                        }
                        mo26160 = util.h.xy.k.ma.m26925().mo26160();
                        if (util.h.xy.ar.b.m25070(mo26160)) {
                        }
                        return getInputFormats();
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(28 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 374 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 6640), objArr13);
                        sb6.append(((java.lang.String) objArr13[0]).intern());
                        sb6.append(e3.getMessage());
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError3 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, sb6.toString(), null);
                        getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
                        return provisioningServiceError3;
                    }
                    byte[] m274562 = util.h.xy.t.mb.f2417.m27456(str.getBytes(util.h.xy.h.a.f2221));
                    m25722 = util.h.xy.bv.mf.m25722(m274562);
                    if (m25722 != null) {
                    }
                    bArr = null;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException e4) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(31 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 344 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr14);
                    sb7.append(((java.lang.String) objArr14[0]).intern());
                    sb7.append(e4.getMessage());
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError4 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, sb7.toString(), null);
                    getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
                    return provisioningServiceError4;
                }
                equals = java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1});
                if (!equals) {
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e5) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError5 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, e5.getMessage(), null);
                getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
                return provisioningServiceError5;
            }
            paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
        } catch (java.lang.Exception e6) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(29 - android.view.MotionEvent.axisFromString(""), 255 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr15);
            sb8.append(((java.lang.String) objArr15[0]).intern());
            sb8.append(e6.getMessage());
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError6 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, sb8.toString(), null);
            getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
            return provisioningServiceError6;
        }
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr) {
        int i = getOutputMinFrameDuration + 31;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            if (bArr.length != 69) {
                return bArr;
            }
        } else if (bArr.length != 7) {
            return bArr;
        }
        byte[] bArr2 = new byte[8];
        bArr2[0] = 48;
        int i2 = 1;
        while (i2 < 8) {
            int i3 = getOutputMinFrameDuration + 47;
            getOutputSizes = i3 % 128;
            if (i3 % 2 == 0) {
                bArr2[i2] = bArr[i2];
                i2 += 46;
            } else {
                bArr2[i2] = bArr[i2 - 1];
                i2++;
            }
        }
        return bArr2;
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getInputFormats() {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CREDENTIALS_ERROR;
        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(26 - (keyRepeatDelay >> 16), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 499, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, null, ((java.lang.String) objArr[0]).intern(), null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str, boolean z) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m25926 = util.h.xy.cg.ra.m25926(str);
        if (!m25926.isSuccessful()) {
            return false;
        }
        int i = getOutputSizes + 19;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            util.h.xy.d.rf rfVar = (util.h.xy.d.rf) m25926.getResult();
            if (!z) {
                return rfVar.m26259();
            }
            int i2 = getOutputMinFrameDuration + 27;
            getOutputSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return rfVar.m26258();
            }
            rfVar.m26258();
            throw null;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void updatePushToken(final java.lang.String str, final com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(4 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (1560 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int axisFromString = android.view.MotionEvent.axisFromString("");
        int i = getOutputMinFrameDuration;
        getOutputSizes = (i + 49) % 128;
        getOutputSizes = (i + 37) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(7 - axisFromString, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 524, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (str != null) {
                int i2 = getOutputMinFrameDuration;
                getOutputSizes = (i2 + 33) % 128;
                if (pushServiceListener != null) {
                    getOutputSizes = (i2 + 119) % 128;
                    if (!str.isEmpty()) {
                        if (util.h.xy.ag.a.m24556().m24560()) {
                            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.11
                                private static int getHighSpeedVideoFpsRanges = 1;
                                private static int getHighSpeedVideoFpsRangesFor = 0;
                                private static int getHighSpeedVideoSizesFor = 1;
                                private static int getInputSizeshNQ4ISI = 0;
                                private static long getOutputFormats = -828144852064938880L;

                                private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str2, int i3, java.lang.Object[] objArr3) {
                                    int i4 = getHighSpeedVideoFpsRanges + 53;
                                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        throw new java.lang.ArithmeticException();
                                    }
                                    char[] charArray = str2.toCharArray();
                                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                                    dVar.f2628 = i3;
                                    int length = charArray.length;
                                    long[] jArr = new long[length];
                                    dVar.f2629 = 0;
                                    while (dVar.f2629 < charArray.length) {
                                        jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputFormats ^ (-7508379876853140581L));
                                        dVar.f2629++;
                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 115) % 128;
                                    }
                                    char[] cArr = new char[length];
                                    dVar.f2629 = 0;
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                                    while (dVar.f2629 < charArray.length) {
                                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                                        dVar.f2629++;
                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 53) % 128;
                                    }
                                    objArr3[0] = new java.lang.String(cArr);
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
                                
                                    r0 = new util.h.xy.bv.mg();
                                    r0.m25739(r3);
                                    r0 = r0.m25709();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
                                
                                    if (r0 == null) goto L35;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
                                
                                    r3 = util.h.xy.ca.b.AnonymousClass11.getHighSpeedVideoSizesFor + 79;
                                    util.h.xy.ca.b.AnonymousClass11.getInputSizeshNQ4ISI = r3 % 128;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
                                
                                    if ((r3 % 2) != 0) goto L33;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
                                
                                    if (r0.isSuccessful() == false) goto L32;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
                                
                                    r0 = r0.getResult();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
                                
                                    if (r0 != null) goto L26;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
                                
                                    r0 = r12.Camera2StreamConfigurationMap;
                                    r3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                                    r1 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ue758⎼溦꧞\uf495㾭窢薪샌\u0bda囎釣\udcaf\ue7f9⋪浂ꠅ\uf309㸩礢", android.widget.ExpandableListView.getPackedPositionGroup(0) + 50423, r1);
                                    util.h.xy.ca.b.Camera2StreamConfigurationMap(r0, (java.lang.String) null, r3, ((java.lang.String) r1[0]).intern());
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
                                
                                    if (r0.m25745() != util.h.xy.bv.rb.ra.f1061) goto L30;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
                                
                                    util.h.xy.ca.b.Camera2StreamConfigurationMap(r12.Camera2StreamConfigurationMap, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, r0.m25751(), r0.m25749(), null, r0.m25742(), r0.m25750()));
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
                                
                                    util.h.xy.cb.b.m25849(r3);
                                    r0 = r12.Camera2StreamConfigurationMap;
                                    r1 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ue74b갚燎ۼ쩂鼄ⓝ\ue9e0뵌䈃", 19266 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), r1);
                                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r0, ((java.lang.String) r1[0]).intern());
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
                                
                                    util.h.xy.ca.b.Camera2StreamConfigurationMap(r12.Camera2StreamConfigurationMap, util.h.xy.cg.ra.m25922(r0));
                                    util.h.xy.ca.b.AnonymousClass11.getInputSizeshNQ4ISI = (util.h.xy.ca.b.AnonymousClass11.getHighSpeedVideoSizesFor + 125) % 128;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
                                
                                    r0.isSuccessful();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:30:0x00f2, code lost:
                                
                                    throw new java.lang.ArithmeticException();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:32:0x00f4, code lost:
                                
                                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r12.Camera2StreamConfigurationMap).onComplete();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
                                
                                    util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(r12.Camera2StreamConfigurationMap, r0);
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:35:0x0032, code lost:
                                
                                    return;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
                                
                                    if (r0 != (-91)) goto L12;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
                                
                                    if (r0 != 26) goto L12;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
                                
                                    if (util.h.xy.cb.b.m25848(r3).booleanValue() != false) goto L36;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int Camera2StreamConfigurationMap2;
                                    int i3 = getHighSpeedVideoSizesFor + 57;
                                    getInputSizeshNQ4ISI = i3 % 128;
                                    try {
                                        if (i3 % 2 != 0) {
                                            util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, pushServiceListener);
                                            Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                                        } else {
                                            util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, pushServiceListener);
                                            Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                                        }
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                        util.h.xy.ca.b bVar = util.h.xy.ca.b.this;
                                        java.lang.String highSpeedVideoSizesFor = util.h.xy.ca.b.getHighSpeedVideoSizesFor(bVar);
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("\ue74e౩ㅼ♪䬿灻敳詮뽼ꑾ쥽\ufe75\ue373࠶㵦≠坪籾慼陻묯ꁫ핿奄\uef6cᑰ㤭⸠", 60161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr3);
                                        sb.append(((java.lang.String) objArr3[0]).intern());
                                        sb.append(e.getMessage());
                                        util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar, highSpeedVideoSizesFor, provisioningServiceErrorCodes, sb.toString());
                                    }
                                    util.h.xy.ca.b bVar2 = util.h.xy.ca.b.this;
                                    java.lang.String highSpeedVideoSizesFor2 = util.h.xy.ca.b.getHighSpeedVideoSizesFor(bVar2);
                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ue74e౩ㅼ♪䬿灻敳詮뽼ꑾ쥽\ufe75\ue373࠶㵦≠坪籾慼陻묯ꁫ핿奄\uef6cᑰ㤭⸠", 60161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr32);
                                    sb2.append(((java.lang.String) objArr32[0]).intern());
                                    sb2.append(e.getMessage());
                                    util.h.xy.ca.b.Camera2StreamConfigurationMap(bVar2, highSpeedVideoSizesFor2, provisioningServiceErrorCodes2, sb2.toString());
                                }
                            }).start();
                            getOutputMinFrameDuration = (getOutputSizes + 95) % 128;
                            return;
                        }
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.NULL_CONTEXT;
                        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(59 - (maximumFlingVelocity >> 16), 107 - (doubleTapTimeout >> 16), (char) (48218 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
                        pushServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -1, -1, null, ((java.lang.String) objArr3[0]).intern(), null));
                        int i3 = getOutputSizes + 25;
                        getOutputMinFrameDuration = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                }
            }
            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(modifierMetaStateMask + 33, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 74, (char) (27733 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void getAccessToken(final java.lang.String str, final com.gemalto.mfs.mwsdk.provisioning.model.GetAccessTokenMode getAccessTokenMode, final com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener accessTokenListener) {
        getOutputMinFrameDuration = (getOutputSizes + 115) % 128;
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(indexOf + 5, android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1561), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(8 - packedPositionType, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (!android.text.TextUtils.isEmpty(str)) {
            int i = getOutputMinFrameDuration + 119;
            getOutputSizes = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (accessTokenListener != null) {
                if (util.h.xy.ag.a.m24556().m24560()) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.12
                        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                        private static int getInputFormats = 1;
                        private static int getOutputFormats = 0;
                        private static int getOutputMinFrameDuration = 1;
                        private static char[] getInputSizeshNQ4ISI = {41868, 41875, 41886, 41900, 41865, 41968, 41914, 41887, 41872, 41907, 41917, 41871, 41905, 41874, 41870, 41981, 41897, 41906, 41903, 41912, 41869, 41911, 41883, 41866, 41896, 41919, 41864, 41913, 41885, 41898, 41904, 41980, 41881, 41902, 41909, 41970};
                        private static char getHighSpeedVideoSizesFor = 38464;

                        private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str2, int i2, java.lang.Object[] objArr3) {
                            int i3;
                            int i4 = getHighResolutionOutputSizeshNQ4ISI + 35;
                            getOutputMinFrameDuration = i4 % 128;
                            if (i4 % 2 == 0) {
                                throw null;
                            }
                            char[] charArray = str2.toCharArray();
                            int i5 = getOutputMinFrameDuration + 9;
                            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                            int i6 = i5 % 2;
                            char[] cArr = charArray;
                            util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                            char[] cArr2 = getInputSizeshNQ4ISI;
                            if (cArr2 != null) {
                                int length = cArr2.length;
                                char[] cArr3 = new char[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    cArr3[i7] = (char) (cArr2[i7] ^ 4042185467053315654L);
                                }
                                cArr2 = cArr3;
                            }
                            char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizesFor);
                            char[] cArr4 = new char[i2];
                            if (i2 % 2 != 0) {
                                getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                                i3 = i2 - 1;
                                cArr4[i3] = (char) (cArr[i3] - b);
                            } else {
                                i3 = i2;
                            }
                            if (i3 > 1) {
                                getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
                                mcVar.f2638 = 0;
                                while (mcVar.f2638 < i3) {
                                    mcVar.f2641 = cArr[mcVar.f2638];
                                    mcVar.f2636 = cArr[mcVar.f2638 + 1];
                                    if (mcVar.f2641 == mcVar.f2636) {
                                        cArr4[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                        cArr4[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                                    } else {
                                        mcVar.f2639 = mcVar.f2641 / c;
                                        mcVar.f2640 = mcVar.f2641 % c;
                                        mcVar.f2637 = mcVar.f2636 / c;
                                        mcVar.f2635 = mcVar.f2636 % c;
                                        if (mcVar.f2640 == mcVar.f2635) {
                                            getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 29) % 128;
                                            mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                            mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                            int i8 = mcVar.f2639;
                                            int i9 = mcVar.f2640;
                                            int i10 = mcVar.f2637;
                                            int i11 = mcVar.f2635;
                                            cArr4[mcVar.f2638] = cArr2[(i8 * c) + i9];
                                            cArr4[mcVar.f2638 + 1] = cArr2[(i10 * c) + i11];
                                        } else if (mcVar.f2639 == mcVar.f2637) {
                                            mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                            mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                            int i12 = mcVar.f2639;
                                            int i13 = mcVar.f2640;
                                            int i14 = mcVar.f2637;
                                            int i15 = mcVar.f2635;
                                            cArr4[mcVar.f2638] = cArr2[(i12 * c) + i13];
                                            cArr4[mcVar.f2638 + 1] = cArr2[(i14 * c) + i15];
                                        } else {
                                            int i16 = mcVar.f2639;
                                            int i17 = mcVar.f2635;
                                            int i18 = mcVar.f2637;
                                            int i19 = mcVar.f2640;
                                            cArr4[mcVar.f2638] = cArr2[(i16 * c) + i17];
                                            cArr4[mcVar.f2638 + 1] = cArr2[(i18 * c) + i19];
                                        }
                                    }
                                    mcVar.f2638 += 2;
                                }
                            }
                            for (int i20 = 0; i20 < i2; i20++) {
                                getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 23) % 128;
                                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                            }
                            objArr3[0] = new java.lang.String(cArr4);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
                        
                            if (r0.getResult() == null) goto L58;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
                        
                            r0 = r0.getResult().m26180();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
                        
                            r7 = util.h.xy.k.b.m26920(r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
                        
                            if (r4.equals(com.gemalto.mfs.mwsdk.provisioning.model.GetAccessTokenMode.REFRESH) != false) goto L27;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
                        
                            util.h.xy.ca.b.AnonymousClass12.getOutputFormats = (util.h.xy.ca.b.AnonymousClass12.getInputFormats + 99) % 128;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
                        
                            if (android.text.TextUtils.isEmpty(r7) == false) goto L26;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r0 = r27.getHighSpeedVideoFpsRanges;
                            r8 = r3;
                            r12 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.getCapsMode("", 0, 0) + 116), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u001c\"\u0019\u0002㘽", 13 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), r12);
                            util.h.xy.ca.b.Camera2StreamConfigurationMap(r0, r8, r7, ((java.lang.String) r12[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r7 = new util.h.xy.bv.rc(r0).m25709();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
                        
                            if (r7 == null) goto L80;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
                        
                            r10 = r7.getResult();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
                        
                            if (r10 != null) goto L32;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
                        
                            r0 = r27.getHighSpeedVideoFpsRanges;
                            r14 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                            r10 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25), "\u0006\u0001\u0007#\u000f\u001a\u0015\u0000\u000b\u000f\u0015\u0018 #\u0013\u001e\f\u0011㘐㘐", android.view.KeyEvent.keyCodeFromString("") + 20, r10);
                            util.h.xy.ca.b.getHighSpeedVideoSizes(r0, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(r14, 0, 0, null, ((java.lang.String) r10[0]).intern(), null));
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
                        
                            if (r7.isSuccessful() != false) goto L35;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r0 = r27.getHighSpeedVideoFpsRanges;
                            r7 = r3;
                            r15 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, r10.m25751(), r10.m25749(), null, r10.m25742(), r10.m25750());
                            r13 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (63 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u001c\"\u0019\b㘞", (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 12, r13);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r0, r7, r15, ((java.lang.String) r13[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
                        
                            if ((r10 instanceof util.h.xy.bv.c) == false) goto L38;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
                        
                            r2 = ((util.h.xy.bv.c) r10).m25682();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x014f, code lost:
                        
                            if (android.text.TextUtils.isEmpty(r2) != false) goto L54;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:40:0x0151, code lost:
                        
                            r0 = util.h.xy.k.ra.f2243.m26951(r0, r2);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:41:0x015b, code lost:
                        
                            if (r0.isSuccessful() != false) goto L45;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
                        
                            util.h.xy.ca.b.AnonymousClass12.getInputFormats = (util.h.xy.ca.b.AnonymousClass12.getOutputFormats + 113) % 128;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r0.getErrorMessage();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:44:0x016b, code lost:
                        
                            r0 = r27.getHighSpeedVideoFpsRanges;
                            r7 = r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
                        
                            r10 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (116 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u001c\"\u0019\u0002㘽", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 13, r10);
                            util.h.xy.ca.b.Camera2StreamConfigurationMap(r0, r7, r2, ((java.lang.String) r10[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:50:0x01a4, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:51:0x01a5, code lost:
                        
                            r2 = r0.getCause();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:52:0x01a9, code lost:
                        
                            if (r2 != null) goto L52;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:53:0x01ab, code lost:
                        
                            throw r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x01ac, code lost:
                        
                            throw r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x01ad, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r0 = r27.getHighSpeedVideoFpsRanges;
                            r2 = r3;
                            r11 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                            r14 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), "\u000f\u0007\"\u0007㙵㙵\u0018\u0015\u0014\u0018\u000f\u001b\u001d\u000f \"\u001c\u001a\u001c!\u0018\u001c\u0019\u0001\t\u001e\u0006\u000f\u001e\u0013!\u0003\u0018\u001c\u0003\u0015", (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 35, r14);
                            r7 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(r11, 0, -1, null, ((java.lang.String) r14[0]).intern(), null);
                            r11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 88), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u0010\u0019 \u0002", (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 11, r11);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r0, r2, r7, ((java.lang.String) r11[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
                        
                            r2 = null;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:57:0x0207, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x0208, code lost:
                        
                            r2 = 2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x02f5, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r0.getMessage();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:60:0x02fb, code lost:
                        
                            if (r2 == 1) goto L78;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:61:0x02fd, code lost:
                        
                            r2 = r27.getHighSpeedVideoFpsRanges;
                            r7 = r3;
                            r9 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                            r12 = util.h.xy.ca.b.getHighSpeedVideoSizesFor(r27.getHighSpeedVideoFpsRanges);
                            r8 = new java.lang.StringBuilder();
                            r5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (android.graphics.Color.blue(0) + 71), "\u0000\u0016!\u0003!\u0019\u000f#\u0006!!\u0018\u0019\u0001\u0018\u001e\u0006\u001c\f\u0016!\u0019㘯㘯\u000f\u0003\u0001#", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, r5);
                            r8.append(((java.lang.String) r5[0]).intern());
                            r8.append(r0.getMessage());
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r2, r7, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(r9, 0, 0, r12, r8.toString(), null), (java.lang.String) null);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:62:0x0346, code lost:
                        
                            return;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:65:0x0213, code lost:
                        
                            if (r0.getErrorCode() != 2001) goto L63;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:66:0x0215, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r2 = r27.getHighSpeedVideoFpsRanges;
                            r7 = r3;
                            r8 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.INVALID_DIGITALCARDID, 0, 0, null, r0.getErrorMessage(), null, null);
                            r11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (117 - android.view.View.resolveSize(0, 0)), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u0014\u001c\b\u001f", 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), r11);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r2, r7, r8, ((java.lang.String) r11[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:67:0x0252, code lost:
                        
                            return;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:69:0x0259, code lost:
                        
                            if (r0.getErrorCode() != 1011) goto L67;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:70:0x025b, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r2 = r27.getHighSpeedVideoFpsRanges;
                            r7 = r3;
                            r11 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED, 0, 0, null, r0.getErrorMessage(), null, null);
                            r14 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (118 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u0014\u001c\b\u001f", 13 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r14);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r2, r7, r11, ((java.lang.String) r14[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:71:0x029a, code lost:
                        
                            return;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:73:0x029f, code lost:
                        
                            if (r0.getCausingException() == null) goto L80;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:74:0x02a1, code lost:
                        
                            util.h.xy.ca.b.AnonymousClass12.getOutputFormats = (util.h.xy.ca.b.AnonymousClass12.getInputFormats + 21) % 128;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:76:0x02af, code lost:
                        
                            if ((r0.getCausingException() instanceof com.gemalto.mfs.mwsdk.exception.InternalComponentException) == false) goto L80;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:77:0x02b1, code lost:
                        
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            r2 = r27.getHighSpeedVideoFpsRanges;
                            r7 = r3;
                            r8 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, 0, null, r0.getErrorMessage(), r0.getCausingException(), null);
                            r11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (117 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\u0001\u0003\u0011\u0005\u001d\u001b\u000b \u0014\u001c\b\u001f", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, r11);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(r2, r7, r8, ((java.lang.String) r11[0]).intern());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:78:0x02f2, code lost:
                        
                            return;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:79:0x0031, code lost:
                        
                            util.h.xy.ca.b.Camera2StreamConfigurationMap(r27.getHighSpeedVideoFpsRanges, r3, r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
                        
                            if (r0 != 45) goto L12;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:80:0x0038, code lost:
                        
                            return;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:83:0x002f, code lost:
                        
                            if (r0 != (-91)) goto L12;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
                        
                            r0 = util.h.xy.k.ma.m26925().mo26175(r3);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
                        
                            if (r0.isSuccessful() == false) goto L58;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x0353 A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x0354  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            int Camera2StreamConfigurationMap2;
                            int i2 = getInputFormats + 105;
                            getOutputFormats = i2 % 128;
                            try {
                                if (i2 % 2 != 0) {
                                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this, accessTokenListener);
                                    Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                                } else {
                                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this, accessTokenListener);
                                    Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                                }
                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                e = e;
                                char c = 1;
                            }
                            int i3 = getOutputFormats + 101;
                            getInputFormats = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw null;
                            }
                        }
                    }).start();
                    int i2 = getOutputMinFrameDuration + 91;
                    getOutputSizes = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                } else {
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.NULL_CONTEXT;
                    float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 59, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 107, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 48170), objArr3);
                    Camera2StreamConfigurationMap(str, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -1, -1, null, ((java.lang.String) objArr3[0]).intern(), null), (java.lang.String) null);
                }
                int i3 = getOutputMinFrameDuration + 13;
                getOutputSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        float complexToFraction2 = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((complexToFraction2 > 0.0f ? 1 : (complexToFraction2 == 0.0f ? 0 : -1)) + 32, 75 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (27733 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr4);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void sendRequestForODACertificateRenewal(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        getOutputSizes = (getOutputMinFrameDuration + 103) % 128;
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(packedPositionChild + 5, android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1560), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        float minVolume = android.media.AudioTrack.getMinVolume();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 11, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 542, (char) android.view.View.combineMeasuredStates(0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRanges(str, false, pushServiceListener);
        int i = getOutputSizes + 23;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public void sendRequestForODACertificateRenewal(java.lang.String str, boolean z, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        getOutputMinFrameDuration = (getOutputSizes + 71) % 128;
        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(4 - (keyRepeatDelay >> 16), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (1560 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(keyCodeFromString + 12, combineMeasuredStates + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2284), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRanges(str, z, pushServiceListener);
        int i = getOutputSizes + 23;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService
    public com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ReplenishmentPrepService getReplenishmentPrepService() {
        getOutputSizes = (getOutputMinFrameDuration + 125) % 128;
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(4 - (edgeSlop >> 16), android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 1560), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(8 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 564, (char) (34255 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.ArtificialStackFrames == null) {
            this.ArtificialStackFrames = new util.h.xy.ca.ma();
            getOutputSizes = (getOutputMinFrameDuration + 55) % 128;
        }
        return this.ArtificialStackFrames;
    }

    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final boolean z, final boolean z2, boolean z3, boolean z4) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.CoroutineDebuggingKt = false;
        com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener = new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.ca.b.13
            private static int getHighSpeedVideoSizesFor = 0;
            private static int getInputFormats = 1;
            private static int getInputSizeshNQ4ISI = -1231763763;
            private static int getOutputFormats = 0;
            private static int getOutputMinFrameDuration = 1;

            private static void getHighSpeedVideoFpsRangesFor(java.lang.String str2, int i, int i2, int i3, boolean z5, java.lang.Object[] objArr) {
                int i4 = getHighSpeedVideoSizesFor;
                int i5 = i4 + 27;
                getInputFormats = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = i4 + 57;
                getInputFormats = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                char[] charArray = str2.toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i];
                raVar.f2649 = 0;
                while (raVar.f2649 < i) {
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
                    int i7 = raVar.f2649;
                    cArr[i7] = (char) (cArr[i7] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (i2 > 0) {
                    getInputFormats = (getHighSpeedVideoSizesFor + 81) % 128;
                    raVar.f2648 = i2;
                    char[] cArr2 = new char[i];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
                    java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
                }
                if (z5) {
                    char[] cArr3 = new char[i];
                    raVar.f2649 = 0;
                    while (raVar.f2649 < i) {
                        getInputFormats = (getHighSpeedVideoSizesFor + 65) % 128;
                        cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                        raVar.f2649++;
                    }
                    cArr = cArr3;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
                getOutputFormats = (getOutputMinFrameDuration + 85) % 128;
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                provisioningServiceError.getCpsErrorCode();
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                provisioningServiceError.getErrorMessage();
                boolean highSpeedVideoFpsRangesFor = util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(str, z2);
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                if (!z) {
                    getOutputMinFrameDuration = (getOutputFormats + 73) % 128;
                    if (!highSpeedVideoFpsRangesFor) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\u0006\u0002\ufff9\uffff", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 165, true, objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\f\ufffe\u000f￪\u0001\u0003\n\uffff￪\u000b\uffff", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 159 - (android.view.KeyEvent.getMaxKeyCode() >> 16), false, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        countDownLatch.countDown();
                    }
                }
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                util.h.xy.ca.b.getOutputMinFrameDuration(util.h.xy.ca.b.this);
                int i = getOutputMinFrameDuration + 91;
                getOutputFormats = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 / 4;
                }
                countDownLatch.countDown();
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onUnsupportedPushContent(android.os.Bundle bundle) {
                int i = getOutputFormats + 93;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 != 0) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    countDownLatch.countDown();
                } else {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    countDownLatch.countDown();
                    throw new java.lang.ArithmeticException();
                }
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onServerMessage(java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                getOutputFormats = (getOutputMinFrameDuration + 61) % 128;
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                getOutputFormats = (getOutputMinFrameDuration + 35) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onComplete() {
                int i = getOutputMinFrameDuration + 13;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    boolean highSpeedVideoFpsRangesFor = util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(str, z2);
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    if (z || highSpeedVideoFpsRangesFor) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        util.h.xy.ca.b.getOutputMinFrameDuration(util.h.xy.ca.b.this);
                    } else {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\u0006\u0002\ufff9\uffff", 16777220 + android.graphics.Color.rgb(0, 0, 0), 2 - android.view.View.resolveSize(0, 0), 165 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\f\ufffe\u000f￪\u0001\u0003\n\uffff￪\u000b\uffff", 12 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 10 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 160 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        int i2 = getOutputFormats + 51;
                        getOutputMinFrameDuration = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    countDownLatch.countDown();
                    return;
                }
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(str, z2);
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                throw new java.lang.ArithmeticException();
            }
        };
        util.h.xy.ca.b bVar = (util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
        boolean m25840 = bVar.m25840();
        for (int i = 0; m25840 && i < 100000; i++) {
            m25840 = bVar.m25840();
        }
        if (m25840) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.KeyEvent.keyCodeFromString("") + 4, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 629, (char) (43261 - android.view.KeyEvent.getDeadChar(0, 0)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(11 - android.view.View.resolveSize(0, 0), 632 - android.view.View.combineMeasuredStates(0, 0), (char) android.graphics.Color.red(0), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            pushServiceListener.onComplete();
            getOutputMinFrameDuration = (getOutputSizes + 37) % 128;
        } else {
            try {
                byte[] m27419 = util.h.xy.t.mb.f2417.m27419();
                if (m27419 != null) {
                    getOutputSizes = (getOutputMinFrameDuration + 17) % 128;
                    if (!util.h.xy.ar.b.m25070(m27419)) {
                        util.h.xy.ar.b.m25074(m27419);
                        m25838(new java.lang.String(m27419), pushServiceListener);
                    }
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.view.Gravity.getAbsoluteGravity(0, 0) + 4, 628 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43261), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                getOutputMinFrameDuration = (getOutputSizes + 9) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((edgeSlop >> 16) + 11, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 633, (char) android.view.View.MeasureSpec.getSize(0), objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                    pushServiceListener.onComplete();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4, 628 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 43261), objArr5);
                    java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTapTimeout() >> 16) + 11, 632 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(""), objArr6);
                    util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
                    pushServiceListener.onComplete();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        try {
            if (countDownLatch.await(120L, java.util.concurrent.TimeUnit.SECONDS)) {
                if (this.CoroutineDebuggingKt) {
                    return getHighSpeedVideoFpsRanges(str, false, false);
                }
                return null;
            }
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(55 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 573 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-16774379) - android.graphics.Color.rgb(0, 0, 0)), objArr7);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr7[0]).intern());
        } catch (java.lang.InterruptedException unused2) {
            try {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTouchSlop() >> 8) + 55, 573 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 2837), objArr8);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr8[0]).intern());
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25838(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        android.content.Intent intent = new android.content.Intent(m24558, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.class);
        com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.setPushServiceListener(pushServiceListener);
        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(14 - (scrollDefaultDelay >> 16), 894 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        intent.putExtra(((java.lang.String) objArr[0]).intern(), str);
        com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.enqueueWork(m24558, intent);
        getOutputMinFrameDuration = (getOutputSizes + 65) % 128;
    }

    private void getHighSpeedVideoFpsRanges(final java.lang.String str, final boolean z, final com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        if (android.text.TextUtils.isEmpty(str) || pushServiceListener == null) {
            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(32 - (keyRepeatDelay >> 16), 75 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (27733 - android.graphics.Color.red(0)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.NULL_CONTEXT;
            float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 58, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 107, (char) (48218 - android.text.TextUtils.getTrimmedLength("")), objArr2);
                pushServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -1, -1, null, ((java.lang.String) objArr2[0]).intern(), null));
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.14
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getOutputMinFrameDuration = 1;
            private static char[] getOutputFormats = {7623, 58285, 57711, 59140, 58498, 60043, 59444, 59892, 61341, 60754, 62214, 61619, 63078, 62574, 62921, 64402, 63795, 65258, 64703, 49733, 49218, 49611, 51048, 50484, 51933, 51340, 52742, 53174, 40002, 25117, 24778, 26309, 25955, 27416, 27066, 26725, 28174, 27843, 29322, 28960, 30641, 30132, 29786, 31317, 30895, 32632, 32053, 17353};
            private static long getHighSpeedVideoSizesFor = -5951265753902652851L;

            private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr3) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizesFor))) ^ c;
                    rbVar.f2651++;
                }
                char[] cArr = new char[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 7) % 128;
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                }
                java.lang.String str2 = new java.lang.String(cArr);
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 41) % 128;
                objArr3[0] = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, pushServiceListener);
                    int Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                    if (Camera2StreamConfigurationMap2 != -91) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this, Camera2StreamConfigurationMap2);
                        return;
                    }
                    util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, pushServiceListener);
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> waitToComplete = new util.h.xy.d.md(str).getCardDetails(null).waitToComplete();
                    if (waitToComplete.isSuccessful()) {
                        if (waitToComplete.getResult().isVisaODACertificateExpired() || z) {
                            util.h.xy.bv.re reVar = new util.h.xy.bv.re();
                            reVar.m25755(str);
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709 = reVar.m25709();
                            if (m25709 != null) {
                                if (m25709.isSuccessful()) {
                                    util.h.xy.bv.rb result = m25709.getResult();
                                    if (result == null) {
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 20, 29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
                                        util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, 0, null, ((java.lang.String) objArr3[0]).intern(), null));
                                        return;
                                    }
                                    if (result.m25745() == util.h.xy.bv.rb.ra.f1061) {
                                        util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, result.m25751(), result.m25749(), null, result.m25742(), result.m25750()));
                                        return;
                                    } else {
                                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.14.4
                                            private static int Camera2StreamConfigurationMap = 0;
                                            private static int[] getHighSpeedVideoFpsRanges = {269735131, -8899308, 1744369922, -943298591, -1993895059, 1458180053, -1140885471, 1847414946, -1852874844, -34782126, 126172023, -577566459, 1253112489, -959750453, 1170036767, 947341451, 1650899924, -1479934504};
                                            private static int getHighSpeedVideoFpsRangesFor = 1;
                                            private static int getHighSpeedVideoSizes = 1;
                                            private static int getOutputMinFrameDuration;

                                            private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr4) {
                                                int length;
                                                int[] iArr2;
                                                int i2;
                                                util.h.xz.b.c cVar = new util.h.xz.b.c();
                                                char[] cArr = new char[4];
                                                char[] cArr2 = new char[iArr.length * 2];
                                                int[] iArr3 = getHighSpeedVideoFpsRanges;
                                                if (iArr3 != null) {
                                                    int length2 = iArr3.length;
                                                    int[] iArr4 = new int[length2];
                                                    for (int i3 = 0; i3 < length2; i3++) {
                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 9) % 128;
                                                        iArr4[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                                                    }
                                                    iArr3 = iArr4;
                                                }
                                                int length3 = iArr3.length;
                                                int[] iArr5 = new int[length3];
                                                int[] iArr6 = getHighSpeedVideoFpsRanges;
                                                if (iArr6 != null) {
                                                    int i4 = getHighSpeedVideoFpsRangesFor + 101;
                                                    Camera2StreamConfigurationMap = i4 % 128;
                                                    if (i4 % 2 != 0) {
                                                        length = iArr6.length;
                                                        iArr2 = new int[length];
                                                        i2 = 1;
                                                    } else {
                                                        length = iArr6.length;
                                                        iArr2 = new int[length];
                                                        i2 = 0;
                                                    }
                                                    while (i2 < length) {
                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                                                        iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                                                        i2++;
                                                        length = length;
                                                    }
                                                    iArr6 = iArr2;
                                                }
                                                java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
                                                cVar.f2626 = 0;
                                                while (cVar.f2626 < iArr.length) {
                                                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 109) % 128;
                                                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                                                    cArr[1] = (char) iArr[cVar.f2626];
                                                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                                                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                                                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                                                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                                                    util.h.xz.b.c.m27723(iArr5);
                                                    for (int i5 = 0; i5 < 16; i5++) {
                                                        cVar.f2627 ^= iArr5[i5];
                                                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                                        int i6 = cVar.f2627;
                                                        cVar.f2627 = cVar.f2625;
                                                        cVar.f2625 = i6;
                                                    }
                                                    int i7 = cVar.f2627;
                                                    cVar.f2627 = cVar.f2625;
                                                    cVar.f2625 = i7;
                                                    cVar.f2625 ^= iArr5[16];
                                                    cVar.f2627 ^= iArr5[17];
                                                    int i8 = cVar.f2627;
                                                    int i9 = cVar.f2625;
                                                    cArr[0] = (char) (cVar.f2627 >>> 16);
                                                    cArr[1] = (char) cVar.f2627;
                                                    cArr[2] = (char) (cVar.f2625 >>> 16);
                                                    cArr[3] = (char) cVar.f2625;
                                                    util.h.xz.b.c.m27723(iArr5);
                                                    cArr2[cVar.f2626 * 2] = cArr[0];
                                                    cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
                                                    cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
                                                    cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
                                                    cVar.f2626 += 2;
                                                }
                                                objArr4[0] = new java.lang.String(cArr2, 0, i);
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                getHighSpeedVideoSizes = (getOutputMinFrameDuration + 87) % 128;
                                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(new int[]{-16273891, -407917750}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr4);
                                                java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(new int[]{-500328111, -580475094, -645317334, 1400964178, 397717562, 1094490384}, 12 - android.text.TextUtils.indexOf("", "", 0), objArr5);
                                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                                                util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this).onComplete();
                                                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 109) % 128;
                                            }
                                        });
                                        return;
                                    }
                                }
                                util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, util.h.xy.cg.ra.m25922(m25709));
                                return;
                            }
                            return;
                        }
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.14.1
                            private static int Camera2StreamConfigurationMap = 1;
                            private static int getHighSpeedVideoSizes = 0;
                            private static int getOutputFormats = 1;
                            private static int getOutputMinFrameDuration;
                            private static char[] getInputSizeshNQ4ISI = {64279, 64275, 64298, 64300, 64301, 64284, 64305, 64285, 64272};
                            private static int getInputFormats = -1074857117;
                            private static boolean getHighSpeedVideoFpsRangesFor = true;
                            private static boolean getHighResolutionOutputSizeshNQ4ISI = true;

                            private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str2, java.lang.Object[] objArr4) {
                                int i2 = getHighSpeedVideoSizes + 95;
                                Camera2StreamConfigurationMap = i2 % 128;
                                if (i2 % 2 == 0) {
                                    throw null;
                                }
                                byte[] bytes = str2.getBytes("ISO-8859-1");
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 105) % 128;
                                byte[] bArr = bytes;
                                util.h.xz.b.md mdVar = new util.h.xz.b.md();
                                char[] cArr = getInputSizeshNQ4ISI;
                                if (cArr != null) {
                                    int length = cArr.length;
                                    char[] cArr2 = new char[length];
                                    for (int i3 = 0; i3 < length; i3++) {
                                        cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                                    }
                                    cArr = cArr2;
                                }
                                int i4 = (int) ((-3299939579226817547L) ^ getInputFormats);
                                if (!getHighResolutionOutputSizeshNQ4ISI) {
                                    if (!getHighSpeedVideoFpsRangesFor) {
                                        throw null;
                                    }
                                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 59) % 128;
                                    throw null;
                                }
                                mdVar.f2642 = bArr.length;
                                char[] cArr3 = new char[mdVar.f2642];
                                mdVar.f2643 = 0;
                                while (mdVar.f2643 < mdVar.f2642) {
                                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 43) % 128;
                                    cArr3[mdVar.f2643] = (char) (cArr[bArr[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
                                    mdVar.f2643++;
                                }
                                objArr4[0] = new java.lang.String(cArr3);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                getOutputFormats = (getOutputMinFrameDuration + 19) % 128;
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u0084\u0083\u0082\u0081", objArr4);
                                java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0084\u0089\u0087\u0088\u0084\u0089\u0088\u0086\u0087\u0086\u0085\u0082", objArr5);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                                util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this).onComplete();
                                getOutputFormats = (getOutputMinFrameDuration + 119) % 128;
                            }
                        });
                        return;
                    }
                    util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, 0, waitToComplete.getErrorCode(), str, waitToComplete.getErrorMessage(), null));
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, pushServiceListener);
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                    java.lang.String str2 = str;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(28 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.view.Gravity.getAbsoluteGravity(0, 0), (char) (33171 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr4);
                        sb.append(((java.lang.String) objArr4[0]).intern());
                        sb.append(e.getMessage());
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, 0, str2, sb.toString(), null));
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
        }).start();
    }

    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRanges(java.lang.String str, boolean z, boolean z2) {
        byte[] bArr;
        boolean z3;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError;
        getOutputMinFrameDuration = (getOutputSizes + 11) % 128;
        try {
            int outputMinFrameDuration = getOutputMinFrameDuration();
            if (outputMinFrameDuration != -91) {
                return getHighSpeedVideoFpsRangesFor(outputMinFrameDuration);
            }
            try {
                bArr = util.h.xy.t.mb.f2417.m27438(str.getBytes(util.h.xy.h.a.f2221));
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                bArr = null;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
            if (inputSizeshNQ4ISI != null) {
                return inputSizeshNQ4ISI;
            }
            if (util.h.xy.u.d.m27509(bArr).equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED)) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.REPLENISHMENT_NOT_ALLOWED;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 940 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, str, ((java.lang.String) objArr[0]).intern(), null);
            }
            util.h.xy.bv.g gVar = new util.h.xy.bv.g(z);
            gVar.m25693(str);
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709 = gVar.m25709();
            if (!m25709.isSuccessful()) {
                return util.h.xy.cg.ra.m25922(m25709);
            }
            util.h.xy.bv.rb result = m25709.getResult();
            if (result == null) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, 0, str, ((java.lang.String) objArr2[0]).intern(), null);
            }
            if (result.m25745() != util.h.xy.bv.rb.ra.f1061) {
                try {
                    z3 = java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1});
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError2 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, e.getMessage(), null);
                    getOutputSizes = (getOutputMinFrameDuration + 1) % 128;
                    inputSizeshNQ4ISI = provisioningServiceError2;
                    z3 = false;
                }
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError highSpeedVideoSizes = z2 != z3 ? getHighSpeedVideoSizes(str) : inputSizeshNQ4ISI;
                if (z) {
                    util.h.xy.ak.ma.f84.m24986(str, 4);
                    return getHighSpeedVideoSizesFor();
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(10 - android.graphics.Color.green(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1010, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                Camera2StreamConfigurationMap(((java.lang.String) objArr3[0]).intern());
                getOutputMinFrameDuration = (getOutputSizes + 75) % 128;
                return highSpeedVideoSizes;
            }
            int i = getOutputMinFrameDuration + 85;
            getOutputSizes = i % 128;
            if (i % 2 == 0) {
                result.m25749();
                throw null;
            }
            result.m25749();
            if (!z) {
                if (result.m25749() == 524) {
                    util.h.xy.cg.b.m25907().m25909(str);
                }
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, result.m25751(), result.m25749(), str, result.m25742(), result.m25750());
            }
            if (result.m25749() == 524) {
                util.h.xy.cg.b.m25907().m25909(str);
                provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, result.m25751(), result.m25749(), str, result.m25742(), result.m25750());
            } else if (result.m25749() == 559) {
                util.h.xy.ak.ma.f84.m24986(str, util.h.xy.ak.ma.f84.m24992(str) - 1);
                provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.TRANSACTION_RECORDS_SIGNATURE_VERIFICATION_FAILED, result.m25751(), result.m25749(), str, result.m25742(), result.m25750());
                provisioningServiceError.getCpsErrorCode();
                getOutputMinFrameDuration = (getOutputSizes + 45) % 128;
            } else {
                if (result.m25749() != 581) {
                    getOutputMinFrameDuration = (getOutputSizes + 23) % 128;
                    if (result.m25749() != 586 && result.m25749() != 589) {
                        provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, result.m25751(), result.m25749(), str, result.m25742(), result.m25750());
                    }
                }
                result.m25749();
                util.h.xy.ak.ma.f84.m24986(str, 0);
                provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.REPLENISHMENT_PERMANENT_ERROR, result.m25751(), result.m25749(), str, result.m25742(), result.m25750());
            }
            getOutputMinFrameDuration = (getOutputSizes + 117) % 128;
            return provisioningServiceError;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 783, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(e2.getMessage());
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, 0, str, sb.toString(), null);
        }
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoSizes(java.lang.String str) {
        getOutputMinFrameDuration = (getOutputSizes + 37) % 128;
        try {
            if (str != null) {
                if (util.h.xy.k.ra.f2243.m26968(str)) {
                    int i = getOutputMinFrameDuration + 29;
                    getOutputSizes = i % 128;
                    if (i % 2 == 0) {
                        util.h.xy.k.ra.f2243.m26946(str.getBytes(util.h.xy.h.a.f2221));
                        throw new java.lang.ArithmeticException();
                    }
                    util.h.xy.k.ra.f2243.m26946(str.getBytes(util.h.xy.h.a.f2221));
                }
                return null;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 16, 1019 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, str, ((java.lang.String) objArr[0]).intern(), null);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, 0, str, e.getMessage(), null);
        }
    }

    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoSizesFor() {
        final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError[] provisioningServiceErrorArr = {null};
        android.os.Bundle bundle = new android.os.Bundle();
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(6 - capsMode, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 773, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(3 - (maxKeyCode >> 16), 780 - keyCodeFromString, (char) (58483 - android.text.TextUtils.indexOf("", "", 0)), objArr2);
        bundle.putString(intern, ((java.lang.String) objArr2[0]).intern());
        float minVolume = android.media.AudioTrack.getMinVolume();
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 6, 812 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), (char) (40120 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(lastIndexOf + 19, 876 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        bundle.putString(intern2, ((java.lang.String) objArr4[0]).intern());
        int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString("");
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(14 - keyCodeFromString2, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 893, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr5);
        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        int keyCodeFromString3 = android.view.KeyEvent.keyCodeFromString("");
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(trimmedLength + 1, keyCodeFromString3 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL, (char) android.view.KeyEvent.normalizeMetaState(0), objArr6);
        bundle.putString(intern3, ((java.lang.String) objArr6[0]).intern());
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService provisioningBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        provisioningBusinessService.processIncomingMessage(bundle, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: util.h.xy.ca.b.15
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges;

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
                int i = getHighSpeedVideoFpsRanges + 69;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                    provisioningServiceErrorArr[1] = provisioningServiceError;
                } else {
                    provisioningServiceErrorArr[0] = provisioningServiceError;
                }
                countDownLatch.countDown();
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onUnsupportedPushContent(android.os.Bundle bundle2) {
                int i = getHighSpeedVideoFpsRanges;
                int i2 = ((i | 79) << 1) - (i ^ 79);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    int i3 = Camera2StreamConfigurationMap;
                    int i4 = ((i3 | 29) << 1) - (i3 ^ 29);
                    getHighSpeedVideoFpsRanges = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                throw new java.lang.ArithmeticException();
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onServerMessage(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                int i = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = ((i & 67) + (i | 67)) % 128;
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                int i2 = getHighSpeedVideoFpsRanges + 117;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onComplete() {
                int i = getHighSpeedVideoFpsRanges;
                int i2 = (i ^ 41) + ((i & 41) << 1);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    countDownLatch.countDown();
                } else {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    countDownLatch.countDown();
                    throw null;
                }
            }
        });
        try {
            countDownLatch.await(3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            getOutputSizes = (getOutputMinFrameDuration + 33) % 128;
        } catch (java.lang.InterruptedException e) {
            if (provisioningServiceErrorArr[0] != null) {
                provisioningServiceErrorArr[0] = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_TIMEOUT_ERROR, 0, -1, null, e.getMessage(), null);
                getOutputMinFrameDuration = (getOutputSizes + 69) % 128;
            }
        }
        return provisioningServiceErrorArr[0];
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getInputSizeshNQ4ISI() {
        try {
            if (util.h.xy.y.mb.m27700(util.h.xy.ag.a.m24556().m24558())) {
                return null;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.REPLENISHMENT_BLOCKED_SECURE_WALLET_ENROLLMENT_REQUIRED;
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(72 - (intValue >> 22), resolveOpacity + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ANGLE, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr);
                return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, null, ((java.lang.String) objArr[0]).intern(), null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, e.getMessage(), null);
        }
    }

    private void Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        int i = getOutputMinFrameDuration + 121;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(enrollingServiceListener, provisioningServicePinType);
        } else {
            getHighSpeedVideoFpsRangesFor(enrollingServiceListener, provisioningServicePinType);
            throw null;
        }
    }

    private void getHighSpeedVideoFpsRangesFor(final com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        int i = getOutputSizes + 105;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (enrollingServiceListener == null) {
            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(32 - keyCodeFromString, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 75, (char) (android.graphics.Color.green(0) + 27733), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.NULL_CONTEXT;
            int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(59 - (tapTimeout >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 107, (char) (48217 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr2);
            enrollingServiceListener.onError(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -1, -1, null, ((java.lang.String) objArr2[0]).intern(), null));
            return;
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.b.16
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getOutputFormats = 1;
            private static int getOutputMinFrameDurationlomOqCM;
            private static char[] getInputSizeshNQ4ISI = {64470, 64422, 64410, 64413, 64401, 64387, 64403, 64397, 64384, 64399, 64386, 64388, 64391, 64389, 64412, 64400, 64409, 64415, 64414, 64465, 64429, 64402, 64474};
            private static int getHighSpeedVideoSizesFor = -1074856970;
            private static boolean getInputFormats = true;
            private static boolean getOutputMinFrameDuration = true;

            private static void getHighSpeedVideoFpsRangesFor(int i2, java.lang.String str, java.lang.Object[] objArr3) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                byte[] bytes = str.getBytes("ISO-8859-1");
                util.h.xz.b.md mdVar = new util.h.xz.b.md();
                char[] cArr = getInputSizeshNQ4ISI;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                    }
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
                    cArr = cArr2;
                }
                int i4 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
                if (!getOutputMinFrameDuration) {
                    if (!getInputFormats) {
                        throw null;
                    }
                    throw null;
                }
                mdVar.f2642 = bytes.length;
                char[] cArr3 = new char[mdVar.f2642];
                mdVar.f2643 = 0;
                while (mdVar.f2643 < mdVar.f2642) {
                    cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i2] - i4);
                    mdVar.f2643++;
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                }
                objArr3[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                char c;
                getOutputFormats = (getOutputMinFrameDurationlomOqCM + 61) % 128;
                try {
                    util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, enrollingServiceListener);
                    int Camera2StreamConfigurationMap2 = util.h.xy.ca.b.Camera2StreamConfigurationMap();
                    if (Camera2StreamConfigurationMap2 == -91) {
                        try {
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            if (!util.h.xy.y.mb.m27700(util.h.xy.ag.a.m24556().m24558())) {
                                util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, enrollingServiceListener);
                                util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_BLOCKED_SECURE_WALLET_ENROLLMENT_REQUIRED;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0094\u0081\u008b\u0084\u0083\u0083\u0085\u008a\u0081\u0084\u0093\u008b\u0081\u0092\u008c\u0091\u0083\u0083\u008d\u0089\u008c\u0084\u0081\u0084\u0089\u008d\u008f\u0084\u0090\u0081\u008a\u008d\u0083\u008f\u0081\u008b\u008c\u0084\u008e\u0083\u0083\u008d\u0089\u008c\u0084\u0081\u008b\u0084\u0083\u0083\u0085\u008a\u0081\u0084\u0089\u0088\u0087\u0084\u0086\u0081\u0083\u0083\u0085\u0087\u0081\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                                util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, -1, null, ((java.lang.String) objArr3[0]).intern(), null));
                                return;
                            }
                            util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                            util.h.xy.ca.b.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.b.this, provisioningServicePinType);
                            util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.ACTIVATION_CODE);
                            util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, enrollingServiceListener);
                            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.16.2
                                private static int getHighSpeedVideoFpsRanges = 0;
                                private static int getHighSpeedVideoSizes = 1;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    enrollingServiceListener.onCodeRequired(new util.h.xy.ap.ma(util.h.xy.ca.b.getInputFormats(util.h.xy.ca.b.this)));
                                    int i2 = getHighSpeedVideoFpsRanges;
                                    getHighSpeedVideoSizes = ((i2 & 69) + (i2 | 69)) % 128;
                                }
                            });
                            return;
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                            e = e;
                            c = 2;
                            util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, enrollingServiceListener);
                            if (c != 1) {
                                if (c == 2) {
                                    util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, e.getMessage(), null));
                                    return;
                                }
                                return;
                            }
                            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                            java.lang.String highSpeedVideoSizesFor = util.h.xy.ca.b.getHighSpeedVideoSizesFor(util.h.xy.ca.b.this);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.keyCodeFromString("") + 127, "\u0081\u0097\u0089\u008d\u0089\u0089\u0084\u0081\u0086\u0088\u008b\u0085\u008b\u0086\u0081\u0096\u0084\u0083\u0083\u008d\u0089\u008c\u0084\u0081\u0089\u0084\u0086\u0095", objArr4);
                            sb.append(((java.lang.String) objArr4[0]).intern());
                            sb.append(e.getMessage());
                            util.h.xy.ca.b.getHighSpeedVideoSizes(util.h.xy.ca.b.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, 0, highSpeedVideoSizesFor, sb.toString(), null));
                            return;
                        }
                    }
                    int i2 = getOutputFormats + 27;
                    getOutputMinFrameDurationlomOqCM = i2 % 128;
                    if (i2 % 2 == 0) {
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, Camera2StreamConfigurationMap2);
                    } else {
                        util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this, Camera2StreamConfigurationMap2);
                        throw new java.lang.ArithmeticException();
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                    e = e2;
                    c = 1;
                }
            }
        }).start();
        getOutputMinFrameDuration = (getOutputSizes + 67) % 128;
    }

    private void getHighSpeedVideoFpsRangesFor(final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        provisioningServiceError.getErrorMessage();
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.5
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizesFor = 0;
            private static char getInputFormats = 45038;
            private static char getInputSizeshNQ4ISI = 16109;
            private static char getOutputFormats = 7567;
            private static char getOutputMinFrameDuration = 37825;

            private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
                int i2;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 43) % 128;
                char[] charArray = str.toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                while (eVar.f2630 < charArray.length) {
                    int i3 = getHighSpeedVideoFpsRanges + 125;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 == 0) {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630];
                        i2 = 1;
                    } else {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630 + 1];
                        i2 = 0;
                    }
                    int i4 = 58224;
                    while (i2 < 16) {
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                        i4 -= 40503;
                        i2++;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                }
                objArr[0] = new java.lang.String(cArr, 0, i);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 83) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("싸ꬸ廋≣", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("봞␀꾳\uf5dc扗苆겠陴⼝ᤢᕵභ", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.ca.b.getHighSpeedVideoFpsRanges(util.h.xy.ca.b.this).onError(provisioningServiceError);
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 69) % 128;
            }
        });
        getOutputSizes = (getOutputMinFrameDuration + 119) % 128;
    }

    private void Camera2StreamConfigurationMap(final java.lang.String str, final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError, final java.lang.String str2) {
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.3
            private static int getHighSpeedVideoFpsRanges = 0;
            private static char[] getHighSpeedVideoSizesFor = {42363, 42259, 42257, 42267, 42455, 42067, 42066, 42072, 42402, 42068, 42066, 42060, 42067, 42079, 42078, 42066};
            private static int getInputFormats = 1;
            private static int getOutputFormats = 1;
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoFpsRangesFor(int[] iArr, java.lang.String str3, java.lang.Object[] objArr) {
                int length;
                char[] cArr;
                int i;
                int i2 = getHighSpeedVideoFpsRanges + 75;
                getOutputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                byte[] bytes = str3.getBytes("ISO-8859-1");
                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr2 = getHighSpeedVideoSizesFor;
                if (cArr2 != null) {
                    int i7 = getHighSpeedVideoFpsRanges + 97;
                    getOutputFormats = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = cArr2.length;
                        cArr = new char[length];
                        i = 1;
                    } else {
                        length = cArr2.length;
                        cArr = new char[length];
                        i = 0;
                    }
                    while (i < length) {
                        cArr[i] = (char) (cArr2[i] ^ (-8125198844289309347L));
                        i++;
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 83) % 128;
                    }
                    cArr2 = cArr;
                }
                char[] cArr3 = new char[i4];
                java.lang.System.arraycopy(cArr2, i3, cArr3, 0, i4);
                if (bytes != null) {
                    char[] cArr4 = new char[i4];
                    maVar.f2631 = 0;
                    char c = 0;
                    while (maVar.f2631 < i4) {
                        if (bytes[maVar.f2631] == 1) {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        } else {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                        }
                        c = cArr4[maVar.f2631];
                        maVar.f2631++;
                    }
                    cArr3 = cArr4;
                }
                if (i6 > 0) {
                    char[] cArr5 = new char[i4];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    int i8 = i4 - i6;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i6);
                    java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i8);
                }
                if (i5 > 0) {
                    int i9 = getHighSpeedVideoFpsRanges + 47;
                    getOutputFormats = i9 % 128;
                    if (i9 % 2 == 0) {
                        maVar.f2631 = 1;
                    } else {
                        maVar.f2631 = 0;
                    }
                    while (maVar.f2631 < i4) {
                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                        maVar.f2631++;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (getInputFormats + 33) % 128;
                if (util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this) != null) {
                    util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                    if (str2 == null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{0, 4, 0, 0}, "\u0000\u0000\u0001\u0000", objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{4, 12, 197, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{0, 4, 0, 0}, "\u0000\u0000\u0001\u0000", objArr3);
                        util.h.xy.am.ma.m25027(((java.lang.String) objArr3[0]).intern(), str2);
                    }
                    util.h.xy.ca.b.Camera2StreamConfigurationMap(util.h.xy.ca.b.this).onError(str, provisioningServiceError);
                    getInputFormats = (getOutputMinFrameDuration + 67) % 128;
                }
                getOutputMinFrameDuration = (getInputFormats + 77) % 128;
            }
        });
        int i = getOutputMinFrameDuration + 117;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.8
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int[] getHighSpeedVideoFpsRangesFor = {3150705, -18866193, 599412990, -1448366361, 185517348, 1026122737, 2095374554, -1122314651, -1677098380, -1841982222, 608274770, 2029647877, 2085881399, -1370998648, -65494914, -727576537, 528972404, -1487759834};
            private static int getHighSpeedVideoSizesFor = 0;
            private static int getOutputFormats = 1;

            private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = getHighSpeedVideoFpsRangesFor;
                if (iArr2 != null) {
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 117) % 128;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i2 = 0;
                    while (i2 < length) {
                        iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                        i2++;
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 99) % 128;
                    }
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = getHighSpeedVideoFpsRangesFor;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i3 = 0;
                    while (i3 < length3) {
                        iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                        i3++;
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                cVar.f2626 = 0;
                while (cVar.f2626 < iArr.length) {
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr4);
                    for (int i4 = 0; i4 < 16; i4++) {
                        cVar.f2627 ^= iArr4[i4];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i5 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i5;
                    }
                    int i6 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i6;
                    cVar.f2625 ^= iArr4[16];
                    cVar.f2627 ^= iArr4[17];
                    int i7 = cVar.f2627;
                    int i8 = cVar.f2625;
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

            @Override // java.lang.Runnable
            public final void run() {
                getOutputFormats = (getHighSpeedVideoSizesFor + 29) % 128;
                if (util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this) != null) {
                    getOutputFormats = (getHighSpeedVideoSizesFor + 107) % 128;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-370067712, 506382124}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{680971898, 911549637, 700708894, 1072313677, 142659829, -1459505906}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr2);
                    util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this).onError(provisioningServiceError);
                    getOutputFormats = (getHighSpeedVideoSizesFor + 75) % 128;
                }
            }
        });
        int i = getOutputMinFrameDuration + 19;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private void Camera2StreamConfigurationMap(int i) {
        int i2 = getOutputSizes + 71;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(i));
            getOutputMinFrameDuration = (getOutputSizes + 47) % 128;
        } else {
            getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(i));
            throw new java.lang.ArithmeticException();
        }
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRangesFor(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.DEVICE_SUSPICIOUS, 0, -1, null, util.h.xy.ar.b.m25093(i), hashMap);
        getOutputMinFrameDuration = (getOutputSizes + 75) % 128;
        return provisioningServiceError;
    }

    private void Camera2StreamConfigurationMap(final java.lang.String str) {
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.b.7
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 0;
            private static int[] getHighSpeedVideoSizesFor = {-1921291922, -913359144, -633838590, 1575633739, -1723374735, -1431149057, -844045657, 1508975621, 1217470782, 1783797318, 795332511, -1490335109, -887554176, -259751537, 726759508, 864926038, -139973610, 1901924267};
            private static int getInputFormats = 1;

            private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
                int length;
                int[] iArr2;
                int i2;
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                int length2 = iArr.length;
                char[] cArr2 = new char[4];
                int[] iArr3 = getHighSpeedVideoSizesFor;
                if (iArr3 != null) {
                    int i3 = getHighSpeedVideoFpsRanges + 97;
                    getHighSpeedVideoFpsRangesFor = i3 % 128;
                    if (i3 % 2 != 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i2 = 1;
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        int i4 = getHighSpeedVideoFpsRanges + 87;
                        getHighSpeedVideoFpsRangesFor = i4 % 128;
                        if (i4 % 2 != 0) {
                            iArr2[i2] = (int) (iArr3[i2] % (-5569649899877129369L));
                        } else {
                            iArr2[i2] = (int) (iArr3[i2] ^ (-5569649899877129369L));
                            i2++;
                        }
                    }
                    iArr3 = iArr2;
                }
                int length3 = iArr3.length;
                int[] iArr4 = new int[length3];
                int[] iArr5 = getHighSpeedVideoSizesFor;
                if (iArr5 != null) {
                    int length4 = iArr5.length;
                    int[] iArr6 = new int[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length3);
                cVar.f2626 = 0;
                int i6 = getHighSpeedVideoFpsRangesFor + 37;
                getHighSpeedVideoFpsRanges = i6 % 128;
                int i7 = i6 % 2;
                while (cVar.f2626 < iArr.length) {
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr4);
                    for (int i8 = 0; i8 < 16; i8++) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                        cVar.f2627 ^= iArr4[i8];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i9 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i9;
                    }
                    int i10 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i10;
                    cVar.f2625 ^= iArr4[16];
                    cVar.f2627 ^= iArr4[17];
                    int i11 = cVar.f2627;
                    int i12 = cVar.f2625;
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

            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Object obj;
                if (util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this) != null) {
                    int i = getHighSpeedVideoSizes + 31;
                    getInputFormats = i % 128;
                    if (i % 2 == 0) {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{731116170, 129245781}, 2 >>> (android.view.KeyEvent.getMaxKeyCode() * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), objArr);
                        obj = objArr[0];
                    } else {
                        util.h.xy.ca.b.getHighSpeedVideoFpsRanges();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{731116170, 129245781}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4, objArr2);
                        obj = objArr2[0];
                    }
                    util.h.xy.am.ma.m25027(((java.lang.String) obj).intern(), str);
                    util.h.xy.ca.b.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.b.this).onComplete();
                }
                int i2 = getHighSpeedVideoSizes + 51;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
        });
        int i = getOutputSizes + 53;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x0d06, code lost:
    
        if (r1 == (-91)) goto L185;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getOutputMinFrameDuration() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        java.lang.String str;
        byte[] bArr4;
        java.lang.String str2;
        int i;
        byte b;
        byte b2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
        java.lang.String str3 = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((byte) (89 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0001\u000f\r\u000e\u0017\u001f\u0016\u0013\b\u001f\"\u0003\u0005\u0011\u001a\u0002\u001e\f㙀", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, objArr2);
        java.lang.String str4 = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((byte) (android.text.TextUtils.getOffsetBefore("", 0) + 21), "\u0001\u000f\r\u000e\u0017\u001f\u0016\u0013\b\u001f\"\u0003\u001f\u0005\u0007\b\u0018\t\t\u0007\u0013\f\"\u0003㗽", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24, objArr3);
        java.lang.String str5 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((byte) (85 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u000f\r\u000e \u0005\t\u0012\u0018\u0016\u0015 \u000b\u001f\u000e\u0015 \u000e\u000f\u001f\u0018\u0016㙓", 'G' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
        java.lang.String str6 = (java.lang.String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr5);
        java.lang.String str7 = (java.lang.String) objArr5[0];
        try {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 95), "\u000e\u0007\u001e\u0013\u0002\u0016 \u001e\u0005\u0003\"\u0011\f\u0000\u001d\u001b", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr6);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (6 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), "\u001a\b\f\n\"\u0018㘃㘃\f\u0018\n\u0005㗺㗺\t\u0012\u001e\t㘄", 19 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
            if (((java.lang.Boolean) cls.getMethod((java.lang.String) objArr7[0], null).invoke(null, null)).booleanValue()) {
                return 803;
            }
            byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
            byte[] bArr5 = new byte[131];
            ((java.security.SecureRandom) java.lang.Class.forName(str7).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr5);
            byte[] bArr6 = new byte[128];
            byte[] bArr7 = new byte[3];
            util.h.xy.a.ra raVar = new util.h.xy.a.ra();
            raVar.m24514(util.h.xy.bv.rj.class);
            raVar.m24514(util.h.xy.bv.ri.class);
            raVar.m24514(util.h.xy.ca.a.class);
            raVar.m24514(util.h.xy.bv.md.class);
            raVar.m24514(util.h.xy.bv.e.class);
            raVar.m24514(util.h.xy.bv.mc.class);
            raVar.m24514(util.h.xy.bv.d.class);
            raVar.m24514(util.h.xy.ca.ra.class);
            raVar.m24514(util.h.xy.by.ma.class);
            raVar.m24514(util.h.xy.ce.mb.class);
            raVar.m24514(util.h.xy.ce.a.class);
            raVar.m24514(util.h.xy.ce.ra.class);
            raVar.m24514(util.h.xy.ah.ra.class);
            raVar.m24514(util.h.xy.bv.rc.class);
            raVar.m24514(util.h.xy.bv.c.class);
            raVar.m24514(util.h.xy.ad.a.class);
            raVar.m24514(util.h.xy.bv.mh.class);
            try {
                bArr3 = bArr7;
                try {
                    bArr = m25017;
                    bArr2 = bArr6;
                    try {
                        raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f143, new java.lang.Class[0]));
                    } catch (java.lang.Exception unused) {
                    }
                } catch (java.lang.Exception unused2) {
                    bArr = m25017;
                    bArr2 = bArr6;
                }
            } catch (java.lang.Exception unused3) {
                bArr = m25017;
                bArr2 = bArr6;
                bArr3 = bArr7;
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
            } catch (java.lang.Exception unused4) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
            } catch (java.lang.Exception unused5) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
            } catch (java.lang.Exception unused6) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f191, java.lang.String.class));
            } catch (java.lang.Exception unused7) {
            }
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName(str3);
                java.lang.String str8 = util.h.xy.al.b.f128;
                java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                bArr4 = bArr5;
                try {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    str = str6;
                    try {
                        getHighSpeedVideoFpsRangesFor(127 - android.graphics.Color.red(0), "\u0086\u008b\u0082\u0087\u008a\u0095\u008a\u008b\u0089\u0086\u0094\u0084\u008b\u0089\u0086\u0087\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr8);
                        clsArr[0] = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        raVar.m24514(cls2.getMethod(str8, clsArr));
                    } catch (java.lang.Exception unused8) {
                    }
                } catch (java.lang.Exception unused9) {
                    str = str6;
                }
            } catch (java.lang.Exception unused10) {
                str = str6;
                bArr4 = bArr5;
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
            } catch (java.lang.Exception unused11) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
            } catch (java.lang.Exception unused12) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
            } catch (java.lang.Exception unused13) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
            } catch (java.lang.Exception unused14) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused15) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused16) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused17) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
            } catch (java.lang.Exception unused18) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
            } catch (java.lang.Exception unused19) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
            } catch (java.lang.Exception unused20) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
            } catch (java.lang.Exception unused21) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
            } catch (java.lang.Exception unused22) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
            } catch (java.lang.Exception unused23) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
            } catch (java.lang.Exception unused24) {
            }
            try {
                java.lang.Class<?> cls3 = java.lang.Class.forName(str3);
                java.lang.String str9 = util.h.xy.al.b.f193;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0086\u008b\u0082\u0087\u008a\u0095\u008a\u008b\u0089\u0086\u0094\u0084\u008b\u0089\u0086\u0087\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr9);
                raVar.m24514(cls3.getMethod(str9, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr9[0])));
            } catch (java.lang.Exception unused25) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
            } catch (java.lang.Exception unused26) {
            }
            try {
                java.lang.Class<?> cls4 = java.lang.Class.forName(str3);
                java.lang.String str10 = util.h.xy.al.b.f108;
                java.lang.Class<?>[] clsArr2 = new java.lang.Class[3];
                clsArr2[0] = java.lang.String.class;
                clsArr2[1] = byte[].class;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                str2 = str5;
                try {
                    getHighResolutionOutputSizeshNQ4ISI((byte) (36 - android.graphics.Color.argb(0, 0, 0, 0)), "\u0010\u0017\u0001\u000f\r\u000e \u0005\t\u0012\u0018\u0016\u0015 \u000b\u001f\u0012\t\u0015\u001e\u0005\u0011\f\u0018 \u0015\u0012\u0015\u0013\u000f\u001e\t㗅", android.text.TextUtils.indexOf("", "", 0) + 33, objArr10);
                    clsArr2[2] = java.lang.Class.forName((java.lang.String) objArr10[0]);
                    raVar.m24514(cls4.getMethod(str10, clsArr2));
                } catch (java.lang.Exception unused27) {
                }
            } catch (java.lang.Exception unused28) {
                str2 = str5;
            }
            try {
                java.lang.Class<?> cls5 = java.lang.Class.forName(str3);
                java.lang.String str11 = util.h.xy.al.b.f108;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr11);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((byte) (36 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), "\u0010\u0017\u0001\u000f\r\u000e \u0005\t\u0012\u0018\u0016\u0015 \u000b\u001f\u0012\t\u0015\u001e\u0005\u0011\f\u0018 \u0015\u0012\u0015\u0013\u000f\u001e\t㗅", 33 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                raVar.m24514(cls5.getMethod(str11, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr11[0]), char[].class, java.lang.Class.forName((java.lang.String) objArr12[0])));
            } catch (java.lang.Exception unused29) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused30) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
            } catch (java.lang.Exception unused31) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
            } catch (java.lang.Exception unused32) {
            }
            try {
                raVar.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
            } catch (java.lang.Exception unused33) {
            }
            try {
                raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f147, new java.lang.Class[0]));
            } catch (java.lang.Exception unused34) {
            }
            try {
                raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f131, new java.lang.Class[0]));
            } catch (java.lang.Exception unused35) {
            }
            try {
                raVar.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f188, new java.lang.Class[0]));
            } catch (java.lang.Exception unused36) {
            }
            try {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getTrimmedLength("") + 127, "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u0086\u008b\u0082\u0083\u008a\u0089\u0097\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr13);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr13[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
            } catch (java.lang.Exception unused37) {
            }
            try {
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u0086\u008b\u0082\u0083\u008a\u0089\u0097\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr14);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr14[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
            } catch (java.lang.Exception unused38) {
            }
            try {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.view.View.MeasureSpec.getSize(0), "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u0086\u008b\u0082\u0083\u008a\u0089\u0097\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr15);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr15[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
            } catch (java.lang.Exception unused39) {
            }
            try {
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u0086\u008b\u0082\u0083\u008a\u0089\u0097\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr16);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr16[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            } catch (java.lang.Exception unused40) {
            }
            try {
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u008b\u0086\u0089\u0087\u0086\u008d\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr17);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr17[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            } catch (java.lang.Exception unused41) {
            }
            try {
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u008b\u0086\u0089\u0087\u0086\u008d\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr18);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr18[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
            } catch (java.lang.Exception unused42) {
            }
            try {
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 127, "\u008c\u0089\u008b\u008f\u0098\u008c\u0086\u0093\u008b\u0086\u0089\u0087\u0086\u008d\u0096\u0086\u0089\u0091\u008b\u008d\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr19);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr19[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            } catch (java.lang.Exception unused43) {
            }
            try {
                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            } catch (java.lang.Exception unused44) {
            }
            try {
                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
            } catch (java.lang.Exception unused45) {
            }
            try {
                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            } catch (java.lang.Exception unused46) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
            } catch (java.lang.Exception unused47) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
            } catch (java.lang.Exception unused48) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f153, java.lang.Object.class));
            } catch (java.lang.Exception unused49) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f139, new java.lang.Class[0]));
            } catch (java.lang.Exception unused50) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f166, java.util.function.BiConsumer.class));
            } catch (java.lang.Exception unused51) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f167, java.lang.Object.class));
            } catch (java.lang.Exception unused52) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
            } catch (java.lang.Exception unused53) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f154, new java.lang.Class[0]));
            } catch (java.lang.Exception unused54) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f168, java.lang.Object.class, java.lang.Object.class));
            } catch (java.lang.Exception unused55) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f92, java.util.Map.class));
            } catch (java.lang.Exception unused56) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
            } catch (java.lang.Exception unused57) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class, java.lang.Object.class));
            } catch (java.lang.Exception unused58) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class));
            } catch (java.lang.Exception unused59) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class));
            } catch (java.lang.Exception unused60) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f91, java.util.function.BiFunction.class));
            } catch (java.lang.Exception unused61) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused62) {
            }
            try {
                raVar.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f176, new java.lang.Class[0]));
            } catch (java.lang.Exception unused63) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(util.h.xy.al.b.f117).getMethod(util.h.xy.al.b.f132, java.lang.String.class, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused64) {
            }
            try {
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 95), "\u000e\u0007\u001e\u0013\u0002\u0016 \u001e\u0005\u0003\"\u0011\f\u0000\u001d\u001b", 17 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr20);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr20[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
            } catch (java.lang.Exception unused65) {
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    raVar.m24514(android.content.pm.SigningInfo.class.getMethod(util.h.xy.al.b.f127, new java.lang.Class[0]));
                }
            } catch (java.lang.Exception unused66) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f121, javax.net.ssl.KeyManager[].class, javax.net.ssl.TrustManager[].class, java.lang.Class.forName(str7)));
            } catch (java.lang.Exception unused67) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused68) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused69) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused70) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Object.class));
            } catch (java.lang.Exception unused71) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Integer.TYPE, java.lang.Object.class));
            } catch (java.lang.Exception unused72) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.util.Collection.class));
            } catch (java.lang.Exception unused73) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.lang.Integer.TYPE, java.util.Collection.class));
            } catch (java.lang.Exception unused74) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
            } catch (java.lang.Exception unused75) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
            } catch (java.lang.Exception unused76) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f148, java.lang.Object.class));
            } catch (java.lang.Exception unused77) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f167, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused78) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f149, java.lang.Object.class));
            } catch (java.lang.Exception unused79) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
            } catch (java.lang.Exception unused80) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f162, new java.lang.Class[0]));
            } catch (java.lang.Exception unused81) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, new java.lang.Class[0]));
            } catch (java.lang.Exception unused82) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused83) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused84) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
            } catch (java.lang.Exception unused85) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f178, java.util.Collection.class));
            } catch (java.lang.Exception unused86) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f177, java.lang.Integer.TYPE, java.lang.Object.class));
            } catch (java.lang.Exception unused87) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused88) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, new java.lang.Class[0]));
            } catch (java.lang.Exception unused89) {
            }
            try {
                raVar.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, java.lang.Object[].class));
            } catch (java.lang.Exception unused90) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused91) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused92) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused93) {
            }
            try {
                java.lang.Class<?> cls6 = java.lang.Class.forName(str4);
                java.lang.String str12 = util.h.xy.al.b.f121;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u008c\u0086\u0093\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr21);
                raVar.m24514(cls6.getMethod(str12, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr21[0])));
            } catch (java.lang.Exception unused94) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f192, byte[].class));
            } catch (java.lang.Exception unused95) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f192, byte[].class, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused96) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused97) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused98) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused99) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str7)));
            } catch (java.lang.Exception unused100) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
            } catch (java.lang.Exception unused101) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused102) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused103) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused104) {
            }
            try {
                java.lang.Class<?> cls7 = java.lang.Class.forName(str);
                java.lang.String str13 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.os.Process.myPid() >> 22), "\u008c\u0086\u0093\u0086\u008b\u0082\u0083\u008a\u0089\u0097\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr22);
                raVar.m24514(cls7.getMethod(str13, java.lang.Class.forName((java.lang.String) objArr22[0])));
            } catch (java.lang.Exception unused105) {
            }
            try {
                java.lang.Class<?> cls8 = java.lang.Class.forName(str);
                java.lang.String str14 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u008c\u0086\u0093\u0086\u008b\u0082\u0083\u008a\u0089\u0097\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr23);
                raVar.m24514(cls8.getMethod(str14, java.lang.Class.forName((java.lang.String) objArr23[0]), java.lang.Class.forName(str7)));
            } catch (java.lang.Exception unused106) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f196, byte[].class));
            } catch (java.lang.Exception unused107) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
            } catch (java.lang.Exception unused108) {
            }
            try {
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((byte) (79 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "\u000e\u0007\u001e\u0013\u0002\u0016 \u001e\u0000\b\u0016\u001b\u0013\u0015\u001f\t\"\u000b\u0007\b\u0003 \u0000\u0016\u000b\u001e\u0000\u0007\r\u001f\u0016\u0000\u001e\t\u001b\u0003\u0016\u0002\u000b\u0002\u0004\u0018\u0016 \u001e\u0007㘸", 46 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr24);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr24[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
            } catch (java.lang.Exception unused109) {
            }
            try {
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 80), "\u000e\u0007\u001e\u0013\u0002\u0016 \u001e\u0000\b\u0016\u001b\u0013\u0015\u001f\t\"\u000b\u0007\b\u0003 \u0000\u0016\u000b\u001e\u0000\u0007\r\u001f\u0016\u0000\u001e\t\u001b\u0003\u0016\u0002\u000b\u0002\u0004\u0018\u0016 \u001e\u0007㘸", android.view.View.combineMeasuredStates(0, 0) + 47, objArr25);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr25[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused110) {
            }
            try {
                java.lang.String str15 = util.h.xy.al.b.f105;
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 128, "\u009f\u0086\u008b\u0082\u0087\u008a\u0095\u008a\u008b\u0089\u0086\u0094\u009e\u009d\u009c\u009b\u0084\u008b\u0089\u0086\u0087\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081\u009a\u0099", objArr26);
                raVar.m24514(util.h.xy.df.a.class.getMethod(str15, java.lang.Class.forName((java.lang.String) objArr26[0]), java.lang.String.class));
            } catch (java.lang.Exception unused111) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused112) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused113) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused114) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f121, java.lang.Class.forName(str3)));
            } catch (java.lang.Exception unused115) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f93, new java.lang.Class[0]));
            } catch (java.lang.Exception unused116) {
            }
            try {
                raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
            } catch (java.lang.Exception unused117) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f133, byte[].class));
            } catch (java.lang.Exception unused118) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused119) {
            }
            try {
                raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
            } catch (java.lang.Exception unused120) {
            }
            try {
                try {
                    byte[] bArr8 = bArr4;
                    byte[] m27594 = util.h.xy.v.b.f2439.m27594(bArr8, util.h.xy.a.ma.m24504(raVar));
                    try {
                        int m24553 = util.h.xy.af.mb.m24551().m24553(m27594[0]);
                        if (m24553 != -91) {
                            if (m24553 != 111) {
                                return m24553;
                            }
                            try {
                                int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str7).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                try {
                                    java.lang.Object[] objArr27 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt)};
                                    java.lang.Object obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                    if (obj == null) {
                                        java.lang.Class cls9 = (java.lang.Class) util.h.xy.dd.b.m26271((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47455), 20 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(objArr28);
                                        java.lang.String str16 = (java.lang.String) objArr28[0];
                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u008b \u0086\u008b\u008f\u0091\u0094\u0084\u008b\u008f\u0086\u008b\u008f\u0091\u0087\u0084\u0090\u008a\u0091\u0089\u0090\u008f\u0082", objArr29);
                                        obj = cls9.getMethod(str16, java.lang.Class.forName((java.lang.String) objArr29[0]), java.lang.Integer.TYPE);
                                        util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                    }
                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr27)).intValue() != nextInt) {
                                        return com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                    }
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
                        }
                        int i2 = 131;
                        byte[] bArr9 = new byte[131];
                        int i3 = 0;
                        while (i3 < i2) {
                            int i4 = i3 + 1;
                            bArr9[i3] = m27594[i4];
                            i3 = i4;
                            i2 = 131;
                        }
                        for (int i5 = 0; i5 < i2; i5++) {
                            byte b3 = (byte) (bArr9[i5] ^ bArr[i5]);
                            bArr9[i5] = b3;
                            bArr9[i5] = (byte) (b3 ^ bArr8[i5]);
                        }
                        for (int i6 = 0; i6 < 128; i6++) {
                            bArr2[i6] = bArr9[i6];
                        }
                        for (int i7 = 0; i7 < 3; i7++) {
                            bArr3[i7] = bArr9[i7 + 128];
                        }
                        i = 0;
                    } catch (java.io.UnsupportedEncodingException unused121) {
                        i = 0;
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused122) {
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, android.view.View.resolveSizeAndState(0, 0, 0) + 1188, (char) (41852 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr30);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr30[0]).intern());
                }
            } catch (java.io.UnsupportedEncodingException unused123) {
                i = 0;
            }
            try {
                byte b4 = bArr3[0];
                if ((b4 != 0 || bArr3[1] != 0 || bArr3[2] != 0) && b4 >= 0 && (b = bArr3[1]) >= 0 && (b2 = bArr3[2]) >= 0 && b4 != b && b != b2 && b4 != b2) {
                    byte b5 = bArr2[b4];
                    byte b6 = bArr2[b];
                    byte b7 = bArr2[b2];
                    if (b5 < b6 && b5 >= 0 && b5 <= 100 && b6 >= 0 && b6 <= 100 && b7 >= 0 && b7 <= 100) {
                        if (b7 < b5) {
                            return 801;
                        }
                        if (b7 < b6 && b7 >= b5 && b7 < b6) {
                            try {
                                int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str7).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                try {
                                    java.lang.Object[] objArr31 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt2)};
                                    java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                                    if (obj2 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) util.h.xy.dd.b.m26271(123 - android.text.TextUtils.getOffsetAfter("", 0), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 47455), android.text.TextUtils.getCapsMode("", 0, 0) + 21);
                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(objArr32);
                                        java.lang.String str17 = (java.lang.String) objArr32[0];
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u008b \u0086\u008b\u008f\u0091\u0094\u0084\u008b\u008f\u0086\u008b\u008f\u0091\u0087\u0084\u0090\u008a\u0091\u0089\u0090\u008f\u0082", objArr33);
                                        obj2 = cls10.getMethod(str17, java.lang.Class.forName((java.lang.String) objArr33[0]), java.lang.Integer.TYPE);
                                        util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                                    }
                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr31)).intValue() != nextInt2) {
                                        return com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
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
                }
                try {
                    if (!util.h.xy.by.ma.f1067.m25806() && !((util.h.xy.ca.ra) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getEnrollingBusinessService()).m25844()) {
                        try {
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(android.graphics.Color.rgb(0, 0, 0) + 16777236, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1204, (char) (40873 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr34);
                            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr34[0]).intern());
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause5 = th5.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th5;
                        }
                    }
                    return -91;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e.getLocalizedMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1224, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr35);
                    sb.append(((java.lang.String) objArr35[0]).intern());
                    sb.append(e.getMessage());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString(), e);
                }
            } catch (java.io.UnsupportedEncodingException unused124) {
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.graphics.Color.alpha(i) + 20, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i, i) + 1169, (char) (android.text.TextUtils.indexOf("", "", i, i) + 32129), objArr36);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr36[i]).intern());
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m25840() {
        int i = getOutputSizes + 51;
        getOutputMinFrameDuration = i % 128;
        boolean z = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25839(boolean z) {
        int i = getOutputSizes;
        int i2 = i + 33;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = z;
            getOutputMinFrameDuration = (i + 81) % 128;
        } else {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = z;
            throw null;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputStallDurationlomOqCM = new char[]{41886, 41879, 41903, 41910, 41907, 41976, 41913, 41893, 41906, 41884, 41911, 41887, 41898, 41917, 41959, 41871, 41880, 41863, 41902, 41892, 41909, 41919, 41872, 41914, 41908, 41868, 41915, 41883, 41897, 41885, 41918, 41912, 41900, 41896, 41904, 41970};
        getOutputStallDuration = (char) 38464;
        getOutputFormats = new char[]{64379, 64368, 64367, 64423, 64354, 64380, 64370, 64364, 64355, 64376, 64365, 64360, 64386, 64387, 64359, 64381, 64358, 64356, 64410, 64402, 64383, 64445, 64385, 64412, 64394, 64389, 64393, 64428, 64417, 64424, 64426, 64361};
        getInputFormats = -1074857007;
        getHighResolutionOutputSizeshNQ4ISI = true;
        getOutputMinFrameDurationlomOqCM = true;
    }

    static void getHighSpeedVideoSizes() {
        char[] cArr = new char[1251];
        java.nio.ByteBuffer.wrap("\u009aUÄ\u000b&Ô\u0080\u008c\u009cQÂ\u0001 Ö\u0086\u008eå'K\u0002[õ\u0005¥çrA*\"\u0083\u008c½\u009cQÂ\u0001 Ö\u0086\u008eå'K\u001b©Ä\u000f\u0082i\u00167FÕ\u0091sÉ\u0010`¾^\\\u0099µÈë\u0098\tO¯\u0017Ì¾b\u0095\u0080W&\u0002\u001døC¨¡\u007f\u0007'd\u008eÊ±(e\u008e%û\u0010¥@G\u0097áÏ\u0082f,YÎ\u008dhÍ\tb\u009cQÂ\u0001 Ö\u0086\u008eå'K\u0018©ß\u000f\u0089nCÞ]\u0080\rbÚÄ\u0082§+\t\u0014ëÓM\u0085,O\u008emð\u0019®sL¤êú\u00893'zÅøcê\u0002% t^¡üï\u009b)9z×\u00aduø\u0014\u0007²\u0016P\u0093\u000eÓ\u00ad\u0012KPé\u0097\u0087Î&DÄDb\u0085\u0000\u0082¿\u0002][û\u0084\u0099Æ \u0018~v\u009c±:éY6÷i\u0015£³µÒ\"pz\u008eï,ãK6ém\u0007«¥©Ä[bI\u0080\u0093ÞØ}\u0012\u009bB9\u0092W\u0095ö\u0006\u0014H²\u0084ÐÈoC\u008dR+\u0092I×è~\u0006ù¤üÃ2a}¿¥Ýò|-\u009a\u007f8éVæõ>\u0013#±²Ïân1\u008c\u001b*\u008dHÐç]\u0005G£\u0099ÁÒ`U¾xÜ\u00adzä\u009cSÂ& õ\u0086«ålK%©ä\u000f¼nyÌs2÷\u0090»÷vU8»ö\u0019ºxEÞC<Áb\u0092ÁL'K\u0085Ýë\u008aJC¨\u001e\u000eÔl\u0099Ó\\1\u0015\u0097ÉõßT\u0004ºñ\u0018·\u007fhÝ;\u0003§aíÀ_&=\u0084öê´Id¯<\r»sªÒv0\u0011\u0096ÆôÅ[D¹\b\u001fÙ}\u0089è\u0007¶uT¸ò÷\u00911?{Ýø{ô\u001a+¸rFàäò\u0083>!kÏ»mï\f\u001aªB\u0015uK\u0010©Ì\u000f\u009flFÂ\u0018 Ñ\u0086\u009eç\fE+»Ú\u0019\u0098~KÜ\u00142\u008c\u0090Â\u009cQÂ\" ü\u0086ªålK%©ù\u000f\u008cnyÌ22û\u0090¹÷|U7»½\u0019±xNÞ\u0017<\u0085b\u0086ÁJ'\b\u0085Èë\u009cJB¨\u001a\u000e×l\u009bÓ\\1[¸7æN\u0004\u0087¢ÆÁ\u0006oM\u008dÎ+ØJ\u001dè\u0010\u0016¤´ÑÓ\nqT\u009f\u009b=Ò\\+ús\u0018®F¨åj\u0003X¡¢Ïén3\u008cc*³H´÷\u001b\u0015m³ªÑôpG\u009e\u008e<Ò[\rùI'\u0089EÚä\t\u009cTÂ- ä\u0086¥åeK.©\u00ad\u000f»n~Ìs2Â\u0090¾÷iU>»½\u0019\u009exMÞ\u000f<\u0085\u009cTÂ- ä\u0086¥åeK.©\u00ad\u000f»n~Ìs2Ç\u0090²÷xU?»½\u0019\u008bxSÞ\u0002<Ëb\u0094ÁH'\b\u0085Ùë\u0086J^¨\u001d\u000e\u0095l\u009bÓV1\u001c\u0097\u009d\u0085¤ÛÝ9\u0014\u009fUü\u0095RÞ°]\u0016Kw\u008eÕ\u0083+7\u0089Bî\u0088LÏ¢M\u0000la£Çö%1{rØ·>ï\u009c4ò~S\u00ad±ð\u0017e\u009cSÂ\u0006 Õ\u0086\u0086åBK\u0018©ÇfM8\u0018ÚË|\u009e\u001fV±\u001b\u009cSÂ\u0006 Õ\u0086\u0080åEK\u0000Xã\u0006¸ä`BI!\u0087\u008fÅm\u0003ËAª\u009f\bÝö\u001bTC3\u0097\u009c!Â/ à\u0086©å3KkÖ \u0088òjWÌ\u0015¯Û\u0001\u0099ã_E\u001d$Ã\u0086\u0081xGÚ\u001f½Ë\u009c@Â\u0013 Ì\u0086çå)Kk©\u00ad\u000fïn1Ìs2µ\u0090í÷9¨'ö^\u0014\u0097²ÖÑ\u0016\u007f]\u009dÞ;ÈZ\rø\u0000\u0006µ¤ÐÃ\u0005aZ\u008f\u008b-\u008cL\u0006êb\b·Vúõ)\u0013y±½ßè~+\u009co:¨X¤ç\u0006\u0005g£©Áÿ`\u0012\u009cWÂ\u0017 Ö\u0086çåJK9©è\u000f«ntÌ=2á\u0090¾÷xU7»î\u0019ÿx@Þ\u0011<ÀbÇÁG'\u0004\u0085ÙëÏJ^¨\u0018\u009cQÂ\u0001 Ö\u0086\u008eå'K\u001e©Ý\u000f\u009b\u009cQÂ\u0001 Ö\u0086\u008eå'K\f©Ì\u000f\u009b\u009cQÂ\u0001 Ö\u0086\u008eå'K\u0018©ß\u000f\u0089n^Ì\u00102Ç\u0094½Êí(:\u008ebíËCô¡3\u0007ef²Äü:?\u0098i\u0019\u009eGÎ¥\u0019\u0003A`èÎÃ,\u0010\u008aPë\u008d\u0097AÉ8+ñ\u008d°îp@;¢¸\u0004®ekÇf9ã\u009b\u00adüb^ °í\u0012©s@ÕV7Äi\u009dÊ\u001c,\n\u008eÐà\u009fA\u0004£\u0015\u0005Åg\u0090ØZ:\u000b\u009cÚþÊ_z±¶\u0013\u0082twÖ(\bìj¡Ë:-*\u008fãá´Bu¤#\u0006üx£Ù*;\u0000\u009dßÿ\u009dPW²\u0013\u0014Ëv\u008c4°jî\u00881.y\u009cQÂ\u0001 Ö\u0086éåLK\f©Ã\u000f\u008cn?Ì\u001c2Ö\u009cUÂ+ à\u0086µålKk©ä\u000f¼n1Ì 2á\u0090¾÷uU7»½\u0019¾xOÞC<Êb\u0089Á\u0004'\f\u0085Âë\u0086J_¨\u0014\u000e\u0095l´Ói1(\u0097\u009dõ\u008dT$ºò\u0018°\u007fbÝ:\u0003ÿaì\u009cOÂ, ¥\u0086¤åfK%©û\u000fªncÌ 2ô\u0090£÷pU4»ó\u0019ÿxhÞ'<\u0085b\u0081ÁF'\u001e\u0085Ãë\u008bJ\u0010\u009cTÂ- ä\u0086¥åeK.©\u00ad\u000f»n~Ìs2ù\u0090¸÷xU?»½\u0019«xIÞ\u0006<\u0085b\u0084ÁF'\u0005\u0085Ûë\u008aJC¨\u0000\u000eÔl\u0083ÓP1\u0014\u0097ÓõßT\bºÇ\u0018å\u007f=Ýi\u009cQÂ\u0001 Ö\u0086éåYK\u0002©À\u000fánDÌ\u00032ÖZ!\u0004tæ½@\u0094#\u0014\u008dWo\u008aÉ\u009c¨\u000b\nNô\u008fVÐ1\u0003\u0093I}\u0082ßÅ¾(\u0018uú²\u009crÂ& ë\u0086£ålK9x1&`Ä¥\u009cTÂ0 à\u0086µå)K.©ã\u000f½n~Ì?2ù\u0090²÷}U{»î\u0019«x@Þ\u0017<Ðb\u0094Á\t'\u000e\u0085ßë\u009dJ^¨\u0001\u000e\u0099l×\u0000Ø^\u0098¼I\u001a\u0016yÞ×\u009d\u0004ÖZ\u009b¸H\u001eg}×Ó¸1d\u0097%öçT¨ªv\b\u0000oðÍ¦\u009cQÂ1 ê\u0086±å`K8©ä\u000f n\u007fÌ:2û\u0090°÷JU>»ï\u0019©xHÞ\u0000<ÀbªÁL'\u0018\u0085Þë\u008eJV¨\u0016\u000e\u0095l\u009eÓJ1[\u0097Óõ\u008aT-ºï\u009cQÂ\u0001 Ö\u0086éåYK\u0002©À\u000fán^Ì\u00002Ø\u009cBÂ\u0013 Ö\u0086ýåNK.©ù\u000f\u0081ntÌ+2á\u0090\u0094÷vU6»ð\u0019¾xOÞ\u0007\u009cbÂ, ë\u0086±ålK9©þ\u000f®neÌ:2ú\u0090¹÷PU?\u009cBÂ, ë\u0086±ålK9©þ\u000f®neÌ:2ú\u0090¹÷9U\u0012»Ù\u0019ÿxHÞ\u0010<\u0085b\u0089Á\\'\u0007\u0085ÁëÏJ^¨\u0001\u000e\u0095l\u0092ÓT1\u000b\u0097Éõ\u0086\u009cUÂ+ à\u0086çåjK*©ÿ\u000f«n1Ì:2æ\u0090÷÷JU\u000e»Î\u0019\u008fxdÞ-<áb¢Ám'E\u0085ÿë\u008aJA¨\u001f\u000eÐl\u0099ÓP1\b\u0097Ðõ\u009aT/º÷\u0018å\u007fnÝ:\u0003«a£À`&%\u0084³ê´I{¯5\rôsªÒz0\u0005\u0096\u008d\u009cBÂ\u0013 Ö\u0086çå[K.©þ\u000f¿n~Ì=2æ\u0090²÷9U2»î\u0019ÿxOÞ\u0016<Éb\u008b\u009cQÂ\u0001 Ö\u0086éåZK\u0019©ß\u000fán^Ì\u0010\u009cUÂ, î\u0086¢ågKk©Ä\u000f«n1Ì:2æ\u0090÷÷wU.»ñ\u0019³\u009c1\u009c!Â\u0013 é\u0086¢åhK8©è\u000fïnrÌ22ù\u0090»÷9U(»ø\u0019¼xTÞ\u0011<ÀbÇÁ^'\n\u0085Áë\u0083JT¨\u0007\u000e\u0095l\u0092ÓW1\t\u0097Òõ\u0093T-ºî\u0018 \u007fiÝ=\u0003«a«Àc&>\u0084äêõIu¯<\rýs²Òm0\u0004\u0096\u0083ô\u0080[I¹\u001b\u001fÄ}\u0081ÜC\u0002\u0018`ÝÆ\u0092%\u0017\u008b\réÓO\u0098®\u001f\för¢Ñi7+\u0095ìû¿Z-¸n¥oû*\u0019ý¿ÂÜqr0\"c|3\u009eä8Û[kõ:\u0017û\u009cBÂ\u0013 Ö\u0086çåjK$©à\u000f¢ndÌ=2ö\u0090¶÷mU2»ò\u0019±x\u0001Þ\u0006<×b\u0095ÁF'\u0019\u0085\u0081ëÏJa¨\u001f\u000eÐl\u0096ÓJ1\u001e\u0097\u009dõ\u008bT3ºú\u0018å\u007ffÝ.\u0003êa¤Àa&q\u0084ÿê´Ic¯<\réáÕ¿¬]wû3\u0098ø6ºÔcr<\u0013ä±·Opív\u008aÝ(´Æ\u007fd1\u0005Ä£\u008bAJ\u001f\u0001?4aQ\u0083\u0089%ÎF\u0001è\u0017\n\u009d¬ÚÍ\u001eo[\u0091É3ÎT\u0017öU\u0018\u008eºÑ\u0003ý]\u0099¿I\u0019\u001cz\u0080Ô\u008b6W\u0090FñÖS\u0095\u00adH\u000f^hÕÊ\u009c$F\u0086\u0019çäA¦£iý*\u009cTÂ- ä\u0086¥åeK.©\u00ad\u000f»n~Ìs2ô\u0090´÷zU>»î\u0019¬x\u0001Þ\u0007<Äb\u0093ÁH'\t\u0085Ìë\u009cJT¨_\u000e\u0095".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1251);
        getHighSpeedVideoSizesFor = cArr;
        getOutputSizeshNQ4ISI = -3188699929311657405L;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        int i;
        int i2 = getOutputSizes + 35;
        int i3 = i2 % 128;
        getOutputMinFrameDuration = i3;
        if (i2 % 2 != 0) {
            Camera2StreamConfigurationMap = new byte[]{kotlin.io.encoding.Base64.padSymbol, -2, 117, 7};
            i = 41;
        } else {
            Camera2StreamConfigurationMap = new byte[]{kotlin.io.encoding.Base64.padSymbol, -2, 117, 7};
            i = 42;
        }
        getHighSpeedVideoFpsRangesFor = i;
        int i4 = i3 + 63;
        getOutputSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
