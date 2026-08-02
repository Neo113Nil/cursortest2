package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
public class SMimeParserContext implements org.bouncycastle.mime.MimeParserContext {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRanges;

    public org.bouncycastle.operator.DigestCalculatorProvider getDigestCalculatorProvider() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.mime.MimeParserContext
    public java.lang.String getDefaultContentTransferEncoding() {
        return this.Camera2StreamConfigurationMap;
    }

    public SMimeParserContext(java.lang.String str, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = digestCalculatorProvider;
    }
}
