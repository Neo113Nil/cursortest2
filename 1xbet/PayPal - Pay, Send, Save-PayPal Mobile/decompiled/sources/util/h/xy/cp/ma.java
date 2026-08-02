package util.h.xy.cp;

/* loaded from: classes5.dex */
public final class ma {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static char getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 0;
    private static final java.lang.String getOutputFormats;
    private static char[] getOutputMinFrameDuration = null;
    private static int getOutputStallDuration = 1;
    private static long getOutputStallDurationlomOqCM;

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap();
        getOutputFormats = util.h.xy.cp.ma.class.getName();
        getHighSpeedVideoSizes = (getOutputStallDuration + 1) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25992(util.h.xy.ct.mb mbVar) throws util.h.xy.cm.ma {
        int i = getOutputStallDuration + 21;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return util.h.xy.cm.mb.m25967(getHighSpeedVideoSizes(mbVar));
        }
        util.h.xy.cm.mb.m25967(getHighSpeedVideoSizes(mbVar));
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputStallDurationlomOqCM ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 79) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputStallDurationlomOqCM ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 73;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25993(util.h.xy.ct.mb mbVar) throws util.h.xy.cm.ma {
        int i = getHighSpeedVideoSizes + 83;
        getOutputStallDuration = i % 128;
        if (i % 2 != 0) {
            return util.h.xy.cm.mb.m25967(getHighSpeedVideoSizes(mbVar));
        }
        util.h.xy.cm.mb.m25967(getHighSpeedVideoSizes(mbVar));
        throw null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
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
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static byte[] getHighSpeedVideoSizes(util.h.xy.ct.mb mbVar) throws util.h.xy.cm.ma {
        byte[] highSpeedVideoSizes;
        if (mbVar != util.h.xy.ct.mb.f1129) {
            if (mbVar != util.h.xy.ct.mb.f1128) {
                util.h.xy.ct.mb mbVar2 = util.h.xy.ct.mb.f1127;
                highSpeedVideoSizes = getHighSpeedVideoSizes();
            } else {
                int i = getOutputStallDuration + 81;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 != 0) {
                    getHighResolutionOutputSizeshNQ4ISI();
                    throw new java.lang.ArithmeticException();
                }
                highSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI();
            }
        } else {
            getOutputStallDuration = (getHighSpeedVideoSizes + 51) % 128;
            highSpeedVideoSizes = getHighSpeedVideoFpsRanges();
        }
        getHighSpeedVideoSizes = (getOutputStallDuration + 23) % 128;
        return highSpeedVideoSizes;
    }

    private static byte[] getHighSpeedVideoFpsRanges() throws util.h.xy.cm.ma {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.DataOutputStream dataOutputStream;
        java.io.DataOutputStream dataOutputStream2;
        byte[] m26063 = util.h.xy.cv.ma.m26063(new byte[]{42, 102, -67, -47, com.google.common.base.Ascii.US, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -20, 35, 71, -12, 70, -30, -123}, new byte[]{-51, -99, 118, 115, -104, 17, 62, 100, -38, -80, 9, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 6, 10, -12});
        android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
        try {
            android.content.ContentResolver contentResolver = m25934.getContentResolver();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (104 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0003\u0010$\u0017\r(),#&", 10 - android.graphics.Color.red(0), objArr);
            java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern());
            java.lang.String[] strArr = new java.lang.String[36];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 77), "\u0017\r\f\u0001(\u0018\r,\n$/&\r.\u0019\t\"/\u0016\t\u0002\f!\u0014㘐", android.graphics.Color.argb(0, 0, 0, 0) + 25, objArr2);
            strArr[0] = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (15 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), "\u0017\r\f\u0001(\u0018\r,%\u001e%\n\u0004\f\f\u0004㗡", 17 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            strArr[1] = ((java.lang.String) objArr3[0]).intern();
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 78), "\u0017\r\f\u0001(\u0018\r,\u000f\f\u0002\u0010\u0016\f", 13 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr4);
                strArr[2] = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.view.View.resolveSize(0, 0) + 65), "\u0017\r\f\u0001(\u0018\r,\u000f\f\u0002\u0010\u0016\f+\r(\u0003\r\u0019\f\u0012)\u0003", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, objArr5);
                strArr[3] = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes("䡳؞콝䠵砿黌︲놮⩺ﲿ岒呁貈嬐㫶\uf607漵맴靀袠셏\u2458疐⭂", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr6);
                strArr[4] = ((java.lang.String) objArr6[0]).intern();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes("徙⪱ᛈ忟\uef56뉣➧⛇㶐퀐蔇쌨魢瞿\ue363慮磟镛仕Έ횻ࣹ갘밷", 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr7);
                strArr[5] = ((java.lang.String) objArr7[0]).intern();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51), "\u0017\r\f\u0001(\u0018\r,\u001a%\u0007\n/\"\t\u0016\u0016%\u000f+\f\u0017", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, objArr8);
                strArr[6] = ((java.lang.String) objArr8[0]).intern();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (51 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), "\u0017\r\f\u0001(\u0018\r,\u0019\t\u000f\f\f/\r ", android.text.TextUtils.indexOf("", "", 0) + 16, objArr9);
                strArr[7] = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 107), "\u0017\r\f\u0001(\u0018\r,\u0019\t\u000f\f\f/\r -\r)\u0001", 20 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr10);
                strArr[8] = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ue98e詂혵\ue9c8\ue71aነ\ue75a⺋讇烣䗺쭤\u2d7a흂⎐椦컎㖠踸ឍ悡ꠋ泮둻ȕ\u0e6e쪝勀", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1, objArr11);
                strArr[9] = ((java.lang.String) objArr11[0]).intern();
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.graphics.Color.blue(0) + 58), "\u0017\r\f\u0001(\u0018\r,/%\u001a!\b'.\u0012\u001e\r", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 18, objArr12);
                strArr[10] = ((java.lang.String) objArr12[0]).intern();
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\uf29e焳誒\uf2d8ᬔ\ue9e1믽튅邗讒ᥝ㝪㙨ⰺ缷", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr13);
                strArr[11] = ((java.lang.String) objArr13[0]).intern();
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.view.KeyEvent.keyCodeFromString("") + 82), "\u0017\r\f\u0001(\u0018\r,\u0002\r)\r\f\u0019+\r㘫㘫\u0010\u001e\f\u0017\t.\f\u0002\f\u0017", android.graphics.Color.blue(0) + 28, objArr14);
                strArr[12] = ((java.lang.String) objArr14[0]).intern();
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (29 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0017\r\f\u0001(\u0018\r,\u0002\r)\r\f\u0019,\"\f\u0016\t.\f\u0002\f\u0017", 24 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr15);
                strArr[13] = ((java.lang.String) objArr15[0]).intern();
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 125), "\u0017\r\f\u0001(\u0018\r,\u0002\r)\r\f\u0019/\u0014\t.+\u000f㙆㙆", 21 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr16);
                strArr[14] = ((java.lang.String) objArr16[0]).intern();
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoSizes("谵붲ῴ豳틫╠⺛᭺\uee3c䜓谻ﺕ䣞\ue0b8\uea5c峅\uab6eɋ䟩≵Ԝ鿧ꔥ膍枺㦞͞朿", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr17);
                strArr[15] = ((java.lang.String) objArr17[0]).intern();
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoSizes("帏㔒뒲幉䨿귀藝莮㰆쾳❽晁髤栘䄚쐑祔諫\uecaf몪휶ᝒ\u0e64ᥞ", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr18);
                strArr[16] = ((java.lang.String) objArr18[0]).intern();
                try {
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("柳܄ฅ枵璮鿖㽪봿\u05faﶥ鷊壐ꌘ娎ﮭ婢䂨룽嘘萧\ueed1╌듃⟒豲茮ካ셦", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr19);
                    strArr[17] = ((java.lang.String) objArr19[0]).intern();
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 85), "\u0017\r\f\u0001(\u0018\r,\u0005)㘞", 11 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr20);
                    strArr[18] = ((java.lang.String) objArr20[0]).intern();
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("鹧虥煮鸡⍣ặ쯳\ueaf2ﱮ糄楓༝媌\udb63༪굁뤥㦁ꊗ폪", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr21);
                    strArr[19] = ((java.lang.String) objArr21[0]).intern();
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("籕굚鞗簓잻㖈\ua6f8สṜ埻ј\uebc5뢹\uf050戽䦃嬑ኹ쾚㜬\uf57c", 1 - android.text.TextUtils.indexOf("", "", 0), objArr22);
                    strArr[20] = ((java.lang.String) objArr22[0]).intern();
                    byte keyCodeFromString = (byte) (109 - android.view.KeyEvent.keyCodeFromString(""));
                    getOutputStallDuration = (getHighSpeedVideoSizes + 125) % 128;
                    try {
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(keyCodeFromString, "\u0017\r\f\u0001(\u0018\r,\u0002\f\u001e\u0010%(\r \u001b\u0006\u0011/+\t", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 23, objArr23);
                        strArr[21] = ((java.lang.String) objArr23[0]).intern();
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("濤胿걹澢㦶ᠭ鴖\uf027෭穞㾶ᗈ\uab08\uddf5姓랎䢠㼜\uf474줡\ue6cdꊧᚠ櫐葥", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr24);
                        strArr[22] = ((java.lang.String) objArr24[0]).intern();
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("㩷蝵\uf70e㨱\ue210ᾧ왡⮁塾緔擁칮ﺛ\uda75ʽ氮ᴫ㢍꼏ኛ덂ꔷ䷞", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr25);
                        strArr[23] = ((java.lang.String) objArr25[0]).intern();
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) (67 - android.widget.ExpandableListView.getPackedPositionType(0L)), "\u0017\r\f\u0001(\u0018\r,\u0004\f(\u0011)\u0004\u001a!㘢㘢)\u0006-%\u001a\u0002/\f\n'\u0012(", 29 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr26);
                        strArr[24] = ((java.lang.String) objArr26[0]).intern();
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 120), "\u0017\r\f\u0001(\u0018\r,\u0004\f(\u0011)\u0004\u001a!㙗㙗)\u0006-%\u001a\u0002/\f\n'\u0012(*.)\u0005\f/!\u0014㙆", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 39, objArr27);
                        strArr[25] = ((java.lang.String) objArr27[0]).intern();
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("嚰툏靯囶쾟䫝ꘀ؎㒹⢮Ҡ\ue3e1鉜輏拜䆡燬混콮㼔\udf85\uf04d\u2dbf鳵봱嘹诙穚ᣑ㓤\ue876\ud827\ue677魜皂떜䐑礢팻፲⏍\udf92ㅁ", android.view.Gravity.getAbsoluteGravity(0, 0) + 1, objArr28);
                        strArr[26] = ((java.lang.String) objArr28[0]).intern();
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 36), "\u0017\r\f\u0001(\u0018\r,(/\u001a)", 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr29);
                        strArr[27] = ((java.lang.String) objArr29[0]).intern();
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) (56 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\u0017\r\f\u0001(\u0018\r,\u0016\r\u0017\n\u0004\f(\u0011㘊", 16 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr30);
                        strArr[28] = ((java.lang.String) objArr30[0]).intern();
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("∭ㅺ䪆≫ﮣꦨ篩㈲䀤쯛\ud949ퟝ\ue6d3汴뼫疛խ躞ኑହꬕጢ\uf055ꣃ즭땍嘵书汊힐㖓\uec06鋶砥ꭽ膹゙驄ໆ❅坅", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr31);
                        strArr[29] = ((java.lang.String) objArr31[0]).intern();
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("븋쁒伐빍菸墀繿䩩\udc02㫳\udcdf꾆竵鵜몽ව饋羶ᜇ獢㜳\ue20a\uf5c3킘喋䑥厣㘽\uf06c⚸々鑝໐褃껣匿겱歭ୟ弓쭳", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr32);
                        strArr[30] = ((java.lang.String) objArr32[0]).intern();
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("Ϭ\ueb04\ue8b1Ϊ\udddd珖\ud9deᑌ懥ᆥ签\uf1a3윇똈ᴅ句Ⓗ員났ⵈ諝쥍剫躻\ue863漦\uf41b栉", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', objArr33);
                        strArr[31] = ((java.lang.String) objArr33[0]).intern();
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 26), "\u0017\r\f\u0001(\u0018\r,\u0005\u0014\u0017\f\r\u001e+)\f\u0019\f!\f$㗨", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, objArr34);
                        strArr[32] = ((java.lang.String) objArr34[0]).intern();
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("媮ᴍ哥嫨ꔶ藟斊沧㢧\ue7ac윪襈鹃䀑ꅁ⬔緻ꋥ\u0ce4喪펍㽙\uee34\uf651넻", android.text.TextUtils.getCapsMode("", 0, 0) + 1, objArr35);
                        strArr[33] = ((java.lang.String) objArr35[0]).intern();
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) (android.view.View.getDefaultSize(0, 0) + 69), "\u0017\r\f\u0001(\u0018\r,)\u0003\",.\u0012\u0000\u0006", android.text.TextUtils.indexOf("", "", 0, 0) + 16, objArr36);
                        strArr[34] = ((java.lang.String) objArr36[0]).intern();
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) (37 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0017\r\f\u0001(\u0018\r,(/\u001a)*./!\f\u0010㗳", android.text.TextUtils.getCapsMode("", 0, 0) + 19, objArr37);
                        strArr[35] = ((java.lang.String) objArr37[0]).intern();
                        long j = 0;
                        int i = 0;
                        for (int i2 = 36; i < i2; i2 = 36) {
                            java.lang.String str = strArr[i];
                            j <<= 1;
                            try {
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ輸婿\ue206鴩筒汢仯❠剡ⶄ\ue206鴩᧳퓩温뷍", 23 - android.text.TextUtils.indexOf("", "", 0), objArr38);
                                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr38[0]);
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("⩺봣Ⱬ抈ㄫ毒\uf58a\udcf0⩺봣軾\ue632㔆\uf100⩺봣頻ー", 17 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr39);
                                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr39[0], null).invoke(m25934, null);
                                getHighSpeedVideoSizes = (getOutputStallDuration + 83) % 128;
                                try {
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ輸婿\ue206鴩筒汢仯❠䜟浲뮃鑙ㄫ毒\uf58a\udcf0⩺봣軾\ue632㔆\uf100⩺봣頻ー", 33 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr40);
                                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr40[0]);
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("陟쥒嵎༥푷᭴⭑埫퇂嗛薵\ue966祵Ղ\uf54a뫂", 16 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr41);
                                    if (((java.lang.Boolean) cls2.getMethod((java.lang.String) objArr41[0], java.lang.String.class).invoke(invoke, str)).booleanValue()) {
                                        j |= 1;
                                    }
                                    i++;
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
                        try {
                            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            try {
                                dataOutputStream2 = new java.io.DataOutputStream(byteArrayOutputStream);
                                try {
                                    dataOutputStream2.writeLong(j);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    dataOutputStream2.close();
                                    byteArrayOutputStream.close();
                                    getHighSpeedVideoSizes = (getOutputStallDuration + 95) % 128;
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ뙈공ྋ漵즼⡡珀\ue3e3", 16 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr42);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr42[0]);
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("Ბ⦥莼ᣟ\u1f17鐐\uebc4曕⡕뷒\u1754㮒", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr43);
                                    byte[] bytes = ((java.lang.String) cls3.getField((java.lang.String) objArr43[0]).get(null)).getBytes();
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ뙈공ྋ漵즼⡡珀\ue3e3", 17 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr44);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr44[0]);
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\uf122嵠潮確꼌賥", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 5, objArr45);
                                    byte[] bytes2 = ((java.lang.String) cls4.getField((java.lang.String) objArr45[0]).get(null)).getBytes();
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ뙈공ྋ漵즼⡡珀\ue3e3", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr46);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr46[0]);
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("呟⸏犍潓쬏믅젟▪", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, objArr47);
                                    byte[] m26072 = util.h.xy.cv.ra.m26072(m26063, string.getBytes(), byteArray, bytes, bytes2, ((java.lang.String) cls5.getField((java.lang.String) objArr47[0]).get(null)).getBytes(), util.h.xy.ct.rc.m26048().mo26031().get(util.h.xy.ct.a.b.f1122));
                                    getHighSpeedVideoSizes = (getOutputStallDuration + 85) % 128;
                                    return m26072;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    dataOutputStream = dataOutputStream2;
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        getHighSpeedVideoSizes = (getOutputStallDuration + 15) % 128;
                                        byteArrayOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                dataOutputStream2 = null;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            byteArrayOutputStream = null;
                            dataOutputStream = null;
                        }
                    } catch (java.lang.Throwable th6) {
                        java.lang.Throwable cause3 = th6.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    java.lang.Throwable cause4 = th7.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th7;
                }
            } catch (java.lang.Throwable th8) {
                java.lang.Throwable cause5 = th8.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th8;
            }
        } catch (java.io.IOException unused) {
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 14), "\u0017\u0006#\u001b\u0002&.\u0013\u0013\u0005\u0005\u0004\u0018\n\u0017\u0001\u0011\u0004*\u0013&\u0014\u0005\u0004\u0015+\u001b$\u0012\u0013㗂", 31 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr48);
            throw new util.h.xy.cm.ma(((java.lang.String) objArr48[0]).intern());
        } catch (util.h.xy.ct.mc e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44), "\u0017\u0006#\u001b\u0002&.\u0013\u0013\u0005\u0004,-\u0004㘖㘖0+\u0001\u0017\u0003\u0002\u0004\u0011\u0001\u0018,(\u0004\u0010\t\u0017\u0000\t\u0005-", 36 - android.view.KeyEvent.keyCodeFromString(""), objArr49);
            sb.append(((java.lang.String) objArr49[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.cm.ma(sb.toString());
        }
    }

    private static void getHighSpeedVideoSizes(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getInputSizeshNQ4ISI);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = getHighSpeedVideoFpsRanges + 59;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                mcVar.f2638 = 1;
            } else {
                mcVar.f2638 = 0;
            }
            while (mcVar.f2638 < i2) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI + 21;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 == 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    int i6 = mcVar.f2638;
                    throw new java.lang.ArithmeticException();
                }
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
                        int i7 = mcVar.f2639;
                        int i8 = mcVar.f2640;
                        int i9 = mcVar.f2637;
                        int i10 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i7 * c) + i8];
                        cArr3[mcVar.f2638 + 1] = cArr[(i9 * c) + i10];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i11 = mcVar.f2639;
                        int i12 = mcVar.f2640;
                        int i13 = mcVar.f2637;
                        int i14 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i11 * c) + i12];
                        cArr3[mcVar.f2638 + 1] = cArr[(i13 * c) + i14];
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
                    } else {
                        int i15 = mcVar.f2639;
                        int i16 = mcVar.f2635;
                        int i17 = mcVar.f2637;
                        int i18 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i15 * c) + i16];
                        cArr3[mcVar.f2638 + 1] = cArr[(i17 * c) + i18];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.cm.ma {
        java.io.DataOutputStream dataOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.lang.Object invoke;
        byte[] m26063 = util.h.xy.cv.ma.m26063(new byte[]{42, 102, -67, -47, com.google.common.base.Ascii.US, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -20, 35, 71, -12, 70, -30, -123}, new byte[]{-51, -99, 118, 115, -104, 17, 62, 100, -38, -80, 9, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 6, 10, -12});
        android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
        int i = 1;
        try {
            android.content.ContentResolver contentResolver = m25934.getContentResolver();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (152 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u0003\u0010$\u0017\r(),#&", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 10, objArr);
            java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern());
            java.lang.String[] strArr = new java.lang.String[36];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 77), "\u0017\r\f\u0001(\u0018\r,\n$/&\r.\u0019\t\"/\u0016\t\u0002\f!\u0014㘐", 25 - android.text.TextUtils.getTrimmedLength(""), objArr2);
            strArr[0] = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14), "\u0017\r\f\u0001(\u0018\r,%\u001e%\n\u0004\f\f\u0004㗡", 17 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            strArr[1] = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 78), "\u0017\r\f\u0001(\u0018\r,\u000f\f\u0002\u0010\u0016\f", 15 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
            strArr[2] = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (65 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "\u0017\r\f\u0001(\u0018\r,\u000f\f\u0002\u0010\u0016\f+\r(\u0003\r\u0019\f\u0012)\u0003", 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
            strArr[3] = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes("䡳؞콝䠵砿黌︲놮⩺ﲿ岒呁貈嬐㫶\uf607漵맴靀袠셏\u2458疐⭂", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr6);
            strArr[4] = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes("徙⪱ᛈ忟\uef56뉣➧⛇㶐퀐蔇쌨魢瞿\ue363慮磟镛仕Έ횻ࣹ갘밷", android.view.KeyEvent.normalizeMetaState(0) + 1, objArr7);
            strArr[5] = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51), "\u0017\r\f\u0001(\u0018\r,\u001a%\u0007\n/\"\t\u0016\u0016%\u000f+\f\u0017", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, objArr8);
            strArr[6] = ((java.lang.String) objArr8[0]).intern();
            try {
                java.lang.Class<?>[] clsArr = null;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 51), "\u0017\r\f\u0001(\u0018\r,\u0019\t\u000f\f\f/\r ", 16 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr9);
                strArr[7] = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (107 - android.view.View.combineMeasuredStates(0, 0)), "\u0017\r\f\u0001(\u0018\r,\u0019\t\u000f\f\f/\r -\r)\u0001", 20 - android.text.TextUtils.getOffsetBefore("", 0), objArr10);
                strArr[8] = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ue98e詂혵\ue9c8\ue71aነ\ue75a⺋讇烣䗺쭤\u2d7a흂⎐椦컎㖠踸ឍ悡ꠋ泮둻ȕ\u0e6e쪝勀", 1 - android.text.TextUtils.getTrimmedLength(""), objArr11);
                strArr[9] = ((java.lang.String) objArr11[0]).intern();
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (58 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0017\r\f\u0001(\u0018\r,/%\u001a!\b'.\u0012\u001e\r", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 19, objArr12);
                strArr[10] = ((java.lang.String) objArr12[0]).intern();
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\uf29e焳誒\uf2d8ᬔ\ue9e1믽튅邗讒ᥝ㝪㙨ⰺ缷", 1 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr13);
                strArr[11] = ((java.lang.String) objArr13[0]).intern();
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (81 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "\u0017\r\f\u0001(\u0018\r,\u0002\r)\r\f\u0019+\r㘫㘫\u0010\u001e\f\u0017\t.\f\u0002\f\u0017", android.view.View.resolveSize(0, 0) + 28, objArr14);
                strArr[12] = ((java.lang.String) objArr14[0]).intern();
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 30), "\u0017\r\f\u0001(\u0018\r,\u0002\r)\r\f\u0019,\"\f\u0016\t.\f\u0002\f\u0017", android.text.TextUtils.getTrimmedLength("") + 24, objArr15);
                strArr[13] = ((java.lang.String) objArr15[0]).intern();
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.text.TextUtils.indexOf("", "", 0, 0) + 125), "\u0017\r\f\u0001(\u0018\r,\u0002\r)\r\f\u0019/\u0014\t.+\u000f㙆㙆", 21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr16);
                strArr[14] = ((java.lang.String) objArr16[0]).intern();
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoSizes("谵붲ῴ豳틫╠⺛᭺\uee3c䜓谻ﺕ䣞\ue0b8\uea5c峅\uab6eɋ䟩≵Ԝ鿧ꔥ膍枺㦞͞朿", 1 - android.view.View.resolveSize(0, 0), objArr17);
                strArr[15] = ((java.lang.String) objArr17[0]).intern();
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoSizes("帏㔒뒲幉䨿귀藝莮㰆쾳❽晁髤栘䄚쐑祔諫\uecaf몪휶ᝒ\u0e64ᥞ", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr18);
                strArr[16] = ((java.lang.String) objArr18[0]).intern();
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoSizes("柳܄ฅ枵璮鿖㽪봿\u05faﶥ鷊壐ꌘ娎ﮭ婢䂨룽嘘萧\ueed1╌듃⟒豲茮ካ셦", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1, objArr19);
                strArr[17] = ((java.lang.String) objArr19[0]).intern();
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 85), "\u0017\r\f\u0001(\u0018\r,\u0005)㘞", ';' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr20);
                strArr[18] = ((java.lang.String) objArr20[0]).intern();
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoSizes("鹧虥煮鸡⍣ặ쯳\ueaf2ﱮ糄楓༝媌\udb63༪굁뤥㦁ꊗ폪", 1 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr21);
                strArr[19] = ((java.lang.String) objArr21[0]).intern();
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighSpeedVideoSizes("籕굚鞗簓잻㖈\ua6f8สṜ埻ј\uebc5뢹\uf050戽䦃嬑ኹ쾚㜬\uf57c", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr22);
                strArr[20] = ((java.lang.String) objArr22[0]).intern();
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.view.View.getDefaultSize(0, 0) + 109), "\u0017\r\f\u0001(\u0018\r,\u0002\f\u001e\u0010%(\r \u001b\u0006\u0011/+\t", 22 - android.graphics.Color.blue(0), objArr23);
                strArr[21] = ((java.lang.String) objArr23[0]).intern();
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                getHighSpeedVideoSizes("濤胿걹澢㦶ᠭ鴖\uf027෭穞㾶ᗈ\uab08\uddf5姓랎䢠㼜\uf474줡\ue6cdꊧᚠ櫐葥", 1 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr24);
                strArr[22] = ((java.lang.String) objArr24[0]).intern();
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                getHighSpeedVideoSizes("㩷蝵\uf70e㨱\ue210ᾧ왡⮁塾緔擁칮ﺛ\uda75ʽ氮ᴫ㢍꼏ኛ덂ꔷ䷞", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr25);
                strArr[23] = ((java.lang.String) objArr25[0]).intern();
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 67), "\u0017\r\f\u0001(\u0018\r,\u0004\f(\u0011)\u0004\u001a!㘢㘢)\u0006-%\u001a\u0002/\f\n'\u0012(", android.text.TextUtils.indexOf("", "", 0) + 30, objArr26);
                strArr[24] = ((java.lang.String) objArr26[0]).intern();
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (120 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "\u0017\r\f\u0001(\u0018\r,\u0004\f(\u0011)\u0004\u001a!㙗㙗)\u0006-%\u001a\u0002/\f\n'\u0012(*.)\u0005\f/!\u0014㙆", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 39, objArr27);
                strArr[25] = ((java.lang.String) objArr27[0]).intern();
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                getHighSpeedVideoSizes("嚰툏靯囶쾟䫝ꘀ؎㒹⢮Ҡ\ue3e1鉜輏拜䆡燬混콮㼔\udf85\uf04d\u2dbf鳵봱嘹诙穚ᣑ㓤\ue876\ud827\ue677魜皂떜䐑礢팻፲⏍\udf92ㅁ", 1 - android.view.View.MeasureSpec.getMode(0), objArr28);
                strArr[26] = ((java.lang.String) objArr28[0]).intern();
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (36 - android.text.TextUtils.indexOf("", "", 0, 0)), "\u0017\r\f\u0001(\u0018\r,(/\u001a)", android.text.TextUtils.getOffsetBefore("", 0) + 12, objArr29);
                strArr[27] = ((java.lang.String) objArr29[0]).intern();
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 56), "\u0017\r\f\u0001(\u0018\r,\u0016\r\u0017\n\u0004\f(\u0011㘊", 17 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr30);
                strArr[28] = ((java.lang.String) objArr30[0]).intern();
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                getHighSpeedVideoSizes("∭ㅺ䪆≫ﮣꦨ篩㈲䀤쯛\ud949ퟝ\ue6d3汴뼫疛խ躞ኑହꬕጢ\uf055ꣃ즭땍嘵书汊힐㖓\uec06鋶砥ꭽ膹゙驄ໆ❅坅", android.view.KeyEvent.keyCodeFromString("") + 1, objArr31);
                strArr[29] = ((java.lang.String) objArr31[0]).intern();
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                getHighSpeedVideoSizes("븋쁒伐빍菸墀繿䩩\udc02㫳\udcdf꾆竵鵜몽ව饋羶ᜇ獢㜳\ue20a\uf5c3킘喋䑥厣㘽\uf06c⚸々鑝໐褃껣匿겱歭ୟ弓쭳", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr32);
                strArr[30] = ((java.lang.String) objArr32[0]).intern();
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                getHighSpeedVideoSizes("Ϭ\ueb04\ue8b1Ϊ\udddd珖\ud9deᑌ懥ᆥ签\uf1a3윇똈ᴅ句Ⓗ員났ⵈ諝쥍剫躻\ue863漦\uf41b栉", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr33);
                strArr[31] = ((java.lang.String) objArr33[0]).intern();
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 26), "\u0017\r\f\u0001(\u0018\r,\u0005\u0014\u0017\f\r\u001e+)\f\u0019\f!\f$㗨", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24, objArr34);
                strArr[32] = ((java.lang.String) objArr34[0]).intern();
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                getHighSpeedVideoSizes("媮ᴍ哥嫨ꔶ藟斊沧㢧\ue7ac윪襈鹃䀑ꅁ⬔緻ꋥ\u0ce4喪펍㽙\uee34\uf651넻", 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr35);
                strArr[33] = ((java.lang.String) objArr35[0]).intern();
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 70), "\u0017\r\f\u0001(\u0018\r,)\u0003\",.\u0012\u0000\u0006", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, objArr36);
                strArr[34] = ((java.lang.String) objArr36[0]).intern();
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37), "\u0017\r\f\u0001(\u0018\r,(/\u001a)*./!\f\u0010㗳", 19 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr37);
                strArr[35] = ((java.lang.String) objArr37[0]).intern();
                getHighSpeedVideoSizes = (getOutputStallDuration + 89) % 128;
                int i2 = 0;
                long j = 0;
                for (int i3 = 36; i2 < i3; i3 = 36) {
                    java.lang.String str = strArr[i2];
                    j <<= i;
                    int i4 = getOutputStallDuration + 23;
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 != 0) {
                        try {
                            java.lang.Object[] objArr38 = new java.lang.Object[i];
                            getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ輸婿\ue206鴩筒汢仯❠剡ⶄ\ue206鴩᧳퓩温뷍", android.view.View.MeasureSpec.getSize(i) + 27, objArr38);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr38[0]);
                            java.lang.Object[] objArr39 = new java.lang.Object[i];
                            getHighResolutionOutputSizeshNQ4ISI("⩺봣Ⱬ抈ㄫ毒\uf58a\udcf0⩺봣軾\ue632㔆\uf100⩺봣頻ー", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54, objArr39);
                            invoke = cls.getMethod((java.lang.String) objArr39[0], clsArr).invoke(m25934, clsArr);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        java.lang.Object[] objArr40 = new java.lang.Object[i];
                        getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ輸婿\ue206鴩筒汢仯❠剡ⶄ\ue206鴩᧳퓩温뷍", android.view.View.MeasureSpec.getSize(0) + 23, objArr40);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr40[0]);
                        java.lang.Object[] objArr41 = new java.lang.Object[i];
                        getHighResolutionOutputSizeshNQ4ISI("⩺봣Ⱬ抈ㄫ毒\uf58a\udcf0⩺봣軾\ue632㔆\uf100⩺봣頻ー", 18 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr41);
                        invoke = cls2.getMethod((java.lang.String) objArr41[0], clsArr).invoke(m25934, clsArr);
                    }
                    try {
                        java.lang.Object[] objArr42 = {str};
                        java.lang.Object[] objArr43 = new java.lang.Object[i];
                        getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ輸婿\ue206鴩筒汢仯❠䜟浲뮃鑙ㄫ毒\uf58a\udcf0⩺봣軾\ue632㔆\uf100⩺봣頻ー", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34, objArr43);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                        java.lang.Object[] objArr44 = new java.lang.Object[i];
                        getHighResolutionOutputSizeshNQ4ISI("陟쥒嵎༥푷᭴⭑埫퇂嗛薵\ue966祵Ղ\uf54a뫂", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, objArr44);
                        if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr44[0], java.lang.String.class).invoke(invoke, objArr42)).booleanValue()) {
                            j |= 1;
                        }
                        i2++;
                        clsArr = null;
                        i = 1;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                        try {
                            dataOutputStream.writeLong(j);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            getHighSpeedVideoSizes = (getOutputStallDuration + 93) % 128;
                            dataOutputStream.close();
                            byteArrayOutputStream.close();
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ뙈공ྋ漵즼⡡珀\ue3e3", android.view.View.resolveSizeAndState(0, 0, 0) + 16, objArr45);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr45[0]);
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("Ბ⦥莼ᣟ\u1f17鐐\uebc4曕⡕뷒\u1754㮒", 12 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr46);
                            byte[] bytes = ((java.lang.String) cls4.getField((java.lang.String) objArr46[0]).get(null)).getBytes();
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ뙈공ྋ漵즼⡡珀\ue3e3", android.view.View.combineMeasuredStates(0, 0) + 16, objArr47);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr47[0]);
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\uf122嵠潮確꼌賥", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, objArr48);
                            byte[] bytes2 = ((java.lang.String) cls5.getField((java.lang.String) objArr48[0]).get(null)).getBytes();
                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\ued13\udd3f廠\udc16韀퍇㶭ᭇ뙈공ྋ漵즼⡡珀\ue3e3", 17 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr49);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr49[0]);
                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("呟⸏犍潓쬏믅젟▪", 9 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr50);
                            byte[] m26072 = util.h.xy.cv.ra.m26072(m26063, string.getBytes(), byteArray, bytes, bytes2, ((java.lang.String) cls6.getField((java.lang.String) objArr50[0]).get(null)).getBytes());
                            getHighSpeedVideoSizes = (getOutputStallDuration + 89) % 128;
                            return m26072;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            java.io.DataOutputStream dataOutputStream2 = dataOutputStream;
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                            }
                            if (byteArrayOutputStream != null) {
                                int i5 = getOutputStallDuration + 91;
                                getHighSpeedVideoSizes = i5 % 128;
                                if (i5 % 2 != 0) {
                                    byteArrayOutputStream.close();
                                    throw new java.lang.NullPointerException();
                                }
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        dataOutputStream = null;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    dataOutputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (java.lang.Throwable th6) {
                java.lang.Throwable cause3 = th6.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th6;
            }
        } catch (java.io.IOException unused) {
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14), "\u0017\u0006#\u001b\u0002&.\u0013\u0013\u0005\u0005\u0004\u0018\n\u0017\u0001\u0011\u0004*\u0013&\u0014\u0005\u0004\u0015+\u001b$\u0012\u0013㗂", 31 - android.view.View.getDefaultSize(0, 0), objArr51);
            throw new util.h.xy.cm.ma(((java.lang.String) objArr51[0]).intern());
        }
    }

    private static byte[] getHighSpeedVideoSizes() {
        byte[] m26063 = util.h.xy.cv.ma.m26063(new byte[]{42, 102, -67, -47, com.google.common.base.Ascii.US, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -20, 35, 71, -12, 70, -30, -123}, new byte[]{-51, -99, 118, 115, -104, 17, 62, 100, -38, -80, 9, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 6, 10, -12});
        android.content.ContentResolver contentResolver = util.h.xy.ci.ra.m25931().m25934().getContentResolver();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((byte) (104 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0003\u0010$\u0017\r(),#&", android.view.View.combineMeasuredStates(0, 0) + 10, objArr);
        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern());
        int i = (getOutputStallDuration + 31) % 128;
        getHighSpeedVideoSizes = i;
        getOutputStallDuration = (i + 27) % 128;
        try {
            return util.h.xy.cv.ra.m26072(m26063, string.getBytes(), util.h.xy.cv.ra.m26071(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null)).intValue(), false));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = (char) 39952;
        getHighSpeedVideoFpsRangesFor = (char) 21304;
        Camera2StreamConfigurationMap = (char) 61634;
        getInputFormats = (char) 24047;
    }

    static void Camera2StreamConfigurationMap() {
        getOutputMinFrameDuration = new char[]{38467, 41905, 41917, 41913, 41915, 41864, 41871, 41903, 41885, 41881, 41883, 41875, 41907, 41866, 41914, 38466, 41918, 41906, 41896, 41887, 41861, 41904, 41902, 41872, 41879, 38468, 41870, 41882, 38469, 41970, 41886, 38478, 38464, 41867, 41874, 38465, 41868, 41912, 41865, 41876, 41877, 41909, 41900, 38471, 41873, 41880, 41919, 41980, 41859};
        getInputSizeshNQ4ISI = (char) 38465;
        getOutputStallDurationlomOqCM = -7021149291913322305L;
    }
}
