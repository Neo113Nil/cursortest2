package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadAuthType;", "", "<init>", "()V", "Companion", "NoAuth", "UserAuth", "ClientAuth", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$ClientAuth;", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$NoAuth;", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$UserAuth;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DownloadAuthType {
    public static final java.lang.String DEFAULT_SOURCE = "file_download";

    private DownloadAuthType() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$NoAuth;", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoAuth extends com.paypal.oslo.downloads.api.model.DownloadAuthType {
        public static final com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth INSTANCE = new com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth();

        public final int hashCode() {
            return 2023782936;
        }

        private NoAuth() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoAuth";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$UserAuth;", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "authenticationState", "", "source", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$UserAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "getAuthenticationState", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserAuth extends com.paypal.oslo.downloads.api.model.DownloadAuthType {
        private final com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAuth(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.authenticationState = authenticationState;
            this.source = str;
        }

        public /* synthetic */ UserAuth(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED : authenticationState, (i & 2) != 0 ? com.paypal.oslo.downloads.api.model.DownloadAuthType.DEFAULT_SOURCE : str);
        }

        public final com.paypal.oslo.core.identity.domain.model.AuthenticationState getAuthenticationState() {
            return this.authenticationState;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState = this.authenticationState;
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAuth(authenticationState=");
            sb.append(authenticationState);
            sb.append(", source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.authenticationState.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth userAuth = (com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth) other;
            return this.authenticationState == userAuth.authenticationState && kotlin.jvm.internal.Intrinsics.areEqual(this.source, userAuth.source);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth copy(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(authenticationState, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.AuthenticationState getAuthenticationState() {
            return this.authenticationState;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth copy$default(com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth userAuth, com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationState = userAuth.authenticationState;
            }
            if ((i & 2) != 0) {
                str = userAuth.source;
            }
            return userAuth.copy(authenticationState, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserAuth() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$ClientAuth;", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType;", "", "source", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/model/DownloadAuthType$ClientAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClientAuth extends com.paypal.oslo.downloads.api.model.DownloadAuthType {
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientAuth(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.source = str;
        }

        public /* synthetic */ ClientAuth(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.downloads.api.model.DownloadAuthType.DEFAULT_SOURCE : str);
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientAuth(source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, ((com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth) other).source);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth copy(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth(source);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth copy$default(com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth clientAuth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = clientAuth.source;
            }
            return clientAuth.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClientAuth() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ DownloadAuthType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
