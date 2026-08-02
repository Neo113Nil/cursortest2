package com.paypal.oslo.feature.paymentreadylite.data.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/model/PaymentRecommendationResponse;", "", "", "sessionId", "", "inPayPalNetwork", "", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentOptionDto;", "recommendations", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lcom/paypal/oslo/feature/paymentreadylite/data/model/PaymentRecommendationResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "Z", "getInPayPalNetwork", "Ljava/util/List;", "getRecommendations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentRecommendationResponse {
    public static final int $stable = 8;
    private final boolean inPayPalNetwork;
    private final java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> recommendations;
    private final java.lang.String sessionId;

    public PaymentRecommendationResponse(java.lang.String str, boolean z, java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.sessionId = str;
        this.inPayPalNetwork = z;
        this.recommendations = list;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final boolean getInPayPalNetwork() {
        return this.inPayPalNetwork;
    }

    public final java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> getRecommendations() {
        return this.recommendations;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionId;
        boolean z = this.inPayPalNetwork;
        java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> list = this.recommendations;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentRecommendationResponse(sessionId=");
        sb.append(str);
        sb.append(", inPayPalNetwork=");
        sb.append(z);
        sb.append(", recommendations=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.sessionId.hashCode() * 31) + java.lang.Boolean.hashCode(this.inPayPalNetwork)) * 31) + this.recommendations.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse)) {
            return false;
        }
        com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse paymentRecommendationResponse = (com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, paymentRecommendationResponse.sessionId) && this.inPayPalNetwork == paymentRecommendationResponse.inPayPalNetwork && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendations, paymentRecommendationResponse.recommendations);
    }

    public final com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse copy(java.lang.String sessionId, boolean inPayPalNetwork, java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> recommendations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendations, "");
        return new com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse(sessionId, inPayPalNetwork, recommendations);
    }

    public final java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> component3() {
        return this.recommendations;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInPayPalNetwork() {
        return this.inPayPalNetwork;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse copy$default(com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse paymentRecommendationResponse, java.lang.String str, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentRecommendationResponse.sessionId;
        }
        if ((i & 2) != 0) {
            z = paymentRecommendationResponse.inPayPalNetwork;
        }
        if ((i & 4) != 0) {
            list = paymentRecommendationResponse.recommendations;
        }
        return paymentRecommendationResponse.copy(str, z, list);
    }
}
