package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/Success;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "firstPartyUserAccessToken", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/model/Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "getFirstPartyUserAccessToken", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Success extends com.paypal.oslo.feature.identity.login.domain.model.LoginResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken firstPartyUserAccessToken;
    private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Success(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.firstPartyUserAccessToken = userAccessToken;
        this.postAuthOperations = list;
    }

    public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getFirstPartyUserAccessToken() {
        return this.firstPartyUserAccessToken;
    }

    public /* synthetic */ Success(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccessToken, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
        return this.postAuthOperations;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.firstPartyUserAccessToken;
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(firstPartyUserAccessToken=");
        sb.append(userAccessToken);
        sb.append(", postAuthOperations=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.firstPartyUserAccessToken.hashCode() * 31) + this.postAuthOperations.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.Success)) {
            return false;
        }
        com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.firstPartyUserAccessToken, success.firstPartyUserAccessToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, success.postAuthOperations);
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.Success copy(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken firstPartyUserAccessToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyUserAccessToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
        return new com.paypal.oslo.feature.identity.login.domain.model.Success(firstPartyUserAccessToken, postAuthOperations);
    }

    public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
        return this.postAuthOperations;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getFirstPartyUserAccessToken() {
        return this.firstPartyUserAccessToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.Success copy$default(com.paypal.oslo.feature.identity.login.domain.model.Success success, com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userAccessToken = success.firstPartyUserAccessToken;
        }
        if ((i & 2) != 0) {
            list = success.postAuthOperations;
        }
        return success.copy(userAccessToken, list);
    }
}
