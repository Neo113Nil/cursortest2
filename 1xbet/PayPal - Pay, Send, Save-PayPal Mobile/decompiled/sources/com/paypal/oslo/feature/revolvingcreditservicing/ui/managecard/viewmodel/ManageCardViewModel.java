package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002)(B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardSideEffectMiddleware;", "middleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardSideEffectMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardObservabilityMiddleware$Factory;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardObservabilityMiddleware;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardObservabilityMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String STORE_NAME = "ManageCardViewModel.store";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs navArgs;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> uiState;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ManageCardArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public ManageCardViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs manageCardArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer manageCardReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware manageCardSideEffectMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardSideEffectMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.navArgs = manageCardArgs;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware create = factory.create(manageCardArgs.getCpi());
        this.getHighSpeedVideoSizes = create;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(STORE_NAME, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial.INSTANCE, manageCardReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{manageCardSideEffectMiddleware, create}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        if (manageCardArgs instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation) {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation fromNavigation = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation) manageCardArgs;
            processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated(fromNavigation.getCpi(), fromNavigation.getManageCardDetail()));
        } else {
            if (!(manageCardArgs instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry(((com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink) manageCardArgs).getCpi()));
        }
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs getNavArgs() {
        return this.navArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardViewModel$Companion;", "", "<init>", "()V", "", "STORE_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
