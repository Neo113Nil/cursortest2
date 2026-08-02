package com.paypal.oslo.feature.paymentreadylite.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;", "", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", androidx.core.app.NotificationCompat.CATEGORY_RECOMMENDATION, "", "timestamp", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;", "fetchStatus", "", "apiName", "<init>", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;JLcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", "component2", "()J", "component3", "()Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;JLcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", "getRecommendation", "J", "getTimestamp", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;", "getFetchStatus", "Ljava/lang/String;", "getApiName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentRecommendationSnapshot {
    public static final int $stable = 8;
    private final java.lang.String apiName;
    private final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus fetchStatus;
    private final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation recommendation;
    private final long timestamp;

    public PaymentRecommendationSnapshot(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation paymentRecommendation, long j, com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationApiStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.recommendation = paymentRecommendation;
        this.timestamp = j;
        this.fetchStatus = paymentRecommendationApiStatus;
        this.apiName = str;
    }

    public final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation getRecommendation() {
        return this.recommendation;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus getFetchStatus() {
        return this.fetchStatus;
    }

    public final java.lang.String getApiName() {
        return this.apiName;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation paymentRecommendation = this.recommendation;
        long j = this.timestamp;
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus = this.fetchStatus;
        java.lang.String str = this.apiName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentRecommendationSnapshot(recommendation=");
        sb.append(paymentRecommendation);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", fetchStatus=");
        sb.append(paymentRecommendationApiStatus);
        sb.append(", apiName=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation paymentRecommendation = this.recommendation;
        return ((((((paymentRecommendation == null ? 0 : paymentRecommendation.hashCode()) * 31) + java.lang.Long.hashCode(this.timestamp)) * 31) + this.fetchStatus.hashCode()) * 31) + this.apiName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot)) {
            return false;
        }
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot = (com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.recommendation, paymentRecommendationSnapshot.recommendation) && this.timestamp == paymentRecommendationSnapshot.timestamp && this.fetchStatus == paymentRecommendationSnapshot.fetchStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.apiName, paymentRecommendationSnapshot.apiName);
    }

    public final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot copy(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation recommendation, long timestamp, com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus fetchStatus, java.lang.String apiName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiName, "");
        return new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot(recommendation, timestamp, fetchStatus, apiName);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getApiName() {
        return this.apiName;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus getFetchStatus() {
        return this.fetchStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation getRecommendation() {
        return this.recommendation;
    }

    public static /* synthetic */ com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot copy$default(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot, com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation paymentRecommendation, long j, com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentRecommendation = paymentRecommendationSnapshot.recommendation;
        }
        if ((i & 2) != 0) {
            j = paymentRecommendationSnapshot.timestamp;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            paymentRecommendationApiStatus = paymentRecommendationSnapshot.fetchStatus;
        }
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus2 = paymentRecommendationApiStatus;
        if ((i & 8) != 0) {
            str = paymentRecommendationSnapshot.apiName;
        }
        return paymentRecommendationSnapshot.copy(paymentRecommendation, j2, paymentRecommendationApiStatus2, str);
    }
}
