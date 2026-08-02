package com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "", "<init>", "()V", "Idle", "Loading", "Success", "Error", "NavigateToSetting", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Error;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Idle;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Loading;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$NavigateToSetting;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class LoginAndSecurityUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Idle;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Idle INSTANCE = new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Idle();

        public final int hashCode() {
            return 942780627;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    private LoginAndSecurityUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Loading;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Loading();

        public final int hashCode() {
            return 258890717;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Success;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Success INSTANCE = new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Success();

        public final int hashCode() {
            return -1944929628;
        }

        private Success() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Error;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error copy$default(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$NavigateToSetting;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeatureType;", "type", "<init>", "(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeatureType;)V", "component1", "()Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeatureType;", "copy", "(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeatureType;)Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState$NavigateToSetting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeatureType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSetting extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSetting(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginAndSecurityFeatureType, "");
            this.type = loginAndSecurityFeatureType;
        }

        public final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSetting(type=");
            sb.append(loginAndSecurityFeatureType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting) && this.type == ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting) other).type;
        }

        public final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting copy(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting copy$default(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting navigateToSetting, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loginAndSecurityFeatureType = navigateToSetting.type;
            }
            return navigateToSetting.copy(loginAndSecurityFeatureType);
        }
    }

    public /* synthetic */ LoginAndSecurityUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
