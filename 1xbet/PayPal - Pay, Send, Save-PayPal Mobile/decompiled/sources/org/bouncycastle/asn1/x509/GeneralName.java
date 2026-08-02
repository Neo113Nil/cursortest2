package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class GeneralName extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public GeneralName(int i, java.lang.String str) {
        int[] iArr;
        byte[] bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i == 1 || i == 2 || i == 6) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERIA5String(str);
            return;
        }
        if (i == 8) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1ObjectIdentifier(str);
            return;
        }
        if (i == 4) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x500.X500Name(str);
            return;
        }
        if (i != 7) {
            throw new java.lang.IllegalArgumentException("can't process String for tag: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = 0;
        if (org.bouncycastle.util.IPAddress.isValidIPv6WithNetmask(str) || org.bouncycastle.util.IPAddress.isValidIPv6(str)) {
            int indexOf = str.indexOf(47);
            if (indexOf < 0) {
                bArr = new byte[16];
                Camera2StreamConfigurationMap(getHighSpeedVideoSizes(str), bArr, 0);
            } else {
                byte[] bArr2 = new byte[32];
                Camera2StreamConfigurationMap(getHighSpeedVideoSizes(str.substring(0, indexOf)), bArr2, 0);
                java.lang.String substring = str.substring(indexOf + 1);
                if (substring.indexOf(58) > 0) {
                    iArr = getHighSpeedVideoSizes(substring);
                } else {
                    int[] iArr2 = new int[8];
                    int parseInt = java.lang.Integer.parseInt(substring);
                    while (i2 != parseInt) {
                        int i3 = i2 / 16;
                        iArr2[i3] = iArr2[i3] | (1 << (15 - (i2 % 16)));
                        i2++;
                    }
                    iArr = iArr2;
                }
                Camera2StreamConfigurationMap(iArr, bArr2, 16);
                bArr = bArr2;
            }
        } else if (org.bouncycastle.util.IPAddress.isValidIPv4WithNetmask(str) || org.bouncycastle.util.IPAddress.isValidIPv4(str)) {
            int indexOf2 = str.indexOf(47);
            if (indexOf2 < 0) {
                bArr = new byte[4];
                getHighSpeedVideoFpsRanges(str, bArr, 0);
            } else {
                byte[] bArr3 = new byte[8];
                getHighSpeedVideoFpsRanges(str.substring(0, indexOf2), bArr3, 0);
                java.lang.String substring2 = str.substring(indexOf2 + 1);
                if (substring2.indexOf(46) > 0) {
                    getHighSpeedVideoFpsRanges(substring2, bArr3, 4);
                } else {
                    int parseInt2 = java.lang.Integer.parseInt(substring2);
                    while (i2 != parseInt2) {
                        int i4 = (i2 / 8) + 4;
                        bArr3[i4] = (byte) (bArr3[i4] | (1 << (7 - (i2 % 8))));
                        i2++;
                    }
                }
                bArr = bArr3;
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("IP Address is invalid");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    public java.lang.String toString() {
        java.lang.String string;
        java.lang.Object x500Name;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.getHighResolutionOutputSizeshNQ4ISI);
        stringBuffer.append(": ");
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 1 && i != 2) {
            if (i == 4) {
                x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(this.getHighSpeedVideoFpsRangesFor);
            } else if (i != 6) {
                x500Name = this.getHighSpeedVideoFpsRangesFor;
            }
            string = x500Name.toString();
            stringBuffer.append(string);
            return stringBuffer.toString();
        }
        string = org.bouncycastle.asn1.ASN1IA5String.getInstance(this.getHighSpeedVideoFpsRangesFor).getString();
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        return new org.bouncycastle.asn1.DERTaggedObject(i == 4, i, this.getHighSpeedVideoFpsRangesFor);
    }

    public int getTagNo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Encodable getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private static int[] getHighSpeedVideoSizes(java.lang.String str) {
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, io.ktor.sse.ServerSentEventKt.COLON, true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i = -1;
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(io.ktor.sse.ServerSentEventKt.COLON)) {
                iArr[i2] = 0;
                i = i2;
                i2++;
            } else if (nextToken.indexOf(46) < 0) {
                iArr[i2] = java.lang.Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i2++;
            } else {
                java.util.StringTokenizer stringTokenizer2 = new java.util.StringTokenizer(nextToken, ".");
                iArr[i2] = (java.lang.Integer.parseInt(stringTokenizer2.nextToken()) << 8) | java.lang.Integer.parseInt(stringTokenizer2.nextToken());
                iArr[i2 + 1] = java.lang.Integer.parseInt(stringTokenizer2.nextToken()) | (java.lang.Integer.parseInt(stringTokenizer2.nextToken()) << 8);
                i2 += 2;
            }
        }
        if (i2 != 8) {
            int i3 = i2 - i;
            int i4 = 8 - i3;
            java.lang.System.arraycopy(iArr, i, iArr, i4, i3);
            while (i != i4) {
                iArr[i] = 0;
                i++;
            }
        }
        return iArr;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, byte[] bArr, int i) {
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, "./");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i2 + i] = (byte) java.lang.Integer.parseInt(stringTokenizer.nextToken());
            i2++;
        }
    }

    public static org.bouncycastle.asn1.x509.GeneralName getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }

    public static org.bouncycastle.asn1.x509.GeneralName getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.GeneralName)) {
            return (org.bouncycastle.asn1.x509.GeneralName) obj;
        }
        if (!(obj instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            if (obj instanceof byte[]) {
                try {
                    return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
                } catch (java.io.IOException unused) {
                    throw new java.lang.IllegalArgumentException("unable to parse encoded general name");
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) obj;
        int tagNo = aSN1TaggedObject.getTagNo();
        switch (tagNo) {
            case 0:
            case 3:
            case 5:
                return new org.bouncycastle.asn1.x509.GeneralName(tagNo, org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
            case 1:
            case 2:
            case 6:
                return new org.bouncycastle.asn1.x509.GeneralName(tagNo, org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1TaggedObject, false));
            case 4:
                return new org.bouncycastle.asn1.x509.GeneralName(tagNo, org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1TaggedObject, true));
            case 7:
                return new org.bouncycastle.asn1.x509.GeneralName(tagNo, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false));
            case 8:
                return new org.bouncycastle.asn1.x509.GeneralName(tagNo, org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1TaggedObject, false));
            default:
                throw new java.lang.IllegalArgumentException("unknown tag: ".concat(java.lang.String.valueOf(tagNo)));
        }
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 != iArr.length; i2++) {
            int i3 = i2 * 2;
            int i4 = iArr[i2];
            bArr[i3 + i] = (byte) (i4 >> 8);
            bArr[i3 + 1 + i] = (byte) i4;
        }
    }

    public GeneralName(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name);
        this.getHighResolutionOutputSizeshNQ4ISI = 4;
    }

    public GeneralName(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
        this.getHighResolutionOutputSizeshNQ4ISI = 4;
    }

    public GeneralName(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
