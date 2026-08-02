package util.h.xy.bw;

/* loaded from: classes5.dex */
public class b {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier getInputFormats;
    private util.h.xy.aa.rc getInputSizeshNQ4ISI;
    private util.h.xy.aa.a getOutputFormats;

    static /* synthetic */ util.h.xy.aa.a Camera2StreamConfigurationMap(util.h.xy.bw.b bVar) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 71) % 128;
        util.h.xy.aa.a aVar = bVar.getOutputFormats;
        int i2 = i + 29;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bw.b bVar) {
        int i = getHighSpeedVideoSizes + 67;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier = bVar.getInputFormats;
        if (i % 2 == 0) {
            return cHCodeVerifier;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizes + 31;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bw.b bVar, byte[] bArr) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        java.lang.Byte b = new java.lang.Byte(bArr[0]);
        if (b.intValue() <= 0) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
            getHighSpeedVideoSizes();
            bVar.getHighSpeedVideoFpsRanges(0);
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        } else {
            bVar.getHighSpeedVideoFpsRanges(b.intValue());
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoSizesFor = util.h.xy.bw.b.class.getName();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod> m25782() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 35) % 128;
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    /* renamed from: util.h.xy.bw.b$7, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN.ordinal()] = 1;
                int i = getHighSpeedVideoSizes;
                int i2 = ((i | 55) << 1) - (i ^ 55);
                getHighSpeedVideoFpsRanges = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS.ordinal()] = 2;
                int i4 = getHighSpeedVideoFpsRanges;
                int i5 = (i4 & 107) + (i4 | 107);
                getHighSpeedVideoSizes = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE.ordinal()] = 4;
                int i7 = getHighSpeedVideoFpsRanges + 97;
                getHighSpeedVideoSizes = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int i9 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i9 ^ 93) + ((i9 & 93) << 1)) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<java.lang.Object> m25783(util.h.xy.at.mb mbVar, util.h.xy.bw.mb mbVar2) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 77) % 128;
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (!highSpeedVideoFpsRangesFor.isSuccessful()) {
            return new util.h.xy.bw.ra(false, null, highSpeedVideoFpsRangesFor.getErrorMessage());
        }
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result = getHighSpeedVideoFpsRangesFor().getResult();
        int i = util.h.xy.bw.b.AnonymousClass7.Camera2StreamConfigurationMap[result.ordinal()];
        if (i == 1) {
            if (mbVar == null && mbVar2 == null) {
                util.h.xy.ap.ma maVar = new util.h.xy.ap.ma(new util.h.xy.at.mb() { // from class: util.h.xy.bw.b.2
                    private static int Camera2StreamConfigurationMap = 1;
                    private static int getHighSpeedVideoFpsRanges = 0;
                    private static int getHighSpeedVideoFpsRangesFor = 0;
                    private static int getHighSpeedVideoSizes = 1;
                    private static long getOutputMinFrameDuration = -2489337817597567577L;

                    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i2, java.lang.Object[] objArr) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 87) % 128;
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.a aVar = new util.h.xz.b.a();
                        char[] m27721 = util.h.xz.b.a.m27721(getOutputMinFrameDuration ^ 7817488252581312552L, charArray, i2);
                        aVar.f2623 = 4;
                        while (aVar.f2623 < m27721.length) {
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 83) % 128;
                            aVar.f2624 = aVar.f2623 - 4;
                            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputMinFrameDuration ^ 7817488252581312552L)));
                            aVar.f2623++;
                        }
                        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
                    
                        r3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("銡Ꝣ聈흮鋭슽䬟\ue780", -((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), r3);
                        r7 = ((java.lang.String) r3[0]).intern();
                        r3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("䮭泺◈\uf17e䯮ऽ\uee80솞\uddbf靲䓚㟁枂ﻓ툑갍襊", android.text.TextUtils.getCapsMode("", 0, 0) + 1, r3);
                        util.h.xy.am.ma.m25027(r7, ((java.lang.String) r3[0]).intern());
                        ((util.h.xy.ap.ma) util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI(r6.getHighResolutionOutputSizeshNQ4ISI)).m25036().onVerificationSuccess();
                        r7 = util.h.xy.bw.b.AnonymousClass2.getHighSpeedVideoFpsRangesFor + 25;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
                    
                        r7 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
                    
                        r0 = r7.getCause();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
                    
                        if (r0 != null) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
                    
                        throw r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
                    
                        throw r7;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
                    
                        if (util.h.xy.w.ra.m27672().m27680(r7, r1) != false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
                    
                        if (util.h.xy.w.ra.m27672().m27680(r7, r1) != false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x00a3, code lost:
                    
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI(r6.getHighResolutionOutputSizeshNQ4ISI, r1);
                        r7 = util.h.xy.bw.b.AnonymousClass2.getHighSpeedVideoFpsRangesFor + 91;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
                    
                        util.h.xy.bw.b.AnonymousClass2.getHighSpeedVideoFpsRangesFor = (util.h.xy.bw.b.AnonymousClass2.Camera2StreamConfigurationMap + 59) % 128;
                     */
                    @Override // util.h.xy.at.mb
                    /* renamed from: ᐝ */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void mo25118(byte[] bArr) {
                        byte[] bArr2;
                        int i2;
                        int i3 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        Camera2StreamConfigurationMap = i3 % 128;
                        if (i3 % 2 == 0) {
                            util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                            util.h.xy.ar.b.m25074(bArr);
                            bArr2 = new byte[1];
                        } else {
                            util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                            util.h.xy.ar.b.m25074(bArr);
                            bArr2 = new byte[1];
                        }
                        int i4 = i2 % 128;
                        Camera2StreamConfigurationMap = i4;
                        getHighSpeedVideoFpsRangesFor = (i4 + 93) % 128;
                    }
                });
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 85) % 128;
                this.getInputFormats = maVar;
            } else {
                this.getInputFormats = (util.h.xy.ap.ma) mbVar2.mo25784(result, mbVar);
            }
            return new util.h.xy.bw.ra(true, this.getInputFormats, null);
        }
        if (i == 2) {
            this.getOutputFormats = (util.h.xy.aa.a) getInputFormats();
            return new util.h.xy.bw.ra(true, this.getOutputFormats, null);
        }
        if (i == 3) {
            this.getInputSizeshNQ4ISI = (util.h.xy.aa.rc) getHighSpeedVideoFpsRanges();
            util.h.xy.bw.ra raVar = new util.h.xy.bw.ra(true, this.getInputSizeshNQ4ISI, null);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 109) % 128;
            return raVar;
        }
        util.h.xy.aa.rc rcVar = (util.h.xy.aa.rc) getHighSpeedVideoFpsRanges();
        this.getInputSizeshNQ4ISI = rcVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{0, 62, 0, 36}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(result);
        return new util.h.xy.bw.ra(false, rcVar, sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (java.util.Arrays.equals(r2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (java.util.Arrays.equals(r2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (java.util.Arrays.equals(r2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (java.util.Arrays.equals(r2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        if (java.util.Arrays.equals(r2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (java.util.Arrays.equals(r2, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode()) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.gemalto.mfs.mwsdk.payment.CHVerificationMethod] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.gemalto.mfs.mwsdk.payment.CHVerificationMethod] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.gemalto.mfs.mwsdk.payment.CHVerificationMethod] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.gemalto.mfs.mwsdk.payment.CHVerificationMethod] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m25781() {
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType;
        int i;
        boolean z;
        byte[] m24984;
        int i2;
        int i3;
        int i4 = getHighSpeedVideoSizes + 31;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        int i5 = i4 % 2;
        try {
            if (i5 != 0) {
                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result = getHighSpeedVideoFpsRangesFor().getResult();
                m24984 = util.h.xy.ak.ma.f84.m24984();
                i3 = result;
                i2 = result;
            } else {
                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result2 = getHighSpeedVideoFpsRangesFor().getResult();
                m24984 = util.h.xy.ak.ma.f84.m24984();
                i3 = result2;
                i2 = result2;
            }
            paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
            i = i3;
        } catch (java.lang.Exception e) {
            e.getMessage();
            paymentType = null;
            i = i5;
        }
        if (i == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS || i == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
            if (util.h.xy.u.a.f2431.m27487(true, paymentType).m27528() == util.h.xy.aa.d.f65) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = util.h.xy.f.b.f2201.m26783();
        }
        int i6 = getHighSpeedVideoSizes + 103;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25780() {
        int i = getHighSpeedVideoSizes + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.f.b.f2201.m26747();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 107) % 128;
        } else {
            util.h.xy.f.b.f2201.m26747();
            throw null;
        }
    }

    private static com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod> getHighSpeedVideoFpsRangesFor() {
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE;
        util.h.xy.u.b m26775 = util.h.xy.f.b.f2201.m26775();
        if (m26775 == null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
            m26775 = util.h.xy.u.b.f2434;
        }
        boolean z = true;
        java.lang.String str = null;
        if (m26775 == util.h.xy.u.b.f2432) {
            cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE;
        } else {
            if (m26775 != util.h.xy.u.b.f2435) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
                if (m26775 != util.h.xy.u.b.f2433) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{62, 63, 50, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", objArr);
                    str = ((java.lang.String) objArr[0]).intern();
                    z = false;
                }
            }
            cHVerificationMethod = util.h.xy.j.ma.f2241.m26900();
        }
        return new util.h.xy.bw.ra(z, cHVerificationMethod, str);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRanges + 65;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
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
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 69) % 128;
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 87) % 128;
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i7 = getHighSpeedVideoFpsRangesFor + 107;
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 == 0) {
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                java.lang.System.arraycopy(cArr5, 0, cArr3, i3 + i5, i5);
                java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i3 >>> i5);
            } else {
                char[] cArr6 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i8 = i3 - i5;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i8, i5);
                java.lang.System.arraycopy(cArr6, i5, cArr3, 0, i8);
            }
        }
        char[] cArr7 = new char[i3];
        maVar.f2631 = 0;
        while (maVar.f2631 < i3) {
            cArr7[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr7[maVar.f2631] = (char) (cArr7[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private java.lang.Object getHighSpeedVideoFpsRanges() {
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType;
        int i = getHighSpeedVideoSizes + 125;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
            if (activatedPaymentService == null) {
                try {
                    byte[] m24984 = util.h.xy.ak.ma.f84.m24984();
                    if (!java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                        if (java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode())) {
                            paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                        } else {
                            paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                        }
                    }
                    paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
                } catch (java.lang.Exception e) {
                    e.getMessage();
                    paymentType = null;
                }
            } else {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
                paymentType = activatedPaymentService.getType();
            }
            if (util.h.xy.u.a.f2431.m27487(true, paymentType).m27528() == util.h.xy.aa.d.f64) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 97;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    getHighSpeedVideoSizes();
                    return null;
                }
                getHighSpeedVideoSizes();
                throw null;
            }
            return new util.h.xy.aa.rc(new util.h.xy.aa.c() { // from class: util.h.xy.bw.b.5
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoFpsRangesFor = 1;
                private static int[] getHighSpeedVideoSizes = {394051450, 1805440387, 1140625937, -1017527064, -1297565075, 2042241782, -496176167, 591763995, 1096323964, 1311468334, 369853330, -1264752559, -2094889013, -614631547, -1770063612, -78586907, 6429179, 359394649};
                private static int getOutputMinFrameDuration;

                private static void getHighSpeedVideoSizes(int[] iArr, int i3, java.lang.Object[] objArr) {
                    int i4;
                    int length;
                    int[] iArr2;
                    int i5;
                    int i6;
                    util.h.xz.b.c cVar = new util.h.xz.b.c();
                    char[] cArr = new char[4];
                    int i7 = 2;
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = getHighSpeedVideoSizes;
                    if (iArr3 != null) {
                        int length2 = iArr3.length;
                        int[] iArr4 = new int[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            iArr4[i8] = (int) (iArr3[i8] ^ (-5569649899877129369L));
                        }
                        int i9 = getHighResolutionOutputSizeshNQ4ISI + 41;
                        getHighSpeedVideoFpsRanges = i9 % 128;
                        int i10 = i9 % 2;
                        iArr3 = iArr4;
                    }
                    int length3 = iArr3.length;
                    int[] iArr5 = new int[length3];
                    int[] iArr6 = getHighSpeedVideoSizes;
                    if (iArr6 != null) {
                        int i11 = getHighResolutionOutputSizeshNQ4ISI + 1;
                        getHighSpeedVideoFpsRanges = i11 % 128;
                        if (i11 % 2 == 0) {
                            length = iArr6.length;
                            iArr2 = new int[length];
                            i5 = 1;
                        } else {
                            length = iArr6.length;
                            iArr2 = new int[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            int i12 = getHighSpeedVideoFpsRanges + 7;
                            getHighResolutionOutputSizeshNQ4ISI = i12 % 128;
                            if (i12 % i7 != 0) {
                                i6 = length3;
                                iArr2[i5] = (int) (iArr6[i5] - (-5569649899877129369L));
                            } else {
                                i6 = length3;
                                iArr2[i5] = (int) (iArr6[i5] ^ (-5569649899877129369L));
                                i5++;
                            }
                            length3 = i6;
                            i7 = 2;
                        }
                        i4 = length3;
                        iArr6 = iArr2;
                    } else {
                        i4 = length3;
                    }
                    java.lang.System.arraycopy(iArr6, 0, iArr5, 0, i4);
                    cVar.f2626 = 0;
                    while (cVar.f2626 < iArr.length) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 93) % 128;
                        cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                        cArr[1] = (char) iArr[cVar.f2626];
                        cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                        cArr[3] = (char) iArr[cVar.f2626 + 1];
                        cVar.f2627 = (cArr[0] << 16) + cArr[1];
                        cVar.f2625 = (cArr[2] << 16) + cArr[3];
                        util.h.xz.b.c.m27723(iArr5);
                        for (int i13 = 0; i13 < 16; i13++) {
                            cVar.f2627 ^= iArr5[i13];
                            cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                            int i14 = cVar.f2627;
                            cVar.f2627 = cVar.f2625;
                            cVar.f2625 = i14;
                        }
                        int i15 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i15;
                        cVar.f2625 ^= iArr5[16];
                        cVar.f2627 ^= iArr5[17];
                        int i16 = cVar.f2627;
                        int i17 = cVar.f2625;
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
                    objArr[0] = new java.lang.String(cArr2, 0, i3);
                }

                @Override // util.h.xy.aa.c
                /* renamed from: ˏ */
                public final void mo24518(boolean z, long j) {
                    getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 89) % 128;
                    if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() != null) {
                        getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 99) % 128;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{304816142, -815519374}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1175837502, -426328301, 524117689, 1648712599, 377195794, -418491738, 1629689373, 1913060014}, android.view.KeyEvent.getDeadChar(0, 0) + 13, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifySuccess();
                    }
                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                }

                @Override // util.h.xy.aa.c
                /* renamed from: ˋ */
                public final void mo24517() {
                    int i3 = getHighSpeedVideoFpsRangesFor + 31;
                    getOutputMinFrameDuration = i3 % 128;
                    if (i3 % 2 == 0) {
                        if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() != null) {
                            getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 109) % 128;
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{304816142, -815519374}, android.text.TextUtils.getOffsetAfter("", 0) + 4, objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{1175837502, -426328301, 524117689, 1648712599, 377195794, -418491738, -1525275809, 1918801414}, android.text.TextUtils.indexOf("", "", 0, 0) + 13, objArr2);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                            util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifyFailed();
                            return;
                        }
                        return;
                    }
                    util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523();
                    throw new java.lang.ArithmeticException();
                }
            });
        }
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
        throw new java.lang.ArithmeticException();
    }

    private java.lang.Object getInputFormats() {
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
        if (activatedPaymentService != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 81) % 128;
            paymentType = activatedPaymentService.getType();
        } else {
            try {
                byte[] m24984 = util.h.xy.ak.ma.f84.m24984();
                if (!java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode())) {
                    int i = getHighResolutionOutputSizeshNQ4ISI + 111;
                    getHighSpeedVideoSizes = i % 128;
                    if (i % 2 == 0) {
                        java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode());
                        throw new java.lang.ArithmeticException();
                    }
                    if (!java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                        if (java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode())) {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
                            paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                        } else {
                            paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                        }
                    }
                }
                paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
            } catch (java.lang.Exception e) {
                e.getMessage();
                paymentType = null;
            }
        }
        if (util.h.xy.u.a.f2431.m27487(true, paymentType).m27528() == util.h.xy.aa.d.f64) {
            getHighSpeedVideoSizes();
            return null;
        }
        util.h.xy.aa.a aVar = new util.h.xy.aa.a(new util.h.xy.aa.mb.ra() { // from class: util.h.xy.bw.b.4
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 0;
            private static int getOutputFormats = 1;
            private static char[] getHighSpeedVideoFpsRanges = {41873, 41883, 41876, 41886, 41970, 41868, 41877, 41880, 41872, 41885, 41866, 41871, 41887, 41881, 41884, 41882};
            private static char getOutputMinFrameDuration = 38466;

            private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i2, java.lang.Object[] objArr) {
                int i3;
                char[] charArray = str.toCharArray();
                util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                char[] cArr = getHighSpeedVideoFpsRanges;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
                    }
                    cArr = cArr2;
                }
                char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i3 = i2 - 1;
                    cArr3[i3] = (char) (charArray[i3] - b);
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 9) % 128;
                    mcVar.f2638 = 0;
                    while (mcVar.f2638 < i3) {
                        mcVar.f2641 = charArray[mcVar.f2638];
                        mcVar.f2636 = charArray[mcVar.f2638 + 1];
                        if (mcVar.f2641 == mcVar.f2636) {
                            int i5 = Camera2StreamConfigurationMap + 11;
                            getHighSpeedVideoSizes = i5 % 128;
                            if (i5 % 2 != 0) {
                                cArr3[mcVar.f2638] = (char) (mcVar.f2641 % b);
                                cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 + b);
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
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 113) % 128;
                                mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                int i6 = mcVar.f2639;
                                int i7 = mcVar.f2640;
                                int i8 = mcVar.f2637;
                                int i9 = mcVar.f2635;
                                cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                                cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                            } else if (mcVar.f2639 == mcVar.f2637) {
                                mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                int i10 = mcVar.f2639;
                                int i11 = mcVar.f2640;
                                int i12 = mcVar.f2637;
                                int i13 = mcVar.f2635;
                                cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                                cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                            } else {
                                int i14 = mcVar.f2639;
                                int i15 = mcVar.f2635;
                                int i16 = mcVar.f2637;
                                int i17 = mcVar.f2640;
                                cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                                cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                            }
                        }
                        mcVar.f2638 += 2;
                    }
                }
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 67) % 128;
                for (int i18 = 0; i18 < i2; i18++) {
                    cArr3[i18] = (char) (cArr3[i18] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ˊ */
            public final void mo24519(int i2, java.lang.CharSequence charSequence) {
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this) == null) {
                    util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    getHighSpeedVideoFpsRangesFor = (getOutputFormats + 81) % 128;
                    return;
                }
                getOutputFormats = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener m24523 = util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523();
                if (m24523 != null) {
                    util.h.xy.v.mc mcVar = new util.h.xy.v.mc(java.lang.Integer.valueOf(i2), charSequence.toString());
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (64 - android.graphics.Color.argb(0, 0, 0, 0)), "\t\u0004\u0004\u000e", 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (android.view.MotionEvent.axisFromString("") + 74), "\u000e\u0000\b\u0002\b\u0000\u0006\u000e\f\u0007\n\u000b㘨", 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    m24523.onVerifyError(mcVar);
                    return;
                }
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ˎ */
            public final void mo24521(int i2, java.lang.CharSequence charSequence) {
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this) != null) {
                    if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() != null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (64 - android.graphics.Color.red(0)), "\t\u0004\u0004\u000e", 3 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (115 - android.graphics.Color.red(0)), "\u000e\u0000\b\u0002\b\u0000\u0006\u000e\f\u0007\n\u000b㙅", 13 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifyHelp(i2, charSequence);
                    } else {
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 1) % 128;
                    }
                    getHighSpeedVideoFpsRangesFor = (getOutputFormats + 45) % 128;
                } else {
                    util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                }
                int i3 = getHighSpeedVideoFpsRangesFor + 3;
                getOutputFormats = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ᐝ */
            public final void mo24522(boolean z, long j) {
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this) == null) {
                    util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    getHighSpeedVideoFpsRangesFor = (getOutputFormats + 71) % 128;
                    return;
                }
                getHighSpeedVideoFpsRangesFor = (getOutputFormats + 81) % 128;
                if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() != null) {
                    byte edgeSlop = (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 64);
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 37) % 128;
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(edgeSlop, "\t\u0004\u0004\u000e", 5 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 20), "\u000e\u0000\b\u0002\b\u0000\u0006\u000e\f\u0007\n\u000b㘍", 13 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifySuccess();
                        return;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ˋ */
            public final void mo24520() {
                int i2 = getOutputFormats + 111;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this) == null) {
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    getOutputFormats = (getHighSpeedVideoFpsRangesFor + 47) % 128;
                    if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() == null) {
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 47) % 128;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (android.view.View.MeasureSpec.getSize(0) + 64), "\t\u0004\u0004\u000e", 4 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (48 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u000e\u0000\b\u0002\b\u0000\u0006\u000e\f\u0007\n\u000b㘌", android.view.KeyEvent.getDeadChar(0, 0) + 13, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifyFailed();
                    }
                    getHighSpeedVideoFpsRangesFor = (getOutputFormats + 89) % 128;
                    return;
                }
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this);
                throw new java.lang.ArithmeticException();
            }
        }, new util.h.xy.aa.c() { // from class: util.h.xy.bw.b.1
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 1;
            private static long getHighSpeedVideoSizesFor = 9081755067614032745L;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i2, java.lang.Object[] objArr) {
                int i3 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = (i3 + 47) % 128;
                getHighSpeedVideoFpsRanges = (i3 + 115) % 128;
                char[] charArray = str.toCharArray();
                util.h.xz.b.a aVar2 = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i2);
                aVar2.f2623 = 4;
                while (aVar2.f2623 < m27721.length) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 27) % 128;
                    aVar2.f2624 = aVar2.f2623 - 4;
                    m27721[aVar2.f2623] = (char) ((m27721[aVar2.f2623] ^ m27721[aVar2.f2623 % 4]) ^ (aVar2.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
                    aVar2.f2623++;
                }
                objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // util.h.xy.aa.c
            /* renamed from: ˏ */
            public final void mo24518(boolean z, long j) {
                java.lang.String intern;
                java.lang.Object obj;
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this) != null) {
                    if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() == null) {
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        int i2 = getHighResolutionOutputSizeshNQ4ISI + 33;
                        getHighSpeedVideoFpsRangesFor = i2 % 128;
                        if (i2 % 2 != 0) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("⾟⿓眻ด\u20f5簪ᣟŵ", android.view.ViewConfiguration.getEdgeSlop() - 125, objArr);
                            intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("臨例\uf0ab\uf51b砛퓜ﮢ쎤\ue3cf妕ꀁᜄꎸ黅錊∈纩", android.graphics.Color.alpha(0), objArr2);
                            obj = objArr2[0];
                        } else {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("⾟⿓眻ด\u20f5簪ᣟŵ", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr3);
                            intern = ((java.lang.String) objArr3[0]).intern();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("臨例\uf0ab\uf51b砛퓜ﮢ쎤\ue3cf妕ꀁᜄꎸ黅錊∈纩", 1 - android.graphics.Color.alpha(0), objArr4);
                            obj = objArr4[0];
                        }
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
                        util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifySuccess();
                    }
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
                    return;
                }
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
            }

            @Override // util.h.xy.aa.c
            /* renamed from: ˋ */
            public final void mo24517() {
                int i2 = getHighSpeedVideoFpsRangesFor + 37;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this) != null) {
                        if (util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523() != null) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("⾟⿓眻ด\u20f5簪ᣟŵ", android.graphics.Color.alpha(0) + 1, objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("ᡘ\u181b\uddee摌퇯㕲훧\ueee1犘\uf061ㅖ뻰䈖뎀ɝ诼鼒", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr2);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                            util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this).m24523().onVerifyFailed();
                            return;
                        }
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 101) % 128;
                        return;
                    }
                    util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
                    return;
                }
                util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                util.h.xy.bw.b.Camera2StreamConfigurationMap(util.h.xy.bw.b.this);
                throw new java.lang.ArithmeticException();
            }
        });
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        return aVar;
    }

    private void getHighSpeedVideoFpsRanges(final int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 53;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            final com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener m25036 = ((util.h.xy.ap.ma) this.getInputFormats).m25036();
            if (m25036 != null) {
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bw.b.3
                    private static int Camera2StreamConfigurationMap = 1;
                    private static int getHighSpeedVideoFpsRangesFor = 0;
                    private static int getHighSpeedVideoSizesFor = 1;
                    private static int[] getInputFormats = {1388522345, -1805526476, -1281615874, 1139088251, -33650407, 188340776, 1161734881, 2015701940, -1386269696, 1670616987, -1165964909, 841813951, 786784917, -811648866, -98203940, -494916747, -1087547474, -486589867};
                    private static int getOutputFormats;

                    private static void Camera2StreamConfigurationMap(int[] iArr, int i3, java.lang.Object[] objArr) {
                        util.h.xz.b.c cVar = new util.h.xz.b.c();
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length * 2];
                        int[] iArr2 = getInputFormats;
                        if (iArr2 != null) {
                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 99) % 128;
                            int length = iArr2.length;
                            int[] iArr3 = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr3[i4] = (int) (iArr2[i4] ^ (-5569649899877129369L));
                            }
                            iArr2 = iArr3;
                        }
                        int length2 = iArr2.length;
                        int[] iArr4 = new int[length2];
                        int[] iArr5 = getInputFormats;
                        if (iArr5 != null) {
                            int length3 = iArr5.length;
                            int[] iArr6 = new int[length3];
                            for (int i5 = 0; i5 < length3; i5++) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                                iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
                            }
                            iArr5 = iArr6;
                        }
                        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                        cVar.f2626 = 0;
                        while (cVar.f2626 < iArr.length) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 29) % 128;
                            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                            cArr[1] = (char) iArr[cVar.f2626];
                            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                            cArr[3] = (char) iArr[cVar.f2626 + 1];
                            cVar.f2627 = (cArr[0] << 16) + cArr[1];
                            cVar.f2625 = (cArr[2] << 16) + cArr[3];
                            util.h.xz.b.c.m27723(iArr4);
                            for (int i6 = 0; i6 < 16; i6++) {
                                cVar.f2627 ^= iArr4[i6];
                                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                int i7 = cVar.f2627;
                                cVar.f2627 = cVar.f2625;
                                cVar.f2625 = i7;
                            }
                            int i8 = cVar.f2627;
                            cVar.f2627 = cVar.f2625;
                            cVar.f2625 = i8;
                            cVar.f2625 ^= iArr4[16];
                            cVar.f2627 ^= iArr4[17];
                            int i9 = cVar.f2627;
                            int i10 = cVar.f2625;
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
                        objArr[0] = new java.lang.String(cArr2, 0, i3);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i <= 0) {
                            util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(new int[]{1414452524, 470453809}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(new int[]{-1403501497, -733333412, -371477213, -1862514672, -1112134376, 155745179}, 11 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                            m25036.maxRetryReached();
                            getHighSpeedVideoSizesFor = (getOutputFormats + 55) % 128;
                            return;
                        }
                        util.h.xy.bw.b.getHighResolutionOutputSizeshNQ4ISI();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(new int[]{1414452524, 470453809}, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        int[] iArr = {-1403501497, -733333412, -371477213, -1862514672, 552397361, 1743282448};
                        getOutputFormats = (getHighSpeedVideoSizesFor + 85) % 128;
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(iArr, 12 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                            com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode cHCodeVerifierErrorCode = com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode.WRONG_PIN;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(new int[]{-49672505, -913603575, -269074158, -442428743, -467564759, 1868563930, 1820892218, 689124760, -2024654011, -166079128}, 19 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
                            m25036.onVerificationError(i, new util.h.xy.v.mc(cHCodeVerifierErrorCode, ((java.lang.String) objArr5[0]).intern()));
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                });
                return;
            } else {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 15) % 128;
                return;
            }
        }
        ((util.h.xy.ap.ma) this.getInputFormats).m25036();
        throw null;
    }

    private static void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 103) % 128;
        try {
            util.h.xy.k.a.m26907(true);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.printStackTrace();
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
    }

    static void Camera2StreamConfigurationMap() {
        Camera2StreamConfigurationMap = new char[]{42343, 42263, 42266, 42294, 42265, 42271, 42297, 42289, 42281, 42291, 42294, 42290, 42294, 42295, 42261, 42263, 42284, 42291, 42266, 42260, 42291, 42265, 42266, 42291, 42289, 42291, 42295, 42292, 42294, 42295, 42290, 42266, 42260, 42291, 42293, 42243, 42343, 42352, 42258, 42293, 42295, 42298, 42295, 42285, 42284, 42261, 42271, 42294, 42292, 42303, 42268, 42270, 42295, 42266, 42271, 42295, 42281, 42283, 42263, 42260, 42291, 42293, 42262, 42432, 42438, 42441, 42286, 42273, 42488, 42489, 42434, 42436, 42280, 42281, 42443, 42438, 42493, 42435, 42493, 42493, 42492, 42489, 42495, 42494, 42279, 42278, 42432, 42435, 42434, 42440, 42287, 42275, 42489, 42434, 42493, 42276, 42281, 42438, 42493, 42438, 42281, 42281, 42440, 42286, 42281, 42439, 42495, 42489, 42432, 42434, 42278, 42276, 42493, 42435, 42493, 42433, 42438, 42432, 42433, 42492, 42276, 42278, 42493, 42439, 42445};
    }
}
