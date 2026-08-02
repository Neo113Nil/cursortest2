package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/core/auth/Merchant;", "", "<init>", "()V", "Initializing", "LoggedIn", "LoggedOut", "Lcom/zettle/sdk/core/auth/Merchant$Initializing;", "Lcom/zettle/sdk/core/auth/Merchant$LoggedIn;", "Lcom/zettle/sdk/core/auth/Merchant$LoggedOut;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class Merchant {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/Merchant$Initializing;", "Lcom/zettle/sdk/core/auth/Merchant;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initializing extends com.zettle.sdk.core.auth.Merchant {
        public static final com.zettle.sdk.core.auth.Merchant.Initializing INSTANCE = new com.zettle.sdk.core.auth.Merchant.Initializing();

        private Initializing() {
            super(null);
        }
    }

    private Merchant() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/Merchant$LoggedOut;", "Lcom/zettle/sdk/core/auth/Merchant;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LoggedOut extends com.zettle.sdk.core.auth.Merchant {
        public static final com.zettle.sdk.core.auth.Merchant.LoggedOut INSTANCE = new com.zettle.sdk.core.auth.Merchant.LoggedOut();

        private LoggedOut() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/auth/Merchant$LoggedIn;", "Lcom/zettle/sdk/core/auth/Merchant;", "", "userId", "organizationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/core/auth/Merchant$LoggedIn;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOrganizationId", "getUserId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoggedIn extends com.zettle.sdk.core.auth.Merchant {
        private final java.lang.String organizationId;
        private final java.lang.String userId;

        public LoggedIn(java.lang.String str, java.lang.String str2) {
            super(null);
            this.userId = str;
            this.organizationId = str2;
        }

        public final java.lang.String getOrganizationId() {
            return this.organizationId;
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.userId;
            java.lang.String str2 = this.organizationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoggedIn(userId=");
            sb.append(str);
            sb.append(", organizationId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.userId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.organizationId;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.core.auth.Merchant.LoggedIn)) {
                return false;
            }
            com.zettle.sdk.core.auth.Merchant.LoggedIn loggedIn = (com.zettle.sdk.core.auth.Merchant.LoggedIn) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, loggedIn.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.organizationId, loggedIn.organizationId);
        }

        public final com.zettle.sdk.core.auth.Merchant.LoggedIn copy(java.lang.String userId, java.lang.String organizationId) {
            return new com.zettle.sdk.core.auth.Merchant.LoggedIn(userId, organizationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOrganizationId() {
            return this.organizationId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public static /* synthetic */ com.zettle.sdk.core.auth.Merchant.LoggedIn copy$default(com.zettle.sdk.core.auth.Merchant.LoggedIn loggedIn, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loggedIn.userId;
            }
            if ((i & 2) != 0) {
                str2 = loggedIn.organizationId;
            }
            return loggedIn.copy(str, str2);
        }
    }

    public /* synthetic */ Merchant(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
