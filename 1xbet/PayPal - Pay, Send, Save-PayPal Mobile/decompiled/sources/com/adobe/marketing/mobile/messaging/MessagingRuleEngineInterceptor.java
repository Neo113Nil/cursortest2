package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/MessagingRuleEngineInterceptor;", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleReevaluationInterceptor;", "<init>", "()V", "Lcom/adobe/marketing/mobile/Event;", "event", "", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "revaluableRules", "Lcom/adobe/marketing/mobile/AdobeCallback;", "", com.sun.jna.Callback.METHOD_NAME, "", "onReevaluationTriggered", "(Lcom/adobe/marketing/mobile/Event;Ljava/util/List;Lcom/adobe/marketing/mobile/AdobeCallback;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessagingRuleEngineInterceptor implements com.adobe.marketing.mobile.launch.rulesengine.RuleReevaluationInterceptor {
    public static final int $stable = 0;

    @Override // com.adobe.marketing.mobile.launch.rulesengine.RuleReevaluationInterceptor
    public final void onReevaluationTriggered(com.adobe.marketing.mobile.Event event, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> revaluableRules, com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revaluableRules, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.adobe.marketing.mobile.messaging.IamRefreshHandler.INSTANCE.refreshInAppMessages(callback);
    }
}
