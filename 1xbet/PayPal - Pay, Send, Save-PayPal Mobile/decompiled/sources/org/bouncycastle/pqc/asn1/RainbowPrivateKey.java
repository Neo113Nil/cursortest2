package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class RainbowPrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.pqc.crypto.rainbow.Layer[] Camera2StreamConfigurationMap;
    private byte[][] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[][] getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats;
    private byte[] getOutputFormats;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getInputFormats;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.getOutputMinFrameDuration;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i < this.getHighSpeedVideoSizes.length; i++) {
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes[i]));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector3.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector4 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.length; i2++) {
            aSN1EncodableVector4.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI[i2]));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector4));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector5 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector5.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector5));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector6 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector6.add(new org.bouncycastle.asn1.DEROctetString(this.getOutputFormats));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector6));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector7 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i3 = 0; i3 < this.Camera2StreamConfigurationMap.length; i3++) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector8 = new org.bouncycastle.asn1.ASN1EncodableVector();
            byte[][][] convertArray = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.Camera2StreamConfigurationMap[i3].getCoeffAlpha());
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector9 = new org.bouncycastle.asn1.ASN1EncodableVector();
            for (int i4 = 0; i4 < convertArray.length; i4++) {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector10 = new org.bouncycastle.asn1.ASN1EncodableVector();
                for (int i5 = 0; i5 < convertArray[i4].length; i5++) {
                    aSN1EncodableVector10.add(new org.bouncycastle.asn1.DEROctetString(convertArray[i4][i5]));
                }
                aSN1EncodableVector9.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector10));
            }
            aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector9));
            byte[][][] convertArray2 = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.Camera2StreamConfigurationMap[i3].getCoeffBeta());
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector11 = new org.bouncycastle.asn1.ASN1EncodableVector();
            for (int i6 = 0; i6 < convertArray2.length; i6++) {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector12 = new org.bouncycastle.asn1.ASN1EncodableVector();
                for (int i7 = 0; i7 < convertArray2[i6].length; i7++) {
                    aSN1EncodableVector12.add(new org.bouncycastle.asn1.DEROctetString(convertArray2[i6][i7]));
                }
                aSN1EncodableVector11.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector12));
            }
            aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector11));
            byte[][] convertArray3 = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.Camera2StreamConfigurationMap[i3].getCoeffGamma());
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector13 = new org.bouncycastle.asn1.ASN1EncodableVector();
            for (byte[] bArr : convertArray3) {
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.DEROctetString(bArr));
            }
            aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector13));
            aSN1EncodableVector8.add(new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.Camera2StreamConfigurationMap[i3].getCoeffEta())));
            aSN1EncodableVector7.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector8));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector7));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int[] getVi() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArraytoInt(this.getOutputFormats);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getInputFormats;
    }

    public org.bouncycastle.pqc.crypto.rainbow.Layer[] getLayers() {
        return this.Camera2StreamConfigurationMap;
    }

    public short[][] getInvA2() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public short[][] getInvA1() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighSpeedVideoSizes);
    }

    public short[] getB2() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighSpeedVideoFpsRangesFor);
    }

    public short[] getB1() {
        return org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.pqc.asn1.RainbowPrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.RainbowPrivateKey) {
            return (org.bouncycastle.pqc.asn1.RainbowPrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.RainbowPrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.pqc.crypto.rainbow.Layer[] layerArr) {
        this.getInputFormats = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr2);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr3);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(sArr4);
        this.getOutputFormats = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertIntArray(iArr);
        this.Camera2StreamConfigurationMap = layerArr;
    }

    private RainbowPrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getInputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.getOutputMinFrameDuration = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(1);
        this.getHighSpeedVideoSizes = new byte[aSN1Sequence2.size()][];
        for (int i2 = 0; i2 < aSN1Sequence2.size(); i2++) {
            this.getHighSpeedVideoSizes[i2] = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence2.getObjectAt(i2)).getOctets();
        }
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1OctetString) ((org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(2)).getObjectAt(0)).getOctets();
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[aSN1Sequence3.size()][];
        for (int i3 = 0; i3 < aSN1Sequence3.size(); i3++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i3] = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence3.getObjectAt(i3)).getOctets();
        }
        this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.asn1.ASN1OctetString) ((org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        this.getOutputFormats = ((org.bouncycastle.asn1.ASN1OctetString) ((org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(5)).getObjectAt(0)).getOctets();
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(6);
        byte[][][][] bArr = new byte[aSN1Sequence4.size()][][][];
        byte[][][][] bArr2 = new byte[aSN1Sequence4.size()][][][];
        byte[][][] bArr3 = new byte[aSN1Sequence4.size()][][];
        byte[][] bArr4 = new byte[aSN1Sequence4.size()][];
        int i4 = 0;
        while (i4 < aSN1Sequence4.size()) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence5 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence4.getObjectAt(i4);
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence6 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence5.getObjectAt(i);
            bArr[i4] = new byte[aSN1Sequence6.size()][][];
            for (int i5 = i; i5 < aSN1Sequence6.size(); i5++) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence7 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence6.getObjectAt(i5);
                bArr[i4][i5] = new byte[aSN1Sequence7.size()][];
                for (int i6 = 0; i6 < aSN1Sequence7.size(); i6++) {
                    bArr[i4][i5][i6] = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence7.getObjectAt(i6)).getOctets();
                }
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence8 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence5.getObjectAt(1);
            bArr2[i4] = new byte[aSN1Sequence8.size()][][];
            for (int i7 = 0; i7 < aSN1Sequence8.size(); i7++) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence9 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence8.getObjectAt(i7);
                bArr2[i4][i7] = new byte[aSN1Sequence9.size()][];
                for (int i8 = 0; i8 < aSN1Sequence9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence9.getObjectAt(i8)).getOctets();
                }
            }
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence10 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence5.getObjectAt(2);
            bArr3[i4] = new byte[aSN1Sequence10.size()][];
            for (int i9 = 0; i9 < aSN1Sequence10.size(); i9++) {
                bArr3[i4][i9] = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence10.getObjectAt(i9)).getOctets();
            }
            bArr4[i4] = ((org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence5.getObjectAt(3)).getOctets();
            i4++;
            i = 0;
        }
        int length = this.getOutputFormats.length - 1;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.rainbow.Layer[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.getOutputFormats;
            int i11 = i10 + 1;
            this.Camera2StreamConfigurationMap[i10] = new org.bouncycastle.pqc.crypto.rainbow.Layer(bArr5[i10], bArr5[i11], org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(bArr[i10]), org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(bArr2[i10]), org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(bArr3[i10]), org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.convertArray(bArr4[i10]));
            i10 = i11;
        }
    }
}
