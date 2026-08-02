package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class md implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ContentType getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private java.lang.String getInputFormats;
    private java.lang.String getOutputFormats;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions
    @java.lang.Deprecated
    public final java.lang.String getText() {
        java.lang.String str;
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f412);
        sb.append(util.h.xy.al.ra.f645);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr != null) {
            str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i ^ 63) + ((i & 63) << 1)) % 128;
        } else {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 39) % 128;
            str = null;
        }
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
        return str;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions
    public final java.lang.String getContent() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f412);
        sb.append(util.h.xy.al.ra.f340);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoSizes;
        java.lang.String str2 = bArr != null ? new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8) : null;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 49) + (i | 49)) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession accept() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f412);
        sb.append(util.h.xy.al.ra.f735);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bb.rd rdVar = new util.h.xy.bb.rd();
        rdVar.m25363(this.getHighSpeedVideoFpsRangesFor);
        rdVar.m25362(util.h.xy.bh.mb.m25477());
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 55) + ((i & 55) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            getHighSpeedVideoFpsRanges = ((i & 13) + (i | 13)) % 128;
            return rdVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25327(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 17) % 128;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = (i + 89) % 128;
            this.getHighSpeedVideoSizes = java.util.Arrays.copyOf(bArr, bArr.length);
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i2 | 119) << 1) - (i2 ^ 119)) % 128;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ContentType getContentType() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f412);
        sb.append(util.h.xy.al.ra.f319);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ContentType contentType = this.getHighResolutionOutputSizeshNQ4ISI;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ~((i ^ (-63718319)) | (i & (-63718319)));
        int i3 = ~(identityHashCode | 988118469);
        int i4 = -(-(((i2 ^ i3) | (i2 & i3)) * 1150));
        int i5 = (i4 ^ (-1970257456)) + ((i4 & (-1970257456)) << 1);
        int i6 = ~((identityHashCode ^ 988118469) | (988118469 & identityHashCode));
        int i7 = ~(((-988118470) ^ i) | (i & (-988118470)));
        int i8 = -(-(((i6 ^ i7) | (i6 & i7)) * (-575)));
        int i9 = ~((identityHashCode ^ (-63718319)) | (identityHashCode & (-63718319)));
        int i10 = ~((i ^ 63718318) | (i & 63718318));
        int i11 = -(-(((i9 ^ i10) | (i9 & i10)) * 575));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i12 = (identityHashCode2 ^ (-1834085603)) | (identityHashCode2 & (-1834085603));
        int i13 = ~i12;
        int i14 = (-5083390) - (~(-(-(((i13 ^ 2039060803) | (i13 & 2039060803)) * (-465)))));
        int i15 = ~((identityHashCode2 ^ 2039060803) | (identityHashCode2 & 2039060803));
        int i16 = ((i15 ^ (-1834085603)) | (i15 & (-1834085603))) * 930;
        if ((((i5 ^ i8) + ((i8 & i5) << 1)) - (~i11)) - 1 <= (((i14 | i16) << 1) - (i16 ^ i14)) + (((i12 ^ 2039060803) | (i12 & 2039060803)) * 465)) {
            return contentType;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25325(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ContentType.fromValue(str);
        }
        int i3 = Camera2StreamConfigurationMap + 71;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25328(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.getHighSpeedVideoFpsRangesFor = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i2 & 17) + (i2 | 17)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions
    public final java.lang.String getHeight() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f412);
        sb.append(util.h.xy.al.ra.f680);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        int i = Camera2StreamConfigurationMap + 1;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25326(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 55) + (i | 55);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            this.getInputFormats = str;
            Camera2StreamConfigurationMap = ((i3 ^ 105) + ((i3 & 105) << 1)) % 128;
        }
        int i4 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i4 & 57) + (i4 | 57)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions
    public final java.lang.String getWidth() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f412);
        sb.append(util.h.xy.al.ra.f697);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputFormats;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 33) + ((i & 33) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25329(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i ^ 57) + ((i & 57) << 1)) % 128;
        if (str != null) {
            int i2 = i + 49;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                this.getOutputFormats = str;
            } else {
                this.getOutputFormats = str;
                throw new java.lang.ArithmeticException();
            }
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 89) % 128;
    }
}
