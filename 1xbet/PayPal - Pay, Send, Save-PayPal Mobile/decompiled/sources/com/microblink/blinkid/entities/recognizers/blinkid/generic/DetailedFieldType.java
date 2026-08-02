package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class DetailedFieldType {
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType getHighSpeedVideoFpsRanges;

    public DetailedFieldType(com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType fieldType, com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType alphabetType) {
        this.getHighResolutionOutputSizeshNQ4ISI = fieldType;
        this.getHighSpeedVideoFpsRanges = alphabetType;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType getAlphabetType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType getFieldType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
