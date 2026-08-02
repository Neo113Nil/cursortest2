package my.com.softspace.reader;

/* loaded from: classes17.dex */
public class SSKernelJNI {
    public static native int enterPIN(java.lang.String str, int i, byte[] bArr);

    public static native int initKernel(java.lang.String str, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, boolean z2);

    public static native int initKernel(java.lang.String str, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, boolean z2, boolean z3);

    public static native int onlineProcessing(java.lang.String str, byte[] bArr, byte[] bArr2, int i, boolean z, boolean z2);

    public static native int preProcessing(java.lang.String str, int i, byte[] bArr, byte[] bArr2);

    private SSKernelJNI() {
    }
}
