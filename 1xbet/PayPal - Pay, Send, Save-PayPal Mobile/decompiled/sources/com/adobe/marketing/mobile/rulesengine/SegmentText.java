package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class SegmentText implements com.adobe.marketing.mobile.rulesengine.Segment {
    private final java.lang.String Camera2StreamConfigurationMap;

    public SegmentText(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Segment
    public java.lang.String getContent(com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder, com.adobe.marketing.mobile.rulesengine.Transforming transforming) {
        return this.Camera2StreamConfigurationMap;
    }
}
