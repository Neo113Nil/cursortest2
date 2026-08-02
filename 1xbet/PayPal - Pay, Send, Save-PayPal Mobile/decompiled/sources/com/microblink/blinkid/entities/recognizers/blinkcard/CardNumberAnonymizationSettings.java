package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class CardNumberAnonymizationSettings {
    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode anonymizationMode;
    public final int prefixDigitsVisible;
    public final int suffixDigitsVisible;

    public CardNumberAnonymizationSettings() {
        this.anonymizationMode = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.None;
        this.prefixDigitsVisible = 0;
        this.suffixDigitsVisible = 0;
    }

    public CardNumberAnonymizationSettings(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode blinkCardAnonymizationMode, int i, int i2) {
        this.anonymizationMode = blinkCardAnonymizationMode;
        this.prefixDigitsVisible = i;
        this.suffixDigitsVisible = i2;
    }
}
