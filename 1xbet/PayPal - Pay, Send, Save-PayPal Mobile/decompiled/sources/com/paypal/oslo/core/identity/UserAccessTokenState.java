package com.paypal.oslo.core.identity;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Exists", "Lcom/paypal/oslo/core/identity/UserAccessTokenState$Exists;", "Lcom/paypal/oslo/core/identity/UserAccessTokenState$None;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UserAccessTokenState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/identity/UserAccessTokenState$None;", "Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.core.identity.UserAccessTokenState {
        public static final com.paypal.oslo.core.identity.UserAccessTokenState.None INSTANCE = new com.paypal.oslo.core.identity.UserAccessTokenState.None();

        public final int hashCode() {
            return -1561747867;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.identity.UserAccessTokenState.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/identity/UserAccessTokenState$Exists;", "Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "", "payerId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/identity/UserAccessTokenState$Exists;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Exists implements com.paypal.oslo.core.identity.UserAccessTokenState {
        private final java.lang.String payerId;

        public Exists(java.lang.String str) {
            this.payerId = str;
        }

        public /* synthetic */ Exists(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getPayerId() {
            return this.payerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.payerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exists(payerId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.payerId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.identity.UserAccessTokenState.Exists) && kotlin.jvm.internal.Intrinsics.areEqual(this.payerId, ((com.paypal.oslo.core.identity.UserAccessTokenState.Exists) other).payerId);
        }

        public final com.paypal.oslo.core.identity.UserAccessTokenState.Exists copy(java.lang.String payerId) {
            return new com.paypal.oslo.core.identity.UserAccessTokenState.Exists(payerId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPayerId() {
            return this.payerId;
        }

        public static /* synthetic */ com.paypal.oslo.core.identity.UserAccessTokenState.Exists copy$default(com.paypal.oslo.core.identity.UserAccessTokenState.Exists exists, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = exists.payerId;
            }
            return exists.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Exists() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
