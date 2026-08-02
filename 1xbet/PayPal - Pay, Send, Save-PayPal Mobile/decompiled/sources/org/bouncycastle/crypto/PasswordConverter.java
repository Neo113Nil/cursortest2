package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public enum PasswordConverter implements org.bouncycastle.crypto.CharToByteConverter {
    ASCII { // from class: org.bouncycastle.crypto.PasswordConverter.1
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final java.lang.String getType() {
            return "ASCII";
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final byte[] convert(char[] cArr) {
            return org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(cArr);
        }
    },
    UTF8 { // from class: org.bouncycastle.crypto.PasswordConverter.2
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final java.lang.String getType() {
            return "UTF8";
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final byte[] convert(char[] cArr) {
            return org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(cArr);
        }
    },
    PKCS12 { // from class: org.bouncycastle.crypto.PasswordConverter.3
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final java.lang.String getType() {
            return "PKCS12";
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final byte[] convert(char[] cArr) {
            return org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        }
    };

    /* synthetic */ PasswordConverter(byte b) {
        this();
    }
}
