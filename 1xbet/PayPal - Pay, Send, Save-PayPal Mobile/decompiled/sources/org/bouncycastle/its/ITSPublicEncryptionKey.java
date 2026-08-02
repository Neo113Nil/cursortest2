package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSPublicEncryptionKey {
    protected final org.bouncycastle.oer.its.PublicEncryptionKey encryptionKey;

    public enum symmAlgorithm {
        aes128Ccm;

        private final int Camera2StreamConfigurationMap;

        symmAlgorithm() {
            this.Camera2StreamConfigurationMap = r3;
        }
    }

    public org.bouncycastle.oer.its.PublicEncryptionKey toASN1Structure() {
        return this.encryptionKey;
    }

    public ITSPublicEncryptionKey(org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey) {
        this.encryptionKey = publicEncryptionKey;
    }
}
