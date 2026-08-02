package util.h.xy.bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static long Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static char getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static int getOutputMinFrameDuration;
    private static final byte[] getOutputMinFrameDurationlomOqCM;
    private static final /* synthetic */ util.h.xy.bx.ra[] getOutputSizes;
    private static char getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.bx.ra f1063;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bx.ra f1064;

    private ra(java.lang.String str, int i) {
    }

    public static util.h.xy.bx.ra valueOf(java.lang.String str) {
        getOutputFormats = (getOutputMinFrameDuration + 9) % 128;
        util.h.xy.bx.ra raVar = (util.h.xy.bx.ra) java.lang.Enum.valueOf(util.h.xy.bx.ra.class, str);
        getOutputFormats = (getOutputMinFrameDuration + 33) % 128;
        return raVar;
    }

    public static util.h.xy.bx.ra[] values() {
        getOutputMinFrameDuration = (getOutputFormats + 25) % 128;
        util.h.xy.bx.ra[] raVarArr = (util.h.xy.bx.ra[]) getOutputSizes.clone();
        getOutputMinFrameDuration = (getOutputFormats + 85) % 128;
        return raVarArr;
    }

    static {
        util.h.xy.bx.ra[] raVarArr;
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ര꿂탐㫔ꡥ祵⭕쐸", (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, "\uedc0잜뚻\ueed1", "燥轥番駣", objArr);
        util.h.xy.bx.ra raVar = new util.h.xy.bx.ra(((java.lang.String) objArr[0]).intern(), 0);
        f1063 = raVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ueeac䭫緟凧狙ᵼꝪ궣賯鸦퍵鷉槂අ䵱澐詉㐫ᱝẊ\ue964㊹\udbac垍칬郭㚚쑏", (char) (38870 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "뒊젟횻\uda97", "燥轥番駣", objArr2);
        util.h.xy.bx.ra raVar2 = new util.h.xy.bx.ra(((java.lang.String) objArr2[0]).intern(), 1);
        f1064 = raVar2;
        int i = getOutputFormats + 53;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        if (i % 2 != 0) {
            raVarArr = new util.h.xy.bx.ra[4];
            raVarArr[1] = raVar;
            raVarArr[0] = raVar2;
        } else {
            raVarArr = new util.h.xy.bx.ra[]{raVar, raVar2};
        }
        getOutputFormats = (i2 + 59) % 128;
        getOutputSizes = raVarArr;
        getHighSpeedVideoSizesFor = util.h.xy.bx.ra.class.getName();
        getOutputMinFrameDurationlomOqCM = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        getOutputMinFrameDuration = (getOutputFormats + 93) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25790(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputMinFrameDuration;
        getOutputFormats = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int i2 = i + 99;
        getOutputFormats = i2 % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, i2 % 2 == 0 ? 0 : 1);
        int i3 = getOutputMinFrameDuration;
        getOutputFormats = (i3 + 53) % 128;
        int i4 = i3 + 107;
        getOutputFormats = i4 % 128;
        if (i4 % 2 != 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m25787(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = (getOutputMinFrameDuration + 51) % 128;
        getOutputFormats = i;
        getOutputMinFrameDuration = (i + 95) % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, 2);
        int i2 = (getOutputMinFrameDuration + 95) % 128;
        getOutputFormats = i2;
        getOutputMinFrameDuration = (i2 + 55) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25788(int i) {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("ꕃ鸋\u0600Ǒ劳㦳㼳ީ", (char) android.text.TextUtils.indexOf("", "", 0), (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), "䤏㬴\uf3f9쓌", "燥轥番駣", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int i2 = (getOutputMinFrameDuration + 43) % 128;
            getOutputFormats = i2;
            getOutputMinFrameDuration = (i2 + 95) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("벛餻궴ꒅ檼㑗엥떙뫳壳䉍䑗ᤊ\ue762嬷짇\u0a84뉤蒄㐟烨\u0dfd쁪絳ꗦ晏", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("晞詈臆팬\ue4dc崅녽瀵\u16fb꧔䷛°", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, objArr3);
                byte[] bArr = new byte[i / 8];
                ((java.security.SecureRandom) cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, intern)).nextBytes(bArr);
                return bArr;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (bArr.length != 16) {
            int i2 = getOutputFormats;
            getOutputMinFrameDuration = (i2 + 89) % 128;
            if (bArr.length != 24) {
                int i3 = i2 + 77;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 == 0 ? bArr.length != 32 : bArr.length != 64) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("䤑ම羙뫎俯韙ષ螸⭭㭸Ꝝ퐷\u0dfb弻栐ꧭ뷊캷䪮\uffddᚡӿ⧱渎罣\ue6e1\uecf4㣠㮾楢휔髀꾒ႛ歧ꤎ퓹㟚듢ﺣ▝슬", (char) (17543 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionType(0L), "ՙ蠿蛘ꥄ", "燥轥番駣", objArr);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                }
            }
        }
        util.h.xy.et.a aVar = new util.h.xy.et.a(new util.h.xy.eo.a(new util.h.xy.ej.ma()), new util.h.xy.et.mb());
        util.h.xy.ep.e eVar = new util.h.xy.ep.e(new util.h.xy.ep.mc(bArr), getOutputMinFrameDurationlomOqCM);
        if (i == 1) {
            getOutputFormats = (getOutputMinFrameDuration + 87) % 128;
            aVar.mo26537(true, eVar);
        } else if (i == 2) {
            aVar.mo26537(false, eVar);
        }
        byte[] bArr3 = new byte[aVar.mo26535(bArr2.length)];
        int mo26536 = aVar.mo26536(bArr2, 0, bArr2.length, bArr3, 0);
        try {
            return java.util.Arrays.copyOfRange(bArr3, 0, mo26536 + aVar.mo26539(bArr3, mo26536));
        } catch (java.lang.IllegalStateException | util.h.xy.ef.mc | util.h.xy.ef.md e) {
            e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ᤆ쾒덕鞛涓禎Ꮶ蟿ӗ\uf773溁\uf4ab酚䮔牕儓瘆섪↼竲锺牋픑鋶㮈冾瘅ಊ䬶\udf31⺹氩袛䉖\ue779禋祻㲵བ\ue0db\ue696\uf1c9粓皚衕", (char) (46772 - android.view.View.getDefaultSize(0, 0)), (-2025547040) - android.view.View.getDefaultSize(0, 0), "\ue096䒚뒇ζ", "燥轥番駣", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(e.getMessage());
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25785(byte[] bArr) {
        int i = getOutputMinFrameDuration + 107;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ar.b.m25074(bArr);
            byte[] m26810 = util.h.xy.fa.mb.m26810(bArr);
            getOutputMinFrameDuration = (getOutputFormats + 77) % 128;
            return m26810;
        }
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.fa.mb.m26810(bArr);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m25786(java.lang.String str) {
        int i = getOutputFormats + 39;
        getOutputMinFrameDuration = i % 128;
        byte[] m26807 = util.h.xy.fa.mb.m26807(str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getOutputMinFrameDuration = (getOutputFormats + 47) % 128;
        return m26807;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 27) % 128;
        char[] cArr = charArray2;
        char[] charArray3 = str.toCharArray();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 43) % 128;
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 45) % 128;
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i2]) % 65535);
            cArr3[i3] = (char) (((cArr2[i3] * 32718) + cArr3[i2]) / 65535);
            cArr2[i3] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i3] ^ r2[rcVar.f2652]) ^ (Camera2StreamConfigurationMap ^ 2457411417541981002L)) ^ ((int) (getOutputStallDuration ^ 2457411417541981002L))) ^ ((char) (getOutputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 1) % 128;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25789(byte[] bArr) {
        int i = getOutputFormats + 29;
        getOutputMinFrameDuration = i % 128;
        byte[] m26811 = util.h.xy.fa.mb.m26811(bArr);
        if (i % 2 == 0) {
            return m26811;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = (char) 49424;
        getHighResolutionOutputSizeshNQ4ISI = (char) 33922;
        getInputSizeshNQ4ISI = (char) 40519;
        getInputFormats = (char) 28839;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        Camera2StreamConfigurationMap = -4901869399441325393L;
        getOutputStallDuration = 294925130;
        getOutputSizeshNQ4ISI = (char) 13130;
    }
}
