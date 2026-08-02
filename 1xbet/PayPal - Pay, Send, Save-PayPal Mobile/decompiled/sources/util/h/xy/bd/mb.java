package util.h.xy.bd;

/* loaded from: classes18.dex */
public class mb implements util.h.xy.bd.b {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = 68;

    static {
        int i = 68 % 2;
    }

    @Override // util.h.xy.bd.b
    /* renamed from: ˊ */
    public byte[] mo25372(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i | 113) << 1) - (i ^ 113)) % 128;
        int i2 = 0;
        byte b = bArr[0];
        byte b2 = bArr[1];
        util.h.xy.ar.b.m25106(bArr);
        if (b != 0) {
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = ((i3 | 23) << 1) - (i3 ^ 23);
            int i5 = i4 % 128;
            getHighSpeedVideoSizes = i5;
            if (i4 % 2 == 0 ? b != Byte.MIN_VALUE : b != 72) {
                if (b != Byte.MIN_VALUE) {
                    int i6 = (i5 & 111) + (i5 | 111);
                    int i7 = i6 % 128;
                    getHighSpeedVideoFpsRanges = i7;
                    if (i6 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (b != 0) {
                        int i8 = (i7 ^ 45) + ((i7 & 45) << 1);
                        getHighSpeedVideoSizes = i8 % 128;
                        if (i8 % 2 == 0 ? b != Byte.MIN_VALUE : b != 104) {
                            return util.h.xy.bf.b.f928;
                        }
                    }
                }
            }
        }
        if (b2 != -92) {
            int i9 = getHighSpeedVideoFpsRanges;
            int i10 = (((i9 | 109) << 1) - (i9 ^ 109)) % 128;
            getHighSpeedVideoSizes = i10;
            if (b2 != -88) {
                int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
                getHighSpeedVideoFpsRanges = i11 % 128;
                if (i11 % 2 != 0 ? b2 != -82 : b2 != 42) {
                    getHighSpeedVideoFpsRanges = (i10 + 89) % 128;
                    if (b2 != -78 && b2 != 42) {
                        int i12 = ((i10 & 63) + (i10 | 63)) % 128;
                        getHighSpeedVideoFpsRanges = i12;
                        if (b2 != -90) {
                            int i13 = (i12 & 119) + (i12 | 119);
                            getHighSpeedVideoSizes = i13 % 128;
                            if (i13 % 2 == 0) {
                                return util.h.xy.bf.b.f930;
                            }
                            byte[] bArr2 = util.h.xy.bf.b.f930;
                            throw new java.lang.ArithmeticException();
                        }
                    }
                }
            }
        }
        java.util.List<java.lang.Byte> m25509 = new util.h.xy.bl.a().m25509(null);
        if (m25509 != null) {
            int i14 = getHighSpeedVideoFpsRanges;
            int i15 = (i14 & 25) + (i14 | 25);
            getHighSpeedVideoSizes = i15 % 128;
            if (i15 % 2 != 0) {
                m25509.size();
                throw null;
            }
            if (m25509.size() != 0) {
                byte[] bArr3 = new byte[m25509.size()];
                java.util.Iterator<java.lang.Byte> it = m25509.iterator();
                while (it.hasNext()) {
                    int i16 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = (((i16 | 109) << 1) - (i16 ^ 109)) % 128;
                    bArr3[i2] = it.next().byteValue();
                    int i17 = i2 + 110;
                    i2 = (i17 ^ (-109)) + ((i17 & (-109)) << 1);
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 125) % 128;
                }
                util.h.xy.fa.d.m26805(bArr3);
                return bArr3;
            }
        }
        return util.h.xy.v.b.f2439.m27624(bArr);
    }
}
