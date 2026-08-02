package com.facetec.sdk;

/* loaded from: classes8.dex */
public class FaceTecVocalGuidanceCustomization {
    public com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode mode = com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.MINIMAL_VOCAL_GUIDANCE;
    public int pleaseFrameYourFaceInTheOvalSoundFile = -1;
    public int pleaseMoveCloserSoundFile = -1;
    public int pleaseRetrySoundFile = -1;
    public int uploadingSoundFile = -1;
    public int facescanSuccessfulSoundFile = -1;
    public int pleasePressTheButtonToStartSoundFile = -1;

    public enum VocalGuidanceMode {
        MINIMAL_VOCAL_GUIDANCE("MINIMAL_VOCAL_GUIDANCE"),
        FULL_VOCAL_GUIDANCE("FULL_VOCAL_GUIDANCE"),
        NO_VOCAL_GUIDANCE("NO_VOCAL_GUIDANCE");

        private final java.lang.String c;

        VocalGuidanceMode(java.lang.String str) {
            this.c = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.c;
        }
    }
}
