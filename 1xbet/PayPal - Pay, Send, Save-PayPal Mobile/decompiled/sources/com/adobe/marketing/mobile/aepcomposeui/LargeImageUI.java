package com.adobe.marketing.mobile.aepcomposeui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/LargeImageUI;", "Lcom/adobe/marketing/mobile/aepcomposeui/BaseAepUI;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/LargeImageTemplate;", "Lcom/adobe/marketing/mobile/aepcomposeui/state/LargeImageCardUIState;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "state", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/LargeImageTemplate;Lcom/adobe/marketing/mobile/aepcomposeui/state/LargeImageCardUIState;)V", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/LargeImageTemplate;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LargeImageUI extends com.adobe.marketing.mobile.aepcomposeui.BaseAepUI<com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate, com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeImageUI(com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate largeImageTemplate, com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState largeImageCardUIState) {
        super(largeImageTemplate, largeImageCardUIState, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeImageTemplate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeImageCardUIState, "");
        this.getHighResolutionOutputSizeshNQ4ISI = largeImageTemplate;
    }
}
