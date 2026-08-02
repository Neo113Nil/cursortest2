package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b)*+,-./(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/Object;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getToken", "Companion", "Data", "PublicCredentialMetadataByToken", "OnboardingEmailStatus", "TokenDetails", "Name", "Actor", "Challenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CheckGoogleTokenQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a5f046aa3170d09abe9163ac1e70b7369a5c38c593ced18e6e896b1d8a622114";
    public static final java.lang.String OPERATION_NAME = "CheckGoogleToken";
    private final java.lang.Object token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Companion(null);
    public static final int $stable = 8;

    public CheckGoogleTokenQuery(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.token = obj;
    }

    public final java.lang.Object getToken() {
        return this.token;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.onboarding.graphql.adapter.CheckGoogleTokenQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.CheckGoogleTokenQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.CheckGoogleTokenQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;", "publicCredentialMetadataByToken", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;", "getPublicCredentialMetadataByToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken;

        public Data(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredentialMetadataByToken, "");
            this.publicCredentialMetadataByToken = publicCredentialMetadataByToken;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken getPublicCredentialMetadataByToken() {
            return this.publicCredentialMetadataByToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken = this.publicCredentialMetadataByToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(publicCredentialMetadataByToken=");
            sb.append(publicCredentialMetadataByToken);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredentialMetadataByToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredentialMetadataByToken, ((com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data) other).publicCredentialMetadataByToken);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data copy(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredentialMetadataByToken, "");
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data(publicCredentialMetadataByToken);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken getPublicCredentialMetadataByToken() {
            return this.publicCredentialMetadataByToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data data, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicCredentialMetadataByToken = data.publicCredentialMetadataByToken;
            }
            return data.copy(publicCredentialMetadataByToken);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;", "", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;", "onboardingEmailStatus", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;", "tokenDetails", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;", "actor", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;", "component2", "()Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;", "component3", "()Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;", "getOnboardingEmailStatus", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;", "getTokenDetails", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;", "getActor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PublicCredentialMetadataByToken {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor;
        private final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus;
        private final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails;

        public PublicCredentialMetadataByToken(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor) {
            this.onboardingEmailStatus = onboardingEmailStatus;
            this.tokenDetails = tokenDetails;
            this.actor = actor;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus getOnboardingEmailStatus() {
            return this.onboardingEmailStatus;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails getTokenDetails() {
            return this.tokenDetails;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor getActor() {
            return this.actor;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus = this.onboardingEmailStatus;
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails = this.tokenDetails;
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor = this.actor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicCredentialMetadataByToken(onboardingEmailStatus=");
            sb.append(onboardingEmailStatus);
            sb.append(", tokenDetails=");
            sb.append(tokenDetails);
            sb.append(", actor=");
            sb.append(actor);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus = this.onboardingEmailStatus;
            int hashCode = onboardingEmailStatus == null ? 0 : onboardingEmailStatus.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails = this.tokenDetails;
            int hashCode2 = tokenDetails == null ? 0 : tokenDetails.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor = this.actor;
            return (((hashCode * 31) + hashCode2) * 31) + (actor != null ? actor.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingEmailStatus, publicCredentialMetadataByToken.onboardingEmailStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenDetails, publicCredentialMetadataByToken.tokenDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.actor, publicCredentialMetadataByToken.actor);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken copy(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor) {
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken(onboardingEmailStatus, tokenDetails, actor);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor getActor() {
            return this.actor;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails getTokenDetails() {
            return this.tokenDetails;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus getOnboardingEmailStatus() {
            return this.onboardingEmailStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingEmailStatus = publicCredentialMetadataByToken.onboardingEmailStatus;
            }
            if ((i & 2) != 0) {
                tokenDetails = publicCredentialMetadataByToken.tokenDetails;
            }
            if ((i & 4) != 0) {
                actor = publicCredentialMetadataByToken.actor;
            }
            return publicCredentialMetadataByToken.copy(onboardingEmailStatus, tokenDetails, actor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;", "", "Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "validity", "", "suggestions", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$OnboardingEmailStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "getValidity", "Ljava/util/List;", "getSuggestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingEmailStatus {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Object> suggestions;
        private final com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus validity;

        public OnboardingEmailStatus(com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus, java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidityStatus, "");
            this.validity = emailValidityStatus;
            this.suggestions = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus getValidity() {
            return this.validity;
        }

        public final java.util.List<java.lang.Object> getSuggestions() {
            return this.suggestions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus = this.validity;
            java.util.List<java.lang.Object> list = this.suggestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardingEmailStatus(validity=");
            sb.append(emailValidityStatus);
            sb.append(", suggestions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.validity.hashCode();
            java.util.List<java.lang.Object> list = this.suggestions;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus) other;
            return this.validity == onboardingEmailStatus.validity && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestions, onboardingEmailStatus.suggestions);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus copy(com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus validity, java.util.List<? extends java.lang.Object> suggestions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validity, "");
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus(validity, suggestions);
        }

        public final java.util.List<java.lang.Object> component2() {
            return this.suggestions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus getValidity() {
            return this.validity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailValidityStatus = onboardingEmailStatus.validity;
            }
            if ((i & 2) != 0) {
                list = onboardingEmailStatus.suggestions;
            }
            return onboardingEmailStatus.copy(emailValidityStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;", "", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;", "name", "email", "profilePicture", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$TokenDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;", "getName", "Ljava/lang/Object;", "getEmail", "getProfilePicture"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenDetails {
        public static final int $stable = 8;
        private final java.lang.Object email;
        private final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name;
        private final java.lang.Object profilePicture;

        public TokenDetails(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2, java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.name = name2;
            this.email = obj;
            this.profilePicture = obj2;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name getName() {
            return this.name;
        }

        public final java.lang.Object getEmail() {
            return this.email;
        }

        public final java.lang.Object getProfilePicture() {
            return this.profilePicture;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2 = this.name;
            java.lang.Object obj = this.email;
            java.lang.Object obj2 = this.profilePicture;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenDetails(name=");
            sb.append(name2);
            sb.append(", email=");
            sb.append(obj);
            sb.append(", profilePicture=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = this.email.hashCode();
            java.lang.Object obj = this.profilePicture;
            return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, tokenDetails.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, tokenDetails.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePicture, tokenDetails.profilePicture);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails copy(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2, java.lang.Object email, java.lang.Object profilePicture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails(name2, email, profilePicture);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getProfilePicture() {
            return this.profilePicture;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                name2 = tokenDetails.name;
            }
            if ((i & 2) != 0) {
                obj = tokenDetails.email;
            }
            if ((i & 4) != 0) {
                obj2 = tokenDetails.profilePicture;
            }
            return tokenDetails.copy(name2, obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;", "", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2) {
            this.givenName = str;
            this.surname = str2;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.surname;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2 = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name copy(java.lang.String givenName, java.lang.String surname) {
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name(givenName, surname);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.givenName;
            }
            if ((i & 2) != 0) {
                str2 = name2.surname;
            }
            return name2.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;", "", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Actor;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Actor {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge;

        public Actor(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge) {
            this.challenge = challenge;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Actor(challenge=");
            sb.append(challenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge = this.challenge;
            if (challenge == null) {
                return 0;
            }
            return challenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor) other).challenge);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor copy(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge) {
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor, com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = actor.challenge;
            }
            return actor.copy(challenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;", "", "", "__typename", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "authenticationChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;)Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Challenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "getAuthenticationChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Challenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment;

        public Challenge(java.lang.String str, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeFragment, "");
            this.__typename = str;
            this.authenticationChallengeFragment = authenticationChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment getAuthenticationChallengeFragment() {
            return this.authenticationChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment = this.authenticationChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Challenge(__typename=");
            sb.append(str);
            sb.append(", authenticationChallengeFragment=");
            sb.append(authenticationChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.authenticationChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, challenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationChallengeFragment, challenge.authenticationChallengeFragment);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge copy(java.lang.String __typename, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeFragment, "");
            return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge(__typename, authenticationChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment getAuthenticationChallengeFragment() {
            return this.authenticationChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge, java.lang.String str, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = challenge.__typename;
            }
            if ((i & 2) != 0) {
                authenticationChallengeFragment = challenge.authenticationChallengeFragment;
            }
            return challenge.copy(str, authenticationChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query CheckGoogleToken($token: JWT!) { publicCredentialMetadataByToken(id: $token) { onboardingEmailStatus { validity suggestions } tokenDetails { name { givenName surname } email profilePicture } actor { challenge { __typename ...AuthenticationChallengeFragment } } } }  fragment AuthenticationChallengeFragment on AuthenticationChallengeResult { correlationId challenges { __typename ... on GenericAuthenticationChallenge { contextId challengeType } ... on OneTimePasswordAuthenticationChallenge { contextId challengeType nonce } ... on OneTimePasswordGenerateCodeAuthenticationChallenge { contextId challengeType phones { maskedPhoneNumber phoneChallengeId } nonce } ... on PasskeyCredentialRequestOptionAuthenticationChallenge { contextId challengeType challenge relayingPartyId allowedCredentials { transports } userVerification } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.token;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckGoogleTokenQuery(token=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery) other).token);
    }

    public final com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery copy(java.lang.Object token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        return new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery(token);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery copy$default(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery checkGoogleTokenQuery, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = checkGoogleTokenQuery.token;
        }
        return checkGoogleTokenQuery.copy(obj);
    }
}
