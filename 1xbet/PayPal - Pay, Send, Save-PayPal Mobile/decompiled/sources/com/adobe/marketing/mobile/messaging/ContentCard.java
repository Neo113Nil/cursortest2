package com.adobe.marketing.mobile.messaging;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class ContentCard {
    java.lang.ref.SoftReference<com.adobe.marketing.mobile.messaging.ContentCardSchemaData> Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;

    /* synthetic */ ContentCard(byte b) {
        this();
    }

    private ContentCard() {
    }

    static class Builder {
        boolean getHighSpeedVideoFpsRanges;
        final com.adobe.marketing.mobile.messaging.ContentCard getHighSpeedVideoFpsRangesFor;

        Builder(java.lang.String str, java.lang.String str2) {
            com.adobe.marketing.mobile.messaging.ContentCard contentCard = new com.adobe.marketing.mobile.messaging.ContentCard((byte) 0);
            this.getHighSpeedVideoFpsRangesFor = contentCard;
            contentCard.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) ? "" : str;
            contentCard.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) ? "" : str2;
            contentCard.getHighSpeedVideoFpsRangesFor = "";
            contentCard.getHighSpeedVideoSizes = "";
            contentCard.getHighResolutionOutputSizeshNQ4ISI = "";
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    public java.lang.String getTitle() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.lang.String getBody() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getImageUrl() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getActionUrl() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getActionTitle() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        java.lang.ref.SoftReference<com.adobe.marketing.mobile.messaging.ContentCardSchemaData> softReference = this.Camera2StreamConfigurationMap;
        if (softReference == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ContentCard", "Unable to track ContentCard, parent schema object is unavailable.", new java.lang.Object[0]);
        } else {
            softReference.get().track(str, messagingEdgeEventType);
        }
    }
}
