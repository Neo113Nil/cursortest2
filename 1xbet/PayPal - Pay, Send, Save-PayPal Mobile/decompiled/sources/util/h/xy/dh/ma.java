package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class ma extends util.h.xy.dh.mi implements util.h.xy.dh.m, util.h.xy.dh.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizesFor;
    private static char[] getInputFormats;
    private static long getInputSizeshNQ4ISI;
    private static final char[] getOutputFormats;
    private static long getOutputMinFrameDuration;
    final byte[] getHighSpeedVideoSizes;

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputSizeshNQ4ISI ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i3 = Camera2StreamConfigurationMap + 99;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 27) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 41) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = Camera2StreamConfigurationMap + 45;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = new util.h.xy.dh.p(util.h.xy.dh.ma.class) { // from class: util.h.xy.dh.ma.3
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i ^ 17) + ((i & 17) << 1)) % 128;
                util.h.xy.dh.ma highSpeedVideoFpsRanges = lVar.getHighSpeedVideoFpsRanges();
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i2 ^ 43) + ((i2 & 43) << 1)) % 128;
                return highSpeedVideoFpsRanges;
            }

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 117;
                Camera2StreamConfigurationMap = i % 128;
                byte[] m26337 = mzVar.m26337();
                if (i % 2 == 0) {
                    util.h.xy.dh.ma.getHighResolutionOutputSizeshNQ4ISI(m26337);
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.dh.ma highResolutionOutputSizeshNQ4ISI = util.h.xy.dh.ma.getHighResolutionOutputSizeshNQ4ISI(m26337);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        getOutputFormats = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = getHighSpeedVideoSizesFor + 81;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static util.h.xy.dh.ma getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int length;
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 33;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0 ? (length = bArr.length) <= 0 : (length = bArr.length) <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue1b0뱝婧\uf86b阋㐲툲烌\u0ef8겧䪨\ue894蚔┋썍慕㼦\udd16笌᧲랸嗧\uf393醭⾩쩔桮٨ꐔ", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24043, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = bArr[0] & 255;
        if (i3 > 0) {
            if (i3 <= 7) {
                int i4 = i + 117;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0 ? length >= 2 : length >= 4) {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i3) & b))) {
                        return new util.h.xy.dh.ai(bArr);
                    }
                }
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(26 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        return new util.h.xy.dh.rw(bArr, false);
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.ai aiVar = new util.h.xy.dh.ai(this.getHighSpeedVideoSizes);
        int i = getHighSpeedVideoSizesFor + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return aiVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.rw rwVar = new util.h.xy.dh.rw(this.getHighSpeedVideoSizes, false);
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
        return rwVar;
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public util.h.xy.dh.mi mo26278() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 45;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            mo26279();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.mi mo26279 = mo26279();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 9) % 128;
        return mo26279;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i;
        if (miVar instanceof util.h.xy.dh.ma) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            byte[] bArr2 = ((util.h.xy.dh.ma) miVar).getHighSpeedVideoSizes;
            int length = bArr.length;
            if (bArr2.length == length) {
                if (length == 1) {
                    return true;
                }
                int i2 = length - 1;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 75) % 128;
                        return false;
                    }
                }
                int i4 = 255 << (bArr[0] & 255);
                return ((byte) (bArr[i2] & i4)) == ((byte) (bArr2[i2] & i4));
            }
            i = getHighResolutionOutputSizeshNQ4ISI + 101;
        } else {
            i = getHighResolutionOutputSizeshNQ4ISI + 33;
        }
        getHighSpeedVideoSizesFor = i % 128;
        return false;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 17;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        if (i % 2 == 0 ? this.getHighSpeedVideoSizes.length >= 2 : this.getHighSpeedVideoSizes.length >= 4) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            byte b = bArr[0];
            int length = bArr.length - 1;
            return (util.h.xy.fb.a.m26819(bArr, 0, length) * 257) ^ ((byte) ((255 << (b & 255)) & bArr[length]));
        }
        int i3 = i2 + 119;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 41;
        getHighSpeedVideoSizesFor = i % 128;
        java.lang.String mo26276 = mo26276();
        if (i % 2 == 0) {
            return mo26276;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mb
    /* renamed from: ʻ */
    public int mo26281() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 105;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        int i3 = i % 2 != 0 ? this.getHighSpeedVideoSizes[1] & 19782 : this.getHighSpeedVideoSizes[0] & 255;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 105) % 128;
        return i3;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] m26310() {
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr.length == 1) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 113;
            getHighSpeedVideoSizesFor = i % 128;
            byte[] bArr2 = util.h.xy.dh.rh.Camera2StreamConfigurationMap;
            if (i % 2 == 0) {
                return bArr2;
            }
            throw new java.lang.ArithmeticException();
        }
        byte b = bArr[0];
        byte[] m26824 = util.h.xy.fb.a.m26824(bArr, 1, bArr.length);
        int length = m26824.length - 1;
        m26824[length] = (byte) (((byte) (255 << (b & 255))) & m26824[length]);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 125) % 128;
        return m26824;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m26309() {
        int i = getHighSpeedVideoSizesFor + 117;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0 ? this.getHighSpeedVideoSizes[0] != 0 : this.getHighSpeedVideoSizes[1] != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue1a5꒡殒⺒\uf5ed룡翖ʓ줸谲华ᘘ\udd6d恭✊\uea55낻瞋㫛쇨蓳䯕໗픷顼弌\ue212ꥦ汿㍇\uf65f벯䏄ڑ췧郣埁᪑ꄤ搡⬃\uee10딮硝㽡쉭裪侈አ\ud9d7鳟⏩\ue6f7", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 17681, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        byte[] m26824 = util.h.xy.fb.a.m26824(bArr, 1, bArr.length);
        int i2 = getHighSpeedVideoSizesFor + 73;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return m26824;
        }
        throw null;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public java.lang.String mo26276() {
        int i = getHighSpeedVideoSizesFor + 3;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                mo25969();
                throw new java.lang.ArithmeticException();
            }
            byte[] mo25969 = mo25969();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((mo25969.length * 2) + 1);
            stringBuffer.append('#');
            for (int i2 = 0; i2 != mo25969.length; i2++) {
                byte b = mo25969[i2];
                char[] cArr = getOutputFormats;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & com.google.common.base.Ascii.SI]);
            }
            java.lang.String obj = stringBuffer.toString();
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 51;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return obj;
            }
            throw null;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(36 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), 162 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (64940 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.dh.ri(sb.toString(), e);
        }
    }

    @Override // util.h.xy.dh.mb
    /* renamed from: ͺ */
    public java.io.InputStream mo26282() throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoSizes;
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr, 1, bArr.length - 1);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 81) % 128;
        return byteArrayInputStream;
    }

    ma(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue1e3枈\uedf5猧奈罊쒰䫹탏噄\udc32▢ꮑ㇉뜸㵪荀ࣻ軨ᓜ驈\ue071榻\uef91痀", 34351 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
                    throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (bArr.length <= 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ue1e3궦禩֩톴鶤⦬\uf5b7膿䷪᧮ꖬ熩㶧즤閤↠\uedf5릴䖲ᇰ\uddb4榿㖣솨趤", 19457 - android.text.TextUtils.getTrimmedLength(""), objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((maximumFlingVelocity >> 16) + 39, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 75, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8074), objArr3);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                }
                if (i > 7) {
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(48 - resolveOpacity, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 113, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr4);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
                }
            }
        }
        this.getHighSpeedVideoSizes = bArr;
    }

    ma(byte[] bArr, int i) {
        if (bArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue1e3钧\u0bab뺥㖹ꣀ忎튖䦝ﲕ珬\ue6e6鷤Ⴟ蟄㫈놔ⓝ\udbcf中씤", 29959 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        if (bArr.length == 0 && i != 0) {
            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 39, android.graphics.Color.red(0) + 75, (char) (8072 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (i <= 7 && i >= 0) {
            this.getHighSpeedVideoSizes = util.h.xy.fb.a.m26822(bArr, (byte) i);
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 47, 114 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr3);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected static byte[] m26306(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i2 + 113) % 128;
        if (i == 0) {
            return new byte[0];
        }
        getHighSpeedVideoSizesFor = (i2 + 1) % 128;
        int i3 = 4;
        for (int i4 = 3; i4 > 0; i4--) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 25;
            getHighSpeedVideoSizesFor = i5 % 128;
            if (i5 % 2 == 0) {
                if (((255 << (i4 * 8)) & i) != 0) {
                    break;
                }
                i3--;
            } else {
                if (((i4 + 2241) & i) != 0) {
                    break;
                }
                i3--;
            }
        }
        byte[] bArr = new byte[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 95) % 128;
            bArr[i6] = (byte) ((i >> (i6 * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected static int m26307(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                int i4 = i >> (i3 * 8);
                if (i4 != 0) {
                    int i5 = getHighSpeedVideoSizesFor + 113;
                    getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                    i2 = i5 % 2 == 0 ? i & 6871 : i4 & 255;
                } else {
                    i3--;
                }
            } else {
                if (i != 0) {
                    i2 = i & 255;
                    getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                    break;
                }
                i3--;
            }
        }
        if (i2 == 0) {
            int i6 = getHighSpeedVideoSizesFor + 45;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            return i6 % 2 == 0 ? 1 : 0;
        }
        int i7 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i7;
            }
            int i8 = getHighSpeedVideoSizesFor + 7;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            i7 = i8 % 2 == 0 ? i7 + 112 : i7 + 1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dh.ma m26305(util.h.xy.dh.mm mmVar, boolean z) {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        util.h.xy.dh.ma maVar = (util.h.xy.dh.ma) getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(mmVar, z);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 93) % 128;
        return maVar;
    }

    static void getHighSpeedVideoSizes() {
        getInputFormats = new char[]{40039, 23517, 4882, 52058, 33424, 31444, 12879, 59998, 41350, 39300, 20736, 2417, 49331, 47339, 28707, 10336, 59300, 57327, 38719, 20262, 1671, 65225, 46699, 28122, 9706, 7456, 54625, 36007, 17635, 15407, 62471, 45956, 27603, 9011, 7030, 54006, 35575, 16937, 14971, 61871, 43474, 24857, 22841, 4254, 11330, 60410, 41789, 31609, 12984, 51963, 33321, 23072, 4524, 10732, 57635, 47441, 28820, 2246, 49245, 38993, 22421, 28550, 9990, 65353, 46747, 20195, 1659, 56739, 38375, 44351, 25975, 15527, 62690, 35960, 17453, 33778, 17488, 3200, 54480, 40284, 25941, 11651, 62925, 48647, 34393, 20098, 5815, 57136, 42864, 28586, 14330, 63608, 49266, 34987, 20731, 6436, 57641, 43480, 29212, 14942, 720, 51904, 37634, 23382, 9102, 60302, 44059, 29769, 15537, 1202, 52541, 38261, 23981, 9717, 40049, 23517, 4895, 51990, 33431, 31449, 12827, 59993, 41417, 39367, 20738, 2416, 49331, 47351, 28707, 10290, 59315, 57321, 38763, 20321, 1719, 65253, 46686, 28046, 9692, 7430, 54547, 35994, 17605, 15369, 62537, 46018, 27542, 9084, 7028, 53924, 35509, 16956, 14954, 61881, 43514, 24932, 22903, 4310, 51228, 32854, 32727, 14210, 25060, 42622, 61091, 14079, 32555, 34674, 53154, 6122, 23653, 25709, 44221, 62656, 15646, 17734, 36315, 54747, 6675, 8771, 27272, 45774, 64256, 834, 19444, 36982, 55383, 57521, 10475, 28945, 47477, 49590, 2530, 20000, 38506, 57034, 59031, 40040, 23506, 4877, 52055, 33433, 31449, 12811, 59914, 41369, 39365, 20743, 2366, 49343, 47345, 28707, 10337, 59377, 57320, 38702, 20338, 1696, 65251, 46667, 28063, 9693};
        getOutputMinFrameDuration = 3053738275337952188L;
        getInputSizeshNQ4ISI = -8961199693178744225L;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.ma m26308(java.lang.Object obj) {
        if (obj == null || (obj instanceof util.h.xy.dh.ma)) {
            return (util.h.xy.dh.ma) obj;
        }
        if (obj instanceof util.h.xy.dh.c) {
            util.h.xy.dh.mi mo26279 = ((util.h.xy.dh.c) obj).mo26279();
            if (mo26279 instanceof util.h.xy.dh.ma) {
                return (util.h.xy.dh.ma) mo26279;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (util.h.xy.dh.ma) getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges((byte[]) obj);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(44 - trimmedLength, android.view.MotionEvent.axisFromString("") + 1, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 31, 43 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (45098 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2);
        sb2.append(((java.lang.String) objArr2[0]).intern());
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }
}
