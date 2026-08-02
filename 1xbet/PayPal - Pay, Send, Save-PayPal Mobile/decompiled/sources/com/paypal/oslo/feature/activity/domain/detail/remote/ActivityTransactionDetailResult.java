package com.paypal.oslo.feature.activity.domain.detail.remote;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/ActivityTransactionDetailResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResultContract;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "queryResult", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)V", "", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "getActivityDetailSectionsViewList$activity_prodRelease", "()Ljava/util/List;", "", "isValid", "()Z", "", "transformActivityDetailData$activity_prodRelease", "()V", "input", "toDomainModel", "setTransactionDetailSectionsList", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "getQueryResult", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoSizes", "Ljava/util/ArrayList;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTransactionDetailResult implements com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.ArrayList<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data queryResult;

    public ActivityTransactionDetailResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data) {
        this.queryResult = data;
        this.Camera2StreamConfigurationMap = new java.util.ArrayList<>();
    }

    public /* synthetic */ ActivityTransactionDetailResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : data);
    }

    public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data getQueryResult() {
        return this.queryResult;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel> getActivityDetailSectionsViewList$activity_prodRelease() {
        return kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap);
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract
    public final boolean isValid() {
        return this.queryResult != null;
    }

    public final void transformActivityDetailData$activity_prodRelease() {
        if (isValid()) {
            toDomainModel(this.queryResult);
        }
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract
    public final void toDomainModel(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        this.Camera2StreamConfigurationMap.clear();
        if (input != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_QUERY_RESULT_RECEIVED, null, null, 6, null);
            setTransactionDetailSectionsList(input);
        }
    }

    public final void setTransactionDetailSectionsList(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        if (input != null) {
            this.Camera2StreamConfigurationMap.addAll(com.paypal.oslo.feature.activity.domain.detail.remote.mapper.TransactionDetailsResultSectionsMapper.INSTANCE.getTransactionDetailSectionsDomainList(input));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityTransactionDetailResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
