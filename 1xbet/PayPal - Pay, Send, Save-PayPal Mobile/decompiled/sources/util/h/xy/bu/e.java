package util.h.xy.bu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class e {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final /* synthetic */ util.h.xy.bu.e[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bu.e f1052;

    private e(java.lang.String str) {
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizes + 1;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return getOutputMinFrameDuration;
        }
        throw null;
    }

    public static util.h.xy.bu.e valueOf(java.lang.String str) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 81) % 128;
        util.h.xy.bu.e eVar = (util.h.xy.bu.e) java.lang.Enum.valueOf(util.h.xy.bu.e.class, str);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 55) % 128;
        return eVar;
    }

    public static util.h.xy.bu.e[] values() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 87) % 128;
        util.h.xy.bu.e[] eVarArr = (util.h.xy.bu.e[]) getInputSizeshNQ4ISI.clone();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 111) % 128;
        return eVarArr;
    }

    static {
        util.h.xy.bu.e[] eVarArr;
        getHighSpeedVideoFpsRanges();
        int i = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 35) % 128;
        char[] charArray = "빀ⶆ븉丱癣讵老飠킭\ue79f桰\u0a5d".toCharArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 1) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        util.h.xy.bu.e eVar = new util.h.xy.bu.e(new java.lang.String(m27721, 4, m27721.length - 4).intern());
        f1052 = eVar;
        int i2 = getHighSpeedVideoSizes;
        int i3 = i2 + 19;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            eVarArr = new util.h.xy.bu.e[0];
            eVarArr[0] = eVar;
        } else {
            eVarArr = new util.h.xy.bu.e[]{eVar};
        }
        int i4 = i2 + 55;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        getInputSizeshNQ4ISI = eVarArr;
        getOutputMinFrameDuration = util.h.xy.bu.e.class.getName();
        int i5 = getHighSpeedVideoFpsRanges + 45;
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25661(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 63) % 128;
            util.h.xy.v.c.m27646().m27654(context, customConfiguration);
            int i = getHighSpeedVideoSizes + 91;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25662(android.content.Context context, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) throws com.gemalto.mfs.mwsdk.exception.SDKInitializationException {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 107) % 128;
        util.h.xy.v.c.m27646().m27651(context, customConfiguration);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 45) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25663(android.content.Context context, final com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener sDKControllerListener, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) {
        util.h.xy.v.c.m27646().m27655(context, new com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener() { // from class: util.h.xy.bu.e.3
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static char getHighSpeedVideoSizesFor = 42311;
            private static int getInputFormats = 1;
            private static char getInputSizeshNQ4ISI = 51105;
            private static char getOutputFormats = 20312;
            private static char getOutputMinFrameDuration = 45085;

            @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener
            public final void onError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode> sDKError) {
                getInputFormats = (getHighSpeedVideoFpsRanges + 33) % 128;
                util.h.xy.bu.e.getHighResolutionOutputSizeshNQ4ISI();
                sDKError.getErrorCode();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("汌ퟖꌄӀ", android.graphics.Color.blue(0) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ﾲ䧮␆\uf7b6␆\uf7b6\udca6唱", android.text.TextUtils.getTrimmedLength("") + 8, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                sDKControllerListener.onError(sDKError);
                getHighSpeedVideoFpsRanges = (getInputFormats + 23) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener
            public final void onSetupProgress(com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState, java.lang.String str) {
                getInputFormats = (getHighSpeedVideoFpsRanges + 125) % 128;
                util.h.xy.bu.e.getHighResolutionOutputSizeshNQ4ISI();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("汌ퟖꌄӀ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 5, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ﾲ䧮␆\uf7b6␆\uf7b6닆쎤꺙І", '9' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                sDKControllerListener.onSetupProgress(sDKSetupProgressState, str);
                getHighSpeedVideoFpsRanges = (getInputFormats + 71) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener
            public final void onSetupComplete() {
                util.h.xy.bu.e.getHighResolutionOutputSizeshNQ4ISI();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("汌ퟖꌄӀ", android.graphics.Color.alpha(0) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ﾲ䧮␆\uf7b6␆\uf7b6닆쎤奯俜", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                sDKControllerListener.onSetupComplete();
                util.h.xy.ba.ma.m25292().m25294(new util.h.xy.q.a());
                getHighSpeedVideoFpsRanges = (getInputFormats + 69) % 128;
            }

            private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
                int i2;
                char[] charArray = str.toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                while (eVar.f2630 < charArray.length) {
                    int i3 = Camera2StreamConfigurationMap + 125;
                    getHighSpeedVideoFpsRangesFor = i3 % 128;
                    int i4 = 58224;
                    if (i3 % 2 == 0) {
                        cArr2[1] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630];
                        i2 = 1;
                    } else {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630 + 1];
                        i2 = 0;
                    }
                    while (i2 < 16) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 97) % 128;
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        i4 -= 40503;
                        i2++;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                }
                objArr[0] = new java.lang.String(cArr, 0, i);
            }
        }, customConfiguration);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 87) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.thalesgroup.gemalto.securelog.SecureLog m25660(com.thalesgroup.gemalto.securelog.SecureLogConfig secureLogConfig) {
        com.thalesgroup.gemalto.securelog.SecureLog m25028;
        synchronized (util.h.xy.bu.e.class) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 17) % 128;
            m25028 = util.h.xy.am.ma.m25028(secureLogConfig);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 1) % 128;
        }
        return m25028;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighResolutionOutputSizeshNQ4ISI = 4125029702413427587L;
    }
}
