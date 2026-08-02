package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEventHandler;", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "", "onEvent", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;", "onContactSellerCallback", "Lcom/paypal/oslo/feature/activity/ui/detail/model/BlockP2PData;", "onBlockP2PCallback", "Lcom/paypal/oslo/feature/activity/ui/detail/model/RequestRefundData;", "onRequestRefundCallback", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "event", "handle", "(Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HelpSectionEventHandler {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public HelpSectionEventHandler(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData, kotlin.Unit> function14) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = function12;
        this.getHighSpeedVideoFpsRangesFor = function13;
        this.getHighResolutionOutputSizeshNQ4ISI = function14;
    }

    public final void handle(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller) {
            this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller) event).getData());
            return;
        }
        if (event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser) {
            this.getHighSpeedVideoFpsRangesFor.invoke(((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser) event).getData());
            return;
        }
        if (event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel) event).getData());
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem) && !(event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser) && !(event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser) && !(event instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.GetAnswers.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighSpeedVideoFpsRanges.invoke(event);
    }
}
