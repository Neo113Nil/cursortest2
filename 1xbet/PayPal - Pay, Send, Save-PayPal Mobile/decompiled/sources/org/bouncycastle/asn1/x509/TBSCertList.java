package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class TBSCertList extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x509.Time getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
    org.bouncycastle.asn1.x509.Time getInputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(7);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getOutputFormats;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getInputSizeshNQ4ISI);
        org.bouncycastle.asn1.x509.Time time = this.getHighSpeedVideoFpsRangesFor;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersionNumber() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getOutputFormats;
        if (aSN1Integer == null) {
            return 1;
        }
        return aSN1Integer.intValueExact() + 1;
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.x509.Time getThisUpdate() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static class CRLEntry extends org.bouncycastle.asn1.ASN1Object {
        org.bouncycastle.asn1.x509.Extensions Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public boolean hasExtensions() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size() == 3;
        }

        public org.bouncycastle.asn1.ASN1Integer getUserCertificate() {
            return org.bouncycastle.asn1.ASN1Integer.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(0));
        }

        public org.bouncycastle.asn1.x509.Time getRevocationDate() {
            return org.bouncycastle.asn1.x509.Time.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(1));
        }

        public org.bouncycastle.asn1.x509.Extensions getExtensions() {
            if (this.Camera2StreamConfigurationMap == null && this.getHighResolutionOutputSizeshNQ4ISI.size() == 3) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extensions.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(2));
            }
            return this.Camera2StreamConfigurationMap;
        }

        public static org.bouncycastle.asn1.x509.TBSCertList.CRLEntry getInstance(java.lang.Object obj) {
            if (obj instanceof org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) {
                return (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) obj;
            }
            if (obj != null) {
                return new org.bouncycastle.asn1.x509.TBSCertList.CRLEntry(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
            }
            return null;
        }

        private CRLEntry(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            if (aSN1Sequence.size() >= 2 && aSN1Sequence.size() <= 3) {
                this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    public org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[] getRevokedCertificates() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence == null) {
            return new org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[0];
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[] cRLEntryArr = new org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[size];
        for (int i = 0; i < size; i++) {
            cRLEntryArr[i] = org.bouncycastle.asn1.x509.TBSCertList.CRLEntry.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return cRLEntryArr;
    }

    public java.util.Enumeration getRevokedCertificateEnumeration() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        return aSN1Sequence == null ? new org.bouncycastle.asn1.x509.TBSCertList.EmptyEnumeration(this, (byte) 0) : new org.bouncycastle.asn1.x509.TBSCertList.RevokedCertificatesEnumeration(aSN1Sequence.getObjects());
    }

    public org.bouncycastle.asn1.x509.Time getNextUpdate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    class EmptyEnumeration implements java.util.Enumeration {
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public java.lang.Object nextElement() {
            throw new java.util.NoSuchElementException("Empty Enumeration");
        }

        /* synthetic */ EmptyEnumeration(org.bouncycastle.asn1.x509.TBSCertList tBSCertList, byte b) {
            this();
        }

        private EmptyEnumeration() {
        }
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.Camera2StreamConfigurationMap;
    }

    class RevokedCertificatesEnumeration implements java.util.Enumeration {
        private final java.util.Enumeration getHighSpeedVideoSizes;

        @Override // java.util.Enumeration
        public java.lang.Object nextElement() {
            return org.bouncycastle.asn1.x509.TBSCertList.CRLEntry.getInstance(this.getHighSpeedVideoSizes.nextElement());
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.getHighSpeedVideoSizes.hasMoreElements();
        }

        RevokedCertificatesEnumeration(java.util.Enumeration enumeration) {
            this.getHighSpeedVideoSizes = enumeration;
        }
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.TBSCertList getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.TBSCertList getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.TBSCertList) {
            return (org.bouncycastle.asn1.x509.TBSCertList) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.TBSCertList(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TBSCertList(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 7) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getOutputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            i = 1;
        } else {
            this.getOutputFormats = null;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(i + 1));
        int i2 = i + 3;
        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Time.getInstance(aSN1Sequence.getObjectAt(i + 2));
        if (i2 < aSN1Sequence.size() && ((aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1UTCTime) || (aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) || (aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.x509.Time))) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Time.getInstance(aSN1Sequence.getObjectAt(i2));
            i2 = i + 4;
        }
        if (i2 < aSN1Sequence.size() && !(aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i2));
            i2++;
        }
        if (i2 >= aSN1Sequence.size() || !(aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            return;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i2), true));
    }
}
