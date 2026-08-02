package util.h.xy.bg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static final /* synthetic */ util.h.xy.bg.a[] getInputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.bg.a f944;
    private final java.util.concurrent.CountDownLatch getOutputFormats = new java.util.concurrent.CountDownLatch(1);
    private final java.util.concurrent.CountDownLatch getOutputMinFrameDurationlomOqCM = new java.util.concurrent.CountDownLatch(1);
    private java.util.concurrent.CountDownLatch getOutputSizeshNQ4ISI = null;
    private java.util.concurrent.CountDownLatch getOutputStallDurationlomOqCM = null;
    private java.util.concurrent.CountDownLatch getInputFormats = null;
    private java.util.concurrent.CountDownLatch getHighSpeedVideoSizesFor = null;
    private java.util.concurrent.CountDownLatch getOutputMinFrameDuration = null;

    private a(java.lang.String str) {
    }

    public static util.h.xy.bg.a valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.bg.a aVar = (util.h.xy.bg.a) java.lang.Enum.valueOf(util.h.xy.bg.a.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        return aVar;
    }

    public static util.h.xy.bg.a[] values() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 53) % 128;
        util.h.xy.bg.a[] aVarArr = (util.h.xy.bg.a[]) getInputSizeshNQ4ISI.clone();
        int i = getHighSpeedVideoFpsRangesFor + 3;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return aVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.bg.a[] aVarArr;
        getHighSpeedVideoFpsRangesFor();
        int indexOf = 19372 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i = getHighSpeedVideoSizes + 9;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        char[] charArray = "\uf779볓怹ᑣ\ud9c5负ㅽ\ue6ce".toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = indexOf;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 71) % 128;
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRanges ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i2 = Camera2StreamConfigurationMap + 67;
            getHighSpeedVideoSizes = i2 % 128;
            int i3 = i2 % 2;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        util.h.xy.bg.a aVar = new util.h.xy.bg.a(new java.lang.String(cArr).intern());
        f944 = aVar;
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = i4 + 59;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            aVarArr = new util.h.xy.bg.a[0];
            aVarArr[1] = aVar;
        } else {
            aVarArr = new util.h.xy.bg.a[]{aVar};
        }
        getHighSpeedVideoFpsRangesFor = (i4 + 9) % 128;
        getInputSizeshNQ4ISI = aVarArr;
        getHighSpeedVideoFpsRangesFor = (i4 + 19) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m25454() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 85) % 128;
        java.util.concurrent.CountDownLatch countDownLatch = this.getOutputFormats;
        int i2 = i + 51;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return countDownLatch;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m25452() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return this.getOutputMinFrameDurationlomOqCM;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25451(java.util.concurrent.CountDownLatch countDownLatch) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 73;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            this.getOutputStallDurationlomOqCM = countDownLatch;
        } else {
            this.getOutputStallDurationlomOqCM = countDownLatch;
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m25458() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 99;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.util.concurrent.CountDownLatch countDownLatch = this.getOutputStallDurationlomOqCM;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 87) % 128;
        return countDownLatch;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25455(java.util.concurrent.CountDownLatch countDownLatch) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 23;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 != 0) {
            this.getInputFormats = countDownLatch;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 111) % 128;
        } else {
            this.getInputFormats = countDownLatch;
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25457(java.util.concurrent.CountDownLatch countDownLatch) {
        int i = getHighSpeedVideoFpsRangesFor + 117;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoSizesFor = countDownLatch;
        } else {
            this.getHighSpeedVideoSizesFor = countDownLatch;
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m25450() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 49;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.util.concurrent.CountDownLatch countDownLatch = this.getInputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 125) % 128;
        return countDownLatch;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m25456() {
        int i = (getHighSpeedVideoFpsRangesFor + 119) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.util.concurrent.CountDownLatch countDownLatch = this.getOutputMinFrameDuration;
        getHighSpeedVideoFpsRangesFor = (i + 47) % 128;
        return countDownLatch;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m25459() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 97;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return this.getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25453(java.util.concurrent.CountDownLatch countDownLatch) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 91) % 128;
        this.getOutputMinFrameDuration = countDownLatch;
        getHighSpeedVideoFpsRangesFor = (i + 101) % 128;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = 2652865410741093547L;
    }
}
