package org.bouncycastle.jcajce.provider.drbg;

/* loaded from: classes17.dex */
public class DRBG {
    private static final java.lang.String[][] getHighSpeedVideoFpsRanges = {new java.lang.String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new java.lang.String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new java.lang.String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new java.lang.String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "org.bouncycastle.jcajce.provider.drbg.DRBG";

    static class HybridSecureRandom extends java.security.SecureRandom {
        private final org.bouncycastle.crypto.prng.SP800SecureRandom Camera2StreamConfigurationMap;
        private final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;

        class SignallingEntropySource implements org.bouncycastle.crypto.prng.EntropySource {
            private final int Camera2StreamConfigurationMap;
            private final java.util.concurrent.atomic.AtomicReference getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference();
            private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return true;
            }

            class EntropyGatherer implements java.lang.Runnable {
                private final int Camera2StreamConfigurationMap;

                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String propertyValue = org.bouncycastle.util.Properties.getPropertyValue("org.bouncycastle.drbg.gather_pause_secs");
                    long j = 5000;
                    if (propertyValue != null) {
                        try {
                            j = java.lang.Long.parseLong(propertyValue) * 1000;
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    int i = this.Camera2StreamConfigurationMap;
                    byte[] bArr = new byte[i];
                    for (int i2 = 0; i2 < org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.SignallingEntropySource.this.Camera2StreamConfigurationMap / 8; i2++) {
                        try {
                            java.lang.Thread.sleep(j);
                        } catch (java.lang.InterruptedException unused2) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        byte[] generateSeed = org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.this.getHighResolutionOutputSizeshNQ4ISI.generateSeed(8);
                        java.lang.System.arraycopy(generateSeed, 0, bArr, i2 * 8, generateSeed.length);
                    }
                    int i3 = org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.SignallingEntropySource.this.Camera2StreamConfigurationMap - ((org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.SignallingEntropySource.this.Camera2StreamConfigurationMap / 8) * 8);
                    if (i3 != 0) {
                        try {
                            java.lang.Thread.sleep(j);
                        } catch (java.lang.InterruptedException unused3) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        byte[] generateSeed2 = org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.this.getHighResolutionOutputSizeshNQ4ISI.generateSeed(i3);
                        java.lang.System.arraycopy(generateSeed2, 0, bArr, i - generateSeed2.length, generateSeed2.length);
                    }
                    org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.SignallingEntropySource.this.getHighSpeedVideoFpsRanges.set(bArr);
                    org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.this.getHighSpeedVideoSizes.set(true);
                }

                EntropyGatherer(int i) {
                    this.Camera2StreamConfigurationMap = i;
                }
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                byte[] bArr = (byte[]) this.getHighSpeedVideoFpsRanges.getAndSet(null);
                if (bArr == null || bArr.length != this.Camera2StreamConfigurationMap) {
                    bArr = org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.this.getHighResolutionOutputSizeshNQ4ISI.generateSeed(this.Camera2StreamConfigurationMap);
                } else {
                    this.getHighSpeedVideoSizes.set(false);
                }
                if (!this.getHighSpeedVideoSizes.getAndSet(true)) {
                    java.lang.Thread thread = new java.lang.Thread(new org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.SignallingEntropySource.EntropyGatherer(this.Camera2StreamConfigurationMap));
                    thread.setDaemon(true);
                    thread.start();
                }
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.Camera2StreamConfigurationMap * 8;
            }

            SignallingEntropySource(int i) {
                this.Camera2StreamConfigurationMap = (i + 7) / 8;
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            org.bouncycastle.crypto.prng.SP800SecureRandom sP800SecureRandom = this.Camera2StreamConfigurationMap;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(bArr);
            }
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
            org.bouncycastle.crypto.prng.SP800SecureRandom sP800SecureRandom = this.Camera2StreamConfigurationMap;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(j);
            }
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.getHighSpeedVideoFpsRanges.getAndIncrement() > 20 && this.getHighSpeedVideoSizes.getAndSet(false)) {
                this.getHighSpeedVideoFpsRanges.set(0);
                this.Camera2StreamConfigurationMap.reseed(null);
            }
            this.Camera2StreamConfigurationMap.nextBytes(bArr);
            return bArr;
        }

