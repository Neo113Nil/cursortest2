package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "", "getThrowable", "()Ljava/lang/Throwable;", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "NetworkError", "AuthenticationError", "StorageError", "ValidationError", "ServerError", "SystemRestrictionError", "UnknownError", "Lcom/paypal/oslo/downloads/api/model/DownloadError$AuthenticationError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError$NetworkError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError$ServerError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError$StorageError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError$SystemRestrictionError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError$UnknownError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DownloadError {
    public abstract java.lang.String getMessage();

    public abstract java.lang.Throwable getThrowable();

    private DownloadError() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$NetworkError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "", "isRetryable", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;ZLjava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$NetworkError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final boolean isRetryable;
        private final java.lang.String message;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.String str, boolean z, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.isRetryable = z;
            this.throwable = th;
        }

        public /* synthetic */ NetworkError(java.lang.String str, boolean z, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean isRetryable() {
            return this.isRetryable;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            boolean z = this.isRetryable;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
            sb.append(str);
            sb.append(", isRetryable=");
            sb.append(z);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isRetryable);
            java.lang.Throwable th = this.throwable;
            return (((hashCode * 31) + hashCode2) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.NetworkError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.NetworkError networkError = (com.paypal.oslo.downloads.api.model.DownloadError.NetworkError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, networkError.message) && this.isRetryable == networkError.isRetryable && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, networkError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.NetworkError copy(java.lang.String message, boolean isRetryable, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.NetworkError(message, isRetryable, throwable);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRetryable() {
            return this.isRetryable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.NetworkError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.NetworkError networkError, java.lang.String str, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.message;
            }
            if ((i & 2) != 0) {
                z = networkError.isRetryable;
            }
            if ((i & 4) != 0) {
                th = networkError.throwable;
            }
            return networkError.copy(str, z, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$AuthenticationError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "", "httpCode", "", "isTokenExpired", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;IZLjava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "component4", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;IZLjava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$AuthenticationError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getMessage", com.visa.cbp.getEncExpo.warmup, "getHttpCode", "Z", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final int httpCode;
        private final boolean isTokenExpired;
        private final java.lang.String message;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationError(java.lang.String str, int i, boolean z, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.httpCode = i;
            this.isTokenExpired = z;
            this.throwable = th;
        }

        public /* synthetic */ AuthenticationError(java.lang.String str, int i, boolean z, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final int getHttpCode() {
            return this.httpCode;
        }

        public final boolean isTokenExpired() {
            return this.isTokenExpired;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            int i = this.httpCode;
            boolean z = this.isTokenExpired;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationError(message=");
            sb.append(str);
            sb.append(", httpCode=");
            sb.append(i);
            sb.append(", isTokenExpired=");
            sb.append(z);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.httpCode);
            int hashCode3 = java.lang.Boolean.hashCode(this.isTokenExpired);
            java.lang.Throwable th = this.throwable;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError authenticationError = (com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, authenticationError.message) && this.httpCode == authenticationError.httpCode && this.isTokenExpired == authenticationError.isTokenExpired && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, authenticationError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError copy(java.lang.String message, int httpCode, boolean isTokenExpired, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError(message, httpCode, isTokenExpired, throwable);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsTokenExpired() {
            return this.isTokenExpired;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHttpCode() {
            return this.httpCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError authenticationError, java.lang.String str, int i, boolean z, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = authenticationError.message;
            }
            if ((i2 & 2) != 0) {
                i = authenticationError.httpCode;
            }
            if ((i2 & 4) != 0) {
                z = authenticationError.isTokenExpired;
            }
            if ((i2 & 8) != 0) {
                th = authenticationError.throwable;
            }
            return authenticationError.copy(str, i, z, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$StorageError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "", "requiredBytes", "availableBytes", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;JJLjava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;JJLjava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$StorageError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "J", "getRequiredBytes", "getAvailableBytes", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StorageError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final long availableBytes;
        private final java.lang.String message;
        private final long requiredBytes;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StorageError(java.lang.String str, long j, long j2, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.requiredBytes = j;
            this.availableBytes = j2;
            this.throwable = th;
        }

        public /* synthetic */ StorageError(java.lang.String str, long j, long j2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? -1L : j, (i & 4) == 0 ? j2 : -1L, (i & 8) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final long getRequiredBytes() {
            return this.requiredBytes;
        }

        public final long getAvailableBytes() {
            return this.availableBytes;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            long j = this.requiredBytes;
            long j2 = this.availableBytes;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StorageError(message=");
            sb.append(str);
            sb.append(", requiredBytes=");
            sb.append(j);
            sb.append(", availableBytes=");
            sb.append(j2);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = java.lang.Long.hashCode(this.requiredBytes);
            int hashCode3 = java.lang.Long.hashCode(this.availableBytes);
            java.lang.Throwable th = this.throwable;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.StorageError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.StorageError storageError = (com.paypal.oslo.downloads.api.model.DownloadError.StorageError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, storageError.message) && this.requiredBytes == storageError.requiredBytes && this.availableBytes == storageError.availableBytes && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, storageError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.StorageError copy(java.lang.String message, long requiredBytes, long availableBytes, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.StorageError(message, requiredBytes, availableBytes, throwable);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAvailableBytes() {
            return this.availableBytes;
        }

        /* renamed from: component2, reason: from getter */
        public final long getRequiredBytes() {
            return this.requiredBytes;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.StorageError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.StorageError storageError, java.lang.String str, long j, long j2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = storageError.message;
            }
            if ((i & 2) != 0) {
                j = storageError.requiredBytes;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = storageError.availableBytes;
            }
            long j4 = j2;
            if ((i & 8) != 0) {
                th = storageError.throwable;
            }
            return storageError.copy(str, j3, j4, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$ValidationError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "Lcom/paypal/oslo/downloads/api/model/ValidationType;", "validationType", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ValidationType;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/downloads/api/model/ValidationType;", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ValidationType;Ljava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/downloads/api/model/ValidationType;", "getValidationType", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final java.lang.String message;
        private final java.lang.Throwable throwable;
        private final com.paypal.oslo.downloads.api.model.ValidationType validationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationError(java.lang.String str, com.paypal.oslo.downloads.api.model.ValidationType validationType, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationType, "");
            this.message = str;
            this.validationType = validationType;
            this.throwable = th;
        }

        public /* synthetic */ ValidationError(java.lang.String str, com.paypal.oslo.downloads.api.model.ValidationType validationType, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, validationType, (i & 4) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.downloads.api.model.ValidationType getValidationType() {
            return this.validationType;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.downloads.api.model.ValidationType validationType = this.validationType;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(message=");
            sb.append(str);
            sb.append(", validationType=");
            sb.append(validationType);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = this.validationType.hashCode();
            java.lang.Throwable th = this.throwable;
            return (((hashCode * 31) + hashCode2) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.ValidationError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.ValidationError validationError = (com.paypal.oslo.downloads.api.model.DownloadError.ValidationError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, validationError.message) && this.validationType == validationError.validationType && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, validationError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.ValidationError copy(java.lang.String message, com.paypal.oslo.downloads.api.model.ValidationType validationType, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationType, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(message, validationType, throwable);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.downloads.api.model.ValidationType getValidationType() {
            return this.validationType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.ValidationError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.ValidationError validationError, java.lang.String str, com.paypal.oslo.downloads.api.model.ValidationType validationType, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationError.message;
            }
            if ((i & 2) != 0) {
                validationType = validationError.validationType;
            }
            if ((i & 4) != 0) {
                th = validationError.throwable;
            }
            return validationError.copy(str, validationType, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$ServerError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "", "httpCode", "", "isRetryable", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;IZLjava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "component4", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;IZLjava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$ServerError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getMessage", com.visa.cbp.getEncExpo.warmup, "getHttpCode", "Z", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final int httpCode;
        private final boolean isRetryable;
        private final java.lang.String message;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(java.lang.String str, int i, boolean z, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.httpCode = i;
            this.isRetryable = z;
            this.throwable = th;
        }

        public /* synthetic */ ServerError(java.lang.String str, int i, boolean z, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final int getHttpCode() {
            return this.httpCode;
        }

        public final boolean isRetryable() {
            return this.isRetryable;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            int i = this.httpCode;
            boolean z = this.isRetryable;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(message=");
            sb.append(str);
            sb.append(", httpCode=");
            sb.append(i);
            sb.append(", isRetryable=");
            sb.append(z);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.httpCode);
            int hashCode3 = java.lang.Boolean.hashCode(this.isRetryable);
            java.lang.Throwable th = this.throwable;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.ServerError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.ServerError serverError = (com.paypal.oslo.downloads.api.model.DownloadError.ServerError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, serverError.message) && this.httpCode == serverError.httpCode && this.isRetryable == serverError.isRetryable && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, serverError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.ServerError copy(java.lang.String message, int httpCode, boolean isRetryable, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.ServerError(message, httpCode, isRetryable, throwable);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRetryable() {
            return this.isRetryable;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHttpCode() {
            return this.httpCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.ServerError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.ServerError serverError, java.lang.String str, int i, boolean z, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = serverError.message;
            }
            if ((i2 & 2) != 0) {
                i = serverError.httpCode;
            }
            if ((i2 & 4) != 0) {
                z = serverError.isRetryable;
            }
            if ((i2 & 8) != 0) {
                th = serverError.throwable;
            }
            return serverError.copy(str, i, z, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$SystemRestrictionError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "", "requiresUserAction", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;ZLjava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$SystemRestrictionError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z", "getRequiresUserAction", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SystemRestrictionError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final java.lang.String message;
        private final boolean requiresUserAction;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SystemRestrictionError(java.lang.String str, boolean z, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.requiresUserAction = z;
            this.throwable = th;
        }

        public /* synthetic */ SystemRestrictionError(java.lang.String str, boolean z, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean getRequiresUserAction() {
            return this.requiresUserAction;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            boolean z = this.requiresUserAction;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemRestrictionError(message=");
            sb.append(str);
            sb.append(", requiresUserAction=");
            sb.append(z);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.requiresUserAction);
            java.lang.Throwable th = this.throwable;
            return (((hashCode * 31) + hashCode2) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError systemRestrictionError = (com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, systemRestrictionError.message) && this.requiresUserAction == systemRestrictionError.requiresUserAction && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, systemRestrictionError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError copy(java.lang.String message, boolean requiresUserAction, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError(message, requiresUserAction, throwable);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequiresUserAction() {
            return this.requiresUserAction;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError systemRestrictionError, java.lang.String str, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = systemRestrictionError.message;
            }
            if ((i & 2) != 0) {
                z = systemRestrictionError.requiresUserAction;
            }
            if ((i & 4) != 0) {
                th = systemRestrictionError.throwable;
            }
            return systemRestrictionError.copy(str, z, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadError$UnknownError;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/downloads/api/model/DownloadError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.downloads.api.model.DownloadError {
        private final java.lang.String message;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.throwable = th;
        }

        public /* synthetic */ UnknownError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.downloads.api.model.DownloadError
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(message=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadError.UnknownError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.model.DownloadError.UnknownError unknownError = (com.paypal.oslo.downloads.api.model.DownloadError.UnknownError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknownError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, unknownError.throwable);
        }

        public final com.paypal.oslo.downloads.api.model.DownloadError.UnknownError copy(java.lang.String message, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError(message, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError.UnknownError copy$default(com.paypal.oslo.downloads.api.model.DownloadError.UnknownError unknownError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.message;
            }
            if ((i & 2) != 0) {
                th = unknownError.throwable;
            }
            return unknownError.copy(str, th);
        }
    }

    public /* synthetic */ DownloadError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
