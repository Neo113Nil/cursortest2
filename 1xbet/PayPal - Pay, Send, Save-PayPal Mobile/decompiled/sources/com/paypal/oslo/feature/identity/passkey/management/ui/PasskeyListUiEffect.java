package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect;", "", "ShowDeleteSuccess", "ShowDeleteError", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect$ShowDeleteError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect$ShowDeleteSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyListUiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect$ShowDeleteSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDeleteSuccess implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteSuccess INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteSuccess();

        public final int hashCode() {
            return -866247824;
        }

        private ShowDeleteSuccess() {
        }

        public final java.lang.String toString() {
            return "ShowDeleteSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect$ShowDeleteError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiEffect$ShowDeleteError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDeleteError implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError error;

        public ShowDeleteError(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError passkeyDeleteError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyDeleteError, "");
            this.error = passkeyDeleteError;
        }

        public final com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError passkeyDeleteError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowDeleteError(error=");
            sb.append(passkeyDeleteError);
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError copy(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError showDeleteError, com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError passkeyDeleteError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyDeleteError = showDeleteError.error;
            }
            return showDeleteError.copy(passkeyDeleteError);
        }
    }
}
