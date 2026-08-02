package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public abstract class BaseCipherSpi extends javax.crypto.CipherSpi {
    private java.lang.Class[] getHighSpeedVideoSizes = {javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class, javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class};
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    protected java.security.AlgorithmParameters engineParams = null;
    protected org.bouncycastle.crypto.Wrapper wrapEngine = null;

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(java.security.Key key) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new java.security.InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            org.bouncycastle.crypto.Wrapper wrapper = this.wrapEngine;
            return wrapper == null ? engineDoFinal(encoded, 0, encoded.length) : wrapper.wrap(encoded, 0, encoded.length);
        } catch (javax.crypto.BadPaddingException e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected java.security.Key engineUnwrap(byte[] bArr, java.lang.String str, int i) throws java.security.InvalidKeyException {
        try {
            org.bouncycastle.crypto.Wrapper wrapper = this.wrapEngine;
            byte[] engineDoFinal = wrapper == null ? engineDoFinal(bArr, 0, bArr.length) : wrapper.unwrap(bArr, 0, bArr.length);
            if (i == 3) {
                return new javax.crypto.spec.SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(engineDoFinal);
                    java.security.PrivateKey privateKey = org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(privateKeyInfo);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm ");
                    sb.append(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
                    sb.append(" not supported");
                    throw new java.security.InvalidKeyException(sb.toString());
                } catch (java.lang.Exception unused) {
                    throw new java.security.InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                java.security.KeyFactory createKeyFactory = this.getHighSpeedVideoFpsRangesFor.createKeyFactory(str);
                if (i == 1) {
                    return createKeyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(engineDoFinal));
                }
                if (i == 2) {
                    return createKeyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new java.security.InvalidKeyException("Unknown key type ".concat(java.lang.String.valueOf(i)));
            } catch (java.security.NoSuchAlgorithmException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown key type ");
                sb2.append(e.getMessage());
                throw new java.security.InvalidKeyException(sb2.toString());
            } catch (java.security.NoSuchProviderException e2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown key type ");
                sb3.append(e2.getMessage());
                throw new java.security.InvalidKeyException(sb3.toString());
            } catch (java.security.spec.InvalidKeySpecException e3) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unknown key type ");
                sb4.append(e3.getMessage());
                throw new java.security.InvalidKeyException(sb4.toString());
            }
        } catch (javax.crypto.BadPaddingException e4) {
            throw new java.security.InvalidKeyException("unable to unwrap") { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.1
                @Override // java.lang.Throwable
                public java.lang.Throwable getCause() {
                    javax.crypto.BadPaddingException badPaddingException;
                    synchronized (this) {
                        badPaddingException = e4;
                    }
                    return badPaddingException;
                }
            };
        } catch (javax.crypto.IllegalBlockSizeException e5) {
            throw new java.security.InvalidKeyException(e5.getMessage());
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e6) {
            throw new java.security.InvalidKeyException(e6.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding ");
        sb.append(str);
        sb.append(" unknown.");
        throw new javax.crypto.NoSuchPaddingException(sb.toString());
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(java.security.Key key) {
        return key.getEncoded().length;
    }

    public static final class ErasableOutputStream extends java.io.ByteArrayOutputStream {
        public final byte[] getBuf() {
            return this.buf;
        }

        public final void erase() {
            org.bouncycastle.util.Arrays.fill(this.buf, (byte) 0);
            reset();
        }
    }

    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        return this.getHighSpeedVideoFpsRangesFor.createAlgorithmParameters(str);
    }
}
