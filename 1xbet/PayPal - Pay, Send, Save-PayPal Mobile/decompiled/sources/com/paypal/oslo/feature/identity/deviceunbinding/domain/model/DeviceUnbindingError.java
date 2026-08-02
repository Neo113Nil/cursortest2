package com.paypal.oslo.feature.identity.deviceunbinding.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "", "<init>", "()V", "", "getDescription", "()Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "MethodNotEligible", "Network", com.google.common.net.HttpHeaders.SERVER, "InvalidServerResponse", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$InvalidServerResponse;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$MethodNotEligible;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$Network;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$Server;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeviceUnbindingError {
    public static final int $stable = 0;

    private DeviceUnbindingError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$MethodNotEligible;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$MethodNotEligible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "getMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MethodNotEligible extends com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MethodNotEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthMethod, "");
            this.method = deviceAuthMethod;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod getMethod() {
            return this.method;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = this.method;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MethodNotEligible(method=");
            sb.append(deviceAuthMethod);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.method.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible) && this.method == ((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible) other).method;
        }

        public final com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible copy(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible(method);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod getMethod() {
            return this.method;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible copy$default(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible methodNotEligible, com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deviceAuthMethod = methodNotEligible.method;
            }
            return methodNotEligible.copy(deviceAuthMethod);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$Network;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "", "message", "", "underlyingError", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getUnderlyingError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError {
        public static final int $stable = 8;
        private final java.lang.String message;
        private final java.lang.Throwable underlyingError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Network(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.underlyingError = th;
        }

        public /* synthetic */ Network(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getUnderlyingError() {
            return this.underlyingError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.underlyingError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(message=");
            sb.append(str);
            sb.append(", underlyingError=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.underlyingError;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network)) {
                return false;
            }
            com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network network = (com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, network.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.underlyingError, network.underlyingError);
        }

        public final com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network copy(java.lang.String message, java.lang.Throwable underlyingError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network(message, underlyingError);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getUnderlyingError() {
            return this.underlyingError;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network copy$default(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network network, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = network.message;
            }
            if ((i & 2) != 0) {
                th = network.underlyingError;
            }
            return network.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$Server;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$Server;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Server extends com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Server(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Server(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) other).message);
        }

        public final com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server copy$default(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server server, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = server.message;
            }
            return server.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError$InvalidServerResponse;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidServerResponse extends com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse INSTANCE = new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse();

        public final int hashCode() {
            return 1423845943;
        }

        private InvalidServerResponse() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidServerResponse";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse)) {
                return false;
            }
            return true;
        }
    }

    public final java.lang.String getDescription() {
        if (this instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible) {
            java.lang.String displayName = ((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.MethodNotEligible) this).getMethod().getDisplayName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Method '");
            sb.append(displayName);
            sb.append("' is not eligible for unbinding");
            return sb.toString();
        }
        if (this instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) {
            return "Network error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network) this).getMessage()));
        }
        if (this instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) {
            return "Server error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server) this).getMessage()));
        }
        if (this instanceof com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse) {
            return com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.INVALID_SERVER_RESPONSE_MESSAGE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ DeviceUnbindingError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
