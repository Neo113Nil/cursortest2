package org.bouncycastle.oer;

/* loaded from: classes17.dex */
public class OERInputStream extends java.io.FilterInputStream {
    private static final int[] Camera2StreamConfigurationMap = {1, 2, 4, 8, 16, 32, 64, 128};
    protected java.io.PrintWriter debugOutput;
    private int getHighSpeedVideoFpsRangesFor;

    final class LengthInfo {
        private final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
        private final boolean getHighSpeedVideoSizes;

        static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.oer.OERInputStream.LengthInfo lengthInfo) {
            return lengthInfo.getHighSpeedVideoFpsRangesFor.intValue();
        }

        public LengthInfo(java.math.BigInteger bigInteger, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = bigInteger;
            this.getHighSpeedVideoSizes = z;
        }
    }

    public org.bouncycastle.asn1.ASN1Object parse(org.bouncycastle.oer.OERDefinition.Element element) throws java.lang.Exception {
        org.bouncycastle.asn1.ASN1Object aSN1Object;
        byte[] highSpeedVideoFpsRangesFor;
        java.math.BigInteger bigInteger;
        int i;
        long j;
        switch (org.bouncycastle.oer.OERInputStream.AnonymousClass1.getHighSpeedVideoFpsRanges[element.baseType.ordinal()]) {
            case 1:
                byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength()));
                if (org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor2) != highSpeedVideoFpsRangesFor2.length) {
                    throw new java.io.IOException("could not read all of count of seq-of values");
                }
                int intValue = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(highSpeedVideoFpsRangesFor2).intValue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("(len = ");
                sb.append(intValue);
                sb.append(")");
                debugPrint(element.appendLabel(sb.toString()));
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                for (int i2 = 0; i2 < intValue; i2++) {
                    aSN1EncodableVector.add(parse(element.children.get(0)));
                }
                return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
            case 2:
                java.util.Iterator<org.bouncycastle.oer.OERDefinition.Element> it = element.children.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += !it.next().explicit ? 1 : 0;
                }
                org.bouncycastle.oer.OERInputStream.Sequence sequence = sequence(i3, element.hasDefaultChildren(), element.extensionsInDefinition);
                debugPrint(element.appendLabel(sequence.toString()));
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                for (int i4 = 0; i4 < element.children.size(); i4++) {
                    org.bouncycastle.oer.OERDefinition.Element element2 = element.children.get(i4);
                    if (element2.explicit) {
                        aSN1Object = parse(element2);
                    } else if (sequence.hasOptional(element.optionalOrDefaultChildrenInOrder().indexOf(element2))) {
                        aSN1Object = org.bouncycastle.oer.OEROptional.getInstance(parse(element2));
                    } else if (element2.getDefaultValue() != null) {
                        aSN1EncodableVector2.add(element2.defaultValue);
                        debugPrint("Using default.");
                    } else {
                        debugPrint(element2.appendLabel("Absent"));
                        aSN1Object = org.bouncycastle.oer.OEROptional.ABSENT;
                    }
                    aSN1EncodableVector2.add(aSN1Object);
                }
                return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2);
            case 3:
                org.bouncycastle.oer.OERInputStream.Choice choice = choice();
                debugPrint(element.appendLabel(choice.toString()));
                if (choice.isContextSpecific()) {
                    element.children.get(choice.getTag());
                    return new org.bouncycastle.asn1.DERTaggedObject(choice.Camera2StreamConfigurationMap, parse(element.children.get(choice.getTag())));
                }
                if (choice.isApplicationTagClass()) {
                    throw new java.lang.IllegalStateException("Unimplemented tag type");
                }
                if (choice.isPrivateTagClass()) {
                    throw new java.lang.IllegalStateException("Unimplemented tag type");
                }
                if (!choice.isUniversalTagClass()) {
                    throw new java.lang.IllegalStateException("Unimplemented tag type");
                }
                choice.getTag();
                break;
            case 4:
                break;
            case 5:
                int intBytesForRange = element.intBytesForRange();
                if (intBytesForRange != 0) {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(java.lang.Math.abs(intBytesForRange));
                    org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor);
                    int length = highSpeedVideoFpsRangesFor.length;
                    if (length == 1) {
                        i = highSpeedVideoFpsRangesFor[0];
                    } else if (length == 2) {
                        i = org.bouncycastle.util.Pack.bigEndianToShort(highSpeedVideoFpsRangesFor, 0);
                    } else if (length == 4) {
                        i = org.bouncycastle.util.Pack.bigEndianToInt(highSpeedVideoFpsRangesFor, 0);
                    } else {
                        if (length != 8) {
                            throw new java.lang.IllegalStateException("Unknown size");
                        }
                        j = org.bouncycastle.util.Pack.bigEndianToLong(highSpeedVideoFpsRangesFor, 0);
                        bigInteger = java.math.BigInteger.valueOf(j);
                    }
                    j = i;
                    bigInteger = java.math.BigInteger.valueOf(j);
                } else if (element.isLowerRangeZero()) {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength()));
                    org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor);
                    if (highSpeedVideoFpsRangesFor.length != 0) {
                        bigInteger = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(highSpeedVideoFpsRangesFor);
                    }
                    bigInteger = java.math.BigInteger.ZERO;
                } else {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength()));
                    org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor);
                    if (highSpeedVideoFpsRangesFor.length != 0) {
                        bigInteger = new java.math.BigInteger(highSpeedVideoFpsRangesFor);
                    }
                    bigInteger = java.math.BigInteger.ZERO;
                }
                if (this.debugOutput != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("INTEGER(");
                    sb2.append(highSpeedVideoFpsRangesFor.length);
                    sb2.append(" ");
                    sb2.append(bigInteger.toString(16));
                    sb2.append(")");
                    debugPrint(element.appendLabel(sb2.toString()));
                }
                return new org.bouncycastle.asn1.ASN1Integer(bigInteger);
            case 6:
                int highResolutionOutputSizeshNQ4ISI = (element.upperBound == null || !element.upperBound.equals(element.lowerBound)) ? org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength()) : element.upperBound.intValue();
                byte[] highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                if (org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor3) != highResolutionOutputSizeshNQ4ISI) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("did not read all of ");
                    sb3.append(element.label);
                    throw new java.io.IOException(sb3.toString());
                }
                if (this.debugOutput != null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("OCTET STRING (");
                    sb4.append(highSpeedVideoFpsRangesFor3.length);
                    sb4.append(") = ");
                    sb4.append(org.bouncycastle.util.encoders.Hex.toHexString(highSpeedVideoFpsRangesFor3, 0, java.lang.Math.min(highSpeedVideoFpsRangesFor3.length, 32)));
                    debugPrint(element.appendLabel(sb4.toString()));
                }
                return new org.bouncycastle.asn1.DEROctetString(highSpeedVideoFpsRangesFor3);
            case 7:
                byte[] highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength()));
                if (org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor4) != highSpeedVideoFpsRangesFor4.length) {
                    throw new java.io.IOException("could not read all of utf 8 string");
                }
                java.lang.String fromUTF8ByteArray = org.bouncycastle.util.Strings.fromUTF8ByteArray(highSpeedVideoFpsRangesFor4);
                if (this.debugOutput != null) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("UTF8 String (");
                    sb5.append(highSpeedVideoFpsRangesFor4.length);
                    sb5.append(") = ");
                    sb5.append(fromUTF8ByteArray);
                    debugPrint(element.appendLabel(sb5.toString()));
                }
                return new org.bouncycastle.asn1.DERUTF8String(fromUTF8ByteArray);
            case 8:
                byte[] highSpeedVideoFpsRangesFor5 = element.isFixedLength() ? new byte[element.lowerBound.intValue() / 8] : getHighSpeedVideoFpsRangesFor((java.math.BigInteger.ZERO.compareTo(element.upperBound) > 0 ? element.upperBound.intValue() : org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength())) / 8);
                org.bouncycastle.util.io.Streams.readFully(this, highSpeedVideoFpsRangesFor5);
                if (this.debugOutput != null) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BIT STRING(");
                    sb6.append(highSpeedVideoFpsRangesFor5.length * 8);
                    sb6.append(") = ");
                    stringBuffer.append(sb6.toString());
                    for (int i5 = 0; i5 != highSpeedVideoFpsRangesFor5.length; i5++) {
                        int i6 = highSpeedVideoFpsRangesFor5[i5];
                        for (int i7 = 0; i7 < 8; i7++) {
                            stringBuffer.append((i6 & 128) > 0 ? "1" : "0");
                            i6 = (byte) (i6 << 1);
                        }
                    }
                    debugPrint(element.appendLabel(stringBuffer.toString()));
                }
                return new org.bouncycastle.asn1.DERBitString(highSpeedVideoFpsRangesFor5);
            case 9:
                debugPrint(element.appendLabel("NULL"));
                return org.bouncycastle.asn1.DERNull.INSTANCE;
            case 10:
                org.bouncycastle.oer.OERInputStream.LengthInfo readLength = readLength();
                byte[] bArr = new byte[org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength)];
                if (org.bouncycastle.util.io.Streams.readFully(this, bArr) != org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength)) {
                    throw new java.io.IOException("could not read all of count of open value in choice (...) ");
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ext ");
                sb7.append(org.bouncycastle.oer.OERInputStream.LengthInfo.getHighResolutionOutputSizeshNQ4ISI(readLength));
                sb7.append(" ");
                sb7.append(org.bouncycastle.util.encoders.Hex.toHexString(bArr));
                debugPrint(sb7.toString());
                return new org.bouncycastle.asn1.DEROctetString(bArr);
            default:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Unhandled type ");
                sb8.append(element.baseType);
                throw new java.lang.IllegalStateException(sb8.toString());
        }
        java.math.BigInteger enumeration = enumeration();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("ENUM(");
        sb9.append(enumeration);
        sb9.append(") = ");
        sb9.append(element.children.get(enumeration.intValue()).label);
        debugPrint(element.appendLabel(sb9.toString()));
        return new org.bouncycastle.asn1.ASN1Enumerated(enumeration);
    }

    public java.math.BigInteger uint8() throws java.lang.Exception {
        return parseInt(true, 1);
    }

    public java.math.BigInteger uint64() throws java.lang.Exception {
        return parseInt(false, 8);
    }

    public java.math.BigInteger uint32() throws java.lang.Exception {
        return parseInt(true, 4);
    }

    public java.math.BigInteger uint16() throws java.lang.Exception {
        return parseInt(true, 2);
    }

    public org.bouncycastle.oer.OERInputStream.Sequence sequence(int i, boolean z, boolean z2) throws java.lang.Exception {
        return new org.bouncycastle.oer.OERInputStream.Sequence(this, i, z, z2);
    }

    public org.bouncycastle.oer.OERInputStream.LengthInfo readLength() throws java.lang.Exception {
        int read = read();
        if (read == -1) {
            throw new java.io.EOFException("expecting length");
        }
        if ((read & 128) == 0) {
            return new org.bouncycastle.oer.OERInputStream.LengthInfo(java.math.BigInteger.valueOf(read & 127), true);
        }
        int i = read & 127;
        byte[] bArr = new byte[i];
        if (org.bouncycastle.util.io.Streams.readFully(this, bArr) != i) {
            throw new java.io.EOFException("did not read all bytes of length definition");
        }
        org.bouncycastle.util.encoders.Hex.toHexString(bArr);
        return new org.bouncycastle.oer.OERInputStream.LengthInfo(org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(bArr), false);
    }

    public java.math.BigInteger parseInt(boolean z, int i) throws java.lang.Exception {
        byte[] bArr = new byte[i];
        if (org.bouncycastle.util.io.Streams.readFully(this, bArr) == i) {
            return z ? new java.math.BigInteger(1, bArr) : new java.math.BigInteger(bArr);
        }
        throw new java.lang.IllegalStateException("integer not fully read");
    }

    public java.math.BigInteger int8() throws java.lang.Exception {
        return parseInt(false, 1);
    }

    public java.math.BigInteger int64() throws java.lang.Exception {
        return parseInt(false, 8);
    }

    public java.math.BigInteger int32() throws java.lang.Exception {
        return parseInt(false, 4);
    }

    public static class Choice extends org.bouncycastle.oer.OERInputStream {
        final int Camera2StreamConfigurationMap;
        final int getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CHOICE(");
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                str = "Universal ";
            } else if (i == 64) {
                str = "Application ";
            } else {
                if (i != 128) {
                    if (i == 192) {
                        str = "Private ";
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Tag = ");
                    sb2.append(this.Camera2StreamConfigurationMap);
                    sb.append(sb2.toString());
                    sb.append(")");
                    return sb.toString();
                }
                str = "ContextSpecific ";
            }
            sb.append(str);
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Tag = ");
            sb22.append(this.Camera2StreamConfigurationMap);
            sb.append(sb22.toString());
            sb.append(")");
            return sb.toString();
        }

        public boolean isUniversalTagClass() {
            return this.getHighSpeedVideoFpsRangesFor == 0;
        }

        public boolean isPrivateTagClass() {
            return this.getHighSpeedVideoFpsRangesFor == 192;
        }

        public boolean isContextSpecific() {
            return this.getHighSpeedVideoFpsRangesFor == 128;
        }

        public boolean isApplicationTagClass() {
            return this.getHighSpeedVideoFpsRangesFor == 64;
        }

        public int getTagClass() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public int getTag() {
            return this.Camera2StreamConfigurationMap;
        }

        public Choice(java.io.InputStream inputStream) throws java.lang.Exception {
            super(inputStream);
            int read;
            int read2 = read();
            this.getHighSpeedVideoSizes = read2;
            if (read2 < 0) {
                throw new java.io.EOFException("expecting preamble byte of choice");
            }
            this.getHighSpeedVideoFpsRangesFor = read2 & 192;
            int i = read2 & 63;
            if (i >= 63) {
                i = 0;
                do {
                    read = inputStream.read();
                    if (read < 0) {
                        throw new java.io.EOFException("expecting further tag bytes");
                    }
                    i = (i << 7) | (read & 127);
                } while ((read & 128) != 0);
            }
            this.Camera2StreamConfigurationMap = i;
        }
    }

    public java.math.BigInteger int16() throws java.lang.Exception {
        return parseInt(false, 2);
    }

    public java.math.BigInteger enumeration() throws java.lang.Exception {
        int read = read();
        if (read == -1) {
            throw new java.io.EOFException("expecting prefix of enumeration");
        }
        if ((read & 128) != 128) {
            return java.math.BigInteger.valueOf(read);
        }
        int i = read & 127;
        if (i == 0) {
            return java.math.BigInteger.ZERO;
        }
        byte[] bArr = new byte[i];
        if (org.bouncycastle.util.io.Streams.readFully(this, bArr) == i) {
            return new java.math.BigInteger(1, bArr);
        }
        throw new java.io.EOFException("unable to fully read integer component of enumeration");
    }

    protected void debugPrint(java.lang.String str) {
        if (this.debugOutput == null) {
            return;
        }
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        int i = -1;
        for (int i2 = 0; i2 != stackTrace.length; i2++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement.getMethodName().equals("debugPrint")) {
                i = 0;
            } else if (stackTraceElement.getClassName().contains("OERInput")) {
                i++;
            }
        }
        while (true) {
            java.io.PrintWriter printWriter = this.debugOutput;
            if (i <= 0) {
                printWriter.append((java.lang.CharSequence) str).append((java.lang.CharSequence) com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((java.lang.CharSequence) "    ");
                i--;
            }
        }
    }

    public org.bouncycastle.oer.OERInputStream.Choice choice() throws java.lang.Exception {
        return new org.bouncycastle.oer.OERInputStream.Choice(this);
    }

    public static class Sequence extends org.bouncycastle.oer.OERInputStream {
        final int Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final boolean[] getHighSpeedVideoSizes;

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SEQ(");
            sb.append(hasExtension() ? "Ext " : "");
            int i = 0;
            while (true) {
                boolean[] zArr = this.getHighSpeedVideoSizes;
                if (i >= zArr.length) {
                    sb.append(")");
                    return sb.toString();
                }
                sb.append(zArr[i] ? "1" : "0");
                i++;
            }
        }

        public boolean hasOptional(int i) {
            return this.getHighSpeedVideoSizes[i];
        }

        public boolean hasExtension() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public Sequence(java.io.InputStream inputStream, int i, boolean z, boolean z2) throws java.io.IOException {
            super(inputStream);
            if (i == 0 && !z2 && !z) {
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes = new boolean[0];
                this.getHighResolutionOutputSizeshNQ4ISI = false;
                return;
            }
            int read = inputStream.read();
            this.Camera2StreamConfigurationMap = read;
            if (read < 0) {
                throw new java.io.EOFException("expecting preamble byte of sequence");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = z2 && (read & 128) == 128;
            int i2 = z2 ? 6 : 7;
            this.getHighSpeedVideoSizes = new boolean[i];
            for (int i3 = 0; i3 < this.getHighSpeedVideoSizes.length; i3++) {
                if (i2 < 0) {
                    read = inputStream.read();
                    if (read < 0) {
                        throw new java.io.EOFException("expecting mask byte sequence");
                    }
                    i2 = 7;
                }
                this.getHighSpeedVideoSizes[i3] = (org.bouncycastle.oer.OERInputStream.Camera2StreamConfigurationMap[i2] & read) > 0;
                i2--;
            }
        }
    }

    private byte[] getHighSpeedVideoFpsRangesFor(int i) {
        if (i <= this.getHighSpeedVideoFpsRangesFor) {
            return new byte[i];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("required byte array size ");
        sb.append(i);
        sb.append(" was greater than ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public OERInputStream(java.io.InputStream inputStream, int i) {
        super(inputStream);
        this.debugOutput = null;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    /* renamed from: org.bouncycastle.oer.OERInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.bouncycastle.oer.OERDefinition.BaseType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.bouncycastle.oer.OERDefinition.BaseType.SEQ_OF.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.SEQ.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.CHOICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.OCTET_STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.UTF8_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.BIT_STRING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.NULL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.oer.OERDefinition.BaseType.EXTENSION.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public OERInputStream(java.io.InputStream inputStream) {
        super(inputStream);
        this.getHighSpeedVideoFpsRangesFor = 1048576;
        this.debugOutput = null;
    }
}
