package util.h.xy.au;

/* loaded from: classes5.dex */
public final class mf {
    private static int Camera2StreamConfigurationMap = 0;
    private static byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static long getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static short[] getInputSizeshNQ4ISI = null;
    private static int getOutputFormats = 0;
    private static util.h.xy.au.mf getOutputMinFrameDuration = null;
    private static java.lang.Object getOutputMinFrameDurationlomOqCM = null;
    private static int getOutputSizeshNQ4ISI = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String f872 = null;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String f873 = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String f874 = null;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean f875 = false;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String f876;
    private java.util.Map<java.lang.String, com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration> getOutputSizes = new java.util.HashMap();

    static {
        getHighSpeedVideoFpsRanges();
        f874 = "mf";
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ꬬṷꭡៜ鴼躻Ⱟ賝⾧ㆼ\ua6f8璍\ue418䝤﹇峗\udc72黍ឝꔯ", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        f873 = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("腶袂脻脩籗濐䝲Ꚕ륟嫢䞑\u1fc5칗톍Ἳ㞏\uf629࠰\uf6e0칵Ό\u2060캉\ue62f䝁", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr2);
        f872 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("᮶ᖿ\u1bfbᰔᖾع끨㱉⑭귯\u2e78\ue8de咕䲧盏삄注锜鼕㥴蔸뵕ꝯᄬ", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr3);
        f876 = ((java.lang.String) objArr3[0]).intern();
        getOutputMinFrameDurationlomOqCM = new java.lang.Object();
        f875 = false;
        int i = getOutputSizeshNQ4ISI + 125;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 99;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 1) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 35) % 128;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        int i3 = getHighSpeedVideoFpsRanges + 25;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private mf() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.au.mf m25169() {
        util.h.xy.au.mf mfVar;
        synchronized (util.h.xy.au.mf.class) {
            int i = getInputFormats + 51;
            getOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                if (getOutputMinFrameDuration == null) {
                    getOutputMinFrameDuration = new util.h.xy.au.mf();
                }
                mfVar = getOutputMinFrameDuration;
                getInputFormats = (getOutputSizeshNQ4ISI + 121) % 128;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return mfVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25171(android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
        if (context == null) {
            java.lang.String str = util.h.xy.ay.ma.f896;
            throw new java.lang.IllegalStateException(util.h.xy.ay.ma.f896);
        }
        util.h.xy.bh.ra.m25484().m25486(context.getApplicationContext());
        boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
        try {
            if (!Camera2StreamConfigurationMap2) {
                java.lang.String str2 = util.h.xy.ay.ma.f899;
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(util.h.xy.ay.ma.f899);
            }
            if (!highSpeedVideoFpsRangesFor) {
                int i = getInputFormats + 5;
                getOutputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                if (!highSpeedVideoSizes) {
                    java.lang.String str3 = util.h.xy.ay.ma.f911;
                    throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(util.h.xy.ay.ma.f911);
                }
            }
            getInputFormats = (getOutputSizeshNQ4ISI + 39) % 128;
        } catch (java.lang.Exception e) {
            e.getMessage();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("郻蕂邶賭謚颅엙뜍\ud84d", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(e);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25184(android.content.Context context, com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration... mGConfigurationArr) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
        if (context == null) {
            java.lang.String str = util.h.xy.ay.ma.f896;
            throw new java.lang.IllegalStateException(util.h.xy.ay.ma.f896);
        }
        util.h.xy.bh.ra.m25484().m25486(context.getApplicationContext());
        if (mGConfigurationArr != null) {
            for (com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration mGConfiguration : mGConfigurationArr) {
                if (mGConfiguration != null) {
                    synchronized (getOutputMinFrameDurationlomOqCM) {
                        getOutputMinFrameDuration.getOutputSizes.put(mGConfiguration.getConfigurationName(), mGConfiguration);
                    }
                }
            }
        }
        boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
        try {
            if (!Camera2StreamConfigurationMap2) {
                java.lang.String str2 = util.h.xy.ay.ma.f899;
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(util.h.xy.ay.ma.f899);
            }
            if (!highSpeedVideoFpsRangesFor && !highSpeedVideoSizes) {
                java.lang.String str3 = util.h.xy.ay.ma.f911;
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(util.h.xy.ay.ma.f911);
            }
            util.h.xy.bh.mb.m25474(context);
        } catch (java.lang.Exception e) {
            e.getMessage();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getTouchSlop() >> 8) - 272071355, (short) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 124), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 111), (-62) - android.view.View.resolveSize(0, 0), (-581547113) - android.view.View.MeasureSpec.getSize(0), objArr);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        byte[] bArr;
        boolean z2;
        int length;
        byte[] bArr2;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        if (i5 == -1) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 25) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr3 = getHighResolutionOutputSizeshNQ4ISI;
            if (bArr3 != null) {
                int i6 = getHighSpeedVideoFpsRanges + 53;
                getHighSpeedVideoSizes = i6 % 128;
                if (i6 % 2 == 0) {
                    length = bArr3.length;
                    bArr2 = new byte[length];
                } else {
                    length = bArr3.length;
                    bArr2 = new byte[length];
                }
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr2;
            }
            i5 = bArr3 != null ? (byte) (((byte) (getHighResolutionOutputSizeshNQ4ISI[((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getInputSizeshNQ4ISI[((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i8 = (int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L));
            if (z) {
                int i9 = getHighSpeedVideoSizes + 47;
                getHighSpeedVideoFpsRanges = i9 % 128;
                if (i9 % 2 == 0) {
                    i4 = 1;
                    meVar.f2647 = ((i + i5) - 2) + i8 + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    bArr = getHighResolutionOutputSizeshNQ4ISI;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 79) % 128;
                            bArr4[i10] = (byte) (bArr[i10] ^ (-2689713159175858216L));
                        }
                        bArr = bArr4;
                    }
                    if (bArr != null) {
                        int i11 = getHighSpeedVideoSizes + 37;
                        getHighSpeedVideoFpsRanges = i11 % 128;
                        if (i11 % 2 == 0) {
                            z2 = true;
                            meVar.f2645 = 1;
                            while (meVar.f2645 < i5) {
                                int i12 = getHighSpeedVideoSizes + 105;
                                getHighSpeedVideoFpsRanges = i12 % 128;
                                if (i12 % 2 != 0) {
                                    throw null;
                                }
                                if (z2) {
                                    byte[] bArr5 = getHighResolutionOutputSizeshNQ4ISI;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                                } else {
                                    short[] sArr = getInputSizeshNQ4ISI;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                                }
                                sb.append(meVar.f2644);
                                meVar.f2646 = meVar.f2644;
                                meVar.f2645++;
                            }
                        }
                    }
                    z2 = false;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                    }
                }
            }
            i4 = 0;
            meVar.f2647 = ((i + i5) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            bArr = getHighResolutionOutputSizeshNQ4ISI;
            if (bArr != null) {
            }
            if (bArr != null) {
            }
            z2 = false;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
            }
        }
        java.lang.String obj = sb.toString();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 81) % 128;
        objArr[0] = obj;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration m25176(java.lang.String str) {
        com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration mGConfiguration;
        synchronized (this) {
            mGConfiguration = getOutputMinFrameDuration.getOutputSizes.get(str);
            if (mGConfiguration == null) {
                if (str.equalsIgnoreCase(f876)) {
                    mGConfiguration = util.h.xy.ax.mb.m25250().m25252();
                } else if (str.equalsIgnoreCase(f873)) {
                    getOutputSizeshNQ4ISI = (getInputFormats + 47) % 128;
                    mGConfiguration = util.h.xy.ax.mb.m25250().m25253();
                    int i = getInputFormats + 69;
                    getOutputSizeshNQ4ISI = i % 128;
                    int i2 = i % 2;
                } else if (str.equalsIgnoreCase(f872)) {
                    getOutputSizeshNQ4ISI = (getInputFormats + 25) % 128;
                    mGConfiguration = util.h.xy.ax.mb.m25250().m25251();
                }
            }
        }
        return mGConfiguration;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.az.b m25175(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, java.lang.String str4, util.h.xy.au.rd[] rdVarArr, byte[][] bArr2, java.lang.String str5, java.lang.String str6) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.String obj;
        java.lang.Object obj2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("돯挆뎘檋\uf19e\ue22a輡鐺勮銉쩷힍ﳦ", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        int i = 0;
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((-272071350) - android.text.TextUtils.getTrimmedLength(""), (short) ((-56) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) (android.view.View.combineMeasuredStates(0, 0) - 31), (-62) - android.view.View.getDefaultSize(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) - 581547071, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.String obj3 = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ㄻ鷽ㅌ鑰矯摛袬ᛮ강锄䰔", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr3);
        sb2.append(((java.lang.String) objArr3[0]).intern());
        sb2.append(util.h.xy.al.ra.f320);
        sb2.append(str2);
        sb2.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㓹ಪ㒎Ե\uf078\ue3c5뀫", android.text.TextUtils.getOffsetBefore("", 0), objArr4);
        sb2.append(((java.lang.String) objArr4[0]).intern());
        sb2.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("曭揟暊橖騣規括䄸删罻ꇞ㩽⧨㫒泌ሬᆘ\ue357Ⴘ", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, objArr5);
        sb2.append(((java.lang.String) objArr5[0]).intern());
        java.lang.String obj4 = sb2.toString();
        if (android.text.TextUtils.isEmpty(str5)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj3);
            sb3.append(obj4);
            obj = sb3.toString();
        } else {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(obj3);
            int alpha = android.graphics.Color.alpha(0);
            getOutputSizeshNQ4ISI = (getInputFormats + 97) % 128;
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(alpha - 272071334, (short) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) - 89), (byte) (155 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 62, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 581547092, objArr6);
                sb4.append(((java.lang.String) objArr6[0]).intern());
                sb4.append(util.h.xy.al.ra.f320);
                sb4.append(str5);
                sb4.append(util.h.xy.al.ra.f320);
                sb4.append(obj4);
                obj = sb4.toString();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        util.h.xy.az.b bVar = new util.h.xy.az.b(obj, util.h.xy.az.b.EnumC0259b.f912);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((-272071332) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (android.view.KeyEvent.normalizeMetaState(0) - 70), (byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 34), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 63, (-581547125) - android.graphics.Color.blue(0), objArr7);
        java.lang.String intern = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("⯼㈆⯇霬\ud83f", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr8);
        bVar.m25264(intern, util.h.xy.bh.mb.m25475(bArr2, ((java.lang.String) objArr8[0]).intern()), "");
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((-272071317) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (33 - android.text.TextUtils.indexOf("", "", 0)), (byte) (android.text.TextUtils.getOffsetBefore("", 0) + 64), (-62) - android.view.View.resolveSizeAndState(0, 0, 0), (-581547102) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
        java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("䁺䬍䁗䋌懦爓总緒", android.text.TextUtils.getTrimmedLength(""), objArr10);
        bVar.m25264(intern2, str6, ((java.lang.String) objArr10[0]).intern());
        util.h.xy.au.g.m25127();
        java.lang.Object str7 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 13, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) android.text.TextUtils.indexOf("", ""), objArr11);
        jSONObject.put(((java.lang.String) objArr11[0]).intern(), str7);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(6 - android.view.View.MeasureSpec.getMode(0), android.view.MotionEvent.axisFromString("") + 1390, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20587), objArr12);
        java.lang.String intern3 = ((java.lang.String) objArr12[0]).intern();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.au.g.getHighSpeedVideoFpsRangesFor + 41) % 128;
        for (util.h.xy.au.rd rdVar : rdVarArr) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (rdVar != null) {
                if (rdVar == util.h.xy.au.rd.f879 && !android.text.TextUtils.isEmpty(str4)) {
                    int i2 = util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI + 103;
                    util.h.xy.au.g.getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(59 >> android.view.View.MeasureSpec.makeMeasureSpec(1, 1), 5999 << (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE), objArr13);
                        obj2 = objArr13[0];
                        i = 0;
                    } else {
                        int i3 = i;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.makeMeasureSpec(i3, i3) + 7, 1185 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 23671), objArr14);
                        i = 0;
                        obj2 = objArr14[0];
                    }
                    jSONObject2.put(((java.lang.String) obj2).intern(), str4);
                }
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(android.view.View.resolveSize(i, i) + 4, 593 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1)), objArr15);
                jSONObject2.put(((java.lang.String) objArr15[i]).intern(), rdVar.toString());
            }
            jSONArray.put(jSONObject2);
        }
        util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.au.g.getHighSpeedVideoFpsRangesFor + 85) % 128;
        jSONObject.put(intern3, jSONArray);
        int i4 = util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI + 45;
        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        bVar.m25258(jSONObject);
        return bVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.az.b m25178(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, int i, java.lang.String str4) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("돯挆뎘檋\uf19e\ue22a輡鐺勮銉쩷힍ﳦ", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetAfter("", 0) - 272071350, (short) ((-55) - android.text.TextUtils.indexOf("", "", 0)), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 32), android.widget.ExpandableListView.getPackedPositionType(0L) - 62, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 581547072, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ㄻ鷽ㅌ鑰矯摛袬ᛮ강锄䰔", android.text.TextUtils.getCapsMode("", 0, 0), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str2);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("㓹ಪ㒎Ե\uf078\ue3c5뀫", android.view.KeyEvent.keyCodeFromString(""), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        int resolveSize = android.view.View.resolveSize(0, 0);
        short longPressTimeout = (short) ((-59) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        getOutputSizeshNQ4ISI = (getInputFormats + 21) % 128;
        try {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(resolveSize - 272071306, longPressTimeout, (byte) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 113), android.view.View.combineMeasuredStates(0, 0) - 62, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 581547080, objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
            util.h.xy.au.g.m25127();
            bVar.m25258(util.h.xy.au.g.getHighSpeedVideoSizes(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), i, str4));
            return bVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.az.b m25173(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AuthMethod authMethod) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("돯挆뎘檋\uf19e\ue22a輡鐺勮銉쩷힍ﳦ", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 272071351, (short) ((android.view.KeyEvent.getMaxKeyCode() >> 16) - 55), (byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 31), (-62) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (-581547070) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str3);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.String obj2 = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ㄻ鷽ㅌ鑰矯摛袬ᛮ강锄䰔", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str2);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("锪\uf1c5镃\uf847⼪㲛줓닉쀼풣ᓑ醤\uda23꣦䱼", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            java.lang.String obj3 = sb2.toString();
            if (!android.text.TextUtils.isEmpty(str4)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(obj2);
                double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                short indexOf = (short) ((-89) - android.text.TextUtils.indexOf("", "", 0));
                byte keyCodeFromString = (byte) (android.view.KeyEvent.keyCodeFromString("") + 107);
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                getInputFormats = (getOutputSizeshNQ4ISI + 1) % 128;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) - 272071334, indexOf, keyCodeFromString, (-62) - (minimumFlingVelocity >> 16), (-581547093) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr5);
                sb3.append(((java.lang.String) objArr5[0]).intern());
                sb3.append(util.h.xy.al.ra.f320);
                sb3.append(str4);
                sb3.append(util.h.xy.al.ra.f320);
                sb3.append(obj3);
                obj = sb3.toString();
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(obj2);
                sb4.append(obj3);
                obj = sb4.toString();
                getInputFormats = (getOutputSizeshNQ4ISI + 89) % 128;
            }
            util.h.xy.az.b bVar = new util.h.xy.az.b(obj, util.h.xy.az.b.EnumC0259b.f912);
            util.h.xy.au.g.m25127();
            bVar.m25258(util.h.xy.au.g.Camera2StreamConfigurationMap(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), authMethod));
            return bVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.az.b m25177(java.lang.String str, java.lang.String str2, java.lang.String str3, org.json.JSONArray jSONArray) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("돯挆뎘檋\uf19e\ue22a輡鐺勮銉쩷힍ﳦ", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((-272071350) - keyCodeFromString, (short) ((-55) - android.view.Gravity.getAbsoluteGravity(0, 0)), (byte) ((-31) - android.view.View.MeasureSpec.getSize(0)), (-61) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-581547071) - android.view.View.resolveSize(0, 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ㄻ鷽ㅌ鑰矯摛袬ᛮ강锄䰔", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str2);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("‣粐⁄甙⮍㠡轌߲䵾鋋ၡퟬ漷▽䣁ﾊ", android.view.KeyEvent.keyCodeFromString(""), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
        bVar.m25258(util.h.xy.au.g.m25127().m25138(jSONArray));
        int i = getOutputSizeshNQ4ISI + 85;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.az.b m25174(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, java.lang.String str5, java.lang.String str6, java.lang.String str7) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.String obj;
        org.json.JSONObject highSpeedVideoFpsRangesFor;
        int i = getOutputSizeshNQ4ISI + 27;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            android.text.TextUtils.isEmpty(str4);
            throw new java.lang.ArithmeticException();
        }
        try {
            if (android.text.TextUtils.isEmpty(str4)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("돯挆뎘檋\uf19e\ue22a輡鐺勮銉쩷힍ﳦ", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(util.h.xy.al.ra.f320);
                sb.append(1);
                sb.append(util.h.xy.al.ra.f320);
                sb.append(1);
                sb.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-272071351) - android.view.MotionEvent.axisFromString(""), (short) (android.graphics.Color.rgb(0, 0, 0) + 16777161), (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 31), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 61, (-581547071) - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(util.h.xy.al.ra.f320);
                sb.append(str3);
                sb.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ㄻ鷽ㅌ鑰矯摛袬ᛮ강锄䰔", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                sb.append(util.h.xy.al.ra.f320);
                sb.append(str2);
                sb.append(util.h.xy.al.ra.f320);
                getInputFormats = (getOutputSizeshNQ4ISI + 35) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("㖉㎪㗧㨩\uf78f\ue423뷚\u125fɏꁷ챂\ue575窌檈铃", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22, objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("돯挆뎘檋\uf19e\ue22a輡鐺勮銉쩷힍ﳦ", (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr5);
                sb2.append(((java.lang.String) objArr5[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(1);
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(1);
                sb2.append(util.h.xy.al.ra.f320);
                getOutputSizeshNQ4ISI = (getInputFormats + 75) % 128;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 272071351, (short) ((-55) - android.view.View.resolveSizeAndState(0, 0, 0)), (byte) ((-32) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.text.TextUtils.indexOf("", "") - 62, android.text.TextUtils.getTrimmedLength("") - 581547071, objArr6);
                sb2.append(((java.lang.String) objArr6[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(str3);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ㄻ鷽ㅌ鑰矯摛袬ᛮ강锄䰔", android.view.View.resolveSizeAndState(0, 0, 0), objArr7);
                sb2.append(((java.lang.String) objArr7[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(str2);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("Ł咱ĥ崴搾瞁翷⚅敌扚忚✃乂ගݴ༚瘢", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr8);
                sb2.append(((java.lang.String) objArr8[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(str4);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("㖉㎪㗧㨩\uf78f\ue423뷚\u125fɏꁷ챂\ue575窌檈铃", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr9);
                sb2.append(((java.lang.String) objArr9[0]).intern());
                obj = sb2.toString();
            }
            util.h.xy.az.b bVar = new util.h.xy.az.b(obj, util.h.xy.az.b.EnumC0259b.f912);
            if (bArr == null) {
                util.h.xy.au.g.m25127();
                highSpeedVideoFpsRangesFor = util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(new org.json.JSONObject(), str5, str6, str7);
                int i2 = util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI + 19;
                util.h.xy.au.g.getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } else {
                util.h.xy.au.g.m25127();
                highSpeedVideoFpsRangesFor = util.h.xy.au.g.getHighSpeedVideoFpsRangesFor(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), str5, str6, str7);
            }
            bVar.m25258(highSpeedVideoFpsRangesFor);
            return bVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt m25170(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.NoSuchCardException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        getInputFormats = (getOutputSizeshNQ4ISI + 47) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
        getOutputSizeshNQ4ISI = (getInputFormats + 65) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryService m25185() {
        int i = getInputFormats;
        int i2 = i + 89;
        getOutputSizeshNQ4ISI = i2 % 128;
        getOutputSizeshNQ4ISI = (i + 21) % 128;
        if (util.h.xy.bh.ra.m25484().m25485() == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("踲쾄蹿옯왢햚監꧐﹙歳ﶤ⹔섓隋ꔎ؞省伶䲪\uffefႻ杻璮ힸ䠐ᾁᰊ輮恡㞨쟴惸鮖퀘\uefa9墈돜袎靓ぐ\ueb77ꃪ뼏\ue9e3", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        java.lang.String str = new java.lang.String(((util.h.xy.au.e) m25169().m25176(f872)).m25123());
        int i3 = getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㝻ۤ㜶ཏέಋ냣႙㜹굳⒵\ue854硚快簟쀞䀤虖閻㧲ꧩ긄귋ᆞ\uf178횘압䤨\ud92fﻈỨ\ua6f8⋅\u193e㚲麀\u0a8e䇺乎\uf653", android.text.TextUtils.getOffsetAfter("", 0), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.be.a aVar = new util.h.xy.be.a();
        int i4 = getOutputSizeshNQ4ISI + 47;
        getInputFormats = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i2 % 2 != 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState m25172() {
        boolean z;
        if (util.h.xy.bh.ra.m25484().m25485() != null) {
            boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoFpsRangesFor && highSpeedVideoSizes) {
                z = true;
            } else {
                getInputFormats = (getOutputSizeshNQ4ISI + 75) % 128;
                z = false;
            }
            if (Camera2StreamConfigurationMap2) {
                getInputFormats = (getOutputSizeshNQ4ISI + 85) % 128;
                if (z) {
                    return com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED;
                }
            }
            if (!highSpeedVideoFpsRangesFor || !Camera2StreamConfigurationMap2) {
                if (highSpeedVideoSizes) {
                    int i = getOutputSizeshNQ4ISI;
                    getInputFormats = (i + 39) % 128;
                    if (Camera2StreamConfigurationMap2) {
                        getInputFormats = (i + 15) % 128;
                        return com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.MG_TRANSACTION_HISTORY_CONFIGURED;
                    }
                }
                return com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.NOT_CONFIGURED;
            }
            int i2 = getOutputSizeshNQ4ISI + 105;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                return com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.MG_CARD_DIGITIZATION_CONFIGURED;
            }
            com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState mGSDKConfigurationState = com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.MG_CARD_DIGITIZATION_CONFIGURED;
            throw new java.lang.ArithmeticException();
        }
        return com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.NOT_CONFIGURED;
    }

    private boolean getHighSpeedVideoSizes() {
        boolean z;
        synchronized (getOutputMinFrameDurationlomOqCM) {
            z = m25176(f872) != null;
        }
        return z;
    }

    private boolean getHighSpeedVideoFpsRangesFor() {
        boolean z;
        synchronized (getOutputMinFrameDurationlomOqCM) {
            z = m25176(f876) != null;
        }
        return z;
    }

    private boolean Camera2StreamConfigurationMap() {
        boolean z;
        synchronized (getOutputMinFrameDurationlomOqCM) {
            z = m25176(f873) != null;
        }
        return z;
    }

    private static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getHighSpeedVideoFpsRangesFor(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.NoSuchCardException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        int i = getOutputSizeshNQ4ISI + 85;
        getInputFormats = i % 128;
        byte[] bArr = null;
        if (i % 2 == 0) {
            if (util.h.xy.bh.ra.m25484().m25485() == null) {
                throw new java.lang.IllegalStateException(util.h.xy.ay.ma.f887);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f889);
            }
            try {
                byte[] m25217 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25217(str, true);
                getInputFormats = (getOutputSizeshNQ4ISI + 13) % 128;
                if (m25217 == null || m25217.length == 0) {
                    return Camera2StreamConfigurationMap(null);
                }
                try {
                    try {
                        new java.lang.String(m25217, java.nio.charset.StandardCharsets.UTF_8);
                        bArr = util.h.xy.au.g.m25127().m25139(m25217).toString().getBytes();
                        return new util.h.xy.bb.ra(bArr);
                    } catch (org.json.JSONException e) {
                        e.getMessage();
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(util.h.xy.ay.ma.f894);
                    }
                } finally {
                    java.util.Arrays.fill(m25217, (byte) 0);
                    if (bArr != null) {
                        java.util.Arrays.fill(bArr, (byte) 0);
                    }
                }
            } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e2) {
                return Camera2StreamConfigurationMap(e2);
            }
        }
        util.h.xy.bh.ra.m25484().m25485();
        throw null;
    }

    private static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException mGException) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.NoSuchCardException {
        if (mGException != null) {
            int i = getInputFormats + 81;
            getOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                mGException.getMessage();
                throw new java.lang.ArithmeticException();
            }
            if (mGException.getMessage() != null) {
                getInputFormats = (getOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            }
        }
        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.NoSuchCardException(util.h.xy.ay.ma.f890);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.az.ra m25183(util.h.xy.au.rd[] rdVarArr, byte[] bArr, java.lang.String str, util.h.xy.au.c cVar, java.lang.String str2) throws util.h.xy.az.ma, org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        java.lang.String str3;
        java.lang.String str4 = new java.lang.String(((util.h.xy.au.re) m25176(f876)).m25206(), java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str5 = new java.lang.String(util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes(), java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str6 = new java.lang.String(util.h.xy.bh.mb.m25469(), java.nio.charset.StandardCharsets.UTF_8);
        byte[] m25479 = util.h.xy.bh.mb.m25479();
        if (m25479 == null) {
            str3 = "";
        } else {
            str3 = new java.lang.String(m25479, java.nio.charset.StandardCharsets.UTF_8);
        }
        util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(m25175(str4, str5, str6, bArr, str, rdVarArr, cVar.m25119(), str3, str2));
        int i = getOutputSizeshNQ4ISI + 65;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return m25276;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.az.ra m25187(byte[] bArr, int i, java.lang.String str) throws util.h.xy.az.ma, org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        util.h.xy.au.mf m25169 = m25169();
        util.h.xy.au.re reVar = (util.h.xy.au.re) m25169.m25176(f876);
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(m25169.m25178(new java.lang.String(reVar.m25206(), java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes(), java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(util.h.xy.bh.mb.m25469(), java.nio.charset.StandardCharsets.UTF_8), bArr, i, str));
        getInputFormats = (getOutputSizeshNQ4ISI + 47) % 128;
        return m25276;
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.az.ra m25179(byte[] bArr) throws util.h.xy.az.ma, org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        int i = (getOutputSizeshNQ4ISI + 9) % 128;
        getInputFormats = i;
        if (bArr != null) {
            getOutputSizeshNQ4ISI = (i + 83) % 128;
            if (bArr.length != 0) {
                java.lang.String str = new java.lang.String(((util.h.xy.au.re) m25176(f876)).m25206(), java.nio.charset.StandardCharsets.UTF_8);
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AuthMethod authMethod = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AuthMethod();
                java.lang.String str2 = "";
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0, 0) - 272071269, (short) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 62), (byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 14), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 63, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 581547107, objArr);
                authMethod.setType(((java.lang.String) objArr[0]).intern());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("㑰蓖㑆贔\ueead﵄䞰婆", android.text.TextUtils.indexOf("", ""), objArr2);
                authMethod.setId(((java.lang.String) objArr2[0]).intern());
                java.lang.String str3 = new java.lang.String(util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes(), java.nio.charset.StandardCharsets.UTF_8);
                java.lang.String str4 = new java.lang.String(util.h.xy.bh.mb.m25469(), java.nio.charset.StandardCharsets.UTF_8);
                byte[] m25479 = util.h.xy.bh.mb.m25479();
                if (m25479 != null) {
                    str2 = new java.lang.String(m25479, java.nio.charset.StandardCharsets.UTF_8);
                    getOutputSizeshNQ4ISI = (getInputFormats + 45) % 128;
                }
                return util.h.xy.az.mb.m25275().m25276(m25173(str, str3, str4, str2, bArr, authMethod));
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("뒏ꪂ듌ꌁꚵ딟䥁鍚魲哷鵜ᇷﮆ\uf3a1엣㧳쏼⨟ⰳ쁍⨠ɚᐍ\ue811犚竾粓낶嫃勢ꝭ彼ꄭ딞轸朎西\ued9a\uf794", android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.az.ra m25186(org.json.JSONArray jSONArray) throws util.h.xy.az.ma, org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        int i = getOutputSizeshNQ4ISI + 19;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            if (jSONArray == null || jSONArray.length() == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("퀫缱큯皴踤鶛縈\uf7ef仌接뗀⛱鼈☜\ued6e\u0ee5ꜛﾄ҈\uf702介\ud7fe㳝\udf4fᘵ꼂吘螱㹩蝘迼栯얎惡\ua7e0們\uedc4㠯\udf5c㢄땶ၝ\uf758\ue128", android.text.TextUtils.getOffsetBefore("", 0), objArr);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
            }
            util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(m25177(new java.lang.String(((util.h.xy.au.re) m25176(f876)).m25206(), java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(util.h.xy.bh.mb.m25474(null).getBytes(), java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(util.h.xy.bh.mb.m25469(), java.nio.charset.StandardCharsets.UTF_8), jSONArray));
            getInputFormats = (getOutputSizeshNQ4ISI + 55) % 128;
            return m25276;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.az.ra m25182(byte[] bArr, java.lang.String str, util.h.xy.au.md mdVar, util.h.xy.au.me meVar, java.lang.String str2) throws util.h.xy.az.ma, org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        getOutputSizeshNQ4ISI = (getInputFormats + 91) % 128;
        util.h.xy.au.mf m25169 = m25169();
        util.h.xy.au.re reVar = (util.h.xy.au.re) m25169.m25176(f876);
        if (bArr != null) {
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        }
        util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(m25169.m25174(new java.lang.String(reVar.m25206(), java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes(), java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(util.h.xy.bh.mb.m25469(), java.nio.charset.StandardCharsets.UTF_8), str, bArr, mdVar.m25167(), meVar.m25168(), str2));
        getOutputSizeshNQ4ISI = (getInputFormats + 63) % 128;
        return m25276;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25188(util.h.xy.az.b bVar) {
        int i = (getOutputSizeshNQ4ISI + 33) % 128;
        getInputFormats = i;
        getOutputSizeshNQ4ISI = (i + 89) % 128;
        try {
            byte[] bytes = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes();
            if (bytes != null) {
                int i2 = getInputFormats + 121;
                getOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    int length = bytes.length;
                    throw new java.lang.ArithmeticException();
                }
                if (bytes.length > 0) {
                    java.lang.String str = new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\uf3b6禙\uf3ee灘촵\ude9a\uec06푪䡩\uf1a3\uf6d8뒣볻₼깩", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                    bVar.m25264(((java.lang.String) objArr[0]).intern(), str, null);
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        int i3 = getOutputSizeshNQ4ISI;
        int i4 = i3 + 73;
        getInputFormats = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i3 + 109;
        getInputFormats = i5 % 128;
        try {
        } catch (java.lang.Exception e2) {
            e2.getMessage();
        }
        if (i5 % 2 != 0) {
            util.h.xy.bh.mb.m25469();
            throw null;
        }
        byte[] m25469 = util.h.xy.bh.mb.m25469();
        if (m25469 != null) {
            int i6 = getOutputSizeshNQ4ISI + 67;
            getInputFormats = i6 % 128;
            if (i6 % 2 != 0) {
                int length2 = m25469.length;
                throw new java.lang.ArithmeticException();
            }
            if (m25469.length > 0) {
                java.lang.String str2 = new java.lang.String(m25469, java.nio.charset.StandardCharsets.UTF_8);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-272071216) - android.graphics.Color.green(0), (short) (46 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 50), (-62) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (-581547102) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
                bVar.m25264(((java.lang.String) objArr2[0]).intern(), str2, null);
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionGroup(0L) - 272071262, (short) (android.graphics.Color.rgb(0, 0, 0) + 16777343), (byte) (58 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (-62) - android.text.TextUtils.getOffsetAfter("", 0), (-581547104) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        bVar.m25264(((java.lang.String) objArr3[0]).intern(), getHighResolutionOutputSizeshNQ4ISI(), null);
        getInputFormats = (getOutputSizeshNQ4ISI + 69) % 128;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((-272071252) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 85), (byte) ((-48) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 61, (-581547158) - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ꇛ\uf55cꇭﲞൃẪÉ虅쓰ᴿ", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        getOutputSizeshNQ4ISI = (getInputFormats + 89) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 272071241, (short) ((-48) - android.view.View.MeasureSpec.getMode(0)), (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) - 120), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 62, android.view.View.getDefaultSize(0, 0) - 581547144, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern().substring(1));
            sb.append(intern);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
            short red = (short) ((-52) - android.graphics.Color.red(0));
            byte capsMode = (byte) (28 - android.text.TextUtils.getCapsMode("", 0, 0));
            float minVolume = android.media.AudioTrack.getMinVolume();
            getInputFormats = (getOutputSizeshNQ4ISI + 17) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(packedPositionChild - 272071236, red, capsMode, (-62) - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), (-581547086) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr4);
            sb2.append(java.lang.System.getProperty(((java.lang.String) objArr4[0]).intern()));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((-272071226) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 74), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) - 59), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 62, (-581547157) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(obj);
            return sb2.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25180(com.gemalto.mfs.mwsdk.mobilegateway.listener.MGConfigurationResetListener mGConfigurationResetListener, boolean z, android.content.Context context) {
        android.content.Context context2;
        if (context == null) {
            int i = getOutputSizeshNQ4ISI + 43;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                util.h.xy.bh.ra.m25484().m25485();
                throw null;
            }
            context2 = util.h.xy.bh.ra.m25484().m25485();
        } else {
            context2 = context;
        }
        if (context2 == null) {
            if (mGConfigurationResetListener != null) {
                util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CONTEXT_MISSING_ERROR, util.h.xy.ay.ma.f906);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ጒ繏፞石噃䗒ⳳㅴ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("碤ꀧ磩ꦌ땏ꛀԨ彝醕ᢡ躕嶆㞗聾호痀", android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                mGConfigurationResetListener.onError(mbVar);
                return;
            }
            return;
        }
        try {
            util.h.xy.au.rg.m25213(context2).m25222(context2);
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
            e.printStackTrace();
            e.getMessage();
            if (mGConfigurationResetListener != null) {
                util.h.xy.au.mb mbVar2 = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SECURESTORAGE_WIPE_ALL_ERROR, -1, -1, util.h.xy.ay.ma.f908, e);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ጒ繏፞石噃䗒ⳳㅴ", android.view.Gravity.getAbsoluteGravity(0, 0), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("碤ꀧ磩ꦌ땏ꛀԨ彝醕ᢡ躕嶆㞗聾호痀", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                mGConfigurationResetListener.onError(mbVar2);
                return;
            }
        }
        if (z) {
            synchronized (getOutputMinFrameDurationlomOqCM) {
                getOutputMinFrameDuration.getOutputSizes.clear();
            }
            if (mGConfigurationResetListener != null) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ጒ繏፞石噃䗒ⳳㅴ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr5);
                java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSize(0, 0) - 272071197, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 40), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + '\b'), (-62) - android.view.KeyEvent.normalizeMetaState(0), (-581547113) - android.graphics.Color.green(0), objArr6);
                util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
                mGConfigurationResetListener.onSuccess();
                return;
            }
            return;
        }
        int i2 = getInputFormats + 1;
        getOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (mGConfigurationResetListener != null) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ጒ繏፞石噃䗒ⳳㅴ", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr7);
            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
            try {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 272071197, (short) ((-41) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) (android.graphics.Color.red(0) + 56), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 62, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 581547113, objArr8);
                util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr8[0]).intern());
                mGConfigurationResetListener.onSuccess();
                getOutputSizeshNQ4ISI = (getInputFormats + 113) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m25181() {
        int i = getOutputSizeshNQ4ISI + 121;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            m25172();
            com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState mGSDKConfigurationState = com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.NOT_CONFIGURED;
            throw null;
        }
        if (m25172() != com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.NOT_CONFIGURED) {
            return true;
        }
        getInputFormats = (getOutputSizeshNQ4ISI + 15) % 128;
        return false;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRangesFor = -2343934748723580476L;
        Camera2StreamConfigurationMap = -141136541;
        getOutputFormats = -408872987;
        getHighSpeedVideoSizesFor = -989289618;
        getHighResolutionOutputSizeshNQ4ISI = new byte[]{16, 63, -56, -56, 58, com.google.common.base.Ascii.VT, com.visa.cbp.getEncExpo.kernelVersion, -5, com.visa.cbp.getEncExpo.kernelVersion, -119, -111, -59, -117, -62, 1, 87, -3, -105, com.visa.cbp.getEncExpo.startTransaction, -7, -102, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, 101, 8, -5, -78, -59, -81, -45, -95, -61, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -77, -60, -5, -124, com.google.common.base.Ascii.ETB, -3, 76, -99, 88, -7, 65, 74, -24, -104, -18, -84, 48, com.google.common.base.Ascii.VT, 122, com.google.common.base.Ascii.NAK, 1, 102, 110, 124, 8, 126, 114, 9, 121, 13, 70, 10, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 80, 114, 2, 69, 19, 19, 5, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 70, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 101, 113, 101, 93, 102, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 120, 8, com.google.common.base.Ascii.DC4, 18, 4, 110, 124, 4, 19, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, 101, 108, -99, 69, com.visa.cbp.getEncExpo.IResultReceiver, -38, com.visa.cbp.getEncExpo.IResultReceiver2, -111, 125, com.google.common.base.Ascii.NAK, -79, -81, com.visa.cbp.getEncExpo.kernelVersion, 89, -90, -12, com.visa.cbp.getEncExpo.startTransaction, -105, -11, 16, 110, -94, 126, 43, com.google.common.base.Ascii.NAK, -106, -111, -50, -106, -69, 14, -52, -120, -100, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 13, 75, 82, 91, 62, 40, Byte.MAX_VALUE, 14, -33, com.google.common.base.Ascii.FS, -97, 77, 121, -33, -41, 67, -35, 102, 60, 75, -47, 120, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 46, -114, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.ETB, -67, -102, -44, -71, -70, -99, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 47, -119, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
    }
}
