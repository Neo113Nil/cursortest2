package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509Name extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier C;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier CN;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    private static final java.lang.Boolean Camera2StreamConfigurationMap;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DMD_NAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DN_QUALIFIER;
    public static final java.util.Hashtable DefaultLookUp;
    public static boolean DefaultReverse;
    public static final java.util.Hashtable DefaultSymbols;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier E;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier EmailAddress;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GENDER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GENERATION;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GIVENNAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier INITIALS;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier L;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier NAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier O;
    public static final java.util.Hashtable OIDLookUp;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier OU;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier POSTAL_CODE;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PSEUDONYM;
    public static final java.util.Hashtable RFC1779Symbols;
    public static final java.util.Hashtable RFC2253Symbols;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SERIALNUMBER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SN;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ST;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier STREET;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SURNAME;
    public static final java.util.Hashtable SymbolLookUp;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier T;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UID;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UnstructuredAddress;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UnstructuredName;
    private static final java.lang.Boolean getHighSpeedVideoFpsRangesFor;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.X509NameEntryConverter getHighSpeedVideoFpsRanges;
    private java.util.Vector getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizesFor;
    private java.util.Vector getInputSizeshNQ4ISI;
    private java.util.Vector getOutputFormats;
    private boolean getOutputMinFrameDuration;

    public X509Name(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Vector vector;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = new java.util.Vector();
        this.getInputSizeshNQ4ISI = new java.util.Vector();
        this.getHighSpeedVideoSizes = new java.util.Vector();
        this.getHighSpeedVideoSizesFor = aSN1Sequence;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Set aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive());
            int i = 0;
            while (i < aSN1Set.size()) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Set.getObjectAt(i).toASN1Primitive());
                if (aSN1Sequence2.size() != 2) {
                    throw new java.lang.IllegalArgumentException("badly sized pair");
                }
                this.getOutputFormats.addElement(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0)));
                org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence2.getObjectAt(1);
                if (!(objectAt instanceof org.bouncycastle.asn1.ASN1String) || (objectAt instanceof org.bouncycastle.asn1.ASN1UniversalString)) {
                    try {
                        java.util.Vector vector2 = this.getInputSizeshNQ4ISI;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("#");
                        byte[] encode = org.bouncycastle.util.encoders.Hex.encode(objectAt.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                        int length = encode.length;
                        char[] cArr = new char[length];
                        for (int i2 = 0; i2 != length; i2++) {
                            cArr[i2] = (char) (encode[i2] & 255);
                        }
                        sb.append(new java.lang.String(cArr));
                        vector2.addElement(sb.toString());
                    } catch (java.io.IOException unused) {
                        throw new java.lang.IllegalArgumentException("cannot encode value");
                    }
                } else {
                    java.lang.String string = ((org.bouncycastle.asn1.ASN1String) objectAt).getString();
                    if (string.length() <= 0 || string.charAt(0) != '#') {
                        vector = this.getInputSizeshNQ4ISI;
                    } else {
                        vector = this.getInputSizeshNQ4ISI;
                        string = "\\".concat(java.lang.String.valueOf(string));
                    }
                    vector.addElement(string);
                }
                this.getHighSpeedVideoSizes.addElement(i != 0 ? Camera2StreamConfigurationMap : getHighSpeedVideoFpsRangesFor);
                i++;
            }
        }
    }

    public java.lang.String toString(boolean z, java.util.Hashtable hashtable) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Vector vector = new java.util.Vector();
        java.lang.StringBuffer stringBuffer2 = null;
        for (int i = 0; i < this.getOutputFormats.size(); i++) {
            if (((java.lang.Boolean) this.getHighSpeedVideoSizes.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                getHighSpeedVideoFpsRanges(stringBuffer2, hashtable, (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getOutputFormats.elementAt(i), (java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i));
            } else {
                stringBuffer2 = new java.lang.StringBuffer();
                getHighSpeedVideoFpsRanges(stringBuffer2, hashtable, (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getOutputFormats.elementAt(i), (java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z2 = true;
        if (z) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(vector.elementAt(i2).toString());
            }
        }
        return stringBuffer.toString();
    }

    public java.lang.String toString() {
        return toString(DefaultReverse, DefaultSymbols);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.DERSequence dERSequence;
        if (this.getHighSpeedVideoSizesFor == null) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = null;
            int i = 0;
            while (i != this.getOutputFormats.size()) {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector(2);
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getOutputFormats.elementAt(i);
                aSN1EncodableVector3.add(aSN1ObjectIdentifier2);
                aSN1EncodableVector3.add(this.getHighSpeedVideoFpsRanges.getConvertedValue(aSN1ObjectIdentifier2, (java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i)));
                if (aSN1ObjectIdentifier == null || ((java.lang.Boolean) this.getHighSpeedVideoSizes.elementAt(i)).booleanValue()) {
                    dERSequence = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3);
                } else {
                    aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector2));
                    aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    dERSequence = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3);
                }
                aSN1EncodableVector2.add(dERSequence);
                i++;
                aSN1ObjectIdentifier = aSN1ObjectIdentifier2;
            }
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector2));
            this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        }
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.getOutputMinFrameDuration) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        this.getOutputMinFrameDuration = true;
        for (int i = 0; i != this.getOutputFormats.size(); i++) {
            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor((java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i)));
            int hashCode = this.getHighResolutionOutputSizeshNQ4ISI ^ this.getOutputFormats.elementAt(i).hashCode();
            this.getHighResolutionOutputSizeshNQ4ISI = hashCode;
            this.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI.hashCode() ^ hashCode;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Vector getValues(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.util.Vector vector = new java.util.Vector();
        for (int i = 0; i != this.getInputSizeshNQ4ISI.size(); i++) {
            if (this.getOutputFormats.elementAt(i).equals(aSN1ObjectIdentifier)) {
                java.lang.String str = (java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i);
                if (str.length() > 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
                    str = str.substring(1);
                }
                vector.addElement(str);
            }
        }
        return vector;
    }

    public java.util.Vector getValues() {
        java.util.Vector vector = new java.util.Vector();
        for (int i = 0; i != this.getInputSizeshNQ4ISI.size(); i++) {
            vector.addElement(this.getInputSizeshNQ4ISI.elementAt(i));
        }
        return vector;
    }

    public java.util.Vector getOIDs() {
        java.util.Vector vector = new java.util.Vector();
        for (int i = 0; i != this.getOutputFormats.size(); i++) {
            vector.addElement(this.getOutputFormats.elementAt(i));
        }
        return vector;
    }

    public boolean equals(java.lang.Object obj, boolean z) {
        if (!z) {
            return equals(obj);
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.asn1.x509.X509Name) && !(obj instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            org.bouncycastle.asn1.x509.X509Name x509Name = getInstance(obj);
            int size = this.getOutputFormats.size();
            if (size != x509Name.getOutputFormats.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!((org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getOutputFormats.elementAt(i)).equals((org.bouncycastle.asn1.ASN1Primitive) x509Name.getOutputFormats.elementAt(i)) || !getHighResolutionOutputSizeshNQ4ISI((java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i), (java.lang.String) x509Name.getInputSizeshNQ4ISI.elementAt(i))) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        r3[r9] = true;
        r4 = r4 + r6;
     */
    @Override // org.bouncycastle.asn1.ASN1Object
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.asn1.x509.X509Name) && !(obj instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            org.bouncycastle.asn1.x509.X509Name x509Name = getInstance(obj);
            int size = this.getOutputFormats.size();
            if (size != x509Name.getOutputFormats.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            if (this.getOutputFormats.elementAt(0).equals(x509Name.getOutputFormats.elementAt(0))) {
                i3 = 1;
                i2 = size;
                i = 0;
            } else {
                i = size - 1;
                i2 = -1;
                i3 = -1;
            }
            while (i != i2) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getOutputFormats.elementAt(i);
                java.lang.String str = (java.lang.String) this.getInputSizeshNQ4ISI.elementAt(i);
                int i4 = 0;
                while (i4 < size) {
                    if (zArr[i4] || !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) x509Name.getOutputFormats.elementAt(i4)) || !getHighResolutionOutputSizeshNQ4ISI(str, (java.lang.String) x509Name.getInputSizeshNQ4ISI.elementAt(i4))) {
                        i4++;
                    }
                }
                return false;
            }
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
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
        boolean z3 = false;
        while (i != charArray.length) {
            char c = charArray[i];
            if (c != ' ') {
                z3 = true;
            }
            if (c != '\"') {
                if (c == '\\' && !z && !z2) {
                    i2 = stringBuffer.length();
                    z = true;
                } else if (c == ' ' && !z && !z3) {
                }
                i++;
            } else if (!z) {
                z2 = !z2;
                z = false;
                i++;
            }
            stringBuffer.append(c);
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

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static org.bouncycastle.asn1.x509.X509Name getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.X509Name getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.X509Name) {
            return (org.bouncycastle.asn1.x509.X509Name) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.x500.X500Name) {
            return new org.bouncycastle.asn1.x509.X509Name(org.bouncycastle.asn1.ASN1Sequence.getInstance(((org.bouncycastle.asn1.x500.X500Name) obj).toASN1Primitive()));
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.X509Name(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
        java.lang.String highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(str2);
        return highSpeedVideoFpsRangesFor.equals(highSpeedVideoFpsRangesFor2) || getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor).equals(getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2));
    }

    private static org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.util.encoders.Hex.decodeStrict(str, 1, str.length() - 1));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("unknown encoding in name: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges(java.lang.String str, java.util.Hashtable hashtable) {
        java.lang.String trim = str.trim();
        if (org.bouncycastle.util.Strings.toUpperCase(trim).startsWith("OID.")) {
            return new org.bouncycastle.asn1.ASN1ObjectIdentifier(trim.substring(4));
        }
        if (trim.charAt(0) >= '0' && trim.charAt(0) <= '9') {
            return new org.bouncycastle.asn1.ASN1ObjectIdentifier(trim);
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) hashtable.get(org.bouncycastle.util.Strings.toLowerCase(trim));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown object id - ");
        sb.append(trim);
        sb.append(" - passed to distinguished name");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String lowerCase = org.bouncycastle.util.Strings.toLowerCase(str.trim());
        if (lowerCase.length() <= 0 || lowerCase.charAt(0) != '#') {
            return lowerCase;
        }
        org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(lowerCase);
        return Camera2StreamConfigurationMap2 instanceof org.bouncycastle.asn1.ASN1String ? org.bouncycastle.util.Strings.toLowerCase(((org.bouncycastle.asn1.ASN1String) Camera2StreamConfigurationMap2).getString().trim()) : lowerCase;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuffer stringBuffer, java.util.Hashtable hashtable, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) hashtable.get(aSN1ObjectIdentifier);
        if (str2 == null) {
            str2 = aSN1ObjectIdentifier.getId();
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    private void Camera2StreamConfigurationMap(java.util.Hashtable hashtable, java.lang.String str, java.lang.Boolean bool) {
        org.bouncycastle.asn1.x509.X509NameTokenizer x509NameTokenizer = new org.bouncycastle.asn1.x509.X509NameTokenizer(str, '=');
        java.lang.String nextToken = x509NameTokenizer.nextToken();
        if (!x509NameTokenizer.hasMoreTokens()) {
            throw new java.lang.IllegalArgumentException("badly formatted directory string");
        }
        java.lang.String nextToken2 = x509NameTokenizer.nextToken();
        this.getOutputFormats.addElement(getHighSpeedVideoFpsRanges(nextToken, hashtable));
        this.getInputSizeshNQ4ISI.addElement(getHighSpeedVideoSizes(nextToken2));
        this.getHighSpeedVideoSizes.addElement(bool);
    }

    public X509Name(boolean z, java.util.Hashtable hashtable, java.lang.String str, org.bouncycastle.asn1.x509.X509NameEntryConverter x509NameEntryConverter) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = new java.util.Vector();
        this.getInputSizeshNQ4ISI = new java.util.Vector();
        this.getHighSpeedVideoSizes = new java.util.Vector();
        this.getHighSpeedVideoFpsRanges = x509NameEntryConverter;
        org.bouncycastle.asn1.x509.X509NameTokenizer x509NameTokenizer = new org.bouncycastle.asn1.x509.X509NameTokenizer(str);
        while (x509NameTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = x509NameTokenizer.nextToken();
            if (nextToken.indexOf(43) > 0) {
                org.bouncycastle.asn1.x509.X509NameTokenizer x509NameTokenizer2 = new org.bouncycastle.asn1.x509.X509NameTokenizer(nextToken, '+');
                java.lang.String nextToken2 = x509NameTokenizer2.nextToken();
                java.lang.Boolean bool = getHighSpeedVideoFpsRangesFor;
                while (true) {
                    Camera2StreamConfigurationMap(hashtable, nextToken2, bool);
                    if (x509NameTokenizer2.hasMoreTokens()) {
                        nextToken2 = x509NameTokenizer2.nextToken();
                        bool = Camera2StreamConfigurationMap;
                    }
                }
            } else {
                Camera2StreamConfigurationMap(hashtable, nextToken, getHighSpeedVideoFpsRangesFor);
            }
        }
        if (z) {
            java.util.Vector vector = new java.util.Vector();
            java.util.Vector vector2 = new java.util.Vector();
            java.util.Vector vector3 = new java.util.Vector();
            int i = 1;
            for (int i2 = 0; i2 < this.getOutputFormats.size(); i2++) {
                if (((java.lang.Boolean) this.getHighSpeedVideoSizes.elementAt(i2)).booleanValue()) {
                    vector.insertElementAt(this.getOutputFormats.elementAt(i2), i);
                    vector2.insertElementAt(this.getInputSizeshNQ4ISI.elementAt(i2), i);
                    vector3.insertElementAt(this.getHighSpeedVideoSizes.elementAt(i2), i);
                    i++;
                } else {
                    vector.insertElementAt(this.getOutputFormats.elementAt(i2), 0);
                    vector2.insertElementAt(this.getInputSizeshNQ4ISI.elementAt(i2), 0);
                    vector3.insertElementAt(this.getHighSpeedVideoSizes.elementAt(i2), 0);
                    i = 1;
                }
            }
            this.getOutputFormats = vector;
            this.getInputSizeshNQ4ISI = vector2;
            this.getHighSpeedVideoSizes = vector3;
        }
    }

    public X509Name(boolean z, java.util.Hashtable hashtable, java.lang.String str) {
        this(z, hashtable, str, new org.bouncycastle.asn1.x509.X509DefaultEntryConverter());
    }

    public X509Name(boolean z, java.lang.String str, org.bouncycastle.asn1.x509.X509NameEntryConverter x509NameEntryConverter) {
        this(z, DefaultLookUp, str, x509NameEntryConverter);
    }

    public X509Name(boolean z, java.lang.String str) {
        this(z, DefaultLookUp, str);
    }

    public X509Name(java.util.Vector vector, java.util.Vector vector2, org.bouncycastle.asn1.x509.X509NameEntryConverter x509NameEntryConverter) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = new java.util.Vector();
        this.getInputSizeshNQ4ISI = new java.util.Vector();
        this.getHighSpeedVideoSizes = new java.util.Vector();
        this.getHighSpeedVideoFpsRanges = x509NameEntryConverter;
        if (vector.size() != vector2.size()) {
            throw new java.lang.IllegalArgumentException("oids vector must be same length as values.");
        }
        for (int i = 0; i < vector.size(); i++) {
            this.getOutputFormats.addElement(vector.elementAt(i));
            this.getInputSizeshNQ4ISI.addElement(vector2.elementAt(i));
            this.getHighSpeedVideoSizes.addElement(getHighSpeedVideoFpsRangesFor);
        }
    }

    public X509Name(java.util.Vector vector, java.util.Vector vector2) {
        this(vector, vector2, new org.bouncycastle.asn1.x509.X509DefaultEntryConverter());
    }

    public X509Name(java.util.Vector vector, java.util.Hashtable hashtable, org.bouncycastle.asn1.x509.X509NameEntryConverter x509NameEntryConverter) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = new java.util.Vector();
        this.getInputSizeshNQ4ISI = new java.util.Vector();
        this.getHighSpeedVideoSizes = new java.util.Vector();
        this.getHighSpeedVideoFpsRanges = x509NameEntryConverter;
        if (vector != null) {
            for (int i = 0; i != vector.size(); i++) {
                this.getOutputFormats.addElement(vector.elementAt(i));
                this.getHighSpeedVideoSizes.addElement(getHighSpeedVideoFpsRangesFor);
            }
        } else {
            java.util.Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                this.getOutputFormats.addElement(keys.nextElement());
                this.getHighSpeedVideoSizes.addElement(getHighSpeedVideoFpsRangesFor);
            }
        }
        for (int i2 = 0; i2 != this.getOutputFormats.size(); i2++) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getOutputFormats.elementAt(i2);
            if (hashtable.get(aSN1ObjectIdentifier) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No attribute for object id - ");
                sb.append(aSN1ObjectIdentifier.getId());
                sb.append(" - passed to distinguished name");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getInputSizeshNQ4ISI.addElement(hashtable.get(aSN1ObjectIdentifier));
        }
    }

    public X509Name(java.util.Vector vector, java.util.Hashtable hashtable) {
        this(vector, hashtable, new org.bouncycastle.asn1.x509.X509DefaultEntryConverter());
    }

    public X509Name(java.util.Hashtable hashtable) {
        this((java.util.Vector) null, hashtable);
    }

    public X509Name(java.lang.String str, org.bouncycastle.asn1.x509.X509NameEntryConverter x509NameEntryConverter) {
        this(DefaultReverse, DefaultLookUp, str, x509NameEntryConverter);
    }

    public X509Name(java.lang.String str) {
        this(DefaultReverse, DefaultLookUp, str);
    }

    protected X509Name() {
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = new java.util.Vector();
        this.getInputSizeshNQ4ISI = new java.util.Vector();
        this.getHighSpeedVideoSizes = new java.util.Vector();
    }

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.6");
        C = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.10");
        O = aSN1ObjectIdentifier2;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.11");
        OU = aSN1ObjectIdentifier3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.12");
        T = aSN1ObjectIdentifier4;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.3");
        CN = aSN1ObjectIdentifier5;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.5");
        SN = aSN1ObjectIdentifier6;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.9");
        STREET = aSN1ObjectIdentifier7;
        SERIALNUMBER = aSN1ObjectIdentifier6;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.7");
        L = aSN1ObjectIdentifier8;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.8");
        ST = aSN1ObjectIdentifier9;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.4");
        SURNAME = aSN1ObjectIdentifier10;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifier11;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.43");
        INITIALS = aSN1ObjectIdentifier12;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.44");
        GENERATION = aSN1ObjectIdentifier13;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier14 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifier14;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier15 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifier15;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier16 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifier16;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier17 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifier17;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier18 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifier18;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier19 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifier19;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier20 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifier20;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier21 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifier21;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier22 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifier22;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier23 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifier23;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier24 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifier24;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier25 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifier25;
        DMD_NAME = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.54");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier26 = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier26;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier27 = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier27;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier28 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier28;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier29 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier29;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier30 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier30;
        E = aSN1ObjectIdentifier28;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier31 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier31;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier32 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier32;
        DefaultReverse = false;
        java.util.Hashtable hashtable = new java.util.Hashtable();
        DefaultSymbols = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        RFC2253Symbols = hashtable2;
        java.util.Hashtable hashtable3 = new java.util.Hashtable();
        RFC1779Symbols = hashtable3;
        java.util.Hashtable hashtable4 = new java.util.Hashtable();
        DefaultLookUp = hashtable4;
        OIDLookUp = hashtable;
        SymbolLookUp = hashtable4;
        Camera2StreamConfigurationMap = java.lang.Boolean.TRUE;
        getHighSpeedVideoFpsRangesFor = java.lang.Boolean.FALSE;
        hashtable.put(aSN1ObjectIdentifier, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
        hashtable.put(aSN1ObjectIdentifier2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT);
        hashtable.put(aSN1ObjectIdentifier4, "T");
        hashtable.put(aSN1ObjectIdentifier3, "OU");
        hashtable.put(aSN1ObjectIdentifier5, "CN");
        hashtable.put(aSN1ObjectIdentifier8, "L");
        hashtable.put(aSN1ObjectIdentifier9, "ST");
        hashtable.put(aSN1ObjectIdentifier6, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier28, "E");
        hashtable.put(aSN1ObjectIdentifier31, "DC");
        hashtable.put(aSN1ObjectIdentifier32, "UID");
        hashtable.put(aSN1ObjectIdentifier7, "STREET");
        hashtable.put(aSN1ObjectIdentifier10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifier11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifier12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifier13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifier30, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier29, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifier14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifier17, "DN");
        hashtable.put(aSN1ObjectIdentifier18, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifier25, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifier24, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifier22, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifier23, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifier21, "Gender");
        hashtable.put(aSN1ObjectIdentifier20, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifier19, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifier16, "PostalCode");
        hashtable.put(aSN1ObjectIdentifier15, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier26, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier27, "Name");
        hashtable2.put(aSN1ObjectIdentifier, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
        hashtable2.put(aSN1ObjectIdentifier2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT);
        hashtable2.put(aSN1ObjectIdentifier3, "OU");
        hashtable2.put(aSN1ObjectIdentifier5, "CN");
        hashtable2.put(aSN1ObjectIdentifier8, "L");
        hashtable2.put(aSN1ObjectIdentifier9, "ST");
        hashtable2.put(aSN1ObjectIdentifier7, "STREET");
        hashtable2.put(aSN1ObjectIdentifier31, "DC");
        hashtable2.put(aSN1ObjectIdentifier32, "UID");
        hashtable3.put(aSN1ObjectIdentifier, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
        hashtable3.put(aSN1ObjectIdentifier2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT);
        hashtable3.put(aSN1ObjectIdentifier3, "OU");
        hashtable3.put(aSN1ObjectIdentifier5, "CN");
        hashtable3.put(aSN1ObjectIdentifier8, "L");
        hashtable3.put(aSN1ObjectIdentifier9, "ST");
        hashtable3.put(aSN1ObjectIdentifier7, "STREET");
        hashtable4.put("c", aSN1ObjectIdentifier);
        hashtable4.put("o", aSN1ObjectIdentifier2);
        hashtable4.put("t", aSN1ObjectIdentifier4);
        hashtable4.put("ou", aSN1ObjectIdentifier3);
        hashtable4.put("cn", aSN1ObjectIdentifier5);
        hashtable4.put("l", aSN1ObjectIdentifier8);
        hashtable4.put("st", aSN1ObjectIdentifier9);
        hashtable4.put("sn", aSN1ObjectIdentifier6);
        hashtable4.put("serialnumber", aSN1ObjectIdentifier6);
        hashtable4.put("street", aSN1ObjectIdentifier7);
        hashtable4.put("emailaddress", aSN1ObjectIdentifier28);
        hashtable4.put("dc", aSN1ObjectIdentifier31);
        hashtable4.put("e", aSN1ObjectIdentifier28);
        hashtable4.put("uid", aSN1ObjectIdentifier32);
        hashtable4.put("surname", aSN1ObjectIdentifier10);
        hashtable4.put("givenname", aSN1ObjectIdentifier11);
        hashtable4.put("initials", aSN1ObjectIdentifier12);
        hashtable4.put("generation", aSN1ObjectIdentifier13);
        hashtable4.put("unstructuredaddress", aSN1ObjectIdentifier30);
        hashtable4.put("unstructuredname", aSN1ObjectIdentifier29);
        hashtable4.put("uniqueidentifier", aSN1ObjectIdentifier14);
        hashtable4.put("dn", aSN1ObjectIdentifier17);
        hashtable4.put("pseudonym", aSN1ObjectIdentifier18);
        hashtable4.put("postaladdress", aSN1ObjectIdentifier25);
        hashtable4.put("nameofbirth", aSN1ObjectIdentifier24);
        hashtable4.put("countryofcitizenship", aSN1ObjectIdentifier22);
        hashtable4.put("countryofresidence", aSN1ObjectIdentifier23);
        hashtable4.put(androidx.autofill.HintConstants.AUTOFILL_HINT_GENDER, aSN1ObjectIdentifier21);
        hashtable4.put("placeofbirth", aSN1ObjectIdentifier20);
        hashtable4.put("dateofbirth", aSN1ObjectIdentifier19);
        hashtable4.put("postalcode", aSN1ObjectIdentifier16);
        hashtable4.put("businesscategory", aSN1ObjectIdentifier15);
        hashtable4.put("telephonenumber", aSN1ObjectIdentifier26);
        hashtable4.put("name", aSN1ObjectIdentifier27);
    }
}
