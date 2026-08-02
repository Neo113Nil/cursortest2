package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUserActivitiesPaginationUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "repository", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "cursor", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "activityLedgerUseCaseInputQueryType", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "invoke", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;)Lkotlinx/coroutines/flow/Flow;", "pagingData", "", "supportedTypes", "filterSupportedAction$activity_prodRelease", "(Landroidx/paging/PagingData;Ljava/util/Set;)Landroidx/paging/PagingData;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerUserActivitiesPaginationUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ActivityLedgerUserActivitiesPaginationUseCase(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityLedgerRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = iActivityLedgerRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfiguration;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> invoke(kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> cursor, com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerUseCaseInputQueryType) {
        com.apollographql.apollo.api.Query access$prepareLedgerQueryBasedOnCaseInput;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerUseCaseInputQueryType, "");
        com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper activityLedgerUseCaseInputQueryMapper = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.INSTANCE;
        java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput = activityLedgerUseCaseInputQueryType.getActivityInput();
        if (activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType) {
            access$prepareLedgerQueryBasedOnCaseInput = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.access$prepareWidgetQueryBasedOnCaseInput(activityLedgerUseCaseInputQueryMapper, activityInput);
        } else if ((activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType) || (activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType)) {
            access$prepareLedgerQueryBasedOnCaseInput = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.access$prepareLedgerQueryBasedOnCaseInput(activityLedgerUseCaseInputQueryMapper, activityInput);
        } else {
            if (!(activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            access$prepareLedgerQueryBasedOnCaseInput = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.access$prepareLedgerPaginationQueryBasedOnCaseInput(activityLedgerUseCaseInputQueryMapper, activityInput);
        }
        if (!(access$prepareLedgerQueryBasedOnCaseInput instanceof com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery)) {
            access$prepareLedgerQueryBasedOnCaseInput = null;
        }
        com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery = (com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery) access$prepareLedgerQueryBasedOnCaseInput;
        if (getUserActivitiesQuery != null) {
            final java.util.Set<java.lang.String> ledgerSupportedActions = com.paypal.oslo.feature.activity.domain.usecase.common.extensions.DynamicConfigurationExtensionsKt.getLedgerSupportedActions(this.getHighResolutionOutputSizeshNQ4ISI);
            final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> fetchGetUserActivityLedgerItems = this.getHighSpeedVideoFpsRanges.fetchGetUserActivityLedgerItems(cursor, getUserActivitiesQuery);
            return new kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>>() { // from class: com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;
                    final /* synthetic */ java.util.Set getHighSpeedVideoFpsRangesFor;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getOutputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getOutputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                    androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> filterSupportedAction$activity_prodRelease = this.getHighResolutionOutputSizeshNQ4ISI.filterSupportedAction$activity_prodRelease((androidx.paging.PagingData) obj, this.getHighSpeedVideoFpsRangesFor);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getHighSpeedVideoSizes = 0;
                                    anonymousClass1.getOutputFormats = 1;
                                    if (flowCollector.emit(filterSupportedAction$activity_prodRelease, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                    java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                    java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getOutputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1$2", f = "ActivityLedgerUserActivitiesPaginationUseCase.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        int getHighSpeedVideoSizes;
                        /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                        int getOutputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getInputSizeshNQ4ISI = obj;
                            this.getOutputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase activityLedgerUserActivitiesPaginationUseCase, java.util.Set set) {
                        this.getHighSpeedVideoFpsRanges = flowCollector;
                        this.getHighResolutionOutputSizeshNQ4ISI = activityLedgerUserActivitiesPaginationUseCase;
                        this.getHighSpeedVideoFpsRangesFor = set;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$invoke$$inlined$map$1.AnonymousClass2(flowCollector, this, ledgerSupportedActions), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            };
        }
        throw new java.lang.UnsupportedOperationException("Failed to cast query result to expected type ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityLedgerUseCaseInputQueryType.getClass()).getSimpleName())));
    }

    public final androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> filterSupportedAction$activity_prodRelease(androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> pagingData, java.util.Set<java.lang.String> supportedTypes) {
        androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedTypes, "");
        map = androidx.paging.PagingDataTransforms__PagingDataTransformsKt.map(pagingData, new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase$filterSupportedAction$1(supportedTypes, null));
        return map;
    }
}
