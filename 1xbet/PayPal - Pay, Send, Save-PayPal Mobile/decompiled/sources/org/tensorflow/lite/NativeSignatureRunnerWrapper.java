package org.tensorflow.lite;

/* loaded from: classes18.dex */
final class NativeSignatureRunnerWrapper {
    boolean Camera2StreamConfigurationMap = false;
    final long getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoSizes;

    static native void nativeAllocateTensors(long j, long j2);

    private static native int nativeGetInputIndex(long j, java.lang.String str);

    private static native int nativeGetOutputIndex(long j, java.lang.String str);

    private static native long nativeGetSignatureRunner(long j, java.lang.String str);

    static native int nativeGetSubgraphIndex(long j);

    static native java.lang.String[] nativeInputNames(long j);

    static native void nativeInvoke(long j, long j2);

    static native java.lang.String[] nativeOutputNames(long j);

    static native boolean nativeResizeInput(long j, long j2, java.lang.String str, int[] iArr);

    NativeSignatureRunnerWrapper(long j, long j2, java.lang.String str) {
        this.getHighSpeedVideoSizes = j2;
        long nativeGetSignatureRunner = nativeGetSignatureRunner(j, str);
        this.getHighSpeedVideoFpsRanges = nativeGetSignatureRunner;
        if (nativeGetSignatureRunner != -1) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: Signature ");
        sb.append(str);
        sb.append(" not found.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final int Camera2StreamConfigurationMap(java.lang.String str) {
        int nativeGetInputIndex = nativeGetInputIndex(this.getHighSpeedVideoFpsRanges, str);
        if (nativeGetInputIndex != -1) {
            return nativeGetInputIndex;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: input ");
        sb.append(str);
        sb.append(" not found.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int nativeGetOutputIndex = nativeGetOutputIndex(this.getHighSpeedVideoFpsRanges, str);
        if (nativeGetOutputIndex != -1) {
            return nativeGetOutputIndex;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: output ");
        sb.append(str);
        sb.append(" not found.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