        HybridSecureRandom() {
            super(null, new org.bouncycastle.jcajce.provider.drbg.DRBG.HybridRandomProvider());
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(0);
            java.security.SecureRandom Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.drbg.DRBG.Camera2StreamConfigurationMap();
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder(new org.bouncycastle.crypto.prng.EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public org.bouncycastle.crypto.prng.EntropySource get(int i) {
                    return org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.this.new SignallingEntropySource(i);
                }
            }).setPersonalizationString(org.bouncycastle.util.Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA512Digest()), Camera2StreamConfigurationMap.generateSeed(32), false);
        }
    }

    static class URLSeededSecureRandom extends java.security.SecureRandom {
        private final java.io.InputStream getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            final byte[] bArr;
            synchronized (this) {
                bArr = new byte[i];
                final int i2 = 0;
                while (i2 != i) {
                    final int i3 = i - i2;
                    int intValue = ((java.lang.Integer) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.2
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.security.PrivilegedAction
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public java.lang.Integer run() {
                            try {
                                return java.lang.Integer.valueOf(org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.this.getHighResolutionOutputSizeshNQ4ISI.read(bArr, i2, i3));
                            } catch (java.io.IOException unused) {
                                throw new java.lang.InternalError("unable to read random source");
                            }
                        }
                    })).intValue();
                    if (intValue < 0) {
                        break;
                    }
                    i2 += intValue;
                }
                if (i2 != i) {
                    throw new java.lang.InternalError("unable to fully read random source");
                }
            }
            return bArr;
        }

        URLSeededSecureRandom(final java.net.URL url) {
            super(null, new org.bouncycastle.jcajce.provider.drbg.DRBG.HybridRandomProvider());
            this.getHighResolutionOutputSizeshNQ4ISI = (java.io.InputStream) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.io.InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public java.io.InputStream run() {
                    try {
                        return url.openStream();
                    } catch (java.io.IOException unused) {
                        throw new java.lang.IllegalStateException("unable to open random source");
                    }
                }
            });
        }
    }

    static /* synthetic */ java.security.SecureRandom getHighSpeedVideoFpsRangesFor(boolean z) {
        if (org.bouncycastle.util.Properties.getPropertyValue("org.bouncycastle.drbg.entropysource") == null) {
            org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom hybridSecureRandom = new org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom();
            byte[] generateSeed = hybridSecureRandom.generateSeed(16);
            return new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder(hybridSecureRandom, true).setPersonalizationString(z ? org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toByteArray("Default"), generateSeed, org.bouncycastle.util.Pack.longToBigEndian(java.lang.Thread.currentThread().getId()), org.bouncycastle.util.Pack.longToBigEndian(java.lang.System.currentTimeMillis())) : org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toByteArray("Nonce"), generateSeed, org.bouncycastle.util.Pack.longToLittleEndian(java.lang.Thread.currentThread().getId()), org.bouncycastle.util.Pack.longToLittleEndian(java.lang.System.currentTimeMillis()))).buildHash(new org.bouncycastle.crypto.digests.SHA512Digest(), hybridSecureRandom.generateSeed(32), z);
        }
        final java.lang.String propertyValue = org.bouncycastle.util.Properties.getPropertyValue("org.bouncycastle.drbg.entropysource");
        org.bouncycastle.crypto.prng.EntropySourceProvider entropySourceProvider = (org.bouncycastle.crypto.prng.EntropySourceProvider) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<org.bouncycastle.crypto.prng.EntropySourceProvider>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public org.bouncycastle.crypto.prng.EntropySourceProvider run() {
                try {
                    return (org.bouncycastle.crypto.prng.EntropySourceProvider) org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jcajce.provider.drbg.DRBG.class, propertyValue).newInstance();
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("entropy source ");
                    sb.append(propertyValue);
                    sb.append(" not created: ");
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalStateException(sb.toString(), e);
                }
            }
        });
        org.bouncycastle.crypto.prng.EntropySource entropySource = entropySourceProvider.get(128);
        byte[] entropy = entropySource.getEntropy();
        return new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder(entropySourceProvider).setPersonalizationString(z ? org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toByteArray("Default"), entropy, org.bouncycastle.util.Pack.longToBigEndian(java.lang.Thread.currentThread().getId()), org.bouncycastle.util.Pack.longToBigEndian(java.lang.System.currentTimeMillis())) : org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toByteArray("Nonce"), entropy, org.bouncycastle.util.Pack.longToLittleEndian(java.lang.Thread.currentThread().getId()), org.bouncycastle.util.Pack.longToLittleEndian(java.lang.System.currentTimeMillis()))).buildHash(new org.bouncycastle.crypto.digests.SHA512Digest(), org.bouncycastle.util.Arrays.concatenate(entropySource.getEntropy(), entropySource.getEntropy()), z);
    }

    static /* synthetic */ java.security.SecureRandom Camera2StreamConfigurationMap() {
        return ((java.lang.Boolean) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            @Override // java.security.PrivilegedAction
            public final /* synthetic */ java.lang.Boolean run() {
                return getHighSpeedVideoFpsRanges();
            }

            private static java.lang.Boolean getHighSpeedVideoFpsRanges() {
                try {
                    return java.lang.Boolean.valueOf(java.security.SecureRandom.class.getMethod("getInstanceStrong", new java.lang.Class[0]) != null);
                } catch (java.lang.Exception unused) {
                    return java.lang.Boolean.FALSE;
                }
            }
        })).booleanValue() ? (java.security.SecureRandom) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.security.SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
            private static java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI() {
                try {
                    return (java.security.SecureRandom) java.security.SecureRandom.class.getMethod("getInstanceStrong", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                    return org.bouncycastle.jcajce.provider.drbg.DRBG.getHighResolutionOutputSizeshNQ4ISI();
                }
            }

            @Override // java.security.PrivilegedAction
            public final /* synthetic */ java.security.SecureRandom run() {
                return getHighResolutionOutputSizeshNQ4ISI();
            }
        }) : getHighResolutionOutputSizeshNQ4ISI();
    }

    public static class Default extends java.security.SecureRandomSpi {
        private static final java.security.SecureRandom getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.drbg.DRBG.getHighSpeedVideoFpsRangesFor(true);

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            getHighSpeedVideoSizes.setSeed(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            getHighSpeedVideoSizes.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return getHighSpeedVideoSizes.generateSeed(i);
        }
    }

    public static class NonceAndIV extends java.security.SecureRandomSpi {
        private static final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.drbg.DRBG.getHighSpeedVideoFpsRangesFor(false);

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            getHighResolutionOutputSizeshNQ4ISI.setSeed(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return getHighResolutionOutputSizeshNQ4ISI.generateSeed(i);
        }
    }

    private static final java.lang.Object[] getHighSpeedVideoFpsRanges() {
        char c = 0;
        int i = 0;
        while (true) {
            java.lang.String[][] strArr = getHighSpeedVideoFpsRanges;
            if (i >= strArr.length) {
                return null;
            }
            java.lang.String[] strArr2 = strArr[i];
            try {
                return new java.lang.Object[]{java.lang.Class.forName(strArr2[c]).newInstance(), java.lang.Class.forName(strArr2[1]).newInstance()};
            } catch (java.lang.Throwable unused) {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI() {
        if (java.security.Security.getProperty("securerandom.source") == null) {
            return new org.bouncycastle.jcajce.provider.drbg.DRBG.CoreSecureRandom(getHighSpeedVideoFpsRanges());
        }
        try {
            return new org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom(new java.net.URL(java.security.Security.getProperty("securerandom.source")));
        } catch (java.lang.Exception unused) {
            return new org.bouncycastle.jcajce.provider.drbg.DRBG.CoreSecureRandom(getHighSpeedVideoFpsRanges());
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(org.bouncycastle.jcajce.provider.drbg.DRBG.getHighSpeedVideoFpsRangesFor);
            sb.append("$Default");
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(org.bouncycastle.jcajce.provider.drbg.DRBG.getHighSpeedVideoFpsRangesFor);
            sb2.append("$NonceAndIV");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", sb2.toString());
        }
    }

    static class CoreSecureRandom extends java.security.SecureRandom {
        CoreSecureRandom(java.lang.Object[] objArr) {
            super((java.security.SecureRandomSpi) objArr[1], (java.security.Provider) objArr[0]);
        }
    }

    static class HybridRandomProvider extends java.security.Provider {
        protected HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }
}
