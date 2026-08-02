package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
public class BcPKCS12MacCalculatorBuilderProvider implements org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider {
    private org.bouncycastle.operator.bc.BcDigestProvider getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider
    public org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return new org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder() { // from class: org.bouncycastle.pkcs.bc.BcPKCS12MacCalculatorBuilderProvider.1
            @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE);
            }

            @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
            public org.bouncycastle.operator.MacCalculator build(char[] cArr) throws org.bouncycastle.operator.OperatorCreationException {
                return org.bouncycastle.pkcs.bc.PKCS12PBEUtils.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm(), org.bouncycastle.pkcs.bc.BcPKCS12MacCalculatorBuilderProvider.this.getHighResolutionOutputSizeshNQ4ISI.get(algorithmIdentifier), org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters()), cArr);
            }
        };
    }

    public BcPKCS12MacCalculatorBuilderProvider(org.bouncycastle.operator.bc.BcDigestProvider bcDigestProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = bcDigestProvider;
    }
}
