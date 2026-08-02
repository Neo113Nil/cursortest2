package com.paypal.oslo.feature.searchandintelligence.api.domain;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", "", "", "text", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "messageType", "", "maxLines", "", "sendMessage", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)V", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "components", "displayComponents", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_CONTENT_KEY, "executeAction", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SearchAndIntelligence {
    void displayComponents(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components);

    void executeAction(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent);

    void sendMessage(java.lang.String text, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType, int maxLines);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void sendMessage$default(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
        }
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        searchAndIntelligence.sendMessage(str, requestedMessageType, i);
    }
}
