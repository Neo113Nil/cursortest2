package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "", "<init>", "()V", "TransactionDetailHeaderModel", "TransactionDetailFundingInstrumentModel", "TransactionDetailAdditionalInfoModel", "TransactionDetail1099KORBUWModel", "TransactionDetailTransactionCopyableSectionModel", "TransactionDetailEtaTrackerModel", "TransactionDetailOrderSummarySectionModel", "TransactionDetailHelpSectionModel", "TransactionDetailRefundDetailSectionModel", "TransactionDetailRewardSectionModel", "TransactionDetailP2PMessageModel", "TransactionDetailCounterpartyInfoSectionModel", "TransactionDetailActionsModel", "TransactionDetailShippingInfoModel", "TransactionDetailNetworksOfWalletModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetail1099KORBUWModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailActionsModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailAdditionalInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailCounterpartyInfoSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailEtaTrackerModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailFundingInstrumentModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHeaderModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHelpSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailNetworksOfWalletModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailOrderSummarySectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailP2PMessageModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRefundDetailSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRewardSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailShippingInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailTransactionCopyableSectionModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityDetailTypeModel {
    public static final int $stable = 0;

    private ActivityDetailTypeModel() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHeaderModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHeaderModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHeaderSectionModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailHeaderModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailHeaderModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel activityDetailHeaderSectionModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailHeaderSectionModel, "");
            this.activityDetailSectionUIModel = activityDetailHeaderSectionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel activityDetailHeaderSectionModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailHeaderModel(activityDetailSectionUIModel=");
            sb.append(activityDetailHeaderSectionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel transactionDetailHeaderModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel activityDetailHeaderSectionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailHeaderSectionModel = transactionDetailHeaderModel.activityDetailSectionUIModel;
            }
            return transactionDetailHeaderModel.copy(activityDetailHeaderSectionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailFundingInstrumentModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailFundingInstrumentModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailFundingInstrumentModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailFundingInstrumentModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailFundingInstrumentModel, "");
            this.activityDetailSectionUIModel = activityDetailFundingInstrumentModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailFundingInstrumentModel(activityDetailSectionUIModel=");
            sb.append(activityDetailFundingInstrumentModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailFundingInstrumentModel transactionDetailFundingInstrumentModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailFundingInstrumentModel = transactionDetailFundingInstrumentModel.activityDetailSectionUIModel;
            }
            return transactionDetailFundingInstrumentModel.copy(activityDetailFundingInstrumentModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailAdditionalInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailAdditionalInfoModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailAdditionalInfoModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailAdditionalInfoModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailAdditionalInfoModel, "");
            this.activityDetailSectionUIModel = activityDetailAdditionalInfoModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailAdditionalInfoModel(activityDetailSectionUIModel=");
            sb.append(activityDetailAdditionalInfoModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel transactionDetailAdditionalInfoModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailAdditionalInfoModel = transactionDetailAdditionalInfoModel.activityDetailSectionUIModel;
            }
            return transactionDetailAdditionalInfoModel.copy(activityDetailAdditionalInfoModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetail1099KORBUWModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetail1099KORBUWModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetail1099KORBUWModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetail1099KORBUWModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetail1099KAndBUWInfoModel, "");
            this.activityDetailSectionUIModel = activityDetail1099KAndBUWInfoModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetail1099KORBUWModel(activityDetailSectionUIModel=");
            sb.append(activityDetail1099KAndBUWInfoModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel transactionDetail1099KORBUWModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetail1099KAndBUWInfoModel = transactionDetail1099KORBUWModel.activityDetailSectionUIModel;
            }
            return transactionDetail1099KORBUWModel.copy(activityDetail1099KAndBUWInfoModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailTransactionCopyableSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailTransactionCopyableSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailTransactionCopyableSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailTransactionCopyableSectionModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailTransactionCopyableSectionModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailTransactionCopyableSectionModel, "");
            this.activityDetailSectionUIModel = activityDetailTransactionCopyableSectionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailTransactionCopyableSectionModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailTransactionCopyableSectionModel(activityDetailSectionUIModel=");
            sb.append(activityDetailTransactionCopyableSectionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel transactionDetailTransactionCopyableSectionModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailTransactionCopyableSectionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailTransactionCopyableSectionModel = transactionDetailTransactionCopyableSectionModel.activityDetailSectionUIModel;
            }
            return transactionDetailTransactionCopyableSectionModel.copy(activityDetailTransactionCopyableSectionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailEtaTrackerModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailEtaTrackerModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailEtaTrackerModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailEtaTrackerModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailEtaTrackerModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailEtaTrackerModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailEtaTrackerModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailEtaTrackerModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailEtaTrackerModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel activityDetailEtaTrackerModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailEtaTrackerModel, "");
            this.activityDetailSectionUIModel = activityDetailEtaTrackerModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel activityDetailEtaTrackerModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailEtaTrackerModel(activityDetailSectionUIModel=");
            sb.append(activityDetailEtaTrackerModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailEtaTrackerModel transactionDetailEtaTrackerModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailEtaTrackerModel activityDetailEtaTrackerModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailEtaTrackerModel = transactionDetailEtaTrackerModel.activityDetailSectionUIModel;
            }
            return transactionDetailEtaTrackerModel.copy(activityDetailEtaTrackerModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailOrderSummarySectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailOrderSummarySectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailOrderSummarySectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailOrderSummarySectionModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailOrderSummarySectionModel, "");
            this.activityDetailSectionUIModel = activityDetailOrderSummarySectionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailOrderSummarySectionModel(activityDetailSectionUIModel=");
            sb.append(activityDetailOrderSummarySectionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel transactionDetailOrderSummarySectionModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailOrderSummarySectionModel = transactionDetailOrderSummarySectionModel.activityDetailSectionUIModel;
            }
            return transactionDetailOrderSummarySectionModel.copy(activityDetailOrderSummarySectionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHelpSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHelpSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailHelpSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailHelpSectionModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailHelpSectionModel, "");
            this.activityDetailSectionUIModel = activityDetailHelpSectionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailHelpSectionModel(activityDetailSectionUIModel=");
            sb.append(activityDetailHelpSectionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel transactionDetailHelpSectionModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailHelpSectionModel = transactionDetailHelpSectionModel.activityDetailSectionUIModel;
            }
            return transactionDetailHelpSectionModel.copy(activityDetailHelpSectionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRefundDetailSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRefundDetailSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailRefundDetailSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailRefundDetailSectionModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel activityDetailRefundSectionModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRefundSectionModel, "");
            this.activityDetailSectionUIModel = activityDetailRefundSectionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel activityDetailRefundSectionModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailRefundDetailSectionModel(activityDetailSectionUIModel=");
            sb.append(activityDetailRefundSectionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRefundDetailSectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRefundDetailSectionModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRefundDetailSectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRefundDetailSectionModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRefundDetailSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRefundDetailSectionModel transactionDetailRefundDetailSectionModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel activityDetailRefundSectionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailRefundSectionModel = transactionDetailRefundDetailSectionModel.activityDetailSectionUIModel;
            }
            return transactionDetailRefundDetailSectionModel.copy(activityDetailRefundSectionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRewardSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRewardSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailRewardSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailRewardSectionModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailRewardModel, "");
            this.activityDetailSectionUIModel = activityDetailRewardModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailRewardSectionModel(activityDetailSectionUIModel=");
            sb.append(activityDetailRewardModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel transactionDetailRewardSectionModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailRewardModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailRewardModel = transactionDetailRewardSectionModel.activityDetailSectionUIModel;
            }
            return transactionDetailRewardSectionModel.copy(activityDetailRewardModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailP2PMessageModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailP2PMessageModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailP2PMessageModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailP2PMessageModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailP2PMessageModel, "");
            this.activityDetailSectionUIModel = activityDetailP2PMessageModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailP2PMessageModel(activityDetailSectionUIModel=");
            sb.append(activityDetailP2PMessageModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailP2PMessageModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailP2PMessageModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailP2PMessageModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailP2PMessageModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailP2PMessageModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailP2PMessageModel transactionDetailP2PMessageModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailP2PMessageModel = transactionDetailP2PMessageModel.activityDetailSectionUIModel;
            }
            return transactionDetailP2PMessageModel.copy(activityDetailP2PMessageModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailCounterpartyInfoSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailCounterpartyInfoSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailCounterpartyInfoSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailCounterpartyInfoSectionModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailCounterpartyInfoSectionModel, "");
            this.activityDetailSectionUIModel = activityDetailCounterpartyInfoSectionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailCounterpartyInfoSectionModel(activityDetailSectionUIModel=");
            sb.append(activityDetailCounterpartyInfoSectionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel transactionDetailCounterpartyInfoSectionModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailCounterpartyInfoSectionModel = transactionDetailCounterpartyInfoSectionModel.activityDetailSectionUIModel;
            }
            return transactionDetailCounterpartyInfoSectionModel.copy(activityDetailCounterpartyInfoSectionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailActionsModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailActionsModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailActionsModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailActionsModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailActionsModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailActionsModel, "");
            this.activityDetailSectionUIModel = activityDetailActionsModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailActionsModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailActionsModel(activityDetailSectionUIModel=");
            sb.append(activityDetailActionsModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel transactionDetailActionsModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailActionsModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailActionsModel = transactionDetailActionsModel.activityDetailSectionUIModel;
            }
            return transactionDetailActionsModel.copy(activityDetailActionsModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailShippingInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailShippingInfoModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailShippingInfoModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailShippingInfoModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailShippingInfoModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailShippingInfoModel, "");
            this.activityDetailSectionUIModel = activityDetailShippingInfoModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailShippingInfoModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailShippingInfoModel(activityDetailSectionUIModel=");
            sb.append(activityDetailShippingInfoModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel transactionDetailShippingInfoModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailShippingInfoModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailShippingInfoModel = transactionDetailShippingInfoModel.activityDetailSectionUIModel;
            }
            return transactionDetailShippingInfoModel.copy(activityDetailShippingInfoModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailNetworksOfWalletModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;", "activityDetailSectionUIModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailNetworksOfWalletModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;", "getActivityDetailSectionUIModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionDetailNetworksOfWalletModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailSectionUIModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailNetworksOfWalletModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailNetworksOfWalletModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailNetworksOfWalletModel, "");
            this.activityDetailSectionUIModel = activityDetailNetworksOfWalletModel;
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailNetworksOfWalletModel = this.activityDetailSectionUIModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetailNetworksOfWalletModel(activityDetailSectionUIModel=");
            sb.append(activityDetailNetworksOfWalletModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityDetailSectionUIModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSectionUIModel, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel) other).activityDetailSectionUIModel);
        }

        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailSectionUIModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSectionUIModel, "");
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel(activityDetailSectionUIModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel getActivityDetailSectionUIModel() {
            return this.activityDetailSectionUIModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel transactionDetailNetworksOfWalletModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailNetworksOfWalletModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailNetworksOfWalletModel = transactionDetailNetworksOfWalletModel.activityDetailSectionUIModel;
            }
            return transactionDetailNetworksOfWalletModel.copy(activityDetailNetworksOfWalletModel);
        }
    }

    public /* synthetic */ ActivityDetailTypeModel(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
