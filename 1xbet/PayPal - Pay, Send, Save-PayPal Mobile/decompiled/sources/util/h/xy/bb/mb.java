package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class mb implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private byte[] getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtSize getHighSpeedVideoSizes = new util.h.xy.bb.b();

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtSize getSize() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f805);
        sb.append(util.h.xy.al.ra.f328);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtSize cardArtSize = this.getHighSpeedVideoSizes;
        int i = getHighResolutionOutputSizeshNQ4ISI + 75;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return cardArtSize;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap
    public final byte[] getResource() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f805);
        sb.append(util.h.xy.al.ra.f696);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        return copyOf;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25311(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 77;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(bArr, bArr.length);
            int i2 = Camera2StreamConfigurationMap;
            int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(bArr, bArr.length);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap
    public final java.lang.String getFileType() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f805);
        sb.append(util.h.xy.al.ra.f738);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25310(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 103) + (i | 103)) % 128;
        this.getHighSpeedVideoFpsRangesFor = str;
        Camera2StreamConfigurationMap = (i + 3) % 128;
    }
}
