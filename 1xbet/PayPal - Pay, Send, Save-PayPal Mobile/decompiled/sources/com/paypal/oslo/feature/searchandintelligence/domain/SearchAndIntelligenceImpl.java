package com.paypal.oslo.feature.searchandintelligence.domain;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/SearchAndIntelligenceImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "<init>", "()V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/SearchAndIntelligenceDelegate;", "delegate", "", "setDelegate", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/SearchAndIntelligenceDelegate;)V", "", "text", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "messageType", "", "maxLines", "sendMessage", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;I)V", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "components", "displayComponents", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_CONTENT_KEY, "executeAction", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/ChatAction;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "notifyLogout", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/searchandintelligence/domain/SearchAndIntelligenceDelegate;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchAndIntelligenceImpl implements com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SearchAndIntelligenceImpl() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence
    public final void setDelegate(com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate delegate) {
        this.getHighSpeedVideoFpsRanges = delegate;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence
    public final void sendMessage(java.lang.String text, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType messageType, int maxLines) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
        getHighSpeedVideoFpsRangesFor(new com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage(text, messageType, maxLines), "sendMessage");
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence
    public final void displayComponents(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
        getHighSpeedVideoFpsRangesFor(new com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents(components), "displayComponents");
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence
    public final void executeAction(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
        getHighSpeedVideoFpsRangesFor(new com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction(actionContent), "executeAction");
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.searchandintelligence.domain.ChatAction p0, java.lang.String p1) {
        com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate searchAndIntelligenceDelegate = this.getHighSpeedVideoFpsRanges;
        if (searchAndIntelligenceDelegate != null) {
            searchAndIntelligenceDelegate.onAction(p0);
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.DELEGATE_MISSING, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ACTION_TYPE, p1)), null, null, 12, null);
        }
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence
    public final java.lang.String getSessionId() {
        com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate searchAndIntelligenceDelegate = this.getHighSpeedVideoFpsRanges;
        if (searchAndIntelligenceDelegate != null) {
            return searchAndIntelligenceDelegate.getSessionId();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence
    public final void notifyLogout() {
        com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate searchAndIntelligenceDelegate = this.getHighSpeedVideoFpsRanges;
        if (searchAndIntelligenceDelegate != null) {
            searchAndIntelligenceDelegate.onLogout();
        }
    }
}
