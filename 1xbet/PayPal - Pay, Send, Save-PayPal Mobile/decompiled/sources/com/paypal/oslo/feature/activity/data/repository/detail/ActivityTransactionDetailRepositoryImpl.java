package com.paypal.oslo.feature.activity.data.repository.detail;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/detail/ActivityTransactionDetailRepositoryImpl;", "Lcom/paypal/oslo/feature/activity/domain/repository/detail/IActivityTransactionDetailRepository;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "activityErrorMapper", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)V", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "transaction", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/ActivityTransactionDetailResult;", "fetchActivityDetailResult", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityDetailsInput;", "getActivityQueriesInput$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;", "Lcom/paypal/oslo/feature/activity/data/repository/detail/PackageInputWithSkipFlag;", "getShipmentPackageInput$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Lcom/paypal/oslo/feature/activity/data/repository/detail/PackageInputWithSkipFlag;", "Lcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/TransactionRewardSummaryInput;", "getTransactionRewardQueryInput$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Lcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;", "", "skipPromotionQueryForRewards$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)Z", "skipRelationshipQuery$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Z", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient", "()Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "getActivityErrorMapper", "()Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "getActivityFeatureManager", "()Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTransactionDetailRepositoryImpl implements com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper;
    private final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager;
    private final com.apollographql.apollo.ApolloClient apolloClient;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    @javax.inject.Inject
    public ActivityTransactionDetailRepositoryImpl(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        this.ioDispatcher = coroutineDispatcher;
        this.apolloClient = apolloClient;
        this.activityErrorMapper = iActivityErrorMapper;
        this.activityFeatureManager = activityFeatureManager;
    }

    public /* synthetic */ ActivityTransactionDetailRepositoryImpl(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher, apolloClient, iActivityErrorMapper, activityFeatureManager);
    }

    public final kotlinx.coroutines.CoroutineDispatcher getIoDispatcher() {
        return this.ioDispatcher;
    }

    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper getActivityErrorMapper() {
        return this.activityErrorMapper;
    }

    public final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager getActivityFeatureManager() {
        return this.activityFeatureManager;
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository
    public final java.lang.Object fetchActivityDetailResult(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2(this, activityTransactionDto, null), continuation);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput getActivityQueriesInput$activity_prodRelease(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        java.lang.String groupId = transaction.getGroupId();
        java.lang.String id = transaction.getId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String str = groupId;
        if (str == null || str.length() == 0) {
            groupId = null;
        }
        com.apollographql.apollo.api.Optional.Present present = companion.present(groupId);
        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ActivityType.INSTANCE.safeValueOf(transaction.getType()));
        java.lang.String id2 = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "");
        com.apollographql.apollo.api.Optional.Present present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(transaction.getSubdomainId());
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String subdomainType = transaction.getSubdomainType();
        return new com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput(id, present, present2, id2, present3, companion2.present(subdomainType != null ? com.paypal.oslo.api.graphql.schema.type.ActivitySubdomainType.INSTANCE.safeValueOf(subdomainType) : null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.getType(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag getShipmentPackageInput$activity_prodRelease(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto transaction) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        java.lang.String isShipmentAvailable = transaction.isShipmentAvailable();
        java.lang.Boolean booleanStrictOrNull = isShipmentAvailable != null ? kotlin.text.StringsKt.toBooleanStrictOrNull(isShipmentAvailable) : null;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(booleanStrictOrNull, java.lang.Boolean.TRUE)) {
            z = true;
            if (booleanStrictOrNull == null) {
            }
            return new com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag(new com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput(transaction.getId()), z);
        }
        z = false;
        return new com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag(new com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput(transaction.getId()), z);
    }

    public final com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput getTransactionRewardQueryInput$activity_prodRelease(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        return new com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput(transaction.getId());
    }

    public final boolean skipPromotionQueryForRewards$activity_prodRelease(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto transaction, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        return !activityFeatureManager.isActivityDetailsRewardsEnabled() || kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, transaction.getType()) || kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, transaction.getType()) || kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, transaction.getType()) || transaction.getSubdomainId() != null;
    }

    public final boolean skipRelationshipQuery$activity_prodRelease(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        return (kotlin.jvm.internal.Intrinsics.areEqual(transaction.getType(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT) && this.activityFeatureManager.isActivityDetailsGetContactEnabled()) ? false : true;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult access$getActivityDetailDomainResult(com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl activityTransactionDetailRepositoryImpl, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        return new com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data) graphQLData.getData());
    }
}
