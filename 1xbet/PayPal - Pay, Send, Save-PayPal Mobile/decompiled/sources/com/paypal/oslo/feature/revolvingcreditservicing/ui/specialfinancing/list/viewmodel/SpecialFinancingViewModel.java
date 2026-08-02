package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003 !\u001fB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel$SpecialFinancingStateStoreFactory;", "mviStoreFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel$SpecialFinancingStateStoreFactory;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "SpecialFinancingStateStoreFactory", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String STORE_NAME = "SpecialFinancingViewModel.store";
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState> uiState;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs args);
    }

    @dagger.assisted.AssistedInject
    public SpecialFinancingViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory specialFinancingStateStoreFactory, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingStateStoreFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingArgs, "");
        this.getHighSpeedVideoFpsRangesFor = specialFinancingArgs;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect> create$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory.create$default(specialFinancingStateStoreFactory, specialFinancingArgs, androidx.view.ViewModelKt.getViewModelScope(this), null, null, 12, null);
        this.Camera2StreamConfigurationMap = create$default;
        if (!specialFinancingArgs.getSpecialFinancingActivities().isEmpty()) {
            processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage(specialFinancingArgs.getSpecialFinancingActivities(), null, false)));
        } else {
            processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnViewCreated.INSTANCE);
        }
        this.uiState = create$default.getUiState();
        this.uiEffect = create$default.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel$SpecialFinancingStateStoreFactory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;", "getSpecialFinancingPage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "specialFinancingMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;", "args", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;", "state", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SpecialFinancingArgs;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;)Lcom/paypal/oslo/core/mvi/MviStateStore;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingReducer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SpecialFinancingStateStoreFactory {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingReducer Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper getHighSpeedVideoFpsRangesFor;

        @javax.inject.Inject
        public SpecialFinancingStateStoreFactory(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingReducer specialFinancingReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase getSpecialFinancingPageUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingReducer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSpecialFinancingPageUseCase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingMapper, "");
            this.Camera2StreamConfigurationMap = specialFinancingReducer;
            this.getHighSpeedVideoSizes = getSpecialFinancingPageUseCase;
            this.getHighSpeedVideoFpsRangesFor = specialFinancingMapper;
        }

        public static /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore create$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory specialFinancingStateStoreFactory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs, kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState specialFinancingState, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.STORE_NAME;
            }
            if ((i & 8) != 0) {
                specialFinancingState = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Initial.INSTANCE;
            }
            return specialFinancingStateStoreFactory.create(specialFinancingArgs, coroutineScope, str, specialFinancingState);
        }

        public final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect> create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs args, kotlinx.coroutines.CoroutineScope viewModelScope, java.lang.String name2, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.core.mvi.MviStateStore<>(name2, state, this.Camera2StreamConfigurationMap, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, args.getCreditProductIdentifier(), args.getCreditAccountId())), viewModelScope);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingViewModel$Companion;", "", "<init>", "()V", "", "STORE_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
