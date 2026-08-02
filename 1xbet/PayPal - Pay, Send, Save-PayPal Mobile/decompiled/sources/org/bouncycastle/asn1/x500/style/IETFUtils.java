package org.bouncycastle.asn1.x500.style;

/* loaded from: classes17.dex */
public class IETFUtils {
    private static boolean getHighSpeedVideoFpsRanges(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    private static int getHighSpeedVideoSizes(char c) {
        return ('0' > c || c > '9') ? ('a' > c || c > 'f') ? c - '7' : c - 'W' : c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
    }

    public static boolean rDNAreEqual(org.bouncycastle.asn1.x500.RDN rdn, org.bouncycastle.asn1.x500.RDN rdn2) {
        if (rdn.size() != rdn2.size()) {
            return false;
        }
        org.bouncycastle.asn1.x500.AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        org.bouncycastle.asn1.x500.AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
        if (typesAndValues.length != typesAndValues2.length) {
            return false;
        }
        for (int i = 0; i != typesAndValues.length; i++) {
            org.bouncycastle.asn1.x500.AttributeTypeAndValue attributeTypeAndValue = typesAndValues[i];
            org.bouncycastle.asn1.x500.AttributeTypeAndValue attributeTypeAndValue2 = typesAndValues2[i];
            if (attributeTypeAndValue != attributeTypeAndValue2 && (attributeTypeAndValue == null || attributeTypeAndValue2 == null || !attributeTypeAndValue.getType().equals((org.bouncycastle.asn1.ASN1Primitive) attributeTypeAndValue2.getType()) || !canonicalString(attributeTypeAndValue.getValue()).equals(canonicalString(attributeTypeAndValue2.getValue())))) {
                return false;
            }
        }
        return true;
    }

    public static org.bouncycastle.asn1.x500.RDN[] rDNsFromString(java.lang.String str, org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle) {
        org.bouncycastle.asn1.x500.style.X500NameTokenizer x500NameTokenizer = new org.bouncycastle.asn1.x500.style.X500NameTokenizer(str);
        org.bouncycastle.asn1.x500.X500NameBuilder x500NameBuilder = new org.bouncycastle.asn1.x500.X500NameBuilder(x500NameStyle);
        while (x500NameTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = x500NameTokenizer.nextToken();
            if (nextToken.indexOf(43) > 0) {
                org.bouncycastle.asn1.x500.style.X500NameTokenizer x500NameTokenizer2 = new org.bouncycastle.asn1.x500.style.X500NameTokenizer(nextToken, '+');
                org.bouncycastle.asn1.x500.style.X500NameTokenizer x500NameTokenizer3 = new org.bouncycastle.asn1.x500.style.X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                java.lang.String nextToken2 = x500NameTokenizer3.nextToken();
                if (!x500NameTokenizer3.hasMoreTokens()) {
                    throw new java.lang.IllegalArgumentException("badly formatted directory string");
                }
                java.lang.String nextToken3 = x500NameTokenizer3.nextToken();
                org.bouncycastle.asn1.ASN1ObjectIdentifier attrNameToOID = x500NameStyle.attrNameToOID(nextToken2.trim());
                if (x500NameTokenizer2.hasMoreTokens()) {
                    java.util.Vector vector = new java.util.Vector();
                    java.util.Vector vector2 = new java.util.Vector();
                    while (true) {
                        vector.addElement(attrNameToOID);
                        vector2.addElement(getHighResolutionOutputSizeshNQ4ISI(nextToken3));
                        if (x500NameTokenizer2.hasMoreTokens()) {
                            org.bouncycastle.asn1.x500.style.X500NameTokenizer x500NameTokenizer4 = new org.bouncycastle.asn1.x500.style.X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                            java.lang.String nextToken4 = x500NameTokenizer4.nextToken();
                            if (!x500NameTokenizer4.hasMoreTokens()) {
                                throw new java.lang.IllegalArgumentException("badly formatted directory string");
                            }
                            nextToken3 = x500NameTokenizer4.nextToken();
                            attrNameToOID = x500NameStyle.attrNameToOID(nextToken4.trim());
                        } else {
                            int size = vector.size();
                            org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new org.bouncycastle.asn1.ASN1ObjectIdentifier[size];
                            for (int i = 0; i != size; i++) {
                                aSN1ObjectIdentifierArr[i] = (org.bouncycastle.asn1.ASN1ObjectIdentifier) vector.elementAt(i);
                            }
                            int size2 = vector2.size();
                            java.lang.String[] strArr = new java.lang.String[size2];
                            for (int i2 = 0; i2 != size2; i2++) {
                                strArr[i2] = (java.lang.String) vector2.elementAt(i2);
                            }
                            x500NameBuilder.addMultiValuedRDN(aSN1ObjectIdentifierArr, strArr);
                        }
                    }
                } else {
                    x500NameBuilder.addRDN(attrNameToOID, getHighResolutionOutputSizeshNQ4ISI(nextToken3));
                }
            } else {
                org.bouncycastle.asn1.x500.style.X500NameTokenizer x500NameTokenizer5 = new org.bouncycastle.asn1.x500.style.X500NameTokenizer(nextToken, '=');
                java.lang.String nextToken5 = x500NameTokenizer5.nextToken();
                if (!x500NameTokenizer5.hasMoreTokens()) {
                    throw new java.lang.IllegalArgumentException("badly formatted directory string");
                }
                x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(nextToken5.trim()), getHighResolutionOutputSizeshNQ4ISI(x500NameTokenizer5.nextToken()));
            }
        }
        return x500NameBuilder.build().getRDNs();
    }

