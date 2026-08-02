package util.h.xy.ap;

/* loaded from: classes18.dex */
public class ra implements com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private transient util.h.xy.at.mb getHighResolutionOutputSizeshNQ4ISI;
    private transient java.util.List<java.lang.Byte> getHighSpeedVideoFpsRangesFor;

    public ra(util.h.xy.at.mb mbVar) {
        if (mbVar == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f284);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = mbVar;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    private ra() {
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer
    @util.h.xy.a.a
    public void input(byte b) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f727);
        sb.append(util.h.xy.al.ra.f439);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor.add(java.lang.Byte.valueOf(b));
            throw new java.lang.ArithmeticException();
        }
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Byte.valueOf(b));
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRanges = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 + 5;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer
    @util.h.xy.a.a
    public void reset() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f727);
        sb.append(util.h.xy.al.ra.f682);
        util.h.xy.am.ma.m25027(str, sb.toString());
        getHighResolutionOutputSizeshNQ4ISI();
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 101) + ((i & 101) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @util.h.xy.a.a
    private void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 59) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer
    @util.h.xy.a.a
    public void finish() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f727);
        sb.append(util.h.xy.al.ra.f637);
        util.h.xy.am.ma.m25027(str, sb.toString());
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 19) % 128;
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f284);
        }
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        byte[] bArr = new byte[size];
        java.util.Iterator<java.lang.Byte> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i3 & 33) + (i3 | 33)) % 128;
            bArr[i2] = it.next().byteValue();
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i4 | 25) << 1) - (i4 ^ 25)) % 128;
            i2 = ((i2 & 28) + (i2 | 28)) - 27;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 57) % 128;
        byte[] bArr2 = new byte[size];
        byte[] m25117 = util.h.xy.at.ma.m25117();
        int i5 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i5 & 117) + (i5 | 117)) % 128;
        int i6 = 0;
        while (i < size) {
            int i7 = Camera2StreamConfigurationMap;
            int i8 = (i7 & 21) + (i7 | 21);
            getHighSpeedVideoFpsRanges = i8 % 128;
            if (i8 % 2 == 0) {
                byte b = bArr[i];
                byte b2 = m25117[i6 % m25117.length];
                bArr2[i6] = (byte) ((~(b & b2)) & (b | b2));
                i6 = (i6 ^ 1) + ((i6 & 1) << 1);
                i++;
            } else {
                byte b3 = bArr[i];
                byte b4 = m25117[i6 % m25117.length];
                bArr2[i6] = (byte) ((b3 & (~b4)) | ((~b3) & b4));
                i6 += 38;
                i += 87;
            }
        }
        util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f653);
        this.getHighResolutionOutputSizeshNQ4ISI.mo25118(bArr2);
        int i9 = Camera2StreamConfigurationMap + 9;
        getHighSpeedVideoFpsRanges = i9 % 128;
        if (i9 % 2 == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            int i10 = Camera2StreamConfigurationMap + 29;
            getHighSpeedVideoFpsRanges = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }
}
