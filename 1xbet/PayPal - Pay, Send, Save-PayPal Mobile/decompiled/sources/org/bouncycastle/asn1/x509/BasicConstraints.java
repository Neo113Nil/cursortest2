package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class BasicConstraints extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Boolean getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            sb = new java.lang.StringBuilder("BasicConstraints: isCa(");
            sb.append(isCA());
            sb.append(")");
        } else {
            sb = new java.lang.StringBuilder("BasicConstraints: isCa(");
            sb.append(isCA());
            sb.append("), pathLenConstraint = ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getValue());
        }
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Boolean != null) {
            aSN1EncodableVector.add(aSN1Boolean);
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isCA() {
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = this.getHighSpeedVideoFpsRangesFor;
        return aSN1Boolean != null && aSN1Boolean.isTrue();
    }

    public java.math.BigInteger getPathLenConstraint() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.BasicConstraints getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.BasicConstraints getInstance(java.lang.Object obj) {
        while (!(obj instanceof org.bouncycastle.asn1.x509.BasicConstraints)) {
            if (!(obj instanceof org.bouncycastle.asn1.x509.X509Extension)) {
                if (obj != null) {
                    return new org.bouncycastle.asn1.x509.BasicConstraints(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
                }
                return null;
            }
            obj = org.bouncycastle.asn1.x509.X509Extension.convertValueToObject((org.bouncycastle.asn1.x509.X509Extension) obj);
        }
        return (org.bouncycastle.asn1.x509.BasicConstraints) obj;
    }

    public static org.bouncycastle.asn1.x509.BasicConstraints fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.basicConstraints));
    }

    public BasicConstraints(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(false);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (z) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(true);
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    private BasicConstraints(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(false);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (aSN1Sequence.size() == 0) {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            return;
        }
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Boolean) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        }
        if (aSN1Sequence.size() > 1) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                throw new java.lang.IllegalArgumentException("wrong sequence in constructor");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public BasicConstraints(int i) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(false);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(true);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(i);
    }
}
