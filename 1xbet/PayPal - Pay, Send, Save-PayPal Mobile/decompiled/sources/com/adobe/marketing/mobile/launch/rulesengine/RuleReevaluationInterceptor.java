package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/RuleReevaluationInterceptor;", "", "Lcom/adobe/marketing/mobile/Event;", "event", "", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "revaluableRules", "Lcom/adobe/marketing/mobile/AdobeCallback;", "", com.sun.jna.Callback.METHOD_NAME, "", "onReevaluationTriggered", "(Lcom/adobe/marketing/mobile/Event;Ljava/util/List;Lcom/adobe/marketing/mobile/AdobeCallback;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface RuleReevaluationInterceptor {
    void onReevaluationTriggered(com.adobe.marketing.mobile.Event event, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> revaluableRules, com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean> callback);
}
