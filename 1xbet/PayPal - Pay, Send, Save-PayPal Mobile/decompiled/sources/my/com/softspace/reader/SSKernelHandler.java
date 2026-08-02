package my.com.softspace.reader;

/* loaded from: classes17.dex */
public interface SSKernelHandler {
    java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2);

    java.lang.Object[] cmac(byte[] bArr);

    byte[] exchangeAPDU(byte[] bArr) throws java.lang.Exception;

    java.lang.Object[] hmacSHA256(byte[] bArr);

    void onComplete(byte[] bArr, int i, int i2);

    byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) throws java.lang.Exception;

    int updateUI(int i);
}
