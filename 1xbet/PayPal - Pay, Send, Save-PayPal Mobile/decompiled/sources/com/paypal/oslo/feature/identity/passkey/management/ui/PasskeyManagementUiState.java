package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;", "", "Loading", "EmptyState", "HasPasskeys", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_ERROR, "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$EmptyState;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$HasPasskeys;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$LoadError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyManagementUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$Loading;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.Loading();

        public final int hashCode() {
            return -1096491288;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$EmptyState;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyState implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.EmptyState INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.EmptyState();

        public final int hashCode() {
            return 470985240;
        }

        private EmptyState() {
        }

        public final java.lang.String toString() {
            return "EmptyState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.EmptyState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$HasPasskeys;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HasPasskeys implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.HasPasskeys INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.HasPasskeys();

        public final int hashCode() {
            return 329131499;
        }

        private HasPasskeys() {
        }

        public final java.lang.String toString() {
            return "HasPasskeys";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.HasPasskeys)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$LoadError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState$LoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadError implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError error;

        public LoadError(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError passkeyListError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyListError, "");
            this.error = passkeyListError;
        }

        public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError passkeyListError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadError(error=");
            sb.append(passkeyListError);
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError copy(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError loadError, com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError passkeyListError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyListError = loadError.error;
            }
            return loadError.copy(passkeyListError);
        }
    }
}
