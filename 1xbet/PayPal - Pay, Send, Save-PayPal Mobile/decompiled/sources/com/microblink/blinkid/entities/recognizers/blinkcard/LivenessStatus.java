package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public enum LivenessStatus {
    NotAvailable,
    HandNotPresent,
    NotEnoughHandPresent,
    DocumentNotInHand,
    DocumentInHand;

    public static com.microblink.blinkid.entities.recognizers.blinkcard.LivenessStatus fromId(int i) {
        return values()[i];
    }
}
