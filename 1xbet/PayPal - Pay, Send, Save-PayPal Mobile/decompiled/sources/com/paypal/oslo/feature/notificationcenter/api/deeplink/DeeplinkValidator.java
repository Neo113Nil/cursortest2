package com.paypal.oslo.feature.notificationcenter.api.deeplink;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator;", "", "", "deeplinkUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationResult;", "validate", "(Ljava/lang/String;)Larrow/core/Either;", "ValidationResult", "ValidationError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeeplinkValidator {
    arrow.core.Either<com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError, com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult> validate(java.lang.String deeplinkUrl);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationResult;", "", "Landroid/net/Uri;", "uri", "", "pathWithQuery", "", "isCustomScheme", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Z)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Landroid/net/Uri;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getUri", "Ljava/lang/String;", "getPathWithQuery", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ValidationResult {
        private final boolean isCustomScheme;
        private final java.lang.String pathWithQuery;
        private final android.net.Uri uri;

        public ValidationResult(android.net.Uri uri, java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.uri = uri;
            this.pathWithQuery = str;
            this.isCustomScheme = z;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final java.lang.String getPathWithQuery() {
            return this.pathWithQuery;
        }

        public final boolean isCustomScheme() {
            return this.isCustomScheme;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.uri;
            java.lang.String str = this.pathWithQuery;
            boolean z = this.isCustomScheme;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationResult(uri=");
            sb.append(uri);
            sb.append(", pathWithQuery=");
            sb.append(str);
            sb.append(", isCustomScheme=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.uri.hashCode() * 31) + this.pathWithQuery.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isCustomScheme);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult)) {
                return false;
            }
            com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult validationResult = (com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uri, validationResult.uri) && kotlin.jvm.internal.Intrinsics.areEqual(this.pathWithQuery, validationResult.pathWithQuery) && this.isCustomScheme == validationResult.isCustomScheme;
        }

        public final com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult copy(android.net.Uri uri, java.lang.String pathWithQuery, boolean isCustomScheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathWithQuery, "");
            return new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult(uri, pathWithQuery, isCustomScheme);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCustomScheme() {
            return this.isCustomScheme;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPathWithQuery() {
            return this.pathWithQuery;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult copy$default(com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult validationResult, android.net.Uri uri, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = validationResult.uri;
            }
            if ((i & 2) != 0) {
                str = validationResult.pathWithQuery;
            }
            if ((i & 4) != 0) {
                z = validationResult.isCustomScheme;
            }
            return validationResult.copy(uri, str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError;", "", "<init>", "()V", "MalformedUrl", "UnsupportedScheme", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError$MalformedUrl;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError$UnsupportedScheme;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class ValidationError {
        private ValidationError() {
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError$MalformedUrl;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError;", "", "url", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError$MalformedUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MalformedUrl extends com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError {
            private final java.lang.String reason;
            private final java.lang.String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MalformedUrl(java.lang.String str, java.lang.String str2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.url = str;
                this.reason = str2;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String getUrl() {
                return this.url;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.url;
                java.lang.String str2 = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MalformedUrl(url=");
                sb.append(str);
                sb.append(", reason=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.url.hashCode() * 31) + this.reason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl)) {
                    return false;
                }
                com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl malformedUrl = (com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.url, malformedUrl.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, malformedUrl.reason);
            }

            public final com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl copy(java.lang.String url, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl(url, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getUrl() {
                return this.url;
            }

            public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl copy$default(com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl malformedUrl, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = malformedUrl.url;
                }
                if ((i & 2) != 0) {
                    str2 = malformedUrl.reason;
                }
                return malformedUrl.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError$UnsupportedScheme;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError;", "", "url", "scheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError$UnsupportedScheme;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getScheme"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnsupportedScheme extends com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError {
            private final java.lang.String scheme;
            private final java.lang.String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedScheme(java.lang.String str, java.lang.String str2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
                this.scheme = str2;
            }

            public final java.lang.String getScheme() {
                return this.scheme;
            }

            public final java.lang.String getUrl() {
                return this.url;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.url;
                java.lang.String str2 = this.scheme;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedScheme(url=");
                sb.append(str);
                sb.append(", scheme=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.url.hashCode();
                java.lang.String str = this.scheme;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme)) {
                    return false;
                }
                com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme unsupportedScheme = (com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.url, unsupportedScheme.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, unsupportedScheme.scheme);
            }

            public final com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme copy(java.lang.String url, java.lang.String scheme) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                return new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme(url, scheme);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getScheme() {
                return this.scheme;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getUrl() {
                return this.url;
            }

            public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme copy$default(com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme unsupportedScheme, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedScheme.url;
                }
                if ((i & 2) != 0) {
                    str2 = unsupportedScheme.scheme;
                }
                return unsupportedScheme.copy(str, str2);
            }
        }

        public /* synthetic */ ValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
