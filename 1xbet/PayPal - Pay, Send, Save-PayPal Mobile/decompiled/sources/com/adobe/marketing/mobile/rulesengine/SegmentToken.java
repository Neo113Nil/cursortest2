package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class SegmentToken implements com.adobe.marketing.mobile.rulesengine.Segment {
    private final com.adobe.marketing.mobile.rulesengine.MustacheToken Camera2StreamConfigurationMap;

    public SegmentToken(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.rulesengine.MustacheToken(str);
    }

    public com.adobe.marketing.mobile.rulesengine.MustacheToken getMustacheToken() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Segment
    public java.lang.String getContent(com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder, com.adobe.marketing.mobile.rulesengine.Transforming transforming) {
        java.lang.Object highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(tokenFinder, transforming);
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor.toString();
        }
        return "";
    }
}
