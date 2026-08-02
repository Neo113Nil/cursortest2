package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public final class DataEntity {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Date getHighSpeedVideoFpsRangesFor;

    public DataEntity(java.lang.String str) {
        this(java.util.UUID.randomUUID().toString(), new java.util.Date(), str);
    }

    public DataEntity(java.lang.String str, java.util.Date date, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = date;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    public final java.lang.String getUniqueIdentifier() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Date getTimestamp() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataEntity{uniqueIdentifier='");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("', timeStamp=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", data=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
