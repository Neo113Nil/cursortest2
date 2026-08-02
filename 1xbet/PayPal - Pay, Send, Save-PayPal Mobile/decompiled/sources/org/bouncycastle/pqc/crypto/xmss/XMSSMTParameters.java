package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMTParameters {
    private static final java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters> getHighSpeedVideoSizes;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSOid getHighSpeedVideoFpsRangesFor;

    public XMSSMTParameters(int i, int i2, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new java.lang.IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 == 1) {
            throw new java.lang.IllegalArgumentException("height / layers must be greater than 1");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(i3, aSN1ObjectIdentifier);
        this.Camera2StreamConfigurationMap = xMSSParameters;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), xMSSParameters.getHighSpeedVideoSizes, getLen(), getHeight(), i2);
    }

    protected final int getLen() {
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
    }

    protected final java.lang.String getTreeDigest() {
        return this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected final org.bouncycastle.pqc.crypto.xmss.WOTSPlus getWOTSPlus() {
        return new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap);
    }

    protected final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getXMSSParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getTreeDigestSize() {
        return this.Camera2StreamConfigurationMap.getTreeDigestSize();
    }

    public final org.bouncycastle.asn1.ASN1ObjectIdentifier getTreeDigestOID() {
        return this.Camera2StreamConfigurationMap.getTreeDigestOID();
    }

    protected final org.bouncycastle.pqc.crypto.xmss.XMSSOid getOid() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getLayers() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getHeight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters lookupByOID(int i) {
        return getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf(i));
    }

    public XMSSMTParameters(int i, int i2, org.bouncycastle.crypto.Digest digest) {
        this(i, i2, org.bouncycastle.pqc.crypto.xmss.DigestUtil.Camera2StreamConfigurationMap(digest.getAlgorithmName()));
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.util.Integers.valueOf(1), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(2), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(3), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(4), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(5), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 8, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(6), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 3, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(7), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 6, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(8), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 12, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(9), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(10), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(11), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(12), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(13), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 8, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(14), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 3, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(15), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 6, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(16), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 12, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(17), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(18), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(19), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(20), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(21), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 8, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(22), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 3, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(23), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 6, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(24), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 12, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(25), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(26), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(20, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(27), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 2, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(28), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 4, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(29), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(40, 8, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(30), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 3, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(31), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 6, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        hashMap.put(org.bouncycastle.util.Integers.valueOf(32), new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(60, 12, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256));
        getHighSpeedVideoSizes = java.util.Collections.unmodifiableMap(hashMap);
    }
}
