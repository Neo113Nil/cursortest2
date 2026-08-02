package com.paypal.oslo.feature.identity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "challengeMethod", "stepUpNonce", "stepUpPartialToken", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getChallengeMethod", "getStepUpNonce", "getStepUpPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AuthenticatorAppChallengeFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod;
    private final java.lang.String id;
    private final java.lang.String stepUpNonce;
    private final java.lang.String stepUpPartialToken;

    public AuthenticatorAppChallengeFragment(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
        this.id = str;
        this.challengeMethod = stepUpIdentityChallengeMethod;
        this.stepUpNonce = str2;
        this.stepUpPartialToken = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
        return this.challengeMethod;
    }

    public final java.lang.String getStepUpNonce() {
        return this.stepUpNonce;
    }

    public final java.lang.String getStepUpPartialToken() {
        return this.stepUpPartialToken;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.challengeMethod;
        java.lang.String str2 = this.stepUpNonce;
        java.lang.String str3 = this.stepUpPartialToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticatorAppChallengeFragment(id=");
        sb.append(str);
        sb.append(", challengeMethod=");
        sb.append(stepUpIdentityChallengeMethod);
        sb.append(", stepUpNonce=");
        sb.append(str2);
        sb.append(", stepUpPartialToken=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.challengeMethod.hashCode();
        java.lang.String str = this.stepUpNonce;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.stepUpPartialToken;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment)) {
            return false;
        }
        com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment = (com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, authenticatorAppChallengeFragment.id) && this.challengeMethod == authenticatorAppChallengeFragment.challengeMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpNonce, authenticatorAppChallengeFragment.stepUpNonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpPartialToken, authenticatorAppChallengeFragment.stepUpPartialToken);
    }

    public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod, java.lang.String stepUpNonce, java.lang.String stepUpPartialToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeMethod, "");
        return new com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment(id, challengeMethod, stepUpNonce, stepUpPartialToken);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getStepUpPartialToken() {
        return this.stepUpPartialToken;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStepUpNonce() {
        return this.stepUpNonce;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
        return this.challengeMethod;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment copy$default(com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticatorAppChallengeFragment.id;
        }
        if ((i & 2) != 0) {
            stepUpIdentityChallengeMethod = authenticatorAppChallengeFragment.challengeMethod;
        }
        if ((i & 4) != 0) {
            str2 = authenticatorAppChallengeFragment.stepUpNonce;
        }
        if ((i & 8) != 0) {
            str3 = authenticatorAppChallengeFragment.stepUpPartialToken;
        }
        return authenticatorAppChallengeFragment.copy(str, stepUpIdentityChallengeMethod, str2, str3);
    }
}
