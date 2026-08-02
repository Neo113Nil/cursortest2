package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
public class SMimeParserProvider implements org.bouncycastle.mime.MimeParserProvider {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoSizes;

    @Override // org.bouncycastle.mime.MimeParserProvider
    public org.bouncycastle.mime.MimeParser createParser(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException {
        return new org.bouncycastle.mime.BasicMimeParser(new org.bouncycastle.mime.smime.SMimeParserContext(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes), headers, org.bouncycastle.mime.smime.SMimeUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream));
    }

    @Override // org.bouncycastle.mime.MimeParserProvider
    public org.bouncycastle.mime.MimeParser createParser(java.io.InputStream inputStream) throws java.io.IOException {
        return new org.bouncycastle.mime.BasicMimeParser(new org.bouncycastle.mime.smime.SMimeParserContext(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes), org.bouncycastle.mime.smime.SMimeUtils.getHighResolutionOutputSizeshNQ4ISI(inputStream));
    }

    public SMimeParserProvider(java.lang.String str, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = digestCalculatorProvider;
    }
}
