package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class DEROtherInfo {
    private final org.bouncycastle.asn1.DERSequence getHighResolutionOutputSizeshNQ4ISI;

    public static final class Builder {
        private org.bouncycastle.asn1.ASN1TaggedObject Camera2StreamConfigurationMap;
        private final org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoFpsRanges;
        private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
        private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

        public final org.bouncycastle.crypto.util.DEROtherInfo.Builder withSuppPubInfo(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr));
            return this;
        }

        public final org.bouncycastle.crypto.util.DEROtherInfo.Builder withSuppPrivInfo(byte[] bArr) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr));
            return this;
        }

        public final org.bouncycastle.crypto.util.DEROtherInfo build() {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
            aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = this.getHighSpeedVideoFpsRanges;
            if (aSN1TaggedObject != null) {
                aSN1EncodableVector.add(aSN1TaggedObject);
            }
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject2 = this.Camera2StreamConfigurationMap;
            if (aSN1TaggedObject2 != null) {
                aSN1EncodableVector.add(aSN1TaggedObject2);
            }
            return new org.bouncycastle.crypto.util.DEROtherInfo(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector), (byte) 0);
        }

        public Builder(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
            this.getHighSpeedVideoSizes = algorithmIdentifier;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr);
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr2);
        }
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    /* synthetic */ DEROtherInfo(org.bouncycastle.asn1.DERSequence dERSequence, byte b) {
        this(dERSequence);
    }

    private DEROtherInfo(org.bouncycastle.asn1.DERSequence dERSequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = dERSequence;
    }
}
