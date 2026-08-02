package com.microblink.blinkid.recognition;

/* loaded from: classes.dex */
public class FrameAnalyzers {
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle IlIllIlIIl;
    public final long llIIlIlIIl;

    static {
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    public FrameAnalyzers(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, double d) {
        this.llIIlIlIIl = 0L;
        this.IlIllIlIIl = null;
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        this.llIIlIlIIl = initializeNativeFrameSupport(com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(recognizerBundle.getRecognizers()), recognizerBundle.getFrameQualityEstimationMode().ordinal(), com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII, d);
        this.IlIllIlIIl = recognizerBundle;
    }

    private static native long initializeNativeFrameSupport(long[] jArr, int i, int i2, double d);

    private static native void terminateNativeFrameSupport(long j);

    private static native void updateNativeFrameSupport(long j, long[] jArr, int i, int i2);

    public final void llIIlIlIIl(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        if (recognizerBundle.equals(this.IlIllIlIIl)) {
            return;
        }
        updateNativeFrameSupport(this.llIIlIlIIl, com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(recognizerBundle.getRecognizers()), recognizerBundle.getFrameQualityEstimationMode().ordinal(), com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII);
        this.IlIllIlIIl = recognizerBundle;
    }

    public final void llIIlIlIIl() {
        terminateNativeFrameSupport(this.llIIlIlIIl);
        this.IlIllIlIIl = null;
    }
}
