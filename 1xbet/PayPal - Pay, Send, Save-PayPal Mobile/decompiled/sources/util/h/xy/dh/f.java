package util.h.xy.dh;

/* loaded from: classes5.dex */
public class f extends util.h.xy.dh.mi {
    private static int Camera2StreamConfigurationMap = 1;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static char getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private final int getInputFormats;
    private final byte[] getOutputSizes;

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 37;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                i3 -= 40503;
                i4++;
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 119) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.f.class) { // from class: util.h.xy.dh.f.3
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = (((i | 99) << 1) - (i ^ 99)) % 128;
                util.h.xy.dh.f Camera2StreamConfigurationMap2 = util.h.xy.dh.f.Camera2StreamConfigurationMap(mzVar.m26337());
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 99) % 128;
                return Camera2StreamConfigurationMap2;
            }
        };
        int i = getInputSizeshNQ4ISI + 39;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            int i3 = getOutputMinFrameDuration + 27;
            int i4 = i3 % 128;
            getInputSizeshNQ4ISI = i4;
            i = i3 % 2 != 0 ? i + 23 : i2;
            getOutputMinFrameDuration = (i4 + 69) % 128;
        }
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 109) % 128;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (util.h.xy.fb.rc.m26853(((java.lang.String) r1[0]).intern()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        util.h.xy.dh.f.getOutputMinFrameDuration = (util.h.xy.dh.f.getInputSizeshNQ4ISI + 41) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (util.h.xy.fb.rc.m26853(((java.lang.String) r1[0]).intern()) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int i = (getInputSizeshNQ4ISI + 65) % 128;
        getOutputMinFrameDuration = i;
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length == 1) {
            getInputSizeshNQ4ISI = (i + 71) % 128;
            return false;
        }
        if (bArr[0] == (bArr[1] >> 7)) {
            int i2 = i + 23;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("ᶛꄃ롔酒ढ㾨ƛꊑﶴ䤿뚨ꊚ럢윬읒逌┌賡뒃Ḑ튏ꒂ᭘ⲗו係\ufb0e㫫ƛꊑ琽㾫氐鈐뿜嵍䏚왹ᘍ婡舠㗝", android.view.MotionEvent.axisFromString("") * 111, objArr);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ᶛꄃ롔酒ढ㾨ƛꊑﶴ䤿뚨ꊚ럢윬읒逌┌賡뒃Ḑ튏ꒂ᭘ⲗו係\ufb0e㫫ƛꊑ琽㾫氐鈐뿜嵍䏚왹ᘍ婡舠㗝", android.view.MotionEvent.axisFromString("") + 43, objArr2);
            }
        }
        return false;
    }

    private static int Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int length = bArr.length;
        int max = java.lang.Math.max(i, length - 4);
        int i2 = bArr[max];
        int i3 = getOutputMinFrameDuration + 5;
        while (true) {
            getInputSizeshNQ4ISI = i3 % 128;
            max++;
            if (max >= length) {
                return i2;
            }
            i2 = (i2 << 8) | (bArr[max] & 255);
            i3 = getOutputMinFrameDuration + 1;
        }
    }

    static util.h.xy.dh.f Camera2StreamConfigurationMap(byte[] bArr) {
        util.h.xy.dh.f fVar = new util.h.xy.dh.f(bArr);
        int i = getOutputMinFrameDuration + 5;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return fVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 73) % 128;
        java.lang.String obj = m26295().toString();
        int i = getOutputMinFrameDuration + 59;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getInputSizeshNQ4ISI + 39;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (miVar instanceof util.h.xy.dh.f) {
            return util.h.xy.fb.a.m26820(this.getOutputSizes, ((util.h.xy.dh.f) miVar).getOutputSizes);
        }
        getInputSizeshNQ4ISI = (i2 + 103) % 128;
        return false;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = getInputSizeshNQ4ISI + 111;
        getOutputMinFrameDuration = i % 128;
        byte[] bArr = this.getOutputSizes;
        if (i % 2 != 0) {
            return util.h.xy.fb.a.m26817(bArr);
        }
        util.h.xy.fb.a.m26817(bArr);
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 7) % 128;
        rjVar.getHighSpeedVideoSizes(z, 2, this.getOutputSizes);
        int i = getOutputMinFrameDuration + 103;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 87) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getOutputSizes.length);
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 73) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i + 105) % 128;
        int i2 = i + 11;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m26293() {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 35) % 128;
        byte[] bArr = this.getOutputSizes;
        int length = bArr.length;
        int i = this.getInputFormats;
        if (length - i > 4) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﮖ\ue547풕쉍莰ꇱ⨘Ĩᛏ쪚\uec43\u209e笒㷢썺磔㕍ᡏ篻脆ョᤶ䏚왹⇼넌隄⥜\uec43\u209e", android.text.TextUtils.indexOf("", "") + 30, objArr);
            throw new java.lang.ArithmeticException(((java.lang.String) objArr[0]).intern());
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, i);
        int i2 = getInputSizeshNQ4ISI + 111;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m26296(int i) {
        byte[] bArr = this.getOutputSizes;
        int length = bArr.length;
        int i2 = this.getInputFormats;
        if (length - i2 > 4) {
            return false;
        }
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 115) % 128;
        if (Camera2StreamConfigurationMap(bArr, i2) != i) {
            return false;
        }
        int i3 = (getOutputMinFrameDuration + 95) % 128;
        getInputSizeshNQ4ISI = i3;
        getOutputMinFrameDuration = (i3 + 41) % 128;
        return true;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public java.math.BigInteger m26295() {
        java.math.BigInteger bigInteger = new java.math.BigInteger(this.getOutputSizes);
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 103) % 128;
        return bigInteger;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.math.BigInteger m26294() {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, this.getOutputSizes);
        int i = getOutputMinFrameDuration + 31;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    private f(byte[] bArr) {
        if (getHighResolutionOutputSizeshNQ4ISI(bArr)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("皽\u0600Ř\uea82ᶛꄃ厨踚膗⪮쭲楦ᛏ쪚\uec43\u209e\ued95ⅎ", 18 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        this.getOutputSizes = bArr;
        this.getInputFormats = getHighSpeedVideoFpsRanges(bArr);
    }

    public f(java.math.BigInteger bigInteger) {
        this.getOutputSizes = bigInteger.toByteArray();
        this.getInputFormats = 0;
    }

    public f(long j) {
        this.getOutputSizes = java.math.BigInteger.valueOf(j).toByteArray();
        this.getInputFormats = 0;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dh.f m26292(util.h.xy.dh.mm mmVar, boolean z) {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 11) % 128;
        util.h.xy.dh.f fVar = (util.h.xy.dh.f) getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(mmVar, z);
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 21) % 128;
        return fVar;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = (char) 260;
        getOutputFormats = (char) 46051;
        getHighSpeedVideoFpsRanges = (char) 39426;
        getHighResolutionOutputSizeshNQ4ISI = (char) 55751;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dh.f m26291(java.lang.Object obj) {
        int i = getOutputMinFrameDuration;
        int i2 = i + 99;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj == null || (obj instanceof util.h.xy.dh.f)) {
            util.h.xy.dh.f fVar = (util.h.xy.dh.f) obj;
            getInputSizeshNQ4ISI = (i + 77) % 128;
            return fVar;
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("똄ᑇ읒逌ꢳ咈역縢㢌±囹핦띦\ue837ョᤶ䆇沃\uec43\u209eট\ufe6f➾䶳웦樝ހำ栚嵰㚢ꬫ", 31 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (util.h.xy.dh.f) getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("꼺叵塌⒲䟸ើ鞔\uf63a漫鶳蠕㭰ᶛꄃョᤶ䆇沃\uec43\u209eট\ufe6f➾䶳웦樝ހำ栚嵰㚢ꬫ", 32 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }
}
