package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class BCElGamalPrivateKey implements org.bouncycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey, org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 4819350091141529678L;
    private transient org.bouncycastle.jce.spec.ElGamalParameterSpec Camera2StreamConfigurationMap;
    private transient org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    private java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
    public java.math.BigInteger getX() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // javax.crypto.interfaces.DHKey
    public javax.crypto.spec.DHParameterSpec getParams() {
        return new javax.crypto.spec.DHParameterSpec(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getG());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalKey
    public org.bouncycastle.jce.spec.ElGamalParameterSpec getParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm, new org.bouncycastle.asn1.oiw.ElGamalParameter(this.Camera2StreamConfigurationMap.getP(), this.Camera2StreamConfigurationMap.getG())), new org.bouncycastle.asn1.ASN1Integer(getX())).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "ElGamal";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof javax.crypto.interfaces.DHPrivateKey)) {
            return false;
        }
        javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getP());
        objectOutputStream.writeObject(this.Camera2StreamConfigurationMap.getG());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec((java.math.BigInteger) objectInputStream.readObject(), (java.math.BigInteger) objectInputStream.readObject());
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    }

    BCElGamalPrivateKey(org.bouncycastle.jce.spec.ElGamalPrivateKeySpec elGamalPrivateKeySpec) {
        this.getHighSpeedVideoSizes = elGamalPrivateKeySpec.getX();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalPrivateKeySpec.getParams().getP(), elGamalPrivateKeySpec.getParams().getG());
    }

    BCElGamalPrivateKey(org.bouncycastle.jce.interfaces.ElGamalPrivateKey elGamalPrivateKey) {
        this.getHighSpeedVideoSizes = elGamalPrivateKey.getX();
        this.Camera2StreamConfigurationMap = elGamalPrivateKey.getParameters();
    }

    BCElGamalPrivateKey(org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters elGamalPrivateKeyParameters) {
        this.getHighSpeedVideoSizes = elGamalPrivateKeyParameters.getX();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalPrivateKeyParameters.getParameters().getP(), elGamalPrivateKeyParameters.getParameters().getG());
    }

    BCElGamalPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.oiw.ElGamalParameter elGamalParameter = org.bouncycastle.asn1.oiw.ElGamalParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(privateKeyInfo.parsePrivateKey()).getValue();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalParameter.getP(), elGamalParameter.getG());
    }

    BCElGamalPrivateKey(javax.crypto.spec.DHPrivateKeySpec dHPrivateKeySpec) {
        this.getHighSpeedVideoSizes = dHPrivateKeySpec.getX();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    BCElGamalPrivateKey(javax.crypto.interfaces.DHPrivateKey dHPrivateKey) {
        this.getHighSpeedVideoSizes = dHPrivateKey.getX();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jce.spec.ElGamalParameterSpec(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    protected BCElGamalPrivateKey() {
    }
}
