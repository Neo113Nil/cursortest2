package org.tensorflow.lite.nnapi;

/* loaded from: classes18.dex */
public class NnApiDelegateImpl implements org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.lang.AutoCloseable {
    private long getHighSpeedVideoSizes;

    private static native long createDelegate(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    public NnApiDelegateImpl(org.tensorflow.lite.nnapi.NnApiDelegate.Options options) {
        org.tensorflow.lite.TensorFlowLite.init();
        int executionPreference = options.getExecutionPreference();
        java.lang.String acceleratorName = options.getAcceleratorName();
        java.lang.String cacheDir = options.getCacheDir();
        java.lang.String modelToken = options.getModelToken();
        int maxNumberOfDelegatedPartitions = options.getMaxNumberOfDelegatedPartitions();
        boolean z = true;
        boolean z2 = options.getUseNnapiCpu() != null;
        if (options.getUseNnapiCpu() != null && options.getUseNnapiCpu().booleanValue()) {
            z = false;
        }
        this.getHighSpeedVideoSizes = createDelegate(executionPreference, acceleratorName, cacheDir, modelToken, maxNumberOfDelegatedPartitions, z2, z, options.getAllowFp16(), options.getNnApiSupportLibraryHandle());
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.getHighSpeedVideoSizes;
        if (j != 0) {
            deleteDelegate(j);
            this.getHighSpeedVideoSizes = 0L;
        }
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface
    public int getNnapiErrno() {
        long j = this.getHighSpeedVideoSizes;
        if (j != 0) {
            return getNnapiErrno(j);
        }
        throw new java.lang.IllegalStateException("Should not access delegate after it has been closed.");
    }
}
