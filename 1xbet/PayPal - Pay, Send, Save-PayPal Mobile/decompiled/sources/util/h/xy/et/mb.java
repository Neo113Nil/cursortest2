package util.h.xy.et;

/* loaded from: classes5.dex */
public final class mb implements util.h.xy.et.ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static char[] getHighSpeedVideoFpsRanges = {40049, 22873, 5655, 54154, 34951, 18032, 824, 63725, 46498, 29472, 10328, 58653, 41695, 40854, 21866, 4646, 53221, 33965, 16999};
    private static long getOutputMinFrameDuration = -5235661868006942408L;

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 1) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
            rbVar.f2651++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 45) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // util.h.xy.et.ra
    /* renamed from: ˋ */
    public final int mo26709(byte[] bArr) throws util.h.xy.ef.md {
        int i = Camera2StreamConfigurationMap + 11;
        getHighSpeedVideoSizes = i % 128;
        int length = i % 2 != 0 ? bArr.length << 1 : bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] != Byte.MIN_VALUE) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
            throw new util.h.xy.ef.md(((java.lang.String) objArr[0]).intern());
        }
        int length2 = bArr.length;
        int i2 = getHighSpeedVideoSizes + 9;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return length2 - length;
        }
        throw null;
    }

    @Override // util.h.xy.et.ra
    /* renamed from: ˏ */
    public final int mo26710(byte[] bArr, int i) {
        int length = bArr.length;
        bArr[i] = Byte.MIN_VALUE;
        int i2 = i;
        while (true) {
            i2++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 1) % 128;
            if (i2 >= bArr.length) {
                return length - i;
            }
            bArr[i2] = 0;
        }
    }
}
