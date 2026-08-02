package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LaunchRulesConsequenceKt {
    public static final /* synthetic */ java.lang.String access$getDetailId(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        java.lang.Object obj = ruleConsequence.getDetail().get("id");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public static final /* synthetic */ java.util.Map access$getEventData(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        java.lang.Object obj = ruleConsequence.getDetail().get("eventdata");
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String access$getEventDataAction(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        java.lang.Object obj = ruleConsequence.getDetail().get("eventdataaction");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String access$getEventSource(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        java.lang.Object obj = ruleConsequence.getDetail().get("source");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String access$getEventType(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        java.lang.Object obj = ruleConsequence.getDetail().get("type");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String access$getSchema(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        java.lang.Object obj = ruleConsequence.getDetail().get("schema");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }
}
