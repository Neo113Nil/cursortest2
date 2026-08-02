package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1InputStream extends java.io.FilterInputStream implements org.bouncycastle.asn1.BERTags {
    private final byte[][] Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor(int i, org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws java.io.IOException {
        int i2 = 0;
        switch (i) {
            case 1:
                return org.bouncycastle.asn1.ASN1Boolean.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(definiteLengthInputStream, bArr));
            case 2:
                return org.bouncycastle.asn1.ASN1Integer.getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 3:
                return org.bouncycastle.asn1.ASN1BitString.getHighSpeedVideoFpsRanges(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 4:
                return org.bouncycastle.asn1.ASN1OctetString.Camera2StreamConfigurationMap(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 5:
                return org.bouncycastle.asn1.ASN1Null.getHighSpeedVideoSizes(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 6:
                return org.bouncycastle.asn1.ASN1ObjectIdentifier.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(definiteLengthInputStream, bArr), true);
            case 7:
                return org.bouncycastle.asn1.ASN1ObjectDescriptor.getHighSpeedVideoFpsRangesFor(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag ");
                sb.append(i);
                sb.append(" encountered");
                throw new java.io.IOException(sb.toString());
            case 10:
                return org.bouncycastle.asn1.ASN1Enumerated.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(definiteLengthInputStream, bArr), true);
            case 12:
                return org.bouncycastle.asn1.ASN1UTF8String.getHighSpeedVideoSizes(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 13:
                return org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoFpsRangesFor(definiteLengthInputStream.getHighSpeedVideoFpsRanges(), false);
            case 18:
                return org.bouncycastle.asn1.ASN1NumericString.getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 19:
                return org.bouncycastle.asn1.ASN1PrintableString.Camera2StreamConfigurationMap(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 20:
                return org.bouncycastle.asn1.ASN1T61String.Camera2StreamConfigurationMap(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 21:
                return org.bouncycastle.asn1.ASN1VideotexString.getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 22:
                return org.bouncycastle.asn1.ASN1IA5String.getHighSpeedVideoFpsRangesFor(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 23:
                return org.bouncycastle.asn1.ASN1UTCTime.Camera2StreamConfigurationMap(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 24:
                return org.bouncycastle.asn1.ASN1GeneralizedTime.getHighSpeedVideoFpsRanges(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 25:
                return org.bouncycastle.asn1.ASN1GraphicString.getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 26:
                return org.bouncycastle.asn1.ASN1VisibleString.getHighSpeedVideoFpsRanges(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 27:
                return org.bouncycastle.asn1.ASN1GeneralString.getHighSpeedVideoSizes(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 28:
                return org.bouncycastle.asn1.ASN1UniversalString.getHighSpeedVideoSizes(definiteLengthInputStream.getHighSpeedVideoFpsRanges());
            case 30:
                int i3 = definiteLengthInputStream.getHighSpeedVideoFpsRanges;
                if ((i3 & 1) != 0) {
                    throw new java.io.IOException("malformed BMPString encoding encountered");
                }
                int i4 = i3 / 2;
                char[] cArr = new char[i4];
                byte[] bArr2 = new byte[8];
                int i5 = 0;
                while (i3 >= 8) {
                    if (org.bouncycastle.util.io.Streams.readFully(definiteLengthInputStream, bArr2, 0, 8) != 8) {
                        throw new java.io.EOFException("EOF encountered in middle of BMPString");
                    }
                    cArr[i5] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                    cArr[i5 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                    cArr[i5 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                    cArr[i5 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                    i5 += 4;
                    i3 -= 8;
                }
                if (i3 > 0) {
                    if (org.bouncycastle.util.io.Streams.readFully(definiteLengthInputStream, bArr2, 0, i3) != i3) {
                        throw new java.io.EOFException("EOF encountered in middle of BMPString");
                    }
                    while (true) {
                        int i6 = i2 + 2;
                        cArr[i5] = (char) ((bArr2[i2 + 1] & 255) | (bArr2[i2] << 8));
                        i5++;
                        if (i6 < i3) {
                            i2 = i6;
                        }
                    }
                }
                if (definiteLengthInputStream.getHighSpeedVideoFpsRanges == 0 && i4 == i5) {
                    return org.bouncycastle.asn1.ASN1BMPString.getHighResolutionOutputSizeshNQ4ISI(cArr);
                }
                throw new java.lang.IllegalStateException();
        }
    }

    private static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws java.io.IOException {
        int i = definiteLengthInputStream.getHighSpeedVideoFpsRanges;
        if (i >= bArr.length) {
            return definiteLengthInputStream.getHighSpeedVideoFpsRanges();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        definiteLengthInputStream.Camera2StreamConfigurationMap(bArr2);
        return bArr2;
    }

    protected org.bouncycastle.asn1.ASN1Primitive buildObject(int i, int i2, int i3) throws java.io.IOException {
        org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream = new org.bouncycastle.asn1.DefiniteLengthInputStream(this, i3, this.getHighSpeedVideoFpsRangesFor);
        if ((i & 224) == 0) {
            return getHighSpeedVideoFpsRangesFor(i2, definiteLengthInputStream, this.Camera2StreamConfigurationMap);
        }
        int i4 = i & 192;
        if (i4 != 0) {
            return (i & 32) == 0 ? org.bouncycastle.asn1.ASN1TaggedObject.getHighResolutionOutputSizeshNQ4ISI(i4, i2, definiteLengthInputStream.getHighSpeedVideoFpsRanges()) : org.bouncycastle.asn1.ASN1TaggedObject.Camera2StreamConfigurationMap(i4, i2, getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream));
        }
        int i5 = 0;
        if (i2 == 3) {
            org.bouncycastle.asn1.ASN1EncodableVector highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream);
            int size = highResolutionOutputSizeshNQ4ISI.size();
            org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr = new org.bouncycastle.asn1.ASN1BitString[size];
            while (i5 != size) {
                org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = highResolutionOutputSizeshNQ4ISI.get(i5);
                if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1BitString)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object encountered in constructed BIT STRING: ");
                    sb.append(aSN1Encodable.getClass());
                    throw new org.bouncycastle.asn1.ASN1Exception(sb.toString());
                }
                aSN1BitStringArr[i5] = (org.bouncycastle.asn1.ASN1BitString) aSN1Encodable;
                i5++;
            }
            return new org.bouncycastle.asn1.BERBitString(aSN1BitStringArr);
        }
        if (i2 != 4) {
            if (i2 == 8) {
                return org.bouncycastle.asn1.DLFactory.getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream)).getInputFormats();
            }
            if (i2 == 16) {
                return definiteLengthInputStream.getHighSpeedVideoFpsRanges <= 0 ? org.bouncycastle.asn1.DLFactory.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoFpsRanges ? new org.bouncycastle.asn1.LazyEncodedSequence(definiteLengthInputStream.getHighSpeedVideoFpsRanges()) : org.bouncycastle.asn1.DLFactory.getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream));
            }
            if (i2 == 17) {
                return org.bouncycastle.asn1.DLFactory.getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream));
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown tag ");
            sb2.append(i2);
            sb2.append(" encountered");
            throw new java.io.IOException(sb2.toString());
        }
        org.bouncycastle.asn1.ASN1EncodableVector highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(definiteLengthInputStream);
        int size2 = highResolutionOutputSizeshNQ4ISI2.size();
        org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = new org.bouncycastle.asn1.ASN1OctetString[size2];
        while (i5 != size2) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable2 = highResolutionOutputSizeshNQ4ISI2.get(i5);
            if (!(aSN1Encodable2 instanceof org.bouncycastle.asn1.ASN1OctetString)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unknown object encountered in constructed OCTET STRING: ");
                sb3.append(aSN1Encodable2.getClass());
                throw new org.bouncycastle.asn1.ASN1Exception(sb3.toString());
            }
            aSN1OctetStringArr[i5] = (org.bouncycastle.asn1.ASN1OctetString) aSN1Encodable2;
            i5++;
        }
        return new org.bouncycastle.asn1.BEROctetString(aSN1OctetStringArr);
    }

    public org.bouncycastle.asn1.ASN1Primitive readObject() throws java.io.IOException {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new java.io.IOException("unexpected end-of-contents marker");
        }
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this, read);
        int readLength = readLength();
        if (readLength >= 0) {
            try {
                return buildObject(read, highResolutionOutputSizeshNQ4ISI, readLength);
            } catch (java.lang.IllegalArgumentException e) {
                throw new org.bouncycastle.asn1.ASN1Exception("corrupted stream detected", e);
            }
        }
        if ((read & 32) == 0) {
            throw new java.io.IOException("indefinite-length primitive encoding encountered");
        }
        org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser = new org.bouncycastle.asn1.ASN1StreamParser(new org.bouncycastle.asn1.IndefiniteLengthInputStream(this, this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        int i = read & 192;
        if (i != 0) {
            return org.bouncycastle.asn1.ASN1TaggedObject.getHighSpeedVideoFpsRangesFor(i, highResolutionOutputSizeshNQ4ISI, aSN1StreamParser.getHighResolutionOutputSizeshNQ4ISI());
        }
        if (highResolutionOutputSizeshNQ4ISI == 3) {
            return org.bouncycastle.asn1.BERBitStringParser.getHighSpeedVideoSizes(aSN1StreamParser);
        }
        if (highResolutionOutputSizeshNQ4ISI == 4) {
            return org.bouncycastle.asn1.BEROctetStringParser.getHighSpeedVideoFpsRanges(aSN1StreamParser);
        }
        if (highResolutionOutputSizeshNQ4ISI == 8) {
            return org.bouncycastle.asn1.DERExternalParser.getHighResolutionOutputSizeshNQ4ISI(aSN1StreamParser);
        }
        if (highResolutionOutputSizeshNQ4ISI == 16) {
            return org.bouncycastle.asn1.BERSequenceParser.getHighSpeedVideoSizes(aSN1StreamParser);
        }
        if (highResolutionOutputSizeshNQ4ISI == 17) {
            return org.bouncycastle.asn1.BERSetParser.getHighResolutionOutputSizeshNQ4ISI(aSN1StreamParser);
        }
        throw new java.io.IOException("unknown BER object encountered");
    }

    private org.bouncycastle.asn1.ASN1EncodableVector getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream) throws java.io.IOException {
        int i = definiteLengthInputStream.getHighSpeedVideoFpsRanges;
        return i <= 0 ? new org.bouncycastle.asn1.ASN1EncodableVector(0) : new org.bouncycastle.asn1.ASN1InputStream(definiteLengthInputStream, i, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap).Camera2StreamConfigurationMap();
    }

    final org.bouncycastle.asn1.ASN1EncodableVector Camera2StreamConfigurationMap() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive readObject = readObject();
        if (readObject == null) {
            return new org.bouncycastle.asn1.ASN1EncodableVector(0);
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        do {
            aSN1EncodableVector.add(readObject);
            readObject = readObject();
        } while (readObject != null);
        return aSN1EncodableVector;
    }

    protected int readLength() throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(this, this.getHighSpeedVideoFpsRangesFor, false);
    }

    protected void readFully(byte[] bArr) throws java.io.IOException {
        if (org.bouncycastle.util.io.Streams.readFully(this, bArr, 0, bArr.length) != bArr.length) {
            throw new java.io.EOFException("EOF encountered in middle of object");
        }
    }

    static int getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new java.io.EOFException("EOF found inside tag value.");
            }
            throw new java.io.IOException("corrupted stream - high tag number < 31 found");
        }
        if ((read & 127) == 0) {
            throw new java.io.IOException("corrupted stream - invalid high tag number found");
        }
        int i3 = 0;
        while ((read & 128) != 0) {
            if ((i3 >>> 24) != 0) {
                throw new java.io.IOException("Tag number more than 31 bits");
            }
            i3 = ((read & 127) | i3) << 7;
            read = inputStream.read();
            if (read < 0) {
                throw new java.io.EOFException("EOF found inside tag value.");
            }
        }
        return (read & 127) | i3;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, int i, boolean z) throws java.io.IOException {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new java.io.EOFException("EOF found when length expected");
        }
        if (255 == read) {
            throw new java.io.IOException("invalid long form definite-length 0xFF");
        }
        int i2 = 0;
        int i3 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new java.io.EOFException("EOF found reading length");
            }
            if ((i2 >>> 23) != 0) {
                throw new java.io.IOException("long form definite-length more than 31 bits");
            }
            i2 = (i2 << 8) + read2;
            i3++;
        } while (i3 < (read & 127));
        if (i2 < i || z) {
            return i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupted stream - out of bounds length found: ");
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i);
        throw new java.io.IOException(sb.toString());
    }

    public ASN1InputStream(byte[] bArr, boolean z) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length, z);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(java.io.InputStream inputStream, boolean z) {
        this(inputStream, org.bouncycastle.asn1.StreamUtil.Camera2StreamConfigurationMap(inputStream), z);
    }

    private ASN1InputStream(java.io.InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = bArr;
    }

    public ASN1InputStream(java.io.InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    public ASN1InputStream(java.io.InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public ASN1InputStream(java.io.InputStream inputStream) {
        this(inputStream, org.bouncycastle.asn1.StreamUtil.Camera2StreamConfigurationMap(inputStream));
    }
}
