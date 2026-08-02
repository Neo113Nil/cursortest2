package com.paypal.oslo.feature.bnplservicing.domain.model.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "", "<init>", "()V", "Network", "GraphQL", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BNPLError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "source", "withSource$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network;", "getSource", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "NoConnection", "HttpError", "UnknownNetworkError", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$HttpError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$NoConnection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$UnknownNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Network extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError {
        public static final int $stable = 0;

        public abstract com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource();

        private Network() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$NoConnection;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network;", "", "cause", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "source", "<init>", "(Ljava/lang/Throwable;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)V", "component1", "()Ljava/lang/Throwable;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "copy", "(Ljava/lang/Throwable;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$NoConnection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoConnection extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network {
            public static final int $stable = 8;
            private final java.lang.Throwable cause;
            private final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoConnection(java.lang.Throwable th, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.cause = th;
                this.source = requestSource;
            }

            public /* synthetic */ NoConnection(java.lang.Throwable th, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(th, (i & 2) != 0 ? null : requestSource);
            }

            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource() {
                return this.source;
            }

            public final java.lang.String toString() {
                java.lang.Throwable th = this.cause;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = this.source;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoConnection(cause=");
                sb.append(th);
                sb.append(", source=");
                sb.append(requestSource);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.cause.hashCode();
                com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = this.source;
                return (hashCode * 31) + (requestSource == null ? 0 : requestSource.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection noConnection = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.cause, noConnection.cause) && this.source == noConnection.source;
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection copy(java.lang.Throwable cause, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection(cause, source);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource() {
                return this.source;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection noConnection, java.lang.Throwable th, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = noConnection.cause;
                }
                if ((i & 2) != 0) {
                    requestSource = noConnection.source;
                }
                return noConnection.copy(th, requestSource);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$HttpError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network;", "", "statusCode", "", "message", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "source", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "Ljava/lang/String;", "getMessage", "getBody", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network {
            public static final int $stable = 0;
            private final java.lang.String body;
            private final java.lang.String message;
            private final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source;
            private final int statusCode;

            public HttpError(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource) {
                super(null);
                this.statusCode = i;
                this.message = str;
                this.body = str2;
                this.source = requestSource;
            }

            public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : requestSource);
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String getBody() {
                return this.body;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource() {
                return this.source;
            }

            public final java.lang.String toString() {
                int i = this.statusCode;
                java.lang.String str = this.message;
                java.lang.String str2 = this.body;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = this.source;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(statusCode=");
                sb.append(i);
                sb.append(", message=");
                sb.append(str);
                sb.append(", body=");
                sb.append(str2);
                sb.append(", source=");
                sb.append(requestSource);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Integer.hashCode(this.statusCode);
                java.lang.String str = this.message;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.body;
                int hashCode3 = str2 == null ? 0 : str2.hashCode();
                com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = this.source;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (requestSource != null ? requestSource.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError httpError = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError) other;
                return this.statusCode == httpError.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body) && this.source == httpError.source;
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError copy(int statusCode, java.lang.String message, java.lang.String body, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source) {
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError(statusCode, message, body, source);
            }

            /* renamed from: component4, reason: from getter */
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getBody() {
                return this.body;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component1, reason: from getter */
            public final int getStatusCode() {
                return this.statusCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError httpError, int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpError.statusCode;
                }
                if ((i2 & 2) != 0) {
                    str = httpError.message;
                }
                if ((i2 & 4) != 0) {
                    str2 = httpError.body;
                }
                if ((i2 & 8) != 0) {
                    requestSource = httpError.source;
                }
                return httpError.copy(i, str, str2, requestSource);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$UnknownNetworkError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network;", "", "cause", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "source", "<init>", "(Ljava/lang/Throwable;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)V", "component1", "()Ljava/lang/Throwable;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "copy", "(Ljava/lang/Throwable;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$Network$UnknownNetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownNetworkError extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network {
            public static final int $stable = 8;
            private final java.lang.Throwable cause;
            private final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownNetworkError(java.lang.Throwable th, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.cause = th;
                this.source = requestSource;
            }

            public /* synthetic */ UnknownNetworkError(java.lang.Throwable th, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(th, (i & 2) != 0 ? null : requestSource);
            }

            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource() {
                return this.source;
            }

            public final java.lang.String toString() {
                java.lang.Throwable th = this.cause;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = this.source;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownNetworkError(cause=");
                sb.append(th);
                sb.append(", source=");
                sb.append(requestSource);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.cause.hashCode();
                com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = this.source;
                return (hashCode * 31) + (requestSource == null ? 0 : requestSource.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError unknownNetworkError = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknownNetworkError.cause) && this.source == unknownNetworkError.source;
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError copy(java.lang.Throwable cause, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError(cause, source);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource getSource() {
                return this.source;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError unknownNetworkError, java.lang.Throwable th, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = unknownNetworkError.cause;
                }
                if ((i & 2) != 0) {
                    requestSource = unknownNetworkError.source;
                }
                return unknownNetworkError.copy(th, requestSource);
            }
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network withSource$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            if (this instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection.copy$default((com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.NoConnection) this, null, source, 1, null);
            }
            if (this instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError.copy$default((com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.HttpError) this, 0, null, null, source, 7, null);
            }
            if (this instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError.copy$default((com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network.UnknownNetworkError) this, null, source, 1, null);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public /* synthetic */ Network(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BNPLError() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "", "getPath", "()Ljava/util/List;", "path", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "getExtensions", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "ErrorDetail", "GraphQLExtensions", "PartialError", "Unknown", "PartialErrorType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class GraphQL extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError {
        public static final int $stable = 0;

        public abstract com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions();

        public abstract java.lang.String getMessage();

        public abstract java.util.List<java.lang.String> getPath();

        private GraphQL() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$ErrorDetail;", "", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "field", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$ErrorDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getDescription", "getField", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ErrorDetail {
            public static final int $stable = 0;
            private final java.lang.String description;
            private final java.lang.String field;
            private final java.lang.String issue;
            private final java.lang.String value;

            public ErrorDetail(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                this.issue = str;
                this.description = str2;
                this.field = str3;
                this.value = str4;
            }

            public final java.lang.String getIssue() {
                return this.issue;
            }

            public final java.lang.String getDescription() {
                return this.description;
            }

            public final java.lang.String getField() {
                return this.field;
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.issue;
                java.lang.String str2 = this.description;
                java.lang.String str3 = this.field;
                java.lang.String str4 = this.value;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorDetail(issue=");
                sb.append(str);
                sb.append(", description=");
                sb.append(str2);
                sb.append(", field=");
                sb.append(str3);
                sb.append(", value=");
                sb.append(str4);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.issue;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.description;
                int hashCode2 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.field;
                int hashCode3 = str3 == null ? 0 : str3.hashCode();
                java.lang.String str4 = this.value;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, errorDetail.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, errorDetail.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, errorDetail.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, errorDetail.value);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail copy(java.lang.String issue, java.lang.String description, java.lang.String field, java.lang.String value) {
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail(issue, description, field, value);
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getValue() {
                return this.value;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getField() {
                return this.field;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDescription() {
                return this.description;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIssue() {
                return this.issue;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = errorDetail.issue;
                }
                if ((i & 2) != 0) {
                    str2 = errorDetail.description;
                }
                if ((i & 4) != 0) {
                    str3 = errorDetail.field;
                }
                if ((i & 8) != 0) {
                    str4 = errorDetail.value;
                }
                return errorDetail.copy(str, str2, str3, str4);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0014R\u0013\u0010%\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "", "", "name", "service", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$ErrorDetail;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "detailsByIssue", "(Ljava/lang/String;)Ljava/util/List;", "fieldName", "getFieldValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getService", "Ljava/util/List;", "getDetails", "getDebugId", "debugId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLExtensions {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> details;
            private final java.lang.String name;
            private final java.lang.String service;

            public GraphQLExtensions(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.name = str;
                this.service = str2;
                this.details = list;
            }

            public final java.lang.String getName() {
                return this.name;
            }

            public final java.lang.String getService() {
                return this.service;
            }

            public /* synthetic */ GraphQLExtensions(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> getDetails() {
                return this.details;
            }

            public final java.lang.String getDebugId() {
                return getFieldValue$default(this, null, "debugId", 1, null);
            }

            public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> detailsByIssue(java.lang.String issue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issue, "");
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> list = this.details;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail) obj).getIssue(), issue)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public static /* synthetic */ java.lang.String getFieldValue$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return graphQLExtensions.getFieldValue(str, str2);
            }

            public final java.lang.String getFieldValue(java.lang.String issue, java.lang.String fieldName) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "");
                java.util.Iterator<T> it = this.details.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail) obj;
                    if (issue == null || kotlin.jvm.internal.Intrinsics.areEqual(errorDetail.getIssue(), issue)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(errorDetail.getField(), fieldName)) {
                            break;
                        }
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail2 = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail) obj;
                if (errorDetail2 != null) {
                    return errorDetail2.getValue();
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.name;
                java.lang.String str2 = this.service;
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> list = this.details;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLExtensions(name=");
                sb.append(str);
                sb.append(", service=");
                sb.append(str2);
                sb.append(", details=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.name.hashCode();
                java.lang.String str = this.service;
                return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.details.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.name, graphQLExtensions.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, graphQLExtensions.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, graphQLExtensions.details);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions copy(java.lang.String name2, java.lang.String service, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> details) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(name2, service, details);
            }

            public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail> component3() {
                return this.details;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getService() {
                return this.service;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getName() {
                return this.name;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = graphQLExtensions.name;
                }
                if ((i & 2) != 0) {
                    str2 = graphQLExtensions.service;
                }
                if ((i & 4) != 0) {
                    list = graphQLExtensions.details;
                }
                return graphQLExtensions.copy(str, str2, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;", "error", "", "message", "", "path", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;", "getError", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "getExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PartialError extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType error;
            private final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions extensions;
            private final java.lang.String message;
            private final java.util.List<java.lang.String> path;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PartialError(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType, java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialErrorType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLExtensions, "");
                this.error = partialErrorType;
                this.message = str;
                this.path = list;
                this.extensions = graphQLExtensions;
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType getError() {
                return this.error;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL
            public final java.lang.String getMessage() {
                return this.message;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL
            public final java.util.List<java.lang.String> getPath() {
                return this.path;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType = this.error;
                java.lang.String str = this.message;
                java.util.List<java.lang.String> list = this.path;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = this.extensions;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialError(error=");
                sb.append(partialErrorType);
                sb.append(", message=");
                sb.append(str);
                sb.append(", path=");
                sb.append(list);
                sb.append(", extensions=");
                sb.append(graphQLExtensions);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.error.hashCode();
                int hashCode2 = this.message.hashCode();
                java.util.List<java.lang.String> list = this.path;
                return (((((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.extensions.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError partialError = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError) other;
                return this.error == partialError.error && kotlin.jvm.internal.Intrinsics.areEqual(this.message, partialError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, partialError.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, partialError.extensions);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError copy(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType error, java.lang.String message, java.util.List<java.lang.String> path, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions extensions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError(error, message, path, extensions);
            }

            /* renamed from: component4, reason: from getter */
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.util.List<java.lang.String> component3() {
                return this.path;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType getError() {
                return this.error;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError partialError, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType, java.lang.String str, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    partialErrorType = partialError.error;
                }
                if ((i & 2) != 0) {
                    str = partialError.message;
                }
                if ((i & 4) != 0) {
                    list = partialError.path;
                }
                if ((i & 8) != 0) {
                    graphQLExtensions = partialError.extensions;
                }
                return partialError.copy(partialErrorType, str, list, graphQLExtensions);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$Unknown;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL;", "", "message", "", "path", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "getExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unknown extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions extensions;
            private final java.lang.String message;
            private final java.util.List<java.lang.String> path;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLExtensions, "");
                this.message = str;
                this.path = list;
                this.extensions = graphQLExtensions;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL
            public final java.lang.String getMessage() {
                return this.message;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL
            public final java.util.List<java.lang.String> getPath() {
                return this.path;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.util.List<java.lang.String> list = this.path;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = this.extensions;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
                sb.append(str);
                sb.append(", path=");
                sb.append(list);
                sb.append(", extensions=");
                sb.append(graphQLExtensions);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.message.hashCode();
                java.util.List<java.lang.String> list = this.path;
                return (((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.extensions.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown unknown = (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknown.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, unknown.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, unknown.extensions);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown copy(java.lang.String message, java.util.List<java.lang.String> path, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions extensions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown(message, path, extensions);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.util.List<java.lang.String> component2() {
                return this.path;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.Unknown unknown, java.lang.String str, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.message;
                }
                if ((i & 2) != 0) {
                    list = unknown.path;
                }
                if ((i & 4) != 0) {
                    graphQLExtensions = unknown.extensions;
                }
                return unknown.copy(str, list, graphQLExtensions);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "PREQUALIFICATION_SUMMARY", "PREQUALIFICATION_SUMMARY_AMOUNT", "PLANS_OVERVIEW_ACTIVE", "PLANS_OVERVIEW_ACTIVE_PAGE", "PLANS_OVERVIEW_ACTIVE_PLANS", "PLANS_OVERVIEW_HISTORY", "PLANS_OVERVIEW_HISTORY_PAGE", "PLANS_OVERVIEW_HISTORY_PLANS", "PLAN_DETAILS", "PLAN_DETAILS_AUTOPAY", "PLAN_DETAILS_FI", "PLAN_DETAILS_ACTIVITIES", "MAKE_A_PAYMENT", "MAKE_A_PAYMENT_FI", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PartialErrorType {
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType MAKE_A_PAYMENT;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType MAKE_A_PAYMENT_FI;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType NONE;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLANS_OVERVIEW_ACTIVE;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLANS_OVERVIEW_ACTIVE_PAGE;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLANS_OVERVIEW_ACTIVE_PLANS;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLANS_OVERVIEW_HISTORY;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLANS_OVERVIEW_HISTORY_PAGE;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLANS_OVERVIEW_HISTORY_PLANS;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLAN_DETAILS;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLAN_DETAILS_ACTIVITIES;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLAN_DETAILS_AUTOPAY;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PLAN_DETAILS_FI;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PREQUALIFICATION_SUMMARY;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType PREQUALIFICATION_SUMMARY_AMOUNT;
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
            private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType[] getHighSpeedVideoFpsRangesFor;

            private PartialErrorType(java.lang.String str, int i) {
            }

            static {
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PREQUALIFICATION_SUMMARY", 0);
                PREQUALIFICATION_SUMMARY = partialErrorType;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PREQUALIFICATION_SUMMARY_AMOUNT", 1);
                PREQUALIFICATION_SUMMARY_AMOUNT = partialErrorType2;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLANS_OVERVIEW_ACTIVE", 2);
                PLANS_OVERVIEW_ACTIVE = partialErrorType3;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLANS_OVERVIEW_ACTIVE_PAGE", 3);
                PLANS_OVERVIEW_ACTIVE_PAGE = partialErrorType4;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType5 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLANS_OVERVIEW_ACTIVE_PLANS", 4);
                PLANS_OVERVIEW_ACTIVE_PLANS = partialErrorType5;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType6 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLANS_OVERVIEW_HISTORY", 5);
                PLANS_OVERVIEW_HISTORY = partialErrorType6;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType7 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLANS_OVERVIEW_HISTORY_PAGE", 6);
                PLANS_OVERVIEW_HISTORY_PAGE = partialErrorType7;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType8 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLANS_OVERVIEW_HISTORY_PLANS", 7);
                PLANS_OVERVIEW_HISTORY_PLANS = partialErrorType8;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType9 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLAN_DETAILS", 8);
                PLAN_DETAILS = partialErrorType9;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType10 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLAN_DETAILS_AUTOPAY", 9);
                PLAN_DETAILS_AUTOPAY = partialErrorType10;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType11 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLAN_DETAILS_FI", 10);
                PLAN_DETAILS_FI = partialErrorType11;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType12 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("PLAN_DETAILS_ACTIVITIES", 11);
                PLAN_DETAILS_ACTIVITIES = partialErrorType12;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType13 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("MAKE_A_PAYMENT", 12);
                MAKE_A_PAYMENT = partialErrorType13;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType14 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("MAKE_A_PAYMENT_FI", 13);
                MAKE_A_PAYMENT_FI = partialErrorType14;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType partialErrorType15 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType("NONE", 14);
                NONE = partialErrorType15;
                com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType[] partialErrorTypeArr = {partialErrorType, partialErrorType2, partialErrorType3, partialErrorType4, partialErrorType5, partialErrorType6, partialErrorType7, partialErrorType8, partialErrorType9, partialErrorType10, partialErrorType11, partialErrorType12, partialErrorType13, partialErrorType14, partialErrorType15};
                getHighSpeedVideoFpsRangesFor = partialErrorTypeArr;
                getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(partialErrorTypeArr);
            }

            public static com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType[] values() {
                return (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType[]) getHighSpeedVideoFpsRangesFor.clone();
            }

            public static com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType valueOf(java.lang.String str) {
                return (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.class, str);
            }

            public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType> getEntries() {
                return getHighSpeedVideoFpsRanges;
            }
        }

        public /* synthetic */ GraphQL(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BNPLError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
