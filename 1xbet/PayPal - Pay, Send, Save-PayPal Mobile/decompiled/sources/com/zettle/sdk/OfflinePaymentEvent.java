package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentEvent;", "", "", "getAuthorizationRequestId", "()Ljava/lang/String;", "authorizationRequestId", "ForwardFailure", com.google.common.net.HttpHeaders.FORWARDED, "Stored", "Lcom/zettle/sdk/OfflinePaymentEvent$ForwardFailure;", "Lcom/zettle/sdk/OfflinePaymentEvent$Forwarded;", "Lcom/zettle/sdk/OfflinePaymentEvent$Stored;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface OfflinePaymentEvent {
    java.lang.String getAuthorizationRequestId();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentEvent$Stored;", "Lcom/zettle/sdk/OfflinePaymentEvent;", "", "authorizationRequestId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/OfflinePaymentEvent$Stored;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthorizationRequestId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Stored implements com.zettle.sdk.OfflinePaymentEvent {
        private final java.lang.String authorizationRequestId;

        public Stored(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.authorizationRequestId = str;
        }

        @Override // com.zettle.sdk.OfflinePaymentEvent
        public final java.lang.String getAuthorizationRequestId() {
            return this.authorizationRequestId;
        }

        public final java.lang.String toString() {
            java.lang.String authorizationRequestId = getAuthorizationRequestId();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Stored(authorizationRequestId=");
            sb.append(authorizationRequestId);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getAuthorizationRequestId().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.OfflinePaymentEvent.Stored) && kotlin.jvm.internal.Intrinsics.areEqual(getAuthorizationRequestId(), ((com.zettle.sdk.OfflinePaymentEvent.Stored) other).getAuthorizationRequestId());
        }

        public final com.zettle.sdk.OfflinePaymentEvent.Stored copy(java.lang.String authorizationRequestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationRequestId, "");
            return new com.zettle.sdk.OfflinePaymentEvent.Stored(authorizationRequestId);
        }

        public final java.lang.String component1() {
            return getAuthorizationRequestId();
        }

        public static /* synthetic */ com.zettle.sdk.OfflinePaymentEvent.Stored copy$default(com.zettle.sdk.OfflinePaymentEvent.Stored stored, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stored.getAuthorizationRequestId();
            }
            return stored.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentEvent$Forwarded;", "Lcom/zettle/sdk/OfflinePaymentEvent;", "", "authorizationRequestId", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/OfflinePaymentEvent$Forwarded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthorizationRequestId", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Forwarded implements com.zettle.sdk.OfflinePaymentEvent {
        private final java.lang.String authorizationRequestId;
        private final java.lang.String traceId;

        public Forwarded(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.authorizationRequestId = str;
            this.traceId = str2;
        }

        @Override // com.zettle.sdk.OfflinePaymentEvent
        public final java.lang.String getAuthorizationRequestId() {
            return this.authorizationRequestId;
        }

        public final java.lang.String getTraceId() {
            return this.traceId;
        }

        public final java.lang.String toString() {
            java.lang.String authorizationRequestId = getAuthorizationRequestId();
            java.lang.String str = this.traceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Forwarded(authorizationRequestId=");
            sb.append(authorizationRequestId);
            sb.append(", traceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = getAuthorizationRequestId().hashCode();
            java.lang.String str = this.traceId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.OfflinePaymentEvent.Forwarded)) {
                return false;
            }
            com.zettle.sdk.OfflinePaymentEvent.Forwarded forwarded = (com.zettle.sdk.OfflinePaymentEvent.Forwarded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(getAuthorizationRequestId(), forwarded.getAuthorizationRequestId()) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, forwarded.traceId);
        }

        public final com.zettle.sdk.OfflinePaymentEvent.Forwarded copy(java.lang.String authorizationRequestId, java.lang.String traceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationRequestId, "");
            return new com.zettle.sdk.OfflinePaymentEvent.Forwarded(authorizationRequestId, traceId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTraceId() {
            return this.traceId;
        }

        public final java.lang.String component1() {
            return getAuthorizationRequestId();
        }

        public static /* synthetic */ com.zettle.sdk.OfflinePaymentEvent.Forwarded copy$default(com.zettle.sdk.OfflinePaymentEvent.Forwarded forwarded, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = forwarded.getAuthorizationRequestId();
            }
            if ((i & 2) != 0) {
                str2 = forwarded.traceId;
            }
            return forwarded.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentEvent$ForwardFailure;", "Lcom/zettle/sdk/OfflinePaymentEvent;", "", "authorizationRequestId", "traceId", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/OfflinePaymentForwardFailure;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/OfflinePaymentForwardFailure;)Lcom/zettle/sdk/OfflinePaymentEvent$ForwardFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthorizationRequestId", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "getFailure", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ForwardFailure implements com.zettle.sdk.OfflinePaymentEvent {
        private final java.lang.String authorizationRequestId;
        private final com.zettle.sdk.OfflinePaymentForwardFailure failure;
        private final java.lang.String traceId;

        public ForwardFailure(java.lang.String str, java.lang.String str2, com.zettle.sdk.OfflinePaymentForwardFailure offlinePaymentForwardFailure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlinePaymentForwardFailure, "");
            this.authorizationRequestId = str;
            this.traceId = str2;
            this.failure = offlinePaymentForwardFailure;
        }

        @Override // com.zettle.sdk.OfflinePaymentEvent
        public final java.lang.String getAuthorizationRequestId() {
            return this.authorizationRequestId;
        }

        public final java.lang.String getTraceId() {
            return this.traceId;
        }

        public final com.zettle.sdk.OfflinePaymentForwardFailure getFailure() {
            return this.failure;
        }

        public final java.lang.String toString() {
            java.lang.String authorizationRequestId = getAuthorizationRequestId();
            java.lang.String str = this.traceId;
            com.zettle.sdk.OfflinePaymentForwardFailure offlinePaymentForwardFailure = this.failure;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ForwardFailure(authorizationRequestId=");
            sb.append(authorizationRequestId);
            sb.append(", traceId=");
            sb.append(str);
            sb.append(", failure=");
            sb.append(offlinePaymentForwardFailure);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = getAuthorizationRequestId().hashCode();
            java.lang.String str = this.traceId;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.failure.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.OfflinePaymentEvent.ForwardFailure)) {
                return false;
            }
            com.zettle.sdk.OfflinePaymentEvent.ForwardFailure forwardFailure = (com.zettle.sdk.OfflinePaymentEvent.ForwardFailure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(getAuthorizationRequestId(), forwardFailure.getAuthorizationRequestId()) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, forwardFailure.traceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.failure, forwardFailure.failure);
        }

        public final com.zettle.sdk.OfflinePaymentEvent.ForwardFailure copy(java.lang.String authorizationRequestId, java.lang.String traceId, com.zettle.sdk.OfflinePaymentForwardFailure failure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationRequestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
            return new com.zettle.sdk.OfflinePaymentEvent.ForwardFailure(authorizationRequestId, traceId, failure);
        }

        /* renamed from: component3, reason: from getter */
        public final com.zettle.sdk.OfflinePaymentForwardFailure getFailure() {
            return this.failure;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTraceId() {
            return this.traceId;
        }

        public final java.lang.String component1() {
            return getAuthorizationRequestId();
        }

        public static /* synthetic */ com.zettle.sdk.OfflinePaymentEvent.ForwardFailure copy$default(com.zettle.sdk.OfflinePaymentEvent.ForwardFailure forwardFailure, java.lang.String str, java.lang.String str2, com.zettle.sdk.OfflinePaymentForwardFailure offlinePaymentForwardFailure, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = forwardFailure.getAuthorizationRequestId();
            }
            if ((i & 2) != 0) {
                str2 = forwardFailure.traceId;
            }
            if ((i & 4) != 0) {
                offlinePaymentForwardFailure = forwardFailure.failure;
            }
            return forwardFailure.copy(str, str2, offlinePaymentForwardFailure);
        }
    }
}
