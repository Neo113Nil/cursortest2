package org.bouncycastle.cms;

/* loaded from: classes17.dex */
class OriginatorId implements org.bouncycastle.util.Selector {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizes;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        return false;
    }

    public OriginatorId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = x500Name;
        this.getHighSpeedVideoFpsRanges = bigInteger;
    }

    private OriginatorId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, byte[] bArr) {
        this.getHighSpeedVideoSizes = x500Name;
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public OriginatorId(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.cms.OriginatorId)) {
            return false;
        }
        org.bouncycastle.cms.OriginatorId originatorId = (org.bouncycastle.cms.OriginatorId) obj;
        if (org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, originatorId.getHighResolutionOutputSizeshNQ4ISI)) {
            java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRanges;
            java.math.BigInteger bigInteger2 = originatorId.getHighSpeedVideoFpsRanges;
            if (bigInteger == null ? bigInteger2 == null : bigInteger.equals(bigInteger2)) {
                org.bouncycastle.asn1.x500.X500Name x500Name = this.getHighSpeedVideoSizes;
                org.bouncycastle.asn1.x500.X500Name x500Name2 = originatorId.getHighSpeedVideoSizes;
                if (x500Name != null) {
                    if (x500Name.equals(x500Name2)) {
                        return true;
                    }
                } else if (x500Name2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRanges;
        if (bigInteger != null) {
            hashCode ^= bigInteger.hashCode();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = this.getHighSpeedVideoSizes;
        return x500Name != null ? hashCode ^ x500Name.hashCode() : hashCode;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cms.OriginatorId(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
