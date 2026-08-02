package com.paypal.oslo.feature.activity.ui.widgetFullScreen.model;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010-R'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/widgetFullScreen/model/ActivityWidgetFullScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetFullScreenUseCase;", "widgetFullScreenUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetLandingActionsUseCase;", "activityWidgetLandingActionsUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;", "activityNavigationUseCase", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "errorMapper", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetFullScreenUseCase;Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetLandingActionsUseCase;Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;)V", "", "error", "Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;", "mapErrorToUIModel", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;", "", "goBack$activity_prodRelease", "()V", "navigateToTabbedLedgerView$activity_prodRelease", "Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "getWidgetFSDtoFromNavigator$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "invokeAction$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)V", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "transactionTileNavigationTypes", "navigateByNavigationType$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetFullScreenUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetLandingActionsUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "filteredActivityItems$delegate", "Lkotlin/Lazy;", "getFilteredActivityItems", "()Lkotlinx/coroutines/flow/Flow;", "filteredActivityItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetFullScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: filteredActivityItems$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy filteredActivityItems;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ActivityWidgetFullScreenViewModel(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase activityWidgetFullScreenUseCase, com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase activityWidgetLandingActionsUseCase, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetFullScreenUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetLandingActionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNavigationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        this.getHighSpeedVideoFpsRanges = activityComposeConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = activityWidgetFullScreenUseCase;
        this.getHighSpeedVideoSizes = activityWidgetLandingActionsUseCase;
        this.getHighSpeedVideoFpsRangesFor = activityNavigationUseCase;
        this.Camera2StreamConfigurationMap = iActivityErrorMapper;
        this.filteredActivityItems = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.$r8$lambda$23Zd0AtyNBHm7GeO2MkJMk2bPPw(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this);
            }
        });
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> getFilteredActivityItems() {
        return (kotlinx.coroutines.flow.Flow) this.filteredActivityItems.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel mapErrorToUIModel(java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.network.graphql.error.CallError callError = null;
        java.lang.Object[] objArr = 0;
        java.lang.Exception exc = error instanceof java.lang.Exception ? (java.lang.Exception) error : null;
        if (exc == null) {
            exc = new java.lang.Exception(error);
        }
        return com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toErrorUIModel(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(iActivityErrorMapper.mapToDomainError(exc).getErrorMessage(), callError, 2, objArr == true ? 1 : 0));
    }

    public final void goBack$activity_prodRelease() {
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.$r8$lambda$M8I9rXZ6k_QaB7R35SO97WZW62Q((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public final void navigateToTabbedLedgerView$activity_prodRelease() {
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.$r8$lambda$Xky4CDkMGd4YdezOIsslnMWfVZY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public final com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto getWidgetFSDtoFromNavigator$activity_prodRelease() {
        com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto filteredLandingScreenDto;
        java.util.List<androidx.navigation3.runtime.NavKey> backStack;
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        androidx.navigation3.runtime.NavKey navKey = (navigator == null || (backStack = navigator.getBackStack()) == null) ? null : (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) backStack);
        if (navKey instanceof com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey) {
            filteredLandingScreenDto = ((com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey) navKey).getWidgetFsDto();
        } else {
            filteredLandingScreenDto = navKey instanceof com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey ? ((com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey) navKey).getFilteredLandingScreenDto() : com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetHelperUtils.INSTANCE.getDefaultActivityWidgetFullScreenDto();
        }
        return filteredLandingScreenDto == null ? com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetHelperUtils.INSTANCE.getDefaultActivityWidgetFullScreenDto() : filteredLandingScreenDto;
    }

    public final void invokeAction$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        if (activityActionModel == null) {
            activityActionModel = activityTransactionModel != null ? com.paypal.oslo.feature.activity.domain.ledger.models.extension.ActivityTransactionModelExtensionsKt.toInvoiceORUPRActionModel(activityTransactionModel) : null;
        }
        if (activityActionModel != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$invokeAction$1(this, activityActionModel, null), 3, null);
            return;
        }
        if (com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfigKt.navigateToPackageIfApplicable(this.getHighSpeedVideoFpsRanges, activityTransactionModel) || com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfigKt.navigateToPromotionalRewardIfApplicable(this.getHighSpeedVideoFpsRanges, activityTransactionModel, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_WIDGET_FS)) {
            return;
        }
        final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey activityDetailDestinationKey = activityTransactionModel != null ? com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toActivityDetailDestinationKey(activityTransactionModel, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_WIDGET_FS) : null;
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.m11968$r8$lambda$BYsBCWosA6FuhtESejov9Dxnw(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public final void navigateByNavigationType$activity_prodRelease(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes transactionTileNavigationTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTileNavigationTypes, "");
        com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase.m11789invokeVU73JmE$default(this.getHighSpeedVideoFpsRangesFor, transactionTileNavigationTypes, null, 2, null);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow $r8$lambda$23Zd0AtyNBHm7GeO2MkJMk2bPPw(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel) {
        kotlinx.coroutines.flow.Flow cachedIn;
        com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto widgetFSDtoFromNavigator$activity_prodRelease = activityWidgetFullScreenViewModel.getWidgetFSDtoFromNavigator$activity_prodRelease();
        final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> invoke = activityWidgetFullScreenViewModel.getHighResolutionOutputSizeshNQ4ISI.invoke(com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetFiltersInputProvider.INSTANCE.getActivityWidgetInputQueryType$activity_prodRelease(widgetFSDtoFromNavigator$activity_prodRelease.getFilters()));
        final com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer dataTransformer = widgetFSDtoFromNavigator$activity_prodRelease.getDataTransformer();
        return (dataTransformer == null || (cachedIn = androidx.paging.CachedPagingDataKt.cachedIn(new kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>>() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.paging.PagingData map;
                    if (continuation instanceof com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                map = androidx.paging.PagingDataTransforms__PagingDataTransformsKt.map((androidx.paging.PagingData) obj, new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1(this.getHighSpeedVideoSizes, null));
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1$2", f = "ActivityWidgetFullScreenViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer iActivityWidgetDataTransformer) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighSpeedVideoSizes = iActivityWidgetDataTransformer;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems_delegate$lambda$0$0$$inlined$map$1.AnonymousClass2(flowCollector, dataTransformer), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, androidx.view.ViewModelKt.getViewModelScope(activityWidgetFullScreenViewModel))) == null) ? androidx.paging.CachedPagingDataKt.cachedIn(invoke, androidx.view.ViewModelKt.getViewModelScope(activityWidgetFullScreenViewModel)) : cachedIn;
    }

    /* renamed from: $r8$lambda$BY-s-BCWosA6FuhtESejov9Dxnw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11968$r8$lambda$BYsBCWosA6FuhtESejov9Dxnw(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (payPalActivityTransactionDetailScreenDestinationKey != null) {
            navigationScope.pushIfNotCurrent(payPalActivityTransactionDetailScreenDestinationKey);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M8I9rXZ6k_QaB7R35SO97WZW62Q(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$Xky4CDkMGd4YdezOIsslnMWfVZY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return kotlin.Unit.INSTANCE;
    }
}
