package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult;", "", "Complete", "NeedsSetup", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult$Complete;", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult$NeedsSetup;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AccountSetupResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult$Complete;", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Complete implements com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.Complete INSTANCE = new com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.Complete();

        public final int hashCode() {
            return -1118509961;
        }

        private Complete() {
        }

        public final java.lang.String toString() {
            return "Complete";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.Complete)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult$NeedsSetup;", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "status", "<init>", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "copy", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;)Lcom/paypal/oslo/feature/businesshome/domain/usecase/AccountSetupResult$NeedsSetup;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NeedsSetup implements com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult {
        public static final int $stable = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus.$stable;
        private final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus status;

        public NeedsSetup(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSetupStatus, "");
            this.status = accountSetupStatus;
        }

        public final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NeedsSetup(status=");
            sb.append(accountSetupStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup) other).status);
        }

        public final com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup copy(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup copy$default(com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup needsSetup, com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountSetupStatus = needsSetup.status;
            }
            return needsSetup.copy(accountSetupStatus);
        }
    }
}
