package com.paypal.oslo.feature.subscriptions.shared;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "p0", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "Hub", "AgreementDetails", "BulkFi", "UpdateFi", "LinkAgreement", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$AgreementDetails;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$Hub;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$LinkAgreement;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$UpdateFi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SubscriptionEventSource {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

    private SubscriptionEventSource(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    public com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
        return this.agreementType;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$Hub;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$Hub;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hub extends com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(agreementType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.agreementType = agreementType;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Hub(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub copy$default(com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub hub, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = hub.agreementType;
            }
            return hub.copy(agreementType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$AgreementDetails;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$AgreementDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreementDetails extends com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreementDetails(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(agreementType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.agreementType = agreementType;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementDetails(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails copy$default(com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails agreementDetails, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = agreementDetails.agreementType;
            }
            return agreementDetails.copy(agreementType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$BulkFi;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BulkFi extends com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BulkFi(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(agreementType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.agreementType = agreementType;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BulkFi(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi copy$default(com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi bulkFi, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = bulkFi.agreementType;
            }
            return bulkFi.copy(agreementType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$UpdateFi;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$UpdateFi;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateFi extends com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFi(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(agreementType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.agreementType = agreementType;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateFi(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi copy$default(com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi updateFi, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = updateFi.agreementType;
            }
            return updateFi.copy(agreementType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$LinkAgreement;", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource$LinkAgreement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkAgreement extends com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkAgreement(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(agreementType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.agreementType = agreementType;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAgreement(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement copy$default(com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement linkAgreement, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = linkAgreement.agreementType;
            }
            return linkAgreement.copy(agreementType);
        }
    }

    public /* synthetic */ SubscriptionEventSource(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(agreementType);
    }
}
