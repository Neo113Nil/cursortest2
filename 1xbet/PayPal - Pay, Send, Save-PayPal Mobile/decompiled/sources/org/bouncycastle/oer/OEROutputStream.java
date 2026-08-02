package org.bouncycastle.oer;

/* loaded from: classes17.dex */
public class OEROutputStream {
    private static final int[] Camera2StreamConfigurationMap = {1, 2, 4, 8, 16, 32, 64, 128};
    protected java.io.PrintWriter debugOutput = null;
    private final java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;

    public static int byteLength(long j) {
        int i = 8;
        while (i > 0 && ((-72057594037927936L) & j) == 0) {
            j <<= 8;
            i--;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, org.bouncycastle.oer.OERDefinition.Element element) throws java.io.IOException {
        int i;
        int i2;
        int i3;
        java.util.Enumeration objects;
        int size;
        int tagNo;
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive;
        java.lang.String str;
        byte[] longToBigEndian;
        if (aSN1Encodable != org.bouncycastle.oer.OEROptional.ABSENT) {
            if (aSN1Encodable instanceof org.bouncycastle.oer.OEROptional) {
                write(((org.bouncycastle.oer.OEROptional) aSN1Encodable).get(), element);
                return;
            }
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2 = aSN1Encodable.toASN1Primitive();
            int i4 = 6;
            switch (org.bouncycastle.oer.OEROutputStream.AnonymousClass1.getHighSpeedVideoFpsRangesFor[element.baseType.ordinal()]) {
                case 1:
                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Primitive2);
                    if (!element.extensionsInDefinition) {
                        i4 = 7;
                    } else if (element.hasPopulatedExtension()) {
                        i = Camera2StreamConfigurationMap[7];
                        for (i2 = 0; i2 < element.children.size(); i2++) {
                            org.bouncycastle.oer.OERDefinition.Element element2 = element.children.get(i2);
                            if (i4 < 0) {
                                this.getHighResolutionOutputSizeshNQ4ISI.write(i);
                                i4 = 7;
                                i = 0;
                            }
                            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i2);
                            if (element2.explicit && (objectAt instanceof org.bouncycastle.oer.OEROptional)) {
                                throw new java.lang.IllegalStateException("absent sequence element that is required by oer definition");
                            }
                            if (!element2.explicit) {
                                org.bouncycastle.asn1.ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i2);
                                if (element2.getDefaultValue() == null) {
                                    if (objectAt != org.bouncycastle.oer.OEROptional.ABSENT) {
                                        i3 = Camera2StreamConfigurationMap[i4];
                                        i |= i3;
                                    }
                                    i4--;
                                } else if (objectAt2 instanceof org.bouncycastle.oer.OEROptional) {
                                    org.bouncycastle.oer.OEROptional oEROptional = (org.bouncycastle.oer.OEROptional) objectAt2;
                                    if (oEROptional.isDefined() && !oEROptional.get().equals(element2.defaultValue)) {
                                        i3 = Camera2StreamConfigurationMap[i4];
                                        i |= i3;
                                    }
                                    i4--;
                                } else {
                                    if (!element2.getDefaultValue().equals(objectAt2)) {
                                        i3 = Camera2StreamConfigurationMap[i4];
                                        i |= i3;
                                    }
                                    i4--;
                                }
                            }
                        }
                        if (i4 != 7) {
                            this.getHighResolutionOutputSizeshNQ4ISI.write(i);
                        }
                        for (int i5 = 0; i5 < element.children.size(); i5++) {
                            org.bouncycastle.asn1.ASN1Encodable objectAt3 = aSN1Sequence.getObjectAt(i5);
                            org.bouncycastle.oer.OERDefinition.Element element3 = element.children.get(i5);
                            if (element3.getDefaultValue() == null || !element3.getDefaultValue().equals(objectAt3)) {
                                write(objectAt3, element3);
                            }
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.flush();
                        debugPrint(element.appendLabel(""));
                        return;
                    }
                    i = 0;
                    while (i2 < element.children.size()) {
                    }
                    if (i4 != 7) {
                    }
                    while (i5 < element.children.size()) {
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    debugPrint(element.appendLabel(""));
                    return;
                case 2:
                    if (aSN1Primitive2 instanceof org.bouncycastle.asn1.ASN1Set) {
                        org.bouncycastle.asn1.ASN1Set aSN1Set = (org.bouncycastle.asn1.ASN1Set) aSN1Primitive2;
                        objects = aSN1Set.getObjects();
                        size = aSN1Set.size();
                    } else {
                        if (!(aSN1Primitive2 instanceof org.bouncycastle.asn1.ASN1Sequence)) {
                            throw new java.lang.IllegalStateException("encodable at for SEQ_OF is not a container");
                        }
                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive2;
                        objects = aSN1Sequence2.getObjects();
                        size = aSN1Sequence2.size();
                    }
                    byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(java.math.BigInteger.valueOf(size));
                    this.getHighResolutionOutputSizeshNQ4ISI.write(asUnsignedByteArray.length);
                    this.getHighResolutionOutputSizeshNQ4ISI.write(asUnsignedByteArray);
                    while (objects.hasMoreElements()) {
                        write((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement(), element.getFirstChid());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    debugPrint(element.appendLabel(""));
                    return;
                case 3:
                    org.bouncycastle.asn1.ASN1Primitive aSN1Primitive3 = aSN1Primitive2.toASN1Primitive();
                    org.bouncycastle.oer.BitBuilder bitBuilder = new org.bouncycastle.oer.BitBuilder();
                    if (aSN1Primitive3 instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific) {
                        org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific = (org.bouncycastle.asn1.ASN1ApplicationSpecific) aSN1Primitive3;
                        tagNo = aSN1ApplicationSpecific.getApplicationTag();
                        bitBuilder.writeBit(0).writeBit(1);
                        aSN1Primitive = aSN1ApplicationSpecific.getEnclosedObject();
                    } else {
                        if (!(aSN1Primitive3 instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                            throw new java.lang.IllegalStateException("only support tagged objects");
                        }
                        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive3;
                        int tagClass = aSN1TaggedObject.getTagClass();
                        bitBuilder.writeBit(tagClass & 128).writeBit(tagClass & 64);
                        tagNo = aSN1TaggedObject.getTagNo();
                        aSN1Primitive = aSN1TaggedObject.getBaseObject().toASN1Primitive();
                    }
                    if (tagNo <= 63) {
                        bitBuilder.writeBits(tagNo, 6);
                    } else {
                        bitBuilder.writeBits(255L, 6);
                        bitBuilder.write7BitBytes(tagNo);
                    }
                    if (this.debugOutput != null) {
                        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific)) {
                            str = aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject ? "CS" : "AS";
                        }
                        debugPrint(element.appendLabel(str));
                    }
                    bitBuilder.writeAndClear(this.getHighResolutionOutputSizeshNQ4ISI);
                    write(aSN1Primitive, element.children.get(tagNo));
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
                case 4:
                    java.math.BigInteger value = aSN1Primitive2 instanceof org.bouncycastle.asn1.ASN1Integer ? org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Primitive2).getValue() : org.bouncycastle.asn1.ASN1Enumerated.getInstance(aSN1Primitive2).getValue();
                    java.util.Iterator<org.bouncycastle.oer.OERDefinition.Element> it = element.children.iterator();
                    while (it.hasNext()) {
                        if (it.next().enumValue.equals(value)) {
                            if (value.compareTo(java.math.BigInteger.valueOf(127L)) > 0) {
                                byte[] byteArray = value.toByteArray();
                                this.getHighResolutionOutputSizeshNQ4ISI.write((byteArray.length & 255) | 128);
                                this.getHighResolutionOutputSizeshNQ4ISI.write(byteArray);
                            } else {
                                this.getHighResolutionOutputSizeshNQ4ISI.write(value.intValue() & 127);
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI.flush();
                            debugPrint(element.appendLabel(element.rangeExpression()));
                            return;
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("enum value ");
                    sb.append(value);
                    sb.append(" ");
                    sb.append(org.bouncycastle.util.encoders.Hex.toHexString(value.toByteArray()));
                    sb.append(" no in defined child list");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                case 5:
                    org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Primitive2);
                    int intBytesForRange = element.intBytesForRange();
                    if (intBytesForRange > 0) {
                        byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(intBytesForRange, aSN1Integer.getValue());
                        if (intBytesForRange != 1 && intBytesForRange != 2 && intBytesForRange != 4 && intBytesForRange != 8) {
                            throw new java.lang.IllegalStateException("unknown uint length ".concat(java.lang.String.valueOf(intBytesForRange)));
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.write(asUnsignedByteArray2);
                    } else if (intBytesForRange < 0) {
                        java.math.BigInteger value2 = aSN1Integer.getValue();
                        if (intBytesForRange == -8) {
                            longToBigEndian = org.bouncycastle.util.Pack.longToBigEndian(org.bouncycastle.util.BigIntegers.longValueExact(value2));
                        } else if (intBytesForRange == -4) {
                            longToBigEndian = org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.BigIntegers.intValueExact(value2));
                        } else if (intBytesForRange == -2) {
                            longToBigEndian = org.bouncycastle.util.Pack.shortToBigEndian(org.bouncycastle.util.BigIntegers.shortValueExact(value2));
                        } else {
                            if (intBytesForRange != -1) {
                                throw new java.lang.IllegalStateException("unknown twos compliment length");
                            }
                            longToBigEndian = new byte[]{org.bouncycastle.util.BigIntegers.byteValueExact(value2)};
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.write(longToBigEndian);
                    } else {
                        boolean isLowerRangeZero = element.isLowerRangeZero();
                        java.math.BigInteger value3 = aSN1Integer.getValue();
                        byte[] asUnsignedByteArray3 = isLowerRangeZero ? org.bouncycastle.util.BigIntegers.asUnsignedByteArray(value3) : value3.toByteArray();
                        getHighSpeedVideoSizes(asUnsignedByteArray3.length);
                        this.getHighResolutionOutputSizeshNQ4ISI.write(asUnsignedByteArray3);
                    }
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
                case 6:
                    byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Primitive2).getOctets();
                    if (!element.isFixedLength()) {
                        getHighSpeedVideoSizes(octets.length);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.write(octets);
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
                case 7:
                    byte[] uTF8ByteArray = org.bouncycastle.util.Strings.toUTF8ByteArray(org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Primitive2).getString());
                    getHighSpeedVideoSizes(uTF8ByteArray.length);
                    this.getHighResolutionOutputSizeshNQ4ISI.write(uTF8ByteArray);
                    debugPrint(element.appendLabel(""));
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
                case 8:
                    org.bouncycastle.asn1.DERBitString dERBitString = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Primitive2);
                    byte[] bytes = dERBitString.getBytes();
                    if (!element.isFixedLength()) {
                        int padBits = dERBitString.getPadBits();
                        getHighSpeedVideoSizes(bytes.length + 1);
                        this.getHighResolutionOutputSizeshNQ4ISI.write(padBits);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.write(bytes);
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
                case 9:
                case 11:
                default:
                    return;
                case 10:
                    byte[] octets2 = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Primitive2).getOctets();
                    if (!element.isFixedLength()) {
                        getHighSpeedVideoSizes(octets2.length);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.write(octets2);
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
                case 12:
                    debugPrint(element.label);
                    if (org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Primitive2).isTrue()) {
                        this.getHighResolutionOutputSizeshNQ4ISI.write(255);
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI.write(0);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.flush();
                    return;
            }
        }
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

    private void getHighSpeedVideoSizes(long j) throws java.io.IOException {
        if (j <= 127) {
            this.getHighResolutionOutputSizeshNQ4ISI.write((int) j);
            return;
        }
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(java.math.BigInteger.valueOf(j));
        this.getHighResolutionOutputSizeshNQ4ISI.write(asUnsignedByteArray.length | 128);
        this.getHighResolutionOutputSizeshNQ4ISI.write(asUnsignedByteArray);
    }

    public static org.bouncycastle.oer.OEROutputStream create(java.io.OutputStream outputStream) {
        return new org.bouncycastle.oer.OEROutputStream(outputStream);
    }

    /* renamed from: org.bouncycastle.oer.OEROutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.bouncycastle.oer.OERDefinition.BaseType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.bouncycastle.oer.OERDefinition.BaseType.SEQ.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.SEQ_OF.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.CHOICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.OCTET_STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.UTF8_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.BIT_STRING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.NULL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.EXTENSION.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.ENUM_ITEM.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.bouncycastle.oer.OERDefinition.BaseType.BOOLEAN.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    OEROutputStream(java.io.OutputStream outputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI = outputStream;
    }
}
