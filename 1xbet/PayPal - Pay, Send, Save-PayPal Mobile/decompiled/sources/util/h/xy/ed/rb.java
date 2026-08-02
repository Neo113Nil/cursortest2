package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class rb extends util.h.xy.dh.mh implements util.h.xy.dh.mc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 27630;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 39187;
    private static char getInputFormats = 41006;
    private static int getOutputFormats = 0;
    private static char getOutputMinFrameDuration = 50939;
    util.h.xy.dh.mi Camera2StreamConfigurationMap;

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 97;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                cArr2[1] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630];
                i2 = 1;
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                i2 = 0;
            }
            int i4 = 58224;
            while (i2 < 16) {
                int i5 = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                getHighSpeedVideoSizes = i5;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                i4 -= 40503;
                i2++;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 69) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i6 = getHighResolutionOutputSizeshNQ4ISI + 111;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public final java.lang.String toString() {
        int i = getOutputFormats + 19;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            m26519();
            throw null;
        }
        java.lang.String m26519 = m26519();
        getOutputFormats = (getHighSpeedVideoFpsRangesFor + 5) % 128;
        return m26519;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = (getOutputFormats + 119) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        util.h.xy.dh.mi miVar = this.Camera2StreamConfigurationMap;
        int i2 = i + 35;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return miVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m26519() {
        int i = getOutputFormats + 119;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.mi miVar = this.Camera2StreamConfigurationMap;
        if (!(miVar instanceof util.h.xy.dh.ro)) {
            return ((util.h.xy.dh.me) miVar).m26314();
        }
        java.lang.String m26348 = ((util.h.xy.dh.ro) miVar).m26348();
        int i2 = getHighSpeedVideoFpsRangesFor + 55;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return m26348;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ed.rb m26518(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 115;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj == null || (obj instanceof util.h.xy.ed.rb)) {
            util.h.xy.ed.rb rbVar = (util.h.xy.ed.rb) obj;
            int i3 = i + 117;
            getOutputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                return rbVar;
            }
            throw null;
        }
        if (obj instanceof util.h.xy.dh.ro) {
            return new util.h.xy.ed.rb((util.h.xy.dh.ro) obj);
        }
        if (obj instanceof util.h.xy.dh.me) {
            return new util.h.xy.ed.rb((util.h.xy.dh.me) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("※Ǧ谎因ش᪬㵞\ud8f4惇䦬꽍拧䦾俏哗浝㵞\ud8f4娲퓔䦾俏Ⱦ퓛ఏ╝\uda81잌", 27 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public rb(java.util.Date date, java.util.Locale locale) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\udba3ﺨ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr);
        java.util.SimpleTimeZone simpleTimeZone = new java.util.SimpleTimeZone(0, ((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("Ɽ닡Ɽ닡쒈\ue358ਠ\uec1d֝鼩\udc3b總칇詾", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, objArr2);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern(), locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleDateFormat.format(date));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\udba3ﺨ", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.String obj = sb.toString();
        int parseInt = java.lang.Integer.parseInt(obj.substring(0, 4));
        this.Camera2StreamConfigurationMap = (parseInt < 1950 || parseInt > 2049) ? new util.h.xy.dh.rx(obj) : new util.h.xy.dh.ac(obj.substring(2));
    }

    public rb(util.h.xy.dh.mi miVar) {
        if ((miVar instanceof util.h.xy.dh.ro) || (miVar instanceof util.h.xy.dh.me)) {
            this.Camera2StreamConfigurationMap = miVar;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("※Ǧ谎因ش᪬㵞\ud8f4惇䦬꽍拧䦾俏ᯍႋ܉惮Ḭ걖릆䴥\ue661Ꙑ䰇聑ኁಸ谲옵", android.text.TextUtils.getCapsMode("", 0, 0) + 29, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }
}
