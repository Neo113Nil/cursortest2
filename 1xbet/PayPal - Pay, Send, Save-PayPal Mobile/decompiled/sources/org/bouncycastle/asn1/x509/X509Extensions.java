package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509Extensions extends org.bouncycastle.asn1.ASN1Object {
    private java.util.Vector getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Hashtable getHighSpeedVideoFpsRangesFor;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectDirectoryAttributes = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.9");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectKeyIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.14");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier KeyUsage = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.15");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PrivateKeyUsagePeriod = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.16");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectAlternativeName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.17");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier IssuerAlternativeName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.18");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier BasicConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.19");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier CRLNumber = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.20");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ReasonCode = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.21");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier InstructionCode = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.23");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier InvalidityDate = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.24");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DeltaCRLIndicator = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.27");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier IssuingDistributionPoint = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.28");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier CertificateIssuer = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.29");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier NameConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.30");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier CRLDistributionPoints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.31");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier CertificatePolicies = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.32");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PolicyMappings = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.33");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier AuthorityKeyIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.35");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PolicyConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.36");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ExtendedKeyUsage = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.37");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier FreshestCRL = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.46");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier InhibitAnyPolicy = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.54");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier AuthorityInfoAccess = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SubjectInfoAccess = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier LogoType = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier BiometricInfo = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier QCStatements = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier AuditIdentity = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier NoRevAvail = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.56");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier TargetInformation = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.55");

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighResolutionOutputSizeshNQ4ISI.size());
        java.util.Enumeration elements = this.getHighResolutionOutputSizeshNQ4ISI.elements();
        while (elements.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(3);
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) elements.nextElement();
            org.bouncycastle.asn1.x509.X509Extension x509Extension = (org.bouncycastle.asn1.x509.X509Extension) this.getHighSpeedVideoFpsRangesFor.get(aSN1ObjectIdentifier);
            aSN1EncodableVector2.add(aSN1ObjectIdentifier);
            if (x509Extension.isCritical()) {
                aSN1EncodableVector2.add(org.bouncycastle.asn1.ASN1Boolean.TRUE);
            }
            aSN1EncodableVector2.add(x509Extension.getValue());
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.util.Enumeration oids() {
        return this.getHighResolutionOutputSizeshNQ4ISI.elements();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRangesFor(false);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getExtensionOIDs() {
        return getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.X509Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.asn1.x509.X509Extension) this.getHighSpeedVideoFpsRangesFor.get(aSN1ObjectIdentifier);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRangesFor(true);
    }

    public boolean equivalent(org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        if (this.getHighSpeedVideoFpsRangesFor.size() != x509Extensions.getHighSpeedVideoFpsRangesFor.size()) {
            return false;
        }
        java.util.Enumeration keys = this.getHighSpeedVideoFpsRangesFor.keys();
        while (keys.hasMoreElements()) {
            java.lang.Object nextElement = keys.nextElement();
            if (!this.getHighSpeedVideoFpsRangesFor.get(nextElement).equals(x509Extensions.getHighSpeedVideoFpsRangesFor.get(nextElement))) {
                return false;
            }
        }
        return true;
    }

    private static org.bouncycastle.asn1.ASN1ObjectIdentifier[] getHighSpeedVideoFpsRangesFor(java.util.Vector vector) {
        int size = vector.size();
        org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new org.bouncycastle.asn1.ASN1ObjectIdentifier[size];
        for (int i = 0; i != size; i++) {
            aSN1ObjectIdentifierArr[i] = (org.bouncycastle.asn1.ASN1ObjectIdentifier) vector.elementAt(i);
        }
        return aSN1ObjectIdentifierArr;
    }

    public static org.bouncycastle.asn1.x509.X509Extensions getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.X509Extensions getInstance(java.lang.Object obj) {
        while (obj != null && !(obj instanceof org.bouncycastle.asn1.x509.X509Extensions)) {
            if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return new org.bouncycastle.asn1.x509.X509Extensions((org.bouncycastle.asn1.ASN1Sequence) obj);
            }
            if (obj instanceof org.bouncycastle.asn1.x509.Extensions) {
                return new org.bouncycastle.asn1.x509.X509Extensions((org.bouncycastle.asn1.ASN1Sequence) ((org.bouncycastle.asn1.x509.Extensions) obj).toASN1Primitive());
            }
            if (!(obj instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
                sb.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            obj = ((org.bouncycastle.asn1.ASN1TaggedObject) obj).getObject();
        }
        return (org.bouncycastle.asn1.x509.X509Extensions) obj;
    }

    private org.bouncycastle.asn1.ASN1ObjectIdentifier[] getHighSpeedVideoFpsRangesFor(boolean z) {
        java.util.Vector vector = new java.util.Vector();
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            java.lang.Object elementAt = this.getHighResolutionOutputSizeshNQ4ISI.elementAt(i);
            if (((org.bouncycastle.asn1.x509.X509Extension) this.getHighSpeedVideoFpsRangesFor.get(elementAt)).isCritical() == z) {
                vector.addElement(elementAt);
            }
        }
        return getHighSpeedVideoFpsRangesFor(vector);
    }

    public X509Extensions(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(objects.nextElement());
            if (aSN1Sequence2.size() == 3) {
                this.getHighSpeedVideoFpsRangesFor.put(aSN1Sequence2.getObjectAt(0), new org.bouncycastle.asn1.x509.X509Extension(org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence2.getObjectAt(1)), org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(2))));
            } else {
                if (aSN1Sequence2.size() != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
                    sb.append(aSN1Sequence2.size());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.put(aSN1Sequence2.getObjectAt(0), new org.bouncycastle.asn1.x509.X509Extension(false, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(1))));
            }
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(aSN1Sequence2.getObjectAt(0));
        }
    }

    public X509Extensions(java.util.Vector vector, java.util.Vector vector2) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(elements.nextElement());
        }
        java.util.Enumeration elements2 = this.getHighResolutionOutputSizeshNQ4ISI.elements();
        int i = 0;
        while (elements2.hasMoreElements()) {
            this.getHighSpeedVideoFpsRangesFor.put((org.bouncycastle.asn1.ASN1ObjectIdentifier) elements2.nextElement(), (org.bouncycastle.asn1.x509.X509Extension) vector2.elementAt(i));
            i++;
        }
    }

    public X509Extensions(java.util.Vector vector, java.util.Hashtable hashtable) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();
        java.util.Enumeration keys = vector == null ? hashtable.keys() : vector.elements();
        while (keys.hasMoreElements()) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(keys.nextElement()));
        }
        java.util.Enumeration elements = this.getHighResolutionOutputSizeshNQ4ISI.elements();
        while (elements.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(elements.nextElement());
            this.getHighSpeedVideoFpsRangesFor.put(aSN1ObjectIdentifier, (org.bouncycastle.asn1.x509.X509Extension) hashtable.get(aSN1ObjectIdentifier));
        }
    }

    public X509Extensions(java.util.Hashtable hashtable) {
        this((java.util.Vector) null, hashtable);
    }
}
