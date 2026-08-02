package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/QuickStartPromptViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;)V", "", "prompt", "", "sendPrompt", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QuickStartPromptViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence getHighSpeedVideoSizes;

    @javax.inject.Inject
    public QuickStartPromptViewModel(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchAndIntelligence, "");
        this.getHighSpeedVideoSizes = searchAndIntelligence;
    }

    public final void sendPrompt(java.lang.String prompt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prompt, "");
        com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence.sendMessage$default(this.getHighSpeedVideoSizes, prompt, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.USER_VISIBLE_REMOTE, 0, 4, null);
    }
}
