package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f\u001dB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel$ActivityStateStoreFactory;", "mviStoreFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel$ActivityStateStoreFactory;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "event", "", "process", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Companion", "ActivityStateStoreFactory", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String MVI_STATE_STORE_NAME = "ActivityViewModel.store";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect> getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args);
    }

    @dagger.assisted.AssistedInject
    public ActivityViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory activityStateStoreFactory, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStateStoreFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
        this.getHighSpeedVideoFpsRangesFor = activityHubArgs;
        this.getHighSpeedVideoFpsRanges = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory.create$default(activityStateStoreFactory, null, null, androidx.view.ViewModelKt.getViewModelScope(this), activityHubArgs.getCpi(), 3, null);
        process(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnViewCreate(activityHubArgs));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState> getUiState() {
        return this.getHighSpeedVideoFpsRanges.getUiState();
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect> getUiEffect() {
        return this.getHighSpeedVideoFpsRanges.getUiEffect();
    }

    public final void process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel$ActivityStateStoreFactory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/InitializeActivityHubMiddleware;", "initializeActivityHub", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/LoadMoreActivitiesMiddleware;", "loadMoreActivities", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/CancelScheduledPaymentMiddleware;", "cancelScheduledPayment", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/ActivityHubObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/InitializeActivityHubMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/LoadMoreActivitiesMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/CancelScheduledPaymentMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/ActivityHubObservabilityMiddleware$Factory;)V", "", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "state", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "create", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityReducer;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/InitializeActivityHubMiddleware;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/LoadMoreActivitiesMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/CancelScheduledPaymentMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/ActivityHubObservabilityMiddleware$Factory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityStateStoreFactory {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityReducer getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory getHighSpeedVideoFpsRangesFor;

        @javax.inject.Inject
        public ActivityStateStoreFactory(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityReducer activityReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware initializeActivityHubMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware loadMoreActivitiesMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware cancelScheduledPaymentMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory factory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityReducer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeActivityHubMiddleware, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadMoreActivitiesMiddleware, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelScheduledPaymentMiddleware, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
            this.getHighSpeedVideoFpsRanges = activityReducer;
            this.Camera2StreamConfigurationMap = initializeActivityHubMiddleware;
            this.getHighResolutionOutputSizeshNQ4ISI = loadMoreActivitiesMiddleware;
            this.getHighSpeedVideoSizes = cancelScheduledPaymentMiddleware;
            this.getHighSpeedVideoFpsRangesFor = factory;
        }

        public static /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore create$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory activityStateStoreFactory, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.MVI_STATE_STORE_NAME;
            }
            if ((i & 2) != 0) {
                activityState = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial.INSTANCE;
            }
            return activityStateStoreFactory.create(str, activityState, coroutineScope, creditProductIdentifier);
        }

        public final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect> create(java.lang.String name2, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState state, kotlinx.coroutines.CoroutineScope viewModelScope, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.core.mvi.MviStateStore<>(name2, state, this.getHighSpeedVideoFpsRanges, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.create(creditProductIdentifier)}), viewModelScope);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityViewModel$Companion;", "", "<init>", "()V", "", "MVI_STATE_STORE_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
