package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class JournaledAlgorithm implements org.bouncycastle.util.Encodable, java.io.Serializable {
    private transient org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.crypto.util.JournalingSecureRandom getHighSpeedVideoSizes;

    public void storeState(java.io.OutputStream outputStream) throws java.io.IOException {
        if (outputStream == null) {
            throw new java.lang.NullPointerException("output stream for storage is null in JournaledAlgorithm");
        }
        outputStream.write(getEncoded());
    }

    public void storeState(java.io.File file) throws java.io.IOException {
        if (file == null) {
            throw new java.lang.NullPointerException("file for storage is null in JournaledAlgorithm");
        }
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            storeState(fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    public org.bouncycastle.crypto.util.JournalingSecureRandom getJournalingSecureRandom() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes.getFullTranscript()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighSpeedVideoFpsRangesFor((byte[]) objectInputStream.readObject(), org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr, java.security.SecureRandom secureRandom) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.util.JournalingSecureRandom(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets(), secureRandom);
    }

    public static org.bouncycastle.crypto.util.JournaledAlgorithm getState(java.io.InputStream inputStream, java.security.SecureRandom secureRandom) throws java.io.IOException, java.lang.ClassNotFoundException {
        if (inputStream == null) {
            throw new java.lang.NullPointerException("stream for loading is null in JournaledAlgorithm");
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
        try {
            return new org.bouncycastle.crypto.util.JournaledAlgorithm(org.bouncycastle.util.io.Streams.readAll(bufferedInputStream), secureRandom);
        } finally {
            bufferedInputStream.close();
        }
    }

    public static org.bouncycastle.crypto.util.JournaledAlgorithm getState(java.io.File file, java.security.SecureRandom secureRandom) throws java.io.IOException, java.lang.ClassNotFoundException {
        if (file == null) {
            throw new java.lang.NullPointerException("File for loading is null in JournaledAlgorithm");
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        try {
            return new org.bouncycastle.crypto.util.JournaledAlgorithm(org.bouncycastle.util.io.Streams.readAll(bufferedInputStream), secureRandom);
        } finally {
            bufferedInputStream.close();
        }
    }

    public JournaledAlgorithm(byte[] bArr, java.security.SecureRandom secureRandom) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("encoding passed to JournaledAlgorithm is null");
        }
        if (secureRandom == null) {
            throw new java.lang.NullPointerException("random passed to JournaledAlgorithm is null");
        }
        getHighSpeedVideoFpsRangesFor(bArr, secureRandom);
    }

    public JournaledAlgorithm(byte[] bArr) {
        this(bArr, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
    }

    public JournaledAlgorithm(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.util.JournalingSecureRandom journalingSecureRandom) {
        if (algorithmIdentifier == null) {
            throw new java.lang.NullPointerException("AlgorithmIdentifier passed to JournaledAlgorithm is null");
        }
        if (journalingSecureRandom == null) {
            throw new java.lang.NullPointerException("JournalingSecureRandom passed to JournaledAlgorithm is null");
        }
        this.getHighSpeedVideoSizes = journalingSecureRandom;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
    }
}
