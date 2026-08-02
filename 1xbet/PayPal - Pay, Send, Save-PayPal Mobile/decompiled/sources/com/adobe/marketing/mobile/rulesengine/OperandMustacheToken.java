package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class OperandMustacheToken<T> implements com.adobe.marketing.mobile.rulesengine.Operand<T> {
    private final java.lang.Class<T> getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.rulesengine.MustacheToken getHighSpeedVideoSizes;

    public OperandMustacheToken(java.lang.String str, java.lang.Class<T> cls) {
        java.util.List<com.adobe.marketing.mobile.rulesengine.Segment> highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.rulesengine.TemplateParser.getHighResolutionOutputSizeshNQ4ISI(str);
        this.getHighSpeedVideoSizes = (highResolutionOutputSizeshNQ4ISI.size() <= 0 || !(highResolutionOutputSizeshNQ4ISI.get(0) instanceof com.adobe.marketing.mobile.rulesengine.SegmentToken)) ? null : ((com.adobe.marketing.mobile.rulesengine.SegmentToken) highResolutionOutputSizeshNQ4ISI.get(0)).getMustacheToken();
        this.getHighResolutionOutputSizeshNQ4ISI = cls;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Operand
    public T resolve(com.adobe.marketing.mobile.rulesengine.Context context) {
        com.adobe.marketing.mobile.rulesengine.MustacheToken mustacheToken = this.getHighSpeedVideoSizes;
        if (mustacheToken == null) {
            return null;
        }
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.cast(mustacheToken.getHighSpeedVideoFpsRangesFor(context.tokenFinder, context.transformer));
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }
}
