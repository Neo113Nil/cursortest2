package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0011\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/MviBaseViewModel;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiEffect;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;)V", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;", "getHighSpeedVideoFpsRanges", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GenericInAppBrowserViewModel extends com.paypal.oslo.feature.subscriptions.shared.ui.MviBaseViewModel<com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiEffect, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel$Factory;", "", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;", "args", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel;", "create", "(Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;)Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel create(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs args);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public GenericInAppBrowserViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs genericInAppBrowserArgs) {
        super(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion.access$createDefaultState(INSTANCE, genericInAppBrowserArgs));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserArgs, "");
        this.getHighSpeedVideoFpsRanges = genericInAppBrowserArgs;
    }

    @Override // com.paypal.oslo.feature.subscriptions.shared.ui.MviBaseViewModel
    public final void onEvent(final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.BackClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.OnSystemBackClicked.INSTANCE)) {
            emitEffect(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiEffect.NavigateBack.INSTANCE);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "url load failed for generic in-app browser", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("failedUrl", ((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed) event).getUrl())), 2, null);
            updateState(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.m19963$r8$lambda$ulhX8YIGj_79T4af5tccSyQjaM(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.this, (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState) obj);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.TryAgainClicked.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState value = getUiState().getValue();
            if (value instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error) {
                updateState(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.$r8$lambda$T5HMtY3TUsAoORMhW7UFPC3MNMs(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.this, value, (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState) obj);
                    }
                });
            } else {
                updateState(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.m19962$r8$lambda$K3wjtnjdYut0wRA_YKp0d1zHUo(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.this, (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState) obj);
                    }
                });
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserViewModel$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;", "p0", "", "p1", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserArgs;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default access$createDefaultStateWithUrl(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion companion, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs genericInAppBrowserArgs, java.lang.String str) {
            return getHighResolutionOutputSizeshNQ4ISI(genericInAppBrowserArgs, str);
        }

        private static com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs p0, java.lang.String p1) {
            return new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default(new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(p1, p0.getSource(), p0.isAuthRequired(), p0.getBypassUrlValidation(), null, 16, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, p0.getJavaScriptEnabled(), 1, null), p0.getTitle());
        }

        public static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default access$createDefaultState(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion companion, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs genericInAppBrowserArgs) {
            return getHighResolutionOutputSizeshNQ4ISI(genericInAppBrowserArgs, genericInAppBrowserArgs.getUrl());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$K3wjtnjdYut0wRA_YK-p0d1zHUo, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState m19962$r8$lambda$K3wjtnjdYut0wRA_YKp0d1zHUo(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserUiState, "");
        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion.access$createDefaultState(INSTANCE, genericInAppBrowserViewModel.getHighSpeedVideoFpsRanges);
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState $r8$lambda$T5HMtY3TUsAoORMhW7UFPC3MNMs(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel genericInAppBrowserViewModel, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserUiState2, "");
        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel.Companion.access$createDefaultStateWithUrl(INSTANCE, genericInAppBrowserViewModel.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error) genericInAppBrowserUiState).getFailedUrl());
    }

    /* renamed from: $r8$lambda$ulhX8YIGj_79T4af5tccSyQ-jaM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState m19963$r8$lambda$ulhX8YIGj_79T4af5tccSyQjaM(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent genericInAppBrowserEvent, com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState genericInAppBrowserUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericInAppBrowserUiState, "");
        return new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error(((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed) genericInAppBrowserEvent).getUrl());
    }
}
