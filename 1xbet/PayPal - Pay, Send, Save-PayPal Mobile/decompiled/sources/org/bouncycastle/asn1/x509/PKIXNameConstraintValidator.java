package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class PKIXNameConstraintValidator implements org.bouncycastle.asn1.x509.NameConstraintValidator {
    private java.util.Set getHighSpeedVideoSizesFor;
    private java.util.Set getInputFormats;
    private java.util.Set getInputSizeshNQ4ISI;
    private java.util.Set getOutputMinFrameDuration;
    private java.util.Set getOutputMinFrameDurationlomOqCM;
    private java.util.Set getOutputStallDurationlomOqCM;
    private java.util.Set getHighSpeedVideoSizes = new java.util.HashSet();
    private java.util.Set getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
    private java.util.Set Camera2StreamConfigurationMap = new java.util.HashSet();
    private java.util.Set getOutputFormats = new java.util.HashSet();
    private java.util.Set getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
    private java.util.Set getHighSpeedVideoFpsRanges = new java.util.HashSet();

    private static boolean getHighSpeedVideoSizes(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (java.lang.Object obj : collection) {
            for (java.lang.Object obj2 : collection2) {
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if (((obj instanceof byte[]) && (obj2 instanceof byte[])) ? org.bouncycastle.util.Arrays.areEqual((byte[]) obj, (byte[]) obj2) : obj.equals(obj2)) {
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        java.lang.String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        java.lang.String substring2 = substring.substring(substring.indexOf(58) + 1);
        java.lang.String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        if (substring3.indexOf(47) != -1) {
            substring3 = substring3.substring(0, substring3.indexOf(47));
        }
        if (str2.startsWith(".")) {
            if (Camera2StreamConfigurationMap(substring3, str2)) {
                return true;
            }
        } else if (substring3.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Set set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            boolean z = true;
            if (sb.length() > 1) {
                sb.append(",");
            }
            byte[] bArr = (byte[]) it.next();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            for (int i = 0; i < bArr.length / 2; i++) {
                if (sb2.length() > 0) {
                    sb2.append(".");
                }
                sb2.append(java.lang.Integer.toString(bArr[i] & 255));
            }
            sb2.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            for (int length = bArr.length / 2; length < bArr.length; length++) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(".");
                }
                sb2.append(java.lang.Integer.toString(bArr[length] & 255));
            }
            sb.append(sb2.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x02cc, code lost:
    
        if (Camera2StreamConfigurationMap(r6, r10) != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        if (Camera2StreamConfigurationMap(r6, r10) != false) goto L46;
     */
    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addExcludedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree) {
        org.bouncycastle.asn1.x509.GeneralName base = generalSubtree.getBase();
        int tagNo = base.getTagNo();
        if (tagNo == 0) {
            java.util.Set set = this.getHighSpeedVideoFpsRanges;
            org.bouncycastle.asn1.x509.OtherName otherName = org.bouncycastle.asn1.x509.OtherName.getInstance(base.getName());
            java.util.HashSet hashSet = set != null ? new java.util.HashSet(set) : new java.util.HashSet();
            hashSet.add(otherName);
            this.getHighSpeedVideoFpsRanges = hashSet;
            return;
        }
        if (tagNo == 1) {
            java.util.Set<java.lang.String> set2 = this.Camera2StreamConfigurationMap;
            java.lang.String string = org.bouncycastle.asn1.ASN1IA5String.getInstance(base.getName()).getString();
            if (!set2.isEmpty()) {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                for (java.lang.String str : set2) {
                    if (str.indexOf(64) != -1) {
                        java.lang.String substring = str.substring(str.indexOf(64) + 1);
                        if (string.indexOf(64) != -1) {
                            boolean equalsIgnoreCase = str.equalsIgnoreCase(string);
                            hashSet2.add(str);
                            if (!equalsIgnoreCase) {
                            }
                        } else if (string.startsWith(".")) {
                            hashSet2.add(str);
                        } else {
                            hashSet2.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (string.indexOf(64) != -1) {
                            boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(string.substring(str.indexOf(64) + 1), str);
                            hashSet2.add(str);
                            if (!Camera2StreamConfigurationMap) {
                            }
                        } else if (!string.startsWith(".")) {
                            boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(string, str);
                            hashSet2.add(str);
                            if (!Camera2StreamConfigurationMap2) {
                            }
                        } else if (!Camera2StreamConfigurationMap(str, string) && !str.equalsIgnoreCase(string)) {
                            boolean Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(string, str);
                            hashSet2.add(str);
                            if (!Camera2StreamConfigurationMap3) {
                            }
                        }
                    } else if (string.indexOf(64) != -1) {
                        boolean equalsIgnoreCase2 = string.substring(str.indexOf(64) + 1).equalsIgnoreCase(str);
                        hashSet2.add(str);
                        if (!equalsIgnoreCase2) {
                        }
                    } else if (!string.startsWith(".")) {
                        boolean equalsIgnoreCase3 = str.equalsIgnoreCase(string);
                        hashSet2.add(str);
                        if (!equalsIgnoreCase3) {
                        }
                    }
                    hashSet2.add(string);
                }
                set2 = hashSet2;
            } else if (string != null) {
                set2.add(string);
            }
            this.Camera2StreamConfigurationMap = set2;
            return;
        }
        if (tagNo == 2) {
            java.util.Set<java.lang.String> set3 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String string2 = org.bouncycastle.asn1.ASN1IA5String.getInstance(base.getName()).getString();
            if (!set3.isEmpty()) {
                java.util.HashSet hashSet3 = new java.util.HashSet();
                for (java.lang.String str2 : set3) {
                    if (!Camera2StreamConfigurationMap(str2, string2)) {
                        boolean Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(string2, str2);
                        hashSet3.add(str2);
                        if (Camera2StreamConfigurationMap4) {
                        }
                    }
                    hashSet3.add(string2);
                }
                set3 = hashSet3;
            } else if (string2 != null) {
                set3.add(string2);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = set3;
            return;
        }
        if (tagNo == 4) {
            java.util.Set set4 = this.getHighSpeedVideoSizes;
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) base.getName().toASN1Primitive();
            if (!set4.isEmpty()) {
                java.util.HashSet hashSet4 = new java.util.HashSet();
                java.util.Iterator it = set4.iterator();
                while (it.hasNext()) {
                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(it.next());
                    if (getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence, aSN1Sequence2)) {
                        hashSet4.add(aSN1Sequence2);
                    } else {
                        if (!getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence2, aSN1Sequence)) {
                            hashSet4.add(aSN1Sequence2);
                        }
                        hashSet4.add(aSN1Sequence);
                    }
                }
                set4 = hashSet4;
            } else if (aSN1Sequence != null) {
                set4.add(aSN1Sequence);
            }
            this.getHighSpeedVideoSizes = set4;
            return;
        }
        if (tagNo != 6) {
            if (tagNo != 7) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered: ");
                sb.append(base.getTagNo());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            java.util.Set<byte[]> set5 = this.getHighSpeedVideoFpsRangesFor;
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(base.getName()).getOctets();
            if (!set5.isEmpty()) {
                java.util.HashSet hashSet5 = new java.util.HashSet();
                for (byte[] bArr : set5) {
                    java.util.HashSet hashSet6 = new java.util.HashSet();
                    boolean areEqual = org.bouncycastle.util.Arrays.areEqual(bArr, octets);
                    hashSet6.add(bArr);
                    if (!areEqual) {
                        hashSet6.add(octets);
                    }
                    hashSet5.addAll(hashSet6);
                }
                set5 = hashSet5;
            } else if (octets != null) {
                set5.add(octets);
            }
            this.getHighSpeedVideoFpsRangesFor = set5;
            return;
        }
        java.util.Set<java.lang.String> set6 = this.getOutputFormats;
        java.lang.String string3 = org.bouncycastle.asn1.ASN1IA5String.getInstance(base.getName()).getString();
        if (!set6.isEmpty()) {
            java.util.HashSet hashSet7 = new java.util.HashSet();
            for (java.lang.String str3 : set6) {
                if (str3.indexOf(64) != -1) {
                    java.lang.String substring2 = str3.substring(str3.indexOf(64) + 1);
                    if (string3.indexOf(64) != -1) {
                        boolean equalsIgnoreCase4 = str3.equalsIgnoreCase(string3);
                        hashSet7.add(str3);
                        if (!equalsIgnoreCase4) {
                        }
                    } else if (string3.startsWith(".")) {
                        hashSet7.add(str3);
                    } else {
                        hashSet7.add(str3);
                    }
                } else if (str3.startsWith(".")) {
                    if (string3.indexOf(64) != -1) {
                        boolean Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(string3.substring(str3.indexOf(64) + 1), str3);
                        hashSet7.add(str3);
                        if (!Camera2StreamConfigurationMap5) {
                        }
                    } else if (!string3.startsWith(".")) {
                        boolean Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(string3, str3);
                        hashSet7.add(str3);
                        if (!Camera2StreamConfigurationMap6) {
                        }
                    } else if (!Camera2StreamConfigurationMap(str3, string3) && !str3.equalsIgnoreCase(string3)) {
                        boolean Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(string3, str3);
                        hashSet7.add(str3);
                        if (!Camera2StreamConfigurationMap7) {
                        }
                    }
                } else if (string3.indexOf(64) != -1) {
                    boolean equalsIgnoreCase5 = string3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(str3);
                    hashSet7.add(str3);
                    if (!equalsIgnoreCase5) {
                    }
                } else if (!string3.startsWith(".")) {
                    boolean equalsIgnoreCase6 = str3.equalsIgnoreCase(string3);
                    hashSet7.add(str3);
                    if (!equalsIgnoreCase6) {
                    }
                }
                hashSet7.add(string3);
            }
            set6 = hashSet7;
        } else if (string3 != null) {
            set6.add(string3);
        }
        this.getOutputFormats = set6;
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkExcluded(org.bouncycastle.asn1.x509.GeneralName generalName) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            java.util.Set set = this.getHighSpeedVideoFpsRanges;
            org.bouncycastle.asn1.x509.OtherName otherName = org.bouncycastle.asn1.x509.OtherName.getInstance(generalName.getName());
            if (set.isEmpty()) {
                return;
            }
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                if (org.bouncycastle.asn1.x509.OtherName.getInstance(it.next()).equals(otherName)) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("OtherName is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo == 1) {
            java.util.Set set2 = this.Camera2StreamConfigurationMap;
            java.lang.String string = org.bouncycastle.asn1.ASN1IA5String.getInstance(generalName.getName()).getString();
            if (set2.isEmpty()) {
                return;
            }
            java.util.Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                if (getHighSpeedVideoSizes(string, (java.lang.String) it2.next())) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("Email address is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo == 2) {
            java.util.Set<java.lang.String> set3 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String string2 = org.bouncycastle.asn1.ASN1IA5String.getInstance(generalName.getName()).getString();
            if (set3.isEmpty()) {
                return;
            }
            for (java.lang.String str : set3) {
                if (Camera2StreamConfigurationMap(string2, str) || string2.equalsIgnoreCase(str)) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("DNS is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo == 4) {
            checkExcludedDN(org.bouncycastle.asn1.x500.X500Name.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 6) {
            java.util.Set set4 = this.getOutputFormats;
            java.lang.String string3 = org.bouncycastle.asn1.ASN1IA5String.getInstance(generalName.getName()).getString();
            if (set4.isEmpty()) {
                return;
            }
            java.util.Iterator it3 = set4.iterator();
            while (it3.hasNext()) {
                if (getHighSpeedVideoFpsRanges(string3, (java.lang.String) it3.next())) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("URI is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo != 7) {
            return;
        }
        java.util.Set set5 = this.getHighSpeedVideoFpsRangesFor;
        byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(generalName.getName()).getOctets();
        if (set5.isEmpty()) {
            return;
        }
        java.util.Iterator it4 = set5.iterator();
        while (it4.hasNext()) {
            if (getHighSpeedVideoFpsRangesFor(octets, (byte[]) it4.next())) {
                throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("IP is from an excluded subtree.");
            }
        }
    }

    public void checkExcludedDN(org.bouncycastle.asn1.x500.X500Name x500Name) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException {
        java.util.Set set = this.getHighSpeedVideoSizes;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(x500Name);
        if (set.isEmpty()) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence, (org.bouncycastle.asn1.ASN1Sequence) it.next())) {
                throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkPermitted(org.bouncycastle.asn1.x509.GeneralName generalName) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            java.util.Set set = this.getOutputMinFrameDurationlomOqCM;
            org.bouncycastle.asn1.x509.OtherName otherName = org.bouncycastle.asn1.x509.OtherName.getInstance(generalName.getName());
            if (set != null) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (org.bouncycastle.asn1.x509.OtherName.getInstance(it.next()).equals(otherName)) {
                        return;
                    }
                }
                throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("Subject OtherName is not from a permitted subtree.");
            }
            return;
        }
        if (tagNo == 1) {
            java.util.Set set2 = this.getOutputMinFrameDuration;
            java.lang.String string = org.bouncycastle.asn1.ASN1IA5String.getInstance(generalName.getName()).getString();
            if (set2 != null) {
                java.util.Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (getHighSpeedVideoSizes(string, (java.lang.String) it2.next())) {
                        return;
                    }
                }
                if (string.length() != 0 || set2.size() != 0) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("Subject email address is not from a permitted subtree.");
                }
                return;
            }
            return;
        }
        if (tagNo == 2) {
            java.util.Set<java.lang.String> set3 = this.getHighSpeedVideoSizesFor;
            java.lang.String string2 = org.bouncycastle.asn1.ASN1IA5String.getInstance(generalName.getName()).getString();
            if (set3 != null) {
                for (java.lang.String str : set3) {
                    if (Camera2StreamConfigurationMap(string2, str) || string2.equalsIgnoreCase(str)) {
                        return;
                    }
                }
                if (string2.length() != 0 || set3.size() != 0) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("DNS is not from a permitted subtree.");
                }
                return;
            }
            return;
        }
        if (tagNo == 4) {
            checkPermittedDN(org.bouncycastle.asn1.x500.X500Name.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 6) {
            java.util.Set set4 = this.getOutputStallDurationlomOqCM;
            java.lang.String string3 = org.bouncycastle.asn1.ASN1IA5String.getInstance(generalName.getName()).getString();
            if (set4 != null) {
                java.util.Iterator it3 = set4.iterator();
                while (it3.hasNext()) {
                    if (getHighSpeedVideoFpsRanges(string3, (java.lang.String) it3.next())) {
                        return;
                    }
                }
                if (string3.length() != 0 || set4.size() != 0) {
                    throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("URI is not from a permitted subtree.");
                }
                return;
            }
            return;
        }
        if (tagNo != 7) {
            return;
        }
        java.util.Set set5 = this.getInputFormats;
        byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(generalName.getName()).getOctets();
        if (set5 != null) {
            java.util.Iterator it4 = set5.iterator();
            while (it4.hasNext()) {
                if (getHighSpeedVideoFpsRangesFor(octets, (byte[]) it4.next())) {
                    return;
                }
            }
            if (octets.length != 0 || set5.size() != 0) {
                throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("IP is not from a permitted subtree.");
            }
        }
    }

    public void checkPermittedDN(org.bouncycastle.asn1.x500.X500Name x500Name) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException {
        java.util.Set set = this.getInputSizeshNQ4ISI;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(x500Name.toASN1Primitive());
        if (set != null) {
            if (set.isEmpty() && aSN1Sequence.size() == 0) {
                return;
            }
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                if (getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence, (org.bouncycastle.asn1.ASN1Sequence) it.next())) {
                    return;
                }
            }
            throw new org.bouncycastle.asn1.x509.NameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr) {
        java.util.Iterator it;
        int i;
        java.util.Iterator it2;
        java.util.Iterator it3;
        java.util.Set set;
        java.util.Set set2;
        int i2;
        int i3;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i4 = 0;
        for (int i5 = 0; i5 != generalSubtreeArr.length; i5++) {
            org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree = generalSubtreeArr[i5];
            java.lang.Integer valueOf = org.bouncycastle.util.Integers.valueOf(generalSubtree.getBase().getTagNo());
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, new java.util.HashSet());
            }
            ((java.util.Set) hashMap.get(valueOf)).add(generalSubtree);
        }
        java.util.Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it4.next();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if (intValue != 0) {
                char c = 1;
                if (intValue != 1) {
                    int i6 = 2;
                    if (intValue == 2) {
                        it = it4;
                        i = i4;
                        java.util.Set<java.lang.String> set3 = this.getHighSpeedVideoSizesFor;
                        java.util.Set set4 = (java.util.Set) entry.getValue();
                        java.util.HashSet hashSet = new java.util.HashSet();
                        java.util.Iterator it5 = set4.iterator();
                        while (it5.hasNext()) {
                            java.lang.String string = org.bouncycastle.asn1.ASN1IA5String.getInstance(((org.bouncycastle.asn1.x509.GeneralSubtree) it5.next()).getBase().getName()).getString();
                            if (set3 != null) {
                                for (java.lang.String str : set3) {
                                    if (Camera2StreamConfigurationMap(str, string)) {
                                        hashSet.add(str);
                                    } else if (Camera2StreamConfigurationMap(string, str)) {
                                        hashSet.add(string);
                                    }
                                }
                            } else if (string != null) {
                                hashSet.add(string);
                            }
                        }
                        this.getHighSpeedVideoSizesFor = hashSet;
                    } else if (intValue == 4) {
                        it = it4;
                        i = i4;
                        java.util.Set<org.bouncycastle.asn1.ASN1Sequence> set5 = this.getInputSizeshNQ4ISI;
                        java.util.Set set6 = (java.util.Set) entry.getValue();
                        java.util.HashSet hashSet2 = new java.util.HashSet();
                        java.util.Iterator it6 = set6.iterator();
                        while (it6.hasNext()) {
                            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(((org.bouncycastle.asn1.x509.GeneralSubtree) it6.next()).getBase().getName().toASN1Primitive());
                            if (set5 != null) {
                                for (org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 : set5) {
                                    if (getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence, aSN1Sequence2)) {
                                        hashSet2.add(aSN1Sequence);
                                    } else if (getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence2, aSN1Sequence)) {
                                        hashSet2.add(aSN1Sequence2);
                                    }
                                }
                            } else if (aSN1Sequence != null) {
                                hashSet2.add(aSN1Sequence);
                            }
                        }
                        this.getInputSizeshNQ4ISI = hashSet2;
                    } else if (intValue == 6) {
                        it = it4;
                        i = i4;
                        java.util.Set<java.lang.String> set7 = this.getOutputStallDurationlomOqCM;
                        java.util.Set set8 = (java.util.Set) entry.getValue();
                        java.util.HashSet hashSet3 = new java.util.HashSet();
                        java.util.Iterator it7 = set8.iterator();
                        while (it7.hasNext()) {
                            java.lang.String string2 = org.bouncycastle.asn1.ASN1IA5String.getInstance(((org.bouncycastle.asn1.x509.GeneralSubtree) it7.next()).getBase().getName()).getString();
                            if (set7 != null) {
                                for (java.lang.String str2 : set7) {
                                    if (str2.indexOf(64) != -1) {
                                        java.lang.String substring = str2.substring(str2.indexOf(64) + 1);
                                        if (string2.indexOf(64) != -1) {
                                            if (str2.equalsIgnoreCase(string2)) {
                                                hashSet3.add(str2);
                                            }
                                        } else if (string2.startsWith(".")) {
                                            if (Camera2StreamConfigurationMap(substring, string2)) {
                                                hashSet3.add(str2);
                                            }
                                        } else if (substring.equalsIgnoreCase(string2)) {
                                            hashSet3.add(str2);
                                        }
                                    } else if (str2.startsWith(".")) {
                                        if (string2.indexOf(64) != -1) {
                                            if (Camera2StreamConfigurationMap(string2.substring(str2.indexOf(64) + 1), str2)) {
                                                hashSet3.add(string2);
                                            }
                                        } else if (string2.startsWith(".")) {
                                            if (!Camera2StreamConfigurationMap(str2, string2) && !str2.equalsIgnoreCase(string2)) {
                                                if (Camera2StreamConfigurationMap(string2, str2)) {
                                                    hashSet3.add(string2);
                                                }
                                            }
                                            hashSet3.add(str2);
                                        } else if (Camera2StreamConfigurationMap(string2, str2)) {
                                            hashSet3.add(string2);
                                        }
                                    } else if (string2.indexOf(64) != -1) {
                                        if (string2.substring(string2.indexOf(64) + 1).equalsIgnoreCase(str2)) {
                                            hashSet3.add(string2);
                                        }
                                    } else if (string2.startsWith(".")) {
                                        if (Camera2StreamConfigurationMap(str2, string2)) {
                                            hashSet3.add(str2);
                                        }
                                    } else if (str2.equalsIgnoreCase(string2)) {
                                        hashSet3.add(str2);
                                    }
                                }
                            } else if (string2 != null) {
                                hashSet3.add(string2);
                            }
                        }
                        this.getOutputStallDurationlomOqCM = hashSet3;
                    } else {
                        if (intValue != 7) {
                            throw new java.lang.IllegalStateException("Unknown tag encountered: ".concat(java.lang.String.valueOf(intValue)));
                        }
                        java.util.Set<byte[]> set9 = this.getInputFormats;
                        java.util.Set set10 = (java.util.Set) entry.getValue();
                        java.util.HashSet hashSet4 = new java.util.HashSet();
                        java.util.Iterator it8 = set10.iterator();
                        while (it8.hasNext()) {
                            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(((org.bouncycastle.asn1.x509.GeneralSubtree) it8.next()).getBase().getName()).getOctets();
                            if (set9 != null) {
                                for (byte[] bArr : set9) {
                                    if (bArr.length != octets.length) {
                                        set2 = java.util.Collections.EMPTY_SET;
                                        it2 = it4;
                                        it3 = it8;
                                        set = set9;
                                        i2 = i6;
                                        i3 = i4;
                                    } else {
                                        int length = bArr.length / i6;
                                        byte[] bArr2 = new byte[length];
                                        byte[] bArr3 = new byte[length];
                                        java.lang.System.arraycopy(bArr, i4, bArr2, i4, length);
                                        java.lang.System.arraycopy(bArr, length, bArr3, i4, length);
                                        byte[] bArr4 = new byte[length];
                                        byte[] bArr5 = new byte[length];
                                        java.lang.System.arraycopy(octets, i4, bArr4, i4, length);
                                        java.lang.System.arraycopy(octets, length, bArr5, i4, length);
                                        byte[][] bArr6 = {bArr2, bArr3, bArr4, bArr5};
                                        byte[] bArr7 = bArr6[i4];
                                        byte[] bArr8 = bArr6[c];
                                        byte[] bArr9 = bArr6[i6];
                                        byte[] bArr10 = bArr6[3];
                                        int length2 = bArr7.length;
                                        byte[] bArr11 = new byte[length2];
                                        byte[] bArr12 = new byte[length2];
                                        byte[] bArr13 = new byte[length2];
                                        byte[] bArr14 = new byte[length2];
                                        it2 = it4;
                                        int i7 = 0;
                                        while (i7 < length2) {
                                            java.util.Iterator it9 = it8;
                                            bArr11[i7] = (byte) (bArr7[i7] & bArr8[i7]);
                                            byte b = bArr7[i7];
                                            java.util.Set set11 = set9;
                                            byte b2 = bArr8[i7];
                                            bArr12[i7] = (byte) ((b & b2) | (~b2));
                                            bArr13[i7] = (byte) (bArr9[i7] & bArr10[i7]);
                                            byte b3 = bArr9[i7];
                                            byte b4 = bArr10[i7];
                                            bArr14[i7] = (byte) ((b3 & b4) | (~b4));
                                            i7++;
                                            set9 = set11;
                                            it8 = it9;
                                        }
                                        it3 = it8;
                                        set = set9;
                                        byte[][] bArr15 = {bArr11, bArr12, bArr13, bArr14};
                                        byte[] bArr16 = bArr15[1];
                                        byte[] bArr17 = bArr15[3];
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= bArr16.length) {
                                                bArr16 = bArr17;
                                                break;
                                            } else if ((bArr16[i8] & 65535) < (65535 & bArr17[i8])) {
                                                break;
                                            } else {
                                                i8++;
                                            }
                                        }
                                        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr15[0], bArr15[2]);
                                        if (!org.bouncycastle.util.Arrays.areEqual(highResolutionOutputSizeshNQ4ISI, bArr16) && org.bouncycastle.util.Arrays.areEqual(getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, bArr16), highResolutionOutputSizeshNQ4ISI)) {
                                            set2 = java.util.Collections.EMPTY_SET;
                                            i2 = 2;
                                            i3 = 0;
                                        } else {
                                            byte[] bArr18 = bArr15[0];
                                            i2 = 2;
                                            byte[] bArr19 = bArr15[2];
                                            int length3 = bArr18.length;
                                            byte[] bArr20 = new byte[length3];
                                            for (int i9 = 0; i9 < bArr18.length; i9++) {
                                                bArr20[i9] = (byte) (bArr18[i9] | bArr19[i9]);
                                            }
                                            byte[] bArr21 = new byte[bArr8.length];
                                            for (int i10 = 0; i10 < bArr8.length; i10++) {
                                                bArr21[i10] = (byte) (bArr8[i10] | bArr10[i10]);
                                            }
                                            byte[] bArr22 = new byte[length3 * 2];
                                            i3 = 0;
                                            java.lang.System.arraycopy(bArr20, 0, bArr22, 0, length3);
                                            java.lang.System.arraycopy(bArr21, 0, bArr22, length3, length3);
                                            set2 = java.util.Collections.singleton(bArr22);
                                        }
                                    }
                                    hashSet4.addAll(set2);
                                    i4 = i3;
                                    it4 = it2;
                                    set9 = set;
                                    c = 1;
                                    i6 = i2;
                                    it8 = it3;
                                }
                            } else if (octets != null) {
                                hashSet4.add(octets);
                            }
                        }
                        this.getInputFormats = hashSet4;
                    }
                } else {
                    it = it4;
                    i = i4;
                    java.util.Set<java.lang.String> set12 = this.getOutputMinFrameDuration;
                    java.util.Set set13 = (java.util.Set) entry.getValue();
                    java.util.HashSet hashSet5 = new java.util.HashSet();
                    java.util.Iterator it10 = set13.iterator();
                    while (it10.hasNext()) {
                        java.lang.String string3 = org.bouncycastle.asn1.ASN1IA5String.getInstance(((org.bouncycastle.asn1.x509.GeneralSubtree) it10.next()).getBase().getName()).getString();
                        if (set12 != null) {
                            for (java.lang.String str3 : set12) {
                                if (string3.indexOf(64) != -1) {
                                    java.lang.String substring2 = string3.substring(string3.indexOf(64) + 1);
                                    if (str3.indexOf(64) != -1) {
                                        if (string3.equalsIgnoreCase(str3)) {
                                            hashSet5.add(string3);
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (Camera2StreamConfigurationMap(substring2, str3)) {
                                            hashSet5.add(string3);
                                        }
                                    } else if (substring2.equalsIgnoreCase(str3)) {
                                        hashSet5.add(string3);
                                    }
                                } else if (string3.startsWith(".")) {
                                    if (str3.indexOf(64) != -1) {
                                        if (Camera2StreamConfigurationMap(str3.substring(string3.indexOf(64) + 1), string3)) {
                                            hashSet5.add(str3);
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (!Camera2StreamConfigurationMap(string3, str3) && !string3.equalsIgnoreCase(str3)) {
                                            if (Camera2StreamConfigurationMap(str3, string3)) {
                                                hashSet5.add(str3);
                                            }
                                        }
                                        hashSet5.add(string3);
                                    } else if (Camera2StreamConfigurationMap(str3, string3)) {
                                        hashSet5.add(str3);
                                    }
                                } else if (str3.indexOf(64) != -1) {
                                    if (str3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(string3)) {
                                        hashSet5.add(str3);
                                    }
                                } else if (str3.startsWith(".")) {
                                    if (Camera2StreamConfigurationMap(string3, str3)) {
                                        hashSet5.add(string3);
                                    }
                                } else if (string3.equalsIgnoreCase(str3)) {
                                    hashSet5.add(string3);
                                }
                            }
                        } else if (string3 != null) {
                            hashSet5.add(string3);
                        }
                    }
                    this.getOutputMinFrameDuration = hashSet5;
                }
            } else {
                it = it4;
                i = i4;
                java.util.Set set14 = this.getOutputMinFrameDurationlomOqCM;
                java.util.Set set15 = (java.util.Set) entry.getValue();
                java.util.HashSet hashSet6 = new java.util.HashSet();
                java.util.Iterator it11 = set15.iterator();
                while (it11.hasNext()) {
                    org.bouncycastle.asn1.x509.OtherName otherName = org.bouncycastle.asn1.x509.OtherName.getInstance(((org.bouncycastle.asn1.x509.GeneralSubtree) it11.next()).getBase().getName());
                    if (set14 != null) {
                        java.util.Iterator it12 = set14.iterator();
                        while (it12.hasNext()) {
                            if (otherName.equals(org.bouncycastle.asn1.x509.OtherName.getInstance(it12.next()))) {
                                hashSet6.add(otherName);
                            }
                        }
                    } else if (otherName != null) {
                        hashSet6.add(otherName);
                    }
                }
                this.getOutputMinFrameDurationlomOqCM = hashSet6;
            }
            i4 = i;
            it4 = it;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("permitted:");
        sb.append(org.bouncycastle.util.Strings.lineSeparator());
        if (this.getInputSizeshNQ4ISI != null) {
            sb.append("DN:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getInputSizeshNQ4ISI.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (this.getHighSpeedVideoSizesFor != null) {
            sb.append("DNS:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getHighSpeedVideoSizesFor.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (this.getOutputMinFrameDuration != null) {
            sb.append("Email:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getOutputMinFrameDuration.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (this.getOutputStallDurationlomOqCM != null) {
            sb.append("URI:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getOutputStallDurationlomOqCM.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (this.getInputFormats != null) {
            sb.append("IP:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats));
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (this.getOutputMinFrameDurationlomOqCM != null) {
            sb.append("OtherName:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM));
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        sb.append("excluded:");
        sb.append(org.bouncycastle.util.Strings.lineSeparator());
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            sb.append("DN:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getHighSpeedVideoSizes.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            sb.append("DNS:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            sb.append("Email:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.Camera2StreamConfigurationMap.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (!this.getOutputFormats.isEmpty()) {
            sb.append("URI:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(this.getOutputFormats.toString());
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            sb.append("IP:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor));
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            sb.append("OtherName:");
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
            sb.append(Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges));
            sb.append(org.bouncycastle.util.Strings.lineSeparator());
        }
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree) {
        intersectPermittedSubtree(new org.bouncycastle.asn1.x509.GeneralSubtree[]{generalSubtree});
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectEmptyPermittedSubtree(int i) {
        if (i == 0) {
            this.getOutputMinFrameDurationlomOqCM = new java.util.HashSet();
            return;
        }
        if (i == 1) {
            this.getOutputMinFrameDuration = new java.util.HashSet();
            return;
        }
        if (i == 2) {
            this.getHighSpeedVideoSizesFor = new java.util.HashSet();
            return;
        }
        if (i == 4) {
            this.getInputSizeshNQ4ISI = new java.util.HashSet();
        } else if (i == 6) {
            this.getOutputStallDurationlomOqCM = new java.util.HashSet();
        } else {
            if (i != 7) {
                throw new java.lang.IllegalStateException("Unknown tag encountered: ".concat(java.lang.String.valueOf(i)));
            }
            this.getInputFormats = new java.util.HashSet();
        }
    }

    public int hashCode() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes) + getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI) + getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap) + getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor) + getHighSpeedVideoSizes(this.getOutputFormats) + getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges) + getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI) + getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor) + getHighSpeedVideoSizes(this.getOutputMinFrameDuration) + getHighSpeedVideoSizes(this.getInputFormats) + getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM) + getHighSpeedVideoSizes(this.getOutputMinFrameDurationlomOqCM);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.asn1.x509.PKIXNameConstraintValidator)) {
            return false;
        }
        org.bouncycastle.asn1.x509.PKIXNameConstraintValidator pKIXNameConstraintValidator = (org.bouncycastle.asn1.x509.PKIXNameConstraintValidator) obj;
        return getHighSpeedVideoSizes(pKIXNameConstraintValidator.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getOutputFormats, this.getOutputFormats) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getInputSizeshNQ4ISI, this.getInputSizeshNQ4ISI) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizesFor) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getOutputMinFrameDuration, this.getOutputMinFrameDuration) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getInputFormats, this.getInputFormats) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getOutputStallDurationlomOqCM, this.getOutputStallDurationlomOqCM) && getHighSpeedVideoSizes(pKIXNameConstraintValidator.getOutputMinFrameDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM);
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        java.lang.String[] split = org.bouncycastle.util.Strings.split(str2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        java.lang.String[] split2 = org.bouncycastle.util.Strings.split(str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        if (split2.length <= split.length) {
            return false;
        }
        int length = split2.length - split.length;
        for (int i = -1; i < split.length; i++) {
            if (i == -1) {
                if (split2[i + length].equals("")) {
                    return false;
                }
            } else if (!split[i].equalsIgnoreCase(split2[i + length])) {
                return false;
            }
        }
        return true;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2) {
        if (aSN1Sequence2.size() <= 0 || aSN1Sequence2.size() > aSN1Sequence.size()) {
            return false;
        }
        org.bouncycastle.asn1.x500.RDN rdn = org.bouncycastle.asn1.x500.RDN.getInstance(aSN1Sequence2.getObjectAt(0));
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= aSN1Sequence.size()) {
                i = i2;
                break;
            }
            if (org.bouncycastle.asn1.x500.style.IETFUtils.rDNAreEqual(rdn, org.bouncycastle.asn1.x500.RDN.getInstance(aSN1Sequence.getObjectAt(i)))) {
                break;
            }
            i2 = i;
            i++;
        }
        if (aSN1Sequence2.size() > aSN1Sequence.size() - i) {
            return false;
        }
        for (int i3 = 0; i3 < aSN1Sequence2.size(); i3++) {
            org.bouncycastle.asn1.x500.RDN rdn2 = org.bouncycastle.asn1.x500.RDN.getInstance(aSN1Sequence2.getObjectAt(i3));
            org.bouncycastle.asn1.x500.RDN rdn3 = org.bouncycastle.asn1.x500.RDN.getInstance(aSN1Sequence.getObjectAt(i + i3));
            if (rdn2.size() != rdn3.size() || !rdn2.getFirst().getType().equals((org.bouncycastle.asn1.ASN1Primitive) rdn3.getFirst().getType())) {
                return false;
            }
            if (rdn2.size() == 1 && rdn2.getFirst().getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x500.style.RFC4519Style.serialNumber)) {
                if (!rdn3.getFirst().getValue().toString().startsWith(rdn2.getFirst().getValue().toString())) {
                    return false;
                }
            } else if (!org.bouncycastle.asn1.x500.style.IETFUtils.rDNAreEqual(rdn2, rdn3)) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.util.Set set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sb.length() > 1) {
                sb.append(",");
            }
            org.bouncycastle.asn1.x509.OtherName otherName = org.bouncycastle.asn1.x509.OtherName.getInstance(it.next());
            sb.append(otherName.getTypeID().getId());
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            try {
                sb.append(org.bouncycastle.util.encoders.Hex.toHexString(otherName.getValue().toASN1Primitive().getEncoded()));
            } catch (java.io.IOException e) {
                sb.append(e.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) > (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr[i] & bArr3[i]);
        }
        return org.bouncycastle.util.Arrays.areEqual(bArr4, bArr5);
    }

    private static int getHighSpeedVideoSizes(java.util.Collection collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (java.lang.Object obj : collection) {
            i += obj instanceof byte[] ? org.bouncycastle.util.Arrays.hashCode((byte[]) obj) : obj.hashCode();
        }
        return i;
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        java.lang.String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (Camera2StreamConfigurationMap(substring, str2)) {
            return true;
        }
        return false;
    }
}
