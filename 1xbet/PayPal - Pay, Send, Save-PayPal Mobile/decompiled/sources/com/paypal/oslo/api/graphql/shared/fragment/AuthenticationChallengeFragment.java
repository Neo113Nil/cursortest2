package com.paypal.oslo.api.graphql.shared.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u001e\u001f !\"#$B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "correlationId", "", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Challenge;", "challenges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getCorrelationId$annotations", "()V", "Ljava/util/List;", "getChallenges", "Challenge", "OnGenericAuthenticationChallenge", "OnOneTimePasswordAuthenticationChallenge", "OnOneTimePasswordGenerateCodeAuthenticationChallenge", "Phone", "OnPasskeyCredentialRequestOptionAuthenticationChallenge", "AllowedCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AuthenticationChallengeFragment implements com.apollographql.apollo.api.Fragment.Data {
    private final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> challenges;
    private final java.lang.String correlationId;

    @kotlin.Deprecated(message = "Use the top-level GraphQL response `extensions.correlationId` instead.")
    public static /* synthetic */ void getCorrelationId$annotations() {
    }

    public AuthenticationChallengeFragment(java.lang.String str, java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.correlationId = str;
        this.challenges = list;
    }

    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> getChallenges() {
        return this.challenges;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Challenge;", "", "", "__typename", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "onGenericAuthenticationChallenge", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "onOneTimePasswordAuthenticationChallenge", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "onOneTimePasswordGenerateCodeAuthenticationChallenge", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "onPasskeyCredentialRequestOptionAuthenticationChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "component3", "()Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "component4", "()Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "component5", "()Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Challenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "getOnGenericAuthenticationChallenge", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "getOnOneTimePasswordAuthenticationChallenge", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "getOnOneTimePasswordGenerateCodeAuthenticationChallenge", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "getOnPasskeyCredentialRequestOptionAuthenticationChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Challenge {
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge;
        private final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge;
        private final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge;
        private final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge;

        public Challenge(java.lang.String str, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onGenericAuthenticationChallenge = onGenericAuthenticationChallenge;
            this.onOneTimePasswordAuthenticationChallenge = onOneTimePasswordAuthenticationChallenge;
            this.onOneTimePasswordGenerateCodeAuthenticationChallenge = onOneTimePasswordGenerateCodeAuthenticationChallenge;
            this.onPasskeyCredentialRequestOptionAuthenticationChallenge = onPasskeyCredentialRequestOptionAuthenticationChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge getOnGenericAuthenticationChallenge() {
            return this.onGenericAuthenticationChallenge;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge getOnOneTimePasswordAuthenticationChallenge() {
            return this.onOneTimePasswordAuthenticationChallenge;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge getOnOneTimePasswordGenerateCodeAuthenticationChallenge() {
            return this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge getOnPasskeyCredentialRequestOptionAuthenticationChallenge() {
            return this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = this.onGenericAuthenticationChallenge;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge = this.onOneTimePasswordAuthenticationChallenge;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Challenge(__typename=");
            sb.append(str);
            sb.append(", onGenericAuthenticationChallenge=");
            sb.append(onGenericAuthenticationChallenge);
            sb.append(", onOneTimePasswordAuthenticationChallenge=");
            sb.append(onOneTimePasswordAuthenticationChallenge);
            sb.append(", onOneTimePasswordGenerateCodeAuthenticationChallenge=");
            sb.append(onOneTimePasswordGenerateCodeAuthenticationChallenge);
            sb.append(", onPasskeyCredentialRequestOptionAuthenticationChallenge=");
            sb.append(onPasskeyCredentialRequestOptionAuthenticationChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = this.onGenericAuthenticationChallenge;
            int hashCode2 = onGenericAuthenticationChallenge == null ? 0 : onGenericAuthenticationChallenge.hashCode();
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge = this.onOneTimePasswordAuthenticationChallenge;
            int hashCode3 = onOneTimePasswordAuthenticationChallenge == null ? 0 : onOneTimePasswordAuthenticationChallenge.hashCode();
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
            int hashCode4 = onOneTimePasswordGenerateCodeAuthenticationChallenge == null ? 0 : onOneTimePasswordGenerateCodeAuthenticationChallenge.hashCode();
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (onPasskeyCredentialRequestOptionAuthenticationChallenge != null ? onPasskeyCredentialRequestOptionAuthenticationChallenge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge)) {
                return false;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge challenge = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, challenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onGenericAuthenticationChallenge, challenge.onGenericAuthenticationChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOneTimePasswordAuthenticationChallenge, challenge.onOneTimePasswordAuthenticationChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOneTimePasswordGenerateCodeAuthenticationChallenge, challenge.onOneTimePasswordGenerateCodeAuthenticationChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPasskeyCredentialRequestOptionAuthenticationChallenge, challenge.onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge copy(java.lang.String __typename, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge(__typename, onGenericAuthenticationChallenge, onOneTimePasswordAuthenticationChallenge, onOneTimePasswordGenerateCodeAuthenticationChallenge, onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge getOnPasskeyCredentialRequestOptionAuthenticationChallenge() {
            return this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge getOnOneTimePasswordGenerateCodeAuthenticationChallenge() {
            return this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge getOnOneTimePasswordAuthenticationChallenge() {
            return this.onOneTimePasswordAuthenticationChallenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge getOnGenericAuthenticationChallenge() {
            return this.onGenericAuthenticationChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge challenge, java.lang.String str, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = challenge.__typename;
            }
            if ((i & 2) != 0) {
                onGenericAuthenticationChallenge = challenge.onGenericAuthenticationChallenge;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge2 = onGenericAuthenticationChallenge;
            if ((i & 4) != 0) {
                onOneTimePasswordAuthenticationChallenge = challenge.onOneTimePasswordAuthenticationChallenge;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge2 = onOneTimePasswordAuthenticationChallenge;
            if ((i & 8) != 0) {
                onOneTimePasswordGenerateCodeAuthenticationChallenge = challenge.onOneTimePasswordGenerateCodeAuthenticationChallenge;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge2 = onOneTimePasswordGenerateCodeAuthenticationChallenge;
            if ((i & 16) != 0) {
                onPasskeyCredentialRequestOptionAuthenticationChallenge = challenge.onPasskeyCredentialRequestOptionAuthenticationChallenge;
            }
            return challenge.copy(str, onGenericAuthenticationChallenge2, onOneTimePasswordAuthenticationChallenge2, onOneTimePasswordGenerateCodeAuthenticationChallenge2, onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "", "", "contextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnGenericAuthenticationChallenge {
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;

        public OnGenericAuthenticationChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            this.contextId = str;
            this.challengeType = authenticationChallengeType;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contextId;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnGenericAuthenticationChallenge(contextId=");
            sb.append(str);
            sb.append(", challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.contextId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.challengeType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onGenericAuthenticationChallenge.contextId) && this.challengeType == onGenericAuthenticationChallenge.challengeType;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge copy(java.lang.String contextId, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge(contextId, challengeType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onGenericAuthenticationChallenge.contextId;
            }
            if ((i & 2) != 0) {
                authenticationChallengeType = onGenericAuthenticationChallenge.challengeType;
            }
            return onGenericAuthenticationChallenge.copy(str, authenticationChallengeType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "", "", "contextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", "nonce", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOneTimePasswordAuthenticationChallenge {
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;
        private final java.lang.String nonce;

        public OnOneTimePasswordAuthenticationChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.contextId = str;
            this.challengeType = authenticationChallengeType;
            this.nonce = str2;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contextId;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.lang.String str2 = this.nonce;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOneTimePasswordAuthenticationChallenge(contextId=");
            sb.append(str);
            sb.append(", challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.contextId;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.challengeType.hashCode()) * 31) + this.nonce.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onOneTimePasswordAuthenticationChallenge.contextId) && this.challengeType == onOneTimePasswordAuthenticationChallenge.challengeType && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onOneTimePasswordAuthenticationChallenge.nonce);
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge copy(java.lang.String contextId, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge(contextId, challengeType, nonce);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onOneTimePasswordAuthenticationChallenge.contextId;
            }
            if ((i & 2) != 0) {
                authenticationChallengeType = onOneTimePasswordAuthenticationChallenge.challengeType;
            }
            if ((i & 4) != 0) {
                str2 = onOneTimePasswordAuthenticationChallenge.nonce;
            }
            return onOneTimePasswordAuthenticationChallenge.copy(str, authenticationChallengeType, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "", "", "contextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", "", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Phone;", "phones", "nonce", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType", "Ljava/util/List;", "getPhones", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOneTimePasswordGenerateCodeAuthenticationChallenge {
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;
        private final java.lang.String nonce;
        private final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> phones;

        public OnOneTimePasswordGenerateCodeAuthenticationChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> list, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.contextId = str;
            this.challengeType = authenticationChallengeType;
            this.phones = list;
            this.nonce = str2;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> getPhones() {
            return this.phones;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contextId;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> list = this.phones;
            java.lang.String str2 = this.nonce;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOneTimePasswordGenerateCodeAuthenticationChallenge(contextId=");
            sb.append(str);
            sb.append(", challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(", phones=");
            sb.append(list);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.contextId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.challengeType.hashCode()) * 31) + this.phones.hashCode()) * 31) + this.nonce.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onOneTimePasswordGenerateCodeAuthenticationChallenge.contextId) && this.challengeType == onOneTimePasswordGenerateCodeAuthenticationChallenge.challengeType && kotlin.jvm.internal.Intrinsics.areEqual(this.phones, onOneTimePasswordGenerateCodeAuthenticationChallenge.phones) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onOneTimePasswordGenerateCodeAuthenticationChallenge.nonce);
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge copy(java.lang.String contextId, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType, java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> phones, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phones, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge(contextId, challengeType, phones, nonce);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> component3() {
            return this.phones;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onOneTimePasswordGenerateCodeAuthenticationChallenge.contextId;
            }
            if ((i & 2) != 0) {
                authenticationChallengeType = onOneTimePasswordGenerateCodeAuthenticationChallenge.challengeType;
            }
            if ((i & 4) != 0) {
                list = onOneTimePasswordGenerateCodeAuthenticationChallenge.phones;
            }
            if ((i & 8) != 0) {
                str2 = onOneTimePasswordGenerateCodeAuthenticationChallenge.nonce;
            }
            return onOneTimePasswordGenerateCodeAuthenticationChallenge.copy(str, authenticationChallengeType, list, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Phone;", "", "", "maskedPhoneNumber", "phoneChallengeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMaskedPhoneNumber", "getPhoneChallengeId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone {
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String phoneChallengeId;

        public Phone(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.maskedPhoneNumber = str;
            this.phoneChallengeId = str2;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String getPhoneChallengeId() {
            return this.phoneChallengeId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.maskedPhoneNumber;
            java.lang.String str2 = this.phoneChallengeId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(maskedPhoneNumber=");
            sb.append(str);
            sb.append(", phoneChallengeId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.maskedPhoneNumber.hashCode() * 31) + this.phoneChallengeId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone)) {
                return false;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone phone = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, phone.maskedPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneChallengeId, phone.phoneChallengeId);
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone copy(java.lang.String maskedPhoneNumber, java.lang.String phoneChallengeId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneChallengeId, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone(maskedPhoneNumber, phoneChallengeId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPhoneChallengeId() {
            return this.phoneChallengeId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone phone, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phone.maskedPhoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = phone.phoneChallengeId;
            }
            return phone.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0010R \u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0010R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "", "", "contextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "relayingPartyId", "", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$AllowedCredential;", "allowedCredentials", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "userVerification", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType", "getChallenge", "getRelayingPartyId", "getRelayingPartyId$annotations", "()V", "Ljava/util/List;", "getAllowedCredentials", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "getUserVerification"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPasskeyCredentialRequestOptionAuthenticationChallenge {
        private final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> allowedCredentials;
        private final java.lang.String challenge;
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;
        private final java.lang.String relayingPartyId;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification;

        @kotlin.Deprecated(message = "Use 'relyingPartyId' field instead.")
        public static /* synthetic */ void getRelayingPartyId$annotations() {
        }

        public OnPasskeyCredentialRequestOptionAuthenticationChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> list, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyUserVerification, "");
            this.contextId = str;
            this.challengeType = authenticationChallengeType;
            this.challenge = str2;
            this.relayingPartyId = str3;
            this.allowedCredentials = list;
            this.userVerification = passkeyUserVerification;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.lang.String getChallenge() {
            return this.challenge;
        }

        public final java.lang.String getRelayingPartyId() {
            return this.relayingPartyId;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> getAllowedCredentials() {
            return this.allowedCredentials;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification getUserVerification() {
            return this.userVerification;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contextId;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.lang.String str2 = this.challenge;
            java.lang.String str3 = this.relayingPartyId;
            java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> list = this.allowedCredentials;
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification = this.userVerification;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPasskeyCredentialRequestOptionAuthenticationChallenge(contextId=");
            sb.append(str);
            sb.append(", challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(", challenge=");
            sb.append(str2);
            sb.append(", relayingPartyId=");
            sb.append(str3);
            sb.append(", allowedCredentials=");
            sb.append(list);
            sb.append(", userVerification=");
            sb.append(passkeyUserVerification);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.contextId;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.challengeType.hashCode()) * 31) + this.challenge.hashCode()) * 31) + this.relayingPartyId.hashCode()) * 31) + this.allowedCredentials.hashCode()) * 31) + this.userVerification.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onPasskeyCredentialRequestOptionAuthenticationChallenge.contextId) && this.challengeType == onPasskeyCredentialRequestOptionAuthenticationChallenge.challengeType && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, onPasskeyCredentialRequestOptionAuthenticationChallenge.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.relayingPartyId, onPasskeyCredentialRequestOptionAuthenticationChallenge.relayingPartyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedCredentials, onPasskeyCredentialRequestOptionAuthenticationChallenge.allowedCredentials) && this.userVerification == onPasskeyCredentialRequestOptionAuthenticationChallenge.userVerification;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge copy(java.lang.String contextId, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType, java.lang.String challenge, java.lang.String relayingPartyId, java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> allowedCredentials, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relayingPartyId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedCredentials, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userVerification, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge(contextId, challengeType, challenge, relayingPartyId, allowedCredentials, userVerification);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification getUserVerification() {
            return this.userVerification;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> component5() {
            return this.allowedCredentials;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getRelayingPartyId() {
            return this.relayingPartyId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getChallenge() {
            return this.challenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPasskeyCredentialRequestOptionAuthenticationChallenge.contextId;
            }
            if ((i & 2) != 0) {
                authenticationChallengeType = onPasskeyCredentialRequestOptionAuthenticationChallenge.challengeType;
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType2 = authenticationChallengeType;
            if ((i & 4) != 0) {
                str2 = onPasskeyCredentialRequestOptionAuthenticationChallenge.challenge;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = onPasskeyCredentialRequestOptionAuthenticationChallenge.relayingPartyId;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                list = onPasskeyCredentialRequestOptionAuthenticationChallenge.allowedCredentials;
            }
            java.util.List list2 = list;
            if ((i & 32) != 0) {
                passkeyUserVerification = onPasskeyCredentialRequestOptionAuthenticationChallenge.userVerification;
            }
            return onPasskeyCredentialRequestOptionAuthenticationChallenge.copy(str, authenticationChallengeType2, str4, str5, list2, passkeyUserVerification);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$AllowedCredential;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationTransport;", "transports", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$AllowedCredential;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTransports"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AllowedCredential {
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> transports;

        /* JADX WARN: Multi-variable type inference failed */
        public AllowedCredential(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.transports = list;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> getTransports() {
            return this.transports;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> list = this.transports;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AllowedCredential(transports=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transports.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.transports, ((com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential) other).transports);
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> transports) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transports, "");
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential(transports);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> component1() {
            return this.transports;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential allowedCredential, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = allowedCredential.transports;
            }
            return allowedCredential.copy(list);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.correlationId;
        java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> list = this.challenges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationChallengeFragment(correlationId=");
        sb.append(str);
        sb.append(", challenges=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.correlationId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.challenges.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment)) {
            return false;
        }
        com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, authenticationChallengeFragment.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, authenticationChallengeFragment.challenges);
    }

    public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment copy(java.lang.String correlationId, java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> challenges) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
        return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment(correlationId, challenges);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> component2() {
        return this.challenges;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationChallengeFragment.correlationId;
        }
        if ((i & 2) != 0) {
            list = authenticationChallengeFragment.challenges;
        }
        return authenticationChallengeFragment.copy(str, list);
    }
}
