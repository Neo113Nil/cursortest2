package org.bouncycastle.pqc.jcajce.provider.sphincs;

/* loaded from: classes17.dex */
public class BCSphincs256PrivateKey implements java.security.PrivateKey, org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey {
    private static final long serialVersionUID = 1;
    private transient org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;
    transient org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    transient org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() + (org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI.getKeyData()) * 37);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getKeyData();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigest() != null ? org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap) : new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, new org.bouncycastle.pqc.asn1.SPHINCS256KeyParams(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoSizes))), new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI.getKeyData()), this.Camera2StreamConfigurationMap)).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "SPHINCS-256";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey bCSphincs256PrivateKey = (org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey) obj;
        return this.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) bCSphincs256PrivateKey.getHighSpeedVideoSizes) && org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI.getKeyData(), bCSphincs256PrivateKey.getHighResolutionOutputSizeshNQ4ISI.getKeyData());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        this.Camera2StreamConfigurationMap = privateKeyInfo.getAttributes();
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.asn1.SPHINCS256KeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters) org.bouncycastle.pqc.crypto.util.PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public BCSphincs256PrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor(privateKeyInfo);
    }

    public BCSphincs256PrivateKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = sPHINCSPrivateKeyParameters;
    }
}
