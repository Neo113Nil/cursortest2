package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class Template {
    private final java.util.List<com.adobe.marketing.mobile.rulesengine.Segment> getHighResolutionOutputSizeshNQ4ISI;

    public Template(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.rulesengine.TemplateParser.getHighResolutionOutputSizeshNQ4ISI(str);
    }

    public Template(java.lang.String str, com.adobe.marketing.mobile.rulesengine.DelimiterPair delimiterPair) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.rulesengine.TemplateParser.getHighResolutionOutputSizeshNQ4ISI(str, delimiterPair);
    }

    public java.lang.String render(com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder, com.adobe.marketing.mobile.rulesengine.Transforming transforming) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<com.adobe.marketing.mobile.rulesengine.Segment> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getContent(tokenFinder, transforming));
        }
        return sb.toString();
    }
}
