package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
class BlinkCardRecognizerTemplate extends com.microblink.blinkid.secured.lIIllIIIll {

    public static class Result {
        private static native int issuerNativeGet(long j);

        public java.lang.String toString() {
            return "BlinkCard Recognizer";
        }
    }

    private static native int[] anonymizationSettingsNativeGet(long j);

    private static native void anonymizationSettingsNativeSet(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    private static native void livenessStatusCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback nativeLivenessStatusCallback);
}
