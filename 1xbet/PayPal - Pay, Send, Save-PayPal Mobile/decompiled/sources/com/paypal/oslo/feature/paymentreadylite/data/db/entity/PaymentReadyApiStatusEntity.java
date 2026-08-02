package com.paypal.oslo.feature.paymentreadylite.data.db.entity;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyApiStatusEntity;", "", "", "id", "", "apiName", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "status", "createdAt", "updatedAt", "<init>", "(JLjava/lang/String;Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;JJ)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "component4", "component5", "copy", "(JLjava/lang/String;Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;JJ)Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyApiStatusEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getId", "Ljava/lang/String;", "getApiName", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "getStatus", "getCreatedAt", "getUpdatedAt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentReadyApiStatusEntity {
    public static final int $stable = 0;
    private final java.lang.String apiName;
    private final long createdAt;
    private final long id;
    private final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum status;
    private final long updatedAt;

    public PaymentReadyApiStatusEntity(long j, java.lang.String str, com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum, long j2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationApiStatusEnum, "");
        this.id = j;
        this.apiName = str;
        this.status = paymentRecommendationApiStatusEnum;
        this.createdAt = j2;
        this.updatedAt = j3;
    }

    public /* synthetic */ PaymentReadyApiStatusEntity(long j, java.lang.String str, com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum, long j2, long j3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, paymentRecommendationApiStatusEnum, j2, j3);
    }

    public final long getId() {
        return this.id;
    }

    public final java.lang.String getApiName() {
        return this.apiName;
    }

    public final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum getStatus() {
        return this.status;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.apiName;
        com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum = this.status;
        long j2 = this.createdAt;
        long j3 = this.updatedAt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentReadyApiStatusEntity(id=");
        sb.append(j);
        sb.append(", apiName=");
        sb.append(str);
        sb.append(", status=");
        sb.append(paymentRecommendationApiStatusEnum);
        sb.append(", createdAt=");
        sb.append(j2);
        sb.append(", updatedAt=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Long.hashCode(this.id) * 31) + this.apiName.hashCode()) * 31) + this.status.hashCode()) * 31) + java.lang.Long.hashCode(this.createdAt)) * 31) + java.lang.Long.hashCode(this.updatedAt);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity)) {
            return false;
        }
        com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity paymentReadyApiStatusEntity = (com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity) other;
        return this.id == paymentReadyApiStatusEntity.id && kotlin.jvm.internal.Intrinsics.areEqual(this.apiName, paymentReadyApiStatusEntity.apiName) && this.status == paymentReadyApiStatusEntity.status && this.createdAt == paymentReadyApiStatusEntity.createdAt && this.updatedAt == paymentReadyApiStatusEntity.updatedAt;
    }

    public final com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity copy(long id, java.lang.String apiName, com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum status, long createdAt, long updatedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity(id, apiName, status, createdAt, updatedAt);
    }

    /* renamed from: component5, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getApiName() {
        return this.apiName;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }
}
