package util.h.xy.dh;

/* loaded from: classes5.dex */
public class rb extends util.h.xy.dh.mi {
    private static char Camera2StreamConfigurationMap = 0;
    static final util.h.xy.dh.p getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static long getOutputFormats;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.dh.rb f1209;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.dh.rb f1210;
    private final byte getInputFormats;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        char[] charArray3 = str.toCharArray();
        int i2 = getHighSpeedVideoFpsRangesFor + 15;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
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
            cArr3[rcVar.f2652] = (char) ((((cArr[i5] ^ r2[rcVar.f2652]) ^ (getOutputFormats ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (Camera2StreamConfigurationMap ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.p(util.h.xy.dh.rb.class) { // from class: util.h.xy.dh.rb.5
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = ((i & 93) + (i | 93)) % 128;
                util.h.xy.dh.rb highSpeedVideoSizes = util.h.xy.dh.rb.getHighSpeedVideoSizes(mzVar.m26337());
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = ((i2 ^ 73) + ((i2 & 73) << 1)) % 128;
                return highSpeedVideoSizes;
            }
        };
        f1210 = new util.h.xy.dh.rb((byte) 0);
        f1209 = new util.h.xy.dh.rb((byte) -1);
        int i = getInputSizeshNQ4ISI + 63;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static util.h.xy.dh.rb getHighSpeedVideoSizes(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i + 81) % 128;
        if (bArr.length != 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("씈壈岝\udb48ᑺꡎ顄\u0e75궱␚\ude37擑ʒ搀ዻ頙售憦芊츨\uded2\u1779ᘰ\ue17cｗ\ua8cc䩼뵟㢤\ue556멘龾剹\ue6ac죛羯\ue542ጉ", (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, "ㅊ䐲㲕⭘", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        byte b = bArr[0];
        if (b != -1) {
            return b != 0 ? new util.h.xy.dh.rb(b) : f1210;
        }
        util.h.xy.dh.rb rbVar = f1209;
        getInputSizeshNQ4ISI = (i + 3) % 128;
        return rbVar;
    }

    public java.lang.String toString() {
        java.lang.Object obj;
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 121) % 128;
        if (m26334()) {
            int i = getHighSpeedVideoSizes + 109;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("⥥\ue919\ufbcb\udd8b", (char) (13939 % android.graphics.Color.blue(1)), android.view.ViewConfiguration.getScrollDefaultDelay() % 105, "\udc90℡\uf5ad硌", "\u0000\u0000\u0000\u0000", objArr);
                obj = objArr[0];
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("⥥\ue919\ufbcb\udd8b", (char) (android.graphics.Color.blue(0) + 19701), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, "\udc90℡\uf5ad硌", "\u0000\u0000\u0000\u0000", objArr2);
                obj = objArr2[0];
            }
        } else {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("廬迪\uda79Ჵ텄", (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25723), (-1362043448) - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), "윑택箮⭤", "\u0000\u0000\u0000\u0000", objArr3);
                obj = objArr3[0];
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        java.lang.String intern = ((java.lang.String) obj).intern();
        int i2 = getInputSizeshNQ4ISI + 85;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        if (!m26334()) {
            util.h.xy.dh.rb rbVar = f1210;
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 83) % 128;
            return rbVar;
        }
        int i = getHighSpeedVideoSizes + 43;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return f1209;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i;
        int i2 = getHighSpeedVideoSizes + 73;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            m26334();
            throw null;
        }
        if (m26334()) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 35) % 128;
            i = 1;
        } else {
            i = 0;
        }
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 65) % 128;
        return i;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        boolean z = false;
        if (!(miVar instanceof util.h.xy.dh.rb)) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 75) % 128;
            return false;
        }
        if (m26334() == ((util.h.xy.dh.rb) miVar).m26334()) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 125) % 128;
            z = true;
        }
        int i = getHighSpeedVideoSizes + 77;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 39) % 128;
        byte b = this.getInputFormats;
        util.h.xy.dh.rj.Camera2StreamConfigurationMap = (util.h.xy.dh.rj.getHighSpeedVideoFpsRanges + 103) % 128;
        rjVar.getHighSpeedVideoSizes(z, 1);
        rjVar.getHighSpeedVideoFpsRanges(1);
        int i = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(b);
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.dh.rj.Camera2StreamConfigurationMap = (util.h.xy.dh.rj.getHighSpeedVideoFpsRanges + 89) % 128;
        int i2 = getHighSpeedVideoSizes + 9;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 67) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, 1);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizes + 105;
        getInputSizeshNQ4ISI = i % 128;
        return i % 2 == 0;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m26334() {
        int i = getInputSizeshNQ4ISI + 55;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.getInputFormats == 0) {
            return false;
        }
        getInputSizeshNQ4ISI = (i2 + 27) % 128;
        return true;
    }

    private rb(byte b) {
        this.getInputFormats = b;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dh.rb m26333(boolean z) {
        int i = getInputSizeshNQ4ISI + 21;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (z) {
            return f1209;
        }
        util.h.xy.dh.rb rbVar = f1210;
        getInputSizeshNQ4ISI = (i2 + 125) % 128;
        return rbVar;
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputFormats = 2457411417541981002L;
        getHighSpeedVideoSizesFor = 294925130;
        Camera2StreamConfigurationMap = (char) 36391;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.rb m26332(java.lang.Object obj) {
        if (obj != null) {
            int i = getHighSpeedVideoSizes + 23;
            int i2 = i % 128;
            getInputSizeshNQ4ISI = i2;
            if (i % 2 == 0) {
                throw null;
            }
            if (!(obj instanceof util.h.xy.dh.rb)) {
                if (!(obj instanceof byte[])) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("譛禋錰\uda23떍ᆮ刻䶿漎罓Ȳ擼幔勡腽푦묭獠ꩍ儭毙뿳肚㡋푈뼙Ѣﲌ\ue688慹\ueb17", (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F12_APP_PREFERRED_NAME), (-1076528637) - (android.view.ViewConfiguration.getTouchSlop() >> 8), "Ζ핺\u12bfស", "\u0000\u0000\u0000\u0000", objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(obj.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                int i3 = i2 + 103;
                getHighSpeedVideoSizes = i3 % 128;
                byte[] bArr = (byte[]) obj;
                try {
                    if (i3 % 2 == 0) {
                        return (util.h.xy.dh.rb) getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(bArr);
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("㽋Ⲯ亸귵协ꋴ볉察\ue407隢춌\uf73a쥴혦ĕ踍풼悠\ue89b䷛脠ᄋ呾몏व䕨拯\ua7ee䄵낱桺ᒝ합訞߃晴鏒\u2e71ﮔ\uf340鐒", (char) (33838 - android.view.View.MeasureSpec.getMode(0)), (-2122248857) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "柩脍⺁\u0b84", "\u0000\u0000\u0000\u0000", objArr2);
                    sb2.append(((java.lang.String) objArr2[0]).intern());
                    sb2.append(e.getMessage());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            }
        }
        return (util.h.xy.dh.rb) obj;
    }
}
