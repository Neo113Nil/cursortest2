package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class HashedId extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges);
    }

    public static class HashedId10 extends org.bouncycastle.oer.its.HashedId {
        public HashedId10(byte[] bArr) {
            super(bArr);
            if (bArr.length != 10) {
                throw new java.lang.IllegalArgumentException("hash id not 10 bytes");
            }
        }
    }

    public static class HashedId3 extends org.bouncycastle.oer.its.HashedId {
        public HashedId3(byte[] bArr) {
            super(bArr);
            if (bArr.length != 3) {
                throw new java.lang.IllegalArgumentException("hash id not 3 bytes");
            }
        }
    }

    public static class HashedId32 extends org.bouncycastle.oer.its.HashedId {
        public HashedId32(byte[] bArr) {
            super(bArr);
            if (bArr.length != 32) {
                throw new java.lang.IllegalArgumentException("hash id not 32 bytes");
            }
        }
    }

    public static class HashedId8 extends org.bouncycastle.oer.its.HashedId {
        public HashedId8(byte[] bArr) {
            super(bArr);
            if (bArr.length != 8) {
                throw new java.lang.IllegalArgumentException("hash id not 8 bytes");
            }
        }
    }

    public static org.bouncycastle.oer.its.HashedId getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.HashedId) {
            return (org.bouncycastle.oer.its.HashedId) obj;
        }
        byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(obj).getOctets();
        int length = octets.length;
        if (length == 3) {
            return new org.bouncycastle.oer.its.HashedId.HashedId3(octets);
        }
        if (length == 8) {
            return new org.bouncycastle.oer.its.HashedId.HashedId8(octets);
        }
        if (length == 10) {
            return new org.bouncycastle.oer.its.HashedId.HashedId10(octets);
        }
        if (length == 32) {
            return new org.bouncycastle.oer.its.HashedId.HashedId32(octets);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("hash id of unsupported length, length was: ");
        sb.append(octets.length);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    protected HashedId(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
