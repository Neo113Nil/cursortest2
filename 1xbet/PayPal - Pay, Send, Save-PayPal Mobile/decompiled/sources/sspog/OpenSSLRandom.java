package sspog;

/* loaded from: classes18.dex */
public class OpenSSLRandom extends java.security.SecureRandom {
    private static sspog.OpenSSLRandom INSTANCE;

    native void a();

    native void b(byte[] bArr);

    native void c(byte[] bArr);

    public static java.security.SecureRandom getInstance() {
        if (INSTANCE == null) {
            synchronized (sspog.OpenSSLRandom.class) {
                if (INSTANCE == null) {
                    sspog.SSPOGService.loadLibrary();
                    INSTANCE = new sspog.OpenSSLRandom();
                }
            }
        }
        return INSTANCE;
    }

    public static java.security.SecureRandom getInstanceStrong() {
        return getInstance();
    }

    private OpenSSLRandom() {
        a();
    }

    @Override // java.security.SecureRandom
    public java.lang.String getAlgorithm() {
        return "OpenSSLRandom";
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            b(bArr);
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (j >> (56 - (i * 8)));
        }
        setSeed(bArr);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length != 0) {
                    c(bArr);
                }
            }
        }
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }
}
