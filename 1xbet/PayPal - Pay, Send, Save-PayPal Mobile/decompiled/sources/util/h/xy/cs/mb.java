package util.h.xy.cs;

/* loaded from: classes5.dex */
public final class mb extends javax.crypto.spec.SecretKeySpec {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final long serialVersionUID = 7155901954517287060L;
    private final byte[] Camera2StreamConfigurationMap;

    public mb(byte[] bArr, java.lang.String str, boolean z) {
        super(bArr, str);
        this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
        if (z) {
            util.h.xy.cv.ra.m26066(bArr);
        }
    }

    @Override // javax.crypto.spec.SecretKeySpec, java.security.Key
    public final byte[] getEncoded() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 89) + (i | 89);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = (byte[]) this.Camera2StreamConfigurationMap.clone();
        if (i3 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26028() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 7) << 1) - (i ^ 7);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.cv.ra.m26066(this.Camera2StreamConfigurationMap);
        } else {
            util.h.xy.cv.ra.m26066(this.Camera2StreamConfigurationMap);
            throw new java.lang.ArithmeticException();
        }
    }
}
