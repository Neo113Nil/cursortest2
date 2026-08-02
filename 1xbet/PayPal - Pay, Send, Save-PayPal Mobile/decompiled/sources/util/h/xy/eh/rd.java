package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class rd extends util.h.xy.eh.mb implements util.h.xy.ef.i {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizesFor;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {39974, 9615, 61360, 45489, 31741, 15864, 51175, 35090, 21269, 5413, 57118, 24837, 39969, 9603, 61366, 45489, 31633, 15854, 51196, 35077, 21265, 5410, 57163, 24913, 11124, 60569, 46793, 30899, 686, 50399, 36537, 20694, 6713, 56348, 26114, 10352, 34356, 16323, 62974, 44008, 24978};
    private static long getHighSpeedVideoSizes = -6366663356911507987L;

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
            int i3 = getHighSpeedVideoFpsRanges + 1;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 4;
            }
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m26593(byte[] bArr, int i, int i2) {
        if (!this.f2167) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 33) % 128;
            m26586(15, 4);
        }
        m26588(bArr, i, i2 * 8);
        int i3 = getHighSpeedVideoFpsRangesFor + 47;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m26592(byte[] bArr, int i, int i2) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 113) % 128;
        int m26593 = m26593(bArr, i, i2);
        mo26564();
        int i3 = getHighSpeedVideoFpsRangesFor + 61;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return m26593;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.eh.mb, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRangesFor + 39;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            m26592(bArr, i, mo26565());
            throw null;
        }
        int m26592 = m26592(bArr, i, mo26565());
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 39) % 128;
        return m26592;
    }

    @Override // util.h.xy.eh.mb, util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 69) % 128;
        int i = this.f2165 / 4;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 15) % 128;
        return i;
    }

    @Override // util.h.xy.eh.mb, util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(lastIndexOf + 6, 36 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6759), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.f2165);
        java.lang.String obj = sb.toString();
        int i = getHighSpeedVideoFpsRangesFor + 83;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(int i) {
        super(i);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 39;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i == 128 || i == 256) {
            getHighSpeedVideoSizesFor = (i2 + 121) % 128;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(normalizeMetaState + 12, android.view.ViewConfiguration.getTapTimeout() >> 16, (char) android.view.KeyEvent.normalizeMetaState(0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i);
        int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(24 - offsetAfter, android.view.View.getDefaultSize(0, 0) + 12, (char) android.view.View.MeasureSpec.getMode(0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public rd() {
        this(128);
    }
}