    public static java.lang.String valueToString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1String) || (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1UniversalString)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(org.bouncycastle.util.encoders.Hex.toHexString(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            java.lang.String string = ((org.bouncycastle.asn1.ASN1String) aSN1Encodable).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(string);
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }

    public static org.bouncycastle.asn1.ASN1Encodable valueFromHexString(java.lang.String str, int i) throws java.io.IOException {
        int length = (str.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = (i2 * 2) + i;
            char charAt = str.charAt(i3);
            bArr[i2] = (byte) (getHighSpeedVideoSizes(str.charAt(i3 + 1)) | (getHighSpeedVideoSizes(charAt) << 4));
        }
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        char c = 0;
        boolean z3 = false;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 != '\"') {
                if (c2 == '\\' && !z && !z2) {
                    i2 = stringBuffer.length();
                    z = true;
                } else if (c2 != ' ' || z || z3) {
                    if (z && getHighSpeedVideoFpsRanges(c2)) {
                        if (c != 0) {
                            stringBuffer.append((char) ((getHighSpeedVideoSizes(c) * 16) + getHighSpeedVideoSizes(c2)));
                            z = false;
                            c = 0;
                        } else {
                            c = c2;
                        }
                    }
                }
                i++;
            } else if (!z) {
                z2 = !z2;
                z = false;
                i++;
            }
            stringBuffer.append(c2);
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static java.lang.String stripInternalSpaces(java.lang.String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static java.lang.String[] findAttrNamesForOID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.util.Hashtable hashtable) {
        java.util.Enumeration elements = hashtable.elements();
        int i = 0;
        int i2 = 0;
        while (elements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(elements.nextElement())) {
                i2++;
            }
        }
        java.lang.String[] strArr = new java.lang.String[i2];
        java.util.Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            java.lang.String str = (java.lang.String) keys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i] = str;
                i++;
            }
        }
        return strArr;
    }

    private static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoSizes(java.lang.String str) {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.util.encoders.Hex.decodeStrict(str, 1, str.length() - 1));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("unknown encoding in name: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier decodeAttrName(java.lang.String str, java.util.Hashtable hashtable) {
        if (org.bouncycastle.util.Strings.toUpperCase(str).startsWith("OID.")) {
            return new org.bouncycastle.asn1.ASN1ObjectIdentifier(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new org.bouncycastle.asn1.ASN1ObjectIdentifier(str);
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) hashtable.get(org.bouncycastle.util.Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown object id - ");
        sb.append(str);
        sb.append(" - passed to distinguished name");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r4 >= r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String canonicalize(java.lang.String str) {
        int i = 0;
        if (str.length() > 0 && str.charAt(0) == '#') {
            org.bouncycastle.asn1.ASN1Encodable highSpeedVideoSizes = getHighSpeedVideoSizes(str);
            if (highSpeedVideoSizes instanceof org.bouncycastle.asn1.ASN1String) {
                str = ((org.bouncycastle.asn1.ASN1String) highSpeedVideoSizes).getString();
            }
        }
        java.lang.String lowerCase = org.bouncycastle.util.Strings.toLowerCase(str);
        int length = lowerCase.length();
        if (length < 2) {
            return lowerCase;
        }
        int i2 = length - 1;
        while (i < i2 && lowerCase.charAt(i) == '\\' && lowerCase.charAt(i + 1) == ' ') {
            i += 2;
        }
        int i3 = i2;
        while (i3 > i + 1 && lowerCase.charAt(i3 - 1) == '\\' && lowerCase.charAt(i3) == ' ') {
            i3 -= 2;
        }
        lowerCase = lowerCase.substring(i, i3 + 1);
        return stripInternalSpaces(lowerCase);
    }

    public static java.lang.String canonicalString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        return canonicalize(valueToString(aSN1Encodable));
    }

    public static void appendTypeAndValue(java.lang.StringBuffer stringBuffer, org.bouncycastle.asn1.x500.AttributeTypeAndValue attributeTypeAndValue, java.util.Hashtable hashtable) {
        java.lang.String str = (java.lang.String) hashtable.get(attributeTypeAndValue.getType());
        if (str == null) {
            str = attributeTypeAndValue.getType().getId();
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    public static void appendRDN(java.lang.StringBuffer stringBuffer, org.bouncycastle.asn1.x500.RDN rdn, java.util.Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        org.bouncycastle.asn1.x500.AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z = true;
        for (int i = 0; i != typesAndValues.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            appendTypeAndValue(stringBuffer, typesAndValues[i], hashtable);
        }
    }
}
