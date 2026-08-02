package com.paypal.oslo.feature.activity.ui.widget;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010 \u001a\u0011\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u001c¢\u0006\u0002\b\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl;", "Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "config", "initialize", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;)Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl;", "", "refreshActivities", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetLifecycleState;", "activityWidgetState", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;", "viewModel", "initializeViewModelProvider$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Function0;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/activity/api/widget/WidgetContent;", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "content", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetImpl implements com.paypal.oslo.feature.activity.api.widget.IActivityWidget {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration getHighResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.INSTANCE.defaultConfig("unknown");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.m11956$r8$lambda$lNwJnbgAnXICYRyWK4cV58gxjo();
        }
    };
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl$Factory;", "", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "config", "Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl;", "create", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;)Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl create(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration config);
    }

    /* renamed from: $r8$lambda$lNwJnbgAnXICYRyWK4cV5-8gxjo, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel m11956$r8$lambda$lNwJnbgAnXICYRyWK4cV58gxjo() {
        return null;
    }

    /* renamed from: $r8$lambda$zucolG6xNAwids1C-zuqIFLm_hk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel m11957$r8$lambda$zucolG6xNAwids1CzuqIFLm_hk(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel) {
        return activityWidgetViewModel;
    }

    @javax.inject.Inject
    public ActivityWidgetImpl() {
    }

    public final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl initialize(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighResolutionOutputSizeshNQ4ISI = config;
        return this;
    }

    @Override // com.paypal.oslo.feature.activity.api.widget.IActivityWidget
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1706236741, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.$r8$lambda$yxvt5W_kooXwN17X_G6Yt1QGHVE(com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    @Override // com.paypal.oslo.feature.activity.api.widget.IActivityWidget
    public final void refreshActivities() {
        com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null) {
            throw new java.lang.IllegalStateException("ActivityWidget refresh failed: Widget content has not been rendered yet. You must first render the widget by calling and using the 'content' property before calling refreshActivities().".toString());
        }
        invoke.fetchActivityWidgetItems(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.paypal.oslo.feature.activity.api.widget.IActivityWidget
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState> activityWidgetState() {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1(null, this));
    }

    public final void initializeViewModelProvider$activity_prodRelease(final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        this.getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.m11957$r8$lambda$zucolG6xNAwids1CzuqIFLm_hk(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.this);
            }
        };
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.TRUE);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yxvt5W_kooXwN17X_G6Yt1QGHVE(com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl activityWidgetImpl, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1706236741, i, -1, "com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.<get-content>.<anonymous> (ActivityWidgetImpl.kt:73)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel = (com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            activityWidgetImpl.initializeViewModelProvider$activity_prodRelease(activityWidgetViewModel);
            com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.RenderActivityWidgetCompose(activityWidgetImpl.getHighResolutionOutputSizeshNQ4ISI, activityWidgetViewModel, androidx.compose.ui.Modifier.INSTANCE, composer, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.$stable | 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState access$mapUiStateToLifecycleState(com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl activityWidgetImpl, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel) {
        if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading) {
            return com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.FETCH_IN_PROGRESS;
        }
        if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) {
            if (activityWidgetViewModel.getActivityItems().isEmpty()) {
                return com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.SUCCESS_NO_ACTIVITY;
            }
            return com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.SUCCESS;
        }
        if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure) {
            return com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.ERROR;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
