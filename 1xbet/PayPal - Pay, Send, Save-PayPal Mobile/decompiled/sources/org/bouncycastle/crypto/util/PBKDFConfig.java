package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public abstract class PBKDFConfig {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    protected PBKDFConfig(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
    }
}
