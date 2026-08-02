package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class XMSSPrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private final int Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap >= 0 ? new org.bouncycastle.asn1.ASN1Integer(1L) : new org.bouncycastle.asn1.ASN1Integer(0L));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getInputSizeshNQ4ISI));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getOutputMinFrameDuration));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        if (this.Camera2StreamConfigurationMap >= 0) {
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap)));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes)));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getInputFormats;
    }

    public byte[] getSecretKeySeed() {
        return org.bouncycastle.util.Arrays.clone(this.getInputSizeshNQ4ISI);
    }

    public byte[] getSecretKeyPRF() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputMinFrameDuration);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public int getMaxIndex() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getIndex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getBdsState() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.pqc.asn1.XMSSPrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.XMSSPrivateKey) {
            return (org.bouncycastle.pqc.asn1.XMSSPrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.XMSSPrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private XMSSPrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (!aSN1Integer.hasValue(0) && !aSN1Integer.hasValue(1)) {
            throw new java.lang.IllegalArgumentException("unknown version of sequence");
        }
        this.getInputFormats = aSN1Integer.intValueExact();
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("key sequence wrong size");
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intValueExact();
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(1)).getOctets());
        this.getOutputMinFrameDuration = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(2)).getOctets());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(3)).getOctets());
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(4)).getOctets());
        if (aSN1Sequence2.size() == 6) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence2.getObjectAt(5));
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new java.lang.IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
        } else {
            if (aSN1Sequence2.size() != 5) {
                throw new java.lang.IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            i = -1;
        }
        this.Camera2StreamConfigurationMap = i;
        if (aSN1Sequence.size() == 3) {
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)), true).getOctets());
        } else {
            this.getHighSpeedVideoSizes = null;
        }
    }

    public XMSSPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.getInputFormats = 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.getOutputMinFrameDuration = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr3);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr4);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr5);
        this.Camera2StreamConfigurationMap = i2;
    }

    public XMSSPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.getInputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.getOutputMinFrameDuration = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr3);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr4);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr5);
        this.Camera2StreamConfigurationMap = -1;
    }
}
