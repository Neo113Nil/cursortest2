package com.microblink.blinkid.entities.recognizers.blinkid.documentface;

@java.lang.Deprecated
/* loaded from: classes10.dex */
class DocumentFaceRecognizerTemplate {

    public static class Result {
        private static native float[] documentLocationNativeGet(long j);

        private static native float[] faceLocationNativeGet(long j);

        public java.lang.String toString() {
            return "Document face recognizer";
        }
    }

    private static native int detectorTypeNativeGet(long j);

    private static native void detectorTypeNativeSet(long j, int i);
}
