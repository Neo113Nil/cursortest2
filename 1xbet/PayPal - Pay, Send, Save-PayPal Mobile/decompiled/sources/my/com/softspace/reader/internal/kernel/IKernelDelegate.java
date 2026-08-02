package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public interface IKernelDelegate {
    java.lang.Integer cvmType();

    void init(android.content.Context context, byte[] bArr);

    byte[] onlineData();

    byte[] onlineResponseData();

    int preProcessing(android.content.Context context, java.lang.String str, int i, byte[] bArr, my.com.softspace.reader.internal.kernel.Kernel.Callback callback);

    void release(android.content.Context context);

    int start(android.content.Context context, my.com.softspace.reader.internal.kernel.KernelDelegateParam kernelDelegateParam, my.com.softspace.reader.internal.kernel.Kernel.Callback callback);

    java.lang.Integer transactionResult();
}
