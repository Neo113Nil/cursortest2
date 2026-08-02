package util.h.xy.ep;

/* loaded from: classes18.dex */
public class md extends util.h.xy.ep.mb {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final java.math.BigInteger getInputFormats;
    private static final java.math.BigInteger getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final util.h.xy.fb.mb.C0268mb getOutputMinFrameDuration;
    private static long getOutputMinFrameDurationlomOqCM;
    private java.math.BigInteger getOutputSizes;
    private java.math.BigInteger getOutputStallDuration;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 59) % 128;
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 93) % 128;
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
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 5) % 128;
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getOutputMinFrameDurationlomOqCM ^ 2457411417541981002L)) ^ ((int) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (Camera2StreamConfigurationMap ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 89) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getOutputMinFrameDuration = new util.h.xy.fb.mb.C0268mb();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ꆋ水˻洗⺁⯗뗁畚麮璦擼⯻찆\uf656ួ恾咱Ẋ拠쀒䫧揉\uf3ae뺋柟욗\ueb0e䘑\udba0ቖ䵕\udd31蠳᥇凿\uf413궝禳\uf3e4㊙\u070f昧\udc14\uedf1쟐뵋\udf67ᱵ趸⸤ᯎ⻘鼱㒠诛銕砱ឝ铔ꕺ̺ᘏ᧐紫\uf21e╯\uf402鶒্笶㶓⏭\ude0d㕬\u1afaᇵ썸ꕫ郃鶎⤥࿆約큔◧ৈ必\ue4a2꿃熩︆镙皯벢槯糘༜\ud8d6稇‐Ҽ턡䤼砒⭈籞\ue98fꚇ怰為ﺦ\ue738锬\uf138啭ꔁ䓪区苞虹༣땲ឆ뀞쪞㵄摦䁡ꂌᆈ䤩쩵뵟㣈\uee11Ꝭ闣嵑菹諠\ue67a̪쫇㻯\ue6f3㨧凮㬏上ꨠ茕鏌┊ྨ越\uaad0ꁛ䞹\ue046呟㗐鑭薃駍還쬬뾧\ue4fc큠✎\udd77⇭㚐㍄豥쪝\ue11d㏒\uefc9↠≦໐ࢼ㹸뒔ò翏돿๏肼\uf06d畑莙\u13f7‹\udf5f㵕ꤾ寰\ue5f0㌂⛂波\uf196\uef0c䓗唐\ude44\ueb56瑚ℯ鬱邿襾\u1aff뫳䑯⹋ᷖ著\ufaf3膧遦؛寷㿍許翼魱퉪츣艃普濞ꫫۡኣ⾒䭴鞅㦟庵Ᾱ萂稢\uef5c䥲澌\uea3cꘪ㡒庿玵佥蘄\uf12a㭠", (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), 1128089007 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "꾙㵅\udb43\ueba3", "\u0000\u0000\u0000\u0000", objArr);
            getInputSizeshNQ4ISI = new java.math.BigInteger(((java.lang.String) objArr[0]).intern(), 16);
            getInputFormats = java.math.BigInteger.valueOf(1L);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public java.math.BigInteger m26665() {
        int i = (getOutputFormats + 81) % 128;
        getHighSpeedVideoSizesFor = i;
        java.math.BigInteger bigInteger = this.getOutputSizes;
        int i2 = i + 99;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public java.math.BigInteger m26664() {
        int i = getHighSpeedVideoSizesFor + 31;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return this.getOutputStallDuration;
        }
        throw null;
    }

    private static java.math.BigInteger getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger, boolean z) {
        if (!z) {
            if ((bigInteger.intValue() & 1) == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ꇧᘊ\uf8b1ⱌ쨬拃㠍쎒\uef8a뼭长⿲䐰醮琷뛰塊\udbd7\ue73b", (char) (android.graphics.Color.blue(0) + 59683), (-122119153) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "ႜ뢜⏸\u31e9", "\u0000\u0000\u0000\u0000", objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("턥瓒슱䑜\ue907銡ꁄ咍ᖑᖗ菠ꛨ\uf2ee\ud8ad㋜떄ᦫᜮ얗㞢⪞帜蝧걅\uea0c닂꿏擾◧滺荭Ʃ\ude9b瞠쏀맰∦", (char) android.graphics.Color.red(0), 1256451186 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "獊\ue3ec\ue64a\u2d75", "\u0000\u0000\u0000\u0000", objArr2);
            if (util.h.xy.fb.rc.m26853(((java.lang.String) objArr2[0]).intern())) {
                return bigInteger;
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("缰⪇좀\uda47౼鱊\udcc3䜅眡隕䅆鄈\uea53긅㽠唒邕邮햼侾컨盽첹\ue462雚迺䪲⢕ᰜ", (char) (42203 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 543061898 + android.graphics.Color.argb(0, 0, 0, 0), "諔幷\udb20㲤", "\u0000\u0000\u0000\u0000", objArr3);
            if (util.h.xy.fb.rc.m26851(((java.lang.String) objArr3[0]).intern(), 15360) < bigInteger.bitLength()) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("㨏봁\uea90칵㢽⑯\uf315갸蚍삪ԁ哨鎛䩈ꀃ㩪쥧栩协衖ꥒᲜ馦覥\ue2b6껎", (char) (android.text.TextUtils.getOffsetBefore("", 0) + 40217), android.view.View.MeasureSpec.getMode(0), "摈寻\u1942\u2d9d", "\u0000\u0000\u0000\u0000", objArr4);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
            }
            if (!bigInteger.gcd(getInputSizeshNQ4ISI).equals(getInputFormats)) {
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("緒疻鹫\ue1b6䫅ꏀ馽寪鞛縷\uf7dc似鰤뒄鰲\uf7c5쏲䫕끘㠉\uf254ﮅ抧ﹻ쩇㏃䄌ቊ첧㑎\uf217췜髖\ue775辖\u1c8c", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1, "⅙䐒甋嶎", "\u0000\u0000\u0000\u0000", objArr5);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int bitLength = bigInteger.bitLength() / 2;
            if (!util.h.xy.er.mb.m26701(bigInteger, util.h.xy.ef.rb.m26558(), bitLength >= 1536 ? 3 : bitLength >= 1024 ? 4 : bitLength >= 512 ? 7 : 50).m26702()) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("罟蘐\ue721븜腋씦\u0557\uf6e2볅姘釋䍎놔볞枧\ue34d揽၎㰢㻟\uf80d䇦璝쪋滫蛤毺叢", (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 53514), android.graphics.drawable.Drawable.resolveOpacity(0, 0), "ᡚ룹㩱痑", "\u0000\u0000\u0000\u0000", objArr6);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
            }
        }
        getOutputMinFrameDuration.m26838(bigInteger);
        return bigInteger;
    }

    public md(boolean z, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, boolean z2) {
        super(z);
        if (z || (bigInteger2.intValue() & 1) != 0) {
            this.getOutputStallDuration = getOutputMinFrameDuration.m26837(bigInteger) ? bigInteger : getHighSpeedVideoFpsRangesFor(bigInteger, z2);
            this.getOutputSizes = bigInteger2;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("鐆苊䱨畷췲媍閴\uf595ꢈ揰ꄱ垷疛邜豕颶䠚\ue7a6羵\uf891䶶후茙쭕吒躚", (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4916), android.text.TextUtils.getOffsetBefore("", 0), "\ue501潚㓸\uf513", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    public md(boolean z, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this(z, bigInteger, bigInteger2, false);
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputMinFrameDurationlomOqCM = 2457411417541981002L;
        getHighResolutionOutputSizeshNQ4ISI = 294925130;
        Camera2StreamConfigurationMap = (char) 17294;
    }
}
