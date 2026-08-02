package com.microblink.blinkid.metadata.detection;

/* loaded from: classes10.dex */
public abstract class DisplayableDetection extends com.microblink.blinkid.metadata.DisplayableObject {
    protected final com.microblink.blinkid.view.recognition.DetectionStatus IlIllIlIIl;

    public DisplayableDetection(int i, float[] fArr) {
        super(fArr);
        this.IlIllIlIIl = com.microblink.blinkid.view.recognition.DetectionStatus.values()[i];
    }

    public final com.microblink.blinkid.view.recognition.DetectionStatus getDetectionStatus() {
        return this.IlIllIlIIl;
    }
}
