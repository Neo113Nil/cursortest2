package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1ObjectIdentifier extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1ObjectIdentifier.class) { // from class: org.bouncycastle.asn1.ASN1ObjectIdentifier.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1ObjectIdentifier.getHighSpeedVideoFpsRanges(dEROctetString.getOctets(), false);
        }
    };
    private static final java.util.concurrent.ConcurrentMap<org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle, org.bouncycastle.asn1.ASN1ObjectIdentifier> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap();
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public ASN1ObjectIdentifier(java.lang.String str) {
        char charAt;
        if (str == null) {
            throw new java.lang.NullPointerException("'identifier' cannot be null");
        }
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2' && org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoFpsRangesFor(str, 2)) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("string ");
        sb.append(str);
        sb.append(" not an OID");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private byte[] getHighSpeedVideoSizes() {
        byte[] bArr;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                org.bouncycastle.asn1.OIDTokenizer oIDTokenizer = new org.bouncycastle.asn1.OIDTokenizer(this.getHighSpeedVideoFpsRangesFor);
                int parseInt = java.lang.Integer.parseInt(oIDTokenizer.nextToken()) * 40;
                java.lang.String nextToken = oIDTokenizer.nextToken();
                if (nextToken.length() <= 18) {
                    org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoFpsRanges(byteArrayOutputStream, parseInt + java.lang.Long.parseLong(nextToken));
                } else {
                    org.bouncycastle.asn1.ASN1RelativeOID.Camera2StreamConfigurationMap(byteArrayOutputStream, new java.math.BigInteger(nextToken).add(java.math.BigInteger.valueOf(parseInt)));
                }
                while (oIDTokenizer.hasMoreTokens()) {
                    java.lang.String nextToken2 = oIDTokenizer.nextToken();
                    if (nextToken2.length() <= 18) {
                        org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoFpsRanges(byteArrayOutputStream, java.lang.Long.parseLong(nextToken2));
                    } else {
                        org.bouncycastle.asn1.ASN1RelativeOID.Camera2StreamConfigurationMap(byteArrayOutputStream, new java.math.BigInteger(nextToken2));
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI = byteArrayOutputStream.toByteArray();
            }
            bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return bArr;
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier)) {
            return (org.bouncycastle.asn1.ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                return (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1ObjectIdentifier) Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct object identifier from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        int i;
        if (!z && (i = aSN1TaggedObject.getHighSpeedVideoFpsRanges) != 3 && i != 4) {
            org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
            if (!(object instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier)) {
                return fromContents(org.bouncycastle.asn1.ASN1OctetString.getInstance(object).getOctets());
            }
        }
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = Camera2StreamConfigurationMap;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(6);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(highSpeedVideoSizes.length);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(highSpeedVideoSizes, 0, highSpeedVideoSizes.length);
    }

    public java.lang.String toString() {
        return getId();
    }

    public boolean on(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String id = getId();
        java.lang.String id2 = aSN1ObjectIdentifier.getId();
        return id.length() > id2.length() && id.charAt(id2.length()) == '.' && id.startsWith(id2);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier intern() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle oidHandle = new org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle(getHighSpeedVideoSizes());
        java.util.concurrent.ConcurrentMap<org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle, org.bouncycastle.asn1.ASN1ObjectIdentifier> concurrentMap = getHighSpeedVideoFpsRanges;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = concurrentMap.get(oidHandle);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier putIfAbsent = concurrentMap.putIfAbsent(oidHandle, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public java.lang.String getId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getHighSpeedVideoSizes().length);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier branch(java.lang.String str) {
        return new org.bouncycastle.asn1.ASN1ObjectIdentifier(this, str);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive == this) {
            return true;
        }
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Primitive).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier fromContents(byte[] bArr) {
        return getHighSpeedVideoFpsRanges(bArr, true);
    }

    static class OidHandle {
        private final byte[] getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        public int hashCode() {
            return this.getHighSpeedVideoSizes;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle) {
                return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges, ((org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle) obj).getHighSpeedVideoFpsRanges);
            }
            return false;
        }

        OidHandle(byte[] bArr) {
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.hashCode(bArr);
            this.getHighSpeedVideoFpsRanges = bArr;
        }
    }

    static org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges(byte[] bArr, boolean z) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = getHighSpeedVideoFpsRanges.get(new org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle(bArr));
        return aSN1ObjectIdentifier == null ? new org.bouncycastle.asn1.ASN1ObjectIdentifier(bArr, z) : aSN1ObjectIdentifier;
    }

    private ASN1ObjectIdentifier(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z2 = true;
        java.math.BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                java.math.BigInteger or = (bigInteger == null ? java.math.BigInteger.valueOf(j) : bigInteger).or(java.math.BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(java.math.BigInteger.valueOf(80L));
                        z2 = false;
                    }
                    stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor = stringBuffer.toString();
        this.getHighResolutionOutputSizeshNQ4ISI = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr2;
    }

    private ASN1ObjectIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        if (!org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoFpsRangesFor(str, 0)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("string ");
            sb.append(str);
            sb.append(" not a valid OID branch");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(aSN1ObjectIdentifier.getId());
        sb2.append(".");
        sb2.append(str);
        this.getHighSpeedVideoFpsRangesFor = sb2.toString();
    }
}
