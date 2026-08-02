package com.paypal.oslo.feature.cardconnect.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse;", "", "<init>", "()V", "Eligible", "Ineligible", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse$Eligible;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse$Ineligible;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CardConnectEligibilityResponse {
    public static final int $stable = 0;

    private CardConnectEligibilityResponse() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse$Eligible;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse;", "", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectMerchant;", "merchants", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse$Eligible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMerchants"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Eligible extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> merchants;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Eligible(java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.merchants = list;
        }

        public final java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> getMerchants() {
            return this.merchants;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> list = this.merchants;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Eligible(merchants=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.merchants.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchants, ((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible) other).merchants);
        }

        public final com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible copy(java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> merchants) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchants, "");
            return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible(merchants);
        }

        public final java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> component1() {
            return this.merchants;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible copy$default(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible eligible, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = eligible.merchants;
            }
            return eligible.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse$Ineligible;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse;", "", "reasonCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse$Ineligible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReasonCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ineligible extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse {
        public static final int $stable = 0;
        private final java.lang.String reasonCode;

        public Ineligible(java.lang.String str) {
            super(null);
            this.reasonCode = str;
        }

        public final java.lang.String getReasonCode() {
            return this.reasonCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reasonCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ineligible(reasonCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reasonCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonCode, ((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible) other).reasonCode);
        }

        public final com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible copy(java.lang.String reasonCode) {
            return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible(reasonCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReasonCode() {
            return this.reasonCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible copy$default(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible ineligible, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ineligible.reasonCode;
            }
            return ineligible.copy(str);
        }
    }

    public /* synthetic */ CardConnectEligibilityResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
