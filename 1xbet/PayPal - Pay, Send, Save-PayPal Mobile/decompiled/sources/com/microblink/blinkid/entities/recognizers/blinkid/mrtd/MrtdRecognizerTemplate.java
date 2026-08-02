package com.microblink.blinkid.entities.recognizers.blinkid.mrtd;

@java.lang.Deprecated
/* loaded from: classes10.dex */
class MrtdRecognizerTemplate extends com.microblink.blinkid.secured.lIIllIIIll {

    public static class Result {
        public java.lang.String toString() {
            throw null;
        }
    }

    private static native void mrzFilterNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback mrzFilterCallback);

    private static native long[] specificationsNativeGet(long j);

    private static native void specificationsNativeSet(long j, long[] jArr);
}
