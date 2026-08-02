package com.adobe.marketing.mobile.messaging;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class FeedItem {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    com.adobe.marketing.mobile.messaging.FeedItemSchemaData getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;

    /* synthetic */ FeedItem(byte b) {
        this();
    }

    private FeedItem() {
    }

    public static class Builder {
        private final com.adobe.marketing.mobile.messaging.FeedItem Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRanges;

        public Builder(java.lang.String str, java.lang.String str2) {
            com.adobe.marketing.mobile.messaging.FeedItem feedItem = new com.adobe.marketing.mobile.messaging.FeedItem((byte) 0);
            this.Camera2StreamConfigurationMap = feedItem;
            feedItem.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) ? "" : str;
            feedItem.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) ? "" : str2;
            feedItem.Camera2StreamConfigurationMap = "";
            feedItem.getHighResolutionOutputSizeshNQ4ISI = "";
            feedItem.getHighSpeedVideoFpsRanges = "";
            this.getHighSpeedVideoFpsRanges = false;
        }

        public com.adobe.marketing.mobile.messaging.FeedItem build() {
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor)) {
                return null;
            }
            if (!this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = true;
                return this.Camera2StreamConfigurationMap;
            }
            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
        }

        public com.adobe.marketing.mobile.messaging.FeedItem.Builder setActionTitle(java.lang.String str) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = str;
                return this;
            }
            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
        }

        public com.adobe.marketing.mobile.messaging.FeedItem.Builder setActionUrl(java.lang.String str) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI = str;
                return this;
            }
            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
        }

        public com.adobe.marketing.mobile.messaging.FeedItem.Builder setImageUrl(java.lang.String str) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = str;
                return this;
            }
            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
        }

        public com.adobe.marketing.mobile.messaging.FeedItem.Builder setParent(com.adobe.marketing.mobile.messaging.FeedItemSchemaData feedItemSchemaData) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes = feedItemSchemaData;
                return this;
            }
            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
        }
    }

    public java.lang.String getTitle() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.lang.String getBody() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getImageUrl() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getActionUrl() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getActionTitle() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        com.adobe.marketing.mobile.messaging.FeedItemSchemaData feedItemSchemaData = this.getHighSpeedVideoSizes;
        if (feedItemSchemaData == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "FeedItem", "Unable to track ContentCard, parent schema object is unavailable.", new java.lang.Object[0]);
        } else {
            feedItemSchemaData.track(str, messagingEdgeEventType);
        }
    }
}
