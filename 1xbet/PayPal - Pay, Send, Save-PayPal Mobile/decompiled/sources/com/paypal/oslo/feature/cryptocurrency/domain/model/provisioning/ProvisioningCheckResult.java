package com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult;", "", "ProceedWithOperation", "ShowProvisioning", "Error", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$ProceedWithOperation;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$ShowProvisioning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ProvisioningCheckResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$ProceedWithOperation;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProceedWithOperation implements com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation();

        public final int hashCode() {
            return 1807120710;
        }

        private ProceedWithOperation() {
        }

        public final java.lang.String toString() {
            return "ProceedWithOperation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$ShowProvisioning;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "capability", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$ShowProvisioning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "getCapability"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowProvisioning implements com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability capability;

        public ShowProvisioning(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability subscriptionCapability) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionCapability, "");
            this.capability = subscriptionCapability;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability getCapability() {
            return this.capability;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability subscriptionCapability = this.capability;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowProvisioning(capability=");
            sb.append(subscriptionCapability);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.capability.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) && kotlin.jvm.internal.Intrinsics.areEqual(this.capability, ((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) other).capability);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning copy(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability capability) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning(capability);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability getCapability() {
            return this.capability;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning showProvisioning, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability subscriptionCapability, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                subscriptionCapability = showProvisioning.capability;
            }
            return showProvisioning.copy(subscriptionCapability);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "error", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/provisioning/ProvisioningCheckResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError error;

        public Error(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError cryptocurrencyError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyError, "");
            this.error = cryptocurrencyError;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError cryptocurrencyError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(cryptocurrencyError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error) other).error);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error copy(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error error, com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError cryptocurrencyError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyError = error.error;
            }
            return error.copy(cryptocurrencyError);
        }
    }
}
