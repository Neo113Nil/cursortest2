package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class GMSSPrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap;

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr, org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr2, java.util.Vector[] vectorArr, java.util.Vector[] vectorArr2, java.util.Vector[][] vectorArr3, java.util.Vector[][] vectorArr4, byte[][][] bArr5, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr2, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] gMSSRootSigArr, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier[] algorithmIdentifierArr = {algorithmIdentifier};
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i : iArr) {
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(i));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVector3.add(new org.bouncycastle.asn1.DEROctetString(bArr8));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector4 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVector4.add(new org.bouncycastle.asn1.DEROctetString(bArr9));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector4));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector5 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector6 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i2 = 0; i2 < bArr3.length; i2++) {
            for (int i3 = 0; i3 < bArr3[i2].length; i3++) {
                aSN1EncodableVector5.add(new org.bouncycastle.asn1.DEROctetString(bArr3[i2][i3]));
            }
            aSN1EncodableVector6.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector5));
            aSN1EncodableVector5 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector6));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector7 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector8 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i4 = 0; i4 < bArr4.length; i4++) {
            for (int i5 = 0; i5 < bArr4[i4].length; i5++) {
                aSN1EncodableVector7.add(new org.bouncycastle.asn1.DEROctetString(bArr4[i4][i5]));
            }
            aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector7));
            aSN1EncodableVector7 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector8));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector9 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector10 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector11 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector12 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector13 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i6 = 0; i6 < treehashArr.length; i6++) {
            for (int i7 = 0; i7 < treehashArr[i6].length; i7++) {
                aSN1EncodableVector11.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
                int i8 = treehashArr[i6][i7].getStatInt()[1];
                aSN1EncodableVector12.add(new org.bouncycastle.asn1.DEROctetString(treehashArr[i6][i7].getStatByte()[0]));
                aSN1EncodableVector12.add(new org.bouncycastle.asn1.DEROctetString(treehashArr[i6][i7].getStatByte()[1]));
                aSN1EncodableVector12.add(new org.bouncycastle.asn1.DEROctetString(treehashArr[i6][i7].getStatByte()[2]));
                for (int i9 = 0; i9 < i8; i9++) {
                    aSN1EncodableVector12.add(new org.bouncycastle.asn1.DEROctetString(treehashArr[i6][i7].getStatByte()[i9 + 3]));
                }
                aSN1EncodableVector11.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector12));
                aSN1EncodableVector12 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr[i6][i7].getStatInt()[0]));
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(i8));
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr[i6][i7].getStatInt()[2]));
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr[i6][i7].getStatInt()[3]));
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr[i6][i7].getStatInt()[4]));
                aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr[i6][i7].getStatInt()[5]));
                int i10 = 0;
                while (i10 < i8) {
                    aSN1EncodableVector13.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr[i6][i7].getStatInt()[i10 + 6]));
                    i10++;
                    i8 = i8;
                }
                aSN1EncodableVector11.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector13));
                aSN1EncodableVector13 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector10.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector11));
                aSN1EncodableVector11 = new org.bouncycastle.asn1.ASN1EncodableVector();
            }
            aSN1EncodableVector9.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector10));
            aSN1EncodableVector10 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector9));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector14 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector15 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector16 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector17 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector18 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i11 = 0; i11 < treehashArr2.length; i11++) {
            for (int i12 = 0; i12 < treehashArr2[i11].length; i12++) {
                aSN1EncodableVector16.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
                int i13 = treehashArr2[i11][i12].getStatInt()[1];
                aSN1EncodableVector17.add(new org.bouncycastle.asn1.DEROctetString(treehashArr2[i11][i12].getStatByte()[0]));
                aSN1EncodableVector17.add(new org.bouncycastle.asn1.DEROctetString(treehashArr2[i11][i12].getStatByte()[1]));
                aSN1EncodableVector17.add(new org.bouncycastle.asn1.DEROctetString(treehashArr2[i11][i12].getStatByte()[2]));
                for (int i14 = 0; i14 < i13; i14++) {
                    aSN1EncodableVector17.add(new org.bouncycastle.asn1.DEROctetString(treehashArr2[i11][i12].getStatByte()[i14 + 3]));
                }
                aSN1EncodableVector16.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector17));
                aSN1EncodableVector17 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr2[i11][i12].getStatInt()[0]));
                aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(i13));
                aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr2[i11][i12].getStatInt()[2]));
                aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr2[i11][i12].getStatInt()[3]));
                aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr2[i11][i12].getStatInt()[4]));
                aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr2[i11][i12].getStatInt()[5]));
                for (int i15 = 0; i15 < i13; i15++) {
                    aSN1EncodableVector18.add(new org.bouncycastle.asn1.ASN1Integer(treehashArr2[i11][i12].getStatInt()[i15 + 6]));
                }
                aSN1EncodableVector16.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector18));
                aSN1EncodableVector18 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector15.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector16));
                aSN1EncodableVector16 = new org.bouncycastle.asn1.ASN1EncodableVector();
            }
            aSN1EncodableVector14.add(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector15)));
            aSN1EncodableVector15 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector14));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector19 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector20 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i16 = 0; i16 < bArr5.length; i16++) {
            for (int i17 = 0; i17 < bArr5[i16].length; i17++) {
                aSN1EncodableVector19.add(new org.bouncycastle.asn1.DEROctetString(bArr5[i16][i17]));
            }
            aSN1EncodableVector20.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector19));
            aSN1EncodableVector19 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector20));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector21 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector22 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i18 = 0; i18 < vectorArr.length; i18++) {
            for (int i19 = 0; i19 < vectorArr[i18].size(); i19++) {
                aSN1EncodableVector21.add(new org.bouncycastle.asn1.DEROctetString((byte[]) vectorArr[i18].elementAt(i19)));
            }
            aSN1EncodableVector22.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector22));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector23 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector24 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i20 = 0; i20 < vectorArr2.length; i20++) {
            for (int i21 = 0; i21 < vectorArr2[i20].size(); i21++) {
                aSN1EncodableVector23.add(new org.bouncycastle.asn1.DEROctetString((byte[]) vectorArr2[i20].elementAt(i21)));
            }
            aSN1EncodableVector24.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector23));
            aSN1EncodableVector23 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector24));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector25 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector26 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector27 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i22 = 0; i22 < vectorArr3.length; i22++) {
            for (int i23 = 0; i23 < vectorArr3[i22].length; i23++) {
                for (int i24 = 0; i24 < vectorArr3[i22][i23].size(); i24++) {
                    aSN1EncodableVector25.add(new org.bouncycastle.asn1.DEROctetString((byte[]) vectorArr3[i22][i23].elementAt(i24)));
                }
                aSN1EncodableVector26.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector25));
                aSN1EncodableVector25 = new org.bouncycastle.asn1.ASN1EncodableVector();
            }
            aSN1EncodableVector27.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector26));
            aSN1EncodableVector26 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector27));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector28 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector29 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector30 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i25 = 0; i25 < vectorArr4.length; i25++) {
            for (int i26 = 0; i26 < vectorArr4[i25].length; i26++) {
                for (int i27 = 0; i27 < vectorArr4[i25][i26].size(); i27++) {
                    aSN1EncodableVector28.add(new org.bouncycastle.asn1.DEROctetString((byte[]) vectorArr4[i25][i26].elementAt(i27)));
                }
                aSN1EncodableVector29.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector28));
                aSN1EncodableVector28 = new org.bouncycastle.asn1.ASN1EncodableVector();
            }
            aSN1EncodableVector30.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector29));
            aSN1EncodableVector29 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector30));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector31 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector32 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector33 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector34 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i28 = 0; i28 < gMSSLeafArr.length; i28++) {
            aSN1EncodableVector32.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i28].getStatByte();
            aSN1EncodableVector33.add(new org.bouncycastle.asn1.DEROctetString(statByte[0]));
            aSN1EncodableVector33.add(new org.bouncycastle.asn1.DEROctetString(statByte[1]));
            aSN1EncodableVector33.add(new org.bouncycastle.asn1.DEROctetString(statByte[2]));
            aSN1EncodableVector33.add(new org.bouncycastle.asn1.DEROctetString(statByte[3]));
            aSN1EncodableVector32.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector33));
            aSN1EncodableVector33 = new org.bouncycastle.asn1.ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i28].getStatInt();
            aSN1EncodableVector34.add(new org.bouncycastle.asn1.ASN1Integer(statInt[0]));
            aSN1EncodableVector34.add(new org.bouncycastle.asn1.ASN1Integer(statInt[1]));
            aSN1EncodableVector34.add(new org.bouncycastle.asn1.ASN1Integer(statInt[2]));
            aSN1EncodableVector34.add(new org.bouncycastle.asn1.ASN1Integer(statInt[3]));
            aSN1EncodableVector32.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector34));
            aSN1EncodableVector34 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector31.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector32));
            aSN1EncodableVector32 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector31));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector35 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector36 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector37 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector38 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i29 = 0; i29 < gMSSLeafArr2.length; i29++) {
            aSN1EncodableVector36.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i29].getStatByte();
            aSN1EncodableVector37.add(new org.bouncycastle.asn1.DEROctetString(statByte2[0]));
            aSN1EncodableVector37.add(new org.bouncycastle.asn1.DEROctetString(statByte2[1]));
            aSN1EncodableVector37.add(new org.bouncycastle.asn1.DEROctetString(statByte2[2]));
            aSN1EncodableVector37.add(new org.bouncycastle.asn1.DEROctetString(statByte2[3]));
            aSN1EncodableVector36.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector37));
            aSN1EncodableVector37 = new org.bouncycastle.asn1.ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i29].getStatInt();
            aSN1EncodableVector38.add(new org.bouncycastle.asn1.ASN1Integer(statInt2[0]));
            aSN1EncodableVector38.add(new org.bouncycastle.asn1.ASN1Integer(statInt2[1]));
            aSN1EncodableVector38.add(new org.bouncycastle.asn1.ASN1Integer(statInt2[2]));
            aSN1EncodableVector38.add(new org.bouncycastle.asn1.ASN1Integer(statInt2[3]));
            aSN1EncodableVector36.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector38));
            aSN1EncodableVector38 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector35.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector36));
            aSN1EncodableVector36 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector35));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector39 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector40 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector41 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector42 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i30 = 0; i30 < gMSSLeafArr3.length; i30++) {
            aSN1EncodableVector40.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i30].getStatByte();
            aSN1EncodableVector41.add(new org.bouncycastle.asn1.DEROctetString(statByte3[0]));
            aSN1EncodableVector41.add(new org.bouncycastle.asn1.DEROctetString(statByte3[1]));
            aSN1EncodableVector41.add(new org.bouncycastle.asn1.DEROctetString(statByte3[2]));
            aSN1EncodableVector41.add(new org.bouncycastle.asn1.DEROctetString(statByte3[3]));
            aSN1EncodableVector40.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector41));
            aSN1EncodableVector41 = new org.bouncycastle.asn1.ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i30].getStatInt();
            aSN1EncodableVector42.add(new org.bouncycastle.asn1.ASN1Integer(statInt3[0]));
            aSN1EncodableVector42.add(new org.bouncycastle.asn1.ASN1Integer(statInt3[1]));
            aSN1EncodableVector42.add(new org.bouncycastle.asn1.ASN1Integer(statInt3[2]));
            aSN1EncodableVector42.add(new org.bouncycastle.asn1.ASN1Integer(statInt3[3]));
            aSN1EncodableVector40.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector39.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector40));
            aSN1EncodableVector40 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector39));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector43 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i31 : iArr2) {
            aSN1EncodableVector43.add(new org.bouncycastle.asn1.ASN1Integer(i31));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector43));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector44 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (byte[] bArr10 : bArr6) {
            aSN1EncodableVector44.add(new org.bouncycastle.asn1.DEROctetString(bArr10));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector44));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector45 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector46 = new org.bouncycastle.asn1.ASN1EncodableVector();
        new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector47 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector48 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector49 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector50 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] gMSSRootCalcArr2 = gMSSRootCalcArr;
        int i32 = 0;
        while (i32 < gMSSRootCalcArr2.length) {
            aSN1EncodableVector46.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
            new org.bouncycastle.asn1.ASN1EncodableVector();
            int i33 = gMSSRootCalcArr2[i32].getStatInt()[0];
            int i34 = gMSSRootCalcArr2[i32].getStatInt()[7];
            aSN1EncodableVector47.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getStatByte()[0]));
            int i35 = 0;
            while (i35 < i33) {
                i35++;
                aSN1EncodableVector47.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getStatByte()[i35]));
            }
            for (int i36 = 0; i36 < i34; i36++) {
                aSN1EncodableVector47.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getStatByte()[i33 + 1 + i36]));
            }
            aSN1EncodableVector46.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector47));
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector51 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(i33));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[1]));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[2]));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[3]));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[4]));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[5]));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[6]));
            aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(i34));
            for (int i37 = 0; i37 < i33; i37++) {
                aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[i37 + 8]));
            }
            for (int i38 = 0; i38 < i34; i38++) {
                aSN1EncodableVector48.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getStatInt()[i33 + 8 + i38]));
            }
            aSN1EncodableVector46.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector48));
            aSN1EncodableVector48 = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector52 = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector53 = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector54 = new org.bouncycastle.asn1.ASN1EncodableVector();
            if (gMSSRootCalcArr2[i32].getTreehash() != null) {
                int i39 = 0;
                while (i39 < gMSSRootCalcArr2[i32].getTreehash().length) {
                    aSN1EncodableVector52.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
                    int i40 = gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[1];
                    aSN1EncodableVector53.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatByte()[0]));
                    aSN1EncodableVector53.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatByte()[1]));
                    aSN1EncodableVector53.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatByte()[2]));
                    int i41 = 0;
                    while (i41 < i40) {
                        aSN1EncodableVector53.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatByte()[i41 + 3]));
                        i41++;
                        aSN1EncodableVector51 = aSN1EncodableVector51;
                    }
                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector55 = aSN1EncodableVector51;
                    aSN1EncodableVector52.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector53));
                    aSN1EncodableVector53 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[0]));
                    aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(i40));
                    aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[2]));
                    aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[3]));
                    aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[4]));
                    aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[5]));
                    int i42 = 0;
                    while (i42 < i40) {
                        aSN1EncodableVector54.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootCalcArr2[i32].getTreehash()[i39].getStatInt()[i42 + 6]));
                        i42++;
                        gMSSRootCalcArr2 = gMSSRootCalcArr;
                        aSN1EncodableVector50 = aSN1EncodableVector50;
                    }
                    aSN1EncodableVector52.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector54));
                    aSN1EncodableVector54 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    aSN1EncodableVector49.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector52));
                    aSN1EncodableVector52 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    i39++;
                    aSN1EncodableVector51 = aSN1EncodableVector55;
                    gMSSRootCalcArr2 = gMSSRootCalcArr;
                }
            }
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector56 = aSN1EncodableVector51;
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector57 = aSN1EncodableVector50;
            aSN1EncodableVector46.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector49));
            aSN1EncodableVector49 = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector58 = new org.bouncycastle.asn1.ASN1EncodableVector();
            if (gMSSRootCalcArr[i32].getRetain() != null) {
                int i43 = 0;
                while (i43 < gMSSRootCalcArr[i32].getRetain().length) {
                    for (int i44 = 0; i44 < gMSSRootCalcArr[i32].getRetain()[i43].size(); i44++) {
                        aSN1EncodableVector58.add(new org.bouncycastle.asn1.DEROctetString((byte[]) gMSSRootCalcArr[i32].getRetain()[i43].elementAt(i44)));
                    }
                    aSN1EncodableVector57.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector58));
                    i43++;
                    aSN1EncodableVector58 = new org.bouncycastle.asn1.ASN1EncodableVector();
                }
            }
            aSN1EncodableVector46.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector57));
            aSN1EncodableVector50 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector45.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector46));
            aSN1EncodableVector46 = new org.bouncycastle.asn1.ASN1EncodableVector();
            i32++;
            aSN1EncodableVector47 = aSN1EncodableVector56;
            gMSSRootCalcArr2 = gMSSRootCalcArr;
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector45));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector59 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (byte[] bArr11 : bArr7) {
            aSN1EncodableVector59.add(new org.bouncycastle.asn1.DEROctetString(bArr11));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector59));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector60 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector61 = new org.bouncycastle.asn1.ASN1EncodableVector();
        new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector62 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector63 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i45 = 0; i45 < gMSSRootSigArr.length; i45++) {
            aSN1EncodableVector61.add(new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr[0]));
            new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector62.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootSigArr[i45].getStatByte()[0]));
            aSN1EncodableVector62.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootSigArr[i45].getStatByte()[1]));
            aSN1EncodableVector62.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootSigArr[i45].getStatByte()[2]));
            aSN1EncodableVector62.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootSigArr[i45].getStatByte()[3]));
            aSN1EncodableVector62.add(new org.bouncycastle.asn1.DEROctetString(gMSSRootSigArr[i45].getStatByte()[4]));
            aSN1EncodableVector61.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector62));
            aSN1EncodableVector62 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[0]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[1]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[2]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[3]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[4]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[5]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[6]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[7]));
            aSN1EncodableVector63.add(new org.bouncycastle.asn1.ASN1Integer(gMSSRootSigArr[i45].getStatInt()[8]));
            aSN1EncodableVector61.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector63));
            aSN1EncodableVector63 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector60.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector61));
            aSN1EncodableVector61 = new org.bouncycastle.asn1.ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector60));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector64 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector65 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector66 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector67 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i46 = 0; i46 < gMSSParameters.getHeightOfTrees().length; i46++) {
            aSN1EncodableVector65.add(new org.bouncycastle.asn1.ASN1Integer(gMSSParameters.getHeightOfTrees()[i46]));
            aSN1EncodableVector66.add(new org.bouncycastle.asn1.ASN1Integer(gMSSParameters.getWinternitzParameter()[i46]));
            aSN1EncodableVector67.add(new org.bouncycastle.asn1.ASN1Integer(gMSSParameters.getK()[i46]));
        }
        aSN1EncodableVector64.add(new org.bouncycastle.asn1.ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVector64.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector65));
        aSN1EncodableVector64.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector66));
        aSN1EncodableVector64.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector67));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector64));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector68 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector68.add(algorithmIdentifierArr[0]);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector68));
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }
}
