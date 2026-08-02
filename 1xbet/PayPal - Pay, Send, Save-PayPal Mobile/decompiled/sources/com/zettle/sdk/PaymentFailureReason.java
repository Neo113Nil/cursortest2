package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason;", "", "<init>", "()V", "AuthorizationFailure", "Cancellation", "PrerequisiteRequired", "TechnicalError", "ValidationError", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation;", "Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class PaymentFailureReason {
    private PaymentFailureReason() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure;", "Lcom/zettle/sdk/PaymentFailureReason;", "<init>", "()V", "OfflineAuthorizationDeclined", "ServerError", com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDeclined, "TransactionRejected", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$ServerError;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$TransactionDeclined;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$TransactionRejected;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AuthorizationFailure extends com.zettle.sdk.PaymentFailureReason {
        private AuthorizationFailure() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$TransactionDeclined;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$TransactionDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class TransactionDeclined extends com.zettle.sdk.PaymentFailureReason.AuthorizationFailure {
            private final java.lang.String errorCode;

            public /* synthetic */ TransactionDeclined(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public TransactionDeclined(java.lang.String str) {
                super(null);
                this.errorCode = str;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDeclined(errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionDeclined) other).errorCode);
            }

            public final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionDeclined copy(java.lang.String errorCode) {
                return new com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionDeclined(errorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionDeclined copy$default(com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionDeclined transactionDeclined, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = transactionDeclined.errorCode;
                }
                return transactionDeclined.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TransactionDeclined() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$TransactionRejected;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure;", "", "errorCode", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$TransactionRejected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class TransactionRejected extends com.zettle.sdk.PaymentFailureReason.AuthorizationFailure {
            private final java.lang.String errorCode;
            private final java.lang.String traceId;

            public /* synthetic */ TransactionRejected(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            public TransactionRejected(java.lang.String str, java.lang.String str2) {
                super(null);
                this.errorCode = str;
                this.traceId = str2;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.traceId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionRejected(errorCode=");
                sb.append(str);
                sb.append(", traceId=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.traceId;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected)) {
                    return false;
                }
                com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected transactionRejected = (com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, transactionRejected.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, transactionRejected.traceId);
            }

            public final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected copy(java.lang.String errorCode, java.lang.String traceId) {
                return new com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected(errorCode, traceId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected copy$default(com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.TransactionRejected transactionRejected, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = transactionRejected.errorCode;
                }
                if ((i & 2) != 0) {
                    str2 = transactionRejected.traceId;
                }
                return transactionRejected.copy(str, str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TransactionRejected() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$ServerError;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure;", "", "errorCode", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ServerError extends com.zettle.sdk.PaymentFailureReason.AuthorizationFailure {
            private final java.lang.String errorCode;
            private final java.lang.String traceId;

            public /* synthetic */ ServerError(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            public ServerError(java.lang.String str, java.lang.String str2) {
                super(null);
                this.errorCode = str;
                this.traceId = str2;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.traceId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(errorCode=");
                sb.append(str);
                sb.append(", traceId=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.traceId;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError)) {
                    return false;
                }
                com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError serverError = (com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, serverError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, serverError.traceId);
            }

            public final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError copy(java.lang.String errorCode, java.lang.String traceId) {
                return new com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError(errorCode, traceId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError copy$default(com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.ServerError serverError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = serverError.errorCode;
                }
                if ((i & 2) != 0) {
                    str2 = serverError.traceId;
                }
                return serverError.copy(str, str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ServerError() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure;", "Lcom/zettle/sdk/OfflineAuthCheckType;", "checkType", "", "details", "<init>", "(Lcom/zettle/sdk/OfflineAuthCheckType;Ljava/lang/String;)V", "component1", "()Lcom/zettle/sdk/OfflineAuthCheckType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/zettle/sdk/OfflineAuthCheckType;Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/zettle/sdk/OfflineAuthCheckType;", "getCheckType", "Ljava/lang/String;", "getDetails"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class OfflineAuthorizationDeclined extends com.zettle.sdk.PaymentFailureReason.AuthorizationFailure {
            private final com.zettle.sdk.OfflineAuthCheckType checkType;
            private final java.lang.String details;

            public /* synthetic */ OfflineAuthorizationDeclined(com.zettle.sdk.OfflineAuthCheckType offlineAuthCheckType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(offlineAuthCheckType, (i & 2) != 0 ? null : str);
            }

            public final com.zettle.sdk.OfflineAuthCheckType getCheckType() {
                return this.checkType;
            }

            public final java.lang.String getDetails() {
                return this.details;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfflineAuthorizationDeclined(com.zettle.sdk.OfflineAuthCheckType offlineAuthCheckType, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlineAuthCheckType, "");
                this.checkType = offlineAuthCheckType;
                this.details = str;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.OfflineAuthCheckType offlineAuthCheckType = this.checkType;
                java.lang.String str = this.details;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflineAuthorizationDeclined(checkType=");
                sb.append(offlineAuthCheckType);
                sb.append(", details=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.checkType.hashCode();
                java.lang.String str = this.details;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined)) {
                    return false;
                }
                com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined offlineAuthorizationDeclined = (com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined) other;
                return this.checkType == offlineAuthorizationDeclined.checkType && kotlin.jvm.internal.Intrinsics.areEqual(this.details, offlineAuthorizationDeclined.details);
            }

            public final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined copy(com.zettle.sdk.OfflineAuthCheckType checkType, java.lang.String details) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkType, "");
                return new com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined(checkType, details);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDetails() {
                return this.details;
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.OfflineAuthCheckType getCheckType() {
                return this.checkType;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined copy$default(com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined offlineAuthorizationDeclined, com.zettle.sdk.OfflineAuthCheckType offlineAuthCheckType, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    offlineAuthCheckType = offlineAuthorizationDeclined.checkType;
                }
                if ((i & 2) != 0) {
                    str = offlineAuthorizationDeclined.details;
                }
                return offlineAuthorizationDeclined.copy(offlineAuthCheckType, str);
            }
        }

        public /* synthetic */ AuthorizationFailure(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$Cancellation;", "Lcom/zettle/sdk/PaymentFailureReason;", "<init>", "()V", "CancelledByBackend", "CancelledByCustomer", "CancelledByUser", "Timeout", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByBackend;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByCustomer;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByUser;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation$Timeout;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Cancellation extends com.zettle.sdk.PaymentFailureReason {
        private Cancellation() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByUser;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CancelledByUser extends com.zettle.sdk.PaymentFailureReason.Cancellation {
            public static final com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByUser INSTANCE = new com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByUser();

            private CancelledByUser() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByCustomer;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CancelledByCustomer extends com.zettle.sdk.PaymentFailureReason.Cancellation {
            public static final com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByCustomer INSTANCE = new com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByCustomer();

            private CancelledByCustomer() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByBackend;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$Cancellation$CancelledByBackend;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class CancelledByBackend extends com.zettle.sdk.PaymentFailureReason.Cancellation {
            private final java.lang.String errorCode;

            public /* synthetic */ CancelledByBackend(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public CancelledByBackend(java.lang.String str) {
                super(null);
                this.errorCode = str;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelledByBackend(errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByBackend) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByBackend) other).errorCode);
            }

            public final com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByBackend copy(java.lang.String errorCode) {
                return new com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByBackend(errorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByBackend copy$default(com.zettle.sdk.PaymentFailureReason.Cancellation.CancelledByBackend cancelledByBackend, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = cancelledByBackend.errorCode;
                }
                return cancelledByBackend.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public CancelledByBackend() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$Cancellation$Timeout;", "Lcom/zettle/sdk/PaymentFailureReason$Cancellation;", "Lcom/zettle/sdk/TimeoutStage;", "stage", "<init>", "(Lcom/zettle/sdk/TimeoutStage;)V", "component1", "()Lcom/zettle/sdk/TimeoutStage;", "copy", "(Lcom/zettle/sdk/TimeoutStage;)Lcom/zettle/sdk/PaymentFailureReason$Cancellation$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/TimeoutStage;", "getStage"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Timeout extends com.zettle.sdk.PaymentFailureReason.Cancellation {
            private final com.zettle.sdk.TimeoutStage stage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Timeout(com.zettle.sdk.TimeoutStage timeoutStage) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutStage, "");
                this.stage = timeoutStage;
            }

            public final com.zettle.sdk.TimeoutStage getStage() {
                return this.stage;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.TimeoutStage timeoutStage = this.stage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout(stage=");
                sb.append(timeoutStage);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.stage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.Cancellation.Timeout) && this.stage == ((com.zettle.sdk.PaymentFailureReason.Cancellation.Timeout) other).stage;
            }

            public final com.zettle.sdk.PaymentFailureReason.Cancellation.Timeout copy(com.zettle.sdk.TimeoutStage stage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stage, "");
                return new com.zettle.sdk.PaymentFailureReason.Cancellation.Timeout(stage);
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.TimeoutStage getStage() {
                return this.stage;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.Cancellation.Timeout copy$default(com.zettle.sdk.PaymentFailureReason.Cancellation.Timeout timeout, com.zettle.sdk.TimeoutStage timeoutStage, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    timeoutStage = timeout.stage;
                }
                return timeout.copy(timeoutStage);
            }
        }

        public /* synthetic */ Cancellation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "Lcom/zettle/sdk/PaymentFailureReason;", "<init>", "()V", "CurrencyNotSupported", "InvalidAmount", "InvalidArguments", "MerchantProductCapabilityMissing", "OfflineSystemError", "PaymentMethodNotSupported", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$CurrencyNotSupported;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$InvalidAmount;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$InvalidArguments;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$MerchantProductCapabilityMissing;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$PaymentMethodNotSupported;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ValidationError extends com.zettle.sdk.PaymentFailureReason {
        private ValidationError() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError$InvalidAmount;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "Lcom/zettle/sdk/InvalidAmountReason;", "reason", "<init>", "(Lcom/zettle/sdk/InvalidAmountReason;)V", "component1", "()Lcom/zettle/sdk/InvalidAmountReason;", "copy", "(Lcom/zettle/sdk/InvalidAmountReason;)Lcom/zettle/sdk/PaymentFailureReason$ValidationError$InvalidAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/InvalidAmountReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class InvalidAmount extends com.zettle.sdk.PaymentFailureReason.ValidationError {
            private final com.zettle.sdk.InvalidAmountReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidAmount(com.zettle.sdk.InvalidAmountReason invalidAmountReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidAmountReason, "");
                this.reason = invalidAmountReason;
            }

            public final com.zettle.sdk.InvalidAmountReason getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.InvalidAmountReason invalidAmountReason = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidAmount(reason=");
                sb.append(invalidAmountReason);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidAmount) other).reason);
            }

            public final com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidAmount copy(com.zettle.sdk.InvalidAmountReason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidAmount(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.InvalidAmountReason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidAmount copy$default(com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidAmount invalidAmount, com.zettle.sdk.InvalidAmountReason invalidAmountReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    invalidAmountReason = invalidAmount.reason;
                }
                return invalidAmount.copy(invalidAmountReason);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError$InvalidArguments;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidArguments extends com.zettle.sdk.PaymentFailureReason.ValidationError {
            public static final com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidArguments INSTANCE = new com.zettle.sdk.PaymentFailureReason.ValidationError.InvalidArguments();

            private InvalidArguments() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError$PaymentMethodNotSupported;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PaymentMethodNotSupported extends com.zettle.sdk.PaymentFailureReason.ValidationError {
            public static final com.zettle.sdk.PaymentFailureReason.ValidationError.PaymentMethodNotSupported INSTANCE = new com.zettle.sdk.PaymentFailureReason.ValidationError.PaymentMethodNotSupported();

            private PaymentMethodNotSupported() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError$CurrencyNotSupported;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CurrencyNotSupported extends com.zettle.sdk.PaymentFailureReason.ValidationError {
            public static final com.zettle.sdk.PaymentFailureReason.ValidationError.CurrencyNotSupported INSTANCE = new com.zettle.sdk.PaymentFailureReason.ValidationError.CurrencyNotSupported();

            private CurrencyNotSupported() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError$MerchantProductCapabilityMissing;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MerchantProductCapabilityMissing extends com.zettle.sdk.PaymentFailureReason.ValidationError {
            public static final com.zettle.sdk.PaymentFailureReason.ValidationError.MerchantProductCapabilityMissing INSTANCE = new com.zettle.sdk.PaymentFailureReason.ValidationError.MerchantProductCapabilityMissing();

            private MerchantProductCapabilityMissing() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "reason", "<init>", "(Lcom/zettle/sdk/OfflineSystemErrorReason;)V", "component1", "()Lcom/zettle/sdk/OfflineSystemErrorReason;", "copy", "(Lcom/zettle/sdk/OfflineSystemErrorReason;)Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/OfflineSystemErrorReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class OfflineSystemError extends com.zettle.sdk.PaymentFailureReason.ValidationError {
            private final com.zettle.sdk.OfflineSystemErrorReason reason;

            public final com.zettle.sdk.OfflineSystemErrorReason getReason() {
                return this.reason;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfflineSystemError(com.zettle.sdk.OfflineSystemErrorReason offlineSystemErrorReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlineSystemErrorReason, "");
                this.reason = offlineSystemErrorReason;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.OfflineSystemErrorReason offlineSystemErrorReason = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflineSystemError(reason=");
                sb.append(offlineSystemErrorReason);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError) other).reason);
            }

            public final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError copy(com.zettle.sdk.OfflineSystemErrorReason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.OfflineSystemErrorReason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError copy$default(com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError, com.zettle.sdk.OfflineSystemErrorReason offlineSystemErrorReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    offlineSystemErrorReason = offlineSystemError.reason;
                }
                return offlineSystemError.copy(offlineSystemErrorReason);
            }
        }

        public /* synthetic */ ValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "Lcom/zettle/sdk/PaymentFailureReason;", "<init>", "()V", "BluetoothDisabled", "GenericTechnicalError", "InvalidSwipeData", "NetworkError", "NetworkTimeout", "OutdatedReaderSoftware", "PermissionDenied", "ReaderConfigurationError", "ReaderDisconnected", "ReaderError", "TooManyRequests", "Unknown", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$BluetoothDisabled;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$GenericTechnicalError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$InvalidSwipeData;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$NetworkError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$NetworkTimeout;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$OutdatedReaderSoftware;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$PermissionDenied;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderConfigurationError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderDisconnected;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$TooManyRequests;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$Unknown;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class TechnicalError extends com.zettle.sdk.PaymentFailureReason {
        private TechnicalError() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$NetworkError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NetworkError extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.NetworkError INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.NetworkError();

            private NetworkError() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$NetworkTimeout;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NetworkTimeout extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.NetworkTimeout INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.NetworkTimeout();

            private NetworkTimeout() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$BluetoothDisabled;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BluetoothDisabled extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.BluetoothDisabled INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.BluetoothDisabled();

            private BluetoothDisabled() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderDisconnected;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReaderDisconnected extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderDisconnected INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderDisconnected();

            private ReaderDisconnected() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReaderError extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderError INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderError();

            private ReaderError() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$OutdatedReaderSoftware;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OutdatedReaderSoftware extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.OutdatedReaderSoftware INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.OutdatedReaderSoftware();

            private OutdatedReaderSoftware() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$InvalidSwipeData;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidSwipeData extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            public static final com.zettle.sdk.PaymentFailureReason.TechnicalError.InvalidSwipeData INSTANCE = new com.zettle.sdk.PaymentFailureReason.TechnicalError.InvalidSwipeData();

            private InvalidSwipeData() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$PermissionDenied;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "", "traceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$PermissionDenied;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class PermissionDenied extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            private final java.lang.String traceId;

            public /* synthetic */ PermissionDenied(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            public PermissionDenied(java.lang.String str) {
                super(null);
                this.traceId = str;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.traceId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PermissionDenied(traceId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.traceId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.TechnicalError.PermissionDenied) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, ((com.zettle.sdk.PaymentFailureReason.TechnicalError.PermissionDenied) other).traceId);
            }

            public final com.zettle.sdk.PaymentFailureReason.TechnicalError.PermissionDenied copy(java.lang.String traceId) {
                return new com.zettle.sdk.PaymentFailureReason.TechnicalError.PermissionDenied(traceId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.TechnicalError.PermissionDenied copy$default(com.zettle.sdk.PaymentFailureReason.TechnicalError.PermissionDenied permissionDenied, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = permissionDenied.traceId;
                }
                return permissionDenied.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public PermissionDenied() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$TooManyRequests;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "", "traceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$TooManyRequests;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class TooManyRequests extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            private final java.lang.String traceId;

            public /* synthetic */ TooManyRequests(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            public TooManyRequests(java.lang.String str) {
                super(null);
                this.traceId = str;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.traceId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TooManyRequests(traceId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.traceId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.TechnicalError.TooManyRequests) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, ((com.zettle.sdk.PaymentFailureReason.TechnicalError.TooManyRequests) other).traceId);
            }

            public final com.zettle.sdk.PaymentFailureReason.TechnicalError.TooManyRequests copy(java.lang.String traceId) {
                return new com.zettle.sdk.PaymentFailureReason.TechnicalError.TooManyRequests(traceId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getTraceId() {
                return this.traceId;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.TechnicalError.TooManyRequests copy$default(com.zettle.sdk.PaymentFailureReason.TechnicalError.TooManyRequests tooManyRequests, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = tooManyRequests.traceId;
                }
                return tooManyRequests.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TooManyRequests() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$GenericTechnicalError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "", "details", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$GenericTechnicalError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDetails"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class GenericTechnicalError extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            private final java.lang.String details;

            public GenericTechnicalError(java.lang.String str) {
                super(null);
                this.details = str;
            }

            public /* synthetic */ GenericTechnicalError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getDetails() {
                return this.details;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.details;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericTechnicalError(details=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.details;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.TechnicalError.GenericTechnicalError) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, ((com.zettle.sdk.PaymentFailureReason.TechnicalError.GenericTechnicalError) other).details);
            }

            public final com.zettle.sdk.PaymentFailureReason.TechnicalError.GenericTechnicalError copy(java.lang.String details) {
                return new com.zettle.sdk.PaymentFailureReason.TechnicalError.GenericTechnicalError(details);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDetails() {
                return this.details;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.TechnicalError.GenericTechnicalError copy$default(com.zettle.sdk.PaymentFailureReason.TechnicalError.GenericTechnicalError genericTechnicalError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = genericTechnicalError.details;
                }
                return genericTechnicalError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public GenericTechnicalError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderConfigurationError;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$ReaderConfigurationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ReaderConfigurationError extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            private final java.lang.String error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReaderConfigurationError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.error = str;
            }

            public final java.lang.String getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ReaderConfigurationError(error=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderConfigurationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderConfigurationError) other).error);
            }

            public final com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderConfigurationError copy(java.lang.String error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderConfigurationError(error);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getError() {
                return this.error;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderConfigurationError copy$default(com.zettle.sdk.PaymentFailureReason.TechnicalError.ReaderConfigurationError readerConfigurationError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = readerConfigurationError.error;
                }
                return readerConfigurationError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$Unknown;", "Lcom/zettle/sdk/PaymentFailureReason$TechnicalError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/PaymentFailureReason$TechnicalError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Unknown extends com.zettle.sdk.PaymentFailureReason.TechnicalError {
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
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
                return (other instanceof com.zettle.sdk.PaymentFailureReason.TechnicalError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.zettle.sdk.PaymentFailureReason.TechnicalError.Unknown) other).message);
            }

            public final com.zettle.sdk.PaymentFailureReason.TechnicalError.Unknown copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.zettle.sdk.PaymentFailureReason.TechnicalError.Unknown(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentFailureReason.TechnicalError.Unknown copy$default(com.zettle.sdk.PaymentFailureReason.TechnicalError.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.message;
                }
                return unknown.copy(str);
            }
        }

        public /* synthetic */ TechnicalError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired;", "Lcom/zettle/sdk/PaymentFailureReason;", "<init>", "()V", "AuthRequired", "BankVerificationRequired", "Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired$AuthRequired;", "Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired$BankVerificationRequired;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class PrerequisiteRequired extends com.zettle.sdk.PaymentFailureReason {
        private PrerequisiteRequired() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired$AuthRequired;", "Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AuthRequired extends com.zettle.sdk.PaymentFailureReason.PrerequisiteRequired {
            public static final com.zettle.sdk.PaymentFailureReason.PrerequisiteRequired.AuthRequired INSTANCE = new com.zettle.sdk.PaymentFailureReason.PrerequisiteRequired.AuthRequired();

            private AuthRequired() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired$BankVerificationRequired;", "Lcom/zettle/sdk/PaymentFailureReason$PrerequisiteRequired;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BankVerificationRequired extends com.zettle.sdk.PaymentFailureReason.PrerequisiteRequired {
            public static final com.zettle.sdk.PaymentFailureReason.PrerequisiteRequired.BankVerificationRequired INSTANCE = new com.zettle.sdk.PaymentFailureReason.PrerequisiteRequired.BankVerificationRequired();

            private BankVerificationRequired() {
                super(null);
            }
        }

        public /* synthetic */ PrerequisiteRequired(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentFailureReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
