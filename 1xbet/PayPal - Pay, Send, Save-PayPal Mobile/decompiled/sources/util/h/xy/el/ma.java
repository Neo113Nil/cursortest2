package util.h.xy.el;

/* loaded from: classes18.dex */
public class ma extends util.h.xy.ef.a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getInputSizeshNQ4ISI = {64359, 64358, 64340, 64411, 64332, 64326, 64306, 64334, 64310, 64308, 64311, 64325, 64369, 64375, 64322, 64335, 64328, 64329, 64320, 64393};
    private static int getHighSpeedVideoSizesFor = -1074857029;
    private static boolean getOutputMinFrameDuration = true;
    private static boolean getHighSpeedVideoFpsRanges = true;

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getOutputMinFrameDuration) {
                throw null;
            }
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.ef.a
    /* renamed from: ˎ */
    public byte[] mo26533() {
        int i = Camera2StreamConfigurationMap + 19;
        getHighSpeedVideoSizes = i % 128;
        byte[] bArr = new byte[i % 2 == 0 ? 26 : 8];
        do {
            this.f2141.nextBytes(bArr);
            util.h.xy.ep.ma.m26661(bArr);
        } while (util.h.xy.ep.ma.m26660(bArr, 0));
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 87) % 128;
        return bArr;
    }

    @Override // util.h.xy.ef.a
    /* renamed from: ˎ */
    public void mo26532(util.h.xy.ef.re reVar) {
        int i = Camera2StreamConfigurationMap + 71;
        getHighSpeedVideoSizes = i % 128;
        super.mo26532(reVar);
        int i2 = this.f2142;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i2 != 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 99) % 128;
            if (this.f2142 != 7) {
                if (this.f2142 == 8) {
                    return;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0094\u0093\u0092\u0091\u0090\u0084\u008a\u008b\u008f\u008c\u0084\u008e\u008d\u0084\u0086\u008c\u0084\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
        }
        this.f2142 = 8;
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 69) % 128;
    }
}
