package com.adobe.marketing.mobile.messaging;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class Feed {
    private final com.adobe.marketing.mobile.messaging.Surface getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<com.adobe.marketing.mobile.messaging.FeedItem> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public Feed(java.lang.String str, com.adobe.marketing.mobile.messaging.Surface surface, java.util.List<com.adobe.marketing.mobile.messaging.FeedItem> list) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = surface;
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getSurfaceUri() {
        com.adobe.marketing.mobile.messaging.Surface surface = this.getHighResolutionOutputSizeshNQ4ISI;
        if (surface == null) {
            return null;
        }
        return surface.getUri();
    }

    public java.util.List<com.adobe.marketing.mobile.messaging.FeedItem> getItems() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
