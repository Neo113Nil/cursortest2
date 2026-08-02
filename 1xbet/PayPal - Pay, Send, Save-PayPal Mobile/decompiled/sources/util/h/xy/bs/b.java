package util.h.xy.bs;

/* loaded from: classes5.dex */
public final class b {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    static final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputSizeshNQ4ISI;

    static {
        getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 93) % 128;
        getHighSpeedVideoFpsRangesFor = true;
        getHighSpeedVideoSizes = util.h.xy.bs.b.class.getName();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 29) % 128;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes18.dex */
    static final class a {
        public static final util.h.xy.bs.b.a Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        public static final util.h.xy.bs.b.a getHighSpeedVideoSizes;
        private static boolean getHighSpeedVideoSizesFor;
        private static final /* synthetic */ util.h.xy.bs.b.a[] getInputFormats;
        private static int getInputSizeshNQ4ISI;
        private static char[] getOutputFormats;
        private static int getOutputMinFrameDuration;
        private static boolean getOutputSizes;

        private a(java.lang.String str, int i) {
        }

        public static util.h.xy.bs.b.a valueOf(java.lang.String str) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 33) % 128;
            util.h.xy.bs.b.a aVar = (util.h.xy.bs.b.a) java.lang.Enum.valueOf(util.h.xy.bs.b.a.class, str);
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 99) % 128;
            return aVar;
        }

        public static util.h.xy.bs.b.a[] values() {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 89) % 128;
            util.h.xy.bs.b.a[] aVarArr = (util.h.xy.bs.b.a[]) getInputFormats.clone();
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 37) % 128;
            return aVarArr;
        }

        static {
            util.h.xy.bs.b.a[] aVarArr;
            getHighResolutionOutputSizeshNQ4ISI();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u008b\u0082\u008b\u008b\u008a\u0089\u0085\u0082\u0086\u0088\u0087\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
            util.h.xy.bs.b.a aVar = new util.h.xy.bs.b.a(((java.lang.String) objArr[0]).intern(), 0);
            Camera2StreamConfigurationMap = aVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u008f\u008a\u0086\u008e\u0086\u008d\u008d\u0087\u008c\u0081\u0085\u0084", objArr2);
            util.h.xy.bs.b.a aVar2 = new util.h.xy.bs.b.a(((java.lang.String) objArr2[0]).intern(), 1);
            getHighSpeedVideoSizes = aVar2;
            int i = getOutputMinFrameDuration + 63;
            int i2 = i % 128;
            getHighSpeedVideoFpsRanges = i2;
            if (i % 2 == 0) {
                aVarArr = new util.h.xy.bs.b.a[4];
                aVarArr[0] = aVar;
                aVarArr[1] = aVar2;
            } else {
                aVarArr = new util.h.xy.bs.b.a[]{aVar, aVar2};
            }
            int i3 = (i2 + 85) % 128;
            getOutputMinFrameDuration = i3;
            getInputFormats = aVarArr;
            int i4 = i3 + 23;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
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
            int i3 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
            if (!getHighSpeedVideoSizesFor) {
                if (!getOutputSizes) {
                    throw null;
                }
                throw null;
            }
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void getHighResolutionOutputSizeshNQ4ISI() {
            getOutputFormats = new char[]{64414, 64386, 64384, 64392, 64387, 64388, 64412, 64393, 64370, 64408, 64399, 64385, 64398, 64411, 64409};
            getInputSizeshNQ4ISI = -1074856995;
            getOutputSizes = true;
            getHighSpeedVideoSizesFor = true;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25615(util.h.xy.bv.rb rbVar) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError;
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 53) % 128;
        if (rbVar.m25745() != util.h.xy.bv.rb.ra.f1061) {
            provisioningServiceError = null;
        } else if (rbVar.m25751() != 401) {
            provisioningServiceError = util.h.xy.cg.ra.m25919(rbVar);
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 15) % 128;
        } else {
            int i = getHighSpeedVideoSizesFor + 73;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                getHighSpeedVideoSizes(rbVar);
                throw null;
            }
            provisioningServiceError = getHighSpeedVideoSizes(rbVar);
        }
        int i2 = getHighSpeedVideoSizesFor + 105;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return provisioningServiceError;
        }
        throw null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i2 + 3;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 29) % 128;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (Camera2StreamConfigurationMap ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 107) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25614(util.h.xy.bv.rb rbVar) {
        int m25751 = rbVar.m25751();
        new java.lang.Object[]{java.lang.Integer.valueOf(m25751), rbVar.m25742()};
        if (rbVar.m25745() != util.h.xy.bv.rb.ra.f1061) {
            return null;
        }
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 105) % 128;
        if (rbVar.m25751() == 401) {
            return getHighSpeedVideoFpsRangesFor(rbVar);
        }
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25919 = util.h.xy.cg.ra.m25919(rbVar);
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 121) % 128;
        return m25919;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25616(util.h.xy.ck.rc rcVar) {
        util.h.xy.bv.rb rbVar;
        int i = getInputSizeshNQ4ISI + 71;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (!getHighSpeedVideoFpsRangesFor && rcVar == null) {
            throw new java.lang.AssertionError();
        }
        rcVar.getMessage();
        int i2 = getHighSpeedVideoSizesFor + 65;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.bs.b.a aVar = util.h.xy.bs.b.a.getHighSpeedVideoSizes;
            throw null;
        }
        util.h.xy.bs.b.a aVar2 = util.h.xy.bs.b.a.getHighSpeedVideoSizes;
        if (rcVar != null) {
            rcVar.getStackTrace();
            java.lang.Throwable th = rcVar;
            while (true) {
                if (th == null) {
                    break;
                }
                int i3 = getHighSpeedVideoSizesFor + 67;
                getInputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (th instanceof java.io.IOException) {
                    aVar2 = util.h.xy.bs.b.a.Camera2StreamConfigurationMap;
                    break;
                }
                th = th.getCause();
            }
        }
        int i4 = getHighSpeedVideoSizesFor + 73;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (aVar2 == util.h.xy.bs.b.a.Camera2StreamConfigurationMap) {
            rbVar = new util.h.xy.bv.rb(-2, util.h.xy.bv.rb.b.f1060);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("蝥ധ鎣ᠹ꺸㌈맆下풗契\uefe9瑬\ufaf1轸ᗛ驉\u20c9땚㯓솿嘡\udcfd愡\uf786簜ʉ靚ᶔꉭ⣱뵻䏠족廐\ue30c", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 35449, objArr);
                rbVar.m25748(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } else {
            util.h.xy.bv.rb rbVar2 = new util.h.xy.bv.rb(-102, util.h.xy.bv.rb.b.f1060);
            if (rcVar != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("蝱襉鬾관뼂섨폔\ue5fe\uf7ff撚௶ᶨ⹖ど䈝君晠棘竍賦麉ꂡ늸썄핼\ue72f\ue911וּෝῇ⇧㏙䖥垴塗橻籫蹃逛ꋢ듥욿좑\uda8c\uecb0ﵞཥᅨ⌙㕭䝮", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3607, objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(rcVar.getMessage() != null ? rcVar.getMessage() : "");
                rbVar2.m25748(sb.toString());
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("蝱䙋Ժ쑺茊䈲Ġ샌迯代ෂ첲设䥓ࡹ흹陀唺ᐩ폜鋡击ႌ\udfb6麬尝᭥\uda6f餕堽✣\ue69bꗥ擶⎓\ue281ꆣ漙\u2e6f\ued50갵歍⨥\ue9d6꣘矤㚁\uf58a뒹爏ㄊ\uf05a뼌縊㴻ﳃ믜竴㦝\uf889쟼蕟䑓ͷ순", 49429 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                rbVar2.m25748(((java.lang.String) objArr3[0]).intern());
            }
            rbVar = rbVar2;
        }
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25919 = util.h.xy.cg.ra.m25919(rbVar);
        int i5 = getInputSizeshNQ4ISI + 55;
        getHighSpeedVideoSizesFor = i5 % 128;
        if (i5 % 2 != 0) {
            return m25919;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        r7 = util.h.xy.cg.ra.m25925(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_WRONG_CREDENTIALS, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r7 = util.h.xy.cg.ra.m25925(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_CREDENTIAL_EXPIRED, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (((java.lang.String) r5[0]).intern().equals(r7.m25742()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (((java.lang.String) r5[0]).intern().equals(r7.m25742()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005b, code lost:
    
        r1 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("蝹\ueadb尬쾞\u31e8ꍀᚪ磬\uea5b嶯켇ㅣ\ua4c9ᘟ硢\uebd2崡삉㋵ꑜក秸\ueb4a度", android.text.TextUtils.getOffsetBefore("", 0) + 28069, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007a, code lost:
    
        if (((java.lang.String) r1[0]).intern().equals(r7.m25742()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007c, code lost:
    
        r7 = util.h.xy.cg.ra.m25925(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_TRY_LIMIT_EXCEEDED, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoSizes(util.h.xy.bv.rb rbVar) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25925;
        int i = getInputSizeshNQ4ISI + 33;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("蝳Ｑ矓\uef8d昹\udee1嚖촼䗩붗㑑곬⒁魔Ꮾ讲ɂ競\uf2b9楚\ue104妾큜䠂삽䝯", 10958 >> (android.graphics.PointF.length(0.0f, 2.0f) > 2.0f ? 1 : (android.graphics.PointF.length(0.0f, 2.0f) == 2.0f ? 0 : -1)), objArr);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("蝳Ｑ矓\uef8d昹\udee1嚖촼䗩붗㑑곬⒁魔Ꮾ讲ɂ競\uf2b9楚\ue104妾큜䠂삽䝯", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30803, objArr2);
        }
        if (m25925 != null) {
            return m25925;
        }
        int i2 = getInputSizeshNQ4ISI + 19;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRangesFor(util.h.xy.bv.rb rbVar) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25925;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("蝱炂梪惍壳僠䠟䀲㡛て⡹↓ᦻᇚেǶ樂\uf126\ue951\ue150\ud964튀쪯슴뫜닺ꨂ", android.graphics.Color.green(0) + 63463, objArr);
        if (!((java.lang.String) objArr[0]).intern().equals(rbVar.m25742())) {
            m25925 = util.h.xy.cg.ra.m25925(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.RE_ENROLLMENT_REQUIRED, rbVar);
            try {
                util.h.xy.cg.d.m25913();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            }
        } else {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 115) % 128;
            m25925 = util.h.xy.cg.ra.m25919(rbVar);
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 93) % 128;
        }
        if (m25925 != null) {
            return m25925;
        }
        int i = getHighSpeedVideoSizesFor + 35;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = 5460456456024667307L;
    }
}
