package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
public class BCDHPublicKey implements javax.crypto.interfaces.DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private transient org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRanges;
    private transient javax.crypto.spec.DHParameterSpec getHighSpeedVideoFpsRangesFor;
    private transient org.bouncycastle.crypto.params.DHPublicKeyParameters getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (org.bouncycastle.asn1.ASN1Integer.getInstance(r0.getObjectAt(2)).getValue().compareTo(java.math.BigInteger.valueOf(org.bouncycastle.asn1.ASN1Integer.getInstance(r0.getObjectAt(0)).getValue().bitLength())) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BCDHPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoFpsRanges = subjectPublicKeyInfo;
        try {
            this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
            if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement) && aSN1Sequence.size() != 2) {
                if (aSN1Sequence.size() <= 3) {
                }
                if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber)) {
                    throw new java.lang.IllegalArgumentException("unknown algorithm type: ".concat(java.lang.String.valueOf(algorithm)));
                }
                org.bouncycastle.asn1.x9.DomainParameters domainParameters = org.bouncycastle.asn1.x9.DomainParameters.getInstance(aSN1Sequence);
                org.bouncycastle.asn1.x9.ValidationParams validationParams = domainParameters.getValidationParams();
                if (validationParams != null) {
                    this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), new org.bouncycastle.crypto.params.DHValidationParameters(validationParams.getSeed(), validationParams.getPgenCounter().intValue())));
                } else {
                    this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), (org.bouncycastle.crypto.params.DHValidationParameters) null));
                }
                this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.spec.DHDomainParameterSpec(this.getHighSpeedVideoSizes.getParameters());
                return;
            }
            org.bouncycastle.asn1.pkcs.DHParameter dHParameter = org.bouncycastle.asn1.pkcs.DHParameter.getInstance(aSN1Sequence);
            if (dHParameter.getL() != null) {
                this.getHighSpeedVideoFpsRangesFor = new javax.crypto.spec.DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue());
                this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(this.getHighSpeedVideoFpsRangesFor.getP(), this.getHighSpeedVideoFpsRangesFor.getG(), null, this.getHighSpeedVideoFpsRangesFor.getL()));
            } else {
                this.getHighSpeedVideoFpsRangesFor = new javax.crypto.spec.DHParameterSpec(dHParameter.getP(), dHParameter.getG());
                this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(this.getHighSpeedVideoFpsRangesFor.getP(), this.getHighSpeedVideoFpsRangesFor.getG()));
            }
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    public java.lang.String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.dh.DHUtil.getHighSpeedVideoFpsRangesFor("DH", this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(this.getHighSpeedVideoFpsRangesFor.getP(), this.getHighSpeedVideoFpsRangesFor.getG()));
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public java.math.BigInteger getY() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.getHighSpeedVideoFpsRanges;
        if (subjectPublicKeyInfo != null) {
            return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo);
        }
        javax.crypto.spec.DHParameterSpec dHParameterSpec = this.getHighSpeedVideoFpsRangesFor;
        if (!(dHParameterSpec instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec) || ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) dHParameterSpec).getQ() == null) {
            return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement, new org.bouncycastle.asn1.pkcs.DHParameter(this.getHighSpeedVideoFpsRangesFor.getP(), this.getHighSpeedVideoFpsRangesFor.getG(), this.getHighSpeedVideoFpsRangesFor.getL()).toASN1Primitive()), new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        }
        org.bouncycastle.crypto.params.DHParameters domainParameters = ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) this.getHighSpeedVideoFpsRangesFor).getDomainParameters();
        org.bouncycastle.crypto.params.DHValidationParameters validationParameters = domainParameters.getValidationParameters();
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber, new org.bouncycastle.asn1.x9.DomainParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), validationParameters != null ? new org.bouncycastle.asn1.x9.ValidationParams(validationParameters.getSeed(), validationParameters.getCounter()) : null).toASN1Primitive()), new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "DH";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof javax.crypto.interfaces.DHPublicKey)) {
            return false;
        }
        javax.crypto.interfaces.DHPublicKey dHPublicKey = (javax.crypto.interfaces.DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public org.bouncycastle.crypto.params.DHPublicKeyParameters engineGetKeyParameters() {
        return this.getHighSpeedVideoSizes;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRangesFor.getP());
        objectOutputStream.writeObject(this.getHighSpeedVideoFpsRangesFor.getG());
        objectOutputStream.writeInt(this.getHighSpeedVideoFpsRangesFor.getL());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getHighSpeedVideoFpsRangesFor = new javax.crypto.spec.DHParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.getHighSpeedVideoFpsRanges = null;
    }

    BCDHPublicKey(org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters) {
        this.Camera2StreamConfigurationMap = dHPublicKeyParameters.getY();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.spec.DHDomainParameterSpec(dHPublicKeyParameters.getParameters());
        this.getHighSpeedVideoSizes = dHPublicKeyParameters;
    }

    BCDHPublicKey(javax.crypto.spec.DHPublicKeySpec dHPublicKeySpec) {
        this.Camera2StreamConfigurationMap = dHPublicKeySpec.getY();
        javax.crypto.spec.DHParameterSpec params = dHPublicKeySpec instanceof org.bouncycastle.jcajce.spec.DHExtendedPublicKeySpec ? ((org.bouncycastle.jcajce.spec.DHExtendedPublicKeySpec) dHPublicKeySpec).getParams() : new javax.crypto.spec.DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.getHighSpeedVideoFpsRangesFor = params;
        if (params instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) params).getDomainParameters());
        } else {
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
        }
    }

    BCDHPublicKey(javax.crypto.interfaces.DHPublicKey dHPublicKey) {
        this.Camera2StreamConfigurationMap = dHPublicKey.getY();
        javax.crypto.spec.DHParameterSpec params = dHPublicKey.getParams();
        this.getHighSpeedVideoFpsRangesFor = params;
        if (params instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) params).getDomainParameters());
        } else {
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.DHPublicKeyParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.DHParameters(this.getHighSpeedVideoFpsRangesFor.getP(), this.getHighSpeedVideoFpsRangesFor.getG()));
        }
    }

    BCDHPublicKey(java.math.BigInteger bigInteger, javax.crypto.spec.DHParameterSpec dHParameterSpec) {
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoFpsRangesFor = dHParameterSpec;
        this.getHighSpeedVideoSizes = dHParameterSpec instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec ? new org.bouncycastle.crypto.params.DHPublicKeyParameters(bigInteger, ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) dHParameterSpec).getDomainParameters()) : new org.bouncycastle.crypto.params.DHPublicKeyParameters(bigInteger, new org.bouncycastle.crypto.params.DHParameters(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }
}
