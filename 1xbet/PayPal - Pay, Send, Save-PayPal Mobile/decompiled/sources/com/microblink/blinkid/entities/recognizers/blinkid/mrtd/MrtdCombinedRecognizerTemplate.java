package com.microblink.blinkid.entities.recognizers.blinkid.mrtd;

@java.lang.Deprecated
/* loaded from: classes10.dex */
class MrtdCombinedRecognizerTemplate extends com.microblink.blinkid.secured.lIIllIIIll {

    public static class Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult {
        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public boolean isScanningFirstSideDone() {
            return false;
        }

        public java.lang.String toString() {
            return "Mrtd Combined Recognizer";
        }
    }

    private static native int detectorTypeNativeGet(long j);

    private static native void detectorTypeNativeSet(long j, int i);

    private static native void mrzFilterNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback mrzFilterCallback);
}
