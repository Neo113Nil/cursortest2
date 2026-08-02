package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError;", "", "<init>", "()V", "NetworkError", "SecurityError", "LoadingError", "TimeoutError", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$LoadingError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$NetworkError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$SecurityError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$TimeoutError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ShoppingIABError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$NetworkError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.NetworkError) other).message);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.NetworkError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.NetworkError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.NetworkError copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.message;
            }
            return networkError.copy(str);
        }
    }

    private ShoppingIABError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$SecurityError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError;", "", "blockedUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$SecurityError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBlockedUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityError extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError {
        public static final int $stable = 0;
        private final java.lang.String blockedUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecurityError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.blockedUrl = str;
        }

        public final java.lang.String getBlockedUrl() {
            return this.blockedUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.blockedUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityError(blockedUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.blockedUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.SecurityError) && kotlin.jvm.internal.Intrinsics.areEqual(this.blockedUrl, ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.SecurityError) other).blockedUrl);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.SecurityError copy(java.lang.String blockedUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockedUrl, "");
            return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.SecurityError(blockedUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBlockedUrl() {
            return this.blockedUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.SecurityError copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.SecurityError securityError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = securityError.blockedUrl;
            }
            return securityError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$LoadingError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError;", "", "errorCode", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$LoadingError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingError extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final int errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingError(int i, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = i;
            this.description = str;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            int i = this.errorCode;
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingError(errorCode=");
            sb.append(i);
            sb.append(", description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.errorCode) * 31) + this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError loadingError = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError) other;
            return this.errorCode == loadingError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.description, loadingError.description);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError copy(int errorCode, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError(errorCode, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError loadingError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loadingError.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = loadingError.description;
            }
            return loadingError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError$TimeoutError;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TimeoutError extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.TimeoutError INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.TimeoutError();

        public final int hashCode() {
            return 473836869;
        }

        private TimeoutError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TimeoutError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.TimeoutError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ShoppingIABError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
