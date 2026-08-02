package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0011\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/MviBaseViewModel;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiEffect;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserEvent;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;)V", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "getHighSpeedVideoFpsRanges", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementInAppBrowserViewModel extends com.paypal.oslo.feature.subscriptions.shared.ui.MviBaseViewModel<com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel$Factory;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "args", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel;", "create", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel create(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs args);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public LinkAgreementInAppBrowserViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs) {
        super(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion.access$createDefaultState(INSTANCE, linkAgreementInAppBrowserArgs));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserArgs, "");
        this.getHighSpeedVideoFpsRanges = linkAgreementInAppBrowserArgs;
    }

    @Override // com.paypal.oslo.feature.subscriptions.shared.ui.MviBaseViewModel
    public final void onEvent(final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.BackClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.OnSystemBackClicked.INSTANCE)) {
            emitEffect(new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack(true));
            return;
        }
        if (event instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.UrlLoadFailed) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentUrl", ((com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.UrlLoadFailed) event).getUrl()), kotlin.TuplesKt.to("originalUrl", this.getHighSpeedVideoFpsRanges.getUrl()));
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchantName", this.getHighSpeedVideoFpsRanges.getMerchantName()), kotlin.TuplesKt.to("source", this.getHighSpeedVideoFpsRanges.getSource()));
            updateState(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.m19952$r8$lambda$Vu2N4vlPaQ0uxQ80EL9UwSREmg(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.this, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState) obj);
                }
            });
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.TryAgainClicked.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState value = getUiState().getValue();
        if (value instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Error) {
            updateState(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.m19950$r8$lambda$cvdl0KSyKLLRErl5c8UmhntvpU(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.this, value, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState) obj);
                }
            });
        } else {
            updateState(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.m19951$r8$lambda$0blXb76wRR0XNjInyEj0CbRLa8(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.this, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState) obj);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;", "p0", "", "p1", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState$Default;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserArgs;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState$Default;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default access$createDefaultStateWithUrl(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion companion, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs, java.lang.String str) {
            return getHighSpeedVideoSizes(linkAgreementInAppBrowserArgs, str);
        }

        private static com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs p0, java.lang.String p1) {
            return new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default(new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(p1, p0.getSource(), true, true, null, 16, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), p0.getMerchantName());
        }

        public static final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default access$createDefaultState(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion companion, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs) {
            return getHighSpeedVideoSizes(linkAgreementInAppBrowserArgs, linkAgreementInAppBrowserArgs.getUrl());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$-cvdl0KSyKLLRErl5c8UmhntvpU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState m19950$r8$lambda$cvdl0KSyKLLRErl5c8UmhntvpU(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserUiState2, "");
        return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion.access$createDefaultStateWithUrl(INSTANCE, linkAgreementInAppBrowserViewModel.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Error) linkAgreementInAppBrowserUiState).getFailedUrl());
    }

    /* renamed from: $r8$lambda$0blXb76wRR0XNjInyE-j0CbRLa8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState m19951$r8$lambda$0blXb76wRR0XNjInyEj0CbRLa8(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserUiState, "");
        return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Companion.access$createDefaultState(INSTANCE, linkAgreementInAppBrowserViewModel.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: $r8$lambda$Vu2N4vlPaQ0uxQ80EL9Uw-SREmg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState m19952$r8$lambda$Vu2N4vlPaQ0uxQ80EL9UwSREmg(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent linkAgreementInAppBrowserEvent, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserUiState, "");
        return new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Error(((com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.UrlLoadFailed) linkAgreementInAppBrowserEvent).getUrl());
    }
}
