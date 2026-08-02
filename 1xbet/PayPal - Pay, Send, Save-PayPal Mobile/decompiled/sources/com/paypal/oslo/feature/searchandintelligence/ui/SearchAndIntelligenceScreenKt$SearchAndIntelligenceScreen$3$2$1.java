package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$3$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent chatEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatEvent, "");
        ((com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel) this.receiver).processEvent(chatEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent chatEvent) {
        getHighSpeedVideoFpsRanges(chatEvent);
        return kotlin.Unit.INSTANCE;
    }

    SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$3$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;)V", 0);
    }
}
