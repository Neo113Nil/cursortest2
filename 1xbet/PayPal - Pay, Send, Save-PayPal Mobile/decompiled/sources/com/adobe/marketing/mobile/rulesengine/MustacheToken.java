package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
class MustacheToken {
    private java.lang.String Camera2StreamConfigurationMap;
    private com.adobe.marketing.mobile.rulesengine.MustacheToken getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.rulesengine.MustacheToken.Type getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    enum Type {
        FUNCTION,
        VARIABLE
    }

    MustacheToken(java.lang.String str) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(([^)]+)\\)").matcher(str);
        this.getHighSpeedVideoSizes = str;
        if (matcher.find()) {
            this.getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.rulesengine.MustacheToken(matcher.group(1));
            this.Camera2StreamConfigurationMap = str.substring(0, matcher.start());
            this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.rulesengine.MustacheToken.Type.FUNCTION;
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.rulesengine.MustacheToken.Type.VARIABLE;
    }

    protected final java.lang.Object getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder, com.adobe.marketing.mobile.rulesengine.Transforming transforming) {
        if (this.getHighSpeedVideoFpsRangesFor == com.adobe.marketing.mobile.rulesengine.MustacheToken.Type.FUNCTION) {
            return transforming.transform(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(tokenFinder, transforming));
        }
        return tokenFinder.get(this.getHighSpeedVideoSizes);
    }
}
