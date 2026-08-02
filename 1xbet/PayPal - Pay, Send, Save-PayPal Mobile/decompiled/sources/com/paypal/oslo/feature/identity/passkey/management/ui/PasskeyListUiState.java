package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState;", "", "Loading", "Content", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_ERROR, "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$Content;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$LoadError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyListUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$Loading;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Loading();

        public final int hashCode() {
            return -1825219283;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014JX\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b+\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$Content;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState;", "", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyCredential;", "passkeys", "", "showSuccessMessage", "", "deletingPasskeyId", "isEnrolling", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "createError", "deletedPasskeyAuthenticatorName", "<init>", "(Ljava/util/List;ZLjava/lang/String;ZLcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "component6", "copy", "(Ljava/util/List;ZLjava/lang/String;ZLcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getPasskeys", "Z", "getShowSuccessMessage", "Ljava/lang/String;", "getDeletingPasskeyId", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "getCreateError", "getDeletedPasskeyAuthenticatorName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError createError;
        private final java.lang.String deletedPasskeyAuthenticatorName;
        private final java.lang.String deletingPasskeyId;
        private final boolean isEnrolling;
        private final java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> passkeys;
        private final boolean showSuccessMessage;

        public Content(java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> list, boolean z, java.lang.String str, boolean z2, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.passkeys = list;
            this.showSuccessMessage = z;
            this.deletingPasskeyId = str;
            this.isEnrolling = z2;
            this.createError = passkeyCreateError;
            this.deletedPasskeyAuthenticatorName = str2;
        }

        public /* synthetic */ Content(java.util.List list, boolean z, java.lang.String str, boolean z2, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? null : passkeyCreateError, (i & 32) == 0 ? str2 : null);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> getPasskeys() {
            return this.passkeys;
        }

        public final boolean getShowSuccessMessage() {
            return this.showSuccessMessage;
        }

        public final java.lang.String getDeletingPasskeyId() {
            return this.deletingPasskeyId;
        }

        public final boolean isEnrolling() {
            return this.isEnrolling;
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError getCreateError() {
            return this.createError;
        }

        public final java.lang.String getDeletedPasskeyAuthenticatorName() {
            return this.deletedPasskeyAuthenticatorName;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> list = this.passkeys;
            boolean z = this.showSuccessMessage;
            java.lang.String str = this.deletingPasskeyId;
            boolean z2 = this.isEnrolling;
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = this.createError;
            java.lang.String str2 = this.deletedPasskeyAuthenticatorName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(passkeys=");
            sb.append(list);
            sb.append(", showSuccessMessage=");
            sb.append(z);
            sb.append(", deletingPasskeyId=");
            sb.append(str);
            sb.append(", isEnrolling=");
            sb.append(z2);
            sb.append(", createError=");
            sb.append(passkeyCreateError);
            sb.append(", deletedPasskeyAuthenticatorName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.passkeys.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.showSuccessMessage);
            java.lang.String str = this.deletingPasskeyId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.isEnrolling);
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = this.createError;
            int hashCode5 = passkeyCreateError == null ? 0 : passkeyCreateError.hashCode();
            java.lang.String str2 = this.deletedPasskeyAuthenticatorName;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeys, content.passkeys) && this.showSuccessMessage == content.showSuccessMessage && kotlin.jvm.internal.Intrinsics.areEqual(this.deletingPasskeyId, content.deletingPasskeyId) && this.isEnrolling == content.isEnrolling && kotlin.jvm.internal.Intrinsics.areEqual(this.createError, content.createError) && kotlin.jvm.internal.Intrinsics.areEqual(this.deletedPasskeyAuthenticatorName, content.deletedPasskeyAuthenticatorName);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content copy(java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> passkeys, boolean showSuccessMessage, java.lang.String deletingPasskeyId, boolean isEnrolling, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError createError, java.lang.String deletedPasskeyAuthenticatorName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeys, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content(passkeys, showSuccessMessage, deletingPasskeyId, isEnrolling, createError, deletedPasskeyAuthenticatorName);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getDeletedPasskeyAuthenticatorName() {
            return this.deletedPasskeyAuthenticatorName;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError getCreateError() {
            return this.createError;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsEnrolling() {
            return this.isEnrolling;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDeletingPasskeyId() {
            return this.deletingPasskeyId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowSuccessMessage() {
            return this.showSuccessMessage;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> component1() {
            return this.passkeys;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content, java.util.List list, boolean z, java.lang.String str, boolean z2, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = content.passkeys;
            }
            if ((i & 2) != 0) {
                z = content.showSuccessMessage;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                str = content.deletingPasskeyId;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                z2 = content.isEnrolling;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                passkeyCreateError = content.createError;
            }
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError2 = passkeyCreateError;
            if ((i & 32) != 0) {
                str2 = content.deletedPasskeyAuthenticatorName;
            }
            return content.copy(list, z3, str3, z4, passkeyCreateError2, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$LoadError;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyListUiState$LoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadError implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState {
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError copy(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError loadError, com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError passkeyListError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyListError = loadError.error;
            }
            return loadError.copy(passkeyListError);
        }
    }
}
