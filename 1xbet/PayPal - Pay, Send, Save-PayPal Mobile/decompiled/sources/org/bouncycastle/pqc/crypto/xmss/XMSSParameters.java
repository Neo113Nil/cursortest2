package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSParameters {
    private static final java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.XMSSParameters> getHighSpeedVideoSizesFor;
    final org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final org.bouncycastle.pqc.crypto.xmss.XMSSOid getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getOutputMinFrameDuration;

    public XMSSParameters(int i, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("height must be >= 2");
        }
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.NullPointerException("digest == null");
        }
        this.getInputSizeshNQ4ISI = i;
        int i2 = 2;
        while (true) {
            int i3 = this.getInputSizeshNQ4ISI;
            if (i2 > i3) {
                throw new java.lang.IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                this.getHighSpeedVideoFpsRanges = i2;
                java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.DigestUtil.Camera2StreamConfigurationMap(aSN1ObjectIdentifier);
                this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                this.getOutputMinFrameDuration = aSN1ObjectIdentifier;
                org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters wOTSPlusParameters = new org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters(aSN1ObjectIdentifier);
                this.Camera2StreamConfigurationMap = wOTSPlusParameters;
                int i4 = wOTSPlusParameters.getHighSpeedVideoSizes;
                this.getInputFormats = i4;
                int i5 = wOTSPlusParameters.getOutputFormats;
                this.getHighSpeedVideoSizes = i5;
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid.lookup(Camera2StreamConfigurationMap, i4, i5, wOTSPlusParameters.getHighSpeedVideoFpsRangesFor, i);
                return;
            }
            i2++;
        }
    }

    public final int getTreeDigestSize() {
        return this.getInputFormats;
    }

    public final org.bouncycastle.asn1.ASN1ObjectIdentifier getTreeDigestOID() {
        return this.getOutputMinFrameDuration;
    }

    public final int getHeight() {
        return this.getInputSizeshNQ4ISI;
    }

    public static org.bouncycastle.pqc.crypto.xmss.XMSSParameters lookupByOID(int i) {
        return getHighSpeedVideoSizesFor.get(org.bouncycastle.util.Integers.valueOf(i));
    }

    public XMSSParameters(int i, org.bouncycastle.crypto.Digest digest) {
        this(i, org.bouncycastle.pqc.crypto.xmss.DigestUtil.Camera2StreamConfigurationMap(digest.getAlgorithmName()));
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.util.Integers.valueOf(1), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(10, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(2), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(16, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(3), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(20, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(4), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(10, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(5), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(16, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(6), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(20, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(7), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(10, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(8), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(16, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(9), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(20, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(10), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(10, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(11), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(16, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(12), new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(20, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableMap(hashMap);
    }
}
