package com.paypal.oslo.feature.packagetracking.ui.oauth;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "", "<init>", "()V", "Success", "Error", "Cancelled", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Cancelled;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OAuthFlowResult {
    public static final int $stable = 0;

    private OAuthFlowResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Success;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "", "authorizationCode", "state", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider", "Ljava/lang/String;", "getAuthorizationCode", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult {
        public static final int $stable = 0;
        private final java.lang.String authorizationCode;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;
        private final java.lang.String state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.provider = emailProvider;
            this.authorizationCode = str;
            this.state = str2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public final java.lang.String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public final java.lang.String getState() {
            return this.state;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.String str = this.authorizationCode;
            java.lang.String str2 = this.state;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(provider=");
            sb.append(emailProvider);
            sb.append(", authorizationCode=");
            sb.append(str);
            sb.append(", state=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.provider.hashCode() * 31) + this.authorizationCode.hashCode()) * 31) + this.state.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success success = (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success) other;
            return this.provider == success.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, success.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, success.state);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String authorizationCode, java.lang.String state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success(provider, authorizationCode, state);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAuthorizationCode() {
            return this.authorizationCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success copy$default(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success success, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = success.provider;
            }
            if ((i & 2) != 0) {
                str = success.authorizationCode;
            }
            if ((i & 4) != 0) {
                str2 = success.state;
            }
            return success.copy(emailProvider, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.provider = emailProvider;
            this.errorMessage = str;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(provider=");
            sb.append(emailProvider);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            return ((emailProvider == null ? 0 : emailProvider.hashCode()) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error error = (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error) other;
            return this.provider == error.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error(provider, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error copy$default(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error error, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = error.provider;
            }
            if ((i & 2) != 0) {
                str = error.errorMessage;
            }
            return error.copy(emailProvider, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Cancelled;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;

        public Cancelled(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super(null);
            this.provider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(provider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            if (emailProvider == null) {
                return 0;
            }
            return emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled) && this.provider == ((com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled) other).provider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider) {
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled(provider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled copy$default(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled cancelled, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = cancelled.provider;
            }
            return cancelled.copy(emailProvider);
        }
    }

    public /* synthetic */ OAuthFlowResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
