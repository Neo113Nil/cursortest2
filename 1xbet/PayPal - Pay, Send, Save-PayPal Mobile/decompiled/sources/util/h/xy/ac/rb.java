package util.h.xy.ac;

/* loaded from: classes5.dex */
public final class rb implements util.h.xy.ac.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private int getOutputFormats;

    public rb(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (i == 0 || bArr == null || bArr2 == null || bArr3 == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f632);
        }
        this.getOutputFormats = i;
        this.getHighSpeedVideoFpsRanges = (byte[]) bArr.clone();
        this.getHighSpeedVideoFpsRangesFor = (byte[]) bArr2.clone();
        this.getHighResolutionOutputSizeshNQ4ISI = (byte[]) bArr3.clone();
    }

    @Override // util.h.xy.ac.ra
    /* renamed from: ˎ */
    public final byte[] mo24546() {
        util.h.xy.el.b bVar = new util.h.xy.el.b(new util.h.xy.ek.ra(new util.h.xy.eh.mc()));
        bVar.m26613(util.h.xy.ep.rb.m26672(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
        int i = this.getOutputFormats / 8;
        byte[] bArr = new byte[i];
        bVar.m26612(bArr, 0, i);
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ac.e
    /* renamed from: ˋ */
    public final void mo24542() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 85) + ((i & 85) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        this.getOutputFormats = 0;
        byte[][] bArr = {this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI};
        getHighSpeedVideoSizes = ((i2 & 7) + (i2 | 7)) % 128;
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = Camera2StreamConfigurationMap;
            int i5 = ((i4 ^ 97) + ((i4 & 97) << 1)) % 128;
            getHighSpeedVideoSizes = i5;
            byte[] bArr2 = bArr[i3];
            int i6 = (i5 & 125) + (i5 | 125);
            int i7 = i6 % 128;
            Camera2StreamConfigurationMap = i7;
            if (i6 % 2 == 0) {
                if (bArr2 != null && bArr2.length > 0) {
                    int i8 = ((i7 | 81) << 1) - (i7 ^ 81);
                    getHighSpeedVideoSizes = i8 % 128;
                    java.util.Arrays.fill(bArr2, i8 % 2 == 0 ? bArr2[0] : bArr2[0]);
                }
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 59) % 128;
            } else {
                throw null;
            }
        }
        int i9 = getHighSpeedVideoSizes;
        int i10 = ((i9 | 25) << 1) - (i9 ^ 25);
        int i11 = i10 % 128;
        Camera2StreamConfigurationMap = i11;
        if (i10 % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            int i12 = i11 + 51;
            getHighSpeedVideoSizes = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw new java.lang.ArithmeticException();
    }
}
