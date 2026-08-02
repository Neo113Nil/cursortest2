package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1StreamParser {
    private final int Camera2StreamConfigurationMap;
    private final byte[][] getHighResolutionOutputSizeshNQ4ISI;
    final java.io.InputStream getHighSpeedVideoFpsRanges;

    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
        java.io.InputStream inputStream = this.getHighSpeedVideoFpsRanges;
        if (inputStream instanceof org.bouncycastle.asn1.IndefiniteLengthInputStream) {
            ((org.bouncycastle.asn1.IndefiniteLengthInputStream) inputStream).getHighSpeedVideoFpsRanges(false);
        }
        int highResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1InputStream.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, i);
        int highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.asn1.ASN1InputStream.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, highResolutionOutputSizeshNQ4ISI == 3 || highResolutionOutputSizeshNQ4ISI == 4 || highResolutionOutputSizeshNQ4ISI == 16 || highResolutionOutputSizeshNQ4ISI == 17 || highResolutionOutputSizeshNQ4ISI == 8);
        if (highResolutionOutputSizeshNQ4ISI2 < 0) {
            if ((i & 32) == 0) {
                throw new java.io.IOException("indefinite-length primitive encoding encountered");
            }
            org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser = new org.bouncycastle.asn1.ASN1StreamParser(new org.bouncycastle.asn1.IndefiniteLengthInputStream(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap), this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
            int i2 = i & 192;
            return i2 != 0 ? 64 == i2 ? new org.bouncycastle.asn1.BERApplicationSpecificParser(highResolutionOutputSizeshNQ4ISI, aSN1StreamParser) : new org.bouncycastle.asn1.BERTaggedObjectParser(i2, highResolutionOutputSizeshNQ4ISI, aSN1StreamParser) : aSN1StreamParser.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
        }
        org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream = new org.bouncycastle.asn1.DefiniteLengthInputStream(this.getHighSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI2, this.Camera2StreamConfigurationMap);
        if ((i & 224) == 0) {
            return getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, definiteLengthInputStream);
        }
        org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser2 = new org.bouncycastle.asn1.ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        int i3 = i & 192;
        if (i3 == 0) {
            return aSN1StreamParser2.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
        }
        boolean z = (i & 32) != 0;
        if (64 == i3) {
            return (org.bouncycastle.asn1.DLApplicationSpecific) (!z ? org.bouncycastle.asn1.ASN1TaggedObject.getHighResolutionOutputSizeshNQ4ISI(i3, highResolutionOutputSizeshNQ4ISI, ((org.bouncycastle.asn1.DefiniteLengthInputStream) aSN1StreamParser2.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges()) : org.bouncycastle.asn1.ASN1TaggedObject.Camera2StreamConfigurationMap(i3, highResolutionOutputSizeshNQ4ISI, aSN1StreamParser2.getHighResolutionOutputSizeshNQ4ISI()));
        }
        return new org.bouncycastle.asn1.DLTaggedObjectParser(i3, highResolutionOutputSizeshNQ4ISI, z, aSN1StreamParser2);
    }

    final org.bouncycastle.asn1.ASN1EncodableVector getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        int read = this.getHighSpeedVideoFpsRanges.read();
        if (read < 0) {
            return new org.bouncycastle.asn1.ASN1EncodableVector(0);
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        do {
            org.bouncycastle.asn1.ASN1Encodable highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(read);
            aSN1EncodableVector.add(highSpeedVideoFpsRanges instanceof org.bouncycastle.asn1.InMemoryRepresentable ? ((org.bouncycastle.asn1.InMemoryRepresentable) highSpeedVideoFpsRanges).getLoadedObject() : highSpeedVideoFpsRanges.toASN1Primitive());
            read = this.getHighSpeedVideoFpsRanges.read();
        } while (read >= 0);
        return aSN1EncodableVector;
    }

    public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
        int read = this.getHighSpeedVideoFpsRanges.read();
        if (read < 0) {
            return null;
        }
        return getHighSpeedVideoFpsRanges(read);
    }

    final org.bouncycastle.asn1.ASN1TaggedObjectParser getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        int read = this.getHighSpeedVideoFpsRanges.read();
        if (read < 0) {
            return null;
        }
        if ((read & 192) != 0) {
            return (org.bouncycastle.asn1.ASN1TaggedObjectParser) getHighSpeedVideoFpsRanges(read);
        }
        throw new org.bouncycastle.asn1.ASN1Exception("no tagged object found");
    }

    final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI(int i) throws java.io.IOException {
        if (i < 0 || i > 30) {
            throw new java.lang.IllegalArgumentException("invalid universal tag number: ".concat(java.lang.String.valueOf(i)));
        }
        int read = this.getHighSpeedVideoFpsRanges.read();
        if (read < 0) {
            return null;
        }
        if ((read & (-33)) == i) {
            return getHighSpeedVideoFpsRanges(read);
        }
        throw new java.io.IOException("unexpected identifier encountered: ".concat(java.lang.String.valueOf(read)));
    }

    final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor(int i, org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream) throws java.io.IOException {
        if (i == 3) {
            return new org.bouncycastle.asn1.DLBitStringParser(definiteLengthInputStream);
        }
        if (i == 4) {
            return new org.bouncycastle.asn1.DEROctetStringParser(definiteLengthInputStream);
        }
        if (i == 8) {
            throw new org.bouncycastle.asn1.ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i == 16) {
            throw new org.bouncycastle.asn1.ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i == 17) {
            throw new org.bouncycastle.asn1.ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return org.bouncycastle.asn1.ASN1InputStream.getHighSpeedVideoFpsRangesFor(i, definiteLengthInputStream, this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.asn1.ASN1Exception("corrupted stream detected", e);
        }
    }

    final org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap(int i) throws java.io.IOException {
        if (i == 3) {
            return new org.bouncycastle.asn1.BERBitStringParser(this);
        }
        if (i == 4) {
            return new org.bouncycastle.asn1.BEROctetStringParser(this);
        }
        if (i == 8) {
            return new org.bouncycastle.asn1.DERExternalParser(this);
        }
        if (i == 16) {
            return new org.bouncycastle.asn1.BERSequenceParser(this);
        }
        if (i == 17) {
            return new org.bouncycastle.asn1.BERSetParser(this);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown BER object encountered: 0x");
        sb.append(java.lang.Integer.toHexString(i));
        throw new org.bouncycastle.asn1.ASN1Exception(sb.toString());
    }

    final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor(int i) throws java.io.IOException {
        if (i == 3) {
            return new org.bouncycastle.asn1.BERBitStringParser(this);
        }
        if (i == 4) {
            return new org.bouncycastle.asn1.BEROctetStringParser(this);
        }
        if (i == 8) {
            return new org.bouncycastle.asn1.DERExternalParser(this);
        }
        if (i == 16) {
            return new org.bouncycastle.asn1.DLSequenceParser(this);
        }
        if (i == 17) {
            return new org.bouncycastle.asn1.DLSetParser(this);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown DL object encountered: 0x");
        sb.append(java.lang.Integer.toHexString(i));
        throw new org.bouncycastle.asn1.ASN1Exception(sb.toString());
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length);
    }

    ASN1StreamParser(java.io.InputStream inputStream, int i, byte[][] bArr) {
        this.getHighSpeedVideoFpsRanges = inputStream;
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public ASN1StreamParser(java.io.InputStream inputStream, int i) {
        this(inputStream, i, new byte[11][]);
    }

    public ASN1StreamParser(java.io.InputStream inputStream) {
        this(inputStream, org.bouncycastle.asn1.StreamUtil.Camera2StreamConfigurationMap(inputStream));
    }
}
