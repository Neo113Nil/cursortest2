package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class XMSSMTPrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI >= 0 ? new org.bouncycastle.asn1.ASN1Integer(1L) : new org.bouncycastle.asn1.ASN1Integer(0L));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getOutputFormats));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getInputSizeshNQ4ISI));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes));
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        if (this.getHighResolutionOutputSizeshNQ4ISI >= 0) {
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI)));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap)));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public byte[] getSecretKeySeed() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputFormats);
    }

    public byte[] getSecretKeyPRF() {
        return org.bouncycastle.util.Arrays.clone(this.getInputSizeshNQ4ISI);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public long getMaxIndex() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public long getIndex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getBdsState() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public static org.bouncycastle.pqc.asn1.XMSSMTPrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.XMSSMTPrivateKey) {
            return (org.bouncycastle.pqc.asn1.XMSSMTPrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.XMSSMTPrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private XMSSMTPrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        long j;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (!aSN1Integer.hasValue(0) && !aSN1Integer.hasValue(1)) {
            throw new java.lang.IllegalArgumentException("unknown version of sequence");
        }
        this.getHighSpeedVideoSizesFor = aSN1Integer.intValueExact();
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("key sequence wrong size");
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).longValueExact();
        this.getOutputFormats = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(1)).getOctets());
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(2)).getOctets());
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(3)).getOctets());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence2.getObjectAt(4)).getOctets());
        if (aSN1Sequence2.size() == 6) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence2.getObjectAt(5));
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new java.lang.IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).longValueExact();
        } else {
            if (aSN1Sequence2.size() != 5) {
                throw new java.lang.IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            j = -1;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        if (aSN1Sequence.size() == 3) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)), true).getOctets());
        } else {
            this.Camera2StreamConfigurationMap = null;
        }
    }

    public XMSSMTPrivateKey(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getOutputFormats = org.bouncycastle.util.Arrays.clone(bArr);
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr3);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr4);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr5);
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
    }

    public XMSSMTPrivateKey(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.getHighSpeedVideoSizesFor = 0;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getOutputFormats = org.bouncycastle.util.Arrays.clone(bArr);
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr3);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr4);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr5);
        this.getHighResolutionOutputSizeshNQ4ISI = -1L;
    }
}
