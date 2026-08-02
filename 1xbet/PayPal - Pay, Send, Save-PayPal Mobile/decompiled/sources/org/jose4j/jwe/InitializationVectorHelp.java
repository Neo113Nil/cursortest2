package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class InitializationVectorHelp {
    static byte[] Camera2StreamConfigurationMap(int i, byte[] bArr, java.security.SecureRandom secureRandom) {
        return bArr == null ? org.jose4j.lang.ByteUtil.randomBytes(i, secureRandom) : bArr;
    }
}
