package org.bouncycastle.jcajce.provider.keystore.util;

/* loaded from: classes17.dex */
public class JKSKeyStoreSpi extends java.security.KeyStoreSpi {
    private final java.util.Hashtable<java.lang.String, org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.BCJKSTrustedCertEntry> getHighSpeedVideoFpsRanges = new java.util.Hashtable<>();
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(java.lang.String str) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.ErasableByteStream erasableByteStream;
        java.util.Hashtable hashtable;
        if (inputStream == null) {
            return;
        }
        org.bouncycastle.crypto.Digest digest = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest("SHA-1");
        byte[] readAll = org.bouncycastle.util.io.Streams.readAll(inputStream);
        if (cArr != null) {
            for (int i = 0; i < cArr.length; i++) {
                digest.update((byte) (cArr[i] >> '\b'));
                digest.update((byte) cArr[i]);
            }
            digest.update(org.bouncycastle.util.Strings.toByteArray("Mighty Aphrodite"), 0, 16);
            digest.update(readAll, 0, readAll.length - digest.getDigestSize());
            int digestSize = digest.getDigestSize();
            byte[] bArr = new byte[digestSize];
            digest.doFinal(bArr, 0);
            byte[] bArr2 = new byte[digestSize];
            java.lang.System.arraycopy(readAll, readAll.length - digestSize, bArr2, 0, digestSize);
            if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr, bArr2)) {
                org.bouncycastle.util.Arrays.fill(readAll, (byte) 0);
                throw new java.io.IOException("password incorrect or store tampered with");
            }
            erasableByteStream = new org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.ErasableByteStream(readAll, readAll.length - digestSize);
        } else {
            erasableByteStream = new org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.ErasableByteStream(readAll, readAll.length - digest.getDigestSize());
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(erasableByteStream);
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                if (readInt == -17957139) {
                    java.security.cert.CertificateFactory certificateFactory = null;
                    if (readInt2 == 1) {
                        hashtable = null;
                        certificateFactory = getHighSpeedVideoFpsRangesFor("X.509");
                    } else {
                        if (readInt2 != 2) {
                            throw new java.lang.IllegalStateException("unable to discern store version");
                        }
                        hashtable = new java.util.Hashtable();
                    }
                    int readInt3 = dataInputStream.readInt();
                    for (int i2 = 0; i2 < readInt3; i2++) {
                        int readInt4 = dataInputStream.readInt();
                        if (readInt4 == 1) {
                            throw new java.io.IOException("BC JKS store is read-only and only supports certificate entries");
                        }
                        if (readInt4 != 2) {
                            throw new java.lang.IllegalStateException("unable to discern entry type");
                        }
                        java.lang.String readUTF = dataInputStream.readUTF();
                        java.util.Date date = new java.util.Date(dataInputStream.readLong());
                        if (readInt2 == 2) {
                            java.lang.String readUTF2 = dataInputStream.readUTF();
                            if (hashtable.containsKey(readUTF2)) {
                                certificateFactory = (java.security.cert.CertificateFactory) hashtable.get(readUTF2);
                            } else {
                                java.security.cert.CertificateFactory highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(readUTF2);
                                hashtable.put(readUTF2, highSpeedVideoFpsRangesFor);
                                certificateFactory = highSpeedVideoFpsRangesFor;
                            }
                        }
                        int readInt5 = dataInputStream.readInt();
                        byte[] bArr3 = new byte[readInt5];
                        dataInputStream.readFully(bArr3);
                        org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.ErasableByteStream erasableByteStream2 = new org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.ErasableByteStream(bArr3, readInt5);
                        try {
                            java.security.cert.Certificate generateCertificate = certificateFactory.generateCertificate(erasableByteStream2);
                            if (erasableByteStream2.available() != 0) {
                                throw new java.io.IOException("password incorrect or store tampered with");
                            }
                            erasableByteStream2.getHighSpeedVideoSizes();
                            this.getHighSpeedVideoFpsRanges.put(readUTF, new org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.BCJKSTrustedCertEntry(date, generateCertificate));
                        } catch (java.lang.Throwable th) {
                            erasableByteStream2.getHighSpeedVideoSizes();
                            throw th;
                        }
                    }
                }
                if (erasableByteStream.available() != 0) {
                    throw new java.io.IOException("password incorrect or store tampered with");
                }
            } finally {
                erasableByteStream.getHighSpeedVideoSizes();
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        throw new java.io.IOException("BC JKS store is read-only and only supports certificate entries");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        throw new java.security.KeyStoreException("BC JKS store is read-only and only supports certificate entries");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        throw new java.security.KeyStoreException("BC JKS store is read-only and only supports certificate entries");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
        throw new java.security.KeyStoreException("BC JKS store is read-only and only supports certificate entries");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.DataInputStream dataInputStream = inputStream instanceof java.io.DataInputStream ? (java.io.DataInputStream) inputStream : new java.io.DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        if (readInt == -17957139) {
            return readInt2 == 1 || readInt2 == 2;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof org.bouncycastle.jcajce.BCLoadStoreParameter) {
            engineLoad(((org.bouncycastle.jcajce.BCLoadStoreParameter) loadStoreParameter).getInputStream(), org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no support for 'param' of type ");
            sb.append(loadStoreParameter.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(java.lang.String str) {
        boolean containsKey;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            containsKey = this.getHighSpeedVideoFpsRanges.containsKey(str);
        }
        return containsKey;
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Date engineGetCreationDate(java.lang.String str) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.getHighSpeedVideoFpsRanges.get(str);
            if (bCJKSTrustedCertEntry == null) {
                return null;
            }
            return bCJKSTrustedCertEntry.getHighSpeedVideoFpsRangesFor;
        }
    }

    @Override // java.security.KeyStoreSpi
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            for (java.util.Map.Entry<java.lang.String, org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.BCJKSTrustedCertEntry> entry : this.getHighSpeedVideoFpsRanges.entrySet()) {
                if (entry.getValue().Camera2StreamConfigurationMap.equals(certificate)) {
                    return entry.getKey();
                }
            }
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.getHighSpeedVideoFpsRanges.get(str);
            if (bCJKSTrustedCertEntry == null) {
                return null;
            }
            return bCJKSTrustedCertEntry.Camera2StreamConfigurationMap;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
        throw new java.security.KeyStoreException("BC JKS store is read-only and only supports certificate entries");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(java.lang.String str) {
        boolean containsKey;
        if (str == null) {
            throw new java.lang.NullPointerException("alias value is null");
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            containsKey = this.getHighSpeedVideoFpsRanges.containsKey(str);
        }
        return containsKey;
    }

    static final class ErasableByteStream extends java.io.ByteArrayInputStream {
        public final void getHighSpeedVideoSizes() {
            org.bouncycastle.util.Arrays.fill(this.buf, (byte) 0);
        }

        public ErasableByteStream(byte[] bArr, int i) {
            super(bArr, 0, i);
        }
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Enumeration<java.lang.String> engineAliases() {
        java.util.Enumeration<java.lang.String> keys;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            keys = this.getHighSpeedVideoFpsRanges.keys();
        }
        return keys;
    }

    static final class BCJKSTrustedCertEntry {
        final java.security.cert.Certificate Camera2StreamConfigurationMap;
        final java.util.Date getHighSpeedVideoFpsRangesFor;

        public BCJKSTrustedCertEntry(java.util.Date date, java.security.cert.Certificate certificate) {
            this.getHighSpeedVideoFpsRangesFor = date;
            this.Camera2StreamConfigurationMap = certificate;
        }
    }

    private java.security.cert.CertificateFactory getHighSpeedVideoFpsRangesFor(java.lang.String str) throws java.security.cert.CertificateException {
        org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper = this.getHighSpeedVideoSizes;
        if (jcaJceHelper == null) {
            return java.security.cert.CertificateFactory.getInstance(str);
        }
        try {
            return jcaJceHelper.createCertificateFactory(str);
        } catch (java.security.NoSuchProviderException e) {
            throw new java.security.cert.CertificateException(e.toString());
        }
    }

    public JKSKeyStoreSpi(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getHighSpeedVideoSizes = jcaJceHelper;
    }
}
