package com.paypal.oslo.feature.activity.data.repository.common;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/common/ActivityActionsRepositoryImpl;", "Lcom/paypal/oslo/feature/activity/domain/repository/common/IActivityActionsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "activityErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)V", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "performAction", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient$activity_prodRelease", "()Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "getActivityErrorMapper$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher$activity_prodRelease", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "getActivityFeatureManager$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionsRepositoryImpl implements com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper;
    private final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager;
    private final com.apollographql.apollo.ApolloClient apolloClient;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    @javax.inject.Inject
    public ActivityActionsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        this.apolloClient = apolloClient;
        this.activityErrorMapper = iActivityErrorMapper;
        this.ioDispatcher = coroutineDispatcher;
        this.activityFeatureManager = activityFeatureManager;
    }

    /* renamed from: getApolloClient$activity_prodRelease, reason: from getter */
    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    /* renamed from: getActivityErrorMapper$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper getActivityErrorMapper() {
        return this.activityErrorMapper;
    }

    public /* synthetic */ ActivityActionsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(apolloClient, iActivityErrorMapper, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher, activityFeatureManager);
    }

    /* renamed from: getIoDispatcher$activity_prodRelease, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* renamed from: getActivityFeatureManager$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager getActivityFeatureManager() {
        return this.activityFeatureManager;
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository
    public final java.lang.Object performAction(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionInfo$activity_prodRelease("performAction", "ActionType: ".concat(java.lang.String.valueOf(activityActionModel.getType().getRawValue())));
        int i = com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[activityActionModel.getType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeCancelPaymentRequest$2(activityActionModel, this, null), continuation);
        }
        if (i != 4) {
            if (i != 5) {
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.Empty.INSTANCE));
            }
            return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$executeHideMutation$2(activityActionModel, this, null), continuation);
        }
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
        if (activityActionsTransactionInfo != null && kotlin.jvm.internal.Intrinsics.areEqual(activityActionsTransactionInfo.isBlocked(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
            return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$unblockContact$2(activityActionModel, this, null), continuation);
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl$blockContact$2(activityActionModel, this, null), continuation);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult access$mapCancelPaymentRequestResult(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, com.paypal.oslo.feature.activity.graphql.CancelPaymentRequestMutation.Data data) {
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus status;
        java.lang.Object id;
        java.lang.String str = null;
        com.paypal.oslo.feature.activity.graphql.CancelPaymentRequestMutation.CancelPaymentRequest cancelPaymentRequest = data != null ? data.getCancelPaymentRequest() : null;
        java.lang.String obj = (cancelPaymentRequest == null || (id = cancelPaymentRequest.getId()) == null) ? null : id.toString();
        if (cancelPaymentRequest != null && (status = cancelPaymentRequest.getStatus()) != null) {
            str = status.getRawValue();
        }
        return new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult(obj, str);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult access$mapInvoiceReportSpamMutationResult(com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl activityActionsRepositoryImpl, com.paypal.oslo.feature.activity.graphql.InvoiceReportSpamMutation.Data data) {
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus status;
        java.lang.String str = null;
        com.paypal.oslo.feature.activity.graphql.InvoiceReportSpamMutation.ReportSpamActivity reportSpamActivity = data != null ? data.getReportSpamActivity() : null;
        if (reportSpamActivity != null && (status = reportSpamActivity.getStatus()) != null) {
            str = status.getRawValue();
        }
        return new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult(str);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.HIDE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
