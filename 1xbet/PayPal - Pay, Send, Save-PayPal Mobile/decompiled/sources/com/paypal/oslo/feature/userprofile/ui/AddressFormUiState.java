package com.paypal.oslo.feature.userprofile.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState;", "", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Loading;", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddressFormUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Loading;", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.userprofile.ui.AddressFormUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Loading INSTANCE = new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Loading();

        public final int hashCode() {
            return -1692066100;
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
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Success;", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "", "countryCode", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "getLayout", "Ljava/lang/String;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.userprofile.ui.AddressFormUiState {
        public static final int $stable = 8;
        private final java.lang.String countryCode;
        private final com.paypal.oslo.core.i18n.domain.model.AddressLayout layout;

        public Success(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.layout = addressLayout;
            this.countryCode = str;
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout getLayout() {
            return this.layout;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = this.layout;
            java.lang.String str = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(layout=");
            sb.append(addressLayout);
            sb.append(", countryCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.layout.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success success = (com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.layout, success.layout) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, success.countryCode);
        }

        public final com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success copy(com.paypal.oslo.core.i18n.domain.model.AddressLayout layout, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success(layout, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout getLayout() {
            return this.layout;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success copy$default(com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success success, com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressLayout = success.layout;
            }
            if ((i & 2) != 0) {
                str = success.countryCode;
            }
            return success.copy(addressLayout, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState;", "", "message", "title", "", "retryable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getTitle", "Z", "getRetryable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.userprofile.ui.AddressFormUiState {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final boolean retryable;
        private final java.lang.String title;

        public Error(java.lang.String str, java.lang.String str2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.title = str2;
            this.retryable = z;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.title;
            boolean z = this.retryable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", retryable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.String str = this.title;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.retryable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error error = (com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, error.title) && this.retryable == error.retryable;
        }

        public final com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error copy(java.lang.String message, java.lang.String title, boolean retryable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error(message, title, retryable);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRetryable() {
            return this.retryable;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error copy$default(com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error error, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                str2 = error.title;
            }
            if ((i & 4) != 0) {
                z = error.retryable;
            }
            return error.copy(str, str2, z);
        }
    }
}
