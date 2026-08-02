package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class BCDSAPublicKey implements java.security.interfaces.DSAPublicKey {
    private static java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient java.security.interfaces.DSAParams Camera2StreamConfigurationMap;
    transient org.bouncycastle.crypto.params.DSAPublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;

    public BCDSAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue();
            org.bouncycastle.asn1.ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (parameters == null || org.bouncycastle.asn1.DERNull.INSTANCE.equals(parameters.toASN1Primitive())) {
                this.Camera2StreamConfigurationMap = null;
            } else {
                org.bouncycastle.asn1.x509.DSAParameter dSAParameter = org.bouncycastle.asn1.x509.DSAParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
                this.Camera2StreamConfigurationMap = new java.security.spec.DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.DSAPublicKeyParameters(this.getHighSpeedVideoFpsRanges, org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DSA Public Key [");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getParams())).append("]").append(lineSeparator);
        stringBuffer.append("            Y: ").append(getY().toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    @Override // java.security.interfaces.DSAPublicKey
    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.interfaces.DSAKey
    public java.security.interfaces.DSAParams getParams() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer;
        if (this.Camera2StreamConfigurationMap == null) {
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa);
            aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges);
        } else {
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getQ(), this.Camera2StreamConfigurationMap.getG()).toASN1Primitive());
            aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges);
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil.getEncodedSubjectPublicKeyInfo(algorithmIdentifier, aSN1Integer);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "DSA";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.security.interfaces.DSAPublicKey)) {
            return false;
        }
        java.security.interfaces.DSAPublicKey dSAPublicKey = (java.security.interfaces.DSAPublicKey) obj;
        return this.Camera2StreamConfigurationMap != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.math.BigInteger g;
        objectOutputStream.defaultWriteObject();
        java.security.interfaces.DSAParams dSAParams = this.Camera2StreamConfigurationMap;
        if (dSAParams == null) {
            g = getHighSpeedVideoSizes;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getQ());
            g = this.Camera2StreamConfigurationMap.getG();
        }
        objectOutputStream.writeObject(g);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        java.math.BigInteger bigInteger = (java.math.BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(getHighSpeedVideoSizes)) {
            this.Camera2StreamConfigurationMap = null;
        } else {
            this.Camera2StreamConfigurationMap = new java.security.spec.DSAParameterSpec(bigInteger, (java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.DSAPublicKeyParameters(this.getHighSpeedVideoFpsRanges, org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap));
    }

    BCDSAPublicKey(org.bouncycastle.crypto.params.DSAPublicKeyParameters dSAPublicKeyParameters) {
        this.getHighSpeedVideoFpsRanges = dSAPublicKeyParameters.getY();
        this.Camera2StreamConfigurationMap = dSAPublicKeyParameters.getParameters() != null ? new java.security.spec.DSAParameterSpec(dSAPublicKeyParameters.getParameters().getP(), dSAPublicKeyParameters.getParameters().getQ(), dSAPublicKeyParameters.getParameters().getG()) : null;
        this.getHighResolutionOutputSizeshNQ4ISI = dSAPublicKeyParameters;
    }

    BCDSAPublicKey(java.security.spec.DSAPublicKeySpec dSAPublicKeySpec) {
        this.getHighSpeedVideoFpsRanges = dSAPublicKeySpec.getY();
        this.Camera2StreamConfigurationMap = new java.security.spec.DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.DSAPublicKeyParameters(this.getHighSpeedVideoFpsRanges, org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap));
    }

    BCDSAPublicKey(java.security.interfaces.DSAPublicKey dSAPublicKey) {
        this.getHighSpeedVideoFpsRanges = dSAPublicKey.getY();
        this.Camera2StreamConfigurationMap = dSAPublicKey.getParams();
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.DSAPublicKeyParameters(this.getHighSpeedVideoFpsRanges, org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap));
    }
}
