package org.bouncycastle.jcajce.provider.keystore.bc;

/* loaded from: classes17.dex */
public class BcKeyStoreSpi extends java.security.KeyStoreSpi implements org.bouncycastle.jce.interfaces.BCKeyStore {
    protected int version;
    protected java.util.Hashtable table = new java.util.Hashtable();
    protected java.security.SecureRandom random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        if (storeEntry == null) {
            return null;
        }
        if (storeEntry.getOutputMinFrameDuration == 1) {
            return (java.security.cert.Certificate) storeEntry.getHighSpeedVideoFpsRangesFor;
        }
        java.security.cert.Certificate[] certificateArr = storeEntry.getHighSpeedVideoFpsRanges;
        if (certificateArr != null) {
            return certificateArr[0];
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
        java.util.Enumeration elements = this.table.elements();
        while (elements.hasMoreElements()) {
            org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) elements.nextElement();
            if (!(storeEntry.getHighSpeedVideoFpsRangesFor instanceof java.security.cert.Certificate)) {
                java.security.cert.Certificate[] certificateArr = storeEntry.getHighSpeedVideoFpsRanges;
                if (certificateArr != null && certificateArr[0].equals(certificate)) {
                    return storeEntry.getHighResolutionOutputSizeshNQ4ISI;
                }
            } else if (((java.security.cert.Certificate) storeEntry.getHighSpeedVideoFpsRangesFor).equals(certificate)) {
                return storeEntry.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            return storeEntry.getHighSpeedVideoFpsRanges;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Date engineGetCreationDate(java.lang.String str) {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            return storeEntry.getHighSpeedVideoSizes;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        if (storeEntry == null || storeEntry.getOutputMinFrameDuration == 1) {
            return null;
        }
        return (java.security.Key) storeEntry.getHighSpeedVideoSizes(cArr);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(java.lang.String str) {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        return storeEntry != null && storeEntry.getOutputMinFrameDuration == 1;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(java.lang.String str) {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        return (storeEntry == null || storeEntry.getOutputMinFrameDuration == 1) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) this.table.get(str);
        if (storeEntry != null && storeEntry.getOutputMinFrameDuration != 1) {
            throw new java.security.KeyStoreException("key store already has a key entry with alias ".concat(java.lang.String.valueOf(str)));
        }
        this.table.put(str, new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(str, certificate));
    }

    protected void saveStore(java.io.OutputStream outputStream) throws java.io.IOException {
        java.util.Enumeration elements = this.table.elements();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
        while (true) {
            if (!elements.hasMoreElements()) {
                dataOutputStream.write(0);
                return;
            }
            org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry) elements.nextElement();
            dataOutputStream.write(storeEntry.getOutputMinFrameDuration);
            dataOutputStream.writeUTF(storeEntry.getHighResolutionOutputSizeshNQ4ISI);
            dataOutputStream.writeLong(storeEntry.getHighSpeedVideoSizes.getTime());
            java.security.cert.Certificate[] certificateArr = storeEntry.getHighSpeedVideoFpsRanges;
            if (certificateArr == null) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(certificateArr.length);
                for (int i = 0; i != certificateArr.length; i++) {
                    getHighSpeedVideoFpsRanges(certificateArr[i], dataOutputStream);
                }
            }
            int i2 = storeEntry.getOutputMinFrameDuration;
            if (i2 == 1) {
                getHighSpeedVideoFpsRanges((java.security.cert.Certificate) storeEntry.getHighSpeedVideoFpsRangesFor, dataOutputStream);
            } else if (i2 == 2) {
                getHighSpeedVideoFpsRangesFor((java.security.Key) storeEntry.getHighSpeedVideoFpsRangesFor, dataOutputStream);
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new java.io.IOException("Unknown object type in store.");
                }
                byte[] bArr = (byte[]) storeEntry.getHighSpeedVideoFpsRangesFor;
                dataOutputStream.writeInt(bArr.length);
                dataOutputStream.write(bArr);
            }
        }
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(java.security.SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    protected javax.crypto.Cipher makePBECipher(java.lang.String str, int i, char[] cArr, byte[] bArr, int i2) throws java.io.IOException {
        try {
            javax.crypto.spec.PBEKeySpec pBEKeySpec = new javax.crypto.spec.PBEKeySpec(cArr);
            javax.crypto.SecretKeyFactory createSecretKeyFactory = this.getHighSpeedVideoSizes.createSecretKeyFactory(str);
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(bArr, i2);
            javax.crypto.Cipher createCipher = this.getHighSpeedVideoSizes.createCipher(str);
            createCipher.init(i, createSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return createCipher;
        } catch (java.lang.Exception e) {
            throw new java.io.IOException("Error initialising store of key store: ".concat(java.lang.String.valueOf(e)));
        }
    }

    protected void loadStore(java.io.InputStream inputStream) throws java.io.IOException {
        java.security.cert.Certificate[] certificateArr;
        java.util.Hashtable hashtable;
        org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        for (int read = dataInputStream.read(); read > 0; read = dataInputStream.read()) {
            java.lang.String readUTF = dataInputStream.readUTF();
            java.util.Date date = new java.util.Date(dataInputStream.readLong());
            int readInt = dataInputStream.readInt();
            if (readInt != 0) {
                java.security.cert.Certificate[] certificateArr2 = new java.security.cert.Certificate[readInt];
                for (int i = 0; i != readInt; i++) {
                    certificateArr2[i] = getHighSpeedVideoFpsRanges(dataInputStream);
                }
                certificateArr = certificateArr2;
            } else {
                certificateArr = null;
            }
            if (read == 1) {
                java.security.cert.Certificate highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dataInputStream);
                java.util.Hashtable hashtable2 = this.table;
                org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry storeEntry2 = new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(readUTF, date, highSpeedVideoFpsRanges);
                hashtable = hashtable2;
                storeEntry = storeEntry2;
            } else if (read == 2) {
                java.security.Key highSpeedVideoSizes = getHighSpeedVideoSizes(dataInputStream);
                hashtable = this.table;
                storeEntry = new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(readUTF, date, 2, highSpeedVideoSizes, certificateArr);
            } else {
                if (read != 3 && read != 4) {
                    throw new java.io.IOException("Unknown object type in store.");
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                this.table.put(readUTF, new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(readUTF, date, read, bArr, certificateArr));
            }
            hashtable.put(readUTF, storeEntry);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int nextInt = (this.random.nextInt() & 1023) + 1024;
        this.random.nextBytes(bArr);
        dataOutputStream.writeInt(this.version);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(nextInt);
        org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA1Digest());
        org.bouncycastle.crypto.io.MacOutputStream macOutputStream = new org.bouncycastle.crypto.io.MacOutputStream(hMac);
        org.bouncycastle.crypto.generators.PKCS12ParametersGenerator pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        byte[] PKCS12PasswordToBytes = org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        pKCS12ParametersGenerator.init(PKCS12PasswordToBytes, bArr, nextInt);
        hMac.init(pKCS12ParametersGenerator.generateDerivedMacParameters(this.version < 2 ? hMac.getMacSize() : hMac.getMacSize() * 8));
        for (int i = 0; i != PKCS12PasswordToBytes.length; i++) {
            PKCS12PasswordToBytes[i] = 0;
        }
        saveStore(new org.bouncycastle.util.io.TeeOutputStream(dataOutputStream, macOutputStream));
        byte[] bArr2 = new byte[hMac.getMacSize()];
        hMac.doFinal(bArr2, 0);
        dataOutputStream.write(bArr2);
        dataOutputStream.close();
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.table.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        this.table.put(str, new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(str, bArr, certificateArr));
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        if (key instanceof java.security.PrivateKey) {
            if (certificateArr == null) {
                throw new java.security.KeyStoreException("no certificate chain for private key");
            }
            if (key.getEncoded() == null) {
                this.table.put(str, new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(str, new java.util.Date(), 2, key, certificateArr));
                return;
            }
        }
        try {
            this.table.put(str, new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.StoreEntry(str, key, cArr, certificateArr));
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.BCKeyStoreException(e.toString(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException {
        this.table.clear();
        if (inputStream != null) {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
            int readInt = dataInputStream.readInt();
            if (readInt != 2 && readInt != 0 && readInt != 1) {
                throw new java.io.IOException("Wrong version of key store.");
            }
            int readInt2 = dataInputStream.readInt();
            if (readInt2 <= 0) {
                throw new java.io.IOException("Invalid salt detected");
            }
            byte[] bArr = new byte[readInt2];
            dataInputStream.readFully(bArr);
            int readInt3 = dataInputStream.readInt();
            org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA1Digest());
            if (cArr == null || cArr.length == 0) {
                loadStore(dataInputStream);
                dataInputStream.readFully(new byte[hMac.getMacSize()]);
                return;
            }
            byte[] PKCS12PasswordToBytes = org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
            org.bouncycastle.crypto.generators.PKCS12ParametersGenerator pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
            pKCS12ParametersGenerator.init(PKCS12PasswordToBytes, bArr, readInt3);
            org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters = pKCS12ParametersGenerator.generateDerivedMacParameters(readInt != 2 ? hMac.getMacSize() : hMac.getMacSize() * 8);
            org.bouncycastle.util.Arrays.fill(PKCS12PasswordToBytes, (byte) 0);
            hMac.init(generateDerivedMacParameters);
            loadStore(new org.bouncycastle.crypto.io.MacInputStream(dataInputStream, hMac));
            byte[] bArr2 = new byte[hMac.getMacSize()];
            hMac.doFinal(bArr2, 0);
            byte[] bArr3 = new byte[hMac.getMacSize()];
            dataInputStream.readFully(bArr3);
            if (org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr2, bArr3)) {
                return;
            }
            this.table.clear();
            throw new java.io.IOException("KeyStore integrity check failed.");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
        if (this.table.get(str) == null) {
            return;
        }
        this.table.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(java.lang.String str) {
        return this.table.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Enumeration engineAliases() {
        return this.table.keys();
    }

    class StoreEntry {
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.security.cert.Certificate[] getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        java.util.Date getHighSpeedVideoSizes;
        int getOutputMinFrameDuration;

        final java.lang.Object getHighSpeedVideoSizes(char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            java.security.Key highSpeedVideoSizes;
            if (cArr == null || cArr.length == 0) {
                java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
                if (obj instanceof java.security.Key) {
                    return obj;
                }
            }
            if (this.getOutputMinFrameDuration != 4) {
                throw new java.lang.RuntimeException("forget something!");
            }
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) this.getHighSpeedVideoFpsRangesFor));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                try {
                    return org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.getHighSpeedVideoSizes(new java.io.DataInputStream(new org.bouncycastle.jcajce.io.CipherInputStream(dataInputStream, org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr, dataInputStream.readInt()))));
                } catch (java.lang.Exception unused) {
                    java.io.DataInputStream dataInputStream2 = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) this.getHighSpeedVideoFpsRangesFor));
                    byte[] bArr2 = new byte[dataInputStream2.readInt()];
                    dataInputStream2.readFully(bArr2);
                    int readInt = dataInputStream2.readInt();
                    try {
                        highSpeedVideoSizes = org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.getHighSpeedVideoSizes(new java.io.DataInputStream(new org.bouncycastle.jcajce.io.CipherInputStream(dataInputStream2, org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.makePBECipher("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, readInt))));
                    } catch (java.lang.Exception unused2) {
                        java.io.DataInputStream dataInputStream3 = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) this.getHighSpeedVideoFpsRangesFor));
                        bArr2 = new byte[dataInputStream3.readInt()];
                        dataInputStream3.readFully(bArr2);
                        readInt = dataInputStream3.readInt();
                        highSpeedVideoSizes = org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.getHighSpeedVideoSizes(new java.io.DataInputStream(new org.bouncycastle.jcajce.io.CipherInputStream(dataInputStream3, org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.makePBECipher("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, readInt))));
                    }
                    byte[] bArr3 = bArr2;
                    int i = readInt;
                    if (highSpeedVideoSizes == null) {
                        throw new java.security.UnrecoverableKeyException("no match");
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(bArr3.length);
                    dataOutputStream.write(bArr3);
                    dataOutputStream.writeInt(i);
                    java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new org.bouncycastle.jcajce.io.CipherOutputStream(dataOutputStream, org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr3, i)));
                    org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, dataOutputStream2);
                    dataOutputStream2.close();
                    this.getHighSpeedVideoFpsRangesFor = byteArrayOutputStream.toByteArray();
                    return highSpeedVideoSizes;
                }
            } catch (java.lang.Exception unused3) {
                throw new java.security.UnrecoverableKeyException("no match");
            }
        }

        StoreEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) {
            this.getHighSpeedVideoSizes = new java.util.Date();
            this.getOutputMinFrameDuration = 3;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = bArr;
            this.getHighSpeedVideoFpsRanges = certificateArr;
        }

        StoreEntry(java.lang.String str, java.util.Date date, int i, java.lang.Object obj, java.security.cert.Certificate[] certificateArr) {
            new java.util.Date();
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = date;
            this.getOutputMinFrameDuration = i;
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.getHighSpeedVideoFpsRanges = certificateArr;
        }

        StoreEntry(java.lang.String str, java.util.Date date, java.lang.Object obj) {
            new java.util.Date();
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = date;
            this.getOutputMinFrameDuration = 1;
            this.getHighSpeedVideoFpsRangesFor = obj;
        }

        StoreEntry(java.lang.String str, java.security.cert.Certificate certificate) {
            this.getHighSpeedVideoSizes = new java.util.Date();
            this.getOutputMinFrameDuration = 1;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = certificate;
            this.getHighSpeedVideoFpsRanges = null;
        }

        StoreEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.lang.Exception {
            this.getHighSpeedVideoSizes = new java.util.Date();
            this.getOutputMinFrameDuration = 4;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = certificateArr;
            byte[] bArr = new byte[20];
            org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.random.nextBytes(bArr);
            int nextInt = (org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.random.nextInt() & 1023) + 1024;
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(nextInt);
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new org.bouncycastle.jcajce.io.CipherOutputStream(dataOutputStream, org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr, nextInt)));
            org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi.getHighSpeedVideoFpsRangesFor(key, dataOutputStream2);
            dataOutputStream2.close();
            this.getHighSpeedVideoFpsRangesFor = byteArrayOutputStream.toByteArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoFpsRangesFor(java.security.Key key, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new java.io.IOException("unable to store encoding of protected key");
        }
        dataOutputStream.write(key instanceof java.security.PrivateKey ? 0 : key instanceof java.security.PublicKey ? 1 : 2);
        dataOutputStream.writeUTF(key.getFormat());
        dataOutputStream.writeUTF(key.getAlgorithm());
        dataOutputStream.writeInt(encoded.length);
        dataOutputStream.write(encoded);
    }

    private static void getHighSpeedVideoFpsRanges(java.security.cert.Certificate certificate, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        try {
            byte[] encoded = certificate.getEncoded();
            dataOutputStream.writeUTF(certificate.getType());
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
        } catch (java.security.cert.CertificateEncodingException e) {
            throw new java.io.IOException(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.security.Key getHighSpeedVideoSizes(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        java.security.spec.KeySpec pKCS8EncodedKeySpec;
        int read = dataInputStream.read();
        java.lang.String readUTF = dataInputStream.readUTF();
        java.lang.String readUTF2 = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        if (readUTF.equals("PKCS#8") || readUTF.equals("PKCS8")) {
            pKCS8EncodedKeySpec = new java.security.spec.PKCS8EncodedKeySpec(bArr);
        } else {
            if (!readUTF.equals("X.509") && !readUTF.equals("X509")) {
                if (readUTF.equals("RAW")) {
                    return new javax.crypto.spec.SecretKeySpec(bArr, readUTF2);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Key format ");
                sb.append(readUTF);
                sb.append(" not recognised!");
                throw new java.io.IOException(sb.toString());
            }
            pKCS8EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(bArr);
        }
        try {
            if (read == 0) {
                return org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(bArr));
            }
            if (read == 1) {
                return org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(bArr));
            }
            if (read == 2) {
                return this.getHighSpeedVideoSizes.createSecretKeyFactory(readUTF2).generateSecret(pKCS8EncodedKeySpec);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Key type ");
            sb2.append(read);
            sb2.append(" not recognised!");
            throw new java.io.IOException(sb2.toString());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Exception creating key: ");
            sb3.append(e.toString());
            throw new java.io.IOException(sb3.toString());
        }
    }

    public static class BouncyCastleStore extends org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi {
        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int nextInt = (this.random.nextInt() & 1023) + 1024;
            this.random.nextBytes(bArr);
            dataOutputStream.writeInt(this.version);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(nextInt);
            org.bouncycastle.jcajce.io.CipherOutputStream cipherOutputStream = new org.bouncycastle.jcajce.io.CipherOutputStream(dataOutputStream, makePBECipher("PBEWithSHAAndTwofish-CBC", 1, cArr, bArr, nextInt));
            org.bouncycastle.crypto.io.DigestOutputStream digestOutputStream = new org.bouncycastle.crypto.io.DigestOutputStream(new org.bouncycastle.crypto.digests.SHA1Digest());
            saveStore(new org.bouncycastle.util.io.TeeOutputStream(cipherOutputStream, digestOutputStream));
            cipherOutputStream.write(digestOutputStream.getDigest());
            cipherOutputStream.close();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException {
            this.table.clear();
            if (inputStream != null) {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
                int readInt = dataInputStream.readInt();
                if (readInt != 2 && readInt != 0 && readInt != 1) {
                    throw new java.io.IOException("Wrong version of key store.");
                }
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (readInt2 != 20) {
                    throw new java.io.IOException("Key store corrupted.");
                }
                dataInputStream.readFully(bArr);
                int readInt3 = dataInputStream.readInt();
                if (readInt3 < 0 || readInt3 > 65536) {
                    throw new java.io.IOException("Key store corrupted.");
                }
                org.bouncycastle.jcajce.io.CipherInputStream cipherInputStream = new org.bouncycastle.jcajce.io.CipherInputStream(dataInputStream, makePBECipher(readInt == 0 ? "OldPBEWithSHAAndTwofish-CBC" : "PBEWithSHAAndTwofish-CBC", 2, cArr, bArr, readInt3));
                org.bouncycastle.crypto.digests.SHA1Digest sHA1Digest = new org.bouncycastle.crypto.digests.SHA1Digest();
                loadStore(new org.bouncycastle.crypto.io.DigestInputStream(cipherInputStream, sHA1Digest));
                byte[] bArr2 = new byte[sHA1Digest.getDigestSize()];
                sHA1Digest.doFinal(bArr2, 0);
                byte[] bArr3 = new byte[sHA1Digest.getDigestSize()];
                org.bouncycastle.util.io.Streams.readFully(cipherInputStream, bArr3);
                if (org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr2, bArr3)) {
                    return;
                }
                this.table.clear();
                throw new java.io.IOException("KeyStore integrity check failed.");
            }
        }

        public BouncyCastleStore() {
            super(1);
        }
    }

    private java.security.cert.Certificate getHighSpeedVideoFpsRanges(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        java.lang.String readUTF = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            return this.getHighSpeedVideoSizes.createCertificateFactory(readUTF).generateCertificate(new java.io.ByteArrayInputStream(bArr));
        } catch (java.security.NoSuchProviderException e) {
            throw new java.io.IOException(e.toString());
        } catch (java.security.cert.CertificateException e2) {
            throw new java.io.IOException(e2.toString());
        }
    }

    static class BCKeyStoreException extends java.security.KeyStoreException {
        private final java.lang.Exception getHighSpeedVideoFpsRanges;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public BCKeyStoreException(java.lang.String str, java.lang.Exception exc) {
            super(str);
            this.getHighSpeedVideoFpsRanges = exc;
        }
    }

    public static class Std extends org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi {
        public Std() {
            super(2);
        }
    }

    public static class Version1 extends org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi {
        public Version1() {
            super(1);
            if (!org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.bks.enable_v1")) {
                throw new java.lang.IllegalStateException("BKS-V1 not enabled");
            }
        }
    }

    public BcKeyStoreSpi(int i) {
        this.version = i;
    }
}
