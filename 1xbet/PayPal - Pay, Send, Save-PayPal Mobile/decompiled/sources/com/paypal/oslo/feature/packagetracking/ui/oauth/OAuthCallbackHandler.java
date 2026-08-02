package com.paypal.oslo.feature.packagetracking.ui.oauth;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult;", "parseCallback", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult;", "OAuthCallbackResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OAuthCallbackHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler();

    private OAuthCallbackHandler() {
    }

    public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult parseCallback(android.net.Uri uri) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String queryParameter = uri.getQueryParameter("code");
        java.lang.String queryParameter2 = uri.getQueryParameter("state");
        java.lang.String queryParameter3 = uri.getQueryParameter("error");
        java.lang.String queryParameter4 = uri.getQueryParameter("error_description");
        if (queryParameter3 != null) {
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error(queryParameter3, queryParameter4);
        }
        java.lang.String str2 = queryParameter;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2) || (str = queryParameter2) == null || kotlin.text.StringsKt.isBlank(str)) {
            return com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.MissingParameters.INSTANCE;
        }
        return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success(queryParameter, queryParameter2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult;", "", "Success", "Error", "MissingParameters", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$MissingParameters;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface OAuthCallbackResult {

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$Success;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult;", "", "authorizationCode", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthorizationCode", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success implements com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult {
            public static final int $stable = 0;
            private final java.lang.String authorizationCode;
            private final java.lang.String state;

            public Success(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.authorizationCode = str;
                this.state = str2;
            }

            public final java.lang.String getAuthorizationCode() {
                return this.authorizationCode;
            }

            public final java.lang.String getState() {
                return this.state;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.authorizationCode;
                java.lang.String str2 = this.state;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(authorizationCode=");
                sb.append(str);
                sb.append(", state=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.authorizationCode.hashCode() * 31) + this.state.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success success = (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, success.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, success.state);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success copy(java.lang.String authorizationCode, java.lang.String state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success(authorizationCode, state);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getState() {
                return this.state;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAuthorizationCode() {
                return this.authorizationCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success copy$default(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success success, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.authorizationCode;
                }
                if ((i & 2) != 0) {
                    str2 = success.state;
                }
                return success.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult;", "", "errorCode", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error implements com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult {
            public static final int $stable = 0;
            private final java.lang.String errorCode;
            private final java.lang.String errorDescription;

            public Error(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorCode = str;
                this.errorDescription = str2;
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getErrorDescription() {
                return this.errorDescription;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.errorDescription;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
                sb.append(str);
                sb.append(", errorDescription=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorCode.hashCode();
                java.lang.String str = this.errorDescription;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error error = (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, error.errorDescription);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error copy(java.lang.String errorCode, java.lang.String errorDescription) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
                return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error(errorCode, errorDescription);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorDescription() {
                return this.errorDescription;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error copy$default(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorCode;
                }
                if ((i & 2) != 0) {
                    str2 = error.errorDescription;
                }
                return error.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult$MissingParameters;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthCallbackHandler$OAuthCallbackResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingParameters implements com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.MissingParameters INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.MissingParameters();

            public final int hashCode() {
                return -1279205974;
            }

            private MissingParameters() {
            }

            public final java.lang.String toString() {
                return "MissingParameters";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.MissingParameters)) {
                    return false;
                }
                return true;
            }
        }
    }
}
