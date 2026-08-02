package com.paypal.oslo.feature.searchandintelligence.domain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/SearchAndIntelligenceDelegate;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;", "action", "", "onAction", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;)V", "", "getSessionId", "()Ljava/lang/String;", "onLogout", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SearchAndIntelligenceDelegate {
    java.lang.String getSessionId();

    void onAction(com.paypal.oslo.feature.searchandintelligence.domain.ChatAction action);

    void onLogout();
}
