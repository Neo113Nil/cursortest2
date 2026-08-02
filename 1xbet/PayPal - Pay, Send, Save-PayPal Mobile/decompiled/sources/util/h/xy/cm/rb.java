package util.h.xy.cm;

/* loaded from: classes5.dex */
public final class rb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static long getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static int getOutputFormats;
    private static long getOutputMinFrameDuration;

    static {
        getHighSpeedVideoSizes();
        getInputFormats = util.h.xy.cm.rb.class.getName();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 69) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25974(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.cm.ma {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 57) % 128;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, bArr2, bArr3, false);
        int i = getHighSpeedVideoSizes + 125;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoSizes;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25971(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.cm.ma {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 37) % 128;
        return getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, bArr3, false);
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputMinFrameDuration ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
        while (aVar.f2623 < m27721.length) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 109) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputMinFrameDuration ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25975(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.cm.ma {
        int i = getHighSpeedVideoSizes + 97;
        getHighSpeedVideoFpsRanges = i % 128;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, bArr2, bArr3, i % 2 != 0);
        int i2 = getHighSpeedVideoSizes + 31;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoSizes;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25973(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.cm.ma {
        int i = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoSizes = i % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, bArr3, i % 2 == 0);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 65) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    private static util.h.xy.cm.ma getHighSpeedVideoSizes(java.lang.Exception exc) {
        util.h.xy.cm.ma maVar = new util.h.xy.cm.ma(exc.getMessage());
        int i = getHighSpeedVideoSizes + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) throws util.h.xy.cm.ma {
        if (util.h.xy.cv.ra.m26070(bArr) || util.h.xy.cv.ra.m26070(bArr3)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("᱘ᰓ艡淑澑끂ⷮ\ue2b1ꍣⴺ\uf14fꍙ抑\uec68ㆢ揩⇗꿘牘⃠\ue164漠덋\ue14fꂓ\u2e6c\uf3ffꆯ柅\ue98c㑝曬❸꤬畇❊\ue68a栴떾\ue79cꗜ⯜\uf676꒼", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (bArr2 == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("夅奬煘黣썗Ე挶갽\ue607\ude14巊\ued91⟂ὗ鴥ⵢ撑峦\ude84渡ꐱ鱝ῃ꾖\ue5d5\udd01彻\uef70⋝\u1afb颀⠭戥婘", 1 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (bArr.length != 16) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 9) % 128;
            if (bArr.length != 24 && bArr.length != 32) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ue4a3\ue4ea皻餀꼂烞ᚗ\ud989宛\ud9fb㆘顤驠ᢣ\uf129", 1 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
        }
        if (bArr2.length != 16) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᄖ췵頻쥴⎅踬깡蕭䕜皰", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.view.ViewConfiguration.getTapTimeout() >> 16, "ః稥뙊Ῠ", "\u0000\u0000\u0000\u0000", objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        util.h.xy.et.a aVar = new util.h.xy.et.a(new util.h.xy.eo.a(new util.h.xy.ej.ma()), new util.h.xy.et.mb());
        aVar.mo26537(z, new util.h.xy.ep.e(new util.h.xy.ep.mc(bArr), bArr2));
        byte[] bArr4 = new byte[aVar.mo26535(bArr3.length)];
        int mo26536 = aVar.mo26536(bArr3, 0, bArr3.length, bArr4, 0);
        try {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr4, 0, mo26536 + aVar.mo26539(bArr4, mo26536));
            int i = getHighSpeedVideoFpsRanges + 29;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                return copyOfRange;
            }
            throw null;
        } catch (java.lang.IllegalStateException e) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("遀았㌮⪈\uf800", (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27874), android.widget.ExpandableListView.getPackedPositionType(0L) - 272608627, "赜쁒\ue2ef剬", "\u0000\u0000\u0000\u0000", objArr5);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr5[0]).intern(), util.h.xy.ch.ma.m25927(e));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes("Ἂ\u1f4f혺㦝በ춸勄鷔ꀬ礳賷\udc79憂렆䱷Ჰ⊵ﮩ྅忶\ue209㭐캭鸳ꎟ穵蹪\uded3撢붖䦦᧗\u242fﵵࣱ堯\ue5cb㰣졍颴Ꚍ羚變\udbdf是뼉", 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr6);
            ((java.lang.String) objArr6[0]).intern();
            throw getHighSpeedVideoSizes(e);
        } catch (util.h.xy.ef.mc e2) {
            try {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("뵄鷆鲙柈两", (char) (22895 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), 1789343714 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\ue239ꜷ灪\uee59", "\u0000\u0000\u0000\u0000", objArr7);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr7[0]).intern(), util.h.xy.ch.ma.m25927(e2));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes("Ἂ\u1f4f혺㦝በ춸勄鷔ꀬ礳賷\udc79憂렆䱷Ჰ⊵ﮩ྅忶\ue209㭐캭鸳ꎟ穵蹪\uded3撢붖䦦᧗\u242fﵵࣱ堯\ue5cb㰣졍颴Ꚍ羚變\udbdf是뼉", android.text.TextUtils.getCapsMode("", 0, 0) + 1, objArr8);
                ((java.lang.String) objArr8[0]).intern();
                throw getHighSpeedVideoSizes(e2);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (util.h.xy.ef.md e3) {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes("鉓鈁烏齑톗\u0e74덗籫ⵂ", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr9[0]).intern(), util.h.xy.ch.ma.m25927(e3));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes("Ἂ\u1f4f혺㦝በ춸勄鷔ꀬ礳賷\udc79憂렆䱷Ჰ⊵ﮩ྅忶\ue209㭐캭鸳ꎟ穵蹪\uded3撢붖䦦᧗\u242fﵵࣱ堯\ue5cb㰣졍颴Ꚍ羚變\udbdf是뼉", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr10);
            ((java.lang.String) objArr10[0]).intern();
            throw getHighSpeedVideoSizes(e3);
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 29;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3.toCharArray();
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 45;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
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
            int i4 = (rcVar.f2652 + 2) % 4;
            int i5 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i4]) % 65535);
            cArr2[i5] = (char) (((cArr[i5] * 32718) + cArr2[i4]) / 65535);
            cArr[i5] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i5] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) throws util.h.xy.cm.ma {
        if (!util.h.xy.cv.ra.m26070(bArr)) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 3) % 128;
            if (!util.h.xy.cv.ra.m26070(bArr3)) {
                if (bArr.length != 16 && bArr.length != 24) {
                    int i = getHighSpeedVideoFpsRanges + 71;
                    getHighSpeedVideoSizes = i % 128;
                    if (i % 2 == 0 ? bArr.length != 32 : bArr.length != 117) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("뭋㏞륍搜\uecf3럗㶛嗀එ격怟\ue2d4邂\uf155粓绣\uf403悓㡦廻腯ꠉ⛽\ue34f뷢Г钥쭎닷┣瑻賝⌷\uf48e愳ꞩ굓끗彩Ỳ诽\udf10", (char) (16037 - android.graphics.Color.argb(0, 0, 0, 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, "\udb5b懲ꔠ̾", "\u0000\u0000\u0000\u0000", objArr);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                    }
                }
                if (bArr2 == null) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("뱔밽➘젻摰믺裞䟂͡裟睊ٹ시䦇㩇웙臆਼禺藉", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                }
                if (bArr2.length != 16) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u192d᥄줿⚜썺ᳰ䣜蟏ꘜ晸巣왻柭Ꝣ鵀ښ⒢\ue4ce\udea8䗈\ue45d⑸ῥ萳ꖸ数引", -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                }
                util.h.xy.et.a aVar = new util.h.xy.et.a(new util.h.xy.eo.a(new util.h.xy.ej.ma()), new util.h.xy.et.b());
                aVar.mo26537(z, new util.h.xy.ep.e(new util.h.xy.ep.mc(bArr), bArr2));
                byte[] bArr4 = new byte[aVar.mo26535(bArr3.length)];
                int mo26536 = aVar.mo26536(bArr3, 0, bArr3.length, bArr4, 0);
                try {
                    byte[] m25972 = m25972(bArr4, 0, mo26536 + aVar.mo26539(bArr4, mo26536));
                    int i2 = getHighSpeedVideoFpsRanges + 37;
                    getHighSpeedVideoSizes = i2 % 128;
                    if (i2 % 2 == 0) {
                        return m25972;
                    }
                    throw null;
                } catch (java.lang.Exception e) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ꖦ쏄볃갽㏈", (char) (android.view.View.getDefaultSize(0, 0) + 59396), 1721178717 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "崁霚Ѧ滨", "\u0000\u0000\u0000\u0000", objArr4);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr4[0]).intern(), util.h.xy.ch.ma.m25927(e));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue8bf\ue8fa쟍⡪䩡閹裫䟻垙棄퓶ٖ阷꧱ᑶ욟픀\uea5e垄藀ᖤ⪫雈䐑呋毕홋Ҭ錮걮ᆤ쎼펒\uec80僰艏ቭⷑ遟䊜儦渪", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
                    ((java.lang.String) objArr5[0]).intern();
                    throw getHighSpeedVideoSizes(e);
                }
            }
        }
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoSizes("᱘ᰓ艡淑澑끂ⷮ\ue2b1ꍣⴺ\uf14fꍙ抑\uec68ㆢ揩⇗꿘牘⃠\ue164漠덋\ue14fꂓ\u2e6c\uf3ffꆯ柅\ue98c㑝曬❸꤬畇❊\ue68a栴떾\ue79cꗜ⯜\uf676꒼", android.view.Gravity.getAbsoluteGravity(0, 0) + 1, objArr6);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25972(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 >= 0) {
            int i3 = getHighSpeedVideoFpsRanges + 59;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                if (i2 <= bArr.length) {
                    int i4 = i2 - i;
                    if (i4 < 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    byte[] bArr2 = new byte[i4];
                    java.lang.System.arraycopy(bArr, i, bArr2, 0, i4);
                    int i5 = getHighSpeedVideoSizes + 73;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    if (i5 % 2 != 0) {
                        return bArr2;
                    }
                    throw null;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    private rb() {
    }

    static void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = 706572994412025853L;
        getHighSpeedVideoSizesFor = 2457411417541981002L;
        getOutputFormats = 294925130;
        getHighSpeedVideoFpsRangesFor = (char) 3964;
    }
}
